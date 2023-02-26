package ee.ristoseene.vecmath;

public final class Value {

    private Value() {}

    public interface Accessible {

        double get();

        default <R> R get(Value.Factory<R> factory) {
            return factory.create(get());
        }

        default void to(Value.Consumer consumer) {
            consumer.set(get());
        }

    }

    public interface Mutable extends Consumer {

        void set(double v);

        default void set(Value.Accessible v) {
            set(v.get());
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {}

    @FunctionalInterface
    public interface Consumer {

        void set(double v);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double v);

    }

}
