package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import h3.o;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzyn implements zzbe {
    private static final zzix.zza zza = zzix.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzyq();
    private static final ThreadLocal<Cipher> zzc = new zzyp();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    private zzyn(byte[] bArr, int i7, byte[] bArr2) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzh = i7;
        zzzz.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzg = secretKeySpec;
        Cipher cipher = zzb.get();
        cipher.init(1, secretKeySpec);
        byte[] zza2 = zza(cipher.doFinal(new byte[16]));
        this.zzd = zza2;
        this.zze = zza(zza2);
        this.zzf = bArr2;
    }

    public static zzbe zza(zzdl zzdlVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (((zzdq) ((zzcx) zzdlVar.zza())).zzd() == 16) {
            return new zzyn(zzdlVar.zzf().zza(zzbj.zza()), ((zzdq) ((zzcx) zzdlVar.zza())).zzb(), zzdlVar.zzd().zzb());
        }
        throw new GeneralSecurityException(o.l(((zzdq) ((zzcx) zzdlVar.zza())).zzd(), "AesEaxJce only supports 16 byte tag size, not "));
    }

    private final byte[] zza(Cipher cipher, int i7, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i7;
        if (i11 == 0) {
            zzc(bArr2, this.zzd);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i12 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i11 - i12 <= 16) {
                break;
            }
            for (int i13 = 0; i13 < 16; i13++) {
                bArr2[i13] = (byte) (bArr2[i13] ^ bArr[(i10 + i12) + i13]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i12 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i12 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzd);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zze, 16);
            for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                copyOf[i14] = (byte) (copyOf[i14] ^ copyOfRange[i14]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            copyOfRange = copyOf;
        }
        zzc(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            int i10 = i7 + 1;
            bArr2[i7] = (byte) ((bArr[i7] << 1) ^ ((bArr[i10] & 255) >>> 7));
            i7 = i10;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = ((length - bArr3.length) - this.zzh) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzqq.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] zza2 = zza(cipher, 0, bArr, this.zzf.length, this.zzh);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] zza3 = zza(cipher, 1, bArr4, 0, bArr4.length);
        byte[] zza4 = zza(cipher, 2, bArr, this.zzf.length + this.zzh, length2);
        int length3 = bArr.length - 16;
        byte b2 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            b2 = (byte) (b2 | (((bArr[length3 + i7] ^ zza3[i7]) ^ zza2[i7]) ^ zza4[i7]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(zza2));
        return cipher2.doFinal(bArr, this.zzf.length + this.zzh, length2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = f.API_PRIORITY_OTHER - bArr3.length;
        int i7 = this.zzh;
        if (length > (length2 - i7) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i7 + bArr.length + 16);
        byte[] zza2 = zzqg.zza(this.zzh);
        System.arraycopy(zza2, 0, copyOf, this.zzf.length, this.zzh);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] zza3 = zza(cipher, 0, zza2, 0, zza2.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] zza4 = zza(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(zza3));
        cipher2.doFinal(bArr, 0, bArr.length, copyOf, this.zzf.length + this.zzh);
        byte[] zza5 = zza(cipher, 2, copyOf, this.zzf.length + this.zzh, bArr.length);
        int length3 = this.zzf.length + bArr.length + this.zzh;
        for (int i10 = 0; i10 < 16; i10++) {
            copyOf[length3 + i10] = (byte) ((zza4[i10] ^ zza3[i10]) ^ zza5[i10]);
        }
        return copyOf;
    }
}
