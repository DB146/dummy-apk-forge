package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzahy {
    private static final zzahv zza;

    static {
        if (zzaht.zzx() && zzaht.zzy()) {
            int i7 = zzadd.zza;
        }
        zza = new zzahw();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i7, int i10) {
        int i11 = i10 - i7;
        byte b2 = bArr[i7 - 1];
        if (i11 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i11 == 1) {
            return zzj(b2, bArr[i7]);
        }
        if (i11 == 2) {
            return zzk(b2, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzd(CharSequence charSequence, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        char charAt;
        int length = charSequence.length();
        int i14 = 0;
        while (true) {
            i11 = i7 + i10;
            if (i14 >= length || (i13 = i14 + i7) >= i11 || (charAt = charSequence.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) charAt;
            i14++;
        }
        int i15 = i7 + i14;
        while (i14 < length) {
            char charAt2 = charSequence.charAt(i14);
            if (charAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) charAt2;
                i15++;
            } else if (charAt2 < 2048 && i15 <= i11 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i12 = i14 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                            throw new zzahx(i14, length);
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
                    throw new zzahx(i14 - 1, length);
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

    public static int zze(CharSequence charSequence) {
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
                                throw new zzahx(i10, length2);
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

    public static int zzf(int i7, byte[] bArr, int i10, int i11) {
        return zza.zza(i7, bArr, i10, i11);
    }

    public static String zzg(byte[] bArr, int i7, int i10) {
        int length = bArr.length;
        if ((((length - i7) - i10) | i7 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        int i11 = i7 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i7 < i11) {
            byte b2 = bArr[i7];
            if (!zzahu.zzd(b2)) {
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
            if (zzahu.zzd(b10)) {
                cArr[i13] = (char) b10;
                i13++;
                i7 = i14;
                while (i7 < i11) {
                    byte b11 = bArr[i7];
                    if (zzahu.zzd(b11)) {
                        i7++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw zzafc.zzd();
                }
                i7 += 2;
                zzahu.zzc(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzafc.zzd();
                }
                int i15 = i7 + 2;
                i7 += 3;
                zzahu.zzb(b10, bArr[i14], bArr[i15], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzafc.zzd();
                }
                byte b12 = bArr[i14];
                int i16 = i7 + 3;
                byte b13 = bArr[i7 + 2];
                i7 += 4;
                zzahu.zza(b10, b12, b13, bArr[i16], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static boolean zzh(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzi(byte[] bArr, int i7, int i10) {
        return zza.zzb(bArr, i7, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i7, int i10) {
        if (i7 > -12 || i10 > -65) {
            return -1;
        }
        return i7 ^ (i10 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i7, int i10, int i11) {
        if (i7 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i7 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
