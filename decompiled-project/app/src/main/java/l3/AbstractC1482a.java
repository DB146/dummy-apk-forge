package l3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import h3.z;
import java.util.List;
import kotlin.jvm.internal.l;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1482a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19247a;

    static {
        String g = z.g("SystemJobScheduler");
        l.d(g, "tagWithPrefix(\"SystemJobScheduler\")");
        f19247a = g;
    }

    public static final List a(JobScheduler jobScheduler) {
        l.e(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            l.d(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th) {
            z.e().d(f19247a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        JobScheduler forNamespace;
        l.e(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        l.d(forNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return forNamespace;
    }
}
