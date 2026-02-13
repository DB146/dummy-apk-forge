package N0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f7137a;

    public static final boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f7137a == ((i) obj).f7137a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7137a);
    }

    public final String toString() {
        int i7 = this.f7137a;
        return a(i7, 0) ? "Normal" : a(i7, 1) ? "Italic" : "Invalid";
    }
}
