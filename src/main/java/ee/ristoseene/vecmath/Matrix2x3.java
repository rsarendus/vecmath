package ee.ristoseene.vecmath;

public final class Matrix2x3 {

    private Matrix2x3() {}

    @FunctionalInterface
    public interface Consumer {

        void XYxyz(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz
        );

    }

    public interface Accessible extends Matrix2x2.Accessible {

        double Xz();
        double Yz();

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

        default <R> R zXY(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default void zXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default <R> R XYxz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Yx(), Yz());
        }

        default void XYxzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xz(), Yx(), Yz());
        }

        default <R> R XYyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz());
        }

        default void XYyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Yy(), Yz());
        }

        default <R> R XYxyz(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz());
        }

        default void XYxyzTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz());
        }

        default <R> R xzXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xz(), Yz());
        }

        default void xzXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xz(), Yz());
        }

        default <R> R yzXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xz(), Yz());
        }

        default void yzXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xz(), Yz());
        }

        default <R> R xyzXY(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy(), Xz(), Yz());
        }

        default void xyzXYto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Yx(), Xy(), Yy(), Xz(), Yz());
        }

    }

    public interface Mutable extends Consumer, Matrix2x2.Mutable {

        void Xz(double Xz);
        void Yz(double Yz);

        default void Xxz(final double v) {
            Xxz(v, v);
        }

        default void Xyz(final double v) {
            Xyz(v, v);
        }

        default void Xxyz(final double v) {
            Xxyz(v, v, v);
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

        default void zXY(final double v) {
            zXY(v, v);
        }

        default void XYxz(final double v) {
            XYxz(v, v, v, v);
        }

        default void XYyz(final double v) {
            XYyz(v, v, v, v);
        }

        default void XYxyz(final double v) {
            XYxyz(v, v, v, v, v, v);
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

        default void zXY(final double Xz, final double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void XYxz(
                final double Xx, final double Xz,
                final double Yx, final double Yz
        ) {
            Xx(Xx);
            Xz(Xz);
            Yx(Yx);
            Yz(Yz);
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

        @Override
        default void XYxyz(
                final double Xx, final double Xy, final double Xz,
                final double Yx, final double Yy, final double Yz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
        }

        default void xzXY(
                final double Xx, final double Yx,
                final double Xz, final double Yz
        ) {
            Xx(Xx);
            Xz(Xz);
            Yx(Yx);
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

        default void xyzXY(
                final double Xx, final double Yx,
                final double Xy, final double Yy,
                final double Xz, final double Yz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
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

        default void Yxz(final Vector2.Accessible v) {
            Yxz(v.x(), v.y());
        }

        default void Yyz(final Vector2.Accessible v) {
            Yyz(v.x(), v.y());
        }

        default void Yxyz(final Vector3.Accessible v) {
            Yxyz(v.x(), v.y(), v.z());
        }

        default void zXY(final Vector2.Accessible v) {
            zXY(v.x(), v.y());
        }

        default void XYxz(final Matrix2x2.Accessible m) {
            XYxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyz(final Matrix2x2.Accessible m) {
            XYyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYxyz(final Matrix2x3.Accessible m) {
            XYxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xzXY(final Matrix2x2.Accessible m) {
            xzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXY(final Matrix2x2.Accessible m) {
            yzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyzXY(final Matrix3x2.Accessible m) {
            xyzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix2x2.AccessibleAndMutable {}

}
