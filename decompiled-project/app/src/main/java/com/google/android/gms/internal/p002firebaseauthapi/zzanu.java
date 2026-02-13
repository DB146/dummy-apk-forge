package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzanu extends zzanv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanv
    public final int zza(int i7, byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i12 >= i11) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i12 >= i11 - 1) {
                        return zzant.zza(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && ((b2 != -32 || b10 >= -96) && (b2 != -19 || b10 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return zzant.zza(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char charAt;
        int length = str.length();
        int i13 = i10 + i7;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i7) < i13 && (charAt = str.charAt(i14)) < 128) {
            bArr[i12] = (byte) charAt;
            i14++;
        }
        int i15 = i7 + i14;
        while (i14 < length) {
            char charAt2 = str.charAt(i14);
            if (charAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) charAt2;
                i15++;
            } else if (charAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i14 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i11)))) {
                            throw new zzanx(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i15);
                    }
                    int i17 = i14 + 1;
                    if (i17 != str.length()) {
                        char charAt3 = str.charAt(i17);
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
                    throw new zzanx(i14 - 1, length);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanv
    public final String zza(byte[] bArr, int i7, int i10) {
        if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
        }
        int i11 = i7 + i10;
        char[] cArr = new char[i10];
        int i12 = 0;
        while (i7 < i11) {
            byte b2 = bArr[i7];
            if (b2 < 0) {
                break;
            }
            i7++;
            zzans.zza(b2, cArr, i12);
            i12++;
        }
        int i13 = i12;
        while (i7 < i11) {
            int i14 = i7 + 1;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                int i15 = i13 + 1;
                zzans.zza(b10, cArr, i13);
                while (i14 < i11) {
                    byte b11 = bArr[i14];
                    if (b11 < 0) {
                        break;
                    }
                    i14++;
                    zzans.zza(b11, cArr, i15);
                    i15++;
                }
                i13 = i15;
                i7 = i14;
            } else if (b10 < -32) {
                if (i14 >= i11) {
                    throw zzalf.zzd();
                }
                i7 += 2;
                zzans.zza(b10, bArr[i14], cArr, i13);
                i13++;
            } else if (b10 < -16) {
                if (i14 >= i11 - 1) {
                    throw zzalf.zzd();
                }
                int i16 = i7 + 2;
                i7 += 3;
                zzans.zza(b10, bArr[i14], bArr[i16], cArr, i13);
                i13++;
            } else {
                if (i14 >= i11 - 2) {
                    throw zzalf.zzd();
                }
                byte b12 = bArr[i14];
                int i17 = i7 + 3;
                byte b13 = bArr[i7 + 2];
                i7 += 4;
                zzans.zza(b10, b12, b13, bArr[i17], cArr, i13);
                i13 += 2;
            }
        }
        return new String(cArr, 0, i13);
    }
}
