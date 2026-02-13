package zc;

import java.util.List;

/* renamed from: zc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2610b extends d {
    public C2610b(List list) {
        this.f28370a.addAll(list);
        g();
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        for (int i7 = 0; i7 < this.f28372c; i7++) {
            if (!((p) this.f28371b.get(i7)).b(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // zc.p
    public final boolean c(xc.l lVar, xc.p pVar) {
        for (int i7 = 0; i7 < this.f28372c; i7++) {
            if (!((p) this.f28371b.get(i7)).c(lVar, pVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return wc.l.j(this.f28370a, "");
    }
}
