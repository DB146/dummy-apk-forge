package O;

import C.C0216a;
import C.O;
import Q.C0480b;
import Q.C0487e0;
import V0.c;
import V0.l;

/* loaded from: classes.dex */
public final class b implements O {

    /* renamed from: a, reason: collision with root package name */
    public final C0487e0 f7408a;

    public b(C0216a c0216a) {
        this.f7408a = C0480b.o(c0216a);
    }

    @Override // C.O
    public final int a(c cVar) {
        return ((O) this.f7408a.getValue()).a(cVar);
    }

    @Override // C.O
    public final int b(c cVar) {
        return ((O) this.f7408a.getValue()).b(cVar);
    }

    @Override // C.O
    public final int c(c cVar, l lVar) {
        return ((O) this.f7408a.getValue()).c(cVar, lVar);
    }

    @Override // C.O
    public final int d(c cVar, l lVar) {
        return ((O) this.f7408a.getValue()).d(cVar, lVar);
    }
}
