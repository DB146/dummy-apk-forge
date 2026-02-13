package yc;

/* renamed from: yc.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2514s0 extends l1 {
    public C2514s0() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        C2509p0 c2509p0 = l1.f27763Q;
        if (K10 == 0) {
            u3.m(this);
            u3.f((char) 65533);
            u3.o(c2509p0);
            return;
        }
        if (K10 == '-') {
            u3.f(K10);
            return;
        }
        if (K10 == '<') {
            u3.f(K10);
            u3.o(l1.f27766T);
        } else if (K10 == '>') {
            u3.f(K10);
            u3.o(l1.f27783f);
        } else if (K10 != 65535) {
            u3.f(K10);
            u3.o(c2509p0);
        } else {
            u3.l(this);
            u3.o(l1.f27773a);
        }
    }
}
