package fc;

/* loaded from: classes2.dex */
public final class E extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17059a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h f17061c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f17062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC1161h interfaceC1161h, b0 b0Var, Object obj, Hb.d dVar) {
        super(2, dVar);
        this.f17061c = interfaceC1161h;
        this.f17062d = b0Var;
        this.f17063e = obj;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        E e2 = new E(this.f17061c, this.f17062d, this.f17063e, dVar);
        e2.f17060b = obj;
        return e2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((T) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17059a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            int ordinal = ((T) this.f17060b).ordinal();
            b0 b0Var = this.f17062d;
            if (ordinal == 0) {
                this.f17059a = 1;
                if (this.f17061c.a(b0Var, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 2) {
                R7.a aVar2 = Q.f17098a;
                Object obj2 = this.f17063e;
                if (obj2 == aVar2) {
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                b0Var.i(obj2);
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
