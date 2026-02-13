package A0;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, int i7) {
        super(0);
        this.f249a = i7;
        this.f250b = n0Var;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f249a) {
            case 0:
                n0 n0Var = this.f250b;
                j0.l lVar = n0Var.f288P;
                kotlin.jvm.internal.l.b(lVar);
                n0Var.m0(lVar, n0Var.f287O);
                return Db.q.f3365a;
            default:
                n0 n0Var2 = this.f250b.f275B;
                if (n0Var2 != null) {
                    n0Var2.A0();
                }
                return Db.q.f3365a;
        }
    }
}
