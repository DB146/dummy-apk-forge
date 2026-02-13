package yc;

/* renamed from: yc.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2503m0 extends l1 {
    public C2503m0() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        if (!c2480b.e0()) {
            u3.g("</");
            u3.o(l1.f27757J);
            return;
        }
        u3.d(false);
        P p10 = u3.j;
        char X10 = c2480b.X();
        p10.getClass();
        p10.j(String.valueOf(X10));
        u3.f27687f.h(c2480b.X());
        u3.a(l1.f27761O);
    }
}
