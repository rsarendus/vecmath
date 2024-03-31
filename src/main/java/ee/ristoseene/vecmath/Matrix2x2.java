package ee.ristoseene.vecmath;

public final class Matrix2x2 {

    private Matrix2x2() {}

    @FunctionalInterface
    public interface Consumer {

        void XYxy(
                double Xx, double Xy,
                double Yx, double Yy
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy,
                double Yx, double Yy
        );

    }

    public interface Accessible {

        double Xx();
        double Xy();
        double Yx();
        double Yy();

        default <R> R Xxy(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default void XxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default <R> R Yxy(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default void YxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default <R> R xXY(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default void xXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default <R> R yXY(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default void yXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default <R> R Dxy(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default void DxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
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

    }

    public interface Mutable extends Consumer {

        void Xx(double Xx);
        void Xy(double Xy);
        void Yx(double Yx);
        void Yy(double Yy);

        default void Xxy(final double v) {
            Xxy(v, v);
        }

        default void Yxy(final double v) {
            Yxy(v, v);
        }

        default void xXY(final double v) {
            xXY(v, v);
        }

        default void yXY(final double v) {
            yXY(v, v);
        }

        default void Dxy(final double v) {
            Dxy(v, v);
        }

        default void XYxy(final double v) {
            XYxy(v, v, v, v);
        }

        default void Xxy(final double Xx, final double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Yxy(final double Yx, final double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void xXY(final double Xx, final double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void yXY(final double Xy, final double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void Dxy(final double Xx, final double Yy) {
            Xx(Xx);
            Yy(Yy);
        }

        @Override
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

        default void Xxy(final Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Yxy(final Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void xXY(final Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void yXY(final Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void Dxy(final Vector2.Accessible v) {
            Dxy(v.x(), v.y());
        }

        default void XYxy(final Matrix2x2.Accessible m) {
            XYxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXY(final Matrix2x2.Accessible m) {
            xyXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
