package x;

/* loaded from: classes.dex */
public final class J extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25930a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f25934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f25935f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f25936u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Object obj, Object obj2, O o10, i0 i0Var, float f4, Hb.d dVar) {
        super(2, dVar);
        this.f25932c = obj;
        this.f25933d = obj2;
        this.f25934e = o10;
        this.f25935f = i0Var;
        this.f25936u = f4;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        J j = new J(this.f25932c, this.f25933d, this.f25934e, this.f25935f, this.f25936u, dVar);
        j.f25931b = obj;
        return j;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25930a;
        Db.q qVar = Db.q.f3365a;
        O o10 = this.f25934e;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            cc.E e2 = (cc.E) this.f25931b;
            Object obj2 = this.f25932c;
            Object obj3 = this.f25933d;
            if (kotlin.jvm.internal.l.a(obj2, obj3)) {
                o10.f25960B = null;
                if (kotlin.jvm.internal.l.a(o10.f25965c.getValue(), obj2)) {
                    return qVar;
                }
            } else {
                O.K(o10);
            }
            boolean a9 = kotlin.jvm.internal.l.a(obj2, obj3);
            float f4 = this.f25936u;
            if (!a9) {
                i0 i0Var = this.f25935f;
                i0Var.p(obj2);
                i0Var.n(0L);
                o10.f25964b.setValue(obj2);
                i0Var.j(f4);
            }
            o10.T(f4);
            if (o10.f25959A.h()) {
                cc.F.B(e2, null, 0, new I(o10, null), 3);
            } else {
                o10.f25974z = Long.MIN_VALUE;
            }
            this.f25930a = 1;
            if (O.O(o10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        o10.S();
        return qVar;
    }
}
