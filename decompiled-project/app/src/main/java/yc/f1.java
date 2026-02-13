package yc;

/* loaded from: classes2.dex */
public enum f1 extends l1 {
    public f1() {
        super("BogusDoctype", 66);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char K10 = c2480b.K();
        C2489f0 c2489f0 = l1.f27773a;
        if (K10 == '>') {
            u3.j();
            u3.o(c2489f0);
        } else {
            if (K10 != 65535) {
                return;
            }
            u3.j();
            u3.o(c2489f0);
        }
    }
}
