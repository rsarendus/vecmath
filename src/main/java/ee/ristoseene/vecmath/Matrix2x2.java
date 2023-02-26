package ee.ristoseene.vecmath;

public final class Matrix2x2 {

    private Matrix2x2() {}

    public interface Accessible {

        double Xx();
        double Xy();
        double Yx();
        double Yy();

        default <R> R Xx(Value.Factory<R> factory) {
            return factory.create(Xx());
        }

        default <R> R Xy(Value.Factory<R> factory) {
            return factory.create(Xy());
        }

        default <R> R Yx(Value.Factory<R> factory) {
            return factory.create(Yx());
        }

        default <R> R Yy(Value.Factory<R> factory) {
            return factory.create(Yy());
        }

        default <R> R Xxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default <R> R Yxy(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default <R> R xXY(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default <R> R yXY(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default <R> R Dxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default <R> R XYxy(Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy());
        }

        default <R> R xyXY(Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy());
        }

        default void XxTo(Value.Consumer consumer) {
            consumer.set(Xx());
        }

        default void XyTo(Value.Consumer consumer) {
            consumer.set(Xy());
        }

        default void YxTo(Value.Consumer consumer) {
            consumer.set(Yx());
        }

        default void YyTo(Value.Consumer consumer) {
            consumer.set(Yy());
        }

        default void XxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default void YxyTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default void xXYto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default void yXYto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default void DxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
        }

        default void XYxyTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Yx(), Yy());
        }

        default void xyXYto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xy(), Yy());
        }

    }

    public interface Mutable extends Consumer {

        void Xx(double Xx);
        void Xy(double Xy);
        void Yx(double Yx);
        void Yy(double Yy);

        default void Xxy(double v) {
            Xx(v);
            Xy(v);
        }

        default void Yxy(double v) {
            Yx(v);
            Yy(v);
        }

        default void xXY(double v) {
            Xx(v);
            Yx(v);
        }

        default void yXY(double v) {
            Xy(v);
            Yy(v);
        }

        default void Dxy(double v) {
            Xx(v);
            Yy(v);
        }

        default void XYxy(double v) {
            Xx(v);
            Xy(v);
            Yx(v);
            Yy(v);
        }

        default void Xxy(double Xx, double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Yxy(double Yx, double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void xXY(double Xx, double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void yXY(double Xy, double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void Dxy(double Xx, double Yy) {
            Xx(Xx);
            Yy(Yy);
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

        default void Xx(Value.Accessible Xx) {
            Xx(Xx.get());
        }

        default void Xy(Value.Accessible Xy) {
            Xy(Xy.get());
        }

        default void Yx(Value.Accessible Yx) {
            Yx(Yx.get());
        }

        default void Yy(Value.Accessible Yy) {
            Yy(Yy.get());
        }

        default void Xxy(Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Yxy(Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void xXY(Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void yXY(Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void Dxy(Vector2.Accessible v) {
            Dxy(v.x(), v.y());
        }

        default void XYxy(Matrix2x2.Accessible m) {
            XYxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXY(Matrix2x2.Accessible m) {
            xyXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

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

}
