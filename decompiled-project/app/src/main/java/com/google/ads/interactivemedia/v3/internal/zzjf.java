package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzjf implements zzpr {
    final /* synthetic */ zzoy zza;

    public zzjf(zzoy zzoyVar) {
        this.zza = zzoyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zza(int i7, long j) {
        this.zza.zzd(i7, System.currentTimeMillis() - j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zzb(int i7, long j, String str) {
        this.zza.zze(i7, System.currentTimeMillis() - j, str);
    }
}
