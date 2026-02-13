package d1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f16425a;

    /* renamed from: d, reason: collision with root package name */
    public C1040c f16428d;

    /* renamed from: e, reason: collision with root package name */
    public C1040c f16429e;

    /* renamed from: f, reason: collision with root package name */
    public C1040c f16430f;
    public C1040c g;

    /* renamed from: h, reason: collision with root package name */
    public int f16431h;

    /* renamed from: i, reason: collision with root package name */
    public int f16432i;
    public int j;
    public int k;

    /* renamed from: q, reason: collision with root package name */
    public int f16438q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f16439r;

    /* renamed from: b, reason: collision with root package name */
    public d f16426b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f16427c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f16433l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f16434m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16435n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f16436o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f16437p = 0;

    public f(g gVar, int i7, C1040c c1040c, C1040c c1040c2, C1040c c1040c3, C1040c c1040c4, int i10) {
        this.f16439r = gVar;
        this.f16425a = i7;
        this.f16428d = c1040c;
        this.f16429e = c1040c2;
        this.f16430f = c1040c3;
        this.g = c1040c4;
        this.f16431h = gVar.f16471w0;
        this.f16432i = gVar.f16467s0;
        this.j = gVar.f16472x0;
        this.k = gVar.f16468t0;
        this.f16438q = i10;
    }

    public final void a(d dVar) {
        int i7 = this.f16425a;
        g gVar = this.f16439r;
        if (i7 == 0) {
            int U8 = gVar.U(dVar, this.f16438q);
            if (dVar.f16393p0[0] == 3) {
                this.f16437p++;
                U8 = 0;
            }
            this.f16433l = U8 + (dVar.f16377g0 != 8 ? gVar.f16454P0 : 0) + this.f16433l;
            int T10 = gVar.T(dVar, this.f16438q);
            if (this.f16426b == null || this.f16427c < T10) {
                this.f16426b = dVar;
                this.f16427c = T10;
                this.f16434m = T10;
            }
        } else {
            int U10 = gVar.U(dVar, this.f16438q);
            int T11 = gVar.T(dVar, this.f16438q);
            if (dVar.f16393p0[1] == 3) {
                this.f16437p++;
                T11 = 0;
            }
            this.f16434m = T11 + (dVar.f16377g0 != 8 ? gVar.f16455Q0 : 0) + this.f16434m;
            if (this.f16426b == null || this.f16427c < U10) {
                this.f16426b = dVar;
                this.f16427c = U10;
                this.f16433l = U10;
            }
        }
        this.f16436o++;
    }

    public final void b(int i7, boolean z8, boolean z10) {
        g gVar;
        int i10;
        int i11;
        int i12;
        d dVar;
        int i13;
        char c10;
        int i14;
        float f4;
        float f10;
        int i15;
        float f11;
        int i16;
        int i17 = this.f16436o;
        int i18 = 0;
        while (true) {
            gVar = this.f16439r;
            if (i18 >= i17 || (i16 = this.f16435n + i18) >= gVar.f16466b1) {
                break;
            }
            d dVar2 = gVar.f16465a1[i16];
            if (dVar2 != null) {
                dVar2.D();
            }
            i18++;
        }
        if (i17 == 0 || this.f16426b == null) {
            return;
        }
        boolean z11 = z10 && i7 == 0;
        int i19 = -1;
        int i20 = -1;
        for (int i21 = 0; i21 < i17; i21++) {
            int i22 = this.f16435n + (z8 ? (i17 - 1) - i21 : i21);
            if (i22 >= gVar.f16466b1) {
                break;
            }
            d dVar3 = gVar.f16465a1[i22];
            if (dVar3 != null && dVar3.f16377g0 == 0) {
                if (i19 == -1) {
                    i19 = i21;
                }
                i20 = i21;
            }
        }
        if (this.f16425a != 0) {
            d dVar4 = this.f16426b;
            dVar4.f16381i0 = gVar.f16442D0;
            int i23 = this.f16431h;
            if (i7 > 0) {
                i23 += gVar.f16454P0;
            }
            C1040c c1040c = dVar4.f16348I;
            C1040c c1040c2 = dVar4.f16350K;
            if (z8) {
                c1040c2.a(this.f16430f, i23);
                if (z10) {
                    c1040c.a(this.f16428d, this.j);
                }
                if (i7 > 0) {
                    this.f16430f.f16335d.f16348I.a(c1040c2, 0);
                }
            } else {
                c1040c.a(this.f16428d, i23);
                if (z10) {
                    c1040c2.a(this.f16430f, this.j);
                }
                if (i7 > 0) {
                    this.f16428d.f16335d.f16350K.a(c1040c, 0);
                }
            }
            d dVar5 = null;
            for (int i24 = 0; i24 < i17; i24++) {
                int i25 = this.f16435n + i24;
                if (i25 >= gVar.f16466b1) {
                    return;
                }
                d dVar6 = gVar.f16465a1[i25];
                if (dVar6 != null) {
                    C1040c c1040c3 = dVar6.f16349J;
                    if (i24 == 0) {
                        dVar6.f(c1040c3, this.f16429e, this.f16432i);
                        int i26 = gVar.f16443E0;
                        float f12 = gVar.f16449K0;
                        if (this.f16435n == 0) {
                            i12 = gVar.f16445G0;
                            i10 = i26;
                            i11 = -1;
                            if (i12 != -1) {
                                f12 = gVar.f16451M0;
                                dVar6.f16382j0 = i12;
                                dVar6.f16374e0 = f12;
                            }
                        } else {
                            i10 = i26;
                            i11 = -1;
                        }
                        if (!z10 || (i12 = gVar.f16447I0) == i11) {
                            i12 = i10;
                        } else {
                            f12 = gVar.f16453O0;
                        }
                        dVar6.f16382j0 = i12;
                        dVar6.f16374e0 = f12;
                    }
                    if (i24 == i17 - 1) {
                        dVar6.f(dVar6.L, this.g, this.k);
                    }
                    if (dVar5 != null) {
                        int i27 = gVar.f16455Q0;
                        C1040c c1040c4 = dVar5.L;
                        c1040c3.a(c1040c4, i27);
                        if (i24 == i19) {
                            int i28 = this.f16432i;
                            if (c1040c3.h()) {
                                c1040c3.f16338h = i28;
                            }
                        }
                        c1040c4.a(c1040c3, 0);
                        if (i24 == i20 + 1) {
                            int i29 = this.k;
                            if (c1040c4.h()) {
                                c1040c4.f16338h = i29;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        C1040c c1040c5 = dVar6.f16350K;
                        C1040c c1040c6 = dVar6.f16348I;
                        if (z8) {
                            int i30 = gVar.f16456R0;
                            if (i30 == 0) {
                                c1040c5.a(c1040c2, 0);
                            } else if (i30 == 1) {
                                c1040c6.a(c1040c, 0);
                            } else if (i30 == 2) {
                                c1040c6.a(c1040c, 0);
                                c1040c5.a(c1040c2, 0);
                            }
                        } else {
                            int i31 = gVar.f16456R0;
                            if (i31 == 0) {
                                c1040c6.a(c1040c, 0);
                            } else if (i31 == 1) {
                                c1040c5.a(c1040c2, 0);
                            } else if (i31 == 2) {
                                if (z11) {
                                    c1040c6.a(this.f16428d, this.f16431h);
                                    c1040c5.a(this.f16430f, this.j);
                                } else {
                                    c1040c6.a(c1040c, 0);
                                    c1040c5.a(c1040c2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                    }
                    dVar5 = dVar6;
                }
            }
            return;
        }
        d dVar7 = this.f16426b;
        dVar7.f16382j0 = gVar.f16443E0;
        int i32 = this.f16432i;
        if (i7 > 0) {
            i32 += gVar.f16455Q0;
        }
        C1040c c1040c7 = this.f16429e;
        C1040c c1040c8 = dVar7.f16349J;
        c1040c8.a(c1040c7, i32);
        C1040c c1040c9 = dVar7.L;
        if (z10) {
            c1040c9.a(this.g, this.k);
        }
        if (i7 > 0) {
            this.f16429e.f16335d.L.a(c1040c8, 0);
        }
        if (gVar.f16457S0 == 3 && !dVar7.f16344E) {
            for (int i33 = 0; i33 < i17; i33++) {
                int i34 = this.f16435n + (z8 ? (i17 - 1) - i33 : i33);
                if (i34 >= gVar.f16466b1) {
                    break;
                }
                dVar = gVar.f16465a1[i34];
                if (dVar.f16344E) {
                    break;
                }
            }
        }
        dVar = dVar7;
        int i35 = 0;
        d dVar8 = null;
        while (i35 < i17) {
            int i36 = z8 ? (i17 - 1) - i35 : i35;
            int i37 = this.f16435n + i36;
            if (i37 >= gVar.f16466b1) {
                return;
            }
            d dVar9 = gVar.f16465a1[i37];
            if (dVar9 == null) {
                i13 = i17;
                c10 = 3;
            } else {
                C1040c c1040c10 = dVar9.f16348I;
                if (i35 == 0) {
                    dVar9.f(c1040c10, this.f16428d, this.f16431h);
                }
                if (i36 == 0) {
                    int i38 = gVar.f16442D0;
                    if (z8) {
                        i14 = i38;
                        f4 = 1.0f - gVar.f16448J0;
                    } else {
                        i14 = i38;
                        f4 = gVar.f16448J0;
                    }
                    if (this.f16435n == 0) {
                        int i39 = gVar.f16444F0;
                        f10 = f4;
                        if (i39 != -1) {
                            f11 = z8 ? 1.0f - gVar.f16450L0 : gVar.f16450L0;
                            i15 = i39;
                            dVar9.f16381i0 = i15;
                            dVar9.f16372d0 = f11;
                        }
                    } else {
                        f10 = f4;
                    }
                    if (!z10 || (i15 = gVar.f16446H0) == -1) {
                        i15 = i14;
                        f11 = f10;
                    } else {
                        f11 = z8 ? 1.0f - gVar.f16452N0 : gVar.f16452N0;
                    }
                    dVar9.f16381i0 = i15;
                    dVar9.f16372d0 = f11;
                }
                if (i35 == i17 - 1) {
                    i13 = i17;
                    dVar9.f(dVar9.f16350K, this.f16430f, this.j);
                } else {
                    i13 = i17;
                }
                if (dVar8 != null) {
                    int i40 = gVar.f16454P0;
                    C1040c c1040c11 = dVar8.f16350K;
                    c1040c10.a(c1040c11, i40);
                    if (i35 == i19) {
                        int i41 = this.f16431h;
                        if (c1040c10.h()) {
                            c1040c10.f16338h = i41;
                        }
                    }
                    c1040c11.a(c1040c10, 0);
                    if (i35 == i20 + 1) {
                        int i42 = this.j;
                        if (c1040c11.h()) {
                            c1040c11.f16338h = i42;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i43 = gVar.f16457S0;
                    c10 = 3;
                    if (i43 == 3 && dVar.f16344E && dVar9 != dVar && dVar9.f16344E) {
                        dVar9.f16351M.a(dVar.f16351M, 0);
                    } else {
                        C1040c c1040c12 = dVar9.f16349J;
                        if (i43 != 0) {
                            C1040c c1040c13 = dVar9.L;
                            if (i43 == 1) {
                                c1040c13.a(c1040c9, 0);
                            } else if (z11) {
                                c1040c12.a(this.f16429e, this.f16432i);
                                c1040c13.a(this.g, this.k);
                            } else {
                                c1040c12.a(c1040c8, 0);
                                c1040c13.a(c1040c9, 0);
                            }
                        } else {
                            c1040c12.a(c1040c8, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                dVar8 = dVar9;
            }
            i35++;
            i17 = i13;
        }
    }

    public final int c() {
        return this.f16425a == 1 ? this.f16434m - this.f16439r.f16455Q0 : this.f16434m;
    }

    public final int d() {
        return this.f16425a == 0 ? this.f16433l - this.f16439r.f16454P0 : this.f16433l;
    }

    public final void e(int i7) {
        g gVar;
        int i10;
        int i11 = this.f16437p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f16436o;
        int i13 = i7 / i11;
        int i14 = 0;
        while (true) {
            gVar = this.f16439r;
            if (i14 >= i12 || (i10 = this.f16435n + i14) >= gVar.f16466b1) {
                break;
            }
            d dVar = gVar.f16465a1[i10];
            if (this.f16425a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f16393p0;
                    if (iArr[0] == 3 && dVar.f16395r == 0) {
                        gVar.V(1, i13, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f16393p0;
                if (iArr2[1] == 3 && dVar.f16396s == 0) {
                    gVar.V(iArr2[0], dVar.q(), 1, i13, dVar);
                }
            }
            i14++;
        }
        this.f16433l = 0;
        this.f16434m = 0;
        this.f16426b = null;
        this.f16427c = 0;
        int i15 = this.f16436o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f16435n + i16;
            if (i17 >= gVar.f16466b1) {
                return;
            }
            d dVar2 = gVar.f16465a1[i17];
            if (this.f16425a == 0) {
                int q10 = dVar2.q();
                int i18 = gVar.f16454P0;
                if (dVar2.f16377g0 == 8) {
                    i18 = 0;
                }
                this.f16433l = q10 + i18 + this.f16433l;
                int T10 = gVar.T(dVar2, this.f16438q);
                if (this.f16426b == null || this.f16427c < T10) {
                    this.f16426b = dVar2;
                    this.f16427c = T10;
                    this.f16434m = T10;
                }
            } else {
                int U8 = gVar.U(dVar2, this.f16438q);
                int T11 = gVar.T(dVar2, this.f16438q);
                int i19 = gVar.f16455Q0;
                if (dVar2.f16377g0 == 8) {
                    i19 = 0;
                }
                this.f16434m = T11 + i19 + this.f16434m;
                if (this.f16426b == null || this.f16427c < U8) {
                    this.f16426b = dVar2;
                    this.f16427c = U8;
                    this.f16433l = U8;
                }
            }
        }
    }

    public final void f(int i7, C1040c c1040c, C1040c c1040c2, C1040c c1040c3, C1040c c1040c4, int i10, int i11, int i12, int i13, int i14) {
        this.f16425a = i7;
        this.f16428d = c1040c;
        this.f16429e = c1040c2;
        this.f16430f = c1040c3;
        this.g = c1040c4;
        this.f16431h = i10;
        this.f16432i = i11;
        this.j = i12;
        this.k = i13;
        this.f16438q = i14;
    }
}
