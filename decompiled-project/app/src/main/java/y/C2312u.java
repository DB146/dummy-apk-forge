package y;

/* renamed from: y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2312u extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2313v f26528b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312u(C2313v c2313v, Hb.d dVar) {
        super(2, dVar);
        this.f26528b = c2313v;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2312u(this.f26528b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2312u) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26527a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
            return Db.q.f3365a;
        }
        com.bumptech.glide.c.c0(obj);
        ?? obj2 = new Object();
        Object obj3 = new Object();
        ?? obj4 = new Object();
        C2313v c2313v = this.f26528b;
        fc.P p10 = c2313v.f26529C.f4a;
        I2.Q q10 = new I2.Q(obj2, obj3, obj4, c2313v, 2);
        this.f26527a = 1;
        p10.getClass();
        fc.P.j(p10, q10, this);
        return aVar;
    }
}
