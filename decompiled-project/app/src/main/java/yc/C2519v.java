package yc;

/* renamed from: yc.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2519v extends C {
    public C2519v() {
        super("InHead", 3);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (C.a(s3)) {
            c2482c.G((J) s3);
            return true;
        }
        int b2 = P.c.b(s3.f27675a);
        if (b2 == 0) {
            c2482c.x(this);
            return false;
        }
        if (b2 == 1) {
            O o10 = (O) s3;
            String m10 = o10.m();
            if (m10.equals("html")) {
                return C.f27641u.f(s3, c2482c);
            }
            if (wc.l.d(m10, B.f27599a)) {
                xc.l K10 = c2482c.K(o10);
                if (m10.equals("base") && K10.I("href") && !c2482c.f27729n) {
                    String b10 = K10.b("href");
                    if (b10.length() != 0) {
                        c2482c.f27816f = b10;
                        c2482c.f27729n = true;
                        xc.g gVar = c2482c.f27814d;
                        gVar.getClass();
                        gVar.e0(b10);
                    }
                }
            } else if (m10.equals("meta")) {
                c2482c.K(o10);
            } else if (m10.equals("title")) {
                C.b(o10, c2482c, c2482c.o(o10).g());
            } else if (wc.l.d(m10, B.f27600b)) {
                C.b(o10, c2482c, c2482c.o(o10).g());
            } else if (m10.equals("noscript")) {
                c2482c.J(o10);
                c2482c.f27727l = C.f27639e;
            } else if (m10.equals("script")) {
                c2482c.f27813c.o(l1.f27783f);
                c2482c.f27728m = c2482c.f27727l;
                c2482c.f27727l = C.f27642v;
                c2482c.J(o10);
            } else {
                if (m10.equals("head")) {
                    c2482c.x(this);
                    return false;
                }
                if (!m10.equals("template")) {
                    c2482c.l("head");
                    return c2482c.k(s3);
                }
                c2482c.J(o10);
                c2482c.f27733r.add(null);
                c2482c.f27737v = false;
                C2500l c2500l = C.f27627F;
                c2482c.f27727l = c2500l;
                c2482c.T(c2500l);
            }
        } else if (b2 == 2) {
            String m11 = ((N) s3).m();
            if (m11.equals("head")) {
                c2482c.j();
                c2482c.f27727l = C.f27640f;
            } else {
                if (wc.l.d(m11, B.f27601c)) {
                    c2482c.l("head");
                    return c2482c.k(s3);
                }
                if (!m11.equals("template")) {
                    c2482c.x(this);
                    return false;
                }
                if (c2482c.O(m11)) {
                    c2482c.z(true);
                    if (!c2482c.c(m11)) {
                        c2482c.x(this);
                    }
                    c2482c.R(m11);
                    c2482c.r();
                    c2482c.S();
                    c2482c.X();
                } else {
                    c2482c.x(this);
                }
            }
        } else {
            if (b2 != 3) {
                c2482c.l("head");
                return c2482c.k(s3);
            }
            c2482c.I((K) s3);
        }
        return true;
    }
}
