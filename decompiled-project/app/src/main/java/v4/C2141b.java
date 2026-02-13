package v4;

import C4.x;
import F.C0257a;
import F4.c;
import K4.i;
import N6.H;
import b5.f;
import java.util.Arrays;
import m4.C1586o0;
import n5.D;
import o7.o;
import r7.C1947c;
import s4.C1979g;
import s4.C1986n;
import s4.C1987o;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;
import s4.s;
import s4.v;
import y7.u0;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2141b implements InterfaceC1982j {

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1984l f25055e;

    /* renamed from: f, reason: collision with root package name */
    public v f25056f;

    /* renamed from: h, reason: collision with root package name */
    public c f25057h;

    /* renamed from: i, reason: collision with root package name */
    public C1987o f25058i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public x f25059l;

    /* renamed from: m, reason: collision with root package name */
    public int f25060m;

    /* renamed from: n, reason: collision with root package name */
    public long f25061n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25051a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f25052b = new n5.v(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25053c = false;

    /* renamed from: d, reason: collision with root package name */
    public final C0257a f25054d = new Object();
    public int g = 0;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        if (j == 0) {
            this.g = 0;
        } else {
            x xVar = this.f25059l;
            if (xVar != null) {
                xVar.d(j10);
            }
        }
        this.f25061n = j10 != 0 ? -1L : 0L;
        this.f25060m = 0;
        this.f25052b.D(0);
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        C1979g c1979g = (C1979g) interfaceC1983k;
        c q10 = new o(6).q(c1979g, i.f6139e);
        if (q10 != null) {
            int length = q10.f4071a.length;
        }
        n5.v vVar = new n5.v(4);
        c1979g.x(vVar.f21229a, 0, 4, false);
        return vVar.w() == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int, boolean] */
    @Override // s4.InterfaceC1982j
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        C1987o c1987o;
        c cVar;
        C1987o c1987o2;
        s c1986n;
        long j;
        long j10;
        boolean z8;
        long j11;
        boolean z10;
        int i7 = 7;
        boolean z11 = true;
        int i10 = this.g;
        c cVar2 = null;
        if (i10 == 0) {
            ((C1979g) interfaceC1983k).f24057f = 0;
            C1979g c1979g = (C1979g) interfaceC1983k;
            long A10 = c1979g.A();
            c q10 = new o(6).q(c1979g, !this.f25053c ? null : i.f6139e);
            if (q10 != null && q10.f4071a.length != 0) {
                cVar2 = q10;
            }
            c1979g.r((int) (c1979g.A() - A10));
            this.f25057h = cVar2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.f25051a;
        if (i10 == 1) {
            ((C1979g) interfaceC1983k).x(bArr, 0, bArr.length, false);
            ((C1979g) interfaceC1983k).f24057f = 0;
            this.g = 2;
            return 0;
        }
        int i11 = 3;
        if (i10 == 2) {
            n5.v vVar = new n5.v(4);
            ((C1979g) interfaceC1983k).h(vVar.f21229a, 0, 4, false);
            if (vVar.w() != 1716281667) {
                throw C1586o0.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        if (i10 == 3) {
            ?? r32 = 0;
            C1987o c1987o3 = this.f25058i;
            boolean z12 = false;
            while (!z12) {
                ((C1979g) interfaceC1983k).f24057f = r32;
                byte[] bArr2 = new byte[4];
                f fVar = new f(bArr2, 4);
                C1979g c1979g2 = (C1979g) interfaceC1983k;
                c1979g2.x(bArr2, r32, 4, r32);
                boolean h10 = fVar.h();
                int i12 = fVar.i(i7);
                int i13 = fVar.i(24) + 4;
                if (i12 == 0) {
                    byte[] bArr3 = new byte[38];
                    c1979g2.h(bArr3, r32, 38, r32);
                    c1987o2 = new C1987o(bArr3, 4);
                } else {
                    if (c1987o3 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i12 == i11) {
                        n5.v vVar2 = new n5.v(i13);
                        c1979g2.h(vVar2.f21229a, 0, i13, false);
                        c1987o2 = new C1987o(c1987o3.f24068a, c1987o3.f24069b, c1987o3.f24070c, c1987o3.f24071d, c1987o3.f24072e, c1987o3.g, c1987o3.f24074h, c1987o3.j, vc.i.H(vVar2), c1987o3.f24076l);
                    } else {
                        c cVar3 = c1987o3.f24076l;
                        if (i12 == 4) {
                            n5.v vVar3 = new n5.v(i13);
                            c1979g2.h(vVar3.f21229a, 0, i13, false);
                            vVar3.H(4);
                            c D10 = u0.D(Arrays.asList((String[]) u0.F(vVar3, false, false).f18487b));
                            if (cVar3 == null) {
                                cVar = D10;
                            } else {
                                if (D10 != null) {
                                    cVar3 = cVar3.a(D10.f4071a);
                                }
                                cVar = cVar3;
                            }
                            c1987o = new C1987o(c1987o3.f24068a, c1987o3.f24069b, c1987o3.f24070c, c1987o3.f24071d, c1987o3.f24072e, c1987o3.g, c1987o3.f24074h, c1987o3.j, c1987o3.k, cVar);
                        } else if (i12 == 6) {
                            n5.v vVar4 = new n5.v(i13);
                            c1979g2.h(vVar4.f21229a, 0, i13, false);
                            vVar4.H(4);
                            c cVar4 = new c(H.K(I4.a.a(vVar4)));
                            if (cVar3 != null) {
                                cVar4 = cVar3.a(cVar4.f4071a);
                            }
                            c1987o = new C1987o(c1987o3.f24068a, c1987o3.f24069b, c1987o3.f24070c, c1987o3.f24071d, c1987o3.f24072e, c1987o3.g, c1987o3.f24074h, c1987o3.j, c1987o3.k, cVar4);
                        } else {
                            c1979g2.r(i13);
                            int i14 = D.f21141a;
                            this.f25058i = c1987o3;
                            z12 = h10;
                            i7 = 7;
                            r32 = 0;
                            i11 = 3;
                        }
                        c1987o3 = c1987o;
                        int i142 = D.f21141a;
                        this.f25058i = c1987o3;
                        z12 = h10;
                        i7 = 7;
                        r32 = 0;
                        i11 = 3;
                    }
                }
                c1987o3 = c1987o2;
                int i1422 = D.f21141a;
                this.f25058i = c1987o3;
                z12 = h10;
                i7 = 7;
                r32 = 0;
                i11 = 3;
            }
            this.f25058i.getClass();
            this.j = Math.max(this.f25058i.f24070c, 6);
            v vVar5 = this.f25056f;
            int i15 = D.f21141a;
            vVar5.a(this.f25058i.c(bArr, this.f25057h));
            this.g = 4;
            return 0;
        }
        long j12 = 0;
        if (i10 == 4) {
            ((C1979g) interfaceC1983k).f24057f = 0;
            n5.v vVar6 = new n5.v(2);
            C1979g c1979g3 = (C1979g) interfaceC1983k;
            c1979g3.x(vVar6.f21229a, 0, 2, false);
            int A11 = vVar6.A();
            if ((A11 >> 2) != 16382) {
                c1979g3.f24057f = 0;
                throw C1586o0.a("First frame does not start with sync code.", null);
            }
            c1979g3.f24057f = 0;
            this.k = A11;
            InterfaceC1984l interfaceC1984l = this.f25055e;
            int i16 = D.f21141a;
            long j13 = c1979g3.f24055d;
            this.f25058i.getClass();
            C1987o c1987o4 = this.f25058i;
            if (c1987o4.k != null) {
                c1986n = new C1986n(c1987o4, 0, j13);
            } else {
                long j14 = c1979g3.f24054c;
                if (j14 == -1 || c1987o4.j <= 0) {
                    c1986n = new C1986n(c1987o4.b());
                } else {
                    int i17 = this.k;
                    C1947c c1947c = new C1947c(c1987o4, i7);
                    C2140a c2140a = new C2140a(c1987o4, i17);
                    long b2 = c1987o4.b();
                    int i18 = c1987o4.f24070c;
                    int i19 = c1987o4.f24071d;
                    if (i19 > 0) {
                        j = j13;
                        j10 = ((i19 + i18) / 2) + 1;
                    } else {
                        j = j13;
                        int i20 = c1987o4.f24069b;
                        int i21 = c1987o4.f24068a;
                        j10 = (((((i21 != i20 || i21 <= 0) ? 4096L : i21) * c1987o4.g) * c1987o4.f24074h) / 8) + 64;
                    }
                    x xVar = new x(c1947c, c2140a, b2, c1987o4.j, j, j14, j10, Math.max(6, i18));
                    this.f25059l = xVar;
                    c1986n = xVar.f2888a;
                }
            }
            interfaceC1984l.i(c1986n);
            this.g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f25056f.getClass();
        this.f25058i.getClass();
        x xVar2 = this.f25059l;
        if (xVar2 != null && xVar2.f2890c != null) {
            return xVar2.b((C1979g) interfaceC1983k, c0257a);
        }
        if (this.f25061n == -1) {
            C1987o c1987o5 = this.f25058i;
            ((C1979g) interfaceC1983k).f24057f = 0;
            C1979g c1979g4 = (C1979g) interfaceC1983k;
            c1979g4.b(1, false);
            byte[] bArr4 = new byte[1];
            c1979g4.x(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            c1979g4.b(2, false);
            int i22 = z13 ? 7 : 6;
            n5.v vVar7 = new n5.v(i22);
            byte[] bArr5 = vVar7.f21229a;
            int i23 = 0;
            while (i23 < i22) {
                int f4 = c1979g4.f(i23, bArr5, i22 - i23);
                if (f4 == -1) {
                    break;
                }
                i23 += f4;
            }
            vVar7.F(i23);
            c1979g4.f24057f = 0;
            try {
                long B10 = vVar7.B();
                if (!z13) {
                    B10 *= c1987o5.f24069b;
                }
                j12 = B10;
            } catch (NumberFormatException unused) {
                z11 = false;
            }
            if (!z11) {
                throw C1586o0.a(null, null);
            }
            this.f25061n = j12;
            return 0;
        }
        n5.v vVar8 = this.f25052b;
        int i24 = vVar8.f21231c;
        if (i24 < 32768) {
            int D11 = ((C1979g) interfaceC1983k).D(vVar8.f21229a, i24, 32768 - i24);
            z8 = D11 == -1;
            if (!z8) {
                vVar8.F(i24 + D11);
            } else if (vVar8.a() == 0) {
                long j15 = this.f25061n * 1000000;
                C1987o c1987o6 = this.f25058i;
                int i25 = D.f21141a;
                this.f25056f.e(j15 / c1987o6.f24072e, 1, this.f25060m, 0, null);
                return -1;
            }
        } else {
            z8 = false;
        }
        int i26 = vVar8.f21230b;
        int i27 = this.f25060m;
        int i28 = this.j;
        if (i27 < i28) {
            vVar8.H(Math.min(i28 - i27, vVar8.a()));
        }
        this.f25058i.getClass();
        int i29 = vVar8.f21230b;
        while (true) {
            int i30 = vVar8.f21231c - 16;
            C0257a c0257a2 = this.f25054d;
            if (i29 <= i30) {
                vVar8.G(i29);
                if (tc.b.m(vVar8, this.f25058i, this.k, c0257a2)) {
                    vVar8.G(i29);
                    j11 = c0257a2.f3957a;
                    break;
                }
                i29++;
            } else {
                if (z8) {
                    while (true) {
                        int i31 = vVar8.f21231c;
                        if (i29 > i31 - this.j) {
                            vVar8.G(i31);
                            break;
                        }
                        vVar8.G(i29);
                        try {
                            z10 = tc.b.m(vVar8, this.f25058i, this.k, c0257a2);
                        } catch (IndexOutOfBoundsException unused2) {
                            z10 = false;
                        }
                        if (vVar8.f21230b > vVar8.f21231c) {
                            z10 = false;
                        }
                        if (z10) {
                            vVar8.G(i29);
                            j11 = c0257a2.f3957a;
                            break;
                        }
                        i29++;
                    }
                } else {
                    vVar8.G(i29);
                }
                j11 = -1;
            }
        }
        int i32 = vVar8.f21230b - i26;
        vVar8.G(i26);
        this.f25056f.c(i32, vVar8);
        int i33 = this.f25060m + i32;
        this.f25060m = i33;
        if (j11 != -1) {
            long j16 = this.f25061n * 1000000;
            C1987o c1987o7 = this.f25058i;
            int i34 = D.f21141a;
            this.f25056f.e(j16 / c1987o7.f24072e, 1, i33, 0, null);
            this.f25060m = 0;
            this.f25061n = j11;
        }
        if (vVar8.a() >= 16) {
            return 0;
        }
        int a9 = vVar8.a();
        byte[] bArr6 = vVar8.f21229a;
        System.arraycopy(bArr6, vVar8.f21230b, bArr6, 0, a9);
        vVar8.G(0);
        vVar8.F(a9);
        return 0;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f25055e = interfaceC1984l;
        this.f25056f = interfaceC1984l.u(0, 1);
        interfaceC1984l.f();
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
