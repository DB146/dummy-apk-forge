package fc;

/* renamed from: fc.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1164k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1173u f17155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1164k(C1173u c1173u, Hb.d dVar) {
        super(2, dVar);
        this.f17155b = c1173u;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C1164k(this.f17155b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1164k) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17154a;
        Db.q qVar = Db.q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f17154a = 1;
            Object a9 = this.f17155b.a(gc.y.f17563a, this);
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
