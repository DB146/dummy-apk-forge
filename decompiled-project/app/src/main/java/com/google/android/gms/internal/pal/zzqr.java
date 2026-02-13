package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzqr extends zzpa {
    public zzqr() {
        super(zzup.class, new zzqp(zzkq.class));
    }

    public static final void zzh(zzup zzupVar) {
        zzys.zzb(zzupVar.zza(), 0);
        if (zzupVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzn(zzupVar.zzg());
    }

    public static /* bridge */ /* synthetic */ zzoy zzm(int i7, int i10, int i11, int i12) {
        zzur zzc = zzus.zzc();
        zzuu zzc2 = zzuv.zzc();
        zzc2.zzb(i11);
        zzc2.zza(i10);
        zzc.zzb((zzuv) zzc2.zzan());
        zzc.zza(i7);
        return new zzoy((zzus) zzc.zzan(), i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzuv zzuvVar) {
        if (zzuvVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int zzg = zzuvVar.zzg() - 2;
        if (zzg == 1) {
            if (zzuvVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (zzg == 2) {
            if (zzuvVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (zzg == 3) {
            if (zzuvVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (zzg == 4) {
            if (zzuvVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (zzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzuvVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzqq(this, zzus.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzup.zzf(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzh((zzup) zzaefVar);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int zzf() {
        return 2;
    }
}
