package c0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f14103a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14104b;

    public e(float f4, float f10) {
        this.f14103a = f4;
        this.f14104b = f10;
    }

    public final long a(long j, long j10, V0.l lVar) {
        float f4 = (((int) (j10 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f10 = (((int) (j10 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        V0.l lVar2 = V0.l.f9982a;
        float f11 = this.f14103a;
        if (lVar != lVar2) {
            f11 *= -1;
        }
        float f12 = 1;
        float f13 = (f11 + f12) * f4;
        float f14 = (f12 + this.f14104b) * f10;
        return (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f14103a, eVar.f14103a) == 0 && Float.compare(this.f14104b, eVar.f14104b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14104b) + (Float.hashCode(this.f14103a) * 31);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.f14103a + ", verticalBias=" + this.f14104b + ')';
    }
}
