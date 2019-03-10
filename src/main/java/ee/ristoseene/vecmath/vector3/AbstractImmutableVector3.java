package ee.ristoseene.vecmath.vector3;

import ee.ristoseene.vecmath.Vector3;

public abstract class AbstractImmutableVector3 implements Vector3.Accessible {

    protected final double x;
    protected final double y;
    protected final double z;

    protected AbstractImmutableVector3(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
    }

    protected AbstractImmutableVector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    protected AbstractImmutableVector3(Vector3.Accessible xyz) {
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

}
