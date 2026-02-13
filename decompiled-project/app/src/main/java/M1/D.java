package M1;

/* loaded from: classes.dex */
public final class D extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f6565a;

    /* renamed from: b, reason: collision with root package name */
    public int f6566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f6567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Q q10, Hb.d dVar) {
        super(1, dVar);
        this.f6567c = q10;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new D(this.f6567c, dVar);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((D) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        b0 b0Var;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6566b;
        Q q10 = this.f6567c;
        try {
        } catch (Throwable th2) {
            a0 g = q10.g();
            this.f6565a = th2;
            this.f6566b = 2;
            Integer a9 = g.a();
            if (a9 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a9;
        }
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f6566b = 1;
            obj = Q.f(q10, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f6565a;
                com.bumptech.glide.c.c0(obj);
                b0Var = new U(((Number) obj).intValue(), th);
                return new Db.j(b0Var, Boolean.TRUE);
            }
            com.bumptech.glide.c.c0(obj);
        }
        b0Var = (b0) obj;
        return new Db.j(b0Var, Boolean.TRUE);
    }
}
