package h2;

import Y5.B;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234b {

    /* renamed from: a, reason: collision with root package name */
    public final C1233a f17645a;

    /* renamed from: b, reason: collision with root package name */
    public final C1233a f17646b;

    /* renamed from: c, reason: collision with root package name */
    public final D9.a f17647c;

    /* renamed from: d, reason: collision with root package name */
    public final B f17648d;

    /* renamed from: e, reason: collision with root package name */
    public int f17649e;

    public C1234b(C1233a c1233a, C1233a c1233a2) {
        this.f17649e = 0;
        this.f17645a = c1233a;
        this.f17646b = c1233a2;
        this.f17647c = null;
        this.f17648d = null;
    }

    public C1234b(C1233a c1233a, C1233a c1233a2, D9.a aVar) {
        this.f17649e = 0;
        if (aVar == null) {
            throw new IllegalArgumentException();
        }
        this.f17645a = c1233a;
        this.f17646b = c1233a2;
        this.f17647c = aVar;
        this.f17648d = null;
    }

    public C1234b(C1233a c1233a, C1233a c1233a2, B b2) {
        this.f17649e = 0;
        if (b2 == null) {
            throw new IllegalArgumentException();
        }
        this.f17645a = c1233a;
        this.f17646b = c1233a2;
        this.f17647c = null;
        this.f17648d = b2;
    }

    public final String toString() {
        D9.a aVar = this.f17647c;
        return "[" + this.f17645a.f17639a + " -> " + this.f17646b.f17639a + " <" + (aVar != null ? aVar.f3289a : this.f17648d != null ? "EntranceTransitionNotSupport" : "auto") + ">]";
    }
}
