package v8;

import android.text.format.DateUtils;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import j8.InterfaceC1387b;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: v8.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2153g {

    /* renamed from: i, reason: collision with root package name */
    public static final long f25219i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final k8.e f25220a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1387b f25221b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f25222c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f25223d;

    /* renamed from: e, reason: collision with root package name */
    public final C2149c f25224e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f25225f;
    public final k g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f25226h;

    public C2153g(k8.e eVar, InterfaceC1387b interfaceC1387b, Executor executor, Random random, C2149c c2149c, ConfigFetchHttpClient configFetchHttpClient, k kVar, HashMap hashMap) {
        this.f25220a = eVar;
        this.f25221b = interfaceC1387b;
        this.f25222c = executor;
        this.f25223d = random;
        this.f25224e = c2149c;
        this.f25225f = configFetchHttpClient;
        this.g = kVar;
        this.f25226h = hashMap;
    }

    public final Task a(long j10) {
        HashMap hashMap = new HashMap(this.f25226h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return this.f25224e.b().continueWithTask(this.f25222c, new h4.h(this, j10, hashMap));
    }

    public final C2152f b(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b2 = this.f25225f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f25225f;
            HashMap e2 = e();
            String string = this.g.f25254a.getString("last_fetch_etag", null);
            InterfaceC0913b interfaceC0913b = (InterfaceC0913b) this.f25221b.get();
            C2152f fetch = configFetchHttpClient.fetch(b2, str, str2, e2, string, hashMap, interfaceC0913b == null ? null : (Long) ((C0914c) interfaceC0913b).f14438a.f10991a.zzC(null, null, true).get("_fot"), date, this.g.b());
            C2151e c2151e = fetch.f25217b;
            if (c2151e != null) {
                k kVar = this.g;
                long j10 = c2151e.f25215f;
                synchronized (kVar.f25255b) {
                    kVar.f25254a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fetch.f25218c;
            if (str4 != null) {
                k kVar2 = this.g;
                synchronized (kVar2.f25255b) {
                    kVar2.f25254a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.g.d(0, k.f25253f);
            return fetch;
        } catch (u8.g e10) {
            int i7 = e10.f24890a;
            k kVar3 = this.g;
            if (i7 == 429 || i7 == 502 || i7 == 503 || i7 == 504) {
                int i10 = kVar3.a().f25250a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                kVar3.d(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f25223d.nextInt((int) r6)));
            }
            j a9 = kVar3.a();
            int i11 = e10.f24890a;
            if (a9.f25250a > 1 || i11 == 429) {
                a9.f25251b.getTime();
                throw new Y6.k("Fetch was throttled.");
            }
            if (i11 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i11 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i11 == 429) {
                    throw new Y6.k("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i11 != 500) {
                    switch (i11) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new u8.g(e10.f24890a, "Fetch failed: ".concat(str3), e10);
        }
    }

    public final Task c(Task task, long j10, HashMap hashMap) {
        Task continueWithTask;
        Date date = new Date(System.currentTimeMillis());
        boolean isSuccessful = task.isSuccessful();
        k kVar = this.g;
        if (isSuccessful) {
            Date date2 = new Date(kVar.f25254a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(k.f25252e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date2.getTime()))) {
                return Tasks.forResult(new C2152f(2, null, null));
            }
        }
        Date date3 = kVar.a().f25251b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f25222c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            continueWithTask = Tasks.forException(new Y6.k(str));
        } else {
            k8.d dVar = (k8.d) this.f25220a;
            Task c10 = dVar.c();
            Task d10 = dVar.d();
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{c10, d10}).continueWithTask(executor, new L7.h(this, c10, d10, date, hashMap));
        }
        return continueWithTask.continueWithTask(executor, new n4.b(8, this, date));
    }

    public final Task d(int i7) {
        HashMap hashMap = new HashMap(this.f25226h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i7);
        return this.f25224e.b().continueWithTask(this.f25222c, new n4.b(9, this, hashMap));
    }

    public final HashMap e() {
        HashMap hashMap = new HashMap();
        InterfaceC0913b interfaceC0913b = (InterfaceC0913b) this.f25221b.get();
        if (interfaceC0913b == null) {
            return hashMap;
        }
        for (Map.Entry entry : ((C0914c) interfaceC0913b).f14438a.f10991a.zzC(null, null, false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
