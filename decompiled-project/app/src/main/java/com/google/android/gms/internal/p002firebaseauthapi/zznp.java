package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zznp {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr) {
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
        long j16 = j15 + (j14 << 1);
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 10; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 20; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i13 = 2; i13 < 100; i13 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zza(long[] jArr, long[] jArr2, long j) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] * j;
        }
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i10 = zza[i7];
            jArr[i7] = (((((bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8)) | ((bArr[i10 + 2] & 255) << 16)) | ((bArr[i10 + 3] & 255) << 24)) >> zzb[i7]) & zzc[i7 & 1];
        }
        return jArr;
    }

    public static void zzb(long[] jArr) {
        long j = jArr[8];
        long j10 = jArr[18];
        long j11 = j + (j10 << 4);
        jArr[8] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j39 + (j38 << 1);
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j43 + (j42 << 1);
        jArr[0] = j44;
        jArr[0] = j44 + j42;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j10 = jArr2[1];
        long j11 = jArr2[2];
        long j12 = jArr2[3];
        long j13 = jArr2[4];
        long j14 = jArr2[5];
        long j15 = jArr2[6];
        long j16 = jArr2[7];
        long j17 = jArr2[8];
        long j18 = jArr2[9];
        zze(new long[]{j * j, j * 2 * j10, ((j * j11) + (j10 * j10)) * 2, ((j * j12) + (j10 * j11)) * 2, (j * 2 * j13) + (j10 * 4 * j12) + (j11 * j11), ((j * j14) + (j10 * j13) + (j11 * j12)) * 2, ((j10 * 2 * j14) + (j * j15) + (j11 * j13) + (j12 * j12)) * 2, ((j * j16) + (j10 * j15) + (j11 * j14) + (j12 * j13)) * 2, (((((j12 * j14) + (j10 * j16)) * 2) + (j * j17) + (j11 * j15)) * 2) + (j13 * j13), ((j * j18) + (j10 * j17) + (j11 * j16) + (j12 * j15) + (j13 * j14)) * 2, ((((j10 * j18) + (j12 * j16)) * 2) + (j11 * j17) + (j13 * j15) + (j14 * j14)) * 2, ((j11 * j18) + (j12 * j17) + (j13 * j16) + (j14 * j15)) * 2, (((((j12 * j18) + (j14 * j16)) * 2) + (j13 * j17)) * 2) + (j15 * j15), ((j13 * j18) + (j14 * j17) + (j15 * j16)) * 2, ((j14 * 2 * j18) + (j15 * j17) + (j16 * j16)) * 2, ((j15 * j18) + (j16 * j17)) * 2, (j16 * 4 * j18) + (j17 * j17), j17 * 2 * j18, 2 * j18 * j18}, jArr);
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
        jArr[2] = (jArr2[2] * j12) + (jArr3[2] * j) + (j13 * 2 * j14);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        jArr[3] = (jArr2[3] * j12) + (jArr3[3] * j) + (j16 * j14) + (j13 * j15);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        jArr[4] = (jArr2[4] * j12) + (jArr3[4] * j) + (((j18 * j14) + (j13 * j17)) * 2) + (j16 * j15);
        long j19 = jArr3[4];
        long j20 = (j13 * j19) + (j18 * j15) + (j16 * j17);
        long j21 = jArr2[4];
        jArr[5] = (jArr2[5] * j12) + (jArr3[5] * j) + (j21 * j14) + j20;
        long j22 = jArr3[5];
        long j23 = jArr2[5];
        jArr[6] = (jArr2[6] * j12) + (jArr3[6] * j) + (j21 * j15) + (j16 * j19) + (((j23 * j14) + (j13 * j22) + (j18 * j17)) * 2);
        long j24 = (j23 * j15) + (j16 * j22) + (j21 * j17) + (j18 * j19);
        long j25 = jArr3[6];
        long j26 = (j13 * j25) + j24;
        long j27 = jArr2[6];
        jArr[7] = (jArr2[7] * j12) + (jArr3[7] * j) + (j27 * j14) + j26;
        long j28 = jArr3[7];
        long j29 = (j13 * j28) + (j23 * j17) + (j18 * j22);
        long j30 = jArr2[7];
        long j31 = (((j30 * j14) + j29) * 2) + (j21 * j19);
        jArr[8] = (jArr2[8] * j12) + (jArr3[8] * j) + (j27 * j15) + (j16 * j25) + j31;
        long j32 = (j30 * j15) + (j16 * j28) + (j27 * j17) + (j18 * j25) + (j23 * j19) + (j21 * j22);
        long j33 = jArr3[8];
        long j34 = (j13 * j33) + j32;
        long j35 = jArr2[8];
        jArr[9] = (jArr2[9] * j12) + (j * jArr3[9]) + (j35 * j14) + j34;
        long j36 = (j30 * j17) + (j18 * j28) + (j23 * j22);
        long j37 = jArr3[9];
        long j38 = jArr2[9];
        long j39 = j21 * j25;
        jArr[10] = (j35 * j15) + (j16 * j33) + (j27 * j19) + j39 + (((j14 * j38) + (j13 * j37) + j36) * 2);
        long j40 = j16 * j37;
        long j41 = j15 * j38;
        jArr[11] = j41 + j40 + (j35 * j17) + (j18 * j33) + (j30 * j19) + (j21 * j28) + (j27 * j22) + (j23 * j25);
        long j42 = j18 * j37;
        long j43 = j17 * j38;
        long j44 = j35 * j19;
        jArr[12] = j44 + (j21 * j33) + ((j43 + j42 + (j30 * j22) + (j23 * j28)) * 2) + (j27 * j25);
        long j45 = j21 * j37;
        long j46 = j19 * j38;
        jArr[13] = j46 + j45 + (j35 * j22) + (j23 * j33) + (j30 * j25) + (j27 * j28);
        long j47 = j22 * j38;
        long j48 = j35 * j25;
        jArr[14] = j48 + (j27 * j33) + ((j47 + (j23 * j37) + (j30 * j28)) * 2);
        long j49 = j27 * j37;
        long j50 = j25 * j38;
        jArr[15] = j50 + j49 + (j35 * j28) + (j30 * j33);
        jArr[16] = (((j28 * j38) + (j30 * j37)) * 2) + (j35 * j33);
        jArr[17] = (j33 * j38) + (j35 * j37);
        jArr[18] = j38 * 2 * j37;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    public static byte[] zzc(long[] jArr) {
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
                copyOf[i11] = j + (i12 << r14);
                i11++;
                copyOf[i11] = copyOf[i11] - i12;
            }
            long j10 = copyOf[9];
            copyOf[9] = j10 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j10 >> 31) & j10) >> 25))) * 19);
            i10++;
        }
        long j11 = copyOf[0];
        copyOf[0] = j11 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        int i13 = 0;
        for (i7 = 2; i13 < i7; i7 = 2) {
            int i14 = 0;
            while (i14 < 9) {
                long j12 = copyOf[i14];
                int i15 = (int) (j12 >> zzd[i14 & 1]);
                copyOf[i14] = j12 & zzc[r15];
                i14++;
                copyOf[i14] = copyOf[i14] + i15;
            }
            i13++;
        }
        copyOf[9] = copyOf[9] & 33554431;
        long j13 = (((int) (r9 >> 25)) * 19) + copyOf[0];
        copyOf[0] = j13;
        int i16 = ~((((int) j13) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) copyOf[i17]) ^ zzc[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i16);
        long j14 = 33554431 & i16;
        copyOf[1] = copyOf[1] - j14;
        for (int i23 = 2; i23 < 10; i23 += 2) {
            copyOf[i23] = copyOf[i23] - (67108863 & i16);
            int i24 = i23 + 1;
            copyOf[i24] = copyOf[i24] - j14;
        }
        for (int i25 = 0; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << zzb[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = 0; i26 < 10; i26++) {
            int i27 = zza[i26];
            long j15 = bArr[i27];
            long j16 = copyOf[i26];
            bArr[i27] = (byte) (j15 | (j16 & 255));
            bArr[i27 + 1] = (byte) (bArr[r5] | ((j16 >> 8) & 255));
            bArr[i27 + 2] = (byte) (bArr[r5] | ((j16 >> 16) & 255));
            bArr[i27 + 3] = (byte) (bArr[r4] | ((j16 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }
}
