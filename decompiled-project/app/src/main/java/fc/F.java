package fc;

/* loaded from: classes2.dex */
public final class F extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f17064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f17065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1161h f17066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f17067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Y y10, InterfaceC1161h interfaceC1161h, b0 b0Var, Object obj, Hb.d dVar) {
        super(2, dVar);
        this.f17065b = y10;
        this.f17066c = interfaceC1161h;
        this.f17067d = b0Var;
        this.f17068e = obj;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new F(this.f17065b, this.f17066c, this.f17067d, this.f17068e, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v9, types: [Jb.i, Rb.e] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f17064a;
        Db.q qVar = Db.q.f3365a;
        InterfaceC1161h interfaceC1161h = this.f17066c;
        b0 b0Var = this.f17067d;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    com.bumptech.glide.c.c0(obj);
                    this.f17064a = 3;
                    return interfaceC1161h.a(b0Var, this) != aVar ? aVar : qVar;
                }
                if (i7 != 3 && i7 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            com.bumptech.glide.c.c0(obj);
        }
        com.bumptech.glide.c.c0(obj);
        V v10 = U.f17107a;
        Y y10 = this.f17065b;
        if (y10 == v10) {
            this.f17064a = 1;
            if (interfaceC1161h.a(b0Var, this) == aVar) {
                return aVar;
            }
        } else if (y10 == U.f17108b) {
            gc.F g = b0Var.g();
            ?? iVar = new Jb.i(2, null);
            this.f17064a = 2;
            if (Q.k(g, iVar, this) == aVar) {
                return aVar;
            }
            this.f17064a = 3;
            if (interfaceC1161h.a(b0Var, this) != aVar) {
            }
        } else {
            gc.F g2 = b0Var.g();
            W w10 = new W(y10, null);
            int i10 = AbstractC1178z.f17213a;
            Hb.j jVar = Hb.j.f4919a;
            InterfaceC1161h h10 = Q.h(Q.h(new C1173u(new gc.n(w10, g2, jVar, -2, 1), new Jb.i(2, null), 0)));
            E e2 = new E(interfaceC1161h, b0Var, this.f17068e, null);
            this.f17064a = 4;
            Object a9 = Q.f(new gc.n(new C1177y(e2, null), h10, jVar, -2, 1), 0).a(gc.y.f17563a, this);
            if (a9 != aVar) {
                a9 = qVar;
            }
            if (a9 != aVar) {
                a9 = qVar;
            }
            if (a9 == aVar) {
                return aVar;
            }
        }
    }
}
