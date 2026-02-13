package yc;

/* renamed from: yc.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2490g extends C {
    public C2490g() {
        super("InTableBody", 12);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        int b2 = P.c.b(s3.f27675a);
        A a9 = C.f27643w;
        if (b2 == 1) {
            O o10 = (O) s3;
            String m10 = o10.m();
            if (!m10.equals("tr")) {
                if (!wc.l.d(m10, B.f27616u)) {
                    return wc.l.d(m10, B.f27588A) ? g(s3, c2482c) : a9.f(s3, c2482c);
                }
                c2482c.x(this);
                c2482c.m("tr");
                return c2482c.k(o10);
            }
            c2482c.s("tbody", "tfoot", "thead", "template");
            c2482c.J(o10);
            c2482c.f27727l = C.f27623B;
        } else {
            if (b2 != 2) {
                return a9.f(s3, c2482c);
            }
            String m11 = ((N) s3).m();
            if (!wc.l.d(m11, B.f27594G)) {
                if (m11.equals("table")) {
                    return g(s3, c2482c);
                }
                if (!wc.l.d(m11, B.f27589B)) {
                    return a9.f(s3, c2482c);
                }
                c2482c.x(this);
                return false;
            }
            if (!c2482c.F(m11)) {
                c2482c.x(this);
                return false;
            }
            c2482c.s("tbody", "tfoot", "thead", "template");
            c2482c.j();
            c2482c.f27727l = a9;
        }
        return true;
    }

    public final boolean g(S s3, C2482c c2482c) {
        if (!c2482c.F("tbody") && !c2482c.F("thead") && !c2482c.C("tfoot")) {
            c2482c.x(this);
            return false;
        }
        c2482c.s("tbody", "tfoot", "thead", "template");
        c2482c.l(c2482c.b().f26349d.f27658c);
        return c2482c.k(s3);
    }
}
