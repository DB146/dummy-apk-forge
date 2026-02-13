package M1;

/* loaded from: classes.dex */
public final class E extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f6568a;

    /* renamed from: b, reason: collision with root package name */
    public int f6569b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f6570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Q q10, int i7, Hb.d dVar) {
        super(2, dVar);
        this.f6571d = q10;
        this.f6572e = i7;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        E e2 = new E(this.f6571d, this.f6572e, dVar);
        e2.f6570c = ((Boolean) obj).booleanValue();
        return e2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i7;
        boolean z8;
        b0 b0Var;
        boolean z10;
        Ib.a aVar = Ib.a.f5345a;
        boolean z11 = this.f6569b;
        Q q10 = this.f6571d;
        try {
        } catch (Throwable th2) {
            if (z11 != 0) {
                a0 g = q10.g();
                this.f6568a = th2;
                this.f6570c = z11;
                this.f6569b = 2;
                Integer a9 = g.a();
                if (a9 == aVar) {
                    return aVar;
                }
                z8 = z11;
                th = th2;
                obj = a9;
            } else {
                boolean z12 = z11;
                th = th2;
                i7 = this.f6572e;
                z8 = z12;
            }
        }
        if (z11 == 0) {
            com.bumptech.glide.c.c0(obj);
            boolean z13 = this.f6570c;
            this.f6570c = z13;
            this.f6569b = 1;
            obj = Q.f(q10, z13, this);
            z11 = z13;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z11 != 1) {
                if (z11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z8 = this.f6570c;
                th = this.f6568a;
                com.bumptech.glide.c.c0(obj);
                i7 = ((Number) obj).intValue();
                U u3 = new U(i7, th);
                z10 = z8;
                b0Var = u3;
                return new Db.j(b0Var, Boolean.valueOf(z10));
            }
            boolean z14 = this.f6570c;
            com.bumptech.glide.c.c0(obj);
            z11 = z14;
        }
        b0Var = (b0) obj;
        z10 = z11;
        return new Db.j(b0Var, Boolean.valueOf(z10));
    }
}
