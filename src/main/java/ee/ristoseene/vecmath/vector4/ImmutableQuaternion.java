package ee.ristoseene.vecmath.vector4;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Quaternion;

public class ImmutableQuaternion extends ImmutableVector4 implements Quaternion.Accessible {

    public ImmutableQuaternion(double x, double y, double z, double w) {
        super(x, y, z, w);
    }

    public ImmutableQuaternion(Value.Accessible x, Value.Accessible y, Value.Accessible z, Value.Accessible w) {
        super(x, y, z, w);
    }

    public ImmutableQuaternion(Quaternion.Accessible q) {
        super(q);
    }

}
