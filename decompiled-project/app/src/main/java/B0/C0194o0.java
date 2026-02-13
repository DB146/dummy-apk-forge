package B0;

import android.view.ViewGroup;
import j0.AbstractC1362A;

/* renamed from: B0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194o0 extends c0.l implements E0.a {

    /* renamed from: C, reason: collision with root package name */
    public ViewGroup f1941C;

    @Override // E0.a
    public final Object h(A0.n0 n0Var, A0.K k, Jb.i iVar) {
        long A10 = n0Var.A(0L);
        i0.c cVar = (i0.c) k.invoke();
        i0.c e2 = cVar != null ? cVar.e(A10) : null;
        if (e2 != null) {
            this.f1941C.requestRectangleOnScreen(AbstractC1362A.y(e2), false);
        }
        return Db.q.f3365a;
    }
}
