package M;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f6489a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6490b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6491c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6492d;

    public f(float f4, float f10, float f11, float f12) {
        this.f6489a = f4;
        this.f6490b = f10;
        this.f6491c = f11;
        this.f6492d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6489a == fVar.f6489a && this.f6490b == fVar.f6490b && this.f6491c == fVar.f6491c && this.f6492d == fVar.f6492d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6492d) + h3.o.e(this.f6491c, h3.o.e(this.f6490b, Float.hashCode(this.f6489a) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f6489a + ", focusedAlpha=" + this.f6490b + ", hoveredAlpha=" + this.f6491c + ", pressedAlpha=" + this.f6492d + ')';
    }
}
