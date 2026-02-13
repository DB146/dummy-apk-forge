package r8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r7.C1947c;

/* renamed from: r8.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1950A implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23807a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f23808b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f23809c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f23810d;

    /* renamed from: e, reason: collision with root package name */
    public y f23811e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23812f;

    public ServiceConnectionC1950A(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new N5.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f23810d = new ArrayDeque();
        this.f23812f = false;
        Context applicationContext = context.getApplicationContext();
        this.f23807a = applicationContext;
        this.f23808b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f23809c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f23810d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                y yVar = this.f23811e;
                if (yVar == null || !yVar.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f23811e.a((z) this.f23810d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task b(Intent intent) {
        z zVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zVar = new z(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f23809c;
            zVar.f23904b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new C1947c(scheduledThreadPoolExecutor.schedule(new k1.a(zVar, 11), 20L, TimeUnit.SECONDS), 4));
            this.f23810d.add(zVar);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return zVar.f23904b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f23812f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f23812f) {
            return;
        }
        this.f23812f = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e2);
        }
        if (L5.a.b().a(this.f23807a, this.f23808b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f23812f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f23810d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((z) arrayDeque.poll()).f23904b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f23812f = false;
            if (iBinder instanceof y) {
                this.f23811e = (y) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f23810d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((z) arrayDeque.poll()).f23904b.trySetResult(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
