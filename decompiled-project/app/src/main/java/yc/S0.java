package yc;

/* loaded from: classes2.dex */
public enum S0 extends l1 {
    public S0() {
        super("AfterDoctypeName", 54);
    }

    @Override // yc.l1
    public final void f(U u3, C2480b c2480b) {
        boolean Y2 = c2480b.Y();
        C2489f0 c2489f0 = l1.f27773a;
        if (Y2) {
            u3.l(this);
            u3.f27690l.f27669h = true;
            u3.j();
            u3.o(c2489f0);
            return;
        }
        if (c2480b.d0('\t', '\n', '\r', '\f', ' ')) {
            c2480b.l();
            return;
        }
        if (c2480b.c0('>')) {
            u3.j();
            u3.a(c2489f0);
            return;
        }
        if (c2480b.b0("PUBLIC")) {
            u3.f27690l.f27667e = "PUBLIC";
            u3.o(l1.f27796r0);
        } else if (c2480b.b0("SYSTEM")) {
            u3.f27690l.f27667e = "SYSTEM";
            u3.o(l1.f27806x0);
        } else {
            u3.m(this);
            u3.f27690l.f27669h = true;
            u3.a(l1.C0);
        }
    }
}
