package p0;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final float f23012a;

    public k(float f4) {
        this.f23012a = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        kVar.getClass();
        return Float.compare(4.89f, 4.89f) == 0 && Float.compare(this.f23012a, kVar.f23012a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23012a) + (Float.hashCode(4.89f) * 31);
    }

    public final String toString() {
        return "RelativeLineTo(dx=4.89, dy=" + this.f23012a + ')';
    }
}
