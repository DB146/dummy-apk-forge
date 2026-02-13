package z;

import y.C2305m;

/* renamed from: z.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2562j0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f28014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562j0(p0 p0Var, long j, Hb.d dVar) {
        super(2, dVar);
        this.f28014b = p0Var;
        this.f28015c = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2562j0(this.f28014b, this.f28015c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2562j0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == Ib.a.f5345a) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r3 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r8 == Ib.a.f5345a) goto L21;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = Ib.a.f5345a;
        int i7 = this.f28013a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            w0 w0Var = this.f28014b.f28061R;
            this.f28013a = 1;
            long j = this.f28015c;
            Object obj4 = Db.q.f3365a;
            long a9 = V0.p.a(j, 0.0f, 0.0f, w0Var.f28124d == V.f27944b ? 1 : 2);
            u0 u0Var = new u0(w0Var, null);
            C2305m c2305m = w0Var.f28122b;
            if (c2305m == null || !(w0Var.f28121a.c() || w0Var.f28121a.b())) {
                u0 u0Var2 = new u0(u0Var.f28106d, this);
                u0Var2.f28105c = a9;
                Object invokeSuspend = u0Var2.invokeSuspend(obj4);
                obj2 = invokeSuspend;
            } else {
                Object b2 = c2305m.b(a9, u0Var, this);
                obj2 = b2;
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
