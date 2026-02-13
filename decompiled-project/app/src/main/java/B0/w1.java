package B0;

/* loaded from: classes.dex */
public final class w1 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f2010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f2011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, Hb.d dVar) {
        super(2, dVar);
        this.f2011b = y1Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new w1(this.f2011b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f2010a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            D d10 = this.f2011b.f2021a;
            this.f2010a = 1;
            Object a9 = d10.f1584E.a(this);
            if (a9 != aVar) {
                a9 = qVar;
            }
            if (a9 == aVar) {
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
