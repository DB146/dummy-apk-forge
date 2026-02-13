package qb;

import hb.InterfaceC1269b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import lb.CallableC1516a;
import ob.C1839g;
import sb.C2010d;
import xb.AbstractC2275c;
import xb.C2274b;
import y7.u0;

/* loaded from: classes2.dex */
public final class m extends gb.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23624a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23625b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f23624a = i7;
        this.f23625b = obj;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        Object obj;
        int i7 = 0;
        int i10 = 1;
        switch (this.f23624a) {
            case 0:
                ((d) this.f23625b).b(new l(lVar));
                return;
            case 1:
                ((gb.f) this.f23625b).b(new t(lVar, i7));
                return;
            case 2:
                C2010d c2010d = new C2010d(lVar);
                lVar.c(c2010d);
                try {
                    ((gb.j) this.f23625b).d(c2010d);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    c2010d.onError(th);
                    return;
                }
            case 3:
                try {
                    obj = ((CallableC1516a) this.f23625b).f19611a;
                } catch (Throwable th2) {
                    th = th2;
                    u0.L(th);
                }
                if (obj == null) {
                    throw AbstractC2275c.a("Supplier returned a null Throwable.");
                }
                C2274b c2274b = AbstractC2275c.f26321a;
                th = (Throwable) obj;
                lVar.c(kb.c.f19072a);
                lVar.onError(th);
                return;
            case 4:
                Object[] objArr = (Object[]) this.f23625b;
                sb.r rVar = new sb.r(lVar, objArr);
                lVar.c(rVar);
                if (rVar.f24323d) {
                    return;
                }
                int length = objArr.length;
                while (i7 < length && !rVar.f24324e) {
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        rVar.f24320a.onError(new NullPointerException(A3.c.f(i7, "The element at index ", " is null")));
                        return;
                    } else {
                        rVar.f24320a.e(obj2);
                        i7++;
                    }
                }
                if (rVar.f24324e) {
                    return;
                }
                rVar.f24320a.a();
                return;
            case 5:
                InterfaceC1269b interfaceC1269b = kb.c.f19072a;
                try {
                    Iterator it = ((ArrayList) this.f23625b).iterator();
                    try {
                        if (!it.hasNext()) {
                            lVar.c(interfaceC1269b);
                            lVar.a();
                            return;
                        }
                        sb.t tVar = new sb.t(lVar, it);
                        lVar.c(tVar);
                        if (tVar.f24329d) {
                            return;
                        }
                        while (!tVar.f24328c) {
                            try {
                                Object next = tVar.f24327b.next();
                                Objects.requireNonNull(next, "The iterator returned a null value");
                                tVar.f24326a.e(next);
                                if (tVar.f24328c) {
                                    return;
                                }
                                try {
                                    if (!tVar.f24327b.hasNext()) {
                                        if (tVar.f24328c) {
                                            return;
                                        }
                                        tVar.f24326a.a();
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    u0.L(th3);
                                    tVar.f24326a.onError(th3);
                                    return;
                                }
                            } catch (Throwable th4) {
                                u0.L(th4);
                                tVar.f24326a.onError(th4);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th5) {
                        u0.L(th5);
                        lVar.c(interfaceC1269b);
                        lVar.onError(th5);
                        return;
                    }
                } catch (Throwable th6) {
                    u0.L(th6);
                    lVar.c(interfaceC1269b);
                    lVar.onError(th6);
                    return;
                }
            case 6:
                ((pb.r) this.f23625b).a(new C1839g(lVar, i10));
                return;
            default:
                ((gb.p) this.f23625b).d(new t(lVar, i10));
                return;
        }
    }
}
