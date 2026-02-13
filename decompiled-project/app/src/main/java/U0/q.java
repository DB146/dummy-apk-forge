package U0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f9439c = new q(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f9440a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9441b;

    public q(float f4, float f10) {
        this.f9440a = f4;
        this.f9441b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9440a == qVar.f9440a && this.f9441b == qVar.f9441b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9441b) + (Float.hashCode(this.f9440a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.f9440a + ", skewX=" + this.f9441b + ')';
    }
}
