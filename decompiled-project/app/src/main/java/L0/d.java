package L0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f6235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6236b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6237c;

    public d(boolean z8, int i7, int i10) {
        this.f6235a = i7;
        this.f6236b = i10;
        this.f6237c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6235a == dVar.f6235a && this.f6236b == dVar.f6236b && this.f6237c == dVar.f6237c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6237c) + A3.c.c(this.f6236b, Integer.hashCode(this.f6235a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f6235a + ", end=" + this.f6236b + ", isRtl=" + this.f6237c + ')';
    }
}
