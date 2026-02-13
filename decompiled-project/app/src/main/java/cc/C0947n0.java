package cc;

/* renamed from: cc.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0947n0 extends C0944m {

    /* renamed from: w, reason: collision with root package name */
    public final w0 f14555w;

    public C0947n0(Hb.d dVar, w0 w0Var) {
        super(1, dVar);
        this.f14555w = w0Var;
    }

    @Override // cc.C0944m
    public final Throwable q(w0 w0Var) {
        Throwable b2;
        Object C2 = this.f14555w.C();
        return (!(C2 instanceof p0) || (b2 = ((p0) C2).b()) == null) ? C2 instanceof C0955v ? ((C0955v) C2).f14583a : w0Var.getCancellationException() : b2;
    }

    @Override // cc.C0944m
    public final String y() {
        return "AwaitContinuation";
    }
}
