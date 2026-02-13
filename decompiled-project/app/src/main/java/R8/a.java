package R8;

import P.c;
import P8.f;
import P8.m;
import V8.b;
import V8.d;
import V8.e;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f8935b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f8936c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f8937d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f8938e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f8939f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    public static final Charset g = StandardCharsets.ISO_8859_1;

    /* renamed from: a, reason: collision with root package name */
    public Q8.a f8940a;

    public static int b(boolean[] zArr, int i7, int i10) {
        int i11 = 0;
        for (int i12 = i7; i12 < i7 + i10; i12++) {
            i11 <<= 1;
            if (zArr[i12]) {
                i11 |= 1;
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0299, code lost:
    
        throw P8.f.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e a(Q8.a aVar) {
        X8.a aVar2;
        int i7;
        int i10;
        String str;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 1;
        this.f8940a = aVar;
        b bVar = aVar.f8700a;
        boolean z8 = aVar.f8702c;
        int i15 = z8 ? 11 : 14;
        int i16 = aVar.f8704e;
        int i17 = (i16 * 4) + i15;
        int[] iArr = new int[i17];
        int i18 = ((i16 * 16) + (z8 ? 88 : 112)) * i16;
        boolean[] zArr = new boolean[i18];
        if (z8) {
            for (int i19 = 0; i19 < i17; i19++) {
                iArr[i19] = i19;
            }
        } else {
            int i20 = i17 / 2;
            int i21 = ((((i20 - 1) / 15) * 2) + (i17 + 1)) / 2;
            for (int i22 = 0; i22 < i20; i22++) {
                iArr[(i20 - i22) - 1] = (i21 - r20) - 1;
                iArr[i20 + i22] = i21 + (i22 / 15) + i22 + 1;
            }
        }
        int i23 = 0;
        int i24 = 0;
        while (true) {
            if (i23 >= i16) {
                break;
            }
            int i25 = ((i16 - i23) * 4) + (z8 ? 9 : 12);
            int i26 = i23 * 2;
            int i27 = (i17 - 1) - i26;
            int i28 = 0;
            while (i28 < i25) {
                int i29 = i28 * 2;
                int i30 = 0;
                while (i30 < i13) {
                    int i31 = i26 + i30;
                    int i32 = i26 + i28;
                    zArr[i24 + i29 + i30] = bVar.b(iArr[i31], iArr[i32]);
                    int i33 = i27 - i30;
                    zArr[(i25 * 2) + i24 + i29 + i30] = bVar.b(iArr[i32], iArr[i33]);
                    int i34 = i27 - i28;
                    zArr[(i25 * 4) + i24 + i29 + i30] = bVar.b(iArr[i33], iArr[i34]);
                    zArr[(i25 * 6) + i24 + i29 + i30] = bVar.b(iArr[i34], iArr[i31]);
                    i30++;
                    i16 = i16;
                    i13 = 2;
                }
                i28++;
                i14 = 1;
                i16 = i16;
                i13 = 2;
            }
            i24 += i25 * 8;
            i23 += i14;
            i16 = i16;
            i13 = 2;
        }
        Q8.a aVar3 = this.f8940a;
        int i35 = aVar3.f8704e;
        if (i35 <= 2) {
            aVar2 = X8.a.j;
            i7 = 6;
        } else if (i35 <= 8) {
            aVar2 = X8.a.f11007n;
            i7 = 8;
        } else if (i35 <= 22) {
            aVar2 = X8.a.f11004i;
            i7 = 10;
        } else {
            aVar2 = X8.a.f11003h;
            i7 = 12;
        }
        int i36 = i18 / i7;
        int i37 = aVar3.f8703d;
        if (i36 < i37) {
            throw f.a();
        }
        int i38 = i18 % i7;
        int[] iArr2 = new int[i36];
        int i39 = 0;
        while (i39 < i36) {
            iArr2[i39] = b(zArr, i38, i7);
            i39++;
            i38 += i7;
        }
        try {
            R7.b bVar2 = new R7.b(aVar2, 9);
            int i40 = i36 - i37;
            int n6 = bVar2.n(iArr2, i40);
            int i41 = 1 << i7;
            int i42 = i41 - 1;
            int i43 = 0;
            for (int i44 = 0; i44 < i37; i44++) {
                int i45 = iArr2[i44];
                if (i45 == 0 || i45 == i42) {
                    throw f.a();
                }
                if (i45 == 1 || i45 == i41 - 2) {
                    i43++;
                }
            }
            int i46 = (i37 * i7) - i43;
            boolean[] zArr2 = new boolean[i46];
            int i47 = 0;
            for (int i48 = 0; i48 < i37; i48++) {
                int i49 = iArr2[i48];
                if (i49 == 1 || i49 == i41 - 2) {
                    Arrays.fill(zArr2, i47, (i47 + i7) - 1, i49 > 1);
                    i47 = (i7 - 1) + i47;
                } else {
                    int i50 = i7 - 1;
                    while (i50 >= 0) {
                        int i51 = i47 + 1;
                        zArr2[i47] = (i49 & (1 << i50)) != 0;
                        i50--;
                        i47 = i51;
                    }
                }
            }
            int i52 = (i40 * 100) / i36;
            int i53 = 8;
            int i54 = (i46 + 7) / 8;
            byte[] bArr = new byte[i54];
            int i55 = 0;
            while (i55 < i54) {
                int i56 = i55 * 8;
                int i57 = i46 - i56;
                bArr[i55] = i57 >= i53 ? (byte) b(zArr2, i56, i53) : (byte) (b(zArr2, i56, i57) << (8 - i57));
                i55++;
                i53 = 8;
            }
            int i58 = 5;
            StringBuilder sb2 = new StringBuilder((i46 - 5) / 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Charset charset = g;
            int i59 = 1;
            int i60 = 1;
            int i61 = 0;
            loop9: while (i61 < i46) {
                if (i59 != 6) {
                    int i62 = i59 == 4 ? 4 : 5;
                    if (i46 - i61 >= i62) {
                        int b2 = b(zArr2, i61, i62);
                        i61 += i62;
                        int b10 = c.b(i59);
                        if (b10 != 0) {
                            i10 = 1;
                            if (b10 == 1) {
                                str = f8936c[b2];
                            } else if (b10 == 2) {
                                str = f8937d[b2];
                            } else if (b10 == 3) {
                                str = f8939f[b2];
                            } else {
                                if (b10 != 4) {
                                    throw new IllegalStateException("Bad table");
                                }
                                str = f8938e[b2];
                            }
                        } else {
                            i10 = 1;
                            str = f8935b[b2];
                        }
                        if ("FLG(n)".equals(str)) {
                            if (i46 - i61 >= 3) {
                                int b11 = b(zArr2, i61, 3);
                                i61 += 3;
                                try {
                                    sb2.append(byteArrayOutputStream.toString(charset.name()));
                                    byteArrayOutputStream.reset();
                                    if (b11 == 0) {
                                        sb2.append((char) 29);
                                    } else {
                                        if (b11 == 7) {
                                            throw f.a();
                                        }
                                        int i63 = 4;
                                        if (i46 - i61 >= b11 * 4) {
                                            int i64 = 0;
                                            while (true) {
                                                int i65 = b11 - 1;
                                                if (b11 > 0) {
                                                    int b12 = b(zArr2, i61, i63);
                                                    i61 += i63;
                                                    if (b12 < 2 || b12 > 11) {
                                                        break loop9;
                                                    }
                                                    i64 = (i64 * 10) + (b12 - 2);
                                                    b11 = i65;
                                                    i63 = 4;
                                                } else {
                                                    d a9 = d.a(i64);
                                                    if (a9 == null) {
                                                        throw f.a();
                                                    }
                                                    charset = Charset.forName(a9.name());
                                                }
                                            }
                                        }
                                    }
                                    i59 = i60;
                                } catch (UnsupportedEncodingException e2) {
                                    throw new IllegalStateException(e2);
                                }
                            }
                        } else if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt == 'B') {
                                i11 = 6;
                                i12 = 6;
                            } else if (charAt == 'D') {
                                i11 = 6;
                                i12 = 4;
                            } else if (charAt == 'P') {
                                i11 = 6;
                                i12 = 5;
                            } else if (charAt == 'L') {
                                i11 = 6;
                                i12 = 2;
                            } else if (charAt != 'M') {
                                i12 = i10;
                                i11 = 6;
                            } else {
                                i11 = 6;
                                i12 = 3;
                            }
                            if (str.charAt(i11) == 'L') {
                                i59 = i12;
                                i60 = i59;
                            } else {
                                i60 = i59;
                                i59 = i12;
                            }
                        } else {
                            byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
                            byteArrayOutputStream.write(bytes, 0, bytes.length);
                            i59 = i60;
                        }
                    }
                } else if (i46 - i61 >= i58) {
                    int b13 = b(zArr2, i61, i58);
                    int i66 = i61 + 5;
                    if (b13 == 0) {
                        if (i46 - i66 >= 11) {
                            b13 = b(zArr2, i66, 11) + 31;
                            i66 = i61 + 16;
                        }
                    }
                    int i67 = 0;
                    while (true) {
                        if (i67 >= b13) {
                            i61 = i66;
                            break;
                        }
                        if (i46 - i66 < 8) {
                            i61 = i46;
                            break;
                        }
                        byteArrayOutputStream.write((byte) b(zArr2, i66, 8));
                        i66 += 8;
                        i67++;
                    }
                    i59 = i60;
                }
                i58 = 5;
            }
            try {
                sb2.append(byteArrayOutputStream.toString(charset.name()));
                e eVar = new e(bArr, sb2.toString(), String.format("%d%%", Integer.valueOf(i52)));
                eVar.f10210e = Integer.valueOf(n6);
                return eVar;
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (X8.c e11) {
            f fVar = f.f8216c;
            if (m.f8228a) {
                throw new Exception(e11);
            }
            throw f.f8216c;
        }
    }
}
