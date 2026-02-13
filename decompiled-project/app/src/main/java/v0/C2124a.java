package v0;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124a {

    /* renamed from: a, reason: collision with root package name */
    public long f24925a;

    /* renamed from: b, reason: collision with root package name */
    public float f24926b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2124a)) {
            return false;
        }
        C2124a c2124a = (C2124a) obj;
        return this.f24925a == c2124a.f24925a && Float.compare(this.f24926b, c2124a.f24926b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24926b) + (Long.hashCode(this.f24925a) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.f24925a + ", dataPoint=" + this.f24926b + ')';
    }
}
