package yc;

/* loaded from: classes2.dex */
public enum Q0 extends l1 {
    public Q0() {
        super("BeforeDoctypeName", 52);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        boolean e02 = c2480b.e0();
        R0 r02 = l1.f27794p0;
        if (e02) {
            u3.f27690l.g();
            u3.o(r02);
            return;
        }
        char K10 = c2480b.K();
        if (K10 == 0) {
            u3.m(this);
            L l10 = u3.f27690l;
            l10.g();
            l10.f27666d.h((char) 65533);
            u3.o(r02);
            return;
        }
        if (K10 != ' ') {
            if (K10 == 65535) {
                u3.l(this);
                L l11 = u3.f27690l;
                l11.g();
                l11.f27669h = true;
                u3.j();
                u3.o(l1.f27773a);
                return;
            }
            if (K10 == '\t' || K10 == '\n' || K10 == '\f' || K10 == '\r') {
                return;
            }
            u3.f27690l.g();
            u3.f27690l.f27666d.h(K10);
            u3.o(r02);
        }
    }
}
