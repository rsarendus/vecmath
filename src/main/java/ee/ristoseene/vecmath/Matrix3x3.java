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

        default Vector2.Accessible const$xXY() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
            };
        }

        default Vector2.Accessible const$xXZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Zx(); }
            };
        }

        default Vector2.Accessible const$xYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Zx(); }
            };
        }

        default Vector3.Accessible const$xXYZ() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Zx(); }
            };
        }

        default Vector2.Accessible const$yXY() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
            };
        }

        default Vector2.Accessible const$yXZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$yYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector3.Accessible const$yXYZ() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$zXY() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
            };
        }

        default Vector2.Accessible const$zXZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$zYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$zXYZ() {
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

        default Matrix2x2.Accessible const$XYyz() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Xy(); }
                public double Xy() { return Accessible.this.Xz(); }
                public double Yx() { return Accessible.this.Yy(); }
                public double Yy() { return Accessible.this.Yz(); }
            };
        }

        default Matrix2x2.Accessible const$yzXY() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Xy(); }
                public double Xy() { return Accessible.this.Yy(); }
                public double Yx() { return Accessible.this.Xz(); }
                public double Yy() { return Accessible.this.Yz(); }
            };
        }

        default Matrix2x2.Accessible const$YZxy() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Yx(); }
                public double Xy() { return Accessible.this.Yy(); }
                public double Yx() { return Accessible.this.Zx(); }
                public double Yy() { return Accessible.this.Zy(); }
            };
        }

        default Matrix2x2.Accessible const$xyYZ() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Yx(); }
                public double Xy() { return Accessible.this.Zx(); }
                public double Yx() { return Accessible.this.Yy(); }
                public double Yy() { return Accessible.this.Zy(); }
            };
        }

        default Matrix2x2.Accessible const$YZyz() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Yy(); }
                public double Xy() { return Accessible.this.Yz(); }
                public double Yx() { return Accessible.this.Zy(); }
                public double Yy() { return Accessible.this.Zz(); }
            };
        }

        default Matrix2x2.Accessible const$yzYZ() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Yy(); }
                public double Xy() { return Accessible.this.Zy(); }
                public double Yx() { return Accessible.this.Yz(); }
                public double Yy() { return Accessible.this.Zz(); }
            };
        }

        default Matrix3x3.Accessible const$XYZxyz() {
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

        default Matrix3x3.Accessible const$xyzXYZ() {
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

        default Vector2.Accessible $xXY() {
            return const$xXY();
        }

        default Vector2.Accessible $xXZ() {
            return const$xXZ();
        }

        default Vector2.Accessible $xYZ() {
            return const$xYZ();
        }

        default Vector3.Accessible $xXYZ() {
            return const$xXYZ();
        }

        default Vector2.Accessible $yXY() {
            return const$yXY();
        }

        default Vector2.Accessible $yXZ() {
            return const$yXZ();
        }

        default Vector2.Accessible $yYZ() {
            return const$yYZ();
        }

        default Vector3.Accessible $yXYZ() {
            return const$yXYZ();
        }

        default Vector2.Accessible $zXY() {
            return const$zXY();
        }

        default Vector2.Accessible $zXZ() {
            return const$zXZ();
        }

        default Vector2.Accessible $zYZ() {
            return const$zYZ();
        }

        default Vector3.Accessible $zXYZ() {
            return const$zXYZ();
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

        default Matrix2x2.Accessible $XYxy() {
            return const$XYxy();
        }

        default Matrix2x2.Accessible $xyXY() {
            return const$xyXY();
        }

        default Matrix2x2.Accessible $XYyz() {
            return const$XYyz();
        }

        default Matrix2x2.Accessible $yzXY() {
            return const$yzXY();
        }

        default Matrix2x2.Accessible $YZxy() {
            return const$YZxy();
        }

        default Matrix2x2.Accessible $xyYZ() {
            return const$xyYZ();
        }

        default Matrix2x2.Accessible $YZyz() {
            return const$YZyz();
        }

        default Matrix2x2.Accessible $yzYZ() {
            return const$yzYZ();
        }

        default Matrix3x3.Accessible $XYZxyz() {
            return this;
        }

        default Matrix3x3.Accessible $xyzXYZ() {
            return const$xyzXYZ();
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

        default <R> R xXY(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default <R> R xXZ(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default <R> R xYZ(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default <R> R xXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default <R> R yXY(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default <R> R yXZ(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default <R> R yYZ(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default <R> R yXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default <R> R zXY(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default <R> R zXZ(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default <R> R zYZ(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default <R> R zXYZ(Vector3.Factory<R> factory) {
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

        default <R> R XYxy(Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy());
        }

        default <R> R xyXY(Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy());
        }

        default <R> R XYyz(Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz());
        }

        default <R> R yzXY(Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xz(), Yz());
        }

        default <R> R YZxy(Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Zx(), Zy());
        }

        default <R> R xyYZ(Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy());
        }

        default <R> R YZyz(Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Zy(), Zz());
        }

        default <R> R yzYZ(Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yz(), Zz());
        }

        default <R> R XYZxyz(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R xyzXYZ(Matrix3x3.Factory<R> factory) {
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

        default void xXYto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default void xXZto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default void xYZto(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
        }

        default void xXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
        }

        default void yXYto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default void yXZto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default void yYZto(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
        }

        default void yXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
        }

        default void zXYto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default void zXZto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default void zYZto(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
        }

        default void zXYZto(Vector3.Consumer consumer) {
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

        default void XYxyTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Yx(), Yy());
        }

        default void xyXYto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xy(), Yy());
        }

        default void XYyzTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Yy(), Yz());
        }

        default void yzXYto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xz(), Yz());
        }

        default void YZxyTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yy(), Zx(), Zy());
        }

        default void xyYZto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yy(), Zy());
        }

        default void YZyzTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Zy(), Zz());
        }

        default void yzYZto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yz(), Zz());
        }

        default void XYZxyzTo(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void xyzXYZto(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
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

        default void xXY(double v) {
            Xx(v);
            Yx(v);
        }

        default void xXZ(double v) {
            Xx(v);
            Zx(v);
        }

        default void xYZ(double v) {
            Yx(v);
            Zx(v);
        }

        default void xXYZ(double v) {
            Xx(v);
            Yx(v);
            Zx(v);
        }

        default void yXY(double v) {
            Xy(v);
            Yy(v);
        }

        default void yXZ(double v) {
            Xy(v);
            Zy(v);
        }

        default void yYZ(double v) {
            Yy(v);
            Zy(v);
        }

        default void yXYZ(double v) {
            Xy(v);
            Yy(v);
            Zy(v);
        }

        default void zXY(double v) {
            Xz(v);
            Yz(v);
        }

        default void zXZ(double v) {
            Xz(v);
            Zz(v);
        }

        default void zYZ(double v) {
            Yz(v);
            Zz(v);
        }

        default void zXYZ(double v) {
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

        default void XYxy(double v) {
            Xx(v);
            Xy(v);
            Yx(v);
            Yy(v);
        }

        default void XYyz(double v) {
            Xy(v);
            Xz(v);
            Yy(v);
            Yz(v);
        }

        default void YZxy(double v) {
            Yx(v);
            Yy(v);
            Zx(v);
            Zy(v);
        }

        default void YZyz(double v) {
            Yy(v);
            Yz(v);
            Zy(v);
            Zz(v);
        }

        default void XYZxyz(double v) {
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

        default void xXY(double Xx, double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void xXZ(double Xx, double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void xYZ(double Yx, double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void xXYZ(double Xx, double Yx, double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
        }

        default void yXY(double Xy, double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void yXZ(double Xy, double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void yYZ(double Yy, double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void yXYZ(double Xy, double Yy, double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
        }

        default void zXY(double Xz, double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void zXZ(double Xz, double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void zYZ(double Yz, double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void zXYZ(double Xz, double Yz, double Zz) {
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

        default void XYyz(
                double Xy, double Xz,
                double Yy, double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void yzXY(
                double Xy, double Yy,
                double Xz, double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void YZxy(
                double Yx, double Yy,
                double Zx, double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void xyYZ(
                double Yx, double Zx,
                double Yy, double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void YZyz(
                double Yy, double Yz,
                double Zy, double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void yzYZ(
                double Yy, double Zy,
                double Yz, double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void XYZxyz(
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

        default void xyzXYZ(
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

        default void xXY(Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void xXZ(Vector2.Accessible v) {
            xXZ(v.x(), v.y());
        }

        default void xYZ(Vector2.Accessible v) {
            xYZ(v.x(), v.y());
        }

        default void xXYZ(Vector3.Accessible v) {
            xXYZ(v.x(), v.y(), v.z());
        }

        default void yXY(Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void yXZ(Vector2.Accessible v) {
            yXZ(v.x(), v.y());
        }

        default void yYZ(Vector2.Accessible v) {
            yYZ(v.x(), v.y());
        }

        default void yXYZ(Vector3.Accessible v) {
            yXYZ(v.x(), v.y(), v.z());
        }

        default void zXY(Vector2.Accessible v) {
            zXY(v.x(), v.y());
        }

        default void zXZ(Vector2.Accessible v) {
            zXZ(v.x(), v.y());
        }

        default void zYZ(Vector2.Accessible v) {
            zYZ(v.x(), v.y());
        }

        default void zXYZ(Vector3.Accessible v) {
            zXYZ(v.x(), v.y(), v.z());
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

        default void XYxy(Matrix2x2.Accessible m) {
            XYxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXY(Matrix2x2.Accessible m) {
            xyXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyz(Matrix2x2.Accessible m) {
            XYyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXY(Matrix2x2.Accessible m) {
            yzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxy(Matrix2x2.Accessible m) {
            YZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyYZ(Matrix2x2.Accessible m) {
            xyYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyz(Matrix2x2.Accessible m) {
            YZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYZ(Matrix2x2.Accessible m) {
            yzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxyz(Matrix3x3.Accessible m) {
            XYZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzXYZ(Matrix3x3.Accessible m) {
            xyzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default Vector2.Mutable $xXY() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
            };
        }

        default Vector2.Mutable $xXZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
            };
        }

        default Vector2.Mutable $xYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
            };
        }

        default Vector3.Mutable $xXYZ() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Zx(z); }
            };
        }

        default Vector2.Mutable $yXY() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
            };
        }

        default Vector2.Mutable $yXZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector2.Mutable $yYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector3.Mutable $yXYZ() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zy(z); }
            };
        }

        default Vector2.Mutable $zXY() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
            };
        }

        default Vector2.Mutable $zXZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $zYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector3.Mutable $zXYZ() {
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

        default Matrix2x2.Mutable $XYxy() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xx(Xx); }
                public void Xy(double Xy) { Mutable.this.Xy(Xy); }
                public void Yx(double Yx) { Mutable.this.Yx(Yx); }
                public void Yy(double Yy) { Mutable.this.Yy(Yy); }
            };
        }

        default Matrix2x2.Mutable $xyXY() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xx(Xx); }
                public void Xy(double Xy) { Mutable.this.Yx(Xy); }
                public void Yx(double Yx) { Mutable.this.Xy(Yx); }
                public void Yy(double Yy) { Mutable.this.Yy(Yy); }
            };
        }

        default Matrix2x2.Mutable $XYyz() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xy(Xx); }
                public void Xy(double Xy) { Mutable.this.Xz(Xy); }
                public void Yx(double Yx) { Mutable.this.Yy(Yx); }
                public void Yy(double Yy) { Mutable.this.Yz(Yy); }
            };
        }

        default Matrix2x2.Mutable $yzXY() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xy(Xx); }
                public void Xy(double Xy) { Mutable.this.Yy(Xy); }
                public void Yx(double Yx) { Mutable.this.Xz(Yx); }
                public void Yy(double Yy) { Mutable.this.Yz(Yy); }
            };
        }

        default Matrix2x2.Mutable $YZxy() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yx(Xx); }
                public void Xy(double Xy) { Mutable.this.Yy(Xy); }
                public void Yx(double Yx) { Mutable.this.Zx(Yx); }
                public void Yy(double Yy) { Mutable.this.Zy(Yy); }
            };
        }

        default Matrix2x2.Mutable $xyYZ() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yx(Xx); }
                public void Xy(double Xy) { Mutable.this.Zx(Xy); }
                public void Yx(double Yx) { Mutable.this.Yy(Yx); }
                public void Yy(double Yy) { Mutable.this.Zy(Yy); }
            };
        }

        default Matrix2x2.Mutable $YZyz() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yy(Xx); }
                public void Xy(double Xy) { Mutable.this.Yz(Xy); }
                public void Yx(double Yx) { Mutable.this.Zy(Yx); }
                public void Yy(double Yy) { Mutable.this.Zz(Yy); }
            };
        }

        default Matrix2x2.Mutable $yzYZ() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yy(Xx); }
                public void Xy(double Xy) { Mutable.this.Zy(Xy); }
                public void Yx(double Yx) { Mutable.this.Yz(Yx); }
                public void Yy(double Yy) { Mutable.this.Zz(Yy); }
            };
        }

        default Matrix3x3.Mutable $XYZxyz() {
            return this;
        }

        default Matrix3x3.Mutable $xyzXYZ() {
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

        default Vector2.AccessibleAndMutable $xXY() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $xXZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $xYZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
            };
        }

        default Vector3.AccessibleAndMutable $xXYZ() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public double z() { return AccessibleAndMutable.this.Zx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
                public void z(double z) { AccessibleAndMutable.this.Zx(z); }
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

        default Vector2.AccessibleAndMutable $yXZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
            };
        }

        default Vector2.AccessibleAndMutable $yYZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
            };
        }

        default Vector3.AccessibleAndMutable $yXYZ() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Zy(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zy(z); }
            };
        }

        default Vector2.AccessibleAndMutable $zXY() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $zXZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $zYZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
            };
        }

        default Vector3.AccessibleAndMutable $zXYZ() {
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

        default Matrix2x2.AccessibleAndMutable $XYxy() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xx(); }
                public double Xy() { return AccessibleAndMutable.this.Xy(); }
                public double Yx() { return AccessibleAndMutable.this.Yx(); }
                public double Yy() { return AccessibleAndMutable.this.Yy(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Xy(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yx(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yy(Yy); }
            };
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

        default Matrix2x2.AccessibleAndMutable $XYyz() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xy(); }
                public double Xy() { return AccessibleAndMutable.this.Xz(); }
                public double Yx() { return AccessibleAndMutable.this.Yy(); }
                public double Yy() { return AccessibleAndMutable.this.Yz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Xz(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yz(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $yzXY() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xy(); }
                public double Xy() { return AccessibleAndMutable.this.Yy(); }
                public double Yx() { return AccessibleAndMutable.this.Xz(); }
                public double Yy() { return AccessibleAndMutable.this.Yz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yy(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Xz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yz(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $YZxy() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yx(); }
                public double Xy() { return AccessibleAndMutable.this.Yy(); }
                public double Yx() { return AccessibleAndMutable.this.Zx(); }
                public double Yy() { return AccessibleAndMutable.this.Zy(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yy(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zx(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zy(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $xyYZ() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yx(); }
                public double Xy() { return AccessibleAndMutable.this.Zx(); }
                public double Yx() { return AccessibleAndMutable.this.Yy(); }
                public double Yy() { return AccessibleAndMutable.this.Zy(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zx(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zy(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $YZyz() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yy(); }
                public double Xy() { return AccessibleAndMutable.this.Yz(); }
                public double Yx() { return AccessibleAndMutable.this.Zy(); }
                public double Yy() { return AccessibleAndMutable.this.Zz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yz(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zz(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $yzYZ() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yy(); }
                public double Xy() { return AccessibleAndMutable.this.Zy(); }
                public double Yx() { return AccessibleAndMutable.this.Yz(); }
                public double Yy() { return AccessibleAndMutable.this.Zz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zy(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zz(Yy); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $XYZxyz() {
            return this;
        }

        default Matrix3x3.AccessibleAndMutable $xyzXYZ() {
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

        void XYZxyz(
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
