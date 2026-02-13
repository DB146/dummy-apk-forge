package m9;

import V8.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;

/* renamed from: m9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1644a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f20788a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(V8.c cVar, StringBuilder sb2, int i7, boolean z8) {
        while (i7 > 1) {
            if (cVar.a() < 11) {
                throw P8.f.a();
            }
            int b2 = cVar.b(11);
            sb2.append(f(b2 / 45));
            sb2.append(f(b2 % 45));
            i7 -= 2;
        }
        if (i7 == 1) {
            if (cVar.a() < 6) {
                throw P8.f.a();
            }
            sb2.append(f(cVar.b(6)));
        }
        if (z8) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(V8.c cVar, StringBuilder sb2, int i7, V8.d dVar, ArrayList arrayList, EnumMap enumMap) {
        Charset forName;
        char c10;
        byte b2;
        char c11 = '@';
        if (i7 * 8 > cVar.a()) {
            throw P8.f.a();
        }
        byte[] bArr = new byte[i7];
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) cVar.b(8);
        }
        if (dVar == null) {
            Charset charset = i.f10230a;
            if (enumMap != null) {
                P8.d dVar2 = P8.d.f8199e;
                if (enumMap.containsKey(dVar2)) {
                    forName = Charset.forName(enumMap.get(dVar2).toString());
                }
            }
            if (i7 <= 2 || !(((b2 = bArr[0]) == -2 && bArr[1] == -1) || (b2 == -1 && bArr[1] == -2))) {
                Charset charset2 = i.f10231b;
                boolean z8 = charset2 != null;
                boolean z10 = i7 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                boolean z11 = true;
                boolean z12 = true;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i12 < i7 && (z11 || z8 || z12)) {
                    byte b10 = bArr[i12];
                    int i23 = b10 & 255;
                    if (z12) {
                        if (i13 > 0) {
                            if ((b10 & 128) != 0) {
                                i13--;
                            }
                            z12 = false;
                            if (z11) {
                                if (i23 > 127 && i23 < 160) {
                                    z11 = false;
                                } else if (i23 > 159 && (i23 < 192 || i23 == 215 || i23 == 247)) {
                                    i20++;
                                }
                            }
                            if (!z8) {
                                c10 = 65535;
                            } else if (i14 <= 0) {
                                c10 = 65535;
                                if (i23 == 128 || i23 == 160 || i23 > 239) {
                                    i19 = i19;
                                    i18 = i18;
                                    z8 = false;
                                } else if (i23 <= 160 || i23 >= 224) {
                                    int i24 = i19;
                                    if (i23 > 127) {
                                        i14++;
                                        int i25 = i21 + 1;
                                        int i26 = i18;
                                        i19 = i24;
                                        if (i25 > i26) {
                                            i18 = i25;
                                            i21 = i18;
                                        } else {
                                            i21 = i25;
                                            i18 = i26;
                                        }
                                    } else {
                                        i19 = i24;
                                        i21 = 0;
                                    }
                                    i22 = 0;
                                } else {
                                    i19++;
                                    int i27 = i22 + 1;
                                    if (i27 > i10) {
                                        i10 = i27;
                                        i22 = i10;
                                    } else {
                                        i22 = i27;
                                    }
                                    i21 = 0;
                                }
                            } else if (i23 < c11 || i23 == 127 || i23 > 252) {
                                c10 = 65535;
                                z8 = false;
                            } else {
                                c10 = 65535;
                                i14--;
                            }
                            i12++;
                            c11 = '@';
                        } else if ((b10 & 128) != 0) {
                            if ((b10 & 64) != 0) {
                                int i28 = i13 + 1;
                                if ((b10 & 32) == 0) {
                                    i15++;
                                } else {
                                    i28 = i13 + 2;
                                    if ((b10 & 16) == 0) {
                                        i16++;
                                    } else {
                                        i13 += 3;
                                        if ((b10 & 8) == 0) {
                                            i17++;
                                            if (z11) {
                                            }
                                            if (!z8) {
                                            }
                                            i12++;
                                            c11 = '@';
                                        }
                                        z12 = false;
                                        if (z11) {
                                        }
                                        if (!z8) {
                                        }
                                        i12++;
                                        c11 = '@';
                                    }
                                }
                                i13 = i28;
                            }
                            z12 = false;
                            if (z11) {
                            }
                            if (!z8) {
                            }
                            i12++;
                            c11 = '@';
                        }
                    }
                    if (z11) {
                    }
                    if (!z8) {
                    }
                    i12++;
                    c11 = '@';
                }
                int i29 = i18;
                int i30 = i19;
                if (z12 && i13 > 0) {
                    z12 = false;
                }
                if (z8 && i14 > 0) {
                    z8 = false;
                }
                if (!z12 || (!z10 && i15 + i16 + i17 <= 0)) {
                    if (!z8 || (!i.f10233d && i10 < 3 && i29 < 3)) {
                        if (z11 && z8) {
                            if ((i10 != 2 || i30 != 2) && i20 * 10 < i7) {
                                forName = StandardCharsets.ISO_8859_1;
                            }
                        } else if (z11) {
                            forName = StandardCharsets.ISO_8859_1;
                        } else if (!z8) {
                            forName = z12 ? StandardCharsets.UTF_8 : i.f10230a;
                        }
                    }
                    forName = charset2;
                } else {
                    forName = StandardCharsets.UTF_8;
                }
            } else {
                forName = StandardCharsets.UTF_16;
            }
        } else {
            forName = Charset.forName(dVar.name());
        }
        sb2.append(new String(bArr, forName));
        arrayList.add(bArr);
    }

    public static void c(V8.c cVar, StringBuilder sb2, int i7) {
        if (i.f10232c == null) {
            throw P8.f.a();
        }
        if (i7 * 13 > cVar.a()) {
            throw P8.f.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int b2 = cVar.b(13);
            int i11 = (b2 % 96) | ((b2 / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) ((i12 >> 8) & 255);
            bArr[i10 + 1] = (byte) (i12 & 255);
            i10 += 2;
            i7--;
        }
        sb2.append(new String(bArr, i.f10232c));
    }

    public static void d(V8.c cVar, StringBuilder sb2, int i7) {
        if (i.f10231b == null) {
            throw P8.f.a();
        }
        if (i7 * 13 > cVar.a()) {
            throw P8.f.a();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int b2 = cVar.b(13);
            int i11 = (b2 % 192) | ((b2 / 192) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        sb2.append(new String(bArr, i.f10231b));
    }

    public static void e(V8.c cVar, StringBuilder sb2, int i7) {
        while (i7 >= 3) {
            if (cVar.a() < 10) {
                throw P8.f.a();
            }
            int b2 = cVar.b(10);
            if (b2 >= 1000) {
                throw P8.f.a();
            }
            sb2.append(f(b2 / 100));
            sb2.append(f((b2 / 10) % 10));
            sb2.append(f(b2 % 10));
            i7 -= 3;
        }
        if (i7 == 2) {
            if (cVar.a() < 7) {
                throw P8.f.a();
            }
            int b10 = cVar.b(7);
            if (b10 >= 100) {
                throw P8.f.a();
            }
            sb2.append(f(b10 / 10));
            sb2.append(f(b10 % 10));
            return;
        }
        if (i7 == 1) {
            if (cVar.a() < 4) {
                throw P8.f.a();
            }
            int b11 = cVar.b(4);
            if (b11 >= 10) {
                throw P8.f.a();
            }
            sb2.append(f(b11));
        }
    }

    public static char f(int i7) {
        char[] cArr = f20788a;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw P8.f.a();
    }
}
