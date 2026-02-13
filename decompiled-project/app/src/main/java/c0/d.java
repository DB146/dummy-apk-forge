package c0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f14102a;

    public d(float f4) {
        this.f14102a = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f14102a, ((d) obj).f14102a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14102a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.f14102a + ')';
    }
}
