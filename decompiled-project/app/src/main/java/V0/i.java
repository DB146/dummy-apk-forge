package V0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f9975a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final long b(long j, long j10) {
        return ((((int) (j >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j, long j10) {
        return ((((int) (j >> 32)) + ((int) (j10 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return X.c.k(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f9975a == ((i) obj).f9975a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9975a);
    }

    public final String toString() {
        return d(this.f9975a);
    }
}
