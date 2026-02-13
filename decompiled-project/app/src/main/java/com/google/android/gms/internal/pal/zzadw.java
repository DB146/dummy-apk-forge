package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzadw implements zzaed {
    private final zzaed[] zza;

    public zzadw(zzaed... zzaedVarArr) {
        this.zza = zzaedVarArr;
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final zzaec zzb(Class cls) {
        zzaed[] zzaedVarArr = this.zza;
        for (int i7 = 0; i7 < 2; i7++) {
            zzaed zzaedVar = zzaedVarArr[i7];
            if (zzaedVar.zzc(cls)) {
                return zzaedVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.zzaed
    public final boolean zzc(Class cls) {
        zzaed[] zzaedVarArr = this.zza;
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzaedVarArr[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
