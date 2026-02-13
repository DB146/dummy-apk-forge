package zc;

/* loaded from: classes2.dex */
public final class B extends C {
    @Override // zc.p
    public final int a() {
        return this.f28367a.a() * 3;
    }

    @Override // zc.C
    public final boolean g(xc.l lVar, xc.q qVar) {
        if (lVar == qVar) {
            return false;
        }
        xc.l lVar2 = qVar.f26368a;
        for (xc.q H10 = lVar2 != null ? lVar2.H() : qVar; H10 != null && H10 != qVar; H10 = H10.M()) {
            if (h(lVar, H10)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", this.f28367a);
    }
}
