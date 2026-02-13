package okhttp3.internal.url;

import ac.g;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilCommonKt;

/* loaded from: classes2.dex */
public final class _UrlKt {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f22942a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i7, int i10, int i11, String str, String str2) {
        int i12 = (i11 & 1) != 0 ? 0 : i7;
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        int i13 = i10;
        boolean z8 = (i11 & 8) == 0;
        boolean z10 = (i11 & 16) == 0;
        boolean z11 = (i11 & 32) == 0;
        boolean z12 = (i11 & 64) == 0;
        l.e(str, "<this>");
        return b(str, i12, i13, str2, z8, z10, z11, z12, 128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [rc.h] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, rc.h] */
    public static String b(String str, int i7, int i10, String str2, boolean z8, boolean z10, boolean z11, boolean z12, int i11) {
        int i12 = (i11 & 1) != 0 ? 0 : i7;
        int length = (i11 & 2) != 0 ? str.length() : i10;
        boolean z13 = (i11 & 8) != 0 ? false : z8;
        boolean z14 = (i11 & 16) != 0 ? false : z10;
        boolean z15 = (i11 & 64) == 0 ? z12 : false;
        l.e(str, "<this>");
        int i13 = i12;
        while (i13 < length) {
            int codePointAt = str.codePointAt(i13);
            int i14 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z15) || g.a0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z13 || (z14 && !c(i13, length, str)))) || (codePointAt == 43 && z11)))) {
                ?? obj = new Object();
                obj.q0(i12, i13, str);
                ?? r22 = 0;
                while (i13 < length) {
                    int codePointAt2 = str.codePointAt(i13);
                    if (!z13 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.r0("+");
                        } else if (codePointAt2 == 43 && z11) {
                            obj.r0(z13 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i14 && !z15) || g.a0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z13 || (z14 && !c(i13, length, str)))))) {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.s0(codePointAt2);
                            while (!r22.K()) {
                                byte V7 = r22.V();
                                obj.l0(37);
                                char[] cArr = f22942a;
                                obj.l0(cArr[((V7 & 255) >> 4) & 15]);
                                obj.l0(cArr[V7 & 15]);
                            }
                        } else {
                            obj.s0(codePointAt2);
                        }
                    }
                    i13 += Character.charCount(codePointAt2);
                    i14 = 128;
                    r22 = r22;
                }
                return obj.d0();
            }
            i13 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i12, length);
        l.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean c(int i7, int i10, String str) {
        l.e(str, "<this>");
        int i11 = i7 + 2;
        return i11 < i10 && str.charAt(i7) == '%' && _UtilCommonKt.j(str.charAt(i7 + 1)) != -1 && _UtilCommonKt.j(str.charAt(i11)) != -1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rc.h] */
    public static String d(int i7, int i10, int i11, String str) {
        int i12;
        if ((i11 & 1) != 0) {
            i7 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z8 = (i11 & 4) == 0;
        l.e(str, "<this>");
        int i13 = i7;
        while (i13 < i10) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z8)) {
                ?? obj = new Object();
                obj.q0(i7, i13, str);
                while (i13 < i10) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt != 37 || (i12 = i13 + 2) >= i10) {
                        if (codePointAt == 43 && z8) {
                            obj.l0(32);
                            i13++;
                        }
                        obj.s0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        int j = _UtilCommonKt.j(str.charAt(i13 + 1));
                        int j10 = _UtilCommonKt.j(str.charAt(i12));
                        if (j != -1 && j10 != -1) {
                            obj.l0((j << 4) + j10);
                            i13 = Character.charCount(codePointAt) + i12;
                        }
                        obj.s0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return obj.d0();
            }
            i13++;
        }
        String substring = str.substring(i7, i10);
        l.d(substring, "substring(...)");
        return substring;
    }
}
