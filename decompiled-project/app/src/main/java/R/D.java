package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.C0;
import Q.C0478a;
import Q.C0505n0;
import Q.InterfaceC0482c;
import Q.w0;

/* loaded from: classes.dex */
public final class D extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final D f8737d = new P8.h(1, 0, 2);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        int i7;
        int i10;
        int d10 = c0305t.d(0);
        int o10 = c02.o();
        int i11 = c02.f8295v;
        int K10 = c02.K(c02.f8278b, c02.q(i11));
        int f4 = c02.f(c02.f8278b, c02.q(i11 + 1));
        for (int max = Math.max(K10, f4 - d10); max < f4; max++) {
            Object obj = c02.f8279c[c02.g(max)];
            if (obj instanceof w0) {
                int i12 = o10 - max;
                w0 w0Var = (w0) obj;
                C0478a c0478a = w0Var.f8566b;
                if (c0478a == null || !c0478a.a()) {
                    i7 = -1;
                    i10 = -1;
                } else {
                    i7 = c02.c(c0478a);
                    i10 = c02.o() - c02.M(i7);
                }
                kVar.i(w0Var, i12, i7, i10);
            } else if (obj instanceof C0505n0) {
                ((C0505n0) obj).d();
            }
        }
        if (!(d10 > 0)) {
            AbstractC0508p.c("Check failed");
        }
        int i13 = c02.f8295v;
        int K11 = c02.K(c02.f8278b, c02.q(i13));
        int f10 = c02.f(c02.f8278b, c02.q(i13 + 1)) - d10;
        if (f10 < K11) {
            AbstractC0508p.c("Check failed");
        }
        c02.H(f10, d10, i13);
        int i14 = c02.f8284i;
        if (i14 >= K11) {
            c02.f8284i = i14 - d10;
        }
    }
}
