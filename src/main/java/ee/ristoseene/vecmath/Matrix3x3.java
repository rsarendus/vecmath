package ee.ristoseene.vecmath;

public final class Matrix3x3 {

    private Matrix3x3() {}

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

        default Value.Accessible const$Xx() {
            return this::Xx;
        }

        default Value.Accessible const$Xy() {
            return this::Xy;
        }

        default Value.Accessible const$Xz() {
            return this::Xz;
        }

        default Value.Accessible const$Yx() {
            return this::Yx;
        }

        default Value.Accessible const$Yy() {
            return this::Yy;
        }

        default Value.Accessible const$Yz() {
            return this::Yz;
        }

        default Value.Accessible const$Zx() {
            return this::Zx;
        }

        default Value.Accessible const$Zy() {
            return this::Zy;
        }

        default Value.Accessible const$Zz() {
            return this::Zz;
        }

        default Vector3.Accessible const$X3() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
                public double z() { return Accessible.this.Xz(); }
            };
        }

        default Vector3.Accessible const$Y3() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Yz(); }
            };
        }

        default Vector3.Accessible const$Z3() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$diagonal3() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Matrix3x3.Accessible const$3x3() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Xx(); }
                public double Xy() { return Accessible.this.Xy(); }
                public double Xz() { return Accessible.this.Xz(); }
                public double Yx() { return Accessible.this.Yx(); }
                public double Yy() { return Accessible.this.Yy(); }
                public double Yz() { return Accessible.this.Yz(); }
                public double Zx() { return Accessible.this.Zx(); }
                public double Zy() { return Accessible.this.Zy(); }
                public double Zz() { return Accessible.this.Zz(); }
            };
        }

        default Matrix3x3.Accessible const$transposed3x3() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Xx(); }
                public double Xy() { return Accessible.this.Yx(); }
                public double Xz() { return Accessible.this.Zx(); }
                public double Yx() { return Accessible.this.Xy(); }
                public double Yy() { return Accessible.this.Yy(); }
                public double Yz() { return Accessible.this.Zy(); }
                public double Zx() { return Accessible.this.Xz(); }
                public double Zy() { return Accessible.this.Yz(); }
                public double Zz() { return Accessible.this.Zz(); }
            };
        }

        default Value.Accessible $Xx() {
            return const$Xx();
        }

        default Value.Accessible $Xy() {
            return const$Xy();
        }

        default Value.Accessible $Xz() {
            return const$Xz();
        }

        default Value.Accessible $Yx() {
            return const$Yx();
        }

        default Value.Accessible $Yy() {
            return const$Yy();
        }

        default Value.Accessible $Yz() {
            return const$Yz();
        }

        default Value.Accessible $Zx() {
            return const$Zx();
        }

        default Value.Accessible $Zy() {
            return const$Zy();
        }

        default Value.Accessible $Zz() {
            return const$Zz();
        }

        default Vector3.Accessible $X3() {
            return const$X3();
        }

        default Vector3.Accessible $Y3() {
            return const$Y3();
        }

        default Vector3.Accessible $Z3() {
            return const$Z3();
        }

        default Vector3.Accessible $diagonal3() {
            return const$diagonal3();
        }

        default Matrix3x3.Accessible $3x3() {
            return this;
        }

        default Matrix3x3.Accessible $transposed3x3() {
            return const$transposed3x3();
        }

        default <R> R Xx(Value.Factory<R> factory) {
            return factory.create(Xx());
        }

        default <R> R Xy(Value.Factory<R> factory) {
            return factory.create(Xy());
        }

        default <R> R Xz(Value.Factory<R> factory) {
            return factory.create(Xz());
        }

        default <R> R Yx(Value.Factory<R> factory) {
            return factory.create(Yx());
        }

        default <R> R Yy(Value.Factory<R> factory) {
            return factory.create(Yy());
        }

        default <R> R Yz(Value.Factory<R> factory) {
            return factory.create(Yz());
        }

        default <R> R Zx(Value.Factory<R> factory) {
            return factory.create(Zx());
        }

        default <R> R Zy(Value.Factory<R> factory) {
            return factory.create(Zy());
        }

        default <R> R Zz(Value.Factory<R> factory) {
            return factory.create(Zz());
        }

        default <R> R X3(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz());
        }

        default <R> R Y3(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz());
        }

        default <R> R Z3(Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz());
        }

        default <R> R diagonal3(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz());
        }

        default <R> R get3x3(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R transposed3x3(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void XxTo(Value.Consumer consumer) {
            consumer.set(Xx());
        }

        default void XyTo(Value.Consumer consumer) {
            consumer.set(Xy());
        }

        default void XzTo(Value.Consumer consumer) {
            consumer.set(Xz());
        }

        default void YxTo(Value.Consumer consumer) {
            consumer.set(Yx());
        }

        default void YyTo(Value.Consumer consumer) {
            consumer.set(Yy());
        }

        default void YzTo(Value.Consumer consumer) {
            consumer.set(Yz());
        }

        default void ZxTo(Value.Consumer consumer) {
            consumer.set(Zx());
        }

        default void ZyTo(Value.Consumer consumer) {
            consumer.set(Zy());
        }

        default void ZzTo(Value.Consumer consumer) {
            consumer.set(Zz());
        }

        default void X3To(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xz());
        }

        default void Y3To(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yz());
        }

        default void Z3To(Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zz());
        }

        default void diagonal3To(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Zz());
        }

        default void put3x3To(Matrix3x3.Consumer consumer) {
            consumer.set3x3(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void transposed3x3To(Matrix3x3.Consumer consumer) {
            consumer.set3x3(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
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

        default void X3(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
        }

        default void Y3(double v) {
            Yx(v);
            Yy(v);
            Yz(v);
        }

        default void Z3(double v) {
            Zx(v);
            Zy(v);
            Zz(v);
        }

        default void diagonal3(double v) {
            Xx(v);
            Yy(v);
            Zz(v);
        }

        default void set3x3(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
            Yx(v);
            Yy(v);
            Yz(v);
            Zx(v);
            Zy(v);
            Zz(v);
        }

        default void X3(double Xx, double Xy, double Xz) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
        }

        default void Y3(double Yx, double Yy, double Yz) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
        }

        default void Z3(double Zx, double Zy, double Zz) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void diagonal3(double Xx, double Yy, double Zz) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
        }

        default void set3x3(
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

        default void transposed3x3(
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

        default void Xx(Value.Accessible Xx) {
            Xx(Xx.get());
        }

        default void Xy(Value.Accessible Xy) {
            Xy(Xy.get());
        }

        default void Xz(Value.Accessible Xz) {
            Xz(Xz.get());
        }

        default void Yx(Value.Accessible Yx) {
            Yx(Yx.get());
        }

        default void Yy(Value.Accessible Yy) {
            Yy(Yy.get());
        }

        default void Yz(Value.Accessible Yz) {
            Yz(Yz.get());
        }

        default void Zx(Value.Accessible Zx) {
            Zx(Zx.get());
        }

        default void Zy(Value.Accessible Zy) {
            Zy(Zy.get());
        }

        default void Zz(Value.Accessible Zz) {
            Zz(Zz.get());
        }

        default void X3(Vector3.Accessible v) {
            X3(v.x(), v.y(), v.z());
        }

        default void Y3(Vector3.Accessible v) {
            Y3(v.x(), v.y(), v.z());
        }

        default void Z3(Vector3.Accessible v) {
            Z3(v.x(), v.y(), v.z());
        }

        default void diagonal3(Vector3.Accessible v) {
            diagonal3(v.x(), v.y(), v.z());
        }

        default void set3x3(Matrix3x3.Accessible m) {
            set3x3(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void transposed3x3(Matrix3x3.Accessible m) {
            transposed3x3(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default Value.Mutable $Xx() {
            return this::Xx;
        }

        default Value.Mutable $Xy() {
            return this::Xy;
        }

        default Value.Mutable $Xz() {
            return this::Xz;
        }

        default Value.Mutable $Yx() {
            return this::Yx;
        }

        default Value.Mutable $Yy() {
            return this::Yy;
        }

        default Value.Mutable $Yz() {
            return this::Yz;
        }

        default Value.Mutable $Zx() {
            return this::Zx;
        }

        default Value.Mutable $Zy() {
            return this::Zy;
        }

        default Value.Mutable $Zz() {
            return this::Zz;
        }

        default Vector3.Mutable $X3() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
                public void z(double z) { Mutable.this.Xz(z); }
            };
        }

        default Vector3.Mutable $Y3() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Yz(z); }
            };
        }

        default Vector3.Mutable $Z3() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector3.Mutable $diagonal3() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Matrix3x3.Mutable $3x3() {
            return this;
        }

        default Matrix3x3.Mutable $transposed3x3() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xx(Xx); }
                public void Xy(double Xy) { Mutable.this.Yx(Xy); }
                public void Xz(double Xz) { Mutable.this.Zx(Xz); }
                public void Yx(double Yx) { Mutable.this.Xy(Yx); }
                public void Yy(double Yy) { Mutable.this.Yy(Yy); }
                public void Yz(double Yz) { Mutable.this.Zy(Yz); }
                public void Zx(double Zx) { Mutable.this.Xz(Zx); }
                public void Zy(double Zy) { Mutable.this.Yz(Zy); }
                public void Zz(double Zz) { Mutable.this.Zz(Zz); }
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

        default Value.AccessibleAndMutable $Xz() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Xz(); }
                public void set(double v) { AccessibleAndMutable.this.Xz(v); }
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

        default Value.AccessibleAndMutable $Yz() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Yz(); }
                public void set(double v) { AccessibleAndMutable.this.Yz(v); }
            };
        }

        default Value.AccessibleAndMutable $Zx() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Zx(); }
                public void set(double v) { AccessibleAndMutable.this.Zx(v); }
            };
        }

        default Value.AccessibleAndMutable $Zy() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Zy(); }
                public void set(double v) { AccessibleAndMutable.this.Zy(v); }
            };
        }

        default Value.AccessibleAndMutable $Zz() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Zz(); }
                public void set(double v) { AccessibleAndMutable.this.Zz(v); }
            };
        }

        default Vector3.AccessibleAndMutable $X3() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xy(); }
                public double z() { return AccessibleAndMutable.this.Xz(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xy(y); }
                public void z(double z) { AccessibleAndMutable.this.Xz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Y3() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Yz(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Yz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Z3() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $diagonal3() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $3x3() {
            return this;
        }

        default Matrix3x3.AccessibleAndMutable $transposed3x3() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xx(); }
                public double Xy() { return AccessibleAndMutable.this.Yx(); }
                public double Xz() { return AccessibleAndMutable.this.Zx(); }
                public double Yx() { return AccessibleAndMutable.this.Xy(); }
                public double Yy() { return AccessibleAndMutable.this.Yy(); }
                public double Yz() { return AccessibleAndMutable.this.Zy(); }
                public double Zx() { return AccessibleAndMutable.this.Xz(); }
                public double Zy() { return AccessibleAndMutable.this.Yz(); }
                public double Zz() { return AccessibleAndMutable.this.Zz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yx(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Zx(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Xy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yy(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Zy(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Xz(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Yz(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Zz(Zz); }
            };
        }

    }

    @FunctionalInterface
    public interface Consumer {

        void set3x3(
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

}
