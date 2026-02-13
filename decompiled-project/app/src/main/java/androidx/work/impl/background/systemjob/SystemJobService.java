package androidx.work.impl.background.systemjob;

import C1.i;
import P4.C0463k;
import P4.G;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import ea.C1108c;
import ea.C1111f;
import h3.o;
import h3.z;
import i3.InterfaceC1342a;
import i3.d;
import i3.p;
import java.util.Arrays;
import java.util.HashMap;
import q3.j;
import y.S;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1342a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f13751e = z.g("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public p f13752a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13753b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C0463k f13754c = new C0463k(29);

    /* renamed from: d, reason: collision with root package name */
    public C1111f f13755d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(S.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static j c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // i3.InterfaceC1342a
    public final void b(j jVar, boolean z8) {
        a("onExecuted");
        z.e().a(f13751e, o.p(new StringBuilder(), jVar.f23386a, " executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.f13753b.remove(jVar);
        this.f13754c.C(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z8);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p N10 = p.N(getApplicationContext());
            this.f13752a = N10;
            d dVar = N10.g;
            this.f13755d = new C1111f(dVar, N10.f18381e);
            dVar.a(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            z.e().h(f13751e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f13752a;
        if (pVar != null) {
            pVar.g.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        p pVar = this.f13752a;
        String str = f13751e;
        if (pVar == null) {
            z.e().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j c10 = c(jobParameters);
        if (c10 == null) {
            z.e().c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.f13753b;
        if (hashMap.containsKey(c10)) {
            z.e().a(str, "Job is already being executed by SystemJobService: " + c10);
            return false;
        }
        z.e().a(str, "onStartJob for " + c10);
        hashMap.put(c10, jobParameters);
        int i7 = Build.VERSION.SDK_INT;
        C1108c c1108c = new C1108c(3);
        if (jobParameters.getTriggeredContentUris() != null) {
            c1108c.f16830b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            c1108c.f16831c = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i7 >= 28) {
            i.f(jobParameters);
        }
        C1111f c1111f = this.f13755d;
        i3.i F10 = this.f13754c.F(c10);
        c1111f.getClass();
        ((q3.i) c1111f.f16838c).r(new G(c1111f, F10, c1108c, 7));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        a("onStopJob");
        if (this.f13752a == null) {
            z.e().a(f13751e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j c10 = c(jobParameters);
        if (c10 == null) {
            z.e().c(f13751e, "WorkSpec id not found!");
            return false;
        }
        z.e().a(f13751e, "onStopJob for " + c10);
        this.f13753b.remove(c10);
        i3.i C2 = this.f13754c.C(c10);
        if (C2 != null) {
            int c11 = Build.VERSION.SDK_INT >= 31 ? l3.d.c(jobParameters) : -512;
            C1111f c1111f = this.f13755d;
            c1111f.getClass();
            c1111f.K(C2, c11);
        }
        d dVar = this.f13752a.g;
        String str = c10.f23386a;
        synchronized (dVar.k) {
            contains = dVar.f18349i.contains(str);
        }
        return !contains;
    }
}
