package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmx {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        long j = zzb2 * 5;
        long j10 = zzb3 * 5;
        long j11 = zzb4 * 5;
        long j12 = zzb5 * 5;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j13 = 0;
        int i10 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j18 = j13 + (j14 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j15 + (j18 >> 26);
                long j21 = j20 & 67108863;
                long j22 = j16 + (j20 >> 26);
                long j23 = j22 & 67108863;
                long j24 = ((j22 >> 26) * 5) + j17;
                long j25 = j24 & 67108863;
                long j26 = (j14 & 67108863) + (j24 >> 26);
                long j27 = j25 + 5;
                long j28 = (j27 >> 26) + j26;
                long j29 = j19 + (j28 >> 26);
                long j30 = j21 + (j29 >> 26);
                long j31 = (j23 + (j30 >> 26)) - 67108864;
                long j32 = j31 >> 63;
                long j33 = ~j32;
                long j34 = (j28 & 67108863 & j33) | (j26 & j32);
                long j35 = (j19 & j32) | (j29 & 67108863 & j33);
                long j36 = (j21 & j32) | (j30 & 67108863 & j33);
                long zzc = (((j25 & j32) | (j27 & 67108863 & j33) | (j34 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j34 >> 6) | (j35 << 20)) & 4294967295L) + zzc(bArr, 20) + (zzc >> 32);
                long zzc3 = (((j35 >> 12) | (j36 << 14)) & 4294967295L) + zzc(bArr, 24) + (zzc2 >> 32);
                long zzc4 = zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                zzd(bArr4, zzc2 & 4294967295L, 4);
                zzd(bArr4, zzc3 & 4294967295L, 8);
                zzd(bArr4, ((((((j31 & j33) | (j23 & j32)) << 8) | (j36 >> 18)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i7, (byte) 0);
            }
            long zzb6 = j17 + zzb(bArr3, 0, 0);
            long zzb7 = j14 + zzb(bArr3, 3, 2);
            long zzb8 = j13 + zzb(bArr3, 6, 4);
            long zzb9 = j15 + zzb(bArr3, 9, 6);
            long zzb10 = j16 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j37 = (zzb10 * j) + (zzb9 * j10) + (zzb8 * j11) + (zzb7 * j12) + (zzb6 * zzb);
            long j38 = (zzb10 * j10) + (zzb9 * j11) + (zzb8 * j12) + (zzb7 * zzb) + (zzb6 * zzb2) + (j37 >> 26);
            long j39 = (zzb10 * j11) + (zzb9 * j12) + (zzb8 * zzb) + (zzb7 * zzb2) + (zzb6 * zzb3) + (j38 >> 26);
            long j40 = (zzb10 * j12) + (zzb9 * zzb) + (zzb8 * zzb2) + (zzb7 * zzb3) + (zzb6 * zzb4) + (j39 >> 26);
            long j41 = zzb9 * zzb2;
            long j42 = zzb10 * zzb;
            long j43 = j42 + j41 + (zzb8 * zzb3) + (zzb7 * zzb4) + (zzb6 * zzb5) + (j40 >> 26);
            long j44 = ((j43 >> 26) * 5) + (j37 & 67108863);
            j17 = j44 & 67108863;
            j14 = (j38 & 67108863) + (j44 >> 26);
            i10 += 16;
            j16 = j43 & 67108863;
            j15 = j40 & 67108863;
            j13 = j39 & 67108863;
            i7 = 17;
        }
    }

    private static long zzb(byte[] bArr, int i7, int i10) {
        return (zzc(bArr, i7) >> i10) & 67108863;
    }

    private static long zzc(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i7) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i7 + i10] = (byte) (255 & j);
            i10++;
            j >>= 8;
        }
    }
}
