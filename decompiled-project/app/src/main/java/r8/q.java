package r8;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.api.internal.I;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f23865a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f23866b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f23867c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f23868d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new N5.a("firebase-iid-executor"));

    public q(FirebaseMessaging firebaseMessaging, long j) {
        this.f23867c = firebaseMessaging;
        this.f23865a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f15865b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f23866b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f23867c.f15865b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() {
        try {
            if (this.f23867c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o f4 = o.f();
        FirebaseMessaging firebaseMessaging = this.f23867c;
        boolean j = f4.j(firebaseMessaging.f15865b);
        PowerManager.WakeLock wakeLock = this.f23866b;
        if (j) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f15871i = true;
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f15871i = false;
                    if (!o.f().j(firebaseMessaging.f15865b)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f15870h.e()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f15871i = false;
                }
                if (o.f().j(firebaseMessaging.f15865b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (o.f().i(firebaseMessaging.f15865b) && !a()) {
                I i7 = new I();
                i7.f14939c = this;
                i7.a();
                if (o.f().j(firebaseMessaging.f15865b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f15871i = false;
                }
            } else {
                firebaseMessaging.g(this.f23865a);
            }
            if (!o.f().j(firebaseMessaging.f15865b)) {
                return;
            }
            wakeLock.release();
        } catch (Throwable th) {
            if (o.f().j(firebaseMessaging.f15865b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
