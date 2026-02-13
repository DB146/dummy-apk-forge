package x;

/* loaded from: classes.dex */
public final class I extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f25929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(O o10, Hb.d dVar) {
        super(2, dVar);
        this.f25929b = o10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new I(this.f25929b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25928a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f25928a = 1;
            if (O.M(this.f25929b, this) == aVar) {
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
