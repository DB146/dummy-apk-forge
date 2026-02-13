package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzok extends zzpa {
    public zzok() {
        super(zzvj.class, new zzoj(zzjy.class));
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzvj.zzg(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzvj zzvjVar = (zzvj) zzaefVar;
        zzys.zzb(zzvjVar.zza(), 0);
        if (!zzvjVar.zzl()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzol.zza(zzvjVar.zzc());
    }
}
