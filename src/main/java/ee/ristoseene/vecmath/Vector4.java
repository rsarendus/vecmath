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

        default <R> R xx(final Vector2.Factory<R> factory) {
            return factory.create(x(), x());
        }

        default void xxTo(final Vector2.Consumer consumer) {
            consumer.xy(x(), x());
        }

        default <R> R xy(final Vector2.Factory<R> factory) {
            return factory.create(x(), y());
        }

        default void xyTo(final Vector2.Consumer consumer) {
            consumer.xy(x(), y());
        }

        default <R> R xz(final Vector2.Factory<R> factory) {
            return factory.create(x(), z());
        }

        default void xzTo(final Vector2.Consumer consumer) {
            consumer.xy(x(), z());
        }

        default <R> R xw(final Vector2.Factory<R> factory) {
            return factory.create(x(), w());
        }

        default void xwTo(final Vector2.Consumer consumer) {
            consumer.xy(x(), w());
        }

        default <R> R yx(final Vector2.Factory<R> factory) {
            return factory.create(y(), x());
        }

        default void yxTo(final Vector2.Consumer consumer) {
            consumer.xy(y(), x());
        }

        default <R> R yy(final Vector2.Factory<R> factory) {
            return factory.create(y(), y());
        }

        default void yyTo(final Vector2.Consumer consumer) {
            consumer.xy(y(), y());
        }

        default <R> R yz(final Vector2.Factory<R> factory) {
            return factory.create(y(), z());
        }

        default void yzTo(final Vector2.Consumer consumer) {
            consumer.xy(y(), z());
        }

        default <R> R yw(final Vector2.Factory<R> factory) {
            return factory.create(y(), w());
        }

        default void ywTo(final Vector2.Consumer consumer) {
            consumer.xy(y(), w());
        }

        default <R> R zx(final Vector2.Factory<R> factory) {
            return factory.create(z(), x());
        }

        default void zxTo(final Vector2.Consumer consumer) {
            consumer.xy(z(), x());
        }

        default <R> R zy(final Vector2.Factory<R> factory) {
            return factory.create(z(), y());
        }

        default void zyTo(final Vector2.Consumer consumer) {
            consumer.xy(z(), y());
        }

        default <R> R zz(final Vector2.Factory<R> factory) {
            return factory.create(z(), z());
        }

        default void zzTo(final Vector2.Consumer consumer) {
            consumer.xy(z(), z());
        }

        default <R> R zw(final Vector2.Factory<R> factory) {
            return factory.create(z(), w());
        }

        default void zwTo(final Vector2.Consumer consumer) {
            consumer.xy(z(), w());
        }

        default <R> R wx(final Vector2.Factory<R> factory) {
            return factory.create(w(), x());
        }

        default void wxTo(final Vector2.Consumer consumer) {
            consumer.xy(w(), x());
        }

        default <R> R wy(final Vector2.Factory<R> factory) {
            return factory.create(w(), y());
        }

        default void wyTo(final Vector2.Consumer consumer) {
            consumer.xy(w(), y());
        }

        default <R> R wz(final Vector2.Factory<R> factory) {
            return factory.create(w(), z());
        }

        default void wzTo(final Vector2.Consumer consumer) {
            consumer.xy(w(), z());
        }

        default <R> R ww(final Vector2.Factory<R> factory) {
            return factory.create(w(), w());
        }

        default void wwTo(final Vector2.Consumer consumer) {
            consumer.xy(w(), w());
        }

        default <R> R xxx(final Vector3.Factory<R> factory) {
            return factory.create(x(), x(), x());
        }

        default void xxxTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), x());
        }

        default <R> R xxy(final Vector3.Factory<R> factory) {
            return factory.create(x(), x(), y());
        }

        default void xxyTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), y());
        }

        default <R> R xxz(final Vector3.Factory<R> factory) {
            return factory.create(x(), x(), z());
        }

        default void xxzTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), z());
        }

        default <R> R xxw(final Vector3.Factory<R> factory) {
            return factory.create(x(), x(), w());
        }

        default void xxwTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), x(), w());
        }

        default <R> R xyx(final Vector3.Factory<R> factory) {
            return factory.create(x(), y(), x());
        }

        default void xyxTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), x());
        }

        default <R> R xyy(final Vector3.Factory<R> factory) {
            return factory.create(x(), y(), y());
        }

        default void xyyTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), y());
        }

        default <R> R xyz(final Vector3.Factory<R> factory) {
            return factory.create(x(), y(), z());
        }

        default void xyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), z());
        }

        default <R> R xyw(final Vector3.Factory<R> factory) {
            return factory.create(x(), y(), w());
        }

        default void xywTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), y(), w());
        }

        default <R> R xzx(final Vector3.Factory<R> factory) {
            return factory.create(x(), z(), x());
        }

        default void xzxTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), x());
        }

        default <R> R xzy(final Vector3.Factory<R> factory) {
            return factory.create(x(), z(), y());
        }

        default void xzyTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), y());
        }

        default <R> R xzz(final Vector3.Factory<R> factory) {
            return factory.create(x(), z(), z());
        }

        default void xzzTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), z());
        }

        default <R> R xzw(final Vector3.Factory<R> factory) {
            return factory.create(x(), z(), w());
        }

        default void xzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), z(), w());
        }

        default <R> R xwx(final Vector3.Factory<R> factory) {
            return factory.create(x(), w(), x());
        }

        default void xwxTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), x());
        }

        default <R> R xwy(final Vector3.Factory<R> factory) {
            return factory.create(x(), w(), y());
        }

        default void xwyTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), y());
        }

        default <R> R xwz(final Vector3.Factory<R> factory) {
            return factory.create(x(), w(), z());
        }

        default void xwzTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), z());
        }

        default <R> R xww(final Vector3.Factory<R> factory) {
            return factory.create(x(), w(), w());
        }

        default void xwwTo(final Vector3.Consumer consumer) {
            consumer.xyz(x(), w(), w());
        }

        default <R> R yxx(final Vector3.Factory<R> factory) {
            return factory.create(y(), x(), x());
        }

        default void yxxTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), x());
        }

        default <R> R yxy(final Vector3.Factory<R> factory) {
            return factory.create(y(), x(), y());
        }

        default void yxyTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), y());
        }

        default <R> R yxz(final Vector3.Factory<R> factory) {
            return factory.create(y(), x(), z());
        }

        default void yxzTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), z());
        }

        default <R> R yxw(final Vector3.Factory<R> factory) {
            return factory.create(y(), x(), w());
        }

        default void yxwTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), x(), w());
        }

        default <R> R yyx(final Vector3.Factory<R> factory) {
            return factory.create(y(), y(), x());
        }

        default void yyxTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), x());
        }

        default <R> R yyy(final Vector3.Factory<R> factory) {
            return factory.create(y(), y(), y());
        }

        default void yyyTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), y());
        }

        default <R> R yyz(final Vector3.Factory<R> factory) {
            return factory.create(y(), y(), z());
        }

        default void yyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), z());
        }

        default <R> R yyw(final Vector3.Factory<R> factory) {
            return factory.create(y(), y(), w());
        }

        default void yywTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), y(), w());
        }

        default <R> R yzx(final Vector3.Factory<R> factory) {
            return factory.create(y(), z(), x());
        }

        default void yzxTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), x());
        }

        default <R> R yzy(final Vector3.Factory<R> factory) {
            return factory.create(y(), z(), y());
        }

        default void yzyTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), y());
        }

        default <R> R yzz(final Vector3.Factory<R> factory) {
            return factory.create(y(), z(), z());
        }

        default void yzzTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), z());
        }

        default <R> R yzw(final Vector3.Factory<R> factory) {
            return factory.create(y(), z(), w());
        }

        default void yzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), z(), w());
        }

        default <R> R ywx(final Vector3.Factory<R> factory) {
            return factory.create(y(), w(), x());
        }

        default void ywxTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), x());
        }

        default <R> R ywy(final Vector3.Factory<R> factory) {
            return factory.create(y(), w(), y());
        }

        default void ywyTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), y());
        }

        default <R> R ywz(final Vector3.Factory<R> factory) {
            return factory.create(y(), w(), z());
        }

        default void ywzTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), z());
        }

        default <R> R yww(final Vector3.Factory<R> factory) {
            return factory.create(y(), w(), w());
        }

        default void ywwTo(final Vector3.Consumer consumer) {
            consumer.xyz(y(), w(), w());
        }

        default <R> R zxx(final Vector3.Factory<R> factory) {
            return factory.create(z(), x(), x());
        }

        default void zxxTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), x());
        }

        default <R> R zxy(final Vector3.Factory<R> factory) {
            return factory.create(z(), x(), y());
        }

        default void zxyTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), y());
        }

        default <R> R zxz(final Vector3.Factory<R> factory) {
            return factory.create(z(), x(), z());
        }

        default void zxzTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), z());
        }

        default <R> R zxw(final Vector3.Factory<R> factory) {
            return factory.create(z(), x(), w());
        }

        default void zxwTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), x(), w());
        }

        default <R> R zyx(final Vector3.Factory<R> factory) {
            return factory.create(z(), y(), x());
        }

        default void zyxTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), x());
        }

        default <R> R zyy(final Vector3.Factory<R> factory) {
            return factory.create(z(), y(), y());
        }

        default void zyyTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), y());
        }

        default <R> R zyz(final Vector3.Factory<R> factory) {
            return factory.create(z(), y(), z());
        }

        default void zyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), z());
        }

        default <R> R zyw(final Vector3.Factory<R> factory) {
            return factory.create(z(), y(), w());
        }

        default void zywTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), y(), w());
        }

        default <R> R zzx(final Vector3.Factory<R> factory) {
            return factory.create(z(), z(), x());
        }

        default void zzxTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), x());
        }

        default <R> R zzy(final Vector3.Factory<R> factory) {
            return factory.create(z(), z(), y());
        }

        default void zzyTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), y());
        }

        default <R> R zzz(final Vector3.Factory<R> factory) {
            return factory.create(z(), z(), z());
        }

        default void zzzTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), z());
        }

        default <R> R zzw(final Vector3.Factory<R> factory) {
            return factory.create(z(), z(), w());
        }

        default void zzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), z(), w());
        }

        default <R> R zwx(final Vector3.Factory<R> factory) {
            return factory.create(z(), w(), x());
        }

        default void zwxTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), x());
        }

        default <R> R zwy(final Vector3.Factory<R> factory) {
            return factory.create(z(), w(), y());
        }

        default void zwyTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), y());
        }

        default <R> R zwz(final Vector3.Factory<R> factory) {
            return factory.create(z(), w(), z());
        }

        default void zwzTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), z());
        }

        default <R> R zww(final Vector3.Factory<R> factory) {
            return factory.create(z(), w(), w());
        }

        default void zwwTo(final Vector3.Consumer consumer) {
            consumer.xyz(z(), w(), w());
        }

        default <R> R wxx(final Vector3.Factory<R> factory) {
            return factory.create(w(), x(), x());
        }

        default void wxxTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), x());
        }

        default <R> R wxy(final Vector3.Factory<R> factory) {
            return factory.create(w(), x(), y());
        }

        default void wxyTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), y());
        }

        default <R> R wxz(final Vector3.Factory<R> factory) {
            return factory.create(w(), x(), z());
        }

        default void wxzTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), z());
        }

        default <R> R wxw(final Vector3.Factory<R> factory) {
            return factory.create(w(), x(), w());
        }

        default void wxwTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), x(), w());
        }

        default <R> R wyx(final Vector3.Factory<R> factory) {
            return factory.create(w(), y(), x());
        }

        default void wyxTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), x());
        }

        default <R> R wyy(final Vector3.Factory<R> factory) {
            return factory.create(w(), y(), y());
        }

        default void wyyTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), y());
        }

        default <R> R wyz(final Vector3.Factory<R> factory) {
            return factory.create(w(), y(), z());
        }

        default void wyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), z());
        }

        default <R> R wyw(final Vector3.Factory<R> factory) {
            return factory.create(w(), y(), w());
        }

        default void wywTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), y(), w());
        }

        default <R> R wzx(final Vector3.Factory<R> factory) {
            return factory.create(w(), z(), x());
        }

        default void wzxTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), x());
        }

        default <R> R wzy(final Vector3.Factory<R> factory) {
            return factory.create(w(), z(), y());
        }

        default void wzyTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), y());
        }

        default <R> R wzz(final Vector3.Factory<R> factory) {
            return factory.create(w(), z(), z());
        }

        default void wzzTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), z());
        }

        default <R> R wzw(final Vector3.Factory<R> factory) {
            return factory.create(w(), z(), w());
        }

        default void wzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), z(), w());
        }

        default <R> R wwx(final Vector3.Factory<R> factory) {
            return factory.create(w(), w(), x());
        }

        default void wwxTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), x());
        }

        default <R> R wwy(final Vector3.Factory<R> factory) {
            return factory.create(w(), w(), y());
        }

        default void wwyTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), y());
        }

        default <R> R wwz(final Vector3.Factory<R> factory) {
            return factory.create(w(), w(), z());
        }

        default void wwzTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), z());
        }

        default <R> R www(final Vector3.Factory<R> factory) {
            return factory.create(w(), w(), w());
        }

        default void wwwTo(final Vector3.Consumer consumer) {
            consumer.xyz(w(), w(), w());
        }

        default <R> R xxxx(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), x());
        }

        default void xxxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), x());
        }

        default <R> R xxxy(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), y());
        }

        default void xxxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), y());
        }

        default <R> R xxxz(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), z());
        }

        default void xxxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), z());
        }

        default <R> R xxxw(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), x(), w());
        }

        default void xxxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), x(), w());
        }

        default <R> R xxyx(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), x());
        }

        default void xxyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), x());
        }

        default <R> R xxyy(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), y());
        }

        default void xxyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), y());
        }

        default <R> R xxyz(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), z());
        }

        default void xxyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), z());
        }

        default <R> R xxyw(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), y(), w());
        }

        default void xxywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), y(), w());
        }

        default <R> R xxzx(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), x());
        }

        default void xxzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), x());
        }

        default <R> R xxzy(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), y());
        }

        default void xxzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), y());
        }

        default <R> R xxzz(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), z());
        }

        default void xxzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), z());
        }

        default <R> R xxzw(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), z(), w());
        }

        default void xxzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), z(), w());
        }

        default <R> R xxwx(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), x());
        }

        default void xxwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), x());
        }

        default <R> R xxwy(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), y());
        }

        default void xxwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), y());
        }

        default <R> R xxwz(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), z());
        }

        default void xxwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), z());
        }

        default <R> R xxww(final Vector4.Factory<R> factory) {
            return factory.create(x(), x(), w(), w());
        }

        default void xxwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), x(), w(), w());
        }

        default <R> R xyxx(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), x());
        }

        default void xyxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), x());
        }

        default <R> R xyxy(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), y());
        }

        default void xyxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), y());
        }

        default <R> R xyxz(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), z());
        }

        default void xyxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), z());
        }

        default <R> R xyxw(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), x(), w());
        }

        default void xyxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), x(), w());
        }

        default <R> R xyyx(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), x());
        }

        default void xyyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), x());
        }

        default <R> R xyyy(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), y());
        }

        default void xyyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), y());
        }

        default <R> R xyyz(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), z());
        }

        default void xyyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), z());
        }

        default <R> R xyyw(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), y(), w());
        }

        default void xyywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), y(), w());
        }

        default <R> R xyzx(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), x());
        }

        default void xyzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), x());
        }

        default <R> R xyzy(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), y());
        }

        default void xyzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), y());
        }

        default <R> R xyzz(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), z());
        }

        default void xyzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), z());
        }

        default <R> R xyzw(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), z(), w());
        }

        default void xyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), z(), w());
        }

        default <R> R xywx(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), x());
        }

        default void xywxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), x());
        }

        default <R> R xywy(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), y());
        }

        default void xywyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), y());
        }

        default <R> R xywz(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), z());
        }

        default void xywzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), z());
        }

        default <R> R xyww(final Vector4.Factory<R> factory) {
            return factory.create(x(), y(), w(), w());
        }

        default void xywwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), y(), w(), w());
        }

        default <R> R xzxx(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), x());
        }

        default void xzxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), x());
        }

        default <R> R xzxy(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), y());
        }

        default void xzxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), y());
        }

        default <R> R xzxz(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), z());
        }

        default void xzxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), z());
        }

        default <R> R xzxw(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), x(), w());
        }

        default void xzxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), x(), w());
        }

        default <R> R xzyx(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), x());
        }

        default void xzyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), x());
        }

        default <R> R xzyy(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), y());
        }

        default void xzyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), y());
        }

        default <R> R xzyz(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), z());
        }

        default void xzyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), z());
        }

        default <R> R xzyw(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), y(), w());
        }

        default void xzywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), y(), w());
        }

        default <R> R xzzx(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), x());
        }

        default void xzzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), x());
        }

        default <R> R xzzy(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), y());
        }

        default void xzzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), y());
        }

        default <R> R xzzz(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), z());
        }

        default void xzzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), z());
        }

        default <R> R xzzw(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), z(), w());
        }

        default void xzzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), z(), w());
        }

        default <R> R xzwx(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), x());
        }

        default void xzwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), x());
        }

        default <R> R xzwy(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), y());
        }

        default void xzwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), y());
        }

        default <R> R xzwz(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), z());
        }

        default void xzwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), z());
        }

        default <R> R xzww(final Vector4.Factory<R> factory) {
            return factory.create(x(), z(), w(), w());
        }

        default void xzwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), z(), w(), w());
        }

        default <R> R xwxx(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), x());
        }

        default void xwxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), x());
        }

        default <R> R xwxy(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), y());
        }

        default void xwxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), y());
        }

        default <R> R xwxz(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), z());
        }

        default void xwxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), z());
        }

        default <R> R xwxw(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), x(), w());
        }

        default void xwxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), x(), w());
        }

        default <R> R xwyx(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), x());
        }

        default void xwyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), x());
        }

        default <R> R xwyy(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), y());
        }

        default void xwyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), y());
        }

        default <R> R xwyz(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), z());
        }

        default void xwyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), z());
        }

        default <R> R xwyw(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), y(), w());
        }

        default void xwywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), y(), w());
        }

        default <R> R xwzx(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), x());
        }

        default void xwzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), x());
        }

        default <R> R xwzy(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), y());
        }

        default void xwzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), y());
        }

        default <R> R xwzz(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), z());
        }

        default void xwzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), z());
        }

        default <R> R xwzw(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), z(), w());
        }

        default void xwzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), z(), w());
        }

        default <R> R xwwx(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), x());
        }

        default void xwwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), x());
        }

        default <R> R xwwy(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), y());
        }

        default void xwwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), y());
        }

        default <R> R xwwz(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), z());
        }

        default void xwwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), z());
        }

        default <R> R xwww(final Vector4.Factory<R> factory) {
            return factory.create(x(), w(), w(), w());
        }

        default void xwwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(x(), w(), w(), w());
        }

        default <R> R yxxx(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), x());
        }

        default void yxxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), x());
        }

        default <R> R yxxy(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), y());
        }

        default void yxxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), y());
        }

        default <R> R yxxz(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), z());
        }

        default void yxxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), z());
        }

        default <R> R yxxw(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), x(), w());
        }

        default void yxxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), x(), w());
        }

        default <R> R yxyx(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), x());
        }

        default void yxyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), x());
        }

        default <R> R yxyy(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), y());
        }

        default void yxyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), y());
        }

        default <R> R yxyz(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), z());
        }

        default void yxyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), z());
        }

        default <R> R yxyw(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), y(), w());
        }

        default void yxywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), y(), w());
        }

        default <R> R yxzx(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), x());
        }

        default void yxzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), x());
        }

        default <R> R yxzy(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), y());
        }

        default void yxzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), y());
        }

        default <R> R yxzz(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), z());
        }

        default void yxzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), z());
        }

        default <R> R yxzw(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), z(), w());
        }

        default void yxzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), z(), w());
        }

        default <R> R yxwx(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), x());
        }

        default void yxwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), x());
        }

        default <R> R yxwy(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), y());
        }

        default void yxwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), y());
        }

        default <R> R yxwz(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), z());
        }

        default void yxwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), z());
        }

        default <R> R yxww(final Vector4.Factory<R> factory) {
            return factory.create(y(), x(), w(), w());
        }

        default void yxwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), x(), w(), w());
        }

        default <R> R yyxx(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), x());
        }

        default void yyxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), x());
        }

        default <R> R yyxy(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), y());
        }

        default void yyxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), y());
        }

        default <R> R yyxz(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), z());
        }

        default void yyxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), z());
        }

        default <R> R yyxw(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), x(), w());
        }

        default void yyxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), x(), w());
        }

        default <R> R yyyx(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), x());
        }

        default void yyyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), x());
        }

        default <R> R yyyy(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), y());
        }

        default void yyyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), y());
        }

        default <R> R yyyz(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), z());
        }

        default void yyyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), z());
        }

        default <R> R yyyw(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), y(), w());
        }

        default void yyywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), y(), w());
        }

        default <R> R yyzx(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), x());
        }

        default void yyzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), x());
        }

        default <R> R yyzy(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), y());
        }

        default void yyzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), y());
        }

        default <R> R yyzz(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), z());
        }

        default void yyzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), z());
        }

        default <R> R yyzw(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), z(), w());
        }

        default void yyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), z(), w());
        }

        default <R> R yywx(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), x());
        }

        default void yywxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), x());
        }

        default <R> R yywy(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), y());
        }

        default void yywyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), y());
        }

        default <R> R yywz(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), z());
        }

        default void yywzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), z());
        }

        default <R> R yyww(final Vector4.Factory<R> factory) {
            return factory.create(y(), y(), w(), w());
        }

        default void yywwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), y(), w(), w());
        }

        default <R> R yzxx(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), x());
        }

        default void yzxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), x());
        }

        default <R> R yzxy(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), y());
        }

        default void yzxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), y());
        }

        default <R> R yzxz(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), z());
        }

        default void yzxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), z());
        }

        default <R> R yzxw(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), x(), w());
        }

        default void yzxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), x(), w());
        }

        default <R> R yzyx(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), x());
        }

        default void yzyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), x());
        }

        default <R> R yzyy(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), y());
        }

        default void yzyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), y());
        }

        default <R> R yzyz(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), z());
        }

        default void yzyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), z());
        }

        default <R> R yzyw(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), y(), w());
        }

        default void yzywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), y(), w());
        }

        default <R> R yzzx(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), x());
        }

        default void yzzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), x());
        }

        default <R> R yzzy(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), y());
        }

        default void yzzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), y());
        }

        default <R> R yzzz(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), z());
        }

        default void yzzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), z());
        }

        default <R> R yzzw(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), z(), w());
        }

        default void yzzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), z(), w());
        }

        default <R> R yzwx(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), x());
        }

        default void yzwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), x());
        }

        default <R> R yzwy(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), y());
        }

        default void yzwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), y());
        }

        default <R> R yzwz(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), z());
        }

        default void yzwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), z());
        }

        default <R> R yzww(final Vector4.Factory<R> factory) {
            return factory.create(y(), z(), w(), w());
        }

        default void yzwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), z(), w(), w());
        }

        default <R> R ywxx(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), x());
        }

        default void ywxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), x());
        }

        default <R> R ywxy(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), y());
        }

        default void ywxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), y());
        }

        default <R> R ywxz(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), z());
        }

        default void ywxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), z());
        }

        default <R> R ywxw(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), x(), w());
        }

        default void ywxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), x(), w());
        }

        default <R> R ywyx(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), x());
        }

        default void ywyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), x());
        }

        default <R> R ywyy(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), y());
        }

        default void ywyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), y());
        }

        default <R> R ywyz(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), z());
        }

        default void ywyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), z());
        }

        default <R> R ywyw(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), y(), w());
        }

        default void ywywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), y(), w());
        }

        default <R> R ywzx(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), x());
        }

        default void ywzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), x());
        }

        default <R> R ywzy(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), y());
        }

        default void ywzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), y());
        }

        default <R> R ywzz(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), z());
        }

        default void ywzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), z());
        }

        default <R> R ywzw(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), z(), w());
        }

        default void ywzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), z(), w());
        }

        default <R> R ywwx(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), x());
        }

        default void ywwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), x());
        }

        default <R> R ywwy(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), y());
        }

        default void ywwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), y());
        }

        default <R> R ywwz(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), z());
        }

        default void ywwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), z());
        }

        default <R> R ywww(final Vector4.Factory<R> factory) {
            return factory.create(y(), w(), w(), w());
        }

        default void ywwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(y(), w(), w(), w());
        }

        default <R> R zxxx(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), x());
        }

        default void zxxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), x());
        }

        default <R> R zxxy(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), y());
        }

        default void zxxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), y());
        }

        default <R> R zxxz(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), z());
        }

        default void zxxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), z());
        }

        default <R> R zxxw(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), x(), w());
        }

        default void zxxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), x(), w());
        }

        default <R> R zxyx(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), x());
        }

        default void zxyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), x());
        }

        default <R> R zxyy(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), y());
        }

        default void zxyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), y());
        }

        default <R> R zxyz(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), z());
        }

        default void zxyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), z());
        }

        default <R> R zxyw(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), y(), w());
        }

        default void zxywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), y(), w());
        }

        default <R> R zxzx(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), x());
        }

        default void zxzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), x());
        }

        default <R> R zxzy(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), y());
        }

        default void zxzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), y());
        }

        default <R> R zxzz(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), z());
        }

        default void zxzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), z());
        }

        default <R> R zxzw(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), z(), w());
        }

        default void zxzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), z(), w());
        }

        default <R> R zxwx(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), x());
        }

        default void zxwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), x());
        }

        default <R> R zxwy(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), y());
        }

        default void zxwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), y());
        }

        default <R> R zxwz(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), z());
        }

        default void zxwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), z());
        }

        default <R> R zxww(final Vector4.Factory<R> factory) {
            return factory.create(z(), x(), w(), w());
        }

        default void zxwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), x(), w(), w());
        }

        default <R> R zyxx(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), x());
        }

        default void zyxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), x());
        }

        default <R> R zyxy(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), y());
        }

        default void zyxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), y());
        }

        default <R> R zyxz(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), z());
        }

        default void zyxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), z());
        }

        default <R> R zyxw(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), x(), w());
        }

        default void zyxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), x(), w());
        }

        default <R> R zyyx(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), x());
        }

        default void zyyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), x());
        }

        default <R> R zyyy(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), y());
        }

        default void zyyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), y());
        }

        default <R> R zyyz(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), z());
        }

        default void zyyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), z());
        }

        default <R> R zyyw(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), y(), w());
        }

        default void zyywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), y(), w());
        }

        default <R> R zyzx(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), x());
        }

        default void zyzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), x());
        }

        default <R> R zyzy(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), y());
        }

        default void zyzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), y());
        }

        default <R> R zyzz(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), z());
        }

        default void zyzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), z());
        }

        default <R> R zyzw(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), z(), w());
        }

        default void zyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), z(), w());
        }

        default <R> R zywx(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), x());
        }

        default void zywxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), x());
        }

        default <R> R zywy(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), y());
        }

        default void zywyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), y());
        }

        default <R> R zywz(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), z());
        }

        default void zywzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), z());
        }

        default <R> R zyww(final Vector4.Factory<R> factory) {
            return factory.create(z(), y(), w(), w());
        }

        default void zywwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), y(), w(), w());
        }

        default <R> R zzxx(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), x());
        }

        default void zzxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), x());
        }

        default <R> R zzxy(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), y());
        }

        default void zzxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), y());
        }

        default <R> R zzxz(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), z());
        }

        default void zzxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), z());
        }

        default <R> R zzxw(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), x(), w());
        }

        default void zzxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), x(), w());
        }

        default <R> R zzyx(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), x());
        }

        default void zzyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), x());
        }

        default <R> R zzyy(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), y());
        }

        default void zzyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), y());
        }

        default <R> R zzyz(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), z());
        }

        default void zzyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), z());
        }

        default <R> R zzyw(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), y(), w());
        }

        default void zzywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), y(), w());
        }

        default <R> R zzzx(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), x());
        }

        default void zzzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), x());
        }

        default <R> R zzzy(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), y());
        }

        default void zzzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), y());
        }

        default <R> R zzzz(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), z());
        }

        default void zzzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), z());
        }

        default <R> R zzzw(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), z(), w());
        }

        default void zzzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), z(), w());
        }

        default <R> R zzwx(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), x());
        }

        default void zzwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), x());
        }

        default <R> R zzwy(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), y());
        }

        default void zzwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), y());
        }

        default <R> R zzwz(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), z());
        }

        default void zzwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), z());
        }

        default <R> R zzww(final Vector4.Factory<R> factory) {
            return factory.create(z(), z(), w(), w());
        }

        default void zzwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), z(), w(), w());
        }

        default <R> R zwxx(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), x());
        }

        default void zwxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), x());
        }

        default <R> R zwxy(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), y());
        }

        default void zwxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), y());
        }

        default <R> R zwxz(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), z());
        }

        default void zwxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), z());
        }

        default <R> R zwxw(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), x(), w());
        }

        default void zwxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), x(), w());
        }

        default <R> R zwyx(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), x());
        }

        default void zwyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), x());
        }

        default <R> R zwyy(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), y());
        }

        default void zwyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), y());
        }

        default <R> R zwyz(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), z());
        }

        default void zwyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), z());
        }

        default <R> R zwyw(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), y(), w());
        }

        default void zwywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), y(), w());
        }

        default <R> R zwzx(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), x());
        }

        default void zwzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), x());
        }

        default <R> R zwzy(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), y());
        }

        default void zwzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), y());
        }

        default <R> R zwzz(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), z());
        }

        default void zwzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), z());
        }

        default <R> R zwzw(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), z(), w());
        }

        default void zwzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), z(), w());
        }

        default <R> R zwwx(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), x());
        }

        default void zwwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), x());
        }

        default <R> R zwwy(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), y());
        }

        default void zwwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), y());
        }

        default <R> R zwwz(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), z());
        }

        default void zwwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), z());
        }

        default <R> R zwww(final Vector4.Factory<R> factory) {
            return factory.create(z(), w(), w(), w());
        }

        default void zwwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(z(), w(), w(), w());
        }

        default <R> R wxxx(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), x());
        }

        default void wxxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), x());
        }

        default <R> R wxxy(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), y());
        }

        default void wxxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), y());
        }

        default <R> R wxxz(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), z());
        }

        default void wxxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), z());
        }

        default <R> R wxxw(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), x(), w());
        }

        default void wxxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), x(), w());
        }

        default <R> R wxyx(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), x());
        }

        default void wxyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), x());
        }

        default <R> R wxyy(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), y());
        }

        default void wxyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), y());
        }

        default <R> R wxyz(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), z());
        }

        default void wxyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), z());
        }

        default <R> R wxyw(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), y(), w());
        }

        default void wxywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), y(), w());
        }

        default <R> R wxzx(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), x());
        }

        default void wxzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), x());
        }

        default <R> R wxzy(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), y());
        }

        default void wxzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), y());
        }

        default <R> R wxzz(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), z());
        }

        default void wxzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), z());
        }

        default <R> R wxzw(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), z(), w());
        }

        default void wxzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), z(), w());
        }

        default <R> R wxwx(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), x());
        }

        default void wxwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), x());
        }

        default <R> R wxwy(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), y());
        }

        default void wxwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), y());
        }

        default <R> R wxwz(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), z());
        }

        default void wxwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), z());
        }

        default <R> R wxww(final Vector4.Factory<R> factory) {
            return factory.create(w(), x(), w(), w());
        }

        default void wxwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), x(), w(), w());
        }

        default <R> R wyxx(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), x());
        }

        default void wyxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), x());
        }

        default <R> R wyxy(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), y());
        }

        default void wyxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), y());
        }

        default <R> R wyxz(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), z());
        }

        default void wyxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), z());
        }

        default <R> R wyxw(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), x(), w());
        }

        default void wyxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), x(), w());
        }

        default <R> R wyyx(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), x());
        }

        default void wyyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), x());
        }

        default <R> R wyyy(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), y());
        }

        default void wyyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), y());
        }

        default <R> R wyyz(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), z());
        }

        default void wyyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), z());
        }

        default <R> R wyyw(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), y(), w());
        }

        default void wyywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), y(), w());
        }

        default <R> R wyzx(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), x());
        }

        default void wyzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), x());
        }

        default <R> R wyzy(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), y());
        }

        default void wyzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), y());
        }

        default <R> R wyzz(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), z());
        }

        default void wyzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), z());
        }

        default <R> R wyzw(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), z(), w());
        }

        default void wyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), z(), w());
        }

        default <R> R wywx(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), x());
        }

        default void wywxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), x());
        }

        default <R> R wywy(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), y());
        }

        default void wywyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), y());
        }

        default <R> R wywz(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), z());
        }

        default void wywzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), z());
        }

        default <R> R wyww(final Vector4.Factory<R> factory) {
            return factory.create(w(), y(), w(), w());
        }

        default void wywwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), y(), w(), w());
        }

        default <R> R wzxx(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), x());
        }

        default void wzxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), x());
        }

        default <R> R wzxy(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), y());
        }

        default void wzxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), y());
        }

        default <R> R wzxz(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), z());
        }

        default void wzxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), z());
        }

        default <R> R wzxw(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), x(), w());
        }

        default void wzxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), x(), w());
        }

        default <R> R wzyx(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), x());
        }

        default void wzyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), x());
        }

        default <R> R wzyy(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), y());
        }

        default void wzyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), y());
        }

        default <R> R wzyz(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), z());
        }

        default void wzyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), z());
        }

        default <R> R wzyw(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), y(), w());
        }

        default void wzywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), y(), w());
        }

        default <R> R wzzx(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), x());
        }

        default void wzzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), x());
        }

        default <R> R wzzy(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), y());
        }

        default void wzzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), y());
        }

        default <R> R wzzz(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), z());
        }

        default void wzzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), z());
        }

        default <R> R wzzw(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), z(), w());
        }

        default void wzzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), z(), w());
        }

        default <R> R wzwx(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), x());
        }

        default void wzwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), x());
        }

        default <R> R wzwy(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), y());
        }

        default void wzwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), y());
        }

        default <R> R wzwz(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), z());
        }

        default void wzwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), z());
        }

        default <R> R wzww(final Vector4.Factory<R> factory) {
            return factory.create(w(), z(), w(), w());
        }

        default void wzwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), z(), w(), w());
        }

        default <R> R wwxx(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), x());
        }

        default void wwxxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), x());
        }

        default <R> R wwxy(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), y());
        }

        default void wwxyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), y());
        }

        default <R> R wwxz(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), z());
        }

        default void wwxzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), z());
        }

        default <R> R wwxw(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), x(), w());
        }

        default void wwxwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), x(), w());
        }

        default <R> R wwyx(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), x());
        }

        default void wwyxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), x());
        }

        default <R> R wwyy(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), y());
        }

        default void wwyyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), y());
        }

        default <R> R wwyz(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), z());
        }

        default void wwyzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), z());
        }

        default <R> R wwyw(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), y(), w());
        }

        default void wwywTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), y(), w());
        }

        default <R> R wwzx(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), x());
        }

        default void wwzxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), x());
        }

        default <R> R wwzy(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), y());
        }

        default void wwzyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), y());
        }

        default <R> R wwzz(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), z());
        }

        default void wwzzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), z());
        }

        default <R> R wwzw(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), z(), w());
        }

        default void wwzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), z(), w());
        }

        default <R> R wwwx(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), x());
        }

        default void wwwxTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), x());
        }

        default <R> R wwwy(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), y());
        }

        default void wwwyTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), y());
        }

        default <R> R wwwz(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), z());
        }

        default void wwwzTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), z());
        }

        default <R> R wwww(final Vector4.Factory<R> factory) {
            return factory.create(w(), w(), w(), w());
        }

        default void wwwwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(w(), w(), w(), w());
        }

    }

    public interface Mutable extends Consumer {

        void x(double x);
        void y(double y);
        void z(double z);
        void w(double w);

        default void xy(final double v) {
            xy(v, v);
        }

        default void xz(final double v) {
            xz(v, v);
        }

        default void xw(final double v) {
            xw(v, v);
        }

        default void yz(final double v) {
            yz(v, v);
        }

        default void yw(final double v) {
            yw(v, v);
        }

        default void zw(final double v) {
            zw(v, v);
        }

        default void xyz(final double v) {
            xyz(v, v, v);
        }

        default void xyw(final double v) {
            xyw(v, v, v);
        }

        default void xzw(final double v) {
            xzw(v, v, v);
        }

        default void yzw(final double v) {
            yzw(v, v, v);
        }

        default void xyzw(final double v) {
            xyzw(v, v, v, v);
        }

        default void xy(final double x, final double y) {
            x(x);
            y(y);
        }

        default void xz(final double x, final double z) {
            x(x);
            z(z);
        }

        default void xw(final double x, final double w) {
            x(x);
            w(w);
        }

        default void yx(final double y, final double x) {
            x(x);
            y(y);
        }

        default void yz(final double y, final double z) {
            y(y);
            z(z);
        }

        default void yw(final double y, final double w) {
            y(y);
            w(w);
        }

        default void zx(final double z, final double x) {
            x(x);
            z(z);
        }

        default void zy(final double z, final double y) {
            y(y);
            z(z);
        }

        default void zw(final double z, final double w) {
            z(z);
            w(w);
        }

        default void wx(final double w, final double x) {
            x(x);
            w(w);
        }

        default void wy(final double w, final double y) {
            y(y);
            w(w);
        }

        default void wz(final double w, final double z) {
            z(z);
            w(w);
        }

        default void xyz(final double x, final double y, final double z) {
            x(x);
            y(y);
            z(z);
        }

        default void xyw(final double x, final double y, final double w) {
            x(x);
            y(y);
            w(w);
        }

        default void xzy(final double x, final double z, final double y) {
            x(x);
            y(y);
            z(z);
        }

        default void xzw(final double x, final double z, final double w) {
            x(x);
            z(z);
            w(w);
        }

        default void xwy(final double x, final double w, final double y) {
            x(x);
            y(y);
            w(w);
        }

        default void xwz(final double x, final double w, final double z) {
            x(x);
            z(z);
            w(w);
        }

        default void yxz(final double y, final double x, final double z) {
            x(x);
            y(y);
            z(z);
        }

        default void yxw(final double y, final double x, final double w) {
            x(x);
            y(y);
            w(w);
        }

        default void yzx(final double y, final double z, final double x) {
            x(x);
            y(y);
            z(z);
        }

        default void yzw(final double y, final double z, final double w) {
            y(y);
            z(z);
            w(w);
        }

        default void ywx(final double y, final double w, final double x) {
            x(x);
            y(y);
            w(w);
        }

        default void ywz(final double y, final double w, final double z) {
            y(y);
            z(z);
            w(w);
        }

        default void zxy(final double z, final double x, final double y) {
            x(x);
            y(y);
            z(z);
        }

        default void zxw(final double z, final double x, final double w) {
            x(x);
            z(z);
            w(w);
        }

        default void zyx(final double z, final double y, final double x) {
            x(x);
            y(y);
            z(z);
        }

        default void zyw(final double z, final double y, final double w) {
            y(y);
            z(z);
            w(w);
        }

        default void zwx(final double z, final double w, final double x) {
            x(x);
            z(z);
            w(w);
        }

        default void zwy(final double z, final double w, final double y) {
            y(y);
            z(z);
            w(w);
        }

        default void wxy(final double w, final double x, final double y) {
            x(x);
            y(y);
            w(w);
        }

        default void wxz(final double w, final double x, final double z) {
            x(x);
            z(z);
            w(w);
        }

        default void wyx(final double w, final double y, final double x) {
            x(x);
            y(y);
            w(w);
        }

        default void wyz(final double w, final double y, final double z) {
            y(y);
            z(z);
            w(w);
        }

        default void wzx(final double w, final double z, final double x) {
            x(x);
            z(z);
            w(w);
        }

        default void wzy(final double w, final double z, final double y) {
            y(y);
            z(z);
            w(w);
        }

        @Override
        default void xyzw(final double x, final double y, final double z, final double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xywz(final double x, final double y, final double w, final double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xzyw(final double x, final double z, final double y, final double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xzwy(final double x, final double z, final double w, final double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xwyz(final double x, final double w, final double y, final double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xwzy(final double x, final double w, final double z, final double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yxzw(final double y, final double x, final double z, final double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yxwz(final double y, final double x, final double w, final double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yzxw(final double y, final double z, final double x, final double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void yzwx(final double y, final double z, final double w, final double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void ywxz(final double y, final double w, final double x, final double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void ywzx(final double y, final double w, final double z, final double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zxyw(final double z, final double x, final double y, final double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zxwy(final double z, final double x, final double w, final double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zyxw(final double z, final double y, final double x, final double w) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zywx(final double z, final double y, final double w, final double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zwxy(final double z, final double w, final double x, final double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void zwyx(final double z, final double w, final double y, final double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wxyz(final double w, final double x, final double y, final double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wxzy(final double w, final double x, final double z, final double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wyxz(final double w, final double y, final double x, final double z) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wyzx(final double w, final double y, final double z, final double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wzxy(final double w, final double z, final double x, final double y) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void wzyx(final double w, final double z, final double y, final double x) {
            x(x);
            y(y);
            z(z);
            w(w);
        }

        default void xy(final Vector2.Accessible v) {
            xy(v.x(), v.y());
        }

        default void xz(final Vector2.Accessible v) {
            xz(v.x(), v.y());
        }

        default void xw(final Vector2.Accessible v) {
            xw(v.x(), v.y());
        }

        default void yx(final Vector2.Accessible v) {
            yx(v.x(), v.y());
        }

        default void yz(final Vector2.Accessible v) {
            yz(v.x(), v.y());
        }

        default void yw(final Vector2.Accessible v) {
            yw(v.x(), v.y());
        }

        default void zx(final Vector2.Accessible v) {
            zx(v.x(), v.y());
        }

        default void zy(final Vector2.Accessible v) {
            zy(v.x(), v.y());
        }

        default void zw(final Vector2.Accessible v) {
            zw(v.x(), v.y());
        }

        default void wx(final Vector2.Accessible v) {
            wx(v.x(), v.y());
        }

        default void wy(final Vector2.Accessible v) {
            wy(v.x(), v.y());
        }

        default void wz(final Vector2.Accessible v) {
            wz(v.x(), v.y());
        }

        default void xyz(final Vector3.Accessible v) {
            xyz(v.x(), v.y(), v.z());
        }

        default void xyw(final Vector3.Accessible v) {
            xyw(v.x(), v.y(), v.z());
        }

        default void xzy(final Vector3.Accessible v) {
            xzy(v.x(), v.y(), v.z());
        }

        default void xzw(final Vector3.Accessible v) {
            xzw(v.x(), v.y(), v.z());
        }

        default void xwy(final Vector3.Accessible v) {
            xwy(v.x(), v.y(), v.z());
        }

        default void xwz(final Vector3.Accessible v) {
            xwz(v.x(), v.y(), v.z());
        }

        default void yxz(final Vector3.Accessible v) {
            yxz(v.x(), v.y(), v.z());
        }

        default void yxw(final Vector3.Accessible v) {
            yxw(v.x(), v.y(), v.z());
        }

        default void yzx(final Vector3.Accessible v) {
            yzx(v.x(), v.y(), v.z());
        }

        default void yzw(final Vector3.Accessible v) {
            yzw(v.x(), v.y(), v.z());
        }

        default void ywx(final Vector3.Accessible v) {
            ywx(v.x(), v.y(), v.z());
        }

        default void ywz(final Vector3.Accessible v) {
            ywz(v.x(), v.y(), v.z());
        }

        default void zxy(final Vector3.Accessible v) {
            zxy(v.x(), v.y(), v.z());
        }

        default void zxw(final Vector3.Accessible v) {
            zxw(v.x(), v.y(), v.z());
        }

        default void zyx(final Vector3.Accessible v) {
            zyx(v.x(), v.y(), v.z());
        }

        default void zyw(final Vector3.Accessible v) {
            zyw(v.x(), v.y(), v.z());
        }

        default void zwx(final Vector3.Accessible v) {
            zwx(v.x(), v.y(), v.z());
        }

        default void zwy(final Vector3.Accessible v) {
            zwy(v.x(), v.y(), v.z());
        }

        default void wxy(final Vector3.Accessible v) {
            wxy(v.x(), v.y(), v.z());
        }

        default void wxz(final Vector3.Accessible v) {
            wxz(v.x(), v.y(), v.z());
        }

        default void wyx(final Vector3.Accessible v) {
            wyx(v.x(), v.y(), v.z());
        }

        default void wyz(final Vector3.Accessible v) {
            wyz(v.x(), v.y(), v.z());
        }

        default void wzx(final Vector3.Accessible v) {
            wzx(v.x(), v.y(), v.z());
        }

        default void wzy(final Vector3.Accessible v) {
            wzy(v.x(), v.y(), v.z());
        }

        default void xyzw(final Vector4.Accessible v) {
            xyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void xywz(final Vector4.Accessible v) {
            xywz(v.x(), v.y(), v.z(), v.w());
        }

        default void xzyw(final Vector4.Accessible v) {
            xzyw(v.x(), v.y(), v.z(), v.w());
        }

        default void xzwy(final Vector4.Accessible v) {
            xzwy(v.x(), v.y(), v.z(), v.w());
        }

        default void xwyz(final Vector4.Accessible v) {
            xwyz(v.x(), v.y(), v.z(), v.w());
        }

        default void xwzy(final Vector4.Accessible v) {
            xwzy(v.x(), v.y(), v.z(), v.w());
        }

        default void yxzw(final Vector4.Accessible v) {
            yxzw(v.x(), v.y(), v.z(), v.w());
        }

        default void yxwz(final Vector4.Accessible v) {
            yxwz(v.x(), v.y(), v.z(), v.w());
        }

        default void yzxw(final Vector4.Accessible v) {
            yzxw(v.x(), v.y(), v.z(), v.w());
        }

        default void yzwx(final Vector4.Accessible v) {
            yzwx(v.x(), v.y(), v.z(), v.w());
        }

        default void ywxz(final Vector4.Accessible v) {
            ywxz(v.x(), v.y(), v.z(), v.w());
        }

        default void ywzx(final Vector4.Accessible v) {
            ywzx(v.x(), v.y(), v.z(), v.w());
        }

        default void zxyw(final Vector4.Accessible v) {
            zxyw(v.x(), v.y(), v.z(), v.w());
        }

        default void zxwy(final Vector4.Accessible v) {
            zxwy(v.x(), v.y(), v.z(), v.w());
        }

        default void zyxw(final Vector4.Accessible v) {
            zyxw(v.x(), v.y(), v.z(), v.w());
        }

        default void zywx(final Vector4.Accessible v) {
            zywx(v.x(), v.y(), v.z(), v.w());
        }

        default void zwxy(final Vector4.Accessible v) {
            zwxy(v.x(), v.y(), v.z(), v.w());
        }

        default void zwyx(final Vector4.Accessible v) {
            zwyx(v.x(), v.y(), v.z(), v.w());
        }

        default void wxyz(final Vector4.Accessible v) {
            wxyz(v.x(), v.y(), v.z(), v.w());
        }

        default void wxzy(final Vector4.Accessible v) {
            wxzy(v.x(), v.y(), v.z(), v.w());
        }

        default void wyxz(final Vector4.Accessible v) {
            wyxz(v.x(), v.y(), v.z(), v.w());
        }

        default void wyzx(final Vector4.Accessible v) {
            wyzx(v.x(), v.y(), v.z(), v.w());
        }

        default void wzxy(final Vector4.Accessible v) {
            wzxy(v.x(), v.y(), v.z(), v.w());
        }

        default void wzyx(final Vector4.Accessible v) {
            wzyx(v.x(), v.y(), v.z(), v.w());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
