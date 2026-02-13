package yc;

/* renamed from: yc.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2500l extends C {
    public C2500l() {
        super("InTemplate", 17);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        int b2 = P.c.b(s3.f27675a);
        C2525y c2525y = C.f27641u;
        if (b2 != 0) {
            C2519v c2519v = C.f27638d;
            if (b2 == 1) {
                String m10 = ((O) s3).m();
                if (!wc.l.d(m10, B.f27597J)) {
                    if (wc.l.d(m10, B.f27598K)) {
                        c2482c.S();
                        A a9 = C.f27643w;
                        c2482c.T(a9);
                        c2482c.f27727l = a9;
                        return c2482c.k(s3);
                    }
                    if (m10.equals("col")) {
                        c2482c.S();
                        C2488f c2488f = C.f27646z;
                        c2482c.T(c2488f);
                        c2482c.f27727l = c2488f;
                        return c2482c.k(s3);
                    }
                    if (m10.equals("tr")) {
                        c2482c.S();
                        C2490g c2490g = C.f27622A;
                        c2482c.T(c2490g);
                        c2482c.f27727l = c2490g;
                        return c2482c.k(s3);
                    }
                    if (!m10.equals("td") && !m10.equals("th")) {
                        c2482c.S();
                        c2482c.T(c2525y);
                        c2482c.f27727l = c2525y;
                        return c2482c.k(s3);
                    }
                    c2482c.S();
                    C2492h c2492h = C.f27623B;
                    c2482c.T(c2492h);
                    c2482c.f27727l = c2492h;
                    return c2482c.k(s3);
                }
                c2519v.f(s3, c2482c);
            } else if (b2 != 2) {
                if (b2 != 3 && b2 != 4) {
                    if (b2 != 6) {
                        throw new IllegalStateException("Unexpected state: ".concat(y.S.e(s3.f27675a)));
                    }
                    if (!c2482c.O("template")) {
                        return true;
                    }
                    c2482c.x(this);
                    c2482c.R("template");
                    c2482c.r();
                    c2482c.S();
                    c2482c.X();
                    if (c2482c.f27727l == C.f27627F || c2482c.f27734s.size() >= 12) {
                        return true;
                    }
                    return c2482c.k(s3);
                }
            } else {
                if (!((N) s3).m().equals("template")) {
                    c2482c.x(this);
                    return false;
                }
                c2519v.f(s3, c2482c);
            }
            return true;
        }
        c2525y.f(s3, c2482c);
        return true;
    }
}
