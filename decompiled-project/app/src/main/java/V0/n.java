package V0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final o[] f9986b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f9987c = android.support.v4.media.session.b.B(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f9988a;

    public /* synthetic */ n(long j) {
        this.f9988a = j;
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final long b(long j) {
        return f9986b[(int) ((j & 1095216660480L) >>> 32)].f9989a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (o.a(b2, 0L)) {
            return "Unspecified";
        }
        if (o.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!o.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f9988a == ((n) obj).f9988a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9988a);
    }

    public final String toString() {
        return d(this.f9988a);
    }
}
