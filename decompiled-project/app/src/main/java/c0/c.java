package c0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f14101a;

    public c(float f4) {
        this.f14101a = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f14101a, ((c) obj).f14101a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14101a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.f14101a + ')';
    }
}
