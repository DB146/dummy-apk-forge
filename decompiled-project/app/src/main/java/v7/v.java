package v7;

import B0.C0200s;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k8.C1433a;

/* loaded from: classes.dex */
public final class v {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f25178h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final D9.a f25179a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25180b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25181c;

    /* renamed from: d, reason: collision with root package name */
    public final k8.e f25182d;

    /* renamed from: e, reason: collision with root package name */
    public final G f25183e;

    /* renamed from: f, reason: collision with root package name */
    public b f25184f;

    /* JADX WARN: Type inference failed for: r1v3, types: [D9.a, java.lang.Object] */
    public v(Context context, String str, k8.e eVar, G g2) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f25180b = context;
        this.f25181c = str;
        this.f25182d = eVar;
        this.f25183e = g2;
        this.f25179a = new Object();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u b(boolean z8) {
        String str;
        String str2 = null;
        if (!((Boolean) new C0200s(0, w7.d.f25818d, w7.c.class, "isNotMainThread", "isNotMainThread()Z", 0, 10).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        k8.e eVar = this.f25182d;
        if (z8) {
            try {
                str = ((C1433a) Tasks.await(((k8.d) eVar).d(), 10000L, TimeUnit.MILLISECONDS)).f19028a;
            } catch (Exception e2) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e2);
            }
            str2 = (String) Tasks.await(((k8.d) eVar).c(), 10000L, TimeUnit.MILLISECONDS);
            return new u(str2, str);
        }
        str = null;
        str2 = (String) Tasks.await(((k8.d) eVar).c(), 10000L, TimeUnit.MILLISECONDS);
        return new u(str2, str);
    }

    public final synchronized b c() {
        String str;
        b bVar = this.f25184f;
        if (bVar != null && (bVar.f25100b != null || !this.f25183e.b())) {
            return this.f25184f;
        }
        s7.c cVar = s7.c.f24187a;
        cVar.f("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f25180b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar.f("Cached Firebase Installation ID: " + string);
        if (this.f25183e.b()) {
            u b2 = b(false);
            cVar.f("Fetched Firebase Installation ID: " + b2.f25176a);
            if (b2.f25176a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b2 = new u(str, null);
            }
            if (Objects.equals(b2.f25176a, string)) {
                this.f25184f = new b(sharedPreferences.getString("crashlytics.installation.id", null), b2.f25176a, b2.f25177b);
            } else {
                this.f25184f = new b(a(sharedPreferences, b2.f25176a), b2.f25176a, b2.f25177b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f25184f = new b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f25184f = new b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar.f("Install IDs: " + this.f25184f);
        return this.f25184f;
    }

    public final String d() {
        String str;
        D9.a aVar = this.f25179a;
        Context context = this.f25180b;
        synchronized (aVar) {
            try {
                if (aVar.f3289a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f3289a = installerPackageName;
                }
                str = "".equals(aVar.f3289a) ? null : aVar.f3289a;
            } finally {
            }
        }
        return str;
    }
}
