package com.google.android.gms.internal.pal;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class zzma extends zzpa {
    public zzma() {
        super(zzsz.class, new zzly(zzjt.class));
    }

    public static void zzg(boolean z8) {
        if (zzm()) {
            zzlf.zzn(new zzma(), true);
        }
    }

    public static /* bridge */ /* synthetic */ zzoy zzh(int i7, int i10) {
        zztb zzc = zztc.zzc();
        zzc.zza(i7);
        return new zzoy((zztc) zzc.zzan(), i10);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz zza() {
        return new zzlz(this, zztc.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzvn zzb() {
        return zzvn.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* synthetic */ zzaef zzc(zzaby zzabyVar) {
        return zzsz.zze(zzabyVar, zzacm.zza());
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzaef zzaefVar) {
        zzsz zzszVar = (zzsz) zzaefVar;
        zzys.zzb(zzszVar.zza(), 0);
        zzys.zza(zzszVar.zzf().zzd());
    }
}
