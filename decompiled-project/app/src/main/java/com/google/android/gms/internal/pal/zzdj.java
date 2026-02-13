package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class zzdj implements zzdk {
    final /* synthetic */ Activity zza;

    public zzdj(zzdl zzdlVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.pal.zzdk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
