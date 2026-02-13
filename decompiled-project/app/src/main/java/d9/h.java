package d9;

import P8.l;
import P8.m;
import P8.n;
import P8.o;
import P8.p;
import java.util.Arrays;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public abstract class h implements l {
    public static float d(int[] iArr, int[] iArr2, float f4) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i7;
        float f11 = f10 / i10;
        float f12 = f4 * f11;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float f14 = iArr2[i12] * f11;
            float f15 = iArr[i12];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }

    public static void e(int i7, V8.a aVar, int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i11 = aVar.f10193b;
        if (i7 >= i11) {
            throw P8.j.a();
        }
        boolean z8 = !aVar.d(i7);
        while (i7 < i11) {
            if (aVar.d(i7) != z8) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                i10++;
                if (i10 == length) {
                    break;
                }
                iArr[i10] = 1;
                z8 = !z8;
            }
            i7++;
        }
        if (i10 != length) {
            if (i10 != length - 1 || i7 != i11) {
                throw P8.j.a();
            }
        }
    }

    public static void f(int i7, V8.a aVar, int[] iArr) {
        int length = iArr.length;
        boolean d10 = aVar.d(i7);
        while (i7 > 0 && length >= 0) {
            i7--;
            if (aVar.d(i7) != d10) {
                length--;
                d10 = !d10;
            }
        }
        if (length >= 0) {
            throw P8.j.a();
        }
        e(i7 + 1, aVar, iArr);
    }

    @Override // P8.l
    public n a(P8.b bVar, EnumMap enumMap) {
        try {
            return c(bVar, enumMap);
        } catch (P8.j e2) {
            if (enumMap == null || !enumMap.containsKey(P8.d.f8198d) || !bVar.f8192a.f10218a.i()) {
                throw e2;
            }
            P8.h k = bVar.f8192a.f10218a.k();
            n c10 = c(new P8.b(new V8.g(k)), enumMap);
            EnumMap enumMap2 = c10.f8234e;
            o oVar = o.f8237a;
            int i7 = 270;
            if (enumMap2 != null && enumMap2.containsKey(oVar)) {
                i7 = (((Integer) enumMap2.get(oVar)).intValue() + 270) % 360;
            }
            c10.b(oVar, Integer.valueOf(i7));
            p[] pVarArr = c10.f8232c;
            if (pVarArr != null) {
                int i10 = k.f8220c;
                for (int i11 = 0; i11 < pVarArr.length; i11++) {
                    p pVar = pVarArr[i11];
                    pVarArr[i11] = new p((i10 - pVar.f8250b) - 1.0f, pVar.f8249a);
                }
            }
            return c10;
        }
    }

    public abstract n b(int i7, V8.a aVar, EnumMap enumMap);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[Catch: m -> 0x00b7, TRY_LEAVE, TryCatch #1 {m -> 0x00b7, blocks: (B:31:0x0071, B:33:0x0077), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n c(P8.b bVar, EnumMap enumMap) {
        h hVar;
        EnumMap enumMap2;
        int i7;
        P8.b bVar2 = bVar;
        EnumMap enumMap3 = enumMap;
        P8.h hVar2 = bVar2.f8192a.f10218a;
        int i10 = hVar2.f8219b;
        int i11 = hVar2.f8220c;
        V8.a aVar = new V8.a(i10);
        int i12 = 1;
        int i13 = 0;
        boolean z8 = enumMap3 != null && enumMap3.containsKey(P8.d.f8198d);
        int max = Math.max(1, i11 >> (z8 ? 8 : 5));
        int i14 = z8 ? i11 : 15;
        int i15 = i11 / 2;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = i16 + 1;
            int i18 = i17 / 2;
            if ((i16 & 1) != 0) {
                i18 = -i18;
            }
            int i19 = (i18 * max) + i15;
            if (i19 < 0 || i19 >= i11) {
                break;
            }
            try {
                aVar = bVar2.b(aVar, i19);
                int i20 = i13;
                while (i20 < 2) {
                    try {
                        if (i20 == i12) {
                            aVar.i();
                            if (enumMap3 != null) {
                                P8.d dVar = P8.d.f8204x;
                                if (enumMap3.containsKey(dVar)) {
                                    EnumMap enumMap4 = new EnumMap(P8.d.class);
                                    enumMap4.putAll(enumMap3);
                                    enumMap4.remove(dVar);
                                    hVar = this;
                                    enumMap3 = enumMap4;
                                    n b2 = hVar.b(i19, aVar, enumMap3);
                                    if (i20 != i12) {
                                        try {
                                            b2.b(o.f8237a, 180);
                                            p[] pVarArr = b2.f8232c;
                                            if (pVarArr != null) {
                                                float f4 = i10;
                                                enumMap2 = enumMap3;
                                                try {
                                                    p pVar = pVarArr[i13];
                                                    pVarArr[0] = new p((f4 - pVar.f8249a) - 1.0f, pVar.f8250b);
                                                    try {
                                                        p pVar2 = pVarArr[1];
                                                        p pVar3 = new p((f4 - pVar2.f8249a) - 1.0f, pVar2.f8250b);
                                                        i7 = 1;
                                                        try {
                                                            pVarArr[1] = pVar3;
                                                        } catch (m unused) {
                                                            continue;
                                                            i20++;
                                                            i12 = i7;
                                                            enumMap3 = enumMap2;
                                                            i13 = 0;
                                                        }
                                                    } catch (m unused2) {
                                                        i7 = 1;
                                                    }
                                                } catch (m unused3) {
                                                    i7 = 1;
                                                    i20++;
                                                    i12 = i7;
                                                    enumMap3 = enumMap2;
                                                    i13 = 0;
                                                }
                                            }
                                        } catch (m unused4) {
                                            enumMap2 = enumMap3;
                                        }
                                    }
                                    return b2;
                                }
                            }
                        }
                        n b22 = hVar.b(i19, aVar, enumMap3);
                        if (i20 != i12) {
                        }
                        return b22;
                    } catch (m unused5) {
                        enumMap2 = enumMap3;
                        i7 = i12;
                    }
                    hVar = this;
                }
            } catch (P8.j unused6) {
            }
            i12 = i12;
            i16 = i17;
            i13 = 0;
            bVar2 = bVar;
        }
        throw P8.j.a();
    }

    @Override // P8.l
    public void reset() {
    }
}
