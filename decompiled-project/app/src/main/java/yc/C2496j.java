package yc;

/* renamed from: yc.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2496j extends C {
    public C2496j() {
        super("InSelect", 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006b, code lost:
    
        if (r8.equals("optgroup") == false) goto L25;
     */
    @Override // yc.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(S s3, C2482c c2482c) {
        char c10 = 3;
        int b2 = P.c.b(s3.f27675a);
        if (b2 == 0) {
            c2482c.x(this);
            return false;
        }
        C2519v c2519v = C.f27638d;
        if (b2 == 1) {
            O o10 = (O) s3;
            String m10 = o10.m();
            if (m10.equals("html")) {
                return C.f27641u.f(o10, c2482c);
            }
            if (m10.equals("option")) {
                if (c2482c.c("option")) {
                    c2482c.l("option");
                }
                c2482c.J(o10);
            } else {
                if (!m10.equals("optgroup")) {
                    if (m10.equals("select")) {
                        c2482c.x(this);
                        return c2482c.l("select");
                    }
                    if (wc.l.d(m10, B.f27592E)) {
                        c2482c.x(this);
                        if (!c2482c.D("select")) {
                            return false;
                        }
                        c2482c.l("select");
                        return c2482c.k(o10);
                    }
                    if (m10.equals("script") || m10.equals("template")) {
                        return c2519v.f(s3, c2482c);
                    }
                    c2482c.x(this);
                    return false;
                }
                if (c2482c.c("option")) {
                    c2482c.l("option");
                }
                if (c2482c.c("optgroup")) {
                    c2482c.l("optgroup");
                }
                c2482c.J(o10);
            }
        } else if (b2 == 2) {
            String m11 = ((N) s3).m();
            m11.getClass();
            switch (m11.hashCode()) {
                case -1321546630:
                    if (m11.equals("template")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1010136971:
                    if (m11.equals("option")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -906021636:
                    if (m11.equals("select")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -80773204:
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return c2519v.f(s3, c2482c);
                case 1:
                    if (!c2482c.c("option")) {
                        c2482c.x(this);
                        break;
                    } else {
                        c2482c.j();
                        break;
                    }
                case 2:
                    if (!c2482c.D(m11)) {
                        c2482c.x(this);
                        return false;
                    }
                    c2482c.R(m11);
                    c2482c.X();
                    break;
                case 3:
                    if (c2482c.c("option") && c2482c.p(c2482c.b()) != null && c2482c.p(c2482c.b()).K("optgroup")) {
                        c2482c.l("option");
                    }
                    if (!c2482c.c("optgroup")) {
                        c2482c.x(this);
                        break;
                    } else {
                        c2482c.j();
                        break;
                    }
                    break;
                default:
                    c2482c.x(this);
                    return false;
            }
        } else if (b2 == 3) {
            c2482c.I((K) s3);
        } else if (b2 == 4) {
            J j = (J) s3;
            if (j.f27664d.L().equals(C.f27633M)) {
                c2482c.x(this);
                return false;
            }
            c2482c.G(j);
        } else {
            if (b2 != 6) {
                c2482c.x(this);
                return false;
            }
            if (!c2482c.c("html")) {
                c2482c.x(this);
            }
        }
        return true;
    }
}
