package ee.ristoseene.vecmath.vector3;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector2;
import ee.ristoseene.vecmath.Vector3;

public class MutableVector3 implements Vector3.AccessibleAndMutable {

    protected double x;
    protected double y;
    protected double z;

    public MutableVector3() {}

    public MutableVector3(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
    }

    public MutableVector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MutableVector3(Value.Accessible v) {
        this(v.get());
    }

    public MutableVector3(Value.Accessible x, Value.Accessible y, Value.Accessible z) {
        this(x.get(), y.get(), z.get());
    }

    public MutableVector3(double x, Vector2.Accessible yz) {
        this(x, yz.x(), yz.y());
    }

    public MutableVector3(Value.Accessible x, Vector2.Accessible yz) {
        this(x.get(), yz.x(), yz.y());
    }

    public MutableVector3(Vector2.Accessible xy, double z) {
        this(xy.x(), xy.y(), z);
    }

    public MutableVector3(Vector2.Accessible xy, Value.Accessible z) {
        this(xy.x(), xy.y(), z.get());
    }

    public MutableVector3(Vector3.Accessible xyz) {
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
