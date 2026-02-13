package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class zzkg implements zzkh {
    final /* synthetic */ zzpr zza;
    final /* synthetic */ zzpa zzb;

    public zzkg(zzpr zzprVar, zzpa zzpaVar) {
        this.zza = zzprVar;
        this.zzb = zzpaVar;
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final zzkb zza(Class cls) {
        try {
            return new zzld(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final zzkb zzb() {
        zzpr zzprVar = this.zza;
        return new zzld(zzprVar, this.zzb, zzprVar.zzi());
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Set zze() {
        return this.zza.zzl();
    }
}
