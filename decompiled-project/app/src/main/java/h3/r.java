package h3;

import A9.S2;
import b4.C0838i;
import cc.InterfaceC0937i0;
import j4.InterfaceC1376b;
import m4.v0;
import m4.w0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements a1.j, InterfaceC1376b, n5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17709c;

    public /* synthetic */ r(int i7, w0 w0Var, w0 w0Var2) {
        this.f17707a = i7;
        this.f17708b = w0Var;
        this.f17709c = w0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r(Hb.i iVar, int i7, Rb.e eVar) {
        this.f17708b = iVar;
        this.f17707a = i7;
        this.f17709c = (Jb.i) eVar;
    }

    public /* synthetic */ r(h4.i iVar, C0838i c0838i, int i7) {
        this.f17708b = iVar;
        this.f17709c = c0838i;
        this.f17707a = i7;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Jb.i, Rb.e] */
    @Override // a1.j
    public Object a(a1.i iVar) {
        cc.B b2 = cc.B.f14467b;
        Hb.i iVar2 = (Hb.i) this.f17708b;
        S2 s22 = new S2((InterfaceC0937i0) iVar2.get(b2), 26);
        n nVar = n.f17701a;
        a1.n nVar2 = iVar.f12473c;
        if (nVar2 != null) {
            nVar2.a(s22, nVar);
        }
        return cc.F.B(cc.F.b(iVar2), null, this.f17707a, new t((Jb.i) this.f17709c, iVar, null), 1);
    }

    @Override // j4.InterfaceC1376b
    public Object e() {
        ((h4.i) this.f17708b).f17751d.a((C0838i) this.f17709c, this.f17707a + 1, false);
        return null;
    }

    @Override // n5.i
    public void invoke(Object obj) {
        v0 v0Var = (v0) obj;
        v0Var.getClass();
        v0Var.y(this.f17707a, (w0) this.f17708b, (w0) this.f17709c);
    }
}
