package com.google.android.gms.internal.pal;

import A3.c;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzmz implements zzjt {
    private static final ThreadLocal zza = new zzmy();
    private final SecretKey zzb;

    public zzmz(byte[] bArr) {
        zzys.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.pal.zzjt
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] zza2 = zzyq.zza(12);
        System.arraycopy(zza2, 0, bArr3, 0, 12);
        int length2 = zza2.length;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, zza2, 0, length2);
        } catch (ClassNotFoundException unused) {
            if (!zzyr.zza()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(zza2, 0, length2);
        }
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(1, this.zzb, ivParameterSpec);
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
        if (doFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(c.f(doFinal - length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }
}
