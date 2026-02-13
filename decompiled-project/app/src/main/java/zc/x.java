package zc;

/* loaded from: classes2.dex */
public final class x extends C {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(p pVar, int i7) {
        super(pVar);
        this.f28408d = i7;
    }

    @Override // zc.p
    public final int a() {
        switch (this.f28408d) {
            case 0:
                return this.f28367a.a() * 8;
            case 1:
                return this.f28367a.a() + 2;
            default:
                return this.f28367a.a() + 2;
        }
    }

    @Override // zc.C
    public final boolean g(xc.l lVar, xc.q qVar) {
        switch (this.f28408d) {
            case 0:
                if (lVar == qVar) {
                    return false;
                }
                for (xc.l T10 = qVar.T(); T10 != null; T10 = T10.f26368a) {
                    if (h(lVar, T10)) {
                        return true;
                    }
                    if (T10 == lVar) {
                        return false;
                    }
                }
                return false;
            case 1:
                return this.f28367a.d(lVar, qVar);
            default:
                return !h(lVar, qVar);
        }
    }

    public final String toString() {
        switch (this.f28408d) {
            case 0:
                return String.format("%s ", this.f28367a);
            case 1:
                return String.format(":is(%s)", this.f28367a);
            default:
                return String.format(":not(%s)", this.f28367a);
        }
    }
}
