package V0;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final float f9973a;

    public static final boolean a(float f4, float f10) {
        return Float.compare(f4, f10) == 0;
    }

    public static String b(float f4) {
        if (Float.isNaN(f4)) {
            return "Dp.Unspecified";
        }
        return f4 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f9973a, ((f) obj).f9973a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f9973a, ((f) obj).f9973a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9973a);
    }

    public final String toString() {
        return b(this.f9973a);
    }
}
