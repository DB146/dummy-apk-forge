package yc;

/* renamed from: yc.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2517u extends C {
    public C2517u() {
        super("BeforeHead", 2);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (C.a(s3)) {
            c2482c.G((J) s3);
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
            return C.f27641u.f(s3, c2482c);
        }
        if (s3.f()) {
            O o10 = (O) s3;
            if (o10.m().equals("head")) {
                c2482c.f27730o = c2482c.J(o10);
                c2482c.f27727l = C.f27638d;
                return true;
            }
        }
        if (s3.e() && wc.l.d(((N) s3).m(), B.f27603e)) {
            c2482c.m("head");
            return c2482c.k(s3);
        }
        if (s3.e()) {
            c2482c.x(this);
            return false;
        }
        c2482c.m("head");
        return c2482c.k(s3);
    }
}
