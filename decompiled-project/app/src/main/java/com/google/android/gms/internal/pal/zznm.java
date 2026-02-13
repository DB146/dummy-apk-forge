package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zznm extends zzpa {
    public zznm() {
        super(zzuf.class, new zznl(zzjy.class));
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzuf.zzg(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzuf zzufVar = (zzuf) zzaefVar;
        zzys.zzb(zzufVar.zza(), 0);
        zznt.zza(zzufVar.zzc());
    }
}
