package ee.ristoseene.vecmath.immutable;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector2;
import ee.ristoseene.vecmath.Matrix2x2;

public class ImmutableMatrix2x2 implements Matrix2x2.Accessible {

    private final double Xx;
    private final double Xy;
    private final double Yx;
    private final double Yy;

    public ImmutableMatrix2x2(double v) {
        this.Xx = v;
        this.Xy = v;
        this.Yx = v;
        this.Yy = v;
    }

    public ImmutableMatrix2x2(double Xx, double Yy) {
        this.Xx = Xx;
        this.Xy = 0.0D;
        this.Yx = 0.0D;
        this.Yy = Yy;
    }

    public ImmutableMatrix2x2(
            double Xx, double Xy,
            double Yx, double Yy
    ) {
        this.Xx = Xx;
        this.Xy = Xy;
        this.Yx = Yx;
        this.Yy = Yy;
    }

    public ImmutableMatrix2x2(Value.Accessible v) {
        this(v.get());
    }

    public ImmutableMatrix2x2(Value.Accessible Xx, Value.Accessible Yy) {
        this(Xx.get(), Yy.get());
    }

    public ImmutableMatrix2x2(Vector2.Accessible diagonal) {
        this(diagonal.x(), diagonal.y());
    }

    public ImmutableMatrix2x2(
            Value.Accessible Xx, Value.Accessible Xy,
            Value.Accessible Yx, Value.Accessible Yy
    ) {
        this(
                Xx.get(), Xy.get(),
                Yx.get(), Yy.get()
        );
    }

    public ImmutableMatrix2x2(
            Vector2.Accessible X2,
            Vector2.Accessible Y2
    ) {
        this(
                X2.x(), X2.y(),
                Y2.x(), Y2.y()
        );
    }

    public ImmutableMatrix2x2(Matrix2x2.Accessible m) {
        this(
                m.Xx(), m.Xy(),
                m.Yx(), m.Yy()
        );
    }

    @Override
    public double Xx() {
        return this.Xx;
    }

    @Override
    public double Xy() {
        return this.Xy;
    }

    @Override
    public double Yx() {
        return this.Yx;
    }

    @Override
    public double Yy() {
        return this.Yy;
    }

}
