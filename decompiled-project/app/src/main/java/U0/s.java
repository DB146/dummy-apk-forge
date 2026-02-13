package U0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f9445a;

    public static final boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f9445a == ((s) obj).f9445a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9445a);
    }

    public final String toString() {
        int i7 = this.f9445a;
        return a(i7, 1) ? "Linearity.Linear" : a(i7, 2) ? "Linearity.FontHinting" : a(i7, 3) ? "Linearity.None" : "Invalid";
    }
}
