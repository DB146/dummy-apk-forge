package W8;

import P8.j;
import P8.p;
import V8.b;
import o4.AbstractC1787a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f10847a;

    /* renamed from: b, reason: collision with root package name */
    public int f10848b;

    /* renamed from: c, reason: collision with root package name */
    public int f10849c;

    /* renamed from: d, reason: collision with root package name */
    public int f10850d;

    /* renamed from: e, reason: collision with root package name */
    public int f10851e;

    /* renamed from: f, reason: collision with root package name */
    public int f10852f;
    public Object g;

    public a(b bVar) {
        this(bVar, 10, bVar.f10194a / 2, bVar.f10195b / 2);
    }

    public a(b bVar, int i7, int i10, int i11) {
        this.g = bVar;
        int i12 = bVar.f10195b;
        this.f10847a = i12;
        int i13 = bVar.f10194a;
        this.f10848b = i13;
        int i14 = i7 / 2;
        int i15 = i10 - i14;
        this.f10849c = i15;
        int i16 = i10 + i14;
        this.f10850d = i16;
        int i17 = i11 - i14;
        this.f10852f = i17;
        int i18 = i11 + i14;
        this.f10851e = i18;
        if (i17 < 0 || i15 < 0 || i18 >= i12 || i16 >= i13) {
            throw j.a();
        }
    }

    public boolean a(int i7, int i10, int i11, boolean z8) {
        b bVar = (b) this.g;
        if (z8) {
            while (i7 <= i10) {
                if (bVar.b(i7, i11)) {
                    return true;
                }
                i7++;
            }
            return false;
        }
        while (i7 <= i10) {
            if (bVar.b(i11, i7)) {
                return true;
            }
            i7++;
        }
        return false;
    }

    public p[] b() {
        int i7;
        int i10;
        int i11 = this.f10849c;
        int i12 = this.f10850d;
        int i13 = this.f10852f;
        int i14 = this.f10851e;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        do {
            i7 = this.f10848b;
            if (!z14) {
                break;
            }
            boolean z15 = false;
            boolean z16 = true;
            while (true) {
                if ((z16 || !z10) && i12 < i7) {
                    z16 = a(i13, i14, i12, false);
                    if (z16) {
                        i12++;
                        z10 = true;
                        z15 = true;
                    } else if (!z10) {
                        i12++;
                    }
                }
            }
            if (i12 >= i7) {
                break;
            }
            boolean z17 = true;
            while (true) {
                i10 = this.f10847a;
                if ((z17 || !z11) && i14 < i10) {
                    z17 = a(i11, i12, i14, true);
                    if (z17) {
                        i14++;
                        z11 = true;
                        z15 = true;
                    } else if (!z11) {
                        i14++;
                    }
                }
            }
            if (i14 >= i10) {
                break;
            }
            boolean z18 = true;
            while (true) {
                if ((z18 || !z12) && i11 >= 0) {
                    z18 = a(i13, i14, i11, false);
                    if (z18) {
                        i11--;
                        z12 = true;
                        z15 = true;
                    } else if (!z12) {
                        i11--;
                    }
                }
            }
            if (i11 < 0) {
                break;
            }
            z14 = z15;
            boolean z19 = true;
            while (true) {
                if ((z19 || !z13) && i13 >= 0) {
                    z19 = a(i11, i12, i13, true);
                    if (z19) {
                        i13--;
                        z14 = true;
                        z13 = true;
                    } else if (!z13) {
                        i13--;
                    }
                }
            }
        } while (i13 >= 0);
        z8 = true;
        if (z8) {
            throw j.a();
        }
        int i15 = i12 - i11;
        p pVar = null;
        p pVar2 = null;
        for (int i16 = 1; pVar2 == null && i16 < i15; i16++) {
            pVar2 = c(i11, i14 - i16, i11 + i16, i14);
        }
        if (pVar2 == null) {
            throw j.a();
        }
        p pVar3 = null;
        for (int i17 = 1; pVar3 == null && i17 < i15; i17++) {
            pVar3 = c(i11, i13 + i17, i11 + i17, i13);
        }
        if (pVar3 == null) {
            throw j.a();
        }
        p pVar4 = null;
        for (int i18 = 1; pVar4 == null && i18 < i15; i18++) {
            pVar4 = c(i12, i13 + i18, i12 - i18, i13);
        }
        if (pVar4 == null) {
            throw j.a();
        }
        for (int i19 = 1; pVar == null && i19 < i15; i19++) {
            pVar = c(i12, i14 - i19, i12 - i19, i14);
        }
        if (pVar == null) {
            throw j.a();
        }
        float f4 = i7 / 2.0f;
        float f10 = pVar.f8249a;
        float f11 = pVar2.f8249a;
        float f12 = pVar4.f8249a;
        float f13 = pVar3.f8249a;
        float f14 = pVar.f8250b;
        float f15 = pVar2.f8250b;
        float f16 = pVar4.f8250b;
        float f17 = pVar3.f8250b;
        return f10 < f4 ? new p[]{new p(f13 - 1.0f, f17 + 1.0f), new p(f11 + 1.0f, f15 + 1.0f), new p(f12 - 1.0f, f16 - 1.0f), new p(f10 + 1.0f, f14 - 1.0f)} : new p[]{new p(f13 + 1.0f, f17 + 1.0f), new p(f11 + 1.0f, f15 - 1.0f), new p(f12 - 1.0f, f16 + 1.0f), new p(f10 - 1.0f, f14 - 1.0f)};
    }

    public p c(float f4, float f10, float f11, float f12) {
        int G9 = O5.b.G(O5.b.l(f4, f10, f11, f12));
        float f13 = G9;
        float f14 = (f11 - f4) / f13;
        float f15 = (f12 - f10) / f13;
        for (int i7 = 0; i7 < G9; i7++) {
            float f16 = i7;
            int G10 = O5.b.G((f16 * f14) + f4);
            int G11 = O5.b.G((f16 * f15) + f10);
            if (((b) this.g).b(G10, G11)) {
                return new p(G10, G11);
            }
        }
        return null;
    }

    public boolean d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!((i7 & (-2097152)) == -2097152) || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0 || (i12 = (i7 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f10847a = i10;
        this.g = AbstractC1787a.f21825m[3 - i11];
        int i14 = AbstractC1787a.f21826n[i13];
        this.f10849c = i14;
        if (i10 == 2) {
            this.f10849c = i14 / 2;
        } else if (i10 == 0) {
            this.f10849c = i14 / 4;
        }
        int i15 = (i7 >>> 9) & 1;
        int i16 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException();
                }
                i16 = 384;
            }
        } else if (i10 != 3) {
            i16 = 576;
        }
        this.f10852f = i16;
        if (i11 == 3) {
            int i17 = i10 == 3 ? AbstractC1787a.f21827o[i12 - 1] : AbstractC1787a.f21828p[i12 - 1];
            this.f10851e = i17;
            this.f10848b = (((i17 * 12) / this.f10849c) + i15) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? AbstractC1787a.f21829q[i12 - 1] : AbstractC1787a.f21830r[i12 - 1];
                this.f10851e = i18;
                this.f10848b = ((i18 * 144) / this.f10849c) + i15;
            } else {
                int i19 = AbstractC1787a.f21831s[i12 - 1];
                this.f10851e = i19;
                this.f10848b = (((i11 == 1 ? 72 : 144) * i19) / this.f10849c) + i15;
            }
        }
        this.f10850d = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
