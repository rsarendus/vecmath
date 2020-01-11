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

        default Vector2.Accessible const$Xxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
            };
        }

        default Vector2.Accessible const$Xxz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xz(); }
            };
        }

        default Vector2.Accessible const$Xyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Xz(); }
            };
        }

        default Vector3.Accessible const$Xxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
                public double z() { return Accessible.this.Xz(); }
            };
        }

        default Vector2.Accessible const$Yxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Vector2.Accessible const$Yxz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yz(); }
            };
        }

        default Vector2.Accessible const$Yyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Yz(); }
            };
        }

        default Vector3.Accessible const$Yxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Yz(); }
            };
        }

        default Vector2.Accessible const$Zxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$Zxz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$Zyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zy(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$Zxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$XYx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
            };
        }

        default Vector2.Accessible const$XZx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Zx(); }
            };
        }

        default Vector2.Accessible const$YZx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Zx(); }
            };
        }

        default Vector3.Accessible const$XYZx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Zx(); }
            };
        }

        default Vector2.Accessible const$XYy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Vector2.Accessible const$XZy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$YZy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector3.Accessible const$XYZy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$XYz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
            };
        }

        default Vector2.Accessible const$XZz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$YZz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$XYZz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$Dxy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Vector2.Accessible const$Dxz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$Dyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$Dxyz() {
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

        default Vector2.Accessible $Xxy() {
            return const$Xxy();
        }

        default Vector2.Accessible $Xxz() {
            return const$Xxz();
        }

        default Vector2.Accessible $Xyz() {
            return const$Xyz();
        }

        default Vector3.Accessible $Xxyz() {
            return const$Xxyz();
        }

        default Vector2.Accessible $Yxy() {
            return const$Yxy();
        }

        default Vector2.Accessible $Yxz() {
            return const$Yxz();
        }

        default Vector2.Accessible $Yyz() {
            return const$Yyz();
        }

        default Vector3.Accessible $Yxyz() {
            return const$Yxyz();
        }

        default Vector2.Accessible $Zxy() {
            return const$Zxy();
        }

        default Vector2.Accessible $Zxz() {
            return const$Zxz();
        }

        default Vector2.Accessible $Zyz() {
            return const$Zyz();
        }

        default Vector3.Accessible $Zxyz() {
            return const$Zxyz();
        }

        default Vector2.Accessible $XYx() {
            return const$XYx();
        }

        default Vector2.Accessible $XZx() {
            return const$XZx();
        }

        default Vector2.Accessible $YZx() {
            return const$YZx();
        }

        default Vector3.Accessible $XYZx() {
            return const$XYZx();
        }

        default Vector2.Accessible $XYy() {
            return const$XYy();
        }

        default Vector2.Accessible $XZy() {
            return const$XZy();
        }

        default Vector2.Accessible $YZy() {
            return const$YZy();
        }

        default Vector3.Accessible $XYZy() {
            return const$XYZy();
        }

        default Vector2.Accessible $XYz() {
            return const$XYz();
        }

        default Vector2.Accessible $XZz() {
            return const$XZz();
        }

        default Vector2.Accessible $YZz() {
            return const$YZz();
        }

        default Vector3.Accessible $XYZz() {
            return const$XYZz();
        }

        default Vector2.Accessible $Dxy() {
            return const$Dxy();
        }

        default Vector2.Accessible $Dxz() {
            return const$Dxz();
        }

        default Vector2.Accessible $Dyz() {
            return const$Dyz();
        }

        default Vector3.Accessible $Dxyz() {
            return const$Dxyz();
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

        default <R> R Xxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default <R> R Xxz(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xz());
        }

        default <R> R Xyz(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xz());
        }

        default <R> R Xxyz(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz());
        }

        default <R> R Yxy(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default <R> R Yxz(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yz());
        }

        default <R> R Yyz(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yz());
        }

        default <R> R Yxyz(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz());
        }

        default <R> R Zxy(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zy());
        }

        default <R> R Zxz(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zz());
        }

        default <R> R Zyz(Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zz());
        }

        default <R> R Zxyz(Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz());
        }

        default <R> R XYx(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default <R> R XZx(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default <R> R YZx(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default <R> R XYZx(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default <R> R XYy(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default <R> R XZy(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default <R> R YZy(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default <R> R XYZy(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default <R> R XYz(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default <R> R XZz(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default <R> R YZz(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default <R> R XYZz(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz());
        }

        default <R> R Dxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default <R> R Dxz(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zz());
        }

        default <R> R Dyz(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zz());
        }

        default <R> R Dxyz(Vector3.Factory<R> factory) {
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

        default void XxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default void XxzTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xz());
        }

        default void XyzTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xz());
        }

        default void XxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xz());
        }

        default void YxyTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default void YxzTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yz());
        }

        default void YyzTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yz());
        }

        default void YxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yz());
        }

        default void ZxyTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zy());
        }

        default void ZxzTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zz());
        }

        default void ZyzTo(Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zz());
        }

        default void ZxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zz());
        }

        default void XYxTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default void XZxTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default void YZxTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
        }

        default void XYZxTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
        }

        default void XYyTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default void XZyTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default void YZyTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
        }

        default void XYZyTo(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
        }

        default void XYzTo(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default void XZzTo(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default void YZzTo(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
        }

        default void XYZzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Zz());
        }

        default void DxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
        }

        default void DxzTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zz());
        }

        default void DyzTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zz());
        }

        default void DxyzTo(Vector3.Consumer consumer) {
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

        default void Xxy(double v) {
            Xx(v);
            Xy(v);
        }

        default void Xxz(double v) {
            Xx(v);
            Xz(v);
        }

        default void Xyz(double v) {
            Xy(v);
            Xz(v);
        }

        default void Xxyz(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
        }

        default void Yxy(double v) {
            Yx(v);
            Yy(v);
        }

        default void Yxz(double v) {
            Yx(v);
            Yz(v);
        }

        default void Yyz(double v) {
            Yy(v);
            Yz(v);
        }

        default void Yxyz(double v) {
            Yx(v);
            Yy(v);
            Yz(v);
        }

        default void Zxy(double v) {
            Zx(v);
            Zy(v);
        }

        default void Zxz(double v) {
            Zx(v);
            Zz(v);
        }

        default void Zyz(double v) {
            Zy(v);
            Zz(v);
        }

        default void Zxyz(double v) {
            Zx(v);
            Zy(v);
            Zz(v);
        }

        default void XYx(double v) {
            Xx(v);
            Yx(v);
        }

        default void XZx(double v) {
            Xx(v);
            Zx(v);
        }

        default void YZx(double v) {
            Yx(v);
            Zx(v);
        }

        default void XYZx(double v) {
            Xx(v);
            Yx(v);
            Zx(v);
        }

        default void XYy(double v) {
            Xy(v);
            Yy(v);
        }

        default void XZy(double v) {
            Xy(v);
            Zy(v);
        }

        default void YZy(double v) {
            Yy(v);
            Zy(v);
        }

        default void XYZy(double v) {
            Xy(v);
            Yy(v);
            Zy(v);
        }

        default void XYz(double v) {
            Xz(v);
            Yz(v);
        }

        default void XZz(double v) {
            Xz(v);
            Zz(v);
        }

        default void YZz(double v) {
            Yz(v);
            Zz(v);
        }

        default void XYZz(double v) {
            Xz(v);
            Yz(v);
            Zz(v);
        }

        default void Dxy(double v) {
            Xx(v);
            Yy(v);
        }

        default void Dxz(double v) {
            Xx(v);
            Zz(v);
        }

        default void Dyz(double v) {
            Yy(v);
            Zz(v);
        }

        default void Dxyz(double v) {
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

        default void Xxy(double Xx, double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Xxz(double Xx, double Xz) {
            Xx(Xx);
            Xz(Xz);
        }

        default void Xyz(double Xy, double Xz) {
            Xy(Xy);
            Xz(Xz);
        }

        default void Xxyz(double Xx, double Xy, double Xz) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
        }

        default void Yxy(double Yx, double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void Yxz(double Yx, double Yz) {
            Yx(Yx);
            Yz(Yz);
        }

        default void Yyz(double Yy, double Yz) {
            Yy(Yy);
            Yz(Yz);
        }

        default void Yxyz(double Yx, double Yy, double Yz) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
        }

        default void Zxy(double Zx, double Zy) {
            Zx(Zx);
            Zy(Zy);
        }

        default void Zxz(double Zx, double Zz) {
            Zx(Zx);
            Zz(Zz);
        }

        default void Zyz(double Zy, double Zz) {
            Zy(Zy);
            Zz(Zz);
        }

        default void Zxyz(double Zx, double Zy, double Zz) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void XYx(double Xx, double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void XZx(double Xx, double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void YZx(double Yx, double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void XYZx(double Xx, double Yx, double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
        }

        default void XYy(double Xy, double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void XZy(double Xy, double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void YZy(double Yy, double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void XYZy(double Xy, double Yy, double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
        }

        default void XYz(double Xz, double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void XZz(double Xz, double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void YZz(double Yz, double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void XYZz(double Xz, double Yz, double Zz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
        }

        default void Dxy(double Xx, double Yy) {
            Xx(Xx);
            Yy(Yy);
        }

        default void Dxz(double Xx, double Zz) {
            Xx(Xx);
            Zz(Zz);
        }

        default void Dyz(double Yy, double Zz) {
            Yy(Yy);
            Zz(Zz);
        }

        default void Dxyz(double Xx, double Yy, double Zz) {
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

        default void Xxy(Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Xxz(Vector2.Accessible v) {
            Xxz(v.x(), v.y());
        }

        default void Xyz(Vector2.Accessible v) {
            Xyz(v.x(), v.y());
        }

        default void Xxyz(Vector3.Accessible v) {
            Xxyz(v.x(), v.y(), v.z());
        }

        default void Yxy(Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void Yxz(Vector2.Accessible v) {
            Yxz(v.x(), v.y());
        }

        default void Yyz(Vector2.Accessible v) {
            Yyz(v.x(), v.y());
        }

        default void Yxyz(Vector3.Accessible v) {
            Yxyz(v.x(), v.y(), v.z());
        }

        default void Zxy(Vector2.Accessible v) {
            Zxy(v.x(), v.y());
        }

        default void Zxz(Vector2.Accessible v) {
            Zxz(v.x(), v.y());
        }

        default void Zyz(Vector2.Accessible v) {
            Zyz(v.x(), v.y());
        }

        default void Zxyz(Vector3.Accessible v) {
            Zxyz(v.x(), v.y(), v.z());
        }

        default void XYx(Vector2.Accessible v) {
            XYx(v.x(), v.y());
        }

        default void XZx(Vector2.Accessible v) {
            XZx(v.x(), v.y());
        }

        default void YZx(Vector2.Accessible v) {
            YZx(v.x(), v.y());
        }

        default void XYZx(Vector3.Accessible v) {
            XYZx(v.x(), v.y(), v.z());
        }

        default void XYy(Vector2.Accessible v) {
            XYy(v.x(), v.y());
        }

        default void XZy(Vector2.Accessible v) {
            XZy(v.x(), v.y());
        }

        default void YZy(Vector2.Accessible v) {
            YZy(v.x(), v.y());
        }

        default void XYZy(Vector3.Accessible v) {
            XYZy(v.x(), v.y(), v.z());
        }

        default void XYz(Vector2.Accessible v) {
            XYz(v.x(), v.y());
        }

        default void XZz(Vector2.Accessible v) {
            XZz(v.x(), v.y());
        }

        default void YZz(Vector2.Accessible v) {
            YZz(v.x(), v.y());
        }

        default void XYZz(Vector3.Accessible v) {
            XYZz(v.x(), v.y(), v.z());
        }

        default void Dxy(Vector2.Accessible v) {
            Dxy(v.x(), v.y());
        }

        default void Dxz(Vector2.Accessible v) {
            Dxz(v.x(), v.y());
        }

        default void Dyz(Vector2.Accessible v) {
            Dyz(v.x(), v.y());
        }

        default void Dxyz(Vector3.Accessible v) {
            Dxyz(v.x(), v.y(), v.z());
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

        default Vector2.Mutable $Xxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
            };
        }

        default Vector2.Mutable $Xxz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xz(y); }
            };
        }

        default Vector2.Mutable $Xyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Xz(y); }
            };
        }

        default Vector3.Mutable $Xxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
                public void z(double z) { Mutable.this.Xz(z); }
            };
        }

        default Vector2.Mutable $Yxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Vector2.Mutable $Yxz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yz(y); }
            };
        }

        default Vector2.Mutable $Yyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Yz(y); }
            };
        }

        default Vector3.Mutable $Yxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Yz(z); }
            };
        }

        default Vector2.Mutable $Zxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector2.Mutable $Zxz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $Zyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zy(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector3.Mutable $Zxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector2.Mutable $XYx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
            };
        }

        default Vector2.Mutable $XZx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
            };
        }

        default Vector2.Mutable $YZx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
            };
        }

        default Vector3.Mutable $XYZx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Zx(z); }
            };
        }

        default Vector2.Mutable $XYy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Vector2.Mutable $XZy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector2.Mutable $YZy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector3.Mutable $XYZy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zy(z); }
            };
        }

        default Vector2.Mutable $XYz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
            };
        }

        default Vector2.Mutable $XZz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $YZz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector3.Mutable $XYZz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector2.Mutable $Dxy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Vector2.Mutable $Dxz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $Dyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector3.Mutable $Dxyz() {
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

        default Vector2.AccessibleAndMutable $Xxy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xy(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Xxz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xz(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Xyz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Xz(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Xz(y); }
            };
        }

        default Vector3.AccessibleAndMutable $Xxyz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xy(); }
                public double z() { return AccessibleAndMutable.this.Xz(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xy(y); }
                public void z(double z) { AccessibleAndMutable.this.Xz(z); }
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

        default Vector2.AccessibleAndMutable $Yxz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Yyz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
            };
        }

        default Vector3.AccessibleAndMutable $Yxyz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Yz(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Yz(z); }
            };
        }

        default Vector2.AccessibleAndMutable $Zxy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Zxz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Zyz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zy(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Zy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector3.AccessibleAndMutable $Zxyz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
            };
        }

        default Vector2.AccessibleAndMutable $XYx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $XZx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $YZx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
            };
        }

        default Vector3.AccessibleAndMutable $XYZx() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public double z() { return AccessibleAndMutable.this.Zx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
                public void z(double z) { AccessibleAndMutable.this.Zx(z); }
            };
        }

        default Vector2.AccessibleAndMutable $XYy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $XZy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $YZy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
            };
        }

        default Vector3.AccessibleAndMutable $XYZy() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zy(z); }
            };
        }

        default Vector2.AccessibleAndMutable $XYz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $XZz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $YZz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector3.AccessibleAndMutable $XYZz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
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

        default Vector2.AccessibleAndMutable $Dxz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Dyz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector3.AccessibleAndMutable $Dxyz() {
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
