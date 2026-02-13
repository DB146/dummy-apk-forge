package x;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2241k extends AbstractC2243m {

    /* renamed from: a, reason: collision with root package name */
    public float f26111a;

    /* renamed from: b, reason: collision with root package name */
    public float f26112b;

    /* renamed from: c, reason: collision with root package name */
    public float f26113c;

    public C2241k(float f4, float f10, float f11) {
        this.f26111a = f4;
        this.f26112b = f10;
        this.f26113c = f11;
    }

    @Override // x.AbstractC2243m
    public final float a(int i7) {
        if (i7 == 0) {
            return this.f26111a;
        }
        if (i7 == 1) {
            return this.f26112b;
        }
        if (i7 != 2) {
            return 0.0f;
        }
        return this.f26113c;
    }

    @Override // x.AbstractC2243m
    public final int b() {
        return 3;
    }

    @Override // x.AbstractC2243m
    public final AbstractC2243m c() {
        return new C2241k(0.0f, 0.0f, 0.0f);
    }

    @Override // x.AbstractC2243m
    public final void d() {
        this.f26111a = 0.0f;
        this.f26112b = 0.0f;
        this.f26113c = 0.0f;
    }

    @Override // x.AbstractC2243m
    public final void e(int i7, float f4) {
        if (i7 == 0) {
            this.f26111a = f4;
        } else if (i7 == 1) {
            this.f26112b = f4;
        } else {
            if (i7 != 2) {
                return;
            }
            this.f26113c = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2241k) {
            C2241k c2241k = (C2241k) obj;
            if (c2241k.f26111a == this.f26111a && c2241k.f26112b == this.f26112b && c2241k.f26113c == this.f26113c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26113c) + h3.o.e(this.f26112b, Float.hashCode(this.f26111a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f26111a + ", v2 = " + this.f26112b + ", v3 = " + this.f26113c;
    }
}
