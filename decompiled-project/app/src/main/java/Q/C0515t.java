package Q;

/* renamed from: Q.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515t {

    /* renamed from: a, reason: collision with root package name */
    public final C0517u f8508a;

    public C0515t(C0517u c0517u) {
        this.f8508a = c0517u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0515t) {
            if (this.f8508a.equals(((C0515t) obj).f8508a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8508a.hashCode() * 31;
    }
}
