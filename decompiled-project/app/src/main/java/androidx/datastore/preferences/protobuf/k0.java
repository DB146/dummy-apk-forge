package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends q3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13431a;

    public /* synthetic */ k0(int i7) {
        this.f13431a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // q3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k(int i7, byte[] bArr, int i10) {
        switch (this.f13431a) {
            case 0:
                if ((i7 | i10 | ((bArr.length - i7) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i10)));
                }
                int i11 = i7 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i7 < i11) {
                    byte b2 = bArr[i7];
                    if (b2 < 0) {
                        while (i7 < i11) {
                            int i13 = i7 + 1;
                            byte b10 = bArr[i7];
                            if (b10 >= 0) {
                                int i14 = i12 + 1;
                                cArr[i12] = (char) b10;
                                while (i13 < i11) {
                                    byte b11 = bArr[i13];
                                    if (b11 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b11;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i7 = i13;
                                    }
                                }
                                i12 = i14;
                                i7 = i13;
                            } else if (b10 < -32) {
                                if (i13 >= i11) {
                                    throw C0821y.a();
                                }
                                i7 += 2;
                                byte b12 = bArr[i13];
                                int i15 = i12 + 1;
                                if (b10 < -62 || c2.i.u(b12)) {
                                    throw C0821y.a();
                                }
                                cArr[i12] = (char) ((b12 & 63) | ((b10 & 31) << 6));
                                i12 = i15;
                            } else {
                                if (b10 >= -16) {
                                    if (i13 >= i11 - 2) {
                                        throw C0821y.a();
                                    }
                                    byte b13 = bArr[i13];
                                    int i16 = i7 + 3;
                                    byte b14 = bArr[i7 + 2];
                                    i7 += 4;
                                    byte b15 = bArr[i16];
                                    int i17 = i12 + 1;
                                    if (!c2.i.u(b13)) {
                                        if ((((b13 + 112) + (b10 << 28)) >> 30) == 0 && !c2.i.u(b14) && !c2.i.u(b15)) {
                                            int i18 = ((b13 & 63) << 12) | ((b10 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                            cArr[i12] = (char) ((i18 >>> 10) + 55232);
                                            cArr[i17] = (char) ((i18 & 1023) + 56320);
                                            i12 += 2;
                                        }
                                    }
                                    throw C0821y.a();
                                }
                                if (i13 >= i11 - 1) {
                                    throw C0821y.a();
                                }
                                int i19 = i7 + 2;
                                byte b16 = bArr[i13];
                                i7 += 3;
                                byte b17 = bArr[i19];
                                int i20 = i12 + 1;
                                if (c2.i.u(b16) || ((b10 == -32 && b16 < -96) || ((b10 == -19 && b16 >= -96) || c2.i.u(b17)))) {
                                    throw C0821y.a();
                                }
                                cArr[i12] = (char) (((b16 & 63) << 6) | ((b10 & 15) << 12) | (b17 & 63));
                                i12 = i20;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i7++;
                    cArr[i12] = (char) b2;
                    i12++;
                }
                while (i7 < i11) {
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = AbstractC0819w.f13467a;
                String str = new String(bArr, i7, i10, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i10 + i7))) {
                    throw C0821y.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // q3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(String str, byte[] bArr, int i7, int i10) {
        int i11;
        int i12;
        char charAt;
        long j;
        String str2;
        String str3;
        int i13;
        char charAt2;
        switch (this.f13431a) {
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
                                    throw new l0(i15, length);
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
                            throw new l0(i15 - 1, length);
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
                        j0.j(bArr, j10, (byte) charAt2);
                        i21++;
                        j10 = 1 + j10;
                    }
                }
                if (i21 != length2) {
                    while (i21 < length2) {
                        char charAt5 = str.charAt(i21);
                        if (charAt5 < 128 && j10 < j11) {
                            j0.j(bArr, j10, (byte) charAt5);
                            str3 = str5;
                            j10 += j;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j10 > j11 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j10 > j11 - 3) {
                                if (j10 > j11 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i13)))) {
                                        throw new l0(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j10);
                                }
                                int i22 = i21 + 1;
                                if (i22 != length2) {
                                    char charAt6 = str.charAt(i22);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        j0.j(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                        j0.j(bArr, j10 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j12 = 3 + j10;
                                        j0.j(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j10 += 4;
                                        j0.j(bArr, j12, (byte) ((codePoint2 & 63) | 128));
                                        i21 = i22;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                                throw new l0(i21 - 1, length2);
                            }
                            j0.j(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                            long j13 = j10 + 2;
                            j0.j(bArr, j10 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j10 += 3;
                            j0.j(bArr, j13, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j14 = j10 + j;
                            j0.j(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                            j10 += 2;
                            j0.j(bArr, j14, (byte) ((charAt5 & '?') | 128));
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
}
