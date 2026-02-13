package gc;

import cc.C0957x;
import fc.C1159f;
import fc.InterfaceC1161h;
import fc.InterfaceC1162i;
import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public abstract class i extends AbstractC1212g {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1161h f17521d;

    public i(InterfaceC1161h interfaceC1161h, Hb.i iVar, int i7, int i10) {
        super(iVar, i7, i10);
        this.f17521d = interfaceC1161h;
    }

    @Override // gc.AbstractC1212g, fc.InterfaceC1161h
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        Object a9;
        Db.q qVar = Db.q.f3365a;
        if (this.f17516b == -3) {
            Hb.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0957x c0957x = C0957x.f14588c;
            Hb.i iVar = this.f17515a;
            Hb.i plus = !((Boolean) iVar.fold(bool, c0957x)).booleanValue() ? context.plus(iVar) : cc.F.n(context, iVar, false);
            if (kotlin.jvm.internal.l.a(plus, context)) {
                a9 = h(interfaceC1162i, dVar);
                if (a9 != Ib.a.f5345a) {
                    return qVar;
                }
            } else {
                Hb.e eVar = Hb.e.f4918a;
                if (kotlin.jvm.internal.l.a(plus.get(eVar), context.get(eVar))) {
                    Hb.i context2 = dVar.getContext();
                    if (!(interfaceC1162i instanceof D ? true : interfaceC1162i instanceof y)) {
                        interfaceC1162i = new C1159f(interfaceC1162i, context2);
                    }
                    a9 = AbstractC1208c.a(plus, interfaceC1162i, AbstractC1273a.l(plus), new h(this, null), dVar);
                    Ib.a aVar = Ib.a.f5345a;
                    if (a9 != aVar) {
                        a9 = qVar;
                    }
                    if (a9 != aVar) {
                        return qVar;
                    }
                }
            }
            return a9;
        }
        a9 = super.a(interfaceC1162i, dVar);
        if (a9 != Ib.a.f5345a) {
            return qVar;
        }
        return a9;
    }

    @Override // gc.AbstractC1212g
    public final Object d(ec.r rVar, Hb.d dVar) {
        Object h10 = h(new D(rVar), dVar);
        return h10 == Ib.a.f5345a ? h10 : Db.q.f3365a;
    }

    public abstract Object h(InterfaceC1162i interfaceC1162i, Hb.d dVar);

    @Override // gc.AbstractC1212g
    public final String toString() {
        return this.f17521d + " -> " + super.toString();
    }
}
