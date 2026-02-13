package G;

import A0.K;
import A0.n0;
import B0.c1;
import Db.q;
import Jb.i;
import cc.E;
import cc.F;

/* loaded from: classes.dex */
public final class d extends i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f4233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K f4234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f4235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, n0 n0Var, K k, c1 c1Var, Hb.d dVar) {
        super(2, dVar);
        this.f4232b = eVar;
        this.f4233c = n0Var;
        this.f4234d = k;
        this.f4235e = c1Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        K k = this.f4234d;
        c1 c1Var = this.f4235e;
        d dVar2 = new d(this.f4232b, this.f4233c, k, c1Var, dVar);
        dVar2.f4231a = obj;
        return dVar2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        com.bumptech.glide.c.c0(obj);
        E e2 = (E) this.f4231a;
        n0 n0Var = this.f4233c;
        K k = this.f4234d;
        e eVar = this.f4232b;
        F.B(e2, null, 0, new b(eVar, n0Var, k, null), 3);
        return F.B(e2, null, 0, new c(eVar, this.f4235e, null), 3);
    }
}
