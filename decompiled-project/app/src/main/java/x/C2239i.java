package x;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2239i extends AbstractC2243m {

    /* renamed from: a, reason: collision with root package name */
    public float f26098a;

    public C2239i(float f4) {
        this.f26098a = f4;
    }

    @Override // x.AbstractC2243m
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f26098a;
        }
        return 0.0f;
    }

    @Override // x.AbstractC2243m
    public final int b() {
        return 1;
    }

    @Override // x.AbstractC2243m
    public final AbstractC2243m c() {
        return new C2239i(0.0f);
    }

    @Override // x.AbstractC2243m
    public final void d() {
        this.f26098a = 0.0f;
    }

    @Override // x.AbstractC2243m
    public final void e(int i7, float f4) {
        if (i7 == 0) {
            this.f26098a = f4;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2239i) && ((C2239i) obj).f26098a == this.f26098a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26098a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f26098a;
    }
}
