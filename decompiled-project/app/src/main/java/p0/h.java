package p0;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    public final float f23004a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23005b;

    public h(float f4, float f10) {
        this.f23004a = f4;
        this.f23005b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f23004a, hVar.f23004a) == 0 && Float.compare(this.f23005b, hVar.f23005b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23005b) + (Float.hashCode(this.f23004a) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.f23004a + ", y=" + this.f23005b + ')';
    }
}
