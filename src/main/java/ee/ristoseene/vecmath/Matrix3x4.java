package ee.ristoseene.vecmath;

public final class Matrix3x4 {

    private Matrix3x4() {}

    @FunctionalInterface
    public interface Consumer {

        void XYZxyzw(
                double Xx, double Xy, double Xz, double Xw,
                double Yx, double Yy, double Yz, double Yw,
                double Zx, double Zy, double Zz, double Zw
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy, double Xz, double Xw,
                double Yx, double Yy, double Yz, double Yw,
                double Zx, double Zy, double Zz, double Zw
        );

    }

    public interface Accessible extends Matrix3x3.Accessible {

        double Xw();
        double Yw();
        double Zw();

        default <R> R Xxw(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xw());
        }

        default void XxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xw());
        }

        default <R> R Xyw(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xw());
        }

        default void XywTo(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xw());
        }

        default <R> R Xzw(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Xw());
        }

        default void XzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Xw());
        }

        default <R> R Xxyw(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw());
        }

        default void XxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xw());
        }

        default <R> R Xxzw(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw());
        }

        default void XxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xz(), Xw());
        }

        default <R> R Xyzw(final Vector3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw());
        }

        default void XyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Xz(), Xw());
        }

        default <R> R Xxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw());
        }

        default void XxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Xy(), Xz(), Xw());
        }

        default <R> R Yxw(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yw());
        }

        default void YxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yw());
        }

        default <R> R Yyw(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yw());
        }

        default void YywTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yw());
        }

        default <R> R Yzw(final Vector2.Factory<R> factory) {
            return factory.create(Yz(), Yw());
        }

        default void YzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Yz(), Yw());
        }

        default <R> R Yxyw(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yw());
        }

        default void YxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yw());
        }

        default <R> R Yxzw(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Yw());
        }

        default void YxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yz(), Yw());
        }

        default <R> R Yyzw(final Vector3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw());
        }

        default void YyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Yz(), Yw());
        }

        default <R> R Yxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Yw());
        }

        default void YxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Yx(), Yy(), Yz(), Yw());
        }

        default <R> R Zxw(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zw());
        }

        default void ZxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zw());
        }

        default <R> R Zyw(final Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zw());
        }

        default void ZywTo(final Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zw());
        }

        default <R> R Zzw(final Vector2.Factory<R> factory) {
            return factory.create(Zz(), Zw());
        }

        default void ZzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Zz(), Zw());
        }

        default <R> R Zxyw(final Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zw());
        }

        default void ZxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zw());
        }

        default <R> R Zxzw(final Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zz(), Zw());
        }

        default void ZxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zz(), Zw());
        }

        default <R> R Zyzw(final Vector3.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Zw());
        }

        default void ZyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zy(), Zz(), Zw());
        }

        default <R> R Zxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz(), Zw());
        }

        default void ZxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Zx(), Zy(), Zz(), Zw());
        }

        default <R> R wXY(final Vector2.Factory<R> factory) {
            return factory.create(Xw(), Yw());
        }

        default void wXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xw(), Yw());
        }

        default <R> R wXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xw(), Zw());
        }

        default void wXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xw(), Zw());
        }

        default <R> R wYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yw(), Zw());
        }

        default void wYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yw(), Zw());
        }

        default <R> R wXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Zw());
        }

        default void wXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Zw());
        }

        default <R> R XYxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Yx(), Yw());
        }

        default void XYxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xw(), Yx(), Yw());
        }

        default <R> R XYyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Yy(), Yw());
        }

        default void XYywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xw(), Yy(), Yw());
        }

        default <R> R XYzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Yz(), Yw());
        }

        default void XYzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Yz(), Yw());
        }

        default <R> R XZxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Zx(), Zw());
        }

        default void XZxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xw(), Zx(), Zw());
        }

        default <R> R XZyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Zy(), Zw());
        }

        default void XZywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xw(), Zy(), Zw());
        }

        default <R> R XZzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Zz(), Zw());
        }

        default void XZzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Zz(), Zw());
        }

        default <R> R YZxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yw(), Zx(), Zw());
        }

        default void YZxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yw(), Zx(), Zw());
        }

        default <R> R YZyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yw(), Zy(), Zw());
        }

        default void YZywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yw(), Zy(), Zw());
        }

        default <R> R YZzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Yw(), Zz(), Zw());
        }

        default void YZzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Yw(), Zz(), Zw());
        }

        default <R> R XYxyw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Yx(), Yy(), Yw());
        }

        default void XYxywTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xy(), Xw(), Yx(), Yy(), Yw());
        }

        default <R> R XYxzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Yx(), Yz(), Yw());
        }

        default void XYxzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xz(), Xw(), Yx(), Yz(), Yw());
        }

        default <R> R XYyzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw());
        }

        default void XYyzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw());
        }

        default <R> R XZxyw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Zx(), Zy(), Zw());
        }

        default void XZxywTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xy(), Xw(), Zx(), Zy(), Zw());
        }

        default <R> R XZxzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Zx(), Zz(), Zw());
        }

        default void XZxzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xz(), Xw(), Zx(), Zz(), Zw());
        }

        default <R> R XZyzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Zy(), Zz(), Zw());
        }

        default void XZyzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Xz(), Xw(), Zy(), Zz(), Zw());
        }

        default <R> R YZxyw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yw(), Zx(), Zy(), Zw());
        }

        default void YZxywTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Yy(), Yw(), Zx(), Zy(), Zw());
        }

        default <R> R YZxzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Yw(), Zx(), Zz(), Zw());
        }

        default void YZxzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Yz(), Yw(), Zx(), Zz(), Zw());
        }

        default <R> R YZyzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default void YZyzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default <R> R XYZxw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Yx(), Yw(), Zx(), Zw());
        }

        default void XYZxwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xw(), Yx(), Yw(), Zx(), Zw());
        }

        default <R> R XYZyw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Yy(), Yw(), Zy(), Zw());
        }

        default void XYZywTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Xw(), Yy(), Yw(), Zy(), Zw());
        }

        default <R> R XYZzw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Yz(), Yw(), Zz(), Zw());
        }

        default void XYZzwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xz(), Xw(), Yz(), Yw(), Zz(), Zw());
        }

        default <R> R XYZxyw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Zx(), Zy(), Zw());
        }

        default void XYZxywTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Zx(), Zy(), Zw());
        }

        default <R> R XYZxzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Zx(), Zz(), Zw());
        }

        default void XYZxzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Zx(), Zz(), Zw());
        }

        default <R> R XYZyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default void XYZyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default <R> R XYZxyzw(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw());
        }

        default void XYZxyzwTo(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw());
        }

        default <R> R xwXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xw(), Yw());
        }

        default void xwXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xw(), Yw());
        }

        default <R> R xwXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xw(), Zw());
        }

        default void xwXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Zx(), Xw(), Zw());
        }

        default <R> R xwYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yw(), Zw());
        }

        default void xwYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yw(), Zw());
        }

        default <R> R ywXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xw(), Yw());
        }

        default void ywXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xw(), Yw());
        }

        default <R> R ywXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Xw(), Zw());
        }

        default void ywXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Zy(), Xw(), Zw());
        }

        default <R> R ywYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yw(), Zw());
        }

        default void ywYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yw(), Zw());
        }

        default <R> R zwXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Xw(), Yw());
        }

        default void zwXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Yz(), Xw(), Yw());
        }

        default <R> R zwXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Zz(), Xw(), Zw());
        }

        default void zwXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Zz(), Xw(), Zw());
        }

        default <R> R zwYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Yw(), Zw());
        }

        default void zwYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Zz(), Yw(), Zw());
        }

        default <R> R xwXYZ(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xw(), Yw(), Zw());
        }

        default void xwXYZto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Yx(), Zx(), Xw(), Yw(), Zw());
        }

        default <R> R ywXYZ(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Xw(), Yw(), Zw());
        }

        default void ywXYZto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Yy(), Zy(), Xw(), Yw(), Zw());
        }

        default <R> R zwXYZ(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void zwXYZto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default <R> R xywXY(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy(), Xw(), Yw());
        }

        default void xywXYto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Yx(), Xy(), Yy(), Xw(), Yw());
        }

        default <R> R xywXZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xy(), Zy(), Xw(), Zw());
        }

        default void xywXZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Zx(), Xy(), Zy(), Xw(), Zw());
        }

        default <R> R xywYZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy(), Yw(), Zw());
        }

        default void xywYZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Zx(), Yy(), Zy(), Yw(), Zw());
        }

        default <R> R xzwXY(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xz(), Yz(), Xw(), Yw());
        }

        default void xzwXYto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Yx(), Xz(), Yz(), Xw(), Yw());
        }

        default <R> R xzwXZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xz(), Zz(), Xw(), Zw());
        }

        default void xzwXZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Zx(), Xz(), Zz(), Xw(), Zw());
        }

        default <R> R xzwYZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yz(), Zz(), Yw(), Zw());
        }

        default void xzwYZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Zx(), Yz(), Zz(), Yw(), Zw());
        }

        default <R> R yzwXY(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xz(), Yz(), Xw(), Yw());
        }

        default void yzwXYto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Yy(), Xz(), Yz(), Xw(), Yw());
        }

        default <R> R yzwXZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Xz(), Zz(), Xw(), Zw());
        }

        default void yzwXZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Zy(), Xz(), Zz(), Xw(), Zw());
        }

        default <R> R yzwYZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yz(), Zz(), Yw(), Zw());
        }

        default void yzwYZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yy(), Zy(), Yz(), Zz(), Yw(), Zw());
        }

        default <R> R xywXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xw(), Yw(), Zw());
        }

        default void xywXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xw(), Yw(), Zw());
        }

        default <R> R xzwXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void xzwXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default <R> R yzwXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void yzwXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default <R> R xyzwXYZ(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void xyzwXYZto(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

    }

    public interface Mutable extends Consumer, Matrix3x3.Mutable {

        void Xw(double Xw);
        void Yw(double Yw);
        void Zw(double Zw);

        default void Xxw(final double v) {
            Xxw(v, v);
        }

        default void Xyw(final double v) {
            Xyw(v, v);
        }

        default void Xzw(final double v) {
            Xzw(v, v);
        }

        default void Xxyw(final double v) {
            Xxyw(v, v, v);
        }

        default void Xxzw(final double v) {
            Xxzw(v, v, v);
        }

        default void Xyzw(final double v) {
            Xyzw(v, v, v);
        }

        default void Xxyzw(final double v) {
            Xxyzw(v, v, v, v);
        }

        default void Yxw(final double v) {
            Yxw(v, v);
        }

        default void Yyw(final double v) {
            Yyw(v, v);
        }

        default void Yzw(final double v) {
            Yzw(v, v);
        }

        default void Yxyw(final double v) {
            Yxyw(v, v, v);
        }

        default void Yxzw(final double v) {
            Yxzw(v, v, v);
        }

        default void Yyzw(final double v) {
            Yyzw(v, v, v);
        }

        default void Yxyzw(final double v) {
            Yxyzw(v, v, v, v);
        }

        default void Zxw(final double v) {
            Zxw(v, v);
        }

        default void Zyw(final double v) {
            Zyw(v, v);
        }

        default void Zzw(final double v) {
            Zzw(v, v);
        }

        default void Zxyw(final double v) {
            Zxyw(v, v, v);
        }

        default void Zxzw(final double v) {
            Zxzw(v, v, v);
        }

        default void Zyzw(final double v) {
            Zyzw(v, v, v);
        }

        default void Zxyzw(final double v) {
            Zxyzw(v, v, v, v);
        }

        default void wXY(final double v) {
            wXY(v, v);
        }

        default void wXZ(final double v) {
            wXZ(v, v);
        }

        default void wYZ(final double v) {
            wYZ(v, v);
        }

        default void wXYZ(final double v) {
            wXYZ(v, v, v);
        }

        default void XYxw(final double v) {
            XYxw(v, v, v, v);
        }

        default void XYyw(final double v) {
            XYyw(v, v, v, v);
        }

        default void XYzw(final double v) {
            XYzw(v, v, v, v);
        }

        default void XZxw(final double v) {
            XZxw(v, v, v, v);
        }

        default void XZyw(final double v) {
            XZyw(v, v, v, v);
        }

        default void XZzw(final double v) {
            XZzw(v, v, v, v);
        }

        default void YZxw(final double v) {
            YZxw(v, v, v, v);
        }

        default void YZyw(final double v) {
            YZyw(v, v, v, v);
        }

        default void YZzw(final double v) {
            YZzw(v, v, v, v);
        }

        default void XYxyw(final double v) {
            XYxyw(v, v, v, v, v, v);
        }

        default void XYxzw(final double v) {
            XYxzw(v, v, v, v, v, v);
        }

        default void XYyzw(final double v) {
            XYyzw(v, v, v, v, v, v);
        }

        default void XZxyw(final double v) {
            XZxyw(v, v, v, v, v, v);
        }

        default void XZxzw(final double v) {
            XZxzw(v, v, v, v, v, v);
        }

        default void XZyzw(final double v) {
            XZyzw(v, v, v, v, v, v);
        }

        default void YZxyw(final double v) {
            YZxyw(v, v, v, v, v, v);
        }

        default void YZxzw(final double v) {
            YZxzw(v, v, v, v, v, v);
        }

        default void YZyzw(final double v) {
            YZyzw(v, v, v, v, v, v);
        }

        default void XYZxw(final double v) {
            XYZxw(v, v, v, v, v, v);
        }

        default void XYZyw(final double v) {
            XYZyw(v, v, v, v, v, v);
        }

        default void XYZzw(final double v) {
            XYZzw(v, v, v, v, v, v);
        }

        default void XYZxyw(final double v) {
            XYZxyw(v, v, v, v, v, v, v, v, v);
        }

        default void XYZxzw(final double v) {
            XYZxzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYZyzw(final double v) {
            XYZyzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYZxyzw(final double v) {
            XYZxyzw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void Xxw(final double Xx, final double Xw) {
            Xx(Xx);
            Xw(Xw);
        }

        default void Xyw(final double Xy, final double Xw) {
            Xy(Xy);
            Xw(Xw);
        }

        default void Xzw(final double Xz, final double Xw) {
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyw(final double Xx, final double Xy, final double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
        }

        default void Xxzw(final double Xx, final double Xz, final double Xw) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
        }

        default void Xyzw(final double Xy, final double Xz, final double Xw) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyzw(final double Xx, final double Xy, final double Xz, final double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Yxw(final double Yx, final double Yw) {
            Yx(Yx);
            Yw(Yw);
        }

        default void Yyw(final double Yy, final double Yw) {
            Yy(Yy);
            Yw(Yw);
        }

        default void Yzw(final double Yz, final double Yw) {
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyw(final double Yx, final double Yy, final double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
        }

        default void Yxzw(final double Yx, final double Yz, final double Yw) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
        }

        default void Yyzw(final double Yy, final double Yz, final double Yw) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyzw(final double Yx, final double Yy, final double Yz, final double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Zxw(final double Zx, final double Zw) {
            Zx(Zx);
            Zw(Zw);
        }

        default void Zyw(final double Zy, final double Zw) {
            Zy(Zy);
            Zw(Zw);
        }

        default void Zzw(final double Zz, final double Zw) {
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyw(final double Zx, final double Zy, final double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void Zxzw(final double Zx, final double Zz, final double Zw) {
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void Zyzw(final double Zy, final double Zz, final double Zw) {
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyzw(final double Zx, final double Zy, final double Zz, final double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void wXY(final double Xw, final double Yw) {
            Xw(Xw);
            Yw(Yw);
        }

        default void wXZ(final double Xw, final double Zw) {
            Xw(Xw);
            Zw(Zw);
        }

        default void wYZ(final double Yw, final double Zw) {
            Yw(Yw);
            Zw(Zw);
        }

        default void wXYZ(final double Xw, final double Yw, final double Zw) {
            Xw(Xw);
            Yw(Yw);
            Zw(Zw);
        }

        default void XYxw(
                final double Xx, final double Xw,
                final double Yx, final double Yw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
        }

        default void XYyw(
                final double Xy, final double Xw,
                final double Yy, final double Yw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
        }

        default void XYzw(
                final double Xz, final double Xw,
                final double Yz, final double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
        }

        default void XZxw(
                final double Xx, final double Xw,
                final double Zx, final double Zw
        ) {
            Xx(Xx);
            Xw(Xw);
            Zx(Zx);
            Zw(Zw);
        }

        default void XZyw(
                final double Xy, final double Xw,
                final double Zy, final double Zw
        ) {
            Xy(Xy);
            Xw(Xw);
            Zy(Zy);
            Zw(Zw);
        }

        default void XZzw(
                final double Xz, final double Xw,
                final double Zz, final double Zw
        ) {
            Xz(Xz);
            Xw(Xw);
            Zz(Zz);
            Zw(Zw);
        }

        default void YZxw(
                final double Yx, final double Yw,
                final double Zx, final double Zw
        ) {
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
        }

        default void YZyw(
                final double Yy, final double Yw,
                final double Zy, final double Zw
        ) {
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
        }

        default void YZzw(
                final double Yz, final double Yw,
                final double Zz, final double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void XYxyw(
                final double Xx, final double Xy, final double Xw,
                final double Yx, final double Yy, final double Yw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
        }

        default void XYxzw(
                final double Xx, final double Xz, final double Xw,
                final double Yx, final double Yz, final double Yw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
        }

        default void XYyzw(
                final double Xy, final double Xz, final double Xw,
                final double Yy, final double Yz, final double Yw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void XZxyw(
                final double Xx, final double Xy, final double Xw,
                final double Zx, final double Zy, final double Zw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void XZxzw(
                final double Xx, final double Xz, final double Xw,
                final double Zx, final double Zz, final double Zw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void XZyzw(
                final double Xy, final double Xz, final double Xw,
                final double Zy, final double Zz, final double Zw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void YZxyw(
                final double Yx, final double Yy, final double Yw,
                final double Zx, final double Zy, final double Zw
        ) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void YZxzw(
                final double Yx, final double Yz, final double Yw,
                final double Zx, final double Zz, final double Zw
        ) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void YZyzw(
                final double Yy, final double Yz, final double Yw,
                final double Zy, final double Zz, final double Zw
        ) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void XYZxw(
                final double Xx, final double Xw,
                final double Yx, final double Yw,
                final double Zx, final double Zw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
        }

        default void XYZyw(
                final double Xy, final double Xw,
                final double Yy, final double Yw,
                final double Zy, final double Zw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
        }

        default void XYZzw(
                final double Xz, final double Xw,
                final double Yz, final double Yw,
                final double Zz, final double Zw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void XYZxyw(
                final double Xx, final double Xy, final double Xw,
                final double Yx, final double Yy, final double Yw,
                final double Zx, final double Zy, final double Zw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void XYZxzw(
                final double Xx, final double Xz, final double Xw,
                final double Yx, final double Yz, final double Yw,
                final double Zx, final double Zz, final double Zw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void XYZyzw(
                final double Xy, final double Xz, final double Xw,
                final double Yy, final double Yz, final double Yw,
                final double Zy, final double Zz, final double Zw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        @Override
        default void XYZxyzw(
                final double Xx, final double Xy, final double Xz, final double Xw,
                final double Yx, final double Yy, final double Yz, final double Yw,
                final double Zx, final double Zy, final double Zz, final double Zw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void xwXY(
                final double Xx, final double Yx,
                final double Xw, final double Yw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
        }

        default void xwXZ(
                final double Xx, final double Zx,
                final double Xw, final double Zw
        ) {
            Xx(Xx);
            Xw(Xw);
            Zx(Zx);
            Zw(Zw);
        }

        default void xwYZ(
                final double Yx, final double Zx,
                final double Yw, final double Zw
        ) {
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
        }

        default void ywXY(
                final double Xy, final double Yy,
                final double Xw, final double Yw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
        }

        default void ywXZ(
                final double Xy, final double Zy,
                final double Xw, final double Zw
        ) {
            Xy(Xy);
            Xw(Xw);
            Zy(Zy);
            Zw(Zw);
        }

        default void ywYZ(
                final double Yy, final double Zy,
                final double Yw, final double Zw
        ) {
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
        }

        default void zwXY(
                final double Xz, final double Yz,
                final double Xw, final double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
        }

        default void zwXZ(
                final double Xz, final double Zz,
                final double Xw, final double Zw
        ) {
            Xz(Xz);
            Xw(Xw);
            Zz(Zz);
            Zw(Zw);
        }

        default void zwYZ(
                final double Yz, final double Zz,
                final double Yw, final double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void xwXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xw, final double Yw, final double Zw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
        }

        default void ywXYZ(
                final double Xy, final double Yy, final double Zy,
                final double Xw, final double Yw, final double Zw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
        }

        default void zwXYZ(
                final double Xz, final double Yz, final double Zz,
                final double Xw, final double Yw, final double Zw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void xywXY(
                final double Xx, final double Yx,
                final double Xy, final double Yy,
                final double Xw, final double Yw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
        }

        default void xywXZ(
                final double Xx, final double Zx,
                final double Xy, final double Zy,
                final double Xw, final double Zw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void xywYZ(
                final double Yx, final double Zx,
                final double Yy, final double Zy,
                final double Yw, final double Zw
        ) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void xzwXY(
                final double Xx, final double Yx,
                final double Xz, final double Yz,
                final double Xw, final double Yw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
        }

        default void xzwXZ(
                final double Xx, final double Zx,
                final double Xz, final double Zz,
                final double Xw, final double Zw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void xzwYZ(
                final double Yx, final double Zx,
                final double Yz, final double Zz,
                final double Yw, final double Zw
        ) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void yzwXY(
                final double Xy, final double Yy,
                final double Xz, final double Yz,
                final double Xw, final double Yw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void yzwXZ(
                final double Xy, final double Zy,
                final double Xz, final double Zz,
                final double Xw, final double Zw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void yzwYZ(
                final double Yy, final double Zy,
                final double Yz, final double Zz,
                final double Yw, final double Zw
        ) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void xywXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xy, final double Yy, final double Zy,
                final double Xw, final double Yw, final double Zw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void xzwXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xz, final double Yz, final double Zz,
                final double Xw, final double Yw, final double Zw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void yzwXYZ(
                final double Xy, final double Yy, final double Zy,
                final double Xz, final double Yz, final double Zz,
                final double Xw, final double Yw, final double Zw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void xyzwXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xy, final double Yy, final double Zy,
                final double Xz, final double Yz, final double Zz,
                final double Xw, final double Yw, final double Zw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void Xxw(final Vector2.Accessible v) {
            Xxw(v.x(), v.y());
        }

        default void Xyw(final Vector2.Accessible v) {
            Xyw(v.x(), v.y());
        }

        default void Xzw(final Vector2.Accessible v) {
            Xzw(v.x(), v.y());
        }

        default void Xxyw(final Vector3.Accessible v) {
            Xxyw(v.x(), v.y(), v.z());
        }

        default void Xxzw(final Vector3.Accessible v) {
            Xxzw(v.x(), v.y(), v.z());
        }

        default void Xyzw(final Vector3.Accessible v) {
            Xyzw(v.x(), v.y(), v.z());
        }

        default void Xxyzw(final Vector4.Accessible v) {
            Xxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Yxw(final Vector2.Accessible v) {
            Yxw(v.x(), v.y());
        }

        default void Yyw(final Vector2.Accessible v) {
            Yyw(v.x(), v.y());
        }

        default void Yzw(final Vector2.Accessible v) {
            Yzw(v.x(), v.y());
        }

        default void Yxyw(final Vector3.Accessible v) {
            Yxyw(v.x(), v.y(), v.z());
        }

        default void Yxzw(final Vector3.Accessible v) {
            Yxzw(v.x(), v.y(), v.z());
        }

        default void Yyzw(final Vector3.Accessible v) {
            Yyzw(v.x(), v.y(), v.z());
        }

        default void Yxyzw(final Vector4.Accessible v) {
            Yxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Zxw(final Vector2.Accessible v) {
            Zxw(v.x(), v.y());
        }

        default void Zyw(final Vector2.Accessible v) {
            Zyw(v.x(), v.y());
        }

        default void Zzw(final Vector2.Accessible v) {
            Zzw(v.x(), v.y());
        }

        default void Zxyw(final Vector3.Accessible v) {
            Zxyw(v.x(), v.y(), v.z());
        }

        default void Zxzw(final Vector3.Accessible v) {
            Zxzw(v.x(), v.y(), v.z());
        }

        default void Zyzw(final Vector3.Accessible v) {
            Zyzw(v.x(), v.y(), v.z());
        }

        default void Zxyzw(final Vector4.Accessible v) {
            Zxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void wXY(final Vector2.Accessible v) {
            wXY(v.x(), v.y());
        }

        default void wXZ(final Vector2.Accessible v) {
            wXZ(v.x(), v.y());
        }

        default void wYZ(final Vector2.Accessible v) {
            wYZ(v.x(), v.y());
        }

        default void wXYZ(final Vector3.Accessible v) {
            wXYZ(v.x(), v.y(), v.z());
        }

        default void XYxw(final Matrix2x2.Accessible m) {
            XYxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyw(final Matrix2x2.Accessible m) {
            XYyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYzw(final Matrix2x2.Accessible m) {
            XYzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZxw(final Matrix2x2.Accessible m) {
            XZxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZyw(final Matrix2x2.Accessible m) {
            XZyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZzw(final Matrix2x2.Accessible m) {
            XZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxw(final Matrix2x2.Accessible m) {
            YZxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyw(final Matrix2x2.Accessible m) {
            YZyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZzw(final Matrix2x2.Accessible m) {
            YZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYxyw(final Matrix2x3.Accessible m) {
            XYxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XYxzw(final Matrix2x3.Accessible m) {
            XYxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XYyzw(final Matrix2x3.Accessible m) {
            XYyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XZxyw(final Matrix2x3.Accessible m) {
            XZxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XZxzw(final Matrix2x3.Accessible m) {
            XZxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XZyzw(final Matrix2x3.Accessible m) {
            XZyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YZxyw(final Matrix2x3.Accessible m) {
            YZxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YZxzw(final Matrix2x3.Accessible m) {
            YZxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YZyzw(final Matrix2x3.Accessible m) {
            YZyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XYZxw(final Matrix3x2.Accessible m) {
            XYZxw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYZyw(final Matrix3x2.Accessible m) {
            XYZyw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYZzw(final Matrix3x2.Accessible m) {
            XYZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYZxyw(final Matrix3x3.Accessible m) {
            XYZxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZxzw(final Matrix3x3.Accessible m) {
            XYZxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZyzw(final Matrix3x3.Accessible m) {
            XYZyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZxyzw(final Matrix3x4.Accessible m) {
            XYZxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void xwXY(final Matrix2x2.Accessible m) {
            xwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwXZ(final Matrix2x2.Accessible m) {
            xwXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwYZ(final Matrix2x2.Accessible m) {
            xwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywXY(final Matrix2x2.Accessible m) {
            ywXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywXZ(final Matrix2x2.Accessible m) {
            ywXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywYZ(final Matrix2x2.Accessible m) {
            ywYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXY(final Matrix2x2.Accessible m) {
            zwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXZ(final Matrix2x2.Accessible m) {
            zwXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwYZ(final Matrix2x2.Accessible m) {
            zwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwXYZ(final Matrix2x3.Accessible m) {
            xwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ywXYZ(final Matrix2x3.Accessible m) {
            ywXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void zwXYZ(final Matrix2x3.Accessible m) {
            zwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xywXY(final Matrix3x2.Accessible m) {
            xywXY(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xywXZ(final Matrix3x2.Accessible m) {
            xywXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xywYZ(final Matrix3x2.Accessible m) {
            xywYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xzwXY(final Matrix3x2.Accessible m) {
            xzwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xzwXZ(final Matrix3x2.Accessible m) {
            xzwXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xzwYZ(final Matrix3x2.Accessible m) {
            xzwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void yzwXY(final Matrix3x2.Accessible m) {
            yzwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void yzwXZ(final Matrix3x2.Accessible m) {
            yzwXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void yzwYZ(final Matrix3x2.Accessible m) {
            yzwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xywXYZ(final Matrix3x3.Accessible m) {
            xywXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xzwXYZ(final Matrix3x3.Accessible m) {
            xzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwXYZ(final Matrix3x3.Accessible m) {
            yzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzwXYZ(final Matrix4x3.Accessible m) {
            xyzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix3x3.AccessibleAndMutable {}

}
