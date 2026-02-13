package yc;

/* renamed from: yc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2486e extends C {
    public C2486e() {
        super("InCaption", 10);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        boolean e2 = s3.e();
        A a9 = C.f27643w;
        if (e2 && ((N) s3).m().equals("caption")) {
            if (!c2482c.F("caption")) {
                c2482c.x(this);
                return false;
            }
            c2482c.z(false);
            if (!c2482c.c("caption")) {
                c2482c.x(this);
            }
            c2482c.R("caption");
            c2482c.r();
            c2482c.f27727l = a9;
            return true;
        }
        if ((!s3.f() || !wc.l.d(((O) s3).m(), B.f27619x)) && (!s3.e() || !((N) s3).m().equals("table"))) {
            if (!s3.e() || !wc.l.d(((N) s3).m(), B.f27596I)) {
                return C.f27641u.f(s3, c2482c);
            }
            c2482c.x(this);
            return false;
        }
        if (!c2482c.F("caption")) {
            c2482c.x(this);
            return false;
        }
        c2482c.z(false);
        if (!c2482c.c("caption")) {
            c2482c.x(this);
        }
        c2482c.R("caption");
        c2482c.r();
        c2482c.f27727l = a9;
        a9.f(s3, c2482c);
        return true;
    }
}
