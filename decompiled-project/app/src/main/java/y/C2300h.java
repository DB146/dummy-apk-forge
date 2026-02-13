package y;

/* renamed from: y.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2300h extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f26474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300h(r rVar, Hb.d dVar) {
        super(2, dVar);
        this.f26474a = rVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2300h(this.f26474a, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C2300h c2300h = (C2300h) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c2300h.invokeSuspend(qVar);
        return qVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [A.f, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        r rVar = this.f26474a;
        if (rVar.f26518M == null) {
            ?? obj2 = new Object();
            A.i iVar = rVar.f26511E;
            if (iVar != null) {
                cc.F.B(rVar.d0(), null, 0, new C2293a(iVar, obj2, null), 3);
            }
            rVar.f26518M = obj2;
        }
        return Db.q.f3365a;
    }
}
