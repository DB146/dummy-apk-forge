package yc;

/* loaded from: classes2.dex */
public enum A extends C {
    public A() {
        super("InTable", 8);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.a() && wc.l.d(c2482c.b().f26349d.f27658c, B.f27621z)) {
            c2482c.f27735t.clear();
            c2482c.f27728m = c2482c.f27727l;
            c2482c.f27727l = C.f27644x;
            return c2482c.k(s3);
        }
        if (s3.b()) {
            c2482c.I((K) s3);
            return true;
        }
        if (s3.c()) {
            c2482c.x(this);
            return false;
        }
        boolean f4 = s3.f();
        C2519v c2519v = C.f27638d;
        if (!f4) {
            if (!s3.e()) {
                if (!s3.d()) {
                    g(s3, c2482c);
                    return true;
                }
                if (c2482c.c("html")) {
                    c2482c.x(this);
                }
                return true;
            }
            String m10 = ((N) s3).m();
            if (m10.equals("table")) {
                if (!c2482c.F(m10)) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.R("table");
                c2482c.X();
            } else {
                if (wc.l.d(m10, B.f27620y)) {
                    c2482c.x(this);
                    return false;
                }
                if (!m10.equals("template")) {
                    g(s3, c2482c);
                    return true;
                }
                c2519v.f(s3, c2482c);
            }
            return true;
        }
        O o10 = (O) s3;
        String m11 = o10.m();
        if (m11.equals("caption")) {
            c2482c.t();
            c2482c.f27733r.add(null);
            c2482c.J(o10);
            c2482c.f27727l = C.f27645y;
        } else if (m11.equals("colgroup")) {
            c2482c.t();
            c2482c.J(o10);
            c2482c.f27727l = C.f27646z;
        } else {
            if (m11.equals("col")) {
                c2482c.t();
                c2482c.m("colgroup");
                return c2482c.k(s3);
            }
            if (wc.l.d(m11, B.f27613r)) {
                c2482c.t();
                c2482c.J(o10);
                c2482c.f27727l = C.f27622A;
            } else {
                if (wc.l.d(m11, B.f27614s)) {
                    c2482c.t();
                    c2482c.m("tbody");
                    return c2482c.k(s3);
                }
                if (m11.equals("table")) {
                    c2482c.x(this);
                    if (!c2482c.F(m11)) {
                        return false;
                    }
                    c2482c.R(m11);
                    if (c2482c.X()) {
                        return c2482c.k(s3);
                    }
                    c2482c.J(o10);
                    return true;
                }
                if (wc.l.d(m11, B.f27615t)) {
                    return c2519v.f(s3, c2482c);
                }
                if (m11.equals("input")) {
                    xc.b bVar = o10.g;
                    if (bVar == null || !bVar.z("type").equalsIgnoreCase("hidden")) {
                        g(s3, c2482c);
                        return true;
                    }
                    c2482c.K(o10);
                } else {
                    if (!m11.equals("form")) {
                        g(s3, c2482c);
                        return true;
                    }
                    c2482c.x(this);
                    if (c2482c.f27731p != null || c2482c.O("template")) {
                        return false;
                    }
                    c2482c.M(o10, false, false);
                }
            }
        }
        return true;
    }

    public final void g(S s3, C2482c c2482c) {
        c2482c.x(this);
        c2482c.f27738w = true;
        C.f27641u.f(s3, c2482c);
        c2482c.f27738w = false;
    }
}
