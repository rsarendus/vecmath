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
  - `Vector2` - 2-component vectors
  - `Vector3` - 3-component vectors
  - `Vector4` - 4-component vectors
* Matrix types:
  - `Matrix2x2` - square matrices consisting of 2 base vectors and having 2 components per vector
  - `Matrix2x3` - non-square matrices consisting of 2 base vectors and having 3 components per vector
  - `Matrix3x2` - non-square matrices consisting of 3 base vectors and having 2 components per vector
  - `Matrix3x3` - square matrices consisting of 3 base vectors and having 3 components per vector
  - `Matrix3x4` - non-square matrices consisting of 3 base vectors and having 4 components per vector
  - `Matrix4x3` - non-square matrices consisting of 4 base vectors and having 3 components per vector
  - `Matrix4x4` - square matrices consisting of 4 base vectors and having 4 components per vector

Each type is exposed via the following interfaces:
* `Accessible` - provides an interface that exposes **accessor** methods only
* `Mutable` - provides an interface that exposes **mutator** methods only
* `AccessibleAndMutable` - combines the properties of `Accessible` and `Mutable` interfaces


### Naming Conventions and Notations

#### Vectors

Vector components are named using single characters: `x`, `y`, `z` and `w` (in that particular order).
The same naming is followed by accessor and mutator methods:

```java
Vector2.AccessibleAndMutable vector2 = ...

// Get the x component
double x = vector2.x();

// Set the y component to 1.0
vector2.y(1.0);
```

Methods that interact with multiple components are named after the combination of all the components they interact with:

```java
// Set both the x and y component to 1.0
vector2.xy(1.0);

// Set the x component to 2.0
// Set the y component to 3.0
vector2.xy(2.0, 3.0);

// Set the x component to the value of anotherVector2.x
// Set the y component to the value of anotherVector2.y
vector2.xy(anotherVector2);
```

Multi-component interactions support swizzling - components can be interacted with in any order.
Mutator methods are limited to at most one interaction per component; accessor methods allow replicating the same
component multiple times:

```java
Vector3.AccessibleAndMutable vector3 = ...

// Set the x component to 2.0
// Set the z component to 3.0
// (the y component is unchanged)
vector3.xz(2.0, 3.0);

// Set the z component to the value of vector2.x
// Set the y component to the value of vector2.y
// (the x component is unchanged)
vector3.zy(vector2);

// Copy the value of y component to vector3.x
// Copy the value of x component to vector3.y and vector3.z
vector2.yxxTo(vector3);
```

Replication allows to form up to 4-component vectors from any combination of the components of any vector.

#### Matrices

Matrix elements are referred to by the combination of vector names (`X`, `Y`, `Z`, `T`) and component names
(`x`, `y`, `z`, `w`) in vector-major order.
For example, the `Xx` element refers to the `x` component of the `X` vector, the `Zy` element refers to the `y`
component of the `Z` vector, the `Tw` element refers to the `w` component of the `T` vector, and so on.

> [!IMPORTANT]
> In the context of this library, **matrix dimensions specify the number of base vectors and the number of vector
> components** in ***v*&nbsp;&times;&nbsp;*c*** format.
> For example, a **3&nbsp;&times;&nbsp;2** matrix refers to a matrix with **3 vectors** (`X`, `Y`, `Z`) and
> **2 components** (`x`, `y`) per vector.
> This is different from the convention in mathematics where matrix dimensions denote the number of rows and the number
> of columns respectively.

The previously described naming is followed by single-element accessor and mutator methods:

```java
Matrix2x2.AccessibleAndMutable matrix2x2 = ...

// Get the Xx element
// (the x component of the X vector)
double Xx = matrix2x2.Xx();

// Set the Xy element to 1.0
// (the y component of the X vector)
matrix2x2.Xy(1.0);
```

Interaction is also possible with the base vectors, vectors perpendicular to the base vectors, and the matrix diagonal:

```java
// Examples of setting the base vectors
matrix2x2.Xxy(1.0);
matrix2x2.Yxy(2.0, 3.0);
matrix2x2.Yxy(someVector2);

// Examples of setting the vectors perpendicular to the base vectors
matrix2x2.xXY(1.0);
matrix2x2.yXY(2.0, 3.0);
matrix2x2.xXY(someVector2);

// Examples of setting the matrix diagonal
matrix2x2.Dxy(1.0);
matrix2x2.Dxy(2.0, 3.0);
matrix2x2.Dxy(someVector2);
```

Additionally, the matrix interfaces provide methods to interact with the whole matrix, as well as with the transpose of
the matrix:

```java
// Examples of setting the whole matrix
matrix2x2.XYxy(1.0);
matrix2x2.XYxy(2.0, 3.0, 4.0, 5.0);
matrix2x2.XYxy(anotherMatrix2x2);

// Examples of setting the matrix to the transpose of the input
matrix2x2.xyXY(2.0, 3.0, 4.0, 5.0);
matrix2x2.xyXY(anotherMatrix2x2);
```

Swizzling of matrix elements is limited to sequential interaction with base vectors / vector components.
No replication of elements is supported.

> [!IMPORTANT]
> While the matrix interfaces themselves do not mandate the treatment of base vectors as either rows or columns,
> **the library treats all vectors as columns for the purpose of calculating matrix products!**

An example of transforming a 4-component vector by a 4&nbsp;&times;&nbsp;4 transformation matrix, i.e. calculating
the product of a 4&nbsp;&times;&nbsp;4 matrix and a 1&nbsp;&times;&nbsp;4 matrix (i.e. a column vector) as performed
by the library:

```math
\begin{bmatrix} Xx & Yx & Zx & Tx \\ Xy & Yy & Zy & Ty \\ Xz & Yz & Zz & Tz \\ Xw & Yw & Zw & Tw \end{bmatrix}
\cdot
\begin{bmatrix} x \\ y \\ z \\ w \end{bmatrix}
=
\begin{bmatrix}
Xx \cdot x + Yx \cdot y + Zx \cdot z + Tx \cdot w \\
Xy \cdot x + Yy \cdot y + Zy \cdot z + Ty \cdot w \\
Xz \cdot x + Yz \cdot y + Zz \cdot z + Tz \cdot w \\
Xw \cdot x + Yw \cdot y + Zw \cdot z + Tw \cdot w
\end{bmatrix}
```


### Output Direction

The output of various operations can be directed either to existing objects or to factories that construct new objects:

```java
Vector3.Accessible augend3 = ...
Vector3.Accessible addend3 = ...

Vector3.Mutable resultConsumer3 = ...
VecMath.add3To(augend3, addend3, resultConsumer3);
VecMath.add3To(augend3, addend3, resultConsumer3::yzx);

Vector4.Mutable resultConsumer4 = ...
VecMath.add3To(augend3, addend3, resultConsumer4::xyz);
VecMath.add3To(augend3, addend3, (x, y, z) -> resultConsumer4.xyzw(x, y, z, 0.0));

Vector3.Accessible immutableResult3 = VecMath.add3(augend3, addend3, CustomVector3Impl::new);
Vector4.Accessible immutableResult4 = VecMath.add3(augend3, addend3, (x, y, z) -> new CustomVector4Impl(x, y, z, 0.0));
```

Accessible types can also output their contents the same way:

```java
Vector3.Accessible source3 = ...

Vector3.Mutable destination3 = ...
source3.yzxTo(destination3);
source3.xyzTo(destination3::yzx);

Vector4.Mutable destination4 = ...
source3.xyzTo(destination4::xyz);
source3.xyzTo((x, y, z) -> destination4.xyzw(x, y, z, 0.0));

Vector3.Accessible immutableDestination3 = source3.xyz(CustomVector3Impl::new);
Vector4.Accessible immutableDestination4 = source3.xyz((x, y, z) -> new CustomVector4Impl(x, y, z, 0.0));
```


### Segregation of Read and Write Operations

Operations that can take the same object as both the source of input and destination for output, are guaranteed to
perform all the read operations from the source before any write operations to the destination take place.

The same is expected from any implementing or extending classes.
For example, when overriding default mutator methods, then operations like `vector3.zyx(vector3);` must not cause
undefined behaviour.

### Extendability

All the various data types (vectors, matrices, etc...) offered and operated on by this library, are provided as
interfaces.
These interfaces require their implementors to implement only a handful of accessor and/or mutator methods (e.g.
accessor methods of the `x` and `y` components of an immutable 2-component vector).
The vast amount of all the other methods for accessing and mutating the components in various ways, are provided by the
interfaces themselves as `default` methods - which, of course, may be overridden as well, if needed.

The types (e.g. vectors, matrices) themselves don't (and shouldn't) know about what kind of mathematical and other kinds
of operations can be performed on them - except, of course, the access and mutate operations of their components.
The ability to perform all mathematical and other complicated operations are provided by separate utility classes, like
`VecMath`, which operate only on the interfaces of the offered types.

This allows both to add custom concrete implementations and to extend the capabilities of performing mathematical and
other kinds of operations on all types, without breaking compatibility with this library, or any future implementations
or extensions that might emerge.
