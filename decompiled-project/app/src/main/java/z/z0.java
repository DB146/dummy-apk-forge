package z;

import mc.C1659d;

/* loaded from: classes.dex */
public final class z0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f28151a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Y y10, Hb.d dVar) {
        super(2, dVar);
        this.f28151a = y10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new z0(this.f28151a, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        z0 z0Var = (z0) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        z0Var.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        Y y10 = this.f28151a;
        y10.f27956c = true;
        C1659d c1659d = y10.f27957d;
        if (c1659d.c()) {
            c1659d.l(null);
        }
        return Db.q.f3365a;
    }
}
