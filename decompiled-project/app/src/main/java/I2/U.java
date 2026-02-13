package I2;

/* loaded from: classes.dex */
public final class U extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5086a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f5088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(c0 c0Var, Hb.d dVar) {
        super(2, dVar);
        this.f5088c = c0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        U u3 = new U(this.f5088c, dVar);
        u3.f5087b = obj;
        return u3;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((K2.r) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5086a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            K2.r rVar = (K2.r) this.f5087b;
            this.f5086a = 1;
            obj = c0.a(this.f5088c, rVar, this);
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
