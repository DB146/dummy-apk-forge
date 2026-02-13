package yc;

/* renamed from: yc.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2523x extends C {
    public C2523x() {
        super("AfterHead", 5);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (C.a(s3)) {
            c2482c.G((J) s3);
        } else if (s3.b()) {
            c2482c.I((K) s3);
        } else if (s3.c()) {
            c2482c.x(this);
        } else {
            boolean f4 = s3.f();
            C2519v c2519v = C.f27638d;
            if (f4) {
                O o10 = (O) s3;
                String m10 = o10.m();
                boolean equals = m10.equals("html");
                C2525y c2525y = C.f27641u;
                if (equals) {
                    return c2525y.f(s3, c2482c);
                }
                if (m10.equals("body")) {
                    c2482c.J(o10);
                    c2482c.f27737v = false;
                    c2482c.f27727l = c2525y;
                } else if (m10.equals("frameset")) {
                    c2482c.J(o10);
                    c2482c.f27727l = C.f27629H;
                } else if (wc.l.d(m10, B.g)) {
                    c2482c.x(this);
                    xc.l lVar = c2482c.f27730o;
                    c2482c.f27815e.add(lVar);
                    c2519v.f(s3, c2482c);
                    c2482c.W(lVar);
                } else {
                    if (m10.equals("head")) {
                        c2482c.x(this);
                        return false;
                    }
                    c2482c.m("body");
                    c2482c.f27737v = true;
                    c2482c.k(s3);
                }
            } else if (s3.e()) {
                String m11 = ((N) s3).m();
                if (wc.l.d(m11, B.f27602d)) {
                    c2482c.m("body");
                    c2482c.f27737v = true;
                    c2482c.k(s3);
                } else {
                    if (!m11.equals("template")) {
                        c2482c.x(this);
                        return false;
                    }
                    c2519v.f(s3, c2482c);
                }
            } else {
                c2482c.m("body");
                c2482c.f27737v = true;
                c2482c.k(s3);
            }
        }
        return true;
    }
}
