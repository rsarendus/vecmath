package ee.ristoseene.vecmath;

public final class Vector2 {

    private Vector2() {}

    @FunctionalInterface
    public interface Consumer {

        void xy(double x, double y);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double x, double y);

    }

    public interface Accessible {

        double x();
        double y();

        default <R> R xx(final Vector2.Factory<R> factory) {
            return factory.create(x(), x());
        }

        default void xxTo(final Vector2.Consumer consumer) {
            consumer.xy(x(), x());
        }

        default <R> R xy(final Vector2.Factory<R> factory) {
            return factory.create(x(), y());
        }

        default void xyTo(final Vector2.Consumer consumer) {
            consumer.xy(x(), y());
        }

        default <R> R yx(final Vector2.Factory<R> factory) {
            return factory.create(y(), x());
        }

        default void yxTo(final Vector2.Consumer consumer) {
            consumer.xy(y(), x());
        }

        default <R> R yy(final Vector2.Factory<R> factory) {
            return factory.create(y(), y());
        }

        default void yyTo(final Vector2.Consumer consumer) {
            consumer.xy(y(), y());
        }

        default <R> R xxx(final Vector3.Factory<R> factory) {
            return factory.create(x(), x(), x());
        }

        default void xxxTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), x());
        }

        default <R> R xxy(final Vector3.Factory<R> factory) {
            return factory.create(x(), x(), y());
        }

        default void xxyTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), y());
        }

        default <R> R xyx(final Vector3.Factory<R> factory) {
            return factory.create(x(), y(), x());
        }

        default void xyxTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), x());
        }

        default <R> R xyy(final Vector3.Factory<R> factory) {
            return factory.create(x(), y(), y());
        }

        default void xyyTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), y());
        }

        default <R> R yxx(final Vector3.Factory<R> factory) {
            return factory.create(y(), x(), x());
        }

        default void yxxTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), x());
        }

        default <R> R yxy(final Vector3.Factory<R> factory) {
            return factory.create(y(), x(), y());
        }

        default void yxyTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), y());
        }

        default <R> R yyx(final Vector3.Factory<R> factory) {
            return factory.create(y(), y(), x());
        }

        default void yyxTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), x());
        }

        default <R> R yyy(final Vector3.Factory<R> factory) {
            return factory.create(y(), y(), y());
        }

        default void yyyTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), y());
        }

        default <R> R xxxx(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), x());
        }

        default void xxxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), x());
        }

        default <R> R xxxy(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), y());
        }

        default void xxxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), y());
        }

        default <R> R xxyx(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), x());
        }

        default void xxyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), x());
        }

        default <R> R xxyy(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), y());
        }

        default void xxyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), y());
        }

        default <R> R xyxx(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), x());
        }

        default void xyxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), x());
        }

        default <R> R xyxy(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), y());
        }

        default void xyxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), y());
        }

        default <R> R xyyx(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), x());
        }

        default void xyyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), x());
        }

        default <R> R xyyy(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), y());
        }

        default void xyyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), y());
        }

        default <R> R yxxx(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), x());
        }

        default void yxxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), x());
        }

        default <R> R yxxy(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), y());
        }

        default void yxxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), y());
        }

        default <R> R yxyx(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), x());
        }

        default void yxyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), x());
        }

        default <R> R yxyy(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), y());
        }

        default void yxyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), y());
        }

        default <R> R yyxx(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), x());
        }

        default void yyxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), x());
        }

        default <R> R yyxy(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), y());
        }

        default void yyxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), y());
        }

        default <R> R yyyx(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), x());
        }

        default void yyyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), x());
        }

        default <R> R yyyy(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), y());
        }

        default void yyyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), y());
        }

    }

    public interface Mutable extends Consumer {

        void x(double x);
        void y(double y);

        default void xy(final double v) {
            xy(v, v);
        }

        @Override
        default void xy(final double x, final double y) {
            x(x);
            y(y);
        }

        default void yx(final double y, final double x) {
            x(x);
            y(y);
        }

        default void xy(final Vector2.Accessible v) {
            xy(v.x(), v.y());
        }

        default void yx(final Vector2.Accessible v) {
            yx(v.x(), v.y());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
