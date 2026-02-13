package yc;

import ea.C1111f;

/* renamed from: yc.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2521w extends C {
    public C2521w() {
        super("InHeadNoscript", 4);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (s3.c()) {
            c2482c.x(this);
        } else {
            if (s3.f() && ((O) s3).m().equals("html")) {
                return C.f27641u.f(s3, c2482c);
            }
            boolean e2 = s3.e();
            C2519v c2519v = C.f27638d;
            if (!e2 || !((N) s3).m().equals("noscript")) {
                if (C.a(s3) || s3.b() || (s3.f() && wc.l.d(((O) s3).m(), B.f27604f))) {
                    return c2519v.f(s3, c2482c);
                }
                if (s3.e() && ((N) s3).m().equals("br")) {
                    c2482c.x(this);
                    J j = new J();
                    String obj = s3.toString();
                    C1111f c1111f = j.f27664d;
                    c1111f.z();
                    c1111f.f16837b = obj;
                    c2482c.G(j);
                    return true;
                }
                if ((s3.f() && wc.l.d(((O) s3).m(), B.f27595H)) || s3.e()) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.x(this);
                J j10 = new J();
                String obj2 = s3.toString();
                C1111f c1111f2 = j10.f27664d;
                c1111f2.z();
                c1111f2.f16837b = obj2;
                c2482c.G(j10);
                return true;
            }
            c2482c.j();
            c2482c.f27727l = c2519v;
        }
        return true;
    }
}
