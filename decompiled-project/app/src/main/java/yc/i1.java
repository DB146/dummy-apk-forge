package yc;

/* loaded from: classes2.dex */
public enum i1 extends l1 {
    public i1() {
        super("PLAINTEXT", 6);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char X10 = c2480b.X();
        if (X10 == 0) {
            u3.m(this);
            c2480b.l();
            u3.f((char) 65533);
        } else if (X10 != 65535) {
            u3.g(c2480b.U((char) 0));
        } else {
            u3.h(new M());
        }
    }
}
