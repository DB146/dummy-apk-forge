package W4;

import N6.H0;
import N6.t0;
import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.C1586o0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f10807a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f10808b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f10809c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f10810d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f10811e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f10812f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    public static final String g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f10813h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c10 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c10 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c10 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c10 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c10 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c10 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static t0 b(String str) {
        if (str == null) {
            N6.F f4 = N6.H.f7232b;
            return t0.f7341e;
        }
        N6.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i7 = n5.D.f21141a;
        String[] split = str.split(",\\s?", -1);
        int length = split.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Integer valueOf = Integer.valueOf(a(split[i10]));
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, N6.B.f(objArr.length, i12));
            }
            objArr[i11] = valueOf;
            i10++;
            i11 = i12;
        }
        return N6.H.D(i11, objArr);
    }

    public static D9.a c(String str) {
        Matcher matcher = f10810d.matcher(str);
        if (!matcher.matches()) {
            throw C1586o0.b(str, null);
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                Integer.parseInt(group2);
            } catch (NumberFormatException e2) {
                throw C1586o0.b(str, e2);
            }
        }
        return new D9.a(group, false);
    }

    public static T4.u d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i7 = n5.D.f21141a;
        String[] split = userInfo.split(":", 2);
        return new T4.u(1, split[0], split[1]);
    }

    public static n5.u e(String str) {
        Matcher matcher = f10811e.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            int i7 = M6.l.f6805a;
            return new n5.u(group, group2, group3 != null ? group3 : "", 2);
        }
        Matcher matcher2 = f10812f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new n5.u(group4, "", "", 1);
        }
        throw C1586o0.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        AbstractC1705a.h(authority.contains("@"));
        int i7 = n5.D.f21141a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    public static t0 g(A a9) {
        AbstractC1705a.h(a9.f10624c.c("CSeq") != null);
        N6.E e2 = new N6.E();
        e2.d(n5.D.n("%s %s %s", h(a9.f10623b), a9.f10622a, "RTSP/1.0"));
        N6.I a10 = a9.f10624c.a();
        H0 it = a10.e().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            N6.H d10 = a10.d(str);
            for (int i7 = 0; i7 < d10.size(); i7++) {
                e2.d(n5.D.n("%s: %s", str, d10.get(i7)));
            }
        }
        e2.d("");
        e2.d(a9.f10625d);
        return e2.h();
    }

    public static String h(int i7) {
        switch (i7) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
