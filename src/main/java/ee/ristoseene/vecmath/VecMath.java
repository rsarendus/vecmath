package ee.ristoseene.vecmath;

public final class VecMath {

    private VecMath() {}

    public static double min(double value1, double value2) {
        return (value1 < value2) ? value1 : value2;
    }

    public static double max(double value1, double value2) {
        return (value1 > value2) ? value1 : value2;
    }

    public static double clamp(double value, double min, double max) {
        return (value < max) ? (value > min ? value : min) : max;
    }

    public static double lerp(double value1, double value2, double t) {
        return value1 * (1.0D - t) + value2 * t;
    }

    public static <R> R min(Vector2.Accessible value1, double value2, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.x(), value2),
                min(value1.y(), value2)
        );
    }

    public static void min(Vector2.Consumer result, Vector2.Accessible value1, double value2) {
        result.xy(
                min(value1.x(), value2),
                min(value1.y(), value2)
        );
    }

    public static <R> R min(Vector2.Accessible value1, Vector2.Accessible value2, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.x(), value2.x()),
                min(value1.y(), value2.y())
        );
    }

    public static void min(Vector2.Consumer result, Vector2.Accessible value1, Vector2.Accessible value2) {
        result.xy(
                min(value1.x(), value2.x()),
                min(value1.y(), value2.y())
        );
    }

    public static <R> R max(Vector2.Accessible value1, double value2, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.x(), value2),
                max(value1.y(), value2)
        );
    }

    public static void max(Vector2.Consumer result, Vector2.Accessible value1, double value2) {
        result.xy(
                max(value1.x(), value2),
                max(value1.y(), value2)
        );
    }

    public static <R> R max(Vector2.Accessible value1, Vector2.Accessible value2, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.x(), value2.x()),
                max(value1.y(), value2.y())
        );
    }

    public static void max(Vector2.Consumer result, Vector2.Accessible value1, Vector2.Accessible value2) {
        result.xy(
                max(value1.x(), value2.x()),
                max(value1.y(), value2.y())
        );
    }

    public static <R> R clamp(Vector2.Accessible value, double min, double max, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min, max),
                clamp(value.y(), min, max)
        );
    }

    public static void clamp(Vector2.Consumer result, Vector2.Accessible value, double min, double max) {
        result.xy(
                clamp(value.x(), min, max),
                clamp(value.y(), min, max)
        );
    }

    public static <R> R clamp(Vector2.Accessible value, Vector2.Accessible min, double max, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min.x(), max),
                clamp(value.y(), min.y(), max)
        );
    }

    public static void clamp(Vector2.Consumer result, Vector2.Accessible value, Vector2.Accessible min, double max) {
        result.xy(
                clamp(value.x(), min.x(), max),
                clamp(value.y(), min.y(), max)
        );
    }

    public static <R> R clamp(Vector2.Accessible value, double min, Vector2.Accessible max, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min, max.x()),
                clamp(value.y(), min, max.y())
        );
    }

    public static void clamp(Vector2.Consumer result, Vector2.Accessible value, double min, Vector2.Accessible max) {
        result.xy(
                clamp(value.x(), min, max.x()),
                clamp(value.y(), min, max.y())
        );
    }

    public static <R> R clamp(Vector2.Accessible value, Vector2.Accessible min, Vector2.Accessible max, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min.x(), max.x()),
                clamp(value.y(), min.y(), max.y())
        );
    }

    public static void clamp(Vector2.Consumer result, Vector2.Accessible value, Vector2.Accessible min, Vector2.Accessible max) {
        result.xy(
                clamp(value.x(), min.x(), max.x()),
                clamp(value.y(), min.y(), max.y())
        );
    }

    public static <R> R clamp(double value, Vector2.Accessible min, Vector2.Accessible max, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value, min.x(), max.x()),
                clamp(value, min.y(), max.y())
        );
    }

    public static void clamp(Vector2.Consumer result, double value, Vector2.Accessible min, Vector2.Accessible max) {
        result.xy(
                clamp(value, min.x(), max.x()),
                clamp(value, min.y(), max.y())
        );
    }

    public static <R> R lerp(Vector2.Accessible value1, Vector2.Accessible value2, double t, Vector2.Factory<R> resultFactory) {
        final double oneMinusT = 1.0D - t;
        return resultFactory.create(
                value1.x() * oneMinusT + value2.x() * t,
                value1.y() * oneMinusT + value2.y() * t
        );
    }

    public static void lerp(Vector2.Consumer result, Vector2.Accessible value1, Vector2.Accessible value2, double t) {
        final double oneMinusT = 1.0D - t;
        result.xy(
                value1.x() * oneMinusT + value2.x() * t,
                value1.y() * oneMinusT + value2.y() * t
        );
    }

    public static <R> R lerp(Vector2.Accessible value1, double value2, Vector2.Accessible t, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.x(), value2, t.x()),
                lerp(value1.y(), value2, t.y())
        );
    }

    public static void lerp(Vector2.Consumer result, Vector2.Accessible value1, double value2, Vector2.Accessible t) {
        result.xy(
                lerp(value1.x(), value2, t.x()),
                lerp(value1.y(), value2, t.y())
        );
    }

    public static <R> R lerp(Vector2.Accessible value1, Vector2.Accessible value2, Vector2.Accessible t, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.x(), value2.x(), t.x()),
                lerp(value1.y(), value2.y(), t.y())
        );
    }

    public static void lerp(Vector2.Consumer result, Vector2.Accessible value1, Vector2.Accessible value2, Vector2.Accessible t) {
        result.xy(
                lerp(value1.x(), value2.x(), t.x()),
                lerp(value1.y(), value2.y(), t.y())
        );
    }

    public static <R> R negate(Vector2.Accessible value, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                -value.x(),
                -value.y()
        );
    }

    public static void negate(Vector2.Consumer result, Vector2.Accessible value) {
        result.xy(
                -value.x(),
                -value.y()
        );
    }

    public static <R> R add(Vector2.Accessible left, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() + right,
                left.y() + right
        );
    }

    public static void add(Vector2.Consumer result, Vector2.Accessible left, double right) {
        result.xy(
                left.x() + right,
                left.y() + right
        );
    }

    public static <R> R add(Vector2.Accessible left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() + right.x(),
                left.y() + right.y()
        );
    }

    public static void add(Vector2.Consumer result, Vector2.Accessible left, Vector2.Accessible right) {
        result.xy(
                left.x() + right.x(),
                left.y() + right.y()
        );
    }

    public static <R> R subtract(Vector2.Accessible left, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() - right,
                left.y() - right
        );
    }

    public static void subtract(Vector2.Consumer result, Vector2.Accessible left, double right) {
        result.xy(
                left.x() - right,
                left.y() - right
        );
    }

    public static <R> R subtract(Vector2.Accessible left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() - right.x(),
                left.y() - right.y()
        );
    }

    public static void subtract(Vector2.Consumer result, Vector2.Accessible left, Vector2.Accessible right) {
        result.xy(
                left.x() - right.x(),
                left.y() - right.y()
        );
    }

    public static <R> R subtract(double left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left - right.x(),
                left - right.y()
        );
    }

    public static void subtract(Vector2.Consumer result, double left, Vector2.Accessible right) {
        result.xy(
                left - right.x(),
                left - right.y()
        );
    }

    public static <R> R multiply(Vector2.Accessible left, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * right,
                left.y() * right
        );
    }

    public static void multiply(Vector2.Consumer result, Vector2.Accessible left, double right) {
        result.xy(
                left.x() * right,
                left.y() * right
        );
    }

    public static <R> R multiply(Vector2.Accessible left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * right.x(),
                left.y() * right.y()
        );
    }

    public static void multiply(Vector2.Consumer result, Vector2.Accessible left, Vector2.Accessible right) {
        result.xy(
                left.x() * right.x(),
                left.y() * right.y()
        );
    }

    public static <R> R divide(Vector2.Accessible left, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() / right,
                left.y() / right
        );
    }

    public static void divide(Vector2.Consumer result, Vector2.Accessible left, double right) {
        result.xy(
                left.x() / right,
                left.y() / right
        );
    }

    public static <R> R divide(Vector2.Accessible left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() / right.x(),
                left.y() / right.y()
        );
    }

    public static void divide(Vector2.Consumer result, Vector2.Accessible left, Vector2.Accessible right) {
        result.xy(
                left.x() / right.x(),
                left.y() / right.y()
        );
    }

    public static <R> R divide(double left, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left / right.x(),
                left / right.y()
        );
    }

    public static void divide(Vector2.Consumer result, double left, Vector2.Accessible right) {
        result.xy(
                left / right.x(),
                left / right.y()
        );
    }

    public static <R> R multiplyAdd(Vector2.Accessible left, double middle, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle + right,
                left.y() * middle + right
        );
    }

    public static void multiplyAdd(Vector2.Consumer result, Vector2.Accessible left, double middle, double right) {
        result.xy(
                left.x() * middle + right,
                left.y() * middle + right
        );
    }

    public static <R> R multiplyAdd(Vector2.Accessible left, Vector2.Accessible middle, double right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle.x() + right,
                left.y() * middle.y() + right
        );
    }

    public static void multiplyAdd(Vector2.Consumer result, Vector2.Accessible left, Vector2.Accessible middle, double right) {
        result.xy(
                left.x() * middle.x() + right,
                left.y() * middle.y() + right
        );
    }

    public static <R> R multiplyAdd(Vector2.Accessible left, double middle, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle + right.x(),
                left.y() * middle + right.y()
        );
    }

    public static void multiplyAdd(Vector2.Consumer result, Vector2.Accessible left, double middle, Vector2.Accessible right) {
        result.xy(
                left.x() * middle + right.x(),
                left.y() * middle + right.y()
        );
    }

    public static <R> R multiplyAdd(Vector2.Accessible left, Vector2.Accessible middle, Vector2.Accessible right, Vector2.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle.x() + right.x(),
                left.y() * middle.y() + right.y()
        );
    }

    public static void multiplyAdd(Vector2.Consumer result, Vector2.Accessible left, Vector2.Accessible middle, Vector2.Accessible right) {
        result.xy(
                left.x() * middle.x() + right.x(),
                left.y() * middle.y() + right.y()
        );
    }

    public static double lengthSqr(Vector2.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        return x * x + y * y;
    }

    public static double distanceSqr(Vector2.Accessible a, double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        return x * x + y * y;
    }

    public static double distanceSqr(Vector2.Accessible a, Vector2.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        return x * x + y * y;
    }

    public static double length(Vector2.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        return Math.sqrt(x * x + y * y);
    }

    public static double distance(Vector2.Accessible a, double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        return Math.sqrt(x * x + y * y);
    }

    public static double distance(Vector2.Accessible a, Vector2.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        return Math.sqrt(x * x + y * y);
    }

    public static double dot(Vector2.Accessible a, double b) {
        return a.x() * b + a.y() * b;
    }

    public static double dot(Vector2.Accessible a, Vector2.Accessible b) {
        return a.x() * b.x() + a.y() * b.y();
    }

    public static <R> R normalize(Vector2.Accessible vector, Vector2.Factory<R> resultFactory) {
        final double length = length(vector);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);
        return resultFactory.create(
                vector.x() * inverseLength,
                vector.y() * inverseLength
        );
    }

    public static void normalize(Vector2.Consumer result, Vector2.Accessible vector) {
        final double length = length(vector);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);
        result.xy(
                vector.x() * inverseLength,
                vector.y() * inverseLength
        );
    }

    public static <R> R reflect(Vector2.Accessible incident, Vector2.Accessible normal, Vector2.Factory<R> resultFactory) {
        final double dotNI2 = dot(normal, incident) * 2.0D;
        return resultFactory.create(
                incident.x() - dotNI2 * normal.x(),
                incident.y() - dotNI2 * normal.y()
        );
    }

    public static void reflect(Vector2.Consumer result, Vector2.Accessible incident, Vector2.Accessible normal) {
        final double dotNI2 = dot(normal, incident) * 2.0D;
        result.xy(
                incident.x() - dotNI2 * normal.x(),
                incident.y() - dotNI2 * normal.y()
        );
    }

    public static <R> R refract(Vector2.Accessible incident, Vector2.Accessible normal, double eta, Vector2.Factory<R> resultFactory) {
        final double dotNI = dot(normal, incident);
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);
        if (k < 0.0D) {
            return resultFactory.create(0.0D, 0.0D);
        }
        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);
        return resultFactory.create(
                eta * incident.x() - etaNIsqrtK * normal.x(),
                eta * incident.y() - etaNIsqrtK * normal.y()
        );
    }

    public static void refract(Vector2.Consumer result, Vector2.Accessible incident, Vector2.Accessible normal, double eta) {
        final double dotNI = dot(normal, incident);
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);
        if (k < 0.0D) {
            result.xy(0.0D, 0.0D);
            return;
        }
        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);
        result.xy(
                eta * incident.x() - etaNIsqrtK * normal.x(),
                eta * incident.y() - etaNIsqrtK * normal.y()
        );
    }

    public static <R> R min(Vector3.Accessible value1, double value2, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.x(), value2),
                min(value1.y(), value2),
                min(value1.z(), value2)
        );
    }

    public static void min(Vector3.Consumer result, Vector3.Accessible value1, double value2) {
        result.xyz(
                min(value1.x(), value2),
                min(value1.y(), value2),
                min(value1.z(), value2)
        );
    }

    public static <R> R min(Vector3.Accessible value1, Vector3.Accessible value2, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.x(), value2.x()),
                min(value1.y(), value2.y()),
                min(value1.z(), value2.z())
        );
    }

    public static void min(Vector3.Consumer result, Vector3.Accessible value1, Vector3.Accessible value2) {
        result.xyz(
                min(value1.x(), value2.x()),
                min(value1.y(), value2.y()),
                min(value1.z(), value2.z())
        );
    }

    public static <R> R max(Vector3.Accessible value1, double value2, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.x(), value2),
                max(value1.y(), value2),
                max(value1.z(), value2)
        );
    }

    public static void max(Vector3.Consumer result, Vector3.Accessible value1, double value2) {
        result.xyz(
                max(value1.x(), value2),
                max(value1.y(), value2),
                max(value1.z(), value2)
        );
    }

    public static <R> R max(Vector3.Accessible value1, Vector3.Accessible value2, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.x(), value2.x()),
                max(value1.y(), value2.y()),
                max(value1.z(), value2.z())
        );
    }

    public static void max(Vector3.Consumer result, Vector3.Accessible value1, Vector3.Accessible value2) {
        result.xyz(
                max(value1.x(), value2.x()),
                max(value1.y(), value2.y()),
                max(value1.z(), value2.z())
        );
    }

    public static <R> R clamp(Vector3.Accessible value, double min, double max, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min, max),
                clamp(value.y(), min, max),
                clamp(value.z(), min, max)
        );
    }

    public static void clamp(Vector3.Consumer result, Vector3.Accessible value, double min, double max) {
        result.xyz(
                clamp(value.x(), min, max),
                clamp(value.y(), min, max),
                clamp(value.z(), min, max)
        );
    }

    public static <R> R clamp(Vector3.Accessible value, Vector3.Accessible min, double max, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min.x(), max),
                clamp(value.y(), min.y(), max),
                clamp(value.z(), min.z(), max)
        );
    }

    public static void clamp(Vector3.Consumer result, Vector3.Accessible value, Vector3.Accessible min, double max) {
        result.xyz(
                clamp(value.x(), min.x(), max),
                clamp(value.y(), min.y(), max),
                clamp(value.z(), min.z(), max)
        );
    }

    public static <R> R clamp(Vector3.Accessible value, double min, Vector3.Accessible max, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min, max.x()),
                clamp(value.y(), min, max.y()),
                clamp(value.z(), min, max.z())
        );
    }

    public static void clamp(Vector3.Consumer result, Vector3.Accessible value, double min, Vector3.Accessible max) {
        result.xyz(
                clamp(value.x(), min, max.x()),
                clamp(value.y(), min, max.y()),
                clamp(value.z(), min, max.z())
        );
    }

    public static <R> R clamp(Vector3.Accessible value, Vector3.Accessible min, Vector3.Accessible max, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min.x(), max.x()),
                clamp(value.y(), min.y(), max.y()),
                clamp(value.z(), min.z(), max.z())
        );
    }

    public static void clamp(Vector3.Consumer result, Vector3.Accessible value, Vector3.Accessible min, Vector3.Accessible max) {
        result.xyz(
                clamp(value.x(), min.x(), max.x()),
                clamp(value.y(), min.y(), max.y()),
                clamp(value.z(), min.z(), max.z())
        );
    }

    public static <R> R clamp(double value, Vector3.Accessible min, Vector3.Accessible max, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value, min.x(), max.x()),
                clamp(value, min.y(), max.y()),
                clamp(value, min.z(), max.z())
        );
    }

    public static void clamp(Vector3.Consumer result, double value, Vector3.Accessible min, Vector3.Accessible max) {
        result.xyz(
                clamp(value, min.x(), max.x()),
                clamp(value, min.y(), max.y()),
                clamp(value, min.z(), max.z())
        );
    }

    public static <R> R lerp(Vector3.Accessible value1, Vector3.Accessible value2, double t, Vector3.Factory<R> resultFactory) {
        final double oneMinusT = 1.0D - t;
        return resultFactory.create(
                value1.x() * oneMinusT + value2.x() * t,
                value1.y() * oneMinusT + value2.y() * t,
                value1.z() * oneMinusT + value2.z() * t
        );
    }

    public static void lerp(Vector3.Consumer result, Vector3.Accessible value1, Vector3.Accessible value2, double t) {
        final double oneMinusT = 1.0D - t;
        result.xyz(
                value1.x() * oneMinusT + value2.x() * t,
                value1.y() * oneMinusT + value2.y() * t,
                value1.z() * oneMinusT + value2.z() * t
        );
    }

    public static <R> R lerp(Vector3.Accessible value1, double value2, Vector3.Accessible t, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.x(), value2, t.x()),
                lerp(value1.y(), value2, t.y()),
                lerp(value1.z(), value2, t.z())
        );
    }

    public static void lerp(Vector3.Consumer result, Vector3.Accessible value1, double value2, Vector3.Accessible t) {
        result.xyz(
                lerp(value1.x(), value2, t.x()),
                lerp(value1.y(), value2, t.y()),
                lerp(value1.z(), value2, t.z())
        );
    }

    public static <R> R lerp(Vector3.Accessible value1, Vector3.Accessible value2, Vector3.Accessible t, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.x(), value2.x(), t.x()),
                lerp(value1.y(), value2.y(), t.y()),
                lerp(value1.z(), value2.z(), t.z())
        );
    }

    public static void lerp(Vector3.Consumer result, Vector3.Accessible value1, Vector3.Accessible value2, Vector3.Accessible t) {
        result.xyz(
                lerp(value1.x(), value2.x(), t.x()),
                lerp(value1.y(), value2.y(), t.y()),
                lerp(value1.z(), value2.z(), t.z())
        );
    }

    public static <R> R negate(Vector3.Accessible value, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                -value.x(),
                -value.y(),
                -value.z()
        );
    }

    public static void negate(Vector3.Consumer result, Vector3.Accessible value) {
        result.xyz(
                -value.x(),
                -value.y(),
                -value.z()
        );
    }

    public static <R> R add(Vector3.Accessible left, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() + right,
                left.y() + right,
                left.z() + right
        );
    }

    public static void add(Vector3.Consumer result, Vector3.Accessible left, double right) {
        result.xyz(
                left.x() + right,
                left.y() + right,
                left.z() + right
        );
    }

    public static <R> R add(Vector3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() + right.x(),
                left.y() + right.y(),
                left.z() + right.z()
        );
    }

    public static void add(Vector3.Consumer result, Vector3.Accessible left, Vector3.Accessible right) {
        result.xyz(
                left.x() + right.x(),
                left.y() + right.y(),
                left.z() + right.z()
        );
    }

    public static <R> R subtract(Vector3.Accessible left, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() - right,
                left.y() - right,
                left.z() - right
        );
    }

    public static void subtract(Vector3.Consumer result, Vector3.Accessible left, double right) {
        result.xyz(
                left.x() - right,
                left.y() - right,
                left.z() - right
        );
    }

    public static <R> R subtract(Vector3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() - right.x(),
                left.y() - right.y(),
                left.z() - right.z()
        );
    }

    public static void subtract(Vector3.Consumer result, Vector3.Accessible left, Vector3.Accessible right) {
        result.xyz(
                left.x() - right.x(),
                left.y() - right.y(),
                left.z() - right.z()
        );
    }

    public static <R> R subtract(double left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left - right.x(),
                left - right.y(),
                left - right.z()
        );
    }

    public static void subtract(Vector3.Consumer result, double left, Vector3.Accessible right) {
        result.xyz(
                left - right.x(),
                left - right.y(),
                left - right.z()
        );
    }

    public static <R> R multiply(Vector3.Accessible left, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * right,
                left.y() * right,
                left.z() * right
        );
    }

    public static void multiply(Vector3.Consumer result, Vector3.Accessible left, double right) {
        result.xyz(
                left.x() * right,
                left.y() * right,
                left.z() * right
        );
    }

    public static <R> R multiply(Vector3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * right.x(),
                left.y() * right.y(),
                left.z() * right.z()
        );
    }

    public static void multiply(Vector3.Consumer result, Vector3.Accessible left, Vector3.Accessible right) {
        result.xyz(
                left.x() * right.x(),
                left.y() * right.y(),
                left.z() * right.z()
        );
    }

    public static <R> R divide(Vector3.Accessible left, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() / right,
                left.y() / right,
                left.z() / right
        );
    }

    public static void divide(Vector3.Consumer result, Vector3.Accessible left, double right) {
        result.xyz(
                left.x() / right,
                left.y() / right,
                left.z() / right
        );
    }

    public static <R> R divide(Vector3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() / right.x(),
                left.y() / right.y(),
                left.z() / right.z()
        );
    }

    public static void divide(Vector3.Consumer result, Vector3.Accessible left, Vector3.Accessible right) {
        result.xyz(
                left.x() / right.x(),
                left.y() / right.y(),
                left.z() / right.z()
        );
    }

    public static <R> R divide(double left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left / right.x(),
                left / right.y(),
                left / right.z()
        );
    }

    public static void divide(Vector3.Consumer result, double left, Vector3.Accessible right) {
        result.xyz(
                left / right.x(),
                left / right.y(),
                left / right.z()
        );
    }

    public static <R> R multiplyAdd(Vector3.Accessible left, double middle, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle + right,
                left.y() * middle + right,
                left.z() * middle + right
        );
    }

    public static void multiplyAdd(Vector3.Consumer result, Vector3.Accessible left, double middle, double right) {
        result.xyz(
                left.x() * middle + right,
                left.y() * middle + right,
                left.z() * middle + right
        );
    }

    public static <R> R multiplyAdd(Vector3.Accessible left, Vector3.Accessible middle, double right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle.x() + right,
                left.y() * middle.y() + right,
                left.z() * middle.z() + right
        );
    }

    public static void multiplyAdd(Vector3.Consumer result, Vector3.Accessible left, Vector3.Accessible middle, double right) {
        result.xyz(
                left.x() * middle.x() + right,
                left.y() * middle.y() + right,
                left.z() * middle.z() + right
        );
    }

    public static <R> R multiplyAdd(Vector3.Accessible left, double middle, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle + right.x(),
                left.y() * middle + right.y(),
                left.z() * middle + right.z()
        );
    }

    public static void multiplyAdd(Vector3.Consumer result, Vector3.Accessible left, double middle, Vector3.Accessible right) {
        result.xyz(
                left.x() * middle + right.x(),
                left.y() * middle + right.y(),
                left.z() * middle + right.z()
        );
    }

    public static <R> R multiplyAdd(Vector3.Accessible left, Vector3.Accessible middle, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle.x() + right.x(),
                left.y() * middle.y() + right.y(),
                left.z() * middle.z() + right.z()
        );
    }

    public static void multiplyAdd(Vector3.Consumer result, Vector3.Accessible left, Vector3.Accessible middle, Vector3.Accessible right) {
        result.xyz(
                left.x() * middle.x() + right.x(),
                left.y() * middle.y() + right.y(),
                left.z() * middle.z() + right.z()
        );
    }

    public static double lengthSqr(Vector3.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        return x * x + y * y + z * z;
    }

    public static double distanceSqr(Vector3.Accessible a, double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        return x * x + y * y + z * z;
    }

    public static double distanceSqr(Vector3.Accessible a, Vector3.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        return x * x + y * y + z * z;
    }

    public static double length(Vector3.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance(Vector3.Accessible a, double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance(Vector3.Accessible a, Vector3.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double dot(Vector3.Accessible a, double b) {
        return a.x() * b + a.y() * b + a.z() * b;
    }

    public static double dot(Vector3.Accessible a, Vector3.Accessible b) {
        return a.x() * b.x() + a.y() * b.y() + a.z() * b.z();
    }

    public static <R> R cross(Vector3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> result) {
        final double leftX = left.x();
        final double leftY = left.y();
        final double leftZ = left.z();

        final double rightX = right.x();
        final double rightY = right.y();
        final double rightZ = right.z();

        return result.create(
                leftY * rightZ - rightY * leftZ,
                leftZ * rightX - rightZ * leftX,
                leftX * rightY - rightX * leftY
        );
    }

    public static void cross(Vector3.Accessible left, Vector3.Accessible right, Vector3.Consumer result) {
        final double leftX = left.x();
        final double leftY = left.y();
        final double leftZ = left.z();

        final double rightX = right.x();
        final double rightY = right.y();
        final double rightZ = right.z();

        result.xyz(
                leftY * rightZ - rightY * leftZ,
                leftZ * rightX - rightZ * leftX,
                leftX * rightY - rightX * leftY
        );
    }

    public static <R> R normalize(Vector3.Accessible vector, Vector3.Factory<R> resultFactory) {
        final double length = length(vector);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);
        return resultFactory.create(
                vector.x() * inverseLength,
                vector.y() * inverseLength,
                vector.z() * inverseLength
        );
    }

    public static void normalize(Vector3.Consumer result, Vector3.Accessible vector) {
        final double length = length(vector);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);
        result.xyz(
                vector.x() * inverseLength,
                vector.y() * inverseLength,
                vector.z() * inverseLength
        );
    }

    public static <R> R reflect(Vector3.Accessible incident, Vector3.Accessible normal, Vector3.Factory<R> resultFactory) {
        final double dotNI2 = dot(normal, incident) * 2.0D;
        return resultFactory.create(
                incident.x() - dotNI2 * normal.x(),
                incident.y() - dotNI2 * normal.y(),
                incident.z() - dotNI2 * normal.z()
        );
    }

    public static void reflect(Vector3.Consumer result, Vector3.Accessible incident, Vector3.Accessible normal) {
        final double dotNI2 = dot(normal, incident) * 2.0D;
        result.xyz(
                incident.x() - dotNI2 * normal.x(),
                incident.y() - dotNI2 * normal.y(),
                incident.z() - dotNI2 * normal.z()
        );
    }

    public static <R> R refract(Vector3.Accessible incident, Vector3.Accessible normal, double eta, Vector3.Factory<R> resultFactory) {
        final double dotNI = dot(normal, incident);
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);
        if (k < 0.0D) {
            return resultFactory.create(0.0D, 0.0D, 0.0D);
        }
        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);
        return resultFactory.create(
                eta * incident.x() - etaNIsqrtK * normal.x(),
                eta * incident.y() - etaNIsqrtK * normal.y(),
                eta * incident.z() - etaNIsqrtK * normal.z()
        );
    }

    public static void refract(Vector3.Consumer result, Vector3.Accessible incident, Vector3.Accessible normal, double eta) {
        final double dotNI = dot(normal, incident);
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);
        if (k < 0.0D) {
            result.xyz(0.0D, 0.0D, 0.0D);
            return;
        }
        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);
        result.xyz(
                eta * incident.x() - etaNIsqrtK * normal.x(),
                eta * incident.y() - etaNIsqrtK * normal.y(),
                eta * incident.z() - etaNIsqrtK * normal.z()
        );
    }

    public static <R> R min(Vector4.Accessible value1, double value2, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.x(), value2),
                min(value1.y(), value2),
                min(value1.z(), value2),
                min(value1.w(), value2)
        );
    }

    public static void min(Vector4.Consumer result, Vector4.Accessible value1, double value2) {
        result.xyzw(
                min(value1.x(), value2),
                min(value1.y(), value2),
                min(value1.z(), value2),
                min(value1.w(), value2)
        );
    }

    public static <R> R min(Vector4.Accessible value1, Vector4.Accessible value2, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.x(), value2.x()),
                min(value1.y(), value2.y()),
                min(value1.z(), value2.z()),
                min(value1.w(), value2.w())
        );
    }

    public static void min(Vector4.Consumer result, Vector4.Accessible value1, Vector4.Accessible value2) {
        result.xyzw(
                min(value1.x(), value2.x()),
                min(value1.y(), value2.y()),
                min(value1.z(), value2.z()),
                min(value1.w(), value2.w())
        );
    }

    public static <R> R max(Vector4.Accessible value1, double value2, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.x(), value2),
                max(value1.y(), value2),
                max(value1.z(), value2),
                max(value1.w(), value2)
        );
    }

    public static void max(Vector4.Consumer result, Vector4.Accessible value1, double value2) {
        result.xyzw(
                max(value1.x(), value2),
                max(value1.y(), value2),
                max(value1.z(), value2),
                max(value1.w(), value2)
        );
    }

    public static <R> R max(Vector4.Accessible value1, Vector4.Accessible value2, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.x(), value2.x()),
                max(value1.y(), value2.y()),
                max(value1.z(), value2.z()),
                max(value1.w(), value2.w())
        );
    }

    public static void max(Vector4.Consumer result, Vector4.Accessible value1, Vector4.Accessible value2) {
        result.xyzw(
                max(value1.x(), value2.x()),
                max(value1.y(), value2.y()),
                max(value1.z(), value2.z()),
                max(value1.w(), value2.w())
        );
    }

    public static <R> R clamp(Vector4.Accessible value, double min, double max, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min, max),
                clamp(value.y(), min, max),
                clamp(value.z(), min, max),
                clamp(value.w(), min, max)
        );
    }

    public static void clamp(Vector4.Consumer result, Vector4.Accessible value, double min, double max) {
        result.xyzw(
                clamp(value.x(), min, max),
                clamp(value.y(), min, max),
                clamp(value.z(), min, max),
                clamp(value.w(), min, max)
        );
    }

    public static <R> R clamp(Vector4.Accessible value, Vector4.Accessible min, double max, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min.x(), max),
                clamp(value.y(), min.y(), max),
                clamp(value.z(), min.z(), max),
                clamp(value.w(), min.w(), max)
        );
    }

    public static void clamp(Vector4.Consumer result, Vector4.Accessible value, Vector4.Accessible min, double max) {
        result.xyzw(
                clamp(value.x(), min.x(), max),
                clamp(value.y(), min.y(), max),
                clamp(value.z(), min.z(), max),
                clamp(value.w(), min.w(), max)
        );
    }

    public static <R> R clamp(Vector4.Accessible value, double min, Vector4.Accessible max, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min, max.x()),
                clamp(value.y(), min, max.y()),
                clamp(value.z(), min, max.z()),
                clamp(value.w(), min, max.w())
        );
    }

    public static void clamp(Vector4.Consumer result, Vector4.Accessible value, double min, Vector4.Accessible max) {
        result.xyzw(
                clamp(value.x(), min, max.x()),
                clamp(value.y(), min, max.y()),
                clamp(value.z(), min, max.z()),
                clamp(value.w(), min, max.w())
        );
    }

    public static <R> R clamp(Vector4.Accessible value, Vector4.Accessible min, Vector4.Accessible max, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.x(), min.x(), max.x()),
                clamp(value.y(), min.y(), max.y()),
                clamp(value.z(), min.z(), max.z()),
                clamp(value.w(), min.w(), max.w())
        );
    }

    public static void clamp(Vector4.Consumer result, Vector4.Accessible value, Vector4.Accessible min, Vector4.Accessible max) {
        result.xyzw(
                clamp(value.x(), min.x(), max.x()),
                clamp(value.y(), min.y(), max.y()),
                clamp(value.z(), min.z(), max.z()),
                clamp(value.w(), min.w(), max.w())
        );
    }

    public static <R> R clamp(double value, Vector4.Accessible min, Vector4.Accessible max, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value, min.x(), max.x()),
                clamp(value, min.y(), max.y()),
                clamp(value, min.z(), max.z()),
                clamp(value, min.w(), max.w())
        );
    }

    public static void clamp(Vector4.Consumer result, double value, Vector4.Accessible min, Vector4.Accessible max) {
        result.xyzw(
                clamp(value, min.x(), max.x()),
                clamp(value, min.y(), max.y()),
                clamp(value, min.z(), max.z()),
                clamp(value, min.w(), max.w())
        );
    }

    public static <R> R lerp(Vector4.Accessible value1, Vector4.Accessible value2, double t, Vector4.Factory<R> resultFactory) {
        final double oneMinusT = 1.0D - t;
        return resultFactory.create(
                value1.x() * oneMinusT + value2.x() * t,
                value1.y() * oneMinusT + value2.y() * t,
                value1.z() * oneMinusT + value2.z() * t,
                value1.w() * oneMinusT + value2.w() * t
        );
    }

    public static void lerp(Vector4.Consumer result, Vector4.Accessible value1, Vector4.Accessible value2, double t) {
        final double oneMinusT = 1.0D - t;
        result.xyzw(
                value1.x() * oneMinusT + value2.x() * t,
                value1.y() * oneMinusT + value2.y() * t,
                value1.z() * oneMinusT + value2.z() * t,
                value1.w() * oneMinusT + value2.w() * t
        );
    }

    public static <R> R lerp(Vector4.Accessible value1, double value2, Vector4.Accessible t, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.x(), value2, t.x()),
                lerp(value1.y(), value2, t.y()),
                lerp(value1.z(), value2, t.z()),
                lerp(value1.w(), value2, t.w())
        );
    }

    public static void lerp(Vector4.Consumer result, Vector4.Accessible value1, double value2, Vector4.Accessible t) {
        result.xyzw(
                lerp(value1.x(), value2, t.x()),
                lerp(value1.y(), value2, t.y()),
                lerp(value1.z(), value2, t.z()),
                lerp(value1.w(), value2, t.w())
        );
    }

    public static <R> R lerp(Vector4.Accessible value1, Vector4.Accessible value2, Vector4.Accessible t, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.x(), value2.x(), t.x()),
                lerp(value1.y(), value2.y(), t.y()),
                lerp(value1.z(), value2.z(), t.z()),
                lerp(value1.w(), value2.w(), t.w())
        );
    }

    public static void lerp(Vector4.Consumer result, Vector4.Accessible value1, Vector4.Accessible value2, Vector4.Accessible t) {
        result.xyzw(
                lerp(value1.x(), value2.x(), t.x()),
                lerp(value1.y(), value2.y(), t.y()),
                lerp(value1.z(), value2.z(), t.z()),
                lerp(value1.w(), value2.w(), t.w())
        );
    }

    public static <R> R negate(Vector4.Accessible value, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                -value.x(),
                -value.y(),
                -value.z(),
                -value.w()
        );
    }

    public static void negate(Vector4.Consumer result, Vector4.Accessible value) {
        result.xyzw(
                -value.x(),
                -value.y(),
                -value.z(),
                -value.w()
        );
    }

    public static <R> R add(Vector4.Accessible left, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() + right,
                left.y() + right,
                left.z() + right,
                left.w() + right
        );
    }

    public static void add(Vector4.Consumer result, Vector4.Accessible left, double right) {
        result.xyzw(
                left.x() + right,
                left.y() + right,
                left.z() + right,
                left.w() + right
        );
    }

    public static <R> R add(Vector4.Accessible left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() + right.x(),
                left.y() + right.y(),
                left.z() + right.z(),
                left.w() + right.w()
        );
    }

    public static void add(Vector4.Consumer result, Vector4.Accessible left, Vector4.Accessible right) {
        result.xyzw(
                left.x() + right.x(),
                left.y() + right.y(),
                left.z() + right.z(),
                left.w() + right.w()
        );
    }

    public static <R> R subtract(Vector4.Accessible left, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() - right,
                left.y() - right,
                left.z() - right,
                left.w() - right
        );
    }

    public static void subtract(Vector4.Consumer result, Vector4.Accessible left, double right) {
        result.xyzw(
                left.x() - right,
                left.y() - right,
                left.z() - right,
                left.w() - right
        );
    }

    public static <R> R subtract(Vector4.Accessible left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() - right.x(),
                left.y() - right.y(),
                left.z() - right.z(),
                left.w() - right.w()
        );
    }

    public static void subtract(Vector4.Consumer result, Vector4.Accessible left, Vector4.Accessible right) {
        result.xyzw(
                left.x() - right.x(),
                left.y() - right.y(),
                left.z() - right.z(),
                left.w() - right.w()
        );
    }

    public static <R> R subtract(double left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left - right.x(),
                left - right.y(),
                left - right.z(),
                left - right.w()
        );
    }

    public static void subtract(Vector4.Consumer result, double left, Vector4.Accessible right) {
        result.xyzw(
                left - right.x(),
                left - right.y(),
                left - right.z(),
                left - right.w()
        );
    }

    public static <R> R multiply(Vector4.Accessible left, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * right,
                left.y() * right,
                left.z() * right,
                left.w() * right
        );
    }

    public static void multiply(Vector4.Consumer result, Vector4.Accessible left, double right) {
        result.xyzw(
                left.x() * right,
                left.y() * right,
                left.z() * right,
                left.w() * right
        );
    }

    public static <R> R multiply(Vector4.Accessible left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * right.x(),
                left.y() * right.y(),
                left.z() * right.z(),
                left.w() * right.w()
        );
    }

    public static void multiply(Vector4.Consumer result, Vector4.Accessible left, Vector4.Accessible right) {
        result.xyzw(
                left.x() * right.x(),
                left.y() * right.y(),
                left.z() * right.z(),
                left.w() * right.w()
        );
    }

    public static <R> R divide(Vector4.Accessible left, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() / right,
                left.y() / right,
                left.z() / right,
                left.w() / right
        );
    }

    public static void divide(Vector4.Consumer result, Vector4.Accessible left, double right) {
        result.xyzw(
                left.x() / right,
                left.y() / right,
                left.z() / right,
                left.w() / right
        );
    }

    public static <R> R divide(Vector4.Accessible left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() / right.x(),
                left.y() / right.y(),
                left.z() / right.z(),
                left.w() / right.w()
        );
    }

    public static void divide(Vector4.Consumer result, Vector4.Accessible left, Vector4.Accessible right) {
        result.xyzw(
                left.x() / right.x(),
                left.y() / right.y(),
                left.z() / right.z(),
                left.w() / right.w()
        );
    }

    public static <R> R divide(double left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left / right.x(),
                left / right.y(),
                left / right.z(),
                left / right.w()
        );
    }

    public static void divide(Vector4.Consumer result, double left, Vector4.Accessible right) {
        result.xyzw(
                left / right.x(),
                left / right.y(),
                left / right.z(),
                left / right.w()
        );
    }

    public static <R> R multiplyAdd(Vector4.Accessible left, double middle, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle + right,
                left.y() * middle + right,
                left.z() * middle + right,
                left.w() * middle + right
        );
    }

    public static void multiplyAdd(Vector4.Consumer result, Vector4.Accessible left, double middle, double right) {
        result.xyzw(
                left.x() * middle + right,
                left.y() * middle + right,
                left.z() * middle + right,
                left.w() * middle + right
        );
    }

    public static <R> R multiplyAdd(Vector4.Accessible left, Vector4.Accessible middle, double right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle.x() + right,
                left.y() * middle.y() + right,
                left.z() * middle.z() + right,
                left.w() * middle.w() + right
        );
    }

    public static void multiplyAdd(Vector4.Consumer result, Vector4.Accessible left, Vector4.Accessible middle, double right) {
        result.xyzw(
                left.x() * middle.x() + right,
                left.y() * middle.y() + right,
                left.z() * middle.z() + right,
                left.w() * middle.w() + right
        );
    }

    public static <R> R multiplyAdd(Vector4.Accessible left, double middle, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle + right.x(),
                left.y() * middle + right.y(),
                left.z() * middle + right.z(),
                left.w() * middle + right.w()
        );
    }

    public static void multiplyAdd(Vector4.Consumer result, Vector4.Accessible left, double middle, Vector4.Accessible right) {
        result.xyzw(
                left.x() * middle + right.x(),
                left.y() * middle + right.y(),
                left.z() * middle + right.z(),
                left.w() * middle + right.w()
        );
    }

    public static <R> R multiplyAdd(Vector4.Accessible left, Vector4.Accessible middle, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.x() * middle.x() + right.x(),
                left.y() * middle.y() + right.y(),
                left.z() * middle.z() + right.z(),
                left.w() * middle.w() + right.w()
        );
    }

    public static void multiplyAdd(Vector4.Consumer result, Vector4.Accessible left, Vector4.Accessible middle, Vector4.Accessible right) {
        result.xyzw(
                left.x() * middle.x() + right.x(),
                left.y() * middle.y() + right.y(),
                left.z() * middle.z() + right.z(),
                left.w() * middle.w() + right.w()
        );
    }

    public static double lengthSqr(Vector4.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();
        return x * x + y * y + z * z + w * w;
    }

    public static double distanceSqr(Vector4.Accessible a, double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        final double w = a.w() - b;
        return x * x + y * y + z * z + w * w;
    }

    public static double distanceSqr(Vector4.Accessible a, Vector4.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        final double w = a.w() - b.w();
        return x * x + y * y + z * z + w * w;
    }

    public static double length(Vector4.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();
        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double distance(Vector4.Accessible a, double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        final double w = a.w() - b;
        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double distance(Vector4.Accessible a, Vector4.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        final double w = a.w() - b.w();
        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double dot(Vector4.Accessible a, double b) {
        return a.x() * b + a.y() * b + a.z() * b + a.w() * b;
    }

    public static double dot(Vector4.Accessible a, Vector4.Accessible b) {
        return a.x() * b.x() + a.y() * b.y() + a.z() * b.z() + a.w() * b.w();
    }

    public static <R> R normalize(Vector4.Accessible vector, Vector4.Factory<R> resultFactory) {
        final double length = length(vector);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);
        return resultFactory.create(
                vector.x() * inverseLength,
                vector.y() * inverseLength,
                vector.z() * inverseLength,
                vector.w() * inverseLength
        );
    }

    public static void normalize(Vector4.Consumer result, Vector4.Accessible vector) {
        final double length = length(vector);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);
        result.xyzw(
                vector.x() * inverseLength,
                vector.y() * inverseLength,
                vector.z() * inverseLength,
                vector.w() * inverseLength
        );
    }

    public static <R> R reflect(Vector4.Accessible incident, Vector4.Accessible normal, Vector4.Factory<R> resultFactory) {
        final double dotNI2 = dot(normal, incident) * 2.0D;
        return resultFactory.create(
                incident.x() - dotNI2 * normal.x(),
                incident.y() - dotNI2 * normal.y(),
                incident.z() - dotNI2 * normal.z(),
                incident.w() - dotNI2 * normal.w()
        );
    }

    public static void reflect(Vector4.Consumer result, Vector4.Accessible incident, Vector4.Accessible normal) {
        final double dotNI2 = dot(normal, incident) * 2.0D;
        result.xyzw(
                incident.x() - dotNI2 * normal.x(),
                incident.y() - dotNI2 * normal.y(),
                incident.z() - dotNI2 * normal.z(),
                incident.w() - dotNI2 * normal.w()
        );
    }

    public static <R> R refract(Vector4.Accessible incident, Vector4.Accessible normal, double eta, Vector4.Factory<R> resultFactory) {
        final double dotNI = dot(normal, incident);
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);
        if (k < 0.0D) {
            return resultFactory.create(0.0D, 0.0D, 0.0D, 0.0D);
        }
        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);
        return resultFactory.create(
                eta * incident.x() - etaNIsqrtK * normal.x(),
                eta * incident.y() - etaNIsqrtK * normal.y(),
                eta * incident.z() - etaNIsqrtK * normal.z(),
                eta * incident.w() - etaNIsqrtK * normal.w()
        );
    }

    public static void refract(Vector4.Consumer result, Vector4.Accessible incident, Vector4.Accessible normal, double eta) {
        final double dotNI = dot(normal, incident);
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);
        if (k < 0.0D) {
            result.xyzw(0.0D, 0.0D, 0.0D, 0.0D);
            return;
        }
        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);
        result.xyzw(
                eta * incident.x() - etaNIsqrtK * normal.x(),
                eta * incident.y() - etaNIsqrtK * normal.y(),
                eta * incident.z() - etaNIsqrtK * normal.z(),
                eta * incident.w() - etaNIsqrtK * normal.w()
        );
    }

    public static <R> R min(Matrix3x3.Accessible value1, double value2, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.Xx(), value2),
                min(value1.Xy(), value2),
                min(value1.Xz(), value2),
                min(value1.Yx(), value2),
                min(value1.Yy(), value2),
                min(value1.Yz(), value2),
                min(value1.Zx(), value2),
                min(value1.Zy(), value2),
                min(value1.Zz(), value2)
        );
    }

    public static void min(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, double value2) {
        result.set3x3(
                min(value1.Xx(), value2),
                min(value1.Xy(), value2),
                min(value1.Xz(), value2),
                min(value1.Yx(), value2),
                min(value1.Yy(), value2),
                min(value1.Yz(), value2),
                min(value1.Zx(), value2),
                min(value1.Zy(), value2),
                min(value1.Zz(), value2)
        );
    }

    public static <R> R min(Matrix3x3.Accessible value1, Matrix3x3.Accessible value2, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.Xx(), value2.Xx()),
                min(value1.Xy(), value2.Xy()),
                min(value1.Xz(), value2.Xz()),
                min(value1.Yx(), value2.Yx()),
                min(value1.Yy(), value2.Yy()),
                min(value1.Yz(), value2.Yz()),
                min(value1.Zx(), value2.Zx()),
                min(value1.Zy(), value2.Zy()),
                min(value1.Zz(), value2.Zz())
        );
    }

    public static void min(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, Matrix3x3.Accessible value2) {
        result.set3x3(
                min(value1.Xx(), value2.Xx()),
                min(value1.Xy(), value2.Xy()),
                min(value1.Xz(), value2.Xz()),
                min(value1.Yx(), value2.Yx()),
                min(value1.Yy(), value2.Yy()),
                min(value1.Yz(), value2.Yz()),
                min(value1.Zx(), value2.Zx()),
                min(value1.Zy(), value2.Zy()),
                min(value1.Zz(), value2.Zz())
        );
    }

    public static <R> R max(Matrix3x3.Accessible value1, double value2, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.Xx(), value2),
                max(value1.Xy(), value2),
                max(value1.Xz(), value2),
                max(value1.Yx(), value2),
                max(value1.Yy(), value2),
                max(value1.Yz(), value2),
                max(value1.Zx(), value2),
                max(value1.Zy(), value2),
                max(value1.Zz(), value2)
        );
    }

    public static void max(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, double value2) {
        result.set3x3(
                max(value1.Xx(), value2),
                max(value1.Xy(), value2),
                max(value1.Xz(), value2),
                max(value1.Yx(), value2),
                max(value1.Yy(), value2),
                max(value1.Yz(), value2),
                max(value1.Zx(), value2),
                max(value1.Zy(), value2),
                max(value1.Zz(), value2)
        );
    }

    public static <R> R max(Matrix3x3.Accessible value1, Matrix3x3.Accessible value2, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.Xx(), value2.Xx()),
                max(value1.Xy(), value2.Xy()),
                max(value1.Xz(), value2.Xz()),
                max(value1.Yx(), value2.Yx()),
                max(value1.Yy(), value2.Yy()),
                max(value1.Yz(), value2.Yz()),
                max(value1.Zx(), value2.Zx()),
                max(value1.Zy(), value2.Zy()),
                max(value1.Zz(), value2.Zz())
        );
    }

    public static void max(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, Matrix3x3.Accessible value2) {
        result.set3x3(
                max(value1.Xx(), value2.Xx()),
                max(value1.Xy(), value2.Xy()),
                max(value1.Xz(), value2.Xz()),
                max(value1.Yx(), value2.Yx()),
                max(value1.Yy(), value2.Yy()),
                max(value1.Yz(), value2.Yz()),
                max(value1.Zx(), value2.Zx()),
                max(value1.Zy(), value2.Zy()),
                max(value1.Zz(), value2.Zz())
        );
    }

    public static <R> R clamp(Matrix3x3.Accessible value, double min, double max, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min, max),
                clamp(value.Xy(), min, max),
                clamp(value.Xz(), min, max),
                clamp(value.Yx(), min, max),
                clamp(value.Yy(), min, max),
                clamp(value.Yz(), min, max),
                clamp(value.Zx(), min, max),
                clamp(value.Zy(), min, max),
                clamp(value.Zz(), min, max)
        );
    }

    public static void clamp(Matrix3x3.Consumer result, Matrix3x3.Accessible value, double min, double max) {
        result.set3x3(
                clamp(value.Xx(), min, max),
                clamp(value.Xy(), min, max),
                clamp(value.Xz(), min, max),
                clamp(value.Yx(), min, max),
                clamp(value.Yy(), min, max),
                clamp(value.Yz(), min, max),
                clamp(value.Zx(), min, max),
                clamp(value.Zy(), min, max),
                clamp(value.Zz(), min, max)
        );
    }

    public static <R> R clamp(Matrix3x3.Accessible value, Matrix3x3.Accessible min, double max, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min.Xx(), max),
                clamp(value.Xy(), min.Xy(), max),
                clamp(value.Xz(), min.Xz(), max),
                clamp(value.Yx(), min.Yx(), max),
                clamp(value.Yy(), min.Yy(), max),
                clamp(value.Yz(), min.Yz(), max),
                clamp(value.Zx(), min.Zx(), max),
                clamp(value.Zy(), min.Zy(), max),
                clamp(value.Zz(), min.Zz(), max)
        );
    }

    public static void clamp(Matrix3x3.Consumer result, Matrix3x3.Accessible value, Matrix3x3.Accessible min, double max) {
        result.set3x3(
                clamp(value.Xx(), min.Xx(), max),
                clamp(value.Xy(), min.Xy(), max),
                clamp(value.Xz(), min.Xz(), max),
                clamp(value.Yx(), min.Yx(), max),
                clamp(value.Yy(), min.Yy(), max),
                clamp(value.Yz(), min.Yz(), max),
                clamp(value.Zx(), min.Zx(), max),
                clamp(value.Zy(), min.Zy(), max),
                clamp(value.Zz(), min.Zz(), max)
        );
    }

    public static <R> R clamp(Matrix3x3.Accessible value, double min, Matrix3x3.Accessible max, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min, max.Xx()),
                clamp(value.Xy(), min, max.Xy()),
                clamp(value.Xz(), min, max.Xz()),
                clamp(value.Yx(), min, max.Yx()),
                clamp(value.Yy(), min, max.Yy()),
                clamp(value.Yz(), min, max.Yz()),
                clamp(value.Zx(), min, max.Zx()),
                clamp(value.Zy(), min, max.Zy()),
                clamp(value.Zz(), min, max.Zz())
        );
    }

    public static void clamp(Matrix3x3.Consumer result, Matrix3x3.Accessible value, double min, Matrix3x3.Accessible max) {
        result.set3x3(
                clamp(value.Xx(), min, max.Xx()),
                clamp(value.Xy(), min, max.Xy()),
                clamp(value.Xz(), min, max.Xz()),
                clamp(value.Yx(), min, max.Yx()),
                clamp(value.Yy(), min, max.Yy()),
                clamp(value.Yz(), min, max.Yz()),
                clamp(value.Zx(), min, max.Zx()),
                clamp(value.Zy(), min, max.Zy()),
                clamp(value.Zz(), min, max.Zz())
        );
    }

    public static <R> R clamp(Matrix3x3.Accessible value, Matrix3x3.Accessible min, Matrix3x3.Accessible max, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min.Xx(), max.Xx()),
                clamp(value.Xy(), min.Xy(), max.Xy()),
                clamp(value.Xz(), min.Xz(), max.Xz()),
                clamp(value.Yx(), min.Yx(), max.Yx()),
                clamp(value.Yy(), min.Yy(), max.Yy()),
                clamp(value.Yz(), min.Yz(), max.Yz()),
                clamp(value.Zx(), min.Zx(), max.Zx()),
                clamp(value.Zy(), min.Zy(), max.Zy()),
                clamp(value.Zz(), min.Zz(), max.Zz())
        );
    }

    public static void clamp(Matrix3x3.Consumer result, Matrix3x3.Accessible value, Matrix3x3.Accessible min, Matrix3x3.Accessible max) {
        result.set3x3(
                clamp(value.Xx(), min.Xx(), max.Xx()),
                clamp(value.Xy(), min.Xy(), max.Xy()),
                clamp(value.Xz(), min.Xz(), max.Xz()),
                clamp(value.Yx(), min.Yx(), max.Yx()),
                clamp(value.Yy(), min.Yy(), max.Yy()),
                clamp(value.Yz(), min.Yz(), max.Yz()),
                clamp(value.Zx(), min.Zx(), max.Zx()),
                clamp(value.Zy(), min.Zy(), max.Zy()),
                clamp(value.Zz(), min.Zz(), max.Zz())
        );
    }

    public static <R> R clamp(double value, Matrix3x3.Accessible min, Matrix3x3.Accessible max, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value, min.Xx(), max.Xx()),
                clamp(value, min.Xy(), max.Xy()),
                clamp(value, min.Xz(), max.Xz()),
                clamp(value, min.Yx(), max.Yx()),
                clamp(value, min.Yy(), max.Yy()),
                clamp(value, min.Yz(), max.Yz()),
                clamp(value, min.Zx(), max.Zx()),
                clamp(value, min.Zy(), max.Zy()),
                clamp(value, min.Zz(), max.Zz())
        );
    }

    public static void clamp(Matrix3x3.Consumer result, double value, Matrix3x3.Accessible min, Matrix3x3.Accessible max) {
        result.set3x3(
                clamp(value, min.Xx(), max.Xx()),
                clamp(value, min.Xy(), max.Xy()),
                clamp(value, min.Xz(), max.Xz()),
                clamp(value, min.Yx(), max.Yx()),
                clamp(value, min.Yy(), max.Yy()),
                clamp(value, min.Yz(), max.Yz()),
                clamp(value, min.Zx(), max.Zx()),
                clamp(value, min.Zy(), max.Zy()),
                clamp(value, min.Zz(), max.Zz())
        );
    }

    public static <R> R lerp(Matrix3x3.Accessible value1, Matrix3x3.Accessible value2, double t, Matrix3x3.Factory<R> resultFactory) {
        final double oneMinusT = 1.0D - t;
        return resultFactory.create(
                value1.Xx() * oneMinusT + value2.Xx() * t,
                value1.Xy() * oneMinusT + value2.Xy() * t,
                value1.Xz() * oneMinusT + value2.Xz() * t,
                value1.Yx() * oneMinusT + value2.Yx() * t,
                value1.Yy() * oneMinusT + value2.Yy() * t,
                value1.Yz() * oneMinusT + value2.Yz() * t,
                value1.Zx() * oneMinusT + value2.Zx() * t,
                value1.Zy() * oneMinusT + value2.Zy() * t,
                value1.Zz() * oneMinusT + value2.Zz() * t
        );
    }

    public static void lerp(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, Matrix3x3.Accessible value2, double t) {
        final double oneMinusT = 1.0D - t;
        result.set3x3(
                value1.Xx() * oneMinusT + value2.Xx() * t,
                value1.Xy() * oneMinusT + value2.Xy() * t,
                value1.Xz() * oneMinusT + value2.Xz() * t,
                value1.Yx() * oneMinusT + value2.Yx() * t,
                value1.Yy() * oneMinusT + value2.Yy() * t,
                value1.Yz() * oneMinusT + value2.Yz() * t,
                value1.Zx() * oneMinusT + value2.Zx() * t,
                value1.Zy() * oneMinusT + value2.Zy() * t,
                value1.Zz() * oneMinusT + value2.Zz() * t
        );
    }

    public static <R> R lerp(Matrix3x3.Accessible value1, double value2, Matrix3x3.Accessible t, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.Xx(), value2, t.Xx()),
                lerp(value1.Xy(), value2, t.Xy()),
                lerp(value1.Xz(), value2, t.Xz()),
                lerp(value1.Yx(), value2, t.Yx()),
                lerp(value1.Yy(), value2, t.Yy()),
                lerp(value1.Yz(), value2, t.Yz()),
                lerp(value1.Zx(), value2, t.Zx()),
                lerp(value1.Zy(), value2, t.Zy()),
                lerp(value1.Zz(), value2, t.Zz())
        );
    }

    public static void lerp(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, double value2, Matrix3x3.Accessible t) {
        result.set3x3(
                lerp(value1.Xx(), value2, t.Xx()),
                lerp(value1.Xy(), value2, t.Xy()),
                lerp(value1.Xz(), value2, t.Xz()),
                lerp(value1.Yx(), value2, t.Yx()),
                lerp(value1.Yy(), value2, t.Yy()),
                lerp(value1.Yz(), value2, t.Yz()),
                lerp(value1.Zx(), value2, t.Zx()),
                lerp(value1.Zy(), value2, t.Zy()),
                lerp(value1.Zz(), value2, t.Zz())
        );
    }

    public static <R> R lerp(Matrix3x3.Accessible value1, Matrix3x3.Accessible value2, Matrix3x3.Accessible t, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.Xx(), value2.Xx(), t.Xx()),
                lerp(value1.Xy(), value2.Xy(), t.Xy()),
                lerp(value1.Xz(), value2.Xz(), t.Xz()),
                lerp(value1.Yx(), value2.Yx(), t.Yx()),
                lerp(value1.Yy(), value2.Yy(), t.Yy()),
                lerp(value1.Yz(), value2.Yz(), t.Yz()),
                lerp(value1.Zx(), value2.Zx(), t.Zx()),
                lerp(value1.Zy(), value2.Zy(), t.Zy()),
                lerp(value1.Zz(), value2.Zz(), t.Zz())
        );
    }

    public static void lerp(Matrix3x3.Consumer result, Matrix3x3.Accessible value1, Matrix3x3.Accessible value2, Matrix3x3.Accessible t) {
        result.set3x3(
                lerp(value1.Xx(), value2.Xx(), t.Xx()),
                lerp(value1.Xy(), value2.Xy(), t.Xy()),
                lerp(value1.Xz(), value2.Xz(), t.Xz()),
                lerp(value1.Yx(), value2.Yx(), t.Yx()),
                lerp(value1.Yy(), value2.Yy(), t.Yy()),
                lerp(value1.Yz(), value2.Yz(), t.Yz()),
                lerp(value1.Zx(), value2.Zx(), t.Zx()),
                lerp(value1.Zy(), value2.Zy(), t.Zy()),
                lerp(value1.Zz(), value2.Zz(), t.Zz())
        );
    }

    public static <R> R negate(Matrix3x3.Accessible value, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                -value.Xx(),
                -value.Xy(),
                -value.Xz(),
                -value.Yx(),
                -value.Yy(),
                -value.Yz(),
                -value.Zx(),
                -value.Zy(),
                -value.Zz()
        );
    }

    public static void negate(Matrix3x3.Consumer result, Matrix3x3.Accessible value) {
        result.set3x3(
                -value.Xx(),
                -value.Xy(),
                -value.Xz(),
                -value.Yx(),
                -value.Yy(),
                -value.Yz(),
                -value.Zx(),
                -value.Zy(),
                -value.Zz()
        );
    }

    public static <R> R add(Matrix3x3.Accessible left, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() + right,
                left.Xy() + right,
                left.Xz() + right,
                left.Yx() + right,
                left.Yy() + right,
                left.Yz() + right,
                left.Zx() + right,
                left.Zy() + right,
                left.Zz() + right
        );
    }

    public static void add(Matrix3x3.Consumer result, Matrix3x3.Accessible left, double right) {
        result.set3x3(
                left.Xx() + right,
                left.Xy() + right,
                left.Xz() + right,
                left.Yx() + right,
                left.Yy() + right,
                left.Yz() + right,
                left.Zx() + right,
                left.Zy() + right,
                left.Zz() + right
        );
    }

    public static <R> R add(Matrix3x3.Accessible left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() + right.Xx(),
                left.Xy() + right.Xy(),
                left.Xz() + right.Xz(),
                left.Yx() + right.Yx(),
                left.Yy() + right.Yy(),
                left.Yz() + right.Yz(),
                left.Zx() + right.Zx(),
                left.Zy() + right.Zy(),
                left.Zz() + right.Zz()
        );
    }

    public static void add(Matrix3x3.Consumer result, Matrix3x3.Accessible left, Matrix3x3.Accessible right) {
        result.set3x3(
                left.Xx() + right.Xx(),
                left.Xy() + right.Xy(),
                left.Xz() + right.Xz(),
                left.Yx() + right.Yx(),
                left.Yy() + right.Yy(),
                left.Yz() + right.Yz(),
                left.Zx() + right.Zx(),
                left.Zy() + right.Zy(),
                left.Zz() + right.Zz()
        );
    }

    public static <R> R subtract(Matrix3x3.Accessible left, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() - right,
                left.Xy() - right,
                left.Xz() - right,
                left.Yx() - right,
                left.Yy() - right,
                left.Yz() - right,
                left.Zx() - right,
                left.Zy() - right,
                left.Zz() - right
        );
    }

    public static void subtract(Matrix3x3.Consumer result, Matrix3x3.Accessible left, double right) {
        result.set3x3(
                left.Xx() - right,
                left.Xy() - right,
                left.Xz() - right,
                left.Yx() - right,
                left.Yy() - right,
                left.Yz() - right,
                left.Zx() - right,
                left.Zy() - right,
                left.Zz() - right
        );
    }

    public static <R> R subtract(Matrix3x3.Accessible left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() - right.Xx(),
                left.Xy() - right.Xy(),
                left.Xz() - right.Xz(),
                left.Yx() - right.Yx(),
                left.Yy() - right.Yy(),
                left.Yz() - right.Yz(),
                left.Zx() - right.Zx(),
                left.Zy() - right.Zy(),
                left.Zz() - right.Zz()
        );
    }

    public static void subtract(Matrix3x3.Consumer result, Matrix3x3.Accessible left, Matrix3x3.Accessible right) {
        result.set3x3(
                left.Xx() - right.Xx(),
                left.Xy() - right.Xy(),
                left.Xz() - right.Xz(),
                left.Yx() - right.Yx(),
                left.Yy() - right.Yy(),
                left.Yz() - right.Yz(),
                left.Zx() - right.Zx(),
                left.Zy() - right.Zy(),
                left.Zz() - right.Zz()
        );
    }

    public static <R> R subtract(double left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left - right.Xx(),
                left - right.Xy(),
                left - right.Xz(),
                left - right.Yx(),
                left - right.Yy(),
                left - right.Yz(),
                left - right.Zx(),
                left - right.Zy(),
                left - right.Zz()
        );
    }

    public static void subtract(Matrix3x3.Consumer result, double left, Matrix3x3.Accessible right) {
        result.set3x3(
                left - right.Xx(),
                left - right.Xy(),
                left - right.Xz(),
                left - right.Yx(),
                left - right.Yy(),
                left - right.Yz(),
                left - right.Zx(),
                left - right.Zy(),
                left - right.Zz()
        );
    }

    public static <R> R multiply(Matrix3x3.Accessible left, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() * right,
                left.Xy() * right,
                left.Xz() * right,
                left.Yx() * right,
                left.Yy() * right,
                left.Yz() * right,
                left.Zx() * right,
                left.Zy() * right,
                left.Zz() * right
        );
    }

    public static void multiply(Matrix3x3.Consumer result, Matrix3x3.Accessible left, double right) {
        result.set3x3(
                left.Xx() * right,
                left.Xy() * right,
                left.Xz() * right,
                left.Yx() * right,
                left.Yy() * right,
                left.Yz() * right,
                left.Zx() * right,
                left.Zy() * right,
                left.Zz() * right
        );
    }

    public static <R> R divide(Matrix3x3.Accessible left, double right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() / right,
                left.Xy() / right,
                left.Xz() / right,
                left.Yx() / right,
                left.Yy() / right,
                left.Yz() / right,
                left.Zx() / right,
                left.Zy() / right,
                left.Zz() / right
        );
    }

    public static void divide(Matrix3x3.Consumer result, Matrix3x3.Accessible left, double right) {
        result.set3x3(
                left.Xx() / right,
                left.Xy() / right,
                left.Xz() / right,
                left.Yx() / right,
                left.Yy() / right,
                left.Yz() / right,
                left.Zx() / right,
                left.Zy() / right,
                left.Zz() / right
        );
    }

    public static <R> R divide(double left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        return resultFactory.create(
                left / right.Xx(),
                left / right.Xy(),
                left / right.Xz(),
                left / right.Yx(),
                left / right.Yy(),
                left / right.Yz(),
                left / right.Zx(),
                left / right.Zy(),
                left / right.Zz()
        );
    }

    public static void divide(Matrix3x3.Consumer result, double left, Matrix3x3.Accessible right) {
        result.set3x3(
                left / right.Xx(),
                left / right.Xy(),
                left / right.Xz(),
                left / right.Yx(),
                left / right.Yy(),
                left / right.Yz(),
                left / right.Zx(),
                left / right.Zy(),
                left / right.Zz()
        );
    }

    public static <R> R inverse(Matrix3x3.Accessible matrix, Matrix3x3.Factory<R> resultFactory) {
        final double matrixXx = matrix.Xx();
        final double matrixXy = matrix.Xy();
        final double matrixXz = matrix.Xz();
        final double matrixYx = matrix.Yx();
        final double matrixYy = matrix.Yy();
        final double matrixYz = matrix.Yz();
        final double matrixZx = matrix.Zx();
        final double matrixZy = matrix.Zy();
        final double matrixZz = matrix.Zz();

        final double det01 = matrixZz * matrixYy - matrixYz * matrixZy;
        final double det11 = matrixYz * matrixZx - matrixZz * matrixYx;
        final double det21 = matrixZy * matrixYx - matrixYy * matrixZx;

        double det = matrixXx * det01 + matrixXy * det11 + matrixXz * det21;
        det = (det != 0.0D) ? (1.0D / det) : 0.0D;

        return resultFactory.create(
                det01 * det,
                (matrixXz * matrixZy - matrixZz * matrixXy) * det,
                (matrixYz * matrixXy - matrixXz * matrixYy) * det,
                det11 * det,
                (matrixZz * matrixXx - matrixXz * matrixZx) * det,
                (matrixXz * matrixYx - matrixYz * matrixXx) * det,
                det21 * det,
                (matrixXy * matrixZx - matrixZy * matrixXx) * det,
                (matrixYy * matrixXx - matrixXy * matrixYx) * det
        );
    }

    public static void inverse(Matrix3x3.Consumer result, Matrix3x3.Accessible matrix) {
        final double matrixXx = matrix.Xx();
        final double matrixXy = matrix.Xy();
        final double matrixXz = matrix.Xz();
        final double matrixYx = matrix.Yx();
        final double matrixYy = matrix.Yy();
        final double matrixYz = matrix.Yz();
        final double matrixZx = matrix.Zx();
        final double matrixZy = matrix.Zy();
        final double matrixZz = matrix.Zz();

        final double det01 = matrixZz * matrixYy - matrixYz * matrixZy;
        final double det11 = matrixYz * matrixZx - matrixZz * matrixYx;
        final double det21 = matrixZy * matrixYx - matrixYy * matrixZx;

        double det = matrixXx * det01 + matrixXy * det11 + matrixXz * det21;
        det = (det != 0.0D) ? (1.0D / det) : 0.0D;

        result.set3x3(
                det01 * det,
                (matrixXz * matrixZy - matrixZz * matrixXy) * det,
                (matrixYz * matrixXy - matrixXz * matrixYy) * det,
                det11 * det,
                (matrixZz * matrixXx - matrixXz * matrixZx) * det,
                (matrixXz * matrixYx - matrixYz * matrixXx) * det,
                det21 * det,
                (matrixXy * matrixZx - matrixZy * matrixXx) * det,
                (matrixYy * matrixXx - matrixXy * matrixYx) * det
        );
    }

    public static <R> R multiply(Matrix3x3.Accessible left, Matrix3x3.Accessible right, Matrix3x3.Factory<R> resultFactory) {
        final double leftXx = left.Xx();
        final double leftXy = left.Xy();
        final double leftXz = left.Xz();
        final double leftYx = left.Yx();
        final double leftYy = left.Yy();
        final double leftYz = left.Yz();
        final double leftZx = left.Zx();
        final double leftZy = left.Zy();
        final double leftZz = left.Zz();

        final double rightXx = right.Xx();
        final double rightXy = right.Xy();
        final double rightXz = right.Xz();
        final double rightYx = right.Yx();
        final double rightYy = right.Yy();
        final double rightYz = right.Yz();
        final double rightZx = right.Zx();
        final double rightZy = right.Zy();
        final double rightZz = right.Zz();

        return resultFactory.create(
                leftXx * rightXx + leftYx * rightXy + leftZx * rightXz,
                leftXy * rightXx + leftYy * rightXy + leftZy * rightXz,
                leftXz * rightXx + leftYz * rightXy + leftZz * rightXz,
                leftXx * rightYx + leftYx * rightYy + leftZx * rightYz,
                leftXy * rightYx + leftYy * rightYy + leftZy * rightYz,
                leftXz * rightYx + leftYz * rightYy + leftZz * rightYz,
                leftXx * rightZx + leftYx * rightZy + leftZx * rightZz,
                leftXy * rightZx + leftYy * rightZy + leftZy * rightZz,
                leftXz * rightZx + leftYz * rightZy + leftZz * rightZz
        );
    }

    public static void multiply(Matrix3x3.Consumer result, Matrix3x3.Accessible left, Matrix3x3.Accessible right) {
        final double leftXx = left.Xx();
        final double leftXy = left.Xy();
        final double leftXz = left.Xz();
        final double leftYx = left.Yx();
        final double leftYy = left.Yy();
        final double leftYz = left.Yz();
        final double leftZx = left.Zx();
        final double leftZy = left.Zy();
        final double leftZz = left.Zz();

        final double rightXx = right.Xx();
        final double rightXy = right.Xy();
        final double rightXz = right.Xz();
        final double rightYx = right.Yx();
        final double rightYy = right.Yy();
        final double rightYz = right.Yz();
        final double rightZx = right.Zx();
        final double rightZy = right.Zy();
        final double rightZz = right.Zz();

        result.set3x3(
                leftXx * rightXx + leftYx * rightXy + leftZx * rightXz,
                leftXy * rightXx + leftYy * rightXy + leftZy * rightXz,
                leftXz * rightXx + leftYz * rightXy + leftZz * rightXz,
                leftXx * rightYx + leftYx * rightYy + leftZx * rightYz,
                leftXy * rightYx + leftYy * rightYy + leftZy * rightYz,
                leftXz * rightYx + leftYz * rightYy + leftZz * rightYz,
                leftXx * rightZx + leftYx * rightZy + leftZx * rightZz,
                leftXy * rightZx + leftYy * rightZy + leftZy * rightZz,
                leftXz * rightZx + leftYz * rightZy + leftZz * rightZz
        );
    }

    public static <R> R multiply(Matrix3x3.Accessible left, Vector3.Accessible right, Vector3.Factory<R> resultFactory) {
        final double rightX = right.x();
        final double rightY = right.y();
        final double rightZ = right.z();

        return resultFactory.create(
                left.Xx() * rightX + left.Yx() * rightY + left.Zx() * rightZ,
                left.Xy() * rightX + left.Yy() * rightY + left.Zy() * rightZ,
                left.Xz() * rightX + left.Yz() * rightY + left.Zz() * rightZ
        );
    }

    public static void multiply(Vector3.Consumer result, Matrix3x3.Accessible left, Vector3.Accessible right) {
        final double rightX = right.x();
        final double rightY = right.y();
        final double rightZ = right.z();

        result.xyz(
                left.Xx() * rightX + left.Yx() * rightY + left.Zx() * rightZ,
                left.Xy() * rightX + left.Yy() * rightY + left.Zy() * rightZ,
                left.Xz() * rightX + left.Yz() * rightY + left.Zz() * rightZ
        );
    }

    public static <R> R min(Matrix4x4.Accessible value1, double value2, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.Xx(), value2),
                min(value1.Xy(), value2),
                min(value1.Xz(), value2),
                min(value1.Xw(), value2),
                min(value1.Yx(), value2),
                min(value1.Yy(), value2),
                min(value1.Yz(), value2),
                min(value1.Yw(), value2),
                min(value1.Zx(), value2),
                min(value1.Zy(), value2),
                min(value1.Zz(), value2),
                min(value1.Zw(), value2),
                min(value1.Tx(), value2),
                min(value1.Ty(), value2),
                min(value1.Tz(), value2),
                min(value1.Tw(), value2)
        );
    }

    public static void min(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, double value2) {
        result.set4x4(
                min(value1.Xx(), value2),
                min(value1.Xy(), value2),
                min(value1.Xz(), value2),
                min(value1.Xw(), value2),
                min(value1.Yx(), value2),
                min(value1.Yy(), value2),
                min(value1.Yz(), value2),
                min(value1.Yw(), value2),
                min(value1.Zx(), value2),
                min(value1.Zy(), value2),
                min(value1.Zz(), value2),
                min(value1.Zw(), value2),
                min(value1.Tx(), value2),
                min(value1.Ty(), value2),
                min(value1.Tz(), value2),
                min(value1.Tw(), value2)
        );
    }

    public static <R> R min(Matrix4x4.Accessible value1, Matrix4x4.Accessible value2, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                min(value1.Xx(), value2.Xx()),
                min(value1.Xy(), value2.Xy()),
                min(value1.Xz(), value2.Xz()),
                min(value1.Xw(), value2.Xw()),
                min(value1.Yx(), value2.Yx()),
                min(value1.Yy(), value2.Yy()),
                min(value1.Yz(), value2.Yz()),
                min(value1.Yw(), value2.Yw()),
                min(value1.Zx(), value2.Zx()),
                min(value1.Zy(), value2.Zy()),
                min(value1.Zz(), value2.Zz()),
                min(value1.Zw(), value2.Zw()),
                min(value1.Tx(), value2.Tx()),
                min(value1.Ty(), value2.Ty()),
                min(value1.Tz(), value2.Tz()),
                min(value1.Tw(), value2.Tw())
        );
    }

    public static void min(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, Matrix4x4.Accessible value2) {
        result.set4x4(
                min(value1.Xx(), value2.Xx()),
                min(value1.Xy(), value2.Xy()),
                min(value1.Xz(), value2.Xz()),
                min(value1.Xw(), value2.Xw()),
                min(value1.Yx(), value2.Yx()),
                min(value1.Yy(), value2.Yy()),
                min(value1.Yz(), value2.Yz()),
                min(value1.Yw(), value2.Yw()),
                min(value1.Zx(), value2.Zx()),
                min(value1.Zy(), value2.Zy()),
                min(value1.Zz(), value2.Zz()),
                min(value1.Zw(), value2.Zw()),
                min(value1.Tx(), value2.Tx()),
                min(value1.Ty(), value2.Ty()),
                min(value1.Tz(), value2.Tz()),
                min(value1.Tw(), value2.Tw())
        );
    }

    public static <R> R max(Matrix4x4.Accessible value1, double value2, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.Xx(), value2),
                max(value1.Xy(), value2),
                max(value1.Xz(), value2),
                max(value1.Xw(), value2),
                max(value1.Yx(), value2),
                max(value1.Yy(), value2),
                max(value1.Yz(), value2),
                max(value1.Yw(), value2),
                max(value1.Zx(), value2),
                max(value1.Zy(), value2),
                max(value1.Zz(), value2),
                max(value1.Zw(), value2),
                max(value1.Tx(), value2),
                max(value1.Ty(), value2),
                max(value1.Tz(), value2),
                max(value1.Tw(), value2)
        );
    }

    public static void max(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, double value2) {
        result.set4x4(
                max(value1.Xx(), value2),
                max(value1.Xy(), value2),
                max(value1.Xz(), value2),
                max(value1.Xw(), value2),
                max(value1.Yx(), value2),
                max(value1.Yy(), value2),
                max(value1.Yz(), value2),
                max(value1.Yw(), value2),
                max(value1.Zx(), value2),
                max(value1.Zy(), value2),
                max(value1.Zz(), value2),
                max(value1.Zw(), value2),
                max(value1.Tx(), value2),
                max(value1.Ty(), value2),
                max(value1.Tz(), value2),
                max(value1.Tw(), value2)
        );
    }

    public static <R> R max(Matrix4x4.Accessible value1, Matrix4x4.Accessible value2, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                max(value1.Xx(), value2.Xx()),
                max(value1.Xy(), value2.Xy()),
                max(value1.Xz(), value2.Xz()),
                max(value1.Xw(), value2.Xw()),
                max(value1.Yx(), value2.Yx()),
                max(value1.Yy(), value2.Yy()),
                max(value1.Yz(), value2.Yz()),
                max(value1.Yw(), value2.Yw()),
                max(value1.Zx(), value2.Zx()),
                max(value1.Zy(), value2.Zy()),
                max(value1.Zz(), value2.Zz()),
                max(value1.Zw(), value2.Zw()),
                max(value1.Tx(), value2.Tx()),
                max(value1.Ty(), value2.Ty()),
                max(value1.Tz(), value2.Tz()),
                max(value1.Tw(), value2.Tw())
        );
    }

    public static void max(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, Matrix4x4.Accessible value2) {
        result.set4x4(
                max(value1.Xx(), value2.Xx()),
                max(value1.Xy(), value2.Xy()),
                max(value1.Xz(), value2.Xz()),
                max(value1.Xw(), value2.Xw()),
                max(value1.Yx(), value2.Yx()),
                max(value1.Yy(), value2.Yy()),
                max(value1.Yz(), value2.Yz()),
                max(value1.Yw(), value2.Yw()),
                max(value1.Zx(), value2.Zx()),
                max(value1.Zy(), value2.Zy()),
                max(value1.Zz(), value2.Zz()),
                max(value1.Zw(), value2.Zw()),
                max(value1.Tx(), value2.Tx()),
                max(value1.Ty(), value2.Ty()),
                max(value1.Tz(), value2.Tz()),
                max(value1.Tw(), value2.Tw())
        );
    }

    public static <R> R clamp(Matrix4x4.Accessible value, double min, double max, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min, max),
                clamp(value.Xy(), min, max),
                clamp(value.Xz(), min, max),
                clamp(value.Xw(), min, max),
                clamp(value.Yx(), min, max),
                clamp(value.Yy(), min, max),
                clamp(value.Yz(), min, max),
                clamp(value.Yw(), min, max),
                clamp(value.Zx(), min, max),
                clamp(value.Zy(), min, max),
                clamp(value.Zz(), min, max),
                clamp(value.Zw(), min, max),
                clamp(value.Tx(), min, max),
                clamp(value.Ty(), min, max),
                clamp(value.Tz(), min, max),
                clamp(value.Tw(), min, max)
        );
    }

    public static void clamp(Matrix4x4.Consumer result, Matrix4x4.Accessible value, double min, double max) {
        result.set4x4(
                clamp(value.Xx(), min, max),
                clamp(value.Xy(), min, max),
                clamp(value.Xz(), min, max),
                clamp(value.Xw(), min, max),
                clamp(value.Yx(), min, max),
                clamp(value.Yy(), min, max),
                clamp(value.Yz(), min, max),
                clamp(value.Yw(), min, max),
                clamp(value.Zx(), min, max),
                clamp(value.Zy(), min, max),
                clamp(value.Zz(), min, max),
                clamp(value.Zw(), min, max),
                clamp(value.Tx(), min, max),
                clamp(value.Ty(), min, max),
                clamp(value.Tz(), min, max),
                clamp(value.Tw(), min, max)
        );
    }

    public static <R> R clamp(Matrix4x4.Accessible value, Matrix4x4.Accessible min, double max, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min.Xx(), max),
                clamp(value.Xy(), min.Xy(), max),
                clamp(value.Xz(), min.Xz(), max),
                clamp(value.Xw(), min.Xw(), max),
                clamp(value.Yx(), min.Yx(), max),
                clamp(value.Yy(), min.Yy(), max),
                clamp(value.Yz(), min.Yz(), max),
                clamp(value.Yw(), min.Yw(), max),
                clamp(value.Zx(), min.Zx(), max),
                clamp(value.Zy(), min.Zy(), max),
                clamp(value.Zz(), min.Zz(), max),
                clamp(value.Zw(), min.Zw(), max),
                clamp(value.Tx(), min.Tx(), max),
                clamp(value.Ty(), min.Ty(), max),
                clamp(value.Tz(), min.Tz(), max),
                clamp(value.Tw(), min.Tw(), max)
        );
    }

    public static void clamp(Matrix4x4.Consumer result, Matrix4x4.Accessible value, Matrix4x4.Accessible min, double max) {
        result.set4x4(
                clamp(value.Xx(), min.Xx(), max),
                clamp(value.Xy(), min.Xy(), max),
                clamp(value.Xz(), min.Xz(), max),
                clamp(value.Xw(), min.Xw(), max),
                clamp(value.Yx(), min.Yx(), max),
                clamp(value.Yy(), min.Yy(), max),
                clamp(value.Yz(), min.Yz(), max),
                clamp(value.Yw(), min.Yw(), max),
                clamp(value.Zx(), min.Zx(), max),
                clamp(value.Zy(), min.Zy(), max),
                clamp(value.Zz(), min.Zz(), max),
                clamp(value.Zw(), min.Zw(), max),
                clamp(value.Tx(), min.Tx(), max),
                clamp(value.Ty(), min.Ty(), max),
                clamp(value.Tz(), min.Tz(), max),
                clamp(value.Tw(), min.Tw(), max)
        );
    }

    public static <R> R clamp(Matrix4x4.Accessible value, double min, Matrix4x4.Accessible max, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min, max.Xx()),
                clamp(value.Xy(), min, max.Xy()),
                clamp(value.Xz(), min, max.Xz()),
                clamp(value.Xw(), min, max.Xw()),
                clamp(value.Yx(), min, max.Yx()),
                clamp(value.Yy(), min, max.Yy()),
                clamp(value.Yz(), min, max.Yz()),
                clamp(value.Yw(), min, max.Yw()),
                clamp(value.Zx(), min, max.Zx()),
                clamp(value.Zy(), min, max.Zy()),
                clamp(value.Zz(), min, max.Zz()),
                clamp(value.Zw(), min, max.Zw()),
                clamp(value.Tx(), min, max.Tx()),
                clamp(value.Ty(), min, max.Ty()),
                clamp(value.Tz(), min, max.Tz()),
                clamp(value.Tw(), min, max.Tw())
        );
    }

    public static void clamp(Matrix4x4.Consumer result, Matrix4x4.Accessible value, double min, Matrix4x4.Accessible max) {
        result.set4x4(
                clamp(value.Xx(), min, max.Xx()),
                clamp(value.Xy(), min, max.Xy()),
                clamp(value.Xz(), min, max.Xz()),
                clamp(value.Xw(), min, max.Xw()),
                clamp(value.Yx(), min, max.Yx()),
                clamp(value.Yy(), min, max.Yy()),
                clamp(value.Yz(), min, max.Yz()),
                clamp(value.Yw(), min, max.Yw()),
                clamp(value.Zx(), min, max.Zx()),
                clamp(value.Zy(), min, max.Zy()),
                clamp(value.Zz(), min, max.Zz()),
                clamp(value.Zw(), min, max.Zw()),
                clamp(value.Tx(), min, max.Tx()),
                clamp(value.Ty(), min, max.Ty()),
                clamp(value.Tz(), min, max.Tz()),
                clamp(value.Tw(), min, max.Tw())
        );
    }

    public static <R> R clamp(Matrix4x4.Accessible value, Matrix4x4.Accessible min, Matrix4x4.Accessible max, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value.Xx(), min.Xx(), max.Xx()),
                clamp(value.Xy(), min.Xy(), max.Xy()),
                clamp(value.Xz(), min.Xz(), max.Xz()),
                clamp(value.Xw(), min.Xw(), max.Xw()),
                clamp(value.Yx(), min.Yx(), max.Yx()),
                clamp(value.Yy(), min.Yy(), max.Yy()),
                clamp(value.Yz(), min.Yz(), max.Yz()),
                clamp(value.Yw(), min.Yw(), max.Yw()),
                clamp(value.Zx(), min.Zx(), max.Zx()),
                clamp(value.Zy(), min.Zy(), max.Zy()),
                clamp(value.Zz(), min.Zz(), max.Zz()),
                clamp(value.Zw(), min.Zw(), max.Zw()),
                clamp(value.Tx(), min.Tx(), max.Tx()),
                clamp(value.Ty(), min.Ty(), max.Ty()),
                clamp(value.Tz(), min.Tz(), max.Tz()),
                clamp(value.Tw(), min.Tw(), max.Tw())
        );
    }

    public static void clamp(Matrix4x4.Consumer result, Matrix4x4.Accessible value, Matrix4x4.Accessible min, Matrix4x4.Accessible max) {
        result.set4x4(
                clamp(value.Xx(), min.Xx(), max.Xx()),
                clamp(value.Xy(), min.Xy(), max.Xy()),
                clamp(value.Xz(), min.Xz(), max.Xz()),
                clamp(value.Xw(), min.Xw(), max.Xw()),
                clamp(value.Yx(), min.Yx(), max.Yx()),
                clamp(value.Yy(), min.Yy(), max.Yy()),
                clamp(value.Yz(), min.Yz(), max.Yz()),
                clamp(value.Yw(), min.Yw(), max.Yw()),
                clamp(value.Zx(), min.Zx(), max.Zx()),
                clamp(value.Zy(), min.Zy(), max.Zy()),
                clamp(value.Zz(), min.Zz(), max.Zz()),
                clamp(value.Zw(), min.Zw(), max.Zw()),
                clamp(value.Tx(), min.Tx(), max.Tx()),
                clamp(value.Ty(), min.Ty(), max.Ty()),
                clamp(value.Tz(), min.Tz(), max.Tz()),
                clamp(value.Tw(), min.Tw(), max.Tw())
        );
    }

    public static <R> R clamp(double value, Matrix4x4.Accessible min, Matrix4x4.Accessible max, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                clamp(value, min.Xx(), max.Xx()),
                clamp(value, min.Xy(), max.Xy()),
                clamp(value, min.Xz(), max.Xz()),
                clamp(value, min.Xw(), max.Xw()),
                clamp(value, min.Yx(), max.Yx()),
                clamp(value, min.Yy(), max.Yy()),
                clamp(value, min.Yz(), max.Yz()),
                clamp(value, min.Yw(), max.Yw()),
                clamp(value, min.Zx(), max.Zx()),
                clamp(value, min.Zy(), max.Zy()),
                clamp(value, min.Zz(), max.Zz()),
                clamp(value, min.Zw(), max.Zw()),
                clamp(value, min.Tx(), max.Tx()),
                clamp(value, min.Ty(), max.Ty()),
                clamp(value, min.Tz(), max.Tz()),
                clamp(value, min.Tw(), max.Tw())
        );
    }

    public static void clamp(Matrix4x4.Consumer result, double value, Matrix4x4.Accessible min, Matrix4x4.Accessible max) {
        result.set4x4(
                clamp(value, min.Xx(), max.Xx()),
                clamp(value, min.Xy(), max.Xy()),
                clamp(value, min.Xz(), max.Xz()),
                clamp(value, min.Xw(), max.Xw()),
                clamp(value, min.Yx(), max.Yx()),
                clamp(value, min.Yy(), max.Yy()),
                clamp(value, min.Yz(), max.Yz()),
                clamp(value, min.Yw(), max.Yw()),
                clamp(value, min.Zx(), max.Zx()),
                clamp(value, min.Zy(), max.Zy()),
                clamp(value, min.Zz(), max.Zz()),
                clamp(value, min.Zw(), max.Zw()),
                clamp(value, min.Tx(), max.Tx()),
                clamp(value, min.Ty(), max.Ty()),
                clamp(value, min.Tz(), max.Tz()),
                clamp(value, min.Tw(), max.Tw())
        );
    }

    public static <R> R lerp(Matrix4x4.Accessible value1, Matrix4x4.Accessible value2, double t, Matrix4x4.Factory<R> resultFactory) {
        final double oneMinusT = 1.0D - t;
        return resultFactory.create(
                value1.Xx() * oneMinusT + value2.Xx() * t,
                value1.Xy() * oneMinusT + value2.Xy() * t,
                value1.Xz() * oneMinusT + value2.Xz() * t,
                value1.Xw() * oneMinusT + value2.Xw() * t,
                value1.Yx() * oneMinusT + value2.Yx() * t,
                value1.Yy() * oneMinusT + value2.Yy() * t,
                value1.Yz() * oneMinusT + value2.Yz() * t,
                value1.Yw() * oneMinusT + value2.Yw() * t,
                value1.Zx() * oneMinusT + value2.Zx() * t,
                value1.Zy() * oneMinusT + value2.Zy() * t,
                value1.Zz() * oneMinusT + value2.Zz() * t,
                value1.Zw() * oneMinusT + value2.Zw() * t,
                value1.Tx() * oneMinusT + value2.Tx() * t,
                value1.Ty() * oneMinusT + value2.Ty() * t,
                value1.Tz() * oneMinusT + value2.Tz() * t,
                value1.Tw() * oneMinusT + value2.Tw() * t
        );
    }

    public static void lerp(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, Matrix4x4.Accessible value2, double t) {
        final double oneMinusT = 1.0D - t;
        result.set4x4(
                value1.Xx() * oneMinusT + value2.Xx() * t,
                value1.Xy() * oneMinusT + value2.Xy() * t,
                value1.Xz() * oneMinusT + value2.Xz() * t,
                value1.Xw() * oneMinusT + value2.Xw() * t,
                value1.Yx() * oneMinusT + value2.Yx() * t,
                value1.Yy() * oneMinusT + value2.Yy() * t,
                value1.Yz() * oneMinusT + value2.Yz() * t,
                value1.Yw() * oneMinusT + value2.Yw() * t,
                value1.Zx() * oneMinusT + value2.Zx() * t,
                value1.Zy() * oneMinusT + value2.Zy() * t,
                value1.Zz() * oneMinusT + value2.Zz() * t,
                value1.Zw() * oneMinusT + value2.Zw() * t,
                value1.Tx() * oneMinusT + value2.Tx() * t,
                value1.Ty() * oneMinusT + value2.Ty() * t,
                value1.Tz() * oneMinusT + value2.Tz() * t,
                value1.Tw() * oneMinusT + value2.Tw() * t
        );
    }

    public static <R> R lerp(Matrix4x4.Accessible value1, double value2, Matrix4x4.Accessible t, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.Xx(), value2, t.Xx()),
                lerp(value1.Xy(), value2, t.Xy()),
                lerp(value1.Xz(), value2, t.Xz()),
                lerp(value1.Xw(), value2, t.Xw()),
                lerp(value1.Yx(), value2, t.Yx()),
                lerp(value1.Yy(), value2, t.Yy()),
                lerp(value1.Yz(), value2, t.Yz()),
                lerp(value1.Yw(), value2, t.Yw()),
                lerp(value1.Zx(), value2, t.Zx()),
                lerp(value1.Zy(), value2, t.Zy()),
                lerp(value1.Zz(), value2, t.Zz()),
                lerp(value1.Zw(), value2, t.Zw()),
                lerp(value1.Tx(), value2, t.Tx()),
                lerp(value1.Ty(), value2, t.Ty()),
                lerp(value1.Tz(), value2, t.Tz()),
                lerp(value1.Tw(), value2, t.Tw())
        );
    }

    public static void lerp(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, double value2, Matrix4x4.Accessible t) {
        result.set4x4(
                lerp(value1.Xx(), value2, t.Xx()),
                lerp(value1.Xy(), value2, t.Xy()),
                lerp(value1.Xz(), value2, t.Xz()),
                lerp(value1.Xw(), value2, t.Xw()),
                lerp(value1.Yx(), value2, t.Yx()),
                lerp(value1.Yy(), value2, t.Yy()),
                lerp(value1.Yz(), value2, t.Yz()),
                lerp(value1.Yw(), value2, t.Yw()),
                lerp(value1.Zx(), value2, t.Zx()),
                lerp(value1.Zy(), value2, t.Zy()),
                lerp(value1.Zz(), value2, t.Zz()),
                lerp(value1.Zw(), value2, t.Zw()),
                lerp(value1.Tx(), value2, t.Tx()),
                lerp(value1.Ty(), value2, t.Ty()),
                lerp(value1.Tz(), value2, t.Tz()),
                lerp(value1.Tw(), value2, t.Tw())
        );
    }

    public static <R> R lerp(Matrix4x4.Accessible value1, Matrix4x4.Accessible value2, Matrix4x4.Accessible t, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                lerp(value1.Xx(), value2.Xx(), t.Xx()),
                lerp(value1.Xy(), value2.Xy(), t.Xy()),
                lerp(value1.Xz(), value2.Xz(), t.Xz()),
                lerp(value1.Xw(), value2.Xw(), t.Xw()),
                lerp(value1.Yx(), value2.Yx(), t.Yx()),
                lerp(value1.Yy(), value2.Yy(), t.Yy()),
                lerp(value1.Yz(), value2.Yz(), t.Yz()),
                lerp(value1.Yw(), value2.Yw(), t.Yw()),
                lerp(value1.Zx(), value2.Zx(), t.Zx()),
                lerp(value1.Zy(), value2.Zy(), t.Zy()),
                lerp(value1.Zz(), value2.Zz(), t.Zz()),
                lerp(value1.Zw(), value2.Zw(), t.Zw()),
                lerp(value1.Tx(), value2.Tx(), t.Tx()),
                lerp(value1.Ty(), value2.Ty(), t.Ty()),
                lerp(value1.Tz(), value2.Tz(), t.Tz()),
                lerp(value1.Tw(), value2.Tw(), t.Tw())
        );
    }

    public static void lerp(Matrix4x4.Consumer result, Matrix4x4.Accessible value1, Matrix4x4.Accessible value2, Matrix4x4.Accessible t) {
        result.set4x4(
                lerp(value1.Xx(), value2.Xx(), t.Xx()),
                lerp(value1.Xy(), value2.Xy(), t.Xy()),
                lerp(value1.Xz(), value2.Xz(), t.Xz()),
                lerp(value1.Xw(), value2.Xw(), t.Xw()),
                lerp(value1.Yx(), value2.Yx(), t.Yx()),
                lerp(value1.Yy(), value2.Yy(), t.Yy()),
                lerp(value1.Yz(), value2.Yz(), t.Yz()),
                lerp(value1.Yw(), value2.Yw(), t.Yw()),
                lerp(value1.Zx(), value2.Zx(), t.Zx()),
                lerp(value1.Zy(), value2.Zy(), t.Zy()),
                lerp(value1.Zz(), value2.Zz(), t.Zz()),
                lerp(value1.Zw(), value2.Zw(), t.Zw()),
                lerp(value1.Tx(), value2.Tx(), t.Tx()),
                lerp(value1.Ty(), value2.Ty(), t.Ty()),
                lerp(value1.Tz(), value2.Tz(), t.Tz()),
                lerp(value1.Tw(), value2.Tw(), t.Tw())
        );
    }

    public static <R> R negate(Matrix4x4.Accessible value, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                -value.Xx(),
                -value.Xy(),
                -value.Xz(),
                -value.Xw(),
                -value.Yx(),
                -value.Yy(),
                -value.Yz(),
                -value.Yw(),
                -value.Zx(),
                -value.Zy(),
                -value.Zz(),
                -value.Zw(),
                -value.Tx(),
                -value.Ty(),
                -value.Tz(),
                -value.Tw()
        );
    }

    public static void negate(Matrix4x4.Consumer result, Matrix4x4.Accessible value) {
        result.set4x4(
                -value.Xx(),
                -value.Xy(),
                -value.Xz(),
                -value.Xw(),
                -value.Yx(),
                -value.Yy(),
                -value.Yz(),
                -value.Yw(),
                -value.Zx(),
                -value.Zy(),
                -value.Zz(),
                -value.Zw(),
                -value.Tx(),
                -value.Ty(),
                -value.Tz(),
                -value.Tw()
        );
    }

    public static <R> R add(Matrix4x4.Accessible left, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() + right,
                left.Xy() + right,
                left.Xz() + right,
                left.Xw() + right,
                left.Yx() + right,
                left.Yy() + right,
                left.Yz() + right,
                left.Yw() + right,
                left.Zx() + right,
                left.Zy() + right,
                left.Zz() + right,
                left.Zw() + right,
                left.Tx() + right,
                left.Ty() + right,
                left.Tz() + right,
                left.Tw() + right
        );
    }

    public static void add(Matrix4x4.Consumer result, Matrix4x4.Accessible left, double right) {
        result.set4x4(
                left.Xx() + right,
                left.Xy() + right,
                left.Xz() + right,
                left.Xw() + right,
                left.Yx() + right,
                left.Yy() + right,
                left.Yz() + right,
                left.Yw() + right,
                left.Zx() + right,
                left.Zy() + right,
                left.Zz() + right,
                left.Zw() + right,
                left.Tx() + right,
                left.Ty() + right,
                left.Tz() + right,
                left.Tw() + right
        );
    }

    public static <R> R add(Matrix4x4.Accessible left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() + right.Xx(),
                left.Xy() + right.Xy(),
                left.Xz() + right.Xz(),
                left.Xw() + right.Xw(),
                left.Yx() + right.Yx(),
                left.Yy() + right.Yy(),
                left.Yz() + right.Yz(),
                left.Yw() + right.Yw(),
                left.Zx() + right.Zx(),
                left.Zy() + right.Zy(),
                left.Zz() + right.Zz(),
                left.Zw() + right.Zw(),
                left.Tx() + right.Tx(),
                left.Ty() + right.Ty(),
                left.Tz() + right.Tz(),
                left.Tw() + right.Tw()
        );
    }

    public static void add(Matrix4x4.Consumer result, Matrix4x4.Accessible left, Matrix4x4.Accessible right) {
        result.set4x4(
                left.Xx() + right.Xx(),
                left.Xy() + right.Xy(),
                left.Xz() + right.Xz(),
                left.Xw() + right.Xw(),
                left.Yx() + right.Yx(),
                left.Yy() + right.Yy(),
                left.Yz() + right.Yz(),
                left.Yw() + right.Yw(),
                left.Zx() + right.Zx(),
                left.Zy() + right.Zy(),
                left.Zz() + right.Zz(),
                left.Zw() + right.Zw(),
                left.Tx() + right.Tx(),
                left.Ty() + right.Ty(),
                left.Tz() + right.Tz(),
                left.Tw() + right.Tw()
        );
    }

    public static <R> R subtract(Matrix4x4.Accessible left, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() - right,
                left.Xy() - right,
                left.Xz() - right,
                left.Xw() - right,
                left.Yx() - right,
                left.Yy() - right,
                left.Yz() - right,
                left.Yw() - right,
                left.Zx() - right,
                left.Zy() - right,
                left.Zz() - right,
                left.Zw() - right,
                left.Tx() - right,
                left.Ty() - right,
                left.Tz() - right,
                left.Tw() - right
        );
    }

    public static void subtract(Matrix4x4.Consumer result, Matrix4x4.Accessible left, double right) {
        result.set4x4(
                left.Xx() - right,
                left.Xy() - right,
                left.Xz() - right,
                left.Xw() - right,
                left.Yx() - right,
                left.Yy() - right,
                left.Yz() - right,
                left.Yw() - right,
                left.Zx() - right,
                left.Zy() - right,
                left.Zz() - right,
                left.Zw() - right,
                left.Tx() - right,
                left.Ty() - right,
                left.Tz() - right,
                left.Tw() - right
        );
    }

    public static <R> R subtract(Matrix4x4.Accessible left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() - right.Xx(),
                left.Xy() - right.Xy(),
                left.Xz() - right.Xz(),
                left.Xw() - right.Xw(),
                left.Yx() - right.Yx(),
                left.Yy() - right.Yy(),
                left.Yz() - right.Yz(),
                left.Yw() - right.Yw(),
                left.Zx() - right.Zx(),
                left.Zy() - right.Zy(),
                left.Zz() - right.Zz(),
                left.Zw() - right.Zw(),
                left.Tx() - right.Tx(),
                left.Ty() - right.Ty(),
                left.Tz() - right.Tz(),
                left.Tw() - right.Tw()
        );
    }

    public static void subtract(Matrix4x4.Consumer result, Matrix4x4.Accessible left, Matrix4x4.Accessible right) {
        result.set4x4(
                left.Xx() - right.Xx(),
                left.Xy() - right.Xy(),
                left.Xz() - right.Xz(),
                left.Xw() - right.Xw(),
                left.Yx() - right.Yx(),
                left.Yy() - right.Yy(),
                left.Yz() - right.Yz(),
                left.Yw() - right.Yw(),
                left.Zx() - right.Zx(),
                left.Zy() - right.Zy(),
                left.Zz() - right.Zz(),
                left.Zw() - right.Zw(),
                left.Tx() - right.Tx(),
                left.Ty() - right.Ty(),
                left.Tz() - right.Tz(),
                left.Tw() - right.Tw()
        );
    }

    public static <R> R subtract(double left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left - right.Xx(),
                left - right.Xy(),
                left - right.Xz(),
                left - right.Xw(),
                left - right.Yx(),
                left - right.Yy(),
                left - right.Yz(),
                left - right.Yw(),
                left - right.Zx(),
                left - right.Zy(),
                left - right.Zz(),
                left - right.Zw(),
                left - right.Tx(),
                left - right.Ty(),
                left - right.Tz(),
                left - right.Tw()
        );
    }

    public static void subtract(Matrix4x4.Consumer result, double left, Matrix4x4.Accessible right) {
        result.set4x4(
                left - right.Xx(),
                left - right.Xy(),
                left - right.Xz(),
                left - right.Xw(),
                left - right.Yx(),
                left - right.Yy(),
                left - right.Yz(),
                left - right.Yw(),
                left - right.Zx(),
                left - right.Zy(),
                left - right.Zz(),
                left - right.Zw(),
                left - right.Tx(),
                left - right.Ty(),
                left - right.Tz(),
                left - right.Tw()
        );
    }

    public static <R> R multiply(Matrix4x4.Accessible left, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() * right,
                left.Xy() * right,
                left.Xz() * right,
                left.Xw() * right,
                left.Yx() * right,
                left.Yy() * right,
                left.Yz() * right,
                left.Yw() * right,
                left.Zx() * right,
                left.Zy() * right,
                left.Zz() * right,
                left.Zw() * right,
                left.Tx() * right,
                left.Ty() * right,
                left.Tz() * right,
                left.Tw() * right
        );
    }

    public static void multiply(Matrix4x4.Consumer result, Matrix4x4.Accessible left, double right) {
        result.set4x4(
                left.Xx() * right,
                left.Xy() * right,
                left.Xz() * right,
                left.Xw() * right,
                left.Yx() * right,
                left.Yy() * right,
                left.Yz() * right,
                left.Yw() * right,
                left.Zx() * right,
                left.Zy() * right,
                left.Zz() * right,
                left.Zw() * right,
                left.Tx() * right,
                left.Ty() * right,
                left.Tz() * right,
                left.Tw() * right
        );
    }

    public static <R> R divide(Matrix4x4.Accessible left, double right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left.Xx() / right,
                left.Xy() / right,
                left.Xz() / right,
                left.Xw() / right,
                left.Yx() / right,
                left.Yy() / right,
                left.Yz() / right,
                left.Yw() / right,
                left.Zx() / right,
                left.Zy() / right,
                left.Zz() / right,
                left.Zw() / right,
                left.Tx() / right,
                left.Ty() / right,
                left.Tz() / right,
                left.Tw() / right
        );
    }

    public static void divide(Matrix4x4.Consumer result, Matrix4x4.Accessible left, double right) {
        result.set4x4(
                left.Xx() / right,
                left.Xy() / right,
                left.Xz() / right,
                left.Xw() / right,
                left.Yx() / right,
                left.Yy() / right,
                left.Yz() / right,
                left.Yw() / right,
                left.Zx() / right,
                left.Zy() / right,
                left.Zz() / right,
                left.Zw() / right,
                left.Tx() / right,
                left.Ty() / right,
                left.Tz() / right,
                left.Tw() / right
        );
    }

    public static <R> R divide(double left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        return resultFactory.create(
                left / right.Xx(),
                left / right.Xy(),
                left / right.Xz(),
                left / right.Xw(),
                left / right.Yx(),
                left / right.Yy(),
                left / right.Yz(),
                left / right.Yw(),
                left / right.Zx(),
                left / right.Zy(),
                left / right.Zz(),
                left / right.Zw(),
                left / right.Tx(),
                left / right.Ty(),
                left / right.Tz(),
                left / right.Tw()
        );
    }

    public static void divide(Matrix4x4.Consumer result, double left, Matrix4x4.Accessible right) {
        result.set4x4(
                left / right.Xx(),
                left / right.Xy(),
                left / right.Xz(),
                left / right.Xw(),
                left / right.Yx(),
                left / right.Yy(),
                left / right.Yz(),
                left / right.Yw(),
                left / right.Zx(),
                left / right.Zy(),
                left / right.Zz(),
                left / right.Zw(),
                left / right.Tx(),
                left / right.Ty(),
                left / right.Tz(),
                left / right.Tw()
        );
    }

    public static <R> R inverse(Matrix4x4.Accessible matrix, Matrix4x4.Factory<R> resultFactory) {
        final double matrixXx = matrix.Xx();
        final double matrixXy = matrix.Xy();
        final double matrixXz = matrix.Xz();
        final double matrixXw = matrix.Xw();
        final double matrixYx = matrix.Yx();
        final double matrixYy = matrix.Yy();
        final double matrixYz = matrix.Yz();
        final double matrixYw = matrix.Yw();
        final double matrixZx = matrix.Zx();
        final double matrixZy = matrix.Zy();
        final double matrixZz = matrix.Zz();
        final double matrixZw = matrix.Zw();
        final double matrixTx = matrix.Tx();
        final double matrixTy = matrix.Ty();
        final double matrixTz = matrix.Tz();
        final double matrixTw = matrix.Tw();

        final double det00 = matrixXx * matrixYy - matrixXy * matrixYx;
        final double det01 = matrixXx * matrixYz - matrixXz * matrixYx;
        final double det02 = matrixXx * matrixYw - matrixXw * matrixYx;
        final double det03 = matrixXy * matrixYz - matrixXz * matrixYy;
        final double det04 = matrixXy * matrixYw - matrixXw * matrixYy;
        final double det05 = matrixXz * matrixYw - matrixXw * matrixYz;
        final double det06 = matrixZx * matrixTy - matrixZy * matrixTx;
        final double det07 = matrixZx * matrixTz - matrixZz * matrixTx;
        final double det08 = matrixZx * matrixTw - matrixZw * matrixTx;
        final double det09 = matrixZy * matrixTz - matrixZz * matrixTy;
        final double det10 = matrixZy * matrixTw - matrixZw * matrixTy;
        final double det11 = matrixZz * matrixTw - matrixZw * matrixTz;

        double det = det00 * det11 - det01 * det10 + det02 * det09 + det03 * det08 - det04 * det07 + det05 * det06;
        det = (det != 0.0D) ? (1.0D / det) : 0.0D;

        return resultFactory.create(
                (matrixYy * det11 - matrixYz * det10 + matrixYw * det09) * det,
                (matrixXz * det10 - matrixXy * det11 - matrixXw * det09) * det,
                (matrixTy * det05 - matrixTz * det04 + matrixTw * det03) * det,
                (matrixZz * det04 - matrixZy * det05 - matrixZw * det03) * det,
                (matrixYz * det08 - matrixYx * det11 - matrixYw * det07) * det,
                (matrixXx * det11 - matrixXz * det08 + matrixXw * det07) * det,
                (matrixTz * det02 - matrixTx * det05 - matrixTw * det01) * det,
                (matrixZx * det05 - matrixZz * det02 + matrixZw * det01) * det,
                (matrixYx * det10 - matrixYy * det08 + matrixYw * det06) * det,
                (matrixXy * det08 - matrixXx * det10 - matrixXw * det06) * det,
                (matrixTx * det04 - matrixTy * det02 + matrixTw * det00) * det,
                (matrixZy * det02 - matrixZx * det04 - matrixZw * det00) * det,
                (matrixYy * det07 - matrixYx * det09 - matrixYz * det06) * det,
                (matrixXx * det09 - matrixXy * det07 + matrixXz * det06) * det,
                (matrixTy * det01 - matrixTx * det03 - matrixTz * det00) * det,
                (matrixZx * det03 - matrixZy * det01 + matrixZz * det00) * det
        );
    }

    public static void inverse(Matrix4x4.Consumer result, Matrix4x4.Accessible matrix) {
        final double matrixXx = matrix.Xx();
        final double matrixXy = matrix.Xy();
        final double matrixXz = matrix.Xz();
        final double matrixXw = matrix.Xw();
        final double matrixYx = matrix.Yx();
        final double matrixYy = matrix.Yy();
        final double matrixYz = matrix.Yz();
        final double matrixYw = matrix.Yw();
        final double matrixZx = matrix.Zx();
        final double matrixZy = matrix.Zy();
        final double matrixZz = matrix.Zz();
        final double matrixZw = matrix.Zw();
        final double matrixTx = matrix.Tx();
        final double matrixTy = matrix.Ty();
        final double matrixTz = matrix.Tz();
        final double matrixTw = matrix.Tw();

        final double det00 = matrixXx * matrixYy - matrixXy * matrixYx;
        final double det01 = matrixXx * matrixYz - matrixXz * matrixYx;
        final double det02 = matrixXx * matrixYw - matrixXw * matrixYx;
        final double det03 = matrixXy * matrixYz - matrixXz * matrixYy;
        final double det04 = matrixXy * matrixYw - matrixXw * matrixYy;
        final double det05 = matrixXz * matrixYw - matrixXw * matrixYz;
        final double det06 = matrixZx * matrixTy - matrixZy * matrixTx;
        final double det07 = matrixZx * matrixTz - matrixZz * matrixTx;
        final double det08 = matrixZx * matrixTw - matrixZw * matrixTx;
        final double det09 = matrixZy * matrixTz - matrixZz * matrixTy;
        final double det10 = matrixZy * matrixTw - matrixZw * matrixTy;
        final double det11 = matrixZz * matrixTw - matrixZw * matrixTz;

        double det = det00 * det11 - det01 * det10 + det02 * det09 + det03 * det08 - det04 * det07 + det05 * det06;
        det = (det != 0.0D) ? (1.0D / det) : 0.0D;

        result.set4x4(
                (matrixYy * det11 - matrixYz * det10 + matrixYw * det09) * det,
                (matrixXz * det10 - matrixXy * det11 - matrixXw * det09) * det,
                (matrixTy * det05 - matrixTz * det04 + matrixTw * det03) * det,
                (matrixZz * det04 - matrixZy * det05 - matrixZw * det03) * det,
                (matrixYz * det08 - matrixYx * det11 - matrixYw * det07) * det,
                (matrixXx * det11 - matrixXz * det08 + matrixXw * det07) * det,
                (matrixTz * det02 - matrixTx * det05 - matrixTw * det01) * det,
                (matrixZx * det05 - matrixZz * det02 + matrixZw * det01) * det,
                (matrixYx * det10 - matrixYy * det08 + matrixYw * det06) * det,
                (matrixXy * det08 - matrixXx * det10 - matrixXw * det06) * det,
                (matrixTx * det04 - matrixTy * det02 + matrixTw * det00) * det,
                (matrixZy * det02 - matrixZx * det04 - matrixZw * det00) * det,
                (matrixYy * det07 - matrixYx * det09 - matrixYz * det06) * det,
                (matrixXx * det09 - matrixXy * det07 + matrixXz * det06) * det,
                (matrixTy * det01 - matrixTx * det03 - matrixTz * det00) * det,
                (matrixZx * det03 - matrixZy * det01 + matrixZz * det00) * det
        );
    }

    public static <R> R multiply(Matrix4x4.Accessible left, Matrix4x4.Accessible right, Matrix4x4.Factory<R> resultFactory) {
        final double leftXx = left.Xx();
        final double leftXy = left.Xy();
        final double leftXz = left.Xz();
        final double leftXw = left.Xw();
        final double leftYx = left.Yx();
        final double leftYy = left.Yy();
        final double leftYz = left.Yz();
        final double leftYw = left.Yw();
        final double leftZx = left.Zx();
        final double leftZy = left.Zy();
        final double leftZz = left.Zz();
        final double leftZw = left.Zw();
        final double leftTx = left.Tx();
        final double leftTy = left.Ty();
        final double leftTz = left.Tz();
        final double leftTw = left.Tw();

        final double rightXx = right.Xx();
        final double rightXy = right.Xy();
        final double rightXz = right.Xz();
        final double rightXw = right.Xw();
        final double rightYx = right.Yx();
        final double rightYy = right.Yy();
        final double rightYz = right.Yz();
        final double rightYw = right.Yw();
        final double rightZx = right.Zx();
        final double rightZy = right.Zy();
        final double rightZz = right.Zz();
        final double rightZw = right.Zw();
        final double rightTx = right.Tx();
        final double rightTy = right.Ty();
        final double rightTz = right.Tz();
        final double rightTw = right.Tw();

        return resultFactory.create(
                leftXx * rightXx + leftYx * rightXy + leftZx * rightXz + leftTx * rightXw,
                leftXy * rightXx + leftYy * rightXy + leftZy * rightXz + leftTy * rightXw,
                leftXz * rightXx + leftYz * rightXy + leftZz * rightXz + leftTz * rightXw,
                leftXw * rightXx + leftYw * rightXy + leftZw * rightXz + leftTw * rightXw,
                leftXx * rightYx + leftYx * rightYy + leftZx * rightYz + leftTx * rightYw,
                leftXy * rightYx + leftYy * rightYy + leftZy * rightYz + leftTy * rightYw,
                leftXz * rightYx + leftYz * rightYy + leftZz * rightYz + leftTz * rightYw,
                leftXw * rightYx + leftYw * rightYy + leftZw * rightYz + leftTw * rightYw,
                leftXx * rightZx + leftYx * rightZy + leftZx * rightZz + leftTx * rightZw,
                leftXy * rightZx + leftYy * rightZy + leftZy * rightZz + leftTy * rightZw,
                leftXz * rightZx + leftYz * rightZy + leftZz * rightZz + leftTz * rightZw,
                leftXw * rightZx + leftYw * rightZy + leftZw * rightZz + leftTw * rightZw,
                leftXx * rightTx + leftYx * rightTy + leftZx * rightTz + leftTx * rightTw,
                leftXy * rightTx + leftYy * rightTy + leftZy * rightTz + leftTy * rightTw,
                leftXz * rightTx + leftYz * rightTy + leftZz * rightTz + leftTz * rightTw,
                leftXw * rightTx + leftYw * rightTy + leftZw * rightTz + leftTw * rightTw
        );
    }

    public static void multiply(Matrix4x4.Consumer result, Matrix4x4.Accessible left, Matrix4x4.Accessible right) {
        final double leftXx = left.Xx();
        final double leftXy = left.Xy();
        final double leftXz = left.Xz();
        final double leftXw = left.Xw();
        final double leftYx = left.Yx();
        final double leftYy = left.Yy();
        final double leftYz = left.Yz();
        final double leftYw = left.Yw();
        final double leftZx = left.Zx();
        final double leftZy = left.Zy();
        final double leftZz = left.Zz();
        final double leftZw = left.Zw();
        final double leftTx = left.Tx();
        final double leftTy = left.Ty();
        final double leftTz = left.Tz();
        final double leftTw = left.Tw();

        final double rightXx = right.Xx();
        final double rightXy = right.Xy();
        final double rightXz = right.Xz();
        final double rightXw = right.Xw();
        final double rightYx = right.Yx();
        final double rightYy = right.Yy();
        final double rightYz = right.Yz();
        final double rightYw = right.Yw();
        final double rightZx = right.Zx();
        final double rightZy = right.Zy();
        final double rightZz = right.Zz();
        final double rightZw = right.Zw();
        final double rightTx = right.Tx();
        final double rightTy = right.Ty();
        final double rightTz = right.Tz();
        final double rightTw = right.Tw();

        result.set4x4(
                leftXx * rightXx + leftYx * rightXy + leftZx * rightXz + leftTx * rightXw,
                leftXy * rightXx + leftYy * rightXy + leftZy * rightXz + leftTy * rightXw,
                leftXz * rightXx + leftYz * rightXy + leftZz * rightXz + leftTz * rightXw,
                leftXw * rightXx + leftYw * rightXy + leftZw * rightXz + leftTw * rightXw,
                leftXx * rightYx + leftYx * rightYy + leftZx * rightYz + leftTx * rightYw,
                leftXy * rightYx + leftYy * rightYy + leftZy * rightYz + leftTy * rightYw,
                leftXz * rightYx + leftYz * rightYy + leftZz * rightYz + leftTz * rightYw,
                leftXw * rightYx + leftYw * rightYy + leftZw * rightYz + leftTw * rightYw,
                leftXx * rightZx + leftYx * rightZy + leftZx * rightZz + leftTx * rightZw,
                leftXy * rightZx + leftYy * rightZy + leftZy * rightZz + leftTy * rightZw,
                leftXz * rightZx + leftYz * rightZy + leftZz * rightZz + leftTz * rightZw,
                leftXw * rightZx + leftYw * rightZy + leftZw * rightZz + leftTw * rightZw,
                leftXx * rightTx + leftYx * rightTy + leftZx * rightTz + leftTx * rightTw,
                leftXy * rightTx + leftYy * rightTy + leftZy * rightTz + leftTy * rightTw,
                leftXz * rightTx + leftYz * rightTy + leftZz * rightTz + leftTz * rightTw,
                leftXw * rightTx + leftYw * rightTy + leftZw * rightTz + leftTw * rightTw
        );
    }

    public static <R> R multiply(Matrix4x4.Accessible left, Vector4.Accessible right, Vector4.Factory<R> resultFactory) {
        final double rightX = right.x();
        final double rightY = right.y();
        final double rightZ = right.z();
        final double rightW = right.w();

        return resultFactory.create(
                left.Xx() * rightX + left.Yx() * rightY + left.Zx() * rightZ + left.Tx() * rightW,
                left.Xy() * rightX + left.Yy() * rightY + left.Zy() * rightZ + left.Ty() * rightW,
                left.Xz() * rightX + left.Yz() * rightY + left.Zz() * rightZ + left.Tz() * rightW,
                left.Xw() * rightX + left.Yw() * rightY + left.Zw() * rightZ + left.Tw() * rightW
        );
    }

    public static void multiply(Vector4.Consumer result, Matrix4x4.Accessible left, Vector4.Accessible right) {
        final double rightX = right.x();
        final double rightY = right.y();
        final double rightZ = right.z();
        final double rightW = right.w();

        result.xyzw(
                left.Xx() * rightX + left.Yx() * rightY + left.Zx() * rightZ + left.Tx() * rightW,
                left.Xy() * rightX + left.Yy() * rightY + left.Zy() * rightZ + left.Ty() * rightW,
                left.Xz() * rightX + left.Yz() * rightY + left.Zz() * rightZ + left.Tz() * rightW,
                left.Xw() * rightX + left.Yw() * rightY + left.Zw() * rightZ + left.Tw() * rightW
        );
    }

    public static <R> R transformPosition(Matrix4x4.Accessible transformationMatrix, Vector3.Accessible position, Vector3.Factory<R> resultFactory) {
        final double positionX = position.x();
        final double positionY = position.y();
        final double positionZ = position.z();

        return resultFactory.create(
                transformationMatrix.Xx() * positionX + transformationMatrix.Yx() * positionY + transformationMatrix.Zx() * positionZ + transformationMatrix.Tx(),
                transformationMatrix.Xy() * positionX + transformationMatrix.Yy() * positionY + transformationMatrix.Zy() * positionZ + transformationMatrix.Ty(),
                transformationMatrix.Xz() * positionX + transformationMatrix.Yz() * positionY + transformationMatrix.Zz() * positionZ + transformationMatrix.Tz()
        );
    }

    public static void transformPosition(Vector3.Consumer result, Matrix4x4.Accessible transformationMatrix, Vector3.Accessible position) {
        final double positionX = position.x();
        final double positionY = position.y();
        final double positionZ = position.z();

        result.xyz(
                transformationMatrix.Xx() * positionX + transformationMatrix.Yx() * positionY + transformationMatrix.Zx() * positionZ + transformationMatrix.Tx(),
                transformationMatrix.Xy() * positionX + transformationMatrix.Yy() * positionY + transformationMatrix.Zy() * positionZ + transformationMatrix.Ty(),
                transformationMatrix.Xz() * positionX + transformationMatrix.Yz() * positionY + transformationMatrix.Zz() * positionZ + transformationMatrix.Tz()
        );
    }

    public static <R> R transformDirection(Matrix4x4.Accessible transformationMatrix, Vector3.Accessible direction, Vector3.Factory<R> resultFactory) {
        final double directionX = direction.x();
        final double directionY = direction.y();
        final double directionZ = direction.z();

        return resultFactory.create(
                transformationMatrix.Xx() * directionX + transformationMatrix.Yx() * directionY + transformationMatrix.Zx() * directionZ,
                transformationMatrix.Xy() * directionX + transformationMatrix.Yy() * directionY + transformationMatrix.Zy() * directionZ,
                transformationMatrix.Xz() * directionX + transformationMatrix.Yz() * directionY + transformationMatrix.Zz() * directionZ
        );
    }

    public static void transformDirection(Vector3.Consumer result, Matrix4x4.Accessible transformationMatrix, Vector3.Accessible direction) {
        final double directionX = direction.x();
        final double directionY = direction.y();
        final double directionZ = direction.z();

        result.xyz(
                transformationMatrix.Xx() * directionX + transformationMatrix.Yx() * directionY + transformationMatrix.Zx() * directionZ,
                transformationMatrix.Xy() * directionX + transformationMatrix.Yy() * directionY + transformationMatrix.Zy() * directionZ,
                transformationMatrix.Xz() * directionX + transformationMatrix.Yz() * directionY + transformationMatrix.Zz() * directionZ
        );
    }

}
