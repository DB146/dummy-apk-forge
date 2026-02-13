package gc;

import fc.InterfaceC1161h;

/* loaded from: classes2.dex */
public final class o extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h f17537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f17538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC1161h interfaceC1161h, D d10, Hb.d dVar) {
        super(2, dVar);
        this.f17537b = interfaceC1161h;
        this.f17538c = d10;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new o(this.f17537b, this.f17538c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17536a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f17536a = 1;
            if (this.f17537b.a(this.f17538c, this) == aVar) {
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
