package i0;

import Z9.x;
import a.AbstractC0672a;
import h3.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f18178a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18179b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18180c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18181d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18182e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18183f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18184h;

    static {
        com.bumptech.glide.c.a(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f4, float f10, float f11, float f12, long j, long j10, long j11, long j12) {
        this.f18178a = f4;
        this.f18179b = f10;
        this.f18180c = f11;
        this.f18181d = f12;
        this.f18182e = j;
        this.f18183f = j10;
        this.g = j11;
        this.f18184h = j12;
    }

    public final float a() {
        return this.f18181d - this.f18179b;
    }

    public final float b() {
        return this.f18180c - this.f18178a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f18178a, dVar.f18178a) == 0 && Float.compare(this.f18179b, dVar.f18179b) == 0 && Float.compare(this.f18180c, dVar.f18180c) == 0 && Float.compare(this.f18181d, dVar.f18181d) == 0 && x.l(this.f18182e, dVar.f18182e) && x.l(this.f18183f, dVar.f18183f) && x.l(this.g, dVar.g) && x.l(this.f18184h, dVar.f18184h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f18184h) + o.f(o.f(o.f(o.e(this.f18181d, o.e(this.f18180c, o.e(this.f18179b, Float.hashCode(this.f18178a) * 31, 31), 31), 31), 31, this.f18182e), 31, this.f18183f), 31, this.g);
    }

    public final String toString() {
        String str = AbstractC0672a.v(this.f18178a) + ", " + AbstractC0672a.v(this.f18179b) + ", " + AbstractC0672a.v(this.f18180c) + ", " + AbstractC0672a.v(this.f18181d);
        long j = this.f18182e;
        long j10 = this.f18183f;
        boolean l10 = x.l(j, j10);
        long j11 = this.g;
        long j12 = this.f18184h;
        if (!l10 || !x.l(j10, j11) || !x.l(j11, j12)) {
            StringBuilder n6 = X.c.n("RoundRect(rect=", str, ", topLeft=");
            n6.append((Object) x.V(j));
            n6.append(", topRight=");
            n6.append((Object) x.V(j10));
            n6.append(", bottomRight=");
            n6.append((Object) x.V(j11));
            n6.append(", bottomLeft=");
            n6.append((Object) x.V(j12));
            n6.append(')');
            return n6.toString();
        }
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i10)) {
            StringBuilder n8 = X.c.n("RoundRect(rect=", str, ", radius=");
            n8.append(AbstractC0672a.v(Float.intBitsToFloat(i7)));
            n8.append(')');
            return n8.toString();
        }
        StringBuilder n10 = X.c.n("RoundRect(rect=", str, ", x=");
        n10.append(AbstractC0672a.v(Float.intBitsToFloat(i7)));
        n10.append(", y=");
        n10.append(AbstractC0672a.v(Float.intBitsToFloat(i10)));
        n10.append(')');
        return n10.toString();
    }
}
