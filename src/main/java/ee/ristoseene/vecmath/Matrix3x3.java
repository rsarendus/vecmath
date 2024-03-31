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

        default <R> R Xxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default void XxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default <R> R Xxz(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xz());
        }

        default void XxzTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xz());
        }

        default <R> R Xyz(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xz());
        }

        default void XyzTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xz());
        }

        default <R> R Xxyz(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz());
        }

        default void XxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xz());
        }

        default <R> R Yxy(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default void YxyTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default <R> R Yxz(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yz());
        }

        default void YxzTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yz());
        }

        default <R> R Yyz(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yz());
        }

        default void YyzTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yz());
        }

        default <R> R Yxyz(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz());
        }

        default void YxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yz());
        }

        default <R> R Zxy(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zy());
        }

        default void ZxyTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zy());
        }

        default <R> R Zxz(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zz());
        }

        default void ZxzTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zz());
        }

        default <R> R Zyz(Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zz());
        }

        default void ZyzTo(Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zz());
        }

        default <R> R Zxyz(Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz());
        }

        default void ZxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zz());
        }

        default <R> R xXY(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default void xXYto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default <R> R xXZ(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default void xXZto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default <R> R xYZ(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default void xYZto(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
        }

        default <R> R xXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default void xXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
        }

        default <R> R yXY(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default void yXYto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default <R> R yXZ(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default void yXZto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default <R> R yYZ(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default void yYZto(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
        }

        default <R> R yXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default void yXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
        }

        default <R> R zXY(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default void zXYto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default <R> R zXZ(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default void zXZto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default <R> R zYZ(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default void zYZto(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
        }

        default <R> R zXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz());
        }

        default void zXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Zz());
        }

        default <R> R Dxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default void DxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
        }

        default <R> R Dxz(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zz());
        }

        default void DxzTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zz());
        }

        default <R> R Dyz(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zz());
        }

        default void DyzTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zz());
        }

        default <R> R Dxyz(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz());
        }

        default void DxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Zz());
        }

        default <R> R XYxy(Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy());
        }

        default void XYxyTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Yx(), Yy());
        }

        default <R> R xyXY(Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy());
        }

        default void xyXYto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xy(), Yy());
        }

        default <R> R XYyz(Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz());
        }

        default void XYyzTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Yy(), Yz());
        }

        default <R> R yzXY(Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xz(), Yz());
        }

        default void yzXYto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xz(), Yz());
        }

        default <R> R YZxy(Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Zx(), Zy());
        }

        default void YZxyTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yy(), Zx(), Zy());
        }

        default <R> R xyYZ(Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy());
        }

        default void xyYZto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yy(), Zy());
        }

        default <R> R YZyz(Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Zy(), Zz());
        }

        default void YZyzTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Zy(), Zz());
        }

        default <R> R yzYZ(Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yz(), Zz());
        }

        default void yzYZto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yz(), Zz());
        }

        default <R> R XYZxyz(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void XYZxyzTo(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R xyzXYZ(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void xyzXYZto(Matrix3x3.Consumer consumer) {
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

        default void Xxy(double v) {
            Xxy(v, v);
        }

        default void Xxz(double v) {
            Xxz(v, v);
        }

        default void Xyz(double v) {
            Xyz(v, v);
        }

        default void Xxyz(double v) {
            Xxyz(v, v, v);
        }

        default void Yxy(double v) {
            Yxy(v, v);
        }

        default void Yxz(double v) {
            Yxz(v, v);
        }

        default void Yyz(double v) {
            Yyz(v, v);
        }

        default void Yxyz(double v) {
            Yxyz(v, v, v);
        }

        default void Zxy(double v) {
            Zxy(v, v);
        }

        default void Zxz(double v) {
            Zxz(v, v);
        }

        default void Zyz(double v) {
            Zyz(v, v);
        }

        default void Zxyz(double v) {
            Zxyz(v, v, v);
        }

        default void xXY(double v) {
            xXY(v, v);
        }

        default void xXZ(double v) {
            xXZ(v, v);
        }

        default void xYZ(double v) {
            xYZ(v, v);
        }

        default void xXYZ(double v) {
            xXYZ(v, v, v);
        }

        default void yXY(double v) {
            yXY(v, v);
        }

        default void yXZ(double v) {
            yXZ(v, v);
        }

        default void yYZ(double v) {
            yYZ(v, v);
        }

        default void yXYZ(double v) {
            yXYZ(v, v, v);
        }

        default void zXY(double v) {
            zXY(v, v);
        }

        default void zXZ(double v) {
            zXZ(v, v);
        }

        default void zYZ(double v) {
            zYZ(v, v);
        }

        default void zXYZ(double v) {
            zXYZ(v, v, v);
        }

        default void Dxy(double v) {
            Dxy(v, v);
        }

        default void Dxz(double v) {
            Dxz(v, v);
        }

        default void Dyz(double v) {
            Dyz(v, v);
        }

        default void Dxyz(double v) {
            Dxyz(v, v, v);
        }

        default void XYxy(double v) {
            XYxy(v, v, v, v);
        }

        default void XYyz(double v) {
            XYyz(v, v, v, v);
        }

        default void YZxy(double v) {
            YZxy(v, v, v, v);
        }

        default void YZyz(double v) {
            YZyz(v, v, v, v);
        }

        default void XYZxyz(double v) {
            XYZxyz(v, v, v, v, v, v, v, v, v);
        }

        default void Xxy(double Xx, double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Xxz(double Xx, double Xz) {
            Xx(Xx);
            Xz(Xz);
        }

        default void Xyz(double Xy, double Xz) {
            Xy(Xy);
            Xz(Xz);
        }

        default void Xxyz(double Xx, double Xy, double Xz) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
        }

        default void Yxy(double Yx, double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void Yxz(double Yx, double Yz) {
            Yx(Yx);
            Yz(Yz);
        }

        default void Yyz(double Yy, double Yz) {
            Yy(Yy);
            Yz(Yz);
        }

        default void Yxyz(double Yx, double Yy, double Yz) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
        }

        default void Zxy(double Zx, double Zy) {
            Zx(Zx);
            Zy(Zy);
        }

        default void Zxz(double Zx, double Zz) {
            Zx(Zx);
            Zz(Zz);
        }

        default void Zyz(double Zy, double Zz) {
            Zy(Zy);
            Zz(Zz);
        }

        default void Zxyz(double Zx, double Zy, double Zz) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void xXY(double Xx, double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void xXZ(double Xx, double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void xYZ(double Yx, double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void xXYZ(double Xx, double Yx, double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
        }

        default void yXY(double Xy, double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void yXZ(double Xy, double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void yYZ(double Yy, double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void yXYZ(double Xy, double Yy, double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
        }

        default void zXY(double Xz, double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void zXZ(double Xz, double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void zYZ(double Yz, double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void zXYZ(double Xz, double Yz, double Zz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
        }

        default void Dxy(double Xx, double Yy) {
            Xx(Xx);
            Yy(Yy);
        }

        default void Dxz(double Xx, double Zz) {
            Xx(Xx);
            Zz(Zz);
        }

        default void Dyz(double Yy, double Zz) {
            Yy(Yy);
            Zz(Zz);
        }

        default void Dxyz(double Xx, double Yy, double Zz) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
        }

        default void XYxy(
                double Xx, double Xy,
                double Yx, double Yy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
        }

        default void xyXY(
                double Xx, double Yx,
                double Xy, double Yy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
        }

        default void XYyz(
                double Xy, double Xz,
                double Yy, double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void yzXY(
                double Xy, double Yy,
                double Xz, double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void YZxy(
                double Yx, double Yy,
                double Zx, double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void xyYZ(
                double Yx, double Zx,
                double Yy, double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void YZyz(
                double Yy, double Yz,
                double Zy, double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void yzYZ(
                double Yy, double Zy,
                double Yz, double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void XYZxyz(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz,
                double Zx, double Zy, double Zz
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
                double Xx, double Yx, double Zx,
                double Xy, double Yy, double Zy,
                double Xz, double Yz, double Zz
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

        default void Xxy(Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Xxz(Vector2.Accessible v) {
            Xxz(v.x(), v.y());
        }

        default void Xyz(Vector2.Accessible v) {
            Xyz(v.x(), v.y());
        }

        default void Xxyz(Vector3.Accessible v) {
            Xxyz(v.x(), v.y(), v.z());
        }

        default void Yxy(Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void Yxz(Vector2.Accessible v) {
            Yxz(v.x(), v.y());
        }

        default void Yyz(Vector2.Accessible v) {
            Yyz(v.x(), v.y());
        }

        default void Yxyz(Vector3.Accessible v) {
            Yxyz(v.x(), v.y(), v.z());
        }

        default void Zxy(Vector2.Accessible v) {
            Zxy(v.x(), v.y());
        }

        default void Zxz(Vector2.Accessible v) {
            Zxz(v.x(), v.y());
        }

        default void Zyz(Vector2.Accessible v) {
            Zyz(v.x(), v.y());
        }

        default void Zxyz(Vector3.Accessible v) {
            Zxyz(v.x(), v.y(), v.z());
        }

        default void xXY(Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void xXZ(Vector2.Accessible v) {
            xXZ(v.x(), v.y());
        }

        default void xYZ(Vector2.Accessible v) {
            xYZ(v.x(), v.y());
        }

        default void xXYZ(Vector3.Accessible v) {
            xXYZ(v.x(), v.y(), v.z());
        }

        default void yXY(Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void yXZ(Vector2.Accessible v) {
            yXZ(v.x(), v.y());
        }

        default void yYZ(Vector2.Accessible v) {
            yYZ(v.x(), v.y());
        }

        default void yXYZ(Vector3.Accessible v) {
            yXYZ(v.x(), v.y(), v.z());
        }

        default void zXY(Vector2.Accessible v) {
            zXY(v.x(), v.y());
        }

        default void zXZ(Vector2.Accessible v) {
            zXZ(v.x(), v.y());
        }

        default void zYZ(Vector2.Accessible v) {
            zYZ(v.x(), v.y());
        }

        default void zXYZ(Vector3.Accessible v) {
            zXYZ(v.x(), v.y(), v.z());
        }

        default void Dxy(Vector2.Accessible v) {
            Dxy(v.x(), v.y());
        }

        default void Dxz(Vector2.Accessible v) {
            Dxz(v.x(), v.y());
        }

        default void Dyz(Vector2.Accessible v) {
            Dyz(v.x(), v.y());
        }

        default void Dxyz(Vector3.Accessible v) {
            Dxyz(v.x(), v.y(), v.z());
        }

        default void XYxy(Matrix2x2.Accessible m) {
            XYxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXY(Matrix2x2.Accessible m) {
            xyXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyz(Matrix2x2.Accessible m) {
            XYyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXY(Matrix2x2.Accessible m) {
            yzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxy(Matrix2x2.Accessible m) {
            YZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyYZ(Matrix2x2.Accessible m) {
            xyYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyz(Matrix2x2.Accessible m) {
            YZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYZ(Matrix2x2.Accessible m) {
            yzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxyz(Matrix3x3.Accessible m) {
            XYZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzXYZ(Matrix3x3.Accessible m) {
            xyzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
