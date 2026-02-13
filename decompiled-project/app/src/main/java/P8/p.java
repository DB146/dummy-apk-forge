package P8;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8250b;

    public p(float f4, float f10) {
        this.f8249a = f4;
        this.f8250b = f10;
    }

    public static float a(p pVar, p pVar2) {
        return O5.b.l(pVar.f8249a, pVar.f8250b, pVar2.f8249a, pVar2.f8250b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8249a == pVar.f8249a && this.f8250b == pVar.f8250b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8250b) + (Float.floatToIntBits(this.f8249a) * 31);
    }

    public final String toString() {
        return "(" + this.f8249a + ',' + this.f8250b + ')';
    }
}
