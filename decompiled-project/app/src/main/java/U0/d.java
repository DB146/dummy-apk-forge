package U0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f9417a;

    public static final boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public static String b(int i7) {
        return a(i7, 1) ? "Hyphens.None" : a(i7, 2) ? "Hyphens.Auto" : a(i7, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f9417a == ((d) obj).f9417a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9417a);
    }

    public final String toString() {
        return b(this.f9417a);
    }
}
