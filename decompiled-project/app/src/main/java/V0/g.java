package V0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f9974a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f9974a == ((g) obj).f9974a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9974a);
    }

    public final String toString() {
        long j = this.f9974a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
