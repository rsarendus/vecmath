package ee.ristoseene.vecmath.mutable;

import ee.ristoseene.vecmath.Vector4;
import ee.ristoseene.vecmath.Matrix4x4;

public class MutableMatrix4x4 implements Matrix4x4.AccessibleAndMutable {

    private double Xx;
    private double Xy;
    private double Xz;
    private double Xw;
    private double Yx;
    private double Yy;
    private double Yz;
    private double Yw;
    private double Zx;
    private double Zy;
    private double Zz;
    private double Zw;
    private double Tx;
    private double Ty;
    private double Tz;
    private double Tw;

    public MutableMatrix4x4() {}

    public MutableMatrix4x4(double v) {
        this.Xx = v;
        this.Xy = v;
        this.Xz = v;
        this.Xw = v;
        this.Yx = v;
        this.Yy = v;
        this.Yz = v;
        this.Yw = v;
        this.Zx = v;
        this.Zy = v;
        this.Zz = v;
        this.Zw = v;
        this.Tx = v;
        this.Ty = v;
        this.Tz = v;
        this.Tw = v;
    }

    public MutableMatrix4x4(double Xx, double Yy, double Zz, double Tw) {
        this.Xx = Xx;
        this.Xy = 0.0D;
        this.Xz = 0.0D;
        this.Xw = 0.0D;
        this.Yx = 0.0D;
        this.Yy = Yy;
        this.Yz = 0.0D;
        this.Yw = 0.0D;
        this.Zx = 0.0D;
        this.Zy = 0.0D;
        this.Zz = Zz;
        this.Zw = 0.0D;
        this.Tx = 0.0D;
        this.Ty = 0.0D;
        this.Tz = 0.0D;
        this.Tw = Tw;
    }

    public MutableMatrix4x4(
            double Xx, double Xy, double Xz, double Xw,
            double Yx, double Yy, double Yz, double Yw,
            double Zx, double Zy, double Zz, double Zw,
            double Tx, double Ty, double Tz, double Tw
    ) {
        this.Xx = Xx;
        this.Xy = Xy;
        this.Xz = Xz;
        this.Xw = Xw;
        this.Yx = Yx;
        this.Yy = Yy;
        this.Yz = Yz;
        this.Yw = Yw;
        this.Zx = Zx;
        this.Zy = Zy;
        this.Zz = Zz;
        this.Zw = Zw;
        this.Tx = Tx;
        this.Ty = Ty;
        this.Tz = Tz;
        this.Tw = Tw;
    }

    public MutableMatrix4x4(Vector4.Accessible diagonal) {
        this(diagonal.x(), diagonal.y(), diagonal.z(), diagonal.w());
    }

    public MutableMatrix4x4(
            Vector4.Accessible X4,
            Vector4.Accessible Y4,
            Vector4.Accessible Z4,
            Vector4.Accessible T4
    ) {
        this(
                X4.x(), X4.y(), X4.z(), X4.w(),
                Y4.x(), Y4.y(), Y4.z(), Y4.w(),
                Z4.x(), Z4.y(), Z4.z(), Z4.w(),
                T4.x(), T4.y(), T4.z(), T4.w()
        );
    }

    public MutableMatrix4x4(Matrix4x4.Accessible m) {
        this(
                m.Xx(), m.Xy(), m.Xz(), m.Xw(),
                m.Yx(), m.Yy(), m.Yz(), m.Yw(),
                m.Zx(), m.Zy(), m.Zz(), m.Zw(),
                m.Tx(), m.Ty(), m.Tz(), m.Tw()
        );
    }

    @Override
    public double Xx() {
        return this.Xx;
    }

    @Override
    public double Xy() {
        return this.Xy;
    }

    @Override
    public double Xz() {
        return this.Xz;
    }

    @Override
    public double Xw() {
        return this.Xw;
    }

    @Override
    public double Yx() {
        return this.Yx;
    }

    @Override
    public double Yy() {
        return this.Yy;
    }

    @Override
    public double Yz() {
        return this.Yz;
    }

    @Override
    public double Yw() {
        return this.Yw;
    }

    @Override
    public double Zx() {
        return this.Zx;
    }

    @Override
    public double Zy() {
        return this.Zy;
    }

    @Override
    public double Zz() {
        return this.Zz;
    }

    @Override
    public double Zw() {
        return this.Zw;
    }

    @Override
    public double Tx() {
        return this.Tx;
    }

    @Override
    public double Ty() {
        return this.Ty;
    }

    @Override
    public double Tz() {
        return this.Tz;
    }

    @Override
    public double Tw() {
        return this.Tw;
    }

    @Override
    public void Xx(double Xx) {
        this.Xx = Xx;
    }

    @Override
    public void Xy(double Xy) {
        this.Xy = Xy;
    }

    @Override
    public void Xz(double Xz) {
        this.Xz = Xz;
    }

    @Override
    public void Xw(double Xw) {
        this.Xw = Xw;
    }

    @Override
    public void Yx(double Yx) {
        this.Yx = Yx;
    }

    @Override
    public void Yy(double Yy) {
        this.Yy = Yy;
    }

    @Override
    public void Yz(double Yz) {
        this.Yz = Yz;
    }

    @Override
    public void Yw(double Yw) {
        this.Yw = Yw;
    }

    @Override
    public void Zx(double Zx) {
        this.Zx = Zx;
    }

    @Override
    public void Zy(double Zy) {
        this.Zy = Zy;
    }

    @Override
    public void Zz(double Zz) {
        this.Zz = Zz;
    }

    @Override
    public void Zw(double Zw) {
        this.Zw = Zw;
    }

    @Override
    public void Tx(double Tx) {
        this.Tx = Tx;
    }

    @Override
    public void Ty(double Ty) {
        this.Ty = Ty;
    }

    @Override
    public void Tz(double Tz) {
        this.Tz = Tz;
    }

    @Override
    public void Tw(double Tw) {
        this.Tw = Tw;
    }

}
