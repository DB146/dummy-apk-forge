package rb;

import gb.i;
import gb.k;
import gb.l;
import hb.InterfaceC1269b;
import java.util.Objects;
import jb.InterfaceC1394e;
import jb.InterfaceC1396g;
import nb.e;
import ob.C1833a;
import sb.RunnableC2004C;
import sb.u;
import y7.u0;

/* renamed from: rb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1954a extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23907a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23908b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23909c;

    public /* synthetic */ C1954a(int i7, Object obj, Object obj2) {
        this.f23907a = i7;
        this.f23908b = obj;
        this.f23909c = obj2;
    }

    @Override // gb.i
    public final void p(l lVar) {
        switch (this.f23907a) {
            case 0:
                e eVar = new e(8, lVar, (u) this.f23909c);
                lVar.c(eVar);
                ((C1833a) this.f23908b).c(eVar);
                return;
            case 1:
                e eVar2 = new e(9, lVar, (q3.e) this.f23909c);
                lVar.c(eVar2);
                ((tb.e) this.f23908b).d(eVar2);
                return;
            default:
                InterfaceC1269b interfaceC1269b = kb.c.f19072a;
                try {
                    Object apply = ((InterfaceC1394e) this.f23909c).apply(this.f23908b);
                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                    k kVar = (k) apply;
                    if (!(kVar instanceof InterfaceC1396g)) {
                        kVar.b(lVar);
                        return;
                    }
                    try {
                        Object obj = ((InterfaceC1396g) kVar).get();
                        if (obj == null) {
                            lVar.c(interfaceC1269b);
                            lVar.a();
                            return;
                        } else {
                            RunnableC2004C runnableC2004C = new RunnableC2004C(lVar, obj);
                            lVar.c(runnableC2004C);
                            runnableC2004C.run();
                            return;
                        }
                    } catch (Throwable th) {
                        u0.L(th);
                        lVar.c(interfaceC1269b);
                        lVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    u0.L(th2);
                    lVar.c(interfaceC1269b);
                    lVar.onError(th2);
                    return;
                }
        }
    }
}
