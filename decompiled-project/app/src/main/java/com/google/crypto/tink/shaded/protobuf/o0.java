package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P f15808a;

    static {
        f15808a = (l0.f15801f && l0.f15800e && !AbstractC1009c.a()) ? new m0(1) : new m0(0);
    }

    public static int a(int i7, byte[] bArr, int i10) {
        byte b2 = bArr[i7 - 1];
        int i11 = i10 - i7;
        if (i11 == 0) {
            if (b2 > -12) {
                b2 = -1;
            }
            return b2;
        }
        if (i11 == 1) {
            return c(b2, bArr[i7]);
        }
        if (i11 == 2) {
            return d(b2, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
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
                                throw new n0(i10, length2);
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

    public static int c(int i7, int i10) {
        if (i7 > -12 || i10 > -65) {
            return -1;
        }
        return i7 ^ (i10 << 8);
    }

    public static int d(int i7, int i10, int i11) {
        if (i7 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i7 ^ (i10 << 8)) ^ (i11 << 16);
    }

    public static boolean e(int i7, byte[] bArr, int i10) {
        return f15808a.T(i7, bArr, i10);
    }
}
