package u0;

/* renamed from: u0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2087q {

    /* renamed from: a, reason: collision with root package name */
    public final int f24796a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2087q) {
            return this.f24796a == ((C2087q) obj).f24796a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24796a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f24796a + ')';
    }
}
