package k0;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1402c {

    /* renamed from: a, reason: collision with root package name */
    public final String f18689a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18691c;

    public AbstractC1402c(String str, long j, int i7) {
        this.f18689a = str;
        this.f18690b = j;
        this.f18691c = i7;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i7 < -1 || i7 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i7);

    public abstract float b(int i7);

    public boolean c() {
        return false;
    }

    public abstract long d(float f4, float f10, float f11);

    public abstract float e(float f4, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1402c abstractC1402c = (AbstractC1402c) obj;
        if (this.f18691c == abstractC1402c.f18691c && kotlin.jvm.internal.l.a(this.f18689a, abstractC1402c.f18689a)) {
            return AbstractC1401b.a(this.f18690b, abstractC1402c.f18690b);
        }
        return false;
    }

    public abstract long f(float f4, float f10, float f11, float f12, AbstractC1402c abstractC1402c);

    public int hashCode() {
        int hashCode = this.f18689a.hashCode() * 31;
        int i7 = AbstractC1401b.f18688e;
        return h3.o.f(hashCode, 31, this.f18690b) + this.f18691c;
    }

    public final String toString() {
        return this.f18689a + " (id=" + this.f18691c + ", model=" + ((Object) AbstractC1401b.b(this.f18690b)) + ')';
    }
}
