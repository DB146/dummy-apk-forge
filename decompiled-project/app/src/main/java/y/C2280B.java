package y;

/* renamed from: y.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2280B extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f26390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2281C f26391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2280B(C2281C c2281c, Hb.d dVar) {
        super(2, dVar);
        this.f26391b = c2281c;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C2280B(this.f26391b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2280B) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f26390a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f26390a = 1;
            if (q3.f.f(this.f26391b, null, this) == aVar) {
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
