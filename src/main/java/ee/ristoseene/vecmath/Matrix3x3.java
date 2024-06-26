package ee.ristoseene.vecmath;

public final class Matrix3x3 {

    private Matrix3x3() {}

    @FunctionalInterface
    public interface Consumer {

        void XYZxyz(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz,
                double Zx, double Zy, double Zz
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz,
                double Zx, double Zy, double Zz
        );

    }

    public interface Accessible extends Matrix2x3.Accessible, Matrix3x2.Accessible {

        double Zz();

        default <R> R Zxz(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zz());
        }

        default void ZxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zz());
        }

        default <R> R Zyz(final Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zz());
        }

        default void ZyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zz());
        }

        default <R> R Zxyz(final Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz());
        }

        default void ZxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zz());
        }

        default <R> R zXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default void zXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default <R> R zYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default void zYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
        }

        default <R> R zXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz());
        }

        default void zXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Zz());
        }

        default <R> R Dxz(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zz());
        }

        default void DxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zz());
        }

        default <R> R Dyz(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zz());
        }

        default void DyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zz());
        }

        default <R> R Dxyz(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz());
        }

        default void DxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Zz());
        }

        default <R> R XZxz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Zx(), Zz());
        }

        default void XZxzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xz(), Zx(), Zz());
        }

        default <R> R XZyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Zy(), Zz());
        }

        default void XZyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Zy(), Zz());
        }

        default <R> R YZxz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Zx(), Zz());
        }

        default void YZxzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yz(), Zx(), Zz());
        }

        default <R> R YZyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Zy(), Zz());
        }

        default void YZyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Zy(), Zz());
        }

        default <R> R XZxyz(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Zx(), Zy(), Zz());
        }

        default void XZxyzTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xy(), Xz(), Zx(), Zy(), Zz());
        }

        default <R> R YZxyz(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void YZxyzTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R XYZxz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Yx(), Yz(), Zx(), Zz());
        }

        default void XYZxzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xz(), Yx(), Yz(), Zx(), Zz());
        }

        default <R> R XYZyz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz(), Zy(), Zz());
        }

        default void XYZyzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Xz(), Yy(), Yz(), Zy(), Zz());
        }

        default <R> R XYZxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void XYZxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R xzXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xz(), Zz());
        }

        default void xzXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Zx(), Xz(), Zz());
        }

        default <R> R xzYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yz(), Zz());
        }

        default void xzYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yz(), Zz());
        }

        default <R> R yzXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Xz(), Zz());
        }

        default void yzXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Zy(), Xz(), Zz());
        }

        default <R> R yzYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yz(), Zz());
        }

        default void yzYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yz(), Zz());
        }

        default <R> R xzXYZ(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xz(), Yz(), Zz());
        }

        default void xzXYZto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Yx(), Zx(), Xz(), Yz(), Zz());
        }

        default <R> R yzXYZ(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void yzXYZto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default <R> R xyzXZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xy(), Zy(), Xz(), Zz());
        }

        default void xyzXZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Zx(), Xy(), Zy(), Xz(), Zz());
        }

        default <R> R xyzYZ(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy(), Yz(), Zz());
        }

        default void xyzYZto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Zx(), Yy(), Zy(), Yz(), Zz());
        }

        default <R> R xyzXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void xyzXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

    }

    public interface Mutable extends Consumer, Matrix2x3.Mutable, Matrix3x2.Mutable {

        void Zz(double Zz);

        default void Zxz(final double v) {
            Zxz(v, v);
        }

        default void Zyz(final double v) {
            Zyz(v, v);
        }

        default void Zxyz(final double v) {
            Zxyz(v, v, v);
        }

        default void zXZ(final double v) {
            zXZ(v, v);
        }

        default void zYZ(final double v) {
            zYZ(v, v);
        }

        default void zXYZ(final double v) {
            zXYZ(v, v, v);
        }

        default void Dxz(final double v) {
            Dxz(v, v);
        }

        default void Dyz(final double v) {
            Dyz(v, v);
        }

        default void Dxyz(final double v) {
            Dxyz(v, v, v);
        }

        default void XZxz(final double v) {
            XZxz(v, v, v, v);
        }

        default void XZyz(final double v) {
            XZyz(v, v, v, v);
        }

        default void YZxz(final double v) {
            YZxz(v, v, v, v);
        }

        default void YZyz(final double v) {
            YZyz(v, v, v, v);
        }

        default void XZxyz(final double v) {
            XZxyz(v, v, v, v, v, v);
        }

        default void YZxyz(final double v) {
            YZxyz(v, v, v, v, v, v);
        }

        default void XYZxz(final double v) {
            XYZxz(v, v, v, v, v, v);
        }

        default void XYZyz(final double v) {
            XYZyz(v, v, v, v, v, v);
        }

        default void XYZxyz(final double v) {
            XYZxyz(v, v, v, v, v, v, v, v, v);
        }

        default void Zxz(final double Zx, final double Zz) {
            Zx(Zx);
            Zz(Zz);
        }

        default void Zyz(final double Zy, final double Zz) {
            Zy(Zy);
            Zz(Zz);
        }

        default void Zxyz(final double Zx, final double Zy, final double Zz) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void zXZ(final double Xz, final double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void zYZ(final double Yz, final double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void zXYZ(final double Xz, final double Yz, final double Zz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
        }

        default void Dxz(final double Xx, final double Zz) {
            Xx(Xx);
            Zz(Zz);
        }

        default void Dyz(final double Yy, final double Zz) {
            Yy(Yy);
            Zz(Zz);
        }

        default void Dxyz(final double Xx, final double Yy, final double Zz) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
        }

        default void XZxz(
                final double Xx, final double Xz,
                final double Zx, final double Zz
        ) {
            Xx(Xx);
            Xz(Xz);
            Zx(Zx);
            Zz(Zz);
        }

        default void XZyz(
                final double Xy, final double Xz,
                final double Zy, final double Zz
        ) {
            Xy(Xy);
            Xz(Xz);
            Zy(Zy);
            Zz(Zz);
        }

        default void YZxz(
                final double Yx, final double Yz,
                final double Zx, final double Zz
        ) {
            Yx(Yx);
            Yz(Yz);
            Zx(Zx);
            Zz(Zz);
        }

        default void YZyz(
                final double Yy, final double Yz,
                final double Zy, final double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void XZxyz(
                final double Xx, final double Xy, final double Xz,
                final double Zx, final double Zy, final double Zz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void YZxyz(
                final double Yx, final double Yy, final double Yz,
                final double Zx, final double Zy, final double Zz
        ) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void XYZxz(
                final double Xx, final double Xz,
                final double Yx, final double Yz,
                final double Zx, final double Zz
        ) {
            Xx(Xx);
            Xz(Xz);
            Yx(Yx);
            Yz(Yz);
            Zx(Zx);
            Zz(Zz);
        }

        default void XYZyz(
                final double Xy, final double Xz,
                final double Yy, final double Yz,
                final double Zy, final double Zz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        @Override
        default void XYZxyz(
                final double Xx, final double Xy, final double Xz,
                final double Yx, final double Yy, final double Yz,
                final double Zx, final double Zy, final double Zz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void xzXZ(
                final double Xx, final double Zx,
                final double Xz, final double Zz
        ) {
            Xx(Xx);
            Xz(Xz);
            Zx(Zx);
            Zz(Zz);
        }

        default void xzYZ(
                final double Yx, final double Zx,
                final double Yz, final double Zz
        ) {
            Yx(Yx);
            Yz(Yz);
            Zx(Zx);
            Zz(Zz);
        }

        default void yzXZ(
                final double Xy, final double Zy,
                final double Xz, final double Zz
        ) {
            Xy(Xy);
            Xz(Xz);
            Zy(Zy);
            Zz(Zz);
        }

        default void yzYZ(
                final double Yy, final double Zy,
                final double Yz, final double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void xzXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xz, final double Yz, final double Zz
        ) {
            Xx(Xx);
            Xz(Xz);
            Yx(Yx);
            Yz(Yz);
            Zx(Zx);
            Zz(Zz);
        }

        default void yzXYZ(
                final double Xy, final double Yy, final double Zy,
                final double Xz, final double Yz, final double Zz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void xyzXZ(
                final double Xx, final double Zx,
                final double Xy, final double Zy,
                final double Xz, final double Zz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void xyzYZ(
                final double Yx, final double Zx,
                final double Yy, final double Zy,
                final double Yz, final double Zz
        ) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void xyzXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xy, final double Yy, final double Zy,
                final double Xz, final double Yz, final double Zz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void Zxz(final Vector2.Accessible v) {
            Zxz(v.x(), v.y());
        }

        default void Zyz(final Vector2.Accessible v) {
            Zyz(v.x(), v.y());
        }

        default void Zxyz(final Vector3.Accessible v) {
            Zxyz(v.x(), v.y(), v.z());
        }

        default void zXZ(final Vector2.Accessible v) {
            zXZ(v.x(), v.y());
        }

        default void zYZ(final Vector2.Accessible v) {
            zYZ(v.x(), v.y());
        }

        default void zXYZ(final Vector3.Accessible v) {
            zXYZ(v.x(), v.y(), v.z());
        }

        default void Dxz(final Vector2.Accessible v) {
            Dxz(v.x(), v.y());
        }

        default void Dyz(final Vector2.Accessible v) {
            Dyz(v.x(), v.y());
        }

        default void Dxyz(final Vector3.Accessible v) {
            Dxyz(v.x(), v.y(), v.z());
        }

        default void XZxz(final Matrix2x2.Accessible m) {
            XZxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZyz(final Matrix2x2.Accessible m) {
            XZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxz(final Matrix2x2.Accessible m) {
            YZxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyz(final Matrix2x2.Accessible m) {
            YZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZxyz(final Matrix2x3.Accessible m) {
            XZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YZxyz(final Matrix2x3.Accessible m) {
            YZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XYZxz(final Matrix3x2.Accessible m) {
            XYZxz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYZyz(final Matrix3x2.Accessible m) {
            XYZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYZxyz(final Matrix3x3.Accessible m) {
            XYZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xzXZ(final Matrix2x2.Accessible m) {
            xzXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xzYZ(final Matrix2x2.Accessible m) {
            xzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXZ(final Matrix2x2.Accessible m) {
            yzXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYZ(final Matrix2x2.Accessible m) {
            yzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xzXYZ(final Matrix2x3.Accessible m) {
            xzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void yzXYZ(final Matrix2x3.Accessible m) {
            yzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xyzXZ(final Matrix3x2.Accessible m) {
            xyzXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xyzYZ(final Matrix3x2.Accessible m) {
            xyzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xyzXYZ(final Matrix3x3.Accessible m) {
            xyzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix2x3.AccessibleAndMutable, Matrix3x2.AccessibleAndMutable {}

}
