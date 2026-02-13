package y;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2294b extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.i f26451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.g f26452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2294b(A.i iVar, A.g gVar, Hb.d dVar) {
        super(2, dVar);
        this.f26451b = iVar;
        this.f26452c = gVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2294b(this.f26451b, this.f26452c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2294b) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26450a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f26450a = 1;
            if (this.f26451b.a(this.f26452c, this) == aVar) {
                return aVar;
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
