package ee.ristoseene.vecmath.vector3;

import ee.ristoseene.vecmath.Vector3;

public abstract class AbstractMutableVector3 implements Vector3.AccessibleAndMutable {

    protected double x;
    protected double y;
    protected double z;

    protected AbstractMutableVector3() {}

    protected AbstractMutableVector3(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
    }

    protected AbstractMutableVector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected AbstractMutableVector3(Vector3.Accessible xyz) {
        this(xyz.x(), xyz.y(), xyz.z());
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

}
