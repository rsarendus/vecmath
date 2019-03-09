package ee.ristoseene.vecmath;

public final class Vector2 {

    private Vector2() {}

    public interface Accessible {

        double x();
        double y();

        default Value.Accessible const$x() {
            return this::x;
        }

        default Value.Accessible const$y() {
            return this::y;
        }

        default Vector2.Accessible const$xx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
            };
        }

        default Vector2.Accessible const$xy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
            };
        }

        default Vector2.Accessible const$yx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
            };
        }

        default Vector2.Accessible const$yy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
            };
        }

        default Value.Accessible $x() {
            return const$x();
        }

        default Value.Accessible $y() {
            return const$y();
        }

        default Vector2.Accessible $xx() {
            return const$xx();
        }

        default Vector2.Accessible $xy() {
            return this;
        }

        default Vector2.Accessible $yx() {
            return const$yx();
        }

        default Vector2.Accessible $yy() {
            return const$yy();
        }

        default <R> R x(Value.Factory<R> factory) {
            return factory.create(x());
        }

        default <R> R y(Value.Factory<R> factory) {
            return factory.create(y());
        }

        default <R> R xx(Vector2.Factory<R> factory) {
            return factory.create(x(), x());
        }

        default <R> R xy(Vector2.Factory<R> factory) {
            return factory.create(x(), y());
        }

        default <R> R yx(Vector2.Factory<R> factory) {
            return factory.create(y(), x());
        }

        default <R> R yy(Vector2.Factory<R> factory) {
            return factory.create(y(), y());
        }

        default void xTo(Value.Consumer consumer) {
            consumer.set(x());
        }

        default void yTo(Value.Consumer consumer) {
            consumer.set(y());
        }

        default void xxTo(Vector2.Consumer consumer) {
            consumer.xy(x(), x());
        }

        default void xyTo(Vector2.Consumer consumer) {
            consumer.xy(x(), y());
        }

        default void yxTo(Vector2.Consumer consumer) {
            consumer.xy(y(), x());
        }

        default void yyTo(Vector2.Consumer consumer) {
            consumer.xy(y(), y());
        }

    }

    public interface Mutable extends Consumer {

        void x(double x);
        void y(double y);

        default void xy(double v) {
            x(v);
            y(v);
        }

        default void xy(double x, double y) {
            x(x);
            y(y);
        }

        default void yx(double y, double x) {
            x(x);
            y(y);
        }

        default void x(Value.Accessible x) {
            x(x.get());
        }

        default void y(Value.Accessible y) {
            y(y.get());
        }

        default void xy(Vector2.Accessible v) {
            xy(v.x(), v.y());
        }

        default void yx(Vector2.Accessible v) {
            yx(v.x(), v.y());
        }

        default Value.Mutable $x() {
            return this::x;
        }

        default Value.Mutable $y() {
            return this::y;
        }

        default Vector2.Mutable $xy() {
            return this;
        }

        default Vector2.Mutable $yx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.y(x); }
                public void y(double y) { Mutable.this.x(y); }
            };
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {

        default Value.AccessibleAndMutable $x() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.x(); }
                public void set(double v) { AccessibleAndMutable.this.x(v); }
            };
        }

        default Value.AccessibleAndMutable $y() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.y(); }
                public void set(double v) { AccessibleAndMutable.this.y(v); }
            };
        }

        default Vector2.AccessibleAndMutable $xy() {
            return this;
        }

        default Vector2.AccessibleAndMutable $yx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.y(); }
                public double y() { return AccessibleAndMutable.this.x(); }
                public void x(double x) { AccessibleAndMutable.this.y(x); }
                public void y(double y) { AccessibleAndMutable.this.x(y); }
            };
        }

    }

    @FunctionalInterface
    public interface Consumer {

        void xy(double x, double y);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double x, double y);

    }

}
