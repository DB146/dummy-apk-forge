package z;

/* loaded from: classes.dex */
public final class s0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public w0 f28077a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.u f28078b;

    /* renamed from: c, reason: collision with root package name */
    public long f28079c;

    /* renamed from: d, reason: collision with root package name */
    public int f28080d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f28082f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f28083u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f28084v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(w0 w0Var, kotlin.jvm.internal.u uVar, long j, Hb.d dVar) {
        super(2, dVar);
        this.f28082f = w0Var;
        this.f28083u = uVar;
        this.f28084v = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        s0 s0Var = new s0(this.f28082f, this.f28083u, this.f28084v, dVar);
        s0Var.f28081e = obj;
        return s0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((t0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        kotlin.jvm.internal.u uVar;
        long j;
        w0 w0Var2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28080d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            t0 t0Var = (t0) this.f28081e;
            w0Var = this.f28082f;
            r0 r0Var = new r0(w0Var, t0Var);
            C2565l c2565l = w0Var.f28123c;
            uVar = this.f28083u;
            long j10 = uVar.f19133a;
            V v10 = w0Var.f28124d;
            V v11 = V.f27944b;
            long j11 = this.f28084v;
            float c10 = w0Var.c(v10 == v11 ? V0.p.b(j11) : V0.p.c(j11));
            this.f28081e = w0Var;
            this.f28077a = w0Var;
            this.f28078b = uVar;
            this.f28079c = j10;
            this.f28080d = 1;
            c2565l.getClass();
            obj = cc.F.K(c2565l.f28025b, new C2563k(c10, c2565l, r0Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j = j10;
            w0Var2 = w0Var;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f28079c;
            uVar = this.f28078b;
            w0Var = this.f28077a;
            w0Var2 = (w0) this.f28081e;
            com.bumptech.glide.c.c0(obj);
        }
        float c11 = w0Var2.c(((Number) obj).floatValue());
        uVar.f19133a = w0Var.f28124d == V.f27944b ? V0.p.a(j, c11, 0.0f, 2) : V0.p.a(j, 0.0f, c11, 1);
        return Db.q.f3365a;
    }
}
