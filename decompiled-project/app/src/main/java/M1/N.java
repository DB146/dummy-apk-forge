package M1;

/* loaded from: classes.dex */
public final class N extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f6607a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q10, Hb.d dVar) {
        super(2, dVar);
        this.f6609c = q10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        N n6 = new N(this.f6609c, dVar);
        n6.f6608b = obj;
        return n6;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((T) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6607a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            T t5 = (T) this.f6608b;
            this.f6607a = 1;
            if (Q.c(this.f6609c, t5, this) == aVar) {
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
