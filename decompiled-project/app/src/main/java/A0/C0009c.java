package A0;

/* renamed from: A0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009c extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0011d f168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0009c(C0011d c0011d, int i7) {
        super(0);
        this.f167a = i7;
        this.f168b = c0011d;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f167a) {
            case 0:
                this.f168b.s0();
                return Db.q.f3365a;
            default:
                C0011d c0011d = this.f168b;
                c0.k kVar = c0011d.f199C;
                kotlin.jvm.internal.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                C.v vVar = (C.v) kVar;
                C.O o10 = (C.O) c0011d.w(C.T.f2390a);
                if (!kotlin.jvm.internal.l.a(o10, vVar.f2441b)) {
                    vVar.f2441b = o10;
                    vVar.f2440a.invoke(o10);
                }
                return Db.q.f3365a;
        }
    }
}
