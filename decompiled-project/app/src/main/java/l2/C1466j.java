package l2;

/* renamed from: l2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466j extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1456G f19219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1465i f19220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466j(AbstractC1456G abstractC1456G, C1465i c1465i, Hb.d dVar) {
        super(2, dVar);
        this.f19219a = abstractC1456G;
        this.f19220b = c1465i;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C1466j(this.f19219a, this.f19220b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C1466j c1466j = (C1466j) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c1466j.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        this.f19219a.f(this.f19220b);
        return Db.q.f3365a;
    }
}
