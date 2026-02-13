package zc;

/* loaded from: classes2.dex */
public abstract class p {
    public int a() {
        return 5;
    }

    public abstract boolean b(xc.l lVar, xc.l lVar2);

    public boolean c(xc.l lVar, xc.p pVar) {
        return false;
    }

    public final boolean d(xc.l lVar, xc.q qVar) {
        if (qVar instanceof xc.l) {
            return b(lVar, (xc.l) qVar);
        }
        if ((qVar instanceof xc.p) && f()) {
            return c(lVar, (xc.p) qVar);
        }
        return false;
    }

    public void e() {
    }

    public boolean f() {
        return false;
    }
}
