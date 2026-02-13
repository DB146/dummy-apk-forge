package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.C0;
import Q.InterfaceC0482c;

/* loaded from: classes.dex */
public final class z extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final z f8781d = new P8.h(0, 0, 3);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        if (c02.f8287n != 0) {
            AbstractC0508p.c("Cannot reset when inserting");
        }
        c02.E();
        c02.f8293t = 0;
        c02.f8294u = c02.m() - c02.f8283h;
        c02.f8284i = 0;
        c02.j = 0;
        c02.f8288o = 0;
    }
}
