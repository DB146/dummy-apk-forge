package U0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9414a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f9414a, ((a) obj).f9414a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9414a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f9414a + ')';
    }
}
