package Y5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcg;

/* loaded from: classes.dex */
public final class y1 extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final AlarmManager f12004d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f12005e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f12006f;

    public y1(I1 i12) {
        super(i12);
        this.f12004d = (AlarmManager) ((C0646q0) this.f3094a).f11907a.getSystemService("alarm");
    }

    @Override // Y5.D1
    public final void M() {
        AlarmManager alarmManager = this.f12004d;
        if (alarmManager != null) {
            Context context = ((C0646q0) this.f3094a).f11907a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcg.zza));
        }
        P();
    }

    public final void N() {
        K();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11573B.a("Unscheduling upload");
        AlarmManager alarmManager = this.f12004d;
        if (alarmManager != null) {
            Context context = c0646q0.f11907a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcg.zza));
        }
        O().c();
        P();
    }

    public final AbstractC0636n O() {
        if (this.f12005e == null) {
            this.f12005e = new s1(this, this.f12021b.f11414z);
        }
        return this.f12005e;
    }

    public final void P() {
        JobScheduler jobScheduler = (JobScheduler) ((C0646q0) this.f3094a).f11907a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(Q());
        }
    }

    public final int Q() {
        if (this.f12006f == null) {
            this.f12006f = Integer.valueOf("measurement".concat(String.valueOf(((C0646q0) this.f3094a).f11907a.getPackageName())).hashCode());
        }
        return this.f12006f.intValue();
    }
}
