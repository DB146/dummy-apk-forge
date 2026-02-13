package N;

import u0.InterfaceC2083m;

/* loaded from: classes.dex */
public final class C extends Jb.i implements Rb.e {
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new Jb.i(2, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C c10 = (C) create((InterfaceC2083m) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c10.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        return Db.q.f3365a;
    }
}
