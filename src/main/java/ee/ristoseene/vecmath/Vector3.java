package ee.ristoseene.vecmath;

public final class Vector3 {

    private Vector3() {}

    public interface Accessible {

        double x();
        double y();
        double z();

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

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

    @FunctionalInterface
    public interface Consumer {

        void xyz(double x, double y, double z);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double x, double y, double z);

    }

}
