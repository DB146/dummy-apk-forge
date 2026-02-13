package i0;

import a.AbstractC0672a;
import h3.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f18173e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f18174a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18175b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18176c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18177d;

    public c(float f4, float f10, float f11, float f12) {
        this.f18174a = f4;
        this.f18175b = f10;
        this.f18176c = f11;
        this.f18177d = f12;
    }

    public final long a() {
        float f4 = this.f18176c;
        float f10 = this.f18174a;
        float f11 = ((f4 - f10) / 2.0f) + f10;
        float f12 = this.f18177d;
        float f13 = this.f18175b;
        return (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long b() {
        float f4 = this.f18176c - this.f18174a;
        float f10 = this.f18177d - this.f18175b;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public final c c(c cVar) {
        return new c(Math.max(this.f18174a, cVar.f18174a), Math.max(this.f18175b, cVar.f18175b), Math.min(this.f18176c, cVar.f18176c), Math.min(this.f18177d, cVar.f18177d));
    }

    public final c d(float f4, float f10) {
        return new c(this.f18174a + f4, this.f18175b + f10, this.f18176c + f4, this.f18177d + f10);
    }

    public final c e(long j) {
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        return new c(Float.intBitsToFloat(i7) + this.f18174a, Float.intBitsToFloat(i10) + this.f18175b, Float.intBitsToFloat(i7) + this.f18176c, Float.intBitsToFloat(i10) + this.f18177d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f18174a, cVar.f18174a) == 0 && Float.compare(this.f18175b, cVar.f18175b) == 0 && Float.compare(this.f18176c, cVar.f18176c) == 0 && Float.compare(this.f18177d, cVar.f18177d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18177d) + o.e(this.f18176c, o.e(this.f18175b, Float.hashCode(this.f18174a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC0672a.v(this.f18174a) + ", " + AbstractC0672a.v(this.f18175b) + ", " + AbstractC0672a.v(this.f18176c) + ", " + AbstractC0672a.v(this.f18177d) + ')';
    }
}
