package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzor {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzoo.zza() && zzoo.zzb()) {
            int i7 = zzku.zza;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(byte[] bArr, int i7, int i10) {
        while (i7 < i10 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i10) {
            return true;
        }
        while (i7 < i10) {
            int i11 = i7 + 1;
            int i12 = bArr[i7];
            if (i12 >= 0) {
                i7 = i11;
            } else if (i12 < -32) {
                if (i11 >= i10) {
                    return i12 == 0;
                }
                if (i12 < -62) {
                    return false;
                }
                i7 += 2;
                if (bArr[i11] > -65) {
                    return false;
                }
            } else if (i12 < -16) {
                if (i11 >= i10 - 1) {
                    i12 = zzd(bArr, i11, i10);
                    if (i12 == 0) {
                    }
                } else {
                    int i13 = i7 + 2;
                    char c10 = bArr[i11];
                    if (c10 > -65) {
                        return false;
                    }
                    if (i12 == -32 && c10 < -96) {
                        return false;
                    }
                    if (i12 == -19 && c10 >= -96) {
                        return false;
                    }
                    i7 += 3;
                    if (bArr[i13] > -65) {
                        return false;
                    }
                }
            } else if (i11 >= i10 - 2) {
                i12 = zzd(bArr, i11, i10);
                if (i12 == 0) {
                }
            } else {
                int i14 = i7 + 2;
                int i15 = bArr[i11];
                if (i15 > -65) {
                    return false;
                }
                if ((((i15 + 112) + (i12 << 28)) >> 30) != 0) {
                    return false;
                }
                int i16 = i7 + 3;
                if (bArr[i14] > -65) {
                    return false;
                }
                i7 += 4;
                if (bArr[i16] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzb(String str) {
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
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new zzoq(i10, length2);
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
        long j = i11 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0114, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzc(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        char charAt;
        int length = str.length();
        int i14 = 0;
        while (true) {
            i11 = i7 + i10;
            if (i14 >= length || (i13 = i14 + i7) >= i11 || (charAt = str.charAt(i14)) >= 128) {
                break;
            }
            bArr[i13] = (byte) charAt;
            i14++;
        }
        int i15 = i7 + i14;
        while (i14 < length) {
            char charAt2 = str.charAt(i14);
            if (charAt2 < 128 && i15 < i11) {
                bArr[i15] = (byte) charAt2;
                i15++;
            } else if (charAt2 < 2048 && i15 <= i11 - 2) {
                bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                i15 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i15 > i11 - 3) {
                    if (i15 > i11 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i12 = i14 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                            throw new zzoq(i14, length);
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(charAt2).length() + 25 + String.valueOf(i15).length());
                        sb2.append("Failed writing ");
                        sb2.append(charAt2);
                        sb2.append(" at index ");
                        sb2.append(i15);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i16 = i14 + 1;
                    if (i16 != str.length()) {
                        char charAt3 = str.charAt(i16);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i17 = i15 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i17] = (byte) ((codePoint & 63) | 128);
                            i14 = i16;
                        } else {
                            i14 = i16;
                        }
                    }
                    throw new zzoq(i14 - 1, length);
                }
                bArr[i15] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i15 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                i15 += 3;
            }
            i14++;
        }
        return i15;
    }

    public static /* synthetic */ int zzd(byte[] bArr, int i7, int i10) {
        int i11 = i10 - i7;
        byte b2 = bArr[i7 - 1];
        if (i11 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
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
}
