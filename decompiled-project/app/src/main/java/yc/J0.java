package yc;

/* loaded from: classes2.dex */
public enum J0 extends l1 {
    public J0() {
        super("CommentStartDash", 46);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        K0 k02 = l1.f27788j0;
        if (K10 == 0) {
            u3.m(this);
            u3.f27691m.h((char) 65533);
            u3.o(k02);
            return;
        }
        if (K10 == '-') {
            u3.o(l1.f27790l0);
            return;
        }
        C2489f0 c2489f0 = l1.f27773a;
        if (K10 == '>') {
            u3.m(this);
            u3.i();
            u3.o(c2489f0);
        } else if (K10 != 65535) {
            u3.f27691m.h(K10);
            u3.o(k02);
        } else {
            u3.l(this);
            u3.i();
            u3.o(c2489f0);
        }
    }
}
