package A0;

import y0.AbstractC2322G;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y10, t0 t0Var, long j) {
        super(0);
        this.f131a = y10;
        this.f132b = t0Var;
        this.f133c = j;
    }

    @Override // Rb.a
    public final Object invoke() {
        U r02;
        Y y10 = this.f131a;
        boolean p10 = AbstractC0017g.p(y10.f145f.f93a);
        P p11 = y10.f145f;
        AbstractC2322G abstractC2322G = null;
        if (p10 || p11.f95c) {
            n0 n0Var = p11.a().f275B;
            if (n0Var != null) {
                abstractC2322G = n0Var.f116w;
            }
        } else {
            n0 n0Var2 = p11.a().f275B;
            if (n0Var2 != null && (r02 = n0Var2.r0()) != null) {
                abstractC2322G = r02.f116w;
            }
        }
        if (abstractC2322G == null) {
            abstractC2322G = ((B0.D) this.f132b).getPlacementScope();
        }
        U r03 = p11.a().r0();
        kotlin.jvm.internal.l.b(r03);
        AbstractC2322G.f(abstractC2322G, r03, this.f133c);
        return Db.q.f3365a;
    }
}
