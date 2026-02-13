package e1;

import d1.C1040c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16689a = new Object();

    public static boolean a(d1.d dVar) {
        int[] iArr = dVar.f16393p0;
        int i7 = iArr[0];
        int i10 = iArr[1];
        d1.d dVar2 = dVar.f16358T;
        d1.e eVar = dVar2 != null ? (d1.e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.f16393p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f16393p0[1];
        }
        boolean z8 = i7 == 1 || dVar.A() || i7 == 2 || (i7 == 3 && dVar.f16395r == 0 && dVar.f16361W == 0.0f && dVar.t(0)) || (i7 == 3 && dVar.f16395r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f16396s == 0 && dVar.f16361W == 0.0f && dVar.t(1)) || (i10 == 3 && dVar.f16396s == 1 && dVar.u(1, dVar.k()));
        if (dVar.f16361W <= 0.0f || !(z8 || z10)) {
            return z8 && z10;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [e1.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [e1.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static n b(d1.d dVar, int i7, ArrayList arrayList, n nVar) {
        int i10;
        int i11 = i7 == 0 ? dVar.f16389n0 : dVar.f16391o0;
        if (i11 != -1 && (nVar == 0 || i11 != nVar.f16695b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i12);
                if (nVar2.f16695b == i11) {
                    if (nVar != 0) {
                        nVar.c(i7, nVar2);
                        arrayList.remove((Object) nVar);
                    }
                    nVar = nVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return nVar;
        }
        n nVar3 = nVar;
        if (nVar == 0) {
            if (dVar instanceof d1.i) {
                d1.i iVar = (d1.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= iVar.f16482r0) {
                        i10 = -1;
                        break;
                    }
                    d1.d dVar2 = iVar.f16481q0[i13];
                    if ((i7 == 0 && (i10 = dVar2.f16389n0) != -1) || (i7 == 1 && (i10 = dVar2.f16391o0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        n nVar4 = (n) arrayList.get(i14);
                        if (nVar4.f16695b == i10) {
                            nVar = nVar4;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (nVar == 0) {
                nVar = new Object();
                nVar.f16694a = new ArrayList();
                nVar.f16697d = null;
                nVar.f16698e = -1;
                int i15 = n.f16693f;
                n.f16693f = i15 + 1;
                nVar.f16695b = i15;
                nVar.f16696c = i7;
            }
            arrayList.add(nVar);
            nVar3 = nVar;
        }
        ArrayList arrayList2 = nVar3.f16694a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof d1.h) {
                d1.h hVar = (d1.h) dVar;
                hVar.f16478t0.c(hVar.f16479u0 == 0 ? 1 : 0, nVar3, arrayList);
            }
            int i16 = nVar3.f16695b;
            if (i7 == 0) {
                dVar.f16389n0 = i16;
                dVar.f16348I.c(i7, nVar3, arrayList);
                dVar.f16350K.c(i7, nVar3, arrayList);
            } else {
                dVar.f16391o0 = i16;
                dVar.f16349J.c(i7, nVar3, arrayList);
                dVar.f16351M.c(i7, nVar3, arrayList);
                dVar.L.c(i7, nVar3, arrayList);
            }
            dVar.f16354P.c(i7, nVar3, arrayList);
        }
        return nVar3;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, e1.b] */
    public static void c(int i7, d1.d dVar, g1.f fVar, boolean z8) {
        C1040c c1040c;
        C1040c c1040c2;
        C1040c c1040c3;
        C1040c c1040c4;
        if (dVar.f16386m) {
            return;
        }
        if (!(dVar instanceof d1.e) && dVar.z() && a(dVar)) {
            d1.e.V(dVar, fVar, new Object());
        }
        C1040c i10 = dVar.i(2);
        C1040c i11 = dVar.i(4);
        int d10 = i10.d();
        int d11 = i11.d();
        HashSet hashSet = i10.f16332a;
        char c10 = 0;
        if (hashSet != null && i10.f16334c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1040c c1040c5 = (C1040c) it.next();
                d1.d dVar2 = c1040c5.f16335d;
                int i12 = i7 + 1;
                boolean a9 = a(dVar2);
                if (dVar2.z() && a9) {
                    d1.e.V(dVar2, fVar, new Object());
                }
                C1040c c1040c6 = dVar2.f16348I;
                C1040c c1040c7 = dVar2.f16350K;
                char c11 = ((c1040c5 == c1040c6 && (c1040c4 = c1040c7.f16337f) != null && c1040c4.f16334c) || (c1040c5 == c1040c7 && (c1040c3 = c1040c6.f16337f) != null && c1040c3.f16334c)) ? (char) 1 : c10;
                int i13 = dVar2.f16393p0[c10];
                if (i13 != 3 || a9) {
                    if (!dVar2.z()) {
                        if (c1040c5 == c1040c6 && c1040c7.f16337f == null) {
                            int e2 = c1040c6.e() + d10;
                            dVar2.J(e2, dVar2.q() + e2);
                            c(i12, dVar2, fVar, z8);
                        } else if (c1040c5 == c1040c7 && c1040c6.f16337f == null) {
                            int e10 = d10 - c1040c7.e();
                            dVar2.J(e10 - dVar2.q(), e10);
                            c(i12, dVar2, fVar, z8);
                        } else if (c11 != 0 && !dVar2.x()) {
                            d(i12, dVar2, fVar, z8);
                        }
                    }
                } else if (i13 == 3 && dVar2.f16399v >= 0 && dVar2.f16398u >= 0 && ((dVar2.f16377g0 == 8 || (dVar2.f16395r == 0 && dVar2.f16361W == 0.0f)) && !dVar2.x() && !dVar2.f16345F && c11 != 0 && !dVar2.x())) {
                    e(i12, dVar, fVar, dVar2, z8);
                }
                c10 = 0;
            }
        }
        if (dVar instanceof d1.h) {
            return;
        }
        HashSet hashSet2 = i11.f16332a;
        if (hashSet2 != null && i11.f16334c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1040c c1040c8 = (C1040c) it2.next();
                d1.d dVar3 = c1040c8.f16335d;
                int i14 = i7 + 1;
                boolean a10 = a(dVar3);
                if (dVar3.z() && a10) {
                    d1.e.V(dVar3, fVar, new Object());
                }
                C1040c c1040c9 = dVar3.f16348I;
                C1040c c1040c10 = dVar3.f16350K;
                boolean z10 = (c1040c8 == c1040c9 && (c1040c2 = c1040c10.f16337f) != null && c1040c2.f16334c) || (c1040c8 == c1040c10 && (c1040c = c1040c9.f16337f) != null && c1040c.f16334c);
                int i15 = dVar3.f16393p0[0];
                if (i15 != 3 || a10) {
                    if (!dVar3.z()) {
                        if (c1040c8 == c1040c9 && c1040c10.f16337f == null) {
                            int e11 = c1040c9.e() + d11;
                            dVar3.J(e11, dVar3.q() + e11);
                            c(i14, dVar3, fVar, z8);
                        } else if (c1040c8 == c1040c10 && c1040c9.f16337f == null) {
                            int e12 = d11 - c1040c10.e();
                            dVar3.J(e12 - dVar3.q(), e12);
                            c(i14, dVar3, fVar, z8);
                        } else if (z10 && !dVar3.x()) {
                            d(i14, dVar3, fVar, z8);
                        }
                    }
                } else if (i15 == 3 && dVar3.f16399v >= 0 && dVar3.f16398u >= 0) {
                    if (dVar3.f16377g0 != 8) {
                        if (dVar3.f16395r == 0) {
                            if (dVar3.f16361W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.x() && !dVar3.f16345F && z10 && !dVar3.x()) {
                        e(i14, dVar, fVar, dVar3, z8);
                    }
                }
            }
        }
        dVar.f16386m = true;
    }

    public static void d(int i7, d1.d dVar, g1.f fVar, boolean z8) {
        float f4 = dVar.f16372d0;
        C1040c c1040c = dVar.f16348I;
        int d10 = c1040c.f16337f.d();
        C1040c c1040c2 = dVar.f16350K;
        int d11 = c1040c2.f16337f.d();
        int e2 = c1040c.e() + d10;
        int e10 = d11 - c1040c2.e();
        if (d10 == d11) {
            f4 = 0.5f;
        } else {
            d10 = e2;
            d11 = e10;
        }
        int q10 = dVar.q();
        int i10 = (d11 - d10) - q10;
        if (d10 > d11) {
            i10 = (d10 - d11) - q10;
        }
        int i11 = ((int) (i10 > 0 ? (f4 * i10) + 0.5f : f4 * i10)) + d10;
        int i12 = i11 + q10;
        if (d10 > d11) {
            i12 = i11 - q10;
        }
        dVar.J(i11, i12);
        c(i7 + 1, dVar, fVar, z8);
    }

    public static void e(int i7, d1.d dVar, g1.f fVar, d1.d dVar2, boolean z8) {
        float f4 = dVar2.f16372d0;
        C1040c c1040c = dVar2.f16348I;
        int e2 = c1040c.e() + c1040c.f16337f.d();
        C1040c c1040c2 = dVar2.f16350K;
        int d10 = c1040c2.f16337f.d() - c1040c2.e();
        if (d10 >= e2) {
            int q10 = dVar2.q();
            if (dVar2.f16377g0 != 8) {
                int i10 = dVar2.f16395r;
                if (i10 == 2) {
                    q10 = (int) (dVar2.f16372d0 * 0.5f * (dVar instanceof d1.e ? dVar.q() : dVar.f16358T.q()));
                } else if (i10 == 0) {
                    q10 = d10 - e2;
                }
                q10 = Math.max(dVar2.f16398u, q10);
                int i11 = dVar2.f16399v;
                if (i11 > 0) {
                    q10 = Math.min(i11, q10);
                }
            }
            int i12 = e2 + ((int) ((f4 * ((d10 - e2) - q10)) + 0.5f));
            dVar2.J(i12, q10 + i12);
            c(i7 + 1, dVar2, fVar, z8);
        }
    }

    public static void f(int i7, d1.d dVar, g1.f fVar) {
        float f4 = dVar.f16374e0;
        C1040c c1040c = dVar.f16349J;
        int d10 = c1040c.f16337f.d();
        C1040c c1040c2 = dVar.L;
        int d11 = c1040c2.f16337f.d();
        int e2 = c1040c.e() + d10;
        int e10 = d11 - c1040c2.e();
        if (d10 == d11) {
            f4 = 0.5f;
        } else {
            d10 = e2;
            d11 = e10;
        }
        int k = dVar.k();
        int i10 = (d11 - d10) - k;
        if (d10 > d11) {
            i10 = (d10 - d11) - k;
        }
        int i11 = (int) (i10 > 0 ? (f4 * i10) + 0.5f : f4 * i10);
        int i12 = d10 + i11;
        int i13 = i12 + k;
        if (d10 > d11) {
            i12 = d10 - i11;
            i13 = i12 - k;
        }
        dVar.K(i12, i13);
        i(i7 + 1, dVar, fVar);
    }

    public static void g(int i7, d1.d dVar, g1.f fVar, d1.d dVar2) {
        float f4 = dVar2.f16374e0;
        C1040c c1040c = dVar2.f16349J;
        int e2 = c1040c.e() + c1040c.f16337f.d();
        C1040c c1040c2 = dVar2.L;
        int d10 = c1040c2.f16337f.d() - c1040c2.e();
        if (d10 >= e2) {
            int k = dVar2.k();
            if (dVar2.f16377g0 != 8) {
                int i10 = dVar2.f16396s;
                if (i10 == 2) {
                    k = (int) (f4 * 0.5f * (dVar instanceof d1.e ? dVar.k() : dVar.f16358T.k()));
                } else if (i10 == 0) {
                    k = d10 - e2;
                }
                k = Math.max(dVar2.f16401x, k);
                int i11 = dVar2.f16402y;
                if (i11 > 0) {
                    k = Math.min(i11, k);
                }
            }
            int i12 = e2 + ((int) ((f4 * ((d10 - e2) - k)) + 0.5f));
            dVar2.K(i12, k + i12);
            i(i7 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i7, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i7 != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, e1.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, e1.b] */
    public static void i(int i7, d1.d dVar, g1.f fVar) {
        C1040c c1040c;
        C1040c c1040c2;
        C1040c c1040c3;
        C1040c c1040c4;
        C1040c c1040c5;
        if (dVar.f16388n) {
            return;
        }
        if (!(dVar instanceof d1.e) && dVar.z() && a(dVar)) {
            d1.e.V(dVar, fVar, new Object());
        }
        C1040c i10 = dVar.i(3);
        C1040c i11 = dVar.i(5);
        int d10 = i10.d();
        int d11 = i11.d();
        HashSet hashSet = i10.f16332a;
        if (hashSet != null && i10.f16334c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1040c c1040c6 = (C1040c) it.next();
                d1.d dVar2 = c1040c6.f16335d;
                int i12 = i7 + 1;
                boolean a9 = a(dVar2);
                if (dVar2.z() && a9) {
                    d1.e.V(dVar2, fVar, new Object());
                }
                C1040c c1040c7 = dVar2.f16349J;
                C1040c c1040c8 = dVar2.L;
                boolean z8 = (c1040c6 == c1040c7 && (c1040c5 = c1040c8.f16337f) != null && c1040c5.f16334c) || (c1040c6 == c1040c8 && (c1040c4 = c1040c7.f16337f) != null && c1040c4.f16334c);
                int i13 = dVar2.f16393p0[1];
                if (i13 != 3 || a9) {
                    if (!dVar2.z()) {
                        if (c1040c6 == c1040c7 && c1040c8.f16337f == null) {
                            int e2 = c1040c7.e() + d10;
                            dVar2.K(e2, dVar2.k() + e2);
                            i(i12, dVar2, fVar);
                        } else if (c1040c6 == c1040c8 && c1040c7.f16337f == null) {
                            int e10 = d10 - c1040c8.e();
                            dVar2.K(e10 - dVar2.k(), e10);
                            i(i12, dVar2, fVar);
                        } else if (z8 && !dVar2.y()) {
                            f(i12, dVar2, fVar);
                        }
                    }
                } else if (i13 == 3 && dVar2.f16402y >= 0 && dVar2.f16401x >= 0 && (dVar2.f16377g0 == 8 || (dVar2.f16396s == 0 && dVar2.f16361W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.f16345F && z8 && !dVar2.y()) {
                        g(i12, dVar, fVar, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof d1.h) {
            return;
        }
        HashSet hashSet2 = i11.f16332a;
        if (hashSet2 != null && i11.f16334c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1040c c1040c9 = (C1040c) it2.next();
                d1.d dVar3 = c1040c9.f16335d;
                int i14 = i7 + 1;
                boolean a10 = a(dVar3);
                if (dVar3.z() && a10) {
                    d1.e.V(dVar3, fVar, new Object());
                }
                C1040c c1040c10 = dVar3.f16349J;
                C1040c c1040c11 = dVar3.L;
                boolean z10 = (c1040c9 == c1040c10 && (c1040c3 = c1040c11.f16337f) != null && c1040c3.f16334c) || (c1040c9 == c1040c11 && (c1040c2 = c1040c10.f16337f) != null && c1040c2.f16334c);
                int i15 = dVar3.f16393p0[1];
                if (i15 != 3 || a10) {
                    if (!dVar3.z()) {
                        if (c1040c9 == c1040c10 && c1040c11.f16337f == null) {
                            int e11 = c1040c10.e() + d11;
                            dVar3.K(e11, dVar3.k() + e11);
                            i(i14, dVar3, fVar);
                        } else if (c1040c9 == c1040c11 && c1040c10.f16337f == null) {
                            int e12 = d11 - c1040c11.e();
                            dVar3.K(e12 - dVar3.k(), e12);
                            i(i14, dVar3, fVar);
                        } else if (z10 && !dVar3.y()) {
                            f(i14, dVar3, fVar);
                        }
                    }
                } else if (i15 == 3 && dVar3.f16402y >= 0 && dVar3.f16401x >= 0) {
                    if (dVar3.f16377g0 != 8) {
                        if (dVar3.f16396s == 0) {
                            if (dVar3.f16361W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.f16345F && z10 && !dVar3.y()) {
                        g(i14, dVar, fVar, dVar3);
                    }
                }
            }
        }
        C1040c i16 = dVar.i(6);
        if (i16.f16332a != null && i16.f16334c) {
            int d12 = i16.d();
            Iterator it3 = i16.f16332a.iterator();
            while (it3.hasNext()) {
                C1040c c1040c12 = (C1040c) it3.next();
                d1.d dVar4 = c1040c12.f16335d;
                int i17 = i7 + 1;
                boolean a11 = a(dVar4);
                if (dVar4.z() && a11) {
                    d1.e.V(dVar4, fVar, new Object());
                }
                if (dVar4.f16393p0[1] != 3 || a11) {
                    if (!dVar4.z() && c1040c12 == (c1040c = dVar4.f16351M)) {
                        int e13 = c1040c12.e() + d12;
                        if (dVar4.f16344E) {
                            int i18 = e13 - dVar4.f16366a0;
                            int i19 = dVar4.f16360V + i18;
                            dVar4.f16364Z = i18;
                            dVar4.f16349J.l(i18);
                            dVar4.L.l(i19);
                            c1040c.l(e13);
                            dVar4.f16384l = true;
                        }
                        i(i17, dVar4, fVar);
                    }
                }
            }
        }
        dVar.f16388n = true;
    }
}
