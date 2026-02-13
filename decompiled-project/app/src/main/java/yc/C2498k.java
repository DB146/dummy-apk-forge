package yc;

/* renamed from: yc.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2498k extends C {
    public C2498k() {
        super("InSelectInTable", 16);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        boolean f4 = s3.f();
        String[] strArr = B.f27593F;
        if (f4 && wc.l.d(((O) s3).m(), strArr)) {
            c2482c.x(this);
            c2482c.R("select");
            c2482c.X();
            return c2482c.k(s3);
        }
        if (s3.e()) {
            N n6 = (N) s3;
            if (wc.l.d(n6.m(), strArr)) {
                c2482c.x(this);
                if (!c2482c.F(n6.m())) {
                    return false;
                }
                c2482c.R("select");
                c2482c.X();
                return c2482c.k(s3);
            }
        }
        return C.f27625D.f(s3, c2482c);
    }
}
