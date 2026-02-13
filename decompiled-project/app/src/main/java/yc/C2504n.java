package yc;

/* renamed from: yc.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2504n extends C {
    public C2504n() {
        super("Initial", 0);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (C.a(s3)) {
            return true;
        }
        if (s3.b()) {
            c2482c.I((K) s3);
        } else {
            boolean c10 = s3.c();
            C2515t c2515t = C.f27636b;
            if (!c10) {
                c2482c.f27814d.f26343z = 2;
                c2482c.f27727l = c2515t;
                return c2482c.k(s3);
            }
            L l10 = (L) s3;
            D d10 = c2482c.f27817h;
            String L = l10.f27666d.L();
            d10.getClass();
            String trim = L.trim();
            if (!d10.f27649a) {
                trim = wc.c.c(trim);
            }
            xc.h hVar = new xc.h(trim, l10.f27668f.L(), l10.g.L());
            String str = l10.f27667e;
            if (str != null) {
                hVar.t("pubSysKey", str);
            }
            c2482c.f27814d.Z(hVar);
            if (l10.f27669h || !hVar.o("name").equals("html") || hVar.o("publicId").equalsIgnoreCase("HTML")) {
                c2482c.f27814d.f26343z = 2;
            }
            c2482c.f27727l = c2515t;
        }
        return true;
    }
}
