package R;

import H2.C0305t;
import Q.C0;
import Q.InterfaceC0482c;

/* renamed from: R.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529f extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0529f f8758d = new P8.h(0, 2, 1);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        Y.g gVar = (Y.g) c0305t.e(1);
        int i7 = gVar != null ? gVar.f11046a : 0;
        C0524a c0524a = (C0524a) c0305t.e(0);
        if (i7 > 0) {
            interfaceC0482c = new A4.h(interfaceC0482c, i7);
        }
        c0524a.J(interfaceC0482c, c02, kVar);
    }
}
