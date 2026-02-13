package okhttp3;

import Eb.p;
import X.c;
import Xb.e;
import ac.g;
import ac.n;
import h3.H;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import y7.u0;

/* loaded from: classes2.dex */
public final class HttpUrl {
    public static final Companion j = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f22335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22336b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22337c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22338d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22339e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22340f;
    public final ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22341h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22342i;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f22343a;

        /* renamed from: d, reason: collision with root package name */
        public String f22346d;
        public ArrayList g;

        /* renamed from: h, reason: collision with root package name */
        public String f22349h;

        /* renamed from: b, reason: collision with root package name */
        public String f22344b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f22345c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f22347e = -1;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f22348f = u0.B("");

        public static ArrayList d(String str) {
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 <= str.length()) {
                int e02 = g.e0(str, '&', i7, 4);
                if (e02 == -1) {
                    e02 = str.length();
                }
                int e03 = g.e0(str, '=', i7, 4);
                if (e03 == -1 || e03 > e02) {
                    String substring = str.substring(i7, e02);
                    l.d(substring, "substring(...)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i7, e03);
                    l.d(substring2, "substring(...)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(e03 + 1, e02);
                    l.d(substring3, "substring(...)");
                    arrayList.add(substring3);
                }
                i7 = e02 + 1;
            }
            return arrayList;
        }

        public final void a(String str, String str2) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            ArrayList arrayList = this.g;
            l.b(arrayList);
            arrayList.add(_UrlKt.a(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
            ArrayList arrayList2 = this.g;
            l.b(arrayList2);
            arrayList2.add(str2 != null ? _UrlKt.a(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
        }

        public final HttpUrl b() {
            ArrayList arrayList;
            String str = this.f22343a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String d10 = _UrlKt.d(0, 0, 7, this.f22344b);
            String d11 = _UrlKt.d(0, 0, 7, this.f22345c);
            String str2 = this.f22346d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i7 = this.f22347e;
            if (i7 == -1) {
                Companion companion = HttpUrl.j;
                String str3 = this.f22343a;
                l.b(str3);
                companion.getClass();
                i7 = Companion.a(str3);
            }
            int i10 = i7;
            ArrayList arrayList2 = this.f22348f;
            ArrayList arrayList3 = new ArrayList(p.S(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(_UrlKt.d(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(p.S(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 != null ? _UrlKt.d(0, 0, 3, str4) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.f22349h;
            return new HttpUrl(str, d10, d11, str2, i10, arrayList3, arrayList, str5 != null ? _UrlKt.d(0, 0, 7, str5) : null, toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:150:0x01ef, code lost:
        
            if (r4 < 65536) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:213:0x0079, code lost:
        
            if (r15 == ':') goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x01cd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x02f9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02f5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(HttpUrl httpUrl, String input) {
            int i7;
            int i10;
            int i11;
            char c10;
            int i12;
            int b2;
            char charAt;
            int i13;
            int i14;
            int i15;
            int i16;
            int b10;
            char charAt2;
            l.e(input, "input");
            byte[] bArr = _UtilCommonKt.f22495a;
            int f4 = _UtilCommonKt.f(0, input.length(), input);
            int g = _UtilCommonKt.g(f4, input.length(), input);
            char c11 = 65535;
            if (g - f4 >= 2) {
                char charAt3 = input.charAt(f4);
                char c12 = 'a';
                if ((l.f(charAt3, 97) >= 0 && l.f(charAt3, 122) <= 0) || (l.f(charAt3, 65) >= 0 && l.f(charAt3, 90) <= 0)) {
                    i7 = f4 + 1;
                    while (true) {
                        if (i7 >= g) {
                            break;
                        }
                        char charAt4 = input.charAt(i7);
                        if ((c12 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                            i7++;
                            c12 = 'a';
                        }
                    }
                    if (i7 == -1) {
                        if (n.X(input, f4, "https:", true)) {
                            this.f22343a = "https";
                            f4 += 6;
                        } else {
                            if (!n.X(input, f4, "http:", true)) {
                                StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                                String substring = input.substring(0, i7);
                                l.d(substring, "substring(...)");
                                sb2.append(substring);
                                sb2.append('\'');
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            this.f22343a = "http";
                            f4 += 5;
                        }
                    } else {
                        if (httpUrl == null) {
                            throw new IllegalArgumentException(c.t("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? g.u0(6, input).concat("...") : input));
                        }
                        this.f22343a = httpUrl.f22335a;
                    }
                    i10 = f4;
                    i11 = 0;
                    while (true) {
                        c10 = '/';
                        if (i10 >= g || !((charAt2 = input.charAt(i10)) == '/' || charAt2 == '\\')) {
                            break;
                        }
                        i11++;
                        i10++;
                    }
                    ArrayList arrayList = this.f22348f;
                    char c13 = '#';
                    if (i11 < 2 && httpUrl != null) {
                        if (l.a(httpUrl.f22335a, this.f22343a)) {
                            this.f22344b = httpUrl.e();
                            this.f22345c = httpUrl.a();
                            this.f22346d = httpUrl.f22338d;
                            this.f22347e = httpUrl.f22339e;
                            arrayList.clear();
                            arrayList.addAll(httpUrl.c());
                            if (f4 == g || input.charAt(f4) == '#') {
                                String d10 = httpUrl.d();
                                this.g = d10 != null ? d(_UrlKt.a(0, 0, 83, d10, " \"'<>#")) : null;
                            }
                            b10 = _UtilCommonKt.b(f4, g, input, "?#");
                            if (f4 != b10) {
                                char charAt5 = input.charAt(f4);
                                if (charAt5 == '/' || charAt5 == '\\') {
                                    arrayList.clear();
                                    arrayList.add("");
                                    f4++;
                                } else {
                                    arrayList.set(arrayList.size() - 1, "");
                                }
                                while (f4 < b10) {
                                    int b11 = _UtilCommonKt.b(f4, b10, input, "/\\");
                                    boolean z8 = b11 < b10;
                                    String a9 = _UrlKt.a(f4, b11, 112, input, " \"<>^`{}|/\\?#");
                                    if (!a9.equals(".") && !a9.equalsIgnoreCase("%2e")) {
                                        if (a9.equals("..") || a9.equalsIgnoreCase("%2e.") || a9.equalsIgnoreCase(".%2e") || a9.equalsIgnoreCase("%2e%2e")) {
                                            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                                arrayList.add("");
                                            } else {
                                                arrayList.set(arrayList.size() - 1, "");
                                            }
                                            f4 = !z8 ? b11 + 1 : b11;
                                        } else {
                                            if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                                arrayList.set(arrayList.size() - 1, a9);
                                            } else {
                                                arrayList.add(a9);
                                            }
                                            if (z8) {
                                                arrayList.add("");
                                            }
                                        }
                                    }
                                    if (!z8) {
                                    }
                                }
                            }
                            if (b10 < g && input.charAt(b10) == '?') {
                                int c14 = _UtilCommonKt.c(input, '#', b10, g);
                                this.g = d(_UrlKt.a(b10 + 1, c14, 80, input, " \"'<>#"));
                                b10 = c14;
                            }
                            if (b10 < g || input.charAt(b10) != '#') {
                                return;
                            }
                            this.f22349h = _UrlKt.a(b10 + 1, g, 48, input, "");
                            return;
                        }
                    }
                    i12 = f4 + i11;
                    boolean z10 = false;
                    boolean z11 = false;
                    while (true) {
                        b2 = _UtilCommonKt.b(i12, g, input, "@/\\?#");
                        charAt = b2 == g ? input.charAt(b2) : c11;
                        if (charAt == c11 || charAt == c13 || charAt == c10 || charAt == '\\' || charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            if (z10) {
                                this.f22345c += "%40" + _UrlKt.a(i12, b2, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                            } else {
                                int c15 = _UtilCommonKt.c(input, ':', i12, b2);
                                String a10 = _UrlKt.a(i12, c15, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                                if (z11) {
                                    a10 = A3.c.m(new StringBuilder(), this.f22344b, "%40", a10);
                                }
                                this.f22344b = a10;
                                if (c15 != b2) {
                                    this.f22345c = _UrlKt.a(c15 + 1, b2, 112, input, " \"':;<=>@[]^`{}|/\\?#");
                                    z10 = true;
                                }
                                z11 = true;
                            }
                            i12 = b2 + 1;
                            c13 = '#';
                            c11 = 65535;
                            c10 = '/';
                        }
                    }
                    i13 = i12;
                    while (true) {
                        if (i13 < b2) {
                            char charAt6 = input.charAt(i13);
                            if (charAt6 == ':') {
                                break;
                            }
                            if (charAt6 != '[') {
                                i16 = 1;
                            } else {
                                i16 = 1;
                                do {
                                    i13++;
                                    if (i13 < b2) {
                                    }
                                } while (input.charAt(i13) != ']');
                            }
                            i13 += i16;
                        } else {
                            i13 = b2;
                            break;
                        }
                    }
                    i14 = i13 + 1;
                    if (i14 >= b2) {
                        this.f22346d = _HostnamesCommonKt.b(_UrlKt.d(i12, i13, 4, input));
                        try {
                            i15 = Integer.parseInt(_UrlKt.a(i14, b2, 120, input, ""));
                            if (1 <= i15) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i15 = -1;
                        this.f22347e = i15;
                        if (i15 == -1) {
                            StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                            String substring2 = input.substring(i14, b2);
                            l.d(substring2, "substring(...)");
                            sb3.append(substring2);
                            sb3.append('\"');
                            throw new IllegalArgumentException(sb3.toString().toString());
                        }
                    } else {
                        this.f22346d = _HostnamesCommonKt.b(_UrlKt.d(i12, i13, 4, input));
                        Companion companion = HttpUrl.j;
                        String str = this.f22343a;
                        l.b(str);
                        companion.getClass();
                        this.f22347e = Companion.a(str);
                    }
                    if (this.f22346d != null) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                        String substring3 = input.substring(i12, i13);
                        l.d(substring3, "substring(...)");
                        sb4.append(substring3);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    f4 = b2;
                    b10 = _UtilCommonKt.b(f4, g, input, "?#");
                    if (f4 != b10) {
                    }
                    if (b10 < g) {
                        int c142 = _UtilCommonKt.c(input, '#', b10, g);
                        this.g = d(_UrlKt.a(b10 + 1, c142, 80, input, " \"'<>#"));
                        b10 = c142;
                    }
                    if (b10 < g) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            i7 = -1;
            if (i7 == -1) {
            }
            i10 = f4;
            i11 = 0;
            while (true) {
                c10 = '/';
                if (i10 >= g) {
                    break;
                } else {
                    break;
                }
                i11++;
                i10++;
            }
            ArrayList arrayList2 = this.f22348f;
            char c132 = '#';
            if (i11 < 2) {
                if (l.a(httpUrl.f22335a, this.f22343a)) {
                }
            }
            i12 = f4 + i11;
            boolean z102 = false;
            boolean z112 = false;
            while (true) {
                b2 = _UtilCommonKt.b(i12, g, input, "@/\\?#");
                if (b2 == g) {
                }
                if (charAt == c11) {
                    break;
                } else {
                    break;
                }
            }
            i13 = i12;
            while (true) {
                if (i13 < b2) {
                }
                i13 += i16;
            }
            i14 = i13 + 1;
            if (i14 >= b2) {
            }
            if (this.f22346d != null) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
        
            if (r1 != okhttp3.HttpUrl.Companion.a(r3)) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f22343a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f22344b.length() > 0 || this.f22345c.length() > 0) {
                sb2.append(this.f22344b);
                if (this.f22345c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f22345c);
                }
                sb2.append('@');
            }
            String str2 = this.f22346d;
            if (str2 != null) {
                if (g.a0(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.f22346d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f22346d);
                }
            }
            int i7 = this.f22347e;
            if (i7 != -1 || this.f22343a != null) {
                if (i7 == -1) {
                    Companion companion = HttpUrl.j;
                    String str3 = this.f22343a;
                    l.b(str3);
                    companion.getClass();
                    i7 = Companion.a(str3);
                }
                String str4 = this.f22343a;
                if (str4 != null) {
                    HttpUrl.j.getClass();
                }
                sb2.append(':');
                sb2.append(i7);
            }
            ArrayList arrayList = this.f22348f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i10));
            }
            if (this.g != null) {
                sb2.append('?');
                Companion companion2 = HttpUrl.j;
                ArrayList arrayList2 = this.g;
                l.b(arrayList2);
                companion2.getClass();
                e F10 = H.F(H.I(0, arrayList2.size()), 2);
                int i11 = F10.f11025a;
                int i12 = F10.f11026b;
                int i13 = F10.f11027c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        String str5 = (String) arrayList2.get(i11);
                        String str6 = (String) arrayList2.get(i11 + 1);
                        if (i11 > 0) {
                            sb2.append('&');
                        }
                        sb2.append(str5);
                        if (str6 != null) {
                            sb2.append('=');
                            sb2.append(str6);
                        }
                        if (i11 == i12) {
                            break;
                        }
                        i11 += i13;
                    }
                }
            }
            if (this.f22349h != null) {
                sb2.append('#');
                sb2.append(this.f22349h);
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static int a(String scheme) {
            l.e(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        public static HttpUrl b(String str) {
            l.e(str, "<this>");
            Builder builder = new Builder();
            builder.c(null, str);
            return builder.b();
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f22335a = str;
        this.f22336b = str2;
        this.f22337c = str3;
        this.f22338d = str4;
        this.f22339e = i7;
        this.f22340f = arrayList;
        this.g = arrayList2;
        this.f22341h = str5;
        this.f22342i = str6;
    }

    public final String a() {
        if (this.f22337c.length() == 0) {
            return "";
        }
        int length = this.f22335a.length() + 3;
        String str = this.f22342i;
        String substring = str.substring(g.e0(str, ':', length, 4) + 1, g.e0(str, '@', 0, 6));
        l.d(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        int length = this.f22335a.length() + 3;
        String str = this.f22342i;
        int e02 = g.e0(str, '/', length, 4);
        String substring = str.substring(e02, _UtilCommonKt.b(e02, str.length(), str, "?#"));
        l.d(substring, "substring(...)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f22335a.length() + 3;
        String str = this.f22342i;
        int e02 = g.e0(str, '/', length, 4);
        int b2 = _UtilCommonKt.b(e02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (e02 < b2) {
            int i7 = e02 + 1;
            int c10 = _UtilCommonKt.c(str, '/', i7, b2);
            String substring = str.substring(i7, c10);
            l.d(substring, "substring(...)");
            arrayList.add(substring);
            e02 = c10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.f22342i;
        int e02 = g.e0(str, '?', 0, 6) + 1;
        String substring = str.substring(e02, _UtilCommonKt.c(str, '#', e02, str.length()));
        l.d(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f22336b.length() == 0) {
            return "";
        }
        int length = this.f22335a.length() + 3;
        String str = this.f22342i;
        String substring = str.substring(length, _UtilCommonKt.b(length, str.length(), str, ":@"));
        l.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && l.a(((HttpUrl) obj).f22342i, this.f22342i);
    }

    public final Builder f() {
        Builder builder = new Builder();
        String str = this.f22335a;
        builder.f22343a = str;
        builder.f22344b = e();
        builder.f22345c = a();
        builder.f22346d = this.f22338d;
        j.getClass();
        int a9 = Companion.a(str);
        int i7 = this.f22339e;
        if (i7 == a9) {
            i7 = -1;
        }
        builder.f22347e = i7;
        ArrayList arrayList = builder.f22348f;
        arrayList.clear();
        arrayList.addAll(c());
        String d10 = d();
        String str2 = null;
        builder.g = d10 != null ? Builder.d(_UrlKt.a(0, 0, 83, d10, " \"'<>#")) : null;
        if (this.f22341h != null) {
            String str3 = this.f22342i;
            str2 = str3.substring(g.e0(str3, '#', 0, 6) + 1);
            l.d(str2, "substring(...)");
        }
        builder.f22349h = str2;
        return builder;
    }

    public final String g() {
        Builder builder;
        try {
            builder = new Builder();
            builder.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        l.b(builder);
        builder.f22344b = _UrlKt.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        builder.f22345c = _UrlKt.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return builder.b().f22342i;
    }

    public final URI h() {
        String str;
        Builder f4 = f();
        String str2 = f4.f22346d;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            l.d(compile, "compile(...)");
            str = compile.matcher(str2).replaceAll("");
            l.d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        f4.f22346d = str;
        ArrayList arrayList = f4.f22348f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.set(i7, _UrlKt.a(0, 0, 99, (String) arrayList.get(i7), "[]"));
        }
        ArrayList arrayList2 = f4.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str3 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str3 != null ? _UrlKt.a(0, 0, 67, str3, "\\^`{|}") : null);
            }
        }
        String str4 = f4.f22349h;
        f4.f22349h = str4 != null ? _UrlKt.a(0, 0, 35, str4, " \"#<>\\^`{|}") : null;
        String input = f4.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                l.d(compile2, "compile(...)");
                l.e(input, "input");
                String replaceAll = compile2.matcher(input).replaceAll("");
                l.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                l.b(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f22342i.hashCode();
    }

    public final String toString() {
        return this.f22342i;
    }
}
