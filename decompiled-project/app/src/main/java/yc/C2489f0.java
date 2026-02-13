package yc;

/* renamed from: yc.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2489f0 extends l1 {
    public C2489f0() {
        super("Data", 0);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char X10 = c2480b.X();
        if (X10 == 0) {
            u3.m(this);
            u3.f(c2480b.K());
            return;
        }
        if (X10 == '&') {
            u3.a(l1.f27775b);
            return;
        }
        if (X10 == '<') {
            u3.a(l1.f27801v);
            return;
        }
        if (X10 == 65535) {
            u3.h(new M());
            return;
        }
        c2480b.n();
        int i7 = c2480b.f27705d;
        int i10 = c2480b.f27706e;
        char[] cArr = c2480b.f27704c;
        int i11 = i7;
        while (i11 < i10) {
            char c10 = cArr[i11];
            if (c10 == '&' || c10 == '<' || c10 == 0) {
                break;
            } else {
                i11++;
            }
        }
        c2480b.f27705d = i11;
        u3.g(i11 > i7 ? C2480b.F(c2480b.f27704c, c2480b.f27702a, i7, i11 - i7) : "");
    }
}
