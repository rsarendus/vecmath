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

        default <R> R Xxy(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xy());
        }

        default void XxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xy());
        }

        default <R> R Xxz(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xz());
        }

        default void XxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xz());
        }

        default <R> R Xxw(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Xw());
        }

        default void XxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Xw());
        }

        default <R> R Xyz(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Xz());
        }

        default void XyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Xz());
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

        default <R> R Xxyz(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz());
        }

        default void XxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Xy(), Xz());
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

        default <R> R Yxy(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yy());
        }

        default void YxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yy());
        }

        default <R> R Yxz(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yz());
        }

        default void YxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yz());
        }

        default <R> R Yxw(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Yw());
        }

        default void YxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Yw());
        }

        default <R> R Yyz(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Yz());
        }

        default void YyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Yz());
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

        default <R> R Yxyz(final Vector3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz());
        }

        default void YxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Yx(), Yy(), Yz());
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

        default <R> R Zxy(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zy());
        }

        default void ZxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zy());
        }

        default <R> R Zxz(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zz());
        }

        default void ZxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zz());
        }

        default <R> R Zxw(final Vector2.Factory<R> factory) {
            return factory.create(Zx(), Zw());
        }

        default void ZxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Zx(), Zw());
        }

        default <R> R Zyz(final Vector2.Factory<R> factory) {
            return factory.create(Zy(), Zz());
        }

        default void ZyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Zy(), Zz());
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

        default <R> R Zxyz(final Vector3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz());
        }

        default void ZxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Zx(), Zy(), Zz());
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

        default <R> R xXY(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yx());
        }

        default void xXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yx());
        }

        default <R> R xXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zx());
        }

        default void xXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zx());
        }

        default <R> R xXT(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tx());
        }

        default void xXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tx());
        }

        default <R> R xYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yx(), Zx());
        }

        default void xYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yx(), Zx());
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

        default <R> R xXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx());
        }

        default void xXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yx(), Zx());
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

        default <R> R yXY(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Yy());
        }

        default void yXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Yy());
        }

        default <R> R yXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Zy());
        }

        default void yXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Zy());
        }

        default <R> R yXT(final Vector2.Factory<R> factory) {
            return factory.create(Xy(), Ty());
        }

        default void yXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xy(), Ty());
        }

        default <R> R yYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zy());
        }

        default void yYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zy());
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

        default <R> R yXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy());
        }

        default void yXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xy(), Yy(), Zy());
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

        default <R> R zXY(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Yz());
        }

        default void zXYto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Yz());
        }

        default <R> R zXZ(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Zz());
        }

        default void zXZto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Zz());
        }

        default <R> R zXT(final Vector2.Factory<R> factory) {
            return factory.create(Xz(), Tz());
        }

        default void zXTto(final Vector2.Consumer consumer) {
            consumer.xy(Xz(), Tz());
        }

        default <R> R zYZ(final Vector2.Factory<R> factory) {
            return factory.create(Yz(), Zz());
        }

        default void zYZto(final Vector2.Consumer consumer) {
            consumer.xy(Yz(), Zz());
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

        default <R> R zXYZ(final Vector3.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Zz());
        }

        default void zXYZto(final Vector3.Consumer consumer) {
            consumer.xyz(Xz(), Yz(), Zz());
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

        default <R> R Dxy(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Yy());
        }

        default void DxyTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Yy());
        }

        default <R> R Dxz(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Zz());
        }

        default void DxzTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Zz());
        }

        default <R> R Dxw(final Vector2.Factory<R> factory) {
            return factory.create(Xx(), Tw());
        }

        default void DxwTo(final Vector2.Consumer consumer) {
            consumer.xy(Xx(), Tw());
        }

        default <R> R Dyz(final Vector2.Factory<R> factory) {
            return factory.create(Yy(), Zz());
        }

        default void DyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Yy(), Zz());
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

        default <R> R Dxyz(final Vector3.Factory<R> factory) {
            return factory.create(Xx(), Yy(), Zz());
        }

        default void DxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Xx(), Yy(), Zz());
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

        default <R> R XYxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy());
        }

        default void XYxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Xy(), Yx(), Yy());
        }

        default <R> R xyXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Xy(), Yy());
        }

        default void xyXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xx(), Yx(), Xy(), Yy());
        }

        default <R> R XYyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz());
        }

        default void XYyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Yy(), Yz());
        }

        default <R> R yzXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Xz(), Yz());
        }

        default void yzXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Yy(), Xz(), Yz());
        }

        default <R> R XYzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Xw(), Yz(), Yw());
        }

        default void XYzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Xw(), Yz(), Yw());
        }

        default <R> R zwXY(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xz(), Yz(), Xw(), Yw());
        }

        default void zwXYto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xz(), Yz(), Xw(), Yw());
        }

        default <R> R YZxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Zx(), Zy());
        }

        default void YZxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Yy(), Zx(), Zy());
        }

        default <R> R xyYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Yy(), Zy());
        }

        default void xyYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yx(), Zx(), Yy(), Zy());
        }

        default <R> R YZyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Zy(), Zz());
        }

        default void YZyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Zy(), Zz());
        }

        default <R> R yzYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Yz(), Zz());
        }

        default void yzYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Zy(), Yz(), Zz());
        }

        default <R> R YZzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Yw(), Zz(), Zw());
        }

        default void YZzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Yw(), Zz(), Zw());
        }

        default <R> R zwYZ(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yz(), Zz(), Yw(), Zw());
        }

        default void zwYZto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yz(), Zz(), Yw(), Zw());
        }

        default <R> R ZTxy(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Tx(), Ty());
        }

        default void ZTxyTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Zy(), Tx(), Ty());
        }

        default <R> R xyZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zy(), Ty());
        }

        default void xyZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zx(), Tx(), Zy(), Ty());
        }

        default <R> R ZTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Ty(), Tz());
        }

        default void ZTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Zz(), Ty(), Tz());
        }

        default <R> R yzZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Ty(), Zz(), Tz());
        }

        default void yzZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Ty(), Zz(), Tz());
        }

        default <R> R ZTzw(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zz(), Zw(), Tz(), Tw());
        }

        default void ZTzwTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zz(), Zw(), Tz(), Tw());
        }

        default <R> R zwZT(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zz(), Tz(), Zw(), Tw());
        }

        default void zwZTto(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zz(), Tz(), Zw(), Tw());
        }

        default <R> R XYZxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default void XYZxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz());
        }

        default <R> R xyzXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default void xyzXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Yx(), Zx(), Xy(), Yy(), Zy(), Xz(), Yz(), Zz());
        }

        default <R> R XYZyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default void XYZyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Xz(), Xw(), Yy(), Yz(), Yw(), Zy(), Zz(), Zw());
        }

        default <R> R yzwXYZ(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default void yzwXYZto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xy(), Yy(), Zy(), Xz(), Yz(), Zz(), Xw(), Yw(), Zw());
        }

        default <R> R YZTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void YZTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default <R> R xyzYZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default void xyzYZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Zx(), Tx(), Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default <R> R YZTyzw(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default void YZTyzwTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yy(), Yz(), Yw(), Zy(), Zz(), Zw(), Ty(), Tz(), Tw());
        }

        default <R> R yzwYZT(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default void yzwYZTto(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yy(), Zy(), Ty(), Yz(), Zz(), Tz(), Yw(), Zw(), Tw());
        }

        default <R> R XYZTxyzw(final Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default void XYZTxyzwTo(final Matrix4x4.Consumer consumer) {
            consumer.XYZTxyzw(Xx(), Xy(), Xz(), Xw(), Yx(), Yy(), Yz(), Yw(), Zx(), Zy(), Zz(), Zw(), Tx(), Ty(), Tz(), Tw());
        }

        default <R> R xyzwXYZT(final Matrix4x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz(), Xw(), Yw(), Zw(), Tw());
        }

        default void xyzwXYZTto(final Matrix4x4.Consumer consumer) {
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

        default void Xxy(final double v) {
            Xxy(v, v);
        }

        default void Xxz(final double v) {
            Xxz(v, v);
        }

        default void Xxw(final double v) {
            Xxw(v, v);
        }

        default void Xyz(final double v) {
            Xyz(v, v);
        }

        default void Xyw(final double v) {
            Xyw(v, v);
        }

        default void Xzw(final double v) {
            Xzw(v, v);
        }

        default void Xxyz(final double v) {
            Xxyz(v, v, v);
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

        default void Yxy(final double v) {
            Yxy(v, v);
        }

        default void Yxz(final double v) {
            Yxz(v, v);
        }

        default void Yxw(final double v) {
            Yxw(v, v);
        }

        default void Yyz(final double v) {
            Yyz(v, v);
        }

        default void Yyw(final double v) {
            Yyw(v, v);
        }

        default void Yzw(final double v) {
            Yzw(v, v);
        }

        default void Yxyz(final double v) {
            Yxyz(v, v, v);
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

        default void Zxy(final double v) {
            Zxy(v, v);
        }

        default void Zxz(final double v) {
            Zxz(v, v);
        }

        default void Zxw(final double v) {
            Zxw(v, v);
        }

        default void Zyz(final double v) {
            Zyz(v, v);
        }

        default void Zyw(final double v) {
            Zyw(v, v);
        }

        default void Zzw(final double v) {
            Zzw(v, v);
        }

        default void Zxyz(final double v) {
            Zxyz(v, v, v);
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

        default void xXY(final double v) {
            xXY(v, v);
        }

        default void xXZ(final double v) {
            xXZ(v, v);
        }

        default void xXT(final double v) {
            xXT(v, v);
        }

        default void xYZ(final double v) {
            xYZ(v, v);
        }

        default void xYT(final double v) {
            xYT(v, v);
        }

        default void xZT(final double v) {
            xZT(v, v);
        }

        default void xXYZ(final double v) {
            xXYZ(v, v, v);
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

        default void yXY(final double v) {
            yXY(v, v);
        }

        default void yXZ(final double v) {
            yXZ(v, v);
        }

        default void yXT(final double v) {
            yXT(v, v);
        }

        default void yYZ(final double v) {
            yYZ(v, v);
        }

        default void yYT(final double v) {
            yYT(v, v);
        }

        default void yZT(final double v) {
            yZT(v, v);
        }

        default void yXYZ(final double v) {
            yXYZ(v, v, v);
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

        default void zXY(final double v) {
            zXY(v, v);
        }

        default void zXZ(final double v) {
            zXZ(v, v);
        }

        default void zXT(final double v) {
            zXT(v, v);
        }

        default void zYZ(final double v) {
            zYZ(v, v);
        }

        default void zYT(final double v) {
            zYT(v, v);
        }

        default void zZT(final double v) {
            zZT(v, v);
        }

        default void zXYZ(final double v) {
            zXYZ(v, v, v);
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

        default void Dxy(final double v) {
            Dxy(v, v);
        }

        default void Dxz(final double v) {
            Dxz(v, v);
        }

        default void Dxw(final double v) {
            Dxw(v, v);
        }

        default void Dyz(final double v) {
            Dyz(v, v);
        }

        default void Dyw(final double v) {
            Dyw(v, v);
        }

        default void Dzw(final double v) {
            Dzw(v, v);
        }

        default void Dxyz(final double v) {
            Dxyz(v, v, v);
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

        default void XYxy(final double v) {
            XYxy(v, v, v, v);
        }

        default void XYyz(final double v) {
            XYyz(v, v, v, v);
        }

        default void XYzw(final double v) {
            XYzw(v, v, v, v);
        }

        default void YZxy(final double v) {
            YZxy(v, v, v, v);
        }

        default void YZyz(final double v) {
            YZyz(v, v, v, v);
        }

        default void YZzw(final double v) {
            YZzw(v, v, v, v);
        }

        default void ZTxy(final double v) {
            ZTxy(v, v, v, v);
        }

        default void ZTyz(final double v) {
            ZTyz(v, v, v, v);
        }

        default void ZTzw(final double v) {
            ZTzw(v, v, v, v);
        }

        default void XYZxyz(final double v) {
            XYZxyz(v, v, v, v, v, v, v, v, v);
        }

        default void XYZyzw(final double v) {
            XYZyzw(v, v, v, v, v, v, v, v, v);
        }

        default void YZTxyz(final double v) {
            YZTxyz(v, v, v, v, v, v, v, v, v);
        }

        default void YZTyzw(final double v) {
            YZTyzw(v, v, v, v, v, v, v, v, v);
        }

        default void XYZTxyzw(final double v) {
            XYZTxyzw(v, v, v, v, v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void Xxy(final double Xx, final double Xy) {
            Xx(Xx);
            Xy(Xy);
        }

        default void Xxz(final double Xx, final double Xz) {
            Xx(Xx);
            Xz(Xz);
        }

        default void Xxw(final double Xx, final double Xw) {
            Xx(Xx);
            Xw(Xw);
        }

        default void Xyz(final double Xy, final double Xz) {
            Xy(Xy);
            Xz(Xz);
        }

        default void Xyw(final double Xy, final double Xw) {
            Xy(Xy);
            Xw(Xw);
        }

        default void Xzw(final double Xz, final double Xw) {
            Xz(Xz);
            Xw(Xw);
        }

        default void Xxyz(final double Xx, final double Xy, final double Xz) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
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

        default void Yxy(final double Yx, final double Yy) {
            Yx(Yx);
            Yy(Yy);
        }

        default void Yxz(final double Yx, final double Yz) {
            Yx(Yx);
            Yz(Yz);
        }

        default void Yxw(final double Yx, final double Yw) {
            Yx(Yx);
            Yw(Yw);
        }

        default void Yyz(final double Yy, final double Yz) {
            Yy(Yy);
            Yz(Yz);
        }

        default void Yyw(final double Yy, final double Yw) {
            Yy(Yy);
            Yw(Yw);
        }

        default void Yzw(final double Yz, final double Yw) {
            Yz(Yz);
            Yw(Yw);
        }

        default void Yxyz(final double Yx, final double Yy, final double Yz) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
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

        default void Zxy(final double Zx, final double Zy) {
            Zx(Zx);
            Zy(Zy);
        }

        default void Zxz(final double Zx, final double Zz) {
            Zx(Zx);
            Zz(Zz);
        }

        default void Zxw(final double Zx, final double Zw) {
            Zx(Zx);
            Zw(Zw);
        }

        default void Zyz(final double Zy, final double Zz) {
            Zy(Zy);
            Zz(Zz);
        }

        default void Zyw(final double Zy, final double Zw) {
            Zy(Zy);
            Zw(Zw);
        }

        default void Zzw(final double Zz, final double Zw) {
            Zz(Zz);
            Zw(Zw);
        }

        default void Zxyz(final double Zx, final double Zy, final double Zz) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
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

        default void xXY(final double Xx, final double Yx) {
            Xx(Xx);
            Yx(Yx);
        }

        default void xXZ(final double Xx, final double Zx) {
            Xx(Xx);
            Zx(Zx);
        }

        default void xXT(final double Xx, final double Tx) {
            Xx(Xx);
            Tx(Tx);
        }

        default void xYZ(final double Yx, final double Zx) {
            Yx(Yx);
            Zx(Zx);
        }

        default void xYT(final double Yx, final double Tx) {
            Yx(Yx);
            Tx(Tx);
        }

        default void xZT(final double Zx, final double Tx) {
            Zx(Zx);
            Tx(Tx);
        }

        default void xXYZ(final double Xx, final double Yx, final double Zx) {
            Xx(Xx);
            Yx(Yx);
            Zx(Zx);
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

        default void yXY(final double Xy, final double Yy) {
            Xy(Xy);
            Yy(Yy);
        }

        default void yXZ(final double Xy, final double Zy) {
            Xy(Xy);
            Zy(Zy);
        }

        default void yXT(final double Xy, final double Ty) {
            Xy(Xy);
            Ty(Ty);
        }

        default void yYZ(final double Yy, final double Zy) {
            Yy(Yy);
            Zy(Zy);
        }

        default void yYT(final double Yy, final double Ty) {
            Yy(Yy);
            Ty(Ty);
        }

        default void yZT(final double Zy, final double Ty) {
            Zy(Zy);
            Ty(Ty);
        }

        default void yXYZ(final double Xy, final double Yy, final double Zy) {
            Xy(Xy);
            Yy(Yy);
            Zy(Zy);
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

        default void zXY(final double Xz, final double Yz) {
            Xz(Xz);
            Yz(Yz);
        }

        default void zXZ(final double Xz, final double Zz) {
            Xz(Xz);
            Zz(Zz);
        }

        default void zXT(final double Xz, final double Tz) {
            Xz(Xz);
            Tz(Tz);
        }

        default void zYZ(final double Yz, final double Zz) {
            Yz(Yz);
            Zz(Zz);
        }

        default void zYT(final double Yz, final double Tz) {
            Yz(Yz);
            Tz(Tz);
        }

        default void zZT(final double Zz, final double Tz) {
            Zz(Zz);
            Tz(Tz);
        }

        default void zXYZ(final double Xz, final double Yz, final double Zz) {
            Xz(Xz);
            Yz(Yz);
            Zz(Zz);
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

        default void Dxy(final double Xx, final double Yy) {
            Xx(Xx);
            Yy(Yy);
        }

        default void Dxz(final double Xx, final double Zz) {
            Xx(Xx);
            Zz(Zz);
        }

        default void Dxw(final double Xx, final double Tw) {
            Xx(Xx);
            Tw(Tw);
        }

        default void Dyz(final double Yy, final double Zz) {
            Yy(Yy);
            Zz(Zz);
        }

        default void Dyw(final double Yy, final double Tw) {
            Yy(Yy);
            Tw(Tw);
        }

        default void Dzw(final double Zz, final double Tw) {
            Zz(Zz);
            Tw(Tw);
        }

        default void Dxyz(final double Xx, final double Yy, final double Zz) {
            Xx(Xx);
            Yy(Yy);
            Zz(Zz);
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

        default void XYxy(
                final double Xx, final double Xy,
                final double Yx, final double Yy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
        }

        default void xyXY(
                final double Xx, final double Yx,
                final double Xy, final double Yy
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
        }

        default void XYyz(
                final double Xy, final double Xz,
                final double Yy, final double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
        }

        default void yzXY(
                final double Xy, final double Yy,
                final double Xz, final double Yz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
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

        default void zwXY(
                final double Xz, final double Yz,
                final double Xw, final double Yw
        ) {
            Xz(Xz);
            Xw(Xw);
            Yz(Yz);
            Yw(Yw);
        }

        default void YZxy(
                final double Yx, final double Yy,
                final double Zx, final double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void xyYZ(
                final double Yx, final double Zx,
                final double Yy, final double Zy
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
        }

        default void YZyz(
                final double Yy, final double Yz,
                final double Zy, final double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
        }

        default void yzYZ(
                final double Yy, final double Zy,
                final double Yz, final double Zz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
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

        default void zwYZ(
                final double Yz, final double Zz,
                final double Yw, final double Zw
        ) {
            Yz(Yz);
            Yw(Yw);
            Zz(Zz);
            Zw(Zw);
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

        default void xyZT(
                final double Zx, final double Tx,
                final double Zy, final double Ty
        ) {
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
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

        default void yzZT(
                final double Zy, final double Ty,
                final double Zz, final double Tz
        ) {
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
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

        default void zwZT(
                final double Zz, final double Tz,
                final double Zw, final double Tw
        ) {
            Zz(Zz);
            Zw(Zw);
            Tz(Tz);
            Tw(Tw);
        }

        default void XYZxyz(
                final double Xx, final double Xy, final double Xz,
                final double Yx, final double Yy, final double Yz,
                final double Zx, final double Zy, final double Zz
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
                final double Xx, final double Yx, final double Zx,
                final double Xy, final double Yy, final double Zy,
                final double Xz, final double Yz, final double Zz
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

        default void Xxy(final Vector2.Accessible v) {
            Xxy(v.x(), v.y());
        }

        default void Xxz(final Vector2.Accessible v) {
            Xxz(v.x(), v.y());
        }

        default void Xxw(final Vector2.Accessible v) {
            Xxw(v.x(), v.y());
        }

        default void Xyz(final Vector2.Accessible v) {
            Xyz(v.x(), v.y());
        }

        default void Xyw(final Vector2.Accessible v) {
            Xyw(v.x(), v.y());
        }

        default void Xzw(final Vector2.Accessible v) {
            Xzw(v.x(), v.y());
        }

        default void Xxyz(final Vector3.Accessible v) {
            Xxyz(v.x(), v.y(), v.z());
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

        default void Yxy(final Vector2.Accessible v) {
            Yxy(v.x(), v.y());
        }

        default void Yxz(final Vector2.Accessible v) {
            Yxz(v.x(), v.y());
        }

        default void Yxw(final Vector2.Accessible v) {
            Yxw(v.x(), v.y());
        }

        default void Yyz(final Vector2.Accessible v) {
            Yyz(v.x(), v.y());
        }

        default void Yyw(final Vector2.Accessible v) {
            Yyw(v.x(), v.y());
        }

        default void Yzw(final Vector2.Accessible v) {
            Yzw(v.x(), v.y());
        }

        default void Yxyz(final Vector3.Accessible v) {
            Yxyz(v.x(), v.y(), v.z());
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

        default void Zxy(final Vector2.Accessible v) {
            Zxy(v.x(), v.y());
        }

        default void Zxz(final Vector2.Accessible v) {
            Zxz(v.x(), v.y());
        }

        default void Zxw(final Vector2.Accessible v) {
            Zxw(v.x(), v.y());
        }

        default void Zyz(final Vector2.Accessible v) {
            Zyz(v.x(), v.y());
        }

        default void Zyw(final Vector2.Accessible v) {
            Zyw(v.x(), v.y());
        }

        default void Zzw(final Vector2.Accessible v) {
            Zzw(v.x(), v.y());
        }

        default void Zxyz(final Vector3.Accessible v) {
            Zxyz(v.x(), v.y(), v.z());
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

        default void xXY(final Vector2.Accessible v) {
            xXY(v.x(), v.y());
        }

        default void xXZ(final Vector2.Accessible v) {
            xXZ(v.x(), v.y());
        }

        default void xXT(final Vector2.Accessible v) {
            xXT(v.x(), v.y());
        }

        default void xYZ(final Vector2.Accessible v) {
            xYZ(v.x(), v.y());
        }

        default void xYT(final Vector2.Accessible v) {
            xYT(v.x(), v.y());
        }

        default void xZT(final Vector2.Accessible v) {
            xZT(v.x(), v.y());
        }

        default void xXYZ(final Vector3.Accessible v) {
            xXYZ(v.x(), v.y(), v.z());
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

        default void yXY(final Vector2.Accessible v) {
            yXY(v.x(), v.y());
        }

        default void yXZ(final Vector2.Accessible v) {
            yXZ(v.x(), v.y());
        }

        default void yXT(final Vector2.Accessible v) {
            yXT(v.x(), v.y());
        }

        default void yYZ(final Vector2.Accessible v) {
            yYZ(v.x(), v.y());
        }

        default void yYT(final Vector2.Accessible v) {
            yYT(v.x(), v.y());
        }

        default void yZT(final Vector2.Accessible v) {
            yZT(v.x(), v.y());
        }

        default void yXYZ(final Vector3.Accessible v) {
            yXYZ(v.x(), v.y(), v.z());
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

        default void zXY(final Vector2.Accessible v) {
            zXY(v.x(), v.y());
        }

        default void zXZ(final Vector2.Accessible v) {
            zXZ(v.x(), v.y());
        }

        default void zXT(final Vector2.Accessible v) {
            zXT(v.x(), v.y());
        }

        default void zYZ(final Vector2.Accessible v) {
            zYZ(v.x(), v.y());
        }

        default void zYT(final Vector2.Accessible v) {
            zYT(v.x(), v.y());
        }

        default void zZT(final Vector2.Accessible v) {
            zZT(v.x(), v.y());
        }

        default void zXYZ(final Vector3.Accessible v) {
            zXYZ(v.x(), v.y(), v.z());
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

        default void Dxy(final Vector2.Accessible v) {
            Dxy(v.x(), v.y());
        }

        default void Dxz(final Vector2.Accessible v) {
            Dxz(v.x(), v.y());
        }

        default void Dxw(final Vector2.Accessible v) {
            Dxw(v.x(), v.y());
        }

        default void Dyz(final Vector2.Accessible v) {
            Dyz(v.x(), v.y());
        }

        default void Dyw(final Vector2.Accessible v) {
            Dyw(v.x(), v.y());
        }

        default void Dzw(final Vector2.Accessible v) {
            Dzw(v.x(), v.y());
        }

        default void Dxyz(final Vector3.Accessible v) {
            Dxyz(v.x(), v.y(), v.z());
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

        default void XYxy(final Matrix2x2.Accessible m) {
            XYxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXY(final Matrix2x2.Accessible m) {
            xyXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYyz(final Matrix2x2.Accessible m) {
            XYyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzXY(final Matrix2x2.Accessible m) {
            yzXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYzw(final Matrix2x2.Accessible m) {
            XYzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwXY(final Matrix2x2.Accessible m) {
            zwXY(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZxy(final Matrix2x2.Accessible m) {
            YZxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyYZ(final Matrix2x2.Accessible m) {
            xyYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZyz(final Matrix2x2.Accessible m) {
            YZyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYZ(final Matrix2x2.Accessible m) {
            yzYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YZzw(final Matrix2x2.Accessible m) {
            YZzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwYZ(final Matrix2x2.Accessible m) {
            zwYZ(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxy(final Matrix2x2.Accessible m) {
            ZTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyZT(final Matrix2x2.Accessible m) {
            xyZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTyz(final Matrix2x2.Accessible m) {
            ZTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzZT(final Matrix2x2.Accessible m) {
            yzZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTzw(final Matrix2x2.Accessible m) {
            ZTzw(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void zwZT(final Matrix2x2.Accessible m) {
            zwZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XYZxyz(final Matrix3x3.Accessible m) {
            XYZxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzXYZ(final Matrix3x3.Accessible m) {
            xyzXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZyzw(final Matrix3x3.Accessible m) {
            XYZyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwXYZ(final Matrix3x3.Accessible m) {
            yzwXYZ(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTxyz(final Matrix3x3.Accessible m) {
            YZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void xyzYZT(final Matrix3x3.Accessible m) {
            xyzYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTyzw(final Matrix3x3.Accessible m) {
            YZTyzw(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void yzwYZT(final Matrix3x3.Accessible m) {
            yzwYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZTxyzw(final Matrix4x4.Accessible m) {
            XYZTxyzw(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

        default void xyzwXYZT(final Matrix4x4.Accessible m) {
            xyzwXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw(), m.Tx(), m.Ty(), m.Tz(), m.Tw());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
