package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import d1.C1040c;
import d1.d;
import d1.e;
import d1.f;
import d1.g;
import d1.h;
import d1.i;
import e1.b;
import g1.q;
import g1.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Flow extends s {

    /* renamed from: x, reason: collision with root package name */
    public final g f13217x;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [d1.i, d1.g] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17230a = new int[32];
        this.f17236u = new HashMap();
        this.f17232c = context;
        super.g(attributeSet);
        ?? iVar = new i();
        iVar.f16467s0 = 0;
        iVar.f16468t0 = 0;
        iVar.f16469u0 = 0;
        iVar.f16470v0 = 0;
        iVar.f16471w0 = 0;
        iVar.f16472x0 = 0;
        iVar.f16473y0 = false;
        iVar.f16474z0 = 0;
        iVar.f16440A0 = 0;
        iVar.f16441B0 = new Object();
        iVar.C0 = null;
        iVar.f16442D0 = -1;
        iVar.f16443E0 = -1;
        iVar.f16444F0 = -1;
        iVar.f16445G0 = -1;
        iVar.f16446H0 = -1;
        iVar.f16447I0 = -1;
        iVar.f16448J0 = 0.5f;
        iVar.f16449K0 = 0.5f;
        iVar.f16450L0 = 0.5f;
        iVar.f16451M0 = 0.5f;
        iVar.f16452N0 = 0.5f;
        iVar.f16453O0 = 0.5f;
        iVar.f16454P0 = 0;
        iVar.f16455Q0 = 0;
        iVar.f16456R0 = 2;
        iVar.f16457S0 = 2;
        iVar.f16458T0 = 0;
        iVar.f16459U0 = -1;
        iVar.f16460V0 = 0;
        iVar.f16461W0 = new ArrayList();
        iVar.f16462X0 = null;
        iVar.f16463Y0 = null;
        iVar.f16464Z0 = null;
        iVar.f16466b1 = 0;
        this.f13217x = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f17423b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 0) {
                    this.f13217x.f16460V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f13217x;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f16467s0 = dimensionPixelSize;
                    gVar.f16468t0 = dimensionPixelSize;
                    gVar.f16469u0 = dimensionPixelSize;
                    gVar.f16470v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f13217x;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f16469u0 = dimensionPixelSize2;
                    gVar2.f16471w0 = dimensionPixelSize2;
                    gVar2.f16472x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f13217x.f16470v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f13217x.f16471w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f13217x.f16467s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f13217x.f16472x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f13217x.f16468t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f13217x.f16458T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f13217x.f16442D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f13217x.f16443E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f13217x.f16444F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f13217x.f16446H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f13217x.f16445G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f13217x.f16447I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f13217x.f16448J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f13217x.f16450L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f13217x.f16452N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f13217x.f16451M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f13217x.f16453O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f13217x.f16449K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f13217x.f16456R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f13217x.f16457S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f13217x.f16454P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f13217x.f16455Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f13217x.f16459U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f17233d = this.f13217x;
        i();
    }

    @Override // g1.c
    public final void h(d dVar, boolean z8) {
        g gVar = this.f13217x;
        int i7 = gVar.f16469u0;
        if (i7 > 0 || gVar.f16470v0 > 0) {
            if (z8) {
                gVar.f16471w0 = gVar.f16470v0;
                gVar.f16472x0 = i7;
            } else {
                gVar.f16471w0 = i7;
                gVar.f16472x0 = gVar.f16470v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0793  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // g1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        f fVar;
        char c10;
        ?? r22;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        d[] dVarArr;
        int i25;
        int i26;
        ArrayList arrayList;
        int[] iArr3;
        d dVar;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        d dVar2;
        int i32;
        int i33;
        int i34;
        int i35;
        d dVar3;
        int i36;
        int i37;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f16482r0 > 0) {
            d dVar4 = gVar.f16358T;
            g1.f fVar2 = dVar4 != null ? ((e) dVar4).f16419u0 : null;
            if (fVar2 == null) {
                gVar.f16474z0 = 0;
                gVar.f16440A0 = 0;
                gVar.f16473y0 = false;
                setMeasuredDimension(gVar.f16474z0, gVar.f16440A0);
            }
            for (int i38 = 0; i38 < gVar.f16482r0; i38++) {
                d dVar5 = gVar.f16481q0[i38];
                if (dVar5 != null && !(dVar5 instanceof h)) {
                    int j = dVar5.j(0);
                    int j10 = dVar5.j(1);
                    if (j != 3 || dVar5.f16395r == 1 || j10 != 3 || dVar5.f16396s == 1) {
                        if (j == 3) {
                            j = 2;
                        }
                        if (j10 == 3) {
                            j10 = 2;
                        }
                        b bVar = gVar.f16441B0;
                        bVar.f16663a = j;
                        bVar.f16664b = j10;
                        bVar.f16665c = dVar5.q();
                        bVar.f16666d = dVar5.k();
                        fVar2.b(dVar5, bVar);
                        dVar5.O(bVar.f16667e);
                        dVar5.L(bVar.f16668f);
                        dVar5.I(bVar.g);
                    }
                }
            }
        }
        int i39 = gVar.f16471w0;
        int i40 = gVar.f16472x0;
        int i41 = gVar.f16467s0;
        int i42 = gVar.f16468t0;
        int[] iArr4 = new int[2];
        int i43 = (size - i39) - i40;
        int i44 = gVar.f16460V0;
        if (i44 == 1) {
            i43 = (size2 - i41) - i42;
        }
        int i45 = i43;
        if (i44 == 0) {
            if (gVar.f16442D0 == -1) {
                gVar.f16442D0 = 0;
            }
            if (gVar.f16443E0 == -1) {
                gVar.f16443E0 = 0;
            }
        } else {
            if (gVar.f16442D0 == -1) {
                gVar.f16442D0 = 0;
            }
            if (gVar.f16443E0 == -1) {
                gVar.f16443E0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f16481q0;
        int i46 = 0;
        int i47 = 0;
        while (true) {
            i11 = gVar.f16482r0;
            if (i46 >= i11) {
                break;
            }
            if (gVar.f16481q0[i46].f16377g0 == 8) {
                i47++;
            }
            i46++;
        }
        if (i47 > 0) {
            dVarArr2 = new d[i11 - i47];
            int i48 = 0;
            i11 = 0;
            while (i48 < gVar.f16482r0) {
                d dVar6 = gVar.f16481q0[i48];
                int[] iArr5 = iArr4;
                if (dVar6.f16377g0 != 8) {
                    dVarArr2[i11] = dVar6;
                    i11++;
                }
                i48++;
                iArr4 = iArr5;
            }
        }
        int[] iArr6 = iArr4;
        int i49 = i11;
        d[] dVarArr3 = dVarArr2;
        gVar.f16465a1 = dVarArr3;
        gVar.f16466b1 = i49;
        int i50 = gVar.f16458T0;
        ArrayList arrayList2 = gVar.f16461W0;
        if (i50 != 0) {
            C1040c c1040c = gVar.f16349J;
            C1040c c1040c2 = gVar.f16348I;
            C1040c c1040c3 = gVar.f16350K;
            C1040c c1040c4 = gVar.L;
            int[] iArr7 = gVar.f16393p0;
            if (i50 == 1) {
                i12 = i42;
                i13 = i41;
                i14 = i40;
                i15 = i39;
                i16 = mode;
                i17 = size;
                i18 = mode2;
                i19 = size2;
                iArr = iArr6;
                ArrayList arrayList3 = arrayList2;
                int i51 = gVar.f16460V0;
                if (i49 != 0) {
                    arrayList3.clear();
                    f fVar3 = new f(gVar, i51, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i45);
                    arrayList3.add(fVar3);
                    if (i51 == 0) {
                        f fVar4 = fVar3;
                        i24 = 0;
                        int i52 = 0;
                        int i53 = 0;
                        while (i53 < i49) {
                            d dVar7 = dVarArr3[i53];
                            int U8 = gVar.U(dVar7, i45);
                            if (dVar7.f16393p0[0] == 3) {
                                i24++;
                            }
                            int i54 = i24;
                            boolean z8 = (i52 == i45 || (gVar.f16454P0 + i52) + U8 > i45) && fVar4.f16426b != null;
                            if (!z8 && i53 > 0 && (i28 = gVar.f16459U0) > 0 && i53 % i28 == 0) {
                                z8 = true;
                            }
                            if (z8) {
                                iArr3 = iArr7;
                                dVar = dVar7;
                                i27 = i51;
                                f fVar5 = new f(gVar, i51, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i45);
                                fVar5.f16435n = i53;
                                arrayList3.add(fVar5);
                                fVar4 = fVar5;
                            } else {
                                iArr3 = iArr7;
                                dVar = dVar7;
                                i27 = i51;
                                if (i53 > 0) {
                                    i52 = gVar.f16454P0 + U8 + i52;
                                    fVar4.a(dVar);
                                    i53++;
                                    i24 = i54;
                                    iArr7 = iArr3;
                                    i51 = i27;
                                }
                            }
                            i52 = U8;
                            fVar4.a(dVar);
                            i53++;
                            i24 = i54;
                            iArr7 = iArr3;
                            i51 = i27;
                        }
                        iArr2 = iArr7;
                        i23 = i51;
                    } else {
                        iArr2 = iArr7;
                        i23 = i51;
                        f fVar6 = fVar3;
                        int i55 = 0;
                        i24 = 0;
                        int i56 = 0;
                        while (i55 < i49) {
                            d dVar8 = dVarArr3[i55];
                            int T10 = gVar.T(dVar8, i45);
                            if (dVar8.f16393p0[1] == 3) {
                                i24++;
                            }
                            int i57 = i24;
                            boolean z10 = (i56 == i45 || (gVar.f16455Q0 + i56) + T10 > i45) && fVar6.f16426b != null;
                            if (!z10 && i55 > 0 && (i25 = gVar.f16459U0) > 0 && i55 % i25 == 0) {
                                z10 = true;
                            }
                            if (z10) {
                                dVarArr = dVarArr3;
                                f fVar7 = new f(gVar, i23, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i45);
                                fVar7.f16435n = i55;
                                arrayList3.add(fVar7);
                                i56 = T10;
                                fVar6 = fVar7;
                            } else {
                                dVarArr = dVarArr3;
                                i56 = i55 > 0 ? gVar.f16455Q0 + T10 + i56 : T10;
                            }
                            fVar6.a(dVar8);
                            i55++;
                            i24 = i57;
                            dVarArr3 = dVarArr;
                        }
                    }
                    int size3 = arrayList3.size();
                    int i58 = gVar.f16471w0;
                    int i59 = gVar.f16467s0;
                    int i60 = gVar.f16472x0;
                    int i61 = gVar.f16468t0;
                    boolean z11 = iArr2[0] == 2 || iArr2[1] == 2;
                    if (i24 > 0 && z11) {
                        for (int i62 = 0; i62 < size3; i62++) {
                            f fVar8 = (f) arrayList3.get(i62);
                            if (i23 == 0) {
                                fVar8.e(i45 - fVar8.d());
                            } else {
                                fVar8.e(i45 - fVar8.c());
                            }
                        }
                    }
                    int i63 = i59;
                    C1040c c1040c5 = c1040c2;
                    C1040c c1040c6 = c1040c3;
                    C1040c c1040c7 = c1040c4;
                    int i64 = 0;
                    int i65 = 0;
                    int i66 = 0;
                    int i67 = i58;
                    C1040c c1040c8 = c1040c;
                    while (i64 < size3) {
                        f fVar9 = (f) arrayList3.get(i64);
                        if (i23 == 0) {
                            if (i64 < size3 - 1) {
                                c1040c7 = ((f) arrayList3.get(i64 + 1)).f16426b.f16349J;
                                arrayList = arrayList3;
                                i61 = 0;
                            } else {
                                i61 = gVar.f16468t0;
                                arrayList = arrayList3;
                                c1040c7 = c1040c4;
                            }
                            C1040c c1040c9 = fVar9.f16426b.L;
                            fVar9.f(i23, c1040c5, c1040c8, c1040c6, c1040c7, i67, i63, i60, i61, i45);
                            int max = Math.max(i65, fVar9.d());
                            int c11 = fVar9.c() + i66;
                            if (i64 > 0) {
                                c11 += gVar.f16455Q0;
                            }
                            i26 = size3;
                            i65 = max;
                            i66 = c11;
                            c1040c8 = c1040c9;
                            arrayList3 = arrayList;
                            i63 = 0;
                        } else {
                            ArrayList arrayList4 = arrayList3;
                            if (i64 < size3 - 1) {
                                arrayList3 = arrayList4;
                                i26 = size3;
                                c1040c6 = ((f) arrayList3.get(i64 + 1)).f16426b.f16348I;
                                i60 = 0;
                            } else {
                                arrayList3 = arrayList4;
                                i60 = gVar.f16472x0;
                                i26 = size3;
                                c1040c6 = c1040c3;
                            }
                            C1040c c1040c10 = fVar9.f16426b.f16350K;
                            fVar9.f(i23, c1040c5, c1040c8, c1040c6, c1040c7, i67, i63, i60, i61, i45);
                            int d10 = fVar9.d() + i65;
                            int max2 = Math.max(i66, fVar9.c());
                            if (i64 > 0) {
                                d10 += gVar.f16454P0;
                            }
                            i65 = d10;
                            i66 = max2;
                            i67 = 0;
                            c1040c5 = c1040c10;
                        }
                        i64++;
                        size3 = i26;
                    }
                    iArr[0] = i65;
                    iArr[1] = i66;
                }
            } else if (i50 != 2) {
                if (i50 == 3) {
                    int i68 = gVar.f16460V0;
                    if (i49 != 0) {
                        arrayList2.clear();
                        i19 = size2;
                        int i69 = i45;
                        iArr = iArr6;
                        i12 = i42;
                        i13 = i41;
                        i14 = i40;
                        i15 = i39;
                        i18 = mode2;
                        f fVar10 = new f(gVar, i68, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i69);
                        arrayList2.add(fVar10);
                        if (i68 == 0) {
                            int i70 = 0;
                            i32 = 0;
                            int i71 = 0;
                            int i72 = 0;
                            while (i72 < i49) {
                                i70++;
                                d dVar9 = dVarArr3[i72];
                                int i73 = i69;
                                int U10 = gVar.U(dVar9, i73);
                                if (dVar9.f16393p0[0] == 3) {
                                    i32++;
                                }
                                int i74 = i32;
                                boolean z12 = (i71 == i73 || (gVar.f16454P0 + i71) + U10 > i73) && fVar10.f16426b != null;
                                if (!z12 && i72 > 0 && (i37 = gVar.f16459U0) > 0 && i70 > i37) {
                                    z12 = true;
                                }
                                if (z12) {
                                    i69 = i73;
                                    i35 = size;
                                    dVar3 = dVar9;
                                    i34 = mode;
                                    i36 = i72;
                                    fVar10 = new f(gVar, i68, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i69);
                                    fVar10.f16435n = i36;
                                    arrayList2.add(fVar10);
                                    i71 = U10;
                                    i70 = 1;
                                } else {
                                    i69 = i73;
                                    i34 = mode;
                                    i35 = size;
                                    dVar3 = dVar9;
                                    i36 = i72;
                                    i71 = i36 > 0 ? gVar.f16454P0 + U10 + i71 : U10;
                                }
                                fVar10.a(dVar3);
                                i72 = i36 + 1;
                                i32 = i74;
                                size = i35;
                                mode = i34;
                            }
                            i16 = mode;
                            i17 = size;
                        } else {
                            i16 = mode;
                            i17 = size;
                            int i75 = 0;
                            i32 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            while (i77 < i49) {
                                i75++;
                                d dVar10 = dVarArr3[i77];
                                int i78 = i69;
                                int T11 = gVar.T(dVar10, i78);
                                if (dVar10.f16393p0[1] == 3) {
                                    i32++;
                                }
                                int i79 = i32;
                                boolean z13 = (i76 == i78 || (gVar.f16455Q0 + i76) + T11 > i78) && fVar10.f16426b != null;
                                if (!z13 && i77 > 0 && (i33 = gVar.f16459U0) > 0 && i75 > i33) {
                                    z13 = true;
                                }
                                if (z13) {
                                    i69 = i78;
                                    fVar10 = new f(gVar, i68, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i78);
                                    fVar10.f16435n = i77;
                                    arrayList2.add(fVar10);
                                    i76 = T11;
                                    i75 = 1;
                                } else {
                                    i69 = i78;
                                    i76 = i77 > 0 ? gVar.f16455Q0 + T11 + i76 : T11;
                                }
                                fVar10.a(dVar10);
                                i77++;
                                i32 = i79;
                            }
                        }
                        int size4 = arrayList2.size();
                        int i80 = gVar.f16471w0;
                        int i81 = gVar.f16467s0;
                        int i82 = gVar.f16472x0;
                        int i83 = gVar.f16468t0;
                        boolean z14 = iArr7[0] == 2 || iArr7[1] == 2;
                        if (i32 > 0 && z14) {
                            for (int i84 = 0; i84 < size4; i84++) {
                                f fVar11 = (f) arrayList2.get(i84);
                                if (i68 == 0) {
                                    fVar11.e(i69 - fVar11.d());
                                } else {
                                    fVar11.e(i69 - fVar11.c());
                                }
                            }
                        }
                        C1040c c1040c11 = c1040c;
                        C1040c c1040c12 = c1040c2;
                        C1040c c1040c13 = c1040c3;
                        C1040c c1040c14 = c1040c4;
                        int i85 = 0;
                        int i86 = 0;
                        for (int i87 = 0; i87 < size4; i87++) {
                            f fVar12 = (f) arrayList2.get(i87);
                            if (i68 == 0) {
                                if (i87 < size4 - 1) {
                                    c1040c14 = ((f) arrayList2.get(i87 + 1)).f16426b.f16349J;
                                    i83 = 0;
                                } else {
                                    i83 = gVar.f16468t0;
                                    c1040c14 = c1040c4;
                                }
                                C1040c c1040c15 = fVar12.f16426b.L;
                                fVar12.f(i68, c1040c12, c1040c11, c1040c13, c1040c14, i80, i81, i82, i83, i69);
                                int max3 = Math.max(i85, fVar12.d());
                                int c12 = fVar12.c() + i86;
                                if (i87 > 0) {
                                    c12 += gVar.f16455Q0;
                                }
                                i85 = max3;
                                i86 = c12;
                                c1040c11 = c1040c15;
                                i81 = 0;
                            } else {
                                if (i87 < size4 - 1) {
                                    c1040c13 = ((f) arrayList2.get(i87 + 1)).f16426b.f16348I;
                                    i82 = 0;
                                } else {
                                    i82 = gVar.f16472x0;
                                    c1040c13 = c1040c3;
                                }
                                C1040c c1040c16 = fVar12.f16426b.f16350K;
                                fVar12.f(i68, c1040c12, c1040c11, c1040c13, c1040c14, i80, i81, i82, i83, i69);
                                int d11 = fVar12.d() + i85;
                                int max4 = Math.max(i86, fVar12.c());
                                if (i87 > 0) {
                                    d11 += gVar.f16454P0;
                                }
                                i85 = d11;
                                i86 = max4;
                                c1040c12 = c1040c16;
                                i80 = 0;
                            }
                        }
                        iArr[0] = i85;
                        iArr[1] = i86;
                    }
                }
                i12 = i42;
                i13 = i41;
                i14 = i40;
                i15 = i39;
                i16 = mode;
                i17 = size;
                i18 = mode2;
                i19 = size2;
                iArr = iArr6;
            } else {
                i12 = i42;
                i13 = i41;
                i14 = i40;
                i15 = i39;
                i16 = mode;
                i17 = size;
                i18 = mode2;
                i19 = size2;
                iArr = iArr6;
                int i88 = i45;
                int i89 = gVar.f16460V0;
                if (i89 == 0) {
                    int i90 = gVar.f16459U0;
                    if (i90 <= 0) {
                        int i91 = 0;
                        int i92 = 0;
                        i31 = 0;
                        while (true) {
                            if (i91 >= i49) {
                                i29 = i88;
                                break;
                            }
                            if (i91 > 0) {
                                i92 += gVar.f16454P0;
                            }
                            d dVar11 = dVarArr3[i91];
                            if (dVar11 == null) {
                                i29 = i88;
                            } else {
                                i29 = i88;
                                int U11 = gVar.U(dVar11, i29) + i92;
                                if (U11 > i29) {
                                    break;
                                }
                                i31++;
                                i92 = U11;
                            }
                            i91++;
                            i88 = i29;
                        }
                    } else {
                        i29 = i88;
                        i31 = i90;
                    }
                    i30 = 0;
                } else {
                    i29 = i88;
                    i30 = gVar.f16459U0;
                    if (i30 <= 0) {
                        int i93 = 0;
                        int i94 = 0;
                        for (int i95 = 0; i95 < i49; i95++) {
                            if (i95 > 0) {
                                i93 += gVar.f16455Q0;
                            }
                            d dVar12 = dVarArr3[i95];
                            if (dVar12 != null) {
                                int T12 = gVar.T(dVar12, i29) + i93;
                                if (T12 > i29) {
                                    break;
                                }
                                i94++;
                                i93 = T12;
                            }
                        }
                        i30 = i94;
                    }
                    i31 = 0;
                }
                if (gVar.f16464Z0 == null) {
                    gVar.f16464Z0 = new int[2];
                }
                boolean z15 = (i30 == 0 && i89 == 1) || (i31 == 0 && i89 == 0);
                while (!z15) {
                    if (i89 == 0) {
                        i30 = (int) Math.ceil(i49 / i31);
                    } else {
                        i31 = (int) Math.ceil(i49 / i30);
                    }
                    d[] dVarArr4 = gVar.f16463Y0;
                    if (dVarArr4 == null || dVarArr4.length < i31) {
                        obj = null;
                        gVar.f16463Y0 = new d[i31];
                    } else {
                        obj = null;
                        Arrays.fill(dVarArr4, (Object) null);
                    }
                    d[] dVarArr5 = gVar.f16462X0;
                    if (dVarArr5 == null || dVarArr5.length < i30) {
                        gVar.f16462X0 = new d[i30];
                    } else {
                        Arrays.fill(dVarArr5, obj);
                    }
                    for (int i96 = 0; i96 < i31; i96++) {
                        for (int i97 = 0; i97 < i30; i97++) {
                            int i98 = (i97 * i31) + i96;
                            if (i89 == 1) {
                                i98 = (i96 * i30) + i97;
                            }
                            if (i98 < dVarArr3.length && (dVar2 = dVarArr3[i98]) != null) {
                                int U12 = gVar.U(dVar2, i29);
                                d dVar13 = gVar.f16463Y0[i96];
                                if (dVar13 == null || dVar13.q() < U12) {
                                    gVar.f16463Y0[i96] = dVar2;
                                }
                                int T13 = gVar.T(dVar2, i29);
                                d dVar14 = gVar.f16462X0[i97];
                                if (dVar14 == null || dVar14.k() < T13) {
                                    gVar.f16462X0[i97] = dVar2;
                                }
                            }
                        }
                    }
                    int i99 = 0;
                    for (int i100 = 0; i100 < i31; i100++) {
                        d dVar15 = gVar.f16463Y0[i100];
                        if (dVar15 != null) {
                            if (i100 > 0) {
                                i99 += gVar.f16454P0;
                            }
                            i99 = gVar.U(dVar15, i29) + i99;
                        }
                    }
                    int i101 = 0;
                    for (int i102 = 0; i102 < i30; i102++) {
                        d dVar16 = gVar.f16462X0[i102];
                        if (dVar16 != null) {
                            if (i102 > 0) {
                                i101 += gVar.f16455Q0;
                            }
                            i101 = gVar.T(dVar16, i29) + i101;
                        }
                    }
                    iArr[0] = i99;
                    iArr[1] = i101;
                    if (i89 == 0) {
                        if (i99 > i29 && i31 > 1) {
                            i31--;
                        }
                        z15 = true;
                    } else {
                        if (i101 > i29 && i30 > 1) {
                            i30--;
                        }
                        z15 = true;
                    }
                }
                int[] iArr8 = gVar.f16464Z0;
                iArr8[0] = i31;
                iArr8[1] = i30;
            }
        } else {
            i12 = i42;
            i13 = i41;
            i14 = i40;
            i15 = i39;
            i16 = mode;
            i17 = size;
            i18 = mode2;
            i19 = size2;
            iArr = iArr6;
            int i103 = gVar.f16460V0;
            if (i49 != 0) {
                if (arrayList2.size() == 0) {
                    fVar = new f(gVar, i103, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, i45);
                    arrayList2.add(fVar);
                } else {
                    fVar = (f) arrayList2.get(0);
                    fVar.f16427c = 0;
                    fVar.f16426b = null;
                    fVar.f16433l = 0;
                    fVar.f16434m = 0;
                    fVar.f16435n = 0;
                    fVar.f16436o = 0;
                    fVar.f16437p = 0;
                    fVar.f(i103, gVar.f16348I, gVar.f16349J, gVar.f16350K, gVar.L, gVar.f16471w0, gVar.f16467s0, gVar.f16472x0, gVar.f16468t0, i45);
                }
                for (int i104 = 0; i104 < i49; i104++) {
                    fVar.a(dVarArr3[i104]);
                }
                c10 = 0;
                iArr[0] = fVar.d();
                r22 = 1;
                iArr[1] = fVar.c();
                int i105 = iArr[c10] + i15 + i14;
                int i106 = iArr[r22] + i13 + i12;
                i20 = i16;
                if (i20 != 1073741824) {
                    i21 = i18;
                    i22 = i17;
                } else {
                    if (i20 == Integer.MIN_VALUE) {
                        i22 = Math.min(i105, i17);
                    } else if (i20 == 0) {
                        i22 = i105;
                    } else {
                        i21 = i18;
                        i22 = 0;
                    }
                    i21 = i18;
                }
                int min = i21 != 1073741824 ? i19 : i21 == Integer.MIN_VALUE ? Math.min(i106, i19) : i21 == 0 ? i106 : 0;
                gVar.f16474z0 = i22;
                gVar.f16440A0 = min;
                gVar.O(i22);
                gVar.L(min);
                gVar.f16473y0 = gVar.f16482r0 <= 0 ? r22 : false;
                setMeasuredDimension(gVar.f16474z0, gVar.f16440A0);
            }
        }
        c10 = 0;
        r22 = 1;
        int i1052 = iArr[c10] + i15 + i14;
        int i1062 = iArr[r22] + i13 + i12;
        i20 = i16;
        if (i20 != 1073741824) {
        }
        if (i21 != 1073741824) {
        }
        gVar.f16474z0 = i22;
        gVar.f16440A0 = min;
        gVar.O(i22);
        gVar.L(min);
        gVar.f16473y0 = gVar.f16482r0 <= 0 ? r22 : false;
        setMeasuredDimension(gVar.f16474z0, gVar.f16440A0);
    }

    @Override // g1.c, android.view.View
    public final void onMeasure(int i7, int i10) {
        j(this.f13217x, i7, i10);
    }

    public void setFirstHorizontalBias(float f4) {
        this.f13217x.f16450L0 = f4;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i7) {
        this.f13217x.f16444F0 = i7;
        requestLayout();
    }

    public void setFirstVerticalBias(float f4) {
        this.f13217x.f16451M0 = f4;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i7) {
        this.f13217x.f16445G0 = i7;
        requestLayout();
    }

    public void setHorizontalAlign(int i7) {
        this.f13217x.f16456R0 = i7;
        requestLayout();
    }

    public void setHorizontalBias(float f4) {
        this.f13217x.f16448J0 = f4;
        requestLayout();
    }

    public void setHorizontalGap(int i7) {
        this.f13217x.f16454P0 = i7;
        requestLayout();
    }

    public void setHorizontalStyle(int i7) {
        this.f13217x.f16442D0 = i7;
        requestLayout();
    }

    public void setLastHorizontalBias(float f4) {
        this.f13217x.f16452N0 = f4;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i7) {
        this.f13217x.f16446H0 = i7;
        requestLayout();
    }

    public void setLastVerticalBias(float f4) {
        this.f13217x.f16453O0 = f4;
        requestLayout();
    }

    public void setLastVerticalStyle(int i7) {
        this.f13217x.f16447I0 = i7;
        requestLayout();
    }

    public void setMaxElementsWrap(int i7) {
        this.f13217x.f16459U0 = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        this.f13217x.f16460V0 = i7;
        requestLayout();
    }

    public void setPadding(int i7) {
        g gVar = this.f13217x;
        gVar.f16467s0 = i7;
        gVar.f16468t0 = i7;
        gVar.f16469u0 = i7;
        gVar.f16470v0 = i7;
        requestLayout();
    }

    public void setPaddingBottom(int i7) {
        this.f13217x.f16468t0 = i7;
        requestLayout();
    }

    public void setPaddingLeft(int i7) {
        this.f13217x.f16471w0 = i7;
        requestLayout();
    }

    public void setPaddingRight(int i7) {
        this.f13217x.f16472x0 = i7;
        requestLayout();
    }

    public void setPaddingTop(int i7) {
        this.f13217x.f16467s0 = i7;
        requestLayout();
    }

    public void setVerticalAlign(int i7) {
        this.f13217x.f16457S0 = i7;
        requestLayout();
    }

    public void setVerticalBias(float f4) {
        this.f13217x.f16449K0 = f4;
        requestLayout();
    }

    public void setVerticalGap(int i7) {
        this.f13217x.f16455Q0 = i7;
        requestLayout();
    }

    public void setVerticalStyle(int i7) {
        this.f13217x.f16443E0 = i7;
        requestLayout();
    }

    public void setWrapMode(int i7) {
        this.f13217x.f16458T0 = i7;
        requestLayout();
    }
}
