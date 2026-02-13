package e1;

import d1.C1040c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends o {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i7, int i10, int i11, int i12, float f4, int i13) {
        int i14 = i10 - i7;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f4) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f4) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f4) + 0.5f);
        int i17 = (int) ((i14 / f4) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // e1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f4;
        float f10;
        float f11;
        int i7;
        if (P.c.b(this.j) == 3) {
            d1.d dVar2 = this.f16700b;
            l(dVar2.f16348I, dVar2.f16350K, 0);
            return;
        }
        g gVar = this.f16703e;
        boolean z8 = gVar.j;
        f fVar = this.f16705h;
        f fVar2 = this.f16706i;
        if (!z8 && this.f16702d == 3) {
            d1.d dVar3 = this.f16700b;
            int i10 = dVar3.f16395r;
            if (i10 == 2) {
                d1.d dVar4 = dVar3.f16358T;
                if (dVar4 != null) {
                    if (dVar4.f16371d.f16703e.j) {
                        gVar.d((int) ((r3.g * dVar3.f16400w) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                int i11 = dVar3.f16396s;
                if (i11 == 0 || i11 == 3) {
                    m mVar = dVar3.f16373e;
                    f fVar3 = mVar.f16705h;
                    f fVar4 = mVar.f16706i;
                    boolean z10 = dVar3.f16348I.f16337f != null;
                    boolean z11 = dVar3.f16349J.f16337f != null;
                    boolean z12 = dVar3.f16350K.f16337f != null;
                    boolean z13 = dVar3.L.f16337f != null;
                    int i12 = dVar3.f16362X;
                    if (z10 && z11 && z12 && z13) {
                        float f12 = dVar3.f16361W;
                        boolean z14 = fVar3.j;
                        int[] iArr = k;
                        if (z14 && fVar4.j) {
                            if (fVar.f16681c && fVar2.f16681c) {
                                m(iArr, ((f) fVar.f16687l.get(0)).g + fVar.f16684f, ((f) fVar2.f16687l.get(0)).g - fVar2.f16684f, fVar3.g + fVar3.f16684f, fVar4.g - fVar4.f16684f, f12, i12);
                                gVar.d(iArr[0]);
                                this.f16700b.f16373e.f16703e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z15 = fVar.j;
                        ArrayList arrayList = fVar3.f16687l;
                        if (z15 && fVar2.j) {
                            if (!fVar3.f16681c || !fVar4.f16681c) {
                                return;
                            }
                            m(iArr, fVar.g + fVar.f16684f, fVar2.g - fVar2.f16684f, ((f) arrayList.get(0)).g + fVar3.f16684f, ((f) fVar4.f16687l.get(0)).g - fVar4.f16684f, f12, i12);
                            gVar.d(iArr[0]);
                            this.f16700b.f16373e.f16703e.d(iArr[1]);
                        }
                        if (!fVar.f16681c || !fVar2.f16681c || !fVar3.f16681c || !fVar4.f16681c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f16687l.get(0)).g + fVar.f16684f, ((f) fVar2.f16687l.get(0)).g - fVar2.f16684f, ((f) arrayList.get(0)).g + fVar3.f16684f, ((f) fVar4.f16687l.get(0)).g - fVar4.f16684f, f12, i12);
                        gVar.d(iArr[0]);
                        this.f16700b.f16373e.f16703e.d(iArr[1]);
                    } else if (z10 && z12) {
                        if (!fVar.f16681c || !fVar2.f16681c) {
                            return;
                        }
                        float f13 = dVar3.f16361W;
                        int i13 = ((f) fVar.f16687l.get(0)).g + fVar.f16684f;
                        int i14 = ((f) fVar2.f16687l.get(0)).g - fVar2.f16684f;
                        if (i12 == -1 || i12 == 0) {
                            int g = g(i14 - i13, 0);
                            int i15 = (int) ((g * f13) + 0.5f);
                            int g2 = g(i15, 1);
                            if (i15 != g2) {
                                g = (int) ((g2 / f13) + 0.5f);
                            }
                            gVar.d(g);
                            this.f16700b.f16373e.f16703e.d(g2);
                        } else if (i12 == 1) {
                            int g10 = g(i14 - i13, 0);
                            int i16 = (int) ((g10 / f13) + 0.5f);
                            int g11 = g(i16, 1);
                            if (i16 != g11) {
                                g10 = (int) ((g11 * f13) + 0.5f);
                            }
                            gVar.d(g10);
                            this.f16700b.f16373e.f16703e.d(g11);
                        }
                    } else if (z11 && z13) {
                        if (!fVar3.f16681c || !fVar4.f16681c) {
                            return;
                        }
                        float f14 = dVar3.f16361W;
                        int i17 = ((f) fVar3.f16687l.get(0)).g + fVar3.f16684f;
                        int i18 = ((f) fVar4.f16687l.get(0)).g - fVar4.f16684f;
                        if (i12 != -1) {
                            if (i12 == 0) {
                                int g12 = g(i18 - i17, 1);
                                int i19 = (int) ((g12 * f14) + 0.5f);
                                int g13 = g(i19, 0);
                                if (i19 != g13) {
                                    g12 = (int) ((g13 / f14) + 0.5f);
                                }
                                gVar.d(g13);
                                this.f16700b.f16373e.f16703e.d(g12);
                            }
                        }
                        int g14 = g(i18 - i17, 1);
                        int i20 = (int) ((g14 / f14) + 0.5f);
                        int g15 = g(i20, 0);
                        if (i20 != g15) {
                            g14 = (int) ((g15 * f14) + 0.5f);
                        }
                        gVar.d(g15);
                        this.f16700b.f16373e.f16703e.d(g14);
                    }
                } else {
                    int i21 = dVar3.f16362X;
                    if (i21 == -1) {
                        f4 = dVar3.f16373e.f16703e.g;
                        f10 = dVar3.f16361W;
                    } else if (i21 == 0) {
                        f11 = dVar3.f16373e.f16703e.g / dVar3.f16361W;
                        i7 = (int) (f11 + 0.5f);
                        gVar.d(i7);
                    } else if (i21 != 1) {
                        i7 = 0;
                        gVar.d(i7);
                    } else {
                        f4 = dVar3.f16373e.f16703e.g;
                        f10 = dVar3.f16361W;
                    }
                    f11 = f4 * f10;
                    i7 = (int) (f11 + 0.5f);
                    gVar.d(i7);
                }
            }
        }
        if (fVar.f16681c && fVar2.f16681c) {
            if (fVar.j && fVar2.j && gVar.j) {
                return;
            }
            if (!gVar.j && this.f16702d == 3) {
                d1.d dVar5 = this.f16700b;
                if (dVar5.f16395r == 0 && !dVar5.x()) {
                    f fVar5 = (f) fVar.f16687l.get(0);
                    f fVar6 = (f) fVar2.f16687l.get(0);
                    int i22 = fVar5.g + fVar.f16684f;
                    int i23 = fVar6.g + fVar2.f16684f;
                    fVar.d(i22);
                    fVar2.d(i23);
                    gVar.d(i23 - i22);
                    return;
                }
            }
            if (!gVar.j && this.f16702d == 3 && this.f16699a == 1 && fVar.f16687l.size() > 0 && fVar2.f16687l.size() > 0) {
                int min = Math.min((((f) fVar2.f16687l.get(0)).g + fVar2.f16684f) - (((f) fVar.f16687l.get(0)).g + fVar.f16684f), gVar.f16688m);
                d1.d dVar6 = this.f16700b;
                int i24 = dVar6.f16399v;
                int max = Math.max(dVar6.f16398u, min);
                if (i24 > 0) {
                    max = Math.min(i24, max);
                }
                gVar.d(max);
            }
            if (gVar.j) {
                f fVar7 = (f) fVar.f16687l.get(0);
                f fVar8 = (f) fVar2.f16687l.get(0);
                int i25 = fVar7.g;
                int i26 = fVar.f16684f + i25;
                int i27 = fVar8.g;
                int i28 = fVar2.f16684f + i27;
                float f15 = this.f16700b.f16372d0;
                if (fVar7 == fVar8) {
                    f15 = 0.5f;
                } else {
                    i25 = i26;
                    i27 = i28;
                }
                fVar.d((int) ((((i27 - i25) - gVar.g) * f15) + i25 + 0.5f));
                fVar2.d(fVar.g + gVar.g);
            }
        }
    }

    @Override // e1.o
    public final void d() {
        d1.d dVar;
        d1.d dVar2;
        int i7;
        d1.d dVar3;
        d1.d dVar4;
        int i10;
        d1.d dVar5 = this.f16700b;
        boolean z8 = dVar5.f16365a;
        g gVar = this.f16703e;
        if (z8) {
            gVar.d(dVar5.q());
        }
        boolean z10 = gVar.j;
        f fVar = this.f16706i;
        f fVar2 = this.f16705h;
        if (!z10) {
            d1.d dVar6 = this.f16700b;
            int i11 = dVar6.f16393p0[0];
            this.f16702d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.f16358T) != null && ((i10 = dVar4.f16393p0[0]) == 1 || i10 == 4)) {
                    int q10 = (dVar4.q() - this.f16700b.f16348I.e()) - this.f16700b.f16350K.e();
                    o.b(fVar2, dVar4.f16371d.f16705h, this.f16700b.f16348I.e());
                    o.b(fVar, dVar4.f16371d.f16706i, -this.f16700b.f16350K.e());
                    gVar.d(q10);
                    return;
                }
                if (i11 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f16702d == 4 && (dVar2 = (dVar = this.f16700b).f16358T) != null && ((i7 = dVar2.f16393p0[0]) == 1 || i7 == 4)) {
            o.b(fVar2, dVar2.f16371d.f16705h, dVar.f16348I.e());
            o.b(fVar, dVar2.f16371d.f16706i, -this.f16700b.f16350K.e());
            return;
        }
        if (gVar.j) {
            d1.d dVar7 = this.f16700b;
            if (dVar7.f16365a) {
                C1040c[] c1040cArr = dVar7.f16355Q;
                C1040c c1040c = c1040cArr[0];
                C1040c c1040c2 = c1040c.f16337f;
                if (c1040c2 != null && c1040cArr[1].f16337f != null) {
                    if (dVar7.x()) {
                        fVar2.f16684f = this.f16700b.f16355Q[0].e();
                        fVar.f16684f = -this.f16700b.f16355Q[1].e();
                        return;
                    }
                    f h10 = o.h(this.f16700b.f16355Q[0]);
                    if (h10 != null) {
                        o.b(fVar2, h10, this.f16700b.f16355Q[0].e());
                    }
                    f h11 = o.h(this.f16700b.f16355Q[1]);
                    if (h11 != null) {
                        o.b(fVar, h11, -this.f16700b.f16355Q[1].e());
                    }
                    fVar2.f16680b = true;
                    fVar.f16680b = true;
                    return;
                }
                if (c1040c2 != null) {
                    f h12 = o.h(c1040c);
                    if (h12 != null) {
                        o.b(fVar2, h12, this.f16700b.f16355Q[0].e());
                        o.b(fVar, fVar2, gVar.g);
                        return;
                    }
                    return;
                }
                C1040c c1040c3 = c1040cArr[1];
                if (c1040c3.f16337f != null) {
                    f h13 = o.h(c1040c3);
                    if (h13 != null) {
                        o.b(fVar, h13, -this.f16700b.f16355Q[1].e());
                        o.b(fVar2, fVar, -gVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof d1.i) || dVar7.f16358T == null || dVar7.i(7).f16337f != null) {
                    return;
                }
                d1.d dVar8 = this.f16700b;
                o.b(fVar2, dVar8.f16358T.f16371d.f16705h, dVar8.r());
                o.b(fVar, fVar2, gVar.g);
                return;
            }
        }
        if (this.f16702d == 3) {
            d1.d dVar9 = this.f16700b;
            int i12 = dVar9.f16395r;
            if (i12 == 2) {
                d1.d dVar10 = dVar9.f16358T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f16373e.f16703e;
                    gVar.f16687l.add(gVar2);
                    gVar2.k.add(gVar);
                    gVar.f16680b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                }
            } else if (i12 == 3) {
                if (dVar9.f16396s == 3) {
                    fVar2.f16679a = this;
                    fVar.f16679a = this;
                    m mVar = dVar9.f16373e;
                    mVar.f16705h.f16679a = this;
                    mVar.f16706i.f16679a = this;
                    gVar.f16679a = this;
                    if (dVar9.y()) {
                        gVar.f16687l.add(this.f16700b.f16373e.f16703e);
                        this.f16700b.f16373e.f16703e.k.add(gVar);
                        m mVar2 = this.f16700b.f16373e;
                        mVar2.f16703e.f16679a = this;
                        gVar.f16687l.add(mVar2.f16705h);
                        gVar.f16687l.add(this.f16700b.f16373e.f16706i);
                        this.f16700b.f16373e.f16705h.k.add(gVar);
                        this.f16700b.f16373e.f16706i.k.add(gVar);
                    } else if (this.f16700b.x()) {
                        this.f16700b.f16373e.f16703e.f16687l.add(gVar);
                        gVar.k.add(this.f16700b.f16373e.f16703e);
                    } else {
                        this.f16700b.f16373e.f16703e.f16687l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f16373e.f16703e;
                    gVar.f16687l.add(gVar3);
                    gVar3.k.add(gVar);
                    this.f16700b.f16373e.f16705h.k.add(gVar);
                    this.f16700b.f16373e.f16706i.k.add(gVar);
                    gVar.f16680b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                    fVar2.f16687l.add(gVar);
                    fVar.f16687l.add(gVar);
                }
            }
        }
        d1.d dVar11 = this.f16700b;
        C1040c[] c1040cArr2 = dVar11.f16355Q;
        C1040c c1040c4 = c1040cArr2[0];
        C1040c c1040c5 = c1040c4.f16337f;
        if (c1040c5 != null && c1040cArr2[1].f16337f != null) {
            if (dVar11.x()) {
                fVar2.f16684f = this.f16700b.f16355Q[0].e();
                fVar.f16684f = -this.f16700b.f16355Q[1].e();
                return;
            }
            f h14 = o.h(this.f16700b.f16355Q[0]);
            f h15 = o.h(this.f16700b.f16355Q[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.j = 4;
            return;
        }
        if (c1040c5 != null) {
            f h16 = o.h(c1040c4);
            if (h16 != null) {
                o.b(fVar2, h16, this.f16700b.f16355Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        C1040c c1040c6 = c1040cArr2[1];
        if (c1040c6.f16337f != null) {
            f h17 = o.h(c1040c6);
            if (h17 != null) {
                o.b(fVar, h17, -this.f16700b.f16355Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof d1.i) || (dVar3 = dVar11.f16358T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f16371d.f16705h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // e1.o
    public final void e() {
        f fVar = this.f16705h;
        if (fVar.j) {
            this.f16700b.f16363Y = fVar.g;
        }
    }

    @Override // e1.o
    public final void f() {
        this.f16701c = null;
        this.f16705h.c();
        this.f16706i.c();
        this.f16703e.c();
        this.g = false;
    }

    @Override // e1.o
    public final boolean k() {
        return this.f16702d != 3 || this.f16700b.f16395r == 0;
    }

    public final void n() {
        this.g = false;
        f fVar = this.f16705h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f16706i;
        fVar2.c();
        fVar2.j = false;
        this.f16703e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f16700b.f16379h0;
    }
}
