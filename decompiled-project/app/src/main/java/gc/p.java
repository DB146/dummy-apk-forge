package gc;

import fc.InterfaceC1161h;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p extends AbstractC1212g {

    /* renamed from: d, reason: collision with root package name */
    public final Object f17539d;

    public p(Iterable iterable, Hb.i iVar, int i7, int i10) {
        super(iVar, i7, i10);
        this.f17539d = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // gc.AbstractC1212g
    public final Object d(ec.r rVar, Hb.d dVar) {
        D d10 = new D(rVar);
        Iterator it = this.f17539d.iterator();
        while (it.hasNext()) {
            cc.F.B(rVar, null, 0, new o((InterfaceC1161h) it.next(), d10, null), 3);
        }
        return Db.q.f3365a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // gc.AbstractC1212g
    public final AbstractC1212g e(Hb.i iVar, int i7, int i10) {
        return new p(this.f17539d, iVar, i7, i10);
    }

    @Override // gc.AbstractC1212g
    public final ec.t g(cc.E e2) {
        Rb.e c1211f = new C1211f(this, null);
        ec.q qVar = new ec.q(cc.F.C(e2, this.f17515a), Q5.e.a(this.f17516b, 1, 4));
        qVar.Y(1, qVar, c1211f);
        return qVar;
    }
}
