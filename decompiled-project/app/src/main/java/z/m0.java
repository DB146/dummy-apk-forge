package z;

/* loaded from: classes.dex */
public final class m0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f28034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, long j, Hb.d dVar) {
        super(2, dVar);
        this.f28034b = p0Var;
        this.f28035c = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new m0(this.f28034b, this.f28035c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28033a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            p0 p0Var = this.f28034b;
            this.f28033a = 1;
            p0Var.f28061R.getClass();
            if (qVar == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
