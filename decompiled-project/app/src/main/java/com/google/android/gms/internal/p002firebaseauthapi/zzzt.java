package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzzt implements zzso {
    private static final zzix.zza zza = zzix.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzzw();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzzt(byte[] bArr) {
        zzzz.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb2 = zzse.zzb(zza2.doFinal(new byte[16]));
        this.zzd = zzb2;
        this.zze = zzse.zzb(zzb2);
    }

    private static Cipher zza() {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) {
        for (int i10 = 0; i10 < 16; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 + i7]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzso
    public final byte[] zza(byte[] bArr, int i7) {
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zza2 = zza();
        zza2.init(1, this.zzc);
        int length = bArr.length;
        int i10 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        byte[] zza3 = (i10 << 4) == bArr.length ? zzyt.zza(bArr, (i10 - 1) << 4, this.zzd, 0, 16) : zzyt.zza(zzse.zza(Arrays.copyOfRange(bArr, (i10 - 1) << 4, bArr.length)), this.zze);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < i10 - 1; i11++) {
            zza(bArr2, bArr, i11 << 4, bArr3);
            if (zza2.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zza(bArr2, zza3, 0, bArr3);
        if (zza2.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i7 ? bArr2 : Arrays.copyOf(bArr2, i7);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
