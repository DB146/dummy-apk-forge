package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzex extends zzfg {
    private final boolean zzi;

    public zzex(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", zzrVar, i7, 61);
        this.zzi = zzduVar.zzs();
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzF(longValue);
        }
    }
}
