package B0;

/* loaded from: classes.dex */
public final class p1 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f1945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.Z f1946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K0 f1947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(fc.Z z8, K0 k02, Hb.d dVar) {
        super(2, dVar);
        this.f1946b = z8;
        this.f1947c = k02;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new p1(this.f1946b, this.f1947c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((p1) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
        return Ib.a.f5345a;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f1945a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            A8.F f4 = new A8.F(this.f1947c, 1);
            this.f1945a = 1;
            if (this.f1946b.a(f4, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        throw new Db.d(0);
    }
}
