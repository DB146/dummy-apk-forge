package w;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2174a {

    /* renamed from: a, reason: collision with root package name */
    public final float f25545a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25546b;

    public C2174a(float f4, float f10) {
        this.f25545a = f4;
        this.f25546b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2174a)) {
            return false;
        }
        C2174a c2174a = (C2174a) obj;
        return Float.compare(this.f25545a, c2174a.f25545a) == 0 && Float.compare(this.f25546b, c2174a.f25546b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25546b) + (Float.hashCode(this.f25545a) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.f25545a + ", velocityCoefficient=" + this.f25546b + ')';
    }
}
