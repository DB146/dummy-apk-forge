package yc;

/* loaded from: classes2.dex */
public enum L0 extends l1 {
    public L0() {
        super("CommentEndDash", 48);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        K0 k02 = l1.f27788j0;
        if (K10 == 0) {
            u3.m(this);
            K k = u3.f27691m;
            k.f27665d.h('-');
            k.h((char) 65533);
            u3.o(k02);
            return;
        }
        if (K10 == '-') {
            u3.o(l1.f27790l0);
            return;
        }
        if (K10 == 65535) {
            u3.l(this);
            u3.i();
            u3.o(l1.f27773a);
        } else {
            K k7 = u3.f27691m;
            k7.f27665d.h('-');
            k7.h(K10);
            u3.o(k02);
        }
    }
}
