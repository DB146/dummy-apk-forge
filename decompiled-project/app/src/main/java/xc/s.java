package xc;

import l2.X;
import yc.F;

/* loaded from: classes2.dex */
public class s extends X {

    /* renamed from: e, reason: collision with root package name */
    public boolean f26376e;

    public static boolean x(q qVar) {
        return (qVar instanceof x) && wc.l.f(((x) qVar).Z());
    }

    @Override // l2.X
    public final void b(l lVar, int i7) {
        if (z(lVar)) {
            s(i7);
        }
        lVar.R((wc.c) this.f19195c, (f) this.f19196d);
        if (lVar.f26349d.b(64)) {
            this.f26376e = true;
        }
    }

    @Override // l2.X
    public final void f(p pVar, int i7) {
        if (z(pVar)) {
            s(i7);
        }
        pVar.R((wc.c) this.f19195c, (f) this.f19196d);
    }

    @Override // l2.X
    public final void g(l lVar, int i7) {
        q H10 = lVar.H();
        while (x(H10)) {
            H10 = H10.M();
        }
        if (z(H10)) {
            s(i7);
        }
        lVar.k0((wc.c) this.f19195c, (f) this.f19196d);
        if (!this.f26376e || !lVar.f26349d.b(64)) {
            return;
        }
        do {
            lVar = lVar.f26368a;
            if (lVar == null) {
                this.f26376e = false;
                return;
            }
        } while ((lVar.f26349d.f27659d & 64) == 0);
    }

    @Override // l2.X
    public final void i(x xVar, int i7, int i10) {
        int i11;
        if (this.f26376e) {
            i11 = 0;
        } else {
            i11 = 4;
            if (y(xVar.f26368a)) {
                q U8 = xVar.U();
                q M3 = xVar.M();
                if ((!(U8 instanceof l) || y(U8)) && (U8 == null || (!(U8 instanceof x) && z(U8)))) {
                    i11 = 12;
                }
                if (M3 == null || (!(M3 instanceof x) && z(M3))) {
                    i11 |= 16;
                }
            }
            if (!wc.l.f(xVar.Z()) && y(xVar.f26368a) && z(xVar)) {
                s(i10);
            }
        }
        super.i(xVar, i11, i10);
    }

    public boolean y(q qVar) {
        if (qVar == null || !(qVar instanceof l)) {
            return false;
        }
        l lVar = (l) qVar;
        F f4 = lVar.f26349d;
        if ((f4.f27659d & 4) == 0) {
            if (f4.d()) {
                return false;
            }
            if (!(lVar.f26368a instanceof g)) {
                l h02 = lVar.h0();
                for (int i7 = 0; i7 < 5 && h02 != null; i7++) {
                    F f10 = h02.f26349d;
                    if ((f10.f27659d & 4) == 0 && f10.d()) {
                        h02 = h02.L();
                    }
                }
                return false;
            }
        }
        return true;
    }

    public boolean z(q qVar) {
        if (qVar != null && qVar != ((q) this.f19194b) && !this.f26376e && !x(qVar)) {
            if (y(qVar)) {
                return true;
            }
            q U8 = qVar.U();
            while (x(U8)) {
                U8 = U8.U();
            }
            if (y(U8)) {
                return true;
            }
            l lVar = qVar.f26368a;
            if (y(lVar) && !lVar.f26349d.b(8)) {
                q H10 = lVar.H();
                for (int i7 = 0; i7 < 5 && H10 != null; i7++) {
                    if (!(H10 instanceof x)) {
                        if (U8 != null) {
                            if (U8 instanceof x) {
                                return false;
                            }
                            if (!y(U8) && (U8 instanceof l)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    H10 = H10.M();
                }
            }
        }
        return false;
    }
}
