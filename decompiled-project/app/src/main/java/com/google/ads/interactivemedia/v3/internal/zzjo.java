package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzjo implements zzpr {
    final /* synthetic */ zzjp zza;

    public zzjo(zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zza(int i7, long j) {
        zzoy zzoyVar;
        zzoyVar = this.zza.zzd;
        zzoyVar.zzd(i7, System.currentTimeMillis() - j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zzb(int i7, long j, String str) {
        zzoy zzoyVar;
        zzoyVar = this.zza.zzd;
        zzoyVar.zze(i7, System.currentTimeMillis() - j, str);
    }
}
