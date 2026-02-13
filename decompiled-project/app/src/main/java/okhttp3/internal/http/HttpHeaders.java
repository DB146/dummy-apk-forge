package okhttp3.internal.http;

import Eb.v;
import Eb.w;
import X.c;
import Y5.C0658x;
import ac.AbstractC0796a;
import ac.e;
import ac.g;
import ac.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import rc.C1964h;
import rc.C1967k;

/* loaded from: classes2.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    public static final C1967k f22677a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1967k f22678b;

    static {
        C1967k c1967k = C1967k.f23967d;
        f22677a = C0658x.c("\"\\");
        f22678b = C0658x.c("\t ,=");
    }

    public static final boolean a(Response response) {
        if (l.a(response.f22439a.f22425b, "HEAD")) {
            return false;
        }
        int i7 = response.f22442d;
        if (((i7 >= 100 && i7 < 200) || i7 == 204 || i7 == 304) && _UtilJvmKt.f(response) == -1) {
            String b2 = response.f22444f.b("Transfer-Encoding");
            if (b2 == null) {
                b2 = null;
            }
            if (!"chunked".equalsIgnoreCase(b2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0102, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0102, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, rc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C1964h c1964h, ArrayList arrayList) {
        String c10;
        int l10;
        String c11;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    e(c1964h);
                    str = c(c1964h);
                    if (str == null) {
                        return;
                    }
                }
                boolean e2 = e(c1964h);
                c10 = c(c1964h);
                if (c10 == null) {
                    if (c1964h.K()) {
                        arrayList.add(new Challenge(str, w.f3892a));
                        return;
                    }
                    return;
                }
                l10 = _UtilCommonKt.l(c1964h);
                boolean e10 = e(c1964h);
                if (e2 || (!e10 && !c1964h.K())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int l11 = _UtilCommonKt.l(c1964h) + l10;
                    while (true) {
                        if (c10 == null) {
                            c10 = c(c1964h);
                            if (!e(c1964h)) {
                                l11 = _UtilCommonKt.l(c1964h);
                            }
                        }
                        if (l11 != 0) {
                            if (l11 > 1 || e(c1964h)) {
                                return;
                            }
                            if (c1964h.K() || c1964h.P(0L) != 34) {
                                c11 = c(c1964h);
                            } else {
                                if (c1964h.V() != 34) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                ?? obj = new Object();
                                while (true) {
                                    long T10 = c1964h.T(f22677a);
                                    if (T10 == -1) {
                                        break;
                                    }
                                    if (c1964h.P(T10) == 34) {
                                        obj.m(T10, c1964h);
                                        c1964h.V();
                                        c11 = obj.d0();
                                        break;
                                    } else {
                                        if (c1964h.f23966b == T10 + 1) {
                                            break;
                                        }
                                        obj.m(T10, c1964h);
                                        c1964h.V();
                                        obj.m(1L, c1964h);
                                    }
                                }
                                c11 = null;
                            }
                            if (c11 == null || ((String) linkedHashMap.put(c10, c11)) != null) {
                                return;
                            }
                            if (!e(c1964h) && !c1964h.K()) {
                                return;
                            } else {
                                c10 = null;
                            }
                        }
                    }
                    arrayList.add(new Challenge(str, linkedHashMap));
                    str = c10;
                }
            }
            StringBuilder m10 = c.m(c10);
            m10.append(n.V(l10, "="));
            Map singletonMap = Collections.singletonMap(null, m10.toString());
            l.d(singletonMap, "singletonMap(...)");
            arrayList.add(new Challenge(str, singletonMap));
        }
    }

    public static final String c(C1964h c1964h) {
        long T10 = c1964h.T(f22678b);
        if (T10 == -1) {
            T10 = c1964h.f23966b;
        }
        if (T10 != 0) {
            return c1964h.c0(T10, AbstractC0796a.f12815a);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0235, code lost:
    
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22932e.a(r6) == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x021e, code lost:
    
        if (okhttp3.internal._HostnamesCommonKt.f22494a.d(r0) == false) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0271  */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(CookieJar cookieJar, HttpUrl url, Headers headers) {
        List list;
        List list2;
        v vVar;
        List list3;
        Cookie cookie;
        int i7;
        long j;
        String str;
        List list4;
        int i10 = 1;
        l.e(cookieJar, "<this>");
        l.e(url, "url");
        l.e(headers, "headers");
        if (cookieJar == CookieJar.f22309a) {
            return;
        }
        Cookie.k.getClass();
        int size = headers.size();
        int i11 = 0;
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < size; i12++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.o(i12))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.y(i12));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            l.d(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        v vVar2 = v.f3891a;
        List list5 = list == null ? vVar2 : list;
        int size2 = list5.size();
        int i13 = 0;
        ArrayList arrayList2 = null;
        loop1: while (i13 < size2) {
            String setCookie = (String) list5.get(i13);
            l.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = _UtilCommonKt.f22495a;
            int c10 = _UtilCommonKt.c(setCookie, ';', i11, setCookie.length());
            int c11 = _UtilCommonKt.c(setCookie, '=', i11, c10);
            if (c11 == c10) {
                i7 = i11;
                vVar = vVar2;
                list3 = list5;
            } else {
                String n6 = _UtilCommonKt.n(i11, c11, setCookie);
                if (n6.length() != 0 && _UtilCommonKt.e(n6) == -1) {
                    String n8 = _UtilCommonKt.n(c11 + i10, c10, setCookie);
                    if (_UtilCommonKt.e(n8) == -1) {
                        int i14 = c10 + i10;
                        int length = setCookie.length();
                        boolean z8 = i10;
                        long j10 = -1;
                        long j11 = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        boolean z10 = false;
                        boolean z11 = false;
                        boolean z12 = false;
                        String str4 = null;
                        while (true) {
                            if (i14 < length) {
                                v vVar3 = vVar2;
                                int c12 = _UtilCommonKt.c(setCookie, ';', i14, length);
                                int i15 = length;
                                int c13 = _UtilCommonKt.c(setCookie, '=', i14, c12);
                                String n10 = _UtilCommonKt.n(i14, c13, setCookie);
                                String n11 = c13 < c12 ? _UtilCommonKt.n(c13 + 1, c12, setCookie) : "";
                                if (n10.equalsIgnoreCase("expires")) {
                                    try {
                                        j11 = Cookie.Companion.b(n11.length(), n11);
                                        list4 = list5;
                                        z12 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        list4 = list5;
                                    }
                                    i14 = c12 + 1;
                                    vVar2 = vVar3;
                                    length = i15;
                                    list5 = list4;
                                    z8 = z8;
                                } else {
                                    if (n10.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(n11);
                                            list4 = list5;
                                            j10 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e2) {
                                            Pattern compile = Pattern.compile("-?\\d+");
                                            list4 = list5;
                                            try {
                                                l.d(compile, "compile(...)");
                                                if (!compile.matcher(n11).matches()) {
                                                    throw e2;
                                                    break loop1;
                                                }
                                                j10 = n.Y(n11, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z12 = true;
                                        i14 = c12 + 1;
                                        vVar2 = vVar3;
                                        length = i15;
                                        list5 = list4;
                                        z8 = z8;
                                    } else {
                                        list4 = list5;
                                        if (n10.equalsIgnoreCase("domain")) {
                                            if (n.S(n11, ".", false)) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String b2 = _HostnamesCommonKt.b(g.n0(n11, "."));
                                            if (b2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str2 = b2;
                                            z8 = 0;
                                        } else if (n10.equalsIgnoreCase("path")) {
                                            str3 = n11;
                                        } else if (n10.equalsIgnoreCase("secure")) {
                                            z10 = true;
                                        } else if (n10.equalsIgnoreCase("httponly")) {
                                            z11 = true;
                                        } else if (n10.equalsIgnoreCase("samesite")) {
                                            str4 = n11;
                                        }
                                        i14 = c12 + 1;
                                        vVar2 = vVar3;
                                        length = i15;
                                        list5 = list4;
                                        z8 = z8;
                                    }
                                    i14 = c12 + 1;
                                    vVar2 = vVar3;
                                    length = i15;
                                    list5 = list4;
                                    z8 = z8;
                                }
                            } else {
                                vVar = vVar2;
                                list3 = list5;
                                if (j10 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j10 != -1) {
                                    long j12 = currentTimeMillis + (j10 <= 9223372036854775L ? j10 * 1000 : Long.MAX_VALUE);
                                    j = (j12 < currentTimeMillis || j12 > 253402300799999L) ? 253402300799999L : j12;
                                } else {
                                    j = j11;
                                }
                                String str5 = url.f22338d;
                                if (str2 == null) {
                                    str2 = str5;
                                } else if (!l.a(str5, str2)) {
                                    if (n.S(str5, str2, false) && str5.charAt((str5.length() - str2.length()) - 1) == '.') {
                                        e eVar = _HostnamesCommonKt.f22494a;
                                    }
                                    i7 = 0;
                                }
                                if (str5.length() != str2.length()) {
                                    PublicSuffixDatabase.f22929b.getClass();
                                }
                                String str6 = "/";
                                i7 = 0;
                                if (str3 == null || !n.Y(str3, "/", false)) {
                                    String b10 = url.b();
                                    int j02 = g.j0(b10, '/', 0, 6);
                                    if (j02 != 0) {
                                        str6 = b10.substring(0, j02);
                                        l.d(str6, "substring(...)");
                                    }
                                    str = str6;
                                } else {
                                    str = str3;
                                }
                                cookie = new Cookie(n6, n8, j, str2, str, z10, z11, z12, z8, str4);
                            }
                        }
                    }
                }
                vVar = vVar2;
                list3 = list5;
                cookie = null;
                i7 = 0;
                if (cookie != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(cookie);
                }
                i13++;
                vVar2 = vVar;
                i11 = i7;
                i10 = 1;
                list5 = list3;
            }
            cookie = null;
            if (cookie != null) {
            }
            i13++;
            vVar2 = vVar;
            i11 = i7;
            i10 = 1;
            list5 = list3;
        }
        v vVar4 = vVar2;
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            l.d(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        List list6 = list2 == null ? vVar4 : list2;
        if (list6.isEmpty()) {
            return;
        }
        cookieJar.b(url, list6);
    }

    public static final boolean e(C1964h c1964h) {
        boolean z8 = false;
        while (!c1964h.K()) {
            byte P10 = c1964h.P(0L);
            if (P10 != 44) {
                if (P10 != 32 && P10 != 9) {
                    break;
                }
                c1964h.V();
            } else {
                c1964h.V();
                z8 = true;
            }
        }
        return z8;
    }
}
