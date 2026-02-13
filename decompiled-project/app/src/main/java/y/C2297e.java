package y;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.k f26467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297e(r rVar, A.k kVar, Hb.d dVar) {
        super(2, dVar);
        this.f26466b = rVar;
        this.f26467c = kVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2297e(this.f26466b, this.f26467c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2297e) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26465a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            A.i iVar = this.f26466b.f26511E;
            if (iVar != null) {
                A.j jVar = new A.j(this.f26467c);
                this.f26465a = 1;
                if (iVar.a(jVar, this) == aVar) {
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
