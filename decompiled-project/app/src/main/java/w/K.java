package w;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final float f25515a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25516b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25517c;

    public K(float f4, float f10, long j) {
        this.f25515a = f4;
        this.f25516b = f10;
        this.f25517c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k = (K) obj;
        return Float.compare(this.f25515a, k.f25515a) == 0 && Float.compare(this.f25516b, k.f25516b) == 0 && this.f25517c == k.f25517c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25517c) + h3.o.e(this.f25516b, Float.hashCode(this.f25515a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f25515a + ", distance=" + this.f25516b + ", duration=" + this.f25517c + ')';
    }
}
