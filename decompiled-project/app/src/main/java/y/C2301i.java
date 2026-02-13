package y;

/* renamed from: y.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2301i extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f26475a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2301i(r rVar, Hb.d dVar) {
        super(2, dVar);
        this.f26475a = rVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2301i(this.f26475a, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C2301i c2301i = (C2301i) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c2301i.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        r rVar = this.f26475a;
        A.f fVar = rVar.f26518M;
        if (fVar != null) {
            A.g gVar = new A.g(fVar);
            A.i iVar = rVar.f26511E;
            if (iVar != null) {
                cc.F.B(rVar.d0(), null, 0, new C2294b(iVar, gVar, null), 3);
            }
            rVar.f26518M = null;
        }
        return Db.q.f3365a;
    }
}
