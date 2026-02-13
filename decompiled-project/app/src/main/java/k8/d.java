package k8;

import A4.s;
import Y5.A;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ea.C1108c;
import ea.C1111f;
import j8.InterfaceC1387b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import l8.C1512a;
import l8.C1513b;
import l8.C1514c;
import m8.C1640a;
import m8.C1641b;
import m8.C1642c;
import m8.C1643d;
import org.json.JSONException;
import org.json.JSONObject;
import p7.l;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f19035m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Y6.i f19036a;

    /* renamed from: b, reason: collision with root package name */
    public final C1642c f19037b;

    /* renamed from: c, reason: collision with root package name */
    public final C1108c f19038c;

    /* renamed from: d, reason: collision with root package name */
    public final k f19039d;

    /* renamed from: e, reason: collision with root package name */
    public final l f19040e;

    /* renamed from: f, reason: collision with root package name */
    public final i f19041f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f19042h;

    /* renamed from: i, reason: collision with root package name */
    public final q7.j f19043i;
    public String j;
    public final HashSet k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f19044l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [k8.i, java.lang.Object] */
    public d(Y6.i iVar, InterfaceC1387b interfaceC1387b, ExecutorService executorService, q7.j jVar) {
        iVar.b();
        C1642c c1642c = new C1642c(iVar.f12041a, interfaceC1387b);
        C1108c c1108c = new C1108c(iVar);
        if (A.f11199w == null) {
            A.f11199w = new A(15);
        }
        A a9 = A.f11199w;
        if (k.f19052d == null) {
            k.f19052d = new k(a9);
        }
        k kVar = k.f19052d;
        l lVar = new l(new b(iVar, 0));
        ?? obj = new Object();
        this.g = new Object();
        this.k = new HashSet();
        this.f19044l = new ArrayList();
        this.f19036a = iVar;
        this.f19037b = c1642c;
        this.f19038c = c1108c;
        this.f19039d = kVar;
        this.f19040e = lVar;
        this.f19041f = obj;
        this.f19042h = executorService;
        this.f19043i = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f19038c;
        r2 = r2.a();
        r2.f19594a = r3;
        r2.f19595b = 3;
        r2 = r2.a();
        r4.g(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C1513b k;
        synchronized (f19035m) {
            try {
                Y6.i iVar = this.f19036a;
                iVar.b();
                C1111f g = C1111f.g(iVar.f12041a);
                try {
                    k = this.f19038c.k();
                    int i7 = k.f19601b;
                    boolean z8 = true;
                    if (i7 != 2 && i7 != 1) {
                        z8 = false;
                    }
                    if (g != null) {
                        g.y();
                    }
                } catch (Throwable th) {
                    if (g != null) {
                        g.y();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(k);
        this.f19043i.execute(new c(this, 2));
    }

    public final C1513b b(C1513b c1513b) {
        int responseCode;
        C1641b f4;
        Y6.i iVar = this.f19036a;
        iVar.b();
        String str = iVar.f12043c.f12054a;
        String str2 = c1513b.f19600a;
        Y6.i iVar2 = this.f19036a;
        iVar2.b();
        String str3 = iVar2.f12043c.g;
        String str4 = c1513b.f19603d;
        C1642c c1642c = this.f19037b;
        C1643d c1643d = c1642c.f20782c;
        if (!c1643d.a()) {
            throw new Y6.k("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = C1642c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = c1642c.c(a9, str);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    C1642c.h(c10);
                    responseCode = c10.getResponseCode();
                    c1643d.b(responseCode);
                } catch (Throwable th) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f4 = C1642c.f(c10);
            } else {
                C1642c.b(c10, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    s a10 = C1641b.a();
                    a10.f470a = 3;
                    f4 = a10.f();
                } else {
                    if (responseCode == 429) {
                        throw new Y6.k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        s a11 = C1641b.a();
                        a11.f470a = 2;
                        f4 = a11.f();
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            c10.disconnect();
            TrafficStats.clearThreadStatsTag();
            int b2 = P.c.b(f4.f20777c);
            if (b2 == 0) {
                k kVar = this.f19039d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f19053a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C1512a a12 = c1513b.a();
                a12.f19596c = f4.f20775a;
                a12.f19598e = Long.valueOf(f4.f20776b);
                a12.f19599f = Long.valueOf(seconds);
                return a12.a();
            }
            if (b2 == 1) {
                C1512a a13 = c1513b.a();
                a13.g = "BAD CONFIG";
                a13.f19595b = 5;
                return a13.a();
            }
            if (b2 != 2) {
                throw new Y6.k("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            C1512a a14 = c1513b.a();
            a14.f19595b = 2;
            return a14.a();
        }
        throw new Y6.k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(taskCompletionSource);
        synchronized (this.g) {
            this.f19044l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f19042h.execute(new c(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(this.f19039d, taskCompletionSource);
        synchronized (this.g) {
            this.f19044l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f19042h.execute(new c(this, 1));
        return task;
    }

    public final void e() {
        Y6.i iVar = this.f19036a;
        iVar.b();
        G.e(iVar.f12043c.f12055b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        G.e(iVar.f12043c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        G.e(iVar.f12043c.f12054a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        String str = iVar.f12043c.f12055b;
        Pattern pattern = k.f19051c;
        G.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        iVar.b();
        G.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f19051c.matcher(iVar.f12043c.f12054a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f12042b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(C1513b c1513b) {
        String string;
        Y6.i iVar = this.f19036a;
        iVar.b();
        if (!iVar.f12042b.equals("CHIME_ANDROID_SDK")) {
            Y6.i iVar2 = this.f19036a;
            iVar2.b();
        }
        if (c1513b.f19601b == 1) {
            C1514c c1514c = (C1514c) this.f19040e.get();
            synchronized (c1514c.f19607a) {
                try {
                    synchronized (c1514c.f19607a) {
                        string = c1514c.f19607a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = c1514c.a();
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            this.f19041f.getClass();
            return i.a();
        }
        this.f19041f.getClass();
        return i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [m8.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [m8.a] */
    public final C1513b g(C1513b c1513b) {
        int responseCode;
        String str = c1513b.f19600a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C1514c c1514c = (C1514c) this.f19040e.get();
            synchronized (c1514c.f19607a) {
                try {
                    String[] strArr = C1514c.f19606c;
                    int i7 = 0;
                    while (true) {
                        if (i7 < 4) {
                            String str3 = strArr[i7];
                            String string = c1514c.f19607a.getString("|T|" + c1514c.f19608b + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i7++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C1642c c1642c = this.f19037b;
        Y6.i iVar = this.f19036a;
        iVar.b();
        String str4 = iVar.f12043c.f12054a;
        String str5 = c1513b.f19600a;
        Y6.i iVar2 = this.f19036a;
        iVar2.b();
        String str6 = iVar2.f12043c.g;
        Y6.i iVar3 = this.f19036a;
        iVar3.b();
        String str7 = iVar3.f12043c.f12055b;
        C1643d c1643d = c1642c.f20782c;
        if (!c1643d.a()) {
            throw new Y6.k("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a9 = C1642c.a("projects/" + str6 + "/installations");
        int i10 = 0;
        C1640a c1640a = c1642c;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = c1640a.c(a9, str4);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    C1642c.g(c10, str5, str7);
                    responseCode = c10.getResponseCode();
                    c1643d.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (!(responseCode >= 200 && responseCode < 300)) {
                    try {
                        C1642c.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        c1640a = c1640a;
                    }
                    if (responseCode == 429) {
                        throw new Y6.k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C1640a c1640a2 = new C1640a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c1640a = c1640a2;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        c1640a = c1640a;
                    }
                } else {
                    C1640a e2 = C1642c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c1640a = e2;
                }
                int b2 = P.c.b(c1640a.f20774e);
                if (b2 != 0) {
                    if (b2 != 1) {
                        throw new Y6.k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C1512a a10 = c1513b.a();
                    a10.g = "BAD CONFIG";
                    a10.f19595b = 5;
                    return a10.a();
                }
                String str8 = c1640a.f20771b;
                String str9 = c1640a.f20772c;
                k kVar = this.f19039d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f19053a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C1641b c1641b = c1640a.f20773d;
                String str10 = c1641b.f20775a;
                long j = c1641b.f20776b;
                C1512a a11 = c1513b.a();
                a11.f19594a = str8;
                a11.f19595b = 4;
                a11.f19596c = str10;
                a11.f19597d = str9;
                a11.f19598e = Long.valueOf(j);
                a11.f19599f = Long.valueOf(seconds);
                return a11.a();
            } finally {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new Y6.k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f19044l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(C1513b c1513b) {
        synchronized (this.g) {
            try {
                Iterator it = this.f19044l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(c1513b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
