package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zznk extends zzpr {
    private static final byte[] zza = new byte[0];

    public zznk() {
        super(zzuc.class, zzuf.class, new zzni(zzjx.class));
    }

    public static /* bridge */ /* synthetic */ zzoy zzh(int i7, int i10, int i11, zzkk zzkkVar, byte[] bArr, int i12) {
        zztv zza2 = zztw.zza();
        zzuh zza3 = zzui.zza();
        int i13 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzaby.zzn(bArr));
        zzui zzuiVar = (zzui) zza3.zzan();
        zzvs zza4 = zzvt.zza();
        zza4.zza(zzkkVar.zza());
        zza4.zzb(zzaby.zzn(zzkkVar.zzb()));
        int zzc = zzkkVar.zzc() - 1;
        if (zzc == 0) {
            i13 = 3;
        } else if (zzc != 1) {
            i13 = zzc != 2 ? 6 : 5;
        }
        zza4.zzc(i13);
        zzvt zzvtVar = (zzvt) zza4.zzan();
        zzts zza5 = zztt.zza();
        zza5.zza(zzvtVar);
        zztt zzttVar = (zztt) zza5.zzan();
        zzty zzc2 = zztz.zzc();
        zzc2.zzb(zzuiVar);
        zzc2.zza(zzttVar);
        zzc2.zzc(i11);
        zza2.zza((zztz) zzc2.zzan());
        return new zzoy((zztw) zza2.zzan(), i12);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zznj(this, zztw.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzuc.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzuc zzucVar = (zzuc) zzaefVar;
        if (zzucVar.zzg().zzs()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzys.zzb(zzucVar.zza(), 0);
        zznt.zza(zzucVar.zzf().zzc());
    }
}
