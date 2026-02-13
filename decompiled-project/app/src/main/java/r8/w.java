package r8;

import F.Q;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f23891f = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static Boolean f23892u;

    /* renamed from: v, reason: collision with root package name */
    public static Boolean f23893v;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23894a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f23895b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f23896c;

    /* renamed from: d, reason: collision with root package name */
    public final u f23897d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23898e;

    public w(u uVar, Context context, Q q10, long j) {
        this.f23897d = uVar;
        this.f23894a = context;
        this.f23898e = j;
        this.f23895b = q10;
        this.f23896c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (f23891f) {
            try {
                Boolean bool = f23893v;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f23893v = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z8 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z8 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z8;
    }

    public static boolean c(Context context) {
        boolean booleanValue;
        synchronized (f23891f) {
            try {
                Boolean bool = f23892u;
                Boolean valueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f23892u = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        boolean z8;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f23894a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z8 = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = this.f23897d;
        Context context = this.f23894a;
        boolean c10 = c(context);
        PowerManager.WakeLock wakeLock = this.f23896c;
        if (c10) {
            wakeLock.acquire(f.f23832a);
        }
        try {
            try {
                uVar.d(true);
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
                uVar.d(false);
                if (!c(context)) {
                    return;
                }
            }
            if (!this.f23895b.e()) {
                uVar.d(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new v(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (uVar.e()) {
                uVar.d(false);
            } else {
                uVar.f(this.f23898e);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
