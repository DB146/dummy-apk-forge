package yc;

/* renamed from: yc.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2508p extends C {
    public C2508p() {
        super("AfterFrameset", 20);
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
        if (s3.e() && ((N) s3).m().equals("html")) {
            c2482c.f27727l = C.f27632K;
            return true;
        }
        if (s3.f() && ((O) s3).m().equals("noframes")) {
            return C.f27638d.f(s3, c2482c);
        }
        if (s3.d()) {
            return true;
        }
        c2482c.x(this);
        return false;
    }
}
