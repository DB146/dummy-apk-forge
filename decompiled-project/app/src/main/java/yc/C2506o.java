package yc;

/* renamed from: yc.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum C2506o extends C {
    public C2506o() {
        super("InFrameset", 19);
    }

    @Override // yc.C
    public final boolean f(S s3, C2482c c2482c) {
        if (C.a(s3)) {
            c2482c.G((J) s3);
        } else if (s3.b()) {
            c2482c.I((K) s3);
        } else {
            if (s3.c()) {
                c2482c.x(this);
                return false;
            }
            if (s3.f()) {
                O o10 = (O) s3;
                String m10 = o10.m();
                m10.getClass();
                char c10 = 65535;
                switch (m10.hashCode()) {
                    case -1644953643:
                        if (m10.equals("frameset")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (m10.equals("html")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (m10.equals("frame")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (m10.equals("noframes")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        c2482c.J(o10);
                        break;
                    case 1:
                        return C.f27641u.f(o10, c2482c);
                    case 2:
                        c2482c.K(o10);
                        break;
                    case 3:
                        return C.f27638d.f(o10, c2482c);
                    default:
                        c2482c.x(this);
                        return false;
                }
            } else if (s3.e() && ((N) s3).m().equals("frameset")) {
                if (c2482c.c("html")) {
                    c2482c.x(this);
                    return false;
                }
                c2482c.j();
                if (!c2482c.f27739x && !c2482c.c("frameset")) {
                    c2482c.f27727l = C.f27630I;
                }
            } else {
                if (!s3.d()) {
                    c2482c.x(this);
                    return false;
                }
                if (!c2482c.c("html")) {
                    c2482c.x(this);
                }
            }
        }
        return true;
    }
}
