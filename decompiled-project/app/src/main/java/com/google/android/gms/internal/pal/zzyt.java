package com.google.android.gms.internal.pal;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzyt {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i7 = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        int i10 = copyOf[31] & Byte.MAX_VALUE;
        copyOf[31] = (byte) i10;
        copyOf[31] = (byte) (i10 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i11 = 0; i11 < 7; i11++) {
            byte[][] bArr3 = zzxq.zza;
            if (zzxo.zzb(bArr3[i11], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(zzyj.zza(bArr3[i11])));
            }
        }
        long[] zzk = zzyi.zzk(copyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i12 = 10;
        System.arraycopy(zzk, 0, jArr2, 0, 10);
        while (i7 < 32) {
            int i13 = copyOf[31 - i7] & 255;
            int i14 = 0;
            while (i14 < 8) {
                int i15 = (i13 >> (7 - i14)) & 1;
                zzxq.zza(jArr4, jArr2, i15);
                zzxq.zza(jArr5, jArr3, i15);
                byte[] bArr4 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                int i16 = i13;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i17 = i7;
                long[] jArr13 = new long[19];
                int i18 = i14;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                zzyi.zzi(jArr4, jArr4, jArr5);
                zzyi.zzh(jArr5, copyOf3, jArr5);
                long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                zzyi.zzi(jArr2, jArr2, jArr3);
                zzyi.zzh(jArr3, copyOf4, jArr3);
                zzyi.zzb(jArr14, jArr2, jArr5);
                zzyi.zzb(jArr15, jArr4, jArr3);
                zzyi.zze(jArr14);
                zzyi.zzd(jArr14);
                zzyi.zze(jArr15);
                zzyi.zzd(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                zzyi.zzi(jArr14, jArr14, jArr15);
                zzyi.zzh(jArr15, copyOf4, jArr15);
                zzyi.zzg(jArr18, jArr14);
                zzyi.zzg(jArr17, jArr15);
                zzyi.zzb(jArr15, jArr17, zzk);
                zzyi.zze(jArr15);
                zzyi.zzd(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                zzyi.zzg(jArr12, jArr4);
                zzyi.zzg(jArr13, jArr5);
                zzyi.zzb(jArr8, jArr12, jArr13);
                zzyi.zze(jArr8);
                zzyi.zzd(jArr8);
                zzyi.zzh(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                zzyi.zzf(jArr10, jArr13, 121665L);
                zzyi.zzd(jArr10);
                zzyi.zzi(jArr10, jArr10, jArr12);
                zzyi.zzb(jArr16, jArr13, jArr10);
                zzyi.zze(jArr16);
                zzyi.zzd(jArr16);
                zzxq.zza(jArr8, jArr6, i15);
                zzxq.zza(jArr16, jArr7, i15);
                i14 = i18 + 1;
                jArr9 = jArr5;
                jArr2 = jArr6;
                i13 = i16;
                jArr = jArr11;
                i7 = i17;
                jArr6 = jArr19;
                jArr5 = jArr16;
                copyOf = bArr4;
                long[] jArr20 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr20;
                long[] jArr21 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr21;
            }
            i7++;
            copyOf = copyOf;
            i12 = 10;
        }
        long[] jArr22 = jArr;
        int i19 = i12;
        long[] jArr23 = new long[i19];
        long[] jArr24 = new long[i19];
        long[] jArr25 = new long[i19];
        long[] jArr26 = new long[i19];
        long[] jArr27 = new long[i19];
        long[] jArr28 = new long[i19];
        long[] jArr29 = new long[i19];
        long[] jArr30 = new long[i19];
        long[] jArr31 = new long[i19];
        long[] jArr32 = new long[i19];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[i19];
        zzyi.zzg(jArr24, jArr5);
        zzyi.zzg(jArr34, jArr24);
        zzyi.zzg(jArr32, jArr34);
        zzyi.zza(jArr25, jArr32, jArr5);
        zzyi.zza(jArr26, jArr25, jArr24);
        zzyi.zzg(jArr32, jArr26);
        zzyi.zza(jArr27, jArr32, jArr25);
        zzyi.zzg(jArr32, jArr27);
        zzyi.zzg(jArr34, jArr32);
        zzyi.zzg(jArr32, jArr34);
        zzyi.zzg(jArr34, jArr32);
        zzyi.zzg(jArr32, jArr34);
        zzyi.zza(jArr28, jArr32, jArr27);
        zzyi.zzg(jArr32, jArr28);
        zzyi.zzg(jArr34, jArr32);
        for (int i20 = 2; i20 < 10; i20 += 2) {
            zzyi.zzg(jArr32, jArr34);
            zzyi.zzg(jArr34, jArr32);
        }
        zzyi.zza(jArr29, jArr34, jArr28);
        zzyi.zzg(jArr32, jArr29);
        zzyi.zzg(jArr34, jArr32);
        for (int i21 = 2; i21 < 20; i21 += 2) {
            zzyi.zzg(jArr32, jArr34);
            zzyi.zzg(jArr34, jArr32);
        }
        zzyi.zza(jArr32, jArr34, jArr29);
        zzyi.zzg(jArr34, jArr32);
        zzyi.zzg(jArr32, jArr34);
        for (int i22 = 2; i22 < 10; i22 += 2) {
            zzyi.zzg(jArr34, jArr32);
            zzyi.zzg(jArr32, jArr34);
        }
        zzyi.zza(jArr30, jArr32, jArr28);
        zzyi.zzg(jArr32, jArr30);
        zzyi.zzg(jArr34, jArr32);
        for (int i23 = 2; i23 < 50; i23 += 2) {
            zzyi.zzg(jArr32, jArr34);
            zzyi.zzg(jArr34, jArr32);
        }
        zzyi.zza(jArr31, jArr34, jArr30);
        zzyi.zzg(jArr34, jArr31);
        zzyi.zzg(jArr32, jArr34);
        for (int i24 = 2; i24 < 100; i24 += 2) {
            zzyi.zzg(jArr34, jArr32);
            zzyi.zzg(jArr32, jArr34);
        }
        zzyi.zza(jArr34, jArr32, jArr31);
        zzyi.zzg(jArr32, jArr34);
        zzyi.zzg(jArr34, jArr32);
        for (int i25 = 2; i25 < 50; i25 += 2) {
            zzyi.zzg(jArr32, jArr34);
            zzyi.zzg(jArr34, jArr32);
        }
        zzyi.zza(jArr32, jArr34, jArr30);
        zzyi.zzg(jArr34, jArr32);
        zzyi.zzg(jArr32, jArr34);
        zzyi.zzg(jArr34, jArr32);
        zzyi.zzg(jArr32, jArr34);
        zzyi.zzg(jArr34, jArr32);
        zzyi.zza(jArr23, jArr34, jArr26);
        zzyi.zza(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        zzyi.zza(jArr35, zzk, jArr22);
        zzyi.zzi(jArr36, zzk, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        zzyi.zzi(jArr38, jArr36, jArr40);
        zzyi.zza(jArr38, jArr38, jArr3);
        zzyi.zzi(jArr38, jArr38, jArr33);
        zzyi.zza(jArr38, jArr38, jArr35);
        zzyi.zza(jArr38, jArr38, jArr33);
        zzyi.zzf(jArr37, jArr38, 4L);
        zzyi.zzd(jArr37);
        zzyi.zza(jArr38, jArr35, jArr3);
        zzyi.zzh(jArr38, jArr38, jArr3);
        zzyi.zza(jArr39, jArr36, jArr33);
        zzyi.zzi(jArr38, jArr38, jArr39);
        zzyi.zzg(jArr38, jArr38);
        if (zzxo.zzb(zzyi.zzj(jArr37), zzyi.zzj(jArr38))) {
            return zzyi.zzj(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzyj.zza(bArr2)));
    }

    public static byte[] zzb() {
        byte[] zza = zzyq.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        int i7 = zza[31] & 63;
        zza[31] = (byte) i7;
        zza[31] = (byte) (i7 | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return zza(bArr, bArr2);
    }
}
