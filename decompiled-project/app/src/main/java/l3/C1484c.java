package l3;

import A9.N2;
import Eb.n;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import h3.C1240b;
import h3.C1242d;
import h3.C1243e;
import h3.o;
import h3.z;
import i3.f;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.l;
import q3.g;
import q3.h;
import q3.i;
import q3.j;
import q3.p;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484c implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final String f19252f = z.g("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f19253a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f19254b;

    /* renamed from: c, reason: collision with root package name */
    public final C1483b f19255c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f19256d;

    /* renamed from: e, reason: collision with root package name */
    public final C1240b f19257e;

    public C1484c(Context context, WorkDatabase workDatabase, C1240b c1240b) {
        JobScheduler b2 = AbstractC1482a.b(context);
        C1483b c1483b = new C1483b(context, c1240b.f17671d, c1240b.f17676l);
        this.f19253a = context;
        this.f19254b = b2;
        this.f19255c = c1483b;
        this.f19256d = workDatabase;
        this.f19257e = c1240b;
    }

    public static void b(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            z.e().d(f19252f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> a9 = AbstractC1482a.a(jobScheduler);
        if (a9 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a9.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : a9) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // i3.f
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f19253a;
        JobScheduler jobScheduler = this.f19254b;
        ArrayList e2 = e(context, jobScheduler);
        if (e2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f4 = f(jobInfo);
                if (f4 != null && str.equals(f4.f23386a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b(jobScheduler, ((Integer) it2.next()).intValue());
        }
        i z8 = this.f19256d.z();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) z8.f23382a;
        workDatabase_Impl.b();
        h hVar = (h) z8.f23385d;
        V2.j a9 = hVar.a();
        a9.p(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    @Override // i3.f
    public final void c(p... pVarArr) {
        int intValue;
        C1240b c1240b = this.f19257e;
        WorkDatabase workDatabase = this.f19256d;
        final C1358d c1358d = new C1358d(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p h10 = workDatabase.C().h(pVar.f23403a);
                String str = f19252f;
                String str2 = pVar.f23403a;
                if (h10 == null) {
                    z.e().h(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.v();
                } else if (h10.f23404b != 1) {
                    z.e().h(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.v();
                } else {
                    j p10 = O5.b.p(pVar);
                    g u3 = workDatabase.z().u(p10);
                    if (u3 != null) {
                        intValue = u3.f23380c;
                    } else {
                        c1240b.getClass();
                        final int i7 = c1240b.f17675i;
                        Callable callable = new Callable() { // from class: r3.d
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1358d c1358d2 = C1358d.this;
                                WorkDatabase workDatabase2 = (WorkDatabase) c1358d2.f18487b;
                                Long o10 = workDatabase2.y().o("next_job_scheduler_id");
                                int i10 = 0;
                                int longValue = o10 != null ? (int) o10.longValue() : 0;
                                workDatabase2.y().p(new q3.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i7) {
                                    ((WorkDatabase) c1358d2.f18487b).y().p(new q3.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i10 = longValue;
                                }
                                return Integer.valueOf(i10);
                            }
                        };
                        WorkDatabase workDatabase2 = (WorkDatabase) c1358d.f18487b;
                        workDatabase2.getClass();
                        Object u10 = workDatabase2.u(new N2(callable, 8));
                        l.d(u10, "workDatabase.runInTransa…d\n            }\n        )");
                        intValue = ((Number) u10).intValue();
                    }
                    if (u3 == null) {
                        workDatabase.z().v(new g(p10.f23386a, p10.f23387b, intValue));
                    }
                    g(pVar, intValue);
                    workDatabase.v();
                }
            } finally {
                workDatabase.r();
            }
        }
    }

    @Override // i3.f
    public final boolean d() {
        return true;
    }

    public final void g(p pVar, int i7) {
        int i10;
        int i11;
        String str;
        C1483b c1483b = this.f19255c;
        c1483b.getClass();
        C1243e c1243e = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = pVar.f23403a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f23419t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i7, c1483b.f19249a).setRequiresCharging(c1243e.f17684c);
        boolean z8 = c1243e.f17685d;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z8).setExtras(persistableBundle);
        NetworkRequest networkRequest = c1243e.f17683b.f23664a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28 || networkRequest == null) {
            int i13 = c1243e.f17682a;
            if (i12 < 30 || i13 != 6) {
                int b2 = P.c.b(i13);
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            i10 = 3;
                            if (b2 != 3) {
                                i10 = 4;
                                if (b2 != 4 || i12 < 26) {
                                    z.e().a(C1483b.f19248d, "API version too low. Cannot convert network type value ".concat(o.x(i13)));
                                }
                            }
                        } else {
                            i10 = 2;
                        }
                    }
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                builder.setRequiredNetworkType(i10);
            } else {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            l.e(builder, "builder");
            builder.setRequiredNetwork(networkRequest);
        }
        if (!z8) {
            builder.setBackoffCriteria(pVar.f23412m, pVar.f23411l == 2 ? 0 : 1);
        }
        long a9 = pVar.a();
        c1483b.f19250b.getClass();
        long max = Math.max(a9 - System.currentTimeMillis(), 0L);
        if (i12 <= 28) {
            builder.setMinimumLatency(max);
        } else if (max > 0) {
            builder.setMinimumLatency(max);
        } else if (!pVar.f23416q && c1483b.f19251c) {
            builder.setImportantWhileForeground(true);
        }
        Set<C1242d> set = c1243e.f17689i;
        if (!set.isEmpty()) {
            for (C1242d c1242d : set) {
                builder.addTriggerContentUri(new JobInfo.TriggerContentUri(c1242d.f17680a, c1242d.f17681b ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(c1243e.g);
            builder.setTriggerContentMaxDelay(c1243e.f17688h);
        }
        builder.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            builder.setRequiresBatteryNotLow(c1243e.f17686e);
            builder.setRequiresStorageNotLow(c1243e.f17687f);
        }
        boolean z10 = pVar.k > 0;
        boolean z11 = max > 0;
        if (i14 >= 31 && pVar.f23416q && !z10 && !z11) {
            builder.setExpedited(true);
        }
        if (i14 >= 35 && (str = pVar.f23423x) != null) {
            builder.setTraceTag(str);
        }
        JobInfo build = builder.build();
        String str3 = f19252f;
        z.e().a(str3, "Scheduling work ID " + str2 + "Job ID " + i7);
        try {
            try {
                if (this.f19254b.schedule(build) == 0) {
                    z.e().h(str3, "Unable to schedule work ID " + str2);
                    if (pVar.f23416q) {
                        if (pVar.f23417r == 1) {
                            i11 = 0;
                            try {
                                pVar.f23416q = false;
                                z.e().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                                g(pVar, i7);
                            } catch (IllegalStateException e2) {
                                e = e2;
                                String str4 = AbstractC1482a.f19247a;
                                Context context = this.f19253a;
                                l.e(context, "context");
                                WorkDatabase workDatabase = this.f19256d;
                                l.e(workDatabase, "workDatabase");
                                C1240b configuration = this.f19257e;
                                l.e(configuration, "configuration");
                                int i15 = Build.VERSION.SDK_INT;
                                int i16 = i15 >= 31 ? 150 : 100;
                                int size = workDatabase.C().f().size();
                                String str5 = "<faulty JobScheduler failed to getPendingJobs>";
                                if (i15 >= 34) {
                                    JobScheduler b10 = AbstractC1482a.b(context);
                                    List a10 = AbstractC1482a.a(b10);
                                    if (a10 != null) {
                                        ArrayList e10 = e(context, b10);
                                        int size2 = e10 != null ? a10.size() - e10.size() : i11;
                                        String str6 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                                        Object systemService = context.getSystemService("jobscheduler");
                                        l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                                        ArrayList e11 = e(context, (JobScheduler) systemService);
                                        int size3 = e11 != null ? e11.size() : i11;
                                        str5 = Eb.o.d0(n.X(new String[]{a10.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str6, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                                    }
                                } else {
                                    ArrayList e12 = e(context, AbstractC1482a.b(context));
                                    if (e12 != null) {
                                        str5 = e12.size() + " jobs from WorkManager";
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder("JobScheduler ");
                                sb2.append(i16);
                                sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
                                sb2.append(str5);
                                sb2.append(".\nThere are ");
                                sb2.append(size);
                                sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
                                String k = X.c.k(sb2, configuration.k, '.');
                                z.e().c(str3, k);
                                throw new IllegalStateException(k, e);
                            }
                        }
                    }
                }
            } catch (IllegalStateException e13) {
                e = e13;
                i11 = 0;
            }
        } catch (Throwable th) {
            z.e().d(str3, "Unable to schedule " + pVar, th);
        }
    }
}
