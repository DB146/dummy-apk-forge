package U0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f9431a;

    public static final boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public static String b(int i7) {
        return a(i7, 1) ? "Left" : a(i7, 2) ? "Right" : a(i7, 3) ? "Center" : a(i7, 4) ? "Justify" : a(i7, 5) ? "Start" : a(i7, 6) ? "End" : a(i7, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f9431a == ((k) obj).f9431a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9431a);
    }

    public final String toString() {
        return b(this.f9431a);
    }
}
