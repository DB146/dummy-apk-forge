package y;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2298f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.k f26470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2298f(r rVar, A.k kVar, Hb.d dVar) {
        super(2, dVar);
        this.f26469b = rVar;
        this.f26470c = kVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2298f(this.f26469b, this.f26470c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2298f) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26468a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            A.i iVar = this.f26469b.f26511E;
            if (iVar != null) {
                this.f26468a = 1;
                if (iVar.a(this.f26470c, this) == aVar) {
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
