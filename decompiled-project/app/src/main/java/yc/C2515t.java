package yc;

/* renamed from: yc.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2515t extends C {
    public C2515t() {
        super("BeforeHtml", 1);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.c()) {
            c2482c.x(this);
            return false;
        }
        if (s3.b()) {
            c2482c.I((K) s3);
            return true;
        }
        if (C.a(s3)) {
            c2482c.G((J) s3);
            return true;
        }
        boolean f4 = s3.f();
        C2517u c2517u = C.f27637c;
        if (f4) {
            O o10 = (O) s3;
            if (o10.m().equals("html")) {
                c2482c.J(o10);
                c2482c.f27727l = c2517u;
                return true;
            }
        }
        if (s3.e() && wc.l.d(((N) s3).m(), B.f27603e)) {
            c2482c.m("html");
            c2482c.f27727l = c2517u;
            return c2482c.k(s3);
        }
        if (s3.e()) {
            c2482c.x(this);
            return false;
        }
        c2482c.m("html");
        c2482c.f27727l = c2517u;
        return c2482c.k(s3);
    }
}
