package ee.ristoseene.vecmath.immutable;

import ee.ristoseene.vecmath.Quaternion;

public class ImmutableQuaternion extends ImmutableVector4 implements Quaternion.Accessible {

    public ImmutableQuaternion(double x, double y, double z, double w) {
        super(x, y, z, w);
    }

    public ImmutableQuaternion(Quaternion.Accessible q) {
        super(q);
    }

}
