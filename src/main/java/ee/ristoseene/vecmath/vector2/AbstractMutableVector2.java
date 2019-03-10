package ee.ristoseene.vecmath.vector2;

import ee.ristoseene.vecmath.Vector2;

public abstract class AbstractMutableVector2 implements Vector2.AccessibleAndMutable {

    protected double x;
    protected double y;

    protected AbstractMutableVector2() {}

    protected AbstractMutableVector2(double v) {
        this.x = v;
        this.y = v;
    }

    protected AbstractMutableVector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    protected AbstractMutableVector2(Vector2.Accessible xy) {
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

    @Override
    public void x(double x) {
        this.x = x;
    }

    @Override
    public void y(double y) {
        this.y = y;
    }

}
