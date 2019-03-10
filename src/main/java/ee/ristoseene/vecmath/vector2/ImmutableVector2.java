package ee.ristoseene.vecmath.vector2;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector2;

public class ImmutableVector2 implements Vector2.Accessible {

    protected final double x;
    protected final double y;

    public ImmutableVector2(double v) {
        this.x = v;
        this.y = v;
    }

    public ImmutableVector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutableVector2(Value.Accessible v) {
        this(v.get());
    }

    public ImmutableVector2(Value.Accessible x, Value.Accessible y) {
        this(x.get(), y.get());
    }

    public ImmutableVector2(Vector2.Accessible xy) {
        this(xy.x(), xy.y());
    }

    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

}
