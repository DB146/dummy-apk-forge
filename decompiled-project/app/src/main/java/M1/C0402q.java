package M1;

/* renamed from: M1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402q extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f6710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402q(b0 b0Var, Hb.d dVar) {
        super(2, dVar);
        this.f6710b = b0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0402q c0402q = new C0402q(this.f6710b, dVar);
        c0402q.f6709a = obj;
        return c0402q;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0402q) create((b0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        b0 b0Var = (b0) this.f6709a;
        return Boolean.valueOf((b0Var instanceof C0389d) && b0Var.f6658a <= this.f6710b.f6658a);
    }
}
