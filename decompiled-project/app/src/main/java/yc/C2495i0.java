package yc;

/* renamed from: yc.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2495i0 extends l1 {
    public C2495i0() {
        super("ScriptDataEscaped", 21);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        if (c2480b.Y()) {
            u3.l(this);
            u3.o(l1.f27773a);
            return;
        }
        char X10 = c2480b.X();
        if (X10 == 0) {
            u3.m(this);
            c2480b.l();
            u3.f((char) 65533);
            return;
        }
        if (X10 == '-') {
            u3.f('-');
            u3.a(l1.f27758K);
            return;
        }
        if (X10 == '<') {
            u3.a(l1.f27759M);
            return;
        }
        char[] cArr = {'-', '<', 0};
        c2480b.n();
        int i7 = c2480b.f27705d;
        int i10 = c2480b.f27706e;
        char[] cArr2 = c2480b.f27704c;
        int i11 = i7;
        loop0: while (i11 < i10) {
            char c10 = cArr2[i11];
            for (int i12 = 0; i12 < 3; i12++) {
                if (c10 == cArr[i12]) {
                    break loop0;
                }
            }
            i11++;
        }
        c2480b.f27705d = i11;
        u3.g(i11 > i7 ? C2480b.F(c2480b.f27704c, c2480b.f27702a, i7, i11 - i7) : "");
    }
}
