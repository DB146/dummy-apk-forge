package B0;

/* loaded from: classes.dex */
public final class v1 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f2006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f2007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(y1 y1Var, Hb.d dVar) {
        super(2, dVar);
        this.f2007b = y1Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new v1(this.f2007b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f2006a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            D d10 = this.f2007b.f2021a;
            this.f2006a = 1;
            Object l10 = d10.f1582D.l(this);
            if (l10 != aVar) {
                l10 = qVar;
            }
            if (l10 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
