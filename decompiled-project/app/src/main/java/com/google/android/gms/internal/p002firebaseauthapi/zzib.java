package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzib {
    private static long zza(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    private static long zza(byte[] bArr, int i7, int i10) {
        return (zza(bArr, i7) >> i10) & 67108863;
    }

    private static void zza(byte[] bArr, long j, int i7) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i7 + i10] = (byte) (255 & j);
            i10++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long zza = zza(bArr, 0, 0) & 67108863;
        long zza2 = zza(bArr, 3, 2) & 67108611;
        long zza3 = zza(bArr, 6, 4) & 67092735;
        long zza4 = zza(bArr, 9, 6) & 66076671;
        long zza5 = zza(bArr, 12, 8) & 1048575;
        long j = zza2 * 5;
        long j10 = zza3 * 5;
        long j11 = zza4 * 5;
        long j12 = zza5 * 5;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j13 = 0;
        int i10 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        while (i10 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i7, (byte) 0);
            }
            long zza6 = j17 + zza(bArr3, 0, 0);
            long zza7 = j13 + zza(bArr3, 3, 2);
            long zza8 = j14 + zza(bArr3, 6, 4);
            long zza9 = j15 + zza(bArr3, 9, 6);
            long zza10 = j16 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
            long j18 = (zza10 * j) + (zza9 * j10) + (zza8 * j11) + (zza7 * j12) + (zza6 * zza);
            long j19 = (zza10 * j10) + (zza9 * j11) + (zza8 * j12) + (zza7 * zza) + (zza6 * zza2);
            long j20 = (zza10 * j11) + (zza9 * j12) + (zza8 * zza) + (zza7 * zza2) + (zza6 * zza3);
            long j21 = (zza10 * j12) + (zza9 * zza) + (zza8 * zza2) + (zza7 * zza3) + (zza6 * zza4);
            long j22 = zza9 * zza2;
            long j23 = zza10 * zza;
            long j24 = j19 + (j18 >> 26);
            long j25 = j20 + (j24 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j23 + j22 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j26 >> 26);
            long j28 = j27 >> 26;
            j16 = j27 & 67108863;
            long j29 = (j28 * 5) + (j18 & 67108863);
            i10 += 16;
            j14 = j25 & 67108863;
            j15 = j26 & 67108863;
            i7 = 17;
            j17 = j29 & 67108863;
            j13 = (j24 & 67108863) + (j29 >> 26);
        }
        long j30 = j14 + (j13 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j15 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j16 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = ((j34 >> 26) * 5) + j17;
        long j37 = j36 >> 26;
        long j38 = j36 & 67108863;
        long j39 = (j13 & 67108863) + j37;
        long j40 = j38 + 5;
        long j41 = j40 & 67108863;
        long j42 = (j40 >> 26) + j39;
        long j43 = j31 + (j42 >> 26);
        long j44 = j33 + (j43 >> 26);
        long j45 = (j35 + (j44 >> 26)) - 67108864;
        long j46 = j45 >> 63;
        long j47 = j38 & j46;
        long j48 = j39 & j46;
        long j49 = j31 & j46;
        long j50 = j33 & j46;
        long j51 = j35 & j46;
        long j52 = ~j46;
        long j53 = j48 | (j42 & 67108863 & j52);
        long j54 = j49 | (j43 & 67108863 & j52);
        long j55 = j50 | (j44 & 67108863 & j52);
        long j56 = (j47 | (j41 & j52) | (j53 << 26)) & 4294967295L;
        long j57 = ((j53 >> 6) | (j54 << 20)) & 4294967295L;
        long j58 = ((j54 >> 12) | (j55 << 14)) & 4294967295L;
        long j59 = ((j55 >> 18) | ((j51 | (j45 & j52)) << 8)) & 4294967295L;
        long zza11 = j56 + zza(bArr, 16);
        long j60 = zza11 & 4294967295L;
        long zza12 = j57 + zza(bArr, 20) + (zza11 >> 32);
        long j61 = zza12 & 4294967295L;
        long zza13 = j58 + zza(bArr, 24) + (zza12 >> 32);
        long j62 = zza13 & 4294967295L;
        long zza14 = (j59 + zza(bArr, 28) + (zza13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        zza(bArr4, j60, 0);
        zza(bArr4, j61, 4);
        zza(bArr4, j62, 8);
        zza(bArr4, zza14, 12);
        return bArr4;
    }
}
