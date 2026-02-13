package l2;

/* renamed from: l2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1456G f19221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f19222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467k(AbstractC1456G abstractC1456G, I i7, Hb.d dVar) {
        super(2, dVar);
        this.f19221a = abstractC1456G;
        this.f19222b = i7;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C1467k(this.f19221a, this.f19222b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C1467k c1467k = (C1467k) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c1467k.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        this.f19221a.i(this.f19222b);
        return Db.q.f3365a;
    }
}
