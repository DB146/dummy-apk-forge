package M1;

import fc.InterfaceC1162i;

/* loaded from: classes.dex */
public final class Z extends Jb.i implements Rb.e {
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new Jb.i(2, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        Z z8 = (Z) create((InterfaceC1162i) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        z8.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        return Db.q.f3365a;
    }
}
