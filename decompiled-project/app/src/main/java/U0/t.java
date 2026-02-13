package U0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final t f9446c = new t(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final t f9447d = new t(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f9448a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9449b;

    public t(int i7, boolean z8) {
        this.f9448a = i7;
        this.f9449b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return s.a(this.f9448a, tVar.f9448a) && this.f9449b == tVar.f9449b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9449b) + (Integer.hashCode(this.f9448a) * 31);
    }

    public final String toString() {
        return equals(f9446c) ? "TextMotion.Static" : equals(f9447d) ? "TextMotion.Animated" : "Invalid";
    }
}
