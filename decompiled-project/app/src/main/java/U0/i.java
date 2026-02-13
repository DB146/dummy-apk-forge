package U0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f9425c = new i(17, f.f9421c);

    /* renamed from: a, reason: collision with root package name */
    public final float f9426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9427b;

    public i(int i7, float f4) {
        this.f9426a = f4;
        this.f9427b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f4 = iVar.f9426a;
        float f10 = f.f9420b;
        return Float.compare(this.f9426a, f4) == 0 && this.f9427b == iVar.f9427b;
    }

    public final int hashCode() {
        float f4 = f.f9420b;
        return Integer.hashCode(0) + A3.c.c(this.f9427b, Float.hashCode(this.f9426a) * 31, 31);
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) f.b(this.f9426a)) + ", trim=" + ((Object) h.a(this.f9427b)) + ",mode=Mode(value=0))";
    }
}
