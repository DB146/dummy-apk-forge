package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.C0;
import Q.C0478a;
import Q.InterfaceC0482c;

/* loaded from: classes.dex */
public final class j extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final j f8762d = new P8.h(0, 2, 1);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        int i7;
        Y.g gVar = (Y.g) c0305t.e(0);
        int c10 = c02.c((C0478a) c0305t.e(1));
        if (!(c02.f8293t < c10)) {
            AbstractC0508p.c("Check failed");
        }
        q3.f.y(c02, interfaceC0482c, c10);
        int i10 = c02.f8293t;
        int i11 = c02.f8295v;
        while (i11 >= 0 && !c02.w(i11)) {
            i11 = c02.C(c02.f8278b, i11);
        }
        int i12 = i11 + 1;
        int i13 = 0;
        while (i12 < i10) {
            if (c02.t(i10, i12)) {
                if (c02.w(i12)) {
                    i13 = 0;
                }
                i12++;
            } else {
                i13 += c02.w(i12) ? 1 : c02.f8278b[(c02.q(i12) * 5) + 1] & 67108863;
                i12 += c02.s(i12);
            }
        }
        while (true) {
            i7 = c02.f8293t;
            if (i7 >= c10) {
                break;
            }
            if (c02.t(c10, i7)) {
                int i14 = c02.f8293t;
                if (i14 < c02.f8294u && (c02.f8278b[(c02.q(i14) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0482c.f(c02.B(c02.f8293t));
                    i13 = 0;
                }
                c02.O();
            } else {
                i13 += c02.I();
            }
        }
        if (i7 != c10) {
            AbstractC0508p.c("Check failed");
        }
        gVar.f11046a = i13;
    }
}
