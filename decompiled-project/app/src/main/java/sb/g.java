package sb;

import I2.C0330t;
import M1.C0386a;
import jb.InterfaceC1392c;
import jb.InterfaceC1395f;
import kb.C1436a;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class g extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24266b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(gb.i iVar, Object obj, int i7) {
        super(iVar);
        this.f24266b = i7;
        this.f24267c = obj;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        switch (this.f24266b) {
            case 0:
                this.f24251a.b(new nb.g(0, lVar, (M9.l) this.f24267c));
                return;
            case 1:
                this.f24251a.b(new i(lVar, (InterfaceC1395f) this.f24267c, 0));
                return;
            case 2:
                C1436a c1436a = new C1436a();
                lVar.c(c1436a);
                new y(lVar, (InterfaceC1392c) this.f24267c, c1436a, this.f24251a).b();
                return;
            case 3:
                Bb.c cVar = new Bb.c(new Bb.b());
                try {
                    gb.k kVar = (gb.k) ((R7.b) this.f24267c).apply(cVar);
                    C2003B c2003b = new C2003B(lVar, cVar, this.f24251a);
                    lVar.c(c2003b);
                    kVar.b(c2003b.f24236e);
                    c2003b.d();
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    lVar.c(kb.c.f19072a);
                    lVar.onError(th);
                    return;
                }
            case 4:
                nb.e eVar = new nb.e(lVar);
                lVar.c(eVar);
                EnumC1437b.j(eVar, ((vb.n) this.f24267c).b(new hc.i(12, this, eVar)));
                return;
            case 5:
                C0330t c0330t = new C0330t(lVar, (gb.k) this.f24267c);
                lVar.c((C1436a) c0330t.f5202d);
                this.f24251a.b(c0330t);
                return;
            default:
                this.f24251a.b(new pb.o(lVar, (C0386a) this.f24267c));
                return;
        }
    }
}
