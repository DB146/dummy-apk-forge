package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Aa.j;
import Q7.h;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b4.C0838i;
import b4.p;
import h4.f;
import h4.i;
import l4.AbstractC1485a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14711a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        h a9 = C0838i.a();
        a9.O(string);
        a9.f8697d = AbstractC1485a.b(i7);
        if (string2 != null) {
            a9.f8696c = Base64.decode(string2, 0);
        }
        i iVar = p.a().f13880d;
        C0838i n6 = a9.n();
        j jVar = new j(14, this, jobParameters);
        iVar.getClass();
        iVar.f17752e.execute(new f(iVar, n6, i10, jVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
