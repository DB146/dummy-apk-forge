package v8;

import Y6.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import e3.RunnableC1077b;
import h3.o;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.C1798l;
import org.json.JSONObject;

/* renamed from: v8.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2155i {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f25233s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f25234t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f25235a;

    /* renamed from: c, reason: collision with root package name */
    public int f25237c;

    /* renamed from: f, reason: collision with root package name */
    public HttpURLConnection f25240f;
    public C1798l g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f25241h;

    /* renamed from: i, reason: collision with root package name */
    public final C2153g f25242i;
    public final Y6.i j;
    public final k8.e k;

    /* renamed from: l, reason: collision with root package name */
    public final C2149c f25243l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f25244m;

    /* renamed from: q, reason: collision with root package name */
    public final k f25248q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25236b = false;

    /* renamed from: o, reason: collision with root package name */
    public final Random f25246o = new Random();

    /* renamed from: p, reason: collision with root package name */
    public final M5.b f25247p = M5.b.f6780a;

    /* renamed from: n, reason: collision with root package name */
    public final String f25245n = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f25238d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25239e = false;

    /* renamed from: r, reason: collision with root package name */
    public final Object f25249r = new Object();

    public C2155i(Y6.i iVar, k8.e eVar, C2153g c2153g, C2149c c2149c, Context context, LinkedHashSet linkedHashSet, k kVar, ScheduledExecutorService scheduledExecutorService) {
        this.f25235a = linkedHashSet;
        this.f25241h = scheduledExecutorService;
        this.f25237c = Math.max(8 - kVar.c().f25250a, 1);
        this.j = iVar;
        this.f25242i = c2153g;
        this.k = eVar;
        this.f25243l = c2149c;
        this.f25244m = context;
        this.f25248q = kVar;
    }

    public static boolean d(int i7) {
        return i7 == 408 || i7 == 429 || i7 == 502 || i7 == 503 || i7 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z8;
        if (!this.f25235a.isEmpty() && !this.f25236b && !this.f25238d) {
            z8 = this.f25239e ? false : true;
        }
        return z8;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f25240f;
        if (httpURLConnection != null && !this.f25239e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    public final String c(String str) {
        Y6.i iVar = this.j;
        iVar.b();
        Matcher matcher = f25234t.matcher(iVar.f12043c.f12055b);
        return o.n("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [Y6.k, u8.e] */
    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i7 = this.f25237c;
                if (i7 > 0) {
                    this.f25237c = i7 - 1;
                    this.f25241h.schedule(new RunnableC1077b(this, 11), j, TimeUnit.MILLISECONDS);
                } else if (!this.f25239e) {
                    g(new Y6.k("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(u8.e eVar) {
        Iterator it = this.f25235a.iterator();
        while (it.hasNext()) {
            ((ka.b) it.next()).a(eVar);
        }
    }

    public final synchronized void h() {
        this.f25247p.getClass();
        e(Math.max(0L, this.f25248q.c().f25251b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(HttpURLConnection httpURLConnection, String str, String str2) {
        String str3;
        byte[] e2;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        Y6.i iVar = this.j;
        iVar.b();
        m mVar = iVar.f12043c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", mVar.f12054a);
        Context context = this.f25244m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            e2 = M5.c.e(context, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        if (e2 != null) {
            str3 = M5.c.b(e2);
            httpURLConnection.setRequestProperty("X-Android-Cert", str3);
            httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept", "application/json");
            HashMap hashMap = new HashMap();
            iVar.b();
            Matcher matcher = f25234t.matcher(mVar.f12055b);
            hashMap.put("project", matcher.matches() ? matcher.group(1) : null);
            hashMap.put("namespace", this.f25245n);
            hashMap.put("lastKnownVersionNumber", Long.toString(this.f25242i.g.f25254a.getLong("last_template_version", 0L)));
            iVar.b();
            hashMap.put("appId", mVar.f12055b);
            hashMap.put("sdkVersion", "22.1.2");
            hashMap.put("appInstanceId", str);
            byte[] bytes = new JSONObject(hashMap).toString().getBytes("utf-8");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
        str3 = null;
        httpURLConnection.setRequestProperty("X-Android-Cert", str3);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap hashMap2 = new HashMap();
        iVar.b();
        Matcher matcher2 = f25234t.matcher(mVar.f12055b);
        hashMap2.put("project", matcher2.matches() ? matcher2.group(1) : null);
        hashMap2.put("namespace", this.f25245n);
        hashMap2.put("lastKnownVersionNumber", Long.toString(this.f25242i.g.f25254a.getLong("last_template_version", 0L)));
        iVar.b();
        hashMap2.put("appId", mVar.f12055b);
        hashMap2.put("sdkVersion", "22.1.2");
        hashMap2.put("appInstanceId", str);
        byte[] bytes2 = new JSONObject(hashMap2).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream2.write(bytes2);
        bufferedOutputStream2.flush();
        bufferedOutputStream2.close();
    }

    public final synchronized C1798l j(HttpURLConnection httpURLConnection) {
        return new C1798l(httpURLConnection, this.f25242i, this.f25243l, this.f25235a, new ka.b(this, 1), this.f25241h);
    }

    public final void k(Date date) {
        k kVar = this.f25248q;
        int i7 = kVar.c().f25250a + 1;
        kVar.e(i7, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f25233s[(i7 < 8 ? i7 : 8) - 1]) / 2) + this.f25246o.nextInt((int) r2)));
    }
}
