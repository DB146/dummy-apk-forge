package B0;

import java.util.List;
import u.AbstractC2059l;

/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final H0.i f1805a;

    /* renamed from: b, reason: collision with root package name */
    public final u.y f1806b;

    public W0(H0.n nVar, AbstractC2059l abstractC2059l) {
        this.f1805a = nVar.f4505d;
        this.f1806b = new u.y(H0.n.h(4, nVar).size());
        List h10 = H0.n.h(4, nVar);
        int size = h10.size();
        for (int i7 = 0; i7 < size; i7++) {
            H0.n nVar2 = (H0.n) h10.get(i7);
            if (abstractC2059l.a(nVar2.g)) {
                this.f1806b.a(nVar2.g);
            }
        }
    }
}
