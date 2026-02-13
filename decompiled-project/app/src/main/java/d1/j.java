package d1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f16483a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0283, code lost:
    
        if (r2.f16335d == r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r4.f16335d == r13) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0707 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, b1.c cVar, ArrayList arrayList, int i7) {
        int i10;
        C1039b[] c1039bArr;
        int i11;
        int i12;
        boolean z8;
        boolean z10;
        float f4;
        d dVar;
        boolean z11;
        boolean z12;
        C1040c[] c1040cArr;
        int i13;
        C1039b[] c1039bArr2;
        ArrayList arrayList2;
        d dVar2;
        int i14;
        d dVar3;
        int i15;
        C1040c c1040c;
        C1040c c1040c2;
        int i16;
        d dVar4;
        int i17;
        int i18;
        d dVar5;
        b1.f fVar;
        b1.f fVar2;
        C1040c c1040c3;
        C1040c c1040c4;
        b1.f fVar3;
        d dVar6;
        d dVar7;
        d dVar8;
        C1040c c1040c5;
        d dVar9;
        int i19;
        C1040c[] c1040cArr2;
        C1040c c1040c6;
        b1.f fVar4;
        b1.f fVar5;
        int size;
        int i20;
        ArrayList arrayList3;
        int i21;
        float f10;
        d dVar10;
        boolean z13;
        d dVar11;
        C1039b c1039b;
        d dVar12;
        d dVar13;
        int i22;
        int i23;
        d dVar14;
        C1040c c1040c7;
        d dVar15;
        e eVar2 = eVar;
        ArrayList arrayList4 = arrayList;
        int i24 = 2;
        if (i7 == 0) {
            i10 = eVar2.f16424z0;
            c1039bArr = eVar2.C0;
            i11 = 0;
        } else {
            i10 = eVar2.f16404A0;
            c1039bArr = eVar2.f16405B0;
            i11 = 2;
        }
        int i25 = 0;
        while (i25 < i10) {
            C1039b c1039b2 = c1039bArr[i25];
            boolean z14 = c1039b2.f16331q;
            d dVar16 = c1039b2.f16318a;
            int i26 = 3;
            int i27 = 1;
            int i28 = 8;
            if (z14) {
                i12 = i25;
                z8 = true;
            } else {
                int i29 = c1039b2.f16326l;
                int i30 = i29 * 2;
                d dVar17 = dVar16;
                d dVar18 = dVar17;
                boolean z15 = false;
                while (!z15) {
                    c1039b2.f16325i += i27;
                    dVar17.f16387m0[i29] = null;
                    dVar17.f16385l0[i29] = null;
                    int i31 = dVar17.f16377g0;
                    C1040c[] c1040cArr3 = dVar17.f16355Q;
                    if (i31 != i28) {
                        dVar17.j(i29);
                        c1040cArr3[i30].e();
                        int i32 = i30 + 1;
                        c1040cArr3[i32].e();
                        c1040cArr3[i30].e();
                        c1040cArr3[i32].e();
                        if (c1039b2.f16319b == null) {
                            c1039b2.f16319b = dVar17;
                        }
                        c1039b2.f16321d = dVar17;
                        int i33 = dVar17.f16393p0[i29];
                        if (i33 == i26) {
                            int i34 = dVar17.f16397t[i29];
                            if (i34 == 0 || i34 == i26 || i34 == i24) {
                                c1039b2.j++;
                                float f11 = dVar17.f16383k0[i29];
                                if (f11 > 0.0f) {
                                    c1039b2.k += f11;
                                }
                                i23 = i25;
                                if (dVar17.f16377g0 != 8 && i33 == 3 && (i34 == 0 || i34 == 3)) {
                                    if (f11 < 0.0f) {
                                        c1039b2.f16328n = true;
                                    } else {
                                        c1039b2.f16329o = true;
                                    }
                                    if (c1039b2.f16324h == null) {
                                        c1039b2.f16324h = new ArrayList();
                                    }
                                    c1039b2.f16324h.add(dVar17);
                                }
                                if (c1039b2.f16323f == null) {
                                    c1039b2.f16323f = dVar17;
                                }
                                d dVar19 = c1039b2.g;
                                if (dVar19 != null) {
                                    dVar19.f16385l0[i29] = dVar17;
                                }
                                c1039b2.g = dVar17;
                            } else {
                                i23 = i25;
                            }
                            if (i29 == 0) {
                                if (dVar17.f16395r == 0 && dVar17.f16398u == 0) {
                                    int i35 = dVar17.f16399v;
                                }
                            } else if (dVar17.f16396s == 0 && dVar17.f16401x == 0) {
                                int i36 = dVar17.f16402y;
                            }
                            dVar14 = dVar18;
                            if (dVar14 != dVar17) {
                                dVar14.f16387m0[i29] = dVar17;
                            }
                            c1040c7 = c1040cArr3[i30 + 1].f16337f;
                            if (c1040c7 != null) {
                                dVar15 = c1040c7.f16335d;
                                C1040c c1040c8 = dVar15.f16355Q[i30].f16337f;
                                if (c1040c8 != null) {
                                }
                            }
                            dVar15 = null;
                            if (dVar15 != null) {
                                dVar15 = dVar17;
                                z15 = true;
                            }
                            dVar18 = dVar17;
                            i25 = i23;
                            i27 = 1;
                            i28 = 8;
                            i24 = 2;
                            dVar17 = dVar15;
                            i26 = 3;
                        }
                    }
                    i23 = i25;
                    dVar14 = dVar18;
                    if (dVar14 != dVar17) {
                    }
                    c1040c7 = c1040cArr3[i30 + 1].f16337f;
                    if (c1040c7 != null) {
                    }
                    dVar15 = null;
                    if (dVar15 != null) {
                    }
                    dVar18 = dVar17;
                    i25 = i23;
                    i27 = 1;
                    i28 = 8;
                    i24 = 2;
                    dVar17 = dVar15;
                    i26 = 3;
                }
                i12 = i25;
                d dVar20 = c1039b2.f16319b;
                if (dVar20 != null) {
                    dVar20.f16355Q[i30].e();
                }
                d dVar21 = c1039b2.f16321d;
                if (dVar21 != null) {
                    dVar21.f16355Q[i30 + 1].e();
                }
                c1039b2.f16320c = dVar17;
                if (i29 == 0 && c1039b2.f16327m) {
                    c1039b2.f16322e = dVar17;
                } else {
                    c1039b2.f16322e = dVar16;
                }
                c1039b2.f16330p = c1039b2.f16329o && c1039b2.f16328n;
                z8 = true;
            }
            c1039b2.f16331q = z8;
            if (arrayList4 == null || arrayList4.contains(dVar16)) {
                d dVar22 = c1039b2.f16320c;
                d dVar23 = c1039b2.f16319b;
                d dVar24 = c1039b2.f16321d;
                d dVar25 = c1039b2.f16322e;
                float f12 = c1039b2.k;
                boolean z16 = eVar2.f16393p0[i7] == 2;
                if (i7 == 0) {
                    int i37 = dVar25.f16381i0;
                    boolean z17 = i37 == 0;
                    z12 = i37 == 1;
                    z10 = i37 == 2;
                    f4 = f12;
                    dVar = dVar16;
                    z11 = z17;
                } else {
                    int i38 = dVar25.f16382j0;
                    boolean z18 = i38 == 0;
                    boolean z19 = i38 == 1;
                    z10 = i38 == 2;
                    f4 = f12;
                    dVar = dVar16;
                    z11 = z18;
                    z12 = z19;
                }
                boolean z20 = false;
                while (true) {
                    c1040cArr = eVar2.f16355Q;
                    if (z20) {
                        break;
                    }
                    C1040c c1040c9 = dVar.f16355Q[i11];
                    int i39 = z10 ? 1 : 4;
                    int e2 = c1040c9.e();
                    boolean z21 = z20;
                    int[] iArr = dVar.f16393p0;
                    int i40 = i10;
                    C1039b[] c1039bArr3 = c1039bArr;
                    boolean z22 = iArr[i7] == 3 && dVar.f16397t[i7] == 0;
                    C1040c c1040c10 = c1040c9.f16337f;
                    if (c1040c10 != null && dVar != dVar16) {
                        e2 = c1040c10.e() + e2;
                    }
                    int i41 = e2;
                    if (!z10 || dVar == dVar16 || dVar == dVar23) {
                        dVar11 = dVar25;
                    } else {
                        dVar11 = dVar25;
                        i39 = 8;
                    }
                    C1040c c1040c11 = c1040c9.f16337f;
                    if (c1040c11 != null) {
                        if (dVar == dVar23) {
                            dVar12 = dVar16;
                            c1039b = c1039b2;
                            cVar.f(c1040c9.f16339i, c1040c11.f16339i, i41, 6);
                        } else {
                            c1039b = c1039b2;
                            dVar12 = dVar16;
                            cVar.f(c1040c9.f16339i, c1040c11.f16339i, i41, 8);
                        }
                        if (z22 && !z10) {
                            i39 = 5;
                        }
                        cVar.e(c1040c9.f16339i, c1040c9.f16337f.f16339i, i41, (dVar == dVar23 && z10 && dVar.f16357S[i7]) ? 5 : i39);
                    } else {
                        c1039b = c1039b2;
                        dVar12 = dVar16;
                    }
                    C1040c[] c1040cArr4 = dVar.f16355Q;
                    if (z16) {
                        if (dVar.f16377g0 == 8 || iArr[i7] != 3) {
                            i22 = 0;
                        } else {
                            i22 = 0;
                            cVar.f(c1040cArr4[i11 + 1].f16339i, c1040cArr4[i11].f16339i, 0, 5);
                        }
                        cVar.f(c1040cArr4[i11].f16339i, c1040cArr[i11].f16339i, i22, 8);
                    }
                    C1040c c1040c12 = c1040cArr4[i11 + 1].f16337f;
                    if (c1040c12 != null) {
                        dVar13 = c1040c12.f16335d;
                        C1040c c1040c13 = dVar13.f16355Q[i11].f16337f;
                        if (c1040c13 != null) {
                        }
                    }
                    dVar13 = null;
                    if (dVar13 != null) {
                        dVar = dVar13;
                        z20 = z21;
                    } else {
                        z20 = true;
                    }
                    dVar25 = dVar11;
                    i10 = i40;
                    c1039bArr = c1039bArr3;
                    dVar16 = dVar12;
                    c1039b2 = c1039b;
                }
                C1039b c1039b3 = c1039b2;
                d dVar26 = dVar25;
                d dVar27 = dVar16;
                i13 = i10;
                c1039bArr2 = c1039bArr;
                if (dVar24 != null) {
                    int i42 = i11 + 1;
                    if (dVar22.f16355Q[i42].f16337f != null) {
                        C1040c c1040c14 = dVar24.f16355Q[i42];
                        if (dVar24.f16393p0[i7] == 3 && dVar24.f16397t[i7] == 0 && !z10) {
                            C1040c c1040c15 = c1040c14.f16337f;
                            if (c1040c15.f16335d == eVar2) {
                                cVar.e(c1040c14.f16339i, c1040c15.f16339i, -c1040c14.e(), 5);
                                cVar.g(c1040c14.f16339i, dVar22.f16355Q[i42].f16337f.f16339i, -c1040c14.e(), 6);
                                if (z16) {
                                    int i43 = i11 + 1;
                                    b1.f fVar6 = c1040cArr[i43].f16339i;
                                    C1040c c1040c16 = dVar22.f16355Q[i43];
                                    cVar.f(fVar6, c1040c16.f16339i, c1040c16.e(), 8);
                                }
                                arrayList2 = c1039b3.f16324h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f13 = (c1039b3.f16328n || c1039b3.f16330p) ? f4 : c1039b3.j;
                                    d dVar28 = null;
                                    float f14 = 0.0f;
                                    i20 = 0;
                                    while (i20 < size) {
                                        d dVar29 = (d) arrayList2.get(i20);
                                        float f15 = dVar29.f16383k0[i7];
                                        C1040c[] c1040cArr5 = dVar29.f16355Q;
                                        if (f15 < 0.0f) {
                                            if (c1039b3.f16330p) {
                                                b1.f fVar7 = c1040cArr5[i11 + 1].f16339i;
                                                b1.f fVar8 = c1040cArr5[i11].f16339i;
                                                z13 = false;
                                                cVar.e(fVar7, fVar8, 0, 4);
                                                arrayList3 = arrayList2;
                                                i21 = size;
                                                i20++;
                                                size = i21;
                                                arrayList2 = arrayList3;
                                            } else {
                                                f15 = 1.0f;
                                            }
                                        }
                                        if (f15 == 0.0f) {
                                            b1.f fVar9 = c1040cArr5[i11 + 1].f16339i;
                                            b1.f fVar10 = c1040cArr5[i11].f16339i;
                                            z13 = false;
                                            cVar.e(fVar9, fVar10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i21 = size;
                                            i20++;
                                            size = i21;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (dVar28 != null) {
                                                C1040c[] c1040cArr6 = dVar28.f16355Q;
                                                b1.f fVar11 = c1040cArr6[i11].f16339i;
                                                int i44 = i11 + 1;
                                                b1.f fVar12 = c1040cArr6[i44].f16339i;
                                                arrayList3 = arrayList2;
                                                b1.f fVar13 = c1040cArr5[i11].f16339i;
                                                b1.f fVar14 = c1040cArr5[i44].f16339i;
                                                i21 = size;
                                                b1.b l10 = cVar.l();
                                                dVar10 = dVar29;
                                                l10.f13779b = 0.0f;
                                                if (f13 == 0.0f || f14 == f15) {
                                                    f10 = f15;
                                                    l10.f13781d.g(fVar11, 1.0f);
                                                    l10.f13781d.g(fVar12, -1.0f);
                                                    l10.f13781d.g(fVar14, 1.0f);
                                                    l10.f13781d.g(fVar13, -1.0f);
                                                } else {
                                                    if (f14 == 0.0f) {
                                                        l10.f13781d.g(fVar11, 1.0f);
                                                        l10.f13781d.g(fVar12, -1.0f);
                                                    } else if (f15 == 0.0f) {
                                                        l10.f13781d.g(fVar13, 1.0f);
                                                        l10.f13781d.g(fVar14, -1.0f);
                                                    } else {
                                                        float f16 = (f14 / f13) / (f15 / f13);
                                                        f10 = f15;
                                                        l10.f13781d.g(fVar11, 1.0f);
                                                        l10.f13781d.g(fVar12, -1.0f);
                                                        l10.f13781d.g(fVar14, f16);
                                                        l10.f13781d.g(fVar13, -f16);
                                                    }
                                                    f10 = f15;
                                                }
                                                cVar.c(l10);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i21 = size;
                                                f10 = f15;
                                                dVar10 = dVar29;
                                            }
                                            f14 = f10;
                                            dVar28 = dVar10;
                                            i20++;
                                            size = i21;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (dVar23 == null && (dVar23 == dVar24 || z10)) {
                                    C1040c c1040c17 = dVar27.f16355Q[i11];
                                    int i45 = i11 + 1;
                                    C1040c c1040c18 = dVar22.f16355Q[i45];
                                    C1040c c1040c19 = c1040c17.f16337f;
                                    b1.f fVar15 = c1040c19 != null ? c1040c19.f16339i : null;
                                    C1040c c1040c20 = c1040c18.f16337f;
                                    b1.f fVar16 = c1040c20 != null ? c1040c20.f16339i : null;
                                    C1040c c1040c21 = dVar23.f16355Q[i11];
                                    if (dVar24 != null) {
                                        c1040c18 = dVar24.f16355Q[i45];
                                    }
                                    if (fVar15 == null || fVar16 == null) {
                                        dVar2 = dVar24;
                                        i14 = i12;
                                    } else {
                                        dVar2 = dVar24;
                                        i14 = i12;
                                        cVar.b(c1040c21.f16339i, fVar15, c1040c21.e(), i7 == 0 ? dVar26.f16372d0 : dVar26.f16374e0, fVar16, c1040c18.f16339i, c1040c18.e(), 7);
                                    }
                                } else {
                                    dVar2 = dVar24;
                                    i14 = i12;
                                    if (z11 || dVar23 == null) {
                                        int i46 = 8;
                                        if (z12 && dVar23 != null) {
                                            int i47 = c1039b3.j;
                                            boolean z23 = i47 <= 0 && c1039b3.f16325i == i47;
                                            d dVar30 = dVar23;
                                            dVar3 = dVar30;
                                            while (dVar3 != null) {
                                                d dVar31 = dVar3.f16387m0[i7];
                                                while (dVar31 != null && dVar31.f16377g0 == i46) {
                                                    dVar31 = dVar31.f16387m0[i7];
                                                }
                                                if (dVar3 == dVar23 || dVar3 == dVar2 || dVar31 == null) {
                                                    dVar4 = dVar30;
                                                    i17 = i14;
                                                    i18 = i46;
                                                } else {
                                                    d dVar32 = dVar31 == dVar2 ? null : dVar31;
                                                    C1040c[] c1040cArr7 = dVar3.f16355Q;
                                                    C1040c c1040c22 = c1040cArr7[i11];
                                                    b1.f fVar17 = c1040c22.f16339i;
                                                    int i48 = i11 + 1;
                                                    b1.f fVar18 = dVar30.f16355Q[i48].f16339i;
                                                    int e10 = c1040c22.e();
                                                    int e11 = c1040cArr7[i48].e();
                                                    if (dVar32 != null) {
                                                        c1040c3 = dVar32.f16355Q[i11];
                                                        fVar = c1040c3.f16339i;
                                                        dVar5 = dVar32;
                                                        C1040c c1040c23 = c1040c3.f16337f;
                                                        fVar2 = c1040c23 != null ? c1040c23.f16339i : null;
                                                    } else {
                                                        dVar5 = dVar32;
                                                        C1040c c1040c24 = dVar2.f16355Q[i11];
                                                        fVar = c1040c24 != null ? c1040c24.f16339i : null;
                                                        fVar2 = c1040cArr7[i48].f16339i;
                                                        c1040c3 = c1040c24;
                                                    }
                                                    int e12 = c1040c3 != null ? c1040c3.e() + e11 : e11;
                                                    int e13 = dVar30.f16355Q[i48].e() + e10;
                                                    int i49 = z23 ? 8 : 4;
                                                    if (fVar17 == null || fVar18 == null || fVar == null || fVar2 == null) {
                                                        dVar4 = dVar30;
                                                        i17 = i14;
                                                        i18 = 8;
                                                    } else {
                                                        dVar4 = dVar30;
                                                        int i50 = e12;
                                                        i17 = i14;
                                                        i18 = 8;
                                                        cVar.b(fVar17, fVar18, e13, 0.5f, fVar, fVar2, i50, i49);
                                                    }
                                                    dVar31 = dVar5;
                                                }
                                                dVar30 = dVar3.f16377g0 != i18 ? dVar3 : dVar4;
                                                dVar3 = dVar31;
                                                i46 = i18;
                                                i14 = i17;
                                            }
                                            i15 = i14;
                                            C1040c c1040c25 = dVar23.f16355Q[i11];
                                            c1040c = dVar27.f16355Q[i11].f16337f;
                                            int i51 = i11 + 1;
                                            C1040c c1040c26 = dVar2.f16355Q[i51];
                                            c1040c2 = dVar22.f16355Q[i51].f16337f;
                                            if (c1040c != null) {
                                                if (dVar23 != dVar2) {
                                                    cVar.e(c1040c25.f16339i, c1040c.f16339i, c1040c25.e(), 5);
                                                } else if (c1040c2 != null) {
                                                    i16 = 5;
                                                    cVar.b(c1040c25.f16339i, c1040c.f16339i, c1040c25.e(), 0.5f, c1040c26.f16339i, c1040c2.f16339i, c1040c26.e(), 5);
                                                    if (c1040c2 != null && dVar23 != dVar2) {
                                                        cVar.e(c1040c26.f16339i, c1040c2.f16339i, -c1040c26.e(), i16);
                                                    }
                                                    if ((!z11 || z12) && dVar23 != null && dVar23 != dVar2) {
                                                        C1040c[] c1040cArr8 = dVar23.f16355Q;
                                                        c1040c5 = c1040cArr8[i11];
                                                        dVar9 = dVar2 != null ? dVar23 : dVar2;
                                                        i19 = i11 + 1;
                                                        c1040cArr2 = dVar9.f16355Q;
                                                        c1040c6 = c1040cArr2[i19];
                                                        C1040c c1040c27 = c1040c5.f16337f;
                                                        fVar4 = c1040c27 == null ? c1040c27.f16339i : null;
                                                        C1040c c1040c28 = c1040c6.f16337f;
                                                        fVar5 = c1040c28 == null ? c1040c28.f16339i : null;
                                                        if (dVar22 != dVar9) {
                                                            C1040c c1040c29 = dVar22.f16355Q[i19].f16337f;
                                                            fVar5 = c1040c29 != null ? c1040c29.f16339i : null;
                                                        }
                                                        if (dVar23 == dVar9) {
                                                            c1040c6 = c1040cArr8[i19];
                                                        }
                                                        if (fVar4 != null && fVar5 != null) {
                                                            cVar.b(c1040c5.f16339i, fVar4, c1040c5.e(), 0.5f, fVar5, c1040c6.f16339i, c1040cArr2[i19].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i16 = 5;
                                            if (c1040c2 != null) {
                                                cVar.e(c1040c26.f16339i, c1040c2.f16339i, -c1040c26.e(), i16);
                                            }
                                            if (!z11) {
                                            }
                                            C1040c[] c1040cArr82 = dVar23.f16355Q;
                                            c1040c5 = c1040cArr82[i11];
                                            if (dVar2 != null) {
                                            }
                                            i19 = i11 + 1;
                                            c1040cArr2 = dVar9.f16355Q;
                                            c1040c6 = c1040cArr2[i19];
                                            C1040c c1040c272 = c1040c5.f16337f;
                                            if (c1040c272 == null) {
                                            }
                                            C1040c c1040c282 = c1040c6.f16337f;
                                            if (c1040c282 == null) {
                                            }
                                            if (dVar22 != dVar9) {
                                            }
                                            if (dVar23 == dVar9) {
                                            }
                                            if (fVar4 != null) {
                                                cVar.b(c1040c5.f16339i, fVar4, c1040c5.e(), 0.5f, fVar5, c1040c6.f16339i, c1040cArr2[i19].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i52 = c1039b3.j;
                                        boolean z24 = i52 > 0 && c1039b3.f16325i == i52;
                                        d dVar33 = dVar23;
                                        for (d dVar34 = dVar33; dVar34 != null; dVar34 = dVar7) {
                                            d dVar35 = dVar34.f16387m0[i7];
                                            while (dVar35 != null && dVar35.f16377g0 == 8) {
                                                dVar35 = dVar35.f16387m0[i7];
                                            }
                                            if (dVar35 != null || dVar34 == dVar2) {
                                                C1040c[] c1040cArr9 = dVar34.f16355Q;
                                                C1040c c1040c30 = c1040cArr9[i11];
                                                b1.f fVar19 = c1040c30.f16339i;
                                                C1040c c1040c31 = c1040c30.f16337f;
                                                b1.f fVar20 = c1040c31 != null ? c1040c31.f16339i : null;
                                                if (dVar33 != dVar34) {
                                                    fVar20 = dVar33.f16355Q[i11 + 1].f16339i;
                                                } else if (dVar34 == dVar23) {
                                                    C1040c c1040c32 = dVar27.f16355Q[i11].f16337f;
                                                    fVar20 = c1040c32 != null ? c1040c32.f16339i : null;
                                                }
                                                int e14 = c1040c30.e();
                                                int i53 = i11 + 1;
                                                int e15 = c1040cArr9[i53].e();
                                                if (dVar35 != null) {
                                                    c1040c4 = dVar35.f16355Q[i11];
                                                    fVar3 = c1040c4.f16339i;
                                                } else {
                                                    c1040c4 = dVar22.f16355Q[i53].f16337f;
                                                    fVar3 = c1040c4 != null ? c1040c4.f16339i : null;
                                                }
                                                b1.f fVar21 = c1040cArr9[i53].f16339i;
                                                if (c1040c4 != null) {
                                                    e15 = c1040c4.e() + e15;
                                                }
                                                int e16 = dVar33.f16355Q[i53].e() + e14;
                                                if (fVar19 != null && fVar20 != null && fVar3 != null && fVar21 != null) {
                                                    if (dVar34 == dVar23) {
                                                        e16 = dVar23.f16355Q[i11].e();
                                                    }
                                                    if (dVar34 == dVar2) {
                                                        e15 = dVar2.f16355Q[i53].e();
                                                    }
                                                    b1.f fVar22 = fVar20;
                                                    int i54 = e16;
                                                    b1.f fVar23 = fVar3;
                                                    dVar6 = dVar33;
                                                    int i55 = e15;
                                                    dVar7 = dVar35;
                                                    dVar8 = dVar34;
                                                    cVar.b(fVar19, fVar22, i54, 0.5f, fVar23, fVar21, i55, z24 ? 8 : 5);
                                                    dVar33 = dVar8.f16377g0 == 8 ? dVar8 : dVar6;
                                                }
                                            }
                                            dVar7 = dVar35;
                                            dVar6 = dVar33;
                                            dVar8 = dVar34;
                                            if (dVar8.f16377g0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i15 = i14;
                                if (!z11) {
                                }
                                C1040c[] c1040cArr822 = dVar23.f16355Q;
                                c1040c5 = c1040cArr822[i11];
                                if (dVar2 != null) {
                                }
                                i19 = i11 + 1;
                                c1040cArr2 = dVar9.f16355Q;
                                c1040c6 = c1040cArr2[i19];
                                C1040c c1040c2722 = c1040c5.f16337f;
                                if (c1040c2722 == null) {
                                }
                                C1040c c1040c2822 = c1040c6.f16337f;
                                if (c1040c2822 == null) {
                                }
                                if (dVar22 != dVar9) {
                                }
                                if (dVar23 == dVar9) {
                                }
                                if (fVar4 != null) {
                                }
                            }
                        }
                        if (z10) {
                            C1040c c1040c33 = c1040c14.f16337f;
                            if (c1040c33.f16335d == eVar2) {
                                cVar.e(c1040c14.f16339i, c1040c33.f16339i, -c1040c14.e(), 4);
                            }
                        }
                        cVar.g(c1040c14.f16339i, dVar22.f16355Q[i42].f16337f.f16339i, -c1040c14.e(), 6);
                        if (z16) {
                        }
                        arrayList2 = c1039b3.f16324h;
                        if (arrayList2 != null) {
                            if (c1039b3.f16328n) {
                            }
                            d dVar282 = null;
                            float f142 = 0.0f;
                            i20 = 0;
                            while (i20 < size) {
                            }
                        }
                        if (dVar23 == null) {
                        }
                        dVar2 = dVar24;
                        i14 = i12;
                        if (z11) {
                        }
                        int i462 = 8;
                        if (z12) {
                            int i472 = c1039b3.j;
                            if (i472 <= 0) {
                            }
                            d dVar302 = dVar23;
                            dVar3 = dVar302;
                            while (dVar3 != null) {
                            }
                            i15 = i14;
                            C1040c c1040c252 = dVar23.f16355Q[i11];
                            c1040c = dVar27.f16355Q[i11].f16337f;
                            int i512 = i11 + 1;
                            C1040c c1040c262 = dVar2.f16355Q[i512];
                            c1040c2 = dVar22.f16355Q[i512].f16337f;
                            if (c1040c != null) {
                            }
                            i16 = 5;
                            if (c1040c2 != null) {
                            }
                            if (!z11) {
                            }
                            C1040c[] c1040cArr8222 = dVar23.f16355Q;
                            c1040c5 = c1040cArr8222[i11];
                            if (dVar2 != null) {
                            }
                            i19 = i11 + 1;
                            c1040cArr2 = dVar9.f16355Q;
                            c1040c6 = c1040cArr2[i19];
                            C1040c c1040c27222 = c1040c5.f16337f;
                            if (c1040c27222 == null) {
                            }
                            C1040c c1040c28222 = c1040c6.f16337f;
                            if (c1040c28222 == null) {
                            }
                            if (dVar22 != dVar9) {
                            }
                            if (dVar23 == dVar9) {
                            }
                            if (fVar4 != null) {
                            }
                        }
                        i15 = i14;
                        if (!z11) {
                        }
                        C1040c[] c1040cArr82222 = dVar23.f16355Q;
                        c1040c5 = c1040cArr82222[i11];
                        if (dVar2 != null) {
                        }
                        i19 = i11 + 1;
                        c1040cArr2 = dVar9.f16355Q;
                        c1040c6 = c1040cArr2[i19];
                        C1040c c1040c272222 = c1040c5.f16337f;
                        if (c1040c272222 == null) {
                        }
                        C1040c c1040c282222 = c1040c6.f16337f;
                        if (c1040c282222 == null) {
                        }
                        if (dVar22 != dVar9) {
                        }
                        if (dVar23 == dVar9) {
                        }
                        if (fVar4 != null) {
                        }
                    }
                }
                if (z16) {
                }
                arrayList2 = c1039b3.f16324h;
                if (arrayList2 != null) {
                }
                if (dVar23 == null) {
                }
                dVar2 = dVar24;
                i14 = i12;
                if (z11) {
                }
                int i4622 = 8;
                if (z12) {
                }
                i15 = i14;
                if (!z11) {
                }
                C1040c[] c1040cArr822222 = dVar23.f16355Q;
                c1040c5 = c1040cArr822222[i11];
                if (dVar2 != null) {
                }
                i19 = i11 + 1;
                c1040cArr2 = dVar9.f16355Q;
                c1040c6 = c1040cArr2[i19];
                C1040c c1040c2722222 = c1040c5.f16337f;
                if (c1040c2722222 == null) {
                }
                C1040c c1040c2822222 = c1040c6.f16337f;
                if (c1040c2822222 == null) {
                }
                if (dVar22 != dVar9) {
                }
                if (dVar23 == dVar9) {
                }
                if (fVar4 != null) {
                }
            } else {
                i13 = i10;
                c1039bArr2 = c1039bArr;
                i15 = i12;
            }
            i25 = i15 + 1;
            i24 = 2;
            eVar2 = eVar;
            arrayList4 = arrayList;
            i10 = i13;
            c1039bArr = c1039bArr2;
        }
    }

    public static void b(e eVar, b1.c cVar, d dVar) {
        dVar.f16390o = -1;
        dVar.f16392p = -1;
        int i7 = eVar.f16393p0[0];
        int[] iArr = dVar.f16393p0;
        if (i7 != 2 && iArr[0] == 4) {
            C1040c c1040c = dVar.f16348I;
            int i10 = c1040c.g;
            int q10 = eVar.q();
            C1040c c1040c2 = dVar.f16350K;
            int i11 = q10 - c1040c2.g;
            c1040c.f16339i = cVar.k(c1040c);
            c1040c2.f16339i = cVar.k(c1040c2);
            cVar.d(c1040c.f16339i, i10);
            cVar.d(c1040c2.f16339i, i11);
            dVar.f16390o = 2;
            dVar.f16363Y = i10;
            int i12 = i11 - i10;
            dVar.f16359U = i12;
            int i13 = dVar.f16368b0;
            if (i12 < i13) {
                dVar.f16359U = i13;
            }
        }
        if (eVar.f16393p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C1040c c1040c3 = dVar.f16349J;
        int i14 = c1040c3.g;
        int k = eVar.k();
        C1040c c1040c4 = dVar.L;
        int i15 = k - c1040c4.g;
        c1040c3.f16339i = cVar.k(c1040c3);
        c1040c4.f16339i = cVar.k(c1040c4);
        cVar.d(c1040c3.f16339i, i14);
        cVar.d(c1040c4.f16339i, i15);
        if (dVar.f16366a0 > 0 || dVar.f16377g0 == 8) {
            C1040c c1040c5 = dVar.f16351M;
            b1.f k7 = cVar.k(c1040c5);
            c1040c5.f16339i = k7;
            cVar.d(k7, dVar.f16366a0 + i14);
        }
        dVar.f16392p = 2;
        dVar.f16364Z = i14;
        int i16 = i15 - i14;
        dVar.f16360V = i16;
        int i17 = dVar.f16370c0;
        if (i16 < i17) {
            dVar.f16360V = i17;
        }
    }

    public static final boolean c(int i7, int i10) {
        return (i7 & i10) == i10;
    }
}
