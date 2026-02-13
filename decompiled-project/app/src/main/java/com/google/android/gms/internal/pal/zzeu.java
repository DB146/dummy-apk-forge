package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzeu extends zzfg {
    public zzeu(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "vkfQoQl1Rxr7/uvSSRcOrQI31A6S/KAPW33nf5P0hYbuVy6BLjHzjUB4OEnneXoS", "SfaCE2ReDSQ3+KDKcvA6SSrX7nuWYsM/FN3ZFmlH0dA=", zzrVar, i7, 3);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        Boolean bool = (Boolean) zzfv.zzc().zzb(zzgk.zzck);
        bool.booleanValue();
        zzdc zzdcVar = new zzdc((String) this.zzf.invoke(null, this.zzb.zzb(), bool));
        synchronized (this.zze) {
            this.zze.zzj(zzdcVar.zza);
            this.zze.zzC(zzdcVar.zzb);
        }
    }
}
