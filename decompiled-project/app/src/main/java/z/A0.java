package z;

import mc.C1659d;

/* loaded from: classes.dex */
public final class A0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f27825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(Y y10, Hb.d dVar) {
        super(2, dVar);
        this.f27825a = y10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new A0(this.f27825a, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        A0 a02 = (A0) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        a02.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        Y y10 = this.f27825a;
        y10.f27955b = true;
        C1659d c1659d = y10.f27957d;
        if (c1659d.c()) {
            c1659d.l(null);
        }
        return Db.q.f3365a;
    }
}
