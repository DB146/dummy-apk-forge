package z;

/* loaded from: classes.dex */
public final class v0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28108a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f28110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb.i f28111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(w0 w0Var, Rb.e eVar, Hb.d dVar) {
        super(2, dVar);
        this.f28110c = w0Var;
        this.f28111d = (Jb.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        v0 v0Var = new v0(this.f28110c, this.f28111d, dVar);
        v0Var.f28109b = obj;
        return v0Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((Z) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28108a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Z z8 = (Z) this.f28109b;
            w0 w0Var = this.f28110c;
            w0Var.j = z8;
            this.f28108a = 1;
            if (this.f28111d.invoke(w0Var.k, this) == aVar) {
                return aVar;
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
