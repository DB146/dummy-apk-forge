package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Q7.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b4.C0838i;
import b4.p;
import h4.RunnableC1250a;
import h4.f;
import h4.i;
import l4.AbstractC1485a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14710a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        h a9 = C0838i.a();
        a9.O(queryParameter);
        a9.f8697d = AbstractC1485a.b(intValue);
        if (queryParameter2 != null) {
            a9.f8696c = Base64.decode(queryParameter2, 0);
        }
        i iVar = p.a().f13880d;
        C0838i n6 = a9.n();
        RunnableC1250a runnableC1250a = new RunnableC1250a(0);
        iVar.getClass();
        iVar.f17752e.execute(new f(iVar, n6, i7, runnableC1250a));
    }
}
