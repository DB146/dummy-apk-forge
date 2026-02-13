package yc;

import m4.C1589s;

/* loaded from: classes2.dex */
public enum A0 extends l1 {
    public A0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        c2480b.h0();
        String T10 = c2480b.T(new C1589s(2, true));
        if (T10.length() > 0) {
            u3.j.f27674i.i(T10);
        } else {
            u3.j.j = true;
        }
        int h02 = c2480b.h0();
        char K10 = c2480b.K();
        if (K10 == 0) {
            u3.m(this);
            u3.j.h(h02, c2480b.h0(), (char) 65533);
            return;
        }
        if (K10 == 65535) {
            u3.l(this);
            u3.o(l1.f27773a);
            return;
        }
        if (K10 != '&') {
            if (K10 != '\'') {
                u3.j.h(h02, c2480b.h0(), K10);
                return;
            } else {
                u3.o(l1.f27778c0);
                return;
            }
        }
        int[] c10 = u3.c('\'', true);
        if (c10 != null) {
            u3.j.i(h02, c2480b.h0(), c10);
        } else {
            u3.j.h(h02, c2480b.h0(), '&');
        }
    }
}
