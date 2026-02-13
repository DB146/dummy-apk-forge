package M1;

/* loaded from: classes.dex */
public final class J extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb.i f6595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0389d f6596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(Rb.e eVar, C0389d c0389d, Hb.d dVar) {
        super(2, dVar);
        this.f6595b = (Jb.i) eVar;
        this.f6596c = c0389d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new J(this.f6595b, this.f6596c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6594a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Object obj2 = this.f6596c.f6660b;
            this.f6594a = 1;
            obj = this.f6595b.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return obj;
    }
}
