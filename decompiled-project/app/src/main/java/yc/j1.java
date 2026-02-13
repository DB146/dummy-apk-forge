package yc;

/* loaded from: classes2.dex */
public enum j1 extends l1 {
    public j1() {
        super("TagOpen", 7);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        char X10 = c2480b.X();
        if (X10 == '!') {
            u3.a(l1.f27784f0);
            return;
        }
        if (X10 == '/') {
            u3.a(l1.f27803w);
            return;
        }
        if (X10 == '?') {
            if (u3.g == 2) {
                u3.a(l1.f27785g0);
                return;
            } else {
                u3.f27691m.g();
                u3.o(l1.f27782e0);
                return;
            }
        }
        if (c2480b.e0()) {
            u3.d(true);
            u3.o(l1.f27805x);
        } else {
            u3.m(this);
            u3.f('<');
            u3.o(l1.f27773a);
        }
    }
}
