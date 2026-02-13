package okhttp3.internal;

import Eb.C0252c;
import Y5.C0658x;
import ac.g;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.l;
import rc.AbstractC1958b;
import rc.C;
import rc.C1964h;
import rc.C1967k;
import rc.y;

/* loaded from: classes2.dex */
public final class _UtilCommonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f22495a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final y f22496b;

    static {
        C1967k c1967k = C1967k.f23967d;
        f22496b = AbstractC1958b.f(C0658x.b("efbbbf"), C0658x.b("feff"), C0658x.b("fffe0000"), C0658x.b("fffe"), C0658x.b("0000feff"));
    }

    public static final void a(Closeable closeable) {
        l.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final int b(int i7, int i10, String str, String str2) {
        l.e(str, "<this>");
        while (i7 < i10) {
            if (g.a0(str2, str.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static final int c(String str, char c10, int i7, int i10) {
        l.e(str, "<this>");
        while (i7 < i10) {
            if (str.charAt(i7) == c10) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static final boolean d(String[] strArr, String[] strArr2, Comparator comparator) {
        l.e(strArr, "<this>");
        l.e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0252c h10 = l.h(strArr2);
                while (h10.hasNext()) {
                    if (comparator.compare(str, (String) h10.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int e(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (l.f(charAt, 31) <= 0 || l.f(charAt, 127) >= 0) {
                return i7;
            }
        }
        return -1;
    }

    public static final int f(int i7, int i10, String str) {
        l.e(str, "<this>");
        while (i7 < i10) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static final int g(int i7, int i10, String str) {
        l.e(str, "<this>");
        int i11 = i10 - 1;
        if (i7 <= i11) {
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i7) {
                    break;
                }
                i11--;
            }
        }
        return i7;
    }

    public static final String[] h(String[] strArr, String[] other, Comparator comparator) {
        l.e(strArr, "<this>");
        l.e(other, "other");
        l.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i7]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i7++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean i(String name) {
        l.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int j(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int k(C c10) {
        l.e(c10, "<this>");
        return (c10.F() & 255) | ((c10.F() & 255) << 16) | ((c10.F() & 255) << 8);
    }

    public static final int l(C1964h c1964h) {
        int i7 = 0;
        while (!c1964h.K() && c1964h.P(0L) == 61) {
            i7++;
            c1964h.V();
        }
        return i7;
    }

    public static final int m(int i7, String str) {
        if (str == null) {
            return i7;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return f.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i7;
        }
    }

    public static final String n(int i7, int i10, String str) {
        int f4 = f(i7, i10, str);
        String substring = str.substring(f4, g(f4, i10, str));
        l.d(substring, "substring(...)");
        return substring;
    }
}
