package zc;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface u {
    void a(xc.q qVar, int i7);

    default void d(xc.q qVar, int i7) {
    }

    default void h(xc.q qVar) {
        vc.i.D(qVar);
        xc.q qVar2 = qVar;
        int i7 = 0;
        while (qVar2 != null) {
            xc.l lVar = qVar2.f26368a;
            int size = lVar != null ? lVar.f26350e.size() : 0;
            xc.q M3 = qVar2.M();
            a(qVar2, i7);
            if (lVar != null && qVar2.f26368a == null) {
                if (size == lVar.f26350e.size()) {
                    qVar2 = (xc.q) ((ArrayList) lVar.G()).get(qVar2.f26369b);
                } else if (M3 == null) {
                    i7--;
                    qVar2 = lVar;
                } else {
                    qVar2 = M3;
                }
            }
            if (qVar2.C() > 0) {
                qVar2 = (xc.q) qVar2.G().get(0);
                i7++;
            } else {
                while (qVar2.M() == null && i7 > 0) {
                    d(qVar2, i7);
                    qVar2 = qVar2.f26368a;
                    i7--;
                }
                d(qVar2, i7);
                if (qVar2 == qVar) {
                    return;
                } else {
                    qVar2 = qVar2.M();
                }
            }
        }
    }
}
