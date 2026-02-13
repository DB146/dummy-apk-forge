package l9;

import P8.b;
import P8.d;
import P8.f;
import P8.j;
import P8.l;
import P8.n;
import P8.p;
import P8.q;
import V8.e;
import V8.h;
import c9.C0917b;
import ea.C1111f;
import h3.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import m9.C1648e;
import m9.C1649f;
import n9.C1717a;
import n9.c;

/* renamed from: l9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1515a implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f19609b = new p[0];

    /* renamed from: a, reason: collision with root package name */
    public final C0917b f19610a = new C0917b(1);

    /* JADX WARN: Removed duplicated region for block: B:211:0x0308  */
    @Override // P8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(b bVar, EnumMap enumMap) {
        ArrayList arrayList;
        c cVar;
        c cVar2;
        c cVar3;
        char c10;
        C0917b c0917b;
        V8.b bVar2;
        C1717a c1717a;
        float f4;
        float f10;
        float f11;
        EnumMap enumMap2;
        p[] pVarArr;
        C0917b c0917b2;
        e c11;
        double d10;
        double abs;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0917b c0917b3 = this.f19610a;
        int i17 = 0;
        int i18 = 1;
        if (enumMap == null || !enumMap.containsKey(d.f8196b)) {
            V8.b a9 = bVar.a();
            C1111f c1111f = new C1111f(a9);
            q qVar = enumMap == null ? null : (q) enumMap.get(d.f8204x);
            c1111f.f16838c = qVar;
            n9.e eVar = new n9.e(a9, qVar);
            boolean z8 = enumMap != null && enumMap.containsKey(d.f8198d);
            int i19 = a9.f10195b;
            int i20 = a9.f10194a;
            int i21 = (i19 * 3) / 388;
            if (i21 < 3 || z8) {
                i21 = 3;
            }
            int[] iArr = new int[5];
            int i22 = i21 - 1;
            boolean z10 = false;
            while (true) {
                arrayList = eVar.f21325b;
                if (i22 >= i19 || z10) {
                    break;
                }
                Arrays.fill(iArr, i17);
                int i23 = i17;
                while (i23 < i20) {
                    if (a9.b(i23, i22)) {
                        if ((i17 & 1) == i18) {
                            i17 += i18;
                        }
                        iArr[i17] = iArr[i17] + i18;
                        i10 = i23;
                        i11 = i18;
                    } else if ((i17 & 1) != 0) {
                        i10 = i23;
                        i11 = i18;
                        iArr[i17] = iArr[i17] + i11;
                    } else if (i17 != 4) {
                        i10 = i23;
                        i11 = i18;
                        int i24 = i17 + 1;
                        iArr[i24] = iArr[i24] + i11;
                        i17 = i24;
                    } else if (!n9.e.b(iArr)) {
                        i10 = i23;
                        i11 = i18;
                        iArr[0] = iArr[2];
                        iArr[i11] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = i11;
                        iArr[4] = 0;
                        i17 = 3;
                    } else if (eVar.c(i22, i23, iArr)) {
                        if (eVar.f21326c) {
                            z10 = eVar.d();
                            i15 = i23;
                            i11 = i18;
                            i17 = 0;
                            i13 = 2;
                        } else {
                            if (arrayList.size() > i18) {
                                Iterator it = arrayList.iterator();
                                c cVar4 = null;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i12 = i23;
                                        i13 = 2;
                                        i14 = 0;
                                        break;
                                    }
                                    c cVar5 = (c) it.next();
                                    i12 = i23;
                                    if (cVar5.f21322d >= 2) {
                                        if (cVar4 != null) {
                                            eVar.f21326c = true;
                                            i13 = 2;
                                            i14 = ((int) (Math.abs(cVar4.f8249a - cVar5.f8249a) - Math.abs(cVar4.f8250b - cVar5.f8250b))) / 2;
                                            break;
                                        }
                                        cVar4 = cVar5;
                                    }
                                    i23 = i12;
                                }
                            } else {
                                i12 = i23;
                                i14 = 0;
                                i13 = 2;
                            }
                            if (i14 > iArr[i13]) {
                                i22 += (i14 - r3) - 2;
                                i11 = 1;
                                i15 = i20 - 1;
                            } else {
                                i11 = 1;
                                i15 = i12;
                            }
                            i17 = 0;
                        }
                        Arrays.fill(iArr, i17);
                        i10 = i15;
                        i21 = i13;
                    } else {
                        i10 = i23;
                        i11 = i18;
                        iArr[0] = iArr[2];
                        iArr[i11] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = i11;
                        iArr[4] = 0;
                        i17 = 3;
                    }
                    i18 = i11;
                    i23 = i10 + 1;
                }
                if (n9.e.b(iArr) && eVar.c(i22, i20, iArr)) {
                    int i25 = iArr[0];
                    if (eVar.f21326c) {
                        z10 = eVar.d();
                    }
                    i21 = i25;
                }
                i22 += i21;
                i17 = 0;
                i18 = 1;
            }
            if (arrayList.size() < 3) {
                throw j.a();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((c) it2.next()).f21322d < 2) {
                    it2.remove();
                }
            }
            Collections.sort(arrayList, n9.e.f21323f);
            c[] cVarArr = new c[3];
            int i26 = 0;
            double d11 = Double.MAX_VALUE;
            for (int i27 = 2; i26 < arrayList.size() - i27; i27 = 2) {
                c cVar6 = (c) arrayList.get(i26);
                float f12 = cVar6.f21321c;
                i26++;
                int i28 = i26;
                for (int i29 = 1; i28 < arrayList.size() - i29; i29 = 1) {
                    c cVar7 = (c) arrayList.get(i28);
                    double e2 = n9.e.e(cVar6, cVar7);
                    i28 += i29;
                    int i30 = i28;
                    while (i30 < arrayList.size()) {
                        c cVar8 = (c) arrayList.get(i30);
                        if (cVar8.f21321c <= 1.4f * f12) {
                            double e10 = n9.e.e(cVar7, cVar8);
                            double e11 = n9.e.e(cVar6, cVar8);
                            if (e2 < e10) {
                                if (e10 <= e11) {
                                    d10 = e2;
                                    e10 = e11;
                                    e11 = e10;
                                } else if (e2 < e11) {
                                    d10 = e2;
                                } else {
                                    d10 = e11;
                                    e11 = e2;
                                }
                                abs = Math.abs(e10 - (d10 * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs < d11) {
                                    cVarArr[0] = cVar6;
                                    i7 = 1;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d11 = abs;
                                    i30 += i7;
                                }
                            } else {
                                if (e10 >= e11) {
                                    d10 = e11;
                                    e11 = e10;
                                } else if (e2 < e11) {
                                    d10 = e10;
                                    e10 = e11;
                                    e11 = e2;
                                    abs = Math.abs(e10 - (d10 * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                    if (abs < d11) {
                                    }
                                } else {
                                    d10 = e10;
                                }
                                e10 = e2;
                                abs = Math.abs(e10 - (d10 * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs < d11) {
                                }
                            }
                        }
                        i7 = 1;
                        i30 += i7;
                    }
                }
            }
            if (d11 == Double.MAX_VALUE) {
                throw j.a();
            }
            float a10 = p.a(cVarArr[0], cVarArr[1]);
            float a11 = p.a(cVarArr[1], cVarArr[2]);
            float a12 = p.a(cVarArr[0], cVarArr[2]);
            if (a11 >= a10 && a11 >= a12) {
                cVar = cVarArr[0];
                cVar2 = cVarArr[1];
                cVar3 = cVarArr[2];
            } else if (a12 < a11 || a12 < a10) {
                cVar = cVarArr[2];
                cVar2 = cVarArr[0];
                cVar3 = cVarArr[1];
            } else {
                cVar = cVarArr[1];
                cVar2 = cVarArr[0];
                cVar3 = cVarArr[2];
            }
            float f13 = cVar.f8249a;
            float f14 = cVar3.f8249a - f13;
            float f15 = cVar2.f8250b;
            float f16 = cVar.f8250b;
            if (((f15 - f16) * f14) - ((cVar2.f8249a - f13) * (cVar3.f8250b - f16)) < 0.0f) {
                c10 = 0;
                c cVar9 = cVar3;
                cVar3 = cVar2;
                cVar2 = cVar9;
            } else {
                c10 = 0;
            }
            cVarArr[c10] = cVar2;
            cVarArr[1] = cVar;
            cVarArr[2] = cVar3;
            float m10 = (c1111f.m(cVar, cVar2) + c1111f.m(cVar, cVar3)) / 2.0f;
            if (m10 < 1.0f) {
                throw j.a();
            }
            int G9 = (O5.b.G(p.a(cVar, cVar2) / m10) + O5.b.G(p.a(cVar, cVar3) / m10)) / 2;
            int i31 = G9 + 7;
            int i32 = i31 & 3;
            if (i32 == 0) {
                i31 = G9 + 8;
            } else if (i32 == 2) {
                i31 = G9 + 6;
            } else if (i32 == 3) {
                throw j.a();
            }
            int[] iArr2 = C1649f.f20806e;
            if (i31 % 4 != 1) {
                throw f.a();
            }
            try {
                C1649f c12 = C1649f.c((i31 - 17) / 4);
                int i33 = (c12.f20808a * 4) + 10;
                int length = c12.f20809b.length;
                float f17 = cVar.f8249a;
                float f18 = cVar3.f8250b;
                float f19 = cVar3.f8249a;
                float f20 = cVar2.f8250b;
                float f21 = cVar2.f8249a;
                if (length > 0) {
                    c0917b = c0917b3;
                    float f22 = 1.0f - (3.0f / i33);
                    int d12 = (int) o.d((f19 - f17) + f21, f17, f22, f17);
                    int d13 = (int) o.d((f18 - f16) + f20, f16, f22, f16);
                    bVar2 = a9;
                    for (int i34 = 4; i34 <= 16; i34 <<= 1) {
                        try {
                            c1717a = c1111f.p(m10, d12, d13, i34);
                            break;
                        } catch (j unused) {
                        }
                    }
                } else {
                    c0917b = c0917b3;
                    bVar2 = a9;
                }
                c1717a = null;
                float f23 = i31 - 3.5f;
                if (c1717a != null) {
                    f11 = f23 - 3.0f;
                    f4 = c1717a.f8249a;
                    f10 = c1717a.f8250b;
                } else {
                    f4 = (f19 - f17) + f21;
                    f10 = (f18 - f16) + f20;
                    f11 = f23;
                }
                V8.b y10 = c2.q.y(bVar2, i31, i31, h.a(3.5f, 3.5f, f23, 3.5f, f11, f11, 3.5f, f23, cVar.f8249a, cVar.f8250b, cVar3.f8249a, cVar3.f8250b, f4, f10, cVar2.f8249a, cVar2.f8250b));
                if (c1717a == null) {
                    pVarArr = new p[]{cVar2, cVar, cVar3};
                    c0917b2 = c0917b;
                    enumMap2 = enumMap;
                } else {
                    p[] pVarArr2 = {cVar2, cVar, cVar3, c1717a};
                    enumMap2 = enumMap;
                    pVarArr = pVarArr2;
                    c0917b2 = c0917b;
                }
                c11 = c0917b2.c(y10, enumMap2);
            } catch (IllegalArgumentException unused2) {
                throw f.a();
            }
        } else {
            V8.b a13 = bVar.a();
            int[] e12 = a13.e();
            int[] c13 = a13.c();
            if (e12 == null || c13 == null) {
                throw j.a();
            }
            int i35 = a13.f10195b;
            int i36 = a13.f10194a;
            int i37 = e12[0];
            int i38 = e12[1];
            int i39 = 0;
            boolean z11 = true;
            while (i37 < i36 && i38 < i35) {
                if (z11 != a13.b(i37, i38)) {
                    int i40 = i39 + 1;
                    if (i40 == 5) {
                        break;
                    }
                    z11 = !z11;
                    i39 = i40;
                }
                i37++;
                i38++;
            }
            if (i37 == i36 || i38 == i35) {
                throw j.a();
            }
            int i41 = e12[0];
            float f24 = (i37 - i41) / 7.0f;
            int i42 = e12[1];
            int i43 = c13[1];
            int i44 = c13[0];
            if (i41 >= i44 || i42 >= i43) {
                throw j.a();
            }
            int i45 = i43 - i42;
            if (i45 != i44 - i41 && (i44 = i41 + i45) >= a13.f10194a) {
                throw j.a();
            }
            int round = Math.round(((i44 - i41) + 1) / f24);
            int round2 = Math.round((i45 + 1) / f24);
            if (round <= 0 || round2 <= 0) {
                throw j.a();
            }
            if (round2 != round) {
                throw j.a();
            }
            int i46 = (int) (f24 / 2.0f);
            int i47 = i42 + i46;
            int i48 = i41 + i46;
            int i49 = (((int) ((round - 1) * f24)) + i48) - i44;
            if (i49 > 0) {
                if (i49 > i46) {
                    throw j.a();
                }
                i48 -= i49;
            }
            int i50 = (((int) ((round2 - 1) * f24)) + i47) - i43;
            if (i50 > 0) {
                if (i50 > i46) {
                    throw j.a();
                }
                i47 -= i50;
            }
            V8.b bVar3 = new V8.b(round, round2);
            for (int i51 = 0; i51 < round2; i51++) {
                int i52 = ((int) (i51 * f24)) + i47;
                for (int i53 = 0; i53 < round; i53++) {
                    if (a13.b(((int) (i53 * f24)) + i48, i52)) {
                        bVar3.h(i53, i51);
                    }
                }
            }
            c11 = c0917b3.c(bVar3, enumMap);
            pVarArr = f19609b;
        }
        Object obj = c11.g;
        if (obj instanceof C1648e) {
            ((C1648e) obj).getClass();
            if (pVarArr.length >= 3) {
                p pVar = pVarArr[0];
                pVarArr[0] = pVarArr[2];
                pVarArr[2] = pVar;
            }
        }
        n nVar = new n(c11.f10207b, c11.f10206a, pVarArr, P8.a.f8191z);
        ArrayList arrayList2 = c11.f10208c;
        if (arrayList2 != null) {
            nVar.b(P8.o.f8238b, arrayList2);
        }
        String str = c11.f10209d;
        if (str != null) {
            nVar.b(P8.o.f8239c, str);
        }
        int i54 = c11.f10212h;
        if (i54 >= 0 && (i16 = c11.f10213i) >= 0) {
            nVar.b(P8.o.f8247y, Integer.valueOf(i16));
            nVar.b(P8.o.f8248z, Integer.valueOf(i54));
        }
        nVar.b(P8.o.f8240d, c11.f10210e);
        nVar.b(P8.o.f8235A, "]Q" + c11.j);
        return nVar;
    }

    @Override // P8.l
    public final void reset() {
    }
}
