package z;

/* loaded from: classes.dex */
public final class B0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f27832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(Y y10, Hb.d dVar) {
        super(2, dVar);
        this.f27832b = y10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new B0(this.f27832b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27831a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f27831a = 1;
            if (this.f27832b.a(this) == aVar) {
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
