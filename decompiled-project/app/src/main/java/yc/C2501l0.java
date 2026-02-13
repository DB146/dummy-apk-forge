package yc;

/* renamed from: yc.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2501l0 extends l1 {
    public C2501l0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        if (c2480b.e0()) {
            u3.e();
            u3.f27687f.h(c2480b.X());
            u3.f('<');
            u3.f(c2480b.X());
            u3.a(l1.f27762P);
            return;
        }
        if (c2480b.c0('/')) {
            u3.e();
            u3.a(l1.f27760N);
        } else {
            u3.f('<');
            u3.o(l1.f27757J);
        }
    }
}
