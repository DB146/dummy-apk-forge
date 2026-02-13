package y;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2293a extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.i f26448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.f f26449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293a(A.i iVar, A.f fVar, Hb.d dVar) {
        super(2, dVar);
        this.f26448b = iVar;
        this.f26449c = fVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2293a(this.f26448b, this.f26449c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2293a) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26447a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f26447a = 1;
            if (this.f26448b.a(this.f26449c, this) == aVar) {
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
