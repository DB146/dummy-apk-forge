package yc;

/* loaded from: classes2.dex */
public enum R0 extends l1 {
    public R0() {
        super("DoctypeName", 53);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        if (c2480b.e0()) {
            u3.f27690l.f27666d.i(c2480b.P());
            return;
        }
        char K10 = c2480b.K();
        if (K10 == 0) {
            u3.m(this);
            u3.f27690l.f27666d.h((char) 65533);
            return;
        }
        if (K10 != ' ') {
            C2489f0 c2489f0 = l1.f27773a;
            if (K10 == '>') {
                u3.j();
                u3.o(c2489f0);
                return;
            }
            if (K10 == 65535) {
                u3.l(this);
                u3.f27690l.f27669h = true;
                u3.j();
                u3.o(c2489f0);
                return;
            }
            if (K10 != '\t' && K10 != '\n' && K10 != '\f' && K10 != '\r') {
                u3.f27690l.f27666d.h(K10);
                return;
            }
        }
        u3.o(l1.f27795q0);
    }
}
