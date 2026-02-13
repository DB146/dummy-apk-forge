package yc;

/* loaded from: classes2.dex */
public enum M0 extends l1 {
    public M0() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        B0 b02 = l1.f27777c;
        int[] c10 = u3.c(null, false);
        if (c10 == null) {
            u3.f('&');
        } else {
            u3.g(new String(c10, 0, c10.length));
        }
        u3.o(b02);
    }
}
