package I2;

/* loaded from: classes.dex */
public final class W extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f5093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0320i f5094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(c0 c0Var, C0320i c0320i, Hb.d dVar) {
        super(2, dVar);
        this.f5093b = c0Var;
        this.f5094c = c0320i;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new W(this.f5093b, this.f5094c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5092a;
        C0320i c0320i = this.f5094c;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                c0 c0Var = this.f5093b;
                this.f5092a = 1;
                obj = c0.b(c0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
            c0320i.invoke();
            return Db.q.f3365a;
        } catch (Throwable th) {
            c0320i.invoke();
            throw th;
        }
    }
}
