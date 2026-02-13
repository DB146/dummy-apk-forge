package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzyi {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j10 = jArr3[1] * j;
        long j11 = jArr2[1];
        long j12 = jArr3[0];
        jArr[1] = (j11 * j12) + j10;
        long j13 = jArr2[1];
        long j14 = jArr3[1];
        jArr[2] = (jArr2[2] * j12) + (jArr3[2] * j) + ((j13 + j13) * j14);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        jArr[3] = (jArr2[3] * j12) + (jArr3[3] * j) + (j16 * j14) + (j13 * j15);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j18 * j14) + (j13 * j17);
        jArr[4] = (jArr2[4] * j12) + (jArr3[4] * j) + j19 + j19 + (j16 * j15);
        long j20 = jArr3[4];
        long j21 = (j13 * j20) + (j18 * j15) + (j16 * j17);
        long j22 = jArr2[4];
        jArr[5] = (jArr2[5] * j12) + (jArr3[5] * j) + (j22 * j14) + j21;
        long j23 = jArr3[5];
        long j24 = jArr2[5];
        long j25 = (j24 * j14) + (j13 * j23) + (j18 * j17);
        jArr[6] = (jArr2[6] * j12) + (jArr3[6] * j) + (j22 * j15) + (j16 * j20) + j25 + j25;
        long j26 = (j24 * j15) + (j16 * j23) + (j22 * j17) + (j18 * j20);
        long j27 = jArr3[6];
        long j28 = (j13 * j27) + j26;
        long j29 = jArr2[6];
        jArr[7] = (jArr2[7] * j12) + (jArr3[7] * j) + (j29 * j14) + j28;
        long j30 = jArr3[7];
        long j31 = (j13 * j30) + (j24 * j17) + (j18 * j23);
        long j32 = jArr2[7];
        long j33 = (j32 * j14) + j31;
        jArr[8] = (jArr2[8] * j12) + (jArr3[8] * j) + (j29 * j15) + (j16 * j27) + j33 + j33 + (j22 * j20);
        long j34 = (j32 * j15) + (j16 * j30) + (j29 * j17) + (j18 * j27) + (j24 * j20) + (j22 * j23);
        long j35 = jArr3[8];
        long j36 = (j13 * j35) + j34;
        long j37 = jArr2[8];
        jArr[9] = (jArr2[9] * j12) + (j * jArr3[9]) + (j37 * j14) + j36;
        long j38 = (j32 * j17) + (j18 * j30) + (j24 * j23);
        long j39 = jArr3[9];
        long j40 = jArr2[9];
        long j41 = (j14 * j40) + (j13 * j39) + j38;
        long j42 = j29 * j20;
        jArr[10] = (j37 * j15) + (j16 * j35) + j42 + (j22 * j27) + j41 + j41;
        long j43 = j16 * j39;
        long j44 = j15 * j40;
        jArr[11] = j44 + j43 + (j37 * j17) + (j18 * j35) + (j32 * j20) + (j22 * j30) + (j29 * j23) + (j24 * j27);
        long j45 = j18 * j39;
        long j46 = j17 * j40;
        long j47 = j46 + j45 + (j32 * j23) + (j24 * j30);
        long j48 = j37 * j20;
        jArr[12] = j48 + (j22 * j35) + j47 + j47 + (j29 * j27);
        long j49 = j22 * j39;
        long j50 = j20 * j40;
        jArr[13] = j50 + j49 + (j37 * j23) + (j24 * j35) + (j32 * j27) + (j29 * j30);
        long j51 = j23 * j40;
        long j52 = j51 + (j24 * j39) + (j32 * j30);
        long j53 = j37 * j27;
        jArr[14] = j53 + (j29 * j35) + j52 + j52;
        long j54 = j29 * j39;
        long j55 = j27 * j40;
        jArr[15] = j55 + j54 + (j37 * j30) + (j32 * j35);
        long j56 = (j30 * j40) + (j32 * j39);
        jArr[16] = j56 + j56 + (j37 * j35);
        jArr[17] = (j35 * j40) + (j37 * j39);
        jArr[18] = (j40 + j40) * j39;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i7 = 0;
        while (i7 < 10) {
            long j = jArr[i7];
            long j10 = j / 67108864;
            jArr[i7] = j - (j10 << 26);
            int i10 = i7 + 1;
            long j11 = jArr[i10] + j10;
            jArr[i10] = j11;
            long j12 = j11 / 33554432;
            jArr[i10] = j11 - (j12 << 25);
            i7 += 2;
            jArr[i7] = jArr[i7] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j14 + j14 + j15;
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static void zze(long[] jArr) {
        long j = jArr[8];
        long j10 = jArr[18];
        long j11 = j + (j10 << 4);
        jArr[8] = j11;
        long j12 = j10 + j10 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j14 + j14 + j15;
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j18 + j18 + j19;
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j22 + j22 + j23;
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j26 + j26 + j27;
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j30 + j30 + j31;
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j34 + j34 + j35;
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j38 + j38 + j39;
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j42 + j42 + j43;
        jArr[0] = j44;
        jArr[0] = j44 + j42;
    }

    public static void zzf(long[] jArr, long[] jArr2, long j) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] * j;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j10 = j * j;
        long j11 = jArr2[1];
        long j12 = (j + j) * j11;
        long j13 = jArr2[2];
        long j14 = (j * j13) + (j11 * j11);
        long j15 = jArr2[3];
        long j16 = (j * j15) + (j11 * j13);
        long j17 = jArr2[4];
        long j18 = ((j + j) * j17) + (j11 * 4 * j15) + (j13 * j13);
        long j19 = jArr2[5];
        long j20 = (j * j19) + (j11 * j17) + (j13 * j15);
        long j21 = jArr2[6];
        long j22 = ((j11 + j11) * j19) + (j * j21) + (j13 * j17) + (j15 * j15);
        long j23 = jArr2[7];
        long j24 = (j * j23) + (j11 * j21) + (j13 * j19) + (j15 * j17);
        long j25 = jArr2[8];
        long j26 = (j15 * j19) + (j11 * j23);
        long j27 = j26 + j26 + (j * j25) + (j13 * j21);
        long j28 = j27 + j27 + (j17 * j17);
        long j29 = jArr2[9];
        long j30 = (j * j29) + (j11 * j25) + (j13 * j23) + (j15 * j21) + (j17 * j19);
        long j31 = (j11 * j29) + (j15 * j23);
        long j32 = j31 + j31 + (j13 * j25) + (j17 * j21) + (j19 * j19);
        long j33 = (j13 * j29) + (j15 * j25) + (j17 * j23) + (j19 * j21);
        long j34 = (j15 * j29) + (j19 * j23);
        long j35 = j34 + j34 + (j17 * j25);
        long j36 = j35 + j35 + (j21 * j21);
        long j37 = (j17 * j29) + (j19 * j25) + (j21 * j23);
        long j38 = ((j19 + j19) * j29) + (j21 * j25) + (j23 * j23);
        long j39 = (j21 * j29) + (j23 * j25);
        zzc(new long[]{j10, j12, j14 + j14, j16 + j16, j18, j20 + j20, j22 + j22, j24 + j24, j28, j30 + j30, j32 + j32, j33 + j33, j36, j37 + j37, j38 + j38, j39 + j39, (j23 * 4 * j29) + (j25 * j25), (j25 + j25) * j29, (j29 + j29) * j29}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i7;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                break;
            }
            int i11 = 0;
            while (i11 < 9) {
                long j = copyOf[i11];
                int i12 = -((int) (((j >> 31) & j) >> zzd[i11 & 1]));
                copyOf[i11] = j + (i12 << r9);
                i11++;
                copyOf[i11] = copyOf[i11] - i12;
            }
            long j10 = copyOf[9];
            int i13 = -((int) (((j10 >> 31) & j10) >> 25));
            copyOf[9] = j10 + (i13 << 25);
            copyOf[0] = copyOf[0] - (i13 * 19);
            i10++;
        }
        long j11 = copyOf[0];
        copyOf[0] = j11 + (r2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        for (int i14 = 0; i14 < 2; i14++) {
            int i15 = 0;
            while (i15 < 9) {
                long j12 = copyOf[i15];
                int i16 = zzd[i15 & 1];
                copyOf[i15] = zzc[r11] & j12;
                i15++;
                copyOf[i15] = copyOf[i15] + ((int) (j12 >> i16));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (r8 >> 25)) * 19);
        int i17 = ~((((int) r10) - 67108845) >> 31);
        for (int i18 = 1; i18 < 10; i18++) {
            int i19 = ~(((int) copyOf[i18]) ^ zzc[i18 & 1]);
            int i20 = i19 & (i19 << 16);
            int i21 = i20 & (i20 << 8);
            int i22 = i21 & (i21 << 4);
            int i23 = i22 & (i22 << 2);
            i17 &= (i23 & (i23 + i23)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i17);
        long j13 = 33554431 & i17;
        copyOf[1] = copyOf[1] - j13;
        for (i7 = 2; i7 < 10; i7 += 2) {
            copyOf[i7] = copyOf[i7] - (67108863 & i17);
            int i24 = i7 + 1;
            copyOf[i24] = copyOf[i24] - j13;
        }
        for (int i25 = 0; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << zzb[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = 0; i26 < 10; i26++) {
            int i27 = zza[i26];
            byte b2 = bArr[i27];
            long j14 = copyOf[i26];
            bArr[i27] = (byte) (b2 | (j14 & 255));
            bArr[i27 + 1] = (byte) (bArr[r4] | ((j14 >> 8) & 255));
            bArr[i27 + 2] = (byte) (bArr[r4] | ((j14 >> 16) & 255));
            bArr[i27 + 3] = (byte) (((j14 >> 24) & 255) | bArr[r3]);
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i10 = zza[i7];
            jArr[i7] = (((((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8)) | ((bArr[i10 + 2] & 255) << 16)) | ((bArr[i10 + 3] & 255) << 24)) >> zzb[i7]) & zzc[i7 & 1];
        }
        return jArr;
    }
}
