package yc;

/* renamed from: yc.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2520v0 extends l1 {
    public C2520v0() {
        super("BeforeAttributeName", 33);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        C2522w0 c2522w0 = l1.f27769W;
        if (K10 == 0) {
            c2480b.k0();
            u3.m(this);
            u3.j.l();
            u3.o(c2522w0);
            return;
        }
        if (K10 != ' ') {
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
                if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r') {
                    return;
                }
                switch (K10) {
                    case '>':
                        u3.k();
                        u3.o(c2489f0);
                        return;
                    case '?':
                        if (u3.j instanceof Q) {
                            return;
                        }
                        break;
                }
                u3.j.l();
                c2480b.k0();
                u3.o(c2522w0);
                return;
            }
            u3.m(this);
            u3.j.l();
            u3.j.f27673h.h(K10);
            u3.o(c2522w0);
        }
    }
}
