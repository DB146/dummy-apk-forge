package A0;

import java.util.ArrayList;
import java.util.HashSet;
import u.C2041D;
import x0.AbstractC2256a;

/* renamed from: A0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f225b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f226c;

    /* renamed from: d, reason: collision with root package name */
    public Object f227d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f228e;

    /* renamed from: f, reason: collision with root package name */
    public Object f229f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f230h;

    /* renamed from: i, reason: collision with root package name */
    public Object f231i;

    public C0018g0(L l10) {
        this.f225b = l10;
        C0031u c0031u = new C0031u(l10);
        this.f226c = c0031u;
        this.f227d = c0031u;
        B0 b02 = c0031u.f310Y;
        this.f228e = b02;
        this.f229f = b02;
    }

    public C0018g0(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, ha.g gVar) {
        this.f225b = str;
        this.f226c = str2;
        this.f227d = arrayList;
        this.f228e = str3;
        this.f229f = str4;
        this.g = str5;
        this.f230h = str6;
        this.f231i = gVar;
    }

    public static final void a(C0018g0 c0018g0, c0.l lVar, n0 n0Var) {
        c0018g0.getClass();
        for (c0.l lVar2 = lVar.f14117e; lVar2 != null; lVar2 = lVar2.f14117e) {
            if (lVar2 == i0.f239a) {
                L t5 = ((L) c0018g0.f225b).t();
                n0Var.f275B = t5 != null ? (C0031u) t5.f60S.f226c : null;
                c0018g0.f227d = n0Var;
                return;
            } else {
                if ((lVar2.f14115c & 2) != 0) {
                    return;
                }
                lVar2.o0(n0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c0.l, A0.d] */
    public static c0.l b(c0.k kVar, c0.l lVar) {
        c0.l lVar2;
        if (kVar instanceof AbstractC0012d0) {
            lVar2 = ((AbstractC0012d0) kVar).d();
            lVar2.f14115c = o0.f(lVar2);
        } else {
            ?? lVar3 = new c0.l();
            lVar3.f14115c = o0.d(kVar);
            lVar3.f199C = kVar;
            lVar3.f200D = new HashSet();
            lVar2 = lVar3;
        }
        if (lVar2.f14112B) {
            AbstractC2256a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        lVar2.f14121w = true;
        c0.l lVar4 = lVar.f14118f;
        if (lVar4 != null) {
            lVar4.f14117e = lVar2;
            lVar2.f14118f = lVar4;
        }
        lVar.f14118f = lVar2;
        lVar2.f14117e = lVar;
        return lVar2;
    }

    public static c0.l c(c0.l lVar) {
        boolean z8 = lVar.f14112B;
        if (z8) {
            C2041D c2041d = o0.f294a;
            if (!z8) {
                AbstractC2256a.b("autoInvalidateRemovedNode called on unattached node");
            }
            o0.a(lVar, -1, 2);
            lVar.m0();
            lVar.g0();
        }
        c0.l lVar2 = lVar.f14118f;
        c0.l lVar3 = lVar.f14117e;
        if (lVar2 != null) {
            lVar2.f14117e = lVar3;
            lVar.f14118f = null;
        }
        if (lVar3 != null) {
            lVar3.f14118f = lVar2;
            lVar.f14117e = null;
        }
        kotlin.jvm.internal.l.b(lVar3);
        return lVar3;
    }

    public static void i(c0.k kVar, c0.k kVar2, c0.l lVar) {
        if ((kVar instanceof AbstractC0012d0) && (kVar2 instanceof AbstractC0012d0)) {
            h0 h0Var = i0.f239a;
            kotlin.jvm.internal.l.c(lVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0012d0) kVar2).e(lVar);
            if (lVar.f14112B) {
                o0.c(lVar);
                return;
            } else {
                lVar.f14122x = true;
                return;
            }
        }
        if (!(lVar instanceof C0011d)) {
            AbstractC2256a.b("Unknown Modifier.Node type");
            return;
        }
        C0011d c0011d = (C0011d) lVar;
        if (c0011d.f14112B) {
            c0011d.r0();
        }
        c0011d.f199C = kVar2;
        c0011d.f14115c = o0.d(kVar2);
        if (c0011d.f14112B) {
            c0011d.p0(false);
        }
        if (lVar.f14112B) {
            o0.c(lVar);
        } else {
            lVar.f14122x = true;
        }
    }

    public boolean d(int i7) {
        return (i7 & ((c0.l) this.f229f).f14116d) != 0;
    }

    public void e() {
        C0031u c0031u;
        n0 n0Var = (n0) this.f227d;
        while (true) {
            c0031u = (C0031u) this.f226c;
            if (n0Var == c0031u) {
                break;
            }
            n0Var.D0();
            n0Var = n0Var.f274A;
            kotlin.jvm.internal.l.b(n0Var);
        }
        c0031u.D0();
        for (c0.l lVar = (c0.l) this.f229f; lVar != null; lVar = lVar.f14118f) {
            lVar.l0();
            if (lVar.f14121w) {
                C2041D c2041d = o0.f294a;
                if (!lVar.f14112B) {
                    AbstractC2256a.b("autoInvalidateInsertedNode called on unattached node");
                }
                o0.a(lVar, -1, 1);
            }
            if (lVar.f14122x) {
                o0.c(lVar);
            }
            lVar.f14121w = false;
            lVar.f14122x = false;
        }
    }

    public void f() {
        for (c0.l lVar = (B0) this.f228e; lVar != null; lVar = lVar.f14117e) {
            if (lVar.f14112B) {
                lVar.m0();
            }
        }
        n0 n0Var = (n0) this.f227d;
        n0 n0Var2 = (C0031u) this.f226c;
        while (n0Var2 != n0Var) {
            s0 s0Var = n0Var2.f292T;
            if (s0Var != null) {
                s0Var.destroy();
            }
            n0Var2.f292T = null;
            n0Var2 = n0Var2.f275B;
            kotlin.jvm.internal.l.b(n0Var2);
        }
        s0 s0Var2 = n0Var.f292T;
        if (s0Var2 != null) {
            s0Var2.destroy();
        }
        n0Var.f292T = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b4, code lost:
    
        if (r14 <= r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b6, code lost:
    
        r24 = r12;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c4, code lost:
    
        if (r0.a(r5 - 1, r14 - 1) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
    
        r5 = r5 - 1;
        r14 = r14 - 1;
        r12 = r24;
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d2, code lost:
    
        r9[r18 + r2] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d6, code lost:
    
        if (r1 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        r12 = r20 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01da, code lost:
    
        if (r12 < r7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01dc, code lost:
    
        if (r12 > r3) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e2, code lost:
    
        if (r8[r18 + r12] < r5) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e4, code lost:
    
        r12 = 0;
        r10[0] = r5;
        r1 = 1;
        r10[1] = r14;
        r2 = 2;
        r10[2] = r4;
        r3 = 3;
        r10[3] = r15;
        r10[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027b, code lost:
    
        r2 = r2 + 2;
        r21 = r21;
        r26 = r26;
        r12 = r24;
        r13 = r25;
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ce, code lost:
    
        r24 = r12;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ad, code lost:
    
        r24 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a7, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0197, code lost:
    
        r4 = r9[(r2 + 1) + r18];
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028f, code lost:
    
        r3 = r3 + r19;
        r7 = r31;
        r15 = r33;
        r13 = r13;
        r1 = r22;
        r2 = r23;
        r14 = r32;
        r5 = r21;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0177, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d0, code lost:
    
        if (r8[(r15 + 1) + r18] > r8[(r15 - 1) + r18]) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0166, code lost:
    
        r22 = r1;
        r23 = r2;
        r26 = r4;
        r21 = r5;
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0172, code lost:
    
        if ((r20 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0174, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0179, code lost:
    
        if (r2 > r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017b, code lost:
    
        if (r2 == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017d, code lost:
    
        if (r2 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018b, code lost:
    
        if (r9[(r2 + 1) + r18] >= r9[(r2 - 1) + r18]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018e, code lost:
    
        r4 = r9[(r2 - 1) + r18];
        r5 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019e, code lost:
    
        r14 = r12 - ((r13 - r5) - r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a3, code lost:
    
        if (r3 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a8, code lost:
    
        if (r5 != r4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01aa, code lost:
    
        r24 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01af, code lost:
    
        r15 = (r15 & r24) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b2, code lost:
    
        if (r5 <= r11) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(int i7, S.e eVar, S.e eVar2, c0.l lVar, boolean z8) {
        int i10;
        C0018g0 c0018g0;
        int i11;
        int i12;
        int i13;
        int i14;
        C0032v c0032v;
        C0032v c0032v2;
        int i15;
        int i16;
        C0032v c0032v3;
        C0032v c0032v4;
        int i17;
        int i18;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22 = 1;
        C0016f0 c0016f0 = (C0016f0) this.f231i;
        if (c0016f0 == null) {
            C0016f0 c0016f02 = new C0016f0(this, lVar, i7, eVar, eVar2, z8);
            this.f231i = c0016f02;
            c0016f0 = c0016f02;
        } else {
            c0016f0.f219d = lVar;
            c0016f0.f217b = i7;
            c0016f0.f220e = eVar;
            c0016f0.f221f = eVar2;
            c0016f0.f218c = z8;
        }
        int i23 = eVar.f8961c - i7;
        int i24 = eVar2.f8961c - i7;
        int i25 = ((i23 + i24) + 1) / 2;
        C0032v c0032v5 = new C0032v(i25 * 3);
        C0032v c0032v6 = new C0032v(i25 * 4);
        c0032v6.e(0, i23, 0, i24);
        int i26 = (i25 * 2) + 1;
        int[] iArr = new int[i26];
        int[] iArr2 = new int[i26];
        int[] iArr3 = new int[5];
        while (true) {
            int i27 = c0032v6.f313b;
            if (i27 == 0) {
                break;
            }
            int[] iArr4 = c0032v6.f312a;
            int i28 = i27 - 1;
            c0032v6.f313b = i28;
            int i29 = iArr4[i28];
            int i30 = i27 - 2;
            c0032v6.f313b = i30;
            int i31 = iArr4[i30];
            int i32 = i27 - 3;
            c0032v6.f313b = i32;
            int i33 = iArr4[i32];
            int i34 = i27 - 4;
            c0032v6.f313b = i34;
            int i35 = iArr4[i34];
            int i36 = i33 - i35;
            int i37 = i29 - i31;
            if (i36 < i22 || i37 < i22) {
                i12 = i23;
                i13 = i24;
                i14 = i26;
            } else {
                int i38 = ((i36 + i37) + 1) / 2;
                int i39 = i26 / 2;
                i14 = i26;
                int i40 = i39 + 1;
                iArr[i40] = i35;
                iArr2[i40] = i33;
                int i41 = 0;
                while (i41 < i38) {
                    int i42 = i36 - i37;
                    int i43 = i37;
                    int i44 = i36;
                    boolean z11 = (Math.abs(i42) & 1) == 1;
                    int i45 = -i41;
                    int i46 = i38;
                    int i47 = i45;
                    while (true) {
                        if (i47 > i41) {
                            break;
                        }
                        if (i47 != i45) {
                            if (i47 != i41) {
                                i15 = i23;
                                i16 = i24;
                            } else {
                                i15 = i23;
                                i16 = i24;
                            }
                            i19 = iArr[(i47 - 1) + i39];
                            i20 = i19 + 1;
                            int i48 = ((i20 - i35) + i31) - i47;
                            int i49 = i48 - ((i41 == 0 ? 1 : 0) & (i20 != i19 ? 1 : 0));
                            c0032v4 = c0032v6;
                            i21 = i48;
                            while (i20 < i33 && i21 < i29 && c0016f0.a(i20, i21)) {
                                i20++;
                                i21++;
                            }
                            iArr[i39 + i47] = i20;
                            if (!z11) {
                                z10 = z11;
                                int i50 = i42 - i47;
                                c0032v3 = c0032v5;
                                if (i50 >= i45 + 1 && i50 <= i41 - 1 && iArr2[i39 + i50] <= i20) {
                                    iArr3[0] = i19;
                                    iArr3[1] = i49;
                                    iArr3[2] = i20;
                                    iArr3[3] = i21;
                                    iArr3[4] = 0;
                                    c12 = 2;
                                    i17 = i29;
                                    i18 = i33;
                                    c11 = 1;
                                    c13 = 3;
                                    c10 = 0;
                                    break;
                                }
                            } else {
                                c0032v3 = c0032v5;
                                z10 = z11;
                            }
                            i47 += 2;
                            c0032v6 = c0032v4;
                            i23 = i15;
                            i24 = i16;
                            z11 = z10;
                            c0032v5 = c0032v3;
                        } else {
                            i15 = i23;
                            i16 = i24;
                        }
                        i19 = iArr[i47 + 1 + i39];
                        i20 = i19;
                        int i482 = ((i20 - i35) + i31) - i47;
                        int i492 = i482 - ((i41 == 0 ? 1 : 0) & (i20 != i19 ? 1 : 0));
                        c0032v4 = c0032v6;
                        i21 = i482;
                        while (i20 < i33) {
                            i20++;
                            i21++;
                        }
                        iArr[i39 + i47] = i20;
                        if (!z11) {
                        }
                        i47 += 2;
                        c0032v6 = c0032v4;
                        i23 = i15;
                        i24 = i16;
                        z11 = z10;
                        c0032v5 = c0032v3;
                    }
                    if (Math.min(iArr3[c12] - iArr3[c10], iArr3[c13] - iArr3[c11]) > 0) {
                        int i51 = iArr3[c10];
                        int i52 = iArr3[c11];
                        int i53 = iArr3[c13] - i52;
                        int i54 = iArr3[2] - i51;
                        if (i53 != i54) {
                            i54 = Math.min(i54, i53);
                            int i55 = iArr3[4];
                            int i56 = i55 != 0 ? 1 : 0;
                            int i57 = iArr3[c13];
                            c14 = 1;
                            int i58 = iArr3[1];
                            int i59 = i57 - i58;
                            int i60 = iArr3[2];
                            int i61 = iArr3[0];
                            i51 += ((i59 > i60 - i61 ? 1 : 0) | i56) ^ 1;
                            i52 += ((i55 != 0 ? 1 : 0) | ((i57 - i58 > i60 - i61 ? 1 : 0) ^ 1)) ^ 1;
                        } else {
                            c14 = 1;
                        }
                        c0032v = c0032v3;
                        c0032v.d(i51, i52, i54);
                        c15 = 0;
                    } else {
                        c14 = c11;
                        c0032v = c0032v3;
                        c15 = c10;
                    }
                    c0032v2 = c0032v4;
                    c0032v2.e(i35, iArr3[c15], i31, iArr3[c14]);
                    c0032v2.e(iArr3[2], i18, iArr3[3], i17);
                    i26 = i14;
                    i23 = i15;
                    i24 = i16;
                    i22 = 1;
                    C0032v c0032v7 = c0032v;
                    c0032v6 = c0032v2;
                    c0032v5 = c0032v7;
                }
                i12 = i23;
                i13 = i24;
            }
            C0032v c0032v8 = c0032v6;
            c0032v = c0032v5;
            c0032v2 = c0032v8;
            i26 = i14;
            i23 = i12;
            i24 = i13;
            i22 = 1;
            C0032v c0032v72 = c0032v;
            c0032v6 = c0032v2;
            c0032v5 = c0032v72;
        }
        int i62 = i23;
        int i63 = i24;
        C0032v c0032v9 = c0032v5;
        int i64 = c0032v9.f313b;
        if (i64 % 3 != 0) {
            AbstractC2256a.b("Array size not a multiple of 3");
        }
        if (i64 > 3) {
            i10 = 0;
            c0032v9.f(0, i64 - 3);
        } else {
            i10 = 0;
        }
        c0032v9.d(i62, i63, i10);
        int i65 = i10;
        int i66 = i65;
        int i67 = i66;
        while (i65 < c0032v9.f313b) {
            int[] iArr5 = c0032v9.f312a;
            int i68 = iArr5[i65];
            int i69 = iArr5[i65 + 2];
            int i70 = i68 - i69;
            int i71 = iArr5[i65 + 1] - i69;
            i65 += 3;
            while (true) {
                c0018g0 = (C0018g0) c0016f0.g;
                if (i66 >= i70) {
                    break;
                }
                c0.l lVar2 = ((c0.l) c0016f0.f219d).f14118f;
                kotlin.jvm.internal.l.b(lVar2);
                c0018g0.getClass();
                if ((lVar2.f14115c & 2) != 0) {
                    n0 n0Var = lVar2.f14120v;
                    kotlin.jvm.internal.l.b(n0Var);
                    n0 n0Var2 = n0Var.f275B;
                    n0 n0Var3 = n0Var.f274A;
                    kotlin.jvm.internal.l.b(n0Var3);
                    if (n0Var2 != null) {
                        n0Var2.f274A = n0Var3;
                    }
                    n0Var3.f275B = n0Var2;
                    a(c0018g0, (c0.l) c0016f0.f219d, n0Var3);
                }
                c0016f0.f219d = c(lVar2);
                i66++;
            }
            while (i67 < i71) {
                int i72 = c0016f0.f217b + i67;
                c0.l lVar3 = (c0.l) c0016f0.f219d;
                c0.k kVar = (c0.k) ((S.e) c0016f0.f221f).f8959a[i72];
                c0018g0.getClass();
                c0.l b2 = b(kVar, lVar3);
                c0016f0.f219d = b2;
                if (c0016f0.f218c) {
                    c0.l lVar4 = b2.f14118f;
                    kotlin.jvm.internal.l.b(lVar4);
                    n0 n0Var4 = lVar4.f14120v;
                    kotlin.jvm.internal.l.b(n0Var4);
                    InterfaceC0035y f4 = AbstractC0017g.f((c0.l) c0016f0.f219d);
                    if (f4 != null) {
                        A a9 = new A((L) c0018g0.f225b, f4);
                        ((c0.l) c0016f0.f219d).o0(a9);
                        a(c0018g0, (c0.l) c0016f0.f219d, a9);
                        a9.f275B = n0Var4.f275B;
                        a9.f274A = n0Var4;
                        n0Var4.f275B = a9;
                    } else {
                        ((c0.l) c0016f0.f219d).o0(n0Var4);
                    }
                    ((c0.l) c0016f0.f219d).f0();
                    ((c0.l) c0016f0.f219d).l0();
                    c0.l lVar5 = (c0.l) c0016f0.f219d;
                    C2041D c2041d = o0.f294a;
                    if (!lVar5.f14112B) {
                        AbstractC2256a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    i11 = 1;
                    o0.a(lVar5, -1, 1);
                } else {
                    i11 = 1;
                    b2.f14121w = true;
                }
                i67 += i11;
            }
            while (true) {
                int i73 = i69 - 1;
                if (i69 > 0) {
                    c0.l lVar6 = ((c0.l) c0016f0.f219d).f14118f;
                    kotlin.jvm.internal.l.b(lVar6);
                    c0016f0.f219d = lVar6;
                    S.e eVar3 = (S.e) c0016f0.f220e;
                    int i74 = c0016f0.f217b;
                    c0.k kVar2 = (c0.k) eVar3.f8959a[i74 + i66];
                    c0.k kVar3 = (c0.k) ((S.e) c0016f0.f221f).f8959a[i74 + i67];
                    if (kotlin.jvm.internal.l.a(kVar2, kVar3)) {
                        c0018g0.getClass();
                    } else {
                        c0.l lVar7 = (c0.l) c0016f0.f219d;
                        c0018g0.getClass();
                        i(kVar2, kVar3, lVar7);
                    }
                    i66++;
                    i67++;
                    i69 = i73;
                }
            }
        }
        int i75 = i10;
        for (c0.l lVar8 = ((B0) this.f228e).f14117e; lVar8 != null && lVar8 != i0.f239a; lVar8 = lVar8.f14117e) {
            i75 |= lVar8.f14115c;
            lVar8.f14116d = i75;
        }
    }

    public void h() {
        L l10;
        A a9;
        c0.l lVar = ((B0) this.f228e).f14117e;
        n0 n0Var = (C0031u) this.f226c;
        c0.l lVar2 = lVar;
        while (true) {
            l10 = (L) this.f225b;
            if (lVar2 == null) {
                break;
            }
            InterfaceC0035y f4 = AbstractC0017g.f(lVar2);
            if (f4 != null) {
                n0 n0Var2 = lVar2.f14120v;
                if (n0Var2 != null) {
                    A a10 = (A) n0Var2;
                    InterfaceC0035y interfaceC0035y = a10.f9Y;
                    a10.P0(f4);
                    a9 = a10;
                    if (interfaceC0035y != lVar2) {
                        s0 s0Var = a10.f292T;
                        a9 = a10;
                        if (s0Var != null) {
                            s0Var.invalidate();
                            a9 = a10;
                        }
                    }
                } else {
                    A a11 = new A(l10, f4);
                    lVar2.o0(a11);
                    a9 = a11;
                }
                n0Var.f275B = a9;
                a9.f274A = n0Var;
                n0Var = a9;
            } else {
                lVar2.o0(n0Var);
            }
            lVar2 = lVar2.f14117e;
        }
        L t5 = l10.t();
        n0Var.f275B = t5 != null ? (C0031u) t5.f60S.f226c : null;
        this.f227d = n0Var;
    }

    public String toString() {
        switch (this.f224a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                c0.l lVar = (c0.l) this.f229f;
                B0 b02 = (B0) this.f228e;
                if (lVar == b02) {
                    sb2.append("]");
                } else {
                    while (true) {
                        if (lVar != null && lVar != b02) {
                            sb2.append(String.valueOf(lVar));
                            if (lVar.f14118f == b02) {
                                sb2.append("]");
                            } else {
                                sb2.append(",");
                                lVar = lVar.f14118f;
                            }
                        }
                    }
                }
                String sb3 = sb2.toString();
                kotlin.jvm.internal.l.d(sb3, "toString(...)");
                return sb3;
            default:
                return super.toString();
        }
    }
}
