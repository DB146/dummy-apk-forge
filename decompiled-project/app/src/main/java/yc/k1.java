package yc;

/* loaded from: classes2.dex */
public enum k1 extends l1 {
    public k1() {
        super("EndTagOpen", 8);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        boolean Y2 = c2480b.Y();
        C2489f0 c2489f0 = l1.f27773a;
        if (Y2) {
            u3.l(this);
            u3.g("</");
            u3.o(c2489f0);
        } else if (c2480b.e0()) {
            u3.d(false);
            u3.o(l1.f27805x);
        } else {
            if (c2480b.c0('>')) {
                u3.m(this);
                u3.a(c2489f0);
                return;
            }
            u3.m(this);
            K k = u3.f27691m;
            k.g();
            k.h('/');
            u3.o(l1.f27782e0);
        }
    }
}
