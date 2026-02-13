package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzer extends zzfg {
    private final zzcz zzi;
    private final long zzj;
    private final long zzk;

    public zzer(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10, zzcz zzczVar, long j, long j10) {
        super(zzduVar, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", zzrVar, i7, 11);
        this.zzi = zzczVar;
        this.zzj = j;
        this.zzk = j10;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        zzcz zzczVar = this.zzi;
        if (zzczVar != null) {
            zzcx zzcxVar = new zzcx((String) this.zzf.invoke(null, zzczVar.zza(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                try {
                    this.zze.zzz(zzcxVar.zza.longValue());
                    if (zzcxVar.zzb.longValue() >= 0) {
                        this.zze.zzR(zzcxVar.zzb.longValue());
                    }
                    if (zzcxVar.zzc.longValue() >= 0) {
                        this.zze.zzf(zzcxVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
