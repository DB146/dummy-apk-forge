package Q;

/* loaded from: classes.dex */
public final class J0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8315a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.e f8317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f8318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(Rb.e eVar, W w10, Hb.d dVar) {
        super(2, dVar);
        this.f8317c = eVar;
        this.f8318d = w10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        J0 j02 = new J0(this.f8317c, this.f8318d, dVar);
        j02.f8316b = obj;
        return j02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8315a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0497j0 c0497j0 = new C0497j0(this.f8318d, ((cc.E) this.f8316b).l());
            this.f8315a = 1;
            if (this.f8317c.invoke(c0497j0, this) == aVar) {
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
