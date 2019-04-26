package ee.ristoseene.vecmath.vector4;

import ee.ristoseene.vecmath.Value;
import ee.ristoseene.vecmath.Quaternion;

public class MutableQuaternion extends MutableVector4 implements Quaternion.AccessibleAndMutable {

    public MutableQuaternion() {}

    public MutableQuaternion(double x, double y, double z, double w) {
        super(x, y, z, w);
    }

    public MutableQuaternion(Value.Accessible x, Value.Accessible y, Value.Accessible z, Value.Accessible w) {
        super(x, y, z, w);
    }

    public MutableQuaternion(Quaternion.Accessible q) {
        super(q);
    }

}
