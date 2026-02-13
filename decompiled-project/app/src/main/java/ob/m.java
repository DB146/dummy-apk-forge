package ob;

import ea.C1108c;
import ea.C1112g;
import gb.AbstractC1204a;
import gb.o;
import gb.p;
import gb.q;
import hb.InterfaceC1269b;
import kb.C1436a;
import kb.EnumC1437b;
import qb.n;

/* loaded from: classes2.dex */
public final class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22234a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22236c;

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.f22234a = i7;
        this.f22235b = obj;
        this.f22236c = obj2;
    }

    public m(p pVar, AbstractC1204a abstractC1204a) {
        this.f22234a = 3;
        this.f22236c = pVar;
        this.f22235b = abstractC1204a;
    }

    @Override // gb.p
    public final void e(q qVar) {
        switch (this.f22234a) {
            case 0:
                ((AbstractC1204a) this.f22235b).c(new C1112g(9, this, qVar, false));
                return;
            case 1:
                ((n) this.f22235b).b(new nb.e(7, qVar, (tb.e) this.f22236c));
                return;
            case 2:
                ((gb.f) this.f22235b).b(new nb.g(6, qVar, (W9.c) this.f22236c));
                return;
            case 3:
                ((AbstractC1204a) this.f22235b).c(new nb.e(11, qVar, (p) this.f22236c));
                return;
            case 4:
                ((p) this.f22235b).d(new C1108c(14, this, qVar, false));
                return;
            default:
                RunnableC1841i runnableC1841i = new RunnableC1841i(qVar, (p) this.f22235b);
                qVar.c(runnableC1841i);
                InterfaceC1269b b2 = ((o) this.f22236c).b(runnableC1841i);
                C1436a c1436a = (C1436a) runnableC1841i.f22224c;
                c1436a.getClass();
                EnumC1437b.f(c1436a, b2);
                return;
        }
    }
}
