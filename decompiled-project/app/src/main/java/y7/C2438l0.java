package y7;

/* renamed from: y7.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2438l0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2440m0 f27329a;

    /* renamed from: b, reason: collision with root package name */
    public final C2444o0 f27330b;

    /* renamed from: c, reason: collision with root package name */
    public final C2442n0 f27331c;

    public C2438l0(C2440m0 c2440m0, C2444o0 c2444o0, C2442n0 c2442n0) {
        this.f27329a = c2440m0;
        this.f27330b = c2444o0;
        this.f27331c = c2442n0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2438l0)) {
            return false;
        }
        C2438l0 c2438l0 = (C2438l0) obj;
        return this.f27329a.equals(c2438l0.f27329a) && this.f27330b.equals(c2438l0.f27330b) && this.f27331c.equals(c2438l0.f27331c);
    }

    public final int hashCode() {
        return ((((this.f27329a.hashCode() ^ 1000003) * 1000003) ^ this.f27330b.hashCode()) * 1000003) ^ this.f27331c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f27329a + ", osData=" + this.f27330b + ", deviceData=" + this.f27331c + "}";
    }
}
