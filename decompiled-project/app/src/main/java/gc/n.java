package gc;

import fc.InterfaceC1161h;
import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class n extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Jb.i f17535e;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Rb.f fVar, InterfaceC1161h interfaceC1161h, Hb.i iVar, int i7, int i10) {
        super(interfaceC1161h, iVar, i7, i10);
        this.f17535e = (Jb.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.f] */
    @Override // gc.AbstractC1212g
    public final AbstractC1212g e(Hb.i iVar, int i7, int i10) {
        return new n(this.f17535e, this.f17521d, iVar, i7, i10);
    }

    @Override // gc.i
    public final Object h(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        Object k = cc.F.k(new m(this, interfaceC1162i, null), dVar);
        return k == Ib.a.f5345a ? k : Db.q.f3365a;
    }
}
