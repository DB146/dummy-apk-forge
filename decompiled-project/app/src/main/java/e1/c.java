package e1;

import d1.C1040c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends o {
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public int f16671l;

    public c(d1.d dVar, int i7) {
        super(dVar);
        d1.d dVar2;
        this.k = new ArrayList();
        this.f16704f = i7;
        d1.d dVar3 = this.f16700b;
        d1.d m10 = dVar3.m(i7);
        while (true) {
            d1.d dVar4 = m10;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                m10 = dVar3.m(this.f16704f);
            }
        }
        this.f16700b = dVar2;
        int i10 = this.f16704f;
        o oVar = i10 == 0 ? dVar2.f16371d : i10 == 1 ? dVar2.f16373e : null;
        ArrayList arrayList = this.k;
        arrayList.add(oVar);
        d1.d l10 = dVar2.l(this.f16704f);
        while (l10 != null) {
            int i11 = this.f16704f;
            arrayList.add(i11 == 0 ? l10.f16371d : i11 == 1 ? l10.f16373e : null);
            l10 = l10.l(this.f16704f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            int i12 = this.f16704f;
            if (i12 == 0) {
                oVar2.f16700b.f16367b = this;
            } else if (i12 == 1) {
                oVar2.f16700b.f16369c = this;
            }
        }
        if (this.f16704f == 0 && ((d1.e) this.f16700b.f16358T).f16420v0 && arrayList.size() > 1) {
            this.f16700b = ((o) h3.o.k(1, arrayList)).f16700b;
        }
        this.f16671l = this.f16704f == 0 ? this.f16700b.f16381i0 : this.f16700b.f16382j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // e1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i7;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        float f4;
        int i15;
        boolean z8;
        ArrayList arrayList2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        int i22;
        float f10;
        int i23;
        boolean z11;
        int i24;
        f fVar = this.f16705h;
        if (fVar.j) {
            f fVar2 = this.f16706i;
            if (fVar2.j) {
                d1.d dVar2 = this.f16700b.f16358T;
                boolean z12 = dVar2 instanceof d1.e ? ((d1.e) dVar2).f16420v0 : false;
                int i25 = fVar2.g - fVar.g;
                ArrayList arrayList3 = this.k;
                int size = arrayList3.size();
                int i26 = 0;
                while (true) {
                    i7 = -1;
                    i10 = 8;
                    if (i26 >= size) {
                        i26 = -1;
                        break;
                    } else if (((o) arrayList3.get(i26)).f16700b.f16377g0 != 8) {
                        break;
                    } else {
                        i26++;
                    }
                }
                int i27 = size - 1;
                int i28 = i27;
                while (true) {
                    if (i28 < 0) {
                        break;
                    }
                    if (((o) arrayList3.get(i28)).f16700b.f16377g0 != 8) {
                        i7 = i28;
                        break;
                    }
                    i28--;
                }
                int i29 = 0;
                while (i29 < 2) {
                    int i30 = 0;
                    i14 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    f4 = 0.0f;
                    while (i30 < size) {
                        o oVar = (o) arrayList3.get(i30);
                        d1.d dVar3 = oVar.f16700b;
                        ArrayList arrayList4 = arrayList3;
                        if (dVar3.f16377g0 == i10) {
                            i23 = i26;
                        } else {
                            i32++;
                            if (i30 > 0 && i30 >= i26) {
                                i14 += oVar.f16705h.f16684f;
                            }
                            g gVar = oVar.f16703e;
                            int i33 = gVar.g;
                            i23 = i26;
                            boolean z13 = oVar.f16702d != 3;
                            if (z13) {
                                int i34 = this.f16704f;
                                if (i34 == 0 && !dVar3.f16371d.f16703e.j) {
                                    return;
                                }
                                if (i34 == 1 && !dVar3.f16373e.f16703e.j) {
                                    return;
                                } else {
                                    z11 = z13;
                                }
                            } else {
                                z11 = z13;
                                if (oVar.f16699a == 1 && i29 == 0) {
                                    i24 = gVar.f16688m;
                                    i31++;
                                } else if (gVar.j) {
                                    i24 = i33;
                                }
                                z11 = true;
                                if (z11) {
                                    i31++;
                                    float f11 = dVar3.f16383k0[this.f16704f];
                                    if (f11 >= 0.0f) {
                                        f4 += f11;
                                    }
                                } else {
                                    i14 += i24;
                                }
                                if (i30 < i27 && i30 < i7) {
                                    i14 += -oVar.f16706i.f16684f;
                                }
                            }
                            i24 = i33;
                            if (z11) {
                            }
                            if (i30 < i27) {
                                i14 += -oVar.f16706i.f16684f;
                            }
                        }
                        i30++;
                        arrayList3 = arrayList4;
                        i26 = i23;
                        i10 = 8;
                    }
                    arrayList = arrayList3;
                    i11 = i26;
                    if (i14 < i25 || i31 == 0) {
                        i12 = i31;
                        i13 = i32;
                        break;
                    } else {
                        i29++;
                        arrayList3 = arrayList;
                        i26 = i11;
                        i10 = 8;
                    }
                }
                arrayList = arrayList3;
                i11 = i26;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                f4 = 0.0f;
                int i35 = fVar.g;
                if (z12) {
                    i35 = fVar2.g;
                }
                if (i14 > i25) {
                    i35 = z12 ? i35 + ((int) (((i14 - i25) / 2.0f) + 0.5f)) : i35 - ((int) (((i14 - i25) / 2.0f) + 0.5f));
                }
                if (i12 > 0) {
                    float f12 = i25 - i14;
                    int i36 = (int) ((f12 / i12) + 0.5f);
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < size) {
                        ArrayList arrayList5 = arrayList;
                        o oVar2 = (o) arrayList5.get(i37);
                        int i39 = i36;
                        d1.d dVar4 = oVar2.f16700b;
                        int i40 = i14;
                        int i41 = i35;
                        if (dVar4.f16377g0 != 8 && oVar2.f16702d == 3) {
                            g gVar2 = oVar2.f16703e;
                            if (!gVar2.j) {
                                if (f4 > 0.0f) {
                                    z10 = z12;
                                    i20 = (int) (((dVar4.f16383k0[this.f16704f] * f12) / f4) + 0.5f);
                                } else {
                                    z10 = z12;
                                    i20 = i39;
                                }
                                if (this.f16704f == 0) {
                                    i21 = dVar4.f16399v;
                                    i22 = dVar4.f16398u;
                                } else {
                                    i21 = dVar4.f16402y;
                                    i22 = dVar4.f16401x;
                                }
                                f10 = f12;
                                int max = Math.max(i22, oVar2.f16699a == 1 ? Math.min(i20, gVar2.f16688m) : i20);
                                if (i21 > 0) {
                                    max = Math.min(i21, max);
                                }
                                if (max != i20) {
                                    i38++;
                                    i20 = max;
                                }
                                gVar2.d(i20);
                                i37++;
                                i36 = i39;
                                i14 = i40;
                                i35 = i41;
                                z12 = z10;
                                f12 = f10;
                                arrayList = arrayList5;
                            }
                        }
                        z10 = z12;
                        f10 = f12;
                        i37++;
                        i36 = i39;
                        i14 = i40;
                        i35 = i41;
                        z12 = z10;
                        f12 = f10;
                        arrayList = arrayList5;
                    }
                    i15 = i35;
                    z8 = z12;
                    arrayList2 = arrayList;
                    int i42 = i14;
                    if (i38 > 0) {
                        i12 -= i38;
                        int i43 = 0;
                        i14 = 0;
                        while (i43 < size) {
                            o oVar3 = (o) arrayList2.get(i43);
                            if (oVar3.f16700b.f16377g0 == 8) {
                                i19 = i11;
                            } else {
                                i19 = i11;
                                if (i43 > 0 && i43 >= i19) {
                                    i14 += oVar3.f16705h.f16684f;
                                }
                                i14 += oVar3.f16703e.g;
                                if (i43 < i27 && i43 < i7) {
                                    i14 += -oVar3.f16706i.f16684f;
                                }
                            }
                            i43++;
                            i11 = i19;
                        }
                        i16 = i11;
                    } else {
                        i16 = i11;
                        i14 = i42;
                    }
                    i18 = 2;
                    if (this.f16671l == 2 && i38 == 0) {
                        i17 = 0;
                        this.f16671l = 0;
                    } else {
                        i17 = 0;
                    }
                } else {
                    i15 = i35;
                    z8 = z12;
                    arrayList2 = arrayList;
                    i16 = i11;
                    i17 = 0;
                    i18 = 2;
                }
                if (i14 > i25) {
                    this.f16671l = i18;
                }
                if (i13 > 0 && i12 == 0 && i16 == i7) {
                    this.f16671l = i18;
                }
                int i44 = this.f16671l;
                if (i44 == 1) {
                    int i45 = i13 > 1 ? (i25 - i14) / (i13 - 1) : i13 == 1 ? (i25 - i14) / 2 : i17;
                    if (i12 > 0) {
                        i45 = i17;
                    }
                    int i46 = i15;
                    for (int i47 = i17; i47 < size; i47++) {
                        o oVar4 = (o) arrayList2.get(z8 ? size - (i47 + 1) : i47);
                        int i48 = oVar4.f16700b.f16377g0;
                        f fVar3 = oVar4.f16706i;
                        f fVar4 = oVar4.f16705h;
                        if (i48 == 8) {
                            fVar4.d(i46);
                            fVar3.d(i46);
                        } else {
                            if (i47 > 0) {
                                i46 = z8 ? i46 - i45 : i46 + i45;
                            }
                            if (i47 > 0 && i47 >= i16) {
                                i46 = z8 ? i46 - fVar4.f16684f : i46 + fVar4.f16684f;
                            }
                            if (z8) {
                                fVar3.d(i46);
                            } else {
                                fVar4.d(i46);
                            }
                            g gVar3 = oVar4.f16703e;
                            int i49 = gVar3.g;
                            if (oVar4.f16702d == 3 && oVar4.f16699a == 1) {
                                i49 = gVar3.f16688m;
                            }
                            i46 = z8 ? i46 - i49 : i46 + i49;
                            if (z8) {
                                fVar4.d(i46);
                            } else {
                                fVar3.d(i46);
                            }
                            oVar4.g = true;
                            if (i47 < i27 && i47 < i7) {
                                i46 = z8 ? i46 - (-fVar3.f16684f) : i46 + (-fVar3.f16684f);
                            }
                        }
                    }
                    return;
                }
                if (i44 == 0) {
                    int i50 = (i25 - i14) / (i13 + 1);
                    if (i12 > 0) {
                        i50 = i17;
                    }
                    int i51 = i15;
                    for (int i52 = i17; i52 < size; i52++) {
                        o oVar5 = (o) arrayList2.get(z8 ? size - (i52 + 1) : i52);
                        int i53 = oVar5.f16700b.f16377g0;
                        f fVar5 = oVar5.f16706i;
                        f fVar6 = oVar5.f16705h;
                        if (i53 == 8) {
                            fVar6.d(i51);
                            fVar5.d(i51);
                        } else {
                            int i54 = z8 ? i51 - i50 : i51 + i50;
                            if (i52 > 0 && i52 >= i16) {
                                i54 = z8 ? i54 - fVar6.f16684f : i54 + fVar6.f16684f;
                            }
                            if (z8) {
                                fVar5.d(i54);
                            } else {
                                fVar6.d(i54);
                            }
                            g gVar4 = oVar5.f16703e;
                            int i55 = gVar4.g;
                            if (oVar5.f16702d == 3 && oVar5.f16699a == 1) {
                                i55 = Math.min(i55, gVar4.f16688m);
                            }
                            i51 = z8 ? i54 - i55 : i54 + i55;
                            if (z8) {
                                fVar6.d(i51);
                            } else {
                                fVar5.d(i51);
                            }
                            if (i52 < i27 && i52 < i7) {
                                i51 = z8 ? i51 - (-fVar5.f16684f) : i51 + (-fVar5.f16684f);
                            }
                        }
                    }
                    return;
                }
                if (i44 == 2) {
                    float f13 = this.f16704f == 0 ? this.f16700b.f16372d0 : this.f16700b.f16374e0;
                    if (z8) {
                        f13 = 1.0f - f13;
                    }
                    int i56 = (int) (((i25 - i14) * f13) + 0.5f);
                    if (i56 < 0 || i12 > 0) {
                        i56 = i17;
                    }
                    int i57 = z8 ? i15 - i56 : i15 + i56;
                    for (int i58 = i17; i58 < size; i58++) {
                        o oVar6 = (o) arrayList2.get(z8 ? size - (i58 + 1) : i58);
                        int i59 = oVar6.f16700b.f16377g0;
                        f fVar7 = oVar6.f16706i;
                        f fVar8 = oVar6.f16705h;
                        if (i59 == 8) {
                            fVar8.d(i57);
                            fVar7.d(i57);
                        } else {
                            if (i58 > 0 && i58 >= i16) {
                                i57 = z8 ? i57 - fVar8.f16684f : i57 + fVar8.f16684f;
                            }
                            if (z8) {
                                fVar7.d(i57);
                            } else {
                                fVar8.d(i57);
                            }
                            g gVar5 = oVar6.f16703e;
                            int i60 = gVar5.g;
                            if (oVar6.f16702d == 3 && oVar6.f16699a == 1) {
                                i60 = gVar5.f16688m;
                            }
                            i57 += i60;
                            if (z8) {
                                fVar8.d(i57);
                            } else {
                                fVar7.d(i57);
                            }
                            if (i58 < i27 && i58 < i7) {
                                i57 = z8 ? i57 - (-fVar7.f16684f) : i57 + (-fVar7.f16684f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // e1.o
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        d1.d dVar = ((o) arrayList.get(0)).f16700b;
        d1.d dVar2 = ((o) arrayList.get(size - 1)).f16700b;
        int i7 = this.f16704f;
        f fVar = this.f16706i;
        f fVar2 = this.f16705h;
        if (i7 == 0) {
            C1040c c1040c = dVar.f16348I;
            C1040c c1040c2 = dVar2.f16350K;
            f i10 = o.i(c1040c, 0);
            int e2 = c1040c.e();
            d1.d m10 = m();
            if (m10 != null) {
                e2 = m10.f16348I.e();
            }
            if (i10 != null) {
                o.b(fVar2, i10, e2);
            }
            f i11 = o.i(c1040c2, 0);
            int e10 = c1040c2.e();
            d1.d n6 = n();
            if (n6 != null) {
                e10 = n6.f16350K.e();
            }
            if (i11 != null) {
                o.b(fVar, i11, -e10);
            }
        } else {
            C1040c c1040c3 = dVar.f16349J;
            C1040c c1040c4 = dVar2.L;
            f i12 = o.i(c1040c3, 1);
            int e11 = c1040c3.e();
            d1.d m11 = m();
            if (m11 != null) {
                e11 = m11.f16349J.e();
            }
            if (i12 != null) {
                o.b(fVar2, i12, e11);
            }
            f i13 = o.i(c1040c4, 1);
            int e12 = c1040c4.e();
            d1.d n8 = n();
            if (n8 != null) {
                e12 = n8.L.e();
            }
            if (i13 != null) {
                o.b(fVar, i13, -e12);
            }
        }
        fVar2.f16679a = this;
        fVar.f16679a = this;
    }

    @Override // e1.o
    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i7)).e();
            i7++;
        }
    }

    @Override // e1.o
    public final void f() {
        this.f16701c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // e1.o
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j = r5.f16706i.f16684f + ((o) arrayList.get(i7)).j() + j + r5.f16705h.f16684f;
        }
        return j;
    }

    @Override // e1.o
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((o) arrayList.get(i7)).k()) {
                return false;
            }
        }
        return true;
    }

    public final d1.d m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i7 >= arrayList.size()) {
                return null;
            }
            d1.d dVar = ((o) arrayList.get(i7)).f16700b;
            if (dVar.f16377g0 != 8) {
                return dVar;
            }
            i7++;
        }
    }

    public final d1.d n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d1.d dVar = ((o) arrayList.get(size)).f16700b;
            if (dVar.f16377g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f16704f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            sb2.append("<");
            sb2.append(oVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
