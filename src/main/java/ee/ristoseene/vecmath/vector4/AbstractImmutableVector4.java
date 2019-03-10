package ee.ristoseene.vecmath.vector4;

import ee.ristoseene.vecmath.Vector4;

public abstract class AbstractImmutableVector4 implements Vector4.Accessible {

    protected final double x;
    protected final double y;
    protected final double z;
    protected final double w;

    protected AbstractImmutableVector4(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
        this.w = v;
    }

    protected AbstractImmutableVector4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    protected AbstractImmutableVector4(Vector4.Accessible xyzw) {
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

}
