package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzrz extends zzrs {
    final zzsh zza;
    final Object zzb;
    int zzc;

    public zzrz(zzsh zzshVar, int i7) {
        this.zza = zzshVar;
        this.zzb = zzshVar.zzb[i7];
        this.zzc = i7;
    }

    private final void zza() {
        int i7 = this.zzc;
        if (i7 != -1) {
            zzsh zzshVar = this.zza;
            if (i7 <= zzshVar.zzc && zzri.zza(this.zzb, zzshVar.zzb[i7])) {
                return;
            }
        }
        zzsh zzshVar2 = this.zza;
        Object obj = this.zzb;
        this.zzc = zzshVar2.zzd(obj, zzsi.zzc(obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getValue() {
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            return null;
        }
        return this.zza.zza[i7];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zza();
        int i7 = this.zzc;
        if (i7 == -1) {
            this.zza.zzh(this.zzb, obj, false);
            return null;
        }
        Object obj2 = this.zza.zza[i7];
        if (zzri.zza(obj2, obj)) {
            return obj;
        }
        this.zza.zzv(this.zzc, obj, false);
        return obj2;
    }
}
