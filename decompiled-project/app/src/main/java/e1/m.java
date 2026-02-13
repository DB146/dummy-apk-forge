package e1;

import d1.C1040c;

/* loaded from: classes.dex */
public final class m extends o {
    public f k;

    /* renamed from: l, reason: collision with root package name */
    public C1075a f16692l;

    @Override // e1.d
    public final void a(d dVar) {
        float f4;
        float f10;
        float f11;
        int i7;
        if (P.c.b(this.j) == 3) {
            d1.d dVar2 = this.f16700b;
            l(dVar2.f16349J, dVar2.L, 1);
            return;
        }
        g gVar = this.f16703e;
        if (gVar.f16681c && !gVar.j && this.f16702d == 3) {
            d1.d dVar3 = this.f16700b;
            int i10 = dVar3.f16396s;
            if (i10 == 2) {
                d1.d dVar4 = dVar3.f16358T;
                if (dVar4 != null) {
                    if (dVar4.f16373e.f16703e.j) {
                        gVar.d((int) ((r5.g * dVar3.f16403z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                g gVar2 = dVar3.f16371d.f16703e;
                if (gVar2.j) {
                    int i11 = dVar3.f16362X;
                    if (i11 == -1) {
                        f4 = gVar2.g;
                        f10 = dVar3.f16361W;
                    } else if (i11 == 0) {
                        f11 = gVar2.g * dVar3.f16361W;
                        i7 = (int) (f11 + 0.5f);
                        gVar.d(i7);
                    } else if (i11 != 1) {
                        i7 = 0;
                        gVar.d(i7);
                    } else {
                        f4 = gVar2.g;
                        f10 = dVar3.f16361W;
                    }
                    f11 = f4 / f10;
                    i7 = (int) (f11 + 0.5f);
                    gVar.d(i7);
                }
            }
        }
        f fVar = this.f16705h;
        if (fVar.f16681c) {
            f fVar2 = this.f16706i;
            if (fVar2.f16681c) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.f16702d == 3) {
                    d1.d dVar5 = this.f16700b;
                    if (dVar5.f16395r == 0 && !dVar5.y()) {
                        f fVar3 = (f) fVar.f16687l.get(0);
                        f fVar4 = (f) fVar2.f16687l.get(0);
                        int i12 = fVar3.g + fVar.f16684f;
                        int i13 = fVar4.g + fVar2.f16684f;
                        fVar.d(i12);
                        fVar2.d(i13);
                        gVar.d(i13 - i12);
                        return;
                    }
                }
                if (!gVar.j && this.f16702d == 3 && this.f16699a == 1 && fVar.f16687l.size() > 0 && fVar2.f16687l.size() > 0) {
                    f fVar5 = (f) fVar.f16687l.get(0);
                    int i14 = (((f) fVar2.f16687l.get(0)).g + fVar2.f16684f) - (fVar5.g + fVar.f16684f);
                    int i15 = gVar.f16688m;
                    if (i14 < i15) {
                        gVar.d(i14);
                    } else {
                        gVar.d(i15);
                    }
                }
                if (gVar.j && fVar.f16687l.size() > 0 && fVar2.f16687l.size() > 0) {
                    f fVar6 = (f) fVar.f16687l.get(0);
                    f fVar7 = (f) fVar2.f16687l.get(0);
                    int i16 = fVar6.g;
                    int i17 = fVar.f16684f + i16;
                    int i18 = fVar7.g;
                    int i19 = fVar2.f16684f + i18;
                    float f12 = this.f16700b.f16374e0;
                    if (fVar6 == fVar7) {
                        f12 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    fVar.d((int) ((((i18 - i16) - gVar.g) * f12) + i16 + 0.5f));
                    fVar2.d(fVar.g + gVar.g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v124, types: [e1.a, e1.g] */
    @Override // e1.o
    public final void d() {
        d1.d dVar;
        d1.d dVar2;
        d1.d dVar3;
        d1.d dVar4;
        d1.d dVar5 = this.f16700b;
        boolean z8 = dVar5.f16365a;
        g gVar = this.f16703e;
        if (z8) {
            gVar.d(dVar5.k());
        }
        boolean z10 = gVar.j;
        f fVar = this.f16706i;
        f fVar2 = this.f16705h;
        if (!z10) {
            d1.d dVar6 = this.f16700b;
            this.f16702d = dVar6.f16393p0[1];
            if (dVar6.f16344E) {
                this.f16692l = new g(this);
            }
            int i7 = this.f16702d;
            if (i7 != 3) {
                if (i7 == 4 && (dVar4 = this.f16700b.f16358T) != null && dVar4.f16393p0[1] == 1) {
                    int k = (dVar4.k() - this.f16700b.f16349J.e()) - this.f16700b.L.e();
                    o.b(fVar2, dVar4.f16373e.f16705h, this.f16700b.f16349J.e());
                    o.b(fVar, dVar4.f16373e.f16706i, -this.f16700b.L.e());
                    gVar.d(k);
                    return;
                }
                if (i7 == 1) {
                    gVar.d(this.f16700b.k());
                }
            }
        } else if (this.f16702d == 4 && (dVar2 = (dVar = this.f16700b).f16358T) != null && dVar2.f16393p0[1] == 1) {
            o.b(fVar2, dVar2.f16373e.f16705h, dVar.f16349J.e());
            o.b(fVar, dVar2.f16373e.f16706i, -this.f16700b.L.e());
            return;
        }
        boolean z11 = gVar.j;
        f fVar3 = this.k;
        if (z11) {
            d1.d dVar7 = this.f16700b;
            if (dVar7.f16365a) {
                C1040c[] c1040cArr = dVar7.f16355Q;
                C1040c c1040c = c1040cArr[2];
                C1040c c1040c2 = c1040c.f16337f;
                if (c1040c2 != null && c1040cArr[3].f16337f != null) {
                    if (dVar7.y()) {
                        fVar2.f16684f = this.f16700b.f16355Q[2].e();
                        fVar.f16684f = -this.f16700b.f16355Q[3].e();
                    } else {
                        f h10 = o.h(this.f16700b.f16355Q[2]);
                        if (h10 != null) {
                            o.b(fVar2, h10, this.f16700b.f16355Q[2].e());
                        }
                        f h11 = o.h(this.f16700b.f16355Q[3]);
                        if (h11 != null) {
                            o.b(fVar, h11, -this.f16700b.f16355Q[3].e());
                        }
                        fVar2.f16680b = true;
                        fVar.f16680b = true;
                    }
                    d1.d dVar8 = this.f16700b;
                    if (dVar8.f16344E) {
                        o.b(fVar3, fVar2, dVar8.f16366a0);
                        return;
                    }
                    return;
                }
                if (c1040c2 != null) {
                    f h12 = o.h(c1040c);
                    if (h12 != null) {
                        o.b(fVar2, h12, this.f16700b.f16355Q[2].e());
                        o.b(fVar, fVar2, gVar.g);
                        d1.d dVar9 = this.f16700b;
                        if (dVar9.f16344E) {
                            o.b(fVar3, fVar2, dVar9.f16366a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1040c c1040c3 = c1040cArr[3];
                if (c1040c3.f16337f != null) {
                    f h13 = o.h(c1040c3);
                    if (h13 != null) {
                        o.b(fVar, h13, -this.f16700b.f16355Q[3].e());
                        o.b(fVar2, fVar, -gVar.g);
                    }
                    d1.d dVar10 = this.f16700b;
                    if (dVar10.f16344E) {
                        o.b(fVar3, fVar2, dVar10.f16366a0);
                        return;
                    }
                    return;
                }
                C1040c c1040c4 = c1040cArr[4];
                if (c1040c4.f16337f != null) {
                    f h14 = o.h(c1040c4);
                    if (h14 != null) {
                        o.b(fVar3, h14, 0);
                        o.b(fVar2, fVar3, -this.f16700b.f16366a0);
                        o.b(fVar, fVar2, gVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof d1.i) || dVar7.f16358T == null || dVar7.i(7).f16337f != null) {
                    return;
                }
                d1.d dVar11 = this.f16700b;
                o.b(fVar2, dVar11.f16358T.f16373e.f16705h, dVar11.s());
                o.b(fVar, fVar2, gVar.g);
                d1.d dVar12 = this.f16700b;
                if (dVar12.f16344E) {
                    o.b(fVar3, fVar2, dVar12.f16366a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f16702d != 3) {
            gVar.b(this);
        } else {
            d1.d dVar13 = this.f16700b;
            int i10 = dVar13.f16396s;
            if (i10 == 2) {
                d1.d dVar14 = dVar13.f16358T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f16373e.f16703e;
                    gVar.f16687l.add(gVar2);
                    gVar2.k.add(gVar);
                    gVar.f16680b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                }
            } else if (i10 == 3 && !dVar13.y()) {
                d1.d dVar15 = this.f16700b;
                if (dVar15.f16395r != 3) {
                    g gVar3 = dVar15.f16371d.f16703e;
                    gVar.f16687l.add(gVar3);
                    gVar3.k.add(gVar);
                    gVar.f16680b = true;
                    gVar.k.add(fVar2);
                    gVar.k.add(fVar);
                }
            }
        }
        d1.d dVar16 = this.f16700b;
        C1040c[] c1040cArr2 = dVar16.f16355Q;
        C1040c c1040c5 = c1040cArr2[2];
        C1040c c1040c6 = c1040c5.f16337f;
        if (c1040c6 != null && c1040cArr2[3].f16337f != null) {
            if (dVar16.y()) {
                fVar2.f16684f = this.f16700b.f16355Q[2].e();
                fVar.f16684f = -this.f16700b.f16355Q[3].e();
            } else {
                f h15 = o.h(this.f16700b.f16355Q[2]);
                f h16 = o.h(this.f16700b.f16355Q[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.j = 4;
            }
            if (this.f16700b.f16344E) {
                c(fVar3, fVar2, 1, this.f16692l);
            }
        } else if (c1040c6 != null) {
            f h17 = o.h(c1040c5);
            if (h17 != null) {
                o.b(fVar2, h17, this.f16700b.f16355Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f16700b.f16344E) {
                    c(fVar3, fVar2, 1, this.f16692l);
                }
                if (this.f16702d == 3) {
                    d1.d dVar17 = this.f16700b;
                    if (dVar17.f16361W > 0.0f) {
                        k kVar = dVar17.f16371d;
                        if (kVar.f16702d == 3) {
                            kVar.f16703e.k.add(gVar);
                            gVar.f16687l.add(this.f16700b.f16371d.f16703e);
                            gVar.f16679a = this;
                        }
                    }
                }
            }
        } else {
            C1040c c1040c7 = c1040cArr2[3];
            if (c1040c7.f16337f != null) {
                f h18 = o.h(c1040c7);
                if (h18 != null) {
                    o.b(fVar, h18, -this.f16700b.f16355Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f16700b.f16344E) {
                        c(fVar3, fVar2, 1, this.f16692l);
                    }
                }
            } else {
                C1040c c1040c8 = c1040cArr2[4];
                if (c1040c8.f16337f != null) {
                    f h19 = o.h(c1040c8);
                    if (h19 != null) {
                        o.b(fVar3, h19, 0);
                        c(fVar2, fVar3, -1, this.f16692l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof d1.i) && (dVar3 = dVar16.f16358T) != null) {
                    o.b(fVar2, dVar3.f16373e.f16705h, dVar16.s());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f16700b.f16344E) {
                        c(fVar3, fVar2, 1, this.f16692l);
                    }
                    if (this.f16702d == 3) {
                        d1.d dVar18 = this.f16700b;
                        if (dVar18.f16361W > 0.0f) {
                            k kVar2 = dVar18.f16371d;
                            if (kVar2.f16702d == 3) {
                                kVar2.f16703e.k.add(gVar);
                                gVar.f16687l.add(this.f16700b.f16371d.f16703e);
                                gVar.f16679a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f16687l.size() == 0) {
            gVar.f16681c = true;
        }
    }

    @Override // e1.o
    public final void e() {
        f fVar = this.f16705h;
        if (fVar.j) {
            this.f16700b.f16364Z = fVar.g;
        }
    }

    @Override // e1.o
    public final void f() {
        this.f16701c = null;
        this.f16705h.c();
        this.f16706i.c();
        this.k.c();
        this.f16703e.c();
        this.g = false;
    }

    @Override // e1.o
    public final boolean k() {
        return this.f16702d != 3 || this.f16700b.f16396s == 0;
    }

    public final void m() {
        this.g = false;
        f fVar = this.f16705h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f16706i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.k;
        fVar3.c();
        fVar3.j = false;
        this.f16703e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f16700b.f16379h0;
    }
}
