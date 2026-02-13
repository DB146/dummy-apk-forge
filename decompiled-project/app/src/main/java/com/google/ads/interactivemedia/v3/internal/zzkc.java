package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class zzkc implements zzkh {
    final /* synthetic */ Activity zza;

    public zzkc(zzki zzkiVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkh
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
