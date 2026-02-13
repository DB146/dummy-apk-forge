package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzoi extends zzpr {
    public zzoi() {
        super(zzvg.class, zzvj.class, new zzog(zzjx.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzg(int i7, int i10, int i11, int i12) {
        zzvc zza = zzvd.zza();
        zza.zzc(i7);
        zza.zzb(i10);
        zza.zza(i11);
        zzvd zzvdVar = (zzvd) zza.zzan();
        zzuz zza2 = zzva.zza();
        zza2.zza(zzvdVar);
        return new zzoy((zzva) zza2.zzan(), i12);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzoh(this, zzva.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzvg.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzvg zzvgVar = (zzvg) zzaefVar;
        if (zzvgVar.zzg().zzs()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzvgVar.zzk()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzys.zzb(zzvgVar.zza(), 0);
        zzol.zza(zzvgVar.zzf().zzc());
    }
}
