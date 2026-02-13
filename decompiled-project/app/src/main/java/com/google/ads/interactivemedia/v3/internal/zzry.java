package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzry extends zzrs {
    final Object zza;
    int zzb;
    final /* synthetic */ zzsh zzc;

    public zzry(zzsh zzshVar, int i7) {
        this.zzc = zzshVar;
        this.zza = zzshVar.zza[i7];
        this.zzb = i7;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object getValue() {
        zza();
        int i7 = this.zzb;
        if (i7 == -1) {
            return null;
        }
        return this.zzc.zzb[i7];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zza();
        int i7 = this.zzb;
        if (i7 == -1) {
            this.zzc.zzg(this.zza, obj, false);
            return null;
        }
        Object obj2 = this.zzc.zzb[i7];
        if (zzri.zza(obj2, obj)) {
            return obj;
        }
        this.zzc.zzw(this.zzb, obj, false);
        return obj2;
    }

    public final void zza() {
        int i7 = this.zzb;
        if (i7 != -1) {
            zzsh zzshVar = this.zzc;
            if (i7 <= zzshVar.zzc && zzri.zza(zzshVar.zza[i7], this.zza)) {
                return;
            }
        }
        zzsh zzshVar2 = this.zzc;
        Object obj = this.zza;
        this.zzb = zzshVar2.zzc(obj, zzsi.zzc(obj));
    }
}
