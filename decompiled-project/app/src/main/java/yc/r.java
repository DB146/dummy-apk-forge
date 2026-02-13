package yc;

/* loaded from: classes2.dex */
public enum r extends C {
    public r() {
        super("AfterAfterFrameset", 22);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.b()) {
            c2482c.I((K) s3);
            return true;
        }
        if (s3.c() || C.a(s3) || (s3.f() && ((O) s3).m().equals("html"))) {
            return C.f27641u.f(s3, c2482c);
        }
        if (s3.d()) {
            return true;
        }
        if (s3.f() && ((O) s3).m().equals("noframes")) {
            return C.f27638d.f(s3, c2482c);
        }
        c2482c.x(this);
        return false;
    }
}
