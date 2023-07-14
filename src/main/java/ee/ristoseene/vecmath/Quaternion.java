package ee.ristoseene.vecmath;

public final class Quaternion {

    private Quaternion() {}

    @FunctionalInterface
    public interface Consumer extends Vector4.Consumer {}

    @FunctionalInterface
    public interface Factory<R> extends Vector4.Factory<R> {}

    public interface Accessible extends Vector4.Accessible {}

    public interface Mutable extends Consumer, Vector4.Mutable {}

    public interface AccessibleAndMutable extends Accessible, Mutable, Vector4.AccessibleAndMutable {}

}
