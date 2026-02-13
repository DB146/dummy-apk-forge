package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzij implements zzbe {
    private static final zzix.zza zza = zzix.zza.zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzij(byte[] bArr, byte[] bArr2) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zza()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzbe zza(zzgb zzgbVar) {
        return new zzij(zzgbVar.zze().zza(zzbj.zza()), zzgbVar.zzd().zzb());
    }

    public static boolean zza() {
        return zzhk.zza() != null;
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqq.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.zzc.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhs.zza(this.zzb, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zza(bArr4));
        Cipher zza2 = zzhk.zza();
        zza2.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            zza2.updateAAD(bArr2);
        }
        byte[] bArr5 = this.zzc;
        return zza2.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza2 = zzqg.zza(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhs.zza(this.zzb, zza2), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zza(zza2));
        Cipher zza3 = zzhk.zza();
        zza3.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            zza3.updateAAD(bArr2);
        }
        int outputSize = zza3.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, 24);
        if (zza3.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + 24) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
