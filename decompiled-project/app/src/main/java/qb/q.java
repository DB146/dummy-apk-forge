package qb;

import hb.InterfaceC1269b;
import kb.C1436a;
import kb.EnumC1437b;
import lb.CallableC1516a;

/* loaded from: classes2.dex */
public final class q extends AbstractC1909a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23634b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(gb.f fVar, Object obj, int i7) {
        super(fVar);
        this.f23634b = i7;
        this.f23635c = obj;
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        switch (this.f23634b) {
            case 0:
                this.f23591a.b(new p(gVar, (gb.o) this.f23635c, 0));
                return;
            case 1:
                this.f23591a.b(new nb.g(4, gVar, (CallableC1516a) this.f23635c));
                return;
            default:
                nb.e eVar = new nb.e(gVar);
                gVar.c(eVar);
                InterfaceC1269b b2 = ((vb.n) this.f23635c).b(new hc.i(9, eVar, this.f23591a, false));
                C1436a c1436a = (C1436a) eVar.f21342b;
                c1436a.getClass();
                EnumC1437b.f(c1436a, b2);
                return;
        }
    }
}
