package E3;

import C3.A;
import C3.n;
import W3.k;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: d, reason: collision with root package name */
    public n f3531d;

    @Override // W3.k
    public final int b(Object obj) {
        A a9 = (A) obj;
        if (a9 == null) {
            return 1;
        }
        return a9.b();
    }

    @Override // W3.k
    public final void c(Object obj, Object obj2) {
        A a9 = (A) obj2;
        n nVar = this.f3531d;
        if (nVar == null || a9 == null) {
            return;
        }
        nVar.f2587e.j(a9, true);
    }
}
