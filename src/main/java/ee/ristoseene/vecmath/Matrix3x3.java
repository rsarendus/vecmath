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

    public interface Accessible {

        double Xx();
        double Xy();
        double Xz();
        double Yx();
        double Yy();
        double Yz();
        double Zx();
        double Zy();
        double Zz();

        default <R> R Xxy(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default void XxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default <R> R Xxz(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xz());
        }

        default void XxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xz());
        }

        default <R> R Xyz(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xz());
        }

        default void XyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xz());
        }

        default <R> R Xxyz(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz());
        }

        default void XxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xz());
        }

        default <R> R Yxy(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default void YxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default <R> R Yxz(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yz());
        }

        default void YxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yz());
        }

        default <R> R Yyz(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yz());
        }

        default void YyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yz());
        }

        default <R> R Yxyz(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz());
        }

        default void YxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yz());
        }

        default <R> R Zxy(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zy());
        }

        default void ZxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zy());
        }

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

        default <R> R xXY(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default void xXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default <R> R xXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default void xXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default <R> R xYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default void xYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
        }

        default <R> R xXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default void xXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
        }

        default <R> R yXY(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default void yXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default <R> R yXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default void yXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default <R> R yYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default void yYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
        }

        default <R> R yXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default void yXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
        }

        default <R> R zXY(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default void zXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
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

        default <R> R Dxy(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default void DxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
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

        default <R> R XYxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy());
        }

        default void XYxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Yx(), Yy());
        }

        default <R> R xyXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy());
        }

        default void xyXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xy(), Yy());
        }

        default <R> R XYyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz());
        }

        default void XYyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Yy(), Yz());
        }

        default <R> R yzXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xz(), Yz());
        }

        default void yzXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xz(), Yz());
        }

        default <R> R YZxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Zx(), Zy());
        }

        default void YZxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yy(), Zx(), Zy());
        }

        default <R> R xyYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy());
        }

        default void xyYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yy(), Zy());
        }

        default <R> R YZyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Zy(), Zz());
        }

        default void YZyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Zy(), Zz());
        }

        default <R> R yzYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yz(), Zz());
        }

        default void yzYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yz(), Zz());
        }

        default <R> R XYZxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void XYZxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R xyzXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void xyzXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

    }

    public interface Mutable extends Consumer {

        void Xx(double Xx);
        void Xy(double Xy);
        void Xz(double Xz);
        void Yx(double Yx);
        void Yy(double Yy);
        void Yz(double Yz);
        void Zx(double Zx);
        void Zy(double Zy);
        void Zz(double Zz);

        default void Xxy(final double v) {
            Xxy(v, v);
        }

        default void Xxz(final double v) {
            Xxz(v, v);
        }

        default void Xyz(final double v) {
            Xyz(v, v);
        }

        default void Xxyz(final double v) {
            Xxyz(v, v, v);
        }

        default void Yxy(final double v) {
            Yxy(v, v);
        }

        default void Yxz(final double v) {
            Yxz(v, v);
        }

        default void Yyz(final double v) {
            Yyz(v, v);
        }

        default void Yxyz(final double v) {
            Yxyz(v, v, v);
        }

        default void Zxy(final double v) {
            Zxy(v, v);
        }

        default void Zxz(final double v) {
            Zxz(v, v);
        }

        default void Zyz(final double v) {
            Zyz(v, v);
        }

        default void Zxyz(final double v) {
            Zxyz(v, v, v);
        }

        default void xXY(final double v) {
            xXY(v, v);
        }

        default void xXZ(final double v) {
            xXZ(v, v);
        }

        default void xYZ(final double v) {
            xYZ(v, v);
        }

        default void xXYZ(final double v) {
            xXYZ(v, v, v);
        }

        default void yXY(final double v) {
            yXY(v, v);
        }

        default void yXZ(final double v) {
            yXZ(v, v);
        }

        default void yYZ(final double v) {
            yYZ(v, v);
        }

        default void yXYZ(final double v) {
            yXYZ(v, v, v);
        }

        default void zXY(final double v) {
            zXY(v, v);
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

        default void Dxy(final double v) {
            Dxy(v, v);
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

        default void XYxy(final double v) {
            XYxy(v, v, v, v);
        }

        default void XYyz(final double v) {
            XYyz(v, v, v, v);
        }

        default void YZxy(final double v) {
            YZxy(v, v, v, v);
        }

        default void YZyz(final double v) {
            YZyz(v, v, v, v);
        }

        default void XYZxyz(final double v) {
            XYZxyz(v, v, v, v, v, v, v, v, v);
        }

        default void Xxy(final double Xx, final double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Xxz(final double Xx, final double Xz) {
            Xx(Xx);
            Xz(Xz);
        }

        default void Xyz(final double Xy, final double Xz) {
            Xy(Xy);
            Xz(Xz);
        }

        default void Xxyz(final double Xx, final double Xy, final double Xz) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
        }

        default void Yxy(final double Yx, final double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void Yxz(final double Yx, final double Yz) {
            Yx(Yx);
            Yz(Yz);
        }

        default void Yyz(final double Yy, final double Yz) {
            Yy(Yy);
            Yz(Yz);
        }

        default void Yxyz(final double Yx, final double Yy, final double Yz) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
        }

        default void Zxy(final double Zx, final double Zy) {
            Zx(Zx);
            Zy(Zy);
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

        default void xXY(final double Xx, final double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void xXZ(final double Xx, final double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void xYZ(final double Yx, final double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void xXYZ(final double Xx, final double Yx, final double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
        }

        default void yXY(final double Xy, final double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void yXZ(final double Xy, final double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void yYZ(final double Yy, final double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void yXYZ(final double Xy, final double Yy, final double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
        }

        default void zXY(final double Xz, final double Yz) {
            Xz(Xz);
            Yz(Yz);
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

        default void Dxy(final double Xx, final double Yy) {
            Xx(Xx);
            Yy(Yy);
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

        default void XYxy(
                final double Xx, final double Xy,
                final double Yx, final double Yy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
        }

        default void xyXY(
                final double Xx, final double Yx,
                final double Xy, final double Yy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
        }

        default void XYyz(
                final double Xy, final double Xz,
                final double Yy, final double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void yzXY(
                final double Xy, final double Yy,
                final double Xz, final double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void YZxy(
                final double Yx, final double Yy,
                final double Zx, final double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void xyYZ(
                final double Yx, final double Zx,
                final double Yy, final double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
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

        default void yzYZ(
                final double Yy, final double Zy,
                final double Yz, final double Zz
        ) {
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

        default void Xxy(final Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Xxz(final Vector2.Accessible v) {
            Xxz(v.x(), v.y());
        }

        default void Xyz(final Vector2.Accessible v) {
            Xyz(v.x(), v.y());
        }

        default void Xxyz(final Vector3.Accessible v) {
            Xxyz(v.x(), v.y(), v.z());
        }

        default void Yxy(final Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void Yxz(final Vector2.Accessible v) {
            Yxz(v.x(), v.y());
        }

        default void Yyz(final Vector2.Accessible v) {
            Yyz(v.x(), v.y());
        }

        default void Yxyz(final Vector3.Accessible v) {
            Yxyz(v.x(), v.y(), v.z());
        }

        default void Zxy(final Vector2.Accessible v) {
            Zxy(v.x(), v.y());
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

        default void xXY(final Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void xXZ(final Vector2.Accessible v) {
            xXZ(v.x(), v.y());
        }

        default void xYZ(final Vector2.Accessible v) {
            xYZ(v.x(), v.y());
        }

        default void xXYZ(final Vector3.Accessible v) {
            xXYZ(v.x(), v.y(), v.z());
        }

        default void yXY(final Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void yXZ(final Vector2.Accessible v) {
            yXZ(v.x(), v.y());
        }

        default void yYZ(final Vector2.Accessible v) {
            yYZ(v.x(), v.y());
        }

        default void yXYZ(final Vector3.Accessible v) {
            yXYZ(v.x(), v.y(), v.z());
        }

        default void zXY(final Vector2.Accessible v) {
            zXY(v.x(), v.y());
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

        default void Dxy(final Vector2.Accessible v) {
            Dxy(v.x(), v.y());
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

        default void XYxy(final Matrix2x2.Accessible m) {
            XYxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXY(final Matrix2x2.Accessible m) {
            xyXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyz(final Matrix2x2.Accessible m) {
            XYyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXY(final Matrix2x2.Accessible m) {
            yzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxy(final Matrix2x2.Accessible m) {
            YZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyYZ(final Matrix2x2.Accessible m) {
            xyYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyz(final Matrix2x2.Accessible m) {
            YZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYZ(final Matrix2x2.Accessible m) {
            yzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxyz(final Matrix3x3.Accessible m) {
            XYZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzXYZ(final Matrix3x3.Accessible m) {
            xyzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
