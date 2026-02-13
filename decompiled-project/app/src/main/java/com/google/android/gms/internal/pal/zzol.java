package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzol {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 16);
    public static final byte[] zzd = zzc(2, 17);
    public static final byte[] zze = zzc(2, 18);
    public static final byte[] zzf = zzc(2, 1);
    public static final byte[] zzg = zzc(2, 2);
    public static final byte[] zzh = zzc(2, 3);
    public static final byte[] zzi = zzc(2, 1);
    public static final byte[] zzj = zzc(2, 2);
    public static final byte[] zzk = zzc(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static {
        Charset charset = StandardCharsets.UTF_8;
        zzm = "KEM".getBytes(charset);
        zzn = "HPKE".getBytes(charset);
        zzo = "HPKE-v1".getBytes(charset);
    }

    public static void zza(zzvd zzvdVar) {
        if (zzvdVar.zzg() == 2 || zzvdVar.zzg() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zzux.zza(zzvdVar.zzg())));
        }
        String str = "UNRECOGNIZED";
        if (zzvdVar.zzf() == 2 || zzvdVar.zzf() == 1) {
            int zzf2 = zzvdVar.zzf();
            if (zzf2 == 2) {
                str = "KDF_UNKNOWN";
            } else if (zzf2 == 3) {
                str = "HKDF_SHA256";
            } else if (zzf2 == 4) {
                str = "HKDF_SHA384";
            } else if (zzf2 == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        if (zzvdVar.zze() == 2 || zzvdVar.zze() == 1) {
            int zze2 = zzvdVar.zze();
            if (zze2 == 2) {
                str = "AEAD_UNKNOWN";
            } else if (zze2 == 3) {
                str = "AES_128_GCM";
            } else if (zze2 == 4) {
                str = "AES_256_GCM";
            } else if (zze2 == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    public static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzxo.zzc(zzn, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i7, int i10) {
        byte[] bArr = new byte[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) ((i10 >> (((i7 - i11) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] zzd(byte[] bArr) {
        return zzxo.zzc(zzm, bArr);
    }

    public static byte[] zze(String str, byte[] bArr, byte[] bArr2) {
        return zzxo.zzc(zzo, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i7) {
        return zzxo.zzc(zzc(2, i7), zzo, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
