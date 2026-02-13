package ob;

import gb.AbstractC1204a;
import gb.o;
import hb.InterfaceC1269b;
import kb.C1436a;
import kb.EnumC1437b;

/* renamed from: ob.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1842j extends AbstractC1204a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22226a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1204a f22227b;

    /* renamed from: c, reason: collision with root package name */
    public final o f22228c;

    public /* synthetic */ C1842j(AbstractC1204a abstractC1204a, o oVar, int i7) {
        this.f22226a = i7;
        this.f22227b = abstractC1204a;
        this.f22228c = oVar;
    }

    @Override // gb.AbstractC1204a
    public final void d(gb.b bVar) {
        switch (this.f22226a) {
            case 0:
                this.f22227b.c(new RunnableC1841i(bVar, this.f22228c));
                return;
            default:
                RunnableC1841i runnableC1841i = new RunnableC1841i(bVar, this.f22227b);
                bVar.c(runnableC1841i);
                InterfaceC1269b b2 = this.f22228c.b(runnableC1841i);
                C1436a c1436a = (C1436a) runnableC1841i.f22224c;
                c1436a.getClass();
                EnumC1437b.f(c1436a, b2);
                return;
        }
    }
}
