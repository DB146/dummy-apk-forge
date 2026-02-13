package ac;

/* loaded from: classes2.dex */
public abstract class n extends m {
    public static boolean S(String str, String suffix, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(suffix, "suffix");
        return !z8 ? str.endsWith(suffix) : U(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean T(String str, String str2, boolean z8) {
        return str == null ? str2 == null : !z8 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean U(int i7, int i10, int i11, String str, String other, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        return !z8 ? str.regionMatches(i7, other, i10, i11) : str.regionMatches(z8, i7, other, i10, i11);
    }

    public static String V(int i7, String str) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i10 = 1;
        if (i7 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i7];
            for (int i11 = 0; i11 < i7; i11++) {
                cArr[i11] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i7) {
                    break;
                }
                i10++;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.b(sb3);
        return sb3;
    }

    public static String W(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(oldValue, "oldValue");
        kotlin.jvm.internal.l.e(newValue, "newValue");
        int d02 = g.d0(str, oldValue, 0, false);
        if (d02 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, d02);
            sb2.append(newValue);
            i10 = d02 + length;
            if (d02 >= str.length()) {
                break;
            }
            d02 = g.d0(str, oldValue, d02 + i7, false);
        } while (d02 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }

    public static boolean X(String str, int i7, String str2, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return !z8 ? str.startsWith(str2, i7) : U(i7, 0, str2.length(), str, str2, z8);
    }

    public static boolean Y(String str, String prefix, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        return !z8 ? str.startsWith(prefix) : U(0, 0, prefix.length(), str, prefix, z8);
    }

    public static Integer Z(String str) {
        boolean z8;
        int i7;
        int i10;
        kotlin.jvm.internal.l.e(str, "<this>");
        com.bumptech.glide.c.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        if (kotlin.jvm.internal.l.f(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z8 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z8 = true;
            }
        } else {
            z8 = false;
            i7 = 0;
        }
        int i13 = -59652323;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                return null;
            }
            i11 = i10 - digit;
            i7++;
        }
        return z8 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }
}
