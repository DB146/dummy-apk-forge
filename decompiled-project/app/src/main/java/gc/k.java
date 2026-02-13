package gc;

import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class k extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f17523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f17524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC1162i interfaceC1162i, Object obj, Hb.d dVar) {
        super(2, dVar);
        this.f17523b = nVar;
        this.f17524c = interfaceC1162i;
        this.f17525d = obj;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new k(this.f17523b, this.f17524c, this.f17525d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Jb.i, Rb.f] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17522a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            ?? r42 = this.f17523b.f17535e;
            this.f17522a = 1;
            if (r42.a(this.f17524c, this.f17525d, this) == aVar) {
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
