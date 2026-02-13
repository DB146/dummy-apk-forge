package w;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final Y.k f25521a;

    /* renamed from: b, reason: collision with root package name */
    public long f25522b;

    public O(Y.k kVar, long j) {
        this.f25521a = kVar;
        this.f25522b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return this.f25521a.equals(o10.f25521a) && V0.k.a(this.f25522b, o10.f25522b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f25522b) + (this.f25521a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f25521a + ", startSize=" + ((Object) V0.k.b(this.f25522b)) + ')';
    }
}
