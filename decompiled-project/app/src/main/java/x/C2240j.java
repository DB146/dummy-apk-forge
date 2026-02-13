package x;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2240j extends AbstractC2243m {

    /* renamed from: a, reason: collision with root package name */
    public float f26108a;

    /* renamed from: b, reason: collision with root package name */
    public float f26109b;

    public C2240j(float f4, float f10) {
        this.f26108a = f4;
        this.f26109b = f10;
    }

    @Override // x.AbstractC2243m
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f26108a;
        }
        if (i7 != 1) {
            return 0.0f;
        }
        return this.f26109b;
    }

    @Override // x.AbstractC2243m
    public final int b() {
        return 2;
    }

    @Override // x.AbstractC2243m
    public final AbstractC2243m c() {
        return new C2240j(0.0f, 0.0f);
    }

    @Override // x.AbstractC2243m
    public final void d() {
        this.f26108a = 0.0f;
        this.f26109b = 0.0f;
    }

    @Override // x.AbstractC2243m
    public final void e(int i7, float f4) {
        if (i7 == 0) {
            this.f26108a = f4;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f26109b = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2240j) {
            C2240j c2240j = (C2240j) obj;
            if (c2240j.f26108a == this.f26108a && c2240j.f26109b == this.f26109b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26109b) + (Float.hashCode(this.f26108a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f26108a + ", v2 = " + this.f26109b;
    }
}
