package y;

import A0.j0;
import A9.C0096i1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import u0.InterfaceC2083m;
import z.AbstractC2556g0;
import z.C2532D;
import z.C2575w;
import z.C2576x;
import z.D0;
import z.G0;
import z.Y;
import z.p0;

/* renamed from: y.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2302j implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26477b;

    public /* synthetic */ C2302j(Object obj, int i7) {
        this.f26476a = i7;
        this.f26477b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC2083m interfaceC2083m, Hb.d dVar) {
        int i7 = 1;
        Db.q qVar = Db.q.f3365a;
        Object obj = this.f26477b;
        switch (this.f26476a) {
            case 0:
                r rVar = (r) obj;
                rVar.getClass();
                C2309q c2309q = new C2309q(rVar, null);
                u0.w wVar = new u0.w(rVar, i7);
                C2532D c2532d = G0.f27869a;
                Object k = cc.F.k(new D0(interfaceC2083m, c2309q, wVar, new Y(interfaceC2083m), null), dVar);
                Ib.a aVar = Ib.a.f5345a;
                if (k != aVar) {
                    k = qVar;
                }
                if (k != aVar) {
                    k = qVar;
                }
                return k == aVar ? k : qVar;
            case 1:
                Object c10 = AbstractC2556g0.c(interfaceC2083m, new C2304l((C2305m) obj, null), dVar);
                return c10 == Ib.a.f5345a ? c10 : qVar;
            default:
                C0096i1 c0096i1 = new C0096i1();
                p0 p0Var = (p0) obj;
                Object k7 = cc.F.k(new C2575w(p0Var, interfaceC2083m, new S0.a(2, p0Var, c0096i1), new C.D(c0096i1, interfaceC2083m, p0Var, 10), new C2576x(p0Var, 0), new C2576x(p0Var, i7), new j0(11, c0096i1, p0Var), null), dVar);
                return k7 == Ib.a.f5345a ? k7 : qVar;
        }
    }
}
