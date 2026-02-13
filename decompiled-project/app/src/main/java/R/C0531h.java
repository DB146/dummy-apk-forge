package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.C0;
import Q.InterfaceC0482c;
import Q.V;

/* renamed from: R.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531h extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0531h f8760d = new P8.h(0, 4, 1);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        V v10 = (V) c0305t.e(2);
        Q.r rVar = (Q.r) c0305t.e(1);
        rVar.j(v10);
        AbstractC0508p.d("Could not resolve state for movable content");
        throw new Db.d(0);
    }
}
