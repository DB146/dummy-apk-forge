package yc;

/* renamed from: yc.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2494i extends C {
    public C2494i() {
        super("InCell", 14);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        boolean e2 = s3.e();
        C2525y c2525y = C.f27641u;
        if (!e2) {
            if (!s3.f() || !wc.l.d(((O) s3).m(), B.f27619x)) {
                return c2525y.f(s3, c2482c);
            }
            if (!c2482c.F("td") && !c2482c.F("th")) {
                c2482c.x(this);
                return false;
            }
            if (c2482c.F("td")) {
                c2482c.l("td");
            } else {
                c2482c.l("th");
            }
            return c2482c.k(s3);
        }
        String m10 = ((N) s3).m();
        if (!wc.l.d(m10, B.f27616u)) {
            if (wc.l.d(m10, B.f27617v)) {
                c2482c.x(this);
                return false;
            }
            if (!wc.l.d(m10, B.f27618w)) {
                return c2525y.f(s3, c2482c);
            }
            if (!c2482c.F(m10)) {
                c2482c.x(this);
                return false;
            }
            if (c2482c.F("td")) {
                c2482c.l("td");
            } else {
                c2482c.l("th");
            }
            return c2482c.k(s3);
        }
        boolean F10 = c2482c.F(m10);
        C2492h c2492h = C.f27623B;
        if (!F10) {
            c2482c.x(this);
            c2482c.f27727l = c2492h;
            return false;
        }
        c2482c.z(false);
        if (!c2482c.c(m10)) {
            c2482c.x(this);
        }
        c2482c.R(m10);
        c2482c.r();
        c2482c.f27727l = c2492h;
        return true;
    }
}
