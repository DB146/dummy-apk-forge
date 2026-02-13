package n9;

import P8.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final d f21323f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final V8.b f21324a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21326c;

    /* renamed from: e, reason: collision with root package name */
    public final q f21328e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21325b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f21327d = new int[5];

    public e(V8.b bVar, q qVar) {
        this.f21324a = bVar;
        this.f21328e = qVar;
    }

    public static float a(int[] iArr, int i7) {
        return ((i7 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i7 += i11;
        }
        if (i7 < 7) {
            return false;
        }
        float f4 = i7 / 7.0f;
        float f10 = f4 / 2.0f;
        return Math.abs(f4 - ((float) iArr[0])) < f10 && Math.abs(f4 - ((float) iArr[1])) < f10 && Math.abs((f4 * 3.0f) - ((float) iArr[2])) < 3.0f * f10 && Math.abs(f4 - ((float) iArr[3])) < f10 && Math.abs(f4 - ((float) iArr[4])) < f10;
    }

    public static double e(c cVar, c cVar2) {
        double d10 = cVar.f8249a - cVar2.f8249a;
        double d11 = cVar.f8250b - cVar2.f8250b;
        return (d11 * d11) + (d10 * d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f0, code lost:
    
        r8 = r5.f21322d;
        r10 = r8 + 1;
        r8 = r8;
        r11 = r10;
        r3.set(r2, new n9.c(((r6 * r8) + r14) / r11, ((r5.f8250b * r8) + r9) / r11, ((r8 * r7) + r1) / r11, r10));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i7, int i10, int[] iArr) {
        float a9;
        float a10;
        int i11;
        int i12;
        int i13;
        int i14 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a11 = (int) a(iArr, i10);
        int i15 = iArr[2];
        V8.b bVar = this.f21324a;
        int i16 = bVar.f10195b;
        int[] iArr2 = this.f21327d;
        Arrays.fill(iArr2, 0);
        int i17 = i7;
        while (i17 >= 0 && bVar.b(a11, i17)) {
            iArr2[2] = iArr2[2] + 1;
            i17--;
        }
        if (i17 >= 0) {
            while (i17 >= 0 && !bVar.b(a11, i17)) {
                int i18 = iArr2[1];
                if (i18 > i15) {
                    break;
                }
                iArr2[1] = i18 + 1;
                i17--;
            }
            if (i17 >= 0 && iArr2[1] <= i15) {
                while (i17 >= 0 && bVar.b(a11, i17)) {
                    int i19 = iArr2[0];
                    if (i19 > i15) {
                        break;
                    }
                    iArr2[0] = i19 + 1;
                    i17--;
                }
                if (iArr2[0] <= i15) {
                    int i20 = i7 + 1;
                    while (i20 < i16 && bVar.b(a11, i20)) {
                        iArr2[2] = iArr2[2] + 1;
                        i20++;
                    }
                    if (i20 != i16) {
                        while (i20 < i16 && !bVar.b(a11, i20)) {
                            int i21 = iArr2[3];
                            if (i21 >= i15) {
                                break;
                            }
                            iArr2[3] = i21 + 1;
                            i20++;
                        }
                        if (i20 != i16 && iArr2[3] < i15) {
                            while (i20 < i16 && bVar.b(a11, i20)) {
                                int i22 = iArr2[4];
                                if (i22 >= i15) {
                                    break;
                                }
                                iArr2[4] = i22 + 1;
                                i20++;
                            }
                            int i23 = iArr2[4];
                            if (i23 < i15 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + i23) - i14) * 5 < i14 * 2 && b(iArr2)) {
                                a9 = a(iArr2, i20);
                                if (!Float.isNaN(a9)) {
                                    int i24 = (int) a9;
                                    int i25 = iArr[2];
                                    int i26 = bVar.f10194a;
                                    Arrays.fill(iArr2, 0);
                                    int i27 = a11;
                                    while (i27 >= 0 && bVar.b(i27, i24)) {
                                        iArr2[2] = iArr2[2] + 1;
                                        i27--;
                                    }
                                    if (i27 >= 0) {
                                        while (i27 >= 0 && !bVar.b(i27, i24)) {
                                            int i28 = iArr2[1];
                                            if (i28 > i25) {
                                                break;
                                            }
                                            iArr2[1] = i28 + 1;
                                            i27--;
                                        }
                                        if (i27 >= 0 && iArr2[1] <= i25) {
                                            while (i27 >= 0 && bVar.b(i27, i24)) {
                                                int i29 = iArr2[0];
                                                if (i29 > i25) {
                                                    break;
                                                }
                                                iArr2[0] = i29 + 1;
                                                i27--;
                                            }
                                            if (iArr2[0] <= i25) {
                                                int i30 = a11 + 1;
                                                while (i30 < i26 && bVar.b(i30, i24)) {
                                                    iArr2[2] = iArr2[2] + 1;
                                                    i30++;
                                                }
                                                if (i30 != i26) {
                                                    while (i30 < i26 && !bVar.b(i30, i24)) {
                                                        int i31 = iArr2[3];
                                                        if (i31 >= i25) {
                                                            break;
                                                        }
                                                        iArr2[3] = i31 + 1;
                                                        i30++;
                                                    }
                                                    if (i30 != i26 && iArr2[3] < i25) {
                                                        while (i30 < i26 && bVar.b(i30, i24)) {
                                                            int i32 = iArr2[4];
                                                            if (i32 >= i25) {
                                                                break;
                                                            }
                                                            iArr2[4] = i32 + 1;
                                                            i30++;
                                                        }
                                                        int i33 = iArr2[4];
                                                        if (i33 < i25 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + i33) - i14) * 5 < i14 && b(iArr2)) {
                                                            a10 = a(iArr2, i30);
                                                            if (!Float.isNaN(a10)) {
                                                                int i34 = (int) a10;
                                                                Arrays.fill(iArr2, 0);
                                                                int i35 = 0;
                                                                while (i24 >= i35 && i34 >= i35 && bVar.b(i34 - i35, i24 - i35)) {
                                                                    iArr2[2] = iArr2[2] + 1;
                                                                    i35++;
                                                                }
                                                                if (iArr2[2] != 0) {
                                                                    while (i24 >= i35 && i34 >= i35 && !bVar.b(i34 - i35, i24 - i35)) {
                                                                        iArr2[1] = iArr2[1] + 1;
                                                                        i35++;
                                                                    }
                                                                    if (iArr2[1] != 0) {
                                                                        while (i24 >= i35 && i34 >= i35 && bVar.b(i34 - i35, i24 - i35)) {
                                                                            iArr2[0] = iArr2[0] + 1;
                                                                            i35++;
                                                                        }
                                                                        if (iArr2[0] != 0) {
                                                                            int i36 = bVar.f10195b;
                                                                            int i37 = bVar.f10194a;
                                                                            int i38 = 1;
                                                                            while (true) {
                                                                                int i39 = i24 + i38;
                                                                                if (i39 >= i36 || (i13 = i34 + i38) >= i37 || !bVar.b(i13, i39)) {
                                                                                    break;
                                                                                }
                                                                                iArr2[2] = iArr2[2] + 1;
                                                                                i38++;
                                                                            }
                                                                            while (true) {
                                                                                int i40 = i24 + i38;
                                                                                if (i40 >= i36 || (i12 = i34 + i38) >= i37 || bVar.b(i12, i40)) {
                                                                                    break;
                                                                                }
                                                                                iArr2[3] = iArr2[3] + 1;
                                                                                i38++;
                                                                            }
                                                                            if (iArr2[3] != 0) {
                                                                                while (true) {
                                                                                    int i41 = i24 + i38;
                                                                                    if (i41 >= i36 || (i11 = i34 + i38) >= i37 || !bVar.b(i11, i41)) {
                                                                                        break;
                                                                                    }
                                                                                    iArr2[4] = iArr2[4] + 1;
                                                                                    i38++;
                                                                                }
                                                                                if (iArr2[4] != 0) {
                                                                                    int i42 = 0;
                                                                                    int i43 = 0;
                                                                                    while (true) {
                                                                                        if (i42 < 5) {
                                                                                            int i44 = iArr2[i42];
                                                                                            if (i44 == 0) {
                                                                                                break;
                                                                                            }
                                                                                            i43 += i44;
                                                                                            i42++;
                                                                                        } else if (i43 >= 7) {
                                                                                            float f4 = i43 / 7.0f;
                                                                                            float f10 = f4 / 1.333f;
                                                                                            if (Math.abs(f4 - iArr2[0]) < f10 && Math.abs(f4 - iArr2[1]) < f10 && Math.abs((f4 * 3.0f) - iArr2[2]) < 3.0f * f10 && Math.abs(f4 - iArr2[3]) < f10 && Math.abs(f4 - iArr2[4]) < f10) {
                                                                                                float f11 = i14 / 7.0f;
                                                                                                int i45 = 0;
                                                                                                while (true) {
                                                                                                    ArrayList arrayList = this.f21325b;
                                                                                                    if (i45 < arrayList.size()) {
                                                                                                        c cVar = (c) arrayList.get(i45);
                                                                                                        if (Math.abs(a9 - cVar.f8250b) <= f11) {
                                                                                                            float f12 = cVar.f8249a;
                                                                                                            if (Math.abs(a10 - f12) <= f11) {
                                                                                                                float f13 = cVar.f21321c;
                                                                                                                float abs = Math.abs(f11 - f13);
                                                                                                                if (abs <= 1.0f || abs <= f13) {
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        i45++;
                                                                                                    } else {
                                                                                                        c cVar2 = new c(a10, a9, f11, 1);
                                                                                                        arrayList.add(cVar2);
                                                                                                        q qVar = this.f21328e;
                                                                                                        if (qVar != null) {
                                                                                                            qVar.a(cVar2);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    a10 = Float.NaN;
                                    if (!Float.isNaN(a10)) {
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        a9 = Float.NaN;
        if (!Float.isNaN(a9)) {
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.f21325b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f4 = 0.0f;
        int i7 = 0;
        float f10 = 0.0f;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f21322d >= 2) {
                i7++;
                f10 += cVar.f21321c;
            }
        }
        if (i7 < 3) {
            return false;
        }
        float f11 = f10 / size;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f4 += Math.abs(((c) it2.next()).f21321c - f11);
        }
        return f4 <= f10 * 0.05f;
    }
}
