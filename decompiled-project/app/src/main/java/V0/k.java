package V0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f9981a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f9981a == ((k) obj).f9981a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9981a);
    }

    public final String toString() {
        return b(this.f9981a);
    }
}
