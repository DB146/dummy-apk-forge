package yc;

import ea.C1111f;

/* loaded from: classes2.dex */
public enum g1 extends l1 {
    public g1() {
        super("CdataSection", 67);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        String F10;
        int g02 = c2480b.g0("]]>");
        if (g02 != -1) {
            F10 = C2480b.F(c2480b.f27704c, c2480b.f27702a, c2480b.f27705d, g02);
            c2480b.f27705d += g02;
        } else {
            int i7 = c2480b.f27706e;
            int i10 = c2480b.f27705d;
            if (i7 - i10 < 3) {
                F10 = c2480b.W();
            } else {
                int i11 = i7 - 2;
                F10 = C2480b.F(c2480b.f27704c, c2480b.f27702a, i10, i11 - i10);
                c2480b.f27705d = i11;
            }
        }
        u3.f27687f.i(F10);
        if (c2480b.a0("]]>") || c2480b.Y()) {
            String L = u3.f27687f.L();
            J j = new J();
            C1111f c1111f = j.f27664d;
            c1111f.z();
            c1111f.f16837b = L;
            u3.h(j);
            u3.o(l1.f27773a);
        }
    }
}
