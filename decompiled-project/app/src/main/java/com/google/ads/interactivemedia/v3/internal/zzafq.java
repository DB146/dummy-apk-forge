package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzafq implements zzafx {
    private final zzafx[] zza;

    public zzafq(zzafx... zzafxVarArr) {
        this.zza = zzafxVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafx
    public final zzafw zzb(Class cls) {
        zzafx[] zzafxVarArr = this.zza;
        for (int i7 = 0; i7 < 2; i7++) {
            zzafx zzafxVar = zzafxVarArr[i7];
            if (zzafxVar.zzc(cls)) {
                return zzafxVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafx
    public final boolean zzc(Class cls) {
        zzafx[] zzafxVarArr = this.zza;
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzafxVarArr[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
