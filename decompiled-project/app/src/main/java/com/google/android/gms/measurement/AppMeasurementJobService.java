package com.google.android.gms.measurement;

import C7.c;
import E5.k;
import P4.C0463k;
import Y5.I1;
import Y5.InterfaceC0641o1;
import Y5.W;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.measurement.zzfb;
import i2.C1332t;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC0641o1 {

    /* renamed from: a, reason: collision with root package name */
    public C0463k f15151a;

    @Override // Y5.InterfaceC0641o1
    public final void a(Intent intent) {
    }

    @Override // Y5.InterfaceC0641o1
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final C0463k c() {
        if (this.f15151a == null) {
            this.f15151a = new C0463k(this, 14);
        }
        return this.f15151a;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C0463k c10 = c();
        c10.getClass();
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        boolean equals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = (Service) c10.f8074b;
        if (equals) {
            G.g(string);
            I1 B10 = I1.B(service);
            W b2 = B10.b();
            C1332t c1332t = B10.f11414z.f11909c;
            b2.f11573B.b(string, "Local AppMeasurementJobService called. action");
            B10.c().S(new k(c10, B10, new c(c10, b2, jobParameters, 10, false)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        G.g(string);
        zzfb.zza(service, null).zzw(new k(25, c10, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
        throw new UnsupportedOperationException();
    }
}
