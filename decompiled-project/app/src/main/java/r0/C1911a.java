package r0;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1911a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23644a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1911a) {
            return this.f23644a == ((C1911a) obj).f23644a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23644a);
    }

    public final String toString() {
        int i7 = this.f23644a;
        return i7 == 1 ? "Touch" : i7 == 2 ? "Keyboard" : "Error";
    }
}
