package Y5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzin;

/* loaded from: classes.dex */
public final class W0 extends H {

    /* renamed from: c, reason: collision with root package name */
    public JobScheduler f11584c;

    @Override // Y5.H
    public final boolean M() {
        return true;
    }

    public final void N(long j) {
        K();
        J();
        JobScheduler jobScheduler = this.f11584c;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c0646q0.f11907a.getPackageName())).hashCode()) != null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11573B.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin O10 = O();
        if (O10 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11573B.b(O10.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        W w12 = c0646q0.f11912f;
        C0646q0.l(w12);
        w12.f11573B.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(c0646q0.f11907a.getPackageName())).hashCode(), new ComponentName(c0646q0.f11907a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f11584c;
        com.google.android.gms.common.internal.G.g(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        W w13 = c0646q0.f11912f;
        C0646q0.l(w13);
        w13.f11573B.b(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final zzin O() {
        K();
        J();
        if (this.f11584c == null) {
            return zzin.MISSING_JOB_SCHEDULER;
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        Boolean V7 = c0646q0.f11910d.V("google_analytics_sgtm_upload_enabled");
        return V7 == null ? false : V7.booleanValue() ? c0646q0.q().f11474x >= 119000 ? !M1.c0(c0646q0.f11907a) ? zzin.MEASUREMENT_SERVICE_NOT_ENABLED : !c0646q0.o().Q() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE : zzin.SDK_TOO_OLD : zzin.NOT_ENABLED_IN_MANIFEST;
    }
}
