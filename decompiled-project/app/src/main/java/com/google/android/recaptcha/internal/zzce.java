package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i7, int i10, Throwable th) {
        this.zzc = i7;
        this.zzd = i10;
        this.zza = th;
        zztd zzf = zzte.zzf();
        zzf.zzq(i10);
        zzf.zzr(i7);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
