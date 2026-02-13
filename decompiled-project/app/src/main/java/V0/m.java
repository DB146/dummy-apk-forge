package V0;

/* loaded from: classes.dex */
public final class m implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9985a;

    public m(float f4) {
        this.f9985a = f4;
    }

    @Override // W0.a
    public final float a(float f4) {
        return f4 / this.f9985a;
    }

    @Override // W0.a
    public final float b(float f4) {
        return f4 * this.f9985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f9985a, ((m) obj).f9985a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9985a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f9985a + ')';
    }
}
