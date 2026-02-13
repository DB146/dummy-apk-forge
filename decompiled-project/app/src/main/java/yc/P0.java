package yc;

/* loaded from: classes2.dex */
public enum P0 extends l1 {
    public P0() {
        super("Doctype", 51);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        Q0 q02 = l1.f27793o0;
        if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r' || K10 == ' ') {
            u3.o(q02);
            return;
        }
        if (K10 != '>') {
            if (K10 != 65535) {
                u3.m(this);
                u3.o(q02);
                return;
            }
            u3.l(this);
        }
        u3.m(this);
        L l10 = u3.f27690l;
        l10.g();
        l10.f27669h = true;
        u3.j();
        u3.o(l1.f27773a);
    }
}
