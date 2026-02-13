package ac;

import Eb.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class g extends n {
    public static boolean a0(CharSequence charSequence, char c10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return e0(charSequence, c10, 0, 2) >= 0;
    }

    public static boolean b0(CharSequence charSequence, String other) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        return f0(charSequence, other, 0, 2) >= 0;
    }

    public static final int c0(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d0(CharSequence charSequence, String string, int i7, boolean z8) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i7);
        }
        int length = charSequence.length();
        if (i7 < 0) {
            i7 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        Xb.e eVar = new Xb.e(i7, length, 1);
        boolean z10 = charSequence instanceof String;
        int i10 = eVar.f11027c;
        int i11 = eVar.f11026b;
        int i12 = eVar.f11025a;
        if (!z10 || string == null) {
            if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                while (!m0(string, 0, charSequence, i12, string.length(), z8)) {
                    if (i12 != i11) {
                        i12 += i10;
                    }
                }
                return i12;
            }
            return -1;
        }
        if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
            while (!n.U(0, i12, string.length(), string, (String) charSequence, z8)) {
                if (i12 != i11) {
                    i12 += i10;
                }
            }
            return i12;
        }
        return -1;
    }

    public static int e0(CharSequence charSequence, char c10, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? g0(charSequence, new char[]{c10}, i7, false) : ((String) charSequence).indexOf(c10, i7);
    }

    public static /* synthetic */ int f0(CharSequence charSequence, String str, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        return d0(charSequence, str, i7, false);
    }

    public static final int g0(CharSequence charSequence, char[] cArr, int i7, boolean z8) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (!z8 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i7);
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int c02 = c0(charSequence);
        if (i7 > c02) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i7);
            for (char c10 : cArr) {
                if (com.bumptech.glide.c.z(c10, charAt, z8)) {
                    return i7;
                }
            }
            if (i7 == c02) {
                return -1;
            }
            i7++;
        }
    }

    public static boolean h0(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!com.bumptech.glide.c.J(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int i0(int i7, String str, String string) {
        int c02 = (i7 & 2) != 0 ? c0(str) : 0;
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(string, "string");
        return str.lastIndexOf(string, c02);
    }

    public static int j0(String str, char c10, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = c0(str);
        }
        kotlin.jvm.internal.l.e(str, "<this>");
        return str.lastIndexOf(c10, i7);
    }

    public static String k0(int i7, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.l.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "Desired length ", " is less than zero."));
        }
        if (i7 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i7);
            sb2.append((CharSequence) str);
            int length = i7 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static String l0(int i7, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.l.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "Desired length ", " is less than zero."));
        }
        if (i7 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i7);
            int length = i7 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static final boolean m0(String str, int i7, CharSequence other, int i10, int i11, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        if (i10 < 0 || i7 < 0 || i7 > str.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!com.bumptech.glide.c.z(str.charAt(i7 + i12), other.charAt(i10 + i12), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String n0(String str, String str2) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (!n.Y(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public static String o0(String str, String str2) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (!n.S(str, str2, false)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public static String p0(String str, String str2) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (str.length() < str2.length() + str2.length() || !n.Y(str, str2, false) || !n.S(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length(), str.length() - str2.length());
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public static final List q0(CharSequence charSequence, String str) {
        int d02 = d0(charSequence, str, 0, false);
        if (d02 == -1) {
            return u0.x(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i7 = 0;
        do {
            arrayList.add(charSequence.subSequence(i7, d02).toString());
            i7 = str.length() + d02;
            d02 = d0(charSequence, str, i7, false);
        } while (d02 != -1);
        arrayList.add(charSequence.subSequence(i7, charSequence.length()).toString());
        return arrayList;
    }

    public static List r0(CharSequence charSequence, String[] strArr) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return q0(charSequence, str);
            }
        }
        Eb.m mVar = new Eb.m(new Ob.h(charSequence, new o(Eb.n.J(strArr), 1)), 1);
        ArrayList arrayList = new ArrayList(p.S(mVar, 10));
        Iterator it = mVar.iterator();
        while (true) {
            C0797b c0797b = (C0797b) it;
            if (!c0797b.hasNext()) {
                return arrayList;
            }
            Xb.g range = (Xb.g) c0797b.next();
            kotlin.jvm.internal.l.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f11025a, range.f11026b + 1).toString());
        }
    }

    public static List s0(String str, char[] cArr) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (cArr.length == 1) {
            return q0(str, String.valueOf(cArr[0]));
        }
        Eb.m mVar = new Eb.m(new Ob.h(str, new o(cArr, 0)), 1);
        ArrayList arrayList = new ArrayList(p.S(mVar, 10));
        Iterator it = mVar.iterator();
        while (true) {
            C0797b c0797b = (C0797b) it;
            if (!c0797b.hasNext()) {
                return arrayList;
            }
            Xb.g range = (Xb.g) c0797b.next();
            kotlin.jvm.internal.l.e(range, "range");
            arrayList.add(str.subSequence(range.f11025a, range.f11026b + 1).toString());
        }
    }

    public static String t0(String str, String delimiter, String str2) {
        kotlin.jvm.internal.l.e(delimiter, "delimiter");
        int f02 = f0(str, delimiter, 0, 6);
        if (f02 == -1) {
            return str2;
        }
        String substring = str.substring(delimiter.length() + f02, str.length());
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public static String u0(int i7, String str) {
        kotlin.jvm.internal.l.e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i7 > length) {
            i7 = length;
        }
        String substring = str.substring(0, i7);
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        return substring;
    }

    public static CharSequence v0(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z8 = false;
        while (i7 <= length) {
            boolean J10 = com.bumptech.glide.c.J(charSequence.charAt(!z8 ? i7 : length));
            if (z8) {
                if (!J10) {
                    break;
                }
                length--;
            } else if (J10) {
                i7++;
            } else {
                z8 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static CharSequence w0(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!com.bumptech.glide.c.J(str.charAt(i7))) {
                return str.subSequence(i7, str.length());
            }
        }
        return "";
    }
}
