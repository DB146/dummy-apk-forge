package gc;

import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class D implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final ec.r f17494a;

    public D(ec.r rVar) {
        this.f17494a = rVar;
    }

    @Override // fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        Object a9 = ((ec.q) this.f17494a).f16900d.a(dVar, obj);
        return a9 == Ib.a.f5345a ? a9 : Db.q.f3365a;
    }
}
