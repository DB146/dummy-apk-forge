package zc;

import java.util.Arrays;
import java.util.List;

/* renamed from: zc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2611c extends d {
    public C2611c(p... pVarArr) {
        List asList = Arrays.asList(pVarArr);
        if (this.f28372c > 1) {
            this.f28370a.add(new C2610b(asList));
        } else {
            this.f28370a.addAll(asList);
        }
        g();
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        for (int i7 = 0; i7 < this.f28372c; i7++) {
            if (((p) this.f28371b.get(i7)).b(lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // zc.p
    public final boolean c(xc.l lVar, xc.p pVar) {
        for (int i7 = 0; i7 < this.f28372c; i7++) {
            if (((p) this.f28371b.get(i7)).c(lVar, pVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return wc.l.j(this.f28370a, ", ");
    }
}
