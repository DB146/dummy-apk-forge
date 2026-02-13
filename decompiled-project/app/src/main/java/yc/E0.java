package yc;

/* loaded from: classes2.dex */
public enum E0 extends l1 {
    public E0() {
        super("SelfClosingStartTag", 41);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        C2489f0 c2489f0 = l1.f27773a;
        if (K10 == '>') {
            u3.j.f27672f = true;
            u3.k();
            u3.o(c2489f0);
        } else if (K10 == 65535) {
            u3.l(this);
            u3.o(c2489f0);
        } else {
            c2480b.k0();
            u3.m(this);
            u3.o(l1.f27768V);
        }
    }
}
