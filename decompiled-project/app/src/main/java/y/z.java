package y;

/* loaded from: classes.dex */
public final class z extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.i f26546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.h f26547c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cc.S f26548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A.i iVar, A.h hVar, cc.S s3, Hb.d dVar) {
        super(2, dVar);
        this.f26546b = iVar;
        this.f26547c = hVar;
        this.f26548d = s3;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new z(this.f26546b, this.f26547c, this.f26548d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26545a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f26545a = 1;
            if (this.f26546b.a(this.f26547c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        cc.S s3 = this.f26548d;
        if (s3 != null) {
            s3.b();
        }
        return Db.q.f3365a;
    }
}
