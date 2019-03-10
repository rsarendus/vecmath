package ee.ristoseene.vecmath.vector4;

import ee.ristoseene.vecmath.Vector4;

public abstract class AbstractMutableVector4 implements Vector4.AccessibleAndMutable {

    protected double x;
    protected double y;
    protected double z;
    protected double w;

    protected AbstractMutableVector4() {}

    protected AbstractMutableVector4(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
        this.w = v;
    }

    protected AbstractMutableVector4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    protected AbstractMutableVector4(Vector4.Accessible xyzw) {
        this(xyzw.x(), xyzw.y(), xyzw.z(), xyzw.w());
    }

    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

    @Override
    public double z() {
        return this.z;
    }

    @Override
    public double w() {
        return this.w;
    }

    @Override
    public void x(double x) {
        this.x = x;
    }

    @Override
    public void y(double y) {
        this.y = y;
    }

    @Override
    public void z(double z) {
        this.z = z;
    }

    @Override
    public void w(double w) {
        this.w = w;
    }

}
