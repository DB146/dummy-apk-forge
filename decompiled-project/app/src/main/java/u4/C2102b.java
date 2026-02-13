package u4;

import F.C0257a;
import N6.F;
import Y5.A;
import java.util.ArrayList;
import java.util.Arrays;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import n5.o;
import n5.v;
import s4.C1979g;
import s4.C1986n;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2102b implements InterfaceC1982j {

    /* renamed from: c, reason: collision with root package name */
    public int f24839c;

    /* renamed from: e, reason: collision with root package name */
    public C2103c f24841e;

    /* renamed from: h, reason: collision with root package name */
    public long f24843h;

    /* renamed from: i, reason: collision with root package name */
    public C2105e f24844i;

    /* renamed from: m, reason: collision with root package name */
    public int f24846m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24847n;

    /* renamed from: a, reason: collision with root package name */
    public final v f24837a = new v(12);

    /* renamed from: b, reason: collision with root package name */
    public final E3.h f24838b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1984l f24840d = new A(17);
    public C2105e[] g = new C2105e[0];
    public long k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f24845l = -1;
    public int j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f24842f = -9223372036854775807L;

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f24843h = -1L;
        this.f24844i = null;
        for (C2105e c2105e : this.g) {
            if (c2105e.j == 0) {
                c2105e.f24862h = 0;
            } else {
                c2105e.f24862h = c2105e.f24864l[D.e(c2105e.k, j, true)];
            }
        }
        if (j != 0) {
            this.f24839c = 6;
        } else if (this.g.length == 0) {
            this.f24839c = 0;
        } else {
            this.f24839c = 3;
        }
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        v vVar = this.f24837a;
        ((C1979g) interfaceC1983k).x(vVar.f21229a, 0, 12, false);
        vVar.G(0);
        if (vVar.j() != 1179011410) {
            return false;
        }
        vVar.H(4);
        return vVar.j() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        boolean z8;
        C2105e c2105e;
        long j;
        int i7;
        C2105e c2105e2;
        int i10;
        long j10 = this.f24843h;
        if (j10 != -1) {
            long j11 = ((C1979g) interfaceC1983k).f24055d;
            if (j10 < j11 || j10 > 262144 + j11) {
                c0257a.f3957a = j10;
                z8 = true;
                this.f24843h = -1L;
                if (!z8) {
                    return 1;
                }
                int i11 = this.f24839c;
                C2105e c2105e3 = null;
                int i12 = 2;
                E3.h hVar = this.f24838b;
                v vVar = this.f24837a;
                switch (i11) {
                    case 0:
                        if (!c(interfaceC1983k)) {
                            throw C1586o0.a("AVI Header List not found", null);
                        }
                        ((C1979g) interfaceC1983k).r(12);
                        this.f24839c = 1;
                        return 0;
                    case 1:
                        ((C1979g) interfaceC1983k).h(vVar.f21229a, 0, 12, false);
                        vVar.G(0);
                        hVar.getClass();
                        hVar.f3537a = vVar.j();
                        hVar.f3538b = vVar.j();
                        hVar.f3539c = 0;
                        if (hVar.f3537a != 1414744396) {
                            throw C1586o0.a("LIST expected, found: " + hVar.f3537a, null);
                        }
                        int j12 = vVar.j();
                        hVar.f3539c = j12;
                        if (j12 == 1819436136) {
                            this.j = hVar.f3538b;
                            this.f24839c = 2;
                            return 0;
                        }
                        throw C1586o0.a("hdrl expected, found: " + hVar.f3539c, null);
                    case 2:
                        int i13 = this.j - 4;
                        v vVar2 = new v(i13);
                        ((C1979g) interfaceC1983k).h(vVar2.f21229a, 0, i13, false);
                        C2106f b2 = C2106f.b(1819436136, vVar2);
                        int i14 = b2.f24866b;
                        if (i14 != 1819436136) {
                            throw C1586o0.a("Unexpected header list type " + i14, null);
                        }
                        C2103c c2103c = (C2103c) b2.a(C2103c.class);
                        if (c2103c == null) {
                            throw C1586o0.a("AviHeader not found", null);
                        }
                        this.f24841e = c2103c;
                        this.f24842f = c2103c.f24850c * c2103c.f24848a;
                        ArrayList arrayList = new ArrayList();
                        F listIterator = b2.f24865a.listIterator(0);
                        int i15 = 0;
                        while (listIterator.hasNext()) {
                            InterfaceC2101a interfaceC2101a = (InterfaceC2101a) listIterator.next();
                            if (interfaceC2101a.getType() == 1819440243) {
                                C2106f c2106f = (C2106f) interfaceC2101a;
                                int i16 = i15 + 1;
                                C2104d c2104d = (C2104d) c2106f.a(C2104d.class);
                                C2107g c2107g = (C2107g) c2106f.a(C2107g.class);
                                if (c2104d == null) {
                                    AbstractC1705a.S("AviExtractor", "Missing Stream Header");
                                } else if (c2107g == null) {
                                    AbstractC1705a.S("AviExtractor", "Missing Stream Format");
                                } else {
                                    long T10 = D.T(c2104d.f24854d, c2104d.f24852b * 1000000, c2104d.f24853c);
                                    L l10 = c2107g.f24867a;
                                    K a9 = l10.a();
                                    a9.f19976a = Integer.toString(i15);
                                    int i17 = c2104d.f24855e;
                                    if (i17 != 0) {
                                        a9.f19984l = i17;
                                    }
                                    C2108h c2108h = (C2108h) c2106f.a(C2108h.class);
                                    if (c2108h != null) {
                                        a9.f19977b = c2108h.f24868a;
                                    }
                                    int h10 = o.h(l10.f20096z);
                                    if (h10 == 1 || h10 == i12) {
                                        s4.v u3 = this.f24840d.u(i15, h10);
                                        u3.a(new L(a9));
                                        c2105e = new C2105e(i15, h10, T10, c2104d.f24854d, u3);
                                        this.f24842f = T10;
                                        if (c2105e != null) {
                                            arrayList.add(c2105e);
                                        }
                                        i15 = i16;
                                    }
                                }
                                c2105e = null;
                                if (c2105e != null) {
                                }
                                i15 = i16;
                            }
                            i12 = 2;
                        }
                        this.g = (C2105e[]) arrayList.toArray(new C2105e[0]);
                        this.f24840d.f();
                        this.f24839c = 3;
                        return 0;
                    case 3:
                        long j13 = this.k;
                        if (j13 != -1 && ((C1979g) interfaceC1983k).f24055d != j13) {
                            this.f24843h = j13;
                            return 0;
                        }
                        ((C1979g) interfaceC1983k).x(vVar.f21229a, 0, 12, false);
                        C1979g c1979g = (C1979g) interfaceC1983k;
                        c1979g.f24057f = 0;
                        vVar.G(0);
                        hVar.getClass();
                        hVar.f3537a = vVar.j();
                        hVar.f3538b = vVar.j();
                        hVar.f3539c = 0;
                        int j14 = vVar.j();
                        int i18 = hVar.f3537a;
                        if (i18 == 1179011410) {
                            c1979g.r(12);
                            return 0;
                        }
                        if (i18 != 1414744396 || j14 != 1769369453) {
                            this.f24843h = c1979g.f24055d + hVar.f3538b + 8;
                            return 0;
                        }
                        long j15 = c1979g.f24055d;
                        this.k = j15;
                        this.f24845l = j15 + hVar.f3538b + 8;
                        if (!this.f24847n) {
                            C2103c c2103c2 = this.f24841e;
                            c2103c2.getClass();
                            if ((c2103c2.f24849b & 16) == 16) {
                                this.f24839c = 4;
                                this.f24843h = this.f24845l;
                                return 0;
                            }
                            this.f24840d.i(new C1986n(this.f24842f));
                            this.f24847n = true;
                        }
                        this.f24843h = c1979g.f24055d + 12;
                        this.f24839c = 6;
                        return 0;
                    case 4:
                        ((C1979g) interfaceC1983k).h(vVar.f21229a, 0, 8, false);
                        vVar.G(0);
                        int j16 = vVar.j();
                        int j17 = vVar.j();
                        if (j16 != 829973609) {
                            this.f24843h = ((C1979g) interfaceC1983k).f24055d + j17;
                            return 0;
                        }
                        this.f24839c = 5;
                        this.f24846m = j17;
                        return 0;
                    case 5:
                        v vVar3 = new v(this.f24846m);
                        ((C1979g) interfaceC1983k).h(vVar3.f21229a, 0, this.f24846m, false);
                        if (vVar3.a() < 16) {
                            j = 0;
                        } else {
                            int i19 = vVar3.f21230b;
                            vVar3.H(8);
                            long j18 = vVar3.j();
                            long j19 = this.k;
                            j = j18 > j19 ? 0L : j19 + 8;
                            vVar3.G(i19);
                        }
                        while (vVar3.a() >= 16) {
                            int j20 = vVar3.j();
                            int j21 = vVar3.j();
                            long j22 = vVar3.j() + j;
                            vVar3.j();
                            C2105e[] c2105eArr = this.g;
                            int length = c2105eArr.length;
                            while (true) {
                                if (i7 < length) {
                                    c2105e2 = c2105eArr[i7];
                                    i7 = (c2105e2.f24857b == j20 || c2105e2.f24858c == j20) ? 0 : i7 + 1;
                                } else {
                                    c2105e2 = null;
                                }
                            }
                            if (c2105e2 != null) {
                                if ((j21 & 16) == 16) {
                                    if (c2105e2.j == c2105e2.f24864l.length) {
                                        long[] jArr = c2105e2.k;
                                        c2105e2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = c2105e2.f24864l;
                                        c2105e2.f24864l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = c2105e2.k;
                                    int i20 = c2105e2.j;
                                    jArr2[i20] = j22;
                                    c2105e2.f24864l[i20] = c2105e2.f24863i;
                                    i10 = 1;
                                    c2105e2.j = i20 + 1;
                                } else {
                                    i10 = 1;
                                }
                                c2105e2.f24863i += i10;
                            }
                        }
                        for (C2105e c2105e4 : this.g) {
                            c2105e4.k = Arrays.copyOf(c2105e4.k, c2105e4.j);
                            c2105e4.f24864l = Arrays.copyOf(c2105e4.f24864l, c2105e4.j);
                        }
                        this.f24847n = true;
                        this.f24840d.i(new C1986n(this, 2, this.f24842f));
                        this.f24839c = 6;
                        this.f24843h = this.k;
                        return 0;
                    case 6:
                        if (((C1979g) interfaceC1983k).f24055d >= this.f24845l) {
                            return -1;
                        }
                        C2105e c2105e5 = this.f24844i;
                        if (c2105e5 != null) {
                            int i21 = c2105e5.g;
                            int d10 = i21 - c2105e5.f24856a.d(interfaceC1983k, i21, false);
                            c2105e5.g = d10;
                            boolean z10 = d10 == 0;
                            if (z10) {
                                if (c2105e5.f24861f > 0) {
                                    int i22 = c2105e5.f24862h;
                                    c2105e5.f24856a.e((c2105e5.f24859d * i22) / c2105e5.f24860e, Arrays.binarySearch(c2105e5.f24864l, i22) >= 0 ? 1 : 0, c2105e5.f24861f, 0, null);
                                }
                                c2105e5.f24862h++;
                            }
                            if (!z10) {
                                return 0;
                            }
                            this.f24844i = null;
                            return 0;
                        }
                        C1979g c1979g2 = (C1979g) interfaceC1983k;
                        if ((c1979g2.f24055d & 1) == 1) {
                            c1979g2.r(1);
                        }
                        c1979g2.x(vVar.f21229a, 0, 12, false);
                        vVar.G(0);
                        int j23 = vVar.j();
                        if (j23 == 1414744396) {
                            vVar.G(8);
                            c1979g2.r(vVar.j() == 1769369453 ? 12 : 8);
                            c1979g2.f24057f = 0;
                            return 0;
                        }
                        int j24 = vVar.j();
                        if (j23 == 1263424842) {
                            this.f24843h = c1979g2.f24055d + j24 + 8;
                            return 0;
                        }
                        c1979g2.r(8);
                        c1979g2.f24057f = 0;
                        for (C2105e c2105e6 : this.g) {
                            if (c2105e6.f24857b == j23 || c2105e6.f24858c == j23) {
                                c2105e3 = c2105e6;
                                if (c2105e3 != null) {
                                    this.f24843h = c1979g2.f24055d + j24;
                                    return 0;
                                }
                                c2105e3.f24861f = j24;
                                c2105e3.g = j24;
                                this.f24844i = c2105e3;
                                return 0;
                            }
                        }
                        if (c2105e3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                ((C1979g) interfaceC1983k).r((int) (j10 - j11));
            }
        }
        z8 = false;
        this.f24843h = -1L;
        if (!z8) {
        }
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f24839c = 0;
        this.f24840d = interfaceC1984l;
        this.f24843h = -1L;
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
