package P8;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final V8.g f8192a;

    /* renamed from: b, reason: collision with root package name */
    public V8.b f8193b;

    public b(V8.g gVar) {
        this.f8192a = gVar;
    }

    public final V8.b a() {
        int[] iArr;
        b bVar = this;
        if (bVar.f8193b == null) {
            V8.g gVar = bVar.f8192a;
            V8.b bVar2 = gVar.f10221d;
            if (bVar2 == null) {
                h hVar = gVar.f10218a;
                int i7 = hVar.f8219b;
                int i10 = hVar.f8220c;
                if (i7 < 40 || i10 < 40) {
                    V8.b bVar3 = new V8.b(i7, i10);
                    if (gVar.f10219b.length < i7) {
                        gVar.f10219b = new byte[i7];
                    }
                    int i11 = 0;
                    while (true) {
                        iArr = gVar.f10220c;
                        if (i11 >= 32) {
                            break;
                        }
                        iArr[i11] = 0;
                        i11++;
                    }
                    for (int i12 = 1; i12 < 5; i12++) {
                        byte[] h10 = hVar.h((i10 * i12) / 5, gVar.f10219b);
                        int i13 = (i7 * 4) / 5;
                        for (int i14 = i7 / 5; i14 < i13; i14++) {
                            int i15 = (h10[i14] & 255) >> 3;
                            iArr[i15] = iArr[i15] + 1;
                        }
                    }
                    int a9 = V8.g.a(iArr);
                    byte[] g = hVar.g();
                    for (int i16 = 0; i16 < i10; i16++) {
                        int i17 = i16 * i7;
                        for (int i18 = 0; i18 < i7; i18++) {
                            if ((g[i17 + i18] & 255) < a9) {
                                bVar3.h(i18, i16);
                            }
                        }
                    }
                    gVar.f10221d = bVar3;
                } else {
                    byte[] g2 = hVar.g();
                    int i19 = i7 >> 3;
                    if ((i7 & 7) != 0) {
                        i19++;
                    }
                    int i20 = i10 >> 3;
                    if ((i10 & 7) != 0) {
                        i20++;
                    }
                    int i21 = i10 - 8;
                    int i22 = i7 - 8;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i20, i19);
                    int i23 = 0;
                    while (true) {
                        int i24 = 8;
                        if (i23 >= i20) {
                            break;
                        }
                        int i25 = i23 << 3;
                        if (i25 > i21) {
                            i25 = i21;
                        }
                        int i26 = 0;
                        while (i26 < i19) {
                            int i27 = i26 << 3;
                            if (i27 > i22) {
                                i27 = i22;
                            }
                            int i28 = (i25 * i7) + i27;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 255;
                            while (i29 < i24) {
                                int i33 = i25;
                                int i34 = i31;
                                int i35 = i32;
                                int i36 = 0;
                                while (i36 < i24) {
                                    V8.g gVar2 = gVar;
                                    int i37 = g2[i28 + i36] & 255;
                                    i30 += i37;
                                    if (i37 < i35) {
                                        i35 = i37;
                                    }
                                    if (i37 > i34) {
                                        i34 = i37;
                                    }
                                    i36++;
                                    gVar = gVar2;
                                    i24 = 8;
                                }
                                V8.g gVar3 = gVar;
                                if (i34 - i35 <= 24) {
                                    i29++;
                                    i28 += i7;
                                    i24 = 8;
                                    i32 = i35;
                                    i31 = i34;
                                    i25 = i33;
                                    gVar = gVar3;
                                }
                                while (true) {
                                    i29++;
                                    i28 += i7;
                                    if (i29 < 8) {
                                        int i38 = 0;
                                        for (int i39 = 8; i38 < i39; i39 = 8) {
                                            i30 += g2[i28 + i38] & 255;
                                            i38++;
                                        }
                                    }
                                }
                                i29++;
                                i28 += i7;
                                i24 = 8;
                                i32 = i35;
                                i31 = i34;
                                i25 = i33;
                                gVar = gVar3;
                            }
                            V8.g gVar4 = gVar;
                            int i40 = i25;
                            int i41 = i30 >> 6;
                            int i42 = i32;
                            if (i31 - i42 <= 24) {
                                i41 = i42 / 2;
                                if (i23 > 0 && i26 > 0) {
                                    int[] iArr3 = iArr2[i23 - 1];
                                    int i43 = i26 - 1;
                                    int i44 = (((iArr2[i23][i43] * 2) + iArr3[i26]) + iArr3[i43]) / 4;
                                    if (i42 < i44) {
                                        i41 = i44;
                                    }
                                }
                            }
                            iArr2[i23][i26] = i41;
                            i26++;
                            i24 = 8;
                            i25 = i40;
                            gVar = gVar4;
                        }
                        i23++;
                    }
                    V8.g gVar5 = gVar;
                    V8.b bVar4 = new V8.b(i7, i10);
                    int i45 = 0;
                    while (i45 < i20) {
                        int i46 = i45 << 3;
                        if (i46 > i21) {
                            i46 = i21;
                        }
                        int min = i45 < 2 ? 2 : Math.min(i45, i20 - 3);
                        int i47 = 0;
                        while (i47 < i19) {
                            int i48 = i47 << 3;
                            if (i48 > i22) {
                                i48 = i22;
                            }
                            int min2 = i47 < 2 ? 2 : Math.min(i47, i19 - 3);
                            int i49 = -2;
                            int i50 = 0;
                            for (int i51 = 2; i49 <= i51; i51 = 2) {
                                int[] iArr4 = iArr2[min + i49];
                                i50 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i50;
                                i49++;
                            }
                            int i52 = i50 / 25;
                            int i53 = (i46 * i7) + i48;
                            int i54 = min;
                            int i55 = 0;
                            while (true) {
                                if (i55 < 8) {
                                    int i56 = i19;
                                    int i57 = 0;
                                    for (int i58 = 8; i57 < i58; i58 = 8) {
                                        byte[] bArr = g2;
                                        if ((g2[i53 + i57] & 255) <= i52) {
                                            bVar4.h(i48 + i57, i46 + i55);
                                        }
                                        i57++;
                                        g2 = bArr;
                                    }
                                    i55++;
                                    i53 += i7;
                                    i19 = i56;
                                }
                            }
                            i47++;
                            min = i54;
                        }
                        i45++;
                    }
                    gVar = gVar5;
                    gVar.f10221d = bVar4;
                }
                bVar2 = gVar.f10221d;
                bVar = this;
            }
            bVar.f8193b = bVar2;
        }
        return bVar.f8193b;
    }

    public final V8.a b(V8.a aVar, int i7) {
        int[] iArr;
        V8.g gVar = this.f8192a;
        h hVar = gVar.f10218a;
        int i10 = hVar.f8219b;
        if (aVar.f10193b < i10) {
            aVar = new V8.a(i10);
        } else {
            int length = aVar.f10192a.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVar.f10192a[i11] = 0;
            }
        }
        if (gVar.f10219b.length < i10) {
            gVar.f10219b = new byte[i10];
        }
        int i12 = 0;
        while (true) {
            iArr = gVar.f10220c;
            if (i12 >= 32) {
                break;
            }
            iArr[i12] = 0;
            i12++;
        }
        byte[] h10 = hVar.h(i7, gVar.f10219b);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = (h10[i13] & 255) >> 3;
            iArr[i14] = iArr[i14] + 1;
        }
        int a9 = V8.g.a(iArr);
        if (i10 < 3) {
            for (int i15 = 0; i15 < i10; i15++) {
                if ((h10[i15] & 255) < a9) {
                    aVar.j(i15);
                }
            }
        } else {
            int i16 = 1;
            int i17 = h10[0] & 255;
            int i18 = h10[1] & 255;
            while (i16 < i10 - 1) {
                int i19 = i16 + 1;
                int i20 = h10[i19] & 255;
                if ((((i18 * 4) - i17) - i20) / 2 < a9) {
                    aVar.j(i16);
                }
                i17 = i18;
                i16 = i19;
                i18 = i20;
            }
        }
        return aVar;
    }

    public final String toString() {
        try {
            return a().toString();
        } catch (j unused) {
            return "";
        }
    }
}
