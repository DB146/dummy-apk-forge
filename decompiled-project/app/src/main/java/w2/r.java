package w2;

import fc.b0;
import java.util.Iterator;
import java.util.List;
import v2.AbstractC2127A;
import v2.C2133e;
import y7.u0;

@v2.z("dialog")
/* loaded from: classes.dex */
public final class r extends AbstractC2127A {
    @Override // v2.AbstractC2127A
    public final v2.q a() {
        Y.e eVar = e.f25679a;
        return new q(this);
    }

    @Override // v2.AbstractC2127A
    public final void d(List list, v2.x xVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C2133e) it.next());
        }
    }

    @Override // v2.AbstractC2127A
    public final void e(C2133e c2133e, boolean z8) {
        b().e(c2133e, z8);
        int a02 = Eb.o.a0((Iterable) ((b0) b().f24985f.f17078a).getValue(), c2133e);
        int i7 = 0;
        for (Object obj : (Iterable) ((b0) b().f24985f.f17078a).getValue()) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            C2133e c2133e2 = (C2133e) obj;
            if (i7 > a02) {
                b().c(c2133e2);
            }
            i7 = i10;
        }
    }
}
