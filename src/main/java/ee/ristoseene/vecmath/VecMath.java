package ee.ristoseene.vecmath;

public final class VecMath {

    private VecMath() {}

    public static double clamp(final double value, final double min, final double max) {
        return Math.min(Math.max(value, min), max);
    }

    public static double lerp(final double a, final double b, final double t) {
        return a * (1.0D - t) + b * t;
    }

    public static double min(final Vector2.Accessible vector) {
        return Math.min(vector.x(), vector.y());
    }

    public static double max(final Vector2.Accessible vector) {
        return Math.max(vector.x(), vector.y());
    }

    public static <R> R min(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b),
                Math.min(a.y(), b)
        );
    }

    public static void minTo(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(a.x(), b),
                Math.min(a.y(), b)
        );
    }

    public static <R> R min(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y())
        );
    }

    public static void minTo(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y())
        );
    }

    public static <R> R max(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b),
                Math.max(a.y(), b)
        );
    }

    public static void maxTo(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.max(a.x(), b),
                Math.max(a.y(), b)
        );
    }

    public static <R> R max(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y())
        );
    }

    public static void maxTo(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y())
        );
    }

    public static <R> R clamp(final Vector2.Accessible value, final double min, final double max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min), max),
                Math.min(Math.max(value.y(), min), max)
        );
    }

    public static void clampTo(final Vector2.Accessible value, final double min, final double max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(value.x(), min), max),
                Math.min(Math.max(value.y(), min), max)
        );
    }

    public static <R> R clamp(final Vector2.Accessible value, final Vector2.Accessible min, final double max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min.x()), max),
                Math.min(Math.max(value.y(), min.y()), max)
        );
    }

    public static void clampTo(final Vector2.Accessible value, final Vector2.Accessible min, final double max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(value.x(), min.x()), max),
                Math.min(Math.max(value.y(), min.y()), max)
        );
    }

    public static <R> R clamp(final Vector2.Accessible value, final double min, final Vector2.Accessible max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min), max.x()),
                Math.min(Math.max(value.y(), min), max.y())
        );
    }

    public static void clampTo(final Vector2.Accessible value, final double min, final Vector2.Accessible max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(value.x(), min), max.x()),
                Math.min(Math.max(value.y(), min), max.y())
        );
    }

    public static <R> R clamp(final Vector2.Accessible value, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min.x()), max.x()),
                Math.min(Math.max(value.y(), min.y()), max.y())
        );
    }

    public static void clampTo(final Vector2.Accessible value, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(value.x(), min.x()), max.x()),
                Math.min(Math.max(value.y(), min.y()), max.y())
        );
    }

    public static <R> R clamp(final double value, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value, min.x()), max.x()),
                Math.min(Math.max(value, min.y()), max.y())
        );
    }

    public static void clampTo(final double value, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(value, min.x()), max.x()),
                Math.min(Math.max(value, min.y()), max.y())
        );
    }

    public static <R> R lerp(final Vector2.Accessible a, final double b, final double t, final Vector2.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        return factory.create(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT
        );
    }

    public static void lerpTo(final Vector2.Accessible a, final double b, final double t, final Vector2.Consumer consumer) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        consumer.xy(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT
        );
    }

    public static <R> R lerp(final Vector2.Accessible a, final Vector2.Accessible b, final double t, final Vector2.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;

        return factory.create(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t
        );
    }

    public static void lerpTo(final Vector2.Accessible a, final Vector2.Accessible b, final double t, final Vector2.Consumer consumer) {
        final double oneMinusT = 1.0D - t;

        consumer.xy(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t
        );
    }

    public static <R> R lerp(final double a, final Vector2.Accessible b, final double t, final Vector2.Factory<R> factory) {
        final double aOneMinusT = a * (1.0D - t);

        return factory.create(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t
        );
    }

    public static void lerpTo(final double a, final Vector2.Accessible b, final double t, final Vector2.Consumer consumer) {
        final double aOneMinusT = a * (1.0D - t);

        consumer.xy(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t
        );
    }

    public static <R> R lerp(final Vector2.Accessible a, final double b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y())
        );
    }

    public static void lerpTo(final Vector2.Accessible a, final double b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y())
        );
    }

    public static <R> R lerp(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y())
        );
    }

    public static void lerpTo(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y())
        );
    }

    public static <R> R lerp(final double a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y())
        );
    }

    public static void lerpTo(final double a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y())
        );
    }

    public static <R> R lerp(final double a, final double b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a, b, t.x()),
                lerp(a, b, t.y())
        );
    }

    public static void lerpTo(final double a, final double b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a, b, t.x()),
                lerp(a, b, t.y())
        );
    }

    public static <R> R negate(final Vector2.Accessible vector, final Vector2.Factory<R> factory) {
        return factory.create(
                -vector.x(),
                -vector.y()
        );
    }

    public static void negateTo(final Vector2.Accessible vector, final Vector2.Consumer consumer) {
        consumer.xy(
                -vector.x(),
                -vector.y()
        );
    }

    public static <R> R add(final Vector2.Accessible augend, final double addend, final Vector2.Factory<R> factory) {
        return factory.create(
                augend.x() + addend,
                augend.y() + addend
        );
    }

    public static void addTo(final Vector2.Accessible augend, final double addend, final Vector2.Consumer consumer) {
        consumer.xy(
                augend.x() + addend,
                augend.y() + addend
        );
    }

    public static <R> R add(final Vector2.Accessible augend, final Vector2.Accessible addend, final Vector2.Factory<R> factory) {
        return factory.create(
                augend.x() + addend.x(),
                augend.y() + addend.y()
        );
    }

    public static void addTo(final Vector2.Accessible augend, final Vector2.Accessible addend, final Vector2.Consumer consumer) {
        consumer.xy(
                augend.x() + addend.x(),
                augend.y() + addend.y()
        );
    }

    public static <R> R subtract(final Vector2.Accessible minuend, final double subtrahend, final Vector2.Factory<R> factory) {
        return factory.create(
                minuend.x() - subtrahend,
                minuend.y() - subtrahend
        );
    }

    public static void subtractTo(final Vector2.Accessible minuend, final double subtrahend, final Vector2.Consumer consumer) {
        consumer.xy(
                minuend.x() - subtrahend,
                minuend.y() - subtrahend
        );
    }

    public static <R> R subtract(final Vector2.Accessible minuend, final Vector2.Accessible subtrahend, final Vector2.Factory<R> factory) {
        return factory.create(
                minuend.x() - subtrahend.x(),
                minuend.y() - subtrahend.y()
        );
    }

    public static void subtractTo(final Vector2.Accessible minuend, final Vector2.Accessible subtrahend, final Vector2.Consumer consumer) {
        consumer.xy(
                minuend.x() - subtrahend.x(),
                minuend.y() - subtrahend.y()
        );
    }

    public static <R> R subtract(final double minuend, final Vector2.Accessible subtrahend, final Vector2.Factory<R> factory) {
        return factory.create(
                minuend - subtrahend.x(),
                minuend - subtrahend.y()
        );
    }

    public static void subtractTo(final double minuend, final Vector2.Accessible subtrahend, final Vector2.Consumer consumer) {
        consumer.xy(
                minuend - subtrahend.x(),
                minuend - subtrahend.y()
        );
    }

    public static <R> R multiply(final Vector2.Accessible multiplicand, final double multiplier, final Vector2.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier,
                multiplicand.y() * multiplier
        );
    }

    public static void multiplyTo(final Vector2.Accessible multiplicand, final double multiplier, final Vector2.Consumer consumer) {
        consumer.xy(
                multiplicand.x() * multiplier,
                multiplicand.y() * multiplier
        );
    }

    public static <R> R multiply(final Vector2.Accessible multiplicand, final Vector2.Accessible multiplier, final Vector2.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x(),
                multiplicand.y() * multiplier.y()
        );
    }

    public static void multiplyTo(final Vector2.Accessible multiplicand, final Vector2.Accessible multiplier, final Vector2.Consumer consumer) {
        consumer.xy(
                multiplicand.x() * multiplier.x(),
                multiplicand.y() * multiplier.y()
        );
    }

    public static <R> R divide(final Vector2.Accessible dividend, final double divisor, final Vector2.Factory<R> factory) {
        final double inverseDivisor = 1.0D / divisor;

        return factory.create(
                dividend.x() * inverseDivisor,
                dividend.y() * inverseDivisor
        );
    }

    public static void divideTo(final Vector2.Accessible dividend, final double divisor, final Vector2.Consumer consumer) {
        final double inverseDivisor = 1.0D / divisor;

        consumer.xy(
                dividend.x() * inverseDivisor,
                dividend.y() * inverseDivisor
        );
    }

    public static <R> R divide(final Vector2.Accessible dividend, final Vector2.Accessible divisor, final Vector2.Factory<R> factory) {
        return factory.create(
                dividend.x() / divisor.x(),
                dividend.y() / divisor.y()
        );
    }

    public static void divideTo(final Vector2.Accessible dividend, final Vector2.Accessible divisor, final Vector2.Consumer consumer) {
        consumer.xy(
                dividend.x() / divisor.x(),
                dividend.y() / divisor.y()
        );
    }

    public static <R> R divide(final double dividend, final Vector2.Accessible divisor, final Vector2.Factory<R> factory) {
        return factory.create(
                dividend / divisor.x(),
                dividend / divisor.y()
        );
    }

    public static void divideTo(final double dividend, final Vector2.Accessible divisor, final Vector2.Consumer consumer) {
        consumer.xy(
                dividend / divisor.x(),
                dividend / divisor.y()
        );
    }

    public static <R> R fma(final Vector2.Accessible multiplicand, final double multiplier, final double addend, final Vector2.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier + addend,
                multiplicand.y() * multiplier + addend
        );
    }

    public static void fmaTo(final Vector2.Accessible multiplicand, final double multiplier, final double addend, final Vector2.Consumer consumer) {
        consumer.xy(
                multiplicand.x() * multiplier + addend,
                multiplicand.y() * multiplier + addend
        );
    }

    public static <R> R fma(final Vector2.Accessible multiplicand, final Vector2.Accessible multiplier, final double addend, final Vector2.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x() + addend,
                multiplicand.y() * multiplier.y() + addend
        );
    }

    public static void fmaTo(final Vector2.Accessible multiplicand, final Vector2.Accessible multiplier, final double addend, final Vector2.Consumer consumer) {
        consumer.xy(
                multiplicand.x() * multiplier.x() + addend,
                multiplicand.y() * multiplier.y() + addend
        );
    }

    public static <R> R fma(final Vector2.Accessible multiplicand, final double multiplier, final Vector2.Accessible addend, final Vector2.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier + addend.x(),
                multiplicand.y() * multiplier + addend.y()
        );
    }

    public static void fmaTo(final Vector2.Accessible multiplicand, final double multiplier, final Vector2.Accessible addend, final Vector2.Consumer consumer) {
        consumer.xy(
                multiplicand.x() * multiplier + addend.x(),
                multiplicand.y() * multiplier + addend.y()
        );
    }

    public static <R> R fma(final Vector2.Accessible multiplicand, final Vector2.Accessible multiplier, final Vector2.Accessible addend, final Vector2.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x() + addend.x(),
                multiplicand.y() * multiplier.y() + addend.y()
        );
    }

    public static void fmaTo(final Vector2.Accessible multiplicand, final Vector2.Accessible multiplier, final Vector2.Accessible addend, final Vector2.Consumer consumer) {
        consumer.xy(
                multiplicand.x() * multiplier.x() + addend.x(),
                multiplicand.y() * multiplier.y() + addend.y()
        );
    }

    public static <R> R pow(final Vector2.Accessible base, final double exponent, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exponent),
                Math.pow(base.y(), exponent)
        );
    }

    public static void powTo(final Vector2.Accessible base, final double exponent, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.pow(base.x(), exponent),
                Math.pow(base.y(), exponent)
        );
    }

    public static <R> R pow(final Vector2.Accessible base, final Vector2.Accessible exponent, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exponent.x()),
                Math.pow(base.y(), exponent.y())
        );
    }

    public static void powTo(final Vector2.Accessible base, final Vector2.Accessible exponent, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.pow(base.x(), exponent.x()),
                Math.pow(base.y(), exponent.y())
        );
    }

    public static <R> R pow(final double base, final Vector2.Accessible exponent, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.pow(base, exponent.x()),
                Math.pow(base, exponent.y())
        );
    }

    public static void powTo(final double base, final Vector2.Accessible exponent, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.pow(base, exponent.x()),
                Math.pow(base, exponent.y())
        );
    }

    public static double squaredLength(final Vector2.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();

        return x * x + y * y;
    }

    public static double squaredDistance(final Vector2.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;

        return x * x + y * y;
    }

    public static double squaredDistance(final Vector2.Accessible a, final Vector2.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();

        return x * x + y * y;
    }

    public static double length(final Vector2.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();

        return Math.sqrt(x * x + y * y);
    }

    public static double distance(final Vector2.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;

        return Math.sqrt(x * x + y * y);
    }

    public static double distance(final Vector2.Accessible a, final Vector2.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();

        return Math.sqrt(x * x + y * y);
    }

    public static double dot(final Vector2.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();

        return x * x + y * y;
    }

    public static double dot(final Vector2.Accessible a, final double b) {
        return a.x() * b + a.y() * b;
    }

    public static double dot(final Vector2.Accessible a, final Vector2.Accessible b) {
        return a.x() * b.x() + a.y() * b.y();
    }

    public static <R> R normalize(final Vector2.Accessible vector, final Vector2.Factory<R> factory) {
        final double x = vector.x();
        final double y = vector.y();

        final double length = Math.sqrt(x * x + y * y);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        return factory.create(
                x * inverseLength,
                y * inverseLength
        );
    }

    public static void normalizeTo(final Vector2.Accessible vector, final Vector2.Consumer consumer) {
        final double x = vector.x();
        final double y = vector.y();

        final double length = Math.sqrt(x * x + y * y);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        consumer.xy(
                x * inverseLength,
                y * inverseLength
        );
    }

    public static <R> R reflect(final Vector2.Accessible incident, final Vector2.Accessible normal, final Vector2.Factory<R> factory) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();

        final double normalX = normal.x();
        final double normalY = normal.y();

        final double dotNI2 = (normalX * incidentX + normalY * incidentY) * 2.0D;

        return factory.create(
                incidentX - dotNI2 * normalX,
                incidentY - dotNI2 * normalY
        );
    }

    public static void reflectTo(final Vector2.Accessible incident, final Vector2.Accessible normal, final Vector2.Consumer consumer) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();

        final double normalX = normal.x();
        final double normalY = normal.y();

        final double dotNI2 = (normalX * incidentX + normalY * incidentY) * 2.0D;

        consumer.xy(
                incidentX - dotNI2 * normalX,
                incidentY - dotNI2 * normalY
        );
    }

    public static <R> R refract(final Vector2.Accessible incident, final Vector2.Accessible normal, final double eta, final Vector2.Factory<R> factory) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();

        final double normalX = normal.x();
        final double normalY = normal.y();

        final double dotNI = normalX * incidentX + normalY * incidentY;
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);

        if (k < 0.0D) {
            return factory.create(0.0D, 0.0D);
        }

        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);

        return factory.create(
                eta * incidentX - etaNIsqrtK * normalX,
                eta * incidentY - etaNIsqrtK * normalY
        );
    }

    public static void refractTo(final Vector2.Accessible incident, final Vector2.Accessible normal, final double eta, final Vector2.Consumer consumer) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();

        final double normalX = normal.x();
        final double normalY = normal.y();

        final double dotNI = normalX * incidentX + normalY * incidentY;
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);

        if (k < 0.0D) {
            consumer.xy(0.0D, 0.0D);
            return;
        }

        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);

        consumer.xy(
                eta * incidentX - etaNIsqrtK * normalX,
                eta * incidentY - etaNIsqrtK * normalY
        );
    }

    public static double min(final Vector3.Accessible vector) {
        return Math.min(
                Math.min(vector.x(), vector.y()),
                vector.z()
        );
    }

    public static double min(final double x, final double y, final double z) {
        return Math.min(Math.min(x, y), z);
    }

    public static double max(final Vector3.Accessible vector) {
        return Math.max(
                Math.max(vector.x(), vector.y()),
                vector.z()
        );
    }

    public static double max(final double x, final double y, final double z) {
        return Math.max(Math.max(x, y), z);
    }

    public static <R> R min(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b)
        );
    }

    public static void minTo(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b)
        );
    }

    public static <R> R min(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z())
        );
    }

    public static void minTo(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z())
        );
    }

    public static <R> R max(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b)
        );
    }

    public static void maxTo(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b)
        );
    }

    public static <R> R max(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z())
        );
    }

    public static void maxTo(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z())
        );
    }

    public static <R> R clamp(final Vector3.Accessible value, final double min, final double max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min), max),
                Math.min(Math.max(value.y(), min), max),
                Math.min(Math.max(value.z(), min), max)
        );
    }

    public static void clampTo(final Vector3.Accessible value, final double min, final double max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(value.x(), min), max),
                Math.min(Math.max(value.y(), min), max),
                Math.min(Math.max(value.z(), min), max)
        );
    }

    public static <R> R clamp(final Vector3.Accessible value, final Vector3.Accessible min, final double max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min.x()), max),
                Math.min(Math.max(value.y(), min.y()), max),
                Math.min(Math.max(value.z(), min.z()), max)
        );
    }

    public static void clampTo(final Vector3.Accessible value, final Vector3.Accessible min, final double max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(value.x(), min.x()), max),
                Math.min(Math.max(value.y(), min.y()), max),
                Math.min(Math.max(value.z(), min.z()), max)
        );
    }

    public static <R> R clamp(final Vector3.Accessible value, final double min, final Vector3.Accessible max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min), max.x()),
                Math.min(Math.max(value.y(), min), max.y()),
                Math.min(Math.max(value.z(), min), max.z())
        );
    }

    public static void clampTo(final Vector3.Accessible value, final double min, final Vector3.Accessible max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(value.x(), min), max.x()),
                Math.min(Math.max(value.y(), min), max.y()),
                Math.min(Math.max(value.z(), min), max.z())
        );
    }

    public static <R> R clamp(final Vector3.Accessible value, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min.x()), max.x()),
                Math.min(Math.max(value.y(), min.y()), max.y()),
                Math.min(Math.max(value.z(), min.z()), max.z())
        );
    }

    public static void clampTo(final Vector3.Accessible value, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(value.x(), min.x()), max.x()),
                Math.min(Math.max(value.y(), min.y()), max.y()),
                Math.min(Math.max(value.z(), min.z()), max.z())
        );
    }

    public static <R> R clamp(final double value, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value, min.x()), max.x()),
                Math.min(Math.max(value, min.y()), max.y()),
                Math.min(Math.max(value, min.z()), max.z())
        );
    }

    public static void clampTo(final double value, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(value, min.x()), max.x()),
                Math.min(Math.max(value, min.y()), max.y()),
                Math.min(Math.max(value, min.z()), max.z())
        );
    }

    public static <R> R lerp(final Vector3.Accessible a, final double b, final double t, final Vector3.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        return factory.create(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT
        );
    }

    public static void lerpTo(final Vector3.Accessible a, final double b, final double t, final Vector3.Consumer consumer) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        consumer.xyz(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT
        );
    }

    public static <R> R lerp(final Vector3.Accessible a, final Vector3.Accessible b, final double t, final Vector3.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;

        return factory.create(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t
        );
    }

    public static void lerpTo(final Vector3.Accessible a, final Vector3.Accessible b, final double t, final Vector3.Consumer consumer) {
        final double oneMinusT = 1.0D - t;

        consumer.xyz(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t
        );
    }

    public static <R> R lerp(final double a, final Vector3.Accessible b, final double t, final Vector3.Factory<R> factory) {
        final double aOneMinusT = a * (1.0D - t);

        return factory.create(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t
        );
    }

    public static void lerpTo(final double a, final Vector3.Accessible b, final double t, final Vector3.Consumer consumer) {
        final double aOneMinusT = a * (1.0D - t);

        consumer.xyz(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t
        );
    }

    public static <R> R lerp(final Vector3.Accessible a, final double b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z())
        );
    }

    public static void lerpTo(final Vector3.Accessible a, final double b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z())
        );
    }

    public static <R> R lerp(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z())
        );
    }

    public static void lerpTo(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z())
        );
    }

    public static <R> R lerp(final double a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z())
        );
    }

    public static void lerpTo(final double a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z())
        );
    }

    public static <R> R lerp(final double a, final double b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z())
        );
    }

    public static void lerpTo(final double a, final double b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z())
        );
    }

    public static <R> R negate(final Vector3.Accessible vector, final Vector3.Factory<R> factory) {
        return factory.create(
                -vector.x(),
                -vector.y(),
                -vector.z()
        );
    }

    public static void negateTo(final Vector3.Accessible vector, final Vector3.Consumer consumer) {
        consumer.xyz(
                -vector.x(),
                -vector.y(),
                -vector.z()
        );
    }

    public static <R> R add(final Vector3.Accessible augend, final double addend, final Vector3.Factory<R> factory) {
        return factory.create(
                augend.x() + addend,
                augend.y() + addend,
                augend.z() + addend
        );
    }

    public static void addTo(final Vector3.Accessible augend, final double addend, final Vector3.Consumer consumer) {
        consumer.xyz(
                augend.x() + addend,
                augend.y() + addend,
                augend.z() + addend
        );
    }

    public static <R> R add(final Vector3.Accessible augend, final Vector3.Accessible addend, final Vector3.Factory<R> factory) {
        return factory.create(
                augend.x() + addend.x(),
                augend.y() + addend.y(),
                augend.z() + addend.z()
        );
    }

    public static void addTo(final Vector3.Accessible augend, final Vector3.Accessible addend, final Vector3.Consumer consumer) {
        consumer.xyz(
                augend.x() + addend.x(),
                augend.y() + addend.y(),
                augend.z() + addend.z()
        );
    }

    public static <R> R subtract(final Vector3.Accessible minuend, final double subtrahend, final Vector3.Factory<R> factory) {
        return factory.create(
                minuend.x() - subtrahend,
                minuend.y() - subtrahend,
                minuend.z() - subtrahend
        );
    }

    public static void subtractTo(final Vector3.Accessible minuend, final double subtrahend, final Vector3.Consumer consumer) {
        consumer.xyz(
                minuend.x() - subtrahend,
                minuend.y() - subtrahend,
                minuend.z() - subtrahend
        );
    }

    public static <R> R subtract(final Vector3.Accessible minuend, final Vector3.Accessible subtrahend, final Vector3.Factory<R> factory) {
        return factory.create(
                minuend.x() - subtrahend.x(),
                minuend.y() - subtrahend.y(),
                minuend.z() - subtrahend.z()
        );
    }

    public static void subtractTo(final Vector3.Accessible minuend, final Vector3.Accessible subtrahend, final Vector3.Consumer consumer) {
        consumer.xyz(
                minuend.x() - subtrahend.x(),
                minuend.y() - subtrahend.y(),
                minuend.z() - subtrahend.z()
        );
    }

    public static <R> R subtract(final double minuend, final Vector3.Accessible subtrahend, final Vector3.Factory<R> factory) {
        return factory.create(
                minuend - subtrahend.x(),
                minuend - subtrahend.y(),
                minuend - subtrahend.z()
        );
    }

    public static void subtractTo(final double minuend, final Vector3.Accessible subtrahend, final Vector3.Consumer consumer) {
        consumer.xyz(
                minuend - subtrahend.x(),
                minuend - subtrahend.y(),
                minuend - subtrahend.z()
        );
    }

    public static <R> R multiply(final Vector3.Accessible multiplicand, final double multiplier, final Vector3.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier,
                multiplicand.y() * multiplier,
                multiplicand.z() * multiplier
        );
    }

    public static void multiplyTo(final Vector3.Accessible multiplicand, final double multiplier, final Vector3.Consumer consumer) {
        consumer.xyz(
                multiplicand.x() * multiplier,
                multiplicand.y() * multiplier,
                multiplicand.z() * multiplier
        );
    }

    public static <R> R multiply(final Vector3.Accessible multiplicand, final Vector3.Accessible multiplier, final Vector3.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x(),
                multiplicand.y() * multiplier.y(),
                multiplicand.z() * multiplier.z()
        );
    }

    public static void multiplyTo(final Vector3.Accessible multiplicand, final Vector3.Accessible multiplier, final Vector3.Consumer consumer) {
        consumer.xyz(
                multiplicand.x() * multiplier.x(),
                multiplicand.y() * multiplier.y(),
                multiplicand.z() * multiplier.z()
        );
    }

    public static <R> R divide(final Vector3.Accessible dividend, final double divisor, final Vector3.Factory<R> factory) {
        final double inverseDivisor = 1.0D / divisor;

        return factory.create(
                dividend.x() * inverseDivisor,
                dividend.y() * inverseDivisor,
                dividend.z() * inverseDivisor
        );
    }

    public static void divideTo(final Vector3.Accessible dividend, final double divisor, final Vector3.Consumer consumer) {
        final double inverseDivisor = 1.0D / divisor;

        consumer.xyz(
                dividend.x() * inverseDivisor,
                dividend.y() * inverseDivisor,
                dividend.z() * inverseDivisor
        );
    }

    public static <R> R divide(final Vector3.Accessible dividend, final Vector3.Accessible divisor, final Vector3.Factory<R> factory) {
        return factory.create(
                dividend.x() / divisor.x(),
                dividend.y() / divisor.y(),
                dividend.z() / divisor.z()
        );
    }

    public static void divideTo(final Vector3.Accessible dividend, final Vector3.Accessible divisor, final Vector3.Consumer consumer) {
        consumer.xyz(
                dividend.x() / divisor.x(),
                dividend.y() / divisor.y(),
                dividend.z() / divisor.z()
        );
    }

    public static <R> R divide(final double dividend, final Vector3.Accessible divisor, final Vector3.Factory<R> factory) {
        return factory.create(
                dividend / divisor.x(),
                dividend / divisor.y(),
                dividend / divisor.z()
        );
    }

    public static void divideTo(final double dividend, final Vector3.Accessible divisor, final Vector3.Consumer consumer) {
        consumer.xyz(
                dividend / divisor.x(),
                dividend / divisor.y(),
                dividend / divisor.z()
        );
    }

    public static <R> R fma(final Vector3.Accessible multiplicand, final double multiplier, final double addend, final Vector3.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier + addend,
                multiplicand.y() * multiplier + addend,
                multiplicand.z() * multiplier + addend
        );
    }

    public static void fmaTo(final Vector3.Accessible multiplicand, final double multiplier, final double addend, final Vector3.Consumer consumer) {
        consumer.xyz(
                multiplicand.x() * multiplier + addend,
                multiplicand.y() * multiplier + addend,
                multiplicand.z() * multiplier + addend
        );
    }

    public static <R> R fma(final Vector3.Accessible multiplicand, final Vector3.Accessible multiplier, final double addend, final Vector3.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x() + addend,
                multiplicand.y() * multiplier.y() + addend,
                multiplicand.z() * multiplier.z() + addend
        );
    }

    public static void fmaTo(final Vector3.Accessible multiplicand, final Vector3.Accessible multiplier, final double addend, final Vector3.Consumer consumer) {
        consumer.xyz(
                multiplicand.x() * multiplier.x() + addend,
                multiplicand.y() * multiplier.y() + addend,
                multiplicand.z() * multiplier.z() + addend
        );
    }

    public static <R> R fma(final Vector3.Accessible multiplicand, final double multiplier, final Vector3.Accessible addend, final Vector3.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier + addend.x(),
                multiplicand.y() * multiplier + addend.y(),
                multiplicand.z() * multiplier + addend.z()
        );
    }

    public static void fmaTo(final Vector3.Accessible multiplicand, final double multiplier, final Vector3.Accessible addend, final Vector3.Consumer consumer) {
        consumer.xyz(
                multiplicand.x() * multiplier + addend.x(),
                multiplicand.y() * multiplier + addend.y(),
                multiplicand.z() * multiplier + addend.z()
        );
    }

    public static <R> R fma(final Vector3.Accessible multiplicand, final Vector3.Accessible multiplier, final Vector3.Accessible addend, final Vector3.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x() + addend.x(),
                multiplicand.y() * multiplier.y() + addend.y(),
                multiplicand.z() * multiplier.z() + addend.z()
        );
    }

    public static void fmaTo(final Vector3.Accessible multiplicand, final Vector3.Accessible multiplier, final Vector3.Accessible addend, final Vector3.Consumer consumer) {
        consumer.xyz(
                multiplicand.x() * multiplier.x() + addend.x(),
                multiplicand.y() * multiplier.y() + addend.y(),
                multiplicand.z() * multiplier.z() + addend.z()
        );
    }

    public static <R> R pow(final Vector3.Accessible base, final double exponent, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exponent),
                Math.pow(base.y(), exponent),
                Math.pow(base.z(), exponent)
        );
    }

    public static void powTo(final Vector3.Accessible base, final double exponent, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.pow(base.x(), exponent),
                Math.pow(base.y(), exponent),
                Math.pow(base.z(), exponent)
        );
    }

    public static <R> R pow(final Vector3.Accessible base, final Vector3.Accessible exponent, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exponent.x()),
                Math.pow(base.y(), exponent.y()),
                Math.pow(base.z(), exponent.z())
        );
    }

    public static void powTo(final Vector3.Accessible base, final Vector3.Accessible exponent, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.pow(base.x(), exponent.x()),
                Math.pow(base.y(), exponent.y()),
                Math.pow(base.z(), exponent.z())
        );
    }

    public static <R> R pow(final double base, final Vector3.Accessible exponent, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.pow(base, exponent.x()),
                Math.pow(base, exponent.y()),
                Math.pow(base, exponent.z())
        );
    }

    public static void powTo(final double base, final Vector3.Accessible exponent, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.pow(base, exponent.x()),
                Math.pow(base, exponent.y()),
                Math.pow(base, exponent.z())
        );
    }

    public static double squaredLength(final Vector3.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();

        return x * x + y * y + z * z;
    }

    public static double squaredDistance(final Vector3.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;

        return x * x + y * y + z * z;
    }

    public static double squaredDistance(final Vector3.Accessible a, final Vector3.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();

        return x * x + y * y + z * z;
    }

    public static double length(final Vector3.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance(final Vector3.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance(final Vector3.Accessible a, final Vector3.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double dot(final Vector3.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();

        return x * x + y * y + z * z;
    }

    public static double dot(final Vector3.Accessible a, final double b) {
        return a.x() * b + a.y() * b + a.z() * b;
    }

    public static double dot(final Vector3.Accessible a, final Vector3.Accessible b) {
        return a.x() * b.x() + a.y() * b.y() + a.z() * b.z();
    }

    public static <R> R cross(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        final double aX = a.x();
        final double aY = a.y();
        final double aZ = a.z();

        final double bX = b.x();
        final double bY = b.y();
        final double bZ = b.z();

        return factory.create(
                aY * bZ - aZ * bY,
                aZ * bX - aX * bZ,
                aX * bY - aY * bX
        );
    }

    public static void crossTo(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        final double aX = a.x();
        final double aY = a.y();
        final double aZ = a.z();

        final double bX = b.x();
        final double bY = b.y();
        final double bZ = b.z();

        consumer.xyz(
                aY * bZ - aZ * bY,
                aZ * bX - aX * bZ,
                aX * bY - aY * bX
        );
    }

    public static <R> R normalize(final Vector3.Accessible vector, final Vector3.Factory<R> factory) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();

        final double length = Math.sqrt(x * x + y * y + z * z);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        return factory.create(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength
        );
    }

    public static void normalizeTo(final Vector3.Accessible vector, final Vector3.Consumer consumer) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();

        final double length = Math.sqrt(x * x + y * y + z * z);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        consumer.xyz(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength
        );
    }

    public static <R> R reflect(final Vector3.Accessible incident, final Vector3.Accessible normal, final Vector3.Factory<R> factory) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();

        final double dotNI2 = (normalX * incidentX + normalY * incidentY + normalZ * incidentZ) * 2.0D;

        return factory.create(
                incidentX - dotNI2 * normalX,
                incidentY - dotNI2 * normalY,
                incidentZ - dotNI2 * normalZ
        );
    }

    public static void reflectTo(final Vector3.Accessible incident, final Vector3.Accessible normal, final Vector3.Consumer consumer) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();

        final double dotNI2 = (normalX * incidentX + normalY * incidentY + normalZ * incidentZ) * 2.0D;

        consumer.xyz(
                incidentX - dotNI2 * normalX,
                incidentY - dotNI2 * normalY,
                incidentZ - dotNI2 * normalZ
        );
    }

    public static <R> R refract(final Vector3.Accessible incident, final Vector3.Accessible normal, final double eta, final Vector3.Factory<R> factory) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();

        final double dotNI = normalX * incidentX + normalY * incidentY + normalZ * incidentZ;
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);

        if (k < 0.0D) {
            return factory.create(0.0D, 0.0D, 0.0D);
        }

        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);

        return factory.create(
                eta * incidentX - etaNIsqrtK * normalX,
                eta * incidentY - etaNIsqrtK * normalY,
                eta * incidentZ - etaNIsqrtK * normalZ
        );
    }

    public static void refractTo(final Vector3.Accessible incident, final Vector3.Accessible normal, final double eta, final Vector3.Consumer consumer) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();

        final double dotNI = normalX * incidentX + normalY * incidentY + normalZ * incidentZ;
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);

        if (k < 0.0D) {
            consumer.xyz(0.0D, 0.0D, 0.0D);
            return;
        }

        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);

        consumer.xyz(
                eta * incidentX - etaNIsqrtK * normalX,
                eta * incidentY - etaNIsqrtK * normalY,
                eta * incidentZ - etaNIsqrtK * normalZ
        );
    }

    public static double min(final Vector4.Accessible vector) {
        return Math.min(
                Math.min(vector.x(), vector.y()),
                Math.min(vector.z(), vector.w())
        );
    }

    public static double min(final double x, final double y, final double z, final double w) {
        return Math.min(Math.min(x, y), Math.min(z, w));
    }

    public static double max(final Vector4.Accessible vector) {
        return Math.max(
                Math.max(vector.x(), vector.y()),
                Math.max(vector.z(), vector.w())
        );
    }

    public static double max(final double x, final double y, final double z, final double w) {
        return Math.max(Math.max(x, y), Math.max(z, w));
    }

    public static <R> R min(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b),
                Math.min(a.w(), b)
        );
    }

    public static void minTo(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b),
                Math.min(a.w(), b)
        );
    }

    public static <R> R min(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z()),
                Math.min(a.w(), b.w())
        );
    }

    public static void minTo(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z()),
                Math.min(a.w(), b.w())
        );
    }

    public static <R> R max(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b),
                Math.max(a.w(), b)
        );
    }

    public static void maxTo(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b),
                Math.max(a.w(), b)
        );
    }

    public static <R> R max(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z()),
                Math.max(a.w(), b.w())
        );
    }

    public static void maxTo(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z()),
                Math.max(a.w(), b.w())
        );
    }

    public static <R> R clamp(final Vector4.Accessible value, final double min, final double max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min), max),
                Math.min(Math.max(value.y(), min), max),
                Math.min(Math.max(value.z(), min), max),
                Math.min(Math.max(value.w(), min), max)
        );
    }

    public static void clampTo(final Vector4.Accessible value, final double min, final double max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(value.x(), min), max),
                Math.min(Math.max(value.y(), min), max),
                Math.min(Math.max(value.z(), min), max),
                Math.min(Math.max(value.w(), min), max)
        );
    }

    public static <R> R clamp(final Vector4.Accessible value, final Vector4.Accessible min, final double max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min.x()), max),
                Math.min(Math.max(value.y(), min.y()), max),
                Math.min(Math.max(value.z(), min.z()), max),
                Math.min(Math.max(value.w(), min.w()), max)
        );
    }

    public static void clampTo(final Vector4.Accessible value, final Vector4.Accessible min, final double max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(value.x(), min.x()), max),
                Math.min(Math.max(value.y(), min.y()), max),
                Math.min(Math.max(value.z(), min.z()), max),
                Math.min(Math.max(value.w(), min.w()), max)
        );
    }

    public static <R> R clamp(final Vector4.Accessible value, final double min, final Vector4.Accessible max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min), max.x()),
                Math.min(Math.max(value.y(), min), max.y()),
                Math.min(Math.max(value.z(), min), max.z()),
                Math.min(Math.max(value.w(), min), max.w())
        );
    }

    public static void clampTo(final Vector4.Accessible value, final double min, final Vector4.Accessible max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(value.x(), min), max.x()),
                Math.min(Math.max(value.y(), min), max.y()),
                Math.min(Math.max(value.z(), min), max.z()),
                Math.min(Math.max(value.w(), min), max.w())
        );
    }

    public static <R> R clamp(final Vector4.Accessible value, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value.x(), min.x()), max.x()),
                Math.min(Math.max(value.y(), min.y()), max.y()),
                Math.min(Math.max(value.z(), min.z()), max.z()),
                Math.min(Math.max(value.w(), min.w()), max.w())
        );
    }

    public static void clampTo(final Vector4.Accessible value, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(value.x(), min.x()), max.x()),
                Math.min(Math.max(value.y(), min.y()), max.y()),
                Math.min(Math.max(value.z(), min.z()), max.z()),
                Math.min(Math.max(value.w(), min.w()), max.w())
        );
    }

    public static <R> R clamp(final double value, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(value, min.x()), max.x()),
                Math.min(Math.max(value, min.y()), max.y()),
                Math.min(Math.max(value, min.z()), max.z()),
                Math.min(Math.max(value, min.w()), max.w())
        );
    }

    public static void clampTo(final double value, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(value, min.x()), max.x()),
                Math.min(Math.max(value, min.y()), max.y()),
                Math.min(Math.max(value, min.z()), max.z()),
                Math.min(Math.max(value, min.w()), max.w())
        );
    }

    public static <R> R lerp(final Vector4.Accessible a, final double b, final double t, final Vector4.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        return factory.create(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT,
                a.w() * oneMinusT + bT
        );
    }

    public static void lerpTo(final Vector4.Accessible a, final double b, final double t, final Vector4.Consumer consumer) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        consumer.xyzw(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT,
                a.w() * oneMinusT + bT
        );
    }

    public static <R> R lerp(final Vector4.Accessible a, final Vector4.Accessible b, final double t, final Vector4.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;

        return factory.create(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t,
                a.w() * oneMinusT + b.w() * t
        );
    }

    public static void lerpTo(final Vector4.Accessible a, final Vector4.Accessible b, final double t, final Vector4.Consumer consumer) {
        final double oneMinusT = 1.0D - t;

        consumer.xyzw(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t,
                a.w() * oneMinusT + b.w() * t
        );
    }

    public static <R> R lerp(final double a, final Vector4.Accessible b, final double t, final Vector4.Factory<R> factory) {
        final double aOneMinusT = a * (1.0D - t);

        return factory.create(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t,
                aOneMinusT + b.w() * t
        );
    }

    public static void lerpTo(final double a, final Vector4.Accessible b, final double t, final Vector4.Consumer consumer) {
        final double aOneMinusT = a * (1.0D - t);

        consumer.xyzw(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t,
                aOneMinusT + b.w() * t
        );
    }

    public static <R> R lerp(final Vector4.Accessible a, final double b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z()),
                lerp(a.w(), b, t.w())
        );
    }

    public static void lerpTo(final Vector4.Accessible a, final double b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z()),
                lerp(a.w(), b, t.w())
        );
    }

    public static <R> R lerp(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z()),
                lerp(a.w(), b.w(), t.w())
        );
    }

    public static void lerpTo(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z()),
                lerp(a.w(), b.w(), t.w())
        );
    }

    public static <R> R lerp(final double a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z()),
                lerp(a, b.w(), t.w())
        );
    }

    public static void lerpTo(final double a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z()),
                lerp(a, b.w(), t.w())
        );
    }

    public static <R> R lerp(final double a, final double b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z()),
                lerp(a, b, t.w())
        );
    }

    public static void lerpTo(final double a, final double b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z()),
                lerp(a, b, t.w())
        );
    }

    public static <R> R negate(final Vector4.Accessible vector, final Vector4.Factory<R> factory) {
        return factory.create(
                -vector.x(),
                -vector.y(),
                -vector.z(),
                -vector.w()
        );
    }

    public static void negateTo(final Vector4.Accessible vector, final Vector4.Consumer consumer) {
        consumer.xyzw(
                -vector.x(),
                -vector.y(),
                -vector.z(),
                -vector.w()
        );
    }

    public static <R> R add(final Vector4.Accessible augend, final double addend, final Vector4.Factory<R> factory) {
        return factory.create(
                augend.x() + addend,
                augend.y() + addend,
                augend.z() + addend,
                augend.w() + addend
        );
    }

    public static void addTo(final Vector4.Accessible augend, final double addend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                augend.x() + addend,
                augend.y() + addend,
                augend.z() + addend,
                augend.w() + addend
        );
    }

    public static <R> R add(final Vector4.Accessible augend, final Vector4.Accessible addend, final Vector4.Factory<R> factory) {
        return factory.create(
                augend.x() + addend.x(),
                augend.y() + addend.y(),
                augend.z() + addend.z(),
                augend.w() + addend.w()
        );
    }

    public static void addTo(final Vector4.Accessible augend, final Vector4.Accessible addend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                augend.x() + addend.x(),
                augend.y() + addend.y(),
                augend.z() + addend.z(),
                augend.w() + addend.w()
        );
    }

    public static <R> R subtract(final Vector4.Accessible minuend, final double subtrahend, final Vector4.Factory<R> factory) {
        return factory.create(
                minuend.x() - subtrahend,
                minuend.y() - subtrahend,
                minuend.z() - subtrahend,
                minuend.w() - subtrahend
        );
    }

    public static void subtractTo(final Vector4.Accessible minuend, final double subtrahend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                minuend.x() - subtrahend,
                minuend.y() - subtrahend,
                minuend.z() - subtrahend,
                minuend.w() - subtrahend
        );
    }

    public static <R> R subtract(final Vector4.Accessible minuend, final Vector4.Accessible subtrahend, final Vector4.Factory<R> factory) {
        return factory.create(
                minuend.x() - subtrahend.x(),
                minuend.y() - subtrahend.y(),
                minuend.z() - subtrahend.z(),
                minuend.w() - subtrahend.w()
        );
    }

    public static void subtractTo(final Vector4.Accessible minuend, final Vector4.Accessible subtrahend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                minuend.x() - subtrahend.x(),
                minuend.y() - subtrahend.y(),
                minuend.z() - subtrahend.z(),
                minuend.w() - subtrahend.w()
        );
    }

    public static <R> R subtract(final double minuend, final Vector4.Accessible subtrahend, final Vector4.Factory<R> factory) {
        return factory.create(
                minuend - subtrahend.x(),
                minuend - subtrahend.y(),
                minuend - subtrahend.z(),
                minuend - subtrahend.w()
        );
    }

    public static void subtractTo(final double minuend, final Vector4.Accessible subtrahend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                minuend - subtrahend.x(),
                minuend - subtrahend.y(),
                minuend - subtrahend.z(),
                minuend - subtrahend.w()
        );
    }

    public static <R> R multiply(final Vector4.Accessible multiplicand, final double multiplier, final Vector4.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier,
                multiplicand.y() * multiplier,
                multiplicand.z() * multiplier,
                multiplicand.w() * multiplier
        );
    }

    public static void multiplyTo(final Vector4.Accessible multiplicand, final double multiplier, final Vector4.Consumer consumer) {
        consumer.xyzw(
                multiplicand.x() * multiplier,
                multiplicand.y() * multiplier,
                multiplicand.z() * multiplier,
                multiplicand.w() * multiplier
        );
    }

    public static <R> R multiply(final Vector4.Accessible multiplicand, final Vector4.Accessible multiplier, final Vector4.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x(),
                multiplicand.y() * multiplier.y(),
                multiplicand.z() * multiplier.z(),
                multiplicand.w() * multiplier.w()
        );
    }

    public static void multiplyTo(final Vector4.Accessible multiplicand, final Vector4.Accessible multiplier, final Vector4.Consumer consumer) {
        consumer.xyzw(
                multiplicand.x() * multiplier.x(),
                multiplicand.y() * multiplier.y(),
                multiplicand.z() * multiplier.z(),
                multiplicand.w() * multiplier.w()
        );
    }

    public static <R> R divide(final Vector4.Accessible dividend, final double divisor, final Vector4.Factory<R> factory) {
        final double inverseDivisor = 1.0D / divisor;

        return factory.create(
                dividend.x() * inverseDivisor,
                dividend.y() * inverseDivisor,
                dividend.z() * inverseDivisor,
                dividend.w() * inverseDivisor
        );
    }

    public static void divideTo(final Vector4.Accessible dividend, final double divisor, final Vector4.Consumer consumer) {
        final double inverseDivisor = 1.0D / divisor;

        consumer.xyzw(
                dividend.x() * inverseDivisor,
                dividend.y() * inverseDivisor,
                dividend.z() * inverseDivisor,
                dividend.w() * inverseDivisor
        );
    }

    public static <R> R divide(final Vector4.Accessible dividend, final Vector4.Accessible divisor, final Vector4.Factory<R> factory) {
        return factory.create(
                dividend.x() / divisor.x(),
                dividend.y() / divisor.y(),
                dividend.z() / divisor.z(),
                dividend.w() / divisor.w()
        );
    }

    public static void divideTo(final Vector4.Accessible dividend, final Vector4.Accessible divisor, final Vector4.Consumer consumer) {
        consumer.xyzw(
                dividend.x() / divisor.x(),
                dividend.y() / divisor.y(),
                dividend.z() / divisor.z(),
                dividend.w() / divisor.w()
        );
    }

    public static <R> R divide(final double dividend, final Vector4.Accessible divisor, final Vector4.Factory<R> factory) {
        return factory.create(
                dividend / divisor.x(),
                dividend / divisor.y(),
                dividend / divisor.z(),
                dividend / divisor.w()
        );
    }

    public static void divideTo(final double dividend, final Vector4.Accessible divisor, final Vector4.Consumer consumer) {
        consumer.xyzw(
                dividend / divisor.x(),
                dividend / divisor.y(),
                dividend / divisor.z(),
                dividend / divisor.w()
        );
    }

    public static <R> R fma(final Vector4.Accessible multiplicand, final double multiplier, final double addend, final Vector4.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier + addend,
                multiplicand.y() * multiplier + addend,
                multiplicand.z() * multiplier + addend,
                multiplicand.w() * multiplier + addend
        );
    }

    public static void fmaTo(final Vector4.Accessible multiplicand, final double multiplier, final double addend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                multiplicand.x() * multiplier + addend,
                multiplicand.y() * multiplier + addend,
                multiplicand.z() * multiplier + addend,
                multiplicand.w() * multiplier + addend
        );
    }

    public static <R> R fma(final Vector4.Accessible multiplicand, final Vector4.Accessible multiplier, final double addend, final Vector4.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x() + addend,
                multiplicand.y() * multiplier.y() + addend,
                multiplicand.z() * multiplier.z() + addend,
                multiplicand.w() * multiplier.w() + addend
        );
    }

    public static void fmaTo(final Vector4.Accessible multiplicand, final Vector4.Accessible multiplier, final double addend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                multiplicand.x() * multiplier.x() + addend,
                multiplicand.y() * multiplier.y() + addend,
                multiplicand.z() * multiplier.z() + addend,
                multiplicand.w() * multiplier.w() + addend
        );
    }

    public static <R> R fma(final Vector4.Accessible multiplicand, final double multiplier, final Vector4.Accessible addend, final Vector4.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier + addend.x(),
                multiplicand.y() * multiplier + addend.y(),
                multiplicand.z() * multiplier + addend.z(),
                multiplicand.w() * multiplier + addend.w()
        );
    }

    public static void fmaTo(final Vector4.Accessible multiplicand, final double multiplier, final Vector4.Accessible addend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                multiplicand.x() * multiplier + addend.x(),
                multiplicand.y() * multiplier + addend.y(),
                multiplicand.z() * multiplier + addend.z(),
                multiplicand.w() * multiplier + addend.w()
        );
    }

    public static <R> R fma(final Vector4.Accessible multiplicand, final Vector4.Accessible multiplier, final Vector4.Accessible addend, final Vector4.Factory<R> factory) {
        return factory.create(
                multiplicand.x() * multiplier.x() + addend.x(),
                multiplicand.y() * multiplier.y() + addend.y(),
                multiplicand.z() * multiplier.z() + addend.z(),
                multiplicand.w() * multiplier.w() + addend.w()
        );
    }

    public static void fmaTo(final Vector4.Accessible multiplicand, final Vector4.Accessible multiplier, final Vector4.Accessible addend, final Vector4.Consumer consumer) {
        consumer.xyzw(
                multiplicand.x() * multiplier.x() + addend.x(),
                multiplicand.y() * multiplier.y() + addend.y(),
                multiplicand.z() * multiplier.z() + addend.z(),
                multiplicand.w() * multiplier.w() + addend.w()
        );
    }

    public static <R> R pow(final Vector4.Accessible base, final double exponent, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exponent),
                Math.pow(base.y(), exponent),
                Math.pow(base.z(), exponent),
                Math.pow(base.w(), exponent)
        );
    }

    public static void powTo(final Vector4.Accessible base, final double exponent, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.pow(base.x(), exponent),
                Math.pow(base.y(), exponent),
                Math.pow(base.z(), exponent),
                Math.pow(base.w(), exponent)
        );
    }

    public static <R> R pow(final Vector4.Accessible base, final Vector4.Accessible exponent, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exponent.x()),
                Math.pow(base.y(), exponent.y()),
                Math.pow(base.z(), exponent.z()),
                Math.pow(base.w(), exponent.w())
        );
    }

    public static void powTo(final Vector4.Accessible base, final Vector4.Accessible exponent, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.pow(base.x(), exponent.x()),
                Math.pow(base.y(), exponent.y()),
                Math.pow(base.z(), exponent.z()),
                Math.pow(base.w(), exponent.w())
        );
    }

    public static <R> R pow(final double base, final Vector4.Accessible exponent, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.pow(base, exponent.x()),
                Math.pow(base, exponent.y()),
                Math.pow(base, exponent.z()),
                Math.pow(base, exponent.w())
        );
    }

    public static void powTo(final double base, final Vector4.Accessible exponent, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.pow(base, exponent.x()),
                Math.pow(base, exponent.y()),
                Math.pow(base, exponent.z()),
                Math.pow(base, exponent.w())
        );
    }

    public static double squaredLength(final Vector4.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();

        return x * x + y * y + z * z + w * w;
    }

    public static double squaredDistance(final Vector4.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        final double w = a.w() - b;

        return x * x + y * y + z * z + w * w;
    }

    public static double squaredDistance(final Vector4.Accessible a, final Vector4.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        final double w = a.w() - b.w();

        return x * x + y * y + z * z + w * w;
    }

    public static double length(final Vector4.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();

        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double distance(final Vector4.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        final double w = a.w() - b;

        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double distance(final Vector4.Accessible a, final Vector4.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        final double w = a.w() - b.w();

        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double dot(final Vector4.Accessible vector) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();

        return x * x + y * y + z * z + w * w;
    }

    public static double dot(final Vector4.Accessible a, final double b) {
        return a.x() * b + a.y() * b + a.z() * b + a.w() * b;
    }

    public static double dot(final Vector4.Accessible a, final Vector4.Accessible b) {
        return a.x() * b.x() + a.y() * b.y() + a.z() * b.z() + a.w() * b.w();
    }

    public static <R> R normalize(final Vector4.Accessible vector, final Vector4.Factory<R> factory) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();

        final double length = Math.sqrt(x * x + y * y + z * z + w * w);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        return factory.create(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength,
                w * inverseLength
        );
    }

    public static void normalizeTo(final Vector4.Accessible vector, final Vector4.Consumer consumer) {
        final double x = vector.x();
        final double y = vector.y();
        final double z = vector.z();
        final double w = vector.w();

        final double length = Math.sqrt(x * x + y * y + z * z + w * w);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        consumer.xyzw(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength,
                w * inverseLength
        );
    }

    public static <R> R reflect(final Vector4.Accessible incident, final Vector4.Accessible normal, final Vector4.Factory<R> factory) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();
        final double incidentW = incident.w();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();
        final double normalW = normal.w();

        final double dotNI2 = (normalX * incidentX + normalY * incidentY + normalZ * incidentZ + normalW * incidentW) * 2.0D;

        return factory.create(
                incidentX - dotNI2 * normalX,
                incidentY - dotNI2 * normalY,
                incidentZ - dotNI2 * normalZ,
                incidentW - dotNI2 * normalW
        );
    }

    public static void reflectTo(final Vector4.Accessible incident, final Vector4.Accessible normal, final Vector4.Consumer consumer) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();
        final double incidentW = incident.w();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();
        final double normalW = normal.w();

        final double dotNI2 = (normalX * incidentX + normalY * incidentY + normalZ * incidentZ + normalW * incidentW) * 2.0D;

        consumer.xyzw(
                incidentX - dotNI2 * normalX,
                incidentY - dotNI2 * normalY,
                incidentZ - dotNI2 * normalZ,
                incidentW - dotNI2 * normalW
        );
    }

    public static <R> R refract(final Vector4.Accessible incident, final Vector4.Accessible normal, final double eta, final Vector4.Factory<R> factory) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();
        final double incidentW = incident.w();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();
        final double normalW = normal.w();

        final double dotNI = normalX * incidentX + normalY * incidentY + normalZ * incidentZ + normalW * incidentW;
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);

        if (k < 0.0D) {
            return factory.create(0.0D, 0.0D, 0.0D, 0.0D);
        }

        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);

        return factory.create(
                eta * incidentX - etaNIsqrtK * normalX,
                eta * incidentY - etaNIsqrtK * normalY,
                eta * incidentZ - etaNIsqrtK * normalZ,
                eta * incidentW - etaNIsqrtK * normalW
        );
    }

    public static void refractTo(final Vector4.Accessible incident, final Vector4.Accessible normal, final double eta, final Vector4.Consumer consumer) {
        final double incidentX = incident.x();
        final double incidentY = incident.y();
        final double incidentZ = incident.z();
        final double incidentW = incident.w();

        final double normalX = normal.x();
        final double normalY = normal.y();
        final double normalZ = normal.z();
        final double normalW = normal.w();

        final double dotNI = normalX * incidentX + normalY * incidentY + normalZ * incidentZ + normalW * incidentW;
        final double k = 1.0D - eta * eta * (1.0D - dotNI * dotNI);

        if (k < 0.0D) {
            consumer.xyzw(0.0D, 0.0D, 0.0D, 0.0D);
            return;
        }

        final double etaNIsqrtK = eta * dotNI + Math.sqrt(k);

        consumer.xyzw(
                eta * incidentX - etaNIsqrtK * normalX,
                eta * incidentY - etaNIsqrtK * normalY,
                eta * incidentZ - etaNIsqrtK * normalZ,
                eta * incidentW - etaNIsqrtK * normalW
        );
    }

    public static <R> R negate(final Matrix2x2.Accessible matrix, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                -matrix.Xx(),
                -matrix.Xy(),
                -matrix.Yx(),
                -matrix.Yy()
        );
    }

    public static void negateTo(final Matrix2x2.Accessible matrix, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                -matrix.Xx(),
                -matrix.Xy(),
                -matrix.Yx(),
                -matrix.Yy()
        );
    }

    public static <R> R add(final Matrix2x2.Accessible augend, final double addend, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                augend.Xx() + addend,
                augend.Xy() + addend,
                augend.Yx() + addend,
                augend.Yy() + addend
        );
    }

    public static void addTo(final Matrix2x2.Accessible augend, final double addend, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                augend.Xx() + addend,
                augend.Xy() + addend,
                augend.Yx() + addend,
                augend.Yy() + addend
        );
    }

    public static <R> R add(final Matrix2x2.Accessible augend, final Matrix2x2.Accessible addend, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                augend.Xx() + addend.Xx(),
                augend.Xy() + addend.Xy(),
                augend.Yx() + addend.Yx(),
                augend.Yy() + addend.Yy()
        );
    }

    public static void addTo(final Matrix2x2.Accessible augend, final Matrix2x2.Accessible addend, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                augend.Xx() + addend.Xx(),
                augend.Xy() + addend.Xy(),
                augend.Yx() + addend.Yx(),
                augend.Yy() + addend.Yy()
        );
    }

    public static <R> R subtract(final Matrix2x2.Accessible minuend, final double subtrahend, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                minuend.Xx() - subtrahend,
                minuend.Xy() - subtrahend,
                minuend.Yx() - subtrahend,
                minuend.Yy() - subtrahend
        );
    }

    public static void subtractTo(final Matrix2x2.Accessible minuend, final double subtrahend, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                minuend.Xx() - subtrahend,
                minuend.Xy() - subtrahend,
                minuend.Yx() - subtrahend,
                minuend.Yy() - subtrahend
        );
    }

    public static <R> R subtract(final Matrix2x2.Accessible minuend, final Matrix2x2.Accessible subtrahend, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                minuend.Xx() - subtrahend.Xx(),
                minuend.Xy() - subtrahend.Xy(),
                minuend.Yx() - subtrahend.Yx(),
                minuend.Yy() - subtrahend.Yy()
        );
    }

    public static void subtractTo(final Matrix2x2.Accessible minuend, final Matrix2x2.Accessible subtrahend, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                minuend.Xx() - subtrahend.Xx(),
                minuend.Xy() - subtrahend.Xy(),
                minuend.Yx() - subtrahend.Yx(),
                minuend.Yy() - subtrahend.Yy()
        );
    }

    public static <R> R subtract(final double minuend, final Matrix2x2.Accessible subtrahend, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                minuend - subtrahend.Xx(),
                minuend - subtrahend.Xy(),
                minuend - subtrahend.Yx(),
                minuend - subtrahend.Yy()
        );
    }

    public static void subtractTo(final double minuend, final Matrix2x2.Accessible subtrahend, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                minuend - subtrahend.Xx(),
                minuend - subtrahend.Xy(),
                minuend - subtrahend.Yx(),
                minuend - subtrahend.Yy()
        );
    }

    public static <R> R inverse(final Matrix2x2.Accessible matrix, final Matrix2x2.Factory<R> factory) {
        final double matrixXx = matrix.Xx();
        final double matrixXy = matrix.Xy();
        final double matrixYx = matrix.Yx();
        final double matrixYy = matrix.Yy();

        final double inverseDet = 1.0D / (matrixXx * matrixYy - matrixYx * matrixXy);

        return factory.create(
                matrixYy * inverseDet,
                -matrixXy * inverseDet,
                -matrixYx * inverseDet,
                matrixXx * inverseDet
        );
    }

    public static void inverseTo(final Matrix2x2.Accessible matrix, final Matrix2x2.Consumer consumer) {
        final double matrixXx = matrix.Xx();
        final double matrixXy = matrix.Xy();
        final double matrixYx = matrix.Yx();
        final double matrixYy = matrix.Yy();

        final double inverseDet = 1.0D / (matrixXx * matrixYy - matrixYx * matrixXy);

        consumer.XYxy(
                matrixYy * inverseDet,
                -matrixXy * inverseDet,
                -matrixYx * inverseDet,
                matrixXx * inverseDet
        );
    }

    public static <R> R multiply(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aYx = a.Yx();
        final double aYy = a.Yy();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bYx = b.Yx();
        final double bYy = b.Yy();

        return factory.create(
                aXx * bXx + aYx * bXy,
                aXy * bXx + aYy * bXy,
                aXx * bYx + aYx * bYy,
                aXy * bYx + aYy * bYy
        );
    }

    public static void multiplyTo(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aYx = a.Yx();
        final double aYy = a.Yy();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bYx = b.Yx();
        final double bYy = b.Yy();

        consumer.XYxy(
                aXx * bXx + aYx * bXy,
                aXy * bXx + aYy * bXy,
                aXx * bYx + aYx * bYy,
                aXy * bYx + aYy * bYy
        );
    }

    public static <R> R multiply(final Matrix2x2.Accessible m, final Vector2.Accessible v, final Vector2.Factory<R> factory) {
        final double x = v.x();
        final double y = v.y();

        return factory.create(
                m.Xx() * x + m.Yx() * y,
                m.Xy() * x + m.Yy() * y
        );
    }

    public static void multiplyTo(final Matrix2x2.Accessible m, final Vector2.Accessible v, final Vector2.Consumer consumer) {
        final double x = v.x();
        final double y = v.y();

        consumer.xy(
                m.Xx() * x + m.Yx() * y,
                m.Xy() * x + m.Yy() * y
        );
    }

    public static <R> R negate(final Matrix3x3.Accessible matrix, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                -matrix.Xx(),
                -matrix.Xy(),
                -matrix.Xz(),
                -matrix.Yx(),
                -matrix.Yy(),
                -matrix.Yz(),
                -matrix.Zx(),
                -matrix.Zy(),
                -matrix.Zz()
        );
    }

    public static void negateTo(final Matrix3x3.Accessible matrix, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                -matrix.Xx(),
                -matrix.Xy(),
                -matrix.Xz(),
                -matrix.Yx(),
                -matrix.Yy(),
                -matrix.Yz(),
                -matrix.Zx(),
                -matrix.Zy(),
                -matrix.Zz()
        );
    }

    public static <R> R add(final Matrix3x3.Accessible augend, final double addend, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                augend.Xx() + addend,
                augend.Xy() + addend,
                augend.Xz() + addend,
                augend.Yx() + addend,
                augend.Yy() + addend,
                augend.Yz() + addend,
                augend.Zx() + addend,
                augend.Zy() + addend,
                augend.Zz() + addend
        );
    }

    public static void addTo(final Matrix3x3.Accessible augend, final double addend, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                augend.Xx() + addend,
                augend.Xy() + addend,
                augend.Xz() + addend,
                augend.Yx() + addend,
                augend.Yy() + addend,
                augend.Yz() + addend,
                augend.Zx() + addend,
                augend.Zy() + addend,
                augend.Zz() + addend
        );
    }

    public static <R> R add(final Matrix3x3.Accessible augend, final Matrix3x3.Accessible addend, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                augend.Xx() + addend.Xx(),
                augend.Xy() + addend.Xy(),
                augend.Xz() + addend.Xz(),
                augend.Yx() + addend.Yx(),
                augend.Yy() + addend.Yy(),
                augend.Yz() + addend.Yz(),
                augend.Zx() + addend.Zx(),
                augend.Zy() + addend.Zy(),
                augend.Zz() + addend.Zz()
        );
    }

    public static void addTo(final Matrix3x3.Accessible augend, final Matrix3x3.Accessible addend, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                augend.Xx() + addend.Xx(),
                augend.Xy() + addend.Xy(),
                augend.Xz() + addend.Xz(),
                augend.Yx() + addend.Yx(),
                augend.Yy() + addend.Yy(),
                augend.Yz() + addend.Yz(),
                augend.Zx() + addend.Zx(),
                augend.Zy() + addend.Zy(),
                augend.Zz() + addend.Zz()
        );
    }

    public static <R> R subtract(final Matrix3x3.Accessible minuend, final double subtrahend, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                minuend.Xx() - subtrahend,
                minuend.Xy() - subtrahend,
                minuend.Xz() - subtrahend,
                minuend.Yx() - subtrahend,
                minuend.Yy() - subtrahend,
                minuend.Yz() - subtrahend,
                minuend.Zx() - subtrahend,
                minuend.Zy() - subtrahend,
                minuend.Zz() - subtrahend
        );
    }

    public static void subtractTo(final Matrix3x3.Accessible minuend, final double subtrahend, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                minuend.Xx() - subtrahend,
                minuend.Xy() - subtrahend,
                minuend.Xz() - subtrahend,
                minuend.Yx() - subtrahend,
                minuend.Yy() - subtrahend,
                minuend.Yz() - subtrahend,
                minuend.Zx() - subtrahend,
                minuend.Zy() - subtrahend,
                minuend.Zz() - subtrahend
        );
    }

    public static <R> R subtract(final Matrix3x3.Accessible minuend, final Matrix3x3.Accessible subtrahend, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                minuend.Xx() - subtrahend.Xx(),
                minuend.Xy() - subtrahend.Xy(),
                minuend.Xz() - subtrahend.Xz(),
                minuend.Yx() - subtrahend.Yx(),
                minuend.Yy() - subtrahend.Yy(),
                minuend.Yz() - subtrahend.Yz(),
                minuend.Zx() - subtrahend.Zx(),
                minuend.Zy() - subtrahend.Zy(),
                minuend.Zz() - subtrahend.Zz()
        );
    }

    public static void subtractTo(final Matrix3x3.Accessible minuend, final Matrix3x3.Accessible subtrahend, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                minuend.Xx() - subtrahend.Xx(),
                minuend.Xy() - subtrahend.Xy(),
                minuend.Xz() - subtrahend.Xz(),
                minuend.Yx() - subtrahend.Yx(),
                minuend.Yy() - subtrahend.Yy(),
                minuend.Yz() - subtrahend.Yz(),
                minuend.Zx() - subtrahend.Zx(),
                minuend.Zy() - subtrahend.Zy(),
                minuend.Zz() - subtrahend.Zz()
        );
    }

    public static <R> R subtract(final double minuend, final Matrix3x3.Accessible subtrahend, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                minuend - subtrahend.Xx(),
                minuend - subtrahend.Xy(),
                minuend - subtrahend.Xz(),
                minuend - subtrahend.Yx(),
                minuend - subtrahend.Yy(),
                minuend - subtrahend.Yz(),
                minuend - subtrahend.Zx(),
                minuend - subtrahend.Zy(),
                minuend - subtrahend.Zz()
        );
    }

    public static void subtractTo(final double minuend, final Matrix3x3.Accessible subtrahend, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                minuend - subtrahend.Xx(),
                minuend - subtrahend.Xy(),
                minuend - subtrahend.Xz(),
                minuend - subtrahend.Yx(),
                minuend - subtrahend.Yy(),
                minuend - subtrahend.Yz(),
                minuend - subtrahend.Zx(),
                minuend - subtrahend.Zy(),
                minuend - subtrahend.Zz()
        );
    }

    public static <R> R inverse(final Matrix3x3.Accessible matrix, final Matrix3x3.Factory<R> factory) {
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

        final double inverseDet = 1.0D / (matrixXx * det01 + matrixXy * det11 + matrixXz * det21);

        return factory.create(
                det01 * inverseDet,
                (matrixXz * matrixZy - matrixZz * matrixXy) * inverseDet,
                (matrixYz * matrixXy - matrixXz * matrixYy) * inverseDet,
                det11 * inverseDet,
                (matrixZz * matrixXx - matrixXz * matrixZx) * inverseDet,
                (matrixXz * matrixYx - matrixYz * matrixXx) * inverseDet,
                det21 * inverseDet,
                (matrixXy * matrixZx - matrixZy * matrixXx) * inverseDet,
                (matrixYy * matrixXx - matrixXy * matrixYx) * inverseDet
        );
    }

    public static void inverseTo(final Matrix3x3.Accessible matrix, final Matrix3x3.Consumer consumer) {
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

        final double inverseDet = 1.0D / (matrixXx * det01 + matrixXy * det11 + matrixXz * det21);

        consumer.XYZxyz(
                det01 * inverseDet,
                (matrixXz * matrixZy - matrixZz * matrixXy) * inverseDet,
                (matrixYz * matrixXy - matrixXz * matrixYy) * inverseDet,
                det11 * inverseDet,
                (matrixZz * matrixXx - matrixXz * matrixZx) * inverseDet,
                (matrixXz * matrixYx - matrixYz * matrixXx) * inverseDet,
                det21 * inverseDet,
                (matrixXy * matrixZx - matrixZy * matrixXx) * inverseDet,
                (matrixYy * matrixXx - matrixXy * matrixYx) * inverseDet
        );
    }

    public static <R> R multiply(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aXz = a.Xz();
        final double aYx = a.Yx();
        final double aYy = a.Yy();
        final double aYz = a.Yz();
        final double aZx = a.Zx();
        final double aZy = a.Zy();
        final double aZz = a.Zz();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bXz = b.Xz();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bYz = b.Yz();
        final double bZx = b.Zx();
        final double bZy = b.Zy();
        final double bZz = b.Zz();

        return factory.create(
                aXx * bXx + aYx * bXy + aZx * bXz,
                aXy * bXx + aYy * bXy + aZy * bXz,
                aXz * bXx + aYz * bXy + aZz * bXz,
                aXx * bYx + aYx * bYy + aZx * bYz,
                aXy * bYx + aYy * bYy + aZy * bYz,
                aXz * bYx + aYz * bYy + aZz * bYz,
                aXx * bZx + aYx * bZy + aZx * bZz,
                aXy * bZx + aYy * bZy + aZy * bZz,
                aXz * bZx + aYz * bZy + aZz * bZz
        );
    }

    public static void multiplyTo(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aXz = a.Xz();
        final double aYx = a.Yx();
        final double aYy = a.Yy();
        final double aYz = a.Yz();
        final double aZx = a.Zx();
        final double aZy = a.Zy();
        final double aZz = a.Zz();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bXz = b.Xz();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bYz = b.Yz();
        final double bZx = b.Zx();
        final double bZy = b.Zy();
        final double bZz = b.Zz();

        consumer.XYZxyz(
                aXx * bXx + aYx * bXy + aZx * bXz,
                aXy * bXx + aYy * bXy + aZy * bXz,
                aXz * bXx + aYz * bXy + aZz * bXz,
                aXx * bYx + aYx * bYy + aZx * bYz,
                aXy * bYx + aYy * bYy + aZy * bYz,
                aXz * bYx + aYz * bYy + aZz * bYz,
                aXx * bZx + aYx * bZy + aZx * bZz,
                aXy * bZx + aYy * bZy + aZy * bZz,
                aXz * bZx + aYz * bZy + aZz * bZz
        );
    }

    public static <R> R multiply(final Matrix3x3.Accessible m, final Vector3.Accessible v, final Vector3.Factory<R> factory) {
        final double x = v.x();
        final double y = v.y();
        final double z = v.z();

        return factory.create(
                m.Xx() * x + m.Yx() * y + m.Zx() * z,
                m.Xy() * x + m.Yy() * y + m.Zy() * z,
                m.Xz() * x + m.Yz() * y + m.Zz() * z
        );
    }

    public static void multiplyTo(final Matrix3x3.Accessible m, final Vector3.Accessible v, final Vector3.Consumer consumer) {
        final double x = v.x();
        final double y = v.y();
        final double z = v.z();

        consumer.xyz(
                m.Xx() * x + m.Yx() * y + m.Zx() * z,
                m.Xy() * x + m.Yy() * y + m.Zy() * z,
                m.Xz() * x + m.Yz() * y + m.Zz() * z
        );
    }

    public static <R> R negate(final Matrix4x4.Accessible matrix, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                -matrix.Xx(),
                -matrix.Xy(),
                -matrix.Xz(),
                -matrix.Xw(),
                -matrix.Yx(),
                -matrix.Yy(),
                -matrix.Yz(),
                -matrix.Yw(),
                -matrix.Zx(),
                -matrix.Zy(),
                -matrix.Zz(),
                -matrix.Zw(),
                -matrix.Tx(),
                -matrix.Ty(),
                -matrix.Tz(),
                -matrix.Tw()
        );
    }

    public static void negateTo(final Matrix4x4.Accessible matrix, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                -matrix.Xx(),
                -matrix.Xy(),
                -matrix.Xz(),
                -matrix.Xw(),
                -matrix.Yx(),
                -matrix.Yy(),
                -matrix.Yz(),
                -matrix.Yw(),
                -matrix.Zx(),
                -matrix.Zy(),
                -matrix.Zz(),
                -matrix.Zw(),
                -matrix.Tx(),
                -matrix.Ty(),
                -matrix.Tz(),
                -matrix.Tw()
        );
    }

    public static <R> R add(final Matrix4x4.Accessible augend, final double addend, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                augend.Xx() + addend,
                augend.Xy() + addend,
                augend.Xz() + addend,
                augend.Xw() + addend,
                augend.Yx() + addend,
                augend.Yy() + addend,
                augend.Yz() + addend,
                augend.Yw() + addend,
                augend.Zx() + addend,
                augend.Zy() + addend,
                augend.Zz() + addend,
                augend.Zw() + addend,
                augend.Tx() + addend,
                augend.Ty() + addend,
                augend.Tz() + addend,
                augend.Tw() + addend
        );
    }

    public static void addTo(final Matrix4x4.Accessible augend, final double addend, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                augend.Xx() + addend,
                augend.Xy() + addend,
                augend.Xz() + addend,
                augend.Xw() + addend,
                augend.Yx() + addend,
                augend.Yy() + addend,
                augend.Yz() + addend,
                augend.Yw() + addend,
                augend.Zx() + addend,
                augend.Zy() + addend,
                augend.Zz() + addend,
                augend.Zw() + addend,
                augend.Tx() + addend,
                augend.Ty() + addend,
                augend.Tz() + addend,
                augend.Tw() + addend
        );
    }

    public static <R> R add(final Matrix4x4.Accessible augend, final Matrix4x4.Accessible addend, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                augend.Xx() + addend.Xx(),
                augend.Xy() + addend.Xy(),
                augend.Xz() + addend.Xz(),
                augend.Xw() + addend.Xw(),
                augend.Yx() + addend.Yx(),
                augend.Yy() + addend.Yy(),
                augend.Yz() + addend.Yz(),
                augend.Yw() + addend.Yw(),
                augend.Zx() + addend.Zx(),
                augend.Zy() + addend.Zy(),
                augend.Zz() + addend.Zz(),
                augend.Zw() + addend.Zw(),
                augend.Tx() + addend.Tx(),
                augend.Ty() + addend.Ty(),
                augend.Tz() + addend.Tz(),
                augend.Tw() + addend.Tw()
        );
    }

    public static void addTo(final Matrix4x4.Accessible augend, final Matrix4x4.Accessible addend, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                augend.Xx() + addend.Xx(),
                augend.Xy() + addend.Xy(),
                augend.Xz() + addend.Xz(),
                augend.Xw() + addend.Xw(),
                augend.Yx() + addend.Yx(),
                augend.Yy() + addend.Yy(),
                augend.Yz() + addend.Yz(),
                augend.Yw() + addend.Yw(),
                augend.Zx() + addend.Zx(),
                augend.Zy() + addend.Zy(),
                augend.Zz() + addend.Zz(),
                augend.Zw() + addend.Zw(),
                augend.Tx() + addend.Tx(),
                augend.Ty() + addend.Ty(),
                augend.Tz() + addend.Tz(),
                augend.Tw() + addend.Tw()
        );
    }

    public static <R> R subtract(final Matrix4x4.Accessible minuend, final double subtrahend, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                minuend.Xx() - subtrahend,
                minuend.Xy() - subtrahend,
                minuend.Xz() - subtrahend,
                minuend.Xw() - subtrahend,
                minuend.Yx() - subtrahend,
                minuend.Yy() - subtrahend,
                minuend.Yz() - subtrahend,
                minuend.Yw() - subtrahend,
                minuend.Zx() - subtrahend,
                minuend.Zy() - subtrahend,
                minuend.Zz() - subtrahend,
                minuend.Zw() - subtrahend,
                minuend.Tx() - subtrahend,
                minuend.Ty() - subtrahend,
                minuend.Tz() - subtrahend,
                minuend.Tw() - subtrahend
        );
    }

    public static void subtractTo(final Matrix4x4.Accessible minuend, final double subtrahend, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                minuend.Xx() - subtrahend,
                minuend.Xy() - subtrahend,
                minuend.Xz() - subtrahend,
                minuend.Xw() - subtrahend,
                minuend.Yx() - subtrahend,
                minuend.Yy() - subtrahend,
                minuend.Yz() - subtrahend,
                minuend.Yw() - subtrahend,
                minuend.Zx() - subtrahend,
                minuend.Zy() - subtrahend,
                minuend.Zz() - subtrahend,
                minuend.Zw() - subtrahend,
                minuend.Tx() - subtrahend,
                minuend.Ty() - subtrahend,
                minuend.Tz() - subtrahend,
                minuend.Tw() - subtrahend
        );
    }

    public static <R> R subtract(final Matrix4x4.Accessible minuend, final Matrix4x4.Accessible subtrahend, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                minuend.Xx() - subtrahend.Xx(),
                minuend.Xy() - subtrahend.Xy(),
                minuend.Xz() - subtrahend.Xz(),
                minuend.Xw() - subtrahend.Xw(),
                minuend.Yx() - subtrahend.Yx(),
                minuend.Yy() - subtrahend.Yy(),
                minuend.Yz() - subtrahend.Yz(),
                minuend.Yw() - subtrahend.Yw(),
                minuend.Zx() - subtrahend.Zx(),
                minuend.Zy() - subtrahend.Zy(),
                minuend.Zz() - subtrahend.Zz(),
                minuend.Zw() - subtrahend.Zw(),
                minuend.Tx() - subtrahend.Tx(),
                minuend.Ty() - subtrahend.Ty(),
                minuend.Tz() - subtrahend.Tz(),
                minuend.Tw() - subtrahend.Tw()
        );
    }

    public static void subtractTo(final Matrix4x4.Accessible minuend, final Matrix4x4.Accessible subtrahend, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                minuend.Xx() - subtrahend.Xx(),
                minuend.Xy() - subtrahend.Xy(),
                minuend.Xz() - subtrahend.Xz(),
                minuend.Xw() - subtrahend.Xw(),
                minuend.Yx() - subtrahend.Yx(),
                minuend.Yy() - subtrahend.Yy(),
                minuend.Yz() - subtrahend.Yz(),
                minuend.Yw() - subtrahend.Yw(),
                minuend.Zx() - subtrahend.Zx(),
                minuend.Zy() - subtrahend.Zy(),
                minuend.Zz() - subtrahend.Zz(),
                minuend.Zw() - subtrahend.Zw(),
                minuend.Tx() - subtrahend.Tx(),
                minuend.Ty() - subtrahend.Ty(),
                minuend.Tz() - subtrahend.Tz(),
                minuend.Tw() - subtrahend.Tw()
        );
    }

    public static <R> R subtract(final double minuend, final Matrix4x4.Accessible subtrahend, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                minuend - subtrahend.Xx(),
                minuend - subtrahend.Xy(),
                minuend - subtrahend.Xz(),
                minuend - subtrahend.Xw(),
                minuend - subtrahend.Yx(),
                minuend - subtrahend.Yy(),
                minuend - subtrahend.Yz(),
                minuend - subtrahend.Yw(),
                minuend - subtrahend.Zx(),
                minuend - subtrahend.Zy(),
                minuend - subtrahend.Zz(),
                minuend - subtrahend.Zw(),
                minuend - subtrahend.Tx(),
                minuend - subtrahend.Ty(),
                minuend - subtrahend.Tz(),
                minuend - subtrahend.Tw()
        );
    }

    public static void subtractTo(final double minuend, final Matrix4x4.Accessible subtrahend, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                minuend - subtrahend.Xx(),
                minuend - subtrahend.Xy(),
                minuend - subtrahend.Xz(),
                minuend - subtrahend.Xw(),
                minuend - subtrahend.Yx(),
                minuend - subtrahend.Yy(),
                minuend - subtrahend.Yz(),
                minuend - subtrahend.Yw(),
                minuend - subtrahend.Zx(),
                minuend - subtrahend.Zy(),
                minuend - subtrahend.Zz(),
                minuend - subtrahend.Zw(),
                minuend - subtrahend.Tx(),
                minuend - subtrahend.Ty(),
                minuend - subtrahend.Tz(),
                minuend - subtrahend.Tw()
        );
    }

    public static <R> R inverse(final Matrix4x4.Accessible matrix, final Matrix4x4.Factory<R> factory) {
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

        final double inverseDet = 1.0D / (det00 * det11 - det01 * det10 + det02 * det09 + det03 * det08 - det04 * det07 + det05 * det06);

        return factory.create(
                (matrixYy * det11 - matrixYz * det10 + matrixYw * det09) * inverseDet,
                (matrixXz * det10 - matrixXy * det11 - matrixXw * det09) * inverseDet,
                (matrixTy * det05 - matrixTz * det04 + matrixTw * det03) * inverseDet,
                (matrixZz * det04 - matrixZy * det05 - matrixZw * det03) * inverseDet,
                (matrixYz * det08 - matrixYx * det11 - matrixYw * det07) * inverseDet,
                (matrixXx * det11 - matrixXz * det08 + matrixXw * det07) * inverseDet,
                (matrixTz * det02 - matrixTx * det05 - matrixTw * det01) * inverseDet,
                (matrixZx * det05 - matrixZz * det02 + matrixZw * det01) * inverseDet,
                (matrixYx * det10 - matrixYy * det08 + matrixYw * det06) * inverseDet,
                (matrixXy * det08 - matrixXx * det10 - matrixXw * det06) * inverseDet,
                (matrixTx * det04 - matrixTy * det02 + matrixTw * det00) * inverseDet,
                (matrixZy * det02 - matrixZx * det04 - matrixZw * det00) * inverseDet,
                (matrixYy * det07 - matrixYx * det09 - matrixYz * det06) * inverseDet,
                (matrixXx * det09 - matrixXy * det07 + matrixXz * det06) * inverseDet,
                (matrixTy * det01 - matrixTx * det03 - matrixTz * det00) * inverseDet,
                (matrixZx * det03 - matrixZy * det01 + matrixZz * det00) * inverseDet
        );
    }

    public static void inverseTo(final Matrix4x4.Accessible matrix, final Matrix4x4.Consumer consumer) {
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

        final double inverseDet = 1.0D / (det00 * det11 - det01 * det10 + det02 * det09 + det03 * det08 - det04 * det07 + det05 * det06);

        consumer.XYZTxyzw(
                (matrixYy * det11 - matrixYz * det10 + matrixYw * det09) * inverseDet,
                (matrixXz * det10 - matrixXy * det11 - matrixXw * det09) * inverseDet,
                (matrixTy * det05 - matrixTz * det04 + matrixTw * det03) * inverseDet,
                (matrixZz * det04 - matrixZy * det05 - matrixZw * det03) * inverseDet,
                (matrixYz * det08 - matrixYx * det11 - matrixYw * det07) * inverseDet,
                (matrixXx * det11 - matrixXz * det08 + matrixXw * det07) * inverseDet,
                (matrixTz * det02 - matrixTx * det05 - matrixTw * det01) * inverseDet,
                (matrixZx * det05 - matrixZz * det02 + matrixZw * det01) * inverseDet,
                (matrixYx * det10 - matrixYy * det08 + matrixYw * det06) * inverseDet,
                (matrixXy * det08 - matrixXx * det10 - matrixXw * det06) * inverseDet,
                (matrixTx * det04 - matrixTy * det02 + matrixTw * det00) * inverseDet,
                (matrixZy * det02 - matrixZx * det04 - matrixZw * det00) * inverseDet,
                (matrixYy * det07 - matrixYx * det09 - matrixYz * det06) * inverseDet,
                (matrixXx * det09 - matrixXy * det07 + matrixXz * det06) * inverseDet,
                (matrixTy * det01 - matrixTx * det03 - matrixTz * det00) * inverseDet,
                (matrixZx * det03 - matrixZy * det01 + matrixZz * det00) * inverseDet
        );
    }

    public static <R> R multiply(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aXz = a.Xz();
        final double aXw = a.Xw();
        final double aYx = a.Yx();
        final double aYy = a.Yy();
        final double aYz = a.Yz();
        final double aYw = a.Yw();
        final double aZx = a.Zx();
        final double aZy = a.Zy();
        final double aZz = a.Zz();
        final double aZw = a.Zw();
        final double aTx = a.Tx();
        final double aTy = a.Ty();
        final double aTz = a.Tz();
        final double aTw = a.Tw();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bXz = b.Xz();
        final double bXw = b.Xw();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bYz = b.Yz();
        final double bYw = b.Yw();
        final double bZx = b.Zx();
        final double bZy = b.Zy();
        final double bZz = b.Zz();
        final double bZw = b.Zw();
        final double bTx = b.Tx();
        final double bTy = b.Ty();
        final double bTz = b.Tz();
        final double bTw = b.Tw();

        return factory.create(
                aXx * bXx + aYx * bXy + aZx * bXz + aTx * bXw,
                aXy * bXx + aYy * bXy + aZy * bXz + aTy * bXw,
                aXz * bXx + aYz * bXy + aZz * bXz + aTz * bXw,
                aXw * bXx + aYw * bXy + aZw * bXz + aTw * bXw,
                aXx * bYx + aYx * bYy + aZx * bYz + aTx * bYw,
                aXy * bYx + aYy * bYy + aZy * bYz + aTy * bYw,
                aXz * bYx + aYz * bYy + aZz * bYz + aTz * bYw,
                aXw * bYx + aYw * bYy + aZw * bYz + aTw * bYw,
                aXx * bZx + aYx * bZy + aZx * bZz + aTx * bZw,
                aXy * bZx + aYy * bZy + aZy * bZz + aTy * bZw,
                aXz * bZx + aYz * bZy + aZz * bZz + aTz * bZw,
                aXw * bZx + aYw * bZy + aZw * bZz + aTw * bZw,
                aXx * bTx + aYx * bTy + aZx * bTz + aTx * bTw,
                aXy * bTx + aYy * bTy + aZy * bTz + aTy * bTw,
                aXz * bTx + aYz * bTy + aZz * bTz + aTz * bTw,
                aXw * bTx + aYw * bTy + aZw * bTz + aTw * bTw
        );
    }

    public static void multiplyTo(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aXz = a.Xz();
        final double aXw = a.Xw();
        final double aYx = a.Yx();
        final double aYy = a.Yy();
        final double aYz = a.Yz();
        final double aYw = a.Yw();
        final double aZx = a.Zx();
        final double aZy = a.Zy();
        final double aZz = a.Zz();
        final double aZw = a.Zw();
        final double aTx = a.Tx();
        final double aTy = a.Ty();
        final double aTz = a.Tz();
        final double aTw = a.Tw();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bXz = b.Xz();
        final double bXw = b.Xw();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bYz = b.Yz();
        final double bYw = b.Yw();
        final double bZx = b.Zx();
        final double bZy = b.Zy();
        final double bZz = b.Zz();
        final double bZw = b.Zw();
        final double bTx = b.Tx();
        final double bTy = b.Ty();
        final double bTz = b.Tz();
        final double bTw = b.Tw();

        consumer.XYZTxyzw(
                aXx * bXx + aYx * bXy + aZx * bXz + aTx * bXw,
                aXy * bXx + aYy * bXy + aZy * bXz + aTy * bXw,
                aXz * bXx + aYz * bXy + aZz * bXz + aTz * bXw,
                aXw * bXx + aYw * bXy + aZw * bXz + aTw * bXw,
                aXx * bYx + aYx * bYy + aZx * bYz + aTx * bYw,
                aXy * bYx + aYy * bYy + aZy * bYz + aTy * bYw,
                aXz * bYx + aYz * bYy + aZz * bYz + aTz * bYw,
                aXw * bYx + aYw * bYy + aZw * bYz + aTw * bYw,
                aXx * bZx + aYx * bZy + aZx * bZz + aTx * bZw,
                aXy * bZx + aYy * bZy + aZy * bZz + aTy * bZw,
                aXz * bZx + aYz * bZy + aZz * bZz + aTz * bZw,
                aXw * bZx + aYw * bZy + aZw * bZz + aTw * bZw,
                aXx * bTx + aYx * bTy + aZx * bTz + aTx * bTw,
                aXy * bTx + aYy * bTy + aZy * bTz + aTy * bTw,
                aXz * bTx + aYz * bTy + aZz * bTz + aTz * bTw,
                aXw * bTx + aYw * bTy + aZw * bTz + aTw * bTw
        );
    }

    public static <R> R multiply(final Matrix4x4.Accessible m, final Vector4.Accessible v, final Vector4.Factory<R> factory) {
        final double x = v.x();
        final double y = v.y();
        final double z = v.z();
        final double w = v.w();

        return factory.create(
                m.Xx() * x + m.Yx() * y + m.Zx() * z + m.Tx() * w,
                m.Xy() * x + m.Yy() * y + m.Zy() * z + m.Ty() * w,
                m.Xz() * x + m.Yz() * y + m.Zz() * z + m.Tz() * w,
                m.Xw() * x + m.Yw() * y + m.Zw() * z + m.Tw() * w
        );
    }

    public static void multiplyTo(final Matrix4x4.Accessible m, final Vector4.Accessible v, final Vector4.Consumer consumer) {
        final double x = v.x();
        final double y = v.y();
        final double z = v.z();
        final double w = v.w();

        consumer.xyzw(
                m.Xx() * x + m.Yx() * y + m.Zx() * z + m.Tx() * w,
                m.Xy() * x + m.Yy() * y + m.Zy() * z + m.Ty() * w,
                m.Xz() * x + m.Yz() * y + m.Zz() * z + m.Tz() * w,
                m.Xw() * x + m.Yw() * y + m.Zw() * z + m.Tw() * w
        );
    }

    public static <R> R transformDirection(final Matrix4x4.Accessible transformationMatrix, final Vector3.Accessible position, final Vector3.Factory<R> factory) {
        final double x = position.x();
        final double y = position.y();
        final double z = position.z();

        return factory.create(
                transformationMatrix.Xx() * x + transformationMatrix.Yx() * y + transformationMatrix.Zx() * z,
                transformationMatrix.Xy() * x + transformationMatrix.Yy() * y + transformationMatrix.Zy() * z,
                transformationMatrix.Xz() * x + transformationMatrix.Yz() * y + transformationMatrix.Zz() * z
        );
    }

    public static void transformDirectionTo(final Matrix4x4.Accessible transformationMatrix, final Vector3.Accessible position, final Vector3.Consumer consumer) {
        final double x = position.x();
        final double y = position.y();
        final double z = position.z();

        consumer.xyz(
                transformationMatrix.Xx() * x + transformationMatrix.Yx() * y + transformationMatrix.Zx() * z,
                transformationMatrix.Xy() * x + transformationMatrix.Yy() * y + transformationMatrix.Zy() * z,
                transformationMatrix.Xz() * x + transformationMatrix.Yz() * y + transformationMatrix.Zz() * z
        );
    }

    public static <R> R transformPosition(final Matrix4x4.Accessible transformationMatrix, final Vector3.Accessible position, final Vector3.Factory<R> factory) {
        final double x = position.x();
        final double y = position.y();
        final double z = position.z();

        return factory.create(
                transformationMatrix.Xx() * x + transformationMatrix.Yx() * y + transformationMatrix.Zx() * z + transformationMatrix.Tx(),
                transformationMatrix.Xy() * x + transformationMatrix.Yy() * y + transformationMatrix.Zy() * z + transformationMatrix.Ty(),
                transformationMatrix.Xz() * x + transformationMatrix.Yz() * y + transformationMatrix.Zz() * z + transformationMatrix.Tz()
        );
    }

    public static void transformPositionTo(final Matrix4x4.Accessible transformationMatrix, final Vector3.Accessible position, final Vector3.Consumer consumer) {
        final double x = position.x();
        final double y = position.y();
        final double z = position.z();

        consumer.xyz(
                transformationMatrix.Xx() * x + transformationMatrix.Yx() * y + transformationMatrix.Zx() * z + transformationMatrix.Tx(),
                transformationMatrix.Xy() * x + transformationMatrix.Yy() * y + transformationMatrix.Zy() * z + transformationMatrix.Ty(),
                transformationMatrix.Xz() * x + transformationMatrix.Yz() * y + transformationMatrix.Zz() * z + transformationMatrix.Tz()
        );
    }

    public static <R> R project(final Matrix4x4.Accessible m, final Vector3.Accessible p, final Vector3.Factory<R> factory) {
        final double x = p.x();
        final double y = p.y();
        final double z = p.z();

        final double inverseDivisor = 1.0D / (m.Xw() * x + m.Yw() * y + m.Zw() * z + m.Tw());

        return factory.create(
                (m.Xx() * x + m.Yx() * y + m.Zx() * z + m.Tx()) * inverseDivisor,
                (m.Xy() * x + m.Yy() * y + m.Zy() * z + m.Ty()) * inverseDivisor,
                (m.Xz() * x + m.Yz() * y + m.Zz() * z + m.Tz()) * inverseDivisor
        );
    }

    public static void projectTo(final Matrix4x4.Accessible m, final Vector3.Accessible p, final Vector3.Consumer consumer) {
        final double x = p.x();
        final double y = p.y();
        final double z = p.z();

        final double inverseDivisor = 1.0D / (m.Xw() * x + m.Yw() * y + m.Zw() * z + m.Tw());

        consumer.xyz(
                (m.Xx() * x + m.Yx() * y + m.Zx() * z + m.Tx()) * inverseDivisor,
                (m.Xy() * x + m.Yy() * y + m.Zy() * z + m.Ty()) * inverseDivisor,
                (m.Xz() * x + m.Yz() * y + m.Zz() * z + m.Tz()) * inverseDivisor
        );
    }

    public static <R> R asMatrix(final double angle, final Matrix2x2.Factory<R> factory) {
        final double cos = Math.cos(angle);
        final double sin = Math.sin(angle);

        return factory.create(
                cos,
                sin,
                -sin,
                cos
        );
    }

    public static void asMatrixTo(final double angle, final Matrix2x2.Consumer consumer) {
        final double cos = Math.cos(angle);
        final double sin = Math.sin(angle);

        consumer.XYxy(
                cos,
                sin,
                -sin,
                cos
        );
    }

    public static <R> R asQuaternion(final Vector3.Accessible axis, final double angle, final Vector4.Factory<R> factory) {
        final double halfAngle = angle * 0.5D;
        final double sin = Math.sin(halfAngle);

        return factory.create(
                axis.x() * sin,
                axis.y() * sin,
                axis.z() * sin,
                Math.cos(halfAngle)
        );
    }

    public static void asQuaternionTo(final Vector3.Accessible axis, final double angle, final Vector4.Consumer consumer) {
        final double halfAngle = angle * 0.5D;
        final double sin = Math.sin(halfAngle);

        consumer.xyzw(
                axis.x() * sin,
                axis.y() * sin,
                axis.z() * sin,
                Math.cos(halfAngle)
        );
    }

    public static <R> R asMatrix(final Vector3.Accessible axis, final double angle, final Matrix3x3.Factory<R> factory) {
        final double x = axis.x();
        final double y = axis.y();
        final double z = axis.z();

        final double cos = Math.cos(angle);
        final double sin = Math.sin(angle);
        final double oneMinusCos = 1.0D - cos;

        final double xSin = x * sin;
        final double ySin = y * sin;
        final double zSin = z * sin;

        final double cxy = oneMinusCos * x * y;
        final double cxz = oneMinusCos * x * z;
        final double cyz = oneMinusCos * y * z;

        return factory.create(
                oneMinusCos * x * x + cos,
                cxy + zSin,
                cxz - ySin,
                cxy - zSin,
                oneMinusCos * y * y + cos,
                cyz + xSin,
                cxz + ySin,
                cyz - xSin,
                oneMinusCos * z * z + cos
        );
    }

    public static void asMatrixTo(final Vector3.Accessible axis, final double angle, final Matrix3x3.Consumer consumer) {
        final double x = axis.x();
        final double y = axis.y();
        final double z = axis.z();

        final double cos = Math.cos(angle);
        final double sin = Math.sin(angle);
        final double oneMinusCos = 1.0D - cos;

        final double xSin = x * sin;
        final double ySin = y * sin;
        final double zSin = z * sin;

        final double cxy = oneMinusCos * x * y;
        final double cxz = oneMinusCos * x * z;
        final double cyz = oneMinusCos * y * z;

        consumer.XYZxyz(
                oneMinusCos * x * x + cos,
                cxy + zSin,
                cxz - ySin,
                cxy - zSin,
                oneMinusCos * y * y + cos,
                cyz + xSin,
                cxz + ySin,
                cyz - xSin,
                oneMinusCos * z * z + cos
        );
    }

    public static <R> R asMatrix(final Vector4.Accessible quaternion, final Matrix3x3.Factory<R> factory) {
        final double x = quaternion.x();
        final double y = quaternion.y();
        final double z = quaternion.z();
        final double w = quaternion.w();

        final double x2 = x + x;
        final double y2 = y + y;
        final double z2 = z + z;

        final double xx2 = x * x2;
        final double yx2 = y * x2;
        final double yy2 = y * y2;
        final double zx2 = z * x2;
        final double zy2 = z * y2;
        final double zz2 = z * z2;
        final double wx2 = w * x2;
        final double wy2 = w * y2;
        final double wz2 = w * z2;

        return factory.create(
                1.0D - yy2 - zz2,
                yx2 + wz2,
                zx2 - wy2,
                yx2 - wz2,
                1.0D - xx2 - zz2,
                zy2 + wx2,
                zx2 + wy2,
                zy2 - wx2,
                1.0D - xx2 - yy2
        );
    }

    public static void asMatrixTo(final Vector4.Accessible quaternion, final Matrix3x3.Consumer consumer) {
        final double x = quaternion.x();
        final double y = quaternion.y();
        final double z = quaternion.z();
        final double w = quaternion.w();

        final double x2 = x + x;
        final double y2 = y + y;
        final double z2 = z + z;

        final double xx2 = x * x2;
        final double yx2 = y * x2;
        final double yy2 = y * y2;
        final double zx2 = z * x2;
        final double zy2 = z * y2;
        final double zz2 = z * z2;
        final double wx2 = w * x2;
        final double wy2 = w * y2;
        final double wz2 = w * z2;

        consumer.XYZxyz(
                1.0D - yy2 - zz2,
                yx2 + wz2,
                zx2 - wy2,
                yx2 - wz2,
                1.0D - xx2 - zz2,
                zy2 + wx2,
                zx2 + wy2,
                zy2 - wx2,
                1.0D - xx2 - yy2
        );
    }

    public static <R> R quaternionSlerp(final Vector4.Accessible a, final Vector4.Accessible b, final double t, final Vector4.Factory<R> factory) {
        final double aX = a.x();
        final double aY = a.y();
        final double aZ = a.z();
        final double aW = a.w();

        final double bX = b.x();
        final double bY = b.y();
        final double bZ = b.z();
        final double bW = b.w();

        final double dot = aX * bX + aY * bY + aZ * bZ + aW * bW;
        final double sign = (dot < 0.0D) ? -1.0D : 1.0D;
        final double cosOmega = dot * sign;
        double scale1, scale2;

        if (cosOmega < 0.999999D) {
            final double omega = Math.acos(cosOmega);
            final double inverseSinOmega = 1.0D / Math.sin(omega);
            scale1 = Math.sin((1.0D - t) * omega) * inverseSinOmega;
            scale2 = Math.sin(t * omega) * inverseSinOmega * sign;
        } else {
            scale1 = 1.0D - t;
            scale2 = t * sign;
        }

        return factory.create(
                aX * scale1 + bX * scale2,
                aY * scale1 + bY * scale2,
                aZ * scale1 + bZ * scale2,
                aW * scale1 + bW * scale2
        );
    }

    public static void quaternionSlerpTo(final Vector4.Accessible a, final Vector4.Accessible b, final double t, final Vector4.Consumer consumer) {
        final double aX = a.x();
        final double aY = a.y();
        final double aZ = a.z();
        final double aW = a.w();

        final double bX = b.x();
        final double bY = b.y();
        final double bZ = b.z();
        final double bW = b.w();

        final double dot = aX * bX + aY * bY + aZ * bZ + aW * bW;
        final double sign = (dot < 0.0D) ? -1.0D : 1.0D;
        final double cosOmega = dot * sign;
        double scale1, scale2;

        if (cosOmega < 0.999999D) {
            final double omega = Math.acos(cosOmega);
            final double inverseSinOmega = 1.0D / Math.sin(omega);
            scale1 = Math.sin((1.0D - t) * omega) * inverseSinOmega;
            scale2 = Math.sin(t * omega) * inverseSinOmega * sign;
        } else {
            scale1 = 1.0D - t;
            scale2 = t * sign;
        }

        consumer.xyzw(
                aX * scale1 + bX * scale2,
                aY * scale1 + bY * scale2,
                aZ * scale1 + bZ * scale2,
                aW * scale1 + bW * scale2
        );
    }

    public static <R> R quaternionInverse(final Vector4.Accessible quaternion, final Vector4.Factory<R> factory) {
        final double x = quaternion.x();
        final double y = quaternion.y();
        final double z = quaternion.z();
        final double w = quaternion.w();

        final double inverseDot = 1.0D / (x * x + y * y + z * z + w * w);

        return factory.create(
                -x * inverseDot,
                -y * inverseDot,
                -z * inverseDot,
                w * inverseDot
        );
    }

    public static void quaternionInverseTo(final Vector4.Accessible quaternion, final Vector4.Consumer consumer) {
        final double x = quaternion.x();
        final double y = quaternion.y();
        final double z = quaternion.z();
        final double w = quaternion.w();

        final double inverseDot = 1.0D / (x * x + y * y + z * z + w * w);

        consumer.xyzw(
                -x * inverseDot,
                -y * inverseDot,
                -z * inverseDot,
                w * inverseDot
        );
    }

    public static <R> R quaternionMultiply(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        final double aX = a.x();
        final double aY = a.y();
        final double aZ = a.z();
        final double aW = a.w();

        final double bX = b.x();
        final double bY = b.y();
        final double bZ = b.z();
        final double bW = b.w();

        return factory.create(
                aX * bW + aW * bX + aY * bZ - aZ * bY,
                aY * bW + aW * bY + aZ * bX - aX * bZ,
                aZ * bW + aW * bZ + aX * bY - aY * bX,
                aW * bW - aX * bX - aY * bY - aZ * bZ
        );
    }

    public static void quaternionMultiplyTo(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        final double aX = a.x();
        final double aY = a.y();
        final double aZ = a.z();
        final double aW = a.w();

        final double bX = b.x();
        final double bY = b.y();
        final double bZ = b.z();
        final double bW = b.w();

        consumer.xyzw(
                aX * bW + aW * bX + aY * bZ - aZ * bY,
                aY * bW + aW * bY + aZ * bX - aX * bZ,
                aZ * bW + aW * bZ + aX * bY - aY * bX,
                aW * bW - aX * bX - aY * bY - aZ * bZ
        );
    }

    public static <R> R quaternionTransformVector(final Vector4.Accessible quaternion, final Vector3.Accessible vector, final Vector3.Factory<R> factory) {
        final double quaternionX = quaternion.x();
        final double quaternionY = quaternion.y();
        final double quaternionZ = quaternion.z();
        final double quaternionW = quaternion.w();

        final double vectorX = vector.x();
        final double vectorY = vector.y();
        final double vectorZ = vector.z();

        final double crossQVX = quaternionY * vectorZ - quaternionZ * vectorY;
        final double crossQVY = quaternionZ * vectorX - quaternionX * vectorZ;
        final double crossQVZ = quaternionX * vectorY - quaternionY * vectorX;

        return factory.create(
                vectorX + (crossQVX * quaternionW + (quaternionY * crossQVZ - quaternionZ * crossQVY)) * 2.0D,
                vectorY + (crossQVY * quaternionW + (quaternionZ * crossQVX - quaternionX * crossQVZ)) * 2.0D,
                vectorZ + (crossQVZ * quaternionW + (quaternionX * crossQVY - quaternionY * crossQVX)) * 2.0D
        );
    }

    public static void quaternionTransformVectorTo(final Vector4.Accessible quaternion, final Vector3.Accessible vector, final Vector3.Consumer consumer) {
        final double quaternionX = quaternion.x();
        final double quaternionY = quaternion.y();
        final double quaternionZ = quaternion.z();
        final double quaternionW = quaternion.w();

        final double vectorX = vector.x();
        final double vectorY = vector.y();
        final double vectorZ = vector.z();

        final double crossQVX = quaternionY * vectorZ - quaternionZ * vectorY;
        final double crossQVY = quaternionZ * vectorX - quaternionX * vectorZ;
        final double crossQVZ = quaternionX * vectorY - quaternionY * vectorX;

        consumer.xyz(
                vectorX + (crossQVX * quaternionW + (quaternionY * crossQVZ - quaternionZ * crossQVY)) * 2.0D,
                vectorY + (crossQVY * quaternionW + (quaternionZ * crossQVX - quaternionX * crossQVZ)) * 2.0D,
                vectorZ + (crossQVZ * quaternionW + (quaternionX * crossQVY - quaternionY * crossQVX)) * 2.0D
        );
    }

}
