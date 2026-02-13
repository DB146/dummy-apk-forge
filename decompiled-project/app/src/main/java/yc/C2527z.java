package yc;

/* renamed from: yc.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2527z extends C {
    public C2527z() {
        super("Text", 7);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.a()) {
            c2482c.G((J) s3);
            return true;
        }
        if (!s3.d()) {
            if (!s3.e()) {
                return true;
            }
            c2482c.j();
            c2482c.f27727l = c2482c.f27728m;
            return true;
        }
        c2482c.x(this);
        c2482c.j();
        C c10 = c2482c.f27728m;
        c2482c.f27727l = c10;
        if (c10 == C.f27642v) {
            c2482c.f27727l = C.f27641u;
        }
        return c2482c.k(s3);
    }
}
