package tb;

import ea.C1112g;
import gb.p;
import gb.q;
import gb.r;
import hb.InterfaceC1269b;
import lb.CallableC1516a;
import ob.m;
import xb.AbstractC2275c;
import xb.C2274b;
import y7.u0;

/* loaded from: classes2.dex */
public final class b extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24525a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24526b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f24525a = i7;
        this.f24526b = obj;
    }

    @Override // gb.p
    public final void e(q qVar) {
        Object obj;
        InterfaceC1269b interfaceC1269b = kb.c.f19072a;
        Object obj2 = this.f24526b;
        switch (this.f24525a) {
            case 0:
                C2037a c2037a = new C2037a(qVar);
                qVar.c(c2037a);
                try {
                    ((r) obj2).c(c2037a);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    c2037a.a(th);
                    return;
                }
            case 1:
                ((m) obj2).d(new C1112g(13, this, qVar, false));
                return;
            case 2:
                try {
                    obj = ((CallableC1516a) obj2).f19611a;
                } catch (Throwable th2) {
                    th = th2;
                    u0.L(th);
                }
                if (obj == null) {
                    throw AbstractC2275c.a("Supplier returned a null Throwable.");
                }
                C2274b c2274b = AbstractC2275c.f26321a;
                th = (Throwable) obj;
                qVar.c(interfaceC1269b);
                qVar.onError(th);
                return;
            default:
                qVar.c(interfaceC1269b);
                qVar.onSuccess(obj2);
                return;
        }
    }
}
