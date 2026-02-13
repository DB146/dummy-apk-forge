package yc;

/* loaded from: classes2.dex */
public enum C0 extends l1 {
    public C0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        c2480b.h0();
        String V7 = c2480b.V(l1.f27751F0);
        if (V7.length() > 0) {
            u3.j.f27674i.i(V7);
        }
        int h02 = c2480b.h0();
        char K10 = c2480b.K();
        if (K10 == 0) {
            u3.m(this);
            u3.j.h(h02, c2480b.h0(), (char) 65533);
            return;
        }
        if (K10 != ' ') {
            if (K10 != '\"' && K10 != '`') {
                C2489f0 c2489f0 = l1.f27773a;
                if (K10 == 65535) {
                    u3.l(this);
                    u3.o(c2489f0);
                    return;
                }
                if (K10 != '\t' && K10 != '\n' && K10 != '\f' && K10 != '\r') {
                    if (K10 == '&') {
                        int[] c10 = u3.c('>', true);
                        if (c10 != null) {
                            u3.j.i(h02, c2480b.h0(), c10);
                            return;
                        } else {
                            u3.j.h(h02, c2480b.h0(), '&');
                            return;
                        }
                    }
                    if (K10 != '\'') {
                        switch (K10) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                u3.k();
                                u3.o(c2489f0);
                                return;
                            default:
                                u3.j.h(h02, c2480b.h0(), K10);
                                return;
                        }
                    }
                }
            }
            u3.m(this);
            u3.j.h(h02, c2480b.h0(), K10);
            return;
        }
        u3.o(l1.f27768V);
    }
}
