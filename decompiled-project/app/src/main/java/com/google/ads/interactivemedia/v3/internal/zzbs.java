package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzbs {
    private boolean zza;

    public final void zza(Context context) {
        zzcp.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzcd.zzb().zzc(context);
        zzby zza = zzby.zza();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zza);
        }
        zzcn.zzd(context);
        zzca.zzb().zzc(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
