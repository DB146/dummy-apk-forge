package z4;

import F.C0257a;
import K4.m;
import java.io.EOFException;
import m4.C1586o0;
import m4.K;
import n5.AbstractC1705a;
import n5.D;
import n5.v;
import o4.AbstractC1787a;
import o7.o;
import s4.C1979g;
import s4.C1981i;
import s4.C1986n;
import s4.C1988p;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: z4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2591d implements InterfaceC1982j {

    /* renamed from: a, reason: collision with root package name */
    public final long f28249a;

    /* renamed from: b, reason: collision with root package name */
    public final v f28250b;

    /* renamed from: c, reason: collision with root package name */
    public final W8.a f28251c;

    /* renamed from: d, reason: collision with root package name */
    public final C1988p f28252d;

    /* renamed from: e, reason: collision with root package name */
    public final o f28253e;

    /* renamed from: f, reason: collision with root package name */
    public final C1981i f28254f;
    public InterfaceC1984l g;

    /* renamed from: h, reason: collision with root package name */
    public s4.v f28255h;

    /* renamed from: i, reason: collision with root package name */
    public s4.v f28256i;
    public int j;
    public F4.c k;

    /* renamed from: l, reason: collision with root package name */
    public long f28257l;

    /* renamed from: m, reason: collision with root package name */
    public long f28258m;

    /* renamed from: n, reason: collision with root package name */
    public long f28259n;

    /* renamed from: o, reason: collision with root package name */
    public int f28260o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC2593f f28261p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28262q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28263r;

    /* renamed from: s, reason: collision with root package name */
    public long f28264s;

    public C2591d() {
        this(-9223372036854775807L);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, W8.a] */
    public C2591d(long j) {
        this.f28249a = j;
        this.f28250b = new v(10);
        this.f28251c = new Object();
        this.f28252d = new C1988p();
        this.f28257l = -9223372036854775807L;
        this.f28253e = new o(6);
        C1981i c1981i = new C1981i();
        this.f28254f = c1981i;
        this.f28256i = c1981i;
    }

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.j = 0;
        this.f28257l = -9223372036854775807L;
        this.f28258m = 0L;
        this.f28260o = 0;
        this.f28264s = j10;
        InterfaceC2593f interfaceC2593f = this.f28261p;
        if (!(interfaceC2593f instanceof AbstractC2589b) || ((AbstractC2589b) interfaceC2593f).a(j10)) {
            return;
        }
        this.f28263r = true;
        this.f28256i = this.f28254f;
    }

    public final C2588a b(C1979g c1979g, boolean z8) {
        v vVar = this.f28250b;
        c1979g.x(vVar.f21229a, 0, 4, false);
        vVar.G(0);
        int h10 = vVar.h();
        W8.a aVar = this.f28251c;
        aVar.d(h10);
        return new C2588a(c1979g.f24054c, c1979g.f24055d, aVar.f10851e, aVar.f10848b, z8);
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        return g((C1979g) interfaceC1983k, true);
    }

    public final boolean d(C1979g c1979g) {
        InterfaceC2593f interfaceC2593f = this.f28261p;
        if (interfaceC2593f != null) {
            long d10 = interfaceC2593f.d();
            if (d10 != -1 && c1979g.A() > d10 - 4) {
                return true;
            }
        }
        try {
            return !c1979g.x(this.f28250b.f21229a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (r2 != 1231971951) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /* JADX WARN: Type inference failed for: r3v38, types: [s4.n] */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        C2591d c2591d;
        W8.a aVar;
        int i7;
        int i10;
        v vVar;
        int i11;
        int i12;
        int h10;
        InterfaceC2593f interfaceC2593f;
        v vVar2;
        C1988p c1988p;
        InterfaceC2593f interfaceC2593f2;
        int y10;
        F4.c cVar;
        InterfaceC2593f interfaceC2593f3;
        InterfaceC2593f b2;
        int i13;
        long j;
        C1988p c1988p2;
        v vVar3;
        long[] jArr;
        int v10;
        InterfaceC2593f interfaceC2593f4;
        InterfaceC1983k interfaceC1983k2 = interfaceC1983k;
        AbstractC1705a.n(this.f28255h);
        int i14 = D.f21141a;
        int i15 = this.j;
        W8.a aVar2 = this.f28251c;
        if (i15 == 0) {
            try {
                g((C1979g) interfaceC1983k2, false);
            } catch (EOFException unused) {
                c2591d = this;
                aVar = aVar2;
                i7 = -1;
                i10 = -1;
            }
        }
        InterfaceC2593f interfaceC2593f5 = this.f28261p;
        v vVar4 = this.f28250b;
        if (interfaceC2593f5 == null) {
            v vVar5 = new v(aVar2.f10848b);
            ((C1979g) interfaceC1983k2).x(vVar5.f21229a, 0, aVar2.f10848b, false);
            int i16 = 21;
            if ((aVar2.f10847a & 1) != 0) {
                if (aVar2.f10850d != 1) {
                    i16 = 36;
                }
            } else if (aVar2.f10850d == 1) {
                i16 = 13;
            }
            if (vVar5.f21231c >= i16 + 4) {
                vVar5.G(i16);
                i12 = vVar5.h();
                if (i12 != 1483304551) {
                }
                C1988p c1988p3 = this.f28252d;
                String str = ", ";
                if (i12 != 1483304551 || i12 == 1231971951) {
                    aVar = aVar2;
                    C1979g c1979g = (C1979g) interfaceC1983k2;
                    long j10 = c1979g.f24055d;
                    int i17 = aVar.f10852f;
                    int i18 = aVar.f10849c;
                    h10 = vVar5.h();
                    if ((h10 & 1) == 1 || (y10 = vVar5.y()) == 0) {
                        interfaceC2593f = null;
                    } else {
                        long T10 = D.T(y10, i17 * 1000000, i18);
                        if ((h10 & 6) != 6) {
                            interfaceC2593f = new C2595h(j10, aVar.f10848b, T10, -1L, null);
                        } else {
                            long w10 = vVar5.w();
                            long[] jArr2 = new long[100];
                            for (int i19 = 0; i19 < 100; i19++) {
                                jArr2[i19] = vVar5.v();
                            }
                            long j11 = c1979g.f24054c;
                            if (j11 != -1) {
                                long j12 = j10 + w10;
                                if (j11 != j12) {
                                    StringBuilder l10 = X.c.l(j11, "XING data size mismatch: ", ", ");
                                    l10.append(j12);
                                    AbstractC1705a.S("XingSeeker", l10.toString());
                                }
                            }
                            interfaceC2593f = new C2595h(j10, aVar.f10848b, T10, w10, jArr2);
                        }
                    }
                    if (interfaceC2593f != null) {
                        c1988p = c1988p3;
                        if (c1988p.f24078a == -1 || c1988p.f24079b == -1) {
                            c1979g.f24057f = 0;
                            c1979g.b(i16 + 141, false);
                            vVar2 = vVar4;
                            c1979g.x(vVar2.f21229a, 0, 3, false);
                            vVar2.G(0);
                            int x2 = vVar2.x();
                            int i20 = x2 >> 12;
                            int i21 = x2 & 4095;
                            if (i20 > 0 || i21 > 0) {
                                c1988p.f24078a = i20;
                                c1988p.f24079b = i21;
                            }
                        } else {
                            vVar2 = vVar4;
                        }
                    } else {
                        vVar2 = vVar4;
                        c1988p = c1988p3;
                    }
                    c1979g.r(aVar.f10848b);
                    if (interfaceC2593f == null && !interfaceC2593f.g() && i12 == 1231971951) {
                        c2591d = this;
                        interfaceC2593f2 = c2591d.b(c1979g, false);
                    } else {
                        c2591d = this;
                        interfaceC2593f2 = interfaceC2593f;
                    }
                } else if (i12 == 1447187017) {
                    C1979g c1979g2 = (C1979g) interfaceC1983k2;
                    long j13 = c1979g2.f24055d;
                    vVar5.H(10);
                    int h11 = vVar5.h();
                    if (h11 <= 0) {
                        c1988p2 = c1988p3;
                        aVar = aVar2;
                        vVar3 = vVar4;
                    } else {
                        int i22 = aVar2.f10849c;
                        c1988p2 = c1988p3;
                        long T11 = D.T(h11, (i22 >= 32000 ? 1152 : 576) * 1000000, i22);
                        int A10 = vVar5.A();
                        int A11 = vVar5.A();
                        int A12 = vVar5.A();
                        v vVar6 = vVar5;
                        vVar6.H(2);
                        long j14 = aVar2.f10848b + j13;
                        long[] jArr3 = new long[A10];
                        long[] jArr4 = new long[A10];
                        long j15 = j13;
                        int i23 = 0;
                        while (i23 < A10) {
                            W8.a aVar3 = aVar2;
                            vVar3 = vVar4;
                            String str2 = str;
                            v vVar7 = vVar6;
                            jArr3[i23] = (i23 * T11) / A10;
                            jArr4[i23] = Math.max(j15, j14);
                            if (A12 == 1) {
                                jArr = jArr3;
                                v10 = vVar7.v();
                            } else if (A12 == 2) {
                                jArr = jArr3;
                                v10 = vVar7.A();
                            } else if (A12 != 3) {
                                jArr = jArr3;
                                if (A12 != 4) {
                                    aVar = aVar3;
                                } else {
                                    v10 = vVar7.y();
                                }
                            } else {
                                jArr = jArr3;
                                v10 = vVar7.x();
                            }
                            j15 += v10 * A11;
                            i23++;
                            jArr3 = jArr;
                            A10 = A10;
                            aVar2 = aVar3;
                            vVar4 = vVar3;
                            str = str2;
                            vVar6 = vVar7;
                        }
                        W8.a aVar4 = aVar2;
                        vVar3 = vVar4;
                        String str3 = str;
                        long[] jArr5 = jArr3;
                        long j16 = c1979g2.f24054c;
                        if (j16 != -1 && j16 != j15) {
                            StringBuilder l11 = X.c.l(j16, "VBRI data size mismatch: ", str3);
                            l11.append(j15);
                            AbstractC1705a.S("VbriSeeker", l11.toString());
                        }
                        InterfaceC2593f c2594g = new C2594g(jArr5, jArr4, T11, j15);
                        aVar = aVar4;
                        interfaceC2593f4 = c2594g;
                        c1979g2.r(aVar.f10848b);
                        c2591d = this;
                        interfaceC1983k2 = interfaceC1983k;
                        vVar2 = vVar3;
                        c1988p = c1988p2;
                        interfaceC2593f2 = interfaceC2593f4;
                    }
                    interfaceC2593f4 = null;
                    c1979g2.r(aVar.f10848b);
                    c2591d = this;
                    interfaceC1983k2 = interfaceC1983k;
                    vVar2 = vVar3;
                    c1988p = c1988p2;
                    interfaceC2593f2 = interfaceC2593f4;
                } else {
                    aVar = aVar2;
                    ((C1979g) interfaceC1983k2).f24057f = 0;
                    c2591d = this;
                    vVar2 = vVar4;
                    c1988p = c1988p3;
                    interfaceC2593f2 = null;
                }
                cVar = c2591d.k;
                C1979g c1979g3 = (C1979g) interfaceC1983k2;
                long j17 = c1979g3.f24055d;
                if (cVar != null) {
                    F4.b[] bVarArr = cVar.f4071a;
                    int length = bVarArr.length;
                    int i24 = 0;
                    while (i24 < length) {
                        F4.b bVar = bVarArr[i24];
                        if (bVar instanceof m) {
                            m mVar = (m) bVar;
                            if (cVar != null) {
                                int length2 = cVar.f4071a.length;
                                for (int i25 = 0; i25 < length2; i25++) {
                                    F4.b bVar2 = cVar.f4071a[i25];
                                    if (bVar2 instanceof K4.o) {
                                        K4.o oVar = (K4.o) bVar2;
                                        if (oVar.f6141a.equals("TLEN")) {
                                            j = D.M(Long.parseLong((String) oVar.f6154c.get(0)));
                                            i13 = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                            i13 = 1;
                            j = -9223372036854775807L;
                            int length3 = mVar.f6149e.length;
                            int i26 = length3 + 1;
                            long[] jArr6 = new long[i26];
                            long[] jArr7 = new long[i26];
                            jArr6[0] = j17;
                            jArr7[0] = 0;
                            int i27 = i13;
                            long j18 = 0;
                            while (i27 <= length3) {
                                int i28 = i27 - 1;
                                j17 += mVar.f6147c + mVar.f6149e[i28];
                                j18 += mVar.f6148d + mVar.f6150f[i28];
                                jArr6[i27] = j17;
                                jArr7[i27] = j18;
                                i27++;
                                i13 = 1;
                                length3 = length3;
                                vVar2 = vVar2;
                            }
                            vVar = vVar2;
                            interfaceC2593f3 = new C2590c(jArr6, jArr7, j);
                            InterfaceC2593f interfaceC2593f6 = interfaceC2593f2;
                            if (c2591d.f28262q) {
                                if (interfaceC2593f3 != null) {
                                    interfaceC2593f6 = interfaceC2593f3;
                                } else if (interfaceC2593f2 == null) {
                                    interfaceC2593f6 = null;
                                }
                                if (interfaceC2593f6 != null) {
                                    interfaceC2593f6.g();
                                    b2 = interfaceC2593f6;
                                } else {
                                    b2 = c2591d.b(c1979g3, false);
                                }
                            } else {
                                b2 = new C1986n(-9223372036854775807L);
                            }
                            c2591d.f28261p = b2;
                            c2591d.g.i(b2);
                            s4.v vVar8 = c2591d.f28256i;
                            K k = new K();
                            k.k = (String) aVar.g;
                            k.f19984l = 4096;
                            k.f19996x = aVar.f10850d;
                            k.f19997y = aVar.f10849c;
                            k.f19970A = c1988p.f24078a;
                            k.f19971B = c1988p.f24079b;
                            k.f19983i = c2591d.k;
                            h3.o.w(k, vVar8);
                            c2591d.f28259n = c1979g3.f24055d;
                        } else {
                            i24++;
                            vVar2 = vVar2;
                        }
                    }
                }
                vVar = vVar2;
                interfaceC2593f3 = null;
                InterfaceC2593f interfaceC2593f62 = interfaceC2593f2;
                if (c2591d.f28262q) {
                }
                c2591d.f28261p = b2;
                c2591d.g.i(b2);
                s4.v vVar82 = c2591d.f28256i;
                K k7 = new K();
                k7.k = (String) aVar.g;
                k7.f19984l = 4096;
                k7.f19996x = aVar.f10850d;
                k7.f19997y = aVar.f10849c;
                k7.f19970A = c1988p.f24078a;
                k7.f19971B = c1988p.f24079b;
                k7.f19983i = c2591d.k;
                h3.o.w(k7, vVar82);
                c2591d.f28259n = c1979g3.f24055d;
            }
            if (vVar5.f21231c >= 40) {
                vVar5.G(36);
                if (vVar5.h() == 1447187017) {
                    i12 = 1447187017;
                    C1988p c1988p32 = this.f28252d;
                    String str4 = ", ";
                    if (i12 != 1483304551) {
                    }
                    aVar = aVar2;
                    C1979g c1979g4 = (C1979g) interfaceC1983k2;
                    long j102 = c1979g4.f24055d;
                    int i172 = aVar.f10852f;
                    int i182 = aVar.f10849c;
                    h10 = vVar5.h();
                    if ((h10 & 1) == 1) {
                    }
                    interfaceC2593f = null;
                    if (interfaceC2593f != null) {
                    }
                    c1979g4.r(aVar.f10848b);
                    if (interfaceC2593f == null) {
                    }
                    c2591d = this;
                    interfaceC2593f2 = interfaceC2593f;
                    cVar = c2591d.k;
                    C1979g c1979g32 = (C1979g) interfaceC1983k2;
                    long j172 = c1979g32.f24055d;
                    if (cVar != null) {
                    }
                    vVar = vVar2;
                    interfaceC2593f3 = null;
                    InterfaceC2593f interfaceC2593f622 = interfaceC2593f2;
                    if (c2591d.f28262q) {
                    }
                    c2591d.f28261p = b2;
                    c2591d.g.i(b2);
                    s4.v vVar822 = c2591d.f28256i;
                    K k72 = new K();
                    k72.k = (String) aVar.g;
                    k72.f19984l = 4096;
                    k72.f19996x = aVar.f10850d;
                    k72.f19997y = aVar.f10849c;
                    k72.f19970A = c1988p.f24078a;
                    k72.f19971B = c1988p.f24079b;
                    k72.f19983i = c2591d.k;
                    h3.o.w(k72, vVar822);
                    c2591d.f28259n = c1979g32.f24055d;
                }
            }
            i12 = 0;
            C1988p c1988p322 = this.f28252d;
            String str42 = ", ";
            if (i12 != 1483304551) {
            }
            aVar = aVar2;
            C1979g c1979g42 = (C1979g) interfaceC1983k2;
            long j1022 = c1979g42.f24055d;
            int i1722 = aVar.f10852f;
            int i1822 = aVar.f10849c;
            h10 = vVar5.h();
            if ((h10 & 1) == 1) {
            }
            interfaceC2593f = null;
            if (interfaceC2593f != null) {
            }
            c1979g42.r(aVar.f10848b);
            if (interfaceC2593f == null) {
            }
            c2591d = this;
            interfaceC2593f2 = interfaceC2593f;
            cVar = c2591d.k;
            C1979g c1979g322 = (C1979g) interfaceC1983k2;
            long j1722 = c1979g322.f24055d;
            if (cVar != null) {
            }
            vVar = vVar2;
            interfaceC2593f3 = null;
            InterfaceC2593f interfaceC2593f6222 = interfaceC2593f2;
            if (c2591d.f28262q) {
            }
            c2591d.f28261p = b2;
            c2591d.g.i(b2);
            s4.v vVar8222 = c2591d.f28256i;
            K k722 = new K();
            k722.k = (String) aVar.g;
            k722.f19984l = 4096;
            k722.f19996x = aVar.f10850d;
            k722.f19997y = aVar.f10849c;
            k722.f19970A = c1988p.f24078a;
            k722.f19971B = c1988p.f24079b;
            k722.f19983i = c2591d.k;
            h3.o.w(k722, vVar8222);
            c2591d.f28259n = c1979g322.f24055d;
        } else {
            c2591d = this;
            aVar = aVar2;
            vVar = vVar4;
            long j19 = c2591d.f28259n;
            if (j19 != 0) {
                long j20 = ((C1979g) interfaceC1983k2).f24055d;
                if (j20 < j19) {
                    ((C1979g) interfaceC1983k2).r((int) (j19 - j20));
                }
            }
        }
        if (c2591d.f28260o == 0) {
            ((C1979g) interfaceC1983k2).f24057f = 0;
            C1979g c1979g5 = (C1979g) interfaceC1983k2;
            if (!c2591d.d(c1979g5)) {
                v vVar9 = vVar;
                vVar9.G(0);
                int h12 = vVar9.h();
                if (((-128000) & h12) != (c2591d.j & (-128000)) || AbstractC1787a.f(h12) == -1) {
                    c1979g5.r(1);
                    c2591d.j = 0;
                    i11 = 0;
                    i10 = i11;
                    i7 = -1;
                    if (i10 == i7) {
                        InterfaceC2593f interfaceC2593f7 = c2591d.f28261p;
                        if (interfaceC2593f7 instanceof AbstractC2589b) {
                            if (interfaceC2593f7.i() != ((c2591d.f28258m * 1000000) / aVar.f10849c) + c2591d.f28257l) {
                                InterfaceC2593f interfaceC2593f8 = c2591d.f28261p;
                                ((AbstractC2589b) interfaceC2593f8).getClass();
                                c2591d.g.i(interfaceC2593f8);
                            }
                        }
                    }
                    return i10;
                }
                aVar.d(h12);
                if (c2591d.f28257l == -9223372036854775807L) {
                    c2591d.f28257l = c2591d.f28261p.b(c1979g5.f24055d);
                    long j21 = c2591d.f28249a;
                    if (j21 != -9223372036854775807L) {
                        c2591d.f28257l = (j21 - c2591d.f28261p.b(0L)) + c2591d.f28257l;
                    }
                }
                c2591d.f28260o = aVar.f10848b;
                InterfaceC2593f interfaceC2593f9 = c2591d.f28261p;
                if (interfaceC2593f9 instanceof AbstractC2589b) {
                    AbstractC2589b abstractC2589b = (AbstractC2589b) interfaceC2593f9;
                    long j22 = (((c2591d.f28258m + aVar.f10852f) * 1000000) / aVar.f10849c) + c2591d.f28257l;
                    long j23 = c1979g5.f24055d;
                    if (!abstractC2589b.a(j22)) {
                        throw null;
                    }
                    if (c2591d.f28263r && abstractC2589b.a(c2591d.f28264s)) {
                        c2591d.f28263r = false;
                        c2591d.f28256i = c2591d.f28255h;
                    }
                }
            }
            i11 = -1;
            i10 = i11;
            i7 = -1;
            if (i10 == i7) {
            }
            return i10;
        }
        int d10 = c2591d.f28256i.d(interfaceC1983k2, c2591d.f28260o, true);
        if (d10 != -1) {
            int i29 = c2591d.f28260o - d10;
            c2591d.f28260o = i29;
            if (i29 <= 0) {
                c2591d.f28256i.e(((c2591d.f28258m * 1000000) / aVar.f10849c) + c2591d.f28257l, 1, aVar.f10848b, 0, null);
                c2591d.f28258m += aVar.f10852f;
                c2591d.f28260o = 0;
                i11 = 0;
                i10 = i11;
                i7 = -1;
                if (i10 == i7) {
                }
                return i10;
            }
            i11 = 0;
            i10 = i11;
            i7 = -1;
            if (i10 == i7) {
            }
            return i10;
        }
        i11 = -1;
        i10 = i11;
        i7 = -1;
        if (i10 == i7) {
        }
        return i10;
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.g = interfaceC1984l;
        s4.v u3 = interfaceC1984l.u(0, 1);
        this.f28255h = u3;
        this.f28256i = u3;
        this.g.f();
    }

    public final boolean g(C1979g c1979g, boolean z8) {
        int i7;
        int i10;
        int f4;
        int i11 = z8 ? 32768 : 131072;
        c1979g.f24057f = 0;
        if (c1979g.f24055d == 0) {
            F4.c q10 = this.f28253e.q(c1979g, null);
            this.k = q10;
            if (q10 != null) {
                this.f28252d.b(q10);
            }
            i7 = (int) c1979g.A();
            if (!z8) {
                c1979g.r(i7);
            }
            i10 = 0;
        } else {
            i7 = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!d(c1979g)) {
                v vVar = this.f28250b;
                vVar.G(0);
                int h10 = vVar.h();
                if ((i10 == 0 || ((-128000) & h10) == (i10 & (-128000))) && (f4 = AbstractC1787a.f(h10)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f28251c.d(h10);
                        i10 = h10;
                    }
                    c1979g.b(f4 - 4, false);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z8) {
                            return false;
                        }
                        throw C1586o0.a("Searched too many bytes.", null);
                    }
                    if (z8) {
                        c1979g.f24057f = 0;
                        c1979g.b(i7 + i14, false);
                    } else {
                        c1979g.r(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                throw new EOFException();
            }
        }
        if (z8) {
            c1979g.r(i7 + i13);
        } else {
            c1979g.f24057f = 0;
        }
        this.j = i10;
        return true;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
