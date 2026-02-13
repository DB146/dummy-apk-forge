package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.C0;
import Q.C0478a;
import Q.InterfaceC0482c;
import Q.z0;

/* loaded from: classes.dex */
public final class t extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final t f8775d = new P8.h(0, 3, 1);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        z0 z0Var = (z0) c0305t.e(1);
        C0478a c0478a = (C0478a) c0305t.e(0);
        C0526c c0526c = (C0526c) c0305t.e(2);
        C0 y10 = z0Var.y();
        try {
            if (!c0526c.g.L()) {
                AbstractC0508p.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            c0526c.f8755f.K(interfaceC0482c, y10, kVar);
            y10.e(true);
            c02.d();
            c0478a.getClass();
            c02.y(z0Var, z0Var.b(c0478a));
            c02.j();
        } catch (Throwable th) {
            y10.e(false);
            throw th;
        }
    }
}
