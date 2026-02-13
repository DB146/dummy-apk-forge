package V0;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f9968a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9969b;

    public d(float f4, float f10) {
        this.f9968a = f4;
        this.f9969b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f9968a, dVar.f9968a) == 0 && Float.compare(this.f9969b, dVar.f9969b) == 0;
    }

    @Override // V0.c
    public final float f() {
        return this.f9969b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9969b) + (Float.hashCode(this.f9968a) * 31);
    }

    @Override // V0.c
    public final float k() {
        return this.f9968a;
    }

    public final String toString() {
        return "DensityImpl(density=" + this.f9968a + ", fontScale=" + this.f9969b + ')';
    }
}
