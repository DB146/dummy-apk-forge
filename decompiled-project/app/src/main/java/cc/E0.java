package cc;

/* loaded from: classes2.dex */
public final class E0 extends hc.t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E0(Hb.i iVar, Hb.d dVar, int i7) {
        super(dVar, iVar);
        this.f14470e = i7;
    }

    @Override // cc.w0
    public final boolean t(Throwable th) {
        switch (this.f14470e) {
            case 0:
                return false;
            default:
                if (th instanceof gc.q) {
                    return true;
                }
                return p(th);
        }
    }
}
