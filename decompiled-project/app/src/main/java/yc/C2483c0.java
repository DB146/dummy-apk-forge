package yc;

/* renamed from: yc.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2483c0 extends l1 {
    public C2483c0() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        if (K10 == '!') {
            u3.g("<!");
            u3.o(l1.f27754H);
            return;
        }
        if (K10 == '/') {
            u3.e();
            u3.o(l1.f27750F);
        } else if (K10 != 65535) {
            u3.f('<');
            c2480b.k0();
            u3.o(l1.f27783f);
        } else {
            u3.f('<');
            u3.l(this);
            u3.o(l1.f27773a);
        }
    }
}
