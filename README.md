# VecMath

A simple GLSL-inspired high-performance vector math library for 3D and computer graphics.


## Build

Building the project requires at least **JDK 8**.

1. Fetch the project from GitHub:
   ```shell
   git clone https://github.com/rsarendus/vecmath.git
   ```
2. Navigate into the project's root directory:
   ```shell
   cd vecmath
   ```
3. Build the project using [Apache Maven](https://maven.apache.org/):
   * Compile and package as a JAR into the project's `target` directory:
     ```shell
     mvn clean package
     ```
   * Or compile, package and install into your local repository:
     ```shell
     mvn clean install
     ```
   * Or for more options read about [Maven Build Lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

Or alternatively, since the library uses no external dependencies, one could copy-paste any relevant source files into
their own project's source directory.


## Highlights of the Library

The library currently offers the following types:

* Vector types:
  - `Vector2` - 2-dimensional vectors
  - `Vector3` - 3-dimensional vectors
  - `Vector4` - 4-dimensional vectors
* Matrix types:
  - `Matrix2x2` - 2x2 matrices
  - `Matrix2x3` - 2x3 matrices
  - `Matrix3x2` - 3x2 matrices
  - `Matrix3x3` - 3x3 matrices
  - `Matrix3x4` - 3x4 matrices
  - `Matrix4x3` - 4x3 matrices
  - `Matrix4x4` - 4x4 matrices

Each type is exposed via the following interfaces:
* `Accessible` - provides an interface that exposes **accessor** methods only
* `Mutable` - provides an interface that exposes **mutator** methods only
* `AccessibleAndMutable` - combines `Accessible` and `Mutable` interfaces


### Naming Conventions and Notations

**Vector components** are named using single characters: `x`, `y`, `z` and `w` (in that particular order).
The same naming is followed by accessor and mutator methods:

```java
Vector2.AccessibleAndMutable vector = ...

double x = vector.x();
vector.y(1.0);
```

Methods that interact with multiple components are named after the combination of all the components they interact with:

```java
vector.xy(1.0);
vector.xy(2.0, 3.0);
vector.xy(another2dVector);
```

**Matrix elements** are referred to by the combination of vector (`X`, `Y`, `Z`, `T`) and component names (`x`, `y`,
`z`, `w`) in vector-major order.
For example `Xx`, `Xy`, `Zx`, `Tw` and so on.
The same naming is followed by single-element accessor and mutator methods:

```java
Matrix2x2.AccessibleAndMutable matrix = ...

double Xx = matrix.Xx();
matrix.Xy(1.0);
```

For all mathematical purposes, the base vectors of matrices are treated as columns and all vectors that interact with
matrices as column vectors - thus vector transformations are performed by pre-multiplying the said vectors by
transformation operators (i.e. transformation matrices):

```
 | Xx Yx Zx Tx |     | x |      | Xx * x + Yx * y + Zx * z + Tx * w |
 | Xy Yy Zy Ty |     | y |      | Xy * x + Yy * y + Zy * z + Ty * w |
 | Xz Yz Zz Tz |  x  | z |  ->  | Xz * x + Yz * y + Zz * z + Tz * w |
 | Xw Yw Zw Tw |     | w |      | Xw * x + Yw * y + Zw * z + Tw * w |
```

Via the matrix interfaces, interaction is also possible with the base vectors, vectors perpendicular to the base vectors
and matrix diagonal:

```java
matrix.Xxy(1.0);
matrix.Yxy(2.0, 3.0);
matrix.Yxy(some2dVector);

matrix.xXY(1.0);
matrix.yXY(2.0, 3.0);
matrix.xXY(some2dVector);

matrix.Dxy(1.0);
matrix.Dxy(2.0, 3.0);
matrix.Dxy(some2dVector);
```

Additionally, the matrix interfaces provide methods to interact with the whole matrix, as well as with the transpose of
the matrix:

```java
matrix.XYxy(1.0);
matrix.XYxy(2.0, 3.0, 4.0, 5.0);
matrix.XYxy(another2x2Matrix);

matrix.xyXY(2.0, 3.0, 4.0, 5.0);
matrix.xyXY(another2x2Matrix);
```


### Output Direction

The output of various operations can be directed either to existing objects or to factories that construct new objects:

```java
Vector3.Accessible operand1 = ...
Vector3.Accessible operand2 = ...

Vector3.Mutable result1 = ...
VecMath.add3To(operand1, operand2, result1);
VecMath.add3To(operand1, operand2, result1::yzx);

Vector4.Mutable result2 = ...
VecMath.add3To(operand1, operand2, result2::xyz);
VecMath.add3To(operand1, operand2, (x, y, z) -> result2.xyzw(x, y, z, 0.0));

Vector3.Accessible result3 = VecMath.add3(operand1, operand2, CustomVector3Impl::new);
Vector4.Accessible result4 = VecMath.add3(operand1, operand2, (x, y, z) -> new CustomVector4Impl(x, y, z, 0.0));
```

Accessible types can also output their contents the same way:

```java
Vector3.Accessible source = ...

Vector3.Mutable destination1 = ...
source.yzxTo(destination1);
source.xyzTo(destination1::yzx);

Vector4.Mutable destination2 = ...
source.xyzTo(destination2::xyz);
source.xyzTo((x, y, z) -> destination2.xyzw(x, y, z, 0.0));

Vector3.Accessible destination3 = source.xyz(CustomVector3Impl::new);
Vector4.Accessible destination4 = source.xyz((x, y, z) -> new CustomVector4Impl(x, y, z, 0.0));
```


### Segregation of Read and Write Operations

Operations that can take the same object as both the source of input and destination for output, are guaranteed to
perform all the read operations from the source before any write operations to the destination take place.

The same is expected from any implementing or extending classes.
For example, when overriding default mutator methods, then operations like `vector.zyx(vector);` must not cause
undefined behaviour.

### Extendability

All the various data types (vectors, matrices, etc...) offered and operated on by this library, are provided as
interfaces.
These interfaces require their implementors to implement only a handful of accessor and/or mutator methods (e.g.
accessor methods of the `x` and `y` component of an immutable 2-dimensional vector).
The vast amount of all the other methods for accessing and mutating the components in various ways, are provided by the
interfaces themselves as `default` methods - which, of course, may be overridden as well, if needed.

The types (e.g. vectors, matrices) themselves don't (and shouldn't) know about what kind of mathematical and other kinds
of operations can be performed on them - except, of course, the access and mutate operations of their components.
The ability to perform all mathematical and other complicated operations are provided by separate utility classes, like
`VecMath`, which operate only on the interfaces of the offered types.

This allows both to add custom concrete implementations and to extend the capabilities of performing mathematical and
other kinds of operations on all types, without breaking compatibility with this library, or any future implementations
or extensions that might emerge.
