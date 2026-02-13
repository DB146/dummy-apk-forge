package yc;

import r7.C1948d;

/* loaded from: classes2.dex */
public enum V extends l1 {
    public V() {
        super("TagName", 9);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        u3.j.j(c2480b.T(new C1948d(17)));
        char K10 = c2480b.K();
        if (K10 == 0) {
            u3.j.j(l1.f27753G0);
            return;
        }
        if (K10 != ' ') {
            if (K10 == '/') {
                u3.o(l1.f27780d0);
                return;
            }
            C2489f0 c2489f0 = l1.f27773a;
            if (K10 == '>') {
                u3.k();
                u3.o(c2489f0);
                return;
            }
            if (K10 == 65535) {
                u3.l(this);
                u3.o(c2489f0);
                return;
            } else if (K10 != '\t' && K10 != '\n' && K10 != '\f' && K10 != '\r') {
                P p10 = u3.j;
                p10.getClass();
                p10.j(String.valueOf(K10));
                return;
            }
        }
        u3.o(l1.f27768V);
    }
}
