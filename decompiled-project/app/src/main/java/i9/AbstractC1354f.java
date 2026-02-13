package i9;

import H2.r0;
import P8.p;
import Q7.h;
import h9.AbstractC1263a;
import ha.g;
import j9.C1388a;
import java.util.Arrays;

/* renamed from: i9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1354f {

    /* renamed from: a, reason: collision with root package name */
    public static final R7.b f18477a = new R7.b(23);

    public static C1350b a(C1352d c1352d) {
        int i7;
        int[] iArr;
        int i10;
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        if (c1352d == null) {
            return null;
        }
        r0 k = c1352d.k();
        r0[] r0VarArr = (r0[]) c1352d.f16841c;
        boolean z8 = c1352d.f18475d;
        C1350b c1350b = (C1350b) c1352d.f16840b;
        if (k == null) {
            iArr = null;
        } else {
            p pVar5 = z8 ? c1350b.f18465b : c1350b.f18467d;
            p pVar6 = z8 ? c1350b.f18466c : c1350b.f18468e;
            int i11 = c1352d.i((int) pVar5.f8250b);
            int i12 = c1352d.i((int) pVar6.f8250b);
            int i13 = 0;
            int i14 = 1;
            int i15 = -1;
            while (true) {
                i7 = k.f4797f;
                if (i11 >= i12) {
                    break;
                }
                r0 r0Var = r0VarArr[i11];
                if (r0Var != null) {
                    r0Var.d();
                    int i16 = r0Var.f4797f;
                    int i17 = i16 - i15;
                    if (i17 == 0) {
                        i13++;
                    } else if (i17 == 1) {
                        i14 = Math.max(i14, i13);
                        i15 = r0Var.f4797f;
                        i13 = 1;
                    } else if (i16 >= i7) {
                        r0VarArr[i11] = null;
                    } else {
                        i13 = 1;
                        i15 = i16;
                    }
                }
                i11++;
            }
            iArr = new int[i7];
            for (r0 r0Var2 : r0VarArr) {
                if (r0Var2 != null && (i10 = r0Var2.f4797f) < i7) {
                    iArr[i10] = iArr[i10] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        int i18 = -1;
        for (int i19 : iArr) {
            i18 = Math.max(i18, i19);
        }
        int i20 = 0;
        for (int i21 : iArr) {
            i20 += i18 - i21;
            if (i21 > 0) {
                break;
            }
        }
        for (int i22 = 0; i20 > 0 && r0VarArr[i22] == null; i22++) {
            i20--;
        }
        int i23 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i24 = iArr[length];
            i23 += i18 - i24;
            if (i24 > 0) {
                break;
            }
        }
        for (int length2 = r0VarArr.length - 1; i23 > 0 && r0VarArr[length2] == null; length2--) {
            i23--;
        }
        p pVar7 = c1350b.f18465b;
        p pVar8 = c1350b.f18467d;
        if (i20 > 0) {
            p pVar9 = z8 ? pVar7 : pVar8;
            p pVar10 = new p(pVar9.f8249a, ((int) pVar9.f8250b) - i20 >= 0 ? r6 : 0);
            if (z8) {
                pVar2 = pVar8;
                pVar = pVar10;
            } else {
                pVar = pVar7;
                pVar2 = pVar10;
            }
        } else {
            pVar = pVar7;
            pVar2 = pVar8;
        }
        p pVar11 = c1350b.f18466c;
        p pVar12 = c1350b.f18468e;
        if (i23 > 0) {
            p pVar13 = z8 ? pVar11 : pVar12;
            int i25 = ((int) pVar13.f8250b) + i23;
            int i26 = c1350b.f18464a.f10195b;
            if (i25 >= i26) {
                i25 = i26 - 1;
            }
            p pVar14 = new p(pVar13.f8249a, i25);
            if (z8) {
                pVar4 = pVar12;
                pVar3 = pVar14;
            } else {
                pVar3 = pVar11;
                pVar4 = pVar14;
            }
        } else {
            pVar3 = pVar11;
            pVar4 = pVar12;
        }
        return new C1350b(c1350b.f18464a, pVar, pVar3, pVar2, pVar4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04c4, code lost:
    
        if (r4 == 924) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04c9, code lost:
    
        if (r11 >= r24[0]) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04cf, code lost:
    
        if (r24[r11] >= 900) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04d5, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04d8, code lost:
    
        if (r8 >= 6) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04da, code lost:
    
        ((java.lang.StringBuilder) r3.f8695b).append((char) (((byte) (r14 >> ((5 - r8) * 8))) & 255));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04ef, code lost:
    
        r8 = r11;
        r10 = 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x0375. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x02f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x02f6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0461  */
    /* JADX WARN: Type inference failed for: r4v50, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r7v30, types: [h9.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static V8.e b(int[] iArr, int i7, int[] iArr2) {
        int[] iArr3;
        C1388a c1388a;
        int h10;
        int i10;
        int[] iArr4;
        int i11;
        int i12;
        g gVar;
        int i13;
        int[] iArr5;
        C1388a c1388a2;
        g gVar2;
        g gVar3;
        g gVar4;
        StringBuilder sb2;
        char c10;
        boolean z8;
        int c11;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        if (iArr.length == 0) {
            throw P8.f.a();
        }
        int i21 = 1 << (i7 + 1);
        if (iArr2.length > (i21 / 2) + 3 || i21 < 0 || i21 > 512) {
            throw P8.c.a();
        }
        R7.b bVar = f18477a;
        bVar.getClass();
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr3 = iArr;
        } else {
            int i22 = 1;
            while (i22 < length && iArr[i22] == 0) {
                i22++;
            }
            if (i22 == length) {
                iArr3 = new int[]{0};
            } else {
                int i23 = length - i22;
                int[] iArr6 = new int[i23];
                System.arraycopy(iArr, i22, iArr6, 0, i23);
                iArr3 = iArr6;
            }
        }
        int[] iArr7 = new int[i21];
        boolean z11 = false;
        int i24 = i21;
        while (true) {
            c1388a = (C1388a) bVar.f8929b;
            if (i24 <= 0) {
                break;
            }
            int i25 = c1388a.f18671a[i24];
            if (i25 == 0) {
                i19 = iArr3[iArr3.length - 1];
            } else {
                if (i25 == 1) {
                    int length2 = iArr3.length;
                    i18 = i20;
                    for (int i26 = i18; i26 < length2; i26++) {
                        i18 = c1388a.a(i18, iArr3[i26]);
                    }
                } else {
                    i18 = iArr3[i20];
                    int length3 = iArr3.length;
                    for (int i27 = 1; i27 < length3; i27++) {
                        i18 = c1388a.a(c1388a.c(i25, i18), iArr3[i27]);
                    }
                }
                i19 = i18;
            }
            iArr7[i21 - i24] = i19;
            if (i19 != 0) {
                z11 = true;
            }
            i24--;
            i20 = 0;
        }
        if (z11) {
            g gVar5 = c1388a.f18674d;
            for (int i28 : iArr2) {
                gVar5 = gVar5.m(new g(c1388a, new int[]{(929 - c1388a.f18671a[(iArr.length - 1) - i28]) % 929, 1}));
            }
            g gVar6 = new g(c1388a, iArr7);
            if (i21 < 0) {
                throw new IllegalArgumentException();
            }
            int[] iArr8 = new int[i21 + 1];
            iArr8[0] = 1;
            g gVar7 = new g(c1388a, iArr8);
            if (gVar7.h() >= gVar6.h()) {
                gVar7 = gVar6;
                gVar6 = gVar7;
            }
            g gVar8 = c1388a.f18673c;
            g gVar9 = c1388a.f18674d;
            g gVar10 = gVar8;
            while (true) {
                g gVar11 = gVar7;
                gVar7 = gVar6;
                gVar6 = gVar11;
                if (gVar6.h() < i21 / 2) {
                    int g = gVar9.g(0);
                    if (g == 0) {
                        throw P8.c.a();
                    }
                    int b2 = c1388a.b(g);
                    g[] gVarArr = {gVar9.l(b2), gVar6.l(b2)};
                    g gVar12 = gVarArr[0];
                    g gVar13 = gVarArr[1];
                    h10 = gVar12.h();
                    int[] iArr9 = new int[h10];
                    int i29 = 0;
                    for (int i30 = 1; i30 < 929 && i29 < h10; i30++) {
                        if (gVar12.f(i30) == 0) {
                            iArr9[i29] = c1388a.b(i30);
                            i29++;
                        }
                    }
                    if (i29 != h10) {
                        throw P8.c.a();
                    }
                    int h11 = gVar12.h();
                    if (h11 < 1) {
                        iArr4 = new int[0];
                        i10 = 1;
                    } else {
                        int[] iArr10 = new int[h11];
                        for (int i31 = 1; i31 <= h11; i31++) {
                            iArr10[h11 - i31] = c1388a.c(i31, gVar12.g(i31));
                        }
                        if (h11 == 0) {
                            throw new IllegalArgumentException();
                        }
                        if (h11 > 1 && iArr10[0] == 0) {
                            int i32 = 1;
                            while (i32 < h11 && iArr10[i32] == 0) {
                                i32++;
                            }
                            if (i32 == h11) {
                                iArr5 = new int[]{0};
                            } else {
                                int i33 = h11 - i32;
                                iArr5 = new int[i33];
                                System.arraycopy(iArr10, i32, iArr5, 0, i33);
                            }
                            iArr10 = iArr5;
                        }
                        int[] iArr11 = new int[h10];
                        int i34 = 0;
                        while (i34 < h10) {
                            int b10 = c1388a.b(iArr9[i34]);
                            int f4 = (929 - gVar13.f(b10)) % 929;
                            if (b10 == 0) {
                                i11 = 1;
                                i13 = iArr10[iArr10.length - 1];
                                gVar = gVar13;
                            } else {
                                i11 = 1;
                                if (b10 == 1) {
                                    i12 = 0;
                                    for (int i35 : iArr10) {
                                        i12 = c1388a.a(i12, i35);
                                    }
                                } else {
                                    i12 = iArr10[0];
                                    int length4 = iArr10.length;
                                    int i36 = 1;
                                    while (i36 < length4) {
                                        i12 = c1388a.a(c1388a.c(b10, i12), iArr10[i36]);
                                        i36++;
                                        gVar13 = gVar13;
                                    }
                                }
                                gVar = gVar13;
                                i13 = i12;
                            }
                            iArr11[i34] = c1388a.c(f4, c1388a.b(i13));
                            i34 += i11;
                            gVar13 = gVar;
                        }
                        i10 = 1;
                        iArr4 = iArr11;
                    }
                    int i37 = 0;
                    while (i37 < h10) {
                        int length5 = iArr.length - i10;
                        int i38 = iArr9[i37];
                        if (i38 == 0) {
                            throw new IllegalArgumentException();
                        }
                        int i39 = length5 - c1388a.f18672b[i38];
                        if (i39 < 0) {
                            throw P8.c.a();
                        }
                        iArr[i39] = ((iArr[i39] + 929) - iArr4[i37]) % 929;
                        i37++;
                        i10 = 1;
                    }
                } else {
                    if (gVar6.k()) {
                        throw P8.c.a();
                    }
                    int b11 = c1388a.b(gVar6.g(gVar6.h()));
                    g gVar14 = gVar8;
                    while (gVar7.h() >= gVar6.h() && !gVar7.k()) {
                        int h12 = gVar7.h() - gVar6.h();
                        int c12 = c1388a.c(gVar7.g(gVar7.h()), b11);
                        if (h12 < 0) {
                            throw new IllegalArgumentException();
                        }
                        if (c12 == 0) {
                            gVar2 = gVar8;
                        } else {
                            int[] iArr12 = new int[h12 + 1];
                            iArr12[0] = c12;
                            gVar2 = new g(c1388a, iArr12);
                        }
                        gVar14 = gVar14.b(gVar2);
                        if (h12 < 0) {
                            throw new IllegalArgumentException();
                        }
                        C1388a c1388a3 = (C1388a) gVar6.f17915b;
                        if (c12 == 0) {
                            gVar4 = c1388a3.f18673c;
                            gVar3 = gVar8;
                        } else {
                            int[] iArr13 = (int[]) gVar6.f17916c;
                            int length6 = iArr13.length;
                            int[] iArr14 = new int[h12 + length6];
                            gVar3 = gVar8;
                            int i40 = 0;
                            while (i40 < length6) {
                                iArr14[i40] = c1388a3.c(iArr13[i40], c12);
                                i40++;
                                length6 = length6;
                            }
                            gVar4 = new g(c1388a3, iArr14);
                        }
                        gVar7 = gVar7.r(gVar4);
                        gVar8 = gVar3;
                    }
                    g gVar15 = gVar8;
                    g r10 = gVar14.m(gVar9).r(gVar10);
                    int[] iArr15 = (int[]) r10.f17916c;
                    int length7 = iArr15.length;
                    int[] iArr16 = new int[length7];
                    int i41 = 0;
                    while (true) {
                        c1388a2 = (C1388a) r10.f17915b;
                        if (i41 < length7) {
                            int i42 = iArr15[i41];
                            c1388a2.getClass();
                            iArr16[i41] = (929 - i42) % 929;
                            i41++;
                        }
                    }
                    gVar10 = gVar9;
                    gVar8 = gVar15;
                    gVar9 = new g(c1388a2, iArr16);
                }
            }
        } else {
            h10 = 0;
        }
        if (iArr.length < 4) {
            throw P8.f.a();
        }
        int i43 = iArr[0];
        if (i43 > iArr.length) {
            throw P8.f.a();
        }
        if (i43 == 0) {
            if (i21 >= iArr.length) {
                throw P8.f.a();
            }
            iArr[0] = iArr.length - i21;
        }
        String valueOf = String.valueOf(i7);
        char[] cArr = AbstractC1351c.f18472a;
        h hVar = new h(iArr.length * 2);
        int d10 = AbstractC1351c.d(iArr, 1, hVar);
        ?? obj = new Object();
        char c13 = 0;
        while (true) {
            int i44 = iArr[c13];
            if (d10 >= i44) {
                if (((StringBuilder) hVar.f8695b).length() == 0 && (((sb2 = (StringBuilder) hVar.f8696c) == null || sb2.length() == 0) && obj.f17896a == null)) {
                    throw P8.f.a();
                }
                V8.e eVar = new V8.e(null, hVar.toString(), valueOf);
                eVar.g = obj;
                eVar.f10210e = Integer.valueOf(h10);
                eVar.f10211f = Integer.valueOf(iArr2.length);
                return eVar;
            }
            int i45 = d10 + 1;
            int i46 = iArr[d10];
            if (i46 != 913) {
                switch (i46) {
                    case 900:
                        c10 = 0;
                        z8 = true;
                        d10 = AbstractC1351c.d(iArr, i45, hVar);
                        break;
                    case 901:
                        boolean z12 = false;
                        char c14 = 0;
                        while (i45 < iArr[c14] && !z12) {
                            while (true) {
                                i14 = iArr[c14];
                                if (i45 < i14 && iArr[i45] == 927) {
                                    hVar.m(iArr[i45 + 1]);
                                    i45 += 2;
                                    c14 = 0;
                                }
                            }
                            if (i45 >= i14 || iArr[i45] >= 900) {
                                c14 = 0;
                                z12 = true;
                            } else {
                                long j = 0;
                                int i47 = 0;
                                while (true) {
                                    i15 = i45 + 1;
                                    j = (j * 900) + iArr[i45];
                                    i47++;
                                    if (i47 < 5 && i15 < iArr[0] && iArr[i15] < 900) {
                                        i45 = i15;
                                    }
                                }
                                int i48 = i15 - i47;
                                char c15 = 0;
                                while (i48 < iArr[0] && !z12) {
                                    int i49 = i48 + 1;
                                    int i50 = iArr[i48];
                                    if (i50 < 900) {
                                        ((StringBuilder) hVar.f8695b).append((char) (((byte) i50) & 255));
                                        i48 = i49;
                                    } else if (i50 == 927) {
                                        i48 += 2;
                                        hVar.m(iArr[i49]);
                                    } else {
                                        z12 = true;
                                    }
                                }
                                i45 = i48;
                                c14 = c15;
                            }
                        }
                        c10 = c14;
                        z8 = true;
                        d10 = i45;
                        break;
                    case 902:
                        c11 = AbstractC1351c.c(iArr, i45, hVar);
                        d10 = c11;
                        c10 = 0;
                        z8 = true;
                        break;
                    default:
                        switch (i46) {
                            case 922:
                            case 923:
                                throw P8.f.a();
                            case 924:
                                break;
                            case 925:
                                d10 += 2;
                                c10 = 0;
                                z8 = true;
                                break;
                            case 926:
                                d10 += 3;
                                c10 = 0;
                                z8 = true;
                                break;
                            case 927:
                                d10 += 2;
                                hVar.m(iArr[i45]);
                                c10 = 0;
                                z8 = true;
                                break;
                            case 928:
                                if (d10 + 3 > i44) {
                                    throw P8.f.a();
                                }
                                int[] iArr17 = new int[2];
                                int i51 = 0;
                                while (i51 < 2) {
                                    iArr17[i51] = iArr[i45];
                                    i51++;
                                    i45++;
                                }
                                String a9 = AbstractC1351c.a(iArr17, 2);
                                if (!a9.isEmpty()) {
                                    try {
                                        Integer.parseInt(a9);
                                    } catch (NumberFormatException unused) {
                                        throw P8.f.a();
                                    }
                                }
                                StringBuilder sb3 = new StringBuilder();
                                while (i45 < iArr[0] && i45 < iArr.length && (i17 = iArr[i45]) != 922 && i17 != 923) {
                                    sb3.append(String.format("%03d", Integer.valueOf(i17)));
                                    i45++;
                                }
                                if (sb3.length() == 0) {
                                    throw P8.f.a();
                                }
                                obj.f17896a = sb3.toString();
                                if (iArr[i45] == 923) {
                                    z10 = true;
                                    i16 = i45 + 1;
                                } else {
                                    z10 = true;
                                    i16 = -1;
                                }
                                while (true) {
                                    char c16 = 0;
                                    ?? r42 = z10;
                                    while (i45 < iArr[c16]) {
                                        int i52 = iArr[i45];
                                        if (i52 == 922) {
                                            i45 += r42;
                                            obj.f17897b = r42;
                                        } else {
                                            if (i52 != 923) {
                                                throw P8.f.a();
                                            }
                                            switch (iArr[i45 + 1]) {
                                                case 0:
                                                    h hVar2 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.d(iArr, i45 + 2, hVar2);
                                                    hVar2.toString();
                                                    break;
                                                case 1:
                                                    h hVar3 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.c(iArr, i45 + 2, hVar3);
                                                    try {
                                                        Integer.parseInt(hVar3.toString());
                                                        break;
                                                    } catch (NumberFormatException unused2) {
                                                        throw P8.f.a();
                                                    }
                                                case 2:
                                                    h hVar4 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.c(iArr, i45 + 2, hVar4);
                                                    try {
                                                        Long.parseLong(hVar4.toString());
                                                        break;
                                                    } catch (NumberFormatException unused3) {
                                                        throw P8.f.a();
                                                    }
                                                case 3:
                                                    c16 = 0;
                                                    h hVar5 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.d(iArr, i45 + 2, hVar5);
                                                    hVar5.toString();
                                                    r42 = 1;
                                                case 4:
                                                    c16 = 0;
                                                    h hVar6 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.d(iArr, i45 + 2, hVar6);
                                                    hVar6.toString();
                                                    r42 = 1;
                                                case 5:
                                                    h hVar7 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.c(iArr, i45 + 2, hVar7);
                                                    try {
                                                        Long.parseLong(hVar7.toString());
                                                        break;
                                                    } catch (NumberFormatException unused4) {
                                                        throw P8.f.a();
                                                    }
                                                case 6:
                                                    h hVar8 = new h(7, (byte) 0);
                                                    i45 = AbstractC1351c.c(iArr, i45 + 2, hVar8);
                                                    try {
                                                        Integer.parseInt(hVar8.toString());
                                                        break;
                                                    } catch (NumberFormatException unused5) {
                                                        throw P8.f.a();
                                                    }
                                                default:
                                                    throw P8.f.a();
                                            }
                                        }
                                        z10 = true;
                                    }
                                    if (i16 != -1) {
                                        int i53 = i45 - i16;
                                        if (obj.f17897b) {
                                            i53--;
                                        }
                                        if (i53 > 0) {
                                            Arrays.copyOfRange(iArr, i16, i53 + i16);
                                        }
                                    }
                                    d10 = i45;
                                    break;
                                }
                            default:
                                c11 = AbstractC1351c.d(iArr, d10, hVar);
                                d10 = c11;
                                c10 = 0;
                                z8 = true;
                                break;
                        }
                }
            } else {
                c10 = 0;
                z8 = true;
                d10 += 2;
                hVar.l((char) iArr[i45]);
            }
            c13 = c10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[EDGE_INSN: B:31:0x005b->B:32:0x005b BREAK  A[LOOP:2: B:19:0x0042->B:27:0x0042], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r0 c(V8.b bVar, int i7, int i10, boolean z8, int i11, int i12, int i13, int i14) {
        int i15;
        int i16 = i7;
        int i17 = z8 ? -1 : 1;
        boolean z10 = z8;
        int i18 = i11;
        int i19 = 0;
        loop0: while (true) {
            if (i19 >= 2) {
                break;
            }
            while (true) {
                if (!z10) {
                    if (i18 >= i10) {
                        break;
                    }
                    if (z10 != bVar.b(i18, i12)) {
                        break;
                    }
                } else {
                    if (i18 < i16) {
                        break;
                    }
                    if (z10 != bVar.b(i18, i12)) {
                        if (Math.abs(i11 - i18) > 2) {
                            i18 = i11;
                            break loop0;
                        }
                        i18 += i17;
                    }
                }
            }
            i17 = -i17;
            z10 = !z10;
            i19++;
        }
        int[] iArr = new int[8];
        int i20 = z8 ? 1 : -1;
        boolean z11 = z8;
        int i21 = i18;
        int i22 = 0;
        while (true) {
            if (z8) {
                if (i21 >= i10) {
                    break;
                }
                if (i22 < 8) {
                    break;
                }
                if (bVar.b(i21, i12) == z11) {
                    iArr[i22] = iArr[i22] + 1;
                    i21 += i20;
                } else {
                    i22++;
                    z11 = !z11;
                }
            } else {
                if (i21 < i16) {
                    break;
                }
                if (i22 < 8) {
                }
            }
        }
        if (i22 != 8) {
            if (z8) {
                i16 = i10;
            }
            if (i21 != i16 || i22 != 7) {
                iArr = null;
            }
        }
        if (iArr == null) {
            return null;
        }
        int J10 = O5.b.J(iArr);
        if (z8) {
            i15 = i18 + J10;
        } else {
            for (int i23 = 0; i23 < iArr.length / 2; i23++) {
                int i24 = iArr[i23];
                iArr[i23] = iArr[(iArr.length - 1) - i23];
                iArr[(iArr.length - 1) - i23] = i24;
            }
            int i25 = i18;
            i18 -= J10;
            i15 = i25;
        }
        if (i13 - 2 > J10 || J10 > i14 + 2) {
            return null;
        }
        float[][] fArr = AbstractC1353e.f18476a;
        float J11 = O5.b.J(iArr);
        int[] iArr2 = new int[8];
        int i26 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < 17; i28++) {
            float f4 = ((i28 * J11) / 17.0f) + (J11 / 34.0f);
            int i29 = iArr[i27] + i26;
            if (i29 <= f4) {
                i27++;
                i26 = i29;
            }
            iArr2[i27] = iArr2[i27] + 1;
        }
        long j = 0;
        for (int i30 = 0; i30 < 8; i30++) {
            for (int i31 = 0; i31 < iArr2[i30]; i31++) {
                j = (j << 1) | (i30 % 2 == 0 ? 1 : 0);
            }
        }
        int i32 = (int) j;
        int[] iArr3 = AbstractC1263a.f17893b;
        int binarySearch = Arrays.binarySearch(iArr3, i32 & 262143);
        int[] iArr4 = AbstractC1263a.f17894c;
        if ((binarySearch < 0 ? -1 : (iArr4[binarySearch] - 1) % 929) == -1) {
            i32 = -1;
        }
        if (i32 == -1) {
            int J12 = O5.b.J(iArr);
            float[] fArr2 = new float[8];
            if (J12 > 1) {
                for (int i33 = 0; i33 < 8; i33++) {
                    fArr2[i33] = iArr[i33] / J12;
                }
            }
            float f10 = Float.MAX_VALUE;
            i32 = -1;
            int i34 = 0;
            while (true) {
                float[][] fArr3 = AbstractC1353e.f18476a;
                if (i34 >= fArr3.length) {
                    break;
                }
                float[] fArr4 = fArr3[i34];
                float f11 = 0.0f;
                for (int i35 = 0; i35 < 8; i35++) {
                    float f12 = fArr4[i35] - fArr2[i35];
                    f11 = (f12 * f12) + f11;
                    if (f11 >= f10) {
                        break;
                    }
                }
                if (f11 < f10) {
                    i32 = iArr3[i34];
                    f10 = f11;
                }
                i34++;
            }
        }
        int binarySearch2 = Arrays.binarySearch(iArr3, i32 & 262143);
        int i36 = binarySearch2 < 0 ? -1 : (iArr4[binarySearch2] - 1) % 929;
        if (i36 == -1) {
            return null;
        }
        int[] iArr5 = new int[8];
        int i37 = 7;
        int i38 = 0;
        while (true) {
            int i39 = i32 & 1;
            if (i39 != i38) {
                i37--;
                if (i37 < 0) {
                    return new r0(i18, i15, ((((iArr5[0] - iArr5[2]) + iArr5[4]) - iArr5[6]) + 9) % 9, i36, 3, (byte) 0);
                }
                i38 = i39;
            }
            iArr5[i37] = iArr5[i37] + 1;
            i32 >>= 1;
        }
    }

    public static C1352d d(V8.b bVar, C1350b c1350b, p pVar, boolean z8, int i7, int i10) {
        C1352d c1352d = new C1352d(c1350b, z8);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 1 : -1;
            int i13 = (int) pVar.f8249a;
            for (int i14 = (int) pVar.f8250b; i14 <= c1350b.f18471i && i14 >= c1350b.f18470h; i14 += i12) {
                r0 c10 = c(bVar, 0, bVar.f10194a, z8, i13, i14, i7, i10);
                if (c10 != null) {
                    ((r0[]) c1352d.f16841c)[c1352d.i(i14)] = c10;
                    i13 = z8 ? c10.f4793b : c10.f4794c;
                }
            }
            i11++;
        }
        return c1352d;
    }
}
