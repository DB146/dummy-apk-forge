package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzlk extends zzmh {
    private final long zzi;

    public zzlk(zzkt zzktVar, String str, String str2, zzaf zzafVar, long j, int i7, int i10) {
        super(zzktVar, "TXsN4bb5+Cgiz+MMtqZYZGYCqgJBKeVC6AH20Rp84dUqZqMFTV+lR8+OMxwZp6Tj", "xCoUMjdzl/aFe5U9IUKXoVxoOrl5eYdhdrms16lQJRw=", zzafVar, i7, 25);
        this.zzi = j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() {
        long longValue = ((Long) this.zzf.invoke(null, null)).longValue();
        synchronized (this.zze) {
            try {
                this.zze.zzt(longValue);
                long j = this.zzi;
                if (j != 0) {
                    this.zze.zzT(longValue - j);
                    this.zze.zzU(this.zzi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
