package z;

/* renamed from: z.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2564k0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28023b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2564k0(long j, Hb.d dVar) {
        super(2, dVar);
        this.f28023b = j;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2564k0 c2564k0 = new C2564k0(this.f28023b, dVar);
        c2564k0.f28022a = obj;
        return c2564k0;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C2564k0 c2564k0 = (C2564k0) create((t0) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c2564k0.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        w0 w0Var = ((t0) this.f28022a).f28085a;
        w0.a(w0Var, w0Var.j, this.f28023b, 1);
        return Db.q.f3365a;
    }
}
