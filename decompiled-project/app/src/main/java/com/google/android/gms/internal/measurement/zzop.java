package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzop {
    public static /* synthetic */ boolean zza(byte b2) {
        return b2 >= 0;
    }

    public static /* synthetic */ void zzb(byte b2, byte b10, char[] cArr, int i7) {
        if (b2 < -62 || zze(b10)) {
            throw new zzmq("Protocol message had invalid UTF-8.");
        }
        cArr[i7] = (char) (((b2 & 31) << 6) | (b10 & 63));
    }

    public static /* synthetic */ void zzc(byte b2, byte b10, byte b11, char[] cArr, int i7) {
        if (!zze(b10)) {
            if (b2 == -32) {
                if (b10 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b10 < -96) {
                    b2 = -19;
                }
            }
            if (!zze(b11)) {
                cArr[i7] = (char) (((b2 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                return;
            }
        }
        throw new zzmq("Protocol message had invalid UTF-8.");
    }

    public static /* synthetic */ void zzd(byte b2, byte b10, byte b11, byte b12, char[] cArr, int i7) {
        if (!zze(b10)) {
            if ((((b10 + 112) + (b2 << 28)) >> 30) == 0 && !zze(b11) && !zze(b12)) {
                int i10 = ((b2 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw new zzmq("Protocol message had invalid UTF-8.");
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
