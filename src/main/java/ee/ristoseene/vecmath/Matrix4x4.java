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

        default Vector2.Accessible const$Xxw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xw(); }
            };
        }

        default Vector2.Accessible const$Xyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Xz(); }
            };
        }

        default Vector2.Accessible const$Xyw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Xw(); }
            };
        }

        default Vector2.Accessible const$Xzw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Xw(); }
            };
        }

        default Vector3.Accessible const$Xxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
                public double z() { return Accessible.this.Xz(); }
            };
        }

        default Vector3.Accessible const$Xxyw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
                public double z() { return Accessible.this.Xw(); }
            };
        }

        default Vector3.Accessible const$Xxzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xz(); }
                public double z() { return Accessible.this.Xw(); }
            };
        }

        default Vector3.Accessible const$Xyzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Xz(); }
                public double z() { return Accessible.this.Xw(); }
            };
        }

        default Vector4.Accessible const$Xxyzw() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Xy(); }
                public double z() { return Accessible.this.Xz(); }
                public double w() { return Accessible.this.Xw(); }
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

        default Vector2.Accessible const$Yxw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yw(); }
            };
        }

        default Vector2.Accessible const$Yyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Yz(); }
            };
        }

        default Vector2.Accessible const$Yyw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Yw(); }
            };
        }

        default Vector2.Accessible const$Yzw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Yw(); }
            };
        }

        default Vector3.Accessible const$Yxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Yz(); }
            };
        }

        default Vector3.Accessible const$Yxyw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Yw(); }
            };
        }

        default Vector3.Accessible const$Yxzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Yw(); }
            };
        }

        default Vector3.Accessible const$Yyzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Yw(); }
            };
        }

        default Vector4.Accessible const$Yxyzw() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Yz(); }
                public double w() { return Accessible.this.Yw(); }
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

        default Vector2.Accessible const$Zxw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$Zyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zy(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$Zyw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zy(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$Zzw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zz(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector3.Accessible const$Zxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$Zxyw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Zw(); }
            };
        }

        default Vector3.Accessible const$Zxzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Zw(); }
            };
        }

        default Vector3.Accessible const$Zyzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Zy(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Zw(); }
            };
        }

        default Vector4.Accessible const$Zxyzw() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Zz(); }
                public double w() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$Txy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector2.Accessible const$Txz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$Txw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$Tyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Ty(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$Tyw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Ty(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$Tzw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Tz(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$Txyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Ty(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$Txyw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Ty(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$Txzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Tz(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$Tyzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Ty(); }
                public double y() { return Accessible.this.Tz(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector4.Accessible const$Txyzw() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Tx(); }
                public double y() { return Accessible.this.Ty(); }
                public double z() { return Accessible.this.Tz(); }
                public double w() { return Accessible.this.Tw(); }
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

        default Vector2.Accessible const$xXT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Tx(); }
            };
        }

        default Vector2.Accessible const$xYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Zx(); }
            };
        }

        default Vector2.Accessible const$xYT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Tx(); }
            };
        }

        default Vector2.Accessible const$xZT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Tx(); }
            };
        }

        default Vector3.Accessible const$xXYZ() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Zx(); }
            };
        }

        default Vector3.Accessible const$xXYT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Tx(); }
            };
        }

        default Vector3.Accessible const$xXZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Zx(); }
                public double z() { return Accessible.this.Tx(); }
            };
        }

        default Vector3.Accessible const$xYZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Zx(); }
                public double z() { return Accessible.this.Tx(); }
            };
        }

        default Vector4.Accessible const$xXYZT() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Zx(); }
                public double w() { return Accessible.this.Tx(); }
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

        default Vector2.Accessible const$yXT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector2.Accessible const$yYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$yYT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector2.Accessible const$yZT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zy(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector3.Accessible const$yXYZ() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zy(); }
            };
        }

        default Vector3.Accessible const$yXYT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Ty(); }
            };
        }

        default Vector3.Accessible const$yXZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Ty(); }
            };
        }

        default Vector3.Accessible const$yYZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Ty(); }
            };
        }

        default Vector4.Accessible const$yXYZT() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zy(); }
                public double w() { return Accessible.this.Ty(); }
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

        default Vector2.Accessible const$zXT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$zYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$zYT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$zZT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zz(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$zXYZ() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$zXYT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$zXZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$zYZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector4.Accessible const$zXYZT() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Zz(); }
                public double w() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$wXY() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
            };
        }

        default Vector2.Accessible const$wXZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$wXT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$wYZ() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yw(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$wYT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yw(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$wZT() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zw(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$wXYZ() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
                public double z() { return Accessible.this.Zw(); }
            };
        }

        default Vector3.Accessible const$wXYT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$wXZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Zw(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$wYZT() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yw(); }
                public double y() { return Accessible.this.Zw(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector4.Accessible const$wXYZT() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
                public double z() { return Accessible.this.Zw(); }
                public double w() { return Accessible.this.Tw(); }
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

        default Vector2.Accessible const$Dxw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$Dyz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$Dyw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$Dzw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zz(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$Dxyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$Dxyw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$Dxzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$Dyzw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector4.Accessible const$Dxyzw() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zz(); }
                public double w() { return Accessible.this.Tw(); }
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

        default Matrix2x2.Accessible const$XYzw() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Xz(); }
                public double Xy() { return Accessible.this.Xw(); }
                public double Yx() { return Accessible.this.Yz(); }
                public double Yy() { return Accessible.this.Yw(); }
            };
        }

        default Matrix2x2.Accessible const$zwXY() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Xz(); }
                public double Xy() { return Accessible.this.Yz(); }
                public double Yx() { return Accessible.this.Xw(); }
                public double Yy() { return Accessible.this.Yw(); }
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

        default Matrix2x2.Accessible const$YZzw() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Yz(); }
                public double Xy() { return Accessible.this.Yw(); }
                public double Yx() { return Accessible.this.Zz(); }
                public double Yy() { return Accessible.this.Zw(); }
            };
        }

        default Matrix2x2.Accessible const$zwYZ() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Yz(); }
                public double Xy() { return Accessible.this.Zz(); }
                public double Yx() { return Accessible.this.Yw(); }
                public double Yy() { return Accessible.this.Zw(); }
            };
        }

        default Matrix2x2.Accessible const$ZTxy() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Zx(); }
                public double Xy() { return Accessible.this.Zy(); }
                public double Yx() { return Accessible.this.Tx(); }
                public double Yy() { return Accessible.this.Ty(); }
            };
        }

        default Matrix2x2.Accessible const$xyZT() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Zx(); }
                public double Xy() { return Accessible.this.Tx(); }
                public double Yx() { return Accessible.this.Zy(); }
                public double Yy() { return Accessible.this.Ty(); }
            };
        }

        default Matrix2x2.Accessible const$ZTyz() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Zy(); }
                public double Xy() { return Accessible.this.Zz(); }
                public double Yx() { return Accessible.this.Ty(); }
                public double Yy() { return Accessible.this.Tz(); }
            };
        }

        default Matrix2x2.Accessible const$yzZT() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Zy(); }
                public double Xy() { return Accessible.this.Ty(); }
                public double Yx() { return Accessible.this.Zz(); }
                public double Yy() { return Accessible.this.Tz(); }
            };
        }

        default Matrix2x2.Accessible const$ZTzw() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Zz(); }
                public double Xy() { return Accessible.this.Zw(); }
                public double Yx() { return Accessible.this.Tz(); }
                public double Yy() { return Accessible.this.Tw(); }
            };
        }

        default Matrix2x2.Accessible const$zwZT() {
            return new Matrix2x2.Accessible() {
                public double Xx() { return Accessible.this.Zz(); }
                public double Xy() { return Accessible.this.Tz(); }
                public double Yx() { return Accessible.this.Zw(); }
                public double Yy() { return Accessible.this.Tw(); }
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

        default Matrix3x3.Accessible const$XYZyzw() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Xy(); }
                public double Xy() { return Accessible.this.Xz(); }
                public double Xz() { return Accessible.this.Xw(); }
                public double Yx() { return Accessible.this.Yy(); }
                public double Yy() { return Accessible.this.Yz(); }
                public double Yz() { return Accessible.this.Yw(); }
                public double Zx() { return Accessible.this.Zy(); }
                public double Zy() { return Accessible.this.Zz(); }
                public double Zz() { return Accessible.this.Zw(); }
            };
        }

        default Matrix3x3.Accessible const$yzwXYZ() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Xy(); }
                public double Xy() { return Accessible.this.Yy(); }
                public double Xz() { return Accessible.this.Zy(); }
                public double Yx() { return Accessible.this.Xz(); }
                public double Yy() { return Accessible.this.Yz(); }
                public double Yz() { return Accessible.this.Zz(); }
                public double Zx() { return Accessible.this.Xw(); }
                public double Zy() { return Accessible.this.Yw(); }
                public double Zz() { return Accessible.this.Zw(); }
            };
        }

        default Matrix3x3.Accessible const$YZTxyz() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Yx(); }
                public double Xy() { return Accessible.this.Yy(); }
                public double Xz() { return Accessible.this.Yz(); }
                public double Yx() { return Accessible.this.Zx(); }
                public double Yy() { return Accessible.this.Zy(); }
                public double Yz() { return Accessible.this.Zz(); }
                public double Zx() { return Accessible.this.Tx(); }
                public double Zy() { return Accessible.this.Ty(); }
                public double Zz() { return Accessible.this.Tz(); }
            };
        }

        default Matrix3x3.Accessible const$xyzYZT() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Yx(); }
                public double Xy() { return Accessible.this.Zx(); }
                public double Xz() { return Accessible.this.Tx(); }
                public double Yx() { return Accessible.this.Yy(); }
                public double Yy() { return Accessible.this.Zy(); }
                public double Yz() { return Accessible.this.Ty(); }
                public double Zx() { return Accessible.this.Yz(); }
                public double Zy() { return Accessible.this.Zz(); }
                public double Zz() { return Accessible.this.Tz(); }
            };
        }

        default Matrix3x3.Accessible const$YZTyzw() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Yy(); }
                public double Xy() { return Accessible.this.Yz(); }
                public double Xz() { return Accessible.this.Yw(); }
                public double Yx() { return Accessible.this.Zy(); }
                public double Yy() { return Accessible.this.Zz(); }
                public double Yz() { return Accessible.this.Zw(); }
                public double Zx() { return Accessible.this.Ty(); }
                public double Zy() { return Accessible.this.Tz(); }
                public double Zz() { return Accessible.this.Tw(); }
            };
        }

        default Matrix3x3.Accessible const$yzwYZT() {
            return new Matrix3x3.Accessible() {
                public double Xx() { return Accessible.this.Yy(); }
                public double Xy() { return Accessible.this.Zy(); }
                public double Xz() { return Accessible.this.Ty(); }
                public double Yx() { return Accessible.this.Yz(); }
                public double Yy() { return Accessible.this.Zz(); }
                public double Yz() { return Accessible.this.Tz(); }
                public double Zx() { return Accessible.this.Yw(); }
                public double Zy() { return Accessible.this.Zw(); }
                public double Zz() { return Accessible.this.Tw(); }
            };
        }

        default Matrix4x4.Accessible const$XYZTxyzw() {
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

        default Matrix4x4.Accessible const$xyzwXYZT() {
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

        default Vector2.Accessible $Xxy() {
            return const$Xxy();
        }

        default Vector2.Accessible $Xxz() {
            return const$Xxz();
        }

        default Vector2.Accessible $Xxw() {
            return const$Xxw();
        }

        default Vector2.Accessible $Xyz() {
            return const$Xyz();
        }

        default Vector2.Accessible $Xyw() {
            return const$Xyw();
        }

        default Vector2.Accessible $Xzw() {
            return const$Xzw();
        }

        default Vector3.Accessible $Xxyz() {
            return const$Xxyz();
        }

        default Vector3.Accessible $Xxyw() {
            return const$Xxyw();
        }

        default Vector3.Accessible $Xxzw() {
            return const$Xxzw();
        }

        default Vector3.Accessible $Xyzw() {
            return const$Xyzw();
        }

        default Vector4.Accessible $Xxyzw() {
            return const$Xxyzw();
        }

        default Vector2.Accessible $Yxy() {
            return const$Yxy();
        }

        default Vector2.Accessible $Yxz() {
            return const$Yxz();
        }

        default Vector2.Accessible $Yxw() {
            return const$Yxw();
        }

        default Vector2.Accessible $Yyz() {
            return const$Yyz();
        }

        default Vector2.Accessible $Yyw() {
            return const$Yyw();
        }

        default Vector2.Accessible $Yzw() {
            return const$Yzw();
        }

        default Vector3.Accessible $Yxyz() {
            return const$Yxyz();
        }

        default Vector3.Accessible $Yxyw() {
            return const$Yxyw();
        }

        default Vector3.Accessible $Yxzw() {
            return const$Yxzw();
        }

        default Vector3.Accessible $Yyzw() {
            return const$Yyzw();
        }

        default Vector4.Accessible $Yxyzw() {
            return const$Yxyzw();
        }

        default Vector2.Accessible $Zxy() {
            return const$Zxy();
        }

        default Vector2.Accessible $Zxz() {
            return const$Zxz();
        }

        default Vector2.Accessible $Zxw() {
            return const$Zxw();
        }

        default Vector2.Accessible $Zyz() {
            return const$Zyz();
        }

        default Vector2.Accessible $Zyw() {
            return const$Zyw();
        }

        default Vector2.Accessible $Zzw() {
            return const$Zzw();
        }

        default Vector3.Accessible $Zxyz() {
            return const$Zxyz();
        }

        default Vector3.Accessible $Zxyw() {
            return const$Zxyw();
        }

        default Vector3.Accessible $Zxzw() {
            return const$Zxzw();
        }

        default Vector3.Accessible $Zyzw() {
            return const$Zyzw();
        }

        default Vector4.Accessible $Zxyzw() {
            return const$Zxyzw();
        }

        default Vector2.Accessible $Txy() {
            return const$Txy();
        }

        default Vector2.Accessible $Txz() {
            return const$Txz();
        }

        default Vector2.Accessible $Txw() {
            return const$Txw();
        }

        default Vector2.Accessible $Tyz() {
            return const$Tyz();
        }

        default Vector2.Accessible $Tyw() {
            return const$Tyw();
        }

        default Vector2.Accessible $Tzw() {
            return const$Tzw();
        }

        default Vector3.Accessible $Txyz() {
            return const$Txyz();
        }

        default Vector3.Accessible $Txyw() {
            return const$Txyw();
        }

        default Vector3.Accessible $Txzw() {
            return const$Txzw();
        }

        default Vector3.Accessible $Tyzw() {
            return const$Tyzw();
        }

        default Vector4.Accessible $Txyzw() {
            return const$Txyzw();
        }

        default Vector2.Accessible $xXY() {
            return const$xXY();
        }

        default Vector2.Accessible $xXZ() {
            return const$xXZ();
        }

        default Vector2.Accessible $xXT() {
            return const$xXT();
        }

        default Vector2.Accessible $xYZ() {
            return const$xYZ();
        }

        default Vector2.Accessible $xYT() {
            return const$xYT();
        }

        default Vector2.Accessible $xZT() {
            return const$xZT();
        }

        default Vector3.Accessible $xXYZ() {
            return const$xXYZ();
        }

        default Vector3.Accessible $xXYT() {
            return const$xXYT();
        }

        default Vector3.Accessible $xXZT() {
            return const$xXZT();
        }

        default Vector3.Accessible $xYZT() {
            return const$xYZT();
        }

        default Vector4.Accessible $xXYZT() {
            return const$xXYZT();
        }

        default Vector2.Accessible $yXY() {
            return const$yXY();
        }

        default Vector2.Accessible $yXZ() {
            return const$yXZ();
        }

        default Vector2.Accessible $yXT() {
            return const$yXT();
        }

        default Vector2.Accessible $yYZ() {
            return const$yYZ();
        }

        default Vector2.Accessible $yYT() {
            return const$yYT();
        }

        default Vector2.Accessible $yZT() {
            return const$yZT();
        }

        default Vector3.Accessible $yXYZ() {
            return const$yXYZ();
        }

        default Vector3.Accessible $yXYT() {
            return const$yXYT();
        }

        default Vector3.Accessible $yXZT() {
            return const$yXZT();
        }

        default Vector3.Accessible $yYZT() {
            return const$yYZT();
        }

        default Vector4.Accessible $yXYZT() {
            return const$yXYZT();
        }

        default Vector2.Accessible $zXY() {
            return const$zXY();
        }

        default Vector2.Accessible $zXZ() {
            return const$zXZ();
        }

        default Vector2.Accessible $zXT() {
            return const$zXT();
        }

        default Vector2.Accessible $zYZ() {
            return const$zYZ();
        }

        default Vector2.Accessible $zYT() {
            return const$zYT();
        }

        default Vector2.Accessible $zZT() {
            return const$zZT();
        }

        default Vector3.Accessible $zXYZ() {
            return const$zXYZ();
        }

        default Vector3.Accessible $zXYT() {
            return const$zXYT();
        }

        default Vector3.Accessible $zXZT() {
            return const$zXZT();
        }

        default Vector3.Accessible $zYZT() {
            return const$zYZT();
        }

        default Vector4.Accessible $zXYZT() {
            return const$zXYZT();
        }

        default Vector2.Accessible $wXY() {
            return const$wXY();
        }

        default Vector2.Accessible $wXZ() {
            return const$wXZ();
        }

        default Vector2.Accessible $wXT() {
            return const$wXT();
        }

        default Vector2.Accessible $wYZ() {
            return const$wYZ();
        }

        default Vector2.Accessible $wYT() {
            return const$wYT();
        }

        default Vector2.Accessible $wZT() {
            return const$wZT();
        }

        default Vector3.Accessible $wXYZ() {
            return const$wXYZ();
        }

        default Vector3.Accessible $wXYT() {
            return const$wXYT();
        }

        default Vector3.Accessible $wXZT() {
            return const$wXZT();
        }

        default Vector3.Accessible $wYZT() {
            return const$wYZT();
        }

        default Vector4.Accessible $wXYZT() {
            return const$wXYZT();
        }

        default Vector2.Accessible $Dxy() {
            return const$Dxy();
        }

        default Vector2.Accessible $Dxz() {
            return const$Dxz();
        }

        default Vector2.Accessible $Dxw() {
            return const$Dxw();
        }

        default Vector2.Accessible $Dyz() {
            return const$Dyz();
        }

        default Vector2.Accessible $Dyw() {
            return const$Dyw();
        }

        default Vector2.Accessible $Dzw() {
            return const$Dzw();
        }

        default Vector3.Accessible $Dxyz() {
            return const$Dxyz();
        }

        default Vector3.Accessible $Dxyw() {
            return const$Dxyw();
        }

        default Vector3.Accessible $Dxzw() {
            return const$Dxzw();
        }

        default Vector3.Accessible $Dyzw() {
            return const$Dyzw();
        }

        default Vector4.Accessible $Dxyzw() {
            return const$Dxyzw();
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

        default Matrix2x2.Accessible $XYzw() {
            return const$XYzw();
        }

        default Matrix2x2.Accessible $zwXY() {
            return const$zwXY();
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

        default Matrix2x2.Accessible $YZzw() {
            return const$YZzw();
        }

        default Matrix2x2.Accessible $zwYZ() {
            return const$zwYZ();
        }

        default Matrix2x2.Accessible $ZTxy() {
            return const$ZTxy();
        }

        default Matrix2x2.Accessible $xyZT() {
            return const$xyZT();
        }

        default Matrix2x2.Accessible $ZTyz() {
            return const$ZTyz();
        }

        default Matrix2x2.Accessible $yzZT() {
            return const$yzZT();
        }

        default Matrix2x2.Accessible $ZTzw() {
            return const$ZTzw();
        }

        default Matrix2x2.Accessible $zwZT() {
            return const$zwZT();
        }

        default Matrix3x3.Accessible $XYZxyz() {
            return const$XYZxyz();
        }

        default Matrix3x3.Accessible $xyzXYZ() {
            return const$xyzXYZ();
        }

        default Matrix3x3.Accessible $XYZyzw() {
            return const$XYZyzw();
        }

        default Matrix3x3.Accessible $yzwXYZ() {
            return const$yzwXYZ();
        }

        default Matrix3x3.Accessible $YZTxyz() {
            return const$YZTxyz();
        }

        default Matrix3x3.Accessible $xyzYZT() {
            return const$xyzYZT();
        }

        default Matrix3x3.Accessible $YZTyzw() {
            return const$YZTyzw();
        }

        default Matrix3x3.Accessible $yzwYZT() {
            return const$yzwYZT();
        }

        default Matrix4x4.Accessible $XYZTxyzw() {
            return this;
        }

        default Matrix4x4.Accessible $xyzwXYZT() {
            return const$xyzwXYZT();
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

        default <R> R Xxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default <R> R Xxz(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xz());
        }

        default <R> R Xxw(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xw());
        }

        default <R> R Xyz(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xz());
        }

        default <R> R Xyw(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xw());
        }

        default <R> R Xzw(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Xw());
        }

        default <R> R Xxyz(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz());
        }

        default <R> R Xxyw(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw());
        }

        default <R> R Xxzw(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw());
        }

        default <R> R Xyzw(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw());
        }

        default <R> R Xxyzw(Vector4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw());
        }

        default <R> R Yxy(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default <R> R Yxz(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yz());
        }

        default <R> R Yxw(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yw());
        }

        default <R> R Yyz(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yz());
        }

        default <R> R Yyw(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yw());
        }

        default <R> R Yzw(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Yw());
        }

        default <R> R Yxyz(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz());
        }

        default <R> R Yxyw(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yw());
        }

        default <R> R Yxzw(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Yw());
        }

        default <R> R Yyzw(Vector3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw());
        }

        default <R> R Yxyzw(Vector4.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Yw());
        }

        default <R> R Zxy(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zy());
        }

        default <R> R Zxz(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zz());
        }

        default <R> R Zxw(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zw());
        }

        default <R> R Zyz(Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zz());
        }

        default <R> R Zyw(Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zw());
        }

        default <R> R Zzw(Vector2.Factory<R> factory) {
            return factory.create(Zz(), Zw());
        }

        default <R> R Zxyz(Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz());
        }

        default <R> R Zxyw(Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zw());
        }

        default <R> R Zxzw(Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zz(), Zw());
        }

        default <R> R Zyzw(Vector3.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Zw());
        }

        default <R> R Zxyzw(Vector4.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz(), Zw());
        }

        default <R> R Txy(Vector2.Factory<R> factory) {
            return factory.create(Tx(), Ty());
        }

        default <R> R Txz(Vector2.Factory<R> factory) {
            return factory.create(Tx(), Tz());
        }

        default <R> R Txw(Vector2.Factory<R> factory) {
            return factory.create(Tx(), Tw());
        }

        default <R> R Tyz(Vector2.Factory<R> factory) {
            return factory.create(Ty(), Tz());
        }

        default <R> R Tyw(Vector2.Factory<R> factory) {
            return factory.create(Ty(), Tw());
        }

        default <R> R Tzw(Vector2.Factory<R> factory) {
            return factory.create(Tz(), Tw());
        }

        default <R> R Txyz(Vector3.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tz());
        }

        default <R> R Txyw(Vector3.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tw());
        }

        default <R> R Txzw(Vector3.Factory<R> factory) {
            return factory.create(Tx(), Tz(), Tw());
        }

        default <R> R Tyzw(Vector3.Factory<R> factory) {
            return factory.create(Ty(), Tz(), Tw());
        }

        default <R> R Txyzw(Vector4.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tz(), Tw());
        }

        default <R> R xXY(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default <R> R xXZ(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default <R> R xXT(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tx());
        }

        default <R> R xYZ(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default <R> R xYT(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Tx());
        }

        default <R> R xZT(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Tx());
        }

        default <R> R xXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default <R> R xXYT(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx());
        }

        default <R> R xXZT(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx());
        }

        default <R> R xYZT(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx());
        }

        default <R> R xXYZT(Vector4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx());
        }

        default <R> R yXY(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default <R> R yXZ(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default <R> R yXT(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Ty());
        }

        default <R> R yYZ(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default <R> R yYT(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Ty());
        }

        default <R> R yZT(Vector2.Factory<R> factory) {
            return factory.create(Zy(), Ty());
        }

        default <R> R yXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default <R> R yXYT(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Ty());
        }

        default <R> R yXZT(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Ty());
        }

        default <R> R yYZT(Vector3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty());
        }

        default <R> R yXYZT(Vector4.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Ty());
        }

        default <R> R zXY(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default <R> R zXZ(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default <R> R zXT(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Tz());
        }

        default <R> R zYZ(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default <R> R zYT(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Tz());
        }

        default <R> R zZT(Vector2.Factory<R> factory) {
            return factory.create(Zz(), Tz());
        }

        default <R> R zXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz());
        }

        default <R> R zXYT(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Tz());
        }

        default <R> R zXZT(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Zz(), Tz());
        }

        default <R> R zYZT(Vector3.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Tz());
        }

        default <R> R zXYZT(Vector4.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz(), Tz());
        }

        default <R> R wXY(Vector2.Factory<R> factory) {
            return factory.create(Xw(), Yw());
        }

        default <R> R wXZ(Vector2.Factory<R> factory) {
            return factory.create(Xw(), Zw());
        }

        default <R> R wXT(Vector2.Factory<R> factory) {
            return factory.create(Xw(), Tw());
        }

        default <R> R wYZ(Vector2.Factory<R> factory) {
            return factory.create(Yw(), Zw());
        }

        default <R> R wYT(Vector2.Factory<R> factory) {
            return factory.create(Yw(), Tw());
        }

        default <R> R wZT(Vector2.Factory<R> factory) {
            return factory.create(Zw(), Tw());
        }

        default <R> R wXYZ(Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Zw());
        }

        default <R> R wXYT(Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Tw());
        }

        default <R> R wXZT(Vector3.Factory<R> factory) {
            return factory.create(Xw(), Zw(), Tw());
        }

        default <R> R wYZT(Vector3.Factory<R> factory) {
            return factory.create(Yw(), Zw(), Tw());
        }

        default <R> R wXYZT(Vector4.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Zw(), Tw());
        }

        default <R> R Dxy(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default <R> R Dxz(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zz());
        }

        default <R> R Dxw(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tw());
        }

        default <R> R Dyz(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zz());
        }

        default <R> R Dyw(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Tw());
        }

        default <R> R Dzw(Vector2.Factory<R> factory) {
            return factory.create(Zz(), Tw());
        }

        default <R> R Dxyz(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz());
        }

        default <R> R Dxyw(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Tw());
        }

        default <R> R Dxzw(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Zz(), Tw());
        }

        default <R> R Dyzw(Vector3.Factory<R> factory) {
            return factory.create(Yy(), Zz(), Tw());
        }

        default <R> R Dxyzw(Vector4.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz(), Tw());
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

        default <R> R XYzw(Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Yz(), Yw());
        }

        default <R> R zwXY(Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Xw(), Yw());
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

        default <R> R YZzw(Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Yw(), Zz(), Zw());
        }

        default <R> R zwYZ(Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Yw(), Zw());
        }

        default <R> R ZTxy(Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Tx(), Ty());
        }

        default <R> R xyZT(Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zy(), Ty());
        }

        default <R> R ZTyz(Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Ty(), Tz());
        }

        default <R> R yzZT(Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Ty(), Zz(), Tz());
        }

        default <R> R ZTzw(Matrix2x2.Factory<R> factory) {
            return factory.create(Zz(), Zw(), Tz(), Tw());
        }

        default <R> R zwZT(Matrix2x2.Factory<R> factory) {
            return factory.create(Zz(), Tz(), Zw(), Tw());
        }

        default <R> R XYZxyz(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R xyzXYZ(Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default <R> R XYZyzw(Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default <R> R yzwXYZ(Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default <R> R YZTxyz(Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default <R> R xyzYZT(Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default <R> R YZTyzw(Matrix3x3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default <R> R yzwYZT(Matrix3x3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default <R> R XYZTxyzw(Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R xyzwXYZT(Matrix4x4.Factory<R> factory) {
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

        default void XxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default void XxzTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xz());
        }

        default void XxwTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xw());
        }

        default void XyzTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xz());
        }

        default void XywTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xw());
        }

        default void XzwTo(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Xw());
        }

        default void XxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xz());
        }

        default void XxywTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xw());
        }

        default void XxzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xz(), Xw());
        }

        default void XyzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Xz(), Xw());
        }

        default void XxyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Xy(), Xz(), Xw());
        }

        default void YxyTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default void YxzTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yz());
        }

        default void YxwTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yw());
        }

        default void YyzTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yz());
        }

        default void YywTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yw());
        }

        default void YzwTo(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Yw());
        }

        default void YxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yz());
        }

        default void YxywTo(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yw());
        }

        default void YxzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yz(), Yw());
        }

        default void YyzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Yz(), Yw());
        }

        default void YxyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(Yx(), Yy(), Yz(), Yw());
        }

        default void ZxyTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zy());
        }

        default void ZxzTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zz());
        }

        default void ZxwTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zw());
        }

        default void ZyzTo(Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zz());
        }

        default void ZywTo(Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zw());
        }

        default void ZzwTo(Vector2.Consumer consumer) {
            consumer.xy(Zz(), Zw());
        }

        default void ZxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zz());
        }

        default void ZxywTo(Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zw());
        }

        default void ZxzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zz(), Zw());
        }

        default void ZyzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Zy(), Zz(), Zw());
        }

        default void ZxyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(Zx(), Zy(), Zz(), Zw());
        }

        default void TxyTo(Vector2.Consumer consumer) {
            consumer.xy(Tx(), Ty());
        }

        default void TxzTo(Vector2.Consumer consumer) {
            consumer.xy(Tx(), Tz());
        }

        default void TxwTo(Vector2.Consumer consumer) {
            consumer.xy(Tx(), Tw());
        }

        default void TyzTo(Vector2.Consumer consumer) {
            consumer.xy(Ty(), Tz());
        }

        default void TywTo(Vector2.Consumer consumer) {
            consumer.xy(Ty(), Tw());
        }

        default void TzwTo(Vector2.Consumer consumer) {
            consumer.xy(Tz(), Tw());
        }

        default void TxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Ty(), Tz());
        }

        default void TxywTo(Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Ty(), Tw());
        }

        default void TxzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Tz(), Tw());
        }

        default void TyzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Ty(), Tz(), Tw());
        }

        default void TxyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(Tx(), Ty(), Tz(), Tw());
        }

        default void xXYto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default void xXZto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default void xXTto(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tx());
        }

        default void xYZto(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
        }

        default void xYTto(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Tx());
        }

        default void xZTto(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Tx());
        }

        default void xXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
        }

        default void xXYTto(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Tx());
        }

        default void xXZTto(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Zx(), Tx());
        }

        default void xYZTto(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Zx(), Tx());
        }

        default void xXYZTto(Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Yx(), Zx(), Tx());
        }

        default void yXYto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default void yXZto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default void yXTto(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Ty());
        }

        default void yYZto(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
        }

        default void yYTto(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Ty());
        }

        default void yZTto(Vector2.Consumer consumer) {
            consumer.xy(Zy(), Ty());
        }

        default void yXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
        }

        default void yXYTto(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Ty());
        }

        default void yXZTto(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Zy(), Ty());
        }

        default void yYZTto(Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Zy(), Ty());
        }

        default void yXYZTto(Vector4.Consumer consumer) {
            consumer.xyzw(Xy(), Yy(), Zy(), Ty());
        }

        default void zXYto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default void zXZto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default void zXTto(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Tz());
        }

        default void zYZto(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
        }

        default void zYTto(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Tz());
        }

        default void zZTto(Vector2.Consumer consumer) {
            consumer.xy(Zz(), Tz());
        }

        default void zXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Zz());
        }

        default void zXYTto(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Tz());
        }

        default void zXZTto(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Zz(), Tz());
        }

        default void zYZTto(Vector3.Consumer consumer) {
            consumer.xyz(Yz(), Zz(), Tz());
        }

        default void zXYZTto(Vector4.Consumer consumer) {
            consumer.xyzw(Xz(), Yz(), Zz(), Tz());
        }

        default void wXYto(Vector2.Consumer consumer) {
            consumer.xy(Xw(), Yw());
        }

        default void wXZto(Vector2.Consumer consumer) {
            consumer.xy(Xw(), Zw());
        }

        default void wXTto(Vector2.Consumer consumer) {
            consumer.xy(Xw(), Tw());
        }

        default void wYZto(Vector2.Consumer consumer) {
            consumer.xy(Yw(), Zw());
        }

        default void wYTto(Vector2.Consumer consumer) {
            consumer.xy(Yw(), Tw());
        }

        default void wZTto(Vector2.Consumer consumer) {
            consumer.xy(Zw(), Tw());
        }

        default void wXYZto(Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Zw());
        }

        default void wXYTto(Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Tw());
        }

        default void wXZTto(Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Zw(), Tw());
        }

        default void wYZTto(Vector3.Consumer consumer) {
            consumer.xyz(Yw(), Zw(), Tw());
        }

        default void wXYZTto(Vector4.Consumer consumer) {
            consumer.xyzw(Xw(), Yw(), Zw(), Tw());
        }

        default void DxyTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
        }

        default void DxzTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zz());
        }

        default void DxwTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tw());
        }

        default void DyzTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zz());
        }

        default void DywTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Tw());
        }

        default void DzwTo(Vector2.Consumer consumer) {
            consumer.xy(Zz(), Tw());
        }

        default void DxyzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Zz());
        }

        default void DxywTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Tw());
        }

        default void DxzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Zz(), Tw());
        }

        default void DyzwTo(Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Zz(), Tw());
        }

        default void DxyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Yy(), Zz(), Tw());
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

        default void XYzwTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Yz(), Yw());
        }

        default void zwXYto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Yz(), Xw(), Yw());
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

        default void YZzwTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Yw(), Zz(), Zw());
        }

        default void zwYZto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Zz(), Yw(), Zw());
        }

        default void ZTxyTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Zy(), Tx(), Ty());
        }

        default void xyZTto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Tx(), Zy(), Ty());
        }

        default void ZTyzTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Zz(), Ty(), Tz());
        }

        default void yzZTto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Ty(), Zz(), Tz());
        }

        default void ZTzwTo(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zz(), Zw(), Tz(), Tw());
        }

        default void zwZTto(Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zz(), Tz(), Zw(), Tw());
        }

        default void XYZxyzTo(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void xyzXYZto(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void XYZyzwTo(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default void yzwXYZto(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void YZTxyzTo(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void xyzYZTto(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default void YZTyzwTo(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default void yzwYZTto(Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default void XYZTxyzwTo(Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void xyzwXYZTto(Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
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

        default void Xxy(double v) {
            Xx(v);
            Xy(v);
        }

        default void Xxz(double v) {
            Xx(v);
            Xz(v);
        }

        default void Xxw(double v) {
            Xx(v);
            Xw(v);
        }

        default void Xyz(double v) {
            Xy(v);
            Xz(v);
        }

        default void Xyw(double v) {
            Xy(v);
            Xw(v);
        }

        default void Xzw(double v) {
            Xz(v);
            Xw(v);
        }

        default void Xxyz(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
        }

        default void Xxyw(double v) {
            Xx(v);
            Xy(v);
            Xw(v);
        }

        default void Xxzw(double v) {
            Xx(v);
            Xz(v);
            Xw(v);
        }

        default void Xyzw(double v) {
            Xy(v);
            Xz(v);
            Xw(v);
        }

        default void Xxyzw(double v) {
            Xx(v);
            Xy(v);
            Xz(v);
            Xw(v);
        }

        default void Yxy(double v) {
            Yx(v);
            Yy(v);
        }

        default void Yxz(double v) {
            Yx(v);
            Yz(v);
        }

        default void Yxw(double v) {
            Yx(v);
            Yw(v);
        }

        default void Yyz(double v) {
            Yy(v);
            Yz(v);
        }

        default void Yyw(double v) {
            Yy(v);
            Yw(v);
        }

        default void Yzw(double v) {
            Yz(v);
            Yw(v);
        }

        default void Yxyz(double v) {
            Yx(v);
            Yy(v);
            Yz(v);
        }

        default void Yxyw(double v) {
            Yx(v);
            Yy(v);
            Yw(v);
        }

        default void Yxzw(double v) {
            Yx(v);
            Yz(v);
            Yw(v);
        }

        default void Yyzw(double v) {
            Yy(v);
            Yz(v);
            Yw(v);
        }

        default void Yxyzw(double v) {
            Yx(v);
            Yy(v);
            Yz(v);
            Yw(v);
        }

        default void Zxy(double v) {
            Zx(v);
            Zy(v);
        }

        default void Zxz(double v) {
            Zx(v);
            Zz(v);
        }

        default void Zxw(double v) {
            Zx(v);
            Zw(v);
        }

        default void Zyz(double v) {
            Zy(v);
            Zz(v);
        }

        default void Zyw(double v) {
            Zy(v);
            Zw(v);
        }

        default void Zzw(double v) {
            Zz(v);
            Zw(v);
        }

        default void Zxyz(double v) {
            Zx(v);
            Zy(v);
            Zz(v);
        }

        default void Zxyw(double v) {
            Zx(v);
            Zy(v);
            Zw(v);
        }

        default void Zxzw(double v) {
            Zx(v);
            Zz(v);
            Zw(v);
        }

        default void Zyzw(double v) {
            Zy(v);
            Zz(v);
            Zw(v);
        }

        default void Zxyzw(double v) {
            Zx(v);
            Zy(v);
            Zz(v);
            Zw(v);
        }

        default void Txy(double v) {
            Tx(v);
            Ty(v);
        }

        default void Txz(double v) {
            Tx(v);
            Tz(v);
        }

        default void Txw(double v) {
            Tx(v);
            Tw(v);
        }

        default void Tyz(double v) {
            Ty(v);
            Tz(v);
        }

        default void Tyw(double v) {
            Ty(v);
            Tw(v);
        }

        default void Tzw(double v) {
            Tz(v);
            Tw(v);
        }

        default void Txyz(double v) {
            Tx(v);
            Ty(v);
            Tz(v);
        }

        default void Txyw(double v) {
            Tx(v);
            Ty(v);
            Tw(v);
        }

        default void Txzw(double v) {
            Tx(v);
            Tz(v);
            Tw(v);
        }

        default void Tyzw(double v) {
            Ty(v);
            Tz(v);
            Tw(v);
        }

        default void Txyzw(double v) {
            Tx(v);
            Ty(v);
            Tz(v);
            Tw(v);
        }

        default void xXY(double v) {
            Xx(v);
            Yx(v);
        }

        default void xXZ(double v) {
            Xx(v);
            Zx(v);
        }

        default void xXT(double v) {
            Xx(v);
            Tx(v);
        }

        default void xYZ(double v) {
            Yx(v);
            Zx(v);
        }

        default void xYT(double v) {
            Yx(v);
            Tx(v);
        }

        default void xZT(double v) {
            Zx(v);
            Tx(v);
        }

        default void xXYZ(double v) {
            Xx(v);
            Yx(v);
            Zx(v);
        }

        default void xXYT(double v) {
            Xx(v);
            Yx(v);
            Tx(v);
        }

        default void xXZT(double v) {
            Xx(v);
            Zx(v);
            Tx(v);
        }

        default void xYZT(double v) {
            Yx(v);
            Zx(v);
            Tx(v);
        }

        default void xXYZT(double v) {
            Xx(v);
            Yx(v);
            Zx(v);
            Tx(v);
        }

        default void yXY(double v) {
            Xy(v);
            Yy(v);
        }

        default void yXZ(double v) {
            Xy(v);
            Zy(v);
        }

        default void yXT(double v) {
            Xy(v);
            Ty(v);
        }

        default void yYZ(double v) {
            Yy(v);
            Zy(v);
        }

        default void yYT(double v) {
            Yy(v);
            Ty(v);
        }

        default void yZT(double v) {
            Zy(v);
            Ty(v);
        }

        default void yXYZ(double v) {
            Xy(v);
            Yy(v);
            Zy(v);
        }

        default void yXYT(double v) {
            Xy(v);
            Yy(v);
            Ty(v);
        }

        default void yXZT(double v) {
            Xy(v);
            Zy(v);
            Ty(v);
        }

        default void yYZT(double v) {
            Yy(v);
            Zy(v);
            Ty(v);
        }

        default void yXYZT(double v) {
            Xy(v);
            Yy(v);
            Zy(v);
            Ty(v);
        }

        default void zXY(double v) {
            Xz(v);
            Yz(v);
        }

        default void zXZ(double v) {
            Xz(v);
            Zz(v);
        }

        default void zXT(double v) {
            Xz(v);
            Tz(v);
        }

        default void zYZ(double v) {
            Yz(v);
            Zz(v);
        }

        default void zYT(double v) {
            Yz(v);
            Tz(v);
        }

        default void zZT(double v) {
            Zz(v);
            Tz(v);
        }

        default void zXYZ(double v) {
            Xz(v);
            Yz(v);
            Zz(v);
        }

        default void zXYT(double v) {
            Xz(v);
            Yz(v);
            Tz(v);
        }

        default void zXZT(double v) {
            Xz(v);
            Zz(v);
            Tz(v);
        }

        default void zYZT(double v) {
            Yz(v);
            Zz(v);
            Tz(v);
        }

        default void zXYZT(double v) {
            Xz(v);
            Yz(v);
            Zz(v);
            Tz(v);
        }

        default void wXY(double v) {
            Xw(v);
            Yw(v);
        }

        default void wXZ(double v) {
            Xw(v);
            Zw(v);
        }

        default void wXT(double v) {
            Xw(v);
            Tw(v);
        }

        default void wYZ(double v) {
            Yw(v);
            Zw(v);
        }

        default void wYT(double v) {
            Yw(v);
            Tw(v);
        }

        default void wZT(double v) {
            Zw(v);
            Tw(v);
        }

        default void wXYZ(double v) {
            Xw(v);
            Yw(v);
            Zw(v);
        }

        default void wXYT(double v) {
            Xw(v);
            Yw(v);
            Tw(v);
        }

        default void wXZT(double v) {
            Xw(v);
            Zw(v);
            Tw(v);
        }

        default void wYZT(double v) {
            Yw(v);
            Zw(v);
            Tw(v);
        }

        default void wXYZT(double v) {
            Xw(v);
            Yw(v);
            Zw(v);
            Tw(v);
        }

        default void Dxy(double v) {
            Xx(v);
            Yy(v);
        }

        default void Dxz(double v) {
            Xx(v);
            Zz(v);
        }

        default void Dxw(double v) {
            Xx(v);
            Tw(v);
        }

        default void Dyz(double v) {
            Yy(v);
            Zz(v);
        }

        default void Dyw(double v) {
            Yy(v);
            Tw(v);
        }

        default void Dzw(double v) {
            Zz(v);
            Tw(v);
        }

        default void Dxyz(double v) {
            Xx(v);
            Yy(v);
            Zz(v);
        }

        default void Dxyw(double v) {
            Xx(v);
            Yy(v);
            Tw(v);
        }

        default void Dxzw(double v) {
            Xx(v);
            Zz(v);
            Tw(v);
        }

        default void Dyzw(double v) {
            Yy(v);
            Zz(v);
            Tw(v);
        }

        default void Dxyzw(double v) {
            Xx(v);
            Yy(v);
            Zz(v);
            Tw(v);
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

        default void XYzw(double v) {
            Xz(v);
            Xw(v);
            Yz(v);
            Yw(v);
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

        default void YZzw(double v) {
            Yz(v);
            Yw(v);
            Zz(v);
            Zw(v);
        }

        default void ZTxy(double v) {
            Zx(v);
            Zy(v);
            Tx(v);
            Ty(v);
        }

        default void ZTyz(double v) {
            Zy(v);
            Zz(v);
            Ty(v);
            Tz(v);
        }

        default void ZTzw(double v) {
            Zz(v);
            Zw(v);
            Tz(v);
            Tw(v);
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

        default void XYZyzw(double v) {
            Xy(v);
            Xz(v);
            Xw(v);
            Yy(v);
            Yz(v);
            Yw(v);
            Zy(v);
            Zz(v);
            Zw(v);
        }

        default void YZTxyz(double v) {
            Yx(v);
            Yy(v);
            Yz(v);
            Zx(v);
            Zy(v);
            Zz(v);
            Tx(v);
            Ty(v);
            Tz(v);
        }

        default void YZTyzw(double v) {
            Yy(v);
            Yz(v);
            Yw(v);
            Zy(v);
            Zz(v);
            Zw(v);
            Ty(v);
            Tz(v);
            Tw(v);
        }

        default void XYZTxyzw(double v) {
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

        default void Xxy(double Xx, double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Xxz(double Xx, double Xz) {
            Xx(Xx);
            Xz(Xz);
        }

        default void Xxw(double Xx, double Xw) {
            Xx(Xx);
            Xw(Xw);
        }

        default void Xyz(double Xy, double Xz) {
            Xy(Xy);
            Xz(Xz);
        }

        default void Xyw(double Xy, double Xw) {
            Xy(Xy);
            Xw(Xw);
        }

        default void Xzw(double Xz, double Xw) {
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyz(double Xx, double Xy, double Xz) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
        }

        default void Xxyw(double Xx, double Xy, double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
        }

        default void Xxzw(double Xx, double Xz, double Xw) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
        }

        default void Xyzw(double Xy, double Xz, double Xw) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyzw(double Xx, double Xy, double Xz, double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Yxy(double Yx, double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void Yxz(double Yx, double Yz) {
            Yx(Yx);
            Yz(Yz);
        }

        default void Yxw(double Yx, double Yw) {
            Yx(Yx);
            Yw(Yw);
        }

        default void Yyz(double Yy, double Yz) {
            Yy(Yy);
            Yz(Yz);
        }

        default void Yyw(double Yy, double Yw) {
            Yy(Yy);
            Yw(Yw);
        }

        default void Yzw(double Yz, double Yw) {
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyz(double Yx, double Yy, double Yz) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
        }

        default void Yxyw(double Yx, double Yy, double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
        }

        default void Yxzw(double Yx, double Yz, double Yw) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
        }

        default void Yyzw(double Yy, double Yz, double Yw) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyzw(double Yx, double Yy, double Yz, double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Zxy(double Zx, double Zy) {
            Zx(Zx);
            Zy(Zy);
        }

        default void Zxz(double Zx, double Zz) {
            Zx(Zx);
            Zz(Zz);
        }

        default void Zxw(double Zx, double Zw) {
            Zx(Zx);
            Zw(Zw);
        }

        default void Zyz(double Zy, double Zz) {
            Zy(Zy);
            Zz(Zz);
        }

        default void Zyw(double Zy, double Zw) {
            Zy(Zy);
            Zw(Zw);
        }

        default void Zzw(double Zz, double Zw) {
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyz(double Zx, double Zy, double Zz) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
        }

        default void Zxyw(double Zx, double Zy, double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void Zxzw(double Zx, double Zz, double Zw) {
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void Zyzw(double Zy, double Zz, double Zw) {
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyzw(double Zx, double Zy, double Zz, double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void Txy(double Tx, double Ty) {
            Tx(Tx);
            Ty(Ty);
        }

        default void Txz(double Tx, double Tz) {
            Tx(Tx);
            Tz(Tz);
        }

        default void Txw(double Tx, double Tw) {
            Tx(Tx);
            Tw(Tw);
        }

        default void Tyz(double Ty, double Tz) {
            Ty(Ty);
            Tz(Tz);
        }

        default void Tyw(double Ty, double Tw) {
            Ty(Ty);
            Tw(Tw);
        }

        default void Tzw(double Tz, double Tw) {
            Tz(Tz);
            Tw(Tw);
        }

        default void Txyz(double Tx, double Ty, double Tz) {
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void Txyw(double Tx, double Ty, double Tw) {
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void Txzw(double Tx, double Tz, double Tw) {
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void Tyzw(double Ty, double Tz, double Tw) {
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void Txyzw(double Tx, double Ty, double Tz, double Tw) {
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void xXY(double Xx, double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void xXZ(double Xx, double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void xXT(double Xx, double Tx) {
            Xx(Xx);
            Tx(Tx);
        }

        default void xYZ(double Yx, double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void xYT(double Yx, double Tx) {
            Yx(Yx);
            Tx(Tx);
        }

        default void xZT(double Zx, double Tx) {
            Zx(Zx);
            Tx(Tx);
        }

        default void xXYZ(double Xx, double Yx, double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
        }

        default void xXYT(double Xx, double Yx, double Tx) {
            Xx(Xx);
            Yx(Yx);
            Tx(Tx);
        }

        default void xXZT(double Xx, double Zx, double Tx) {
            Xx(Xx);
            Zx(Zx);
            Tx(Tx);
        }

        default void xYZT(double Yx, double Zx, double Tx) {
            Yx(Yx);
            Zx(Zx);
            Tx(Tx);
        }

        default void xXYZT(double Xx, double Yx, double Zx, double Tx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
            Tx(Tx);
        }

        default void yXY(double Xy, double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void yXZ(double Xy, double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void yXT(double Xy, double Ty) {
            Xy(Xy);
            Ty(Ty);
        }

        default void yYZ(double Yy, double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void yYT(double Yy, double Ty) {
            Yy(Yy);
            Ty(Ty);
        }

        default void yZT(double Zy, double Ty) {
            Zy(Zy);
            Ty(Ty);
        }

        default void yXYZ(double Xy, double Yy, double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
        }

        default void yXYT(double Xy, double Yy, double Ty) {
            Xy(Xy);
            Yy(Yy);
            Ty(Ty);
        }

        default void yXZT(double Xy, double Zy, double Ty) {
            Xy(Xy);
            Zy(Zy);
            Ty(Ty);
        }

        default void yYZT(double Yy, double Zy, double Ty) {
            Yy(Yy);
            Zy(Zy);
            Ty(Ty);
        }

        default void yXYZT(double Xy, double Yy, double Zy, double Ty) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
            Ty(Ty);
        }

        default void zXY(double Xz, double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void zXZ(double Xz, double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void zXT(double Xz, double Tz) {
            Xz(Xz);
            Tz(Tz);
        }

        default void zYZ(double Yz, double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void zYT(double Yz, double Tz) {
            Yz(Yz);
            Tz(Tz);
        }

        default void zZT(double Zz, double Tz) {
            Zz(Zz);
            Tz(Tz);
        }

        default void zXYZ(double Xz, double Yz, double Zz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
        }

        default void zXYT(double Xz, double Yz, double Tz) {
            Xz(Xz);
            Yz(Yz);
            Tz(Tz);
        }

        default void zXZT(double Xz, double Zz, double Tz) {
            Xz(Xz);
            Zz(Zz);
            Tz(Tz);
        }

        default void zYZT(double Yz, double Zz, double Tz) {
            Yz(Yz);
            Zz(Zz);
            Tz(Tz);
        }

        default void zXYZT(double Xz, double Yz, double Zz, double Tz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
            Tz(Tz);
        }

        default void wXY(double Xw, double Yw) {
            Xw(Xw);
            Yw(Yw);
        }

        default void wXZ(double Xw, double Zw) {
            Xw(Xw);
            Zw(Zw);
        }

        default void wXT(double Xw, double Tw) {
            Xw(Xw);
            Tw(Tw);
        }

        default void wYZ(double Yw, double Zw) {
            Yw(Yw);
            Zw(Zw);
        }

        default void wYT(double Yw, double Tw) {
            Yw(Yw);
            Tw(Tw);
        }

        default void wZT(double Zw, double Tw) {
            Zw(Zw);
            Tw(Tw);
        }

        default void wXYZ(double Xw, double Yw, double Zw) {
            Xw(Xw);
            Yw(Yw);
            Zw(Zw);
        }

        default void wXYT(double Xw, double Yw, double Tw) {
            Xw(Xw);
            Yw(Yw);
            Tw(Tw);
        }

        default void wXZT(double Xw, double Zw, double Tw) {
            Xw(Xw);
            Zw(Zw);
            Tw(Tw);
        }

        default void wYZT(double Yw, double Zw, double Tw) {
            Yw(Yw);
            Zw(Zw);
            Tw(Tw);
        }

        default void wXYZT(double Xw, double Yw, double Zw, double Tw) {
            Xw(Xw);
            Yw(Yw);
            Zw(Zw);
            Tw(Tw);
        }

        default void Dxy(double Xx, double Yy) {
            Xx(Xx);
            Yy(Yy);
        }

        default void Dxz(double Xx, double Zz) {
            Xx(Xx);
            Zz(Zz);
        }

        default void Dxw(double Xx, double Tw) {
            Xx(Xx);
            Tw(Tw);
        }

        default void Dyz(double Yy, double Zz) {
            Yy(Yy);
            Zz(Zz);
        }

        default void Dyw(double Yy, double Tw) {
            Yy(Yy);
            Tw(Tw);
        }

        default void Dzw(double Zz, double Tw) {
            Zz(Zz);
            Tw(Tw);
        }

        default void Dxyz(double Xx, double Yy, double Zz) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
        }

        default void Dxyw(double Xx, double Yy, double Tw) {
            Xx(Xx);
            Yy(Yy);
            Tw(Tw);
        }

        default void Dxzw(double Xx, double Zz, double Tw) {
            Xx(Xx);
            Zz(Zz);
            Tw(Tw);
        }

        default void Dyzw(double Yy, double Zz, double Tw) {
            Yy(Yy);
            Zz(Zz);
            Tw(Tw);
        }

        default void Dxyzw(double Xx, double Yy, double Zz, double Tw) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
            Tw(Tw);
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

        default void XYzw(
                double Xz, double Xw,
                double Yz, double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
        }

        default void zwXY(
                double Xz, double Yz,
                double Xw, double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
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

        default void YZzw(
                double Yz, double Yw,
                double Zz, double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void zwYZ(
                double Yz, double Zz,
                double Yw, double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void ZTxy(
                double Zx, double Zy,
                double Tx, double Ty
        ) {
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xyZT(
                double Zx, double Tx,
                double Zy, double Ty
        ) {
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void ZTyz(
                double Zy, double Zz,
                double Ty, double Tz
        ) {
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void yzZT(
                double Zy, double Ty,
                double Zz, double Tz
        ) {
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void ZTzw(
                double Zz, double Zw,
                double Tz, double Tw
        ) {
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void zwZT(
                double Zz, double Tz,
                double Zw, double Tw
        ) {
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
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

        default void XYZyzw(
                double Xy, double Xz, double Xw,
                double Yy, double Yz, double Yw,
                double Zy, double Zz, double Zw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void yzwXYZ(
                double Xy, double Yy, double Zy,
                double Xz, double Yz, double Zz,
                double Xw, double Yw, double Zw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void YZTxyz(
                double Yx, double Yy, double Yz,
                double Zx, double Zy, double Zz,
                double Tx, double Ty, double Tz
        ) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void xyzYZT(
                double Yx, double Zx, double Tx,
                double Yy, double Zy, double Ty,
                double Yz, double Zz, double Tz
        ) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void YZTyzw(
                double Yy, double Yz, double Yw,
                double Zy, double Zz, double Zw,
                double Ty, double Tz, double Tw
        ) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwYZT(
                double Yy, double Zy, double Ty,
                double Yz, double Zz, double Tz,
                double Yw, double Zw, double Tw
        ) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void XYZTxyzw(
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

        default void xyzwXYZT(
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

        default void Xxy(Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Xxz(Vector2.Accessible v) {
            Xxz(v.x(), v.y());
        }

        default void Xxw(Vector2.Accessible v) {
            Xxw(v.x(), v.y());
        }

        default void Xyz(Vector2.Accessible v) {
            Xyz(v.x(), v.y());
        }

        default void Xyw(Vector2.Accessible v) {
            Xyw(v.x(), v.y());
        }

        default void Xzw(Vector2.Accessible v) {
            Xzw(v.x(), v.y());
        }

        default void Xxyz(Vector3.Accessible v) {
            Xxyz(v.x(), v.y(), v.z());
        }

        default void Xxyw(Vector3.Accessible v) {
            Xxyw(v.x(), v.y(), v.z());
        }

        default void Xxzw(Vector3.Accessible v) {
            Xxzw(v.x(), v.y(), v.z());
        }

        default void Xyzw(Vector3.Accessible v) {
            Xyzw(v.x(), v.y(), v.z());
        }

        default void Xxyzw(Vector4.Accessible v) {
            Xxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Yxy(Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void Yxz(Vector2.Accessible v) {
            Yxz(v.x(), v.y());
        }

        default void Yxw(Vector2.Accessible v) {
            Yxw(v.x(), v.y());
        }

        default void Yyz(Vector2.Accessible v) {
            Yyz(v.x(), v.y());
        }

        default void Yyw(Vector2.Accessible v) {
            Yyw(v.x(), v.y());
        }

        default void Yzw(Vector2.Accessible v) {
            Yzw(v.x(), v.y());
        }

        default void Yxyz(Vector3.Accessible v) {
            Yxyz(v.x(), v.y(), v.z());
        }

        default void Yxyw(Vector3.Accessible v) {
            Yxyw(v.x(), v.y(), v.z());
        }

        default void Yxzw(Vector3.Accessible v) {
            Yxzw(v.x(), v.y(), v.z());
        }

        default void Yyzw(Vector3.Accessible v) {
            Yyzw(v.x(), v.y(), v.z());
        }

        default void Yxyzw(Vector4.Accessible v) {
            Yxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Zxy(Vector2.Accessible v) {
            Zxy(v.x(), v.y());
        }

        default void Zxz(Vector2.Accessible v) {
            Zxz(v.x(), v.y());
        }

        default void Zxw(Vector2.Accessible v) {
            Zxw(v.x(), v.y());
        }

        default void Zyz(Vector2.Accessible v) {
            Zyz(v.x(), v.y());
        }

        default void Zyw(Vector2.Accessible v) {
            Zyw(v.x(), v.y());
        }

        default void Zzw(Vector2.Accessible v) {
            Zzw(v.x(), v.y());
        }

        default void Zxyz(Vector3.Accessible v) {
            Zxyz(v.x(), v.y(), v.z());
        }

        default void Zxyw(Vector3.Accessible v) {
            Zxyw(v.x(), v.y(), v.z());
        }

        default void Zxzw(Vector3.Accessible v) {
            Zxzw(v.x(), v.y(), v.z());
        }

        default void Zyzw(Vector3.Accessible v) {
            Zyzw(v.x(), v.y(), v.z());
        }

        default void Zxyzw(Vector4.Accessible v) {
            Zxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Txy(Vector2.Accessible v) {
            Txy(v.x(), v.y());
        }

        default void Txz(Vector2.Accessible v) {
            Txz(v.x(), v.y());
        }

        default void Txw(Vector2.Accessible v) {
            Txw(v.x(), v.y());
        }

        default void Tyz(Vector2.Accessible v) {
            Tyz(v.x(), v.y());
        }

        default void Tyw(Vector2.Accessible v) {
            Tyw(v.x(), v.y());
        }

        default void Tzw(Vector2.Accessible v) {
            Tzw(v.x(), v.y());
        }

        default void Txyz(Vector3.Accessible v) {
            Txyz(v.x(), v.y(), v.z());
        }

        default void Txyw(Vector3.Accessible v) {
            Txyw(v.x(), v.y(), v.z());
        }

        default void Txzw(Vector3.Accessible v) {
            Txzw(v.x(), v.y(), v.z());
        }

        default void Tyzw(Vector3.Accessible v) {
            Tyzw(v.x(), v.y(), v.z());
        }

        default void Txyzw(Vector4.Accessible v) {
            Txyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void xXY(Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void xXZ(Vector2.Accessible v) {
            xXZ(v.x(), v.y());
        }

        default void xXT(Vector2.Accessible v) {
            xXT(v.x(), v.y());
        }

        default void xYZ(Vector2.Accessible v) {
            xYZ(v.x(), v.y());
        }

        default void xYT(Vector2.Accessible v) {
            xYT(v.x(), v.y());
        }

        default void xZT(Vector2.Accessible v) {
            xZT(v.x(), v.y());
        }

        default void xXYZ(Vector3.Accessible v) {
            xXYZ(v.x(), v.y(), v.z());
        }

        default void xXYT(Vector3.Accessible v) {
            xXYT(v.x(), v.y(), v.z());
        }

        default void xXZT(Vector3.Accessible v) {
            xXZT(v.x(), v.y(), v.z());
        }

        default void xYZT(Vector3.Accessible v) {
            xYZT(v.x(), v.y(), v.z());
        }

        default void xXYZT(Vector4.Accessible v) {
            xXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void yXY(Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void yXZ(Vector2.Accessible v) {
            yXZ(v.x(), v.y());
        }

        default void yXT(Vector2.Accessible v) {
            yXT(v.x(), v.y());
        }

        default void yYZ(Vector2.Accessible v) {
            yYZ(v.x(), v.y());
        }

        default void yYT(Vector2.Accessible v) {
            yYT(v.x(), v.y());
        }

        default void yZT(Vector2.Accessible v) {
            yZT(v.x(), v.y());
        }

        default void yXYZ(Vector3.Accessible v) {
            yXYZ(v.x(), v.y(), v.z());
        }

        default void yXYT(Vector3.Accessible v) {
            yXYT(v.x(), v.y(), v.z());
        }

        default void yXZT(Vector3.Accessible v) {
            yXZT(v.x(), v.y(), v.z());
        }

        default void yYZT(Vector3.Accessible v) {
            yYZT(v.x(), v.y(), v.z());
        }

        default void yXYZT(Vector4.Accessible v) {
            yXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void zXY(Vector2.Accessible v) {
            zXY(v.x(), v.y());
        }

        default void zXZ(Vector2.Accessible v) {
            zXZ(v.x(), v.y());
        }

        default void zXT(Vector2.Accessible v) {
            zXT(v.x(), v.y());
        }

        default void zYZ(Vector2.Accessible v) {
            zYZ(v.x(), v.y());
        }

        default void zYT(Vector2.Accessible v) {
            zYT(v.x(), v.y());
        }

        default void zZT(Vector2.Accessible v) {
            zZT(v.x(), v.y());
        }

        default void zXYZ(Vector3.Accessible v) {
            zXYZ(v.x(), v.y(), v.z());
        }

        default void zXYT(Vector3.Accessible v) {
            zXYT(v.x(), v.y(), v.z());
        }

        default void zXZT(Vector3.Accessible v) {
            zXZT(v.x(), v.y(), v.z());
        }

        default void zYZT(Vector3.Accessible v) {
            zYZT(v.x(), v.y(), v.z());
        }

        default void zXYZT(Vector4.Accessible v) {
            zXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void wXY(Vector2.Accessible v) {
            wXY(v.x(), v.y());
        }

        default void wXZ(Vector2.Accessible v) {
            wXZ(v.x(), v.y());
        }

        default void wXT(Vector2.Accessible v) {
            wXT(v.x(), v.y());
        }

        default void wYZ(Vector2.Accessible v) {
            wYZ(v.x(), v.y());
        }

        default void wYT(Vector2.Accessible v) {
            wYT(v.x(), v.y());
        }

        default void wZT(Vector2.Accessible v) {
            wZT(v.x(), v.y());
        }

        default void wXYZ(Vector3.Accessible v) {
            wXYZ(v.x(), v.y(), v.z());
        }

        default void wXYT(Vector3.Accessible v) {
            wXYT(v.x(), v.y(), v.z());
        }

        default void wXZT(Vector3.Accessible v) {
            wXZT(v.x(), v.y(), v.z());
        }

        default void wYZT(Vector3.Accessible v) {
            wYZT(v.x(), v.y(), v.z());
        }

        default void wXYZT(Vector4.Accessible v) {
            wXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void Dxy(Vector2.Accessible v) {
            Dxy(v.x(), v.y());
        }

        default void Dxz(Vector2.Accessible v) {
            Dxz(v.x(), v.y());
        }

        default void Dxw(Vector2.Accessible v) {
            Dxw(v.x(), v.y());
        }

        default void Dyz(Vector2.Accessible v) {
            Dyz(v.x(), v.y());
        }

        default void Dyw(Vector2.Accessible v) {
            Dyw(v.x(), v.y());
        }

        default void Dzw(Vector2.Accessible v) {
            Dzw(v.x(), v.y());
        }

        default void Dxyz(Vector3.Accessible v) {
            Dxyz(v.x(), v.y(), v.z());
        }

        default void Dxyw(Vector3.Accessible v) {
            Dxyw(v.x(), v.y(), v.z());
        }

        default void Dxzw(Vector3.Accessible v) {
            Dxzw(v.x(), v.y(), v.z());
        }

        default void Dyzw(Vector3.Accessible v) {
            Dyzw(v.x(), v.y(), v.z());
        }

        default void Dxyzw(Vector4.Accessible v) {
            Dxyzw(v.x(), v.y(), v.z(), v.w());
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

        default void XYzw(Matrix2x2.Accessible m) {
            XYzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXY(Matrix2x2.Accessible m) {
            zwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
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

        default void YZzw(Matrix2x2.Accessible m) {
            YZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwYZ(Matrix2x2.Accessible m) {
            zwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxy(Matrix2x2.Accessible m) {
            ZTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyZT(Matrix2x2.Accessible m) {
            xyZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTyz(Matrix2x2.Accessible m) {
            ZTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzZT(Matrix2x2.Accessible m) {
            yzZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTzw(Matrix2x2.Accessible m) {
            ZTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwZT(Matrix2x2.Accessible m) {
            zwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxyz(Matrix3x3.Accessible m) {
            XYZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzXYZ(Matrix3x3.Accessible m) {
            xyzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZyzw(Matrix3x3.Accessible m) {
            XYZyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwXYZ(Matrix3x3.Accessible m) {
            yzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTxyz(Matrix3x3.Accessible m) {
            YZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzYZT(Matrix3x3.Accessible m) {
            xyzYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTyzw(Matrix3x3.Accessible m) {
            YZTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwYZT(Matrix3x3.Accessible m) {
            yzwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZTxyzw(Matrix4x4.Accessible m) {
            XYZTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

        default void xyzwXYZT(Matrix4x4.Accessible m) {
            xyzwXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
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

        default Vector2.Mutable $Xxw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xw(y); }
            };
        }

        default Vector2.Mutable $Xyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Xz(y); }
            };
        }

        default Vector2.Mutable $Xyw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Xw(y); }
            };
        }

        default Vector2.Mutable $Xzw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Xw(y); }
            };
        }

        default Vector3.Mutable $Xxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
                public void z(double z) { Mutable.this.Xz(z); }
            };
        }

        default Vector3.Mutable $Xxyw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
                public void z(double z) { Mutable.this.Xw(z); }
            };
        }

        default Vector3.Mutable $Xxzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xz(y); }
                public void z(double z) { Mutable.this.Xw(z); }
            };
        }

        default Vector3.Mutable $Xyzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Xz(y); }
                public void z(double z) { Mutable.this.Xw(z); }
            };
        }

        default Vector4.Mutable $Xxyzw() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Xy(y); }
                public void z(double z) { Mutable.this.Xz(z); }
                public void w(double w) { Mutable.this.Xw(w); }
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

        default Vector2.Mutable $Yxw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yw(y); }
            };
        }

        default Vector2.Mutable $Yyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Yz(y); }
            };
        }

        default Vector2.Mutable $Yyw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Yw(y); }
            };
        }

        default Vector2.Mutable $Yzw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Yw(y); }
            };
        }

        default Vector3.Mutable $Yxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Yz(z); }
            };
        }

        default Vector3.Mutable $Yxyw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Yw(z); }
            };
        }

        default Vector3.Mutable $Yxzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Yw(z); }
            };
        }

        default Vector3.Mutable $Yyzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Yw(z); }
            };
        }

        default Vector4.Mutable $Yxyzw() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Yz(z); }
                public void w(double w) { Mutable.this.Yw(w); }
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

        default Vector2.Mutable $Zxw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector2.Mutable $Zyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zy(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $Zyw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zy(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector2.Mutable $Zzw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zz(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector3.Mutable $Zxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector3.Mutable $Zxyw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Zw(z); }
            };
        }

        default Vector3.Mutable $Zxzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Zw(z); }
            };
        }

        default Vector3.Mutable $Zyzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Zy(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Zw(z); }
            };
        }

        default Vector4.Mutable $Zxyzw() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
                public void w(double w) { Mutable.this.Zw(w); }
            };
        }

        default Vector2.Mutable $Txy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector2.Mutable $Txz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector2.Mutable $Txw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $Tyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Ty(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector2.Mutable $Tyw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Ty(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $Tzw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Tz(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector3.Mutable $Txyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Ty(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector3.Mutable $Txyw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Ty(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $Txzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Tz(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $Tyzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Ty(x); }
                public void y(double y) { Mutable.this.Tz(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector4.Mutable $Txyzw() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Tx(x); }
                public void y(double y) { Mutable.this.Ty(y); }
                public void z(double z) { Mutable.this.Tz(z); }
                public void w(double w) { Mutable.this.Tw(w); }
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

        default Vector2.Mutable $xXT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Tx(y); }
            };
        }

        default Vector2.Mutable $xYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
            };
        }

        default Vector2.Mutable $xYT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Tx(y); }
            };
        }

        default Vector2.Mutable $xZT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Tx(y); }
            };
        }

        default Vector3.Mutable $xXYZ() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Zx(z); }
            };
        }

        default Vector3.Mutable $xXYT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Tx(z); }
            };
        }

        default Vector3.Mutable $xXZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
                public void z(double z) { Mutable.this.Tx(z); }
            };
        }

        default Vector3.Mutable $xYZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
                public void z(double z) { Mutable.this.Tx(z); }
            };
        }

        default Vector4.Mutable $xXYZT() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Zx(z); }
                public void w(double w) { Mutable.this.Tx(w); }
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

        default Vector2.Mutable $yXT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector2.Mutable $yYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector2.Mutable $yYT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector2.Mutable $yZT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zy(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector3.Mutable $yXYZ() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zy(z); }
            };
        }

        default Vector3.Mutable $yXYT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Ty(z); }
            };
        }

        default Vector3.Mutable $yXZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Ty(z); }
            };
        }

        default Vector3.Mutable $yYZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Ty(z); }
            };
        }

        default Vector4.Mutable $yXYZT() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zy(z); }
                public void w(double w) { Mutable.this.Ty(w); }
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

        default Vector2.Mutable $zXT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector2.Mutable $zYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $zYT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector2.Mutable $zZT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zz(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector3.Mutable $zXYZ() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector3.Mutable $zXYT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector3.Mutable $zXZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector3.Mutable $zYZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector4.Mutable $zXYZT() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Zz(z); }
                public void w(double w) { Mutable.this.Tz(w); }
            };
        }

        default Vector2.Mutable $wXY() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
            };
        }

        default Vector2.Mutable $wXZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector2.Mutable $wXT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $wYZ() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector2.Mutable $wYT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yw(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $wZT() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zw(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector3.Mutable $wXYZ() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
                public void z(double z) { Mutable.this.Zw(z); }
            };
        }

        default Vector3.Mutable $wXYT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $wXZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $wYZT() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector4.Mutable $wXYZT() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
                public void z(double z) { Mutable.this.Zw(z); }
                public void w(double w) { Mutable.this.Tw(w); }
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

        default Vector2.Mutable $Dxw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $Dyz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $Dyw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $Dzw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zz(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector3.Mutable $Dxyz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector3.Mutable $Dxyw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $Dxzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $Dyzw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector4.Mutable $Dxyzw() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zz(z); }
                public void w(double w) { Mutable.this.Tw(w); }
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

        default Matrix2x2.Mutable $XYzw() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xz(Xx); }
                public void Xy(double Xy) { Mutable.this.Xw(Xy); }
                public void Yx(double Yx) { Mutable.this.Yz(Yx); }
                public void Yy(double Yy) { Mutable.this.Yw(Yy); }
            };
        }

        default Matrix2x2.Mutable $zwXY() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xz(Xx); }
                public void Xy(double Xy) { Mutable.this.Yz(Xy); }
                public void Yx(double Yx) { Mutable.this.Xw(Yx); }
                public void Yy(double Yy) { Mutable.this.Yw(Yy); }
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

        default Matrix2x2.Mutable $YZzw() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yz(Xx); }
                public void Xy(double Xy) { Mutable.this.Yw(Xy); }
                public void Yx(double Yx) { Mutable.this.Zz(Yx); }
                public void Yy(double Yy) { Mutable.this.Zw(Yy); }
            };
        }

        default Matrix2x2.Mutable $zwYZ() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yz(Xx); }
                public void Xy(double Xy) { Mutable.this.Zz(Xy); }
                public void Yx(double Yx) { Mutable.this.Yw(Yx); }
                public void Yy(double Yy) { Mutable.this.Zw(Yy); }
            };
        }

        default Matrix2x2.Mutable $ZTxy() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Zx(Xx); }
                public void Xy(double Xy) { Mutable.this.Zy(Xy); }
                public void Yx(double Yx) { Mutable.this.Tx(Yx); }
                public void Yy(double Yy) { Mutable.this.Ty(Yy); }
            };
        }

        default Matrix2x2.Mutable $xyZT() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Zx(Xx); }
                public void Xy(double Xy) { Mutable.this.Tx(Xy); }
                public void Yx(double Yx) { Mutable.this.Zy(Yx); }
                public void Yy(double Yy) { Mutable.this.Ty(Yy); }
            };
        }

        default Matrix2x2.Mutable $ZTyz() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Zy(Xx); }
                public void Xy(double Xy) { Mutable.this.Zz(Xy); }
                public void Yx(double Yx) { Mutable.this.Ty(Yx); }
                public void Yy(double Yy) { Mutable.this.Tz(Yy); }
            };
        }

        default Matrix2x2.Mutable $yzZT() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Zy(Xx); }
                public void Xy(double Xy) { Mutable.this.Ty(Xy); }
                public void Yx(double Yx) { Mutable.this.Zz(Yx); }
                public void Yy(double Yy) { Mutable.this.Tz(Yy); }
            };
        }

        default Matrix2x2.Mutable $ZTzw() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Zz(Xx); }
                public void Xy(double Xy) { Mutable.this.Zw(Xy); }
                public void Yx(double Yx) { Mutable.this.Tz(Yx); }
                public void Yy(double Yy) { Mutable.this.Tw(Yy); }
            };
        }

        default Matrix2x2.Mutable $zwZT() {
            return new Matrix2x2.Mutable() {
                public void Xx(double Xx) { Mutable.this.Zz(Xx); }
                public void Xy(double Xy) { Mutable.this.Tz(Xy); }
                public void Yx(double Yx) { Mutable.this.Zw(Yx); }
                public void Yy(double Yy) { Mutable.this.Tw(Yy); }
            };
        }

        default Matrix3x3.Mutable $XYZxyz() {
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

        default Matrix3x3.Mutable $XYZyzw() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xy(Xx); }
                public void Xy(double Xy) { Mutable.this.Xz(Xy); }
                public void Xz(double Xz) { Mutable.this.Xw(Xz); }
                public void Yx(double Yx) { Mutable.this.Yy(Yx); }
                public void Yy(double Yy) { Mutable.this.Yz(Yy); }
                public void Yz(double Yz) { Mutable.this.Yw(Yz); }
                public void Zx(double Zx) { Mutable.this.Zy(Zx); }
                public void Zy(double Zy) { Mutable.this.Zz(Zy); }
                public void Zz(double Zz) { Mutable.this.Zw(Zz); }
            };
        }

        default Matrix3x3.Mutable $yzwXYZ() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Xy(Xx); }
                public void Xy(double Xy) { Mutable.this.Yy(Xy); }
                public void Xz(double Xz) { Mutable.this.Zy(Xz); }
                public void Yx(double Yx) { Mutable.this.Xz(Yx); }
                public void Yy(double Yy) { Mutable.this.Yz(Yy); }
                public void Yz(double Yz) { Mutable.this.Zz(Yz); }
                public void Zx(double Zx) { Mutable.this.Xw(Zx); }
                public void Zy(double Zy) { Mutable.this.Yw(Zy); }
                public void Zz(double Zz) { Mutable.this.Zw(Zz); }
            };
        }

        default Matrix3x3.Mutable $YZTxyz() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yx(Xx); }
                public void Xy(double Xy) { Mutable.this.Yy(Xy); }
                public void Xz(double Xz) { Mutable.this.Yz(Xz); }
                public void Yx(double Yx) { Mutable.this.Zx(Yx); }
                public void Yy(double Yy) { Mutable.this.Zy(Yy); }
                public void Yz(double Yz) { Mutable.this.Zz(Yz); }
                public void Zx(double Zx) { Mutable.this.Tx(Zx); }
                public void Zy(double Zy) { Mutable.this.Ty(Zy); }
                public void Zz(double Zz) { Mutable.this.Tz(Zz); }
            };
        }

        default Matrix3x3.Mutable $xyzYZT() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yx(Xx); }
                public void Xy(double Xy) { Mutable.this.Zx(Xy); }
                public void Xz(double Xz) { Mutable.this.Tx(Xz); }
                public void Yx(double Yx) { Mutable.this.Yy(Yx); }
                public void Yy(double Yy) { Mutable.this.Zy(Yy); }
                public void Yz(double Yz) { Mutable.this.Ty(Yz); }
                public void Zx(double Zx) { Mutable.this.Yz(Zx); }
                public void Zy(double Zy) { Mutable.this.Zz(Zy); }
                public void Zz(double Zz) { Mutable.this.Tz(Zz); }
            };
        }

        default Matrix3x3.Mutable $YZTyzw() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yy(Xx); }
                public void Xy(double Xy) { Mutable.this.Yz(Xy); }
                public void Xz(double Xz) { Mutable.this.Yw(Xz); }
                public void Yx(double Yx) { Mutable.this.Zy(Yx); }
                public void Yy(double Yy) { Mutable.this.Zz(Yy); }
                public void Yz(double Yz) { Mutable.this.Zw(Yz); }
                public void Zx(double Zx) { Mutable.this.Ty(Zx); }
                public void Zy(double Zy) { Mutable.this.Tz(Zy); }
                public void Zz(double Zz) { Mutable.this.Tw(Zz); }
            };
        }

        default Matrix3x3.Mutable $yzwYZT() {
            return new Matrix3x3.Mutable() {
                public void Xx(double Xx) { Mutable.this.Yy(Xx); }
                public void Xy(double Xy) { Mutable.this.Zy(Xy); }
                public void Xz(double Xz) { Mutable.this.Ty(Xz); }
                public void Yx(double Yx) { Mutable.this.Yz(Yx); }
                public void Yy(double Yy) { Mutable.this.Zz(Yy); }
                public void Yz(double Yz) { Mutable.this.Tz(Yz); }
                public void Zx(double Zx) { Mutable.this.Yw(Zx); }
                public void Zy(double Zy) { Mutable.this.Zw(Zy); }
                public void Zz(double Zz) { Mutable.this.Tw(Zz); }
            };
        }

        default Matrix4x4.Mutable $XYZTxyzw() {
            return this;
        }

        default Matrix4x4.Mutable $xyzwXYZT() {
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

        default Vector2.AccessibleAndMutable $Xxw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xw(y); }
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

        default Vector2.AccessibleAndMutable $Xyw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Xw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Xzw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Xw(y); }
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

        default Vector3.AccessibleAndMutable $Xxyw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xy(); }
                public double z() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xy(y); }
                public void z(double z) { AccessibleAndMutable.this.Xw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Xxzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Xz(); }
                public double z() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Xz(y); }
                public void z(double z) { AccessibleAndMutable.this.Xw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Xyzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Xz(); }
                public double z() { return AccessibleAndMutable.this.Xw(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Xz(y); }
                public void z(double z) { AccessibleAndMutable.this.Xw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $Xxyzw() {
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

        default Vector2.AccessibleAndMutable $Yxw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
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

        default Vector2.AccessibleAndMutable $Yyw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Yzw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
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

        default Vector3.AccessibleAndMutable $Yxyw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Yw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Yxzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public double z() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
                public void z(double z) { AccessibleAndMutable.this.Yw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Yyzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public double z() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
                public void z(double z) { AccessibleAndMutable.this.Yw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $Yxyzw() {
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

        default Vector2.AccessibleAndMutable $Zxw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
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

        default Vector2.AccessibleAndMutable $Zyw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zy(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Zzw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zz(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
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

        default Vector3.AccessibleAndMutable $Zxyw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Zxzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Zw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Zyzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zy(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Zy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Zw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $Zxyzw() {
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

        default Vector2.AccessibleAndMutable $Txy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Txz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Txw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Tyz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Ty(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Ty(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Tyw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Ty(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Ty(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Tzw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tz(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Tz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector3.AccessibleAndMutable $Txyz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Txyw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Txzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Tx(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Tx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Tyzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Ty(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Ty(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $Txyzw() {
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

        default Vector2.AccessibleAndMutable $xXT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tx(y); }
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

        default Vector2.AccessibleAndMutable $xYT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $xZT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tx(y); }
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

        default Vector3.AccessibleAndMutable $xXYT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public double z() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
                public void z(double z) { AccessibleAndMutable.this.Tx(z); }
            };
        }

        default Vector3.AccessibleAndMutable $xXZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public double z() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
                public void z(double z) { AccessibleAndMutable.this.Tx(z); }
            };
        }

        default Vector3.AccessibleAndMutable $xYZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public double z() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
                public void z(double z) { AccessibleAndMutable.this.Tx(z); }
            };
        }

        default Vector4.AccessibleAndMutable $xXYZT() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public double z() { return AccessibleAndMutable.this.Zx(); }
                public double w() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
                public void z(double z) { AccessibleAndMutable.this.Zx(z); }
                public void w(double w) { AccessibleAndMutable.this.Tx(w); }
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

        default Vector2.AccessibleAndMutable $yXT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
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

        default Vector2.AccessibleAndMutable $yYT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
            };
        }

        default Vector2.AccessibleAndMutable $yZT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zy(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Zy(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
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

        default Vector3.AccessibleAndMutable $yXYT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Ty(z); }
            };
        }

        default Vector3.AccessibleAndMutable $yXZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Ty(z); }
            };
        }

        default Vector3.AccessibleAndMutable $yYZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Ty(z); }
            };
        }

        default Vector4.AccessibleAndMutable $yXYZT() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Zy(); }
                public double w() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Zy(z); }
                public void w(double w) { AccessibleAndMutable.this.Ty(w); }
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

        default Vector2.AccessibleAndMutable $zXT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
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

        default Vector2.AccessibleAndMutable $zYT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $zZT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zz(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Zz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
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

        default Vector3.AccessibleAndMutable $zXYT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $zXZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $zYZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector4.AccessibleAndMutable $zXYZT() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public double z() { return AccessibleAndMutable.this.Zz(); }
                public double w() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
                public void z(double z) { AccessibleAndMutable.this.Zz(z); }
                public void w(double w) { AccessibleAndMutable.this.Tz(w); }
            };
        }

        default Vector2.AccessibleAndMutable $wXY() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $wXZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $wXT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $wYZ() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Yw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $wYT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yw(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Yw(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $wZT() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zw(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Zw(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector3.AccessibleAndMutable $wXYZ() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public double z() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
                public void z(double z) { AccessibleAndMutable.this.Zw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $wXYT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $wXZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $wYZT() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Yw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $wXYZT() {
            return new Vector4.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public double z() { return AccessibleAndMutable.this.Zw(); }
                public double w() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
                public void z(double z) { AccessibleAndMutable.this.Zw(z); }
                public void w(double w) { AccessibleAndMutable.this.Tw(w); }
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

        default Vector2.AccessibleAndMutable $Dxw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
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

        default Vector2.AccessibleAndMutable $Dyw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $Dzw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zz(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Zz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
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

        default Vector3.AccessibleAndMutable $Dxyw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Dxzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $Dyzw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $Dxyzw() {
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

        default Matrix2x2.AccessibleAndMutable $XYzw() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xz(); }
                public double Xy() { return AccessibleAndMutable.this.Xw(); }
                public double Yx() { return AccessibleAndMutable.this.Yz(); }
                public double Yy() { return AccessibleAndMutable.this.Yw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xz(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Xw(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yw(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $zwXY() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xz(); }
                public double Xy() { return AccessibleAndMutable.this.Yz(); }
                public double Yx() { return AccessibleAndMutable.this.Xw(); }
                public double Yy() { return AccessibleAndMutable.this.Yw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xz(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yz(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Xw(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yw(Yy); }
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

        default Matrix2x2.AccessibleAndMutable $YZzw() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yz(); }
                public double Xy() { return AccessibleAndMutable.this.Yw(); }
                public double Yx() { return AccessibleAndMutable.this.Zz(); }
                public double Yy() { return AccessibleAndMutable.this.Zw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yz(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yw(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zw(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $zwYZ() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yz(); }
                public double Xy() { return AccessibleAndMutable.this.Zz(); }
                public double Yx() { return AccessibleAndMutable.this.Yw(); }
                public double Yy() { return AccessibleAndMutable.this.Zw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yz(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zz(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yw(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zw(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $ZTxy() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Zx(); }
                public double Xy() { return AccessibleAndMutable.this.Zy(); }
                public double Yx() { return AccessibleAndMutable.this.Tx(); }
                public double Yy() { return AccessibleAndMutable.this.Ty(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Zx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zy(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Tx(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Ty(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $xyZT() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Zx(); }
                public double Xy() { return AccessibleAndMutable.this.Tx(); }
                public double Yx() { return AccessibleAndMutable.this.Zy(); }
                public double Yy() { return AccessibleAndMutable.this.Ty(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Zx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Tx(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Ty(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $ZTyz() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Zy(); }
                public double Xy() { return AccessibleAndMutable.this.Zz(); }
                public double Yx() { return AccessibleAndMutable.this.Ty(); }
                public double Yy() { return AccessibleAndMutable.this.Tz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Zy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zz(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Ty(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Tz(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $yzZT() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Zy(); }
                public double Xy() { return AccessibleAndMutable.this.Ty(); }
                public double Yx() { return AccessibleAndMutable.this.Zz(); }
                public double Yy() { return AccessibleAndMutable.this.Tz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Zy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Ty(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Tz(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $ZTzw() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Zz(); }
                public double Xy() { return AccessibleAndMutable.this.Zw(); }
                public double Yx() { return AccessibleAndMutable.this.Tz(); }
                public double Yy() { return AccessibleAndMutable.this.Tw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Zz(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zw(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Tz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Tw(Yy); }
            };
        }

        default Matrix2x2.AccessibleAndMutable $zwZT() {
            return new Matrix2x2.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Zz(); }
                public double Xy() { return AccessibleAndMutable.this.Tz(); }
                public double Yx() { return AccessibleAndMutable.this.Zw(); }
                public double Yy() { return AccessibleAndMutable.this.Tw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Zz(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Tz(Xy); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zw(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Tw(Yy); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $XYZxyz() {
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

        default Matrix3x3.AccessibleAndMutable $XYZyzw() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xy(); }
                public double Xy() { return AccessibleAndMutable.this.Xz(); }
                public double Xz() { return AccessibleAndMutable.this.Xw(); }
                public double Yx() { return AccessibleAndMutable.this.Yy(); }
                public double Yy() { return AccessibleAndMutable.this.Yz(); }
                public double Yz() { return AccessibleAndMutable.this.Yw(); }
                public double Zx() { return AccessibleAndMutable.this.Zy(); }
                public double Zy() { return AccessibleAndMutable.this.Zz(); }
                public double Zz() { return AccessibleAndMutable.this.Zw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Xz(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Xw(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yz(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Yw(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Zy(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Zz(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Zw(Zz); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $yzwXYZ() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Xy(); }
                public double Xy() { return AccessibleAndMutable.this.Yy(); }
                public double Xz() { return AccessibleAndMutable.this.Zy(); }
                public double Yx() { return AccessibleAndMutable.this.Xz(); }
                public double Yy() { return AccessibleAndMutable.this.Yz(); }
                public double Yz() { return AccessibleAndMutable.this.Zz(); }
                public double Zx() { return AccessibleAndMutable.this.Xw(); }
                public double Zy() { return AccessibleAndMutable.this.Yw(); }
                public double Zz() { return AccessibleAndMutable.this.Zw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Xy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yy(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Zy(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Xz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Yz(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Zz(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Xw(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Yw(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Zw(Zz); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $YZTxyz() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yx(); }
                public double Xy() { return AccessibleAndMutable.this.Yy(); }
                public double Xz() { return AccessibleAndMutable.this.Yz(); }
                public double Yx() { return AccessibleAndMutable.this.Zx(); }
                public double Yy() { return AccessibleAndMutable.this.Zy(); }
                public double Yz() { return AccessibleAndMutable.this.Zz(); }
                public double Zx() { return AccessibleAndMutable.this.Tx(); }
                public double Zy() { return AccessibleAndMutable.this.Ty(); }
                public double Zz() { return AccessibleAndMutable.this.Tz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yy(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Yz(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zx(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zy(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Zz(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Tx(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Ty(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Tz(Zz); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $xyzYZT() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yx(); }
                public double Xy() { return AccessibleAndMutable.this.Zx(); }
                public double Xz() { return AccessibleAndMutable.this.Tx(); }
                public double Yx() { return AccessibleAndMutable.this.Yy(); }
                public double Yy() { return AccessibleAndMutable.this.Zy(); }
                public double Yz() { return AccessibleAndMutable.this.Ty(); }
                public double Zx() { return AccessibleAndMutable.this.Yz(); }
                public double Zy() { return AccessibleAndMutable.this.Zz(); }
                public double Zz() { return AccessibleAndMutable.this.Tz(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yx(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zx(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Tx(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zy(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Ty(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Yz(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Zz(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Tz(Zz); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $YZTyzw() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yy(); }
                public double Xy() { return AccessibleAndMutable.this.Yz(); }
                public double Xz() { return AccessibleAndMutable.this.Yw(); }
                public double Yx() { return AccessibleAndMutable.this.Zy(); }
                public double Yy() { return AccessibleAndMutable.this.Zz(); }
                public double Yz() { return AccessibleAndMutable.this.Zw(); }
                public double Zx() { return AccessibleAndMutable.this.Ty(); }
                public double Zy() { return AccessibleAndMutable.this.Tz(); }
                public double Zz() { return AccessibleAndMutable.this.Tw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Yz(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Yw(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Zy(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zz(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Zw(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Ty(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Tz(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Tw(Zz); }
            };
        }

        default Matrix3x3.AccessibleAndMutable $yzwYZT() {
            return new Matrix3x3.AccessibleAndMutable() {
                public double Xx() { return AccessibleAndMutable.this.Yy(); }
                public double Xy() { return AccessibleAndMutable.this.Zy(); }
                public double Xz() { return AccessibleAndMutable.this.Ty(); }
                public double Yx() { return AccessibleAndMutable.this.Yz(); }
                public double Yy() { return AccessibleAndMutable.this.Zz(); }
                public double Yz() { return AccessibleAndMutable.this.Tz(); }
                public double Zx() { return AccessibleAndMutable.this.Yw(); }
                public double Zy() { return AccessibleAndMutable.this.Zw(); }
                public double Zz() { return AccessibleAndMutable.this.Tw(); }
                public void Xx(double Xx) { AccessibleAndMutable.this.Yy(Xx); }
                public void Xy(double Xy) { AccessibleAndMutable.this.Zy(Xy); }
                public void Xz(double Xz) { AccessibleAndMutable.this.Ty(Xz); }
                public void Yx(double Yx) { AccessibleAndMutable.this.Yz(Yx); }
                public void Yy(double Yy) { AccessibleAndMutable.this.Zz(Yy); }
                public void Yz(double Yz) { AccessibleAndMutable.this.Tz(Yz); }
                public void Zx(double Zx) { AccessibleAndMutable.this.Yw(Zx); }
                public void Zy(double Zy) { AccessibleAndMutable.this.Zw(Zy); }
                public void Zz(double Zz) { AccessibleAndMutable.this.Tw(Zz); }
            };
        }

        default Matrix4x4.AccessibleAndMutable $XYZTxyzw() {
            return this;
        }

        default Matrix4x4.AccessibleAndMutable $xyzwXYZT() {
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

        void XYZTxyzw(
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
