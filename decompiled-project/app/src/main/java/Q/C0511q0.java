package Q;

/* renamed from: Q.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511q0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8488a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0516t0 f8490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f8491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511q0(C0516t0 c0516t0, T t5, Hb.d dVar) {
        super(2, dVar);
        this.f8490c = c0516t0;
        this.f8491d = t5;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0511q0 c0511q0 = new C0511q0(this.f8490c, this.f8491d, dVar);
        c0511q0.f8489b = obj;
        return c0511q0;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0511q0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f8488a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
            return Db.q.f3365a;
        }
        com.bumptech.glide.c.c0(obj);
        cc.E e2 = (cc.E) this.f8489b;
        this.f8488a = 1;
        this.f8490c.a(e2, this.f8491d, this);
        return aVar;
    }
}
