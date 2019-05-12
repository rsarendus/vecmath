package ee.ristoseene.vecmath;

import java.util.function.DoubleUnaryOperator;
import java.util.function.DoubleBinaryOperator;

public final class VecOps {

    private VecOps() {}

    @FunctionalInterface
    public interface DoubleTernaryOperator {

        double applyAsDouble(double left, double middle, double right);

    }

    @FunctionalInterface
    public interface DoubleQuaternaryOperator {

        double applyAsDouble(double first, double second, double third, double fourth);

    }

    public static <R> R apply(DoubleUnaryOperator operator, Vector2.Accessible operand, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(operand.x()),
                operator.applyAsDouble(operand.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleUnaryOperator operator, Vector2.Accessible operand) {
        resultConsumer.xy(
                operator.applyAsDouble(operand.x()),
                operator.applyAsDouble(operand.y())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Vector2.Accessible left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), right.x()),
                operator.applyAsDouble(left.y(), right.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleBinaryOperator operator, Vector2.Accessible left, Vector2.Accessible right) {
        resultConsumer.xy(
                operator.applyAsDouble(left.x(), right.x()),
                operator.applyAsDouble(left.y(), right.y())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Vector2.Accessible left, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), right),
                operator.applyAsDouble(left.y(), right)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleBinaryOperator operator, Vector2.Accessible left, double right) {
        resultConsumer.xy(
                operator.applyAsDouble(left.x(), right),
                operator.applyAsDouble(left.y(), right)
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, double left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, right.x()),
                operator.applyAsDouble(left, right.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleBinaryOperator operator, double left, Vector2.Accessible right) {
        resultConsumer.xy(
                operator.applyAsDouble(left, right.x()),
                operator.applyAsDouble(left, right.y())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector2.Accessible left, Vector2.Accessible middle, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle.x(), right.x()),
                operator.applyAsDouble(left.y(), middle.y(), right.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, Vector2.Accessible left, Vector2.Accessible middle, Vector2.Accessible right) {
        resultConsumer.xy(
                operator.applyAsDouble(left.x(), middle.x(), right.x()),
                operator.applyAsDouble(left.y(), middle.y(), right.y())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector2.Accessible left, Vector2.Accessible middle, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle.x(), right),
                operator.applyAsDouble(left.y(), middle.y(), right)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, Vector2.Accessible left, Vector2.Accessible middle, double right) {
        resultConsumer.xy(
                operator.applyAsDouble(left.x(), middle.x(), right),
                operator.applyAsDouble(left.y(), middle.y(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector2.Accessible left, double middle, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle, right.x()),
                operator.applyAsDouble(left.y(), middle, right.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, Vector2.Accessible left, double middle, Vector2.Accessible right) {
        resultConsumer.xy(
                operator.applyAsDouble(left.x(), middle, right.x()),
                operator.applyAsDouble(left.y(), middle, right.y())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector2.Accessible left, double middle, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle, right),
                operator.applyAsDouble(left.y(), middle, right)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, Vector2.Accessible left, double middle, double right) {
        resultConsumer.xy(
                operator.applyAsDouble(left.x(), middle, right),
                operator.applyAsDouble(left.y(), middle, right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Vector2.Accessible middle, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.x(), right.x()),
                operator.applyAsDouble(left, middle.y(), right.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Vector2.Accessible middle, Vector2.Accessible right) {
        resultConsumer.xy(
                operator.applyAsDouble(left, middle.x(), right.x()),
                operator.applyAsDouble(left, middle.y(), right.y())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Vector2.Accessible middle, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.x(), right),
                operator.applyAsDouble(left, middle.y(), right)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Vector2.Accessible middle, double right) {
        resultConsumer.xy(
                operator.applyAsDouble(left, middle.x(), right),
                operator.applyAsDouble(left, middle.y(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, double middle, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle, right.x()),
                operator.applyAsDouble(left, middle, right.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleTernaryOperator operator, double left, double middle, Vector2.Accessible right) {
        resultConsumer.xy(
                operator.applyAsDouble(left, middle, right.x()),
                operator.applyAsDouble(left, middle, right.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, Vector2.Accessible third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, Vector2.Accessible third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, Vector2.Accessible third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, Vector2.Accessible third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, double third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third, fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third, fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, double third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second.x(), third, fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third, fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, double third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third, fourth),
                operator.applyAsDouble(first.y(), second.y(), third, fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, Vector2.Accessible second, double third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second.x(), third, fourth),
                operator.applyAsDouble(first.y(), second.y(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, Vector2.Accessible third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second, third.y(), fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, Vector2.Accessible third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second, third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second, third.y(), fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, Vector2.Accessible third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third.x(), fourth),
                operator.applyAsDouble(first.y(), second, third.y(), fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, Vector2.Accessible third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second, third.x(), fourth),
                operator.applyAsDouble(first.y(), second, third.y(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, double third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third, fourth.x()),
                operator.applyAsDouble(first.y(), second, third, fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, double third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second, third, fourth.x()),
                operator.applyAsDouble(first.y(), second, third, fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, double third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third, fourth),
                operator.applyAsDouble(first.y(), second, third, fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector2.Accessible first, double second, double third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first.x(), second, third, fourth),
                operator.applyAsDouble(first.y(), second, third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, Vector2.Accessible third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first, second.y(), third.y(), fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, Vector2.Accessible third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first, second.y(), third.y(), fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, Vector2.Accessible third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third.x(), fourth),
                operator.applyAsDouble(first, second.y(), third.y(), fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, Vector2.Accessible third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second.x(), third.x(), fourth),
                operator.applyAsDouble(first, second.y(), third.y(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, double third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third, fourth.x()),
                operator.applyAsDouble(first, second.y(), third, fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, double third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second.x(), third, fourth.x()),
                operator.applyAsDouble(first, second.y(), third, fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, double third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third, fourth),
                operator.applyAsDouble(first, second.y(), third, fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector2.Accessible second, double third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second.x(), third, fourth),
                operator.applyAsDouble(first, second.y(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Vector2.Accessible third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.x(), fourth.x()),
                operator.applyAsDouble(first, second, third.y(), fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Vector2.Accessible third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second, third.x(), fourth.x()),
                operator.applyAsDouble(first, second, third.y(), fourth.y())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Vector2.Accessible third, double fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.x(), fourth),
                operator.applyAsDouble(first, second, third.y(), fourth)
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Vector2.Accessible third, double fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second, third.x(), fourth),
                operator.applyAsDouble(first, second, third.y(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, double third, Vector2.Accessible fourth, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third, fourth.x()),
                operator.applyAsDouble(first, second, third, fourth.y())
        );
    }

    public static void apply(Vector2.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, double third, Vector2.Accessible fourth) {
        resultConsumer.xy(
                operator.applyAsDouble(first, second, third, fourth.x()),
                operator.applyAsDouble(first, second, third, fourth.y())
        );
    }

    public static <R> R apply(DoubleUnaryOperator operator, Vector3.Accessible operand, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(operand.x()),
                operator.applyAsDouble(operand.y()),
                operator.applyAsDouble(operand.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleUnaryOperator operator, Vector3.Accessible operand) {
        resultConsumer.xyz(
                operator.applyAsDouble(operand.x()),
                operator.applyAsDouble(operand.y()),
                operator.applyAsDouble(operand.z())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Vector3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), right.x()),
                operator.applyAsDouble(left.y(), right.y()),
                operator.applyAsDouble(left.z(), right.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleBinaryOperator operator, Vector3.Accessible left, Vector3.Accessible right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left.x(), right.x()),
                operator.applyAsDouble(left.y(), right.y()),
                operator.applyAsDouble(left.z(), right.z())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Vector3.Accessible left, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), right),
                operator.applyAsDouble(left.y(), right),
                operator.applyAsDouble(left.z(), right)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleBinaryOperator operator, Vector3.Accessible left, double right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left.x(), right),
                operator.applyAsDouble(left.y(), right),
                operator.applyAsDouble(left.z(), right)
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, double left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, right.x()),
                operator.applyAsDouble(left, right.y()),
                operator.applyAsDouble(left, right.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleBinaryOperator operator, double left, Vector3.Accessible right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left, right.x()),
                operator.applyAsDouble(left, right.y()),
                operator.applyAsDouble(left, right.z())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector3.Accessible left, Vector3.Accessible middle, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle.x(), right.x()),
                operator.applyAsDouble(left.y(), middle.y(), right.y()),
                operator.applyAsDouble(left.z(), middle.z(), right.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, Vector3.Accessible left, Vector3.Accessible middle, Vector3.Accessible right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left.x(), middle.x(), right.x()),
                operator.applyAsDouble(left.y(), middle.y(), right.y()),
                operator.applyAsDouble(left.z(), middle.z(), right.z())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector3.Accessible left, Vector3.Accessible middle, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle.x(), right),
                operator.applyAsDouble(left.y(), middle.y(), right),
                operator.applyAsDouble(left.z(), middle.z(), right)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, Vector3.Accessible left, Vector3.Accessible middle, double right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left.x(), middle.x(), right),
                operator.applyAsDouble(left.y(), middle.y(), right),
                operator.applyAsDouble(left.z(), middle.z(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector3.Accessible left, double middle, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle, right.x()),
                operator.applyAsDouble(left.y(), middle, right.y()),
                operator.applyAsDouble(left.z(), middle, right.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, Vector3.Accessible left, double middle, Vector3.Accessible right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left.x(), middle, right.x()),
                operator.applyAsDouble(left.y(), middle, right.y()),
                operator.applyAsDouble(left.z(), middle, right.z())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector3.Accessible left, double middle, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle, right),
                operator.applyAsDouble(left.y(), middle, right),
                operator.applyAsDouble(left.z(), middle, right)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, Vector3.Accessible left, double middle, double right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left.x(), middle, right),
                operator.applyAsDouble(left.y(), middle, right),
                operator.applyAsDouble(left.z(), middle, right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Vector3.Accessible middle, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.x(), right.x()),
                operator.applyAsDouble(left, middle.y(), right.y()),
                operator.applyAsDouble(left, middle.z(), right.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Vector3.Accessible middle, Vector3.Accessible right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left, middle.x(), right.x()),
                operator.applyAsDouble(left, middle.y(), right.y()),
                operator.applyAsDouble(left, middle.z(), right.z())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Vector3.Accessible middle, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.x(), right),
                operator.applyAsDouble(left, middle.y(), right),
                operator.applyAsDouble(left, middle.z(), right)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Vector3.Accessible middle, double right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left, middle.x(), right),
                operator.applyAsDouble(left, middle.y(), right),
                operator.applyAsDouble(left, middle.z(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, double middle, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle, right.x()),
                operator.applyAsDouble(left, middle, right.y()),
                operator.applyAsDouble(left, middle, right.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleTernaryOperator operator, double left, double middle, Vector3.Accessible right) {
        resultConsumer.xyz(
                operator.applyAsDouble(left, middle, right.x()),
                operator.applyAsDouble(left, middle, right.y()),
                operator.applyAsDouble(left, middle, right.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, Vector3.Accessible third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, Vector3.Accessible third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, Vector3.Accessible third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, Vector3.Accessible third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, double third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third, fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third, fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third, fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, double third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second.x(), third, fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third, fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third, fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, double third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third, fourth),
                operator.applyAsDouble(first.y(), second.y(), third, fourth),
                operator.applyAsDouble(first.z(), second.z(), third, fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, Vector3.Accessible second, double third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second.x(), third, fourth),
                operator.applyAsDouble(first.y(), second.y(), third, fourth),
                operator.applyAsDouble(first.z(), second.z(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, Vector3.Accessible third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second, third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second, third.z(), fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, Vector3.Accessible third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second, third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second, third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second, third.z(), fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, Vector3.Accessible third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third.x(), fourth),
                operator.applyAsDouble(first.y(), second, third.y(), fourth),
                operator.applyAsDouble(first.z(), second, third.z(), fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, Vector3.Accessible third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second, third.x(), fourth),
                operator.applyAsDouble(first.y(), second, third.y(), fourth),
                operator.applyAsDouble(first.z(), second, third.z(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, double third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third, fourth.x()),
                operator.applyAsDouble(first.y(), second, third, fourth.y()),
                operator.applyAsDouble(first.z(), second, third, fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, double third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second, third, fourth.x()),
                operator.applyAsDouble(first.y(), second, third, fourth.y()),
                operator.applyAsDouble(first.z(), second, third, fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, double third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third, fourth),
                operator.applyAsDouble(first.y(), second, third, fourth),
                operator.applyAsDouble(first.z(), second, third, fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector3.Accessible first, double second, double third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first.x(), second, third, fourth),
                operator.applyAsDouble(first.y(), second, third, fourth),
                operator.applyAsDouble(first.z(), second, third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, Vector3.Accessible third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first, second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first, second.z(), third.z(), fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, Vector3.Accessible third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first, second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first, second.z(), third.z(), fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, Vector3.Accessible third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third.x(), fourth),
                operator.applyAsDouble(first, second.y(), third.y(), fourth),
                operator.applyAsDouble(first, second.z(), third.z(), fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, Vector3.Accessible third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second.x(), third.x(), fourth),
                operator.applyAsDouble(first, second.y(), third.y(), fourth),
                operator.applyAsDouble(first, second.z(), third.z(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, double third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third, fourth.x()),
                operator.applyAsDouble(first, second.y(), third, fourth.y()),
                operator.applyAsDouble(first, second.z(), third, fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, double third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second.x(), third, fourth.x()),
                operator.applyAsDouble(first, second.y(), third, fourth.y()),
                operator.applyAsDouble(first, second.z(), third, fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, double third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third, fourth),
                operator.applyAsDouble(first, second.y(), third, fourth),
                operator.applyAsDouble(first, second.z(), third, fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector3.Accessible second, double third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second.x(), third, fourth),
                operator.applyAsDouble(first, second.y(), third, fourth),
                operator.applyAsDouble(first, second.z(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Vector3.Accessible third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.x(), fourth.x()),
                operator.applyAsDouble(first, second, third.y(), fourth.y()),
                operator.applyAsDouble(first, second, third.z(), fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Vector3.Accessible third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second, third.x(), fourth.x()),
                operator.applyAsDouble(first, second, third.y(), fourth.y()),
                operator.applyAsDouble(first, second, third.z(), fourth.z())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Vector3.Accessible third, double fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.x(), fourth),
                operator.applyAsDouble(first, second, third.y(), fourth),
                operator.applyAsDouble(first, second, third.z(), fourth)
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Vector3.Accessible third, double fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second, third.x(), fourth),
                operator.applyAsDouble(first, second, third.y(), fourth),
                operator.applyAsDouble(first, second, third.z(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, double third, Vector3.Accessible fourth, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third, fourth.x()),
                operator.applyAsDouble(first, second, third, fourth.y()),
                operator.applyAsDouble(first, second, third, fourth.z())
        );
    }

    public static void apply(Vector3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, double third, Vector3.Accessible fourth) {
        resultConsumer.xyz(
                operator.applyAsDouble(first, second, third, fourth.x()),
                operator.applyAsDouble(first, second, third, fourth.y()),
                operator.applyAsDouble(first, second, third, fourth.z())
        );
    }

    public static <R> R apply(DoubleUnaryOperator operator, Vector4.Accessible operand, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(operand.x()),
                operator.applyAsDouble(operand.y()),
                operator.applyAsDouble(operand.z()),
                operator.applyAsDouble(operand.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleUnaryOperator operator, Vector4.Accessible operand) {
        resultConsumer.xyzw(
                operator.applyAsDouble(operand.x()),
                operator.applyAsDouble(operand.y()),
                operator.applyAsDouble(operand.z()),
                operator.applyAsDouble(operand.w())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Vector4.Accessible left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), right.x()),
                operator.applyAsDouble(left.y(), right.y()),
                operator.applyAsDouble(left.z(), right.z()),
                operator.applyAsDouble(left.w(), right.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleBinaryOperator operator, Vector4.Accessible left, Vector4.Accessible right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left.x(), right.x()),
                operator.applyAsDouble(left.y(), right.y()),
                operator.applyAsDouble(left.z(), right.z()),
                operator.applyAsDouble(left.w(), right.w())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Vector4.Accessible left, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), right),
                operator.applyAsDouble(left.y(), right),
                operator.applyAsDouble(left.z(), right),
                operator.applyAsDouble(left.w(), right)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleBinaryOperator operator, Vector4.Accessible left, double right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left.x(), right),
                operator.applyAsDouble(left.y(), right),
                operator.applyAsDouble(left.z(), right),
                operator.applyAsDouble(left.w(), right)
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, double left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, right.x()),
                operator.applyAsDouble(left, right.y()),
                operator.applyAsDouble(left, right.z()),
                operator.applyAsDouble(left, right.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleBinaryOperator operator, double left, Vector4.Accessible right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left, right.x()),
                operator.applyAsDouble(left, right.y()),
                operator.applyAsDouble(left, right.z()),
                operator.applyAsDouble(left, right.w())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector4.Accessible left, Vector4.Accessible middle, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle.x(), right.x()),
                operator.applyAsDouble(left.y(), middle.y(), right.y()),
                operator.applyAsDouble(left.z(), middle.z(), right.z()),
                operator.applyAsDouble(left.w(), middle.w(), right.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, Vector4.Accessible left, Vector4.Accessible middle, Vector4.Accessible right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left.x(), middle.x(), right.x()),
                operator.applyAsDouble(left.y(), middle.y(), right.y()),
                operator.applyAsDouble(left.z(), middle.z(), right.z()),
                operator.applyAsDouble(left.w(), middle.w(), right.w())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector4.Accessible left, Vector4.Accessible middle, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle.x(), right),
                operator.applyAsDouble(left.y(), middle.y(), right),
                operator.applyAsDouble(left.z(), middle.z(), right),
                operator.applyAsDouble(left.w(), middle.w(), right)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, Vector4.Accessible left, Vector4.Accessible middle, double right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left.x(), middle.x(), right),
                operator.applyAsDouble(left.y(), middle.y(), right),
                operator.applyAsDouble(left.z(), middle.z(), right),
                operator.applyAsDouble(left.w(), middle.w(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector4.Accessible left, double middle, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle, right.x()),
                operator.applyAsDouble(left.y(), middle, right.y()),
                operator.applyAsDouble(left.z(), middle, right.z()),
                operator.applyAsDouble(left.w(), middle, right.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, Vector4.Accessible left, double middle, Vector4.Accessible right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left.x(), middle, right.x()),
                operator.applyAsDouble(left.y(), middle, right.y()),
                operator.applyAsDouble(left.z(), middle, right.z()),
                operator.applyAsDouble(left.w(), middle, right.w())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Vector4.Accessible left, double middle, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.x(), middle, right),
                operator.applyAsDouble(left.y(), middle, right),
                operator.applyAsDouble(left.z(), middle, right),
                operator.applyAsDouble(left.w(), middle, right)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, Vector4.Accessible left, double middle, double right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left.x(), middle, right),
                operator.applyAsDouble(left.y(), middle, right),
                operator.applyAsDouble(left.z(), middle, right),
                operator.applyAsDouble(left.w(), middle, right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Vector4.Accessible middle, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.x(), right.x()),
                operator.applyAsDouble(left, middle.y(), right.y()),
                operator.applyAsDouble(left, middle.z(), right.z()),
                operator.applyAsDouble(left, middle.w(), right.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Vector4.Accessible middle, Vector4.Accessible right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left, middle.x(), right.x()),
                operator.applyAsDouble(left, middle.y(), right.y()),
                operator.applyAsDouble(left, middle.z(), right.z()),
                operator.applyAsDouble(left, middle.w(), right.w())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Vector4.Accessible middle, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.x(), right),
                operator.applyAsDouble(left, middle.y(), right),
                operator.applyAsDouble(left, middle.z(), right),
                operator.applyAsDouble(left, middle.w(), right)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Vector4.Accessible middle, double right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left, middle.x(), right),
                operator.applyAsDouble(left, middle.y(), right),
                operator.applyAsDouble(left, middle.z(), right),
                operator.applyAsDouble(left, middle.w(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, double middle, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle, right.x()),
                operator.applyAsDouble(left, middle, right.y()),
                operator.applyAsDouble(left, middle, right.z()),
                operator.applyAsDouble(left, middle, right.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleTernaryOperator operator, double left, double middle, Vector4.Accessible right) {
        resultConsumer.xyzw(
                operator.applyAsDouble(left, middle, right.x()),
                operator.applyAsDouble(left, middle, right.y()),
                operator.applyAsDouble(left, middle, right.z()),
                operator.applyAsDouble(left, middle, right.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, Vector4.Accessible third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth.z()),
                operator.applyAsDouble(first.w(), second.w(), third.w(), fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, Vector4.Accessible third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth.z()),
                operator.applyAsDouble(first.w(), second.w(), third.w(), fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, Vector4.Accessible third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth),
                operator.applyAsDouble(first.w(), second.w(), third.w(), fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, Vector4.Accessible third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second.x(), third.x(), fourth),
                operator.applyAsDouble(first.y(), second.y(), third.y(), fourth),
                operator.applyAsDouble(first.z(), second.z(), third.z(), fourth),
                operator.applyAsDouble(first.w(), second.w(), third.w(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, double third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third, fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third, fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third, fourth.z()),
                operator.applyAsDouble(first.w(), second.w(), third, fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, double third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second.x(), third, fourth.x()),
                operator.applyAsDouble(first.y(), second.y(), third, fourth.y()),
                operator.applyAsDouble(first.z(), second.z(), third, fourth.z()),
                operator.applyAsDouble(first.w(), second.w(), third, fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, double third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second.x(), third, fourth),
                operator.applyAsDouble(first.y(), second.y(), third, fourth),
                operator.applyAsDouble(first.z(), second.z(), third, fourth),
                operator.applyAsDouble(first.w(), second.w(), third, fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, Vector4.Accessible second, double third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second.x(), third, fourth),
                operator.applyAsDouble(first.y(), second.y(), third, fourth),
                operator.applyAsDouble(first.z(), second.z(), third, fourth),
                operator.applyAsDouble(first.w(), second.w(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, Vector4.Accessible third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second, third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second, third.z(), fourth.z()),
                operator.applyAsDouble(first.w(), second, third.w(), fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, Vector4.Accessible third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second, third.x(), fourth.x()),
                operator.applyAsDouble(first.y(), second, third.y(), fourth.y()),
                operator.applyAsDouble(first.z(), second, third.z(), fourth.z()),
                operator.applyAsDouble(first.w(), second, third.w(), fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, Vector4.Accessible third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third.x(), fourth),
                operator.applyAsDouble(first.y(), second, third.y(), fourth),
                operator.applyAsDouble(first.z(), second, third.z(), fourth),
                operator.applyAsDouble(first.w(), second, third.w(), fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, Vector4.Accessible third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second, third.x(), fourth),
                operator.applyAsDouble(first.y(), second, third.y(), fourth),
                operator.applyAsDouble(first.z(), second, third.z(), fourth),
                operator.applyAsDouble(first.w(), second, third.w(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, double third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third, fourth.x()),
                operator.applyAsDouble(first.y(), second, third, fourth.y()),
                operator.applyAsDouble(first.z(), second, third, fourth.z()),
                operator.applyAsDouble(first.w(), second, third, fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, double third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second, third, fourth.x()),
                operator.applyAsDouble(first.y(), second, third, fourth.y()),
                operator.applyAsDouble(first.z(), second, third, fourth.z()),
                operator.applyAsDouble(first.w(), second, third, fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, double third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.x(), second, third, fourth),
                operator.applyAsDouble(first.y(), second, third, fourth),
                operator.applyAsDouble(first.z(), second, third, fourth),
                operator.applyAsDouble(first.w(), second, third, fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Vector4.Accessible first, double second, double third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first.x(), second, third, fourth),
                operator.applyAsDouble(first.y(), second, third, fourth),
                operator.applyAsDouble(first.z(), second, third, fourth),
                operator.applyAsDouble(first.w(), second, third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, Vector4.Accessible third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first, second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first, second.z(), third.z(), fourth.z()),
                operator.applyAsDouble(first, second.w(), third.w(), fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, Vector4.Accessible third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second.x(), third.x(), fourth.x()),
                operator.applyAsDouble(first, second.y(), third.y(), fourth.y()),
                operator.applyAsDouble(first, second.z(), third.z(), fourth.z()),
                operator.applyAsDouble(first, second.w(), third.w(), fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, Vector4.Accessible third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third.x(), fourth),
                operator.applyAsDouble(first, second.y(), third.y(), fourth),
                operator.applyAsDouble(first, second.z(), third.z(), fourth),
                operator.applyAsDouble(first, second.w(), third.w(), fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, Vector4.Accessible third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second.x(), third.x(), fourth),
                operator.applyAsDouble(first, second.y(), third.y(), fourth),
                operator.applyAsDouble(first, second.z(), third.z(), fourth),
                operator.applyAsDouble(first, second.w(), third.w(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, double third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third, fourth.x()),
                operator.applyAsDouble(first, second.y(), third, fourth.y()),
                operator.applyAsDouble(first, second.z(), third, fourth.z()),
                operator.applyAsDouble(first, second.w(), third, fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, double third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second.x(), third, fourth.x()),
                operator.applyAsDouble(first, second.y(), third, fourth.y()),
                operator.applyAsDouble(first, second.z(), third, fourth.z()),
                operator.applyAsDouble(first, second.w(), third, fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, double third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.x(), third, fourth),
                operator.applyAsDouble(first, second.y(), third, fourth),
                operator.applyAsDouble(first, second.z(), third, fourth),
                operator.applyAsDouble(first, second.w(), third, fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Vector4.Accessible second, double third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second.x(), third, fourth),
                operator.applyAsDouble(first, second.y(), third, fourth),
                operator.applyAsDouble(first, second.z(), third, fourth),
                operator.applyAsDouble(first, second.w(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Vector4.Accessible third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.x(), fourth.x()),
                operator.applyAsDouble(first, second, third.y(), fourth.y()),
                operator.applyAsDouble(first, second, third.z(), fourth.z()),
                operator.applyAsDouble(first, second, third.w(), fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Vector4.Accessible third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second, third.x(), fourth.x()),
                operator.applyAsDouble(first, second, third.y(), fourth.y()),
                operator.applyAsDouble(first, second, third.z(), fourth.z()),
                operator.applyAsDouble(first, second, third.w(), fourth.w())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Vector4.Accessible third, double fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.x(), fourth),
                operator.applyAsDouble(first, second, third.y(), fourth),
                operator.applyAsDouble(first, second, third.z(), fourth),
                operator.applyAsDouble(first, second, third.w(), fourth)
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Vector4.Accessible third, double fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second, third.x(), fourth),
                operator.applyAsDouble(first, second, third.y(), fourth),
                operator.applyAsDouble(first, second, third.z(), fourth),
                operator.applyAsDouble(first, second, third.w(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, double third, Vector4.Accessible fourth, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third, fourth.x()),
                operator.applyAsDouble(first, second, third, fourth.y()),
                operator.applyAsDouble(first, second, third, fourth.z()),
                operator.applyAsDouble(first, second, third, fourth.w())
        );
    }

    public static void apply(Vector4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, double third, Vector4.Accessible fourth) {
        resultConsumer.xyzw(
                operator.applyAsDouble(first, second, third, fourth.x()),
                operator.applyAsDouble(first, second, third, fourth.y()),
                operator.applyAsDouble(first, second, third, fourth.z()),
                operator.applyAsDouble(first, second, third, fourth.w())
        );
    }

    public static <R> R apply(DoubleUnaryOperator operator, Matrix3x3.Accessible operand, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(operand.Xx()),
                operator.applyAsDouble(operand.Xy()),
                operator.applyAsDouble(operand.Xz()),
                operator.applyAsDouble(operand.Yx()),
                operator.applyAsDouble(operand.Yy()),
                operator.applyAsDouble(operand.Yz()),
                operator.applyAsDouble(operand.Zx()),
                operator.applyAsDouble(operand.Zy()),
                operator.applyAsDouble(operand.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleUnaryOperator operator, Matrix3x3.Accessible operand) {
        resultConsumer.set3x3(
                operator.applyAsDouble(operand.Xx()),
                operator.applyAsDouble(operand.Xy()),
                operator.applyAsDouble(operand.Xz()),
                operator.applyAsDouble(operand.Yx()),
                operator.applyAsDouble(operand.Yy()),
                operator.applyAsDouble(operand.Yz()),
                operator.applyAsDouble(operand.Zx()),
                operator.applyAsDouble(operand.Zy()),
                operator.applyAsDouble(operand.Zz())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Matrix3x3.Accessible left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), right.Xz()),
                operator.applyAsDouble(left.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), right.Yz()),
                operator.applyAsDouble(left.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), right.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleBinaryOperator operator, Matrix3x3.Accessible left, Matrix3x3.Accessible right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), right.Xz()),
                operator.applyAsDouble(left.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), right.Yz()),
                operator.applyAsDouble(left.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), right.Zz())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Matrix3x3.Accessible left, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), right),
                operator.applyAsDouble(left.Xy(), right),
                operator.applyAsDouble(left.Xz(), right),
                operator.applyAsDouble(left.Yx(), right),
                operator.applyAsDouble(left.Yy(), right),
                operator.applyAsDouble(left.Yz(), right),
                operator.applyAsDouble(left.Zx(), right),
                operator.applyAsDouble(left.Zy(), right),
                operator.applyAsDouble(left.Zz(), right)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleBinaryOperator operator, Matrix3x3.Accessible left, double right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left.Xx(), right),
                operator.applyAsDouble(left.Xy(), right),
                operator.applyAsDouble(left.Xz(), right),
                operator.applyAsDouble(left.Yx(), right),
                operator.applyAsDouble(left.Yy(), right),
                operator.applyAsDouble(left.Yz(), right),
                operator.applyAsDouble(left.Zx(), right),
                operator.applyAsDouble(left.Zy(), right),
                operator.applyAsDouble(left.Zz(), right)
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, double left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, right.Xx()),
                operator.applyAsDouble(left, right.Xy()),
                operator.applyAsDouble(left, right.Xz()),
                operator.applyAsDouble(left, right.Yx()),
                operator.applyAsDouble(left, right.Yy()),
                operator.applyAsDouble(left, right.Yz()),
                operator.applyAsDouble(left, right.Zx()),
                operator.applyAsDouble(left, right.Zy()),
                operator.applyAsDouble(left, right.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleBinaryOperator operator, double left, Matrix3x3.Accessible right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left, right.Xx()),
                operator.applyAsDouble(left, right.Xy()),
                operator.applyAsDouble(left, right.Xz()),
                operator.applyAsDouble(left, right.Yx()),
                operator.applyAsDouble(left, right.Yy()),
                operator.applyAsDouble(left, right.Yz()),
                operator.applyAsDouble(left, right.Zx()),
                operator.applyAsDouble(left, right.Zy()),
                operator.applyAsDouble(left, right.Zz())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix3x3.Accessible left, Matrix3x3.Accessible middle, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right.Xz()),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right.Yz()),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix3x3.Accessible left, Matrix3x3.Accessible middle, Matrix3x3.Accessible right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right.Xz()),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right.Yz()),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right.Zz())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix3x3.Accessible left, Matrix3x3.Accessible middle, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix3x3.Accessible left, Matrix3x3.Accessible middle, double right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix3x3.Accessible left, double middle, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle, right.Xx()),
                operator.applyAsDouble(left.Xy(), middle, right.Xy()),
                operator.applyAsDouble(left.Xz(), middle, right.Xz()),
                operator.applyAsDouble(left.Yx(), middle, right.Yx()),
                operator.applyAsDouble(left.Yy(), middle, right.Yy()),
                operator.applyAsDouble(left.Yz(), middle, right.Yz()),
                operator.applyAsDouble(left.Zx(), middle, right.Zx()),
                operator.applyAsDouble(left.Zy(), middle, right.Zy()),
                operator.applyAsDouble(left.Zz(), middle, right.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix3x3.Accessible left, double middle, Matrix3x3.Accessible right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left.Xx(), middle, right.Xx()),
                operator.applyAsDouble(left.Xy(), middle, right.Xy()),
                operator.applyAsDouble(left.Xz(), middle, right.Xz()),
                operator.applyAsDouble(left.Yx(), middle, right.Yx()),
                operator.applyAsDouble(left.Yy(), middle, right.Yy()),
                operator.applyAsDouble(left.Yz(), middle, right.Yz()),
                operator.applyAsDouble(left.Zx(), middle, right.Zx()),
                operator.applyAsDouble(left.Zy(), middle, right.Zy()),
                operator.applyAsDouble(left.Zz(), middle, right.Zz())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix3x3.Accessible left, double middle, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle, right),
                operator.applyAsDouble(left.Xy(), middle, right),
                operator.applyAsDouble(left.Xz(), middle, right),
                operator.applyAsDouble(left.Yx(), middle, right),
                operator.applyAsDouble(left.Yy(), middle, right),
                operator.applyAsDouble(left.Yz(), middle, right),
                operator.applyAsDouble(left.Zx(), middle, right),
                operator.applyAsDouble(left.Zy(), middle, right),
                operator.applyAsDouble(left.Zz(), middle, right)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix3x3.Accessible left, double middle, double right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left.Xx(), middle, right),
                operator.applyAsDouble(left.Xy(), middle, right),
                operator.applyAsDouble(left.Xz(), middle, right),
                operator.applyAsDouble(left.Yx(), middle, right),
                operator.applyAsDouble(left.Yy(), middle, right),
                operator.applyAsDouble(left.Yz(), middle, right),
                operator.applyAsDouble(left.Zx(), middle, right),
                operator.applyAsDouble(left.Zy(), middle, right),
                operator.applyAsDouble(left.Zz(), middle, right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Matrix3x3.Accessible middle, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.Xx(), right.Xx()),
                operator.applyAsDouble(left, middle.Xy(), right.Xy()),
                operator.applyAsDouble(left, middle.Xz(), right.Xz()),
                operator.applyAsDouble(left, middle.Yx(), right.Yx()),
                operator.applyAsDouble(left, middle.Yy(), right.Yy()),
                operator.applyAsDouble(left, middle.Yz(), right.Yz()),
                operator.applyAsDouble(left, middle.Zx(), right.Zx()),
                operator.applyAsDouble(left, middle.Zy(), right.Zy()),
                operator.applyAsDouble(left, middle.Zz(), right.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Matrix3x3.Accessible middle, Matrix3x3.Accessible right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left, middle.Xx(), right.Xx()),
                operator.applyAsDouble(left, middle.Xy(), right.Xy()),
                operator.applyAsDouble(left, middle.Xz(), right.Xz()),
                operator.applyAsDouble(left, middle.Yx(), right.Yx()),
                operator.applyAsDouble(left, middle.Yy(), right.Yy()),
                operator.applyAsDouble(left, middle.Yz(), right.Yz()),
                operator.applyAsDouble(left, middle.Zx(), right.Zx()),
                operator.applyAsDouble(left, middle.Zy(), right.Zy()),
                operator.applyAsDouble(left, middle.Zz(), right.Zz())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Matrix3x3.Accessible middle, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.Xx(), right),
                operator.applyAsDouble(left, middle.Xy(), right),
                operator.applyAsDouble(left, middle.Xz(), right),
                operator.applyAsDouble(left, middle.Yx(), right),
                operator.applyAsDouble(left, middle.Yy(), right),
                operator.applyAsDouble(left, middle.Yz(), right),
                operator.applyAsDouble(left, middle.Zx(), right),
                operator.applyAsDouble(left, middle.Zy(), right),
                operator.applyAsDouble(left, middle.Zz(), right)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Matrix3x3.Accessible middle, double right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left, middle.Xx(), right),
                operator.applyAsDouble(left, middle.Xy(), right),
                operator.applyAsDouble(left, middle.Xz(), right),
                operator.applyAsDouble(left, middle.Yx(), right),
                operator.applyAsDouble(left, middle.Yy(), right),
                operator.applyAsDouble(left, middle.Yz(), right),
                operator.applyAsDouble(left, middle.Zx(), right),
                operator.applyAsDouble(left, middle.Zy(), right),
                operator.applyAsDouble(left, middle.Zz(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, double middle, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle, right.Xx()),
                operator.applyAsDouble(left, middle, right.Xy()),
                operator.applyAsDouble(left, middle, right.Xz()),
                operator.applyAsDouble(left, middle, right.Yx()),
                operator.applyAsDouble(left, middle, right.Yy()),
                operator.applyAsDouble(left, middle, right.Yz()),
                operator.applyAsDouble(left, middle, right.Zx()),
                operator.applyAsDouble(left, middle, right.Zy()),
                operator.applyAsDouble(left, middle, right.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleTernaryOperator operator, double left, double middle, Matrix3x3.Accessible right) {
        resultConsumer.set3x3(
                operator.applyAsDouble(left, middle, right.Xx()),
                operator.applyAsDouble(left, middle, right.Xy()),
                operator.applyAsDouble(left, middle, right.Xz()),
                operator.applyAsDouble(left, middle, right.Yx()),
                operator.applyAsDouble(left, middle, right.Yy()),
                operator.applyAsDouble(left, middle, right.Yz()),
                operator.applyAsDouble(left, middle, right.Zx()),
                operator.applyAsDouble(left, middle, right.Zy()),
                operator.applyAsDouble(left, middle, right.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, double third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, double third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, double third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, Matrix3x3.Accessible second, double third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, Matrix3x3.Accessible third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, Matrix3x3.Accessible third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, double third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third, fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second, third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third, fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second, third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third, fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, double third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second, third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third, fourth.Xz()),
                operator.applyAsDouble(first.Yx(), second, third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third, fourth.Yz()),
                operator.applyAsDouble(first.Zx(), second, third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third, fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, double third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third, fourth),
                operator.applyAsDouble(first.Xy(), second, third, fourth),
                operator.applyAsDouble(first.Xz(), second, third, fourth),
                operator.applyAsDouble(first.Yx(), second, third, fourth),
                operator.applyAsDouble(first.Yy(), second, third, fourth),
                operator.applyAsDouble(first.Yz(), second, third, fourth),
                operator.applyAsDouble(first.Zx(), second, third, fourth),
                operator.applyAsDouble(first.Zy(), second, third, fourth),
                operator.applyAsDouble(first.Zz(), second, third, fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix3x3.Accessible first, double second, double third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first.Xx(), second, third, fourth),
                operator.applyAsDouble(first.Xy(), second, third, fourth),
                operator.applyAsDouble(first.Xz(), second, third, fourth),
                operator.applyAsDouble(first.Yx(), second, third, fourth),
                operator.applyAsDouble(first.Yy(), second, third, fourth),
                operator.applyAsDouble(first.Yz(), second, third, fourth),
                operator.applyAsDouble(first.Zx(), second, third, fourth),
                operator.applyAsDouble(first.Zy(), second, third, fourth),
                operator.applyAsDouble(first.Zz(), second, third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, Matrix3x3.Accessible third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, double third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first, second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first, second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third, fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, double third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first, second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first, second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third, fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, double third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third, fourth),
                operator.applyAsDouble(first, second.Xy(), third, fourth),
                operator.applyAsDouble(first, second.Xz(), third, fourth),
                operator.applyAsDouble(first, second.Yx(), third, fourth),
                operator.applyAsDouble(first, second.Yy(), third, fourth),
                operator.applyAsDouble(first, second.Yz(), third, fourth),
                operator.applyAsDouble(first, second.Zx(), third, fourth),
                operator.applyAsDouble(first, second.Zy(), third, fourth),
                operator.applyAsDouble(first, second.Zz(), third, fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix3x3.Accessible second, double third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second.Xx(), third, fourth),
                operator.applyAsDouble(first, second.Xy(), third, fourth),
                operator.applyAsDouble(first, second.Xz(), third, fourth),
                operator.applyAsDouble(first, second.Yx(), third, fourth),
                operator.applyAsDouble(first, second.Yy(), third, fourth),
                operator.applyAsDouble(first, second.Yz(), third, fourth),
                operator.applyAsDouble(first, second.Zx(), third, fourth),
                operator.applyAsDouble(first, second.Zy(), third, fourth),
                operator.applyAsDouble(first, second.Zz(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second, third.Zz(), fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Matrix3x3.Accessible third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second, third.Zz(), fourth.Zz())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Matrix3x3.Accessible third, double fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.Xx(), fourth),
                operator.applyAsDouble(first, second, third.Xy(), fourth),
                operator.applyAsDouble(first, second, third.Xz(), fourth),
                operator.applyAsDouble(first, second, third.Yx(), fourth),
                operator.applyAsDouble(first, second, third.Yy(), fourth),
                operator.applyAsDouble(first, second, third.Yz(), fourth),
                operator.applyAsDouble(first, second, third.Zx(), fourth),
                operator.applyAsDouble(first, second, third.Zy(), fourth),
                operator.applyAsDouble(first, second, third.Zz(), fourth)
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Matrix3x3.Accessible third, double fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second, third.Xx(), fourth),
                operator.applyAsDouble(first, second, third.Xy(), fourth),
                operator.applyAsDouble(first, second, third.Xz(), fourth),
                operator.applyAsDouble(first, second, third.Yx(), fourth),
                operator.applyAsDouble(first, second, third.Yy(), fourth),
                operator.applyAsDouble(first, second, third.Yz(), fourth),
                operator.applyAsDouble(first, second, third.Zx(), fourth),
                operator.applyAsDouble(first, second, third.Zy(), fourth),
                operator.applyAsDouble(first, second, third.Zz(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, double third, Matrix3x3.Accessible fourth, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third, fourth.Xx()),
                operator.applyAsDouble(first, second, third, fourth.Xy()),
                operator.applyAsDouble(first, second, third, fourth.Xz()),
                operator.applyAsDouble(first, second, third, fourth.Yx()),
                operator.applyAsDouble(first, second, third, fourth.Yy()),
                operator.applyAsDouble(first, second, third, fourth.Yz()),
                operator.applyAsDouble(first, second, third, fourth.Zx()),
                operator.applyAsDouble(first, second, third, fourth.Zy()),
                operator.applyAsDouble(first, second, third, fourth.Zz())
        );
    }

    public static void apply(Matrix3x3.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, double third, Matrix3x3.Accessible fourth) {
        resultConsumer.set3x3(
                operator.applyAsDouble(first, second, third, fourth.Xx()),
                operator.applyAsDouble(first, second, third, fourth.Xy()),
                operator.applyAsDouble(first, second, third, fourth.Xz()),
                operator.applyAsDouble(first, second, third, fourth.Yx()),
                operator.applyAsDouble(first, second, third, fourth.Yy()),
                operator.applyAsDouble(first, second, third, fourth.Yz()),
                operator.applyAsDouble(first, second, third, fourth.Zx()),
                operator.applyAsDouble(first, second, third, fourth.Zy()),
                operator.applyAsDouble(first, second, third, fourth.Zz())
        );
    }

    public static <R> R apply(DoubleUnaryOperator operator, Matrix4x4.Accessible operand, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(operand.Xx()),
                operator.applyAsDouble(operand.Xy()),
                operator.applyAsDouble(operand.Xz()),
                operator.applyAsDouble(operand.Xw()),
                operator.applyAsDouble(operand.Yx()),
                operator.applyAsDouble(operand.Yy()),
                operator.applyAsDouble(operand.Yz()),
                operator.applyAsDouble(operand.Yw()),
                operator.applyAsDouble(operand.Zx()),
                operator.applyAsDouble(operand.Zy()),
                operator.applyAsDouble(operand.Zz()),
                operator.applyAsDouble(operand.Zw()),
                operator.applyAsDouble(operand.Tx()),
                operator.applyAsDouble(operand.Ty()),
                operator.applyAsDouble(operand.Tz()),
                operator.applyAsDouble(operand.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleUnaryOperator operator, Matrix4x4.Accessible operand) {
        resultConsumer.set4x4(
                operator.applyAsDouble(operand.Xx()),
                operator.applyAsDouble(operand.Xy()),
                operator.applyAsDouble(operand.Xz()),
                operator.applyAsDouble(operand.Xw()),
                operator.applyAsDouble(operand.Yx()),
                operator.applyAsDouble(operand.Yy()),
                operator.applyAsDouble(operand.Yz()),
                operator.applyAsDouble(operand.Yw()),
                operator.applyAsDouble(operand.Zx()),
                operator.applyAsDouble(operand.Zy()),
                operator.applyAsDouble(operand.Zz()),
                operator.applyAsDouble(operand.Zw()),
                operator.applyAsDouble(operand.Tx()),
                operator.applyAsDouble(operand.Ty()),
                operator.applyAsDouble(operand.Tz()),
                operator.applyAsDouble(operand.Tw())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Matrix4x4.Accessible left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), right.Xz()),
                operator.applyAsDouble(left.Xw(), right.Xw()),
                operator.applyAsDouble(left.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), right.Yz()),
                operator.applyAsDouble(left.Yw(), right.Yw()),
                operator.applyAsDouble(left.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), right.Zz()),
                operator.applyAsDouble(left.Zw(), right.Zw()),
                operator.applyAsDouble(left.Tx(), right.Tx()),
                operator.applyAsDouble(left.Ty(), right.Ty()),
                operator.applyAsDouble(left.Tz(), right.Tz()),
                operator.applyAsDouble(left.Tw(), right.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleBinaryOperator operator, Matrix4x4.Accessible left, Matrix4x4.Accessible right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), right.Xz()),
                operator.applyAsDouble(left.Xw(), right.Xw()),
                operator.applyAsDouble(left.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), right.Yz()),
                operator.applyAsDouble(left.Yw(), right.Yw()),
                operator.applyAsDouble(left.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), right.Zz()),
                operator.applyAsDouble(left.Zw(), right.Zw()),
                operator.applyAsDouble(left.Tx(), right.Tx()),
                operator.applyAsDouble(left.Ty(), right.Ty()),
                operator.applyAsDouble(left.Tz(), right.Tz()),
                operator.applyAsDouble(left.Tw(), right.Tw())
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, Matrix4x4.Accessible left, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), right),
                operator.applyAsDouble(left.Xy(), right),
                operator.applyAsDouble(left.Xz(), right),
                operator.applyAsDouble(left.Xw(), right),
                operator.applyAsDouble(left.Yx(), right),
                operator.applyAsDouble(left.Yy(), right),
                operator.applyAsDouble(left.Yz(), right),
                operator.applyAsDouble(left.Yw(), right),
                operator.applyAsDouble(left.Zx(), right),
                operator.applyAsDouble(left.Zy(), right),
                operator.applyAsDouble(left.Zz(), right),
                operator.applyAsDouble(left.Zw(), right),
                operator.applyAsDouble(left.Tx(), right),
                operator.applyAsDouble(left.Ty(), right),
                operator.applyAsDouble(left.Tz(), right),
                operator.applyAsDouble(left.Tw(), right)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleBinaryOperator operator, Matrix4x4.Accessible left, double right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left.Xx(), right),
                operator.applyAsDouble(left.Xy(), right),
                operator.applyAsDouble(left.Xz(), right),
                operator.applyAsDouble(left.Xw(), right),
                operator.applyAsDouble(left.Yx(), right),
                operator.applyAsDouble(left.Yy(), right),
                operator.applyAsDouble(left.Yz(), right),
                operator.applyAsDouble(left.Yw(), right),
                operator.applyAsDouble(left.Zx(), right),
                operator.applyAsDouble(left.Zy(), right),
                operator.applyAsDouble(left.Zz(), right),
                operator.applyAsDouble(left.Zw(), right),
                operator.applyAsDouble(left.Tx(), right),
                operator.applyAsDouble(left.Ty(), right),
                operator.applyAsDouble(left.Tz(), right),
                operator.applyAsDouble(left.Tw(), right)
        );
    }

    public static <R> R apply(DoubleBinaryOperator operator, double left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, right.Xx()),
                operator.applyAsDouble(left, right.Xy()),
                operator.applyAsDouble(left, right.Xz()),
                operator.applyAsDouble(left, right.Xw()),
                operator.applyAsDouble(left, right.Yx()),
                operator.applyAsDouble(left, right.Yy()),
                operator.applyAsDouble(left, right.Yz()),
                operator.applyAsDouble(left, right.Yw()),
                operator.applyAsDouble(left, right.Zx()),
                operator.applyAsDouble(left, right.Zy()),
                operator.applyAsDouble(left, right.Zz()),
                operator.applyAsDouble(left, right.Zw()),
                operator.applyAsDouble(left, right.Tx()),
                operator.applyAsDouble(left, right.Ty()),
                operator.applyAsDouble(left, right.Tz()),
                operator.applyAsDouble(left, right.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleBinaryOperator operator, double left, Matrix4x4.Accessible right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left, right.Xx()),
                operator.applyAsDouble(left, right.Xy()),
                operator.applyAsDouble(left, right.Xz()),
                operator.applyAsDouble(left, right.Xw()),
                operator.applyAsDouble(left, right.Yx()),
                operator.applyAsDouble(left, right.Yy()),
                operator.applyAsDouble(left, right.Yz()),
                operator.applyAsDouble(left, right.Yw()),
                operator.applyAsDouble(left, right.Zx()),
                operator.applyAsDouble(left, right.Zy()),
                operator.applyAsDouble(left, right.Zz()),
                operator.applyAsDouble(left, right.Zw()),
                operator.applyAsDouble(left, right.Tx()),
                operator.applyAsDouble(left, right.Ty()),
                operator.applyAsDouble(left, right.Tz()),
                operator.applyAsDouble(left, right.Tw())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix4x4.Accessible left, Matrix4x4.Accessible middle, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right.Xz()),
                operator.applyAsDouble(left.Xw(), middle.Xw(), right.Xw()),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right.Yz()),
                operator.applyAsDouble(left.Yw(), middle.Yw(), right.Yw()),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right.Zz()),
                operator.applyAsDouble(left.Zw(), middle.Zw(), right.Zw()),
                operator.applyAsDouble(left.Tx(), middle.Tx(), right.Tx()),
                operator.applyAsDouble(left.Ty(), middle.Ty(), right.Ty()),
                operator.applyAsDouble(left.Tz(), middle.Tz(), right.Tz()),
                operator.applyAsDouble(left.Tw(), middle.Tw(), right.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix4x4.Accessible left, Matrix4x4.Accessible middle, Matrix4x4.Accessible right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right.Xx()),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right.Xy()),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right.Xz()),
                operator.applyAsDouble(left.Xw(), middle.Xw(), right.Xw()),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right.Yx()),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right.Yy()),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right.Yz()),
                operator.applyAsDouble(left.Yw(), middle.Yw(), right.Yw()),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right.Zx()),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right.Zy()),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right.Zz()),
                operator.applyAsDouble(left.Zw(), middle.Zw(), right.Zw()),
                operator.applyAsDouble(left.Tx(), middle.Tx(), right.Tx()),
                operator.applyAsDouble(left.Ty(), middle.Ty(), right.Ty()),
                operator.applyAsDouble(left.Tz(), middle.Tz(), right.Tz()),
                operator.applyAsDouble(left.Tw(), middle.Tw(), right.Tw())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix4x4.Accessible left, Matrix4x4.Accessible middle, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right),
                operator.applyAsDouble(left.Xw(), middle.Xw(), right),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right),
                operator.applyAsDouble(left.Yw(), middle.Yw(), right),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right),
                operator.applyAsDouble(left.Zw(), middle.Zw(), right),
                operator.applyAsDouble(left.Tx(), middle.Tx(), right),
                operator.applyAsDouble(left.Ty(), middle.Ty(), right),
                operator.applyAsDouble(left.Tz(), middle.Tz(), right),
                operator.applyAsDouble(left.Tw(), middle.Tw(), right)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix4x4.Accessible left, Matrix4x4.Accessible middle, double right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left.Xx(), middle.Xx(), right),
                operator.applyAsDouble(left.Xy(), middle.Xy(), right),
                operator.applyAsDouble(left.Xz(), middle.Xz(), right),
                operator.applyAsDouble(left.Xw(), middle.Xw(), right),
                operator.applyAsDouble(left.Yx(), middle.Yx(), right),
                operator.applyAsDouble(left.Yy(), middle.Yy(), right),
                operator.applyAsDouble(left.Yz(), middle.Yz(), right),
                operator.applyAsDouble(left.Yw(), middle.Yw(), right),
                operator.applyAsDouble(left.Zx(), middle.Zx(), right),
                operator.applyAsDouble(left.Zy(), middle.Zy(), right),
                operator.applyAsDouble(left.Zz(), middle.Zz(), right),
                operator.applyAsDouble(left.Zw(), middle.Zw(), right),
                operator.applyAsDouble(left.Tx(), middle.Tx(), right),
                operator.applyAsDouble(left.Ty(), middle.Ty(), right),
                operator.applyAsDouble(left.Tz(), middle.Tz(), right),
                operator.applyAsDouble(left.Tw(), middle.Tw(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix4x4.Accessible left, double middle, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle, right.Xx()),
                operator.applyAsDouble(left.Xy(), middle, right.Xy()),
                operator.applyAsDouble(left.Xz(), middle, right.Xz()),
                operator.applyAsDouble(left.Xw(), middle, right.Xw()),
                operator.applyAsDouble(left.Yx(), middle, right.Yx()),
                operator.applyAsDouble(left.Yy(), middle, right.Yy()),
                operator.applyAsDouble(left.Yz(), middle, right.Yz()),
                operator.applyAsDouble(left.Yw(), middle, right.Yw()),
                operator.applyAsDouble(left.Zx(), middle, right.Zx()),
                operator.applyAsDouble(left.Zy(), middle, right.Zy()),
                operator.applyAsDouble(left.Zz(), middle, right.Zz()),
                operator.applyAsDouble(left.Zw(), middle, right.Zw()),
                operator.applyAsDouble(left.Tx(), middle, right.Tx()),
                operator.applyAsDouble(left.Ty(), middle, right.Ty()),
                operator.applyAsDouble(left.Tz(), middle, right.Tz()),
                operator.applyAsDouble(left.Tw(), middle, right.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix4x4.Accessible left, double middle, Matrix4x4.Accessible right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left.Xx(), middle, right.Xx()),
                operator.applyAsDouble(left.Xy(), middle, right.Xy()),
                operator.applyAsDouble(left.Xz(), middle, right.Xz()),
                operator.applyAsDouble(left.Xw(), middle, right.Xw()),
                operator.applyAsDouble(left.Yx(), middle, right.Yx()),
                operator.applyAsDouble(left.Yy(), middle, right.Yy()),
                operator.applyAsDouble(left.Yz(), middle, right.Yz()),
                operator.applyAsDouble(left.Yw(), middle, right.Yw()),
                operator.applyAsDouble(left.Zx(), middle, right.Zx()),
                operator.applyAsDouble(left.Zy(), middle, right.Zy()),
                operator.applyAsDouble(left.Zz(), middle, right.Zz()),
                operator.applyAsDouble(left.Zw(), middle, right.Zw()),
                operator.applyAsDouble(left.Tx(), middle, right.Tx()),
                operator.applyAsDouble(left.Ty(), middle, right.Ty()),
                operator.applyAsDouble(left.Tz(), middle, right.Tz()),
                operator.applyAsDouble(left.Tw(), middle, right.Tw())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, Matrix4x4.Accessible left, double middle, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left.Xx(), middle, right),
                operator.applyAsDouble(left.Xy(), middle, right),
                operator.applyAsDouble(left.Xz(), middle, right),
                operator.applyAsDouble(left.Xw(), middle, right),
                operator.applyAsDouble(left.Yx(), middle, right),
                operator.applyAsDouble(left.Yy(), middle, right),
                operator.applyAsDouble(left.Yz(), middle, right),
                operator.applyAsDouble(left.Yw(), middle, right),
                operator.applyAsDouble(left.Zx(), middle, right),
                operator.applyAsDouble(left.Zy(), middle, right),
                operator.applyAsDouble(left.Zz(), middle, right),
                operator.applyAsDouble(left.Zw(), middle, right),
                operator.applyAsDouble(left.Tx(), middle, right),
                operator.applyAsDouble(left.Ty(), middle, right),
                operator.applyAsDouble(left.Tz(), middle, right),
                operator.applyAsDouble(left.Tw(), middle, right)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, Matrix4x4.Accessible left, double middle, double right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left.Xx(), middle, right),
                operator.applyAsDouble(left.Xy(), middle, right),
                operator.applyAsDouble(left.Xz(), middle, right),
                operator.applyAsDouble(left.Xw(), middle, right),
                operator.applyAsDouble(left.Yx(), middle, right),
                operator.applyAsDouble(left.Yy(), middle, right),
                operator.applyAsDouble(left.Yz(), middle, right),
                operator.applyAsDouble(left.Yw(), middle, right),
                operator.applyAsDouble(left.Zx(), middle, right),
                operator.applyAsDouble(left.Zy(), middle, right),
                operator.applyAsDouble(left.Zz(), middle, right),
                operator.applyAsDouble(left.Zw(), middle, right),
                operator.applyAsDouble(left.Tx(), middle, right),
                operator.applyAsDouble(left.Ty(), middle, right),
                operator.applyAsDouble(left.Tz(), middle, right),
                operator.applyAsDouble(left.Tw(), middle, right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Matrix4x4.Accessible middle, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.Xx(), right.Xx()),
                operator.applyAsDouble(left, middle.Xy(), right.Xy()),
                operator.applyAsDouble(left, middle.Xz(), right.Xz()),
                operator.applyAsDouble(left, middle.Xw(), right.Xw()),
                operator.applyAsDouble(left, middle.Yx(), right.Yx()),
                operator.applyAsDouble(left, middle.Yy(), right.Yy()),
                operator.applyAsDouble(left, middle.Yz(), right.Yz()),
                operator.applyAsDouble(left, middle.Yw(), right.Yw()),
                operator.applyAsDouble(left, middle.Zx(), right.Zx()),
                operator.applyAsDouble(left, middle.Zy(), right.Zy()),
                operator.applyAsDouble(left, middle.Zz(), right.Zz()),
                operator.applyAsDouble(left, middle.Zw(), right.Zw()),
                operator.applyAsDouble(left, middle.Tx(), right.Tx()),
                operator.applyAsDouble(left, middle.Ty(), right.Ty()),
                operator.applyAsDouble(left, middle.Tz(), right.Tz()),
                operator.applyAsDouble(left, middle.Tw(), right.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Matrix4x4.Accessible middle, Matrix4x4.Accessible right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left, middle.Xx(), right.Xx()),
                operator.applyAsDouble(left, middle.Xy(), right.Xy()),
                operator.applyAsDouble(left, middle.Xz(), right.Xz()),
                operator.applyAsDouble(left, middle.Xw(), right.Xw()),
                operator.applyAsDouble(left, middle.Yx(), right.Yx()),
                operator.applyAsDouble(left, middle.Yy(), right.Yy()),
                operator.applyAsDouble(left, middle.Yz(), right.Yz()),
                operator.applyAsDouble(left, middle.Yw(), right.Yw()),
                operator.applyAsDouble(left, middle.Zx(), right.Zx()),
                operator.applyAsDouble(left, middle.Zy(), right.Zy()),
                operator.applyAsDouble(left, middle.Zz(), right.Zz()),
                operator.applyAsDouble(left, middle.Zw(), right.Zw()),
                operator.applyAsDouble(left, middle.Tx(), right.Tx()),
                operator.applyAsDouble(left, middle.Ty(), right.Ty()),
                operator.applyAsDouble(left, middle.Tz(), right.Tz()),
                operator.applyAsDouble(left, middle.Tw(), right.Tw())
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, Matrix4x4.Accessible middle, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle.Xx(), right),
                operator.applyAsDouble(left, middle.Xy(), right),
                operator.applyAsDouble(left, middle.Xz(), right),
                operator.applyAsDouble(left, middle.Xw(), right),
                operator.applyAsDouble(left, middle.Yx(), right),
                operator.applyAsDouble(left, middle.Yy(), right),
                operator.applyAsDouble(left, middle.Yz(), right),
                operator.applyAsDouble(left, middle.Yw(), right),
                operator.applyAsDouble(left, middle.Zx(), right),
                operator.applyAsDouble(left, middle.Zy(), right),
                operator.applyAsDouble(left, middle.Zz(), right),
                operator.applyAsDouble(left, middle.Zw(), right),
                operator.applyAsDouble(left, middle.Tx(), right),
                operator.applyAsDouble(left, middle.Ty(), right),
                operator.applyAsDouble(left, middle.Tz(), right),
                operator.applyAsDouble(left, middle.Tw(), right)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, double left, Matrix4x4.Accessible middle, double right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left, middle.Xx(), right),
                operator.applyAsDouble(left, middle.Xy(), right),
                operator.applyAsDouble(left, middle.Xz(), right),
                operator.applyAsDouble(left, middle.Xw(), right),
                operator.applyAsDouble(left, middle.Yx(), right),
                operator.applyAsDouble(left, middle.Yy(), right),
                operator.applyAsDouble(left, middle.Yz(), right),
                operator.applyAsDouble(left, middle.Yw(), right),
                operator.applyAsDouble(left, middle.Zx(), right),
                operator.applyAsDouble(left, middle.Zy(), right),
                operator.applyAsDouble(left, middle.Zz(), right),
                operator.applyAsDouble(left, middle.Zw(), right),
                operator.applyAsDouble(left, middle.Tx(), right),
                operator.applyAsDouble(left, middle.Ty(), right),
                operator.applyAsDouble(left, middle.Tz(), right),
                operator.applyAsDouble(left, middle.Tw(), right)
        );
    }

    public static <R> R apply(DoubleTernaryOperator operator, double left, double middle, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(left, middle, right.Xx()),
                operator.applyAsDouble(left, middle, right.Xy()),
                operator.applyAsDouble(left, middle, right.Xz()),
                operator.applyAsDouble(left, middle, right.Xw()),
                operator.applyAsDouble(left, middle, right.Yx()),
                operator.applyAsDouble(left, middle, right.Yy()),
                operator.applyAsDouble(left, middle, right.Yz()),
                operator.applyAsDouble(left, middle, right.Yw()),
                operator.applyAsDouble(left, middle, right.Zx()),
                operator.applyAsDouble(left, middle, right.Zy()),
                operator.applyAsDouble(left, middle, right.Zz()),
                operator.applyAsDouble(left, middle, right.Zw()),
                operator.applyAsDouble(left, middle, right.Tx()),
                operator.applyAsDouble(left, middle, right.Ty()),
                operator.applyAsDouble(left, middle, right.Tz()),
                operator.applyAsDouble(left, middle, right.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleTernaryOperator operator, double left, double middle, Matrix4x4.Accessible right) {
        resultConsumer.set4x4(
                operator.applyAsDouble(left, middle, right.Xx()),
                operator.applyAsDouble(left, middle, right.Xy()),
                operator.applyAsDouble(left, middle, right.Xz()),
                operator.applyAsDouble(left, middle, right.Xw()),
                operator.applyAsDouble(left, middle, right.Yx()),
                operator.applyAsDouble(left, middle, right.Yy()),
                operator.applyAsDouble(left, middle, right.Yz()),
                operator.applyAsDouble(left, middle, right.Yw()),
                operator.applyAsDouble(left, middle, right.Zx()),
                operator.applyAsDouble(left, middle, right.Zy()),
                operator.applyAsDouble(left, middle, right.Zz()),
                operator.applyAsDouble(left, middle, right.Zw()),
                operator.applyAsDouble(left, middle, right.Tx()),
                operator.applyAsDouble(left, middle, right.Ty()),
                operator.applyAsDouble(left, middle, right.Tz()),
                operator.applyAsDouble(left, middle, right.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second.Xw(), third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second.Yw(), third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second.Zw(), third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second.Tx(), third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second.Ty(), third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second.Tz(), third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second.Tw(), third.Tw(), fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second.Xw(), third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second.Yw(), third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second.Zw(), third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second.Tx(), third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second.Ty(), third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second.Tz(), third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second.Tw(), third.Tw(), fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first.Xw(), second.Xw(), third.Xw(), fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first.Yw(), second.Yw(), third.Yw(), fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth),
                operator.applyAsDouble(first.Zw(), second.Zw(), third.Zw(), fourth),
                operator.applyAsDouble(first.Tx(), second.Tx(), third.Tx(), fourth),
                operator.applyAsDouble(first.Ty(), second.Ty(), third.Ty(), fourth),
                operator.applyAsDouble(first.Tz(), second.Tz(), third.Tz(), fourth),
                operator.applyAsDouble(first.Tw(), second.Tw(), third.Tw(), fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first.Xw(), second.Xw(), third.Xw(), fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first.Yw(), second.Yw(), third.Yw(), fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third.Zz(), fourth),
                operator.applyAsDouble(first.Zw(), second.Zw(), third.Zw(), fourth),
                operator.applyAsDouble(first.Tx(), second.Tx(), third.Tx(), fourth),
                operator.applyAsDouble(first.Ty(), second.Ty(), third.Ty(), fourth),
                operator.applyAsDouble(first.Tz(), second.Tz(), third.Tz(), fourth),
                operator.applyAsDouble(first.Tw(), second.Tw(), third.Tw(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, double third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second.Xw(), third, fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second.Yw(), third, fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second.Zw(), third, fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second.Tx(), third, fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second.Ty(), third, fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second.Tz(), third, fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second.Tw(), third, fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, double third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second.Xw(), third, fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second.Yw(), third, fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second.Zw(), third, fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second.Tx(), third, fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second.Ty(), third, fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second.Tz(), third, fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second.Tw(), third, fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, double third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth),
                operator.applyAsDouble(first.Xw(), second.Xw(), third, fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth),
                operator.applyAsDouble(first.Yw(), second.Yw(), third, fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth),
                operator.applyAsDouble(first.Zw(), second.Zw(), third, fourth),
                operator.applyAsDouble(first.Tx(), second.Tx(), third, fourth),
                operator.applyAsDouble(first.Ty(), second.Ty(), third, fourth),
                operator.applyAsDouble(first.Tz(), second.Tz(), third, fourth),
                operator.applyAsDouble(first.Tw(), second.Tw(), third, fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, Matrix4x4.Accessible second, double third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second.Xx(), third, fourth),
                operator.applyAsDouble(first.Xy(), second.Xy(), third, fourth),
                operator.applyAsDouble(first.Xz(), second.Xz(), third, fourth),
                operator.applyAsDouble(first.Xw(), second.Xw(), third, fourth),
                operator.applyAsDouble(first.Yx(), second.Yx(), third, fourth),
                operator.applyAsDouble(first.Yy(), second.Yy(), third, fourth),
                operator.applyAsDouble(first.Yz(), second.Yz(), third, fourth),
                operator.applyAsDouble(first.Yw(), second.Yw(), third, fourth),
                operator.applyAsDouble(first.Zx(), second.Zx(), third, fourth),
                operator.applyAsDouble(first.Zy(), second.Zy(), third, fourth),
                operator.applyAsDouble(first.Zz(), second.Zz(), third, fourth),
                operator.applyAsDouble(first.Zw(), second.Zw(), third, fourth),
                operator.applyAsDouble(first.Tx(), second.Tx(), third, fourth),
                operator.applyAsDouble(first.Ty(), second.Ty(), third, fourth),
                operator.applyAsDouble(first.Tz(), second.Tz(), third, fourth),
                operator.applyAsDouble(first.Tw(), second.Tw(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second, third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second, third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second, third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second, third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second, third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second, third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second, third.Tw(), fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second, third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second, third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second, third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second, third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second, third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second, third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second, third.Tw(), fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, Matrix4x4.Accessible third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth),
                operator.applyAsDouble(first.Xw(), second, third.Xw(), fourth),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth),
                operator.applyAsDouble(first.Yw(), second, third.Yw(), fourth),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth),
                operator.applyAsDouble(first.Zw(), second, third.Zw(), fourth),
                operator.applyAsDouble(first.Tx(), second, third.Tx(), fourth),
                operator.applyAsDouble(first.Ty(), second, third.Ty(), fourth),
                operator.applyAsDouble(first.Tz(), second, third.Tz(), fourth),
                operator.applyAsDouble(first.Tw(), second, third.Tw(), fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, Matrix4x4.Accessible third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second, third.Xx(), fourth),
                operator.applyAsDouble(first.Xy(), second, third.Xy(), fourth),
                operator.applyAsDouble(first.Xz(), second, third.Xz(), fourth),
                operator.applyAsDouble(first.Xw(), second, third.Xw(), fourth),
                operator.applyAsDouble(first.Yx(), second, third.Yx(), fourth),
                operator.applyAsDouble(first.Yy(), second, third.Yy(), fourth),
                operator.applyAsDouble(first.Yz(), second, third.Yz(), fourth),
                operator.applyAsDouble(first.Yw(), second, third.Yw(), fourth),
                operator.applyAsDouble(first.Zx(), second, third.Zx(), fourth),
                operator.applyAsDouble(first.Zy(), second, third.Zy(), fourth),
                operator.applyAsDouble(first.Zz(), second, third.Zz(), fourth),
                operator.applyAsDouble(first.Zw(), second, third.Zw(), fourth),
                operator.applyAsDouble(first.Tx(), second, third.Tx(), fourth),
                operator.applyAsDouble(first.Ty(), second, third.Ty(), fourth),
                operator.applyAsDouble(first.Tz(), second, third.Tz(), fourth),
                operator.applyAsDouble(first.Tw(), second, third.Tw(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, double third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third, fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second, third, fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second, third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third, fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second, third, fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second, third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third, fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second, third, fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second, third, fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second, third, fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second, third, fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second, third, fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, double third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second, third, fourth.Xx()),
                operator.applyAsDouble(first.Xy(), second, third, fourth.Xy()),
                operator.applyAsDouble(first.Xz(), second, third, fourth.Xz()),
                operator.applyAsDouble(first.Xw(), second, third, fourth.Xw()),
                operator.applyAsDouble(first.Yx(), second, third, fourth.Yx()),
                operator.applyAsDouble(first.Yy(), second, third, fourth.Yy()),
                operator.applyAsDouble(first.Yz(), second, third, fourth.Yz()),
                operator.applyAsDouble(first.Yw(), second, third, fourth.Yw()),
                operator.applyAsDouble(first.Zx(), second, third, fourth.Zx()),
                operator.applyAsDouble(first.Zy(), second, third, fourth.Zy()),
                operator.applyAsDouble(first.Zz(), second, third, fourth.Zz()),
                operator.applyAsDouble(first.Zw(), second, third, fourth.Zw()),
                operator.applyAsDouble(first.Tx(), second, third, fourth.Tx()),
                operator.applyAsDouble(first.Ty(), second, third, fourth.Ty()),
                operator.applyAsDouble(first.Tz(), second, third, fourth.Tz()),
                operator.applyAsDouble(first.Tw(), second, third, fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, double third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first.Xx(), second, third, fourth),
                operator.applyAsDouble(first.Xy(), second, third, fourth),
                operator.applyAsDouble(first.Xz(), second, third, fourth),
                operator.applyAsDouble(first.Xw(), second, third, fourth),
                operator.applyAsDouble(first.Yx(), second, third, fourth),
                operator.applyAsDouble(first.Yy(), second, third, fourth),
                operator.applyAsDouble(first.Yz(), second, third, fourth),
                operator.applyAsDouble(first.Yw(), second, third, fourth),
                operator.applyAsDouble(first.Zx(), second, third, fourth),
                operator.applyAsDouble(first.Zy(), second, third, fourth),
                operator.applyAsDouble(first.Zz(), second, third, fourth),
                operator.applyAsDouble(first.Zw(), second, third, fourth),
                operator.applyAsDouble(first.Tx(), second, third, fourth),
                operator.applyAsDouble(first.Ty(), second, third, fourth),
                operator.applyAsDouble(first.Tz(), second, third, fourth),
                operator.applyAsDouble(first.Tw(), second, third, fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, Matrix4x4.Accessible first, double second, double third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first.Xx(), second, third, fourth),
                operator.applyAsDouble(first.Xy(), second, third, fourth),
                operator.applyAsDouble(first.Xz(), second, third, fourth),
                operator.applyAsDouble(first.Xw(), second, third, fourth),
                operator.applyAsDouble(first.Yx(), second, third, fourth),
                operator.applyAsDouble(first.Yy(), second, third, fourth),
                operator.applyAsDouble(first.Yz(), second, third, fourth),
                operator.applyAsDouble(first.Yw(), second, third, fourth),
                operator.applyAsDouble(first.Zx(), second, third, fourth),
                operator.applyAsDouble(first.Zy(), second, third, fourth),
                operator.applyAsDouble(first.Zz(), second, third, fourth),
                operator.applyAsDouble(first.Zw(), second, third, fourth),
                operator.applyAsDouble(first.Tx(), second, third, fourth),
                operator.applyAsDouble(first.Ty(), second, third, fourth),
                operator.applyAsDouble(first.Tz(), second, third, fourth),
                operator.applyAsDouble(first.Tw(), second, third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second.Xw(), third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second.Yw(), third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first, second.Zw(), third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first, second.Tx(), third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first, second.Ty(), third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first, second.Tz(), third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first, second.Tw(), third.Tw(), fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second.Xw(), third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second.Yw(), third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first, second.Zw(), third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first, second.Tx(), third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first, second.Ty(), third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first, second.Tz(), third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first, second.Tw(), third.Tw(), fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first, second.Xw(), third.Xw(), fourth),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first, second.Yw(), third.Yw(), fourth),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth),
                operator.applyAsDouble(first, second.Zw(), third.Zw(), fourth),
                operator.applyAsDouble(first, second.Tx(), third.Tx(), fourth),
                operator.applyAsDouble(first, second.Ty(), third.Ty(), fourth),
                operator.applyAsDouble(first, second.Tz(), third.Tz(), fourth),
                operator.applyAsDouble(first, second.Tw(), third.Tw(), fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, Matrix4x4.Accessible third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second.Xx(), third.Xx(), fourth),
                operator.applyAsDouble(first, second.Xy(), third.Xy(), fourth),
                operator.applyAsDouble(first, second.Xz(), third.Xz(), fourth),
                operator.applyAsDouble(first, second.Xw(), third.Xw(), fourth),
                operator.applyAsDouble(first, second.Yx(), third.Yx(), fourth),
                operator.applyAsDouble(first, second.Yy(), third.Yy(), fourth),
                operator.applyAsDouble(first, second.Yz(), third.Yz(), fourth),
                operator.applyAsDouble(first, second.Yw(), third.Yw(), fourth),
                operator.applyAsDouble(first, second.Zx(), third.Zx(), fourth),
                operator.applyAsDouble(first, second.Zy(), third.Zy(), fourth),
                operator.applyAsDouble(first, second.Zz(), third.Zz(), fourth),
                operator.applyAsDouble(first, second.Zw(), third.Zw(), fourth),
                operator.applyAsDouble(first, second.Tx(), third.Tx(), fourth),
                operator.applyAsDouble(first, second.Ty(), third.Ty(), fourth),
                operator.applyAsDouble(first, second.Tz(), third.Tz(), fourth),
                operator.applyAsDouble(first, second.Tw(), third.Tw(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, double third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first, second.Xw(), third, fourth.Xw()),
                operator.applyAsDouble(first, second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first, second.Yw(), third, fourth.Yw()),
                operator.applyAsDouble(first, second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third, fourth.Zz()),
                operator.applyAsDouble(first, second.Zw(), third, fourth.Zw()),
                operator.applyAsDouble(first, second.Tx(), third, fourth.Tx()),
                operator.applyAsDouble(first, second.Ty(), third, fourth.Ty()),
                operator.applyAsDouble(first, second.Tz(), third, fourth.Tz()),
                operator.applyAsDouble(first, second.Tw(), third, fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, double third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second.Xx(), third, fourth.Xx()),
                operator.applyAsDouble(first, second.Xy(), third, fourth.Xy()),
                operator.applyAsDouble(first, second.Xz(), third, fourth.Xz()),
                operator.applyAsDouble(first, second.Xw(), third, fourth.Xw()),
                operator.applyAsDouble(first, second.Yx(), third, fourth.Yx()),
                operator.applyAsDouble(first, second.Yy(), third, fourth.Yy()),
                operator.applyAsDouble(first, second.Yz(), third, fourth.Yz()),
                operator.applyAsDouble(first, second.Yw(), third, fourth.Yw()),
                operator.applyAsDouble(first, second.Zx(), third, fourth.Zx()),
                operator.applyAsDouble(first, second.Zy(), third, fourth.Zy()),
                operator.applyAsDouble(first, second.Zz(), third, fourth.Zz()),
                operator.applyAsDouble(first, second.Zw(), third, fourth.Zw()),
                operator.applyAsDouble(first, second.Tx(), third, fourth.Tx()),
                operator.applyAsDouble(first, second.Ty(), third, fourth.Ty()),
                operator.applyAsDouble(first, second.Tz(), third, fourth.Tz()),
                operator.applyAsDouble(first, second.Tw(), third, fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, double third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second.Xx(), third, fourth),
                operator.applyAsDouble(first, second.Xy(), third, fourth),
                operator.applyAsDouble(first, second.Xz(), third, fourth),
                operator.applyAsDouble(first, second.Xw(), third, fourth),
                operator.applyAsDouble(first, second.Yx(), third, fourth),
                operator.applyAsDouble(first, second.Yy(), third, fourth),
                operator.applyAsDouble(first, second.Yz(), third, fourth),
                operator.applyAsDouble(first, second.Yw(), third, fourth),
                operator.applyAsDouble(first, second.Zx(), third, fourth),
                operator.applyAsDouble(first, second.Zy(), third, fourth),
                operator.applyAsDouble(first, second.Zz(), third, fourth),
                operator.applyAsDouble(first, second.Zw(), third, fourth),
                operator.applyAsDouble(first, second.Tx(), third, fourth),
                operator.applyAsDouble(first, second.Ty(), third, fourth),
                operator.applyAsDouble(first, second.Tz(), third, fourth),
                operator.applyAsDouble(first, second.Tw(), third, fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, Matrix4x4.Accessible second, double third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second.Xx(), third, fourth),
                operator.applyAsDouble(first, second.Xy(), third, fourth),
                operator.applyAsDouble(first, second.Xz(), third, fourth),
                operator.applyAsDouble(first, second.Xw(), third, fourth),
                operator.applyAsDouble(first, second.Yx(), third, fourth),
                operator.applyAsDouble(first, second.Yy(), third, fourth),
                operator.applyAsDouble(first, second.Yz(), third, fourth),
                operator.applyAsDouble(first, second.Yw(), third, fourth),
                operator.applyAsDouble(first, second.Zx(), third, fourth),
                operator.applyAsDouble(first, second.Zy(), third, fourth),
                operator.applyAsDouble(first, second.Zz(), third, fourth),
                operator.applyAsDouble(first, second.Zw(), third, fourth),
                operator.applyAsDouble(first, second.Tx(), third, fourth),
                operator.applyAsDouble(first, second.Ty(), third, fourth),
                operator.applyAsDouble(first, second.Tz(), third, fourth),
                operator.applyAsDouble(first, second.Tw(), third, fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second, third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first, second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second, third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first, second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second, third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first, second, third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first, second, third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first, second, third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first, second, third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first, second, third.Tw(), fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Matrix4x4.Accessible third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second, third.Xx(), fourth.Xx()),
                operator.applyAsDouble(first, second, third.Xy(), fourth.Xy()),
                operator.applyAsDouble(first, second, third.Xz(), fourth.Xz()),
                operator.applyAsDouble(first, second, third.Xw(), fourth.Xw()),
                operator.applyAsDouble(first, second, third.Yx(), fourth.Yx()),
                operator.applyAsDouble(first, second, third.Yy(), fourth.Yy()),
                operator.applyAsDouble(first, second, third.Yz(), fourth.Yz()),
                operator.applyAsDouble(first, second, third.Yw(), fourth.Yw()),
                operator.applyAsDouble(first, second, third.Zx(), fourth.Zx()),
                operator.applyAsDouble(first, second, third.Zy(), fourth.Zy()),
                operator.applyAsDouble(first, second, third.Zz(), fourth.Zz()),
                operator.applyAsDouble(first, second, third.Zw(), fourth.Zw()),
                operator.applyAsDouble(first, second, third.Tx(), fourth.Tx()),
                operator.applyAsDouble(first, second, third.Ty(), fourth.Ty()),
                operator.applyAsDouble(first, second, third.Tz(), fourth.Tz()),
                operator.applyAsDouble(first, second, third.Tw(), fourth.Tw())
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, Matrix4x4.Accessible third, double fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third.Xx(), fourth),
                operator.applyAsDouble(first, second, third.Xy(), fourth),
                operator.applyAsDouble(first, second, third.Xz(), fourth),
                operator.applyAsDouble(first, second, third.Xw(), fourth),
                operator.applyAsDouble(first, second, third.Yx(), fourth),
                operator.applyAsDouble(first, second, third.Yy(), fourth),
                operator.applyAsDouble(first, second, third.Yz(), fourth),
                operator.applyAsDouble(first, second, third.Yw(), fourth),
                operator.applyAsDouble(first, second, third.Zx(), fourth),
                operator.applyAsDouble(first, second, third.Zy(), fourth),
                operator.applyAsDouble(first, second, third.Zz(), fourth),
                operator.applyAsDouble(first, second, third.Zw(), fourth),
                operator.applyAsDouble(first, second, third.Tx(), fourth),
                operator.applyAsDouble(first, second, third.Ty(), fourth),
                operator.applyAsDouble(first, second, third.Tz(), fourth),
                operator.applyAsDouble(first, second, third.Tw(), fourth)
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, Matrix4x4.Accessible third, double fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second, third.Xx(), fourth),
                operator.applyAsDouble(first, second, third.Xy(), fourth),
                operator.applyAsDouble(first, second, third.Xz(), fourth),
                operator.applyAsDouble(first, second, third.Xw(), fourth),
                operator.applyAsDouble(first, second, third.Yx(), fourth),
                operator.applyAsDouble(first, second, third.Yy(), fourth),
                operator.applyAsDouble(first, second, third.Yz(), fourth),
                operator.applyAsDouble(first, second, third.Yw(), fourth),
                operator.applyAsDouble(first, second, third.Zx(), fourth),
                operator.applyAsDouble(first, second, third.Zy(), fourth),
                operator.applyAsDouble(first, second, third.Zz(), fourth),
                operator.applyAsDouble(first, second, third.Zw(), fourth),
                operator.applyAsDouble(first, second, third.Tx(), fourth),
                operator.applyAsDouble(first, second, third.Ty(), fourth),
                operator.applyAsDouble(first, second, third.Tz(), fourth),
                operator.applyAsDouble(first, second, third.Tw(), fourth)
        );
    }

    public static <R> R apply(DoubleQuaternaryOperator operator, double first, double second, double third, Matrix4x4.Accessible fourth, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                operator.applyAsDouble(first, second, third, fourth.Xx()),
                operator.applyAsDouble(first, second, third, fourth.Xy()),
                operator.applyAsDouble(first, second, third, fourth.Xz()),
                operator.applyAsDouble(first, second, third, fourth.Xw()),
                operator.applyAsDouble(first, second, third, fourth.Yx()),
                operator.applyAsDouble(first, second, third, fourth.Yy()),
                operator.applyAsDouble(first, second, third, fourth.Yz()),
                operator.applyAsDouble(first, second, third, fourth.Yw()),
                operator.applyAsDouble(first, second, third, fourth.Zx()),
                operator.applyAsDouble(first, second, third, fourth.Zy()),
                operator.applyAsDouble(first, second, third, fourth.Zz()),
                operator.applyAsDouble(first, second, third, fourth.Zw()),
                operator.applyAsDouble(first, second, third, fourth.Tx()),
                operator.applyAsDouble(first, second, third, fourth.Ty()),
                operator.applyAsDouble(first, second, third, fourth.Tz()),
                operator.applyAsDouble(first, second, third, fourth.Tw())
        );
    }

    public static void apply(Matrix4x4.Consumer resultConsumer, DoubleQuaternaryOperator operator, double first, double second, double third, Matrix4x4.Accessible fourth) {
        resultConsumer.set4x4(
                operator.applyAsDouble(first, second, third, fourth.Xx()),
                operator.applyAsDouble(first, second, third, fourth.Xy()),
                operator.applyAsDouble(first, second, third, fourth.Xz()),
                operator.applyAsDouble(first, second, third, fourth.Xw()),
                operator.applyAsDouble(first, second, third, fourth.Yx()),
                operator.applyAsDouble(first, second, third, fourth.Yy()),
                operator.applyAsDouble(first, second, third, fourth.Yz()),
                operator.applyAsDouble(first, second, third, fourth.Yw()),
                operator.applyAsDouble(first, second, third, fourth.Zx()),
                operator.applyAsDouble(first, second, third, fourth.Zy()),
                operator.applyAsDouble(first, second, third, fourth.Zz()),
                operator.applyAsDouble(first, second, third, fourth.Zw()),
                operator.applyAsDouble(first, second, third, fourth.Tx()),
                operator.applyAsDouble(first, second, third, fourth.Ty()),
                operator.applyAsDouble(first, second, third, fourth.Tz()),
                operator.applyAsDouble(first, second, third, fourth.Tw())
        );
    }

}
