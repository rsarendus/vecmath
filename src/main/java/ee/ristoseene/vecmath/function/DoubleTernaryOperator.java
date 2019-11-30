package ee.ristoseene.vecmath.function;

@FunctionalInterface
public interface DoubleTernaryOperator {

    double applyAsDouble(double left, double middle, double right);

}

