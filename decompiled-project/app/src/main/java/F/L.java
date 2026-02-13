package F;

import A0.A0;
import A0.C0005a;
import E.C0249d;

/* loaded from: classes.dex */
public final class L extends c0.l implements A0 {

    /* renamed from: C, reason: collision with root package name */
    public Yb.g f3918C;

    /* renamed from: D, reason: collision with root package name */
    public C0249d f3919D;

    /* renamed from: E, reason: collision with root package name */
    public z.V f3920E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3921F;

    /* renamed from: G, reason: collision with root package name */
    public H0.g f3922G;

    /* renamed from: H, reason: collision with root package name */
    public final J f3923H = new J(this, 0);

    /* renamed from: I, reason: collision with root package name */
    public J f3924I;

    public L(Yb.g gVar, C0249d c0249d, z.V v10, boolean z8) {
        this.f3918C = gVar;
        this.f3919D = c0249d;
        this.f3920E = v10;
        this.f3921F = z8;
        p0();
    }

    @Override // A0.A0
    public final void c0(H0.i iVar) {
        Yb.h[] hVarArr = H0.s.f4563a;
        H0.t tVar = H0.q.f4548m;
        Yb.h[] hVarArr2 = H0.s.f4563a;
        Yb.h hVar = hVarArr2[6];
        tVar.a(iVar, Boolean.TRUE);
        iVar.z(H0.q.f4536I, this.f3923H);
        if (this.f3920E == z.V.f27943a) {
            H0.g gVar = this.f3922G;
            if (gVar == null) {
                kotlin.jvm.internal.l.j("scrollAxisRange");
                throw null;
            }
            H0.t tVar2 = H0.q.f4555t;
            Yb.h hVar2 = hVarArr2[11];
            tVar2.a(iVar, gVar);
        } else {
            H0.g gVar2 = this.f3922G;
            if (gVar2 == null) {
                kotlin.jvm.internal.l.j("scrollAxisRange");
                throw null;
            }
            H0.t tVar3 = H0.q.f4554s;
            Yb.h hVar3 = hVarArr2[10];
            tVar3.a(iVar, gVar2);
        }
        J j = this.f3924I;
        if (j != null) {
            iVar.z(H0.h.f4476f, new H0.a(null, j));
        }
        iVar.z(H0.h.f4470A, new H0.a(null, new C0005a(new I(this, 0), 13)));
        H0.b bVar = this.f3919D.f3405b ? new H0.b(-1, 1) : new H0.b(1, -1);
        H0.t tVar4 = H0.q.f4544f;
        Yb.h hVar4 = hVarArr2[21];
        tVar4.a(iVar, bVar);
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    public final void p0() {
        this.f3922G = new H0.g(new I(this, 1), new I(this, 2));
        this.f3924I = this.f3921F ? new J(this, 1) : null;
    }
}
