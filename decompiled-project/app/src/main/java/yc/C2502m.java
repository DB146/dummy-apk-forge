package yc;

/* renamed from: yc.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2502m extends C {
    public C2502m() {
        super("AfterBody", 18);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        xc.l A10 = c2482c.A("html");
        boolean a9 = C.a(s3);
        C2525y c2525y = C.f27641u;
        if (a9) {
            if (A10 != null) {
                c2482c.H((J) s3, A10);
                return true;
            }
            c2525y.f(s3, c2482c);
            return true;
        }
        if (s3.b()) {
            c2482c.I((K) s3);
            return true;
        }
        if (s3.c()) {
            c2482c.x(this);
            return false;
        }
        if (s3.f() && ((O) s3).m().equals("html")) {
            return c2525y.f(s3, c2482c);
        }
        if (s3.e() && ((N) s3).m().equals("html")) {
            if (c2482c.f27739x) {
                c2482c.x(this);
                return false;
            }
            c2482c.f27727l = C.f27631J;
            return true;
        }
        if (s3.d()) {
            return true;
        }
        c2482c.x(this);
        if (!c2482c.O("body")) {
            c2482c.f27815e.add(c2482c.f27814d.p0());
        }
        c2482c.f27727l = c2525y;
        return c2482c.k(s3);
    }
}
