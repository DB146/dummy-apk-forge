package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class zzke implements zzkh {
    final /* synthetic */ zzkb zza;

    public zzke(zzkb zzkbVar) {
        this.zza = zzkbVar;
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final zzkb zza(Class cls) {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final zzkb zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Set zze() {
        return Collections.singleton(this.zza.zzc());
    }
}
