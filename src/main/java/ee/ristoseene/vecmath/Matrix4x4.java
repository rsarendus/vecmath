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

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

}
