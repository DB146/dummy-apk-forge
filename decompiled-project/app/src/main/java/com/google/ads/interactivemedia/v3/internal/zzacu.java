package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzacu extends zzyp {
    @Override // com.google.ads.interactivemedia.v3.internal.zzyp
    public final void zza(zzacv zzacvVar) {
        int i7;
        int i10 = zzacvVar.zza;
        if (i10 == 0) {
            i10 = zzacvVar.zzb();
        }
        if (i10 == 13) {
            i7 = 9;
        } else if (i10 == 12) {
            i7 = 8;
        } else {
            if (i10 != 14) {
                throw new IllegalStateException(zzacw.zzb(zzacvVar, "Expected a name but was "));
            }
            i7 = 10;
        }
        zzacvVar.zza = i7;
    }
}
