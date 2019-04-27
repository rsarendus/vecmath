package ee.ristoseene.vecmath;

public final class Vector3 {

    private Vector3() {}

    public interface Accessible {

        double x();
        double y();
        double z();

        default Value.Accessible const$x() {
            return this::x;
        }

        default Value.Accessible const$y() {
            return this::y;
        }

        default Value.Accessible const$z() {
            return this::z;
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

        default Vector2.Accessible const$xz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
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

        default Vector2.Accessible const$yz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
            };
        }

        default Vector2.Accessible const$zx() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
            };
        }

        default Vector2.Accessible const$zy() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
            };
        }

        default Vector2.Accessible const$zz() {
            return new Vector2.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
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

        default Vector3.Accessible const$xxz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
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

        default Vector3.Accessible const$xyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
            };
        }

        default Vector3.Accessible const$xzx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$xzy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$xzz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
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

        default Vector3.Accessible const$yxz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
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

        default Vector3.Accessible const$yyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
            };
        }

        default Vector3.Accessible const$yzx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$yzy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$yzz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
            };
        }

        default Vector3.Accessible const$zxx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$zxy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$zxz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
            };
        }

        default Vector3.Accessible const$zyx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$zyy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$zyz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
            };
        }

        default Vector3.Accessible const$zzx() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
            };
        }

        default Vector3.Accessible const$zzy() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
            };
        }

        default Vector3.Accessible const$zzz() {
            return new Vector3.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$xxxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$xxyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$xxzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xxzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xxzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$xyxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$xyyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$xyzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xyzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xyzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$xzxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xzxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xzxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$xzyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xzyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xzyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$xzzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$xzzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$xzzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$yxxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$yxyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$yxzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yxzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yxzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$yyxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
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

        default Vector4.Accessible const$yyyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$yyzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yyzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yyzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$yzxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yzxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yzxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$yzyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yzyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yzyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$yzzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$yzzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$yzzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.y(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zxxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zxxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zxxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zxyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zxyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zxyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zxzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zxzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zxzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.x(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zyxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zyxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zyxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zyyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zyyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zyyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zyzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zyzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zyzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zzxx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zzxy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zzxz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.x(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zzyx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zzyy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zzyz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.y(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Vector4.Accessible const$zzzx() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.x(); }
            };
        }

        default Vector4.Accessible const$zzzy() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.y(); }
            };
        }

        default Vector4.Accessible const$zzzz() {
            return new Vector4.Accessible() {
                public double x() { return Accessible.this.z(); }
                public double y() { return Accessible.this.z(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.z(); }
            };
        }

        default Value.Accessible $x() {
            return const$x();
        }

        default Value.Accessible $y() {
            return const$y();
        }

        default Value.Accessible $z() {
            return const$z();
        }

        default Vector2.Accessible $xx() {
            return const$xx();
        }

        default Vector2.Accessible $xy() {
            return const$xy();
        }

        default Vector2.Accessible $xz() {
            return const$xz();
        }

        default Vector2.Accessible $yx() {
            return const$yx();
        }

        default Vector2.Accessible $yy() {
            return const$yy();
        }

        default Vector2.Accessible $yz() {
            return const$yz();
        }

        default Vector2.Accessible $zx() {
            return const$zx();
        }

        default Vector2.Accessible $zy() {
            return const$zy();
        }

        default Vector2.Accessible $zz() {
            return const$zz();
        }

        default Vector3.Accessible $xxx() {
            return const$xxx();
        }

        default Vector3.Accessible $xxy() {
            return const$xxy();
        }

        default Vector3.Accessible $xxz() {
            return const$xxz();
        }

        default Vector3.Accessible $xyx() {
            return const$xyx();
        }

        default Vector3.Accessible $xyy() {
            return const$xyy();
        }

        default Vector3.Accessible $xyz() {
            return this;
        }

        default Vector3.Accessible $xzx() {
            return const$xzx();
        }

        default Vector3.Accessible $xzy() {
            return const$xzy();
        }

        default Vector3.Accessible $xzz() {
            return const$xzz();
        }

        default Vector3.Accessible $yxx() {
            return const$yxx();
        }

        default Vector3.Accessible $yxy() {
            return const$yxy();
        }

        default Vector3.Accessible $yxz() {
            return const$yxz();
        }

        default Vector3.Accessible $yyx() {
            return const$yyx();
        }

        default Vector3.Accessible $yyy() {
            return const$yyy();
        }

        default Vector3.Accessible $yyz() {
            return const$yyz();
        }

        default Vector3.Accessible $yzx() {
            return const$yzx();
        }

        default Vector3.Accessible $yzy() {
            return const$yzy();
        }

        default Vector3.Accessible $yzz() {
            return const$yzz();
        }

        default Vector3.Accessible $zxx() {
            return const$zxx();
        }

        default Vector3.Accessible $zxy() {
            return const$zxy();
        }

        default Vector3.Accessible $zxz() {
            return const$zxz();
        }

        default Vector3.Accessible $zyx() {
            return const$zyx();
        }

        default Vector3.Accessible $zyy() {
            return const$zyy();
        }

        default Vector3.Accessible $zyz() {
            return const$zyz();
        }

        default Vector3.Accessible $zzx() {
            return const$zzx();
        }

        default Vector3.Accessible $zzy() {
            return const$zzy();
        }

        default Vector3.Accessible $zzz() {
            return const$zzz();
        }

        default Vector4.Accessible $xxxx() {
            return const$xxxx();
        }

        default Vector4.Accessible $xxxy() {
            return const$xxxy();
        }

        default Vector4.Accessible $xxxz() {
            return const$xxxz();
        }

        default Vector4.Accessible $xxyx() {
            return const$xxyx();
        }

        default Vector4.Accessible $xxyy() {
            return const$xxyy();
        }

        default Vector4.Accessible $xxyz() {
            return const$xxyz();
        }

        default Vector4.Accessible $xxzx() {
            return const$xxzx();
        }

        default Vector4.Accessible $xxzy() {
            return const$xxzy();
        }

        default Vector4.Accessible $xxzz() {
            return const$xxzz();
        }

        default Vector4.Accessible $xyxx() {
            return const$xyxx();
        }

        default Vector4.Accessible $xyxy() {
            return const$xyxy();
        }

        default Vector4.Accessible $xyxz() {
            return const$xyxz();
        }

        default Vector4.Accessible $xyyx() {
            return const$xyyx();
        }

        default Vector4.Accessible $xyyy() {
            return const$xyyy();
        }

        default Vector4.Accessible $xyyz() {
            return const$xyyz();
        }

        default Vector4.Accessible $xyzx() {
            return const$xyzx();
        }

        default Vector4.Accessible $xyzy() {
            return const$xyzy();
        }

        default Vector4.Accessible $xyzz() {
            return const$xyzz();
        }

        default Vector4.Accessible $xzxx() {
            return const$xzxx();
        }

        default Vector4.Accessible $xzxy() {
            return const$xzxy();
        }

        default Vector4.Accessible $xzxz() {
            return const$xzxz();
        }

        default Vector4.Accessible $xzyx() {
            return const$xzyx();
        }

        default Vector4.Accessible $xzyy() {
            return const$xzyy();
        }

        default Vector4.Accessible $xzyz() {
            return const$xzyz();
        }

        default Vector4.Accessible $xzzx() {
            return const$xzzx();
        }

        default Vector4.Accessible $xzzy() {
            return const$xzzy();
        }

        default Vector4.Accessible $xzzz() {
            return const$xzzz();
        }

        default Vector4.Accessible $yxxx() {
            return const$yxxx();
        }

        default Vector4.Accessible $yxxy() {
            return const$yxxy();
        }

        default Vector4.Accessible $yxxz() {
            return const$yxxz();
        }

        default Vector4.Accessible $yxyx() {
            return const$yxyx();
        }

        default Vector4.Accessible $yxyy() {
            return const$yxyy();
        }

        default Vector4.Accessible $yxyz() {
            return const$yxyz();
        }

        default Vector4.Accessible $yxzx() {
            return const$yxzx();
        }

        default Vector4.Accessible $yxzy() {
            return const$yxzy();
        }

        default Vector4.Accessible $yxzz() {
            return const$yxzz();
        }

        default Vector4.Accessible $yyxx() {
            return const$yyxx();
        }

        default Vector4.Accessible $yyxy() {
            return const$yyxy();
        }

        default Vector4.Accessible $yyxz() {
            return const$yyxz();
        }

        default Vector4.Accessible $yyyx() {
            return const$yyyx();
        }

        default Vector4.Accessible $yyyy() {
            return const$yyyy();
        }

        default Vector4.Accessible $yyyz() {
            return const$yyyz();
        }

        default Vector4.Accessible $yyzx() {
            return const$yyzx();
        }

        default Vector4.Accessible $yyzy() {
            return const$yyzy();
        }

        default Vector4.Accessible $yyzz() {
            return const$yyzz();
        }

        default Vector4.Accessible $yzxx() {
            return const$yzxx();
        }

        default Vector4.Accessible $yzxy() {
            return const$yzxy();
        }

        default Vector4.Accessible $yzxz() {
            return const$yzxz();
        }

        default Vector4.Accessible $yzyx() {
            return const$yzyx();
        }

        default Vector4.Accessible $yzyy() {
            return const$yzyy();
        }

        default Vector4.Accessible $yzyz() {
            return const$yzyz();
        }

        default Vector4.Accessible $yzzx() {
            return const$yzzx();
        }

        default Vector4.Accessible $yzzy() {
            return const$yzzy();
        }

        default Vector4.Accessible $yzzz() {
            return const$yzzz();
        }

        default Vector4.Accessible $zxxx() {
            return const$zxxx();
        }

        default Vector4.Accessible $zxxy() {
            return const$zxxy();
        }

        default Vector4.Accessible $zxxz() {
            return const$zxxz();
        }

        default Vector4.Accessible $zxyx() {
            return const$zxyx();
        }

        default Vector4.Accessible $zxyy() {
            return const$zxyy();
        }

        default Vector4.Accessible $zxyz() {
            return const$zxyz();
        }

        default Vector4.Accessible $zxzx() {
            return const$zxzx();
        }

        default Vector4.Accessible $zxzy() {
            return const$zxzy();
        }

        default Vector4.Accessible $zxzz() {
            return const$zxzz();
        }

        default Vector4.Accessible $zyxx() {
            return const$zyxx();
        }

        default Vector4.Accessible $zyxy() {
            return const$zyxy();
        }

        default Vector4.Accessible $zyxz() {
            return const$zyxz();
        }

        default Vector4.Accessible $zyyx() {
            return const$zyyx();
        }

        default Vector4.Accessible $zyyy() {
            return const$zyyy();
        }

        default Vector4.Accessible $zyyz() {
            return const$zyyz();
        }

        default Vector4.Accessible $zyzx() {
            return const$zyzx();
        }

        default Vector4.Accessible $zyzy() {
            return const$zyzy();
        }

        default Vector4.Accessible $zyzz() {
            return const$zyzz();
        }

        default Vector4.Accessible $zzxx() {
            return const$zzxx();
        }

        default Vector4.Accessible $zzxy() {
            return const$zzxy();
        }

        default Vector4.Accessible $zzxz() {
            return const$zzxz();
        }

        default Vector4.Accessible $zzyx() {
            return const$zzyx();
        }

        default Vector4.Accessible $zzyy() {
            return const$zzyy();
        }

        default Vector4.Accessible $zzyz() {
            return const$zzyz();
        }

        default Vector4.Accessible $zzzx() {
            return const$zzzx();
        }

        default Vector4.Accessible $zzzy() {
            return const$zzzy();
        }

        default Vector4.Accessible $zzzz() {
            return const$zzzz();
        }

        default <R> R x(Value.Factory<R> factory) {
            return factory.create(x());
        }

        default <R> R y(Value.Factory<R> factory) {
            return factory.create(y());
        }

        default <R> R z(Value.Factory<R> factory) {
            return factory.create(z());
        }

        default <R> R xx(Vector2.Factory<R> factory) {
            return factory.create(x(), x());
        }

        default <R> R xy(Vector2.Factory<R> factory) {
            return factory.create(x(), y());
        }

        default <R> R xz(Vector2.Factory<R> factory) {
            return factory.create(x(), z());
        }

        default <R> R yx(Vector2.Factory<R> factory) {
            return factory.create(y(), x());
        }

        default <R> R yy(Vector2.Factory<R> factory) {
            return factory.create(y(), y());
        }

        default <R> R yz(Vector2.Factory<R> factory) {
            return factory.create(y(), z());
        }

        default <R> R zx(Vector2.Factory<R> factory) {
            return factory.create(z(), x());
        }

        default <R> R zy(Vector2.Factory<R> factory) {
            return factory.create(z(), y());
        }

        default <R> R zz(Vector2.Factory<R> factory) {
            return factory.create(z(), z());
        }

        default <R> R xxx(Vector3.Factory<R> factory) {
            return factory.create(x(), x(), x());
        }

        default <R> R xxy(Vector3.Factory<R> factory) {
            return factory.create(x(), x(), y());
        }

        default <R> R xxz(Vector3.Factory<R> factory) {
            return factory.create(x(), x(), z());
        }

        default <R> R xyx(Vector3.Factory<R> factory) {
            return factory.create(x(), y(), x());
        }

        default <R> R xyy(Vector3.Factory<R> factory) {
            return factory.create(x(), y(), y());
        }

        default <R> R xyz(Vector3.Factory<R> factory) {
            return factory.create(x(), y(), z());
        }

        default <R> R xzx(Vector3.Factory<R> factory) {
            return factory.create(x(), z(), x());
        }

        default <R> R xzy(Vector3.Factory<R> factory) {
            return factory.create(x(), z(), y());
        }

        default <R> R xzz(Vector3.Factory<R> factory) {
            return factory.create(x(), z(), z());
        }

        default <R> R yxx(Vector3.Factory<R> factory) {
            return factory.create(y(), x(), x());
        }

        default <R> R yxy(Vector3.Factory<R> factory) {
            return factory.create(y(), x(), y());
        }

        default <R> R yxz(Vector3.Factory<R> factory) {
            return factory.create(y(), x(), z());
        }

        default <R> R yyx(Vector3.Factory<R> factory) {
            return factory.create(y(), y(), x());
        }

        default <R> R yyy(Vector3.Factory<R> factory) {
            return factory.create(y(), y(), y());
        }

        default <R> R yyz(Vector3.Factory<R> factory) {
            return factory.create(y(), y(), z());
        }

        default <R> R yzx(Vector3.Factory<R> factory) {
            return factory.create(y(), z(), x());
        }

        default <R> R yzy(Vector3.Factory<R> factory) {
            return factory.create(y(), z(), y());
        }

        default <R> R yzz(Vector3.Factory<R> factory) {
            return factory.create(y(), z(), z());
        }

        default <R> R zxx(Vector3.Factory<R> factory) {
            return factory.create(z(), x(), x());
        }

        default <R> R zxy(Vector3.Factory<R> factory) {
            return factory.create(z(), x(), y());
        }

        default <R> R zxz(Vector3.Factory<R> factory) {
            return factory.create(z(), x(), z());
        }

        default <R> R zyx(Vector3.Factory<R> factory) {
            return factory.create(z(), y(), x());
        }

        default <R> R zyy(Vector3.Factory<R> factory) {
            return factory.create(z(), y(), y());
        }

        default <R> R zyz(Vector3.Factory<R> factory) {
            return factory.create(z(), y(), z());
        }

        default <R> R zzx(Vector3.Factory<R> factory) {
            return factory.create(z(), z(), x());
        }

        default <R> R zzy(Vector3.Factory<R> factory) {
            return factory.create(z(), z(), y());
        }

        default <R> R zzz(Vector3.Factory<R> factory) {
            return factory.create(z(), z(), z());
        }

        default <R> R xxxx(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), x());
        }

        default <R> R xxxy(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), y());
        }

        default <R> R xxxz(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), z());
        }

        default <R> R xxyx(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), x());
        }

        default <R> R xxyy(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), y());
        }

        default <R> R xxyz(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), z());
        }

        default <R> R xxzx(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), x());
        }

        default <R> R xxzy(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), y());
        }

        default <R> R xxzz(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), z());
        }

        default <R> R xyxx(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), x());
        }

        default <R> R xyxy(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), y());
        }

        default <R> R xyxz(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), z());
        }

        default <R> R xyyx(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), x());
        }

        default <R> R xyyy(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), y());
        }

        default <R> R xyyz(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), z());
        }

        default <R> R xyzx(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), x());
        }

        default <R> R xyzy(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), y());
        }

        default <R> R xyzz(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), z());
        }

        default <R> R xzxx(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), x());
        }

        default <R> R xzxy(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), y());
        }

        default <R> R xzxz(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), z());
        }

        default <R> R xzyx(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), x());
        }

        default <R> R xzyy(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), y());
        }

        default <R> R xzyz(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), z());
        }

        default <R> R xzzx(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), x());
        }

        default <R> R xzzy(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), y());
        }

        default <R> R xzzz(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), z());
        }

        default <R> R yxxx(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), x());
        }

        default <R> R yxxy(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), y());
        }

        default <R> R yxxz(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), z());
        }

        default <R> R yxyx(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), x());
        }

        default <R> R yxyy(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), y());
        }

        default <R> R yxyz(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), z());
        }

        default <R> R yxzx(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), x());
        }

        default <R> R yxzy(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), y());
        }

        default <R> R yxzz(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), z());
        }

        default <R> R yyxx(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), x());
        }

        default <R> R yyxy(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), y());
        }

        default <R> R yyxz(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), z());
        }

        default <R> R yyyx(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), x());
        }

        default <R> R yyyy(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), y());
        }

        default <R> R yyyz(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), z());
        }

        default <R> R yyzx(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), x());
        }

        default <R> R yyzy(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), y());
        }

        default <R> R yyzz(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), z());
        }

        default <R> R yzxx(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), x());
        }

        default <R> R yzxy(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), y());
        }

        default <R> R yzxz(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), z());
        }

        default <R> R yzyx(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), x());
        }

        default <R> R yzyy(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), y());
        }

        default <R> R yzyz(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), z());
        }

        default <R> R yzzx(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), x());
        }

        default <R> R yzzy(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), y());
        }

        default <R> R yzzz(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), z());
        }

        default <R> R zxxx(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), x());
        }

        default <R> R zxxy(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), y());
        }

        default <R> R zxxz(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), z());
        }

        default <R> R zxyx(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), x());
        }

        default <R> R zxyy(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), y());
        }

        default <R> R zxyz(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), z());
        }

        default <R> R zxzx(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), x());
        }

        default <R> R zxzy(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), y());
        }

        default <R> R zxzz(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), z());
        }

        default <R> R zyxx(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), x());
        }

        default <R> R zyxy(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), y());
        }

        default <R> R zyxz(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), z());
        }

        default <R> R zyyx(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), x());
        }

        default <R> R zyyy(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), y());
        }

        default <R> R zyyz(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), z());
        }

        default <R> R zyzx(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), x());
        }

        default <R> R zyzy(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), y());
        }

        default <R> R zyzz(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), z());
        }

        default <R> R zzxx(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), x());
        }

        default <R> R zzxy(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), y());
        }

        default <R> R zzxz(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), z());
        }

        default <R> R zzyx(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), x());
        }

        default <R> R zzyy(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), y());
        }

        default <R> R zzyz(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), z());
        }

        default <R> R zzzx(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), x());
        }

        default <R> R zzzy(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), y());
        }

        default <R> R zzzz(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), z());
        }

        default void xTo(Value.Consumer consumer) {
            consumer.set(x());
        }

        default void yTo(Value.Consumer consumer) {
            consumer.set(y());
        }

        default void zTo(Value.Consumer consumer) {
            consumer.set(z());
        }

        default void xxTo(Vector2.Consumer consumer) {
            consumer.xy(x(), x());
        }

        default void xyTo(Vector2.Consumer consumer) {
            consumer.xy(x(), y());
        }

        default void xzTo(Vector2.Consumer consumer) {
            consumer.xy(x(), z());
        }

        default void yxTo(Vector2.Consumer consumer) {
            consumer.xy(y(), x());
        }

        default void yyTo(Vector2.Consumer consumer) {
            consumer.xy(y(), y());
        }

        default void yzTo(Vector2.Consumer consumer) {
            consumer.xy(y(), z());
        }

        default void zxTo(Vector2.Consumer consumer) {
            consumer.xy(z(), x());
        }

        default void zyTo(Vector2.Consumer consumer) {
            consumer.xy(z(), y());
        }

        default void zzTo(Vector2.Consumer consumer) {
            consumer.xy(z(), z());
        }

        default void xxxTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), x());
        }

        default void xxyTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), y());
        }

        default void xxzTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), z());
        }

        default void xyxTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), x());
        }

        default void xyyTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), y());
        }

        default void xyzTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), z());
        }

        default void xzxTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), x());
        }

        default void xzyTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), y());
        }

        default void xzzTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), z());
        }

        default void yxxTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), x());
        }

        default void yxyTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), y());
        }

        default void yxzTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), z());
        }

        default void yyxTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), x());
        }

        default void yyyTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), y());
        }

        default void yyzTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), z());
        }

        default void yzxTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), x());
        }

        default void yzyTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), y());
        }

        default void yzzTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), z());
        }

        default void zxxTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), x());
        }

        default void zxyTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), y());
        }

        default void zxzTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), z());
        }

        default void zyxTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), x());
        }

        default void zyyTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), y());
        }

        default void zyzTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), z());
        }

        default void zzxTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), x());
        }

        default void zzyTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), y());
        }

        default void zzzTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), z());
        }

        default void xxxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), x());
        }

        default void xxxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), y());
        }

        default void xxxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), z());
        }

        default void xxyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), x());
        }

        default void xxyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), y());
        }

        default void xxyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), z());
        }

        default void xxzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), x());
        }

        default void xxzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), y());
        }

        default void xxzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), z());
        }

        default void xyxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), x());
        }

        default void xyxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), y());
        }

        default void xyxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), z());
        }

        default void xyyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), x());
        }

        default void xyyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), y());
        }

        default void xyyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), z());
        }

        default void xyzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), x());
        }

        default void xyzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), y());
        }

        default void xyzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), z());
        }

        default void xzxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), x());
        }

        default void xzxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), y());
        }

        default void xzxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), z());
        }

        default void xzyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), x());
        }

        default void xzyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), y());
        }

        default void xzyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), z());
        }

        default void xzzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), x());
        }

        default void xzzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), y());
        }

        default void xzzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), z());
        }

        default void yxxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), x());
        }

        default void yxxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), y());
        }

        default void yxxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), z());
        }

        default void yxyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), x());
        }

        default void yxyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), y());
        }

        default void yxyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), z());
        }

        default void yxzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), x());
        }

        default void yxzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), y());
        }

        default void yxzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), z());
        }

        default void yyxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), x());
        }

        default void yyxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), y());
        }

        default void yyxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), z());
        }

        default void yyyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), x());
        }

        default void yyyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), y());
        }

        default void yyyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), z());
        }

        default void yyzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), x());
        }

        default void yyzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), y());
        }

        default void yyzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), z());
        }

        default void yzxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), x());
        }

        default void yzxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), y());
        }

        default void yzxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), z());
        }

        default void yzyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), x());
        }

        default void yzyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), y());
        }

        default void yzyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), z());
        }

        default void yzzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), x());
        }

        default void yzzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), y());
        }

        default void yzzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), z());
        }

        default void zxxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), x());
        }

        default void zxxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), y());
        }

        default void zxxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), z());
        }

        default void zxyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), x());
        }

        default void zxyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), y());
        }

        default void zxyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), z());
        }

        default void zxzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), x());
        }

        default void zxzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), y());
        }

        default void zxzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), z());
        }

        default void zyxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), x());
        }

        default void zyxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), y());
        }

        default void zyxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), z());
        }

        default void zyyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), x());
        }

        default void zyyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), y());
        }

        default void zyyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), z());
        }

        default void zyzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), x());
        }

        default void zyzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), y());
        }

        default void zyzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), z());
        }

        default void zzxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), x());
        }

        default void zzxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), y());
        }

        default void zzxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), z());
        }

        default void zzyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), x());
        }

        default void zzyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), y());
        }

        default void zzyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), z());
        }

        default void zzzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), x());
        }

        default void zzzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), y());
        }

        default void zzzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), z());
        }

    }

    public interface Mutable extends Consumer {

        void x(double x);
        void y(double y);
        void z(double z);

        default void xy(double v) {
            x(v);
            y(v);
        }

        default void xz(double v) {
            x(v);
            z(v);
        }

        default void yz(double v) {
            y(v);
            z(v);
        }

        default void xyz(double v) {
            x(v);
            y(v);
            z(v);
        }

        default void xy(double x, double y) {
            x(x);
            y(y);
        }

        default void xz(double x, double z) {
            x(x);
            z(z);
        }

        default void yx(double y, double x) {
            x(x);
            y(y);
        }

        default void yz(double y, double z) {
            y(y);
            z(z);
        }

        default void zx(double z, double x) {
            x(x);
            z(z);
        }

        default void zy(double z, double y) {
            y(y);
            z(z);
        }

        default void xyz(double x, double y, double z) {
            x(x);
            y(y);
            z(z);
        }

        default void xzy(double x, double z, double y) {
            x(x);
            y(y);
            z(z);
        }

        default void yxz(double y, double x, double z) {
            x(x);
            y(y);
            z(z);
        }

        default void yzx(double y, double z, double x) {
            x(x);
            y(y);
            z(z);
        }

        default void zxy(double z, double x, double y) {
            x(x);
            y(y);
            z(z);
        }

        default void zyx(double z, double y, double x) {
            x(x);
            y(y);
            z(z);
        }

        default void x(Value.Accessible x) {
            x(x.get());
        }

        default void y(Value.Accessible y) {
            y(y.get());
        }

        default void z(Value.Accessible z) {
            z(z.get());
        }

        default void xy(Vector2.Accessible v) {
            xy(v.x(), v.y());
        }

        default void xz(Vector2.Accessible v) {
            xz(v.x(), v.y());
        }

        default void yx(Vector2.Accessible v) {
            yx(v.x(), v.y());
        }

        default void yz(Vector2.Accessible v) {
            yz(v.x(), v.y());
        }

        default void zx(Vector2.Accessible v) {
            zx(v.x(), v.y());
        }

        default void zy(Vector2.Accessible v) {
            zy(v.x(), v.y());
        }

        default void xyz(Vector3.Accessible v) {
            xyz(v.x(), v.y(), v.z());
        }

        default void xzy(Vector3.Accessible v) {
            xzy(v.x(), v.y(), v.z());
        }

        default void yxz(Vector3.Accessible v) {
            yxz(v.x(), v.y(), v.z());
        }

        default void yzx(Vector3.Accessible v) {
            yzx(v.x(), v.y(), v.z());
        }

        default void zxy(Vector3.Accessible v) {
            zxy(v.x(), v.y(), v.z());
        }

        default void zyx(Vector3.Accessible v) {
            zyx(v.x(), v.y(), v.z());
        }

        default Value.Mutable $x() {
            return this::x;
        }

        default Value.Mutable $y() {
            return this::y;
        }

        default Value.Mutable $z() {
            return this::z;
        }

        default Vector2.Mutable $xy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.x(x); }
                public void y(double y) { Mutable.this.y(y); }
            };
        }

        default Vector2.Mutable $xz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.x(x); }
                public void y(double y) { Mutable.this.z(y); }
            };
        }

        default Vector2.Mutable $yx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.y(x); }
                public void y(double y) { Mutable.this.x(y); }
            };
        }

        default Vector2.Mutable $yz() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.y(x); }
                public void y(double y) { Mutable.this.z(y); }
            };
        }

        default Vector2.Mutable $zx() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.z(x); }
                public void y(double y) { Mutable.this.x(y); }
            };
        }

        default Vector2.Mutable $zy() {
            return new Vector2.Mutable() {
                public void x(double x) { Mutable.this.z(x); }
                public void y(double y) { Mutable.this.y(y); }
            };
        }

        default Vector3.Mutable $xyz() {
            return this;
        }

        default Vector3.Mutable $xzy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.x(x); }
                public void y(double y) { Mutable.this.z(y); }
                public void z(double z) { Mutable.this.y(z); }
            };
        }

        default Vector3.Mutable $yxz() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.y(x); }
                public void y(double y) { Mutable.this.x(y); }
                public void z(double z) { Mutable.this.z(z); }
            };
        }

        default Vector3.Mutable $yzx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.y(x); }
                public void y(double y) { Mutable.this.z(y); }
                public void z(double z) { Mutable.this.x(z); }
            };
        }

        default Vector3.Mutable $zxy() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.z(x); }
                public void y(double y) { Mutable.this.x(y); }
                public void z(double z) { Mutable.this.y(z); }
            };
        }

        default Vector3.Mutable $zyx() {
            return new Vector3.Mutable() {
                public void x(double x) { Mutable.this.z(x); }
                public void y(double y) { Mutable.this.y(y); }
                public void z(double z) { Mutable.this.x(z); }
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

        default Value.AccessibleAndMutable $z() {
            return new Value.AccessibleAndMutable() {
                public double get() { return AccessibleAndMutable.this.z(); }
                public void set(double v) { AccessibleAndMutable.this.z(v); }
            };
        }

        default Vector2.AccessibleAndMutable $xy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.x(); }
                public double y() { return AccessibleAndMutable.this.y(); }
                public void x(double x) { AccessibleAndMutable.this.x(x); }
                public void y(double y) { AccessibleAndMutable.this.y(y); }
            };
        }

        default Vector2.AccessibleAndMutable $xz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.x(); }
                public double y() { return AccessibleAndMutable.this.z(); }
                public void x(double x) { AccessibleAndMutable.this.x(x); }
                public void y(double y) { AccessibleAndMutable.this.z(y); }
            };
        }

        default Vector2.AccessibleAndMutable $yx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.y(); }
                public double y() { return AccessibleAndMutable.this.x(); }
                public void x(double x) { AccessibleAndMutable.this.y(x); }
                public void y(double y) { AccessibleAndMutable.this.x(y); }
            };
        }

        default Vector2.AccessibleAndMutable $yz() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.y(); }
                public double y() { return AccessibleAndMutable.this.z(); }
                public void x(double x) { AccessibleAndMutable.this.y(x); }
                public void y(double y) { AccessibleAndMutable.this.z(y); }
            };
        }

        default Vector2.AccessibleAndMutable $zx() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.z(); }
                public double y() { return AccessibleAndMutable.this.x(); }
                public void x(double x) { AccessibleAndMutable.this.z(x); }
                public void y(double y) { AccessibleAndMutable.this.x(y); }
            };
        }

        default Vector2.AccessibleAndMutable $zy() {
            return new Vector2.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.z(); }
                public double y() { return AccessibleAndMutable.this.y(); }
                public void x(double x) { AccessibleAndMutable.this.z(x); }
                public void y(double y) { AccessibleAndMutable.this.y(y); }
            };
        }

        default Vector3.AccessibleAndMutable $xyz() {
            return this;
        }

        default Vector3.AccessibleAndMutable $xzy() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.x(); }
                public double y() { return AccessibleAndMutable.this.z(); }
                public double z() { return AccessibleAndMutable.this.y(); }
                public void x(double x) { AccessibleAndMutable.this.x(x); }
                public void y(double y) { AccessibleAndMutable.this.z(y); }
                public void z(double z) { AccessibleAndMutable.this.y(z); }
            };
        }

        default Vector3.AccessibleAndMutable $yxz() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.y(); }
                public double y() { return AccessibleAndMutable.this.x(); }
                public double z() { return AccessibleAndMutable.this.z(); }
                public void x(double x) { AccessibleAndMutable.this.y(x); }
                public void y(double y) { AccessibleAndMutable.this.x(y); }
                public void z(double z) { AccessibleAndMutable.this.z(z); }
            };
        }

        default Vector3.AccessibleAndMutable $yzx() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.y(); }
                public double y() { return AccessibleAndMutable.this.z(); }
                public double z() { return AccessibleAndMutable.this.x(); }
                public void x(double x) { AccessibleAndMutable.this.y(x); }
                public void y(double y) { AccessibleAndMutable.this.z(y); }
                public void z(double z) { AccessibleAndMutable.this.x(z); }
            };
        }

        default Vector3.AccessibleAndMutable $zxy() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.z(); }
                public double y() { return AccessibleAndMutable.this.x(); }
                public double z() { return AccessibleAndMutable.this.y(); }
                public void x(double x) { AccessibleAndMutable.this.z(x); }
                public void y(double y) { AccessibleAndMutable.this.x(y); }
                public void z(double z) { AccessibleAndMutable.this.y(z); }
            };
        }

        default Vector3.AccessibleAndMutable $zyx() {
            return new Vector3.AccessibleAndMutable() {
                public double x() { return AccessibleAndMutable.this.z(); }
                public double y() { return AccessibleAndMutable.this.y(); }
                public double z() { return AccessibleAndMutable.this.x(); }
                public void x(double x) { AccessibleAndMutable.this.z(x); }
                public void y(double y) { AccessibleAndMutable.this.y(y); }
                public void z(double z) { AccessibleAndMutable.this.x(z); }
            };
        }

    }

    @FunctionalInterface
    public interface Consumer {

        void xyz(double x, double y, double z);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double x, double y, double z);

    }

}
