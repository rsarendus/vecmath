package ee.ristoseene.vecmath;

public final class Vector3 {

    private Vector3() {}

    @FunctionalInterface
    public interface Consumer {

        void xyz(double x, double y, double z);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double x, double y, double z);

    }

    public interface Accessible {

        double x();
        double y();
        double z();

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

    }

    public interface Mutable extends Consumer {

        void x(double x);
        void y(double y);
        void z(double z);

        default void xy(final double v) {
            xy(v, v);
        }

        default void xz(final double v) {
            xz(v, v);
        }

        default void yz(final double v) {
            yz(v, v);
        }

        default void xyz(final double v) {
            xyz(v, v, v);
        }

        default void xy(final double x, final double y) {
            x(x);
            y(y);
        }

        default void xz(final double x, final double z) {
            x(x);
            z(z);
        }

        default void yx(final double y, final double x) {
            x(x);
            y(y);
        }

        default void yz(final double y, final double z) {
            y(y);
            z(z);
        }

        default void zx(final double z, final double x) {
            x(x);
            z(z);
        }

        default void zy(final double z, final double y) {
            y(y);
            z(z);
        }

        @Override
        default void xyz(final double x, final double y, final double z) {
            x(x);
            y(y);
            z(z);
        }

        default void xzy(final double x, final double z, final double y) {
            x(x);
            y(y);
            z(z);
        }

        default void yxz(final double y, final double x, final double z) {
            x(x);
            y(y);
            z(z);
        }

        default void yzx(final double y, final double z, final double x) {
            x(x);
            y(y);
            z(z);
        }

        default void zxy(final double z, final double x, final double y) {
            x(x);
            y(y);
            z(z);
        }

        default void zyx(final double z, final double y, final double x) {
            x(x);
            y(y);
            z(z);
        }

        default void xy(final Vector2.Accessible v) {
            xy(v.x(), v.y());
        }

        default void xz(final Vector2.Accessible v) {
            xz(v.x(), v.y());
        }

        default void yx(final Vector2.Accessible v) {
            yx(v.x(), v.y());
        }

        default void yz(final Vector2.Accessible v) {
            yz(v.x(), v.y());
        }

        default void zx(final Vector2.Accessible v) {
            zx(v.x(), v.y());
        }

        default void zy(final Vector2.Accessible v) {
            zy(v.x(), v.y());
        }

        default void xyz(final Vector3.Accessible v) {
            xyz(v.x(), v.y(), v.z());
        }

        default void xzy(final Vector3.Accessible v) {
            xzy(v.x(), v.y(), v.z());
        }

        default void yxz(final Vector3.Accessible v) {
            yxz(v.x(), v.y(), v.z());
        }

        default void yzx(final Vector3.Accessible v) {
            yzx(v.x(), v.y(), v.z());
        }

        default void zxy(final Vector3.Accessible v) {
            zxy(v.x(), v.y(), v.z());
        }

        default void zyx(final Vector3.Accessible v) {
            zyx(v.x(), v.y(), v.z());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
