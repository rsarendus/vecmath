package ee.ristoseene.vecmath.vector4;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Vector2;
import ee.ristoseene.vecmath.Vector3;
import ee.ristoseene.vecmath.Vector4;

public class MutableVector4 implements Vector4.AccessibleAndMutable {

    protected double x;
    protected double y;
    protected double z;
    protected double w;

    public MutableVector4() {}

    public MutableVector4(double v) {
        this.x = v;
        this.y = v;
        this.z = v;
        this.w = v;
    }

    public MutableVector4(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public MutableVector4(Value.Accessible v) {
        this(v.get());
    }

    public MutableVector4(Value.Accessible x, Value.Accessible y, Value.Accessible z, Value.Accessible w) {
        this(x.get(), y.get(), z.get(), w.get());
    }

    public MutableVector4(double x, double y, Vector2.Accessible zw) {
        this(x, y, zw.x(), zw.y());
    }

    public MutableVector4(Value.Accessible x, Value.Accessible y, Vector2.Accessible zw) {
        this(x.get(), y.get(), zw.x(), zw.y());
    }

    public MutableVector4(double x, Vector2.Accessible yz, double w) {
        this(x, yz.x(), yz.y(), w);
    }

    public MutableVector4(Value.Accessible x, Vector2.Accessible yz, Value.Accessible w) {
        this(x.get(), yz.x(), yz.y(), w.get());
    }

    public MutableVector4(double x, Vector3.Accessible yzw) {
        this(x, yzw.x(), yzw.y(), yzw.z());
    }

    public MutableVector4(Value.Accessible x, Vector3.Accessible yzw) {
        this(x.get(), yzw.x(), yzw.y(), yzw.z());
    }

    public MutableVector4(Vector2.Accessible xy, double z, double w) {
        this(xy.x(), xy.y(), z, w);
    }

    public MutableVector4(Vector2.Accessible xy, Value.Accessible z, Value.Accessible w) {
        this(xy.x(), xy.y(), z.get(), w.get());
    }

    public MutableVector4(Vector2.Accessible xy, Vector2.Accessible zw) {
        this(xy.x(), xy.y(), zw.x(), zw.y());
    }

    public MutableVector4(Vector3.Accessible xyz, double w) {
        this(xyz.x(), xyz.y(), xyz.z(), w);
    }

    public MutableVector4(Vector3.Accessible xyz, Value.Accessible w) {
        this(xyz.x(), xyz.y(), xyz.z(), w.get());
    }

    public MutableVector4(Vector4.Accessible xyzw) {
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

    @Override
    public void w(double w) {
        this.w = w;
    }

}
