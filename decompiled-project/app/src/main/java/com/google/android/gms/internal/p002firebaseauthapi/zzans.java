package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzans {
    public static /* synthetic */ void zza(byte b2, byte b10, byte b11, byte b12, char[] cArr, int i7) {
        if (!zza(b10)) {
            if ((((b10 + 112) + (b2 << 28)) >> 30) == 0 && !zza(b11) && !zza(b12)) {
                int i10 = ((b2 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw zzalf.zzd();
    }

    public static /* synthetic */ void zza(byte b2, byte b10, byte b11, char[] cArr, int i7) {
        if (zza(b10) || ((b2 == -32 && b10 < -96) || ((b2 == -19 && b10 >= -96) || zza(b11)))) {
            throw zzalf.zzd();
        }
        cArr[i7] = (char) (((b2 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    public static /* synthetic */ void zza(byte b2, byte b10, char[] cArr, int i7) {
        if (b2 < -62 || zza(b10)) {
            throw zzalf.zzd();
        }
        cArr[i7] = (char) (((b2 & 31) << 6) | (b10 & 63));
    }

    public static /* synthetic */ void zza(byte b2, char[] cArr, int i7) {
        cArr[i7] = (char) b2;
    }

    private static boolean zza(byte b2) {
        return b2 > -65;
    }
}
