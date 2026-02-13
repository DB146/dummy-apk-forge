package x;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2242l extends AbstractC2243m {

    /* renamed from: a, reason: collision with root package name */
    public float f26118a;

    /* renamed from: b, reason: collision with root package name */
    public float f26119b;

    /* renamed from: c, reason: collision with root package name */
    public float f26120c;

    /* renamed from: d, reason: collision with root package name */
    public float f26121d;

    public C2242l(float f4, float f10, float f11, float f12) {
        this.f26118a = f4;
        this.f26119b = f10;
        this.f26120c = f11;
        this.f26121d = f12;
    }

    @Override // x.AbstractC2243m
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f26118a;
        }
        if (i7 == 1) {
            return this.f26119b;
        }
        if (i7 == 2) {
            return this.f26120c;
        }
        if (i7 != 3) {
            return 0.0f;
        }
        return this.f26121d;
    }

    @Override // x.AbstractC2243m
    public final int b() {
        return 4;
    }

    @Override // x.AbstractC2243m
    public final AbstractC2243m c() {
        return new C2242l(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // x.AbstractC2243m
    public final void d() {
        this.f26118a = 0.0f;
        this.f26119b = 0.0f;
        this.f26120c = 0.0f;
        this.f26121d = 0.0f;
    }

    @Override // x.AbstractC2243m
    public final void e(int i7, float f4) {
        if (i7 == 0) {
            this.f26118a = f4;
            return;
        }
        if (i7 == 1) {
            this.f26119b = f4;
        } else if (i7 == 2) {
            this.f26120c = f4;
        } else {
            if (i7 != 3) {
                return;
            }
            this.f26121d = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2242l) {
            C2242l c2242l = (C2242l) obj;
            if (c2242l.f26118a == this.f26118a && c2242l.f26119b == this.f26119b && c2242l.f26120c == this.f26120c && c2242l.f26121d == this.f26121d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26121d) + h3.o.e(this.f26120c, h3.o.e(this.f26119b, Float.hashCode(this.f26118a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f26118a + ", v2 = " + this.f26119b + ", v3 = " + this.f26120c + ", v4 = " + this.f26121d;
    }
}
