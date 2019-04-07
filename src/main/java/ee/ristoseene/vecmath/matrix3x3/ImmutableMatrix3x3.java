package ee.ristoseene.vecmath.matrix3x3;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector3;
import ee.ristoseene.vecmath.Matrix3x3;

public class ImmutableMatrix3x3 implements Matrix3x3.Accessible {

    protected final double Xx;
    protected final double Xy;
    protected final double Xz;
    protected final double Yx;
    protected final double Yy;
    protected final double Yz;
    protected final double Zx;
    protected final double Zy;
    protected final double Zz;

    public ImmutableMatrix3x3(double v) {
        this.Xx = v;
        this.Xy = v;
        this.Xz = v;
        this.Yx = v;
        this.Yy = v;
        this.Yz = v;
        this.Zx = v;
        this.Zy = v;
        this.Zz = v;
    }

    public ImmutableMatrix3x3(
            double Xx, double Xy, double Xz,
            double Yx, double Yy, double Yz,
            double Zx, double Zy, double Zz
    ) {
        this.Xx = Xx;
        this.Xy = Xy;
        this.Xz = Xz;
        this.Yx = Yx;
        this.Yy = Yy;
        this.Yz = Yz;
        this.Zx = Zx;
        this.Zy = Zy;
        this.Zz = Zz;
    }

    public ImmutableMatrix3x3(Value.Accessible v) {
        this(v.get());
    }

    public ImmutableMatrix3x3(
            Value.Accessible Xx, Value.Accessible Xy, Value.Accessible Xz,
            Value.Accessible Yx, Value.Accessible Yy, Value.Accessible Yz,
            Value.Accessible Zx, Value.Accessible Zy, Value.Accessible Zz
    ) {
        this(
                Xx.get(), Xy.get(), Xz.get(),
                Yx.get(), Yy.get(), Yz.get(),
                Zx.get(), Zy.get(), Zz.get()
        );
    }

    public ImmutableMatrix3x3(
            Vector3.Accessible X3,
            Vector3.Accessible Y3,
            Vector3.Accessible Z3
    ) {
        this(
                X3.x(), X3.y(), X3.z(),
                Y3.x(), Y3.y(), Y3.z(),
                Z3.x(), Z3.y(), Z3.z()
        );
    }

    public ImmutableMatrix3x3(Matrix3x3.Accessible m) {
        this(
                m.Xx(), m.Xy(), m.Xz(),
                m.Yx(), m.Yy(), m.Yz(),
                m.Zx(), m.Zy(), m.Zz()
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
    public double Xz() {
        return this.Xz;
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
    public double Yz() {
        return this.Yz;
    }

    @Override
    public double Zx() {
        return this.Zx;
    }

    @Override
    public double Zy() {
        return this.Zy;
    }

    @Override
    public double Zz() {
        return this.Zz;
    }

}
