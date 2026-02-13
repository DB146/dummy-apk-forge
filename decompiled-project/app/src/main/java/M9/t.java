package M9;

import A0.G0;
import A9.N2;
import Eb.B;
import Y5.A;
import com.kt.apps.core.storage.local.RoomDataBase;
import g3.C1191j;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.C1837e;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilJvmKt;
import sb.C2012f;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f6903i;
    public static final ac.e j;
    public static final Pattern k;

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f6904l;

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f6905m;

    /* renamed from: n, reason: collision with root package name */
    public static final ac.e f6906n;

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f6907o;

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f6908p;

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f6909q;

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f6910r;

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f6911s;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f6912t;

    /* renamed from: u, reason: collision with root package name */
    public static final Db.o f6913u;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f6914a;

    /* renamed from: b, reason: collision with root package name */
    public final R9.a f6915b;

    /* renamed from: c, reason: collision with root package name */
    public final RoomDataBase f6916c;

    /* renamed from: d, reason: collision with root package name */
    public final k f6917d;

    /* renamed from: e, reason: collision with root package name */
    public final u8.c f6918e;

    /* renamed from: f, reason: collision with root package name */
    public final Db.o f6919f;
    public final Db.o g;

    /* renamed from: h, reason: collision with root package name */
    public final Db.o f6920h;

    static {
        Pattern.compile("#EXTINF:( )?-?\\d+");
        Pattern.compile("EXTINF:( )?-?\\d+");
        f6903i = Pattern.compile("(?<=user-agent=\").*?(?=\")");
        j = new ac.e("[\t\b\r ]");
        Pattern.compile("(?<=url-tvg=\").*?(?=\")");
        Pattern.compile("(?<=cache=).*?(?= )");
        Pattern.compile("(?<=deinterlace=).*?(?= )");
        Pattern.compile("(?<=aspect-ratio=).*?(?= )");
        Pattern.compile("(?<=tvg-shift=).*?(?= )");
        Pattern.compile("(?<=m3uautoload=).*?(?= )");
        k = Pattern.compile("(?<=tvg-id=\").*?(?=\")");
        f6904l = Pattern.compile("(?<=tvg-logo=\").*?(?=\")");
        f6905m = Pattern.compile("(?<=group-title=\").*?(?=\")");
        f6906n = new ac.e("(?<=type=\").*?(?=\")");
        f6907o = Pattern.compile("(?<=catchup-source=\").*?(?=\")");
        f6908p = Pattern.compile("(?<=\\|Referer=).*");
        Pattern.compile("(?<=type=\").*?(?=\")");
        Pattern.compile("(?<=\").*?(?=\")");
        f6909q = Pattern.compile("(?<=KODIPROP:).*?(?==)");
        f6910r = Pattern.compile("(?<=EXTVLCOPT:).*?(?==)");
        f6911s = Pattern.compile("(?<=url-tvg=\").*?(?=\")");
        f6912t = B.H(new Db.j("http-referrer", "referer"), new Db.j("http-user-agent", "user-agent"));
        android.support.v4.media.session.b.z(new I9.a(19));
        f6913u = android.support.v4.media.session.b.z(new I9.a(20));
    }

    public t(OkHttpClient okHttpClient, R9.a storage, RoomDataBase roomDataBase, k programScheduleParser, u8.c remoteConfig) {
        kotlin.jvm.internal.l.e(storage, "storage");
        kotlin.jvm.internal.l.e(roomDataBase, "roomDataBase");
        kotlin.jvm.internal.l.e(programScheduleParser, "programScheduleParser");
        kotlin.jvm.internal.l.e(remoteConfig, "remoteConfig");
        this.f6914a = okHttpClient;
        this.f6915b = storage;
        this.f6916c = roomDataBase;
        this.f6917d = programScheduleParser;
        this.f6918e = remoteConfig;
        this.f6919f = android.support.v4.media.session.b.z(new N2(this, 13));
        this.g = android.support.v4.media.session.b.z(new I9.a(17));
        this.f6920h = android.support.v4.media.session.b.z(new I9.a(18));
    }

    public static String b(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String group = matcher.group(0);
        int groupCount = matcher.groupCount();
        int i7 = 1;
        while (true) {
            if ((group == null || group.length() == 0) && i7 <= groupCount) {
                group = matcher.group(i7);
                i7++;
            }
        }
        return group == null ? "" : group;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    public static Db.j d(String str, Pattern pattern) {
        String b2 = b(str, pattern);
        String substring = str.substring(ac.g.f0(str, "=", 0, 6) + 1, str.length());
        kotlin.jvm.internal.l.d(substring, "substring(...)");
        String o02 = ac.g.o0(ac.g.o0(ac.g.n0(ac.g.v0(substring).toString(), "\""), "\r"), "\"");
        String str2 = (String) f6912t.get(b2);
        if (str2 == null) {
            str2 = b2;
        }
        String message = "key: " + b2 + ", value: " + o02;
        kotlin.jvm.internal.l.e(message, "message");
        return new Db.j(str2, o02);
    }

    public final BufferedReader a(d dVar) {
        String obj;
        HttpUrl.Builder builder;
        String obj2;
        Thread.currentThread().isAlive();
        if (!Thread.currentThread().isAlive() || Thread.currentThread().isInterrupted()) {
            throw new n("Thread interrupted!");
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new n("Thread interrupted before HTTP call!");
        }
        try {
            OkHttpClient.Builder a9 = this.f6914a.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            a9.a(600L, timeUnit);
            a9.f22412y = _UtilJvmKt.b(600L, timeUnit);
            a9.b(60L, timeUnit);
            a9.f22398i = false;
            a9.j = false;
            OkHttpClient okHttpClient = new OkHttpClient(a9);
            Request.Builder builder2 = new Request.Builder();
            builder2.e(ac.g.v0(dVar.f6851b).toString());
            Response e2 = okHttpClient.b(new Request(builder2)).e();
            int i7 = e2.f22442d;
            if (200 <= i7 && i7 < 300) {
                if (Thread.currentThread().isInterrupted()) {
                    throw new n("Thread interrupted before processing response!");
                }
                ResponseBody responseBody = e2.f22445u;
                ResponseBody.BomAwareReader bomAwareReader = responseBody.f22463a;
                if (bomAwareReader == null) {
                    bomAwareReader = new ResponseBody.BomAwareReader(responseBody.F(), Internal.a(responseBody.n()));
                    responseBody.f22463a = bomAwareReader;
                }
                BufferedReader bufferedReader = new BufferedReader(bomAwareReader, 8192);
                String message = dVar.f6851b + " - Streaming - Content Length: $" + responseBody.l();
                kotlin.jvm.internal.l.e(message, "message");
                return bufferedReader;
            }
            Headers headers = e2.f22444f;
            String b2 = headers.b("location");
            if (b2 == null) {
                b2 = null;
            }
            String message2 = i7 + " - " + b2;
            kotlin.jvm.internal.l.e(message2, "message");
            if (!((List) f6913u.getValue()).contains(Integer.valueOf(i7))) {
                if (i7 >= 500 || i7 == 404 || i7 == 403) {
                    throw new n(null);
                }
                throw new Throwable("Retry");
            }
            String b10 = headers.b("Location");
            if (b10 == null) {
                b10 = null;
            }
            ac.e eVar = j;
            String e10 = (b10 == null || (obj2 = ac.g.v0(b10).toString()) == null) ? null : eVar.e(obj2);
            if (e10 == null || e10.length() == 0) {
                String b11 = headers.b("location");
                if (b11 == null) {
                    b11 = null;
                }
                e10 = (b11 == null || (obj = ac.g.v0(b11).toString()) == null) ? null : eVar.e(obj);
            }
            HttpUrl httpUrl = e2.f22439a.f22424a;
            kotlin.jvm.internal.l.b(e10);
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.c(httpUrl, e10);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            HttpUrl b12 = builder != null ? builder.b() : null;
            if (b12 != null) {
                return a(new d(dVar.f6850a, b12.f22342i, dVar.f6852c));
            }
            throw new n("Http redirect location is null ".concat(e10));
        } catch (UnknownHostException e11) {
            throw e11;
        } catch (CertPathValidatorException unused2) {
            return a(new d(dVar.f6850a, ac.n.W(dVar.f6851b, "https", "http"), dVar.f6852c));
        } catch (CertificateException unused3) {
            return a(new d(dVar.f6850a, ac.n.W(dVar.f6851b, "https", "http"), dVar.f6852c));
        } catch (Exception e12) {
            throw e12;
        }
    }

    public final long c(c configType) {
        long j10;
        kotlin.jvm.internal.l.e(configType, "configType");
        String t5 = X.c.t("extra:interval_refresh_data", configType.name());
        int ordinal = configType.ordinal();
        if (ordinal == 0) {
            j10 = 3600000;
        } else if (ordinal == 1) {
            j10 = 900000;
        } else {
            if (ordinal != 2) {
                throw new Db.d(1);
            }
            j10 = 86400000;
        }
        Class cls = Long.TYPE;
        R9.a aVar = this.f6915b;
        Object a9 = ((R9.b) aVar).a(cls, t5);
        if (((Number) a9).longValue() <= -1) {
            a9 = null;
        }
        Long l10 = (Long) a9;
        if (l10 != null) {
            return l10.longValue();
        }
        ((R9.b) aVar).b(Long.valueOf(j10), t5);
        return j10;
    }

    public final qb.r e(d dVar) {
        U9.d dVar2 = (U9.d) this.f6919f.getValue();
        String sourceId = dVar.f6851b;
        dVar2.getClass();
        kotlin.jvm.internal.l.e(sourceId, "sourceId");
        qb.q d10 = new qb.n(new qb.n(new qb.d(android.support.v4.media.session.b.k(dVar2.f9854a, true, new U9.c(sourceId, dVar2, 1)), 1), new p(this, dVar, 0), 2), new q(this, dVar), 0).d(Ab.e.f1561c);
        l lVar = new l(this, dVar, 0);
        Y5.B b2 = lb.b.f19615d;
        A a9 = lb.b.f19614c;
        return new qb.r(new qb.r(new qb.r(new qb.r(d10, b2, b2, lVar, a9), b2, new r(this, dVar), a9, a9), b2, b2, a9, new l(this, dVar, 1)), new s(this, dVar, 0), b2, a9, a9);
    }

    public final qb.r f(d dVar) {
        gb.f gVar;
        gb.f gVar2 = new qb.g(2, j(dVar), new A4.p(29));
        if (g().containsKey(dVar.f6851b)) {
            int i7 = 0;
            gVar2 = new qb.n(new qb.g(i7, e(dVar), new C1837e(new l(this, dVar, 2), 0)), new C1191j(gVar2, 26), 2);
        }
        gb.f d10 = gVar2.d(Ab.e.f1561c);
        if (h().size() <= 5) {
            gVar = d10;
        } else {
            gVar = new qb.g(0, d10, new C1837e(new m(this, 0), 0));
        }
        p pVar = new p(this, dVar, 1);
        Y5.B b2 = lb.b.f19615d;
        A a9 = lb.b.f19614c;
        return new qb.r(new qb.r(new qb.r(new qb.r(gVar, b2, pVar, a9, a9), b2, b2, a9, new l(this, dVar, 3)), new q(this, dVar), b2, a9, a9), b2, b2, new l(this, dVar, 4), a9);
    }

    public final Map g() {
        return (Map) this.f6920h.getValue();
    }

    public final Map h() {
        return (Map) this.g.getValue();
    }

    public final gb.f i(d extension) {
        kotlin.jvm.internal.l.e(extension, "extension");
        Map h10 = h();
        String str = extension.f6851b;
        if (h10.containsKey(str)) {
            Object obj = h().get(str);
            kotlin.jvm.internal.l.b(obj);
            return (gb.f) obj;
        }
        qb.r f4 = f(extension);
        qb.r e2 = e(extension);
        R9.a aVar = this.f6915b;
        String message = "Old time " + str + ": " + O5.b.r(aVar, extension);
        kotlin.jvm.internal.l.e(message, "message");
        if (System.currentTimeMillis() - O5.b.r(aVar, extension) < c(extension.f6852c)) {
            String message2 = "OfflineSource - " + str;
            kotlin.jvm.internal.l.e(message2, "message");
            h().put(str, e2);
            return e2;
        }
        String message3 = "OnlineSource - " + str;
        kotlin.jvm.internal.l.e(message3, "message");
        h().put(str, f4);
        return f4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public final sb.g j(d extension) {
        kotlin.jvm.internal.l.e(extension, "extension");
        ?? obj = new Object();
        sb.g gVar = new sb.g(new qb.m(new l(this, extension, (kotlin.jvm.internal.r) obj), 2).j(new r(this, extension), com.google.android.gms.common.api.f.API_PRIORITY_OTHER), new G0(this, extension, (Object) obj, 25), 2);
        l lVar = new l(this, extension, 6);
        Y5.B b2 = lb.b.f19615d;
        return new sb.g(new C2012f(gVar, b2, b2, lVar).h(new s(this, extension, 1)), new l(this, extension, 7), 0).q(Ab.e.f1561c);
    }
}
