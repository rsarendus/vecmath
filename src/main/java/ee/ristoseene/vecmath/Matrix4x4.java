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

        default Vector2.Accessible const$XTx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Tx(); }
            };
        }

        default Vector2.Accessible const$YZx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Zx(); }
            };
        }

        default Vector2.Accessible const$YTx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Tx(); }
            };
        }

        default Vector2.Accessible const$ZTx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zx(); }
                public double y() { return Accessible.this.Tx(); }
            };
        }

        default Vector3.Accessible const$XYZx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Zx(); }
            };
        }

        default Vector3.Accessible const$XYTx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Tx(); }
            };
        }

        default Vector3.Accessible const$XZTx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Zx(); }
                public double z() { return Accessible.this.Tx(); }
            };
        }

        default Vector3.Accessible const$YZTx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yx(); }
                public double y() { return Accessible.this.Zx(); }
                public double z() { return Accessible.this.Tx(); }
            };
        }

        default Vector4.Accessible const$XYZTx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xx(); }
                public double y() { return Accessible.this.Yx(); }
                public double z() { return Accessible.this.Zx(); }
                public double w() { return Accessible.this.Tx(); }
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

        default Vector2.Accessible const$XTy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector2.Accessible const$YZy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zy(); }
            };
        }

        default Vector2.Accessible const$YTy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector2.Accessible const$ZTy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zy(); }
                public double y() { return Accessible.this.Ty(); }
            };
        }

        default Vector3.Accessible const$XYZy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zy(); }
            };
        }

        default Vector3.Accessible const$XYTy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Ty(); }
            };
        }

        default Vector3.Accessible const$XZTy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Ty(); }
            };
        }

        default Vector3.Accessible const$YZTy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yy(); }
                public double y() { return Accessible.this.Zy(); }
                public double z() { return Accessible.this.Ty(); }
            };
        }

        default Vector4.Accessible const$XYZTy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xy(); }
                public double y() { return Accessible.this.Yy(); }
                public double z() { return Accessible.this.Zy(); }
                public double w() { return Accessible.this.Ty(); }
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

        default Vector2.Accessible const$XTz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$YZz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Zz(); }
            };
        }

        default Vector2.Accessible const$YTz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$ZTz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zz(); }
                public double y() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$XYZz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Zz(); }
            };
        }

        default Vector3.Accessible const$XYTz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$XZTz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector3.Accessible const$YZTz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yz(); }
                public double y() { return Accessible.this.Zz(); }
                public double z() { return Accessible.this.Tz(); }
            };
        }

        default Vector4.Accessible const$XYZTz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.Xz(); }
                public double y() { return Accessible.this.Yz(); }
                public double z() { return Accessible.this.Zz(); }
                public double w() { return Accessible.this.Tz(); }
            };
        }

        default Vector2.Accessible const$XYw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
            };
        }

        default Vector2.Accessible const$XZw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$XTw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$YZw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yw(); }
                public double y() { return Accessible.this.Zw(); }
            };
        }

        default Vector2.Accessible const$YTw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Yw(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector2.Accessible const$ZTw() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.Zw(); }
                public double y() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$XYZw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
                public double z() { return Accessible.this.Zw(); }
            };
        }

        default Vector3.Accessible const$XYTw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Yw(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$XZTw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Xw(); }
                public double y() { return Accessible.this.Zw(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector3.Accessible const$YZTw() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.Yw(); }
                public double y() { return Accessible.this.Zw(); }
                public double z() { return Accessible.this.Tw(); }
            };
        }

        default Vector4.Accessible const$XYZTw() {
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

        default Vector2.Accessible $XYx() {
            return const$XYx();
        }

        default Vector2.Accessible $XZx() {
            return const$XZx();
        }

        default Vector2.Accessible $XTx() {
            return const$XTx();
        }

        default Vector2.Accessible $YZx() {
            return const$YZx();
        }

        default Vector2.Accessible $YTx() {
            return const$YTx();
        }

        default Vector2.Accessible $ZTx() {
            return const$ZTx();
        }

        default Vector3.Accessible $XYZx() {
            return const$XYZx();
        }

        default Vector3.Accessible $XYTx() {
            return const$XYTx();
        }

        default Vector3.Accessible $XZTx() {
            return const$XZTx();
        }

        default Vector3.Accessible $YZTx() {
            return const$YZTx();
        }

        default Vector4.Accessible $XYZTx() {
            return const$XYZTx();
        }

        default Vector2.Accessible $XYy() {
            return const$XYy();
        }

        default Vector2.Accessible $XZy() {
            return const$XZy();
        }

        default Vector2.Accessible $XTy() {
            return const$XTy();
        }

        default Vector2.Accessible $YZy() {
            return const$YZy();
        }

        default Vector2.Accessible $YTy() {
            return const$YTy();
        }

        default Vector2.Accessible $ZTy() {
            return const$ZTy();
        }

        default Vector3.Accessible $XYZy() {
            return const$XYZy();
        }

        default Vector3.Accessible $XYTy() {
            return const$XYTy();
        }

        default Vector3.Accessible $XZTy() {
            return const$XZTy();
        }

        default Vector3.Accessible $YZTy() {
            return const$YZTy();
        }

        default Vector4.Accessible $XYZTy() {
            return const$XYZTy();
        }

        default Vector2.Accessible $XYz() {
            return const$XYz();
        }

        default Vector2.Accessible $XZz() {
            return const$XZz();
        }

        default Vector2.Accessible $XTz() {
            return const$XTz();
        }

        default Vector2.Accessible $YZz() {
            return const$YZz();
        }

        default Vector2.Accessible $YTz() {
            return const$YTz();
        }

        default Vector2.Accessible $ZTz() {
            return const$ZTz();
        }

        default Vector3.Accessible $XYZz() {
            return const$XYZz();
        }

        default Vector3.Accessible $XYTz() {
            return const$XYTz();
        }

        default Vector3.Accessible $XZTz() {
            return const$XZTz();
        }

        default Vector3.Accessible $YZTz() {
            return const$YZTz();
        }

        default Vector4.Accessible $XYZTz() {
            return const$XYZTz();
        }

        default Vector2.Accessible $XYw() {
            return const$XYw();
        }

        default Vector2.Accessible $XZw() {
            return const$XZw();
        }

        default Vector2.Accessible $XTw() {
            return const$XTw();
        }

        default Vector2.Accessible $YZw() {
            return const$YZw();
        }

        default Vector2.Accessible $YTw() {
            return const$YTw();
        }

        default Vector2.Accessible $ZTw() {
            return const$ZTw();
        }

        default Vector3.Accessible $XYZw() {
            return const$XYZw();
        }

        default Vector3.Accessible $XYTw() {
            return const$XYTw();
        }

        default Vector3.Accessible $XZTw() {
            return const$XZTw();
        }

        default Vector3.Accessible $YZTw() {
            return const$YZTw();
        }

        default Vector4.Accessible $XYZTw() {
            return const$XYZTw();
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

        default <R> R XYx(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default <R> R XZx(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default <R> R XTx(Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tx());
        }

        default <R> R YZx(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default <R> R YTx(Vector2.Factory<R> factory) {
            return factory.create(Yx(), Tx());
        }

        default <R> R ZTx(Vector2.Factory<R> factory) {
            return factory.create(Zx(), Tx());
        }

        default <R> R XYZx(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default <R> R XYTx(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx());
        }

        default <R> R XZTx(Vector3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx());
        }

        default <R> R YZTx(Vector3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx());
        }

        default <R> R XYZTx(Vector4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx());
        }

        default <R> R XYy(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default <R> R XZy(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default <R> R XTy(Vector2.Factory<R> factory) {
            return factory.create(Xy(), Ty());
        }

        default <R> R YZy(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default <R> R YTy(Vector2.Factory<R> factory) {
            return factory.create(Yy(), Ty());
        }

        default <R> R ZTy(Vector2.Factory<R> factory) {
            return factory.create(Zy(), Ty());
        }

        default <R> R XYZy(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default <R> R XYTy(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Ty());
        }

        default <R> R XZTy(Vector3.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Ty());
        }

        default <R> R YZTy(Vector3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty());
        }

        default <R> R XYZTy(Vector4.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Ty());
        }

        default <R> R XYz(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default <R> R XZz(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default <R> R XTz(Vector2.Factory<R> factory) {
            return factory.create(Xz(), Tz());
        }

        default <R> R YZz(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default <R> R YTz(Vector2.Factory<R> factory) {
            return factory.create(Yz(), Tz());
        }

        default <R> R ZTz(Vector2.Factory<R> factory) {
            return factory.create(Zz(), Tz());
        }

        default <R> R XYZz(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz());
        }

        default <R> R XYTz(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Tz());
        }

        default <R> R XZTz(Vector3.Factory<R> factory) {
            return factory.create(Xz(), Zz(), Tz());
        }

        default <R> R YZTz(Vector3.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Tz());
        }

        default <R> R XYZTz(Vector4.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz(), Tz());
        }

        default <R> R XYw(Vector2.Factory<R> factory) {
            return factory.create(Xw(), Yw());
        }

        default <R> R XZw(Vector2.Factory<R> factory) {
            return factory.create(Xw(), Zw());
        }

        default <R> R XTw(Vector2.Factory<R> factory) {
            return factory.create(Xw(), Tw());
        }

        default <R> R YZw(Vector2.Factory<R> factory) {
            return factory.create(Yw(), Zw());
        }

        default <R> R YTw(Vector2.Factory<R> factory) {
            return factory.create(Yw(), Tw());
        }

        default <R> R ZTw(Vector2.Factory<R> factory) {
            return factory.create(Zw(), Tw());
        }

        default <R> R XYZw(Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Zw());
        }

        default <R> R XYTw(Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Tw());
        }

        default <R> R XZTw(Vector3.Factory<R> factory) {
            return factory.create(Xw(), Zw(), Tw());
        }

        default <R> R YZTw(Vector3.Factory<R> factory) {
            return factory.create(Yw(), Zw(), Tw());
        }

        default <R> R XYZTw(Vector4.Factory<R> factory) {
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

        default void XYxTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default void XZxTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default void XTxTo(Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tx());
        }

        default void YZxTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
        }

        default void YTxTo(Vector2.Consumer consumer) {
            consumer.xy(Yx(), Tx());
        }

        default void ZTxTo(Vector2.Consumer consumer) {
            consumer.xy(Zx(), Tx());
        }

        default void XYZxTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
        }

        default void XYTxTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Tx());
        }

        default void XZTxTo(Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Zx(), Tx());
        }

        default void YZTxTo(Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Zx(), Tx());
        }

        default void XYZTxTo(Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Yx(), Zx(), Tx());
        }

        default void XYyTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default void XZyTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default void XTyTo(Vector2.Consumer consumer) {
            consumer.xy(Xy(), Ty());
        }

        default void YZyTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
        }

        default void YTyTo(Vector2.Consumer consumer) {
            consumer.xy(Yy(), Ty());
        }

        default void ZTyTo(Vector2.Consumer consumer) {
            consumer.xy(Zy(), Ty());
        }

        default void XYZyTo(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
        }

        default void XYTyTo(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Ty());
        }

        default void XZTyTo(Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Zy(), Ty());
        }

        default void YZTyTo(Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Zy(), Ty());
        }

        default void XYZTyTo(Vector4.Consumer consumer) {
            consumer.xyzw(Xy(), Yy(), Zy(), Ty());
        }

        default void XYzTo(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default void XZzTo(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default void XTzTo(Vector2.Consumer consumer) {
            consumer.xy(Xz(), Tz());
        }

        default void YZzTo(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
        }

        default void YTzTo(Vector2.Consumer consumer) {
            consumer.xy(Yz(), Tz());
        }

        default void ZTzTo(Vector2.Consumer consumer) {
            consumer.xy(Zz(), Tz());
        }

        default void XYZzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Zz());
        }

        default void XYTzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Tz());
        }

        default void XZTzTo(Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Zz(), Tz());
        }

        default void YZTzTo(Vector3.Consumer consumer) {
            consumer.xyz(Yz(), Zz(), Tz());
        }

        default void XYZTzTo(Vector4.Consumer consumer) {
            consumer.xyzw(Xz(), Yz(), Zz(), Tz());
        }

        default void XYwTo(Vector2.Consumer consumer) {
            consumer.xy(Xw(), Yw());
        }

        default void XZwTo(Vector2.Consumer consumer) {
            consumer.xy(Xw(), Zw());
        }

        default void XTwTo(Vector2.Consumer consumer) {
            consumer.xy(Xw(), Tw());
        }

        default void YZwTo(Vector2.Consumer consumer) {
            consumer.xy(Yw(), Zw());
        }

        default void YTwTo(Vector2.Consumer consumer) {
            consumer.xy(Yw(), Tw());
        }

        default void ZTwTo(Vector2.Consumer consumer) {
            consumer.xy(Zw(), Tw());
        }

        default void XYZwTo(Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Zw());
        }

        default void XYTwTo(Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Tw());
        }

        default void XZTwTo(Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Zw(), Tw());
        }

        default void YZTwTo(Vector3.Consumer consumer) {
            consumer.xyz(Yw(), Zw(), Tw());
        }

        default void XYZTwTo(Vector4.Consumer consumer) {
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

        default void XYx(double v) {
            Xx(v);
            Yx(v);
        }

        default void XZx(double v) {
            Xx(v);
            Zx(v);
        }

        default void XTx(double v) {
            Xx(v);
            Tx(v);
        }

        default void YZx(double v) {
            Yx(v);
            Zx(v);
        }

        default void YTx(double v) {
            Yx(v);
            Tx(v);
        }

        default void ZTx(double v) {
            Zx(v);
            Tx(v);
        }

        default void XYZx(double v) {
            Xx(v);
            Yx(v);
            Zx(v);
        }

        default void XYTx(double v) {
            Xx(v);
            Yx(v);
            Tx(v);
        }

        default void XZTx(double v) {
            Xx(v);
            Zx(v);
            Tx(v);
        }

        default void YZTx(double v) {
            Yx(v);
            Zx(v);
            Tx(v);
        }

        default void XYZTx(double v) {
            Xx(v);
            Yx(v);
            Zx(v);
            Tx(v);
        }

        default void XYy(double v) {
            Xy(v);
            Yy(v);
        }

        default void XZy(double v) {
            Xy(v);
            Zy(v);
        }

        default void XTy(double v) {
            Xy(v);
            Ty(v);
        }

        default void YZy(double v) {
            Yy(v);
            Zy(v);
        }

        default void YTy(double v) {
            Yy(v);
            Ty(v);
        }

        default void ZTy(double v) {
            Zy(v);
            Ty(v);
        }

        default void XYZy(double v) {
            Xy(v);
            Yy(v);
            Zy(v);
        }

        default void XYTy(double v) {
            Xy(v);
            Yy(v);
            Ty(v);
        }

        default void XZTy(double v) {
            Xy(v);
            Zy(v);
            Ty(v);
        }

        default void YZTy(double v) {
            Yy(v);
            Zy(v);
            Ty(v);
        }

        default void XYZTy(double v) {
            Xy(v);
            Yy(v);
            Zy(v);
            Ty(v);
        }

        default void XYz(double v) {
            Xz(v);
            Yz(v);
        }

        default void XZz(double v) {
            Xz(v);
            Zz(v);
        }

        default void XTz(double v) {
            Xz(v);
            Tz(v);
        }

        default void YZz(double v) {
            Yz(v);
            Zz(v);
        }

        default void YTz(double v) {
            Yz(v);
            Tz(v);
        }

        default void ZTz(double v) {
            Zz(v);
            Tz(v);
        }

        default void XYZz(double v) {
            Xz(v);
            Yz(v);
            Zz(v);
        }

        default void XYTz(double v) {
            Xz(v);
            Yz(v);
            Tz(v);
        }

        default void XZTz(double v) {
            Xz(v);
            Zz(v);
            Tz(v);
        }

        default void YZTz(double v) {
            Yz(v);
            Zz(v);
            Tz(v);
        }

        default void XYZTz(double v) {
            Xz(v);
            Yz(v);
            Zz(v);
            Tz(v);
        }

        default void XYw(double v) {
            Xw(v);
            Yw(v);
        }

        default void XZw(double v) {
            Xw(v);
            Zw(v);
        }

        default void XTw(double v) {
            Xw(v);
            Tw(v);
        }

        default void YZw(double v) {
            Yw(v);
            Zw(v);
        }

        default void YTw(double v) {
            Yw(v);
            Tw(v);
        }

        default void ZTw(double v) {
            Zw(v);
            Tw(v);
        }

        default void XYZw(double v) {
            Xw(v);
            Yw(v);
            Zw(v);
        }

        default void XYTw(double v) {
            Xw(v);
            Yw(v);
            Tw(v);
        }

        default void XZTw(double v) {
            Xw(v);
            Zw(v);
            Tw(v);
        }

        default void YZTw(double v) {
            Yw(v);
            Zw(v);
            Tw(v);
        }

        default void XYZTw(double v) {
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

        default void XYx(double Xx, double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void XZx(double Xx, double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void XTx(double Xx, double Tx) {
            Xx(Xx);
            Tx(Tx);
        }

        default void YZx(double Yx, double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void YTx(double Yx, double Tx) {
            Yx(Yx);
            Tx(Tx);
        }

        default void ZTx(double Zx, double Tx) {
            Zx(Zx);
            Tx(Tx);
        }

        default void XYZx(double Xx, double Yx, double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
        }

        default void XYTx(double Xx, double Yx, double Tx) {
            Xx(Xx);
            Yx(Yx);
            Tx(Tx);
        }

        default void XZTx(double Xx, double Zx, double Tx) {
            Xx(Xx);
            Zx(Zx);
            Tx(Tx);
        }

        default void YZTx(double Yx, double Zx, double Tx) {
            Yx(Yx);
            Zx(Zx);
            Tx(Tx);
        }

        default void XYZTx(double Xx, double Yx, double Zx, double Tx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
            Tx(Tx);
        }

        default void XYy(double Xy, double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void XZy(double Xy, double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void XTy(double Xy, double Ty) {
            Xy(Xy);
            Ty(Ty);
        }

        default void YZy(double Yy, double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void YTy(double Yy, double Ty) {
            Yy(Yy);
            Ty(Ty);
        }

        default void ZTy(double Zy, double Ty) {
            Zy(Zy);
            Ty(Ty);
        }

        default void XYZy(double Xy, double Yy, double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
        }

        default void XYTy(double Xy, double Yy, double Ty) {
            Xy(Xy);
            Yy(Yy);
            Ty(Ty);
        }

        default void XZTy(double Xy, double Zy, double Ty) {
            Xy(Xy);
            Zy(Zy);
            Ty(Ty);
        }

        default void YZTy(double Yy, double Zy, double Ty) {
            Yy(Yy);
            Zy(Zy);
            Ty(Ty);
        }

        default void XYZTy(double Xy, double Yy, double Zy, double Ty) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
            Ty(Ty);
        }

        default void XYz(double Xz, double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void XZz(double Xz, double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void XTz(double Xz, double Tz) {
            Xz(Xz);
            Tz(Tz);
        }

        default void YZz(double Yz, double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void YTz(double Yz, double Tz) {
            Yz(Yz);
            Tz(Tz);
        }

        default void ZTz(double Zz, double Tz) {
            Zz(Zz);
            Tz(Tz);
        }

        default void XYZz(double Xz, double Yz, double Zz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
        }

        default void XYTz(double Xz, double Yz, double Tz) {
            Xz(Xz);
            Yz(Yz);
            Tz(Tz);
        }

        default void XZTz(double Xz, double Zz, double Tz) {
            Xz(Xz);
            Zz(Zz);
            Tz(Tz);
        }

        default void YZTz(double Yz, double Zz, double Tz) {
            Yz(Yz);
            Zz(Zz);
            Tz(Tz);
        }

        default void XYZTz(double Xz, double Yz, double Zz, double Tz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
            Tz(Tz);
        }

        default void XYw(double Xw, double Yw) {
            Xw(Xw);
            Yw(Yw);
        }

        default void XZw(double Xw, double Zw) {
            Xw(Xw);
            Zw(Zw);
        }

        default void XTw(double Xw, double Tw) {
            Xw(Xw);
            Tw(Tw);
        }

        default void YZw(double Yw, double Zw) {
            Yw(Yw);
            Zw(Zw);
        }

        default void YTw(double Yw, double Tw) {
            Yw(Yw);
            Tw(Tw);
        }

        default void ZTw(double Zw, double Tw) {
            Zw(Zw);
            Tw(Tw);
        }

        default void XYZw(double Xw, double Yw, double Zw) {
            Xw(Xw);
            Yw(Yw);
            Zw(Zw);
        }

        default void XYTw(double Xw, double Yw, double Tw) {
            Xw(Xw);
            Yw(Yw);
            Tw(Tw);
        }

        default void XZTw(double Xw, double Zw, double Tw) {
            Xw(Xw);
            Zw(Zw);
            Tw(Tw);
        }

        default void YZTw(double Yw, double Zw, double Tw) {
            Yw(Yw);
            Zw(Zw);
            Tw(Tw);
        }

        default void XYZTw(double Xw, double Yw, double Zw, double Tw) {
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

        default void XYx(Vector2.Accessible v) {
            XYx(v.x(), v.y());
        }

        default void XZx(Vector2.Accessible v) {
            XZx(v.x(), v.y());
        }

        default void XTx(Vector2.Accessible v) {
            XTx(v.x(), v.y());
        }

        default void YZx(Vector2.Accessible v) {
            YZx(v.x(), v.y());
        }

        default void YTx(Vector2.Accessible v) {
            YTx(v.x(), v.y());
        }

        default void ZTx(Vector2.Accessible v) {
            ZTx(v.x(), v.y());
        }

        default void XYZx(Vector3.Accessible v) {
            XYZx(v.x(), v.y(), v.z());
        }

        default void XYTx(Vector3.Accessible v) {
            XYTx(v.x(), v.y(), v.z());
        }

        default void XZTx(Vector3.Accessible v) {
            XZTx(v.x(), v.y(), v.z());
        }

        default void YZTx(Vector3.Accessible v) {
            YZTx(v.x(), v.y(), v.z());
        }

        default void XYZTx(Vector4.Accessible v) {
            XYZTx(v.x(), v.y(), v.z(), v.w());
        }

        default void XYy(Vector2.Accessible v) {
            XYy(v.x(), v.y());
        }

        default void XZy(Vector2.Accessible v) {
            XZy(v.x(), v.y());
        }

        default void XTy(Vector2.Accessible v) {
            XTy(v.x(), v.y());
        }

        default void YZy(Vector2.Accessible v) {
            YZy(v.x(), v.y());
        }

        default void YTy(Vector2.Accessible v) {
            YTy(v.x(), v.y());
        }

        default void ZTy(Vector2.Accessible v) {
            ZTy(v.x(), v.y());
        }

        default void XYZy(Vector3.Accessible v) {
            XYZy(v.x(), v.y(), v.z());
        }

        default void XYTy(Vector3.Accessible v) {
            XYTy(v.x(), v.y(), v.z());
        }

        default void XZTy(Vector3.Accessible v) {
            XZTy(v.x(), v.y(), v.z());
        }

        default void YZTy(Vector3.Accessible v) {
            YZTy(v.x(), v.y(), v.z());
        }

        default void XYZTy(Vector4.Accessible v) {
            XYZTy(v.x(), v.y(), v.z(), v.w());
        }

        default void XYz(Vector2.Accessible v) {
            XYz(v.x(), v.y());
        }

        default void XZz(Vector2.Accessible v) {
            XZz(v.x(), v.y());
        }

        default void XTz(Vector2.Accessible v) {
            XTz(v.x(), v.y());
        }

        default void YZz(Vector2.Accessible v) {
            YZz(v.x(), v.y());
        }

        default void YTz(Vector2.Accessible v) {
            YTz(v.x(), v.y());
        }

        default void ZTz(Vector2.Accessible v) {
            ZTz(v.x(), v.y());
        }

        default void XYZz(Vector3.Accessible v) {
            XYZz(v.x(), v.y(), v.z());
        }

        default void XYTz(Vector3.Accessible v) {
            XYTz(v.x(), v.y(), v.z());
        }

        default void XZTz(Vector3.Accessible v) {
            XZTz(v.x(), v.y(), v.z());
        }

        default void YZTz(Vector3.Accessible v) {
            YZTz(v.x(), v.y(), v.z());
        }

        default void XYZTz(Vector4.Accessible v) {
            XYZTz(v.x(), v.y(), v.z(), v.w());
        }

        default void XYw(Vector2.Accessible v) {
            XYw(v.x(), v.y());
        }

        default void XZw(Vector2.Accessible v) {
            XZw(v.x(), v.y());
        }

        default void XTw(Vector2.Accessible v) {
            XTw(v.x(), v.y());
        }

        default void YZw(Vector2.Accessible v) {
            YZw(v.x(), v.y());
        }

        default void YTw(Vector2.Accessible v) {
            YTw(v.x(), v.y());
        }

        default void ZTw(Vector2.Accessible v) {
            ZTw(v.x(), v.y());
        }

        default void XYZw(Vector3.Accessible v) {
            XYZw(v.x(), v.y(), v.z());
        }

        default void XYTw(Vector3.Accessible v) {
            XYTw(v.x(), v.y(), v.z());
        }

        default void XZTw(Vector3.Accessible v) {
            XZTw(v.x(), v.y(), v.z());
        }

        default void YZTw(Vector3.Accessible v) {
            YZTw(v.x(), v.y(), v.z());
        }

        default void XYZTw(Vector4.Accessible v) {
            XYZTw(v.x(), v.y(), v.z(), v.w());
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

        default Vector2.Mutable $XTx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Tx(y); }
            };
        }

        default Vector2.Mutable $YZx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
            };
        }

        default Vector2.Mutable $YTx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Tx(y); }
            };
        }

        default Vector2.Mutable $ZTx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zx(x); }
                public void y(double y) { Mutable.this.Tx(y); }
            };
        }

        default Vector3.Mutable $XYZx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Zx(z); }
            };
        }

        default Vector3.Mutable $XYTx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Tx(z); }
            };
        }

        default Vector3.Mutable $XZTx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
                public void z(double z) { Mutable.this.Tx(z); }
            };
        }

        default Vector3.Mutable $YZTx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yx(x); }
                public void y(double y) { Mutable.this.Zx(y); }
                public void z(double z) { Mutable.this.Tx(z); }
            };
        }

        default Vector4.Mutable $XYZTx() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xx(x); }
                public void y(double y) { Mutable.this.Yx(y); }
                public void z(double z) { Mutable.this.Zx(z); }
                public void w(double w) { Mutable.this.Tx(w); }
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

        default Vector2.Mutable $XTy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector2.Mutable $YZy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
            };
        }

        default Vector2.Mutable $YTy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector2.Mutable $ZTy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zy(x); }
                public void y(double y) { Mutable.this.Ty(y); }
            };
        }

        default Vector3.Mutable $XYZy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zy(z); }
            };
        }

        default Vector3.Mutable $XYTy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Ty(z); }
            };
        }

        default Vector3.Mutable $XZTy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Ty(z); }
            };
        }

        default Vector3.Mutable $YZTy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yy(x); }
                public void y(double y) { Mutable.this.Zy(y); }
                public void z(double z) { Mutable.this.Ty(z); }
            };
        }

        default Vector4.Mutable $XYZTy() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xy(x); }
                public void y(double y) { Mutable.this.Yy(y); }
                public void z(double z) { Mutable.this.Zy(z); }
                public void w(double w) { Mutable.this.Ty(w); }
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

        default Vector2.Mutable $XTz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector2.Mutable $YZz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
            };
        }

        default Vector2.Mutable $YTz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector2.Mutable $ZTz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zz(x); }
                public void y(double y) { Mutable.this.Tz(y); }
            };
        }

        default Vector3.Mutable $XYZz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Zz(z); }
            };
        }

        default Vector3.Mutable $XYTz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector3.Mutable $XZTz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector3.Mutable $YZTz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yz(x); }
                public void y(double y) { Mutable.this.Zz(y); }
                public void z(double z) { Mutable.this.Tz(z); }
            };
        }

        default Vector4.Mutable $XYZTz() {
            return new Vector4.Mutable() {
                public void x(double x) { Mutable.this.Xz(x); }
                public void y(double y) { Mutable.this.Yz(y); }
                public void z(double z) { Mutable.this.Zz(z); }
                public void w(double w) { Mutable.this.Tz(w); }
            };
        }

        default Vector2.Mutable $XYw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
            };
        }

        default Vector2.Mutable $XZw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector2.Mutable $XTw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $YZw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
            };
        }

        default Vector2.Mutable $YTw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Yw(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector2.Mutable $ZTw() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.Zw(x); }
                public void y(double y) { Mutable.this.Tw(y); }
            };
        }

        default Vector3.Mutable $XYZw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
                public void z(double z) { Mutable.this.Zw(z); }
            };
        }

        default Vector3.Mutable $XYTw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Yw(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $XZTw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Xw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector3.Mutable $YZTw() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.Yw(x); }
                public void y(double y) { Mutable.this.Zw(y); }
                public void z(double z) { Mutable.this.Tw(z); }
            };
        }

        default Vector4.Mutable $XYZTw() {
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

        default Vector2.AccessibleAndMutable $XTx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tx(y); }
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

        default Vector2.AccessibleAndMutable $YTx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tx(y); }
            };
        }

        default Vector2.AccessibleAndMutable $ZTx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zx(); }
                public double y() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Zx(x); }
                public void y(double y) { AccessibleAndMutable.this.Tx(y); }
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

        default Vector3.AccessibleAndMutable $XYTx() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Yx(); }
                public double z() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Yx(y); }
                public void z(double z) { AccessibleAndMutable.this.Tx(z); }
            };
        }

        default Vector3.AccessibleAndMutable $XZTx() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public double z() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Xx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
                public void z(double z) { AccessibleAndMutable.this.Tx(z); }
            };
        }

        default Vector3.AccessibleAndMutable $YZTx() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yx(); }
                public double y() { return AccessibleAndMutable.this.Zx(); }
                public double z() { return AccessibleAndMutable.this.Tx(); }
                public void x(double x) { AccessibleAndMutable.this.Yx(x); }
                public void y(double y) { AccessibleAndMutable.this.Zx(y); }
                public void z(double z) { AccessibleAndMutable.this.Tx(z); }
            };
        }

        default Vector4.AccessibleAndMutable $XYZTx() {
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

        default Vector2.AccessibleAndMutable $XTy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
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

        default Vector2.AccessibleAndMutable $YTy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
            };
        }

        default Vector2.AccessibleAndMutable $ZTy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zy(); }
                public double y() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Zy(x); }
                public void y(double y) { AccessibleAndMutable.this.Ty(y); }
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

        default Vector3.AccessibleAndMutable $XYTy() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Yy(); }
                public double z() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Yy(y); }
                public void z(double z) { AccessibleAndMutable.this.Ty(z); }
            };
        }

        default Vector3.AccessibleAndMutable $XZTy() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Xy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Ty(z); }
            };
        }

        default Vector3.AccessibleAndMutable $YZTy() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yy(); }
                public double y() { return AccessibleAndMutable.this.Zy(); }
                public double z() { return AccessibleAndMutable.this.Ty(); }
                public void x(double x) { AccessibleAndMutable.this.Yy(x); }
                public void y(double y) { AccessibleAndMutable.this.Zy(y); }
                public void z(double z) { AccessibleAndMutable.this.Ty(z); }
            };
        }

        default Vector4.AccessibleAndMutable $XYZTy() {
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

        default Vector2.AccessibleAndMutable $XTz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
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

        default Vector2.AccessibleAndMutable $YTz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
            };
        }

        default Vector2.AccessibleAndMutable $ZTz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zz(); }
                public double y() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Zz(x); }
                public void y(double y) { AccessibleAndMutable.this.Tz(y); }
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

        default Vector3.AccessibleAndMutable $XYTz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Yz(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Yz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $XZTz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Xz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector3.AccessibleAndMutable $YZTz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yz(); }
                public double y() { return AccessibleAndMutable.this.Zz(); }
                public double z() { return AccessibleAndMutable.this.Tz(); }
                public void x(double x) { AccessibleAndMutable.this.Yz(x); }
                public void y(double y) { AccessibleAndMutable.this.Zz(y); }
                public void z(double z) { AccessibleAndMutable.this.Tz(z); }
            };
        }

        default Vector4.AccessibleAndMutable $XYZTz() {
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

        default Vector2.AccessibleAndMutable $XYw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $XZw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $XTw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $YZw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Yw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $YTw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yw(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Yw(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector2.AccessibleAndMutable $ZTw() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Zw(); }
                public double y() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Zw(x); }
                public void y(double y) { AccessibleAndMutable.this.Tw(y); }
            };
        }

        default Vector3.AccessibleAndMutable $XYZw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public double z() { return AccessibleAndMutable.this.Zw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
                public void z(double z) { AccessibleAndMutable.this.Zw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $XYTw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Yw(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Yw(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $XZTw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Xw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Xw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector3.AccessibleAndMutable $YZTw() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.Yw(); }
                public double y() { return AccessibleAndMutable.this.Zw(); }
                public double z() { return AccessibleAndMutable.this.Tw(); }
                public void x(double x) { AccessibleAndMutable.this.Yw(x); }
                public void y(double y) { AccessibleAndMutable.this.Zw(y); }
                public void z(double z) { AccessibleAndMutable.this.Tw(z); }
            };
        }

        default Vector4.AccessibleAndMutable $XYZTw() {
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
