package n5;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f21232c = new w(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f21233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21234b;

    static {
        new w(0, 0);
    }

    public w(int i7, int i10) {
        AbstractC1705a.h((i7 == -1 || i7 >= 0) && (i10 == -1 || i10 >= 0));
        this.f21233a = i7;
        this.f21234b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f21233a == wVar.f21233a && this.f21234b == wVar.f21234b;
    }

    public final int hashCode() {
        int i7 = this.f21233a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f21234b;
    }

    public final String toString() {
        return this.f21233a + "x" + this.f21234b;
    }
}
