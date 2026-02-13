package x;

/* loaded from: classes.dex */
public final class G extends Jb.i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public int f25920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f25921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f25922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Hb.d dVar, Object obj, O o10, i0 i0Var) {
        super(1, dVar);
        this.f25921b = i0Var;
        this.f25922c = o10;
        this.f25923d = obj;
    }

    @Override // Jb.a
    public final Hb.d create(Hb.d dVar) {
        return new G(dVar, this.f25923d, this.f25922c, this.f25921b);
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        return ((G) create((Hb.d) obj)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25920a;
        i0 i0Var = this.f25921b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            F f4 = new F(null, this.f25923d, this.f25922c, i0Var);
            this.f25920a = 1;
            if (cc.F.k(f4, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        i0Var.i();
        return Db.q.f3365a;
    }
}
