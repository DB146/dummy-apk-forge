package A8;

import B0.K0;
import fc.InterfaceC1162i;
import gc.C1206a;
import sb.C2010d;

/* loaded from: classes.dex */
public final class F implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f546b;

    public /* synthetic */ F(Object obj, int i7) {
        this.f545a = i7;
        this.f546b = obj;
    }

    @Override // fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        Object e2;
        switch (this.f545a) {
            case 0:
                ((N) this.f546b).f569c.set((C0057v) obj);
                return Db.q.f3365a;
            case 1:
                ((K0) this.f546b).f1712a.f(((Number) obj).floatValue());
                return Db.q.f3365a;
            case 2:
                M1.Q q10 = (M1.Q) this.f546b;
                boolean z8 = q10.f6627h.u() instanceof M1.S;
                Db.q qVar = Db.q.f3365a;
                return (z8 || (e2 = M1.Q.e(q10, true, dVar)) != Ib.a.f5345a) ? qVar : e2;
            case 3:
                ((kotlin.jvm.internal.v) this.f546b).f19134a = obj;
                throw new C1206a(this);
            default:
                ((C2010d) this.f546b).d(obj);
                return Db.q.f3365a;
        }
    }
}
