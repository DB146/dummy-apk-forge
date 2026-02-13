package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzva implements Runnable {
    final Future zza;
    final zzuz zzb;

    public zzva(Future future, zzuz zzuzVar) {
        this.zza = future;
        this.zzb = zzuzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzwb) && (zza = zzwc.zza((zzwb) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzvd.zzc(this.zza));
        } catch (Error e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (RuntimeException e10) {
            e = e10;
            this.zzb.zza(e);
        } catch (ExecutionException e11) {
            this.zzb.zza(e11.getCause());
        }
    }

    public final String toString() {
        zzrg zza = zzrh.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
