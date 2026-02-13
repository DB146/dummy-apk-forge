package yc;

/* renamed from: yc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2488f extends C {
    public C2488f() {
        super("InColumnGroup", 11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        if (r7.equals("template") == false) goto L37;
     */
    @Override // yc.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(S s3, C2482c c2482c) {
        boolean z8 = false;
        if (C.a(s3)) {
            c2482c.G((J) s3);
            return true;
        }
        int b2 = P.c.b(s3.f27675a);
        if (b2 != 0) {
            C2519v c2519v = C.f27638d;
            if (b2 == 1) {
                O o10 = (O) s3;
                String m10 = o10.m();
                m10.getClass();
                switch (m10.hashCode()) {
                    case -1321546630:
                        break;
                    case 98688:
                        if (m10.equals("col")) {
                            z8 = true;
                            break;
                        }
                        z8 = -1;
                        break;
                    case 3213227:
                        if (m10.equals("html")) {
                            z8 = 2;
                            break;
                        }
                        z8 = -1;
                        break;
                    default:
                        z8 = -1;
                        break;
                }
                switch (z8) {
                    case false:
                        c2519v.f(s3, c2482c);
                        break;
                    case true:
                        c2482c.K(o10);
                        break;
                    case true:
                        return C.f27641u.f(s3, c2482c);
                    default:
                        return g(s3, c2482c);
                }
            } else if (b2 == 2) {
                String m11 = ((N) s3).m();
                m11.getClass();
                if (m11.equals("template")) {
                    c2519v.f(s3, c2482c);
                } else {
                    if (!m11.equals("colgroup")) {
                        return g(s3, c2482c);
                    }
                    if (!c2482c.c(m11)) {
                        c2482c.x(this);
                        return false;
                    }
                    c2482c.j();
                    c2482c.f27727l = C.f27643w;
                }
            } else {
                if (b2 != 3) {
                    if (b2 == 6 && c2482c.c("html")) {
                        return true;
                    }
                    return g(s3, c2482c);
                }
                c2482c.I((K) s3);
            }
        } else {
            c2482c.x(this);
        }
        return true;
    }

    public final boolean g(S s3, C2482c c2482c) {
        if (!c2482c.c("colgroup")) {
            c2482c.x(this);
            return false;
        }
        c2482c.j();
        c2482c.f27727l = C.f27643w;
        c2482c.k(s3);
        return true;
    }
}
