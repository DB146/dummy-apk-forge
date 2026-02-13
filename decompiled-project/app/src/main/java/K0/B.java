package K0;

import java.util.List;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final C0374d f5833a;

    /* renamed from: b, reason: collision with root package name */
    public final F f5834b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5835c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5836d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5838f;
    public final V0.c g;

    /* renamed from: h, reason: collision with root package name */
    public final V0.l f5839h;

    /* renamed from: i, reason: collision with root package name */
    public final N0.d f5840i;
    public final long j;

    public B(C0374d c0374d, F f4, List list, int i7, boolean z8, int i10, V0.c cVar, V0.l lVar, N0.d dVar, long j) {
        this.f5833a = c0374d;
        this.f5834b = f4;
        this.f5835c = list;
        this.f5836d = i7;
        this.f5837e = z8;
        this.f5838f = i10;
        this.g = cVar;
        this.f5839h = lVar;
        this.f5840i = dVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return kotlin.jvm.internal.l.a(this.f5833a, b2.f5833a) && kotlin.jvm.internal.l.a(this.f5834b, b2.f5834b) && this.f5835c.equals(b2.f5835c) && this.f5836d == b2.f5836d && this.f5837e == b2.f5837e && tc.b.t(this.f5838f, b2.f5838f) && kotlin.jvm.internal.l.a(this.g, b2.g) && this.f5839h == b2.f5839h && kotlin.jvm.internal.l.a(this.f5840i, b2.f5840i) && V0.a.b(this.j, b2.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.f5840i.hashCode() + ((this.f5839h.hashCode() + ((this.g.hashCode() + A3.c.c(this.f5838f, h3.o.g(this.f5837e, (((this.f5835c.hashCode() + ((this.f5834b.hashCode() + (this.f5833a.hashCode() * 31)) * 31)) * 31) + this.f5836d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f5833a);
        sb2.append(", style=");
        sb2.append(this.f5834b);
        sb2.append(", placeholders=");
        sb2.append(this.f5835c);
        sb2.append(", maxLines=");
        sb2.append(this.f5836d);
        sb2.append(", softWrap=");
        sb2.append(this.f5837e);
        sb2.append(", overflow=");
        int i7 = this.f5838f;
        sb2.append((Object) (tc.b.t(i7, 1) ? "Clip" : tc.b.t(i7, 2) ? "Ellipsis" : tc.b.t(i7, 5) ? "MiddleEllipsis" : tc.b.t(i7, 3) ? "Visible" : tc.b.t(i7, 4) ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f5839h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f5840i);
        sb2.append(", constraints=");
        sb2.append((Object) V0.a.k(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}
