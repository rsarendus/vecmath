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

}
