package yc;

/* renamed from: yc.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2522w0 extends l1 {
    public C2522w0() {
        super("AttributeName", 34);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        c2480b.h0();
        String V7 = c2480b.V(l1.f27749E0);
        P p10 = u3.j;
        p10.getClass();
        p10.f27673h.i(V7.replace((char) 0, (char) 65533));
        char K10 = c2480b.K();
        C2524x0 c2524x0 = l1.f27770X;
        if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r' || K10 == ' ') {
            u3.o(c2524x0);
            return;
        }
        if (K10 != '\"' && K10 != '\'') {
            if (K10 == '/') {
                u3.o(l1.f27780d0);
                return;
            }
            C2489f0 c2489f0 = l1.f27773a;
            if (K10 == 65535) {
                u3.l(this);
                u3.o(c2489f0);
                return;
            }
            switch (K10) {
                case '=':
                    u3.o(l1.f27771Y);
                    return;
                case '>':
                    u3.k();
                    u3.o(c2489f0);
                    return;
                case '?':
                    if (u3.g == 2 && (u3.j instanceof Q)) {
                        u3.o(c2524x0);
                        return;
                    }
                    break;
            }
            u3.j.f27673h.h(K10);
            return;
        }
        u3.m(this);
        u3.j.f27673h.h(K10);
    }
}
