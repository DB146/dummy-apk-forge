package Q;

/* loaded from: classes.dex */
public final class K0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8320a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.e f8322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f8323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(Rb.e eVar, W w10, Hb.d dVar) {
        super(2, dVar);
        this.f8322c = eVar;
        this.f8323d = w10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        K0 k02 = new K0(this.f8322c, this.f8323d, dVar);
        k02.f8321b = obj;
        return k02;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8320a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0497j0 c0497j0 = new C0497j0(this.f8323d, ((cc.E) this.f8321b).l());
            this.f8320a = 1;
            if (this.f8322c.invoke(c0497j0, this) == aVar) {
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
