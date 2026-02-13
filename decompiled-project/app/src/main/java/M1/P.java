package M1;

/* loaded from: classes.dex */
public final class P extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.t f6614a;

    /* renamed from: b, reason: collision with root package name */
    public int f6615b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t f6617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f6618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6619f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f6620u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(kotlin.jvm.internal.t tVar, Q q10, Object obj, boolean z8, Hb.d dVar) {
        super(2, dVar);
        this.f6617d = tVar;
        this.f6618e = q10;
        this.f6619f = obj;
        this.f6620u = z8;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        P p10 = new P(this.f6617d, this.f6618e, this.f6619f, this.f6620u, dVar);
        p10.f6616c = obj;
        return p10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((O1.k) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.t tVar;
        O1.k kVar;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f6615b;
        kotlin.jvm.internal.t tVar2 = this.f6617d;
        Object obj2 = this.f6619f;
        Q q10 = this.f6618e;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            O1.k kVar2 = (O1.k) this.f6616c;
            a0 g = q10.g();
            this.f6616c = kVar2;
            this.f6614a = tVar2;
            this.f6615b = 1;
            Integer num = new Integer(g.f6656b.f6654a.incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            tVar = tVar2;
            kVar = kVar2;
            obj = num;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                if (this.f6620u) {
                    q10.f6627h.y(new C0389d(obj2, obj2 != null ? obj2.hashCode() : 0, tVar2.f19132a));
                }
                return Db.q.f3365a;
            }
            tVar = this.f6614a;
            kVar = (O1.k) this.f6616c;
            com.bumptech.glide.c.c0(obj);
        }
        tVar.f19132a = ((Number) obj).intValue();
        this.f6616c = null;
        this.f6614a = null;
        this.f6615b = 2;
        if (kVar.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f6620u) {
        }
        return Db.q.f3365a;
    }
}
