package ee.ristoseene.vecmath;

public final class Matrix4x4 {

    private Matrix4x4() {}

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

    public interface Accessible extends Matrix3x4.Accessible, Matrix4x3.Accessible {

        double Tw();

        default <R> R Txw(final Vector2.Factory<R> factory) {
            return factory.create(Tx(), Tw());
        }

        default void TxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Tx(), Tw());
        }

        default <R> R Tyw(final Vector2.Factory<R> factory) {
            return factory.create(Ty(), Tw());
        }

        default void TywTo(final Vector2.Consumer consumer) {
            consumer.xy(Ty(), Tw());
        }

        default <R> R Tzw(final Vector2.Factory<R> factory) {
            return factory.create(Tz(), Tw());
        }

        default void TzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Tz(), Tw());
        }

        default <R> R Txyw(final Vector3.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tw());
        }

        default void TxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Ty(), Tw());
        }

        default <R> R Txzw(final Vector3.Factory<R> factory) {
            return factory.create(Tx(), Tz(), Tw());
        }

        default void TxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Tz(), Tw());
        }

        default <R> R Tyzw(final Vector3.Factory<R> factory) {
            return factory.create(Ty(), Tz(), Tw());
        }

        default void TyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Ty(), Tz(), Tw());
        }

        default <R> R Txyzw(final Vector4.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tz(), Tw());
        }

        default void TxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Tx(), Ty(), Tz(), Tw());
        }

        default <R> R wXT(final Vector2.Factory<R> factory) {
            return factory.create(Xw(), Tw());
        }

        default void wXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xw(), Tw());
        }

        default <R> R wYT(final Vector2.Factory<R> factory) {
            return factory.create(Yw(), Tw());
        }

        default void wYTto(final Vector2.Consumer consumer) {
            consumer.xy(Yw(), Tw());
        }

        default <R> R wZT(final Vector2.Factory<R> factory) {
            return factory.create(Zw(), Tw());
        }

        default void wZTto(final Vector2.Consumer consumer) {
            consumer.xy(Zw(), Tw());
        }

        default <R> R wXYT(final Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Tw());
        }

        default void wXYTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Tw());
        }

        default <R> R wXZT(final Vector3.Factory<R> factory) {
            return factory.create(Xw(), Zw(), Tw());
        }

        default void wXZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Zw(), Tw());
        }

        default <R> R wYZT(final Vector3.Factory<R> factory) {
            return factory.create(Yw(), Zw(), Tw());
        }

        default void wYZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Yw(), Zw(), Tw());
        }

        default <R> R wXYZT(final Vector4.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Zw(), Tw());
        }

        default void wXYZTto(final Vector4.Consumer consumer) {
            consumer.xyzw(Xw(), Yw(), Zw(), Tw());
        }

        default <R> R Dxw(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tw());
        }

        default void DxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tw());
        }

        default <R> R Dyw(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Tw());
        }

        default void DywTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Tw());
        }

        default <R> R Dzw(final Vector2.Factory<R> factory) {
            return factory.create(Zz(), Tw());
        }

        default void DzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Zz(), Tw());
        }

        default <R> R Dxyw(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Tw());
        }

        default void DxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Tw());
        }

        default <R> R Dxzw(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Zz(), Tw());
        }

        default void DxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Zz(), Tw());
        }

        default <R> R Dyzw(final Vector3.Factory<R> factory) {
            return factory.create(Yy(), Zz(), Tw());
        }

        default void DyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Zz(), Tw());
        }

        default <R> R Dxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz(), Tw());
        }

        default void DxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Yy(), Zz(), Tw());
        }

        default <R> R XTxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Tx(), Tw());
        }

        default void XTxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xw(), Tx(), Tw());
        }

        default <R> R XTyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Ty(), Tw());
        }

        default void XTywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xw(), Ty(), Tw());
        }

        default <R> R XTzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Tz(), Tw());
        }

        default void XTzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Tz(), Tw());
        }

        default <R> R YTxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yw(), Tx(), Tw());
        }

        default void YTxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yw(), Tx(), Tw());
        }

        default <R> R YTyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yw(), Ty(), Tw());
        }

        default void YTywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yw(), Ty(), Tw());
        }

        default <R> R YTzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Yw(), Tz(), Tw());
        }

        default void YTzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Yw(), Tz(), Tw());
        }

        default <R> R ZTxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Zw(), Tx(), Tw());
        }

        default void ZTxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Zw(), Tx(), Tw());
        }

        default <R> R ZTyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Zw(), Ty(), Tw());
        }

        default void ZTywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Zw(), Ty(), Tw());
        }

        default <R> R ZTzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zz(), Zw(), Tz(), Tw());
        }

        default void ZTzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zz(), Zw(), Tz(), Tw());
        }

        default <R> R XTxyw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Tx(), Ty(), Tw());
        }

        default void XTxywTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xy(), Xw(), Tx(), Ty(), Tw());
        }

        default <R> R XTxzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Tx(), Tz(), Tw());
        }

        default void XTxzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xz(), Xw(), Tx(), Tz(), Tw());
        }

        default <R> R XTyzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Ty(), Tz(), Tw());
        }

        default void XTyzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Xz(), Xw(), Ty(), Tz(), Tw());
        }

        default <R> R YTxyw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yw(), Tx(), Ty(), Tw());
        }

        default void YTxywTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Yy(), Yw(), Tx(), Ty(), Tw());
        }

        default <R> R YTxzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Yw(), Tx(), Tz(), Tw());
        }

        default void YTxzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Yz(), Yw(), Tx(), Tz(), Tw());
        }

        default <R> R YTyzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw(), Ty(), Tz(), Tw());
        }

        default void YTyzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yy(), Yz(), Yw(), Ty(), Tz(), Tw());
        }

        default <R> R ZTxyw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default void ZTxywTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default <R> R ZTxzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default void ZTxzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default <R> R ZTyzw(final Matrix2x3.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default void ZTyzwTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default <R> R XYTxw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Yx(), Yw(), Tx(), Tw());
        }

        default void XYTxwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xw(), Yx(), Yw(), Tx(), Tw());
        }

        default <R> R XYTyw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Yy(), Yw(), Ty(), Tw());
        }

        default void XYTywTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Xw(), Yy(), Yw(), Ty(), Tw());
        }

        default <R> R XYTzw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Yz(), Yw(), Tz(), Tw());
        }

        default void XYTzwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xz(), Xw(), Yz(), Yw(), Tz(), Tw());
        }

        default <R> R XZTxw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Zx(), Zw(), Tx(), Tw());
        }

        default void XZTxwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xw(), Zx(), Zw(), Tx(), Tw());
        }

        default <R> R XZTyw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Zy(), Zw(), Ty(), Tw());
        }

        default void XZTywTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Xw(), Zy(), Zw(), Ty(), Tw());
        }

        default <R> R XZTzw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Zz(), Zw(), Tz(), Tw());
        }

        default void XZTzwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xz(), Xw(), Zz(), Zw(), Tz(), Tw());
        }

        default <R> R YZTxw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Yw(), Zx(), Zw(), Tx(), Tw());
        }

        default void YZTxwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Yw(), Zx(), Zw(), Tx(), Tw());
        }

        default <R> R YZTyw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yy(), Yw(), Zy(), Zw(), Ty(), Tw());
        }

        default void YZTywTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yy(), Yw(), Zy(), Zw(), Ty(), Tw());
        }

        default <R> R YZTzw(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yz(), Yw(), Zz(), Zw(), Tz(), Tw());
        }

        default void YZTzwTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yz(), Yw(), Zz(), Zw(), Tz(), Tw());
        }

        default <R> R XYTxyw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Tx(), Ty(), Tw());
        }

        default void XYTxywTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Tx(), Ty(), Tw());
        }

        default <R> R XYTxzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Tx(), Tz(), Tw());
        }

        default void XYTxzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Tx(), Tz(), Tw());
        }

        default <R> R XYTyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Ty(), Tz(), Tw());
        }

        default void XYTyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Ty(), Tz(), Tw());
        }

        default <R> R XZTxyw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default void XZTxywTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xw(), Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default <R> R XZTxzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default void XZTxzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xz(), Xw(), Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default <R> R XZTyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default void XZTyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Xz(), Xw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default <R> R YZTxyw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yw(), Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default void YZTxywTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Yy(), Yw(), Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default <R> R YZTxzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Yw(), Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default void YZTxzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Yz(), Yw(), Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default <R> R YZTyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default void YZTyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default <R> R XYTxyzw(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Tx(), Ty(), Tz(), Tw());
        }

        default void XYTxyzwTo(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R XZTxyzw(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void XZTxyzwTo(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xx(), Xy(), Xz(), Xw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R YZTxyzw(final Matrix3x4.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void YZTxyzwTo(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R XYZTxyw(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default void XYZTxywTo(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Zx(), Zy(), Zw(), Tx(), Ty(), Tw());
        }

        default <R> R XYZTxzw(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default void XYZTxzwTo(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Zx(), Zz(), Zw(), Tx(), Tz(), Tw());
        }

        default <R> R XYZTyzw(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default void XYZTyzwTo(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default <R> R XYZTxyzw(final Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void XYZTxyzwTo(final Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R xwXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xw(), Tw());
        }

        default void xwXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Tx(), Xw(), Tw());
        }

        default <R> R xwYT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Tx(), Yw(), Tw());
        }

        default void xwYTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Tx(), Yw(), Tw());
        }

        default <R> R xwZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zw(), Tw());
        }

        default void xwZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Tx(), Zw(), Tw());
        }

        default <R> R ywXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Ty(), Xw(), Tw());
        }

        default void ywXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Ty(), Xw(), Tw());
        }

        default <R> R ywYT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Ty(), Yw(), Tw());
        }

        default void ywYTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Ty(), Yw(), Tw());
        }

        default <R> R ywZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Ty(), Zw(), Tw());
        }

        default void ywZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Ty(), Zw(), Tw());
        }

        default <R> R zwXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Tz(), Xw(), Tw());
        }

        default void zwXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Tz(), Xw(), Tw());
        }

        default <R> R zwYT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Tz(), Yw(), Tw());
        }

        default void zwYTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Tz(), Yw(), Tw());
        }

        default <R> R zwZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zz(), Tz(), Zw(), Tw());
        }

        default void zwZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zz(), Tz(), Zw(), Tw());
        }

        default <R> R xwXYT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xw(), Yw(), Tw());
        }

        default void xwXYTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Yx(), Tx(), Xw(), Yw(), Tw());
        }

        default <R> R xwXZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xw(), Zw(), Tw());
        }

        default void xwXZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Zx(), Tx(), Xw(), Zw(), Tw());
        }

        default <R> R xwYZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yw(), Zw(), Tw());
        }

        default void xwYZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Zx(), Tx(), Yw(), Zw(), Tw());
        }

        default <R> R ywXYT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Ty(), Xw(), Yw(), Tw());
        }

        default void ywXYTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Yy(), Ty(), Xw(), Yw(), Tw());
        }

        default <R> R ywXZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Ty(), Xw(), Zw(), Tw());
        }

        default void ywXZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Zy(), Ty(), Xw(), Zw(), Tw());
        }

        default <R> R ywYZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty(), Yw(), Zw(), Tw());
        }

        default void ywYZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yy(), Zy(), Ty(), Yw(), Zw(), Tw());
        }

        default <R> R zwXYT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default void zwXYTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default <R> R zwXZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default void zwXZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default <R> R zwYZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default void zwYZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default <R> R xywXT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xy(), Ty(), Xw(), Tw());
        }

        default void xywXTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Tx(), Xy(), Ty(), Xw(), Tw());
        }

        default <R> R xywYT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Tx(), Yy(), Ty(), Yw(), Tw());
        }

        default void xywYTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Tx(), Yy(), Ty(), Yw(), Tw());
        }

        default <R> R xywZT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zy(), Ty(), Zw(), Tw());
        }

        default void xywZTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Zx(), Tx(), Zy(), Ty(), Zw(), Tw());
        }

        default <R> R xzwXT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xz(), Tz(), Xw(), Tw());
        }

        default void xzwXTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Tx(), Xz(), Tz(), Xw(), Tw());
        }

        default <R> R xzwYT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Tx(), Yz(), Tz(), Yw(), Tw());
        }

        default void xzwYTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Tx(), Yz(), Tz(), Yw(), Tw());
        }

        default <R> R xzwZT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zz(), Tz(), Zw(), Tw());
        }

        default void xzwZTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Zx(), Tx(), Zz(), Tz(), Zw(), Tw());
        }

        default <R> R yzwXT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Ty(), Xz(), Tz(), Xw(), Tw());
        }

        default void yzwXTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Ty(), Xz(), Tz(), Xw(), Tw());
        }

        default <R> R yzwYT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yy(), Ty(), Yz(), Tz(), Yw(), Tw());
        }

        default void yzwYTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yy(), Ty(), Yz(), Tz(), Yw(), Tw());
        }

        default <R> R yzwZT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Zy(), Ty(), Zz(), Tz(), Zw(), Tw());
        }

        default void yzwZTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Zy(), Ty(), Zz(), Tz(), Zw(), Tw());
        }

        default <R> R xywXYT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xy(), Yy(), Ty(), Xw(), Yw(), Tw());
        }

        default void xywXYTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Tx(), Xy(), Yy(), Ty(), Xw(), Yw(), Tw());
        }

        default <R> R xywXZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xy(), Zy(), Ty(), Xw(), Zw(), Tw());
        }

        default void xywXZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Zx(), Tx(), Xy(), Zy(), Ty(), Xw(), Zw(), Tw());
        }

        default <R> R xywYZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yw(), Zw(), Tw());
        }

        default void xywYZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yw(), Zw(), Tw());
        }

        default <R> R xzwXYT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default void xzwXYTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Tx(), Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default <R> R xzwXZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default void xzwXZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Zx(), Tx(), Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default <R> R xzwYZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default void xzwYZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Zx(), Tx(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default <R> R yzwXYT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Ty(), Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default void yzwXYTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Yy(), Ty(), Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default <R> R yzwXZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Ty(), Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default void yzwXZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Zy(), Ty(), Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default <R> R yzwYZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default void yzwYZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default <R> R xywXYZT(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xw(), Yw(), Zw(), Tw());
        }

        default void xywXYZTto(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xw(), Yw(), Zw(), Tw());
        }

        default <R> R xzwXYZT(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default void xzwXYZTto(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xx(), Yx(), Zx(), Tx(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default <R> R yzwXYZT(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default void yzwXYZTto(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default <R> R xyzwXYT(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xy(), Yy(), Ty(), Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default void xyzwXYTto(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xx(), Yx(), Tx(), Xy(), Yy(), Ty(), Xz(), Yz(), Tz(), Xw(), Yw(), Tw());
        }

        default <R> R xyzwXZT(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xy(), Zy(), Ty(), Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default void xyzwXZTto(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xx(), Zx(), Tx(), Xy(), Zy(), Ty(), Xz(), Zz(), Tz(), Xw(), Zw(), Tw());
        }

        default <R> R xyzwYZT(final Matrix4x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default void xyzwYZTto(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default <R> R xyzwXYZT(final Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default void xyzwXYZTto(final Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

    }

    public interface Mutable extends Consumer, Matrix3x4.Mutable, Matrix4x3.Mutable {

        void Tw(double Tw);

        default void Txw(final double v) {
            Txw(v, v);
        }

        default void Tyw(final double v) {
            Tyw(v, v);
        }

        default void Tzw(final double v) {
            Tzw(v, v);
        }

        default void Txyw(final double v) {
            Txyw(v, v, v);
        }

        default void Txzw(final double v) {
            Txzw(v, v, v);
        }

        default void Tyzw(final double v) {
            Tyzw(v, v, v);
        }

        default void Txyzw(final double v) {
            Txyzw(v, v, v, v);
        }

        default void wXT(final double v) {
            wXT(v, v);
        }

        default void wYT(final double v) {
            wYT(v, v);
        }

        default void wZT(final double v) {
            wZT(v, v);
        }

        default void wXYT(final double v) {
            wXYT(v, v, v);
        }

        default void wXZT(final double v) {
            wXZT(v, v, v);
        }

        default void wYZT(final double v) {
            wYZT(v, v, v);
        }

        default void wXYZT(final double v) {
            wXYZT(v, v, v, v);
        }

        default void Dxw(final double v) {
            Dxw(v, v);
        }

        default void Dyw(final double v) {
            Dyw(v, v);
        }

        default void Dzw(final double v) {
            Dzw(v, v);
        }

        default void Dxyw(final double v) {
            Dxyw(v, v, v);
        }

        default void Dxzw(final double v) {
            Dxzw(v, v, v);
        }

        default void Dyzw(final double v) {
            Dyzw(v, v, v);
        }

        default void Dxyzw(final double v) {
            Dxyzw(v, v, v, v);
        }

        default void XTxw(final double v) {
            XTxw(v, v, v, v);
        }

        default void XTyw(final double v) {
            XTyw(v, v, v, v);
        }

        default void XTzw(final double v) {
            XTzw(v, v, v, v);
        }

        default void YTxw(final double v) {
            YTxw(v, v, v, v);
        }

        default void YTyw(final double v) {
            YTyw(v, v, v, v);
        }

        default void YTzw(final double v) {
            YTzw(v, v, v, v);
        }

        default void ZTxw(final double v) {
            ZTxw(v, v, v, v);
        }

        default void ZTyw(final double v) {
            ZTyw(v, v, v, v);
        }

        default void ZTzw(final double v) {
            ZTzw(v, v, v, v);
        }

        default void XTxyw(final double v) {
            XTxyw(v, v, v, v, v, v);
        }

        default void XTxzw(final double v) {
            XTxzw(v, v, v, v, v, v);
        }

        default void XTyzw(final double v) {
            XTyzw(v, v, v, v, v, v);
        }

        default void YTxyw(final double v) {
            YTxyw(v, v, v, v, v, v);
        }

        default void YTxzw(final double v) {
            YTxzw(v, v, v, v, v, v);
        }

        default void YTyzw(final double v) {
            YTyzw(v, v, v, v, v, v);
        }

        default void ZTxyw(final double v) {
            ZTxyw(v, v, v, v, v, v);
        }

        default void ZTxzw(final double v) {
            ZTxzw(v, v, v, v, v, v);
        }

        default void ZTyzw(final double v) {
            ZTyzw(v, v, v, v, v, v);
        }

        default void XYTxw(final double v) {
            XYTxw(v, v, v, v, v, v);
        }

        default void XYTyw(final double v) {
            XYTyw(v, v, v, v, v, v);
        }

        default void XYTzw(final double v) {
            XYTzw(v, v, v, v, v, v);
        }

        default void XZTxw(final double v) {
            XZTxw(v, v, v, v, v, v);
        }

        default void XZTyw(final double v) {
            XZTyw(v, v, v, v, v, v);
        }

        default void XZTzw(final double v) {
            XZTzw(v, v, v, v, v, v);
        }

        default void YZTxw(final double v) {
            YZTxw(v, v, v, v, v, v);
        }

        default void YZTyw(final double v) {
            YZTyw(v, v, v, v, v, v);
        }

        default void YZTzw(final double v) {
            YZTzw(v, v, v, v, v, v);
        }

        default void XYTxyw(final double v) {
            XYTxyw(v, v, v, v, v, v, v, v, v);
        }

        default void XYTxzw(final double v) {
            XYTxzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYTyzw(final double v) {
            XYTyzw(v, v, v, v, v, v, v, v, v);
        }

        default void XZTxyw(final double v) {
            XZTxyw(v, v, v, v, v, v, v, v, v);
        }

        default void XZTxzw(final double v) {
            XZTxzw(v, v, v, v, v, v, v, v, v);
        }

        default void XZTyzw(final double v) {
            XZTyzw(v, v, v, v, v, v, v, v, v);
        }

        default void YZTxyw(final double v) {
            YZTxyw(v, v, v, v, v, v, v, v, v);
        }

        default void YZTxzw(final double v) {
            YZTxzw(v, v, v, v, v, v, v, v, v);
        }

        default void YZTyzw(final double v) {
            YZTyzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYTxyzw(final double v) {
            XYTxyzw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void XZTxyzw(final double v) {
            XZTxyzw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void YZTxyzw(final double v) {
            YZTxyzw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void XYZTxyw(final double v) {
            XYZTxyw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void XYZTxzw(final double v) {
            XYZTxzw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void XYZTyzw(final double v) {
            XYZTyzw(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void XYZTxyzw(final double v) {
            XYZTxyzw(v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void Txw(final double Tx, final double Tw) {
            Tx(Tx);
            Tw(Tw);
        }

        default void Tyw(final double Ty, final double Tw) {
            Ty(Ty);
            Tw(Tw);
        }

        default void Tzw(final double Tz, final double Tw) {
            Tz(Tz);
            Tw(Tw);
        }

        default void Txyw(final double Tx, final double Ty, final double Tw) {
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void Txzw(final double Tx, final double Tz, final double Tw) {
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void Tyzw(final double Ty, final double Tz, final double Tw) {
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void Txyzw(final double Tx, final double Ty, final double Tz, final double Tw) {
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void wXT(final double Xw, final double Tw) {
            Xw(Xw);
            Tw(Tw);
        }

        default void wYT(final double Yw, final double Tw) {
            Yw(Yw);
            Tw(Tw);
        }

        default void wZT(final double Zw, final double Tw) {
            Zw(Zw);
            Tw(Tw);
        }

        default void wXYT(final double Xw, final double Yw, final double Tw) {
            Xw(Xw);
            Yw(Yw);
            Tw(Tw);
        }

        default void wXZT(final double Xw, final double Zw, final double Tw) {
            Xw(Xw);
            Zw(Zw);
            Tw(Tw);
        }

        default void wYZT(final double Yw, final double Zw, final double Tw) {
            Yw(Yw);
            Zw(Zw);
            Tw(Tw);
        }

        default void wXYZT(final double Xw, final double Yw, final double Zw, final double Tw) {
            Xw(Xw);
            Yw(Yw);
            Zw(Zw);
            Tw(Tw);
        }

        default void Dxw(final double Xx, final double Tw) {
            Xx(Xx);
            Tw(Tw);
        }

        default void Dyw(final double Yy, final double Tw) {
            Yy(Yy);
            Tw(Tw);
        }

        default void Dzw(final double Zz, final double Tw) {
            Zz(Zz);
            Tw(Tw);
        }

        default void Dxyw(final double Xx, final double Yy, final double Tw) {
            Xx(Xx);
            Yy(Yy);
            Tw(Tw);
        }

        default void Dxzw(final double Xx, final double Zz, final double Tw) {
            Xx(Xx);
            Zz(Zz);
            Tw(Tw);
        }

        default void Dyzw(final double Yy, final double Zz, final double Tw) {
            Yy(Yy);
            Zz(Zz);
            Tw(Tw);
        }

        default void Dxyzw(final double Xx, final double Yy, final double Zz, final double Tw) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
            Tw(Tw);
        }

        default void XTxw(
                final double Xx, final double Xw,
                final double Tx, final double Tw
        ) {
            Xx(Xx);
            Xw(Xw);
            Tx(Tx);
            Tw(Tw);
        }

        default void XTyw(
                final double Xy, final double Xw,
                final double Ty, final double Tw
        ) {
            Xy(Xy);
            Xw(Xw);
            Ty(Ty);
            Tw(Tw);
        }

        default void XTzw(
                final double Xz, final double Xw,
                final double Tz, final double Tw
        ) {
            Xz(Xz);
            Xw(Xw);
            Tz(Tz);
            Tw(Tw);
        }

        default void YTxw(
                final double Yx, final double Yw,
                final double Tx, final double Tw
        ) {
            Yx(Yx);
            Yw(Yw);
            Tx(Tx);
            Tw(Tw);
        }

        default void YTyw(
                final double Yy, final double Yw,
                final double Ty, final double Tw
        ) {
            Yy(Yy);
            Yw(Yw);
            Ty(Ty);
            Tw(Tw);
        }

        default void YTzw(
                final double Yz, final double Yw,
                final double Tz, final double Tw
        ) {
            Yz(Yz);
            Yw(Yw);
            Tz(Tz);
            Tw(Tw);
        }

        default void ZTxw(
                final double Zx, final double Zw,
                final double Tx, final double Tw
        ) {
            Zx(Zx);
            Zw(Zw);
            Tx(Tx);
            Tw(Tw);
        }

        default void ZTyw(
                final double Zy, final double Zw,
                final double Ty, final double Tw
        ) {
            Zy(Zy);
            Zw(Zw);
            Ty(Ty);
            Tw(Tw);
        }

        default void ZTzw(
                final double Zz, final double Zw,
                final double Tz, final double Tw
        ) {
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void XTxyw(
                final double Xx, final double Xy, final double Xw,
                final double Tx, final double Ty, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void XTxzw(
                final double Xx, final double Xz, final double Xw,
                final double Tx, final double Tz, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void XTyzw(
                final double Xy, final double Xz, final double Xw,
                final double Ty, final double Tz, final double Tw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void YTxyw(
                final double Yx, final double Yy, final double Yw,
                final double Tx, final double Ty, final double Tw
        ) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void YTxzw(
                final double Yx, final double Yz, final double Yw,
                final double Tx, final double Tz, final double Tw
        ) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void YTyzw(
                final double Yy, final double Yz, final double Yw,
                final double Ty, final double Tz, final double Tw
        ) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void ZTxyw(
                final double Zx, final double Zy, final double Zw,
                final double Tx, final double Ty, final double Tw
        ) {
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void ZTxzw(
                final double Zx, final double Zz, final double Zw,
                final double Tx, final double Tz, final double Tw
        ) {
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void ZTyzw(
                final double Zy, final double Zz, final double Zw,
                final double Ty, final double Tz, final double Tw
        ) {
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void XYTxw(
                final double Xx, final double Xw,
                final double Yx, final double Yw,
                final double Tx, final double Tw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
            Tx(Tx);
            Tw(Tw);
        }

        default void XYTyw(
                final double Xy, final double Xw,
                final double Yy, final double Yw,
                final double Ty, final double Tw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
            Ty(Ty);
            Tw(Tw);
        }

        default void XYTzw(
                final double Xz, final double Xw,
                final double Yz, final double Yw,
                final double Tz, final double Tw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
            Tz(Tz);
            Tw(Tw);
        }

        default void XZTxw(
                final double Xx, final double Xw,
                final double Zx, final double Zw,
                final double Tx, final double Tw
        ) {
            Xx(Xx);
            Xw(Xw);
            Zx(Zx);
            Zw(Zw);
            Tx(Tx);
            Tw(Tw);
        }

        default void XZTyw(
                final double Xy, final double Xw,
                final double Zy, final double Zw,
                final double Ty, final double Tw
        ) {
            Xy(Xy);
            Xw(Xw);
            Zy(Zy);
            Zw(Zw);
            Ty(Ty);
            Tw(Tw);
        }

        default void XZTzw(
                final double Xz, final double Xw,
                final double Zz, final double Zw,
                final double Tz, final double Tw
        ) {
            Xz(Xz);
            Xw(Xw);
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void YZTxw(
                final double Yx, final double Yw,
                final double Zx, final double Zw,
                final double Tx, final double Tw
        ) {
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
            Tx(Tx);
            Tw(Tw);
        }

        default void YZTyw(
                final double Yy, final double Yw,
                final double Zy, final double Zw,
                final double Ty, final double Tw
        ) {
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
            Ty(Ty);
            Tw(Tw);
        }

        default void YZTzw(
                final double Yz, final double Yw,
                final double Zz, final double Zw,
                final double Tz, final double Tw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void XYTxyw(
                final double Xx, final double Xy, final double Xw,
                final double Yx, final double Yy, final double Yw,
                final double Tx, final double Ty, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void XYTxzw(
                final double Xx, final double Xz, final double Xw,
                final double Yx, final double Yz, final double Yw,
                final double Tx, final double Tz, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void XYTyzw(
                final double Xy, final double Xz, final double Xw,
                final double Yy, final double Yz, final double Yw,
                final double Ty, final double Tz, final double Tw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void XZTxyw(
                final double Xx, final double Xy, final double Xw,
                final double Zx, final double Zy, final double Zw,
                final double Tx, final double Ty, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void XZTxzw(
                final double Xx, final double Xz, final double Xw,
                final double Zx, final double Zz, final double Zw,
                final double Tx, final double Tz, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void XZTyzw(
                final double Xy, final double Xz, final double Xw,
                final double Zy, final double Zz, final double Zw,
                final double Ty, final double Tz, final double Tw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void YZTxyw(
                final double Yx, final double Yy, final double Yw,
                final double Zx, final double Zy, final double Zw,
                final double Tx, final double Ty, final double Tw
        ) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void YZTxzw(
                final double Yx, final double Yz, final double Yw,
                final double Zx, final double Zz, final double Zw,
                final double Tx, final double Tz, final double Tw
        ) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void YZTyzw(
                final double Yy, final double Yz, final double Yw,
                final double Zy, final double Zz, final double Zw,
                final double Ty, final double Tz, final double Tw
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

        default void XYTxyzw(
                final double Xx, final double Xy, final double Xz, final double Xw,
                final double Yx, final double Yy, final double Yz, final double Yw,
                final double Tx, final double Ty, final double Tz, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void XZTxyzw(
                final double Xx, final double Xy, final double Xz, final double Xw,
                final double Zx, final double Zy, final double Zz, final double Zw,
                final double Tx, final double Ty, final double Tz, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void YZTxyzw(
                final double Yx, final double Yy, final double Yz, final double Yw,
                final double Zx, final double Zy, final double Zz, final double Zw,
                final double Tx, final double Ty, final double Tz, final double Tw
        ) {
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

        default void XYZTxyw(
                final double Xx, final double Xy, final double Xw,
                final double Yx, final double Yy, final double Yw,
                final double Zx, final double Zy, final double Zw,
                final double Tx, final double Ty, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void XYZTxzw(
                final double Xx, final double Xz, final double Xw,
                final double Yx, final double Yz, final double Yw,
                final double Zx, final double Zz, final double Zw,
                final double Tx, final double Tz, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void XYZTyzw(
                final double Xy, final double Xz, final double Xw,
                final double Yy, final double Yz, final double Yw,
                final double Zy, final double Zz, final double Zw,
                final double Ty, final double Tz, final double Tw
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
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        @Override
        default void XYZTxyzw(
                final double Xx, final double Xy, final double Xz, final double Xw,
                final double Yx, final double Yy, final double Yz, final double Yw,
                final double Zx, final double Zy, final double Zz, final double Zw,
                final double Tx, final double Ty, final double Tz, final double Tw
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

        default void xwXT(
                final double Xx, final double Tx,
                final double Xw, final double Tw
        ) {
            Xx(Xx);
            Xw(Xw);
            Tx(Tx);
            Tw(Tw);
        }

        default void xwYT(
                final double Yx, final double Tx,
                final double Yw, final double Tw
        ) {
            Yx(Yx);
            Yw(Yw);
            Tx(Tx);
            Tw(Tw);
        }

        default void xwZT(
                final double Zx, final double Tx,
                final double Zw, final double Tw
        ) {
            Zx(Zx);
            Zw(Zw);
            Tx(Tx);
            Tw(Tw);
        }

        default void ywXT(
                final double Xy, final double Ty,
                final double Xw, final double Tw
        ) {
            Xy(Xy);
            Xw(Xw);
            Ty(Ty);
            Tw(Tw);
        }

        default void ywYT(
                final double Yy, final double Ty,
                final double Yw, final double Tw
        ) {
            Yy(Yy);
            Yw(Yw);
            Ty(Ty);
            Tw(Tw);
        }

        default void ywZT(
                final double Zy, final double Ty,
                final double Zw, final double Tw
        ) {
            Zy(Zy);
            Zw(Zw);
            Ty(Ty);
            Tw(Tw);
        }

        default void zwXT(
                final double Xz, final double Tz,
                final double Xw, final double Tw
        ) {
            Xz(Xz);
            Xw(Xw);
            Tz(Tz);
            Tw(Tw);
        }

        default void zwYT(
                final double Yz, final double Tz,
                final double Yw, final double Tw
        ) {
            Yz(Yz);
            Yw(Yw);
            Tz(Tz);
            Tw(Tw);
        }

        default void zwZT(
                final double Zz, final double Tz,
                final double Zw, final double Tw
        ) {
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void xwXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xw, final double Yw, final double Tw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
            Tx(Tx);
            Tw(Tw);
        }

        default void xwXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xw, final double Zw, final double Tw
        ) {
            Xx(Xx);
            Xw(Xw);
            Zx(Zx);
            Zw(Zw);
            Tx(Tx);
            Tw(Tw);
        }

        default void xwYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yw, final double Zw, final double Tw
        ) {
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
            Tx(Tx);
            Tw(Tw);
        }

        default void ywXYT(
                final double Xy, final double Yy, final double Ty,
                final double Xw, final double Yw, final double Tw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
            Ty(Ty);
            Tw(Tw);
        }

        default void ywXZT(
                final double Xy, final double Zy, final double Ty,
                final double Xw, final double Zw, final double Tw
        ) {
            Xy(Xy);
            Xw(Xw);
            Zy(Zy);
            Zw(Zw);
            Ty(Ty);
            Tw(Tw);
        }

        default void ywYZT(
                final double Yy, final double Zy, final double Ty,
                final double Yw, final double Zw, final double Tw
        ) {
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
            Ty(Ty);
            Tw(Tw);
        }

        default void zwXYT(
                final double Xz, final double Yz, final double Tz,
                final double Xw, final double Yw, final double Tw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
            Tz(Tz);
            Tw(Tw);
        }

        default void zwXZT(
                final double Xz, final double Zz, final double Tz,
                final double Xw, final double Zw, final double Tw
        ) {
            Xz(Xz);
            Xw(Xw);
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void zwYZT(
                final double Yz, final double Zz, final double Tz,
                final double Yw, final double Zw, final double Tw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void xywXT(
                final double Xx, final double Tx,
                final double Xy, final double Ty,
                final double Xw, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xywYT(
                final double Yx, final double Tx,
                final double Yy, final double Ty,
                final double Yw, final double Tw
        ) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xywZT(
                final double Zx, final double Tx,
                final double Zy, final double Ty,
                final double Zw, final double Tw
        ) {
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xzwXT(
                final double Xx, final double Tx,
                final double Xz, final double Tz,
                final double Xw, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void xzwYT(
                final double Yx, final double Tx,
                final double Yz, final double Tz,
                final double Yw, final double Tw
        ) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void xzwZT(
                final double Zx, final double Tx,
                final double Zz, final double Tz,
                final double Zw, final double Tw
        ) {
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwXT(
                final double Xy, final double Ty,
                final double Xz, final double Tz,
                final double Xw, final double Tw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwYT(
                final double Yy, final double Ty,
                final double Yz, final double Tz,
                final double Yw, final double Tw
        ) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwZT(
                final double Zy, final double Ty,
                final double Zz, final double Tz,
                final double Zw, final double Tw
        ) {
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void xywXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xy, final double Yy, final double Ty,
                final double Xw, final double Yw, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xywXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xy, final double Zy, final double Ty,
                final double Xw, final double Zw, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xywYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yy, final double Zy, final double Ty,
                final double Yw, final double Zw, final double Tw
        ) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xzwXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xz, final double Yz, final double Tz,
                final double Xw, final double Yw, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void xzwXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xz, final double Zz, final double Tz,
                final double Xw, final double Zw, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void xzwYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yz, final double Zz, final double Tz,
                final double Yw, final double Zw, final double Tw
        ) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwXYT(
                final double Xy, final double Yy, final double Ty,
                final double Xz, final double Yz, final double Tz,
                final double Xw, final double Yw, final double Tw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwXZT(
                final double Xy, final double Zy, final double Ty,
                final double Xz, final double Zz, final double Tz,
                final double Xw, final double Zw, final double Tw
        ) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwYZT(
                final double Yy, final double Zy, final double Ty,
                final double Yz, final double Zz, final double Tz,
                final double Yw, final double Zw, final double Tw
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

        default void xywXYZT(
                final double Xx, final double Yx, final double Zx, final double Tx,
                final double Xy, final double Yy, final double Zy, final double Ty,
                final double Xw, final double Yw, final double Zw, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tw(Tw);
        }

        default void xzwXYZT(
                final double Xx, final double Yx, final double Zx, final double Tx,
                final double Xz, final double Yz, final double Zz, final double Tz,
                final double Xw, final double Yw, final double Zw, final double Tw
        ) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Tz(Tz);
            Tw(Tw);
        }

        default void yzwXYZT(
                final double Xy, final double Yy, final double Zy, final double Ty,
                final double Xz, final double Yz, final double Zz, final double Tz,
                final double Xw, final double Yw, final double Zw, final double Tw
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
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void xyzwXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xy, final double Yy, final double Ty,
                final double Xz, final double Yz, final double Tz,
                final double Xw, final double Yw, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void xyzwXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xy, final double Zy, final double Ty,
                final double Xz, final double Zz, final double Tz,
                final double Xw, final double Zw, final double Tw
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
            Tw(Tw);
        }

        default void xyzwYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yy, final double Zy, final double Ty,
                final double Yz, final double Zz, final double Tz,
                final double Yw, final double Zw, final double Tw
        ) {
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
                final double Xx, final double Yx, final double Zx, final double Tx,
                final double Xy, final double Yy, final double Zy, final double Ty,
                final double Xz, final double Yz, final double Zz, final double Tz,
                final double Xw, final double Yw, final double Zw, final double Tw
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

        default void Txw(final Vector2.Accessible v) {
            Txw(v.x(), v.y());
        }

        default void Tyw(final Vector2.Accessible v) {
            Tyw(v.x(), v.y());
        }

        default void Tzw(final Vector2.Accessible v) {
            Tzw(v.x(), v.y());
        }

        default void Txyw(final Vector3.Accessible v) {
            Txyw(v.x(), v.y(), v.z());
        }

        default void Txzw(final Vector3.Accessible v) {
            Txzw(v.x(), v.y(), v.z());
        }

        default void Tyzw(final Vector3.Accessible v) {
            Tyzw(v.x(), v.y(), v.z());
        }

        default void Txyzw(final Vector4.Accessible v) {
            Txyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void wXT(final Vector2.Accessible v) {
            wXT(v.x(), v.y());
        }

        default void wYT(final Vector2.Accessible v) {
            wYT(v.x(), v.y());
        }

        default void wZT(final Vector2.Accessible v) {
            wZT(v.x(), v.y());
        }

        default void wXYT(final Vector3.Accessible v) {
            wXYT(v.x(), v.y(), v.z());
        }

        default void wXZT(final Vector3.Accessible v) {
            wXZT(v.x(), v.y(), v.z());
        }

        default void wYZT(final Vector3.Accessible v) {
            wYZT(v.x(), v.y(), v.z());
        }

        default void wXYZT(final Vector4.Accessible v) {
            wXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void Dxw(final Vector2.Accessible v) {
            Dxw(v.x(), v.y());
        }

        default void Dyw(final Vector2.Accessible v) {
            Dyw(v.x(), v.y());
        }

        default void Dzw(final Vector2.Accessible v) {
            Dzw(v.x(), v.y());
        }

        default void Dxyw(final Vector3.Accessible v) {
            Dxyw(v.x(), v.y(), v.z());
        }

        default void Dxzw(final Vector3.Accessible v) {
            Dxzw(v.x(), v.y(), v.z());
        }

        default void Dyzw(final Vector3.Accessible v) {
            Dyzw(v.x(), v.y(), v.z());
        }

        default void Dxyzw(final Vector4.Accessible v) {
            Dxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void XTxw(final Matrix2x2.Accessible m) {
            XTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTyw(final Matrix2x2.Accessible m) {
            XTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTzw(final Matrix2x2.Accessible m) {
            XTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTxw(final Matrix2x2.Accessible m) {
            YTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTyw(final Matrix2x2.Accessible m) {
            YTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTzw(final Matrix2x2.Accessible m) {
            YTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxw(final Matrix2x2.Accessible m) {
            ZTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTyw(final Matrix2x2.Accessible m) {
            ZTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTzw(final Matrix2x2.Accessible m) {
            ZTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTxyw(final Matrix2x3.Accessible m) {
            XTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XTxzw(final Matrix2x3.Accessible m) {
            XTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XTyzw(final Matrix2x3.Accessible m) {
            XTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YTxyw(final Matrix2x3.Accessible m) {
            YTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YTxzw(final Matrix2x3.Accessible m) {
            YTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YTyzw(final Matrix2x3.Accessible m) {
            YTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ZTxyw(final Matrix2x3.Accessible m) {
            ZTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ZTxzw(final Matrix2x3.Accessible m) {
            ZTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ZTyzw(final Matrix2x3.Accessible m) {
            ZTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XYTxw(final Matrix3x2.Accessible m) {
            XYTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYTyw(final Matrix3x2.Accessible m) {
            XYTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYTzw(final Matrix3x2.Accessible m) {
            XYTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XZTxw(final Matrix3x2.Accessible m) {
            XZTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XZTyw(final Matrix3x2.Accessible m) {
            XZTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XZTzw(final Matrix3x2.Accessible m) {
            XZTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void YZTxw(final Matrix3x2.Accessible m) {
            YZTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void YZTyw(final Matrix3x2.Accessible m) {
            YZTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void YZTzw(final Matrix3x2.Accessible m) {
            YZTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYTxyw(final Matrix3x3.Accessible m) {
            XYTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYTxzw(final Matrix3x3.Accessible m) {
            XYTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYTyzw(final Matrix3x3.Accessible m) {
            XYTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XZTxyw(final Matrix3x3.Accessible m) {
            XZTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XZTxzw(final Matrix3x3.Accessible m) {
            XZTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XZTyzw(final Matrix3x3.Accessible m) {
            XZTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTxyw(final Matrix3x3.Accessible m) {
            YZTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTxzw(final Matrix3x3.Accessible m) {
            YZTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTyzw(final Matrix3x3.Accessible m) {
            YZTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYTxyzw(final Matrix3x4.Accessible m) {
            XYTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void XZTxyzw(final Matrix3x4.Accessible m) {
            XZTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void YZTxyzw(final Matrix3x4.Accessible m) {
            YZTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void XYZTxyw(final Matrix4x3.Accessible m) {
            XYZTxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

        default void XYZTxzw(final Matrix4x3.Accessible m) {
            XYZTxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

        default void XYZTyzw(final Matrix4x3.Accessible m) {
            XYZTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

        default void XYZTxyzw(final Matrix4x4.Accessible m) {
            XYZTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

        default void xwXT(final Matrix2x2.Accessible m) {
            xwXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwYT(final Matrix2x2.Accessible m) {
            xwYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwZT(final Matrix2x2.Accessible m) {
            xwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywXT(final Matrix2x2.Accessible m) {
            ywXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywYT(final Matrix2x2.Accessible m) {
            ywYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywZT(final Matrix2x2.Accessible m) {
            ywZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXT(final Matrix2x2.Accessible m) {
            zwXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwYT(final Matrix2x2.Accessible m) {
            zwYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwZT(final Matrix2x2.Accessible m) {
            zwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwXYT(final Matrix2x3.Accessible m) {
            xwXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xwXZT(final Matrix2x3.Accessible m) {
            xwXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xwYZT(final Matrix2x3.Accessible m) {
            xwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ywXYT(final Matrix2x3.Accessible m) {
            ywXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ywXZT(final Matrix2x3.Accessible m) {
            ywXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ywYZT(final Matrix2x3.Accessible m) {
            ywYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void zwXYT(final Matrix2x3.Accessible m) {
            zwXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void zwXZT(final Matrix2x3.Accessible m) {
            zwXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void zwYZT(final Matrix2x3.Accessible m) {
            zwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xywXT(final Matrix3x2.Accessible m) {
            xywXT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xywYT(final Matrix3x2.Accessible m) {
            xywYT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xywZT(final Matrix3x2.Accessible m) {
            xywZT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xzwXT(final Matrix3x2.Accessible m) {
            xzwXT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xzwYT(final Matrix3x2.Accessible m) {
            xzwYT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xzwZT(final Matrix3x2.Accessible m) {
            xzwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void yzwXT(final Matrix3x2.Accessible m) {
            yzwXT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void yzwYT(final Matrix3x2.Accessible m) {
            yzwYT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void yzwZT(final Matrix3x2.Accessible m) {
            yzwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xywXYT(final Matrix3x3.Accessible m) {
            xywXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xywXZT(final Matrix3x3.Accessible m) {
            xywXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xywYZT(final Matrix3x3.Accessible m) {
            xywYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xzwXYT(final Matrix3x3.Accessible m) {
            xzwXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xzwXZT(final Matrix3x3.Accessible m) {
            xzwXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xzwYZT(final Matrix3x3.Accessible m) {
            xzwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwXYT(final Matrix3x3.Accessible m) {
            yzwXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwXZT(final Matrix3x3.Accessible m) {
            yzwXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwYZT(final Matrix3x3.Accessible m) {
            yzwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xywXYZT(final Matrix3x4.Accessible m) {
            xywXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void xzwXYZT(final Matrix3x4.Accessible m) {
            xzwXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void yzwXYZT(final Matrix3x4.Accessible m) {
            yzwXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

        default void xyzwXYT(final Matrix4x3.Accessible m) {
            xyzwXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

        default void xyzwXZT(final Matrix4x3.Accessible m) {
            xyzwXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

        default void xyzwYZT(final Matrix4x3.Accessible m) {
            xyzwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
        }

        default void xyzwXYZT(final Matrix4x4.Accessible m) {
            xyzwXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix3x4.AccessibleAndMutable, Matrix4x3.AccessibleAndMutable {}

}
