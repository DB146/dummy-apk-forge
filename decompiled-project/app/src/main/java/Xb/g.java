package Xb;

/* loaded from: classes2.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final g f11032d = new e(1, 0, 1);

    @Override // Xb.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f11025a == gVar.f11025a) {
                    if (this.f11026b == gVar.f11026b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // Xb.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f11025a * 31) + this.f11026b;
    }

    @Override // Xb.e
    public final boolean isEmpty() {
        return this.f11025a > this.f11026b;
    }

    @Override // Xb.e
    public final String toString() {
        return this.f11025a + ".." + this.f11026b;
    }
}
