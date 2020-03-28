package ee.ristoseene.vecmath.mutable;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector2;

public class MutableVector2 implements Vector2.AccessibleAndMutable {

    private double x;
    private double y;

    public MutableVector2() {}

    public MutableVector2(double v) {
        this.x = v;
        this.y = v;
    }

    public MutableVector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MutableVector2(Value.Accessible v) {
        this(v.get());
    }

    public MutableVector2(Value.Accessible x, Value.Accessible y) {
        this(x.get(), y.get());
    }

    public MutableVector2(Vector2.Accessible xy) {
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
