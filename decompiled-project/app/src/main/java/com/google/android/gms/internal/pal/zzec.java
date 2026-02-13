package com.google.android.gms.internal.pal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzec implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzed zza;

    public zzec(zzed zzedVar) {
        this.zza = zzedVar;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z8) {
        long j;
        long j10;
        long j11;
        if (z8) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzed zzedVar = this.zza;
        j = zzedVar.zzc;
        if (j > 0) {
            j10 = zzedVar.zzc;
            if (currentTimeMillis >= j10) {
                j11 = zzedVar.zzc;
                zzedVar.zzd = currentTimeMillis - j11;
            }
        }
        this.zza.zze = false;
    }
}
