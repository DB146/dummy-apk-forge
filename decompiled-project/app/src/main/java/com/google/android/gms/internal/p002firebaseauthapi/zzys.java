package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import h3.o;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public final class zzys implements zzbe {
    private static final zzix.zza zza = zzix.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzys(byte[] bArr, zzaae zzaaeVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgu.zzb(bArr);
        this.zzc = zzaaeVar.zzb();
    }

    public static zzbe zza(zzds zzdsVar) {
        if (((zzdz) ((zzcx) zzdsVar.zza())).zzb() != 12) {
            throw new GeneralSecurityException(o.l(((zzdz) ((zzcx) zzdsVar.zza())).zzb(), "Expected IV Size 12, got "));
        }
        if (((zzdz) ((zzcx) zzdsVar.zza())).zzd() == 16) {
            return new zzys(zzdsVar.zzf().zza(zzbj.zza()), zzdsVar.zzd());
        }
        throw new GeneralSecurityException(o.l(((zzdz) ((zzcx) zzdsVar.zza())).zzd(), "Expected tag Size 16, got "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqq.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec zza2 = zzgu.zza(bArr, this.zzc.length, 12);
        Cipher zza3 = zzgu.zza();
        zza3.init(2, this.zzb, zza2);
        if (bArr2 != null && bArr2.length != 0) {
            zza3.updateAAD(bArr2);
        }
        byte[] bArr4 = this.zzc;
        return zza3.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza2 = zzqg.zza(12);
        AlgorithmParameterSpec zza3 = zzgu.zza(zza2);
        Cipher zza4 = zzgu.zza();
        zza4.init(1, this.zzb, zza3);
        if (bArr2 != null && bArr2.length != 0) {
            zza4.updateAAD(bArr2);
        }
        int outputSize = zza4.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, 12);
        if (zza4.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
