package fc;

/* renamed from: fc.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1177y extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public int f17209a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC1162i f17210b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17211c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f17212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177y(E e2, Hb.d dVar) {
        super(3, dVar);
        this.f17212d = e2;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        C1177y c1177y = new C1177y(this.f17212d, (Hb.d) obj3);
        c1177y.f17210b = (InterfaceC1162i) obj;
        c1177y.f17211c = obj2;
        return c1177y.invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1162i interfaceC1162i;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17209a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            interfaceC1162i = this.f17210b;
            Object obj2 = this.f17211c;
            this.f17210b = interfaceC1162i;
            this.f17209a = 1;
            obj = this.f17212d.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                return Db.q.f3365a;
            }
            interfaceC1162i = this.f17210b;
            com.bumptech.glide.c.c0(obj);
        }
        this.f17210b = null;
        this.f17209a = 2;
        if (interfaceC1162i.emit(obj, this) == aVar) {
            return aVar;
        }
        return Db.q.f3365a;
    }
}
