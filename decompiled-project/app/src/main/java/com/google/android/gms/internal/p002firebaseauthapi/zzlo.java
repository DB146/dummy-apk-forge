package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
final class zzlo implements zzlq {
    private final int zza;

    public zzlo(zzdz zzdzVar) {
        if (zzdzVar.zzb() != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzdzVar.zzd() != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzdzVar.zzf() != zzdz.zzb.zzc) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.zza = zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        if (bArr2.length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey zzb = zzgu.zzb(bArr);
        int i10 = i7 + 12;
        if (bArr2.length < i7 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zza = zzgu.zza(bArr2, i7, 12);
        Cipher zza2 = zzgu.zza();
        zza2.init(2, zzb, zza);
        return zza2.doFinal(bArr2, i10, (bArr2.length - i7) - 12);
    }
}
