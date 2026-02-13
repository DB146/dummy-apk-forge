package zc;

/* loaded from: classes2.dex */
public final class A extends C {
    @Override // zc.p
    public final int a() {
        return this.f28367a.a() + 2;
    }

    @Override // zc.C
    public final boolean g(xc.l lVar, xc.q qVar) {
        xc.q qVar2;
        if (lVar == qVar) {
            return false;
        }
        if (!this.f28368b) {
            qVar.getClass();
            while (true) {
                qVar = qVar.U();
                if (qVar == null) {
                    qVar2 = null;
                    break;
                }
                if (qVar instanceof xc.l) {
                    qVar2 = (xc.l) qVar;
                    break;
                }
            }
        } else {
            qVar2 = qVar.U();
        }
        return qVar2 != null && h(lVar, qVar2);
    }

    public final String toString() {
        return String.format("%s + ", this.f28367a);
    }
}
