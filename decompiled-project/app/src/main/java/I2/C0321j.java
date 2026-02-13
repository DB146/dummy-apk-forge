package I2;

/* renamed from: I2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321j extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323l f5165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321j(C0323l c0323l, Hb.d dVar) {
        super(2, dVar);
        this.f5165b = c0323l;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C0321j(this.f5165b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0321j) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5164a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C0323l c0323l = this.f5165b;
            this.f5164a = 1;
            if (c0323l.f5170c.f(this) == aVar) {
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
