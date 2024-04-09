package ee.ristoseene.vecmath;

public final class Matrix3x2 {

    private Matrix3x2() {}

    @FunctionalInterface
    public interface Consumer {

        void XYZxy(
                double Xx, double Xy,
                double Yx, double Yy,
                double Zx, double Zy
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy,
                double Yx, double Yy,
                double Zx, double Zy
        );

    }

    public interface Accessible extends Matrix2x2.Accessible {

        double Zx();
        double Zy();

        default <R> R Zxy(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zy());
        }

        default void ZxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zy());
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

        default <R> R XZxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Zx(), Zy());
        }

        default void XZxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Zx(), Zy());
        }

        default <R> R YZxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Zx(), Zy());
        }

        default void YZxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yy(), Zx(), Zy());
        }

        default <R> R XYZxy(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy(), Zx(), Zy());
        }

        default void XYZxyTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xy(), Yx(), Yy(), Zx(), Zy());
        }

        default <R> R xyXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xy(), Zy());
        }

        default void xyXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Zx(), Xy(), Zy());
        }

        default <R> R xyYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy());
        }

        default void xyYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yy(), Zy());
        }

    }

    public interface Mutable extends Consumer, Matrix2x2.Mutable {

        void Zx(double Zx);
        void Zy(double Zy);

        default void Zxy(final double v) {
            Zxy(v, v);
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

        default void yXZ(final double v) {
            yXZ(v, v);
        }

        default void yYZ(final double v) {
            yYZ(v, v);
        }

        default void yXYZ(final double v) {
            yXYZ(v, v, v);
        }

        default void XZxy(final double v) {
            XZxy(v, v, v, v);
        }

        default void YZxy(final double v) {
            YZxy(v, v, v, v);
        }

        default void XYZxy(final double v) {
            XYZxy(v, v, v, v, v, v);
        }

        default void Zxy(final double Zx, final double Zy) {
            Zx(Zx);
            Zy(Zy);
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

        default void XZxy(
                final double Xx, final double Xy,
                final double Zx, final double Zy
        ) {
            Xx(Xx);
            Xy(Xy);
            Zx(Zx);
            Zy(Zy);
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

        @Override
        default void XYZxy(
                final double Xx, final double Xy,
                final double Yx, final double Yy,
                final double Zx, final double Zy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void xyXZ(
                final double Xx, final double Zx,
                final double Xy, final double Zy
        ) {
            Xx(Xx);
            Xy(Xy);
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

        default void Zxy(final Vector2.Accessible v) {
            Zxy(v.x(), v.y());
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

        default void yXZ(final Vector2.Accessible v) {
            yXZ(v.x(), v.y());
        }

        default void yYZ(final Vector2.Accessible v) {
            yYZ(v.x(), v.y());
        }

        default void yXYZ(final Vector3.Accessible v) {
            yXYZ(v.x(), v.y(), v.z());
        }

        default void XZxy(final Matrix2x2.Accessible m) {
            XZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxy(final Matrix2x2.Accessible m) {
            YZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxy(final Matrix3x2.Accessible m) {
            XYZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xyXZ(final Matrix2x2.Accessible m) {
            xyXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyYZ(final Matrix2x2.Accessible m) {
            xyYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix2x2.AccessibleAndMutable {}

}
