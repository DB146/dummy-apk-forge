package N0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f7138a;

    public static String a(int i7) {
        return i7 == 0 ? "None" : i7 == 1 ? "Weight" : i7 == 2 ? "Style" : i7 == 65535 ? "All" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f7138a == ((j) obj).f7138a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7138a);
    }

    public final String toString() {
        return a(this.f7138a);
    }
}
