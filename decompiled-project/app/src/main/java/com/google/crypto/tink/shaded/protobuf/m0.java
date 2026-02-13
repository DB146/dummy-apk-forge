package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class m0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15803a;

    public /* synthetic */ m0(int i7) {
        this.f15803a = i7;
    }

    public static int X(long j, byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            P p10 = o0.f15808a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i10 == 1) {
            return o0.c(i7, l0.f(bArr, j));
        }
        if (i10 == 2) {
            return o0.d(i7, l0.f(bArr, j), l0.f(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    @Override // com.google.crypto.tink.shaded.protobuf.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String K(int i7, byte[] bArr, int i10) {
        switch (this.f15803a) {
            case 0:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i11 = i7 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i7 < i11) {
                    byte b2 = bArr[i7];
                    if (!P.b(b2)) {
                        int i13 = i12;
                        while (i7 < i11) {
                            int i14 = i7 + 1;
                            byte b10 = bArr[i7];
                            if (P.b(b10)) {
                                int i15 = i13 + 1;
                                cArr[i13] = (char) b10;
                                while (i14 < i11) {
                                    byte b11 = bArr[i14];
                                    if (P.b(b11)) {
                                        i14++;
                                        cArr[i15] = (char) b11;
                                        i15++;
                                    } else {
                                        i13 = i15;
                                        i7 = i14;
                                    }
                                }
                                i13 = i15;
                                i7 = i14;
                            } else if (b10 < -32) {
                                if (i14 >= i11) {
                                    throw C.a();
                                }
                                i7 += 2;
                                P.c(b10, bArr[i14], cArr, i13);
                                i13++;
                            } else if (b10 < -16) {
                                if (i14 >= i11 - 1) {
                                    throw C.a();
                                }
                                int i16 = i7 + 2;
                                i7 += 3;
                                P.d(b10, bArr[i14], bArr[i16], cArr, i13);
                                i13++;
                            } else {
                                if (i14 >= i11 - 2) {
                                    throw C.a();
                                }
                                byte b12 = bArr[i14];
                                int i17 = i7 + 3;
                                byte b13 = bArr[i7 + 2];
                                i7 += 4;
                                P.a(b10, b12, b13, bArr[i17], cArr, i13);
                                i13 += 2;
                            }
                        }
                        return new String(cArr, 0, i13);
                    }
                    i7++;
                    cArr[i12] = (char) b2;
                    i12++;
                }
                int i132 = i12;
                while (i7 < i11) {
                }
                return new String(cArr, 0, i132);
            default:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i18 = i7 + i10;
                char[] cArr2 = new char[i10];
                int i19 = 0;
                while (i7 < i18) {
                    byte f4 = l0.f(bArr, i7);
                    if (!P.b(f4)) {
                        int i20 = i19;
                        while (i7 < i18) {
                            int i21 = i7 + 1;
                            byte f10 = l0.f(bArr, i7);
                            if (P.b(f10)) {
                                int i22 = i20 + 1;
                                cArr2[i20] = (char) f10;
                                while (i21 < i18) {
                                    byte f11 = l0.f(bArr, i21);
                                    if (P.b(f11)) {
                                        i21++;
                                        cArr2[i22] = (char) f11;
                                        i22++;
                                    } else {
                                        i20 = i22;
                                        i7 = i21;
                                    }
                                }
                                i20 = i22;
                                i7 = i21;
                            } else if (f10 < -32) {
                                if (i21 >= i18) {
                                    throw C.a();
                                }
                                i7 += 2;
                                P.c(f10, l0.f(bArr, i21), cArr2, i20);
                                i20++;
                            } else if (f10 < -16) {
                                if (i21 >= i18 - 1) {
                                    throw C.a();
                                }
                                int i23 = i7 + 2;
                                i7 += 3;
                                P.d(f10, l0.f(bArr, i21), l0.f(bArr, i23), cArr2, i20);
                                i20++;
                            } else {
                                if (i21 >= i18 - 2) {
                                    throw C.a();
                                }
                                byte f12 = l0.f(bArr, i21);
                                int i24 = i7 + 3;
                                byte f13 = l0.f(bArr, i7 + 2);
                                i7 += 4;
                                P.a(f10, f12, f13, l0.f(bArr, i24), cArr2, i20);
                                i20 += 2;
                            }
                        }
                        return new String(cArr2, 0, i20);
                    }
                    i7++;
                    cArr2[i19] = (char) f4;
                    i19++;
                }
                int i202 = i19;
                while (i7 < i18) {
                }
                return new String(cArr2, 0, i202);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Q(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char charAt;
        long j;
        String str2;
        String str3;
        int i13;
        char charAt2;
        switch (this.f15803a) {
            case 0:
                int length = str.length();
                int i14 = i10 + i7;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i7) < i14 && (charAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i7 + i15;
                while (i15 < length) {
                    char charAt3 = str.charAt(i15);
                    if (charAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) charAt3;
                        i16++;
                    } else if (charAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((charAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i11)))) {
                                    throw new n0(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new n0(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((charAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((charAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j10 = i7;
                long j11 = i10 + j10;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i10 || bArr.length - i10 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i10));
                }
                int i21 = 0;
                while (true) {
                    j = 1;
                    if (i21 < length2 && (charAt2 = str.charAt(i21)) < 128) {
                        l0.n(bArr, j10, (byte) charAt2);
                        i21++;
                        j10 = 1 + j10;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt5 = str.charAt(i21);
                        if (charAt5 < 128 && j10 < j11) {
                            l0.n(bArr, j10, (byte) charAt5);
                            str3 = str5;
                            j10 += j;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j10 > j11 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j10 > j11 - 3) {
                                if (j10 > j11 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i13)))) {
                                        throw new n0(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j10);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        l0.n(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                        l0.n(bArr, j10 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j12 = 3 + j10;
                                        l0.n(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j10 += 4;
                                        l0.n(bArr, j12, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new n0(i21 - 1, length2);
                            }
                            l0.n(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                            long j13 = j10 + 2;
                            l0.n(bArr, j10 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j10 += 3;
                            l0.n(bArr, j13, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j14 = j10 + j;
                            l0.n(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                            j10 += 2;
                            l0.n(bArr, j14, (byte) ((charAt5 & '?') | 128));
                        }
                        i21++;
                        str4 = str2;
                        str5 = str3;
                        j = 1;
                    }
                }
                return (int) j10;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final int U(int i7, byte[] bArr, int i10) {
        int i11;
        int i12 = i7;
        switch (this.f15803a) {
            case 0:
                break;
            default:
                if ((i12 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                long j = i12;
                int i13 = (int) (i10 - j);
                long j10 = 1;
                if (i13 < 16) {
                    i11 = 0;
                } else {
                    long j11 = j;
                    i11 = 0;
                    while (true) {
                        if (i11 < i13) {
                            long j12 = j11 + 1;
                            if (l0.f(bArr, j11) >= 0) {
                                i11++;
                                j11 = j12;
                            }
                        } else {
                            i11 = i13;
                        }
                    }
                }
                int i14 = i13 - i11;
                long j13 = j + i11;
                while (true) {
                    byte b2 = 0;
                    while (true) {
                        if (i14 > 0) {
                            long j14 = j13 + j10;
                            b2 = l0.f(bArr, j13);
                            if (b2 >= 0) {
                                i14--;
                                j13 = j14;
                            } else {
                                j13 = j14;
                            }
                        }
                    }
                    if (i14 == 0) {
                        return 0;
                    }
                    int i15 = i14 - 1;
                    if (b2 < -32) {
                        if (i15 == 0) {
                            return b2;
                        }
                        i14 -= 2;
                        if (b2 >= -62) {
                            long j15 = j13 + j10;
                            if (l0.f(bArr, j13) <= -65) {
                                j13 = j15;
                                j10 = 1;
                            }
                        }
                    } else if (b2 < -16) {
                        if (i15 < 2) {
                            return X(j13, bArr, b2, i15);
                        }
                        i14 -= 3;
                        long j16 = j13 + j10;
                        byte f4 = l0.f(bArr, j13);
                        if (f4 <= -65 && ((b2 != -32 || f4 >= -96) && (b2 != -19 || f4 < -96))) {
                            j13 += 2;
                            if (l0.f(bArr, j16) <= -65) {
                                j10 = 1;
                            }
                        }
                    } else {
                        if (i15 < 3) {
                            return X(j13, bArr, b2, i15);
                        }
                        i14 -= 4;
                        long j17 = j13 + j10;
                        byte f10 = l0.f(bArr, j13);
                        if (f10 <= -65) {
                            if ((((f10 + 112) + (b2 << 28)) >> 30) == 0) {
                                long j18 = j13 + 2;
                                if (l0.f(bArr, j17) <= -65) {
                                    j13 += 3;
                                    if (l0.f(bArr, j18) <= -65) {
                                        j10 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i12 < i10 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i10) {
            return 0;
        }
        while (i12 < i10) {
            int i16 = i12 + 1;
            byte b10 = bArr[i12];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i16 >= i10) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i12 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 < -16) {
                    if (i16 >= i10 - 1) {
                        return o0.a(i16, bArr, i10);
                    }
                    int i17 = i12 + 2;
                    byte b11 = bArr[i16];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i12 += 3;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
                if (i16 >= i10 - 2) {
                    return o0.a(i16, bArr, i10);
                }
                int i18 = i12 + 2;
                byte b12 = bArr[i16];
                if (b12 <= -65) {
                    if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                        int i19 = i12 + 3;
                        if (bArr[i18] <= -65) {
                            i12 += 4;
                            if (bArr[i19] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i12 = i16;
        }
        return 0;
    }
}
