package ee.ristoseene.vecmath.vector2;

import ee.ristoseene.vecmath.Vector2;

public abstract class AbstractImmutableVector2 implements Vector2.Accessible {

    protected final double x;
    protected final double y;

    protected AbstractImmutableVector2(double v) {
        this.x = v;
        this.y = v;
    }

    protected AbstractImmutableVector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected AbstractImmutableVector2(Vector2.Accessible xy) {
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
