package l2;

/* renamed from: l2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475t extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1476u f19234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1475t(C1476u c1476u, Hb.d dVar) {
        super(2, dVar);
        this.f19234b = c1476u;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C1475t c1475t = new C1475t(this.f19234b, dVar);
        c1475t.f19233a = obj;
        return c1475t;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C1475t c1475t = (C1475t) create((cc.E) obj, (Hb.d) obj2);
        Db.q qVar = Db.q.f3365a;
        c1475t.invokeSuspend(qVar);
        return qVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        cc.E e2 = (cc.E) this.f19233a;
        C1476u c1476u = this.f19234b;
        C1481z c1481z = c1476u.f19235a;
        if (c1481z.f19242d.compareTo(EnumC1474s.f19228b) >= 0) {
            c1481z.a(c1476u);
        } else {
            cc.F.h(e2.l(), null);
        }
        return Db.q.f3365a;
    }
}
