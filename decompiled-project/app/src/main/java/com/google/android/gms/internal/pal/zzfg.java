package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class zzfg implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzdu zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzr zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzfg(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        this.zzb = zzduVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzrVar;
        this.zzg = i7;
        this.zzh = i10;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        zze();
        return null;
    }

    public abstract void zza();

    public Void zze() {
        long nanoTime;
        Method zzj;
        int i7;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzcp zzd = this.zzb.zzd();
        if (zzd != null && (i7 = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i7, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
