package p0;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final float f23006a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23008c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23009d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23010e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23011f;

    public j(float f4, float f10, float f11, float f12, float f13, float f14) {
        this.f23006a = f4;
        this.f23007b = f10;
        this.f23008c = f11;
        this.f23009d = f12;
        this.f23010e = f13;
        this.f23011f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f23006a, jVar.f23006a) == 0 && Float.compare(this.f23007b, jVar.f23007b) == 0 && Float.compare(this.f23008c, jVar.f23008c) == 0 && Float.compare(this.f23009d, jVar.f23009d) == 0 && Float.compare(this.f23010e, jVar.f23010e) == 0 && Float.compare(this.f23011f, jVar.f23011f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23011f) + h3.o.e(this.f23010e, h3.o.e(this.f23009d, h3.o.e(this.f23008c, h3.o.e(this.f23007b, Float.hashCode(this.f23006a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "RelativeCurveTo(dx1=" + this.f23006a + ", dy1=" + this.f23007b + ", dx2=" + this.f23008c + ", dy2=" + this.f23009d + ", dx3=" + this.f23010e + ", dy3=" + this.f23011f + ')';
    }
}
