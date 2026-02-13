package yc;

/* renamed from: yc.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2492h extends C {
    public C2492h() {
        super("InRow", 13);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        boolean f4 = s3.f();
        A a9 = C.f27643w;
        C2490g c2490g = C.f27622A;
        if (f4) {
            O o10 = (O) s3;
            String m10 = o10.m();
            if (wc.l.d(m10, B.f27616u)) {
                c2482c.u();
                c2482c.J(o10);
                c2482c.f27727l = C.f27624C;
                c2482c.f27733r.add(null);
                return true;
            }
            if (!wc.l.d(m10, B.f27590C)) {
                return a9.f(s3, c2482c);
            }
            if (!c2482c.F("tr")) {
                c2482c.x(this);
                return false;
            }
            c2482c.u();
            c2482c.j();
            c2482c.f27727l = c2490g;
            return c2482c.k(s3);
        }
        if (!s3.e()) {
            return a9.f(s3, c2482c);
        }
        String m11 = ((N) s3).m();
        if (m11.equals("tr")) {
            if (!c2482c.F(m11)) {
                c2482c.x(this);
                return false;
            }
            c2482c.u();
            c2482c.j();
            c2482c.f27727l = c2490g;
            return true;
        }
        if (m11.equals("table")) {
            if (!c2482c.F("tr")) {
                c2482c.x(this);
                return false;
            }
            c2482c.u();
            c2482c.j();
            c2482c.f27727l = c2490g;
            return c2482c.k(s3);
        }
        if (!wc.l.d(m11, B.f27613r)) {
            if (!wc.l.d(m11, B.f27591D)) {
                return a9.f(s3, c2482c);
            }
            c2482c.x(this);
            return false;
        }
        if (!c2482c.F(m11)) {
            c2482c.x(this);
            return false;
        }
        if (!c2482c.F("tr")) {
            return false;
        }
        c2482c.u();
        c2482c.j();
        c2482c.f27727l = c2490g;
        return c2482c.k(s3);
    }
}
