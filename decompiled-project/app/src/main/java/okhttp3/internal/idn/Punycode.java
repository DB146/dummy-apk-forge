package okhttp3.internal.idn;

import Y5.C0658x;
import rc.C1967k;

/* loaded from: classes2.dex */
public final class Punycode {

    /* renamed from: a, reason: collision with root package name */
    public static final Punycode f22885a = new Punycode();

    /* renamed from: b, reason: collision with root package name */
    public static final String f22886b = "xn--";

    /* renamed from: c, reason: collision with root package name */
    public static final C1967k f22887c;

    static {
        C1967k c1967k = C1967k.f23967d;
        f22887c = C0658x.c("xn--");
    }

    private Punycode() {
    }

    public static int a(boolean z8, int i7, int i10) {
        int i11 = z8 ? i7 / 700 : i7 / 2;
        int i12 = (i11 / i10) + i11;
        int i13 = 0;
        while (i12 > 455) {
            i12 /= 35;
            i13 += 36;
        }
        return ((i12 * 36) / (i12 + 38)) + i13;
    }

    public static int b(int i7) {
        if (i7 < 26) {
            return i7 + 97;
        }
        if (i7 < 36) {
            return i7 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i7).toString());
    }
}
