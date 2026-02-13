package F4;

import K4.i;
import m4.L;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4073a = new Object();

    public final Q5.e a(L l10) {
        String str = l10.f20096z;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new G4.b(0);
                case 1:
                    return new J4.a();
                case 2:
                    return new i(null);
                case 3:
                    return new G4.b(1);
                case 4:
                    return new M4.c();
            }
        }
        throw new IllegalArgumentException(X.c.t("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(L l10) {
        String str = l10.f20096z;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
