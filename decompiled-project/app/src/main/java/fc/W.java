package fc;

/* loaded from: classes2.dex */
public final class W extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public int f17110a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC1162i f17111b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f17112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f17113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y10, Hb.d dVar) {
        super(3, dVar);
        this.f17113d = y10;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        W w10 = new W(this.f17113d, (Hb.d) obj3);
        w10.f17111b = (InterfaceC1162i) obj;
        w10.f17112c = intValue;
        return w10.invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1162i interfaceC1162i;
        T t5;
        T t10;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17110a;
        Y y10 = this.f17113d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    interfaceC1162i = this.f17111b;
                    com.bumptech.glide.c.c0(obj);
                    y10.getClass();
                    t5 = T.f17104b;
                    this.f17111b = interfaceC1162i;
                    this.f17110a = 3;
                    if (interfaceC1162i.emit(t5, this) == aVar) {
                        return aVar;
                    }
                } else if (i7 == 3) {
                    interfaceC1162i = this.f17111b;
                    com.bumptech.glide.c.c0(obj);
                } else {
                    if (i7 == 4) {
                        interfaceC1162i = this.f17111b;
                        com.bumptech.glide.c.c0(obj);
                        t10 = T.f17105c;
                        this.f17111b = null;
                        this.f17110a = 5;
                        if (interfaceC1162i.emit(t10, this) == aVar) {
                            return aVar;
                        }
                        return Db.q.f3365a;
                    }
                    if (i7 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            com.bumptech.glide.c.c0(obj);
            return Db.q.f3365a;
        }
        com.bumptech.glide.c.c0(obj);
        interfaceC1162i = this.f17111b;
        if (this.f17112c > 0) {
            T t11 = T.f17103a;
            this.f17110a = 1;
            if (interfaceC1162i.emit(t11, this) == aVar) {
                return aVar;
            }
            return Db.q.f3365a;
        }
        y10.getClass();
        this.f17111b = interfaceC1162i;
        this.f17110a = 2;
        if (cc.F.l(0L, this) == aVar) {
            return aVar;
        }
        y10.getClass();
        t5 = T.f17104b;
        this.f17111b = interfaceC1162i;
        this.f17110a = 3;
        if (interfaceC1162i.emit(t5, this) == aVar) {
        }
        y10.getClass();
        this.f17111b = interfaceC1162i;
        this.f17110a = 4;
        if (cc.F.l(Long.MAX_VALUE, this) == aVar) {
            return aVar;
        }
        t10 = T.f17105c;
        this.f17111b = null;
        this.f17110a = 5;
        if (interfaceC1162i.emit(t10, this) == aVar) {
        }
        return Db.q.f3365a;
    }
}
