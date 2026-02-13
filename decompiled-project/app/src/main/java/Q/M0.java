package Q;

/* loaded from: classes.dex */
public final class M0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.Z f8335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0497j0 f8336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(fc.Z z8, C0497j0 c0497j0, Hb.d dVar) {
        super(2, dVar);
        this.f8335b = z8;
        this.f8336c = c0497j0;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new M0(this.f8335b, this.f8336c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8334a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            L0 l02 = new L0(this.f8336c, 1);
            this.f8334a = 1;
            if (this.f8335b.a(l02, this) == aVar) {
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
