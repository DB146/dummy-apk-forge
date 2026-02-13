package com.google.android.gms.internal.measurement;

import M5.b;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzeq implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzfb zzk;

    public zzeq(zzfb zzfbVar, boolean z8) {
        Objects.requireNonNull(zzfbVar);
        this.zzk = zzfbVar;
        ((b) zzfbVar.zza).getClass();
        this.zzh = System.currentTimeMillis();
        ((b) zzfbVar.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        this.zzj = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzP()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e2) {
            this.zzk.zzN(e2, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
