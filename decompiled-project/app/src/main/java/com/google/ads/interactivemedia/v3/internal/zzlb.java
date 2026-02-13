package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlb implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzlc zza;

    public zzlb(zzlc zzlcVar) {
        this.zza = zzlcVar;
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
        zzlc zzlcVar = this.zza;
        j = zzlcVar.zzc;
        if (j > 0) {
            j10 = zzlcVar.zzc;
            if (currentTimeMillis >= j10) {
                j11 = zzlcVar.zzc;
                zzlcVar.zzd = currentTimeMillis - j11;
            }
        }
        this.zza.zze = false;
    }
}
