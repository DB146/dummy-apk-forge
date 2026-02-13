package okhttp3;

import A3.c;
import ac.g;
import h3.o;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;

/* loaded from: classes2.dex */
public final class Cookie {
    public static final Companion k = new Companion(0);

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f22297l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f22298m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f22299n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f22300o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f22301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22302b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22303c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22304d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22305e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22306f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22307h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22308i;
    public final String j;

    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static int a(int i7, int i10, String str, boolean z8) {
            while (i7 < i10) {
                char charAt = str.charAt(i7);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z8)) {
                    return i7;
                }
                i7++;
            }
            return i10;
        }

        public static long b(int i7, String str) {
            int a9 = a(0, i7, str, false);
            Matcher matcher = Cookie.f22300o.matcher(str);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (a9 < i7) {
                int a10 = a(a9 + 1, i7, str, true);
                matcher.region(a9, a10);
                if (i11 == -1 && matcher.usePattern(Cookie.f22300o).matches()) {
                    String group = matcher.group(1);
                    l.d(group, "group(...)");
                    i11 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    l.d(group2, "group(...)");
                    i14 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    l.d(group3, "group(...)");
                    i15 = Integer.parseInt(group3);
                } else if (i12 == -1 && matcher.usePattern(Cookie.f22299n).matches()) {
                    String group4 = matcher.group(1);
                    l.d(group4, "group(...)");
                    i12 = Integer.parseInt(group4);
                } else {
                    if (i13 == -1) {
                        Pattern pattern = Cookie.f22298m;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            l.d(group5, "group(...)");
                            Locale US = Locale.US;
                            l.d(US, "US");
                            String lowerCase = group5.toLowerCase(US);
                            l.d(lowerCase, "toLowerCase(...)");
                            String pattern2 = pattern.pattern();
                            l.d(pattern2, "pattern(...)");
                            i13 = g.f0(pattern2, lowerCase, 0, 6) / 4;
                        }
                    }
                    if (i10 == -1 && matcher.usePattern(Cookie.f22297l).matches()) {
                        String group6 = matcher.group(1);
                        l.d(group6, "group(...)");
                        i10 = Integer.parseInt(group6);
                    }
                }
                a9 = a(a10 + 1, i7, str, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i12 || i12 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.f22497a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, i13 - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z8, boolean z10, boolean z11, boolean z12, String str5) {
        this.f22301a = str;
        this.f22302b = str2;
        this.f22303c = j;
        this.f22304d = str3;
        this.f22305e = str4;
        this.f22306f = z8;
        this.g = z10;
        this.f22307h = z11;
        this.f22308i = z12;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (l.a(cookie.f22301a, this.f22301a) && l.a(cookie.f22302b, this.f22302b) && cookie.f22303c == this.f22303c && l.a(cookie.f22304d, this.f22304d) && l.a(cookie.f22305e, this.f22305e) && cookie.f22306f == this.f22306f && cookie.g == this.g && cookie.f22307h == this.f22307h && cookie.f22308i == this.f22308i && l.a(cookie.j, this.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int g = o.g(this.f22308i, o.g(this.f22307h, o.g(this.g, o.g(this.f22306f, c.d(c.d(o.f(c.d(c.d(527, 31, this.f22301a), 31, this.f22302b), 31, this.f22303c), 31, this.f22304d), 31, this.f22305e), 31), 31), 31), 31);
        String str = this.j;
        return g + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22301a);
        sb2.append('=');
        sb2.append(this.f22302b);
        if (this.f22307h) {
            long j = this.f22303c;
            if (j == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = DateFormattingKt.f22676a.get().format(new Date(j));
                l.d(format, "format(...)");
                sb2.append(format);
            }
        }
        if (!this.f22308i) {
            sb2.append("; domain=");
            sb2.append(this.f22304d);
        }
        sb2.append("; path=");
        sb2.append(this.f22305e);
        if (this.f22306f) {
            sb2.append("; secure");
        }
        if (this.g) {
            sb2.append("; httponly");
        }
        String str = this.j;
        if (str != null) {
            sb2.append("; samesite=");
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        l.d(sb3, "toString(...)");
        return sb3;
    }
}
