package yc;

/* loaded from: classes2.dex */
public enum D0 extends l1 {
    public D0() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        C2520v0 c2520v0 = l1.f27768V;
        if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r' || K10 == ' ') {
            u3.o(c2520v0);
            return;
        }
        if (K10 == '/') {
            u3.o(l1.f27780d0);
            return;
        }
        C2489f0 c2489f0 = l1.f27773a;
        if (K10 == 65535) {
            u3.l(this);
            u3.o(c2489f0);
        } else if (K10 == '>') {
            u3.k();
            u3.o(c2489f0);
        } else {
            if (K10 == '?' && (u3.j instanceof Q)) {
                return;
            }
            c2480b.k0();
            u3.m(this);
            u3.o(c2520v0);
        }
    }
}
