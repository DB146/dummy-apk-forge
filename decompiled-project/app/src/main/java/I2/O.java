package I2;

/* loaded from: classes.dex */
public final class O extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f5065b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(c0 c0Var, Hb.d dVar) {
        super(2, dVar);
        this.f5065b = c0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new O(this.f5065b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5064a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f5064a = 1;
            if (this.f5065b.f(this) == aVar) {
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
