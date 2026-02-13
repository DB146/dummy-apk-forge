package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.f;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxf implements zzyk {
    private static final ThreadLocal zza = new zzxe();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzxf(byte[] bArr, int i7) {
        if (!zzna.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzys.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) zza.get()).getBlockSize();
        this.zzd = blockSize;
        if (i7 < 12 || i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.pal.zzyk
    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i7 = this.zzc;
        if (length > f.API_PRIORITY_OTHER - i7) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (f.API_PRIORITY_OTHER - this.zzc));
        }
        byte[] bArr2 = new byte[i7 + length];
        byte[] zza2 = zzyq.zza(i7);
        System.arraycopy(zza2, 0, bArr2, 0, this.zzc);
        int i10 = this.zzc;
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr3 = new byte[this.zzd];
        System.arraycopy(zza2, 0, bArr3, 0, this.zzc);
        cipher.init(1, this.zzb, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i10) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
