package yc;

/* loaded from: classes2.dex */
public enum a1 extends l1 {
    public a1() {
        super("AfterDoctypeSystemKeyword", 61);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r' || K10 == ' ') {
            u3.o(l1.f27808y0);
            return;
        }
        if (K10 == '\"') {
            u3.m(this);
            u3.o(l1.f27810z0);
            return;
        }
        if (K10 == '\'') {
            u3.m(this);
            u3.o(l1.f27742A0);
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
            u3.m(this);
            u3.f27690l.f27669h = true;
            u3.j();
        } else {
            u3.l(this);
            u3.f27690l.f27669h = true;
            u3.j();
            u3.o(c2489f0);
        }
    }
}
