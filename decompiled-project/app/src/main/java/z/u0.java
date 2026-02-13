package z;

/* loaded from: classes.dex */
public final class u0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public long f28103a;

    /* renamed from: b, reason: collision with root package name */
    public int f28104b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f28105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f28106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, Hb.d dVar) {
        super(2, dVar);
        this.f28106d = w0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        u0 u0Var = new u0(this.f28106d, dVar);
        u0Var.f28105c = ((V0.p) obj).f9990a;
        return u0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((V0.p) obj).f9990a;
        u0 u0Var = new u0(this.f28106d, (Hb.d) obj2);
        u0Var.f28105c = j;
        return u0Var.invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Object b2;
        Object b10;
        long j10;
        long j11;
        Object a9;
        long j12;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28104b;
        w0 w0Var = this.f28106d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            j = this.f28105c;
            t0.d dVar = w0Var.f28126f;
            this.f28105c = j;
            this.f28104b = 1;
            b2 = dVar.b(j, this);
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j13 = this.f28103a;
                    j12 = this.f28105c;
                    com.bumptech.glide.c.c0(obj);
                    j11 = j13;
                    a9 = obj;
                    return new V0.p(V0.p.d(j12, V0.p.d(j11, ((V0.p) a9).f9990a)));
                }
                j10 = this.f28103a;
                j = this.f28105c;
                com.bumptech.glide.c.c0(obj);
                b10 = obj;
                j11 = ((V0.p) b10).f9990a;
                t0.d dVar2 = w0Var.f28126f;
                long d10 = V0.p.d(j10, j11);
                this.f28105c = j;
                this.f28103a = j11;
                this.f28104b = 3;
                a9 = dVar2.a(d10, j11, this);
                if (a9 != aVar) {
                    return aVar;
                }
                j12 = j;
                return new V0.p(V0.p.d(j12, V0.p.d(j11, ((V0.p) a9).f9990a)));
            }
            j = this.f28105c;
            com.bumptech.glide.c.c0(obj);
            b2 = obj;
        }
        long d11 = V0.p.d(j, ((V0.p) b2).f9990a);
        this.f28105c = j;
        this.f28103a = d11;
        this.f28104b = 2;
        b10 = w0Var.b(d11, this);
        if (b10 == aVar) {
            return aVar;
        }
        j10 = d11;
        j11 = ((V0.p) b10).f9990a;
        t0.d dVar22 = w0Var.f28126f;
        long d102 = V0.p.d(j10, j11);
        this.f28105c = j;
        this.f28103a = j11;
        this.f28104b = 3;
        a9 = dVar22.a(d102, j11, this);
        if (a9 != aVar) {
        }
    }
}
