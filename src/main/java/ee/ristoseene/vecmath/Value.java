package ee.ristoseene.vecmath;

public final class Value {

    private Value() {}

    public interface Accessible {

        double get();

        default Value.Accessible const$() {
            return this::get;
        }

        default Value.Accessible $() {
            return this;
        }

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

        default Value.Mutable $() {
            return this;
        }

    }

    public interface AccessibleAndMutable extends Accessible, Mutable {

        default Value.AccessibleAndMutable $() {
            return this;
        }

    }

    @FunctionalInterface
    public interface Consumer {

        void set(double v);

    }

    @FunctionalInterface
    public interface Factory<R> {

        R create(double v);

    }

}
