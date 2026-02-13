package C;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final float f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2349b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2350c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2351d;

    public F(float f4, float f10, float f11, float f12) {
        this.f2348a = f4;
        this.f2349b = f10;
        this.f2350c = f11;
        this.f2351d = f12;
        if (!((f4 >= 0.0f) & (f10 >= 0.0f) & (f11 >= 0.0f)) || !(f12 >= 0.0f)) {
            D.a.a("Padding must be non-negative");
        }
    }

    public final float a(V0.l lVar) {
        return lVar == V0.l.f9982a ? this.f2348a : this.f2350c;
    }

    public final float b(V0.l lVar) {
        return lVar == V0.l.f9982a ? this.f2350c : this.f2348a;
    }

    public final float c() {
        return this.f2349b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return V0.f.a(this.f2348a, f4.f2348a) && V0.f.a(this.f2349b, f4.f2349b) && V0.f.a(this.f2350c, f4.f2350c) && V0.f.a(this.f2351d, f4.f2351d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2351d) + h3.o.e(this.f2350c, h3.o.e(this.f2349b, Float.hashCode(this.f2348a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) V0.f.b(this.f2348a)) + ", top=" + ((Object) V0.f.b(this.f2349b)) + ", end=" + ((Object) V0.f.b(this.f2350c)) + ", bottom=" + ((Object) V0.f.b(this.f2351d)) + ')';
    }
}
