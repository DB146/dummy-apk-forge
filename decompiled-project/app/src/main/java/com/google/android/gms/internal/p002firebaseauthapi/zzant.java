package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzant {
    private static final zzanv zza;

    static {
        if (zzanp.zzc()) {
            zzanp.zzd();
        }
        zza = new zzanu();
    }

    public static int zza(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new zzanx(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i7;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException(c.h("UTF-8 length does not fit in int: ", i11 + 4294967296L));
    }

    public static int zza(String str, byte[] bArr, int i7, int i10) {
        return zza.zza(str, bArr, i7, i10);
    }

    public static /* synthetic */ int zza(byte[] bArr, int i7, int i10) {
        byte b2 = bArr[i7 - 1];
        int i11 = i10 - i7;
        if (i11 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i11 == 1) {
            byte b10 = bArr[i7];
            if (b2 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b2;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i7];
        byte b12 = bArr[i7 + 1];
        if (b2 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b2);
    }

    public static String zzb(byte[] bArr, int i7, int i10) {
        return zza.zza(bArr, i7, i10);
    }

    public static boolean zzc(byte[] bArr, int i7, int i10) {
        return zza.zza(0, bArr, i7, i10) == 0;
    }
}
