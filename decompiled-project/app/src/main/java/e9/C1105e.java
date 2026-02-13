package e9;

import P8.j;
import P8.n;
import P8.o;
import P8.p;
import P8.q;
import d9.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: e9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1105e extends AbstractC1101a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f16821i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f16822l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f16823m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f16824n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f16825o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final ArrayList g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16826h = new ArrayList();

    public static void j(ArrayList arrayList, C1104d c1104d) {
        if (c1104d == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1104d c1104d2 = (C1104d) it.next();
            if (c1104d2.f16814a == c1104d.f16814a) {
                c1104d2.f16820d++;
                return;
            }
        }
        arrayList.add(c1104d);
    }

    @Override // d9.h
    public final n b(int i7, V8.a aVar, EnumMap enumMap) {
        C1104d l10 = l(aVar, false, i7, enumMap);
        ArrayList arrayList = this.g;
        j(arrayList, l10);
        aVar.i();
        C1104d l11 = l(aVar, true, i7, enumMap);
        ArrayList arrayList2 = this.f16826h;
        j(arrayList2, l11);
        aVar.i();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1104d c1104d = (C1104d) it.next();
            if (c1104d.f16820d > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C1104d c1104d2 = (C1104d) it2.next();
                    if (c1104d2.f16820d > 1) {
                        int i10 = ((c1104d2.f16815b * 16) + c1104d.f16815b) % 79;
                        C1103c c1103c = c1104d.f16819c;
                        int i11 = c1103c.f16816a * 9;
                        C1103c c1103c2 = c1104d2.f16819c;
                        int i12 = i11 + c1103c2.f16816a;
                        if (i12 > 72) {
                            i12--;
                        }
                        if (i12 > 8) {
                            i12--;
                        }
                        if (i10 == i12) {
                            String valueOf = String.valueOf((c1104d.f16814a * 4537077) + c1104d2.f16814a);
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(valueOf);
                            int i13 = 0;
                            for (int i14 = 0; i14 < 13; i14++) {
                                int charAt = sb2.charAt(i14) - '0';
                                if ((i14 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i13 += charAt;
                            }
                            int i15 = 10 - (i13 % 10);
                            if (i15 == 10) {
                                i15 = 0;
                            }
                            sb2.append(i15);
                            p[] pVarArr = c1103c.f16818c;
                            p[] pVarArr2 = c1103c2.f16818c;
                            n nVar = new n(sb2.toString(), null, new p[]{pVarArr[0], pVarArr[1], pVarArr2[0], pVarArr2[1]}, P8.a.f8174A);
                            nVar.b(o.f8235A, "]e0");
                            return nVar;
                        }
                    }
                }
            }
        }
        throw j.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0093, code lost:
    
        if (r6 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0095, code lost:
    
        r17 = false;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009a, code lost:
    
        r16 = false;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b1, code lost:
    
        if (r6 < 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1102b k(V8.a aVar, C1103c c1103c, boolean z8) {
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int[] iArr3 = this.f16809b;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = c1103c.f16817b;
        if (z8) {
            h.f(iArr4[0], aVar, iArr3);
        } else {
            h.e(iArr4[1], aVar, iArr3);
            int i7 = 0;
            for (int length = iArr3.length - 1; i7 < length; length--) {
                int i10 = iArr3[i7];
                iArr3[i7] = iArr3[length];
                iArr3[length] = i10;
                i7++;
            }
        }
        int i11 = z8 ? 16 : 15;
        float J10 = O5.b.J(iArr3) / i11;
        int i12 = 0;
        while (true) {
            int length2 = iArr3.length;
            fArr = this.f16811d;
            fArr2 = this.f16810c;
            iArr = this.f16813f;
            iArr2 = this.f16812e;
            if (i12 >= length2) {
                break;
            }
            float f4 = iArr3[i12] / J10;
            int i13 = (int) (0.5f + f4);
            if (i13 < 1) {
                i13 = 1;
            } else if (i13 > 8) {
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                iArr2[i14] = i13;
                fArr2[i14] = f4 - i13;
            } else {
                iArr[i14] = i13;
                fArr[i14] = f4 - i13;
            }
            i12++;
        }
        int J11 = O5.b.J(iArr2);
        int J12 = O5.b.J(iArr);
        if (z8) {
            if (J11 > 12) {
                z10 = false;
                z11 = true;
            } else if (J11 < 4) {
                z11 = false;
                z10 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (J12 <= 12) {
            }
            z12 = false;
            z13 = true;
        } else {
            if (J11 > 11) {
                z10 = false;
                z11 = true;
            } else if (J11 < 5) {
                z11 = false;
                z10 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (J12 <= 10) {
            }
            z12 = false;
            z13 = true;
        }
        int i15 = (J11 + J12) - i11;
        boolean z14 = (J11 & 1) == z8;
        boolean z15 = (J12 & 1) == 1;
        if (i15 != -1) {
            if (i15 != 0) {
                if (i15 != 1) {
                    throw j.a();
                }
                if (z14) {
                    if (z15) {
                        throw j.a();
                    }
                    z11 = true;
                } else {
                    if (!z15) {
                        throw j.a();
                    }
                    z13 = true;
                }
            } else if (z14) {
                if (!z15) {
                    throw j.a();
                }
                if (J11 < J12) {
                    z10 = true;
                    z13 = true;
                } else {
                    z11 = true;
                    z12 = true;
                }
            } else if (z15) {
                throw j.a();
            }
        } else if (z14) {
            if (z15) {
                throw j.a();
            }
            z10 = true;
        } else {
            if (!z15) {
                throw j.a();
            }
            z12 = true;
        }
        if (z10) {
            if (z11) {
                throw j.a();
            }
            AbstractC1101a.h(iArr2, fArr2);
        }
        if (z11) {
            AbstractC1101a.g(iArr2, fArr2);
        }
        if (z12) {
            if (z13) {
                throw j.a();
            }
            AbstractC1101a.h(iArr, fArr2);
        }
        if (z13) {
            AbstractC1101a.g(iArr, fArr);
        }
        int i16 = 0;
        int i17 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i18 = iArr2[length3];
            i16 = (i16 * 9) + i18;
            i17 += i18;
        }
        int i19 = 0;
        int i20 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i21 = iArr[length4];
            i19 = (i19 * 9) + i21;
            i20 += i21;
        }
        int i22 = (i19 * 3) + i16;
        if (!z8) {
            if ((i20 & 1) != 0 || i20 > 10 || i20 < 4) {
                throw j.a();
            }
            int i23 = (10 - i20) / 2;
            int i24 = f16824n[i23];
            return new C1102b((O5.b.t(iArr, 9 - i24, false) * j[i23]) + O5.b.t(iArr2, i24, true) + f16822l[i23], i22);
        }
        if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
            throw j.a();
        }
        int i25 = (12 - i17) / 2;
        int i26 = f16823m[i25];
        return new C1102b((O5.b.t(iArr2, i26, false) * f16821i[i25]) + O5.b.t(iArr, 9 - i26, true) + k[i25], i22);
    }

    public final C1104d l(V8.a aVar, boolean z8, int i7, EnumMap enumMap) {
        try {
            C1103c n6 = n(aVar, i7, z8, m(aVar, z8));
            q qVar = enumMap == null ? null : (q) enumMap.get(P8.d.f8204x);
            if (qVar != null) {
                int[] iArr = n6.f16817b;
                float f4 = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z8) {
                    f4 = (aVar.f10193b - 1) - f4;
                }
                qVar.a(new p(f4, i7));
            }
            C1102b k7 = k(aVar, n6, true);
            C1102b k10 = k(aVar, n6, false);
            return new C1104d((k7.f16814a * 1597) + k10.f16814a, (k10.f16815b * 4) + k7.f16815b, n6);
        } catch (j unused) {
            return null;
        }
    }

    public final int[] m(V8.a aVar, boolean z8) {
        int[] iArr = this.f16808a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i7 = aVar.f10193b;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i7) {
            z10 = !aVar.d(i10);
            if (z8 == z10) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < i7) {
            if (aVar.d(i10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (AbstractC1101a.i(iArr)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw j.a();
    }

    public final C1103c n(V8.a aVar, int i7, boolean z8, int[] iArr) {
        int i10;
        int i11;
        boolean d10 = aVar.d(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && d10 != aVar.d(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArr2 = this.f16808a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i14;
        int[][] iArr3 = f16825o;
        for (int i15 = 0; i15 < 9; i15++) {
            if (h.d(iArr2, iArr3[i15], 0.45f) < 0.2f) {
                int i16 = iArr[1];
                if (z8) {
                    int i17 = aVar.f10193b - 1;
                    i10 = i17 - i16;
                    i11 = i17 - i13;
                } else {
                    i10 = i16;
                    i11 = i13;
                }
                return new C1103c(i15, i11, i10, i7, new int[]{i13, i16});
            }
        }
        throw j.a();
    }

    @Override // d9.h, P8.l
    public final void reset() {
        this.g.clear();
        this.f16826h.clear();
    }
}
