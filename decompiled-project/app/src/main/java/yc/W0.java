package yc;

/* loaded from: classes2.dex */
public enum W0 extends l1 {
    public W0() {
        super("DoctypePublicIdentifier_singleQuoted", 58);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        if (K10 == 0) {
            u3.m(this);
            u3.f27690l.f27668f.h((char) 65533);
            return;
        }
        if (K10 == '\'') {
            u3.o(l1.f27802v0);
            return;
        }
        C2489f0 c2489f0 = l1.f27773a;
        if (K10 == '>') {
            u3.m(this);
            u3.f27690l.f27669h = true;
            u3.j();
            u3.o(c2489f0);
            return;
        }
        if (K10 != 65535) {
            u3.f27690l.f27668f.h(K10);
            return;
        }
        u3.l(this);
        u3.f27690l.f27669h = true;
        u3.j();
        u3.o(c2489f0);
    }
}
