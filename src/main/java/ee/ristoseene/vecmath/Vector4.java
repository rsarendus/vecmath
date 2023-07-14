package ee.ristoseene.vecmath;

public final class Vector4 {

    private Vector4() {}

    @FunctionalInterface
    public interface Consumer {

        void xyzw(double x, double y, double z, double w);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double x, double y, double z, double w);

    }

    public interface Accessible {

        double x();
        double y();
        double z();
        double w();

        default <R> R xx(Vector2.Factory<R> factory) {
            return factory.create(x(), x());
        }

        default <R> R xy(Vector2.Factory<R> factory) {
            return factory.create(x(), y());
        }

        default <R> R xz(Vector2.Factory<R> factory) {
            return factory.create(x(), z());
        }

        default <R> R xw(Vector2.Factory<R> factory) {
            return factory.create(x(), w());
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

        default <R> R yw(Vector2.Factory<R> factory) {
            return factory.create(y(), w());
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

        default <R> R zw(Vector2.Factory<R> factory) {
            return factory.create(z(), w());
        }

        default <R> R wx(Vector2.Factory<R> factory) {
            return factory.create(w(), x());
        }

        default <R> R wy(Vector2.Factory<R> factory) {
            return factory.create(w(), y());
        }

        default <R> R wz(Vector2.Factory<R> factory) {
            return factory.create(w(), z());
        }

        default <R> R ww(Vector2.Factory<R> factory) {
            return factory.create(w(), w());
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

        default <R> R xxw(Vector3.Factory<R> factory) {
            return factory.create(x(), x(), w());
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

        default <R> R xyw(Vector3.Factory<R> factory) {
            return factory.create(x(), y(), w());
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

        default <R> R xzw(Vector3.Factory<R> factory) {
            return factory.create(x(), z(), w());
        }

        default <R> R xwx(Vector3.Factory<R> factory) {
            return factory.create(x(), w(), x());
        }

        default <R> R xwy(Vector3.Factory<R> factory) {
            return factory.create(x(), w(), y());
        }

        default <R> R xwz(Vector3.Factory<R> factory) {
            return factory.create(x(), w(), z());
        }

        default <R> R xww(Vector3.Factory<R> factory) {
            return factory.create(x(), w(), w());
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

        default <R> R yxw(Vector3.Factory<R> factory) {
            return factory.create(y(), x(), w());
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

        default <R> R yyw(Vector3.Factory<R> factory) {
            return factory.create(y(), y(), w());
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

        default <R> R yzw(Vector3.Factory<R> factory) {
            return factory.create(y(), z(), w());
        }

        default <R> R ywx(Vector3.Factory<R> factory) {
            return factory.create(y(), w(), x());
        }

        default <R> R ywy(Vector3.Factory<R> factory) {
            return factory.create(y(), w(), y());
        }

        default <R> R ywz(Vector3.Factory<R> factory) {
            return factory.create(y(), w(), z());
        }

        default <R> R yww(Vector3.Factory<R> factory) {
            return factory.create(y(), w(), w());
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

        default <R> R zxw(Vector3.Factory<R> factory) {
            return factory.create(z(), x(), w());
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

        default <R> R zyw(Vector3.Factory<R> factory) {
            return factory.create(z(), y(), w());
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

        default <R> R zzw(Vector3.Factory<R> factory) {
            return factory.create(z(), z(), w());
        }

        default <R> R zwx(Vector3.Factory<R> factory) {
            return factory.create(z(), w(), x());
        }

        default <R> R zwy(Vector3.Factory<R> factory) {
            return factory.create(z(), w(), y());
        }

        default <R> R zwz(Vector3.Factory<R> factory) {
            return factory.create(z(), w(), z());
        }

        default <R> R zww(Vector3.Factory<R> factory) {
            return factory.create(z(), w(), w());
        }

        default <R> R wxx(Vector3.Factory<R> factory) {
            return factory.create(w(), x(), x());
        }

        default <R> R wxy(Vector3.Factory<R> factory) {
            return factory.create(w(), x(), y());
        }

        default <R> R wxz(Vector3.Factory<R> factory) {
            return factory.create(w(), x(), z());
        }

        default <R> R wxw(Vector3.Factory<R> factory) {
            return factory.create(w(), x(), w());
        }

        default <R> R wyx(Vector3.Factory<R> factory) {
            return factory.create(w(), y(), x());
        }

        default <R> R wyy(Vector3.Factory<R> factory) {
            return factory.create(w(), y(), y());
        }

        default <R> R wyz(Vector3.Factory<R> factory) {
            return factory.create(w(), y(), z());
        }

        default <R> R wyw(Vector3.Factory<R> factory) {
            return factory.create(w(), y(), w());
        }

        default <R> R wzx(Vector3.Factory<R> factory) {
            return factory.create(w(), z(), x());
        }

        default <R> R wzy(Vector3.Factory<R> factory) {
            return factory.create(w(), z(), y());
        }

        default <R> R wzz(Vector3.Factory<R> factory) {
            return factory.create(w(), z(), z());
        }

        default <R> R wzw(Vector3.Factory<R> factory) {
            return factory.create(w(), z(), w());
        }

        default <R> R wwx(Vector3.Factory<R> factory) {
            return factory.create(w(), w(), x());
        }

        default <R> R wwy(Vector3.Factory<R> factory) {
            return factory.create(w(), w(), y());
        }

        default <R> R wwz(Vector3.Factory<R> factory) {
            return factory.create(w(), w(), z());
        }

        default <R> R www(Vector3.Factory<R> factory) {
            return factory.create(w(), w(), w());
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

        default <R> R xxxw(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), w());
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

        default <R> R xxyw(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), w());
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

        default <R> R xxzw(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), w());
        }

        default <R> R xxwx(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), x());
        }

        default <R> R xxwy(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), y());
        }

        default <R> R xxwz(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), z());
        }

        default <R> R xxww(Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), w());
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

        default <R> R xyxw(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), w());
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

        default <R> R xyyw(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), w());
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

        default <R> R xyzw(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), w());
        }

        default <R> R xywx(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), x());
        }

        default <R> R xywy(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), y());
        }

        default <R> R xywz(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), z());
        }

        default <R> R xyww(Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), w());
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

        default <R> R xzxw(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), w());
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

        default <R> R xzyw(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), w());
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

        default <R> R xzzw(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), w());
        }

        default <R> R xzwx(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), x());
        }

        default <R> R xzwy(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), y());
        }

        default <R> R xzwz(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), z());
        }

        default <R> R xzww(Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), w());
        }

        default <R> R xwxx(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), x());
        }

        default <R> R xwxy(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), y());
        }

        default <R> R xwxz(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), z());
        }

        default <R> R xwxw(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), w());
        }

        default <R> R xwyx(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), x());
        }

        default <R> R xwyy(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), y());
        }

        default <R> R xwyz(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), z());
        }

        default <R> R xwyw(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), w());
        }

        default <R> R xwzx(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), x());
        }

        default <R> R xwzy(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), y());
        }

        default <R> R xwzz(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), z());
        }

        default <R> R xwzw(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), w());
        }

        default <R> R xwwx(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), x());
        }

        default <R> R xwwy(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), y());
        }

        default <R> R xwwz(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), z());
        }

        default <R> R xwww(Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), w());
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

        default <R> R yxxw(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), w());
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

        default <R> R yxyw(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), w());
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

        default <R> R yxzw(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), w());
        }

        default <R> R yxwx(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), x());
        }

        default <R> R yxwy(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), y());
        }

        default <R> R yxwz(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), z());
        }

        default <R> R yxww(Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), w());
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

        default <R> R yyxw(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), w());
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

        default <R> R yyyw(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), w());
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

        default <R> R yyzw(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), w());
        }

        default <R> R yywx(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), x());
        }

        default <R> R yywy(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), y());
        }

        default <R> R yywz(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), z());
        }

        default <R> R yyww(Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), w());
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

        default <R> R yzxw(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), w());
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

        default <R> R yzyw(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), w());
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

        default <R> R yzzw(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), w());
        }

        default <R> R yzwx(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), x());
        }

        default <R> R yzwy(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), y());
        }

        default <R> R yzwz(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), z());
        }

        default <R> R yzww(Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), w());
        }

        default <R> R ywxx(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), x());
        }

        default <R> R ywxy(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), y());
        }

        default <R> R ywxz(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), z());
        }

        default <R> R ywxw(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), w());
        }

        default <R> R ywyx(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), x());
        }

        default <R> R ywyy(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), y());
        }

        default <R> R ywyz(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), z());
        }

        default <R> R ywyw(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), w());
        }

        default <R> R ywzx(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), x());
        }

        default <R> R ywzy(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), y());
        }

        default <R> R ywzz(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), z());
        }

        default <R> R ywzw(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), w());
        }

        default <R> R ywwx(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), x());
        }

        default <R> R ywwy(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), y());
        }

        default <R> R ywwz(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), z());
        }

        default <R> R ywww(Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), w());
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

        default <R> R zxxw(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), w());
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

        default <R> R zxyw(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), w());
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

        default <R> R zxzw(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), w());
        }

        default <R> R zxwx(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), x());
        }

        default <R> R zxwy(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), y());
        }

        default <R> R zxwz(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), z());
        }

        default <R> R zxww(Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), w());
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

        default <R> R zyxw(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), w());
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

        default <R> R zyyw(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), w());
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

        default <R> R zyzw(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), w());
        }

        default <R> R zywx(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), x());
        }

        default <R> R zywy(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), y());
        }

        default <R> R zywz(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), z());
        }

        default <R> R zyww(Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), w());
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

        default <R> R zzxw(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), w());
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

        default <R> R zzyw(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), w());
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

        default <R> R zzzw(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), w());
        }

        default <R> R zzwx(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), x());
        }

        default <R> R zzwy(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), y());
        }

        default <R> R zzwz(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), z());
        }

        default <R> R zzww(Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), w());
        }

        default <R> R zwxx(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), x());
        }

        default <R> R zwxy(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), y());
        }

        default <R> R zwxz(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), z());
        }

        default <R> R zwxw(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), w());
        }

        default <R> R zwyx(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), x());
        }

        default <R> R zwyy(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), y());
        }

        default <R> R zwyz(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), z());
        }

        default <R> R zwyw(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), w());
        }

        default <R> R zwzx(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), x());
        }

        default <R> R zwzy(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), y());
        }

        default <R> R zwzz(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), z());
        }

        default <R> R zwzw(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), w());
        }

        default <R> R zwwx(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), x());
        }

        default <R> R zwwy(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), y());
        }

        default <R> R zwwz(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), z());
        }

        default <R> R zwww(Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), w());
        }

        default <R> R wxxx(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), x());
        }

        default <R> R wxxy(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), y());
        }

        default <R> R wxxz(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), z());
        }

        default <R> R wxxw(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), w());
        }

        default <R> R wxyx(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), x());
        }

        default <R> R wxyy(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), y());
        }

        default <R> R wxyz(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), z());
        }

        default <R> R wxyw(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), w());
        }

        default <R> R wxzx(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), x());
        }

        default <R> R wxzy(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), y());
        }

        default <R> R wxzz(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), z());
        }

        default <R> R wxzw(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), w());
        }

        default <R> R wxwx(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), x());
        }

        default <R> R wxwy(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), y());
        }

        default <R> R wxwz(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), z());
        }

        default <R> R wxww(Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), w());
        }

        default <R> R wyxx(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), x());
        }

        default <R> R wyxy(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), y());
        }

        default <R> R wyxz(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), z());
        }

        default <R> R wyxw(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), w());
        }

        default <R> R wyyx(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), x());
        }

        default <R> R wyyy(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), y());
        }

        default <R> R wyyz(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), z());
        }

        default <R> R wyyw(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), w());
        }

        default <R> R wyzx(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), x());
        }

        default <R> R wyzy(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), y());
        }

        default <R> R wyzz(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), z());
        }

        default <R> R wyzw(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), w());
        }

        default <R> R wywx(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), x());
        }

        default <R> R wywy(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), y());
        }

        default <R> R wywz(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), z());
        }

        default <R> R wyww(Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), w());
        }

        default <R> R wzxx(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), x());
        }

        default <R> R wzxy(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), y());
        }

        default <R> R wzxz(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), z());
        }

        default <R> R wzxw(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), w());
        }

        default <R> R wzyx(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), x());
        }

        default <R> R wzyy(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), y());
        }

        default <R> R wzyz(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), z());
        }

        default <R> R wzyw(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), w());
        }

        default <R> R wzzx(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), x());
        }

        default <R> R wzzy(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), y());
        }

        default <R> R wzzz(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), z());
        }

        default <R> R wzzw(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), w());
        }

        default <R> R wzwx(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), x());
        }

        default <R> R wzwy(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), y());
        }

        default <R> R wzwz(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), z());
        }

        default <R> R wzww(Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), w());
        }

        default <R> R wwxx(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), x());
        }

        default <R> R wwxy(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), y());
        }

        default <R> R wwxz(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), z());
        }

        default <R> R wwxw(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), w());
        }

        default <R> R wwyx(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), x());
        }

        default <R> R wwyy(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), y());
        }

        default <R> R wwyz(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), z());
        }

        default <R> R wwyw(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), w());
        }

        default <R> R wwzx(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), x());
        }

        default <R> R wwzy(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), y());
        }

        default <R> R wwzz(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), z());
        }

        default <R> R wwzw(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), w());
        }

        default <R> R wwwx(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), x());
        }

        default <R> R wwwy(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), y());
        }

        default <R> R wwwz(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), z());
        }

        default <R> R wwww(Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), w());
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

        default void xwTo(Vector2.Consumer consumer) {
            consumer.xy(x(), w());
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

        default void ywTo(Vector2.Consumer consumer) {
            consumer.xy(y(), w());
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

        default void zwTo(Vector2.Consumer consumer) {
            consumer.xy(z(), w());
        }

        default void wxTo(Vector2.Consumer consumer) {
            consumer.xy(w(), x());
        }

        default void wyTo(Vector2.Consumer consumer) {
            consumer.xy(w(), y());
        }

        default void wzTo(Vector2.Consumer consumer) {
            consumer.xy(w(), z());
        }

        default void wwTo(Vector2.Consumer consumer) {
            consumer.xy(w(), w());
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

        default void xxwTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), w());
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

        default void xywTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), w());
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

        default void xzwTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), w());
        }

        default void xwxTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), x());
        }

        default void xwyTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), y());
        }

        default void xwzTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), z());
        }

        default void xwwTo(Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), w());
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

        default void yxwTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), w());
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

        default void yywTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), w());
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

        default void yzwTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), w());
        }

        default void ywxTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), x());
        }

        default void ywyTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), y());
        }

        default void ywzTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), z());
        }

        default void ywwTo(Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), w());
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

        default void zxwTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), w());
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

        default void zywTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), w());
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

        default void zzwTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), w());
        }

        default void zwxTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), x());
        }

        default void zwyTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), y());
        }

        default void zwzTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), z());
        }

        default void zwwTo(Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), w());
        }

        default void wxxTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), x());
        }

        default void wxyTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), y());
        }

        default void wxzTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), z());
        }

        default void wxwTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), w());
        }

        default void wyxTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), x());
        }

        default void wyyTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), y());
        }

        default void wyzTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), z());
        }

        default void wywTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), w());
        }

        default void wzxTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), x());
        }

        default void wzyTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), y());
        }

        default void wzzTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), z());
        }

        default void wzwTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), w());
        }

        default void wwxTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), x());
        }

        default void wwyTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), y());
        }

        default void wwzTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), z());
        }

        default void wwwTo(Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), w());
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

        default void xxxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), w());
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

        default void xxywTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), w());
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

        default void xxzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), w());
        }

        default void xxwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), x());
        }

        default void xxwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), y());
        }

        default void xxwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), z());
        }

        default void xxwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), w());
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

        default void xyxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), w());
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

        default void xyywTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), w());
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

        default void xyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), w());
        }

        default void xywxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), x());
        }

        default void xywyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), y());
        }

        default void xywzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), z());
        }

        default void xywwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), w());
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

        default void xzxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), w());
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

        default void xzywTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), w());
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

        default void xzzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), w());
        }

        default void xzwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), x());
        }

        default void xzwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), y());
        }

        default void xzwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), z());
        }

        default void xzwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), w());
        }

        default void xwxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), x());
        }

        default void xwxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), y());
        }

        default void xwxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), z());
        }

        default void xwxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), w());
        }

        default void xwyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), x());
        }

        default void xwyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), y());
        }

        default void xwyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), z());
        }

        default void xwywTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), w());
        }

        default void xwzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), x());
        }

        default void xwzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), y());
        }

        default void xwzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), z());
        }

        default void xwzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), w());
        }

        default void xwwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), x());
        }

        default void xwwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), y());
        }

        default void xwwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), z());
        }

        default void xwwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), w());
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

        default void yxxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), w());
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

        default void yxywTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), w());
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

        default void yxzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), w());
        }

        default void yxwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), x());
        }

        default void yxwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), y());
        }

        default void yxwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), z());
        }

        default void yxwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), w());
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

        default void yyxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), w());
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

        default void yyywTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), w());
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

        default void yyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), w());
        }

        default void yywxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), x());
        }

        default void yywyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), y());
        }

        default void yywzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), z());
        }

        default void yywwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), w());
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

        default void yzxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), w());
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

        default void yzywTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), w());
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

        default void yzzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), w());
        }

        default void yzwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), x());
        }

        default void yzwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), y());
        }

        default void yzwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), z());
        }

        default void yzwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), w());
        }

        default void ywxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), x());
        }

        default void ywxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), y());
        }

        default void ywxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), z());
        }

        default void ywxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), w());
        }

        default void ywyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), x());
        }

        default void ywyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), y());
        }

        default void ywyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), z());
        }

        default void ywywTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), w());
        }

        default void ywzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), x());
        }

        default void ywzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), y());
        }

        default void ywzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), z());
        }

        default void ywzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), w());
        }

        default void ywwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), x());
        }

        default void ywwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), y());
        }

        default void ywwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), z());
        }

        default void ywwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), w());
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

        default void zxxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), w());
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

        default void zxywTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), w());
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

        default void zxzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), w());
        }

        default void zxwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), x());
        }

        default void zxwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), y());
        }

        default void zxwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), z());
        }

        default void zxwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), w());
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

        default void zyxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), w());
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

        default void zyywTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), w());
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

        default void zyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), w());
        }

        default void zywxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), x());
        }

        default void zywyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), y());
        }

        default void zywzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), z());
        }

        default void zywwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), w());
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

        default void zzxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), w());
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

        default void zzywTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), w());
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

        default void zzzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), w());
        }

        default void zzwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), x());
        }

        default void zzwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), y());
        }

        default void zzwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), z());
        }

        default void zzwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), w());
        }

        default void zwxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), x());
        }

        default void zwxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), y());
        }

        default void zwxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), z());
        }

        default void zwxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), w());
        }

        default void zwyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), x());
        }

        default void zwyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), y());
        }

        default void zwyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), z());
        }

        default void zwywTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), w());
        }

        default void zwzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), x());
        }

        default void zwzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), y());
        }

        default void zwzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), z());
        }

        default void zwzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), w());
        }

        default void zwwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), x());
        }

        default void zwwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), y());
        }

        default void zwwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), z());
        }

        default void zwwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), w());
        }

        default void wxxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), x());
        }

        default void wxxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), y());
        }

        default void wxxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), z());
        }

        default void wxxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), w());
        }

        default void wxyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), x());
        }

        default void wxyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), y());
        }

        default void wxyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), z());
        }

        default void wxywTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), w());
        }

        default void wxzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), x());
        }

        default void wxzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), y());
        }

        default void wxzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), z());
        }

        default void wxzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), w());
        }

        default void wxwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), x());
        }

        default void wxwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), y());
        }

        default void wxwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), z());
        }

        default void wxwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), w());
        }

        default void wyxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), x());
        }

        default void wyxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), y());
        }

        default void wyxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), z());
        }

        default void wyxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), w());
        }

        default void wyyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), x());
        }

        default void wyyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), y());
        }

        default void wyyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), z());
        }

        default void wyywTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), w());
        }

        default void wyzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), x());
        }

        default void wyzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), y());
        }

        default void wyzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), z());
        }

        default void wyzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), w());
        }

        default void wywxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), x());
        }

        default void wywyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), y());
        }

        default void wywzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), z());
        }

        default void wywwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), w());
        }

        default void wzxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), x());
        }

        default void wzxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), y());
        }

        default void wzxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), z());
        }

        default void wzxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), w());
        }

        default void wzyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), x());
        }

        default void wzyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), y());
        }

        default void wzyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), z());
        }

        default void wzywTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), w());
        }

        default void wzzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), x());
        }

        default void wzzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), y());
        }

        default void wzzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), z());
        }

        default void wzzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), w());
        }

        default void wzwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), x());
        }

        default void wzwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), y());
        }

        default void wzwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), z());
        }

        default void wzwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), w());
        }

        default void wwxxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), x());
        }

        default void wwxyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), y());
        }

        default void wwxzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), z());
        }

        default void wwxwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), w());
        }

        default void wwyxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), x());
        }

        default void wwyyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), y());
        }

        default void wwyzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), z());
        }

        default void wwywTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), w());
        }

        default void wwzxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), x());
        }

        default void wwzyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), y());
        }

        default void wwzzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), z());
        }

        default void wwzwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), w());
        }

        default void wwwxTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), x());
        }

        default void wwwyTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), y());
        }

        default void wwwzTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), z());
        }

        default void wwwwTo(Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), w());
        }

    }

    public interface Mutable extends Consumer {

        void x(double x);
        void y(double y);
        void z(double z);
        void w(double w);

        default void xy(double v) {
            x(v);
            y(v);
        }

        default void xz(double v) {
            x(v);
            z(v);
        }

        default void xw(double v) {
            x(v);
            w(v);
        }

        default void yz(double v) {
            y(v);
            z(v);
        }

        default void yw(double v) {
            y(v);
            w(v);
        }

        default void zw(double v) {
            z(v);
            w(v);
        }

        default void xyz(double v) {
            x(v);
            y(v);
            z(v);
        }

        default void xyw(double v) {
            x(v);
            y(v);
            w(v);
        }

        default void xzw(double v) {
            x(v);
            z(v);
            w(v);
        }

        default void yzw(double v) {
            y(v);
            z(v);
            w(v);
        }

        default void xyzw(double v) {
            x(v);
            y(v);
            z(v);
            w(v);
        }

        default void xy(double x, double y) {
            x(x);
            y(y);
        }

        default void xz(double x, double z) {
            x(x);
            z(z);
        }

        default void xw(double x, double w) {
            x(x);
            w(w);
        }

        default void yx(double y, double x) {
            x(x);
            y(y);
        }

        default void yz(double y, double z) {
            y(y);
            z(z);
        }

        default void yw(double y, double w) {
            y(y);
            w(w);
        }

        default void zx(double z, double x) {
            x(x);
            z(z);
        }

        default void zy(double z, double y) {
            y(y);
            z(z);
        }

        default void zw(double z, double w) {
            z(z);
            w(w);
        }

        default void wx(double w, double x) {
            x(x);
            w(w);
        }

        default void wy(double w, double y) {
            y(y);
            w(w);
        }

        default void wz(double w, double z) {
            z(z);
            w(w);
        }

        default void xyz(double x, double y, double z) {
            x(x);
            y(y);
            z(z);
        }

        default void xyw(double x, double y, double w) {
            x(x);
            y(y);
            w(w);
        }

        default void xzy(double x, double z, double y) {
            x(x);
            y(y);
            z(z);
        }

        default void xzw(double x, double z, double w) {
            x(x);
            z(z);
            w(w);
        }

        default void xwy(double x, double w, double y) {
            x(x);
            y(y);
            w(w);
        }

        default void xwz(double x, double w, double z) {
            x(x);
            z(z);
            w(w);
        }

        default void yxz(double y, double x, double z) {
            x(x);
            y(y);
            z(z);
        }

        default void yxw(double y, double x, double w) {
            x(x);
            y(y);
            w(w);
        }

        default void yzx(double y, double z, double x) {
            x(x);
            y(y);
            z(z);
        }

        default void yzw(double y, double z, double w) {
            y(y);
            z(z);
            w(w);
        }

        default void ywx(double y, double w, double x) {
            x(x);
            y(y);
            w(w);
        }

        default void ywz(double y, double w, double z) {
            y(y);
            z(z);
            w(w);
        }

        default void zxy(double z, double x, double y) {
            x(x);
            y(y);
            z(z);
        }

        default void zxw(double z, double x, double w) {
            x(x);
            z(z);
            w(w);
        }

        default void zyx(double z, double y, double x) {
            x(x);
            y(y);
            z(z);
        }

        default void zyw(double z, double y, double w) {
            y(y);
            z(z);
            w(w);
        }

        default void zwx(double z, double w, double x) {
            x(x);
            z(z);
            w(w);
        }

        default void zwy(double z, double w, double y) {
            y(y);
            z(z);
            w(w);
        }

        default void wxy(double w, double x, double y) {
            x(x);
            y(y);
            w(w);
        }

        default void wxz(double w, double x, double z) {
            x(x);
            z(z);
            w(w);
        }

        default void wyx(double w, double y, double x) {
            x(x);
            y(y);
            w(w);
        }

        default void wyz(double w, double y, double z) {
            y(y);
            z(z);
            w(w);
        }

        default void wzx(double w, double z, double x) {
            x(x);
            z(z);
            w(w);
        }

        default void wzy(double w, double z, double y) {
            y(y);
            z(z);
            w(w);
        }

        default void xyzw(double x, double y, double z, double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xywz(double x, double y, double w, double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xzyw(double x, double z, double y, double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xzwy(double x, double z, double w, double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xwyz(double x, double w, double y, double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xwzy(double x, double w, double z, double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yxzw(double y, double x, double z, double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yxwz(double y, double x, double w, double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yzxw(double y, double z, double x, double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yzwx(double y, double z, double w, double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void ywxz(double y, double w, double x, double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void ywzx(double y, double w, double z, double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zxyw(double z, double x, double y, double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zxwy(double z, double x, double w, double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zyxw(double z, double y, double x, double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zywx(double z, double y, double w, double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zwxy(double z, double w, double x, double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zwyx(double z, double w, double y, double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wxyz(double w, double x, double y, double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wxzy(double w, double x, double z, double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wyxz(double w, double y, double x, double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wyzx(double w, double y, double z, double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wzxy(double w, double z, double x, double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wzyx(double w, double z, double y, double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xy(Vector2.Accessible v) {
            xy(v.x(), v.y());
        }

        default void xz(Vector2.Accessible v) {
            xz(v.x(), v.y());
        }

        default void xw(Vector2.Accessible v) {
            xw(v.x(), v.y());
        }

        default void yx(Vector2.Accessible v) {
            yx(v.x(), v.y());
        }

        default void yz(Vector2.Accessible v) {
            yz(v.x(), v.y());
        }

        default void yw(Vector2.Accessible v) {
            yw(v.x(), v.y());
        }

        default void zx(Vector2.Accessible v) {
            zx(v.x(), v.y());
        }

        default void zy(Vector2.Accessible v) {
            zy(v.x(), v.y());
        }

        default void zw(Vector2.Accessible v) {
            zw(v.x(), v.y());
        }

        default void wx(Vector2.Accessible v) {
            wx(v.x(), v.y());
        }

        default void wy(Vector2.Accessible v) {
            wy(v.x(), v.y());
        }

        default void wz(Vector2.Accessible v) {
            wz(v.x(), v.y());
        }

        default void xyz(Vector3.Accessible v) {
            xyz(v.x(), v.y(), v.z());
        }

        default void xyw(Vector3.Accessible v) {
            xyw(v.x(), v.y(), v.z());
        }

        default void xzy(Vector3.Accessible v) {
            xzy(v.x(), v.y(), v.z());
        }

        default void xzw(Vector3.Accessible v) {
            xzw(v.x(), v.y(), v.z());
        }

        default void xwy(Vector3.Accessible v) {
            xwy(v.x(), v.y(), v.z());
        }

        default void xwz(Vector3.Accessible v) {
            xwz(v.x(), v.y(), v.z());
        }

        default void yxz(Vector3.Accessible v) {
            yxz(v.x(), v.y(), v.z());
        }

        default void yxw(Vector3.Accessible v) {
            yxw(v.x(), v.y(), v.z());
        }

        default void yzx(Vector3.Accessible v) {
            yzx(v.x(), v.y(), v.z());
        }

        default void yzw(Vector3.Accessible v) {
            yzw(v.x(), v.y(), v.z());
        }

        default void ywx(Vector3.Accessible v) {
            ywx(v.x(), v.y(), v.z());
        }

        default void ywz(Vector3.Accessible v) {
            ywz(v.x(), v.y(), v.z());
        }

        default void zxy(Vector3.Accessible v) {
            zxy(v.x(), v.y(), v.z());
        }

        default void zxw(Vector3.Accessible v) {
            zxw(v.x(), v.y(), v.z());
        }

        default void zyx(Vector3.Accessible v) {
            zyx(v.x(), v.y(), v.z());
        }

        default void zyw(Vector3.Accessible v) {
            zyw(v.x(), v.y(), v.z());
        }

        default void zwx(Vector3.Accessible v) {
            zwx(v.x(), v.y(), v.z());
        }

        default void zwy(Vector3.Accessible v) {
            zwy(v.x(), v.y(), v.z());
        }

        default void wxy(Vector3.Accessible v) {
            wxy(v.x(), v.y(), v.z());
        }

        default void wxz(Vector3.Accessible v) {
            wxz(v.x(), v.y(), v.z());
        }

        default void wyx(Vector3.Accessible v) {
            wyx(v.x(), v.y(), v.z());
        }

        default void wyz(Vector3.Accessible v) {
            wyz(v.x(), v.y(), v.z());
        }

        default void wzx(Vector3.Accessible v) {
            wzx(v.x(), v.y(), v.z());
        }

        default void wzy(Vector3.Accessible v) {
            wzy(v.x(), v.y(), v.z());
        }

        default void xyzw(Vector4.Accessible v) {
            xyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void xywz(Vector4.Accessible v) {
            xywz(v.x(), v.y(), v.z(), v.w());
        }

        default void xzyw(Vector4.Accessible v) {
            xzyw(v.x(), v.y(), v.z(), v.w());
        }

        default void xzwy(Vector4.Accessible v) {
            xzwy(v.x(), v.y(), v.z(), v.w());
        }

        default void xwyz(Vector4.Accessible v) {
            xwyz(v.x(), v.y(), v.z(), v.w());
        }

        default void xwzy(Vector4.Accessible v) {
            xwzy(v.x(), v.y(), v.z(), v.w());
        }

        default void yxzw(Vector4.Accessible v) {
            yxzw(v.x(), v.y(), v.z(), v.w());
        }

        default void yxwz(Vector4.Accessible v) {
            yxwz(v.x(), v.y(), v.z(), v.w());
        }

        default void yzxw(Vector4.Accessible v) {
            yzxw(v.x(), v.y(), v.z(), v.w());
        }

        default void yzwx(Vector4.Accessible v) {
            yzwx(v.x(), v.y(), v.z(), v.w());
        }

        default void ywxz(Vector4.Accessible v) {
            ywxz(v.x(), v.y(), v.z(), v.w());
        }

        default void ywzx(Vector4.Accessible v) {
            ywzx(v.x(), v.y(), v.z(), v.w());
        }

        default void zxyw(Vector4.Accessible v) {
            zxyw(v.x(), v.y(), v.z(), v.w());
        }

        default void zxwy(Vector4.Accessible v) {
            zxwy(v.x(), v.y(), v.z(), v.w());
        }

        default void zyxw(Vector4.Accessible v) {
            zyxw(v.x(), v.y(), v.z(), v.w());
        }

        default void zywx(Vector4.Accessible v) {
            zywx(v.x(), v.y(), v.z(), v.w());
        }

        default void zwxy(Vector4.Accessible v) {
            zwxy(v.x(), v.y(), v.z(), v.w());
        }

        default void zwyx(Vector4.Accessible v) {
            zwyx(v.x(), v.y(), v.z(), v.w());
        }

        default void wxyz(Vector4.Accessible v) {
            wxyz(v.x(), v.y(), v.z(), v.w());
        }

        default void wxzy(Vector4.Accessible v) {
            wxzy(v.x(), v.y(), v.z(), v.w());
        }

        default void wyxz(Vector4.Accessible v) {
            wyxz(v.x(), v.y(), v.z(), v.w());
        }

        default void wyzx(Vector4.Accessible v) {
            wyzx(v.x(), v.y(), v.z(), v.w());
        }

        default void wzxy(Vector4.Accessible v) {
            wzxy(v.x(), v.y(), v.z(), v.w());
        }

        default void wzyx(Vector4.Accessible v) {
            wzyx(v.x(), v.y(), v.z(), v.w());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
