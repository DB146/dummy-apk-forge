package B0;

import android.view.Choreographer;

/* renamed from: B0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176f0 extends Jb.i implements Rb.e {
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new Jb.i(2, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0176f0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        return Choreographer.getInstance();
    }
}
