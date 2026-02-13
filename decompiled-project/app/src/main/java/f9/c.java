package f9;

import B0.AbstractC0169c;
import P8.j;
import P8.n;
import P8.o;
import P8.p;
import Q7.h;
import e9.AbstractC1101a;
import e9.C1102b;
import e9.C1103c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends AbstractC1101a {
    public static final int[] k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f17021l = {4, 20, 52, 104, 204};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f17022m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    public static final int[][] f17023n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f17024o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    public static final int[][] f17025p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final ArrayList g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f17026h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int[] f17027i = new int[2];
    public boolean j;

    public static n m(List list) {
        AbstractC0169c aVar;
        int size = list.size() * 2;
        int i7 = size - 1;
        if (((C1144a) list.get(list.size() - 1)).f17017b == null) {
            i7 = size - 2;
        }
        V8.a aVar2 = new V8.a(i7 * 12);
        int i10 = ((C1144a) list.get(0)).f17017b.f16814a;
        int i11 = 0;
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & i10) != 0) {
                aVar2.j(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            C1144a c1144a = (C1144a) list.get(i13);
            int i14 = c1144a.f17016a.f16814a;
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & i14) != 0) {
                    aVar2.j(i11);
                }
                i11++;
            }
            C1102b c1102b = c1144a.f17017b;
            if (c1102b != null) {
                for (int i16 = 11; i16 >= 0; i16--) {
                    if (((1 << i16) & c1102b.f16814a) != 0) {
                        aVar2.j(i11);
                    }
                    i11++;
                }
            }
        }
        if (aVar2.d(1)) {
            aVar = new g9.b(aVar2, 2);
        } else if (aVar2.d(2)) {
            int v10 = h.v(1, 4, aVar2);
            if (v10 == 4) {
                aVar = new g9.a(aVar2, 0);
            } else if (v10 != 5) {
                int v11 = h.v(1, 5, aVar2);
                if (v11 == 12) {
                    aVar = new g9.b(aVar2, 0);
                } else if (v11 != 13) {
                    switch (h.v(1, 7, aVar2)) {
                        case 56:
                            aVar = new g9.c(aVar2, "310", "11");
                            break;
                        case 57:
                            aVar = new g9.c(aVar2, "320", "11");
                            break;
                        case 58:
                            aVar = new g9.c(aVar2, "310", "13");
                            break;
                        case 59:
                            aVar = new g9.c(aVar2, "320", "13");
                            break;
                        case 60:
                            aVar = new g9.c(aVar2, "310", "15");
                            break;
                        case 61:
                            aVar = new g9.c(aVar2, "320", "15");
                            break;
                        case 62:
                            aVar = new g9.c(aVar2, "310", "17");
                            break;
                        case 63:
                            aVar = new g9.c(aVar2, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: " + aVar2);
                    }
                } else {
                    aVar = new g9.b(aVar2, 1);
                }
            } else {
                aVar = new g9.a(aVar2, 1);
            }
        } else {
            aVar = new AbstractC0169c(aVar2);
        }
        String k7 = aVar.k();
        p[] pVarArr = ((C1144a) list.get(0)).f17018c.f16818c;
        p[] pVarArr2 = ((C1144a) list.get(list.size() - 1)).f17018c.f16818c;
        n nVar = new n(k7, null, new p[]{pVarArr[0], pVarArr[1], pVarArr2[0], pVarArr2[1]}, P8.a.f8175B);
        nVar.b(o.f8235A, "]e0");
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(ArrayList arrayList, boolean z8) {
        int i7;
        int[][] iArr = f17025p;
        for (int i10 = 0; i10 < 10; i10++) {
            int[] iArr2 = iArr[i10];
            int size = arrayList.size();
            int length = iArr2.length;
            if (!z8) {
                if (size > length) {
                    continue;
                }
                while (i7 < arrayList.size()) {
                }
                return true;
            }
            if (size != length) {
                continue;
            }
            for (i7 = 0; i7 < arrayList.size(); i7++) {
                if (((C1144a) arrayList.get(i7)).f17018c.f16816a != iArr2[i7]) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override // d9.h
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        this.j = false;
        try {
            return m(o(aVar, i7));
        } catch (j unused) {
            this.j = true;
            return m(o(aVar, i7));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.g;
        C1144a c1144a = (C1144a) arrayList.get(0);
        C1102b c1102b = c1144a.f17016a;
        C1102b c1102b2 = c1144a.f17017b;
        if (c1102b2 == null) {
            return false;
        }
        int i7 = 2;
        int i10 = c1102b2.f16815b;
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            C1144a c1144a2 = (C1144a) arrayList.get(i11);
            i10 += c1144a2.f17016a.f16815b;
            int i12 = i7 + 1;
            C1102b c1102b3 = c1144a2.f17017b;
            if (c1102b3 != null) {
                i10 += c1102b3.f16815b;
                i7 += 2;
            } else {
                i7 = i12;
            }
        }
        return ((i7 + (-4)) * 211) + (i10 % 211) == c1102b.f16814a;
    }

    public final List k(int i7, ArrayList arrayList) {
        while (true) {
            ArrayList arrayList2 = this.f17026h;
            if (i7 >= arrayList2.size()) {
                throw j.a();
            }
            C1145b c1145b = (C1145b) arrayList2.get(i7);
            ArrayList arrayList3 = this.g;
            arrayList3.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((C1145b) it.next()).f17019a);
            }
            arrayList3.addAll(c1145b.f17019a);
            if (p(arrayList3, false)) {
                if (j()) {
                    return arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(arrayList);
                arrayList4.add(c1145b);
                try {
                    return k(i7 + 1, arrayList4);
                } catch (j unused) {
                    continue;
                }
            }
            i7++;
        }
    }

    public final List l(boolean z8) {
        ArrayList arrayList = this.f17026h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.g.clear();
        if (z8) {
            Collections.reverse(arrayList);
        }
        try {
            list = k(0, new ArrayList());
        } catch (j unused) {
        }
        if (z8) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    public final C1102b n(V8.a aVar, C1103c c1103c, boolean z8, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int[][] iArr;
        int[] iArr2 = this.f16809b;
        Arrays.fill(iArr2, 0);
        if (z10) {
            d9.h.f(c1103c.f16817b[0], aVar, iArr2);
        } else {
            d9.h.e(c1103c.f16817b[1], aVar, iArr2);
            int i7 = 0;
            for (int length = iArr2.length - 1; i7 < length; length--) {
                int i10 = iArr2[i7];
                iArr2[i7] = iArr2[length];
                iArr2[length] = i10;
                i7++;
            }
        }
        float J10 = O5.b.J(iArr2) / 17;
        int[] iArr3 = c1103c.f16817b;
        float f4 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(J10 - f4) / f4 > 0.3f) {
            throw j.a();
        }
        int i11 = 0;
        while (true) {
            int length2 = iArr2.length;
            float[] fArr = this.f16811d;
            float[] fArr2 = this.f16810c;
            int[] iArr4 = this.f16813f;
            int[] iArr5 = this.f16812e;
            if (i11 >= length2) {
                int J11 = O5.b.J(iArr5);
                int J12 = O5.b.J(iArr4);
                if (J11 > 13) {
                    z11 = false;
                    z12 = true;
                } else if (J11 < 4) {
                    z12 = false;
                    z11 = true;
                } else {
                    z11 = false;
                    z12 = false;
                }
                if (J12 > 13) {
                    z13 = false;
                    z14 = true;
                } else if (J12 < 4) {
                    z14 = false;
                    z13 = true;
                } else {
                    z13 = false;
                    z14 = false;
                }
                int i12 = (J11 + J12) - 17;
                boolean z15 = (J11 & 1) == 1;
                boolean z16 = (J12 & 1) == 0;
                boolean z17 = z11;
                boolean z18 = z12;
                boolean z19 = z13;
                boolean z20 = z14;
                if (i12 != -1) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            throw j.a();
                        }
                        if (z15) {
                            if (z16) {
                                throw j.a();
                            }
                            z18 = true;
                            z17 = z11;
                            z19 = z13;
                            z20 = z14;
                        } else {
                            if (!z16) {
                                throw j.a();
                            }
                            z20 = true;
                            z17 = z11;
                            z18 = z12;
                            z19 = z13;
                        }
                    } else if (z15) {
                        if (!z16) {
                            throw j.a();
                        }
                        if (J11 < J12) {
                            z17 = true;
                            z20 = true;
                            z18 = z12;
                            z19 = z13;
                        } else {
                            z18 = true;
                            z19 = true;
                            z17 = z11;
                            z20 = z14;
                        }
                    } else if (z16) {
                        throw j.a();
                    }
                } else if (z15) {
                    if (z16) {
                        throw j.a();
                    }
                    z17 = true;
                    z18 = z12;
                    z19 = z13;
                    z20 = z14;
                } else {
                    if (!z16) {
                        throw j.a();
                    }
                    z19 = true;
                    z17 = z11;
                    z18 = z12;
                    z20 = z14;
                }
                if (z17) {
                    if (z18) {
                        throw j.a();
                    }
                    AbstractC1101a.h(iArr5, fArr2);
                }
                if (z18) {
                    AbstractC1101a.g(iArr5, fArr2);
                }
                if (z19) {
                    if (z20) {
                        throw j.a();
                    }
                    AbstractC1101a.h(iArr4, fArr2);
                }
                if (z20) {
                    AbstractC1101a.g(iArr4, fArr);
                }
                int i13 = c1103c.f16816a;
                int i14 = (((i13 * 4) + (z8 ? 0 : 2)) + (!z10 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    iArr = f17024o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i13 != 0 || !z8 || !z10) {
                        i15 += iArr5[length3] * iArr[i14][length3 * 2];
                    }
                    i16 += iArr5[length3];
                    length3--;
                }
                int i17 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i13 != 0 || !z8 || !z10) {
                        i17 += iArr4[length4] * iArr[i14][(length4 * 2) + 1];
                    }
                }
                int i18 = i15 + i17;
                if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                    throw j.a();
                }
                int i19 = (13 - i16) / 2;
                int i20 = k[i19];
                return new C1102b((O5.b.t(iArr5, i20, true) * f17021l[i19]) + O5.b.t(iArr4, 9 - i20, false) + f17022m[i19], i18);
            }
            float f10 = (iArr2[i11] * 1.0f) / J10;
            int i21 = (int) (0.5f + f10);
            if (i21 < 1) {
                if (f10 < 0.3f) {
                    throw j.a();
                }
                i21 = 1;
            } else if (i21 > 8) {
                if (f10 > 8.7f) {
                    throw j.a();
                }
                i21 = 8;
            }
            int i22 = i11 / 2;
            if ((i11 & 1) == 0) {
                iArr5[i22] = i21;
                fArr2[i22] = f10 - i21;
            } else {
                iArr4[i22] = i21;
                fArr[i22] = f10 - i21;
            }
            i11++;
        }
    }

    public final List o(V8.a aVar, int i7) {
        boolean z8;
        boolean z10;
        ArrayList arrayList = this.g;
        arrayList.clear();
        boolean z11 = false;
        while (!z11) {
            try {
                arrayList.add(q(aVar, arrayList, i7));
            } catch (j e2) {
                if (arrayList.isEmpty()) {
                    throw e2;
                }
                z11 = true;
            }
        }
        if (j() && p(arrayList, true)) {
            return arrayList;
        }
        ArrayList arrayList2 = this.f17026h;
        boolean isEmpty = arrayList2.isEmpty();
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            if (i10 >= arrayList2.size()) {
                z8 = false;
                break;
            }
            C1145b c1145b = (C1145b) arrayList2.get(i10);
            int i11 = c1145b.f17020b;
            ArrayList arrayList3 = c1145b.f17019a;
            if (i11 > i7) {
                z8 = arrayList3.equals(arrayList);
                break;
            }
            z12 = arrayList3.equals(arrayList);
            i10++;
        }
        if (!z8 && !z12) {
            Iterator it = arrayList2.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                C1145b c1145b2 = (C1145b) it.next();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C1144a c1144a = (C1144a) it2.next();
                    Iterator it3 = c1145b2.f17019a.iterator();
                    while (it3.hasNext()) {
                        if (c1144a.equals((C1144a) it3.next())) {
                            break;
                        }
                    }
                }
                z10 = true;
                break loop2;
            }
            if (!z10) {
                arrayList2.add(i10, new C1145b(i7, arrayList));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C1145b c1145b3 = (C1145b) it4.next();
                    if (c1145b3.f17019a.size() != arrayList.size()) {
                        Iterator it5 = c1145b3.f17019a.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                it4.remove();
                                break;
                            }
                            if (!arrayList.contains((C1144a) it5.next())) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!isEmpty) {
            List l10 = l(false);
            if (l10 != null) {
                return l10;
            }
            List l11 = l(true);
            if (l11 != null) {
                return l11;
            }
        }
        throw j.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021b, code lost:
    
        return new f9.C1144a(r10, r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0215, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c8, code lost:
    
        r4 = r27.f(r27.e(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d3, code lost:
    
        r10 = n(r27, r5, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d7, code lost:
    
        r7 = r25;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01db, code lost:
    
        r4 = r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e2, code lost:
    
        if (r27.d(r4) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e4, code lost:
    
        r4 = r27.e(r27.f(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ed, code lost:
    
        r4 = r27.f(r27.e(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ad, code lost:
    
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b3, code lost:
    
        throw P8.j.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
    
        if (r7 <= r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
    
        r4 = r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
    
        if (r27.d(r4) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        r4 = r27.e(r27.f(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fc, code lost:
    
        if (r28.isEmpty() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020f, code lost:
    
        throw P8.j.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0210, code lost:
    
        r8 = n(r27, r5, r3, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c A[LOOP:0: B:8:0x001c->B:87:0x021c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1144a q(V8.a aVar, ArrayList arrayList, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int f4;
        int i14;
        int i15;
        C1103c c1103c;
        int f10;
        int i16;
        int i17 = 2;
        int i18 = 0;
        int i19 = 1;
        boolean z8 = arrayList.size() % 2 == 0;
        if (this.j) {
            z8 = !z8;
        }
        int i20 = -1;
        boolean z10 = true;
        C1102b c1102b = null;
        while (true) {
            int[] iArr = this.f16808a;
            iArr[i18] = i18;
            iArr[i19] = i18;
            iArr[i17] = i18;
            int i21 = 3;
            iArr[3] = i18;
            int i22 = aVar.f10193b;
            int i23 = i20 >= 0 ? i20 : arrayList.isEmpty() ? i18 : ((C1144a) h3.o.k(i19, arrayList)).f17018c.f16817b[i19];
            int i24 = arrayList.size() % i17 != 0 ? i19 : i18;
            if (this.j) {
                i24 ^= 1;
            }
            boolean z11 = i18;
            while (true) {
                if (i23 >= i22) {
                    break;
                }
                boolean d10 = aVar.d(i23);
                boolean z12 = !d10;
                if (d10) {
                    z11 = z12;
                    break;
                }
                i23++;
                z11 = z12;
            }
            int i25 = i18;
            int i26 = i23;
            while (i23 < i22) {
                if (aVar.d(i23) != z11) {
                    iArr[i25] = iArr[i25] + i19;
                    i10 = i19;
                    i11 = i20;
                    i12 = i21;
                } else {
                    if (i25 == i21) {
                        if (i24 != 0) {
                            int length = iArr.length;
                            for (int i27 = 0; i27 < length / 2; i27++) {
                                int i28 = iArr[i27];
                                int i29 = (length - i27) - 1;
                                iArr[i27] = iArr[i29];
                                iArr[i29] = i28;
                            }
                        }
                        if (AbstractC1101a.i(iArr)) {
                            int[] iArr2 = this.f17027i;
                            iArr2[0] = i26;
                            iArr2[1] = i23;
                            if (z8) {
                                int i30 = i26 - 1;
                                while (i30 >= 0 && !aVar.d(i30)) {
                                    i30--;
                                }
                                i26 = i30 + 1;
                                i14 = iArr2[0] - i26;
                                i13 = 1;
                                f4 = iArr2[1];
                            } else {
                                i13 = 1;
                                f4 = aVar.f(i23 + 1);
                                i14 = f4 - iArr2[1];
                            }
                            int i31 = i26;
                            System.arraycopy(iArr, 0, iArr, i13, iArr.length - i13);
                            iArr[0] = i14;
                            try {
                                int[][] iArr3 = f17023n;
                                int i32 = 0;
                                while (true) {
                                    if (i32 >= 6) {
                                        break;
                                    }
                                    if (d9.h.d(iArr, iArr3[i32], 0.45f) < 0.2f) {
                                        if (!arrayList.isEmpty()) {
                                            int[][] iArr4 = f17025p;
                                            int i33 = 0;
                                            while (i33 < 10) {
                                                int[] iArr5 = iArr4[i33];
                                                if (arrayList.size() + 1 <= iArr5.length) {
                                                    int size = arrayList.size();
                                                    while (size < iArr5.length) {
                                                        int[][] iArr6 = iArr4;
                                                        if (iArr5[size] == i32) {
                                                            int i34 = 0;
                                                            while (i34 < arrayList.size()) {
                                                                i16 = i20;
                                                                if (iArr5[(size - i34) - 1] != ((C1144a) arrayList.get((arrayList.size() - i34) - 1)).f17018c.f16816a) {
                                                                    break;
                                                                }
                                                                i34++;
                                                                i20 = i16;
                                                            }
                                                        } else {
                                                            i16 = i20;
                                                        }
                                                        size++;
                                                        iArr4 = iArr6;
                                                        i20 = i16;
                                                    }
                                                }
                                                i33++;
                                                iArr4 = iArr4;
                                                i20 = i20;
                                            }
                                        }
                                        i15 = i20;
                                        if (!arrayList.isEmpty()) {
                                            int[] iArr7 = ((C1144a) h3.o.k(1, arrayList)).f17018c.f16817b;
                                            int i35 = iArr7[0];
                                            float f11 = ((r7 - i35) / 15.0f) * 17.0f;
                                            float f12 = iArr7[1];
                                            float f13 = f11 * 2.0f;
                                            float f14 = (0.9f * f13) + f12;
                                            float f15 = (f13 * 1.1f) + f12;
                                            float f16 = i31;
                                            if (f16 >= f14) {
                                            }
                                        }
                                        c1103c = new C1103c(i32, i31, f4, i7, new int[]{i31, f4});
                                    } else {
                                        i32++;
                                    }
                                }
                            } catch (j unused) {
                            }
                        } else {
                            i11 = i20;
                            if (i24 != 0) {
                                int length2 = iArr.length;
                                for (int i36 = 0; i36 < length2 / 2; i36++) {
                                    int i37 = iArr[i36];
                                    int i38 = (length2 - i36) - 1;
                                    iArr[i36] = iArr[i38];
                                    iArr[i38] = i37;
                                }
                            }
                            i10 = 1;
                            i26 = iArr[0] + iArr[1] + i26;
                            iArr[0] = iArr[2];
                            i12 = 3;
                            iArr[1] = iArr[3];
                            iArr[2] = 0;
                            iArr[3] = 0;
                            i25--;
                        }
                    } else {
                        i10 = i19;
                        i11 = i20;
                        i12 = i21;
                        i25++;
                    }
                    iArr[i25] = i10;
                    z11 = !z11;
                }
                i23++;
                i21 = i12;
                i19 = i10;
                i20 = i11;
            }
            throw j.a();
            i17 = 2;
            i18 = 0;
            i19 = 1;
        }
        i15 = i20;
        c1103c = null;
        if (c1103c != null) {
        }
        i20 = f10;
        if (z10) {
        }
    }

    @Override // d9.h, P8.l
    public final void reset() {
        this.g.clear();
        this.f17026h.clear();
    }
}
