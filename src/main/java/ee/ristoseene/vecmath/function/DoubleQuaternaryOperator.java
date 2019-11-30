package ee.ristoseene.vecmath.function;

@FunctionalInterface
public interface DoubleQuaternaryOperator {

    double applyAsDouble(
            double first,
            double second,
            double third,
            double fourth
    );

}

