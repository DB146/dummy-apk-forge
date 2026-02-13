package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.C0;
import Q.C0478a;
import Q.InterfaceC0482c;
import Q.w0;

/* renamed from: R.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528e extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0528e f8757d = new P8.h(0, 2, 1);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        C0478a c0478a = (C0478a) c0305t.e(0);
        Object e2 = c0305t.e(1);
        if (e2 instanceof w0) {
            ((S.e) kVar.f11056c).b((w0) e2);
        }
        if (c02.f8287n != 0) {
            AbstractC0508p.c("Can only append a slot if not current inserting");
        }
        int i7 = c02.f8284i;
        int i10 = c02.j;
        int c10 = c02.c(c0478a);
        int f4 = c02.f(c02.f8278b, c02.q(c10 + 1));
        c02.f8284i = f4;
        c02.j = f4;
        c02.v(1, c10);
        if (i7 >= f4) {
            i7++;
            i10++;
        }
        c02.f8279c[f4] = e2;
        c02.f8284i = i7;
        c02.j = i10;
    }
}
