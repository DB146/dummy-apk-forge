package com.google.android.gms.internal.pal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzafx {
    private static final zzafu zza;

    static {
        if (zzafs.zzx() && zzafs.zzy()) {
            int i7 = zzabk.zza;
        }
        zza = new zzafv();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i7, int i10) {
        byte b2 = bArr[i7 - 1];
        int i11 = i10 - i7;
        if (i11 != 0) {
            if (i11 == 1) {
                byte b10 = bArr[i7];
                if (b2 <= -12 && b10 <= -65) {
                    return b2 ^ (b10 << 8);
                }
            } else {
                if (i11 != 2) {
                    throw new AssertionError();
                }
                byte b11 = bArr[i7];
                byte b12 = bArr[i7 + 1];
                if (b2 <= -12 && b11 <= -65 && b12 <= -65) {
                    return ((b11 << 8) ^ b2) ^ (b12 << 16);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fb, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(CharSequence charSequence, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char charAt;
        int length = charSequence.length();
        int i13 = i10 + i7;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i7) < i13 && (charAt = charSequence.charAt(i14)) < 128) {
            bArr[i12] = (byte) charAt;
            i14++;
        }
        int i15 = i7 + i14;
        while (i14 < length) {
            char charAt2 = charSequence.charAt(i14);
            if (charAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) charAt2;
                i15++;
            } else if (charAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i11 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                            throw new zzafw(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i15);
                    }
                    int i17 = i14 + 1;
                    if (i17 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i17);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i18 = i15 + 3;
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i14 = i17;
                        } else {
                            i14 = i17;
                        }
                    }
                    throw new zzafw(i14 - 1, length);
                }
                bArr[i15] = (byte) ((charAt2 >>> '\f') | 480);
                int i19 = i15 + 2;
                bArr[i15 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i15 += 3;
                bArr[i19] = (byte) ((charAt2 & '?') | 128);
            }
            i14++;
        }
        return i15;
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = charSequence.length();
                while (i10 < length2) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i10) < 65536) {
                                throw new zzafw(i10, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i7, int i10) {
        int length = bArr.length;
        if ((i7 | i10 | ((length - i7) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        int i11 = i7 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i7 < i11) {
            byte b2 = bArr[i7];
            if (!zzaft.zzd(b2)) {
                break;
            }
            i7++;
            cArr[i12] = (char) b2;
            i12++;
        }
        int i13 = i12;
        while (i7 < i11) {
            int i14 = i7 + 1;
            byte b10 = bArr[i7];
            if (zzaft.zzd(b10)) {
                cArr[i13] = (char) b10;
                i13++;
                i7 = i14;
                while (i7 < i11) {
                    byte b11 = bArr[i7];
                    if (!zzaft.zzd(b11)) {
                        break;
                    }
                    i7++;
                    cArr[i13] = (char) b11;
                    i13++;
                }
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw zzadi.zzd();
                }
                i7 += 2;
                zzaft.zzc(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzadi.zzd();
                }
                int i15 = i7 + 2;
                i7 += 3;
                zzaft.zzb(b10, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzadi.zzd();
                }
                int i16 = i7 + 2;
                int i17 = i7 + 3;
                i7 += 4;
                zzaft.zza(b10, bArr[i14], bArr[i16], bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i7, int i10) {
        return zza.zzb(bArr, i7, i10);
    }
}
