package j5;

import java.util.regex.Pattern;
import n5.v;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f18603c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f18604d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final v f18605a = new v();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f18606b = new StringBuilder();

    public static String a(v vVar, StringBuilder sb2) {
        boolean z8 = false;
        sb2.setLength(0);
        int i7 = vVar.f21230b;
        int i10 = vVar.f21231c;
        while (i7 < i10 && !z8) {
            char c10 = (char) vVar.f21229a[i7];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z8 = true;
            } else {
                i7++;
                sb2.append(c10);
            }
        }
        vVar.H(i7 - vVar.f21230b);
        return sb2.toString();
    }

    public static String b(v vVar, StringBuilder sb2) {
        c(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String a9 = a(vVar, sb2);
        if (!"".equals(a9)) {
            return a9;
        }
        return "" + ((char) vVar.v());
    }

    public static void c(v vVar) {
        while (true) {
            for (boolean z8 = true; vVar.a() > 0 && z8; z8 = false) {
                int i7 = vVar.f21230b;
                byte[] bArr = vVar.f21229a;
                byte b2 = bArr[i7];
                char c10 = (char) b2;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    vVar.H(1);
                } else {
                    int i10 = vVar.f21231c;
                    int i11 = i7 + 2;
                    if (i11 <= i10) {
                        int i12 = i7 + 1;
                        if (b2 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            vVar.H(i10 - vVar.f21230b);
                        }
                    }
                }
            }
            return;
        }
    }
}
