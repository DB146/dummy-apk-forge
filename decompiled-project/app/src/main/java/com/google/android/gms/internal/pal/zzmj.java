package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzmj extends zzoz {
    final /* synthetic */ zzmk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmj(zzmk zzmkVar, Class cls) {
        super(cls);
        this.zza = zzmkVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ zzaef zza(zzaef zzaefVar) {
        zzwo zzc = zzwp.zzc();
        zzc.zza((zzws) zzaefVar);
        zzc.zzb(0);
        return (zzwp) zzc.zzan();
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* synthetic */ zzaef zzb(zzaby zzabyVar) {
        return zzws.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzoz
    public final /* bridge */ /* synthetic */ void zzd(zzaef zzaefVar) {
        zzws zzwsVar = (zzws) zzaefVar;
        if (zzwsVar.zzf().isEmpty() || !zzwsVar.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
