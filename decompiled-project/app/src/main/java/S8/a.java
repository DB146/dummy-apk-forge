package S8;

import H2.O;
import P8.j;
import P8.p;
import V8.b;
import V8.h;
import X8.c;
import c2.q;

/* loaded from: classes.dex */
public final class a {
    public static final int[] g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    public final b f9184a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9185b;

    /* renamed from: c, reason: collision with root package name */
    public int f9186c;

    /* renamed from: d, reason: collision with root package name */
    public int f9187d;

    /* renamed from: e, reason: collision with root package name */
    public int f9188e;

    /* renamed from: f, reason: collision with root package name */
    public int f9189f;

    public a(b bVar) {
        this.f9184a = bVar;
    }

    public static p[] b(p[] pVarArr, int i7, int i10) {
        float f4 = i10 / (i7 * 2.0f);
        p pVar = pVarArr[0];
        float f10 = pVar.f8249a;
        p pVar2 = pVarArr[2];
        float f11 = pVar2.f8249a;
        float f12 = f10 - f11;
        float f13 = pVar.f8250b;
        float f14 = pVar2.f8250b;
        float f15 = f13 - f14;
        float f16 = (f10 + f11) / 2.0f;
        float f17 = (f13 + f14) / 2.0f;
        float f18 = f12 * f4;
        float f19 = f15 * f4;
        p pVar3 = new p(f16 + f18, f17 + f19);
        p pVar4 = new p(f16 - f18, f17 - f19);
        p pVar5 = pVarArr[1];
        float f20 = pVar5.f8249a;
        p pVar6 = pVarArr[3];
        float f21 = pVar6.f8249a;
        float f22 = f20 - f21;
        float f23 = pVar5.f8250b;
        float f24 = pVar6.f8250b;
        float f25 = f23 - f24;
        float f26 = (f20 + f21) / 2.0f;
        float f27 = (f23 + f24) / 2.0f;
        float f28 = f22 * f4;
        float f29 = f4 * f25;
        return new p[]{pVar3, new p(f26 + f28, f27 + f29), pVar4, new p(f26 - f28, f27 - f29)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
    
        r24 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q8.a a(boolean z8) {
        p c10;
        p pVar;
        p pVar2;
        p pVar3;
        p c11;
        p c12;
        p pVar4;
        p pVar5;
        int i7;
        int i10;
        int i11;
        O o10;
        int i12;
        int i13;
        int i14;
        long j;
        int i15;
        O o11;
        O o12;
        O o13;
        b bVar = this.f9184a;
        int i16 = -1;
        int i17 = 2;
        int i18 = 1;
        try {
            p[] b2 = new W8.a(bVar).b();
            pVar2 = b2[0];
            pVar3 = b2[1];
            pVar = b2[2];
            c10 = b2[3];
        } catch (j unused) {
            int i19 = bVar.f10194a / 2;
            int i20 = bVar.f10195b / 2;
            int i21 = i19 + 7;
            int i22 = i20 - 7;
            p c13 = e(new O(i21, i22, 2), false, 1, -1).c();
            int i23 = i20 + 7;
            p c14 = e(new O(i21, i23, 2), false, 1, 1).c();
            int i24 = i19 - 7;
            p c15 = e(new O(i24, i23, 2), false, -1, 1).c();
            c10 = e(new O(i24, i22, 2), false, -1, -1).c();
            pVar = c15;
            pVar2 = c13;
            pVar3 = c14;
        }
        int G9 = O5.b.G((((pVar2.f8249a + c10.f8249a) + pVar3.f8249a) + pVar.f8249a) / 4.0f);
        int G10 = O5.b.G((((pVar2.f8250b + c10.f8250b) + pVar3.f8250b) + pVar.f8250b) / 4.0f);
        try {
            p[] b10 = new W8.a(bVar, 15, G9, G10).b();
            pVar5 = b10[0];
            pVar4 = b10[1];
            c11 = b10[2];
            c12 = b10[3];
        } catch (j unused2) {
            int i25 = G9 + 7;
            int i26 = G10 - 7;
            p c16 = e(new O(i25, i26, 2), false, 1, -1).c();
            int i27 = G10 + 7;
            p c17 = e(new O(i25, i27, 2), false, 1, 1).c();
            int i28 = G9 - 7;
            c11 = e(new O(i28, i27, 2), false, -1, 1).c();
            c12 = e(new O(i28, i26, 2), false, -1, -1).c();
            pVar4 = c17;
            pVar5 = c16;
        }
        O o14 = new O(O5.b.G((((pVar5.f8249a + c12.f8249a) + pVar4.f8249a) + c11.f8249a) / 4.0f), O5.b.G((((pVar5.f8250b + c12.f8250b) + pVar4.f8250b) + c11.f8250b) / 4.0f), 2);
        this.f9188e = 1;
        boolean z10 = true;
        O o15 = o14;
        O o16 = o15;
        O o17 = o16;
        while (true) {
            int i29 = this.f9188e;
            int i30 = o17.f4603b;
            int i31 = o17.f4604c;
            i7 = o14.f4603b;
            i10 = o14.f4604c;
            if (i29 >= 9) {
                i11 = i31;
                o10 = o16;
                break;
            }
            O e2 = e(o14, z10, i18, i16);
            O e10 = e(o15, z10, i18, i18);
            O e11 = e(o16, z10, i16, i18);
            O e12 = e(o17, z10, i16, i16);
            if (this.f9188e > i17) {
                int i32 = e12.f4603b;
                int i33 = e12.f4604c;
                int i34 = e2.f4603b;
                o12 = e12;
                int i35 = e2.f4604c;
                o11 = e2;
                i11 = i31;
                o10 = o16;
                double m10 = (O5.b.m(i32, i33, i34, i35) * this.f9188e) / (O5.b.m(i30, i31, i7, i10) * (this.f9188e + 2));
                if (m10 < 0.75d || m10 > 1.25d) {
                    break;
                }
                O o18 = new O(Math.max(0, i34 - 3), Math.min(bVar.f10195b - 1, i35 + 3), 2);
                i12 = i30;
                O o19 = new O(Math.max(0, e10.f4603b - 3), Math.max(0, e10.f4604c - 3), 2);
                o13 = e10;
                O o20 = new O(Math.min(bVar.f10194a - 1, e11.f4603b + 3), Math.max(0, Math.min(bVar.f10195b - 1, e11.f4604c - 3)), 2);
                O o21 = new O(Math.min(bVar.f10194a - 1, i32 + 3), Math.min(bVar.f10195b - 1, i33 + 3), 2);
                int c18 = c(o21, o18);
                if (c18 == 0 || c(o18, o19) != c18 || c(o19, o20) != c18 || c(o20, o21) != c18) {
                    break;
                }
            } else {
                o11 = e2;
                o12 = e12;
                o13 = e10;
            }
            z10 = !z10;
            this.f9188e++;
            o16 = e11;
            o17 = o12;
            o14 = o11;
            o15 = o13;
            i16 = -1;
            i17 = 2;
            i18 = 1;
        }
        int i36 = this.f9188e;
        if (i36 != 5 && i36 != 7) {
            throw j.a();
        }
        this.f9185b = i36 == 5;
        O o22 = o10;
        int i37 = i36 * 2;
        p[] b11 = b(new p[]{new p(i7 + 0.5f, i10 - 0.5f), new p(o15.f4603b + 0.5f, o15.f4604c + 0.5f), new p(o22.f4603b - 0.5f, o22.f4604c + 0.5f), new p(i12 - 0.5f, i11 - 0.5f)}, i37 - 3, i37);
        if (z8) {
            p pVar6 = b11[0];
            b11[0] = b11[2];
            b11[2] = pVar6;
        }
        if (!g(b11[0]) || !g(b11[1]) || !g(b11[2]) || !g(b11[3])) {
            throw j.a();
        }
        int i38 = this.f9188e * 2;
        int[] iArr = {h(b11[0], b11[1], i38), h(b11[1], b11[2], i38), h(b11[2], b11[3], i38), h(b11[3], b11[0], i38)};
        int i39 = 0;
        for (int i40 = 0; i40 < 4; i40++) {
            int i41 = iArr[i40];
            i39 = (i39 << 3) + ((i41 >> (i38 - 2)) << 1) + (i41 & 1);
        }
        int i42 = ((i39 & 1) << 11) + (i39 >> 1);
        for (int i43 = 0; i43 < 4; i43++) {
            if (Integer.bitCount(g[i43] ^ i42) <= 2) {
                this.f9189f = i43;
                long j10 = 0;
                int i44 = 0;
                while (true) {
                    i13 = 10;
                    if (i44 >= 4) {
                        break;
                    }
                    int i45 = iArr[(this.f9189f + i44) % 4];
                    if (this.f9185b) {
                        j = j10 << 7;
                        i15 = (i45 >> 1) & 127;
                    } else {
                        j = j10 << 10;
                        i15 = ((i45 >> 2) & 992) + ((i45 >> 1) & 31);
                    }
                    j10 = j + i15;
                    i44++;
                }
                if (this.f9185b) {
                    i13 = 7;
                    i14 = 2;
                } else {
                    i14 = 4;
                }
                int i46 = i13 - i14;
                int[] iArr2 = new int[i13];
                for (int i47 = i13 - 1; i47 >= 0; i47--) {
                    iArr2[i47] = ((int) j10) & 15;
                    j10 >>= 4;
                }
                try {
                    int n6 = new R7.b(X8.a.k, 9).n(iArr2, i46);
                    int i48 = 0;
                    for (int i49 = 0; i49 < i14; i49++) {
                        i48 = (i48 << 4) + iArr2[i49];
                    }
                    if (this.f9185b) {
                        this.f9186c = (i48 >> 6) + 1;
                        this.f9187d = (i48 & 63) + 1;
                    } else {
                        this.f9186c = (i48 >> 11) + 1;
                        this.f9187d = (i48 & 2047) + 1;
                    }
                    int i50 = this.f9189f;
                    p pVar7 = b11[i50 % 4];
                    p pVar8 = b11[(i50 + 1) % 4];
                    p pVar9 = b11[(i50 + 2) % 4];
                    p pVar10 = b11[(i50 + 3) % 4];
                    int d10 = d();
                    float f4 = d10 / 2.0f;
                    float f10 = this.f9188e;
                    float f11 = f4 - f10;
                    float f12 = f4 + f10;
                    return new Q8.a(q.y(bVar, d10, d10, h.a(f11, f11, f12, f11, f12, f12, f11, f12, pVar7.f8249a, pVar7.f8250b, pVar8.f8249a, pVar8.f8250b, pVar9.f8249a, pVar9.f8250b, pVar10.f8249a, pVar10.f8250b)), b(b11, this.f9188e * 2, d()), this.f9185b, this.f9187d, this.f9186c, n6);
                } catch (c unused3) {
                    throw j.a();
                }
            }
        }
        throw j.a();
    }

    public final int c(O o10, O o11) {
        int i7 = o10.f4603b;
        int i10 = o10.f4604c;
        float m10 = O5.b.m(i7, i10, o11.f4603b, o11.f4604c);
        if (m10 == 0.0f) {
            return 0;
        }
        float f4 = (r1 - i7) / m10;
        float f10 = (r13 - i10) / m10;
        float f11 = i7;
        float f12 = i10;
        b bVar = this.f9184a;
        boolean b2 = bVar.b(i7, i10);
        int floor = (int) Math.floor(m10);
        int i11 = 0;
        for (int i12 = 0; i12 < floor; i12++) {
            if (bVar.b(O5.b.G(f11), O5.b.G(f12)) != b2) {
                i11++;
            }
            f11 += f4;
            f12 += f10;
        }
        float f13 = i11 / m10;
        if (f13 <= 0.1f || f13 >= 0.9f) {
            return (f13 <= 0.1f) == b2 ? 1 : -1;
        }
        return 0;
    }

    public final int d() {
        if (this.f9185b) {
            return (this.f9186c * 4) + 11;
        }
        int i7 = this.f9186c;
        return ((((i7 * 2) + 6) / 15) * 2) + (i7 * 4) + 15;
    }

    public final O e(O o10, boolean z8, int i7, int i10) {
        b bVar;
        int i11 = o10.f4603b + i7;
        int i12 = o10.f4604c;
        while (true) {
            i12 += i10;
            boolean f4 = f(i11, i12);
            bVar = this.f9184a;
            if (!f4 || bVar.b(i11, i12) != z8) {
                break;
            }
            i11 += i7;
        }
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        while (f(i13, i14) && bVar.b(i13, i14) == z8) {
            i13 += i7;
        }
        int i15 = i13 - i7;
        while (f(i15, i14) && bVar.b(i15, i14) == z8) {
            i14 += i10;
        }
        return new O(i15, i14 - i10, 2);
    }

    public final boolean f(int i7, int i10) {
        if (i7 >= 0) {
            b bVar = this.f9184a;
            if (i7 < bVar.f10194a && i10 >= 0 && i10 < bVar.f10195b) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(p pVar) {
        return f(O5.b.G(pVar.f8249a), O5.b.G(pVar.f8250b));
    }

    public final int h(p pVar, p pVar2, int i7) {
        float f4 = pVar.f8249a;
        float f10 = pVar2.f8249a;
        float f11 = pVar.f8250b;
        float f12 = pVar2.f8250b;
        float l10 = O5.b.l(f4, f11, f10, f12);
        float f13 = l10 / i7;
        float f14 = pVar2.f8249a;
        float f15 = pVar.f8249a;
        float f16 = ((f14 - f15) * f13) / l10;
        float f17 = ((f12 - f11) * f13) / l10;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            float f18 = i11;
            if (this.f9184a.b(O5.b.G((f18 * f16) + f15), O5.b.G((f18 * f17) + f11))) {
                i10 |= 1 << ((i7 - i11) - 1);
            }
        }
        return i10;
    }
}
