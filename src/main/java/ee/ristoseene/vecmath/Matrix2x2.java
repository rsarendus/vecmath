package ee.ristoseene.vecmath;

public final class Matrix2x2 {

    private Matrix2x2() {}

    public interface Accessible {

        double Xx();
        double Xy();
        double Yx();
        double Yy();

        default Value.Accessible const$Xx() {
            return this::Xx;
        }

        default Value.Accessible const$Xy() {
            return this::Xy;
        }

        default Value.Accessible const$Yx() {
            return this::Yx;
        }

        default Value.Accessible const$Yy() {
            return this::Yy;
        }

        default Vector2.Accessible const$Xxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
            };
        }

        default Vector2.Accessible const$Yxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Vector2.Accessible const$xXY() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
            };
        }

        default Vector2.Accessible const$yXY() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Vector2.Accessible const$Dxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Matrix2x2.Accessible const$XYxy() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Xx(); }
                public double Xy() { return Accessible.this.Xy(); }
                public double Yx() { return Accessible.this.Yx(); }
                public double Yy() { return Accessible.this.Yy(); }
            };
        }

        default Matrix2x2.Accessible const$xyXY() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Xx(); }
                public double Xy() { return Accessible.this.Yx(); }
                public double Yx() { return Accessible.this.Xy(); }
                public double Yy() { return Accessible.this.Yy(); }
            };
        }

        default Value.Accessible $Xx() {
            return const$Xx();
        }

        default Value.Accessible $Xy() {
            return const$Xy();
        }

        default Value.Accessible $Yx() {
            return const$Yx();
        }

        default Value.Accessible $Yy() {
            return const$Yy();
        }

        default Vector2.Accessible $Xxy() {
            return const$Xxy();
        }

        default Vector2.Accessible $Yxy() {
            return const$Yxy();
        }

        default Vector2.Accessible $xXY() {
            return const$xXY();
        }

        default Vector2.Accessible $yXY() {
            return const$yXY();
        }

        default Vector2.Accessible $Dxy() {
            return const$Dxy();
        }

        default Matrix2x2.Accessible $XYxy() {
            return this;
        }

        default Matrix2x2.Accessible $xyXY() {
            return const$xyXY();
        }

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

        default Value.Mutable $Xx() {
            return this::Xx;
        }

        default Value.Mutable $Xy() {
            return this::Xy;
        }

        default Value.Mutable $Yx() {
            return this::Yx;
        }

        default Value.Mutable $Yy() {
            return this::Yy;
        }

        default Vector2.Mutable $Xxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
            };
        }

        default Vector2.Mutable $Yxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Vector2.Mutable $xXY() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
            };
        }

        default Vector2.Mutable $yXY() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Vector2.Mutable $Dxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Matrix2x2.Mutable $XYxy() {
            return this;
        }

        default Matrix2x2.Mutable $xyXY() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xx(Xx); }
                public void Xy(double Xy) { Mutable.this.Yx(Xy); }
                public void Yx(double Yx) { Mutable.this.Xy(Yx); }
                public void Yy(double Yy) { Mutable.this.Yy(Yy); }
            };
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {

        default Value.AccessibleAndMutable $Xx() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Xx(); }
                public void set(double v) { AccessibleAndMutable.this.Xx(v); }
            };
        }

        default Value.AccessibleAndMutable $Xy() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Xy(); }
                public void set(double v) { AccessibleAndMutable.this.Xy(v); }
            };
        }

        default Value.AccessibleAndMutable $Yx() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Yx(); }
                public void set(double v) { AccessibleAndMutable.this.Yx(v); }
            };
        }

        default Value.AccessibleAndMutable $Yy() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Yy(); }
                public void set(double v) { AccessibleAndMutable.this.Yy(v); }
            };
        }

        default Vector2.AccessibleAndMutable $Xxy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xy(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Yxy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $xXY() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $yXY() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Dxy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $XYxy() {
            return this;
        }

        default Matrix2x2.AccessibleAndMutable $xyXY() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xx(); }
                public double Xy() { return AccessibleAndMutable.this.Yx(); }
                public double Yx() { return AccessibleAndMutable.this.Xy(); }
                public double Yy() { return AccessibleAndMutable.this.Yy(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yx(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Xy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yy(Yy); }
            };
        }

    }

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
