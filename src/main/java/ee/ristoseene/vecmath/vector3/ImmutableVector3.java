package ee.ristoseene.vecmath.vector3;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector2;
import ee.ristoseene.vecmath.Vector3;

public class ImmutableVector3 implements Vector3.Accessible {

    private final double x;
    private final double y;
    private final double z;

    public ImmutableVector3(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
    }

    public ImmutableVector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public ImmutableVector3(Value.Accessible v) {
        this(v.get());
    }

    public ImmutableVector3(Value.Accessible x, Value.Accessible y, Value.Accessible z) {
        this(x.get(), y.get(), z.get());
    }

    public ImmutableVector3(double x, Vector2.Accessible yz) {
        this(x, yz.x(), yz.y());
    }

    public ImmutableVector3(Value.Accessible x, Vector2.Accessible yz) {
        this(x.get(), yz.x(), yz.y());
    }

    public ImmutableVector3(Vector2.Accessible xy, double z) {
        this(xy.x(), xy.y(), z);
    }

    public ImmutableVector3(Vector2.Accessible xy, Value.Accessible z) {
        this(xy.x(), xy.y(), z.get());
    }

    public ImmutableVector3(Vector3.Accessible xyz) {
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
