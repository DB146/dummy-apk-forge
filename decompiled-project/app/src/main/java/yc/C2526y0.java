package yc;

/* renamed from: yc.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2526y0 extends l1 {
    public C2526y0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        C0 c02 = l1.f27776b0;
        if (K10 == 0) {
            u3.m(this);
            u3.j.h(c2480b.h0() - 1, c2480b.h0(), (char) 65533);
            u3.o(c02);
            return;
        }
        if (K10 != ' ') {
            if (K10 == '\"') {
                u3.o(l1.f27772Z);
                return;
            }
            if (K10 != '`') {
                C2489f0 c2489f0 = l1.f27773a;
                if (K10 == 65535) {
                    u3.l(this);
                    u3.k();
                    u3.o(c2489f0);
                    return;
                }
                if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r') {
                    return;
                }
                if (K10 == '&') {
                    c2480b.k0();
                    u3.o(c02);
                    return;
                }
                if (K10 == '\'') {
                    u3.o(l1.f27774a0);
                    return;
                }
                switch (K10) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        u3.m(this);
                        u3.k();
                        u3.o(c2489f0);
                        return;
                    default:
                        c2480b.k0();
                        u3.o(c02);
                        return;
                }
            }
            u3.m(this);
            u3.j.h(c2480b.h0() - 1, c2480b.h0(), K10);
            u3.o(c02);
        }
    }
}
