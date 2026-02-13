package k0;

/* renamed from: k0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418s {

    /* renamed from: a, reason: collision with root package name */
    public final float f18756a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18757b;

    public C1418s(float f4, float f10) {
        this.f18756a = f4;
        this.f18757b = f10;
    }

    public final float[] a() {
        float f4 = this.f18756a;
        float f10 = this.f18757b;
        return new float[]{f4 / f10, 1.0f, ((1.0f - f4) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1418s)) {
            return false;
        }
        C1418s c1418s = (C1418s) obj;
        return Float.compare(this.f18756a, c1418s.f18756a) == 0 && Float.compare(this.f18757b, c1418s.f18757b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18757b) + (Float.hashCode(this.f18756a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.f18756a + ", y=" + this.f18757b + ')';
    }
}
