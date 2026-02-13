package yc;

import r7.C1948d;

/* loaded from: classes2.dex */
public enum Y extends l1 {
    public Y() {
        super("RCDATAEndTagName", 12);
    }

    public static void g(U u3, C2480b c2480b) {
        u3.g("</");
        u3.g(u3.f27687f.L());
        c2480b.k0();
        u3.o(l1.f27777c);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        if (c2480b.e0()) {
            String T10 = c2480b.T(new C1948d(17));
            u3.j.j(T10);
            u3.f27687f.i(T10);
            return;
        }
        char K10 = c2480b.K();
        if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r' || K10 == ' ') {
            if (u3.n()) {
                u3.o(l1.f27768V);
                return;
            } else {
                g(u3, c2480b);
                return;
            }
        }
        if (K10 == '/') {
            if (u3.n()) {
                u3.o(l1.f27780d0);
                return;
            } else {
                g(u3, c2480b);
                return;
            }
        }
        if (K10 != '>') {
            g(u3, c2480b);
        } else if (!u3.n()) {
            g(u3, c2480b);
        } else {
            u3.k();
            u3.o(l1.f27773a);
        }
    }
}
