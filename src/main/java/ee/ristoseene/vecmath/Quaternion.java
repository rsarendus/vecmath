package ee.ristoseene.vecmath;

public final class Quaternion {

    private Quaternion() {}

    public interface Accessible extends Vector4.Accessible {

        @Override
        default Quaternion.Accessible const$xyzw() {
            return new Quaternion.Accessible() {
                public double x() { return Accessible.this.x(); }
                public double y() { return Accessible.this.y(); }
                public double z() { return Accessible.this.z(); }
                public double w() { return Accessible.this.w(); }
            };
        }

        @Override
        default Quaternion.Accessible $xyzw() {
            return this;
        }

    }

    public interface Mutable extends Consumer, Vector4.Mutable {

        @Override
        default Quaternion.Mutable $xyzw() {
            return this;
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable, Vector4.AccessibleAndMutable {

        @Override
        default Quaternion.AccessibleAndMutable $xyzw() {
            return this;
        }

    }

    @FunctionalInterface
    public interface Consumer extends Vector4.Consumer {}

    @FunctionalInterface
    public interface Factory<R> extends Vector4.Factory<R> {}

}
