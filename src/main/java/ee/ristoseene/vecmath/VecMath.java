package ee.ristoseene.vecmath;

public final class VecMath {

    private VecMath() {}

    public static double clamp(final double val, final double min, final double max) {
        return Math.min(Math.max(val, min), max);
    }

    public static double lerp(final double a, final double b, final double t) {
        return a * (1.0D - t) + b * t;
    }

    public static double min2(final Vector2.Accessible vec) {
        return Math.min(vec.x(), vec.y());
    }

    public static double max2(final Vector2.Accessible vec) {
        return Math.max(vec.x(), vec.y());
    }

    public static <R> R min2(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b),
                Math.min(a.y(), b)
        );
    }

    public static void min2To(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(a.x(), b),
                Math.min(a.y(), b)
        );
    }

    public static <R> R min2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y())
        );
    }

    public static void min2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y())
        );
    }

    public static <R> R max2(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b),
                Math.max(a.y(), b)
        );
    }

    public static void max2To(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.max(a.x(), b),
                Math.max(a.y(), b)
        );
    }

    public static <R> R max2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y())
        );
    }

    public static void max2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y())
        );
    }

    public static <R> R clamp2(final Vector2.Accessible val, final double min, final double max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min), max),
                Math.min(Math.max(val.y(), min), max)
        );
    }

    public static void clamp2To(final Vector2.Accessible val, final double min, final double max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(val.x(), min), max),
                Math.min(Math.max(val.y(), min), max)
        );
    }

    public static <R> R clamp2(final Vector2.Accessible val, final Vector2.Accessible min, final double max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min.x()), max),
                Math.min(Math.max(val.y(), min.y()), max)
        );
    }

    public static void clamp2To(final Vector2.Accessible val, final Vector2.Accessible min, final double max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(val.x(), min.x()), max),
                Math.min(Math.max(val.y(), min.y()), max)
        );
    }

    public static <R> R clamp2(final Vector2.Accessible val, final double min, final Vector2.Accessible max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min), max.x()),
                Math.min(Math.max(val.y(), min), max.y())
        );
    }

    public static void clamp2To(final Vector2.Accessible val, final double min, final Vector2.Accessible max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(val.x(), min), max.x()),
                Math.min(Math.max(val.y(), min), max.y())
        );
    }

    public static <R> R clamp2(final Vector2.Accessible val, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min.x()), max.x()),
                Math.min(Math.max(val.y(), min.y()), max.y())
        );
    }

    public static void clamp2To(final Vector2.Accessible val, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(val.x(), min.x()), max.x()),
                Math.min(Math.max(val.y(), min.y()), max.y())
        );
    }

    public static <R> R clamp2(final double val, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val, min.x()), max.x()),
                Math.min(Math.max(val, min.y()), max.y())
        );
    }

    public static void clamp2To(final double val, final Vector2.Accessible min, final Vector2.Accessible max, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.min(Math.max(val, min.x()), max.x()),
                Math.min(Math.max(val, min.y()), max.y())
        );
    }

    public static <R> R lerp2(final Vector2.Accessible a, final double b, final double t, final Vector2.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        return factory.create(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT
        );
    }

    public static void lerp2To(final Vector2.Accessible a, final double b, final double t, final Vector2.Consumer consumer) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        consumer.xy(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT
        );
    }

    public static <R> R lerp2(final Vector2.Accessible a, final Vector2.Accessible b, final double t, final Vector2.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;

        return factory.create(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t
        );
    }

    public static void lerp2To(final Vector2.Accessible a, final Vector2.Accessible b, final double t, final Vector2.Consumer consumer) {
        final double oneMinusT = 1.0D - t;

        consumer.xy(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t
        );
    }

    public static <R> R lerp2(final double a, final Vector2.Accessible b, final double t, final Vector2.Factory<R> factory) {
        final double aOneMinusT = a * (1.0D - t);

        return factory.create(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t
        );
    }

    public static void lerp2To(final double a, final Vector2.Accessible b, final double t, final Vector2.Consumer consumer) {
        final double aOneMinusT = a * (1.0D - t);

        consumer.xy(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t
        );
    }

    public static <R> R lerp2(final Vector2.Accessible a, final double b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y())
        );
    }

    public static void lerp2To(final Vector2.Accessible a, final double b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y())
        );
    }

    public static <R> R lerp2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y())
        );
    }

    public static void lerp2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y())
        );
    }

    public static <R> R lerp2(final double a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y())
        );
    }

    public static void lerp2To(final double a, final Vector2.Accessible b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y())
        );
    }

    public static <R> R lerp2(final double a, final double b, final Vector2.Accessible t, final Vector2.Factory<R> factory) {
        return factory.create(
                lerp(a, b, t.x()),
                lerp(a, b, t.y())
        );
    }

    public static void lerp2To(final double a, final double b, final Vector2.Accessible t, final Vector2.Consumer consumer) {
        consumer.xy(
                lerp(a, b, t.x()),
                lerp(a, b, t.y())
        );
    }

    public static <R> R neg2(final Vector2.Accessible vec, final Vector2.Factory<R> factory) {
        return factory.create(
                -vec.x(),
                -vec.y()
        );
    }

    public static void neg2To(final Vector2.Accessible vec, final Vector2.Consumer consumer) {
        consumer.xy(
                -vec.x(),
                -vec.y()
        );
    }

    public static <R> R add2(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() + b,
                a.y() + b
        );
    }

    public static void add2To(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() + b,
                a.y() + b
        );
    }

    public static <R> R add2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() + b.x(),
                a.y() + b.y()
        );
    }

    public static void add2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() + b.x(),
                a.y() + b.y()
        );
    }

    public static <R> R sub2(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() - b,
                a.y() - b
        );
    }

    public static void sub2To(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() - b,
                a.y() - b
        );
    }

    public static <R> R sub2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() - b.x(),
                a.y() - b.y()
        );
    }

    public static void sub2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() - b.x(),
                a.y() - b.y()
        );
    }

    public static <R> R sub2(final double a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                a - b.x(),
                a - b.y()
        );
    }

    public static void sub2To(final double a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                a - b.x(),
                a - b.y()
        );
    }

    public static <R> R mul2(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() * b,
                a.y() * b
        );
    }

    public static void mul2To(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() * b,
                a.y() * b
        );
    }

    public static <R> R mul2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() * b.x(),
                a.y() * b.y()
        );
    }

    public static void mul2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() * b.x(),
                a.y() * b.y()
        );
    }

    public static <R> R div2(final Vector2.Accessible a, final double b, final Vector2.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.x() * inverseB,
                a.y() * inverseB
        );
    }

    public static void div2To(final Vector2.Accessible a, final double b, final Vector2.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.xy(
                a.x() * inverseB,
                a.y() * inverseB
        );
    }

    public static <R> R div2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() / b.x(),
                a.y() / b.y()
        );
    }

    public static void div2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() / b.x(),
                a.y() / b.y()
        );
    }

    public static <R> R div2(final double a, final Vector2.Accessible b, final Vector2.Factory<R> factory) {
        return factory.create(
                a / b.x(),
                a / b.y()
        );
    }

    public static void div2To(final double a, final Vector2.Accessible b, final Vector2.Consumer consumer) {
        consumer.xy(
                a / b.x(),
                a / b.y()
        );
    }

    public static <R> R fma2(final Vector2.Accessible a, final double b, final double c, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() * b + c,
                a.y() * b + c
        );
    }

    public static void fma2To(final Vector2.Accessible a, final double b, final double c, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() * b + c,
                a.y() * b + c
        );
    }

    public static <R> R fma2(final Vector2.Accessible a, final Vector2.Accessible b, final double c, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() * b.x() + c,
                a.y() * b.y() + c
        );
    }

    public static void fma2To(final Vector2.Accessible a, final Vector2.Accessible b, final double c, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() * b.x() + c,
                a.y() * b.y() + c
        );
    }

    public static <R> R fma2(final Vector2.Accessible a, final double b, final Vector2.Accessible c, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() * b + c.x(),
                a.y() * b + c.y()
        );
    }

    public static void fma2To(final Vector2.Accessible a, final double b, final Vector2.Accessible c, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() * b + c.x(),
                a.y() * b + c.y()
        );
    }

    public static <R> R fma2(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Accessible c, final Vector2.Factory<R> factory) {
        return factory.create(
                a.x() * b.x() + c.x(),
                a.y() * b.y() + c.y()
        );
    }

    public static void fma2To(final Vector2.Accessible a, final Vector2.Accessible b, final Vector2.Accessible c, final Vector2.Consumer consumer) {
        consumer.xy(
                a.x() * b.x() + c.x(),
                a.y() * b.y() + c.y()
        );
    }

    public static <R> R pow2(final Vector2.Accessible base, final double exp, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exp),
                Math.pow(base.y(), exp)
        );
    }

    public static void pow2To(final Vector2.Accessible base, final double exp, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.pow(base.x(), exp),
                Math.pow(base.y(), exp)
        );
    }

    public static <R> R pow2(final Vector2.Accessible base, final Vector2.Accessible exp, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exp.x()),
                Math.pow(base.y(), exp.y())
        );
    }

    public static void pow2To(final Vector2.Accessible base, final Vector2.Accessible exp, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.pow(base.x(), exp.x()),
                Math.pow(base.y(), exp.y())
        );
    }

    public static <R> R pow2(final double base, final Vector2.Accessible exp, final Vector2.Factory<R> factory) {
        return factory.create(
                Math.pow(base, exp.x()),
                Math.pow(base, exp.y())
        );
    }

    public static void pow2To(final double base, final Vector2.Accessible exp, final Vector2.Consumer consumer) {
        consumer.xy(
                Math.pow(base, exp.x()),
                Math.pow(base, exp.y())
        );
    }

    public static double squaredLength2(final Vector2.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();

        return x * x + y * y;
    }

    public static double squaredDistance2(final Vector2.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;

        return x * x + y * y;
    }

    public static double squaredDistance2(final Vector2.Accessible a, final Vector2.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();

        return x * x + y * y;
    }

    public static double length2(final Vector2.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();

        return Math.sqrt(x * x + y * y);
    }

    public static double distance2(final Vector2.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;

        return Math.sqrt(x * x + y * y);
    }

    public static double distance2(final Vector2.Accessible a, final Vector2.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();

        return Math.sqrt(x * x + y * y);
    }

    public static double dot2(final Vector2.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();

        return x * x + y * y;
    }

    public static double dot2(final Vector2.Accessible a, final double b) {
        return a.x() * b + a.y() * b;
    }

    public static double dot2(final Vector2.Accessible a, final Vector2.Accessible b) {
        return a.x() * b.x() + a.y() * b.y();
    }

    public static <R> R normalize2(final Vector2.Accessible vec, final Vector2.Factory<R> factory) {
        final double x = vec.x();
        final double y = vec.y();

        final double length = Math.sqrt(x * x + y * y);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        return factory.create(
                x * inverseLength,
                y * inverseLength
        );
    }

    public static void normalize2To(final Vector2.Accessible vec, final Vector2.Consumer consumer) {
        final double x = vec.x();
        final double y = vec.y();

        final double length = Math.sqrt(x * x + y * y);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        consumer.xy(
                x * inverseLength,
                y * inverseLength
        );
    }

    public static <R> R reflect2(final Vector2.Accessible incident, final Vector2.Accessible normal, final Vector2.Factory<R> factory) {
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

    public static void reflect2To(final Vector2.Accessible incident, final Vector2.Accessible normal, final Vector2.Consumer consumer) {
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

    public static <R> R refract2(final Vector2.Accessible incident, final Vector2.Accessible normal, final double eta, final Vector2.Factory<R> factory) {
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

    public static void refract2To(final Vector2.Accessible incident, final Vector2.Accessible normal, final double eta, final Vector2.Consumer consumer) {
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

    public static double min3(final Vector3.Accessible vec) {
        return Math.min(
                Math.min(vec.x(), vec.y()),
                vec.z()
        );
    }

    public static double min3(final double x, final double y, final double z) {
        return Math.min(Math.min(x, y), z);
    }

    public static double max3(final Vector3.Accessible vec) {
        return Math.max(
                Math.max(vec.x(), vec.y()),
                vec.z()
        );
    }

    public static double max3(final double x, final double y, final double z) {
        return Math.max(Math.max(x, y), z);
    }

    public static <R> R min3(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b)
        );
    }

    public static void min3To(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b)
        );
    }

    public static <R> R min3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z())
        );
    }

    public static void min3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z())
        );
    }

    public static <R> R max3(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b)
        );
    }

    public static void max3To(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b)
        );
    }

    public static <R> R max3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z())
        );
    }

    public static void max3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z())
        );
    }

    public static <R> R clamp3(final Vector3.Accessible val, final double min, final double max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min), max),
                Math.min(Math.max(val.y(), min), max),
                Math.min(Math.max(val.z(), min), max)
        );
    }

    public static void clamp3To(final Vector3.Accessible val, final double min, final double max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(val.x(), min), max),
                Math.min(Math.max(val.y(), min), max),
                Math.min(Math.max(val.z(), min), max)
        );
    }

    public static <R> R clamp3(final Vector3.Accessible val, final Vector3.Accessible min, final double max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min.x()), max),
                Math.min(Math.max(val.y(), min.y()), max),
                Math.min(Math.max(val.z(), min.z()), max)
        );
    }

    public static void clamp3To(final Vector3.Accessible val, final Vector3.Accessible min, final double max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(val.x(), min.x()), max),
                Math.min(Math.max(val.y(), min.y()), max),
                Math.min(Math.max(val.z(), min.z()), max)
        );
    }

    public static <R> R clamp3(final Vector3.Accessible val, final double min, final Vector3.Accessible max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min), max.x()),
                Math.min(Math.max(val.y(), min), max.y()),
                Math.min(Math.max(val.z(), min), max.z())
        );
    }

    public static void clamp3To(final Vector3.Accessible val, final double min, final Vector3.Accessible max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(val.x(), min), max.x()),
                Math.min(Math.max(val.y(), min), max.y()),
                Math.min(Math.max(val.z(), min), max.z())
        );
    }

    public static <R> R clamp3(final Vector3.Accessible val, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min.x()), max.x()),
                Math.min(Math.max(val.y(), min.y()), max.y()),
                Math.min(Math.max(val.z(), min.z()), max.z())
        );
    }

    public static void clamp3To(final Vector3.Accessible val, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(val.x(), min.x()), max.x()),
                Math.min(Math.max(val.y(), min.y()), max.y()),
                Math.min(Math.max(val.z(), min.z()), max.z())
        );
    }

    public static <R> R clamp3(final double val, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val, min.x()), max.x()),
                Math.min(Math.max(val, min.y()), max.y()),
                Math.min(Math.max(val, min.z()), max.z())
        );
    }

    public static void clamp3To(final double val, final Vector3.Accessible min, final Vector3.Accessible max, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.min(Math.max(val, min.x()), max.x()),
                Math.min(Math.max(val, min.y()), max.y()),
                Math.min(Math.max(val, min.z()), max.z())
        );
    }

    public static <R> R lerp3(final Vector3.Accessible a, final double b, final double t, final Vector3.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        return factory.create(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT
        );
    }

    public static void lerp3To(final Vector3.Accessible a, final double b, final double t, final Vector3.Consumer consumer) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        consumer.xyz(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT
        );
    }

    public static <R> R lerp3(final Vector3.Accessible a, final Vector3.Accessible b, final double t, final Vector3.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;

        return factory.create(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t
        );
    }

    public static void lerp3To(final Vector3.Accessible a, final Vector3.Accessible b, final double t, final Vector3.Consumer consumer) {
        final double oneMinusT = 1.0D - t;

        consumer.xyz(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t
        );
    }

    public static <R> R lerp3(final double a, final Vector3.Accessible b, final double t, final Vector3.Factory<R> factory) {
        final double aOneMinusT = a * (1.0D - t);

        return factory.create(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t
        );
    }

    public static void lerp3To(final double a, final Vector3.Accessible b, final double t, final Vector3.Consumer consumer) {
        final double aOneMinusT = a * (1.0D - t);

        consumer.xyz(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t
        );
    }

    public static <R> R lerp3(final Vector3.Accessible a, final double b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z())
        );
    }

    public static void lerp3To(final Vector3.Accessible a, final double b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z())
        );
    }

    public static <R> R lerp3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z())
        );
    }

    public static void lerp3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z())
        );
    }

    public static <R> R lerp3(final double a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z())
        );
    }

    public static void lerp3To(final double a, final Vector3.Accessible b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z())
        );
    }

    public static <R> R lerp3(final double a, final double b, final Vector3.Accessible t, final Vector3.Factory<R> factory) {
        return factory.create(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z())
        );
    }

    public static void lerp3To(final double a, final double b, final Vector3.Accessible t, final Vector3.Consumer consumer) {
        consumer.xyz(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z())
        );
    }

    public static <R> R neg3(final Vector3.Accessible vec, final Vector3.Factory<R> factory) {
        return factory.create(
                -vec.x(),
                -vec.y(),
                -vec.z()
        );
    }

    public static void neg3To(final Vector3.Accessible vec, final Vector3.Consumer consumer) {
        consumer.xyz(
                -vec.x(),
                -vec.y(),
                -vec.z()
        );
    }

    public static <R> R add3(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() + b,
                a.y() + b,
                a.z() + b
        );
    }

    public static void add3To(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() + b,
                a.y() + b,
                a.z() + b
        );
    }

    public static <R> R add3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() + b.x(),
                a.y() + b.y(),
                a.z() + b.z()
        );
    }

    public static void add3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() + b.x(),
                a.y() + b.y(),
                a.z() + b.z()
        );
    }

    public static <R> R sub3(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() - b,
                a.y() - b,
                a.z() - b
        );
    }

    public static void sub3To(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() - b,
                a.y() - b,
                a.z() - b
        );
    }

    public static <R> R sub3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() - b.x(),
                a.y() - b.y(),
                a.z() - b.z()
        );
    }

    public static void sub3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() - b.x(),
                a.y() - b.y(),
                a.z() - b.z()
        );
    }

    public static <R> R sub3(final double a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                a - b.x(),
                a - b.y(),
                a - b.z()
        );
    }

    public static void sub3To(final double a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a - b.x(),
                a - b.y(),
                a - b.z()
        );
    }

    public static <R> R mul3(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() * b,
                a.y() * b,
                a.z() * b
        );
    }

    public static void mul3To(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() * b,
                a.y() * b,
                a.z() * b
        );
    }

    public static <R> R mul3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() * b.x(),
                a.y() * b.y(),
                a.z() * b.z()
        );
    }

    public static void mul3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() * b.x(),
                a.y() * b.y(),
                a.z() * b.z()
        );
    }

    public static <R> R div3(final Vector3.Accessible a, final double b, final Vector3.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.x() * inverseB,
                a.y() * inverseB,
                a.z() * inverseB
        );
    }

    public static void div3To(final Vector3.Accessible a, final double b, final Vector3.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.xyz(
                a.x() * inverseB,
                a.y() * inverseB,
                a.z() * inverseB
        );
    }

    public static <R> R div3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() / b.x(),
                a.y() / b.y(),
                a.z() / b.z()
        );
    }

    public static void div3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() / b.x(),
                a.y() / b.y(),
                a.z() / b.z()
        );
    }

    public static <R> R div3(final double a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
        return factory.create(
                a / b.x(),
                a / b.y(),
                a / b.z()
        );
    }

    public static void div3To(final double a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
        consumer.xyz(
                a / b.x(),
                a / b.y(),
                a / b.z()
        );
    }

    public static <R> R fma3(final Vector3.Accessible a, final double b, final double c, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() * b + c,
                a.y() * b + c,
                a.z() * b + c
        );
    }

    public static void fma3To(final Vector3.Accessible a, final double b, final double c, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() * b + c,
                a.y() * b + c,
                a.z() * b + c
        );
    }

    public static <R> R fma3(final Vector3.Accessible a, final Vector3.Accessible b, final double c, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() * b.x() + c,
                a.y() * b.y() + c,
                a.z() * b.z() + c
        );
    }

    public static void fma3To(final Vector3.Accessible a, final Vector3.Accessible b, final double c, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() * b.x() + c,
                a.y() * b.y() + c,
                a.z() * b.z() + c
        );
    }

    public static <R> R fma3(final Vector3.Accessible a, final double b, final Vector3.Accessible c, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() * b + c.x(),
                a.y() * b + c.y(),
                a.z() * b + c.z()
        );
    }

    public static void fma3To(final Vector3.Accessible a, final double b, final Vector3.Accessible c, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() * b + c.x(),
                a.y() * b + c.y(),
                a.z() * b + c.z()
        );
    }

    public static <R> R fma3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Accessible c, final Vector3.Factory<R> factory) {
        return factory.create(
                a.x() * b.x() + c.x(),
                a.y() * b.y() + c.y(),
                a.z() * b.z() + c.z()
        );
    }

    public static void fma3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Accessible c, final Vector3.Consumer consumer) {
        consumer.xyz(
                a.x() * b.x() + c.x(),
                a.y() * b.y() + c.y(),
                a.z() * b.z() + c.z()
        );
    }

    public static <R> R pow3(final Vector3.Accessible base, final double exp, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exp),
                Math.pow(base.y(), exp),
                Math.pow(base.z(), exp)
        );
    }

    public static void pow3To(final Vector3.Accessible base, final double exp, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.pow(base.x(), exp),
                Math.pow(base.y(), exp),
                Math.pow(base.z(), exp)
        );
    }

    public static <R> R pow3(final Vector3.Accessible base, final Vector3.Accessible exp, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exp.x()),
                Math.pow(base.y(), exp.y()),
                Math.pow(base.z(), exp.z())
        );
    }

    public static void pow3To(final Vector3.Accessible base, final Vector3.Accessible exp, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.pow(base.x(), exp.x()),
                Math.pow(base.y(), exp.y()),
                Math.pow(base.z(), exp.z())
        );
    }

    public static <R> R pow3(final double base, final Vector3.Accessible exp, final Vector3.Factory<R> factory) {
        return factory.create(
                Math.pow(base, exp.x()),
                Math.pow(base, exp.y()),
                Math.pow(base, exp.z())
        );
    }

    public static void pow3To(final double base, final Vector3.Accessible exp, final Vector3.Consumer consumer) {
        consumer.xyz(
                Math.pow(base, exp.x()),
                Math.pow(base, exp.y()),
                Math.pow(base, exp.z())
        );
    }

    public static double squaredLength3(final Vector3.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();

        return x * x + y * y + z * z;
    }

    public static double squaredDistance3(final Vector3.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;

        return x * x + y * y + z * z;
    }

    public static double squaredDistance3(final Vector3.Accessible a, final Vector3.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();

        return x * x + y * y + z * z;
    }

    public static double length3(final Vector3.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance3(final Vector3.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance3(final Vector3.Accessible a, final Vector3.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();

        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double dot3(final Vector3.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();

        return x * x + y * y + z * z;
    }

    public static double dot3(final Vector3.Accessible a, final double b) {
        return a.x() * b + a.y() * b + a.z() * b;
    }

    public static double dot3(final Vector3.Accessible a, final Vector3.Accessible b) {
        return a.x() * b.x() + a.y() * b.y() + a.z() * b.z();
    }

    public static <R> R cross3(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Factory<R> factory) {
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

    public static void cross3To(final Vector3.Accessible a, final Vector3.Accessible b, final Vector3.Consumer consumer) {
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

    public static <R> R normalize3(final Vector3.Accessible vec, final Vector3.Factory<R> factory) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();

        final double length = Math.sqrt(x * x + y * y + z * z);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        return factory.create(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength
        );
    }

    public static void normalize3To(final Vector3.Accessible vec, final Vector3.Consumer consumer) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();

        final double length = Math.sqrt(x * x + y * y + z * z);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        consumer.xyz(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength
        );
    }

    public static <R> R reflect3(final Vector3.Accessible incident, final Vector3.Accessible normal, final Vector3.Factory<R> factory) {
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

    public static void reflect3To(final Vector3.Accessible incident, final Vector3.Accessible normal, final Vector3.Consumer consumer) {
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

    public static <R> R refract3(final Vector3.Accessible incident, final Vector3.Accessible normal, final double eta, final Vector3.Factory<R> factory) {
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

    public static void refract3To(final Vector3.Accessible incident, final Vector3.Accessible normal, final double eta, final Vector3.Consumer consumer) {
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

    public static double min4(final Vector4.Accessible vec) {
        return Math.min(
                Math.min(vec.x(), vec.y()),
                Math.min(vec.z(), vec.w())
        );
    }

    public static double min4(final double x, final double y, final double z, final double w) {
        return Math.min(Math.min(x, y), Math.min(z, w));
    }

    public static double max4(final Vector4.Accessible vec) {
        return Math.max(
                Math.max(vec.x(), vec.y()),
                Math.max(vec.z(), vec.w())
        );
    }

    public static double max4(final double x, final double y, final double z, final double w) {
        return Math.max(Math.max(x, y), Math.max(z, w));
    }

    public static <R> R min4(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b),
                Math.min(a.w(), b)
        );
    }

    public static void min4To(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(a.x(), b),
                Math.min(a.y(), b),
                Math.min(a.z(), b),
                Math.min(a.w(), b)
        );
    }

    public static <R> R min4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z()),
                Math.min(a.w(), b.w())
        );
    }

    public static void min4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(a.x(), b.x()),
                Math.min(a.y(), b.y()),
                Math.min(a.z(), b.z()),
                Math.min(a.w(), b.w())
        );
    }

    public static <R> R max4(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b),
                Math.max(a.w(), b)
        );
    }

    public static void max4To(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.max(a.x(), b),
                Math.max(a.y(), b),
                Math.max(a.z(), b),
                Math.max(a.w(), b)
        );
    }

    public static <R> R max4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z()),
                Math.max(a.w(), b.w())
        );
    }

    public static void max4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.max(a.x(), b.x()),
                Math.max(a.y(), b.y()),
                Math.max(a.z(), b.z()),
                Math.max(a.w(), b.w())
        );
    }

    public static <R> R clamp4(final Vector4.Accessible val, final double min, final double max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min), max),
                Math.min(Math.max(val.y(), min), max),
                Math.min(Math.max(val.z(), min), max),
                Math.min(Math.max(val.w(), min), max)
        );
    }

    public static void clamp4To(final Vector4.Accessible val, final double min, final double max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(val.x(), min), max),
                Math.min(Math.max(val.y(), min), max),
                Math.min(Math.max(val.z(), min), max),
                Math.min(Math.max(val.w(), min), max)
        );
    }

    public static <R> R clamp4(final Vector4.Accessible val, final Vector4.Accessible min, final double max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min.x()), max),
                Math.min(Math.max(val.y(), min.y()), max),
                Math.min(Math.max(val.z(), min.z()), max),
                Math.min(Math.max(val.w(), min.w()), max)
        );
    }

    public static void clamp4To(final Vector4.Accessible val, final Vector4.Accessible min, final double max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(val.x(), min.x()), max),
                Math.min(Math.max(val.y(), min.y()), max),
                Math.min(Math.max(val.z(), min.z()), max),
                Math.min(Math.max(val.w(), min.w()), max)
        );
    }

    public static <R> R clamp4(final Vector4.Accessible val, final double min, final Vector4.Accessible max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min), max.x()),
                Math.min(Math.max(val.y(), min), max.y()),
                Math.min(Math.max(val.z(), min), max.z()),
                Math.min(Math.max(val.w(), min), max.w())
        );
    }

    public static void clamp4To(final Vector4.Accessible val, final double min, final Vector4.Accessible max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(val.x(), min), max.x()),
                Math.min(Math.max(val.y(), min), max.y()),
                Math.min(Math.max(val.z(), min), max.z()),
                Math.min(Math.max(val.w(), min), max.w())
        );
    }

    public static <R> R clamp4(final Vector4.Accessible val, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val.x(), min.x()), max.x()),
                Math.min(Math.max(val.y(), min.y()), max.y()),
                Math.min(Math.max(val.z(), min.z()), max.z()),
                Math.min(Math.max(val.w(), min.w()), max.w())
        );
    }

    public static void clamp4To(final Vector4.Accessible val, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(val.x(), min.x()), max.x()),
                Math.min(Math.max(val.y(), min.y()), max.y()),
                Math.min(Math.max(val.z(), min.z()), max.z()),
                Math.min(Math.max(val.w(), min.w()), max.w())
        );
    }

    public static <R> R clamp4(final double val, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.min(Math.max(val, min.x()), max.x()),
                Math.min(Math.max(val, min.y()), max.y()),
                Math.min(Math.max(val, min.z()), max.z()),
                Math.min(Math.max(val, min.w()), max.w())
        );
    }

    public static void clamp4To(final double val, final Vector4.Accessible min, final Vector4.Accessible max, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.min(Math.max(val, min.x()), max.x()),
                Math.min(Math.max(val, min.y()), max.y()),
                Math.min(Math.max(val, min.z()), max.z()),
                Math.min(Math.max(val, min.w()), max.w())
        );
    }

    public static <R> R lerp4(final Vector4.Accessible a, final double b, final double t, final Vector4.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        return factory.create(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT,
                a.w() * oneMinusT + bT
        );
    }

    public static void lerp4To(final Vector4.Accessible a, final double b, final double t, final Vector4.Consumer consumer) {
        final double oneMinusT = 1.0D - t;
        final double bT = b * t;

        consumer.xyzw(
                a.x() * oneMinusT + bT,
                a.y() * oneMinusT + bT,
                a.z() * oneMinusT + bT,
                a.w() * oneMinusT + bT
        );
    }

    public static <R> R lerp4(final Vector4.Accessible a, final Vector4.Accessible b, final double t, final Vector4.Factory<R> factory) {
        final double oneMinusT = 1.0D - t;

        return factory.create(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t,
                a.w() * oneMinusT + b.w() * t
        );
    }

    public static void lerp4To(final Vector4.Accessible a, final Vector4.Accessible b, final double t, final Vector4.Consumer consumer) {
        final double oneMinusT = 1.0D - t;

        consumer.xyzw(
                a.x() * oneMinusT + b.x() * t,
                a.y() * oneMinusT + b.y() * t,
                a.z() * oneMinusT + b.z() * t,
                a.w() * oneMinusT + b.w() * t
        );
    }

    public static <R> R lerp4(final double a, final Vector4.Accessible b, final double t, final Vector4.Factory<R> factory) {
        final double aOneMinusT = a * (1.0D - t);

        return factory.create(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t,
                aOneMinusT + b.w() * t
        );
    }

    public static void lerp4To(final double a, final Vector4.Accessible b, final double t, final Vector4.Consumer consumer) {
        final double aOneMinusT = a * (1.0D - t);

        consumer.xyzw(
                aOneMinusT + b.x() * t,
                aOneMinusT + b.y() * t,
                aOneMinusT + b.z() * t,
                aOneMinusT + b.w() * t
        );
    }

    public static <R> R lerp4(final Vector4.Accessible a, final double b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z()),
                lerp(a.w(), b, t.w())
        );
    }

    public static void lerp4To(final Vector4.Accessible a, final double b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a.x(), b, t.x()),
                lerp(a.y(), b, t.y()),
                lerp(a.z(), b, t.z()),
                lerp(a.w(), b, t.w())
        );
    }

    public static <R> R lerp4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z()),
                lerp(a.w(), b.w(), t.w())
        );
    }

    public static void lerp4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a.x(), b.x(), t.x()),
                lerp(a.y(), b.y(), t.y()),
                lerp(a.z(), b.z(), t.z()),
                lerp(a.w(), b.w(), t.w())
        );
    }

    public static <R> R lerp4(final double a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z()),
                lerp(a, b.w(), t.w())
        );
    }

    public static void lerp4To(final double a, final Vector4.Accessible b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a, b.x(), t.x()),
                lerp(a, b.y(), t.y()),
                lerp(a, b.z(), t.z()),
                lerp(a, b.w(), t.w())
        );
    }

    public static <R> R lerp4(final double a, final double b, final Vector4.Accessible t, final Vector4.Factory<R> factory) {
        return factory.create(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z()),
                lerp(a, b, t.w())
        );
    }

    public static void lerp4To(final double a, final double b, final Vector4.Accessible t, final Vector4.Consumer consumer) {
        consumer.xyzw(
                lerp(a, b, t.x()),
                lerp(a, b, t.y()),
                lerp(a, b, t.z()),
                lerp(a, b, t.w())
        );
    }

    public static <R> R neg4(final Vector4.Accessible vec, final Vector4.Factory<R> factory) {
        return factory.create(
                -vec.x(),
                -vec.y(),
                -vec.z(),
                -vec.w()
        );
    }

    public static void neg4To(final Vector4.Accessible vec, final Vector4.Consumer consumer) {
        consumer.xyzw(
                -vec.x(),
                -vec.y(),
                -vec.z(),
                -vec.w()
        );
    }

    public static <R> R add4(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() + b,
                a.y() + b,
                a.z() + b,
                a.w() + b
        );
    }

    public static void add4To(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() + b,
                a.y() + b,
                a.z() + b,
                a.w() + b
        );
    }

    public static <R> R add4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() + b.x(),
                a.y() + b.y(),
                a.z() + b.z(),
                a.w() + b.w()
        );
    }

    public static void add4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() + b.x(),
                a.y() + b.y(),
                a.z() + b.z(),
                a.w() + b.w()
        );
    }

    public static <R> R sub4(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() - b,
                a.y() - b,
                a.z() - b,
                a.w() - b
        );
    }

    public static void sub4To(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() - b,
                a.y() - b,
                a.z() - b,
                a.w() - b
        );
    }

    public static <R> R sub4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() - b.x(),
                a.y() - b.y(),
                a.z() - b.z(),
                a.w() - b.w()
        );
    }

    public static void sub4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() - b.x(),
                a.y() - b.y(),
                a.z() - b.z(),
                a.w() - b.w()
        );
    }

    public static <R> R sub4(final double a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                a - b.x(),
                a - b.y(),
                a - b.z(),
                a - b.w()
        );
    }

    public static void sub4To(final double a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a - b.x(),
                a - b.y(),
                a - b.z(),
                a - b.w()
        );
    }

    public static <R> R mul4(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() * b,
                a.y() * b,
                a.z() * b,
                a.w() * b
        );
    }

    public static void mul4To(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() * b,
                a.y() * b,
                a.z() * b,
                a.w() * b
        );
    }

    public static <R> R mul4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() * b.x(),
                a.y() * b.y(),
                a.z() * b.z(),
                a.w() * b.w()
        );
    }

    public static void mul4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() * b.x(),
                a.y() * b.y(),
                a.z() * b.z(),
                a.w() * b.w()
        );
    }

    public static <R> R div4(final Vector4.Accessible a, final double b, final Vector4.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.x() * inverseB,
                a.y() * inverseB,
                a.z() * inverseB,
                a.w() * inverseB
        );
    }

    public static void div4To(final Vector4.Accessible a, final double b, final Vector4.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.xyzw(
                a.x() * inverseB,
                a.y() * inverseB,
                a.z() * inverseB,
                a.w() * inverseB
        );
    }

    public static <R> R div4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() / b.x(),
                a.y() / b.y(),
                a.z() / b.z(),
                a.w() / b.w()
        );
    }

    public static void div4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() / b.x(),
                a.y() / b.y(),
                a.z() / b.z(),
                a.w() / b.w()
        );
    }

    public static <R> R div4(final double a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
        return factory.create(
                a / b.x(),
                a / b.y(),
                a / b.z(),
                a / b.w()
        );
    }

    public static void div4To(final double a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a / b.x(),
                a / b.y(),
                a / b.z(),
                a / b.w()
        );
    }

    public static <R> R fma4(final Vector4.Accessible a, final double b, final double c, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() * b + c,
                a.y() * b + c,
                a.z() * b + c,
                a.w() * b + c
        );
    }

    public static void fma4To(final Vector4.Accessible a, final double b, final double c, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() * b + c,
                a.y() * b + c,
                a.z() * b + c,
                a.w() * b + c
        );
    }

    public static <R> R fma4(final Vector4.Accessible a, final Vector4.Accessible b, final double c, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() * b.x() + c,
                a.y() * b.y() + c,
                a.z() * b.z() + c,
                a.w() * b.w() + c
        );
    }

    public static void fma4To(final Vector4.Accessible a, final Vector4.Accessible b, final double c, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() * b.x() + c,
                a.y() * b.y() + c,
                a.z() * b.z() + c,
                a.w() * b.w() + c
        );
    }

    public static <R> R fma4(final Vector4.Accessible a, final double b, final Vector4.Accessible c, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() * b + c.x(),
                a.y() * b + c.y(),
                a.z() * b + c.z(),
                a.w() * b + c.w()
        );
    }

    public static void fma4To(final Vector4.Accessible a, final double b, final Vector4.Accessible c, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() * b + c.x(),
                a.y() * b + c.y(),
                a.z() * b + c.z(),
                a.w() * b + c.w()
        );
    }

    public static <R> R fma4(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Accessible c, final Vector4.Factory<R> factory) {
        return factory.create(
                a.x() * b.x() + c.x(),
                a.y() * b.y() + c.y(),
                a.z() * b.z() + c.z(),
                a.w() * b.w() + c.w()
        );
    }

    public static void fma4To(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Accessible c, final Vector4.Consumer consumer) {
        consumer.xyzw(
                a.x() * b.x() + c.x(),
                a.y() * b.y() + c.y(),
                a.z() * b.z() + c.z(),
                a.w() * b.w() + c.w()
        );
    }

    public static <R> R pow4(final Vector4.Accessible base, final double exp, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exp),
                Math.pow(base.y(), exp),
                Math.pow(base.z(), exp),
                Math.pow(base.w(), exp)
        );
    }

    public static void pow4To(final Vector4.Accessible base, final double exp, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.pow(base.x(), exp),
                Math.pow(base.y(), exp),
                Math.pow(base.z(), exp),
                Math.pow(base.w(), exp)
        );
    }

    public static <R> R pow4(final Vector4.Accessible base, final Vector4.Accessible exp, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.pow(base.x(), exp.x()),
                Math.pow(base.y(), exp.y()),
                Math.pow(base.z(), exp.z()),
                Math.pow(base.w(), exp.w())
        );
    }

    public static void pow4To(final Vector4.Accessible base, final Vector4.Accessible exp, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.pow(base.x(), exp.x()),
                Math.pow(base.y(), exp.y()),
                Math.pow(base.z(), exp.z()),
                Math.pow(base.w(), exp.w())
        );
    }

    public static <R> R pow4(final double base, final Vector4.Accessible exp, final Vector4.Factory<R> factory) {
        return factory.create(
                Math.pow(base, exp.x()),
                Math.pow(base, exp.y()),
                Math.pow(base, exp.z()),
                Math.pow(base, exp.w())
        );
    }

    public static void pow4To(final double base, final Vector4.Accessible exp, final Vector4.Consumer consumer) {
        consumer.xyzw(
                Math.pow(base, exp.x()),
                Math.pow(base, exp.y()),
                Math.pow(base, exp.z()),
                Math.pow(base, exp.w())
        );
    }

    public static double squaredLength4(final Vector4.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();
        final double w = vec.w();

        return x * x + y * y + z * z + w * w;
    }

    public static double squaredDistance4(final Vector4.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        final double w = a.w() - b;

        return x * x + y * y + z * z + w * w;
    }

    public static double squaredDistance4(final Vector4.Accessible a, final Vector4.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        final double w = a.w() - b.w();

        return x * x + y * y + z * z + w * w;
    }

    public static double length4(final Vector4.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();
        final double w = vec.w();

        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double distance4(final Vector4.Accessible a, final double b) {
        final double x = a.x() - b;
        final double y = a.y() - b;
        final double z = a.z() - b;
        final double w = a.w() - b;

        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double distance4(final Vector4.Accessible a, final Vector4.Accessible b) {
        final double x = a.x() - b.x();
        final double y = a.y() - b.y();
        final double z = a.z() - b.z();
        final double w = a.w() - b.w();

        return Math.sqrt(x * x + y * y + z * z + w * w);
    }

    public static double dot4(final Vector4.Accessible vec) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();
        final double w = vec.w();

        return x * x + y * y + z * z + w * w;
    }

    public static double dot4(final Vector4.Accessible a, final double b) {
        return a.x() * b + a.y() * b + a.z() * b + a.w() * b;
    }

    public static double dot4(final Vector4.Accessible a, final Vector4.Accessible b) {
        return a.x() * b.x() + a.y() * b.y() + a.z() * b.z() + a.w() * b.w();
    }

    public static <R> R normalize4(final Vector4.Accessible vec, final Vector4.Factory<R> factory) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();
        final double w = vec.w();

        final double length = Math.sqrt(x * x + y * y + z * z + w * w);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        return factory.create(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength,
                w * inverseLength
        );
    }

    public static void normalize4To(final Vector4.Accessible vec, final Vector4.Consumer consumer) {
        final double x = vec.x();
        final double y = vec.y();
        final double z = vec.z();
        final double w = vec.w();

        final double length = Math.sqrt(x * x + y * y + z * z + w * w);
        final double inverseLength = 1.0D / (length > 0.0D ? length : 1.0D);

        consumer.xyzw(
                x * inverseLength,
                y * inverseLength,
                z * inverseLength,
                w * inverseLength
        );
    }

    public static <R> R reflect4(final Vector4.Accessible incident, final Vector4.Accessible normal, final Vector4.Factory<R> factory) {
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

    public static void reflect4To(final Vector4.Accessible incident, final Vector4.Accessible normal, final Vector4.Consumer consumer) {
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

    public static <R> R refract4(final Vector4.Accessible incident, final Vector4.Accessible normal, final double eta, final Vector4.Factory<R> factory) {
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

    public static void refract4To(final Vector4.Accessible incident, final Vector4.Accessible normal, final double eta, final Vector4.Consumer consumer) {
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

    public static <R> R asMatrix2x2(final double angle, final Matrix2x2.Factory<R> factory) {
        final double cos = Math.cos(angle);
        final double sin = Math.sin(angle);

        return factory.create(
                cos,
                sin,
                -sin,
                cos
        );
    }

    public static void asMatrix2x2To(final double angle, final Matrix2x2.Consumer consumer) {
        final double cos = Math.cos(angle);
        final double sin = Math.sin(angle);

        consumer.XYxy(
                cos,
                sin,
                -sin,
                cos
        );
    }

    public static <R> R neg2x2(final Matrix2x2.Accessible mat, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Yx(),
                -mat.Yy()
        );
    }

    public static void neg2x2To(final Matrix2x2.Accessible mat, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Yx(),
                -mat.Yy()
        );
    }

    public static <R> R add2x2(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Yx() + b,
                a.Yy() + b
        );
    }

    public static void add2x2To(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() + b,
                a.Xy() + b,
                a.Yx() + b,
                a.Yy() + b
        );
    }

    public static <R> R add2x2(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy()
        );
    }

    public static void add2x2To(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy()
        );
    }

    public static <R> R sub2x2(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Yx() - b,
                a.Yy() - b
        );
    }

    public static void sub2x2To(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() - b,
                a.Xy() - b,
                a.Yx() - b,
                a.Yy() - b
        );
    }

    public static <R> R sub2x2(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy()
        );
    }

    public static void sub2x2To(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy()
        );
    }

    public static <R> R sub2x2(final double a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Yx(),
                a - b.Yy()
        );
    }

    public static void sub2x2To(final double a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Yx(),
                a - b.Yy()
        );
    }

    public static <R> R mul2x2(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Yx() * b,
                a.Yy() * b
        );
    }

    public static void mul2x2To(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() * b,
                a.Xy() * b,
                a.Yx() * b,
                a.Yy() * b
        );
    }

    public static <R> R mul2x2(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy()
        );
    }

    public static void mul2x2To(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy()
        );
    }

    public static <R> R div2x2(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB
        );
    }

    public static void div2x2To(final Matrix2x2.Accessible a, final double b, final Matrix2x2.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYxy(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB
        );
    }

    public static <R> R div2x2(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy()
        );
    }

    public static void div2x2To(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy()
        );
    }

    public static <R> R div2x2(final double a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Yx(),
                a / b.Yy()
        );
    }

    public static void div2x2To(final double a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
        consumer.XYxy(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Yx(),
                a / b.Yy()
        );
    }

    public static <R> R matrixInverse2x2(final Matrix2x2.Accessible matrix, final Matrix2x2.Factory<R> factory) {
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

    public static void matrixInverse2x2To(final Matrix2x2.Accessible matrix, final Matrix2x2.Consumer consumer) {
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

    public static <R> R matrixProduct2x2(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Factory<R> factory) {
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

    public static void matrixProduct2x2To(final Matrix2x2.Accessible a, final Matrix2x2.Accessible b, final Matrix2x2.Consumer consumer) {
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

    public static <R> R matrixProduct2x2And3x2(final Matrix2x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aYx = a.Yx();
        final double aYy = a.Yy();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bZx = b.Zx();
        final double bZy = b.Zy();

        return factory.create(
                aXx * bXx + aYx * bXy,
                aXy * bXx + aYy * bXy,
                aXx * bYx + aYx * bYy,
                aXy * bYx + aYy * bYy,
                aXx * bZx + aYx * bZy,
                aXy * bZx + aYy * bZy
        );
    }

    public static void matrixProduct2x2And3x2To(final Matrix2x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aYx = a.Yx();
        final double aYy = a.Yy();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bZx = b.Zx();
        final double bZy = b.Zy();

        consumer.XYZxy(
                aXx * bXx + aYx * bXy,
                aXy * bXx + aYy * bXy,
                aXx * bYx + aYx * bYy,
                aXy * bYx + aYy * bYy,
                aXx * bZx + aYx * bZy,
                aXy * bZx + aYy * bZy
        );
    }

    public static <R> R matrixProduct2x2And2(final Matrix2x2.Accessible m, final Vector2.Accessible v, final Vector2.Factory<R> factory) {
        final double x = v.x();
        final double y = v.y();

        return factory.create(
                m.Xx() * x + m.Yx() * y,
                m.Xy() * x + m.Yy() * y
        );
    }

    public static void matrixProduct2x2And2To(final Matrix2x2.Accessible m, final Vector2.Accessible v, final Vector2.Consumer consumer) {
        final double x = v.x();
        final double y = v.y();

        consumer.xy(
                m.Xx() * x + m.Yx() * y,
                m.Xy() * x + m.Yy() * y
        );
    }

    public static <R> R neg2x3(final Matrix2x3.Accessible mat, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz()
        );
    }

    public static void neg2x3To(final Matrix2x3.Accessible mat, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz()
        );
    }

    public static <R> R add2x3(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b
        );
    }

    public static void add2x3To(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b
        );
    }

    public static <R> R add2x3(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz()
        );
    }

    public static void add2x3To(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz()
        );
    }

    public static <R> R sub2x3(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b
        );
    }

    public static void sub2x3To(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b
        );
    }

    public static <R> R sub2x3(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz()
        );
    }

    public static void sub2x3To(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz()
        );
    }

    public static <R> R sub2x3(final double a, final Matrix2x3.Accessible b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz()
        );
    }

    public static void sub2x3To(final double a, final Matrix2x3.Accessible b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz()
        );
    }

    public static <R> R mul2x3(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b
        );
    }

    public static void mul2x3To(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b
        );
    }

    public static <R> R mul2x3(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz()
        );
    }

    public static void mul2x3To(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz()
        );
    }

    public static <R> R div2x3(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB
        );
    }

    public static void div2x3To(final Matrix2x3.Accessible a, final double b, final Matrix2x3.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYxyz(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB
        );
    }

    public static <R> R div2x3(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz()
        );
    }

    public static void div2x3To(final Matrix2x3.Accessible a, final Matrix2x3.Accessible b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz()
        );
    }

    public static <R> R div2x3(final double a, final Matrix2x3.Accessible b, final Matrix2x3.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz()
        );
    }

    public static void div2x3To(final double a, final Matrix2x3.Accessible b, final Matrix2x3.Consumer consumer) {
        consumer.XYxyz(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz()
        );
    }

    public static <R> R matrixProduct2x3And2x2(final Matrix2x3.Accessible a, final Matrix2x2.Accessible b, final Matrix2x3.Factory<R> factory) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aXz = a.Xz();
        final double aYx = a.Yx();
        final double aYy = a.Yy();
        final double aYz = a.Yz();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bYx = b.Yx();
        final double bYy = b.Yy();

        return factory.create(
                aXx * bXx + aYx * bXy,
                aXy * bXx + aYy * bXy,
                aXz * bXx + aYz * bXy,
                aXx * bYx + aYx * bYy,
                aXy * bYx + aYy * bYy,
                aXz * bYx + aYz * bYy
        );
    }

    public static void matrixProduct2x3And2x2To(final Matrix2x3.Accessible a, final Matrix2x2.Accessible b, final Matrix2x3.Consumer consumer) {
        final double aXx = a.Xx();
        final double aXy = a.Xy();
        final double aXz = a.Xz();
        final double aYx = a.Yx();
        final double aYy = a.Yy();
        final double aYz = a.Yz();

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bYx = b.Yx();
        final double bYy = b.Yy();

        consumer.XYxyz(
                aXx * bXx + aYx * bXy,
                aXy * bXx + aYy * bXy,
                aXz * bXx + aYz * bXy,
                aXx * bYx + aYx * bYy,
                aXy * bYx + aYy * bYy,
                aXz * bYx + aYz * bYy
        );
    }

    public static <R> R neg3x2(final Matrix3x2.Accessible mat, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Zx(),
                -mat.Zy()
        );
    }

    public static void neg3x2To(final Matrix3x2.Accessible mat, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Zx(),
                -mat.Zy()
        );
    }

    public static <R> R add3x2(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Zx() + b,
                a.Zy() + b
        );
    }

    public static void add3x2To(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() + b,
                a.Xy() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Zx() + b,
                a.Zy() + b
        );
    }

    public static <R> R add3x2(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy()
        );
    }

    public static void add3x2To(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy()
        );
    }

    public static <R> R sub3x2(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Zx() - b,
                a.Zy() - b
        );
    }

    public static void sub3x2To(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() - b,
                a.Xy() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Zx() - b,
                a.Zy() - b
        );
    }

    public static <R> R sub3x2(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy()
        );
    }

    public static void sub3x2To(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy()
        );
    }

    public static <R> R sub3x2(final double a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Zx(),
                a - b.Zy()
        );
    }

    public static void sub3x2To(final double a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Zx(),
                a - b.Zy()
        );
    }

    public static <R> R mul3x2(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Zx() * b,
                a.Zy() * b
        );
    }

    public static void mul3x2To(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() * b,
                a.Xy() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Zx() * b,
                a.Zy() * b
        );
    }

    public static <R> R mul3x2(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy()
        );
    }

    public static void mul3x2To(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy()
        );
    }

    public static <R> R div3x2(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB
        );
    }

    public static void div3x2To(final Matrix3x2.Accessible a, final double b, final Matrix3x2.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYZxy(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB
        );
    }

    public static <R> R div3x2(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy()
        );
    }

    public static void div3x2To(final Matrix3x2.Accessible a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy()
        );
    }

    public static <R> R div3x2(final double a, final Matrix3x2.Accessible b, final Matrix3x2.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Zx(),
                a / b.Zy()
        );
    }

    public static void div3x2To(final double a, final Matrix3x2.Accessible b, final Matrix3x2.Consumer consumer) {
        consumer.XYZxy(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Zx(),
                a / b.Zy()
        );
    }

    public static <R> R matrixTransform2By3x2(final Matrix3x2.Accessible m, final Vector2.Accessible p, final Vector2.Factory<R> factory) {
        final double x = p.x();
        final double y = p.y();

        return factory.create(
                m.Xx() * x + m.Yx() * y + m.Zx(),
                m.Xy() * x + m.Yy() * y + m.Zy()
        );
    }

    public static void matrixTransform2By3x2To(final Matrix3x2.Accessible m, final Vector2.Accessible p, final Vector2.Consumer consumer) {
        final double x = p.x();
        final double y = p.y();

        consumer.xy(
                m.Xx() * x + m.Yx() * y + m.Zx(),
                m.Xy() * x + m.Yy() * y + m.Zy()
        );
    }

    public static <R> R asMatrix3x3(final Vector3.Accessible axis, final double angle, final Matrix3x3.Factory<R> factory) {
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

    public static void asMatrix3x3To(final Vector3.Accessible axis, final double angle, final Matrix3x3.Consumer consumer) {
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

    public static <R> R asMatrix3x3(final Vector4.Accessible quat, final Matrix3x3.Factory<R> factory) {
        final double x = quat.x();
        final double y = quat.y();
        final double z = quat.z();
        final double w = quat.w();

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

    public static void asMatrix3x3To(final Vector4.Accessible quat, final Matrix3x3.Consumer consumer) {
        final double x = quat.x();
        final double y = quat.y();
        final double z = quat.z();
        final double w = quat.w();

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

    public static <R> R neg3x3(final Matrix3x3.Accessible mat, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz()
        );
    }

    public static void neg3x3To(final Matrix3x3.Accessible mat, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz()
        );
    }

    public static <R> R add3x3(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b
        );
    }

    public static void add3x3To(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b
        );
    }

    public static <R> R add3x3(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz()
        );
    }

    public static void add3x3To(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz()
        );
    }

    public static <R> R sub3x3(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b
        );
    }

    public static void sub3x3To(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b
        );
    }

    public static <R> R sub3x3(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz()
        );
    }

    public static void sub3x3To(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz()
        );
    }

    public static <R> R sub3x3(final double a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz()
        );
    }

    public static void sub3x3To(final double a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz()
        );
    }

    public static <R> R mul3x3(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b
        );
    }

    public static void mul3x3To(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b
        );
    }

    public static <R> R mul3x3(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz()
        );
    }

    public static void mul3x3To(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz()
        );
    }

    public static <R> R div3x3(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB
        );
    }

    public static void div3x3To(final Matrix3x3.Accessible a, final double b, final Matrix3x3.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYZxyz(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB
        );
    }

    public static <R> R div3x3(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz()
        );
    }

    public static void div3x3To(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz()
        );
    }

    public static <R> R div3x3(final double a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz()
        );
    }

    public static void div3x3To(final double a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
        consumer.XYZxyz(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz()
        );
    }

    public static <R> R matrixInverse3x3(final Matrix3x3.Accessible matrix, final Matrix3x3.Factory<R> factory) {
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

    public static void matrixInverse3x3To(final Matrix3x3.Accessible matrix, final Matrix3x3.Consumer consumer) {
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

    public static <R> R matrixProduct3x3(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Factory<R> factory) {
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

    public static void matrixProduct3x3To(final Matrix3x3.Accessible a, final Matrix3x3.Accessible b, final Matrix3x3.Consumer consumer) {
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

    public static <R> R matrixProduct3x3And4x3(final Matrix3x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
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
        final double bTx = b.Tx();
        final double bTy = b.Ty();
        final double bTz = b.Tz();

        return factory.create(
                aXx * bXx + aYx * bXy + aZx * bXz,
                aXy * bXx + aYy * bXy + aZy * bXz,
                aXz * bXx + aYz * bXy + aZz * bXz,
                aXx * bYx + aYx * bYy + aZx * bYz,
                aXy * bYx + aYy * bYy + aZy * bYz,
                aXz * bYx + aYz * bYy + aZz * bYz,
                aXx * bZx + aYx * bZy + aZx * bZz,
                aXy * bZx + aYy * bZy + aZy * bZz,
                aXz * bZx + aYz * bZy + aZz * bZz,
                aXx * bTx + aYx * bTy + aZx * bTz,
                aXy * bTx + aYy * bTy + aZy * bTz,
                aXz * bTx + aYz * bTy + aZz * bTz
        );
    }

    public static void matrixProduct3x3And4x3To(final Matrix3x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
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
        final double bTx = b.Tx();
        final double bTy = b.Ty();
        final double bTz = b.Tz();

        consumer.XYZTxyz(
                aXx * bXx + aYx * bXy + aZx * bXz,
                aXy * bXx + aYy * bXy + aZy * bXz,
                aXz * bXx + aYz * bXy + aZz * bXz,
                aXx * bYx + aYx * bYy + aZx * bYz,
                aXy * bYx + aYy * bYy + aZy * bYz,
                aXz * bYx + aYz * bYy + aZz * bYz,
                aXx * bZx + aYx * bZy + aZx * bZz,
                aXy * bZx + aYy * bZy + aZy * bZz,
                aXz * bZx + aYz * bZy + aZz * bZz,
                aXx * bTx + aYx * bTy + aZx * bTz,
                aXy * bTx + aYy * bTy + aZy * bTz,
                aXz * bTx + aYz * bTy + aZz * bTz
        );
    }

    public static <R> R matrixProduct3x3And3(final Matrix3x3.Accessible m, final Vector3.Accessible v, final Vector3.Factory<R> factory) {
        final double x = v.x();
        final double y = v.y();
        final double z = v.z();

        return factory.create(
                m.Xx() * x + m.Yx() * y + m.Zx() * z,
                m.Xy() * x + m.Yy() * y + m.Zy() * z,
                m.Xz() * x + m.Yz() * y + m.Zz() * z
        );
    }

    public static void matrixProduct3x3And3To(final Matrix3x3.Accessible m, final Vector3.Accessible v, final Vector3.Consumer consumer) {
        final double x = v.x();
        final double y = v.y();
        final double z = v.z();

        consumer.xyz(
                m.Xx() * x + m.Yx() * y + m.Zx() * z,
                m.Xy() * x + m.Yy() * y + m.Zy() * z,
                m.Xz() * x + m.Yz() * y + m.Zz() * z
        );
    }

    public static <R> R matrixProject2By3x3(final Matrix3x3.Accessible m, final Vector2.Accessible p, final Vector2.Factory<R> factory) {
        final double x = p.x();
        final double y = p.y();

        final double inverseDivisor = 1.0D / (m.Xz() * x + m.Yz() * y + m.Zz());

        return factory.create(
                (m.Xx() * x + m.Yx() * y + m.Zx()) * inverseDivisor,
                (m.Xy() * x + m.Yy() * y + m.Zy()) * inverseDivisor
        );
    }

    public static void matrixProject2By3x3To(final Matrix3x3.Accessible m, final Vector2.Accessible p, final Vector2.Consumer consumer) {
        final double x = p.x();
        final double y = p.y();

        final double inverseDivisor = 1.0D / (m.Xz() * x + m.Yz() * y + m.Zz());

        consumer.xy(
                (m.Xx() * x + m.Yx() * y + m.Zx()) * inverseDivisor,
                (m.Xy() * x + m.Yy() * y + m.Zy()) * inverseDivisor
        );
    }

    public static <R> R neg3x4(final Matrix3x4.Accessible mat, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Xw(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Yw(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz(),
                -mat.Zw()
        );
    }

    public static void neg3x4To(final Matrix3x4.Accessible mat, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Xw(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Yw(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz(),
                -mat.Zw()
        );
    }

    public static <R> R add3x4(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Xw() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Yw() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b,
                a.Zw() + b
        );
    }

    public static void add3x4To(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Xw() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Yw() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b,
                a.Zw() + b
        );
    }

    public static <R> R add3x4(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Xw() + b.Xw(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Yw() + b.Yw(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz(),
                a.Zw() + b.Zw()
        );
    }

    public static void add3x4To(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Xw() + b.Xw(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Yw() + b.Yw(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz(),
                a.Zw() + b.Zw()
        );
    }

    public static <R> R sub3x4(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Xw() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Yw() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b,
                a.Zw() - b
        );
    }

    public static void sub3x4To(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Xw() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Yw() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b,
                a.Zw() - b
        );
    }

    public static <R> R sub3x4(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Xw() - b.Xw(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Yw() - b.Yw(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz(),
                a.Zw() - b.Zw()
        );
    }

    public static void sub3x4To(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Xw() - b.Xw(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Yw() - b.Yw(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz(),
                a.Zw() - b.Zw()
        );
    }

    public static <R> R sub3x4(final double a, final Matrix3x4.Accessible b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Xw(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Yw(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz(),
                a - b.Zw()
        );
    }

    public static void sub3x4To(final double a, final Matrix3x4.Accessible b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Xw(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Yw(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz(),
                a - b.Zw()
        );
    }

    public static <R> R mul3x4(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Xw() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Yw() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b,
                a.Zw() * b
        );
    }

    public static void mul3x4To(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Xw() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Yw() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b,
                a.Zw() * b
        );
    }

    public static <R> R mul3x4(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Xw() * b.Xw(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Yw() * b.Yw(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz(),
                a.Zw() * b.Zw()
        );
    }

    public static void mul3x4To(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Xw() * b.Xw(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Yw() * b.Yw(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz(),
                a.Zw() * b.Zw()
        );
    }

    public static <R> R div3x4(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Xw() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Yw() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB,
                a.Zw() * inverseB
        );
    }

    public static void div3x4To(final Matrix3x4.Accessible a, final double b, final Matrix3x4.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYZxyzw(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Xw() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Yw() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB,
                a.Zw() * inverseB
        );
    }

    public static <R> R div3x4(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Xw() / b.Xw(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Yw() / b.Yw(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz(),
                a.Zw() / b.Zw()
        );
    }

    public static void div3x4To(final Matrix3x4.Accessible a, final Matrix3x4.Accessible b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Xw() / b.Xw(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Yw() / b.Yw(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz(),
                a.Zw() / b.Zw()
        );
    }

    public static <R> R div3x4(final double a, final Matrix3x4.Accessible b, final Matrix3x4.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Xw(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Yw(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz(),
                a / b.Zw()
        );
    }

    public static void div3x4To(final double a, final Matrix3x4.Accessible b, final Matrix3x4.Consumer consumer) {
        consumer.XYZxyzw(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Xw(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Yw(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz(),
                a / b.Zw()
        );
    }

    public static <R> R matrixProduct3x4And3x3(final Matrix3x4.Accessible a, final Matrix3x3.Accessible b, final Matrix3x4.Factory<R> factory) {
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
                aXw * bXx + aYw * bXy + aZw * bXz,
                aXx * bYx + aYx * bYy + aZx * bYz,
                aXy * bYx + aYy * bYy + aZy * bYz,
                aXz * bYx + aYz * bYy + aZz * bYz,
                aXw * bYx + aYw * bYy + aZw * bYz,
                aXx * bZx + aYx * bZy + aZx * bZz,
                aXy * bZx + aYy * bZy + aZy * bZz,
                aXz * bZx + aYz * bZy + aZz * bZz,
                aXw * bZx + aYw * bZy + aZw * bZz
        );
    }

    public static void matrixProduct3x4And3x3To(final Matrix3x4.Accessible a, final Matrix3x3.Accessible b, final Matrix3x4.Consumer consumer) {
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

        final double bXx = b.Xx();
        final double bXy = b.Xy();
        final double bXz = b.Xz();
        final double bYx = b.Yx();
        final double bYy = b.Yy();
        final double bYz = b.Yz();
        final double bZx = b.Zx();
        final double bZy = b.Zy();
        final double bZz = b.Zz();

        consumer.XYZxyzw(
                aXx * bXx + aYx * bXy + aZx * bXz,
                aXy * bXx + aYy * bXy + aZy * bXz,
                aXz * bXx + aYz * bXy + aZz * bXz,
                aXw * bXx + aYw * bXy + aZw * bXz,
                aXx * bYx + aYx * bYy + aZx * bYz,
                aXy * bYx + aYy * bYy + aZy * bYz,
                aXz * bYx + aYz * bYy + aZz * bYz,
                aXw * bYx + aYw * bYy + aZw * bYz,
                aXx * bZx + aYx * bZy + aZx * bZz,
                aXy * bZx + aYy * bZy + aZy * bZz,
                aXz * bZx + aYz * bZy + aZz * bZz,
                aXw * bZx + aYw * bZy + aZw * bZz
        );
    }

    public static <R> R neg4x3(final Matrix4x3.Accessible mat, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz(),
                -mat.Tx(),
                -mat.Ty(),
                -mat.Tz()
        );
    }

    public static void neg4x3To(final Matrix4x3.Accessible mat, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz(),
                -mat.Tx(),
                -mat.Ty(),
                -mat.Tz()
        );
    }

    public static <R> R add4x3(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b,
                a.Tx() + b,
                a.Ty() + b,
                a.Tz() + b
        );
    }

    public static void add4x3To(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b,
                a.Tx() + b,
                a.Ty() + b,
                a.Tz() + b
        );
    }

    public static <R> R add4x3(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz(),
                a.Tx() + b.Tx(),
                a.Ty() + b.Ty(),
                a.Tz() + b.Tz()
        );
    }

    public static void add4x3To(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz(),
                a.Tx() + b.Tx(),
                a.Ty() + b.Ty(),
                a.Tz() + b.Tz()
        );
    }

    public static <R> R sub4x3(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b,
                a.Tx() - b,
                a.Ty() - b,
                a.Tz() - b
        );
    }

    public static void sub4x3To(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b,
                a.Tx() - b,
                a.Ty() - b,
                a.Tz() - b
        );
    }

    public static <R> R sub4x3(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz(),
                a.Tx() - b.Tx(),
                a.Ty() - b.Ty(),
                a.Tz() - b.Tz()
        );
    }

    public static void sub4x3To(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz(),
                a.Tx() - b.Tx(),
                a.Ty() - b.Ty(),
                a.Tz() - b.Tz()
        );
    }

    public static <R> R sub4x3(final double a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz(),
                a - b.Tx(),
                a - b.Ty(),
                a - b.Tz()
        );
    }

    public static void sub4x3To(final double a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz(),
                a - b.Tx(),
                a - b.Ty(),
                a - b.Tz()
        );
    }

    public static <R> R mul4x3(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b,
                a.Tx() * b,
                a.Ty() * b,
                a.Tz() * b
        );
    }

    public static void mul4x3To(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b,
                a.Tx() * b,
                a.Ty() * b,
                a.Tz() * b
        );
    }

    public static <R> R mul4x3(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz(),
                a.Tx() * b.Tx(),
                a.Ty() * b.Ty(),
                a.Tz() * b.Tz()
        );
    }

    public static void mul4x3To(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz(),
                a.Tx() * b.Tx(),
                a.Ty() * b.Ty(),
                a.Tz() * b.Tz()
        );
    }

    public static <R> R div4x3(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB,
                a.Tx() * inverseB,
                a.Ty() * inverseB,
                a.Tz() * inverseB
        );
    }

    public static void div4x3To(final Matrix4x3.Accessible a, final double b, final Matrix4x3.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYZTxyz(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB,
                a.Tx() * inverseB,
                a.Ty() * inverseB,
                a.Tz() * inverseB
        );
    }

    public static <R> R div4x3(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz(),
                a.Tx() / b.Tx(),
                a.Ty() / b.Ty(),
                a.Tz() / b.Tz()
        );
    }

    public static void div4x3To(final Matrix4x3.Accessible a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz(),
                a.Tx() / b.Tx(),
                a.Ty() / b.Ty(),
                a.Tz() / b.Tz()
        );
    }

    public static <R> R div4x3(final double a, final Matrix4x3.Accessible b, final Matrix4x3.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz(),
                a / b.Tx(),
                a / b.Ty(),
                a / b.Tz()
        );
    }

    public static void div4x3To(final double a, final Matrix4x3.Accessible b, final Matrix4x3.Consumer consumer) {
        consumer.XYZTxyz(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz(),
                a / b.Tx(),
                a / b.Ty(),
                a / b.Tz()
        );
    }

    public static <R> R matrixTransform3By4x3(final Matrix4x3.Accessible m, final Vector3.Accessible p, final Vector3.Factory<R> factory) {
        final double x = p.x();
        final double y = p.y();
        final double z = p.z();

        return factory.create(
                m.Xx() * x + m.Yx() * y + m.Zx() * z + m.Tx(),
                m.Xy() * x + m.Yy() * y + m.Zy() * z + m.Ty(),
                m.Xz() * x + m.Yz() * y + m.Zz() * z + m.Tz()
        );
    }

    public static void matrixTransform3By4x3To(final Matrix4x3.Accessible m, final Vector3.Accessible p, final Vector3.Consumer consumer) {
        final double x = p.x();
        final double y = p.y();
        final double z = p.z();

        consumer.xyz(
                m.Xx() * x + m.Yx() * y + m.Zx() * z + m.Tx(),
                m.Xy() * x + m.Yy() * y + m.Zy() * z + m.Ty(),
                m.Xz() * x + m.Yz() * y + m.Zz() * z + m.Tz()
        );
    }

    public static <R> R neg4x4(final Matrix4x4.Accessible mat, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Xw(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Yw(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz(),
                -mat.Zw(),
                -mat.Tx(),
                -mat.Ty(),
                -mat.Tz(),
                -mat.Tw()
        );
    }

    public static void neg4x4To(final Matrix4x4.Accessible mat, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                -mat.Xx(),
                -mat.Xy(),
                -mat.Xz(),
                -mat.Xw(),
                -mat.Yx(),
                -mat.Yy(),
                -mat.Yz(),
                -mat.Yw(),
                -mat.Zx(),
                -mat.Zy(),
                -mat.Zz(),
                -mat.Zw(),
                -mat.Tx(),
                -mat.Ty(),
                -mat.Tz(),
                -mat.Tw()
        );
    }

    public static <R> R add4x4(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Xw() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Yw() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b,
                a.Zw() + b,
                a.Tx() + b,
                a.Ty() + b,
                a.Tz() + b,
                a.Tw() + b
        );
    }

    public static void add4x4To(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() + b,
                a.Xy() + b,
                a.Xz() + b,
                a.Xw() + b,
                a.Yx() + b,
                a.Yy() + b,
                a.Yz() + b,
                a.Yw() + b,
                a.Zx() + b,
                a.Zy() + b,
                a.Zz() + b,
                a.Zw() + b,
                a.Tx() + b,
                a.Ty() + b,
                a.Tz() + b,
                a.Tw() + b
        );
    }

    public static <R> R add4x4(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Xw() + b.Xw(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Yw() + b.Yw(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz(),
                a.Zw() + b.Zw(),
                a.Tx() + b.Tx(),
                a.Ty() + b.Ty(),
                a.Tz() + b.Tz(),
                a.Tw() + b.Tw()
        );
    }

    public static void add4x4To(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() + b.Xx(),
                a.Xy() + b.Xy(),
                a.Xz() + b.Xz(),
                a.Xw() + b.Xw(),
                a.Yx() + b.Yx(),
                a.Yy() + b.Yy(),
                a.Yz() + b.Yz(),
                a.Yw() + b.Yw(),
                a.Zx() + b.Zx(),
                a.Zy() + b.Zy(),
                a.Zz() + b.Zz(),
                a.Zw() + b.Zw(),
                a.Tx() + b.Tx(),
                a.Ty() + b.Ty(),
                a.Tz() + b.Tz(),
                a.Tw() + b.Tw()
        );
    }

    public static <R> R sub4x4(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Xw() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Yw() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b,
                a.Zw() - b,
                a.Tx() - b,
                a.Ty() - b,
                a.Tz() - b,
                a.Tw() - b
        );
    }

    public static void sub4x4To(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() - b,
                a.Xy() - b,
                a.Xz() - b,
                a.Xw() - b,
                a.Yx() - b,
                a.Yy() - b,
                a.Yz() - b,
                a.Yw() - b,
                a.Zx() - b,
                a.Zy() - b,
                a.Zz() - b,
                a.Zw() - b,
                a.Tx() - b,
                a.Ty() - b,
                a.Tz() - b,
                a.Tw() - b
        );
    }

    public static <R> R sub4x4(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Xw() - b.Xw(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Yw() - b.Yw(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz(),
                a.Zw() - b.Zw(),
                a.Tx() - b.Tx(),
                a.Ty() - b.Ty(),
                a.Tz() - b.Tz(),
                a.Tw() - b.Tw()
        );
    }

    public static void sub4x4To(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() - b.Xx(),
                a.Xy() - b.Xy(),
                a.Xz() - b.Xz(),
                a.Xw() - b.Xw(),
                a.Yx() - b.Yx(),
                a.Yy() - b.Yy(),
                a.Yz() - b.Yz(),
                a.Yw() - b.Yw(),
                a.Zx() - b.Zx(),
                a.Zy() - b.Zy(),
                a.Zz() - b.Zz(),
                a.Zw() - b.Zw(),
                a.Tx() - b.Tx(),
                a.Ty() - b.Ty(),
                a.Tz() - b.Tz(),
                a.Tw() - b.Tw()
        );
    }

    public static <R> R sub4x4(final double a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Xw(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Yw(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz(),
                a - b.Zw(),
                a - b.Tx(),
                a - b.Ty(),
                a - b.Tz(),
                a - b.Tw()
        );
    }

    public static void sub4x4To(final double a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a - b.Xx(),
                a - b.Xy(),
                a - b.Xz(),
                a - b.Xw(),
                a - b.Yx(),
                a - b.Yy(),
                a - b.Yz(),
                a - b.Yw(),
                a - b.Zx(),
                a - b.Zy(),
                a - b.Zz(),
                a - b.Zw(),
                a - b.Tx(),
                a - b.Ty(),
                a - b.Tz(),
                a - b.Tw()
        );
    }

    public static <R> R mul4x4(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Xw() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Yw() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b,
                a.Zw() * b,
                a.Tx() * b,
                a.Ty() * b,
                a.Tz() * b,
                a.Tw() * b
        );
    }

    public static void mul4x4To(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() * b,
                a.Xy() * b,
                a.Xz() * b,
                a.Xw() * b,
                a.Yx() * b,
                a.Yy() * b,
                a.Yz() * b,
                a.Yw() * b,
                a.Zx() * b,
                a.Zy() * b,
                a.Zz() * b,
                a.Zw() * b,
                a.Tx() * b,
                a.Ty() * b,
                a.Tz() * b,
                a.Tw() * b
        );
    }

    public static <R> R mul4x4(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Xw() * b.Xw(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Yw() * b.Yw(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz(),
                a.Zw() * b.Zw(),
                a.Tx() * b.Tx(),
                a.Ty() * b.Ty(),
                a.Tz() * b.Tz(),
                a.Tw() * b.Tw()
        );
    }

    public static void mul4x4To(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() * b.Xx(),
                a.Xy() * b.Xy(),
                a.Xz() * b.Xz(),
                a.Xw() * b.Xw(),
                a.Yx() * b.Yx(),
                a.Yy() * b.Yy(),
                a.Yz() * b.Yz(),
                a.Yw() * b.Yw(),
                a.Zx() * b.Zx(),
                a.Zy() * b.Zy(),
                a.Zz() * b.Zz(),
                a.Zw() * b.Zw(),
                a.Tx() * b.Tx(),
                a.Ty() * b.Ty(),
                a.Tz() * b.Tz(),
                a.Tw() * b.Tw()
        );
    }

    public static <R> R div4x4(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Factory<R> factory) {
        final double inverseB = 1.0D / b;

        return factory.create(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Xw() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Yw() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB,
                a.Zw() * inverseB,
                a.Tx() * inverseB,
                a.Ty() * inverseB,
                a.Tz() * inverseB,
                a.Tw() * inverseB
        );
    }

    public static void div4x4To(final Matrix4x4.Accessible a, final double b, final Matrix4x4.Consumer consumer) {
        final double inverseB = 1.0D / b;

        consumer.XYZTxyzw(
                a.Xx() * inverseB,
                a.Xy() * inverseB,
                a.Xz() * inverseB,
                a.Xw() * inverseB,
                a.Yx() * inverseB,
                a.Yy() * inverseB,
                a.Yz() * inverseB,
                a.Yw() * inverseB,
                a.Zx() * inverseB,
                a.Zy() * inverseB,
                a.Zz() * inverseB,
                a.Zw() * inverseB,
                a.Tx() * inverseB,
                a.Ty() * inverseB,
                a.Tz() * inverseB,
                a.Tw() * inverseB
        );
    }

    public static <R> R div4x4(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Xw() / b.Xw(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Yw() / b.Yw(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz(),
                a.Zw() / b.Zw(),
                a.Tx() / b.Tx(),
                a.Ty() / b.Ty(),
                a.Tz() / b.Tz(),
                a.Tw() / b.Tw()
        );
    }

    public static void div4x4To(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a.Xx() / b.Xx(),
                a.Xy() / b.Xy(),
                a.Xz() / b.Xz(),
                a.Xw() / b.Xw(),
                a.Yx() / b.Yx(),
                a.Yy() / b.Yy(),
                a.Yz() / b.Yz(),
                a.Yw() / b.Yw(),
                a.Zx() / b.Zx(),
                a.Zy() / b.Zy(),
                a.Zz() / b.Zz(),
                a.Zw() / b.Zw(),
                a.Tx() / b.Tx(),
                a.Ty() / b.Ty(),
                a.Tz() / b.Tz(),
                a.Tw() / b.Tw()
        );
    }

    public static <R> R div4x4(final double a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
        return factory.create(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Xw(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Yw(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz(),
                a / b.Zw(),
                a / b.Tx(),
                a / b.Ty(),
                a / b.Tz(),
                a / b.Tw()
        );
    }

    public static void div4x4To(final double a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
        consumer.XYZTxyzw(
                a / b.Xx(),
                a / b.Xy(),
                a / b.Xz(),
                a / b.Xw(),
                a / b.Yx(),
                a / b.Yy(),
                a / b.Yz(),
                a / b.Yw(),
                a / b.Zx(),
                a / b.Zy(),
                a / b.Zz(),
                a / b.Zw(),
                a / b.Tx(),
                a / b.Ty(),
                a / b.Tz(),
                a / b.Tw()
        );
    }

    public static <R> R matrixInverse4x4(final Matrix4x4.Accessible matrix, final Matrix4x4.Factory<R> factory) {
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

    public static void matrixInverse4x4To(final Matrix4x4.Accessible matrix, final Matrix4x4.Consumer consumer) {
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

    public static <R> R matrixProduct4x4(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Factory<R> factory) {
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

    public static void matrixProduct4x4To(final Matrix4x4.Accessible a, final Matrix4x4.Accessible b, final Matrix4x4.Consumer consumer) {
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

    public static <R> R matrixProduct4x4And4(final Matrix4x4.Accessible m, final Vector4.Accessible v, final Vector4.Factory<R> factory) {
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

    public static void matrixProduct4x4And4To(final Matrix4x4.Accessible m, final Vector4.Accessible v, final Vector4.Consumer consumer) {
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

    public static <R> R matrixProject3By4x4(final Matrix4x4.Accessible m, final Vector3.Accessible p, final Vector3.Factory<R> factory) {
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

    public static void matrixProject3By4x4To(final Matrix4x4.Accessible m, final Vector3.Accessible p, final Vector3.Consumer consumer) {
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

    public static <R> R quaternionInverse(final Vector4.Accessible quat, final Vector4.Factory<R> factory) {
        final double x = quat.x();
        final double y = quat.y();
        final double z = quat.z();
        final double w = quat.w();

        final double inverseDot = 1.0D / (x * x + y * y + z * z + w * w);

        return factory.create(
                -x * inverseDot,
                -y * inverseDot,
                -z * inverseDot,
                w * inverseDot
        );
    }

    public static void quaternionInverseTo(final Vector4.Accessible quat, final Vector4.Consumer consumer) {
        final double x = quat.x();
        final double y = quat.y();
        final double z = quat.z();
        final double w = quat.w();

        final double inverseDot = 1.0D / (x * x + y * y + z * z + w * w);

        consumer.xyzw(
                -x * inverseDot,
                -y * inverseDot,
                -z * inverseDot,
                w * inverseDot
        );
    }

    public static <R> R quaternionProduct(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Factory<R> factory) {
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

    public static void quaternionProductTo(final Vector4.Accessible a, final Vector4.Accessible b, final Vector4.Consumer consumer) {
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

    public static <R> R quaternionTransform3(final Vector4.Accessible q, final Vector3.Accessible v, final Vector3.Factory<R> factory) {
        final double qX = q.x();
        final double qY = q.y();
        final double qZ = q.z();
        final double qW = q.w();

        final double vX = v.x();
        final double vY = v.y();
        final double vZ = v.z();

        final double crossQVX = qY * vZ - qZ * vY;
        final double crossQVY = qZ * vX - qX * vZ;
        final double crossQVZ = qX * vY - qY * vX;

        return factory.create(
                vX + (crossQVX * qW + (qY * crossQVZ - qZ * crossQVY)) * 2.0D,
                vY + (crossQVY * qW + (qZ * crossQVX - qX * crossQVZ)) * 2.0D,
                vZ + (crossQVZ * qW + (qX * crossQVY - qY * crossQVX)) * 2.0D
        );
    }

    public static void quaternionTransform3To(final Vector4.Accessible q, final Vector3.Accessible v, final Vector3.Consumer consumer) {
        final double qX = q.x();
        final double qY = q.y();
        final double qZ = q.z();
        final double qW = q.w();

        final double vX = v.x();
        final double vY = v.y();
        final double vZ = v.z();

        final double crossQVX = qY * vZ - qZ * vY;
        final double crossQVY = qZ * vX - qX * vZ;
        final double crossQVZ = qX * vY - qY * vX;

        consumer.xyz(
                vX + (crossQVX * qW + (qY * crossQVZ - qZ * crossQVY)) * 2.0D,
                vY + (crossQVY * qW + (qZ * crossQVX - qX * crossQVZ)) * 2.0D,
                vZ + (crossQVZ * qW + (qX * crossQVY - qY * crossQVX)) * 2.0D
        );
    }

}
