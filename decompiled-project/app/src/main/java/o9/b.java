package o9;

import H2.O;
import V8.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import m9.C1649f;
import m9.EnumC1647d;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f22128a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f22129b = StandardCharsets.ISO_8859_1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:13:0x0022->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, EnumC1647d enumC1647d, V8.a aVar, Charset charset) {
        int i7;
        int ordinal = enumC1647d.ordinal();
        int i10 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i10 < length) {
                int charAt = str.charAt(i10) - '0';
                int i11 = i10 + 2;
                if (i11 < length) {
                    aVar.b(((str.charAt(i10 + 1) - '0') * 10) + (charAt * 100) + (str.charAt(i11) - '0'), 10);
                    i10 += 3;
                } else {
                    i10++;
                    if (i10 < length) {
                        aVar.b((charAt * 10) + (str.charAt(i10) - '0'), 7);
                        i10 = i11;
                    } else {
                        aVar.b(charAt, 4);
                    }
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i10 < length2) {
                char charAt2 = str.charAt(i10);
                int[] iArr = f22128a;
                int i12 = charAt2 < '`' ? iArr[charAt2] : -1;
                if (i12 == -1) {
                    throw new Exception();
                }
                int i13 = i10 + 1;
                if (i13 < length2) {
                    char charAt3 = str.charAt(i13);
                    int i14 = charAt3 < '`' ? iArr[charAt3] : -1;
                    if (i14 == -1) {
                        throw new Exception();
                    }
                    aVar.b((i12 * 45) + i14, 11);
                    i10 += 2;
                } else {
                    aVar.b(i12, 6);
                    i10 = i13;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i10 < length3) {
                aVar.b(bytes[i10], 8);
                i10++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new Exception("Invalid mode: " + enumC1647d);
        }
        Charset charset2 = i.f10231b;
        if (charset2 == null) {
            throw new Exception("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new Exception("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i10 < length4) {
            int i15 = ((bytes2[i10] & 255) << 8) | (bytes2[i10 + 1] & 255);
            int i16 = 33088;
            if (i15 < 33088 || i15 > 40956) {
                if (i15 < 57408 || i15 > 60351) {
                    i7 = -1;
                    if (i7 != -1) {
                        throw new Exception("Invalid byte sequence");
                    }
                    aVar.b(((i7 >> 8) * 192) + (i7 & 255), 13);
                    i10 += 2;
                } else {
                    i16 = 49472;
                }
            }
            i7 = i15 - i16;
            if (i7 != -1) {
            }
        }
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(i.f10231b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7 += 2) {
            int i10 = bytes[i7] & 255;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i7, C1649f c1649f, int i10) {
        int i11 = c1649f.f20811d;
        A7.a aVar = c1649f.f20810c[P.c.b(i10)];
        int i12 = 0;
        for (O o10 : (O[]) aVar.f532b) {
            i12 += o10.f4603b;
        }
        return i11 - (i12 * aVar.f531a) >= (i7 + 7) / 8;
    }
}
