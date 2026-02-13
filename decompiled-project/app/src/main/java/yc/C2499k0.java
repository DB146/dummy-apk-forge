package yc;

/* renamed from: yc.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2499k0 extends l1 {
    public C2499k0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        if (c2480b.Y()) {
            u3.l(this);
            u3.o(l1.f27773a);
            return;
        }
        char K10 = c2480b.K();
        C2495i0 c2495i0 = l1.f27757J;
        if (K10 == 0) {
            u3.m(this);
            u3.f((char) 65533);
            u3.o(c2495i0);
        } else {
            if (K10 == '-') {
                u3.f(K10);
                return;
            }
            if (K10 == '<') {
                u3.o(l1.f27759M);
            } else if (K10 != '>') {
                u3.f(K10);
                u3.o(c2495i0);
            } else {
                u3.f(K10);
                u3.o(l1.f27783f);
            }
        }
    }
}
