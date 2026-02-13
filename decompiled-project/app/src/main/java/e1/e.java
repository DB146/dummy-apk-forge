package e1;

import d1.C1040c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public d1.e f16672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16673b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16674c;

    /* renamed from: d, reason: collision with root package name */
    public d1.e f16675d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f16676e;

    /* renamed from: f, reason: collision with root package name */
    public g1.f f16677f;
    public b g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f16678h;

    /* JADX WARN: Type inference failed for: r10v2, types: [e1.l, java.lang.Object] */
    public final void a(f fVar, int i7, ArrayList arrayList, l lVar) {
        o oVar = fVar.f16682d;
        if (oVar.f16701c == null) {
            d1.e eVar = this.f16672a;
            if (oVar != eVar.f16371d) {
                l lVar2 = lVar;
                if (oVar == eVar.f16373e) {
                    return;
                }
                if (lVar == null) {
                    ?? obj = new Object();
                    obj.f16690a = null;
                    obj.f16691b = new ArrayList();
                    obj.f16690a = oVar;
                    arrayList.add(obj);
                    lVar2 = obj;
                }
                oVar.f16701c = lVar2;
                lVar2.f16691b.add(oVar);
                f fVar2 = oVar.f16705h;
                Iterator it = fVar2.k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i7, arrayList, lVar2);
                    }
                }
                f fVar3 = oVar.f16706i;
                Iterator it2 = fVar3.k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i7, arrayList, lVar2);
                    }
                }
                if (i7 == 1 && (oVar instanceof m)) {
                    Iterator it3 = ((m) oVar).k.k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i7, arrayList, lVar2);
                        }
                    }
                }
                Iterator it4 = fVar2.f16687l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i7, arrayList, lVar2);
                }
                Iterator it5 = fVar3.f16687l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i7, arrayList, lVar2);
                }
                if (i7 == 1 && (oVar instanceof m)) {
                    Iterator it6 = ((m) oVar).k.f16687l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i7, arrayList, lVar2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d1.e eVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Iterator it = eVar.f16415q0.iterator();
        while (it.hasNext()) {
            d1.d dVar = (d1.d) it.next();
            int[] iArr = dVar.f16393p0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            if (dVar.f16377g0 == 8) {
                dVar.f16365a = true;
            } else {
                float f4 = dVar.f16400w;
                if (f4 < 1.0f && i15 == 3) {
                    dVar.f16395r = 2;
                }
                float f10 = dVar.f16403z;
                if (f10 < 1.0f && i16 == 3) {
                    dVar.f16396s = 2;
                }
                if (dVar.f16361W > 0.0f) {
                    if (i15 == 3 && (i16 == 2 || i16 == 1)) {
                        dVar.f16395r = 3;
                    } else if (i16 == 3 && (i15 == 2 || i15 == 1)) {
                        dVar.f16396s = 3;
                    } else if (i15 == 3 && i16 == 3) {
                        if (dVar.f16395r == 0) {
                            dVar.f16395r = 3;
                        }
                        if (dVar.f16396s == 0) {
                            dVar.f16396s = 3;
                        }
                    }
                }
                C1040c c1040c = dVar.f16350K;
                C1040c c1040c2 = dVar.f16348I;
                if (i15 == 3 && dVar.f16395r == 1 && (c1040c2.f16337f == null || c1040c.f16337f == null)) {
                    i15 = 2;
                }
                C1040c c1040c3 = dVar.L;
                C1040c c1040c4 = dVar.f16349J;
                int i17 = (i16 == 3 && dVar.f16396s == 1 && (c1040c4.f16337f == null || c1040c3.f16337f == null)) ? 2 : i16;
                k kVar = dVar.f16371d;
                kVar.f16702d = i15;
                int i18 = dVar.f16395r;
                kVar.f16699a = i18;
                m mVar = dVar.f16373e;
                mVar.f16702d = i17;
                int i19 = dVar.f16396s;
                mVar.f16699a = i19;
                if ((i15 == 4 || i15 == 1 || i15 == 2) && (i17 == 4 || i17 == 1 || i17 == 2)) {
                    int q10 = dVar.q();
                    if (i15 == 4) {
                        i7 = (eVar.q() - c1040c2.g) - c1040c.g;
                        i15 = 1;
                    } else {
                        i7 = q10;
                    }
                    int k = dVar.k();
                    if (i17 == 4) {
                        i10 = (eVar.k() - c1040c4.g) - c1040c3.g;
                        i11 = 1;
                    } else {
                        i10 = k;
                        i11 = i17;
                    }
                    f(i15, i7, i11, i10, dVar);
                    dVar.f16371d.f16703e.d(dVar.q());
                    dVar.f16373e.f16703e.d(dVar.k());
                    dVar.f16365a = true;
                } else {
                    int[] iArr2 = eVar.f16393p0;
                    C1040c[] c1040cArr = dVar.f16355Q;
                    if (i15 != 3 || (i17 != 2 && i17 != 1)) {
                        i12 = 3;
                    } else if (i18 == 3) {
                        if (i17 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k7 = dVar.k();
                        f(1, (int) ((k7 * dVar.f16361W) + 0.5f), 1, k7, dVar);
                        dVar.f16371d.f16703e.d(dVar.q());
                        dVar.f16373e.f16703e.d(dVar.k());
                        dVar.f16365a = true;
                    } else if (i18 == 1) {
                        f(2, 0, i17, 0, dVar);
                        dVar.f16371d.f16703e.f16688m = dVar.q();
                    } else if (i18 == 2) {
                        int i20 = iArr2[0];
                        if (i20 == 1 || i20 == 4) {
                            f(1, (int) ((f4 * eVar.q()) + 0.5f), i17, dVar.k(), dVar);
                            dVar.f16371d.f16703e.d(dVar.q());
                            dVar.f16373e.f16703e.d(dVar.k());
                            dVar.f16365a = true;
                        } else {
                            i12 = 3;
                        }
                    } else if (c1040cArr[0].f16337f == null || c1040cArr[1].f16337f == null) {
                        f(2, 0, i17, 0, dVar);
                        dVar.f16371d.f16703e.d(dVar.q());
                        dVar.f16373e.f16703e.d(dVar.k());
                        dVar.f16365a = true;
                    } else {
                        i12 = 3;
                    }
                    if (i17 == i12) {
                        if (i15 != 2 && i15 != 1) {
                            i14 = i12;
                            i13 = 1;
                            if (i15 != i14) {
                                if (i18 != i13) {
                                }
                                f(2, 0, 2, 0, dVar);
                                dVar.f16371d.f16703e.f16688m = dVar.q();
                                dVar.f16373e.f16703e.f16688m = dVar.k();
                            }
                        } else if (i19 == i12) {
                            if (i15 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q11 = dVar.q();
                            float f11 = dVar.f16361W;
                            if (dVar.f16362X == -1) {
                                f11 = 1.0f / f11;
                            }
                            f(1, q11, 1, (int) ((q11 * f11) + 0.5f), dVar);
                            dVar.f16371d.f16703e.d(dVar.q());
                            dVar.f16373e.f16703e.d(dVar.k());
                            dVar.f16365a = true;
                        } else if (i19 == 1) {
                            f(i15, 0, 2, 0, dVar);
                            dVar.f16373e.f16703e.f16688m = dVar.k();
                        } else {
                            if (i19 == 2) {
                                int i21 = iArr2[1];
                                if (i21 == 1 || i21 == 4) {
                                    f(i15, dVar.q(), 1, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                    dVar.f16371d.f16703e.d(dVar.q());
                                    dVar.f16373e.f16703e.d(dVar.k());
                                    dVar.f16365a = true;
                                }
                            } else if (c1040cArr[2].f16337f == null || c1040cArr[3].f16337f == null) {
                                f(2, 0, i17, 0, dVar);
                                dVar.f16371d.f16703e.d(dVar.q());
                                dVar.f16373e.f16703e.d(dVar.k());
                                dVar.f16365a = true;
                            }
                            if (i15 != i14 && i17 == i14) {
                                if (i18 != i13 || i19 == i13) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.f16371d.f16703e.f16688m = dVar.q();
                                    dVar.f16373e.f16703e.f16688m = dVar.k();
                                } else if (i19 == 2 && i18 == 2 && iArr2[0] == 1 && iArr2[i13] == 1) {
                                    f(1, (int) ((f4 * eVar.q()) + 0.5f), 1, (int) ((f10 * eVar.k()) + 0.5f), dVar);
                                    dVar.f16371d.f16703e.d(dVar.q());
                                    dVar.f16373e.f16703e.d(dVar.k());
                                    dVar.f16365a = true;
                                }
                            }
                        }
                    }
                    i13 = 1;
                    i14 = 3;
                    if (i15 != i14) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f16676e;
        arrayList.clear();
        d1.e eVar = this.f16675d;
        eVar.f16371d.f();
        eVar.f16373e.f();
        arrayList.add(eVar.f16371d);
        arrayList.add(eVar.f16373e);
        Iterator it = eVar.f16415q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d1.d dVar = (d1.d) it.next();
            if (dVar instanceof d1.h) {
                o oVar = new o(dVar);
                dVar.f16371d.f();
                dVar.f16373e.f();
                oVar.f16704f = ((d1.h) dVar).f16479u0;
                arrayList.add(oVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f16367b == null) {
                        dVar.f16367b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f16367b);
                } else {
                    arrayList.add(dVar.f16371d);
                }
                if (dVar.y()) {
                    if (dVar.f16369c == null) {
                        dVar.f16369c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f16369c);
                } else {
                    arrayList.add(dVar.f16373e);
                }
                if (dVar instanceof d1.i) {
                    arrayList.add(new o(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar2 = (o) it3.next();
            if (oVar2.f16700b != eVar) {
                oVar2.d();
            }
        }
        ArrayList arrayList2 = this.f16678h;
        arrayList2.clear();
        d1.e eVar2 = this.f16672a;
        e(eVar2.f16371d, 0, arrayList2);
        e(eVar2.f16373e, 1, arrayList2);
        this.f16673b = false;
    }

    public final int d(d1.e eVar, int i7) {
        ArrayList arrayList;
        int i10;
        int i11;
        long max;
        float f4;
        d1.e eVar2 = eVar;
        ArrayList arrayList2 = this.f16678h;
        int size = arrayList2.size();
        int i12 = 0;
        long j = 0;
        while (i12 < size) {
            o oVar = ((l) arrayList2.get(i12)).f16690a;
            if (!(oVar instanceof c) ? !(i7 != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f16704f != i7) {
                f fVar = (i7 == 0 ? eVar2.f16371d : eVar2.f16373e).f16705h;
                f fVar2 = (i7 == 0 ? eVar2.f16371d : eVar2.f16373e).f16706i;
                boolean contains = oVar.f16705h.f16687l.contains(fVar);
                f fVar3 = oVar.f16706i;
                boolean contains2 = fVar3.f16687l.contains(fVar2);
                long j10 = oVar.j();
                f fVar4 = oVar.f16705h;
                if (contains && contains2) {
                    long b2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i10 = size;
                    long a9 = l.a(fVar3, 0L);
                    long j11 = b2 - j10;
                    int i13 = fVar3.f16684f;
                    arrayList = arrayList3;
                    i11 = i12;
                    if (j11 >= (-i13)) {
                        j11 += i13;
                    }
                    long j12 = (-a9) - j10;
                    long j13 = fVar4.f16684f;
                    long j14 = j12 - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    d1.d dVar = oVar.f16700b;
                    if (i7 == 0) {
                        f4 = dVar.f16372d0;
                    } else if (i7 == 1) {
                        f4 = dVar.f16374e0;
                    } else {
                        dVar.getClass();
                        f4 = -1.0f;
                    }
                    float f10 = (float) (f4 > 0.0f ? (((float) j11) / (1.0f - f4)) + (((float) j14) / f4) : 0L);
                    max = (fVar4.f16684f + ((((f10 * f4) + 0.5f) + j10) + h3.o.d(1.0f, f4, f10, 0.5f))) - fVar3.f16684f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    max = contains ? Math.max(l.b(fVar4, fVar4.f16684f), fVar4.f16684f + j10) : contains2 ? Math.max(-l.a(fVar3, fVar3.f16684f), (-fVar3.f16684f) + j10) : (oVar.j() + fVar4.f16684f) - fVar3.f16684f;
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                i11 = i12;
                max = 0;
            }
            j = Math.max(j, max);
            i12 = i11 + 1;
            eVar2 = eVar;
            size = i10;
            arrayList2 = arrayList;
        }
        return (int) j;
    }

    public final void e(o oVar, int i7, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.f16705h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.f16706i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i7, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f16705h, i7, arrayList, null);
            }
        }
        Iterator it2 = fVar.k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i7, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f16706i, i7, arrayList, null);
            }
        }
        if (i7 == 1) {
            Iterator it3 = ((m) oVar).k.k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i7, arrayList, null);
                }
            }
        }
    }

    public final void f(int i7, int i10, int i11, int i12, d1.d dVar) {
        b bVar = this.g;
        bVar.f16663a = i7;
        bVar.f16664b = i11;
        bVar.f16665c = i10;
        bVar.f16666d = i12;
        this.f16677f.b(dVar, bVar);
        dVar.O(bVar.f16667e);
        dVar.L(bVar.f16668f);
        dVar.f16344E = bVar.f16669h;
        dVar.I(bVar.g);
    }

    public final void g() {
        C1075a c1075a;
        Iterator it = this.f16672a.f16415q0.iterator();
        while (it.hasNext()) {
            d1.d dVar = (d1.d) it.next();
            if (!dVar.f16365a) {
                int[] iArr = dVar.f16393p0;
                boolean z8 = false;
                int i7 = iArr[0];
                int i10 = iArr[1];
                int i11 = dVar.f16395r;
                int i12 = dVar.f16396s;
                boolean z10 = i7 == 2 || (i7 == 3 && i11 == 1);
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z8 = true;
                }
                g gVar = dVar.f16371d.f16703e;
                boolean z11 = gVar.j;
                g gVar2 = dVar.f16373e.f16703e;
                boolean z12 = gVar2.j;
                if (z11 && z12) {
                    f(1, gVar.g, 1, gVar2.g, dVar);
                    dVar.f16365a = true;
                } else if (z11 && z8) {
                    f(1, gVar.g, 2, gVar2.g, dVar);
                    if (i10 == 3) {
                        dVar.f16373e.f16703e.f16688m = dVar.k();
                    } else {
                        dVar.f16373e.f16703e.d(dVar.k());
                        dVar.f16365a = true;
                    }
                } else if (z12 && z10) {
                    f(2, gVar.g, 1, gVar2.g, dVar);
                    if (i7 == 3) {
                        dVar.f16371d.f16703e.f16688m = dVar.q();
                    } else {
                        dVar.f16371d.f16703e.d(dVar.q());
                        dVar.f16365a = true;
                    }
                }
                if (dVar.f16365a && (c1075a = dVar.f16373e.f16692l) != null) {
                    c1075a.d(dVar.f16366a0);
                }
            }
        }
    }
}
