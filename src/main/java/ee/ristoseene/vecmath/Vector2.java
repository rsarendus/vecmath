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

        default Vector3.Accessible const$xxx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$xxy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$xyx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$xyy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$yxx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$yxy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$yyx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$yyy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xxxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xxxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xxyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xxyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xyxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xyxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xyyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xyyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yxxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yxxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yxyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yxyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yyxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yyxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yyyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yyyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
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

        default Vector3.Accessible $xxx() {
            return const$xxx();
        }

        default Vector3.Accessible $xxy() {
            return const$xxy();
        }

        default Vector3.Accessible $xyx() {
            return const$xyx();
        }

        default Vector3.Accessible $xyy() {
            return const$xyy();
        }

        default Vector3.Accessible $yxx() {
            return const$yxx();
        }

        default Vector3.Accessible $yxy() {
            return const$yxy();
        }

        default Vector3.Accessible $yyx() {
            return const$yyx();
        }

        default Vector3.Accessible $yyy() {
            return const$yyy();
        }

        default Vector4.Accessible $xxxx() {
            return const$xxxx();
        }

        default Vector4.Accessible $xxxy() {
            return const$xxxy();
        }

        default Vector4.Accessible $xxyx() {
            return const$xxyx();
        }

        default Vector4.Accessible $xxyy() {
            return const$xxyy();
        }

        default Vector4.Accessible $xyxx() {
            return const$xyxx();
        }

        default Vector4.Accessible $xyxy() {
            return const$xyxy();
        }

        default Vector4.Accessible $xyyx() {
            return const$xyyx();
        }

        default Vector4.Accessible $xyyy() {
            return const$xyyy();
        }

        default Vector4.Accessible $yxxx() {
            return const$yxxx();
        }

        default Vector4.Accessible $yxxy() {
            return const$yxxy();
        }

        default Vector4.Accessible $yxyx() {
            return const$yxyx();
        }

        default Vector4.Accessible $yxyy() {
            return const$yxyy();
        }

        default Vector4.Accessible $yyxx() {
            return const$yyxx();
        }

        default Vector4.Accessible $yyxy() {
            return const$yyxy();
        }

        default Vector4.Accessible $yyyx() {
            return const$yyyx();
        }

        default Vector4.Accessible $yyyy() {
            return const$yyyy();
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

        default <R> R xxx(Vector3.Factory<R> factory) {
            return factory.create(x(), x(), x());
        }

        default <R> R xxy(Vector3.Factory<R> factory) {
            return factory.create(x(), x(), y());
        }

        default <R> R xyx(Vector3.Factory<R> factory) {
            return factory.create(x(), y(), x());
        }

        default <R> R xyy(Vector3.Factory<R> factory) {
            return factory.create(x(), y(), y());
        }

        default <R> R yxx(Vector3.Factory<R> factory) {
            return factory.create(y(), x(), x());
        }

        default <R> R yxy(Vector3.Factory<R> factory) {
            return factory.create(y(), x(), y());
        }

        default <R> R yyx(Vector3.Factory<R> factory) {
            return factory.create(y(), y(), x());
        }

        default <R> R yyy(Vector3.Factory<R> factory) {
            return factory.create(y(), y(), y());
        }

        default <R> R xxxx(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), x());
        }

        default <R> R xxxy(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), y());
        }

        default <R> R xxyx(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), x());
        }

        default <R> R xxyy(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), y());
        }

        default <R> R xyxx(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), x());
        }

        default <R> R xyxy(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), y());
        }

        default <R> R xyyx(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), x());
        }

        default <R> R xyyy(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), y());
        }

        default <R> R yxxx(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), x());
        }

        default <R> R yxxy(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), y());
        }

        default <R> R yxyx(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), x());
        }

        default <R> R yxyy(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), y());
        }

        default <R> R yyxx(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), x());
        }

        default <R> R yyxy(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), y());
        }

        default <R> R yyyx(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), x());
        }

        default <R> R yyyy(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), y());
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

        default void xxxTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), x());
        }

        default void xxyTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), y());
        }

        default void xyxTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), x());
        }

        default void xyyTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), y());
        }

        default void yxxTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), x());
        }

        default void yxyTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), y());
        }

        default void yyxTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), x());
        }

        default void yyyTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), y());
        }

        default void xxxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), x());
        }

        default void xxxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), y());
        }

        default void xxyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), x());
        }

        default void xxyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), y());
        }

        default void xyxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), x());
        }

        default void xyxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), y());
        }

        default void xyyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), x());
        }

        default void xyyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), y());
        }

        default void yxxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), x());
        }

        default void yxxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), y());
        }

        default void yxyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), x());
        }

        default void yxyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), y());
        }

        default void yyxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), x());
        }

        default void yyxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), y());
        }

        default void yyyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), x());
        }

        default void yyyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), y());
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
