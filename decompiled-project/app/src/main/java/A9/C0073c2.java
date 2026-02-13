package A9;

/* renamed from: A9.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0073c2 extends Tb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0085f2 f1092a;

    public C0073c2(C0085f2 c0085f2) {
        this.f1092a = c0085f2;
    }

    @Override // Tb.a
    public final void A() {
        C0085f2 c0085f2 = this.f1092a;
        Tb.a aVar = c0085f2.f1184n0;
        if (aVar != null) {
            aVar.A();
        }
        c0085f2.x0(true);
    }

    @Override // Tb.a
    public final void s() {
        Tb.a aVar = this.f1092a.f1184n0;
        if (aVar == null) {
            return;
        }
        aVar.s();
    }

    @Override // Tb.a
    public final boolean v() {
        Tb.a aVar = this.f1092a.f1184n0;
        if (aVar == null) {
            return false;
        }
        return aVar.v();
    }

    @Override // Tb.a
    public final void y(boolean z8) {
        C0085f2 c0085f2 = this.f1092a;
        Tb.a aVar = c0085f2.f1184n0;
        if (aVar != null) {
            aVar.y(z8);
        }
        c0085f2.x0(false);
    }

    @Override // Tb.a
    public final void z(long j) {
        Tb.a aVar = this.f1092a.f1184n0;
        if (aVar != null) {
            aVar.z(j);
        }
    }
}
