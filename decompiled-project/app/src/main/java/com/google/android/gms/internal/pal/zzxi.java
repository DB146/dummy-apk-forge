package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxi implements zzjt {
    private static final ThreadLocal zza = new zzxg();
    private static final ThreadLocal zzb = new zzxh();
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    public zzxi(byte[] bArr, int i7) {
        if (!zzna.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i7;
        zzys.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zze = secretKeySpec;
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] zzb2 = zzb(cipher.doFinal(new byte[16]));
        this.zzc = zzb2;
        this.zzd = zzb(zzb2);
    }

    private static byte[] zzb(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            byte b2 = bArr[i7];
            int i10 = i7 + 1;
            bArr2[i7] = (byte) (((b2 + b2) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i7 = i10;
        }
        byte b10 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b10 + b10));
        return bArr2;
    }

    private final byte[] zzc(Cipher cipher, int i7, byte[] bArr, int i10, int i11) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i7;
        if (i11 == 0) {
            return cipher.doFinal(zzd(bArr3, this.zzc));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i12 = 0;
        int i13 = 0;
        while (i11 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i10 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            bArr2 = zzd(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = copyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
                i12++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzd(doFinal, bArr2));
    }

    private static byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr3[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.pal.zzjt
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.zzf;
        if (length > 2147483631 - i7) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i7 + length + 16];
        byte[] zza2 = zzyq.zza(i7);
        System.arraycopy(zza2, 0, bArr3, 0, this.zzf);
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zze);
        byte[] zzc = zzc(cipher, 0, zza2, 0, zza2.length);
        byte[] zzc2 = zzc(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) zzb.get();
        cipher2.init(1, this.zze, new IvParameterSpec(zzc));
        cipher2.doFinal(bArr, 0, length, bArr3, this.zzf);
        byte[] zzc3 = zzc(cipher, 2, bArr3, this.zzf, length);
        int i10 = length + this.zzf;
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i10 + i11] = (byte) ((zzc2[i11] ^ zzc[i11]) ^ zzc3[i11]);
        }
        return bArr3;
    }
}
