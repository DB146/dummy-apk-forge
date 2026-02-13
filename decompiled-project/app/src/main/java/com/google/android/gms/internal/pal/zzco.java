package com.google.android.gms.internal.pal;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzco implements Runnable {
    final /* synthetic */ zzcp zza;

    public zzco(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z8;
        zzdu zzduVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzcp.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                z8 = ((Boolean) zzgk.zzcc.zzb()).booleanValue();
            } catch (IllegalStateException unused) {
                z8 = false;
            }
            if (z8) {
                try {
                    zzduVar = this.zza.zze;
                    zzcp.zza = zzhp.zzb(zzduVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z10 = z8;
            this.zza.zzb = Boolean.valueOf(z10);
            conditionVariable2 = zzcp.zzc;
            conditionVariable2.open();
        }
    }
}
