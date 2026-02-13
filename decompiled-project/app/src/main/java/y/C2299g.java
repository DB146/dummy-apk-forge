package y;

/* renamed from: y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299g extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.k f26473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2299g(r rVar, A.k kVar, Hb.d dVar) {
        super(2, dVar);
        this.f26472b = rVar;
        this.f26473c = kVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2299g(this.f26472b, this.f26473c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2299g) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26471a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            A.i iVar = this.f26472b.f26511E;
            if (iVar != null) {
                A.l lVar = new A.l(this.f26473c);
                this.f26471a = 1;
                if (iVar.a(lVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
