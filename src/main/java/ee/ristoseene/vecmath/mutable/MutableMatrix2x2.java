package ee.ristoseene.vecmath.mutable;

import ee.ristoseene.vecmath.Vector2;
import ee.ristoseene.vecmath.Matrix2x2;

public class MutableMatrix2x2 implements Matrix2x2.AccessibleAndMutable {

    private double Xx;
    private double Xy;
    private double Yx;
    private double Yy;

    public MutableMatrix2x2() {}

    public MutableMatrix2x2(double v) {
        this.Xx = v;
        this.Xy = v;
        this.Yx = v;
        this.Yy = v;
    }

    public MutableMatrix2x2(double Xx, double Yy) {
        this.Xx = Xx;
        this.Xy = 0.0D;
        this.Yx = 0.0D;
        this.Yy = Yy;
    }

    public MutableMatrix2x2(
            double Xx, double Xy,
            double Yx, double Yy
    ) {
        this.Xx = Xx;
        this.Xy = Xy;
        this.Yx = Yx;
        this.Yy = Yy;
    }

    public MutableMatrix2x2(Vector2.Accessible diagonal) {
        this(diagonal.x(), diagonal.y());
    }

    public MutableMatrix2x2(
            Vector2.Accessible X2,
            Vector2.Accessible Y2
    ) {
        this(
                X2.x(), X2.y(),
                Y2.x(), Y2.y()
        );
    }

    public MutableMatrix2x2(Matrix2x2.Accessible m) {
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

    @Override
    public void Xx(double Xx) {
        this.Xx = Xx;
    }

    @Override
    public void Xy(double Xy) {
        this.Xy = Xy;
    }

    @Override
    public void Yx(double Yx) {
        this.Yx = Yx;
    }

    @Override
    public void Yy(double Yy) {
        this.Yy = Yy;
    }

}
