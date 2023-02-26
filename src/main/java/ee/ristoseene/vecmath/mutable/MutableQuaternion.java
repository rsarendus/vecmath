package ee.ristoseene.vecmath.mutable;

import ee.ristoseene.vecmath.Quaternion;

public class MutableQuaternion extends MutableVector4 implements Quaternion.AccessibleAndMutable {

    public MutableQuaternion() {}

    public MutableQuaternion(double x, double y, double z, double w) {
        super(x, y, z, w);
    }

    public MutableQuaternion(Quaternion.Accessible q) {
        super(q);
    }

}
