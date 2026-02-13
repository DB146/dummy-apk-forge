package V0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f9989a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f9989a == ((o) obj).f9989a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9989a);
    }

    public final String toString() {
        long j = this.f9989a;
        return a(j, 0L) ? "Unspecified" : a(j, 4294967296L) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
