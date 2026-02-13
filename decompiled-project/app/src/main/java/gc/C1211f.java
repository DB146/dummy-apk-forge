package gc;

/* renamed from: gc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1211f extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17512a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1212g f17514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1211f(AbstractC1212g abstractC1212g, Hb.d dVar) {
        super(2, dVar);
        this.f17514c = abstractC1212g;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C1211f c1211f = new C1211f(this.f17514c, dVar);
        c1211f.f17513b = obj;
        return c1211f;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1211f) create((ec.r) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17512a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            ec.r rVar = (ec.r) this.f17513b;
            this.f17512a = 1;
            if (this.f17514c.d(rVar, this) == aVar) {
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
