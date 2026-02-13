package A8;

/* loaded from: classes.dex */
public final class G extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N n6, Hb.d dVar) {
        super(2, dVar);
        this.f548b = n6;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new G(this.f548b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f547a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            N n6 = this.f548b;
            K k = n6.f570d;
            F f4 = new F(n6, 0);
            this.f547a = 1;
            if (k.a(f4, this) == aVar) {
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
