package d1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f16440A0;

    /* renamed from: B0, reason: collision with root package name */
    public e1.b f16441B0;
    public g1.f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f16442D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f16443E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f16444F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f16445G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f16446H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f16447I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f16448J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f16449K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f16450L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f16451M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f16452N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f16453O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f16454P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f16455Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f16456R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f16457S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f16458T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f16459U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f16460V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f16461W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f16462X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f16463Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f16464Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f16465a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f16466b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f16467s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f16468t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f16469u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f16470v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f16471w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f16472x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f16473y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f16474z0;

    @Override // d1.i
    public final void S() {
        for (int i7 = 0; i7 < this.f16482r0; i7++) {
            d dVar = this.f16481q0[i7];
            if (dVar != null) {
                dVar.f16345F = true;
            }
        }
    }

    public final int T(d dVar, int i7) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f16393p0;
        if (iArr[1] == 3) {
            int i10 = dVar.f16396s;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (dVar.f16403z * i7);
                if (i11 != dVar.k()) {
                    dVar.g = true;
                    V(iArr[0], dVar.q(), 1, i11, dVar);
                }
                return i11;
            }
            if (i10 == 1) {
                return dVar.k();
            }
            if (i10 == 3) {
                return (int) ((dVar.q() * dVar.f16361W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i7) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f16393p0;
        if (iArr[0] == 3) {
            int i10 = dVar.f16395r;
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 2) {
                int i11 = (int) (dVar.f16400w * i7);
                if (i11 != dVar.q()) {
                    dVar.g = true;
                    V(1, i11, iArr[1], dVar.k(), dVar);
                }
                return i11;
            }
            if (i10 == 1) {
                return dVar.q();
            }
            if (i10 == 3) {
                return (int) ((dVar.k() * dVar.f16361W) + 0.5f);
            }
        }
        return dVar.q();
    }

    public final void V(int i7, int i10, int i11, int i12, d dVar) {
        g1.f fVar;
        d dVar2;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.f16358T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f16419u0;
            }
        }
        e1.b bVar = this.f16441B0;
        bVar.f16663a = i7;
        bVar.f16664b = i11;
        bVar.f16665c = i10;
        bVar.f16666d = i12;
        fVar.b(dVar, bVar);
        dVar.O(bVar.f16667e);
        dVar.L(bVar.f16668f);
        dVar.f16344E = bVar.f16669h;
        dVar.I(bVar.g);
    }

    @Override // d1.d
    public final void b(b1.c cVar, boolean z8) {
        d dVar;
        float f4;
        int i7;
        super.b(cVar, z8);
        d dVar2 = this.f16358T;
        boolean z10 = dVar2 != null && ((e) dVar2).f16420v0;
        int i10 = this.f16458T0;
        ArrayList arrayList = this.f16461W0;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    ((f) arrayList.get(i11)).b(i11, z10, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        ((f) arrayList.get(i12)).b(i12, z10, i12 == size2 + (-1));
                        i12++;
                    }
                }
            } else if (this.f16464Z0 != null && this.f16463Y0 != null && this.f16462X0 != null) {
                for (int i13 = 0; i13 < this.f16466b1; i13++) {
                    this.f16465a1[i13].D();
                }
                int[] iArr = this.f16464Z0;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f10 = this.f16448J0;
                d dVar3 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z10) {
                        i7 = (i14 - i16) - 1;
                        f4 = 1.0f - this.f16448J0;
                    } else {
                        f4 = f10;
                        i7 = i16;
                    }
                    d dVar4 = this.f16463Y0[i7];
                    if (dVar4 != null && dVar4.f16377g0 != 8) {
                        C1040c c1040c = dVar4.f16348I;
                        if (i16 == 0) {
                            dVar4.f(c1040c, this.f16348I, this.f16471w0);
                            dVar4.f16381i0 = this.f16442D0;
                            dVar4.f16372d0 = f4;
                        }
                        if (i16 == i14 - 1) {
                            dVar4.f(dVar4.f16350K, this.f16350K, this.f16472x0);
                        }
                        if (i16 > 0 && dVar3 != null) {
                            int i17 = this.f16454P0;
                            C1040c c1040c2 = dVar3.f16350K;
                            dVar4.f(c1040c, c1040c2, i17);
                            dVar3.f(c1040c2, c1040c, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i16++;
                    f10 = f4;
                }
                for (int i18 = 0; i18 < i15; i18++) {
                    d dVar5 = this.f16462X0[i18];
                    if (dVar5 != null && dVar5.f16377g0 != 8) {
                        C1040c c1040c3 = dVar5.f16349J;
                        if (i18 == 0) {
                            dVar5.f(c1040c3, this.f16349J, this.f16467s0);
                            dVar5.f16382j0 = this.f16443E0;
                            dVar5.f16374e0 = this.f16449K0;
                        }
                        if (i18 == i15 - 1) {
                            dVar5.f(dVar5.L, this.L, this.f16468t0);
                        }
                        if (i18 > 0 && dVar3 != null) {
                            int i19 = this.f16455Q0;
                            C1040c c1040c4 = dVar3.L;
                            dVar5.f(c1040c3, c1040c4, i19);
                            dVar3.f(c1040c4, c1040c3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    for (int i21 = 0; i21 < i15; i21++) {
                        int i22 = (i21 * i14) + i20;
                        if (this.f16460V0 == 1) {
                            i22 = (i20 * i15) + i21;
                        }
                        d[] dVarArr = this.f16465a1;
                        if (i22 < dVarArr.length && (dVar = dVarArr[i22]) != null && dVar.f16377g0 != 8) {
                            d dVar6 = this.f16463Y0[i20];
                            d dVar7 = this.f16462X0[i21];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f16348I, dVar6.f16348I, 0);
                                dVar.f(dVar.f16350K, dVar6.f16350K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f16349J, dVar7.f16349J, 0);
                                dVar.f(dVar.L, dVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f16473y0 = false;
    }
}
