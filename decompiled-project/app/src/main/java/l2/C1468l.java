package l2;

import cc.z0;
import kc.C1441d;

/* renamed from: l2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1468l extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f19223a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1456G f19225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468l(AbstractC1456G abstractC1456G, Hb.d dVar) {
        super(2, dVar);
        this.f19225c = abstractC1456G;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C1468l c1468l = new C1468l(this.f19225c, dVar);
        c1468l.f19224b = obj;
        return c1468l;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((C1468l) create((ec.r) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
        return Ib.a.f5345a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l2.I, int] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ib.a aVar = Ib.a.f5345a;
        ?? r22 = this.f19223a;
        AbstractC1456G abstractC1456G = this.f19225c;
        try {
            if (r22 == 0) {
                com.bumptech.glide.c.c0(obj);
                C1465i c1465i = new C1465i((ec.r) this.f19224b, 0);
                C1441d c1441d = cc.P.f14498a;
                dc.d dVar = hc.o.f17967a.f16631f;
                C1466j c1466j = new C1466j(abstractC1456G, c1465i, null);
                this.f19224b = c1465i;
                this.f19223a = 1;
                obj2 = c1465i;
                if (cc.F.K(dVar, c1466j, this) == aVar) {
                    return aVar;
                }
            } else {
                if (r22 != 1) {
                    if (r22 == 2) {
                        com.bumptech.glide.c.c0(obj);
                        throw new Db.d(0);
                    }
                    if (r22 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.f19224b;
                    com.bumptech.glide.c.c0(obj);
                    throw th;
                }
                Object obj3 = (I) this.f19224b;
                com.bumptech.glide.c.c0(obj);
                obj2 = obj3;
            }
            this.f19224b = obj2;
            this.f19223a = 2;
            cc.F.g(this);
            return aVar;
        } catch (Throwable th2) {
            C1441d c1441d2 = cc.P.f14498a;
            dc.d dVar2 = hc.o.f17967a.f16631f;
            z0 z0Var = z0.f14594b;
            dVar2.getClass();
            Hb.i w10 = E6.b.w(dVar2, z0Var);
            C1467k c1467k = new C1467k(abstractC1456G, r22, null);
            this.f19224b = th2;
            this.f19223a = 3;
            if (cc.F.K(w10, c1467k, this) == aVar) {
                return aVar;
            }
            throw th2;
        }
    }
}
