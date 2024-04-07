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

    public interface Accessible extends Matrix3x3.Accessible {

        double Xw();
        double Yw();
        double Zw();
        double Tx();
        double Ty();
        double Tz();
        double Tw();

        default <R> R Xxw(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xw());
        }

        default void XxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xw());
        }

        default <R> R Xyw(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xw());
        }

        default void XywTo(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xw());
        }

        default <R> R Xzw(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Xw());
        }

        default void XzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Xw());
        }

        default <R> R Xxyw(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw());
        }

        default void XxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xw());
        }

        default <R> R Xxzw(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw());
        }

        default void XxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xz(), Xw());
        }

        default <R> R Xyzw(final Vector3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw());
        }

        default void XyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Xz(), Xw());
        }

        default <R> R Xxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw());
        }

        default void XxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Xy(), Xz(), Xw());
        }

        default <R> R Yxw(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yw());
        }

        default void YxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yw());
        }

        default <R> R Yyw(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yw());
        }

        default void YywTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yw());
        }

        default <R> R Yzw(final Vector2.Factory<R> factory) {
            return factory.create(Yz(), Yw());
        }

        default void YzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Yz(), Yw());
        }

        default <R> R Yxyw(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yw());
        }

        default void YxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yw());
        }

        default <R> R Yxzw(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Yw());
        }

        default void YxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yz(), Yw());
        }

        default <R> R Yyzw(final Vector3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw());
        }

        default void YyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Yz(), Yw());
        }

        default <R> R Yxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Yw());
        }

        default void YxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Yx(), Yy(), Yz(), Yw());
        }

        default <R> R Zxw(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zw());
        }

        default void ZxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zw());
        }

        default <R> R Zyw(final Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zw());
        }

        default void ZywTo(final Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zw());
        }

        default <R> R Zzw(final Vector2.Factory<R> factory) {
            return factory.create(Zz(), Zw());
        }

        default void ZzwTo(final Vector2.Consumer consumer) {
            consumer.xy(Zz(), Zw());
        }

        default <R> R Zxyw(final Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zw());
        }

        default void ZxywTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zw());
        }

        default <R> R Zxzw(final Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zz(), Zw());
        }

        default void ZxzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zz(), Zw());
        }

        default <R> R Zyzw(final Vector3.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Zw());
        }

        default void ZyzwTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zy(), Zz(), Zw());
        }

        default <R> R Zxyzw(final Vector4.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz(), Zw());
        }

        default void ZxyzwTo(final Vector4.Consumer consumer) {
            consumer.xyzw(Zx(), Zy(), Zz(), Zw());
        }

        default <R> R Txy(final Vector2.Factory<R> factory) {
            return factory.create(Tx(), Ty());
        }

        default void TxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Tx(), Ty());
        }

        default <R> R Txz(final Vector2.Factory<R> factory) {
            return factory.create(Tx(), Tz());
        }

        default void TxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Tx(), Tz());
        }

        default <R> R Txw(final Vector2.Factory<R> factory) {
            return factory.create(Tx(), Tw());
        }

        default void TxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Tx(), Tw());
        }

        default <R> R Tyz(final Vector2.Factory<R> factory) {
            return factory.create(Ty(), Tz());
        }

        default void TyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Ty(), Tz());
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

        default <R> R Txyz(final Vector3.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tz());
        }

        default void TxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Ty(), Tz());
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

        default <R> R xXT(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tx());
        }

        default void xXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tx());
        }

        default <R> R xYT(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Tx());
        }

        default void xYTto(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Tx());
        }

        default <R> R xZT(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Tx());
        }

        default void xZTto(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Tx());
        }

        default <R> R xXYT(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx());
        }

        default void xXYTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Tx());
        }

        default <R> R xXZT(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx());
        }

        default void xXZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Zx(), Tx());
        }

        default <R> R xYZT(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx());
        }

        default void xYZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Zx(), Tx());
        }

        default <R> R xXYZT(final Vector4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx());
        }

        default void xXYZTto(final Vector4.Consumer consumer) {
            consumer.xyzw(Xx(), Yx(), Zx(), Tx());
        }

        default <R> R yXT(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Ty());
        }

        default void yXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Ty());
        }

        default <R> R yYT(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Ty());
        }

        default void yYTto(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Ty());
        }

        default <R> R yZT(final Vector2.Factory<R> factory) {
            return factory.create(Zy(), Ty());
        }

        default void yZTto(final Vector2.Consumer consumer) {
            consumer.xy(Zy(), Ty());
        }

        default <R> R yXYT(final Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Ty());
        }

        default void yXYTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Ty());
        }

        default <R> R yXZT(final Vector3.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Ty());
        }

        default void yXZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Zy(), Ty());
        }

        default <R> R yYZT(final Vector3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty());
        }

        default void yYZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Yy(), Zy(), Ty());
        }

        default <R> R yXYZT(final Vector4.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Ty());
        }

        default void yXYZTto(final Vector4.Consumer consumer) {
            consumer.xyzw(Xy(), Yy(), Zy(), Ty());
        }

        default <R> R zXT(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Tz());
        }

        default void zXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Tz());
        }

        default <R> R zYT(final Vector2.Factory<R> factory) {
            return factory.create(Yz(), Tz());
        }

        default void zYTto(final Vector2.Consumer consumer) {
            consumer.xy(Yz(), Tz());
        }

        default <R> R zZT(final Vector2.Factory<R> factory) {
            return factory.create(Zz(), Tz());
        }

        default void zZTto(final Vector2.Consumer consumer) {
            consumer.xy(Zz(), Tz());
        }

        default <R> R zXYT(final Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Tz());
        }

        default void zXYTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Tz());
        }

        default <R> R zXZT(final Vector3.Factory<R> factory) {
            return factory.create(Xz(), Zz(), Tz());
        }

        default void zXZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Zz(), Tz());
        }

        default <R> R zYZT(final Vector3.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Tz());
        }

        default void zYZTto(final Vector3.Consumer consumer) {
            consumer.xyz(Yz(), Zz(), Tz());
        }

        default <R> R zXYZT(final Vector4.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz(), Tz());
        }

        default void zXYZTto(final Vector4.Consumer consumer) {
            consumer.xyzw(Xz(), Yz(), Zz(), Tz());
        }

        default <R> R wXY(final Vector2.Factory<R> factory) {
            return factory.create(Xw(), Yw());
        }

        default void wXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xw(), Yw());
        }

        default <R> R wXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xw(), Zw());
        }

        default void wXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xw(), Zw());
        }

        default <R> R wXT(final Vector2.Factory<R> factory) {
            return factory.create(Xw(), Tw());
        }

        default void wXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xw(), Tw());
        }

        default <R> R wYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yw(), Zw());
        }

        default void wYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yw(), Zw());
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

        default <R> R wXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xw(), Yw(), Zw());
        }

        default void wXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xw(), Yw(), Zw());
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

        default <R> R XYxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Yx(), Yw());
        }

        default void XYxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xw(), Yx(), Yw());
        }

        default <R> R XYyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Yy(), Yw());
        }

        default void XYywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xw(), Yy(), Yw());
        }

        default <R> R XYzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Yz(), Yw());
        }

        default void XYzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Yz(), Yw());
        }

        default <R> R XZxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Zx(), Zw());
        }

        default void XZxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xw(), Zx(), Zw());
        }

        default <R> R XZyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xw(), Zy(), Zw());
        }

        default void XZywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xw(), Zy(), Zw());
        }

        default <R> R XZzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Zz(), Zw());
        }

        default void XZzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Zz(), Zw());
        }

        default <R> R XTxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Tx(), Ty());
        }

        default void XTxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Tx(), Ty());
        }

        default <R> R XTxz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Tx(), Tz());
        }

        default void XTxzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xz(), Tx(), Tz());
        }

        default <R> R XTxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xw(), Tx(), Tw());
        }

        default void XTxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xw(), Tx(), Tw());
        }

        default <R> R XTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Ty(), Tz());
        }

        default void XTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Ty(), Tz());
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

        default <R> R YZxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yw(), Zx(), Zw());
        }

        default void YZxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yw(), Zx(), Zw());
        }

        default <R> R YZyw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yw(), Zy(), Zw());
        }

        default void YZywTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yw(), Zy(), Zw());
        }

        default <R> R YZzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Yw(), Zz(), Zw());
        }

        default void YZzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Yw(), Zz(), Zw());
        }

        default <R> R YTxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Tx(), Ty());
        }

        default void YTxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yy(), Tx(), Ty());
        }

        default <R> R YTxz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Tx(), Tz());
        }

        default void YTxzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yz(), Tx(), Tz());
        }

        default <R> R YTxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yw(), Tx(), Tw());
        }

        default void YTxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yw(), Tx(), Tw());
        }

        default <R> R YTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Ty(), Tz());
        }

        default void YTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Ty(), Tz());
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

        default <R> R ZTxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Tx(), Ty());
        }

        default void ZTxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Zy(), Tx(), Ty());
        }

        default <R> R ZTxz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Zz(), Tx(), Tz());
        }

        default void ZTxzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Zz(), Tx(), Tz());
        }

        default <R> R ZTxw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Zw(), Tx(), Tw());
        }

        default void ZTxwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Zw(), Tx(), Tw());
        }

        default <R> R ZTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Ty(), Tz());
        }

        default void ZTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Zz(), Ty(), Tz());
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

        default <R> R XYZxyw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Zx(), Zy(), Zw());
        }

        default void XYZxywTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xw(), Yx(), Yy(), Yw(), Zx(), Zy(), Zw());
        }

        default <R> R XYZxzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Zx(), Zz(), Zw());
        }

        default void XYZxzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xz(), Xw(), Yx(), Yz(), Yw(), Zx(), Zz(), Zw());
        }

        default <R> R XYZyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default void XYZyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default <R> R XYTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Tx(), Ty(), Tz());
        }

        default void XYTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Tx(), Ty(), Tz());
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

        default <R> R XZTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void XZTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
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

        default <R> R YZTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void YZTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
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

        default <R> R XYZTxyzw(final Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void XYZTxyzwTo(final Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R xyXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xy(), Ty());
        }

        default void xyXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Tx(), Xy(), Ty());
        }

        default <R> R xyYT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Tx(), Yy(), Ty());
        }

        default void xyYTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Tx(), Yy(), Ty());
        }

        default <R> R xyZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zy(), Ty());
        }

        default void xyZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Tx(), Zy(), Ty());
        }

        default <R> R xzXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xz(), Tz());
        }

        default void xzXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Tx(), Xz(), Tz());
        }

        default <R> R xzYT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Tx(), Yz(), Tz());
        }

        default void xzYTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Tx(), Yz(), Tz());
        }

        default <R> R xzZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zz(), Tz());
        }

        default void xzZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Tx(), Zz(), Tz());
        }

        default <R> R xwXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xw(), Yw());
        }

        default void xwXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xw(), Yw());
        }

        default <R> R xwXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Xw(), Zw());
        }

        default void xwXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Zx(), Xw(), Zw());
        }

        default <R> R xwXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xw(), Tw());
        }

        default void xwXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Tx(), Xw(), Tw());
        }

        default <R> R xwYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yw(), Zw());
        }

        default void xwYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yw(), Zw());
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

        default <R> R yzXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Ty(), Xz(), Tz());
        }

        default void yzXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Ty(), Xz(), Tz());
        }

        default <R> R yzYT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Ty(), Yz(), Tz());
        }

        default void yzYTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Ty(), Yz(), Tz());
        }

        default <R> R yzZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Ty(), Zz(), Tz());
        }

        default void yzZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Ty(), Zz(), Tz());
        }

        default <R> R ywXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xw(), Yw());
        }

        default void ywXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xw(), Yw());
        }

        default <R> R ywXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Xw(), Zw());
        }

        default void ywXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Zy(), Xw(), Zw());
        }

        default <R> R ywXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Ty(), Xw(), Tw());
        }

        default void ywXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Ty(), Xw(), Tw());
        }

        default <R> R ywYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yw(), Zw());
        }

        default void ywYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yw(), Zw());
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

        default <R> R zwXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Xw(), Yw());
        }

        default void zwXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Yz(), Xw(), Yw());
        }

        default <R> R zwXZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Zz(), Xw(), Zw());
        }

        default void zwXZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Zz(), Xw(), Zw());
        }

        default <R> R zwXT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Tz(), Xw(), Tw());
        }

        default void zwXTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Tz(), Xw(), Tw());
        }

        default <R> R zwYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Yw(), Zw());
        }

        default void zwYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Zz(), Yw(), Zw());
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

        default <R> R xyzXYT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xy(), Yy(), Ty(), Xz(), Yz(), Tz());
        }

        default void xyzXYTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Tx(), Xy(), Yy(), Ty(), Xz(), Yz(), Tz());
        }

        default <R> R xyzXZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xy(), Zy(), Ty(), Xz(), Zz(), Tz());
        }

        default void xyzXZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Zx(), Tx(), Xy(), Zy(), Ty(), Xz(), Zz(), Tz());
        }

        default <R> R xyzYZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default void xyzYZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default <R> R xywXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xw(), Yw(), Zw());
        }

        default void xywXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xw(), Yw(), Zw());
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

        default <R> R xzwXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void xzwXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
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

        default <R> R yzwXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void yzwXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
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

        default <R> R xyzwXYZT(final Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default void xyzwXYZTto(final Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

    }

    public interface Mutable extends Consumer, Matrix3x3.Mutable {

        void Xw(double Xw);
        void Yw(double Yw);
        void Zw(double Zw);
        void Tx(double Tx);
        void Ty(double Ty);
        void Tz(double Tz);
        void Tw(double Tw);

        default void Xxw(final double v) {
            Xxw(v, v);
        }

        default void Xyw(final double v) {
            Xyw(v, v);
        }

        default void Xzw(final double v) {
            Xzw(v, v);
        }

        default void Xxyw(final double v) {
            Xxyw(v, v, v);
        }

        default void Xxzw(final double v) {
            Xxzw(v, v, v);
        }

        default void Xyzw(final double v) {
            Xyzw(v, v, v);
        }

        default void Xxyzw(final double v) {
            Xxyzw(v, v, v, v);
        }

        default void Yxw(final double v) {
            Yxw(v, v);
        }

        default void Yyw(final double v) {
            Yyw(v, v);
        }

        default void Yzw(final double v) {
            Yzw(v, v);
        }

        default void Yxyw(final double v) {
            Yxyw(v, v, v);
        }

        default void Yxzw(final double v) {
            Yxzw(v, v, v);
        }

        default void Yyzw(final double v) {
            Yyzw(v, v, v);
        }

        default void Yxyzw(final double v) {
            Yxyzw(v, v, v, v);
        }

        default void Zxw(final double v) {
            Zxw(v, v);
        }

        default void Zyw(final double v) {
            Zyw(v, v);
        }

        default void Zzw(final double v) {
            Zzw(v, v);
        }

        default void Zxyw(final double v) {
            Zxyw(v, v, v);
        }

        default void Zxzw(final double v) {
            Zxzw(v, v, v);
        }

        default void Zyzw(final double v) {
            Zyzw(v, v, v);
        }

        default void Zxyzw(final double v) {
            Zxyzw(v, v, v, v);
        }

        default void Txy(final double v) {
            Txy(v, v);
        }

        default void Txz(final double v) {
            Txz(v, v);
        }

        default void Txw(final double v) {
            Txw(v, v);
        }

        default void Tyz(final double v) {
            Tyz(v, v);
        }

        default void Tyw(final double v) {
            Tyw(v, v);
        }

        default void Tzw(final double v) {
            Tzw(v, v);
        }

        default void Txyz(final double v) {
            Txyz(v, v, v);
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

        default void xXT(final double v) {
            xXT(v, v);
        }

        default void xYT(final double v) {
            xYT(v, v);
        }

        default void xZT(final double v) {
            xZT(v, v);
        }

        default void xXYT(final double v) {
            xXYT(v, v, v);
        }

        default void xXZT(final double v) {
            xXZT(v, v, v);
        }

        default void xYZT(final double v) {
            xYZT(v, v, v);
        }

        default void xXYZT(final double v) {
            xXYZT(v, v, v, v);
        }

        default void yXT(final double v) {
            yXT(v, v);
        }

        default void yYT(final double v) {
            yYT(v, v);
        }

        default void yZT(final double v) {
            yZT(v, v);
        }

        default void yXYT(final double v) {
            yXYT(v, v, v);
        }

        default void yXZT(final double v) {
            yXZT(v, v, v);
        }

        default void yYZT(final double v) {
            yYZT(v, v, v);
        }

        default void yXYZT(final double v) {
            yXYZT(v, v, v, v);
        }

        default void zXT(final double v) {
            zXT(v, v);
        }

        default void zYT(final double v) {
            zYT(v, v);
        }

        default void zZT(final double v) {
            zZT(v, v);
        }

        default void zXYT(final double v) {
            zXYT(v, v, v);
        }

        default void zXZT(final double v) {
            zXZT(v, v, v);
        }

        default void zYZT(final double v) {
            zYZT(v, v, v);
        }

        default void zXYZT(final double v) {
            zXYZT(v, v, v, v);
        }

        default void wXY(final double v) {
            wXY(v, v);
        }

        default void wXZ(final double v) {
            wXZ(v, v);
        }

        default void wXT(final double v) {
            wXT(v, v);
        }

        default void wYZ(final double v) {
            wYZ(v, v);
        }

        default void wYT(final double v) {
            wYT(v, v);
        }

        default void wZT(final double v) {
            wZT(v, v);
        }

        default void wXYZ(final double v) {
            wXYZ(v, v, v);
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

        default void XYxw(final double v) {
            XYxw(v, v, v, v);
        }

        default void XYyw(final double v) {
            XYyw(v, v, v, v);
        }

        default void XYzw(final double v) {
            XYzw(v, v, v, v);
        }

        default void XZxw(final double v) {
            XZxw(v, v, v, v);
        }

        default void XZyw(final double v) {
            XZyw(v, v, v, v);
        }

        default void XZzw(final double v) {
            XZzw(v, v, v, v);
        }

        default void XTxy(final double v) {
            XTxy(v, v, v, v);
        }

        default void XTxz(final double v) {
            XTxz(v, v, v, v);
        }

        default void XTxw(final double v) {
            XTxw(v, v, v, v);
        }

        default void XTyz(final double v) {
            XTyz(v, v, v, v);
        }

        default void XTyw(final double v) {
            XTyw(v, v, v, v);
        }

        default void XTzw(final double v) {
            XTzw(v, v, v, v);
        }

        default void YZxw(final double v) {
            YZxw(v, v, v, v);
        }

        default void YZyw(final double v) {
            YZyw(v, v, v, v);
        }

        default void YZzw(final double v) {
            YZzw(v, v, v, v);
        }

        default void YTxy(final double v) {
            YTxy(v, v, v, v);
        }

        default void YTxz(final double v) {
            YTxz(v, v, v, v);
        }

        default void YTxw(final double v) {
            YTxw(v, v, v, v);
        }

        default void YTyz(final double v) {
            YTyz(v, v, v, v);
        }

        default void YTyw(final double v) {
            YTyw(v, v, v, v);
        }

        default void YTzw(final double v) {
            YTzw(v, v, v, v);
        }

        default void ZTxy(final double v) {
            ZTxy(v, v, v, v);
        }

        default void ZTxz(final double v) {
            ZTxz(v, v, v, v);
        }

        default void ZTxw(final double v) {
            ZTxw(v, v, v, v);
        }

        default void ZTyz(final double v) {
            ZTyz(v, v, v, v);
        }

        default void ZTyw(final double v) {
            ZTyw(v, v, v, v);
        }

        default void ZTzw(final double v) {
            ZTzw(v, v, v, v);
        }

        default void XYZxyw(final double v) {
            XYZxyw(v, v, v, v, v, v, v, v, v);
        }

        default void XYZxzw(final double v) {
            XYZxzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYZyzw(final double v) {
            XYZyzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYTxyz(final double v) {
            XYTxyz(v, v, v, v, v, v, v, v, v);
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

        default void XZTxyz(final double v) {
            XZTxyz(v, v, v, v, v, v, v, v, v);
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

        default void YZTxyz(final double v) {
            YZTxyz(v, v, v, v, v, v, v, v, v);
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

        default void XYZTxyzw(final double v) {
            XYZTxyzw(v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void Xxw(final double Xx, final double Xw) {
            Xx(Xx);
            Xw(Xw);
        }

        default void Xyw(final double Xy, final double Xw) {
            Xy(Xy);
            Xw(Xw);
        }

        default void Xzw(final double Xz, final double Xw) {
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyw(final double Xx, final double Xy, final double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xw(Xw);
        }

        default void Xxzw(final double Xx, final double Xz, final double Xw) {
            Xx(Xx);
            Xz(Xz);
            Xw(Xw);
        }

        default void Xyzw(final double Xy, final double Xz, final double Xw) {
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyzw(final double Xx, final double Xy, final double Xz, final double Xw) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Xw(Xw);
        }

        default void Yxw(final double Yx, final double Yw) {
            Yx(Yx);
            Yw(Yw);
        }

        default void Yyw(final double Yy, final double Yw) {
            Yy(Yy);
            Yw(Yw);
        }

        default void Yzw(final double Yz, final double Yw) {
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyw(final double Yx, final double Yy, final double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yw(Yw);
        }

        default void Yxzw(final double Yx, final double Yz, final double Yw) {
            Yx(Yx);
            Yz(Yz);
            Yw(Yw);
        }

        default void Yyzw(final double Yy, final double Yz, final double Yw) {
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyzw(final double Yx, final double Yy, final double Yz, final double Yw) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Yw(Yw);
        }

        default void Zxw(final double Zx, final double Zw) {
            Zx(Zx);
            Zw(Zw);
        }

        default void Zyw(final double Zy, final double Zw) {
            Zy(Zy);
            Zw(Zw);
        }

        default void Zzw(final double Zz, final double Zw) {
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyw(final double Zx, final double Zy, final double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zw(Zw);
        }

        default void Zxzw(final double Zx, final double Zz, final double Zw) {
            Zx(Zx);
            Zz(Zz);
            Zw(Zw);
        }

        default void Zyzw(final double Zy, final double Zz, final double Zw) {
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyzw(final double Zx, final double Zy, final double Zz, final double Zw) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Zw(Zw);
        }

        default void Txy(final double Tx, final double Ty) {
            Tx(Tx);
            Ty(Ty);
        }

        default void Txz(final double Tx, final double Tz) {
            Tx(Tx);
            Tz(Tz);
        }

        default void Txw(final double Tx, final double Tw) {
            Tx(Tx);
            Tw(Tw);
        }

        default void Tyz(final double Ty, final double Tz) {
            Ty(Ty);
            Tz(Tz);
        }

        default void Tyw(final double Ty, final double Tw) {
            Ty(Ty);
            Tw(Tw);
        }

        default void Tzw(final double Tz, final double Tw) {
            Tz(Tz);
            Tw(Tw);
        }

        default void Txyz(final double Tx, final double Ty, final double Tz) {
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
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

        default void xXT(final double Xx, final double Tx) {
            Xx(Xx);
            Tx(Tx);
        }

        default void xYT(final double Yx, final double Tx) {
            Yx(Yx);
            Tx(Tx);
        }

        default void xZT(final double Zx, final double Tx) {
            Zx(Zx);
            Tx(Tx);
        }

        default void xXYT(final double Xx, final double Yx, final double Tx) {
            Xx(Xx);
            Yx(Yx);
            Tx(Tx);
        }

        default void xXZT(final double Xx, final double Zx, final double Tx) {
            Xx(Xx);
            Zx(Zx);
            Tx(Tx);
        }

        default void xYZT(final double Yx, final double Zx, final double Tx) {
            Yx(Yx);
            Zx(Zx);
            Tx(Tx);
        }

        default void xXYZT(final double Xx, final double Yx, final double Zx, final double Tx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
            Tx(Tx);
        }

        default void yXT(final double Xy, final double Ty) {
            Xy(Xy);
            Ty(Ty);
        }

        default void yYT(final double Yy, final double Ty) {
            Yy(Yy);
            Ty(Ty);
        }

        default void yZT(final double Zy, final double Ty) {
            Zy(Zy);
            Ty(Ty);
        }

        default void yXYT(final double Xy, final double Yy, final double Ty) {
            Xy(Xy);
            Yy(Yy);
            Ty(Ty);
        }

        default void yXZT(final double Xy, final double Zy, final double Ty) {
            Xy(Xy);
            Zy(Zy);
            Ty(Ty);
        }

        default void yYZT(final double Yy, final double Zy, final double Ty) {
            Yy(Yy);
            Zy(Zy);
            Ty(Ty);
        }

        default void yXYZT(final double Xy, final double Yy, final double Zy, final double Ty) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
            Ty(Ty);
        }

        default void zXT(final double Xz, final double Tz) {
            Xz(Xz);
            Tz(Tz);
        }

        default void zYT(final double Yz, final double Tz) {
            Yz(Yz);
            Tz(Tz);
        }

        default void zZT(final double Zz, final double Tz) {
            Zz(Zz);
            Tz(Tz);
        }

        default void zXYT(final double Xz, final double Yz, final double Tz) {
            Xz(Xz);
            Yz(Yz);
            Tz(Tz);
        }

        default void zXZT(final double Xz, final double Zz, final double Tz) {
            Xz(Xz);
            Zz(Zz);
            Tz(Tz);
        }

        default void zYZT(final double Yz, final double Zz, final double Tz) {
            Yz(Yz);
            Zz(Zz);
            Tz(Tz);
        }

        default void zXYZT(final double Xz, final double Yz, final double Zz, final double Tz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
            Tz(Tz);
        }

        default void wXY(final double Xw, final double Yw) {
            Xw(Xw);
            Yw(Yw);
        }

        default void wXZ(final double Xw, final double Zw) {
            Xw(Xw);
            Zw(Zw);
        }

        default void wXT(final double Xw, final double Tw) {
            Xw(Xw);
            Tw(Tw);
        }

        default void wYZ(final double Yw, final double Zw) {
            Yw(Yw);
            Zw(Zw);
        }

        default void wYT(final double Yw, final double Tw) {
            Yw(Yw);
            Tw(Tw);
        }

        default void wZT(final double Zw, final double Tw) {
            Zw(Zw);
            Tw(Tw);
        }

        default void wXYZ(final double Xw, final double Yw, final double Zw) {
            Xw(Xw);
            Yw(Yw);
            Zw(Zw);
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

        default void XYxw(
                final double Xx, final double Xw,
                final double Yx, final double Yw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
        }

        default void XYyw(
                final double Xy, final double Xw,
                final double Yy, final double Yw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
        }

        default void XYzw(
                final double Xz, final double Xw,
                final double Yz, final double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
        }

        default void XZxw(
                final double Xx, final double Xw,
                final double Zx, final double Zw
        ) {
            Xx(Xx);
            Xw(Xw);
            Zx(Zx);
            Zw(Zw);
        }

        default void XZyw(
                final double Xy, final double Xw,
                final double Zy, final double Zw
        ) {
            Xy(Xy);
            Xw(Xw);
            Zy(Zy);
            Zw(Zw);
        }

        default void XZzw(
                final double Xz, final double Xw,
                final double Zz, final double Zw
        ) {
            Xz(Xz);
            Xw(Xw);
            Zz(Zz);
            Zw(Zw);
        }

        default void XTxy(
                final double Xx, final double Xy,
                final double Tx, final double Ty
        ) {
            Xx(Xx);
            Xy(Xy);
            Tx(Tx);
            Ty(Ty);
        }

        default void XTxz(
                final double Xx, final double Xz,
                final double Tx, final double Tz
        ) {
            Xx(Xx);
            Xz(Xz);
            Tx(Tx);
            Tz(Tz);
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

        default void XTyz(
                final double Xy, final double Xz,
                final double Ty, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Ty(Ty);
            Tz(Tz);
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

        default void YZxw(
                final double Yx, final double Yw,
                final double Zx, final double Zw
        ) {
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
        }

        default void YZyw(
                final double Yy, final double Yw,
                final double Zy, final double Zw
        ) {
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
        }

        default void YZzw(
                final double Yz, final double Yw,
                final double Zz, final double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
        }

        default void YTxy(
                final double Yx, final double Yy,
                final double Tx, final double Ty
        ) {
            Yx(Yx);
            Yy(Yy);
            Tx(Tx);
            Ty(Ty);
        }

        default void YTxz(
                final double Yx, final double Yz,
                final double Tx, final double Tz
        ) {
            Yx(Yx);
            Yz(Yz);
            Tx(Tx);
            Tz(Tz);
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

        default void YTyz(
                final double Yy, final double Yz,
                final double Ty, final double Tz
        ) {
            Yy(Yy);
            Yz(Yz);
            Ty(Ty);
            Tz(Tz);
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

        default void ZTxy(
                final double Zx, final double Zy,
                final double Tx, final double Ty
        ) {
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void ZTxz(
                final double Zx, final double Zz,
                final double Tx, final double Tz
        ) {
            Zx(Zx);
            Zz(Zz);
            Tx(Tx);
            Tz(Tz);
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

        default void ZTyz(
                final double Zy, final double Zz,
                final double Ty, final double Tz
        ) {
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
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

        default void XYZxyw(
                final double Xx, final double Xy, final double Xw,
                final double Yx, final double Yy, final double Yw,
                final double Zx, final double Zy, final double Zw
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
        }

        default void XYZxzw(
                final double Xx, final double Xz, final double Xw,
                final double Yx, final double Yz, final double Yw,
                final double Zx, final double Zz, final double Zw
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
        }

        default void XYZyzw(
                final double Xy, final double Xz, final double Xw,
                final double Yy, final double Yz, final double Yw,
                final double Zy, final double Zz, final double Zw
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

        default void XYTxyz(
                final double Xx, final double Xy, final double Xz,
                final double Yx, final double Yy, final double Yz,
                final double Tx, final double Ty, final double Tz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
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

        default void XZTxyz(
                final double Xx, final double Xy, final double Xz,
                final double Zx, final double Zy, final double Zz,
                final double Tx, final double Ty, final double Tz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
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

        default void YZTxyz(
                final double Yx, final double Yy, final double Yz,
                final double Zx, final double Zy, final double Zz,
                final double Tx, final double Ty, final double Tz
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

        default void xyXT(
                final double Xx, final double Tx,
                final double Xy, final double Ty
        ) {
            Xx(Xx);
            Xy(Xy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xyYT(
                final double Yx, final double Tx,
                final double Yy, final double Ty
        ) {
            Yx(Yx);
            Yy(Yy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xyZT(
                final double Zx, final double Tx,
                final double Zy, final double Ty
        ) {
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xzXT(
                final double Xx, final double Tx,
                final double Xz, final double Tz
        ) {
            Xx(Xx);
            Xz(Xz);
            Tx(Tx);
            Tz(Tz);
        }

        default void xzYT(
                final double Yx, final double Tx,
                final double Yz, final double Tz
        ) {
            Yx(Yx);
            Yz(Yz);
            Tx(Tx);
            Tz(Tz);
        }

        default void xzZT(
                final double Zx, final double Tx,
                final double Zz, final double Tz
        ) {
            Zx(Zx);
            Zz(Zz);
            Tx(Tx);
            Tz(Tz);
        }

        default void xwXY(
                final double Xx, final double Yx,
                final double Xw, final double Yw
        ) {
            Xx(Xx);
            Xw(Xw);
            Yx(Yx);
            Yw(Yw);
        }

        default void xwXZ(
                final double Xx, final double Zx,
                final double Xw, final double Zw
        ) {
            Xx(Xx);
            Xw(Xw);
            Zx(Zx);
            Zw(Zw);
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

        default void xwYZ(
                final double Yx, final double Zx,
                final double Yw, final double Zw
        ) {
            Yx(Yx);
            Yw(Yw);
            Zx(Zx);
            Zw(Zw);
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

        default void yzXT(
                final double Xy, final double Ty,
                final double Xz, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Ty(Ty);
            Tz(Tz);
        }

        default void yzYT(
                final double Yy, final double Ty,
                final double Yz, final double Tz
        ) {
            Yy(Yy);
            Yz(Yz);
            Ty(Ty);
            Tz(Tz);
        }

        default void yzZT(
                final double Zy, final double Ty,
                final double Zz, final double Tz
        ) {
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void ywXY(
                final double Xy, final double Yy,
                final double Xw, final double Yw
        ) {
            Xy(Xy);
            Xw(Xw);
            Yy(Yy);
            Yw(Yw);
        }

        default void ywXZ(
                final double Xy, final double Zy,
                final double Xw, final double Zw
        ) {
            Xy(Xy);
            Xw(Xw);
            Zy(Zy);
            Zw(Zw);
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

        default void ywYZ(
                final double Yy, final double Zy,
                final double Yw, final double Zw
        ) {
            Yy(Yy);
            Yw(Yw);
            Zy(Zy);
            Zw(Zw);
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

        default void zwXY(
                final double Xz, final double Yz,
                final double Xw, final double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
        }

        default void zwXZ(
                final double Xz, final double Zz,
                final double Xw, final double Zw
        ) {
            Xz(Xz);
            Xw(Xw);
            Zz(Zz);
            Zw(Zw);
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

        default void zwYZ(
                final double Yz, final double Zz,
                final double Yw, final double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
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

        default void xyzXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xy, final double Yy, final double Ty,
                final double Xz, final double Yz, final double Tz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void xyzXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xy, final double Zy, final double Ty,
                final double Xz, final double Zz, final double Tz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void xyzYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yy, final double Zy, final double Ty,
                final double Yz, final double Zz, final double Tz
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

        default void xywXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xy, final double Yy, final double Zy,
                final double Xw, final double Yw, final double Zw
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

        default void xzwXYZ(
                final double Xx, final double Yx, final double Zx,
                final double Xz, final double Yz, final double Zz,
                final double Xw, final double Yw, final double Zw
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

        default void yzwXYZ(
                final double Xy, final double Yy, final double Zy,
                final double Xz, final double Yz, final double Zz,
                final double Xw, final double Yw, final double Zw
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

        default void Xxw(final Vector2.Accessible v) {
            Xxw(v.x(), v.y());
        }

        default void Xyw(final Vector2.Accessible v) {
            Xyw(v.x(), v.y());
        }

        default void Xzw(final Vector2.Accessible v) {
            Xzw(v.x(), v.y());
        }

        default void Xxyw(final Vector3.Accessible v) {
            Xxyw(v.x(), v.y(), v.z());
        }

        default void Xxzw(final Vector3.Accessible v) {
            Xxzw(v.x(), v.y(), v.z());
        }

        default void Xyzw(final Vector3.Accessible v) {
            Xyzw(v.x(), v.y(), v.z());
        }

        default void Xxyzw(final Vector4.Accessible v) {
            Xxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Yxw(final Vector2.Accessible v) {
            Yxw(v.x(), v.y());
        }

        default void Yyw(final Vector2.Accessible v) {
            Yyw(v.x(), v.y());
        }

        default void Yzw(final Vector2.Accessible v) {
            Yzw(v.x(), v.y());
        }

        default void Yxyw(final Vector3.Accessible v) {
            Yxyw(v.x(), v.y(), v.z());
        }

        default void Yxzw(final Vector3.Accessible v) {
            Yxzw(v.x(), v.y(), v.z());
        }

        default void Yyzw(final Vector3.Accessible v) {
            Yyzw(v.x(), v.y(), v.z());
        }

        default void Yxyzw(final Vector4.Accessible v) {
            Yxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Zxw(final Vector2.Accessible v) {
            Zxw(v.x(), v.y());
        }

        default void Zyw(final Vector2.Accessible v) {
            Zyw(v.x(), v.y());
        }

        default void Zzw(final Vector2.Accessible v) {
            Zzw(v.x(), v.y());
        }

        default void Zxyw(final Vector3.Accessible v) {
            Zxyw(v.x(), v.y(), v.z());
        }

        default void Zxzw(final Vector3.Accessible v) {
            Zxzw(v.x(), v.y(), v.z());
        }

        default void Zyzw(final Vector3.Accessible v) {
            Zyzw(v.x(), v.y(), v.z());
        }

        default void Zxyzw(final Vector4.Accessible v) {
            Zxyzw(v.x(), v.y(), v.z(), v.w());
        }

        default void Txy(final Vector2.Accessible v) {
            Txy(v.x(), v.y());
        }

        default void Txz(final Vector2.Accessible v) {
            Txz(v.x(), v.y());
        }

        default void Txw(final Vector2.Accessible v) {
            Txw(v.x(), v.y());
        }

        default void Tyz(final Vector2.Accessible v) {
            Tyz(v.x(), v.y());
        }

        default void Tyw(final Vector2.Accessible v) {
            Tyw(v.x(), v.y());
        }

        default void Tzw(final Vector2.Accessible v) {
            Tzw(v.x(), v.y());
        }

        default void Txyz(final Vector3.Accessible v) {
            Txyz(v.x(), v.y(), v.z());
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

        default void xXT(final Vector2.Accessible v) {
            xXT(v.x(), v.y());
        }

        default void xYT(final Vector2.Accessible v) {
            xYT(v.x(), v.y());
        }

        default void xZT(final Vector2.Accessible v) {
            xZT(v.x(), v.y());
        }

        default void xXYT(final Vector3.Accessible v) {
            xXYT(v.x(), v.y(), v.z());
        }

        default void xXZT(final Vector3.Accessible v) {
            xXZT(v.x(), v.y(), v.z());
        }

        default void xYZT(final Vector3.Accessible v) {
            xYZT(v.x(), v.y(), v.z());
        }

        default void xXYZT(final Vector4.Accessible v) {
            xXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void yXT(final Vector2.Accessible v) {
            yXT(v.x(), v.y());
        }

        default void yYT(final Vector2.Accessible v) {
            yYT(v.x(), v.y());
        }

        default void yZT(final Vector2.Accessible v) {
            yZT(v.x(), v.y());
        }

        default void yXYT(final Vector3.Accessible v) {
            yXYT(v.x(), v.y(), v.z());
        }

        default void yXZT(final Vector3.Accessible v) {
            yXZT(v.x(), v.y(), v.z());
        }

        default void yYZT(final Vector3.Accessible v) {
            yYZT(v.x(), v.y(), v.z());
        }

        default void yXYZT(final Vector4.Accessible v) {
            yXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void zXT(final Vector2.Accessible v) {
            zXT(v.x(), v.y());
        }

        default void zYT(final Vector2.Accessible v) {
            zYT(v.x(), v.y());
        }

        default void zZT(final Vector2.Accessible v) {
            zZT(v.x(), v.y());
        }

        default void zXYT(final Vector3.Accessible v) {
            zXYT(v.x(), v.y(), v.z());
        }

        default void zXZT(final Vector3.Accessible v) {
            zXZT(v.x(), v.y(), v.z());
        }

        default void zYZT(final Vector3.Accessible v) {
            zYZT(v.x(), v.y(), v.z());
        }

        default void zXYZT(final Vector4.Accessible v) {
            zXYZT(v.x(), v.y(), v.z(), v.w());
        }

        default void wXY(final Vector2.Accessible v) {
            wXY(v.x(), v.y());
        }

        default void wXZ(final Vector2.Accessible v) {
            wXZ(v.x(), v.y());
        }

        default void wXT(final Vector2.Accessible v) {
            wXT(v.x(), v.y());
        }

        default void wYZ(final Vector2.Accessible v) {
            wYZ(v.x(), v.y());
        }

        default void wYT(final Vector2.Accessible v) {
            wYT(v.x(), v.y());
        }

        default void wZT(final Vector2.Accessible v) {
            wZT(v.x(), v.y());
        }

        default void wXYZ(final Vector3.Accessible v) {
            wXYZ(v.x(), v.y(), v.z());
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

        default void XYxw(final Matrix2x2.Accessible m) {
            XYxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyw(final Matrix2x2.Accessible m) {
            XYyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYzw(final Matrix2x2.Accessible m) {
            XYzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZxw(final Matrix2x2.Accessible m) {
            XZxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZyw(final Matrix2x2.Accessible m) {
            XZyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XZzw(final Matrix2x2.Accessible m) {
            XZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTxy(final Matrix2x2.Accessible m) {
            XTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTxz(final Matrix2x2.Accessible m) {
            XTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTxw(final Matrix2x2.Accessible m) {
            XTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTyz(final Matrix2x2.Accessible m) {
            XTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTyw(final Matrix2x2.Accessible m) {
            XTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTzw(final Matrix2x2.Accessible m) {
            XTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxw(final Matrix2x2.Accessible m) {
            YZxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyw(final Matrix2x2.Accessible m) {
            YZyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZzw(final Matrix2x2.Accessible m) {
            YZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTxy(final Matrix2x2.Accessible m) {
            YTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTxz(final Matrix2x2.Accessible m) {
            YTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTxw(final Matrix2x2.Accessible m) {
            YTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTyz(final Matrix2x2.Accessible m) {
            YTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTyw(final Matrix2x2.Accessible m) {
            YTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTzw(final Matrix2x2.Accessible m) {
            YTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxy(final Matrix2x2.Accessible m) {
            ZTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxz(final Matrix2x2.Accessible m) {
            ZTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxw(final Matrix2x2.Accessible m) {
            ZTxw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTyz(final Matrix2x2.Accessible m) {
            ZTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTyw(final Matrix2x2.Accessible m) {
            ZTyw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTzw(final Matrix2x2.Accessible m) {
            ZTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxyw(final Matrix3x3.Accessible m) {
            XYZxyw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZxzw(final Matrix3x3.Accessible m) {
            XYZxzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZyzw(final Matrix3x3.Accessible m) {
            XYZyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYTxyz(final Matrix3x3.Accessible m) {
            XYTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default void XZTxyz(final Matrix3x3.Accessible m) {
            XZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default void YZTxyz(final Matrix3x3.Accessible m) {
            YZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default void XYZTxyzw(final Matrix4x4.Accessible m) {
            XYZTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

        default void xyXT(final Matrix2x2.Accessible m) {
            xyXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyYT(final Matrix2x2.Accessible m) {
            xyYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyZT(final Matrix2x2.Accessible m) {
            xyZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xzXT(final Matrix2x2.Accessible m) {
            xzXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xzYT(final Matrix2x2.Accessible m) {
            xzYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xzZT(final Matrix2x2.Accessible m) {
            xzZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwXY(final Matrix2x2.Accessible m) {
            xwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwXZ(final Matrix2x2.Accessible m) {
            xwXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwXT(final Matrix2x2.Accessible m) {
            xwXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwYZ(final Matrix2x2.Accessible m) {
            xwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwYT(final Matrix2x2.Accessible m) {
            xwYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xwZT(final Matrix2x2.Accessible m) {
            xwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXT(final Matrix2x2.Accessible m) {
            yzXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYT(final Matrix2x2.Accessible m) {
            yzYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzZT(final Matrix2x2.Accessible m) {
            yzZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywXY(final Matrix2x2.Accessible m) {
            ywXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywXZ(final Matrix2x2.Accessible m) {
            ywXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywXT(final Matrix2x2.Accessible m) {
            ywXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywYZ(final Matrix2x2.Accessible m) {
            ywYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywYT(final Matrix2x2.Accessible m) {
            ywYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ywZT(final Matrix2x2.Accessible m) {
            ywZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXY(final Matrix2x2.Accessible m) {
            zwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXZ(final Matrix2x2.Accessible m) {
            zwXZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXT(final Matrix2x2.Accessible m) {
            zwXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwYZ(final Matrix2x2.Accessible m) {
            zwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwYT(final Matrix2x2.Accessible m) {
            zwYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwZT(final Matrix2x2.Accessible m) {
            zwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyzXYT(final Matrix3x3.Accessible m) {
            xyzXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzXZT(final Matrix3x3.Accessible m) {
            xyzXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzYZT(final Matrix3x3.Accessible m) {
            xyzYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xywXYZ(final Matrix3x3.Accessible m) {
            xywXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default void xzwXYZ(final Matrix3x3.Accessible m) {
            xzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default void yzwXYZ(final Matrix3x3.Accessible m) {
            yzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
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

        default void xyzwXYZT(final Matrix4x4.Accessible m) {
            xyzwXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix3x3.AccessibleAndMutable {}

}
