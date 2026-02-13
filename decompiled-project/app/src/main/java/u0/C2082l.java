package u0;

import i0.C1289b;
import java.util.ArrayList;

/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2082l {

    /* renamed from: a, reason: collision with root package name */
    public final long f24778a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24780c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24781d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24782e;

    /* renamed from: f, reason: collision with root package name */
    public final float f24783f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24784h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f24785i;
    public final long j;
    public final long k;

    public C2082l(long j, long j10, long j11, long j12, boolean z8, float f4, int i7, boolean z10, ArrayList arrayList, long j13, long j14) {
        this.f24778a = j;
        this.f24779b = j10;
        this.f24780c = j11;
        this.f24781d = j12;
        this.f24782e = z8;
        this.f24783f = f4;
        this.g = i7;
        this.f24784h = z10;
        this.f24785i = arrayList;
        this.j = j13;
        this.k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2082l)) {
            return false;
        }
        C2082l c2082l = (C2082l) obj;
        return u.d(this.f24778a, c2082l.f24778a) && this.f24779b == c2082l.f24779b && C1289b.b(this.f24780c, c2082l.f24780c) && C1289b.b(this.f24781d, c2082l.f24781d) && this.f24782e == c2082l.f24782e && Float.compare(this.f24783f, c2082l.f24783f) == 0 && u.e(this.g, c2082l.g) && this.f24784h == c2082l.f24784h && this.f24785i.equals(c2082l.f24785i) && C1289b.b(this.j, c2082l.j) && C1289b.b(this.k, c2082l.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + h3.o.f((this.f24785i.hashCode() + h3.o.g(this.f24784h, A3.c.c(this.g, h3.o.e(this.f24783f, h3.o.g(this.f24782e, h3.o.f(h3.o.f(h3.o.f(Long.hashCode(this.f24778a) * 31, 31, this.f24779b), 31, this.f24780c), 31, this.f24781d), 31), 31), 31), 31)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) ("PointerId(value=" + this.f24778a + ')'));
        sb2.append(", uptime=");
        sb2.append(this.f24779b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C1289b.g(this.f24780c));
        sb2.append(", position=");
        sb2.append((Object) C1289b.g(this.f24781d));
        sb2.append(", down=");
        sb2.append(this.f24782e);
        sb2.append(", pressure=");
        sb2.append(this.f24783f);
        sb2.append(", type=");
        int i7 = this.g;
        sb2.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", activeHover=");
        sb2.append(this.f24784h);
        sb2.append(", historical=");
        sb2.append(this.f24785i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C1289b.g(this.j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) C1289b.g(this.k));
        sb2.append(')');
        return sb2.toString();
    }
}
