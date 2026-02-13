package M1;

/* renamed from: M1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392g extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f6672a;

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new Jb.i(1, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        C0392g c0392g = (C0392g) create((Hb.d) obj);
        Db.q qVar = Db.q.f3365a;
        c0392g.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6672a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6672a = 1;
            throw null;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.c.c0(obj);
        return Db.q.f3365a;
    }
}
