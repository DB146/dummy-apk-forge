package u8;

import android.os.Build;
import com.google.android.gms.tasks.Task;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import l2.X;
import o4.C1798l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.EnumC1905i;
import r7.C1948d;
import r8.o;
import v8.C2149c;
import v8.C2151e;
import v8.C2153g;
import v8.C2154h;
import v8.C2155i;
import v8.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Z6.c f24882a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f24883b;

    /* renamed from: c, reason: collision with root package name */
    public final C2149c f24884c;

    /* renamed from: d, reason: collision with root package name */
    public final C2149c f24885d;

    /* renamed from: e, reason: collision with root package name */
    public final C2149c f24886e;

    /* renamed from: f, reason: collision with root package name */
    public final C2153g f24887f;
    public final C2154h g;

    /* renamed from: h, reason: collision with root package name */
    public final X f24888h;

    /* renamed from: i, reason: collision with root package name */
    public final o f24889i;

    public c(Z6.c cVar, Executor executor, C2149c c2149c, C2149c c2149c2, C2149c c2149c3, C2153g c2153g, C2154h c2154h, X x2, o oVar) {
        this.f24882a = cVar;
        this.f24883b = executor;
        this.f24884c = c2149c;
        this.f24885d = c2149c2;
        this.f24886e = c2149c3;
        this.f24887f = c2153g;
        this.g = c2154h;
        this.f24888h = x2;
        this.f24889i = oVar;
    }

    public static c e() {
        return ((j) Y6.i.e().c(j.class)).a();
    }

    public static ArrayList i(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final Task a() {
        C2153g c2153g = this.f24887f;
        k kVar = c2153g.g;
        kVar.getClass();
        return c2153g.a(kVar.f25254a.getLong("minimum_fetch_interval_in_seconds", C2153g.f25219i)).onSuccessTask(EnumC1905i.f23535a, new C1948d(10));
    }

    public final Task b() {
        return a().onSuccessTask(this.f24883b, new b(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r4.matcher(r0).matches() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        C2154h c2154h = this.g;
        C2149c c2149c = c2154h.f25231c;
        String b2 = C2154h.b(c2149c, "use_online_data");
        Pattern pattern = C2154h.f25228f;
        Pattern pattern2 = C2154h.f25227e;
        if (b2 != null) {
            if (pattern2.matcher(b2).matches()) {
                c2154h.a("use_online_data", c2149c.c());
                return true;
            }
            if (pattern.matcher(b2).matches()) {
                c2154h.a("use_online_data", c2149c.c());
                return false;
            }
        }
        String b10 = C2154h.b(c2154h.f25232d, "use_online_data");
        if (b10 != null) {
            if (pattern2.matcher(b10).matches()) {
                return true;
            }
        }
        C2154h.c("use_online_data", "Boolean");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double d() {
        Double valueOf;
        C2154h c2154h = this.g;
        C2149c c2149c = c2154h.f25231c;
        C2151e c10 = c2149c.c();
        Double d10 = null;
        if (c10 != null) {
            try {
                valueOf = Double.valueOf(c10.f25211b.getDouble("default_iptv_version"));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                c2154h.a("default_iptv_version", c2149c.c());
                return valueOf.doubleValue();
            }
            C2151e c11 = c2154h.f25232d.c();
            if (c11 != null) {
                try {
                    d10 = Double.valueOf(c11.f25211b.getDouble("default_iptv_version"));
                } catch (JSONException unused2) {
                }
            }
            if (d10 != null) {
                return d10.doubleValue();
            }
            C2154h.c("default_iptv_version", "Double");
            return 0.0d;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f(String str) {
        Long valueOf;
        C2154h c2154h = this.g;
        C2149c c2149c = c2154h.f25231c;
        C2151e c10 = c2149c.c();
        Long l10 = null;
        if (c10 != null) {
            try {
                valueOf = Long.valueOf(c10.f25211b.getLong(str));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                c2154h.a(str, c2149c.c());
                return valueOf.longValue();
            }
            C2151e c11 = c2154h.f25232d.c();
            if (c11 != null) {
                try {
                    l10 = Long.valueOf(c11.f25211b.getLong(str));
                } catch (JSONException unused2) {
                }
            }
            if (l10 != null) {
                return l10.longValue();
            }
            C2154h.c(str, "Long");
            return 0L;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public final String g(String str) {
        C2154h c2154h = this.g;
        C2149c c2149c = c2154h.f25231c;
        String b2 = C2154h.b(c2149c, str);
        if (b2 != null) {
            c2154h.a(str, c2149c.c());
            return b2;
        }
        String b10 = C2154h.b(c2154h.f25232d, str);
        if (b10 != null) {
            return b10;
        }
        C2154h.c(str, "String");
        return "";
    }

    public final void h(boolean z8) {
        HttpURLConnection httpURLConnection;
        X x2 = this.f24888h;
        synchronized (x2) {
            C2155i c2155i = (C2155i) x2.f19195c;
            synchronized (c2155i.f25249r) {
                try {
                    c2155i.f25239e = z8;
                    C1798l c1798l = c2155i.g;
                    if (c1798l != null) {
                        c1798l.f21855a = z8;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z8 && (httpURLConnection = c2155i.f25240f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z8) {
                x2.j();
            }
        }
    }
}
