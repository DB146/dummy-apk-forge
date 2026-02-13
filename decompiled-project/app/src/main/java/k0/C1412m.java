package k0;

import h3.H;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1412m implements InterfaceC1408i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1416q f18731b;

    public /* synthetic */ C1412m(C1416q c1416q, int i7) {
        this.f18730a = i7;
        this.f18731b = c1416q;
    }

    @Override // k0.InterfaceC1408i
    public final double a(double d10) {
        switch (this.f18730a) {
            case 0:
                return H.i(this.f18731b.k.a(d10), r0.f18740e, r0.f18741f);
            default:
                return this.f18731b.f18746n.a(H.i(d10, r0.f18740e, r0.f18741f));
        }
    }
}
