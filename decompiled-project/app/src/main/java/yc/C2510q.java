package yc;

/* renamed from: yc.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2510q extends C {
    public C2510q() {
        super("AfterAfterBody", 21);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.b()) {
            c2482c.I((K) s3);
            return true;
        }
        boolean c10 = s3.c();
        C2525y c2525y = C.f27641u;
        if (c10 || (s3.f() && ((O) s3).m().equals("html"))) {
            return c2525y.f(s3, c2482c);
        }
        if (C.a(s3)) {
            c2482c.H((J) s3, c2482c.f27814d);
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
