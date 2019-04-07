package ee.ristoseene.vecmath;

public final class Matrix4x4 {

    private Matrix4x4() {}

    public interface Accessible {

        double Xx();
        double Xy();
        double Xz();
        double Xw();
        double Yx();
        double Yy();
        double Yz();
        double Yw();
        double Zx();
        double Zy();
        double Zz();
        double Zw();
        double Tx();
        double Ty();
        double Tz();
        double Tw();

        default Value.Accessible const$Xx() {
            return this::Xx;
        }

        default Value.Accessible const$Xy() {
            return this::Xy;
        }

        default Value.Accessible const$Xz() {
            return this::Xz;
        }

        default Value.Accessible const$Xw() {
            return this::Xw;
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

        default Value.Accessible const$Yw() {
            return this::Yw;
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

        default Value.Accessible const$Zw() {
            return this::Zw;
        }

        default Value.Accessible const$Tx() {
            return this::Tx;
        }

        default Value.Accessible const$Ty() {
            return this::Ty;
        }

        default Value.Accessible const$Tz() {
            return this::Tz;
        }

        default Value.Accessible const$Tw() {
            return this::Tw;
        }

        default Vector4.Accessible const$X4() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
                public double z() { return Accessible.this.Xz(); }
                public double w() { return Accessible.this.Xw(); }
            };
        }

        default Vector4.Accessible const$Y4() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Yz(); }
                public double w() { return Accessible.this.Yw(); }
            };
        }

        default Vector4.Accessible const$Z4() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Zz(); }
                public double w() { return Accessible.this.Zw(); }
            };
        }

        default Vector4.Accessible const$T4() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Ty(); }
                public double z() { return Accessible.this.Tz(); }
                public double w() { return Accessible.this.Tw(); }
            };
        }

        default Vector4.Accessible const$diagonal4() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zz(); }
                public double w() { return Accessible.this.Tw(); }
            };
        }

        default Matrix3x3.Accessible const$rotation3x3() {
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

        default Matrix4x4.Accessible const$4x4() {
            return new Matrix4x4.Accessible() {
                public double Xx() { return Accessible.this.Xx(); }
                public double Xy() { return Accessible.this.Xy(); }
                public double Xz() { return Accessible.this.Xz(); }
                public double Xw() { return Accessible.this.Xw(); }
                public double Yx() { return Accessible.this.Yx(); }
                public double Yy() { return Accessible.this.Yy(); }
                public double Yz() { return Accessible.this.Yz(); }
                public double Yw() { return Accessible.this.Yw(); }
                public double Zx() { return Accessible.this.Zx(); }
                public double Zy() { return Accessible.this.Zy(); }
                public double Zz() { return Accessible.this.Zz(); }
                public double Zw() { return Accessible.this.Zw(); }
                public double Tx() { return Accessible.this.Tx(); }
                public double Ty() { return Accessible.this.Ty(); }
                public double Tz() { return Accessible.this.Tz(); }
                public double Tw() { return Accessible.this.Tw(); }
            };
        }

        default Matrix4x4.Accessible const$transposed4x4() {
            return new Matrix4x4.Accessible() {
                public double Xx() { return Accessible.this.Xx(); }
                public double Xy() { return Accessible.this.Yx(); }
                public double Xz() { return Accessible.this.Zx(); }
                public double Xw() { return Accessible.this.Tx(); }
                public double Yx() { return Accessible.this.Xy(); }
                public double Yy() { return Accessible.this.Yy(); }
                public double Yz() { return Accessible.this.Zy(); }
                public double Yw() { return Accessible.this.Ty(); }
                public double Zx() { return Accessible.this.Xz(); }
                public double Zy() { return Accessible.this.Yz(); }
                public double Zz() { return Accessible.this.Zz(); }
                public double Zw() { return Accessible.this.Tz(); }
                public double Tx() { return Accessible.this.Xw(); }
                public double Ty() { return Accessible.this.Yw(); }
                public double Tz() { return Accessible.this.Zw(); }
                public double Tw() { return Accessible.this.Tw(); }
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

        default Value.Accessible $Xw() {
            return const$Xw();
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

        default Value.Accessible $Yw() {
            return const$Yw();
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

        default Value.Accessible $Zw() {
            return const$Zw();
        }

        default Value.Accessible $Tx() {
            return const$Tx();
        }

        default Value.Accessible $Ty() {
            return const$Ty();
        }

        default Value.Accessible $Tz() {
            return const$Tz();
        }

        default Value.Accessible $Tw() {
            return const$Tw();
        }

        default Vector4.Accessible $X4() {
            return const$X4();
        }

        default Vector4.Accessible $Y4() {
            return const$Y4();
        }

        default Vector4.Accessible $Z4() {
            return const$Z4();
        }

        default Vector4.Accessible $T4() {
            return const$T4();
        }

        default Vector4.Accessible $diagonal4() {
            return const$diagonal4();
        }

        default Matrix3x3.Accessible $rotation3x3() {
            return const$rotation3x3();
        }

        default Matrix4x4.Accessible $4x4() {
            return this;
        }

        default Matrix4x4.Accessible $transposed4x4() {
            return const$transposed4x4();
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

        default <R> R Xw(Value.Factory<R> factory) {
            return factory.create(Xw());
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

        default <R> R Yw(Value.Factory<R> factory) {
            return factory.create(Yw());
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

        default <R> R Zw(Value.Factory<R> factory) {
            return factory.create(Zw());
        }

        default <R> R Tx(Value.Factory<R> factory) {
            return factory.create(Tx());
        }

        default <R> R Ty(Value.Factory<R> factory) {
            return factory.create(Ty());
        }

        default <R> R Tz(Value.Factory<R> factory) {
            return factory.create(Tz());
        }

        default <R> R Tw(Value.Factory<R> factory) {
            return factory.create(Tw());
        }

        default <R> R X4(Vector4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw());
        }

        default <R> R Y4(Vector4.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Yw());
        }

        default <R> R Z4(Vector4.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz(), Zw());
        }

        default <R> R T4(Vector4.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tz(), Tw());
        }

        default <R> R diagonal4(Vector4.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz(), Tw());
        }

        default <R> R rotation3x3(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R get4x4(Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R transposed4x4(Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
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

        default void XwTo(Value.Consumer consumer) {
            consumer.set(Xw());
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

        default void YwTo(Value.Consumer consumer) {
            consumer.set(Yw());
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

        default void ZwTo(Value.Consumer consumer) {
            consumer.set(Zw());
        }

        default void TxTo(Value.Consumer consumer) {
            consumer.set(Tx());
        }

        default void TyTo(Value.Consumer consumer) {
            consumer.set(Ty());
        }

        default void TzTo(Value.Consumer consumer) {
            consumer.set(Tz());
        }

        default void TwTo(Value.Consumer consumer) {
            consumer.set(Tw());
        }

        default void X4To(Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Xy(), Xz(), Xw());
        }

        default void Y4To(Vector4.Consumer consumer) {
            consumer.xyzw(Yx(), Yy(), Yz(), Yw());
        }

        default void Z4To(Vector4.Consumer consumer) {
            consumer.xyzw(Zx(), Zy(), Zz(), Zw());
        }

        default void T4To(Vector4.Consumer consumer) {
            consumer.xyzw(Tx(), Ty(), Tz(), Tw());
        }

        default void diagonal4To(Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Yy(), Zz(), Tw());
        }

        default void rotation3x3To(Matrix3x3.Consumer consumer) {
            consumer.set3x3(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void put4x4To(Matrix4x4.Consumer consumer) {
            consumer.set4x4(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void transposed4x4To(Matrix4x4.Consumer consumer) {
            consumer.set4x4(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

    }

    public interface Mutable extends Consumer {

        void Xx(double Xx);
        void Xy(double Xy);
        void Xz(double Xz);
        void Xw(double Xw);
        void Yx(double Yx);
        void Yy(double Yy);
        void Yz(double Yz);
        void Yw(double Yw);
        void Zx(double Zx);
        void Zy(double Zy);
        void Zz(double Zz);
        void Zw(double Zw);
        void Tx(double Tx);
        void Ty(double Ty);
        void Tz(double Tz);
        void Tw(double Tw);

        default void X4(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
            Xw(v);
        }

        default void Y4(double v) {
            Yx(v);
            Yy(v);
            Yz(v);
            Yw(v);
        }

        default void Z4(double v) {
            Zx(v);
            Zy(v);
            Zz(v);
            Zw(v);
        }

        default void T4(double v) {
            Tx(v);
            Ty(v);
            Tz(v);
            Tw(v);
        }

        default void diagonal4(double v) {
            Xx(v);
            Yy(v);
            Zz(v);
            Tw(v);
        }

        default void rotation3x3(double v) {
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

        default void set4x4(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
            Xw(v);
            Yx(v);
            Yy(v);
            Yz(v);
            Yw(v);
            Zx(v);
            Zy(v);
            Zz(v);
            Zw(v);
            Tx(v);
            Ty(v);
            Tz(v);
            Tw(v);
        }

        default void X4(double Xx, double Xy, double Xz, double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Y4(double Yx, double Yy, double Yz, double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Z4(double Zx, double Zy, double Zz, double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void T4(double Tx, double Ty, double Tz, double Tw) {
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void diagonal4(double Xx, double Yy, double Zz, double Tw) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
            Tw(Tw);
        }

        default void rotation3x3(
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

        default void set4x4(
                double Xx, double Xy, double Xz, double Xw,
                double Yx, double Yy, double Yz, double Yw,
                double Zx, double Zy, double Zz, double Zw,
                double Tx, double Ty, double Tz, double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void transposed4x4(
                double Xx, double Yx, double Zx, double Tx,
                double Xy, double Yy, double Zy, double Ty,
                double Xz, double Yz, double Zz, double Tz,
                double Xw, double Yw, double Zw, double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
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

        default void Xw(Value.Accessible Xw) {
            Xw(Xw.get());
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

        default void Yw(Value.Accessible Yw) {
            Yw(Yw.get());
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

        default void Zw(Value.Accessible Zw) {
            Zw(Zw.get());
        }

        default void Tx(Value.Accessible Tx) {
            Tx(Tx.get());
        }

        default void Ty(Value.Accessible Ty) {
            Ty(Ty.get());
        }

        default void Tz(Value.Accessible Tz) {
            Tz(Tz.get());
        }

        default void Tw(Value.Accessible Tw) {
            Tw(Tw.get());
        }

        default void X4(Vector4.Accessible v) {
            X4(v.x(), v.y(), v.z(), v.w());
        }

        default void Y4(Vector4.Accessible v) {
            Y4(v.x(), v.y(), v.z(), v.w());
        }

        default void Z4(Vector4.Accessible v) {
            Z4(v.x(), v.y(), v.z(), v.w());
        }

        default void T4(Vector4.Accessible v) {
            T4(v.x(), v.y(), v.z(), v.w());
        }

        default void diagonal4(Vector4.Accessible v) {
            diagonal4(v.x(), v.y(), v.z(), v.w());
        }

        default void rotation3x3(Matrix3x3.Accessible m) {
            rotation3x3(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void set4x4(Matrix4x4.Accessible m) {
            set4x4(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

        default void transposed4x4(Matrix4x4.Accessible m) {
            transposed4x4(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
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

        default Value.Mutable $Xw() {
            return this::Xw;
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

        default Value.Mutable $Yw() {
            return this::Yw;
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

        default Value.Mutable $Zw() {
            return this::Zw;
        }

        default Value.Mutable $Tx() {
            return this::Tx;
        }

        default Value.Mutable $Ty() {
            return this::Ty;
        }

        default Value.Mutable $Tz() {
            return this::Tz;
        }

        default Value.Mutable $Tw() {
            return this::Tw;
        }

        default Vector4.Mutable $X4() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
                public void z(double z) { Mutable.this.Xz(z); }
                public void w(double w) { Mutable.this.Xw(w); }
            };
        }

        default Vector4.Mutable $Y4() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Yz(z); }
                public void w(double w) { Mutable.this.Yw(w); }
            };
        }

        default Vector4.Mutable $Z4() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
                public void w(double w) { Mutable.this.Zw(w); }
            };
        }

        default Vector4.Mutable $T4() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Ty(y); }
                public void z(double z) { Mutable.this.Tz(z); }
                public void w(double w) { Mutable.this.Tw(w); }
            };
        }

        default Vector4.Mutable $diagonal4() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
                public void w(double w) { Mutable.this.Tw(w); }
            };
        }

        default Matrix3x3.Mutable $rotation3x3() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xx(Xx); }
                public void Xy(double Xy) { Mutable.this.Xy(Xy); }
                public void Xz(double Xz) { Mutable.this.Xz(Xz); }
                public void Yx(double Yx) { Mutable.this.Yx(Yx); }
                public void Yy(double Yy) { Mutable.this.Yy(Yy); }
                public void Yz(double Yz) { Mutable.this.Yz(Yz); }
                public void Zx(double Zx) { Mutable.this.Zx(Zx); }
                public void Zy(double Zy) { Mutable.this.Zy(Zy); }
                public void Zz(double Zz) { Mutable.this.Zz(Zz); }
            };
        }

        default Matrix4x4.Mutable $4x4() {
            return this;
        }

        default Matrix4x4.Mutable $transposed4x4() {
            return new Matrix4x4.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xx(Xx); }
                public void Xy(double Xy) { Mutable.this.Yx(Xy); }
                public void Xz(double Xz) { Mutable.this.Zx(Xz); }
                public void Xw(double Xw) { Mutable.this.Tx(Xw); }
                public void Yx(double Yx) { Mutable.this.Xy(Yx); }
                public void Yy(double Yy) { Mutable.this.Yy(Yy); }
                public void Yz(double Yz) { Mutable.this.Zy(Yz); }
                public void Yw(double Yw) { Mutable.this.Ty(Yw); }
                public void Zx(double Zx) { Mutable.this.Xz(Zx); }
                public void Zy(double Zy) { Mutable.this.Yz(Zy); }
                public void Zz(double Zz) { Mutable.this.Zz(Zz); }
                public void Zw(double Zw) { Mutable.this.Tz(Zw); }
                public void Tx(double Tx) { Mutable.this.Xw(Tx); }
                public void Ty(double Ty) { Mutable.this.Yw(Ty); }
                public void Tz(double Tz) { Mutable.this.Zw(Tz); }
                public void Tw(double Tw) { Mutable.this.Tw(Tw); }
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

        default Value.AccessibleAndMutable $Xw() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Xw(); }
                public void set(double v) { AccessibleAndMutable.this.Xw(v); }
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

        default Value.AccessibleAndMutable $Yw() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Yw(); }
                public void set(double v) { AccessibleAndMutable.this.Yw(v); }
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

        default Value.AccessibleAndMutable $Zw() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Zw(); }
                public void set(double v) { AccessibleAndMutable.this.Zw(v); }
            };
        }

        default Value.AccessibleAndMutable $Tx() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Tx(); }
                public void set(double v) { AccessibleAndMutable.this.Tx(v); }
            };
        }

        default Value.AccessibleAndMutable $Ty() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Ty(); }
                public void set(double v) { AccessibleAndMutable.this.Ty(v); }
            };
        }

        default Value.AccessibleAndMutable $Tz() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Tz(); }
                public void set(double v) { AccessibleAndMutable.this.Tz(v); }
            };
        }

        default Value.AccessibleAndMutable $Tw() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.Tw(); }
                public void set(double v) { AccessibleAndMutable.this.Tw(v); }
            };
        }

        default Vector4.AccessibleAndMutable $X4() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xy(); }
                public double z() { return AccessibleAndMutable.this.Xz(); }
                public double w() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xy(y); }
                public void z(double z) { AccessibleAndMutable.this.Xz(z); }
                public void w(double w) { AccessibleAndMutable.this.Xw(w); }
            };
        }

        default Vector4.AccessibleAndMutable $Y4() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Yz(); }
                public double w() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Yz(z); }
                public void w(double w) { AccessibleAndMutable.this.Yw(w); }
            };
        }

        default Vector4.AccessibleAndMutable $Z4() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public double w() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
                public void w(double w) { AccessibleAndMutable.this.Zw(w); }
            };
        }

        default Vector4.AccessibleAndMutable $T4() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public double w() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
                public void w(double w) { AccessibleAndMutable.this.Tw(w); }
            };
        }

        default Vector4.AccessibleAndMutable $diagonal4() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public double w() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
                public void w(double w) { AccessibleAndMutable.this.Tw(w); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $rotation3x3() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xx(); }
                public double Xy() { return AccessibleAndMutable.this.Xy(); }
                public double Xz() { return AccessibleAndMutable.this.Xz(); }
                public double Yx() { return AccessibleAndMutable.this.Yx(); }
                public double Yy() { return AccessibleAndMutable.this.Yy(); }
                public double Yz() { return AccessibleAndMutable.this.Yz(); }
                public double Zx() { return AccessibleAndMutable.this.Zx(); }
                public double Zy() { return AccessibleAndMutable.this.Zy(); }
                public double Zz() { return AccessibleAndMutable.this.Zz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Xy(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Xz(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yx(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yy(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Yz(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Zx(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Zy(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Zz(Zz); }
            };
        }

        default Matrix4x4.AccessibleAndMutable $4x4() {
            return this;
        }

        default Matrix4x4.AccessibleAndMutable $transposed4x4() {
            return new Matrix4x4.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xx(); }
                public double Xy() { return AccessibleAndMutable.this.Yx(); }
                public double Xz() { return AccessibleAndMutable.this.Zx(); }
                public double Xw() { return AccessibleAndMutable.this.Tx(); }
                public double Yx() { return AccessibleAndMutable.this.Xy(); }
                public double Yy() { return AccessibleAndMutable.this.Yy(); }
                public double Yz() { return AccessibleAndMutable.this.Zy(); }
                public double Yw() { return AccessibleAndMutable.this.Ty(); }
                public double Zx() { return AccessibleAndMutable.this.Xz(); }
                public double Zy() { return AccessibleAndMutable.this.Yz(); }
                public double Zz() { return AccessibleAndMutable.this.Zz(); }
                public double Zw() { return AccessibleAndMutable.this.Tz(); }
                public double Tx() { return AccessibleAndMutable.this.Xw(); }
                public double Ty() { return AccessibleAndMutable.this.Yw(); }
                public double Tz() { return AccessibleAndMutable.this.Zw(); }
                public double Tw() { return AccessibleAndMutable.this.Tw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yx(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Zx(Xz); }
                public void Xw(double Xw) { AccessibleAndMutable.this.Tx(Xw); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Xy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yy(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Zy(Yz); }
                public void Yw(double Yw) { AccessibleAndMutable.this.Ty(Yw); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Xz(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Yz(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Zz(Zz); }
                public void Zw(double Zw) { AccessibleAndMutable.this.Tz(Zw); }
                public void Tx(double Tx) { AccessibleAndMutable.this.Xw(Tx); }
                public void Ty(double Ty) { AccessibleAndMutable.this.Yw(Ty); }
                public void Tz(double Tz) { AccessibleAndMutable.this.Zw(Tz); }
                public void Tw(double Tw) { AccessibleAndMutable.this.Tw(Tw); }
            };
        }

    }

    @FunctionalInterface
    public interface Consumer {

        void set4x4(
                double Xx, double Xy, double Xz, double Xw,
                double Yx, double Yy, double Yz, double Yw,
                double Zx, double Zy, double Zz, double Zw,
                double Tx, double Ty, double Tz, double Tw
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy, double Xz, double Xw,
                double Yx, double Yy, double Yz, double Yw,
                double Zx, double Zy, double Zz, double Zw,
                double Tx, double Ty, double Tz, double Tw
        );

    }

}
