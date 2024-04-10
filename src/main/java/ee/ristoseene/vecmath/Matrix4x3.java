package ee.ristoseene.vecmath;

public final class Matrix4x3 {

    private Matrix4x3() {}

    @FunctionalInterface
    public interface Consumer {

        void XYZTxyz(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz,
                double Zx, double Zy, double Zz,
                double Tx, double Ty, double Tz
        );

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(
                double Xx, double Xy, double Xz,
                double Yx, double Yy, double Yz,
                double Zx, double Zy, double Zz,
                double Tx, double Ty, double Tz
        );

    }

    public interface Accessible extends Matrix3x3.Accessible {

        double Tx();
        double Ty();
        double Tz();

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

        default <R> R Tyz(final Vector2.Factory<R> factory) {
            return factory.create(Ty(), Tz());
        }

        default void TyzTo(final Vector2.Consumer consumer) {
            consumer.xy(Ty(), Tz());
        }

        default <R> R Txyz(final Vector3.Factory<R> factory) {
            return factory.create(Tx(), Ty(), Tz());
        }

        default void TxyzTo(final Vector3.Consumer consumer) {
            consumer.xyz(Tx(), Ty(), Tz());
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

        default <R> R XTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Ty(), Tz());
        }

        default void XTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Xy(), Xz(), Ty(), Tz());
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

        default <R> R YTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Ty(), Tz());
        }

        default void YTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Yy(), Yz(), Ty(), Tz());
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

        default <R> R ZTyz(final Matrix2x2.Factory<R> factory) {
            return factory.create(Zy(), Zz(), Ty(), Tz());
        }

        default void ZTyzTo(final Matrix2x2.Consumer consumer) {
            consumer.XYxy(Zy(), Zz(), Ty(), Tz());
        }

        default <R> R XTxyz(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Tx(), Ty(), Tz());
        }

        default void XTxyzTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Xy(), Xz(), Tx(), Ty(), Tz());
        }

        default <R> R YTxyz(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Tx(), Ty(), Tz());
        }

        default void YTxyzTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Yy(), Yz(), Tx(), Ty(), Tz());
        }

        default <R> R ZTxyz(final Matrix2x3.Factory<R> factory) {
            return factory.create(Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void ZTxyzTo(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default <R> R XYTxy(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Yx(), Yy(), Tx(), Ty());
        }

        default void XYTxyTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xy(), Yx(), Yy(), Tx(), Ty());
        }

        default <R> R XYTxz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Yx(), Yz(), Tx(), Tz());
        }

        default void XYTxzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xz(), Yx(), Yz(), Tx(), Tz());
        }

        default <R> R XYTyz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Yy(), Yz(), Ty(), Tz());
        }

        default void XYTyzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Xz(), Yy(), Yz(), Ty(), Tz());
        }

        default <R> R XZTxy(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Zx(), Zy(), Tx(), Ty());
        }

        default void XZTxyTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xy(), Zx(), Zy(), Tx(), Ty());
        }

        default <R> R XZTxz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Xz(), Zx(), Zz(), Tx(), Tz());
        }

        default void XZTxzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Xz(), Zx(), Zz(), Tx(), Tz());
        }

        default <R> R XZTyz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xy(), Xz(), Zy(), Zz(), Ty(), Tz());
        }

        default void XZTyzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xy(), Xz(), Zy(), Zz(), Ty(), Tz());
        }

        default <R> R YZTxy(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Zx(), Zy(), Tx(), Ty());
        }

        default void YZTxyTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Yy(), Zx(), Zy(), Tx(), Ty());
        }

        default <R> R YZTxz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Yz(), Zx(), Zz(), Tx(), Tz());
        }

        default void YZTxzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Yz(), Zx(), Zz(), Tx(), Tz());
        }

        default <R> R YZTyz(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yy(), Yz(), Zy(), Zz(), Ty(), Tz());
        }

        default void YZTyzTo(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yy(), Yz(), Zy(), Zz(), Ty(), Tz());
        }

        default <R> R XYTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Tx(), Ty(), Tz());
        }

        default void XYTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Tx(), Ty(), Tz());
        }

        default <R> R XZTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void XZTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Xx(), Xy(), Xz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default <R> R YZTxyz(final Matrix3x3.Factory<R> factory) {
            return factory.create(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void YZTxyzTo(final Matrix3x3.Consumer consumer) {
            consumer.XYZxyz(Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default <R> R XYZTxyz(final Matrix4x3.Factory<R> factory) {
            return factory.create(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
        }

        default void XYZTxyzTo(final Matrix4x3.Consumer consumer) {
            consumer.XYZTxyz(Xx(), Xy(), Xz(), Yx(), Yy(), Yz(), Zx(), Zy(), Zz(), Tx(), Ty(), Tz());
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

        default <R> R xyXYT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xy(), Yy(), Ty());
        }

        default void xyXYTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Yx(), Tx(), Xy(), Yy(), Ty());
        }

        default <R> R xyXZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xy(), Zy(), Ty());
        }

        default void xyXZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Zx(), Tx(), Xy(), Zy(), Ty());
        }

        default <R> R xyYZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yy(), Zy(), Ty());
        }

        default void xyYZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Zx(), Tx(), Yy(), Zy(), Ty());
        }

        default <R> R xzXYT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Tx(), Xz(), Yz(), Tz());
        }

        default void xzXYTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Yx(), Tx(), Xz(), Yz(), Tz());
        }

        default <R> R xzXZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xx(), Zx(), Tx(), Xz(), Zz(), Tz());
        }

        default void xzXZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xx(), Zx(), Tx(), Xz(), Zz(), Tz());
        }

        default <R> R xzYZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yx(), Zx(), Tx(), Yz(), Zz(), Tz());
        }

        default void xzYZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yx(), Zx(), Tx(), Yz(), Zz(), Tz());
        }

        default <R> R yzXYT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Yy(), Ty(), Xz(), Yz(), Tz());
        }

        default void yzXYTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Yy(), Ty(), Xz(), Yz(), Tz());
        }

        default <R> R yzXZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Xy(), Zy(), Ty(), Xz(), Zz(), Tz());
        }

        default void yzXZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Xy(), Zy(), Ty(), Xz(), Zz(), Tz());
        }

        default <R> R yzYZT(final Matrix2x3.Factory<R> factory) {
            return factory.create(Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default void yzYZTto(final Matrix2x3.Consumer consumer) {
            consumer.XYxyz(Yy(), Zy(), Ty(), Yz(), Zz(), Tz());
        }

        default <R> R xyzXT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Xx(), Tx(), Xy(), Ty(), Xz(), Tz());
        }

        default void xyzXTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Xx(), Tx(), Xy(), Ty(), Xz(), Tz());
        }

        default <R> R xyzYT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Yx(), Tx(), Yy(), Ty(), Yz(), Tz());
        }

        default void xyzYTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Yx(), Tx(), Yy(), Ty(), Yz(), Tz());
        }

        default <R> R xyzZT(final Matrix3x2.Factory<R> factory) {
            return factory.create(Zx(), Tx(), Zy(), Ty(), Zz(), Tz());
        }

        default void xyzZTto(final Matrix3x2.Consumer consumer) {
            consumer.XYZxy(Zx(), Tx(), Zy(), Ty(), Zz(), Tz());
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

        default <R> R xyzXYZT(final Matrix3x4.Factory<R> factory) {
            return factory.create(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz());
        }

        default void xyzXYZTto(final Matrix3x4.Consumer consumer) {
            consumer.XYZxyzw(Xx(), Yx(), Zx(), Tx(), Xy(), Yy(), Zy(), Ty(), Xz(), Yz(), Zz(), Tz());
        }

    }

    public interface Mutable extends Consumer, Matrix3x3.Mutable {

        void Tx(double Tx);
        void Ty(double Ty);
        void Tz(double Tz);

        default void Txy(final double v) {
            Txy(v, v);
        }

        default void Txz(final double v) {
            Txz(v, v);
        }

        default void Tyz(final double v) {
            Tyz(v, v);
        }

        default void Txyz(final double v) {
            Txyz(v, v, v);
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

        default void XTxy(final double v) {
            XTxy(v, v, v, v);
        }

        default void XTxz(final double v) {
            XTxz(v, v, v, v);
        }

        default void XTyz(final double v) {
            XTyz(v, v, v, v);
        }

        default void YTxy(final double v) {
            YTxy(v, v, v, v);
        }

        default void YTxz(final double v) {
            YTxz(v, v, v, v);
        }

        default void YTyz(final double v) {
            YTyz(v, v, v, v);
        }

        default void ZTxy(final double v) {
            ZTxy(v, v, v, v);
        }

        default void ZTxz(final double v) {
            ZTxz(v, v, v, v);
        }

        default void ZTyz(final double v) {
            ZTyz(v, v, v, v);
        }

        default void XTxyz(final double v) {
            XTxyz(v, v, v, v, v, v);
        }

        default void YTxyz(final double v) {
            YTxyz(v, v, v, v, v, v);
        }

        default void ZTxyz(final double v) {
            ZTxyz(v, v, v, v, v, v);
        }

        default void XYTxy(final double v) {
            XYTxy(v, v, v, v, v, v);
        }

        default void XYTxz(final double v) {
            XYTxz(v, v, v, v, v, v);
        }

        default void XYTyz(final double v) {
            XYTyz(v, v, v, v, v, v);
        }

        default void XZTxy(final double v) {
            XZTxy(v, v, v, v, v, v);
        }

        default void XZTxz(final double v) {
            XZTxz(v, v, v, v, v, v);
        }

        default void XZTyz(final double v) {
            XZTyz(v, v, v, v, v, v);
        }

        default void YZTxy(final double v) {
            YZTxy(v, v, v, v, v, v);
        }

        default void YZTxz(final double v) {
            YZTxz(v, v, v, v, v, v);
        }

        default void YZTyz(final double v) {
            YZTyz(v, v, v, v, v, v);
        }

        default void XYTxyz(final double v) {
            XYTxyz(v, v, v, v, v, v, v, v, v);
        }

        default void XZTxyz(final double v) {
            XZTxyz(v, v, v, v, v, v, v, v, v);
        }

        default void YZTxyz(final double v) {
            YZTxyz(v, v, v, v, v, v, v, v, v);
        }

        default void XYZTxyz(final double v) {
            XYZTxyz(v, v, v, v, v, v, v, v, v, v, v, v);
        }

        default void Txy(final double Tx, final double Ty) {
            Tx(Tx);
            Ty(Ty);
        }

        default void Txz(final double Tx, final double Tz) {
            Tx(Tx);
            Tz(Tz);
        }

        default void Tyz(final double Ty, final double Tz) {
            Ty(Ty);
            Tz(Tz);
        }

        default void Txyz(final double Tx, final double Ty, final double Tz) {
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
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

        default void XTyz(
                final double Xy, final double Xz,
                final double Ty, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Ty(Ty);
            Tz(Tz);
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

        default void YTyz(
                final double Yy, final double Yz,
                final double Ty, final double Tz
        ) {
            Yy(Yy);
            Yz(Yz);
            Ty(Ty);
            Tz(Tz);
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

        default void ZTyz(
                final double Zy, final double Zz,
                final double Ty, final double Tz
        ) {
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void XTxyz(
                final double Xx, final double Xy, final double Xz,
                final double Tx, final double Ty, final double Tz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void YTxyz(
                final double Yx, final double Yy, final double Yz,
                final double Tx, final double Ty, final double Tz
        ) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void ZTxyz(
                final double Zx, final double Zy, final double Zz,
                final double Tx, final double Ty, final double Tz
        ) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void XYTxy(
                final double Xx, final double Xy,
                final double Yx, final double Yy,
                final double Tx, final double Ty
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
            Tx(Tx);
            Ty(Ty);
        }

        default void XYTxz(
                final double Xx, final double Xz,
                final double Yx, final double Yz,
                final double Tx, final double Tz
        ) {
            Xx(Xx);
            Xz(Xz);
            Yx(Yx);
            Yz(Yz);
            Tx(Tx);
            Tz(Tz);
        }

        default void XYTyz(
                final double Xy, final double Xz,
                final double Yy, final double Yz,
                final double Ty, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
            Ty(Ty);
            Tz(Tz);
        }

        default void XZTxy(
                final double Xx, final double Xy,
                final double Zx, final double Zy,
                final double Tx, final double Ty
        ) {
            Xx(Xx);
            Xy(Xy);
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void XZTxz(
                final double Xx, final double Xz,
                final double Zx, final double Zz,
                final double Tx, final double Tz
        ) {
            Xx(Xx);
            Xz(Xz);
            Zx(Zx);
            Zz(Zz);
            Tx(Tx);
            Tz(Tz);
        }

        default void XZTyz(
                final double Xy, final double Xz,
                final double Zy, final double Zz,
                final double Ty, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void YZTxy(
                final double Yx, final double Yy,
                final double Zx, final double Zy,
                final double Tx, final double Ty
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void YZTxz(
                final double Yx, final double Yz,
                final double Zx, final double Zz,
                final double Tx, final double Tz
        ) {
            Yx(Yx);
            Yz(Yz);
            Zx(Zx);
            Zz(Zz);
            Tx(Tx);
            Tz(Tz);
        }

        default void YZTyz(
                final double Yy, final double Yz,
                final double Zy, final double Zz,
                final double Ty, final double Tz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
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

        @Override
        default void XYZTxyz(
                final double Xx, final double Xy, final double Xz,
                final double Yx, final double Yy, final double Yz,
                final double Zx, final double Zy, final double Zz,
                final double Tx, final double Ty, final double Tz
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
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
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

        default void xyXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xy, final double Yy, final double Ty
        ) {
            Xx(Xx);
            Xy(Xy);
            Yx(Yx);
            Yy(Yy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xyXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xy, final double Zy, final double Ty
        ) {
            Xx(Xx);
            Xy(Xy);
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xyYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yy, final double Zy, final double Ty
        ) {
            Yx(Yx);
            Yy(Yy);
            Zx(Zx);
            Zy(Zy);
            Tx(Tx);
            Ty(Ty);
        }

        default void xzXYT(
                final double Xx, final double Yx, final double Tx,
                final double Xz, final double Yz, final double Tz
        ) {
            Xx(Xx);
            Xz(Xz);
            Yx(Yx);
            Yz(Yz);
            Tx(Tx);
            Tz(Tz);
        }

        default void xzXZT(
                final double Xx, final double Zx, final double Tx,
                final double Xz, final double Zz, final double Tz
        ) {
            Xx(Xx);
            Xz(Xz);
            Zx(Zx);
            Zz(Zz);
            Tx(Tx);
            Tz(Tz);
        }

        default void xzYZT(
                final double Yx, final double Zx, final double Tx,
                final double Yz, final double Zz, final double Tz
        ) {
            Yx(Yx);
            Yz(Yz);
            Zx(Zx);
            Zz(Zz);
            Tx(Tx);
            Tz(Tz);
        }

        default void yzXYT(
                final double Xy, final double Yy, final double Ty,
                final double Xz, final double Yz, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Yy(Yy);
            Yz(Yz);
            Ty(Ty);
            Tz(Tz);
        }

        default void yzXZT(
                final double Xy, final double Zy, final double Ty,
                final double Xz, final double Zz, final double Tz
        ) {
            Xy(Xy);
            Xz(Xz);
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void yzYZT(
                final double Yy, final double Zy, final double Ty,
                final double Yz, final double Zz, final double Tz
        ) {
            Yy(Yy);
            Yz(Yz);
            Zy(Zy);
            Zz(Zz);
            Ty(Ty);
            Tz(Tz);
        }

        default void xyzXT(
                final double Xx, final double Tx,
                final double Xy, final double Ty,
                final double Xz, final double Tz
        ) {
            Xx(Xx);
            Xy(Xy);
            Xz(Xz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void xyzYT(
                final double Yx, final double Tx,
                final double Yy, final double Ty,
                final double Yz, final double Tz
        ) {
            Yx(Yx);
            Yy(Yy);
            Yz(Yz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void xyzZT(
                final double Zx, final double Tx,
                final double Zy, final double Ty,
                final double Zz, final double Tz
        ) {
            Zx(Zx);
            Zy(Zy);
            Zz(Zz);
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
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

        default void xyzXYZT(
                final double Xx, final double Yx, final double Zx, final double Tx,
                final double Xy, final double Yy, final double Zy, final double Ty,
                final double Xz, final double Yz, final double Zz, final double Tz
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
            Tx(Tx);
            Ty(Ty);
            Tz(Tz);
        }

        default void Txy(final Vector2.Accessible v) {
            Txy(v.x(), v.y());
        }

        default void Txz(final Vector2.Accessible v) {
            Txz(v.x(), v.y());
        }

        default void Tyz(final Vector2.Accessible v) {
            Tyz(v.x(), v.y());
        }

        default void Txyz(final Vector3.Accessible v) {
            Txyz(v.x(), v.y(), v.z());
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

        default void XTxy(final Matrix2x2.Accessible m) {
            XTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTxz(final Matrix2x2.Accessible m) {
            XTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTyz(final Matrix2x2.Accessible m) {
            XTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTxy(final Matrix2x2.Accessible m) {
            YTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTxz(final Matrix2x2.Accessible m) {
            YTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void YTyz(final Matrix2x2.Accessible m) {
            YTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxy(final Matrix2x2.Accessible m) {
            ZTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTxz(final Matrix2x2.Accessible m) {
            ZTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void ZTyz(final Matrix2x2.Accessible m) {
            ZTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void XTxyz(final Matrix2x3.Accessible m) {
            XTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void YTxyz(final Matrix2x3.Accessible m) {
            YTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void ZTxyz(final Matrix2x3.Accessible m) {
            ZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void XYTxy(final Matrix3x2.Accessible m) {
            XYTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYTxz(final Matrix3x2.Accessible m) {
            XYTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYTyz(final Matrix3x2.Accessible m) {
            XYTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XZTxy(final Matrix3x2.Accessible m) {
            XZTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XZTxz(final Matrix3x2.Accessible m) {
            XZTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XZTyz(final Matrix3x2.Accessible m) {
            XZTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void YZTxy(final Matrix3x2.Accessible m) {
            YZTxy(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void YZTxz(final Matrix3x2.Accessible m) {
            YZTxz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void YZTyz(final Matrix3x2.Accessible m) {
            YZTyz(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void XYTxyz(final Matrix3x3.Accessible m) {
            XYTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XZTxyz(final Matrix3x3.Accessible m) {
            XZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void YZTxyz(final Matrix3x3.Accessible m) {
            YZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz());
        }

        default void XYZTxyz(final Matrix4x3.Accessible m) {
            XYZTxyz(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz(), m.Zx(), m.Zy(), m.Zz(), m.Tx(), m.Ty(), m.Tz());
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

        default void yzXT(final Matrix2x2.Accessible m) {
            yzXT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzYT(final Matrix2x2.Accessible m) {
            yzYT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void yzZT(final Matrix2x2.Accessible m) {
            yzZT(m.Xx(), m.Xy(), m.Yx(), m.Yy());
        }

        default void xyXYT(final Matrix2x3.Accessible m) {
            xyXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xyXZT(final Matrix2x3.Accessible m) {
            xyXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xyYZT(final Matrix2x3.Accessible m) {
            xyYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xzXYT(final Matrix2x3.Accessible m) {
            xzXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xzXZT(final Matrix2x3.Accessible m) {
            xzXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xzYZT(final Matrix2x3.Accessible m) {
            xzYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void yzXYT(final Matrix2x3.Accessible m) {
            yzXYT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void yzXZT(final Matrix2x3.Accessible m) {
            yzXZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void yzYZT(final Matrix2x3.Accessible m) {
            yzYZT(m.Xx(), m.Xy(), m.Xz(), m.Yx(), m.Yy(), m.Yz());
        }

        default void xyzXT(final Matrix3x2.Accessible m) {
            xyzXT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xyzYT(final Matrix3x2.Accessible m) {
            xyzYT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
        }

        default void xyzZT(final Matrix3x2.Accessible m) {
            xyzZT(m.Xx(), m.Xy(), m.Yx(), m.Yy(), m.Zx(), m.Zy());
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

        default void xyzXYZT(final Matrix3x4.Accessible m) {
            xyzXYZT(m.Xx(), m.Xy(), m.Xz(), m.Xw(), m.Yx(), m.Yy(), m.Yz(), m.Yw(), m.Zx(), m.Zy(), m.Zz(), m.Zw());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Matrix3x3.AccessibleAndMutable {}

}
