package com.google.android.gms.measurement;

import E5.k;
import P4.C0463k;
import Y5.BinderC0657w0;
import Y5.C0646q0;
import Y5.I1;
import Y5.InterfaceC0641o1;
import Y5.W;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import k2.AbstractC1419a;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC0641o1 {

    /* renamed from: a, reason: collision with root package name */
    public C0463k f15153a;

    @Override // Y5.InterfaceC0641o1
    public final void a(Intent intent) {
        SparseArray sparseArray = AbstractC1419a.f18806a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC1419a.f18806a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } finally {
            }
        }
    }

    @Override // Y5.InterfaceC0641o1
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final C0463k c() {
        if (this.f15153a == null) {
            this.f15153a = new C0463k(this, 14);
        }
        return this.f15153a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C0463k c10 = c();
        c10.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC0657w0(I1.B((Service) c10.f8074b));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) c().f8074b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) c().f8074b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i7, final int i10) {
        final C0463k c10 = c();
        if (intent == null) {
            c10.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) c10.f8074b;
        final W w10 = C0646q0.r(service, null, null).f11912f;
        C0646q0.l(w10);
        String action = intent.getAction();
        w10.f11573B.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i10), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: Y5.p1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) C0463k.this.f8074b;
                InterfaceC0641o1 interfaceC0641o1 = (InterfaceC0641o1) service2;
                int i11 = i10;
                if (interfaceC0641o1.zza(i11)) {
                    w10.f11573B.b(Integer.valueOf(i11), "Local AppMeasurementService processed last upload request. StartId");
                    W w11 = C0646q0.r(service2, null, null).f11912f;
                    C0646q0.l(w11);
                    w11.f11573B.a("Completed wakeful intent.");
                    interfaceC0641o1.a(intent);
                }
            }
        };
        I1 B10 = I1.B(service);
        B10.c().S(new k(c10, B10, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // Y5.InterfaceC0641o1
    public final boolean zza(int i7) {
        return stopSelfResult(i7);
    }
}
