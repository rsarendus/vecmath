# VecMath

A simple GLSL inspired vector math library for 3D and computer graphics.


## Build

Building the project requires at least JDK8.

1. Fetch it from GitHub:
<br>`git clone https://github.com/rsarendus/vecmath.git`

2. Navigate into the project's root directory:
<br>`cd vecmath`

3. Build:
   * Compile and package as a JAR into the project's `target` directory:
   <br>`mvn clean package`
   * Compile, package and install into the local repository:
   <br>`mvn clean install`


## Highlights of the Library

The library currently offers the following types:

- **Value** - a single value (1-dimensional vector)
- **Vector2**, **Vector3** and **Vector4** - 2, 3 and 4-dimensional vectors
- **Matrix3x3** and **Matrix4x4** - 3 x 3 and 4 x 4 matrices
- **Quaternion** - a representation of spatial rotation

Each type is exposed via **Accessible**, **Mutable** and **AccessibleAndMutable** interfaces that enable read-only, write-only and read-write operations to be performed on the objects they represent.

The library also provides concrete implementations of each type (excluding *Value*) in both mutable and immutable variety.


### Naming Conventions and Notations

**Vector components** are named using single characters: **x**, **y**, **z** and **w** (in that particular order).<br>
The same naming is followed by accessor and mutator methods:

```java
Vector2.AccessibleAndMutable vector = ...

double x = vector.x();
vector.y(1.0);
```

Methods that interact with multiple components, combine in their name all the components they interact with:

```java
vector.xy(1.0);
vector.xy(2.0, 3.0);
vector.xy(another2dVector);
```

**Matrix elements** are referred to by the combination of vector (**X**, **Y**, **Z**, **T**) and component names (**x**, **y**, **z**, **w**) in vector-major order.
For example **Xx**, **Xy**, **Zx**, **Tw** and so on.<br>
The same naming is followed by single-element accessor and mutator methods:

```java
Matrix3x3.AccessibleAndMutable matrix = ...

double Xy = matrix.Xy();
matrix.Yz(1.0);
```

For more complex methods that interact with entire vectors or matrices, please refer to the source code.

For all mathematical purposes, the base vectors of matrices are treated as columns and all other vectors as column vectors, thus post-multiplication is used for performing vector transformations:

```
 | Xx Yx Zx Tx |     | x |      | Xx * x + Yx * y + Zx * z + Tx * w |
 | Xy Yy Zy Ty |     | y |      | Xy * x + Yy * y + Zy * z + Ty * w |
 | Xz Yz Zz Tz |  x  | z |  ->  | Xz * x + Yz * y + Zz * z + Tz * w |
 | Xw Yw Zw Tw |     | w |      | Xw * x + Yw * y + Zw * z + Tw * w |
```

**Quaternions** are just specialized 4-dimensional vectors and thus have all the same properties as regular vectors.


### "Reference" Methods

Instance methods with `$` in their names, return objects that interact with the components of the original. For example, only partial references to the original vector can be obtained:

```java
Vector3.AccessibleAndMutable original = ...

Vector2.AccessibleAndMutable derived1 = original.$xy();
Vector2.Accessible derived2 = original.const$yz();
```

Accessible references reflect all the changes made in the original, mutable references allow making changes in the original via the reference.


### Component Swizzling and Replication

Derived objects can reference the components of their original in any order. In case of accessible-only references, the same component can be repeated multiple times.

```java
Vector3.AccessibleAndMutable original = ...

Vector3.AccessibleAndMutable derived1 = original.$yzx();
Vector3.Accessible derived2 = original.const$yyy();
```

The same applies to mutator methods, except mutators cannot interact with the same component more than once.

```java
Vector3.Mutable vector = ...

vector.yzx(another3dVector);
vector.zy(some2dVector);
```


### Output Direction

The output of various operations can be directed either to existing objects or to newly constructed ones:

```java
Vector3.Accessible operand1 = ...
Vector3.Accessible operand2 = ...

Vector3.Mutable result1 = ...
VecMath.add(result1, operand1, operand2);
VecMath.add(result1::yzx, operand1, operand2);

Vector4.Mutable result2 = ...
VecMath.add((x, y, z) -> result2.xyzw(x, y, z, 0.0), operand1, operand2);

Vector3.Accessible result3 = VecMath.add(operand1, operand2, ImmutableVector3::new);
Vector4.Accessible result4 = VecMath.add(operand1, operand2, (x, y, z) -> new ImmutableVector4(x, y, z, 0.0));
```

Accessible types can also output their contents the same way:

```java
Vector3.Accessible source = ...

Vector3.Mutable destination1 = ...
source.yzxTo(destination1);
source.xyzTo(destination1::yzx);

Vector4.Mutable destination2 = ...
source.xyzTo((x, y, z) -> destination2.xyzw(x, y, z, 0.0));

Vector3.Accessible destination3 = source.xyz(ImmutableVector3::new);
Vector4.Accessible destination4 = source.xyz((x, y, z) -> new ImmutableVector4(x, y, z, 0.0));
```


### Segregation of Read and Write Operations

Operations that can take the same object (or partial or swizzled references of the same object) as both the source of input and destination for output, are guaranteed to perform all the read operations from the source before any write operations to the destination take place.

The same is expected from any implementing or extending classes. For example, when overriding default mutator methods, then operations like `vector.zyx(vector);`, `vector.xyz(vector.$yzx());` or `vector.zyx(vector.$yzx());` must not cause undefined behaviour.
