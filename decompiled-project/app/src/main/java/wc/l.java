package wc;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f25891a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f25892b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f25893c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f25894d = Pattern.compile("[\\x00-\\x1f]*");

    /* renamed from: e, reason: collision with root package name */
    public static final ha.g f25895e = new ha.g(new d(2));

    public static void a(String str, StringBuilder sb2, boolean z8) {
        int length = str.length();
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i7 < length) {
            int codePointAt = str.codePointAt(i7);
            if (codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160) {
                if ((!z8 || z10) && !z11) {
                    sb2.append(' ');
                    z11 = true;
                }
            } else if (codePointAt != 8203 && codePointAt != 173) {
                sb2.appendCodePoint(codePointAt);
                z11 = false;
                z10 = true;
            }
            i7 += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder b() {
        return (StringBuilder) f25895e.d();
    }

    public static boolean c(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean e(char c10) {
        return (c10 >= 'a' && c10 <= 'z') || (c10 >= 'A' && c10 <= 'Z');
    }

    public static boolean f(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                if (!i(str.codePointAt(i7))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean h(char c10) {
        return g(c10) || (c10 >= 'a' && c10 <= 'f') || (c10 >= 'A' && c10 <= 'F');
    }

    public static boolean i(int i7) {
        return i7 == 32 || i7 == 9 || i7 == 10 || i7 == 12 || i7 == 13;
    }

    public static String j(Collection collection, String str) {
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder b2 = b();
        vc.i.D(b2);
        b2.append((Object) obj);
        while (it.hasNext()) {
            Object next = it.next();
            b2.append(str);
            b2.append(next);
        }
        return l(b2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.BinaryOperator] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.function.BiConsumer, java.lang.Object] */
    public static Collector k(final String str) {
        return Collector.of(new Supplier() { // from class: wc.h
            @Override // java.util.function.Supplier
            public final Object get() {
                return new k(str);
            }
        }, new Object(), new Object(), new b(2), new Collector.Characteristics[0]);
    }

    public static String l(StringBuilder sb2) {
        vc.i.D(sb2);
        String sb3 = sb2.toString();
        if (sb2.length() <= 8192) {
            sb2.delete(0, sb2.length());
            f25895e.o(sb2);
        }
        return sb3;
    }

    public static URL m(URL url, String str) {
        String replaceAll = f25894d.matcher(str).replaceAll("");
        if (replaceAll.startsWith("?")) {
            replaceAll = url.getPath() + replaceAll;
        }
        URL url2 = new URL(url, replaceAll);
        String replaceFirst = f25892b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder n6 = A3.c.n(replaceFirst, "#");
            n6.append(url2.getRef());
            replaceFirst = n6.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
