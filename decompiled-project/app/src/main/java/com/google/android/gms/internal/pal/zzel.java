package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzel extends zzfg {
    private final long zzi;

    public zzel(zzdu zzduVar, String str, String str2, zzr zzrVar, long j, int i7, int i10) {
        super(zzduVar, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", zzrVar, i7, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        long longValue = ((Long) this.zzf.invoke(null, null)).longValue();
        synchronized (this.zze) {
            try {
                this.zze.zzt(longValue);
                long j = this.zzi;
                if (j != 0) {
                    this.zze.zzU(longValue - j);
                    this.zze.zzV(this.zzi);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
