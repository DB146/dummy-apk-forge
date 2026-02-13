package A4;

import F.C0257a;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m4.C1586o0;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import o4.AbstractC1787a;
import p4.C1849b;
import s4.C1988p;
import s4.InterfaceC1982j;
import s4.InterfaceC1983k;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class r implements InterfaceC1982j, s4.s {

    /* renamed from: i, reason: collision with root package name */
    public int f458i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public n5.v f459l;

    /* renamed from: n, reason: collision with root package name */
    public int f461n;

    /* renamed from: o, reason: collision with root package name */
    public int f462o;

    /* renamed from: p, reason: collision with root package name */
    public int f463p;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f466s;

    /* renamed from: t, reason: collision with root package name */
    public int f467t;

    /* renamed from: u, reason: collision with root package name */
    public long f468u;

    /* renamed from: v, reason: collision with root package name */
    public int f469v;

    /* renamed from: h, reason: collision with root package name */
    public int f457h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final u f456f = new u();
    public final ArrayList g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final n5.v f454d = new n5.v(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f455e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final n5.v f451a = new n5.v(AbstractC1705a.f21155d);

    /* renamed from: b, reason: collision with root package name */
    public final n5.v f452b = new n5.v(4);

    /* renamed from: c, reason: collision with root package name */
    public final n5.v f453c = new n5.v();

    /* renamed from: m, reason: collision with root package name */
    public int f460m = -1;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1984l f464q = InterfaceC1984l.f24064t;

    /* renamed from: r, reason: collision with root package name */
    public q[] f465r = new q[0];

    @Override // s4.InterfaceC1982j
    public final void a(long j, long j10) {
        this.f455e.clear();
        this.k = 0;
        this.f460m = -1;
        this.f461n = 0;
        this.f462o = 0;
        this.f463p = 0;
        if (j == 0) {
            if (this.f457h != 3) {
                this.f457h = 0;
                this.k = 0;
                return;
            } else {
                u uVar = this.f456f;
                uVar.f477a.clear();
                uVar.f478b = 0;
                this.g.clear();
                return;
            }
        }
        for (q qVar : this.f465r) {
            y yVar = qVar.f447b;
            int e2 = D.e(yVar.f512f, j10, false);
            while (true) {
                if (e2 < 0) {
                    e2 = -1;
                    break;
                } else if ((yVar.g[e2] & 1) != 0) {
                    break;
                } else {
                    e2--;
                }
            }
            if (e2 == -1) {
                e2 = yVar.a(j10);
            }
            qVar.f450e = e2;
            s4.w wVar = qVar.f449d;
            if (wVar != null) {
                wVar.f24094b = false;
                wVar.f24095c = 0;
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final boolean c(InterfaceC1983k interfaceC1983k) {
        return o.j(interfaceC1983k, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x045d  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int, boolean] */
    @Override // s4.InterfaceC1982j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(InterfaceC1983k interfaceC1983k, C0257a c0257a) {
        int i7;
        int i10;
        int i11;
        char c10;
        boolean z8;
        boolean z10;
        a aVar;
        boolean z11;
        int i12;
        int i13;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        int i17 = 4;
        boolean z12 = true;
        while (true) {
            int i18 = this.f457h;
            ArrayDeque arrayDeque = this.f455e;
            n5.v vVar = this.f453c;
            if (i18 == 0) {
                boolean z13 = z12;
                int i19 = this.k;
                n5.v vVar2 = this.f454d;
                if (i19 == 0) {
                    if (!interfaceC1983k.h(vVar2.f21229a, 0, 8, z13)) {
                        return -1;
                    }
                    this.k = 8;
                    vVar2.G(0);
                    this.j = vVar2.w();
                    this.f458i = vVar2.h();
                }
                long j = this.j;
                if (j == 1) {
                    interfaceC1983k.readFully(vVar2.f21229a, 8, 8);
                    this.k += 8;
                    this.j = vVar2.z();
                } else if (j == 0) {
                    long k = interfaceC1983k.k();
                    if (k == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        k = aVar.f363c;
                    }
                    if (k != -1) {
                        this.j = (k - interfaceC1983k.E()) + this.k;
                    }
                }
                long j10 = this.j;
                int i20 = this.k;
                if (j10 < i20) {
                    throw C1586o0.c("Atom size less than header length (unsupported).");
                }
                int i21 = this.f458i;
                if (i21 == 1836019574 || i21 == 1953653099 || i21 == 1835297121 || i21 == 1835626086 || i21 == 1937007212 || i21 == 1701082227 || i21 == 1835365473) {
                    z11 = true;
                    long E10 = interfaceC1983k.E();
                    long j11 = this.j;
                    long j12 = this.k;
                    long j13 = (E10 + j11) - j12;
                    if (j11 == j12 || this.f458i != 1835365473) {
                        i12 = 4;
                    } else {
                        vVar.D(8);
                        interfaceC1983k.m(0, vVar.f21229a, 8);
                        byte[] bArr = j.f393a;
                        int i22 = vVar.f21230b;
                        i12 = 4;
                        vVar.H(4);
                        if (vVar.h() != 1751411826) {
                            i22 += 4;
                        }
                        vVar.G(i22);
                        interfaceC1983k.r(vVar.f21230b);
                        interfaceC1983k.q();
                    }
                    arrayDeque.push(new a(this.f458i, j13));
                    if (this.j == this.k) {
                        j(j13);
                        i13 = 0;
                    } else {
                        i13 = 0;
                        this.f457h = 0;
                        this.k = 0;
                    }
                } else {
                    if (i21 == 1835296868 || i21 == 1836476516 || i21 == 1751411826 || i21 == 1937011556 || i21 == 1937011827 || i21 == 1937011571 || i21 == 1668576371 || i21 == 1701606260 || i21 == 1937011555 || i21 == 1937011578 || i21 == 1937013298 || i21 == 1937007471 || i21 == 1668232756 || i21 == 1953196132 || i21 == 1718909296 || i21 == 1969517665 || i21 == 1801812339 || i21 == 1768715124) {
                        AbstractC1705a.m(i20 == 8);
                        AbstractC1705a.m(this.j <= 2147483647L);
                        n5.v vVar3 = new n5.v((int) this.j);
                        System.arraycopy(vVar2.f21229a, 0, vVar3.f21229a, 0, 8);
                        this.f459l = vVar3;
                        z11 = true;
                        this.f457h = 1;
                    } else {
                        long E11 = interfaceC1983k.E();
                        long j14 = this.k;
                        long j15 = E11 - j14;
                        if (this.f458i == 1836086884) {
                            new L4.b(0L, j15, -9223372036854775807L, j15 + j14, this.j - j14);
                        }
                        this.f459l = null;
                        z11 = true;
                        this.f457h = 1;
                    }
                    i13 = 0;
                    i12 = 4;
                }
                z12 = z11;
                i16 = i13;
                i17 = i12;
                i14 = 3;
                i15 = 2;
            } else {
                if (i18 != z12) {
                    if (i18 == i15) {
                        long E12 = interfaceC1983k.E();
                        if (this.f460m == -1) {
                            int i23 = -1;
                            int i24 = -1;
                            boolean z14 = true;
                            boolean z15 = true;
                            int i25 = 0;
                            long j16 = Long.MAX_VALUE;
                            long j17 = Long.MAX_VALUE;
                            long j18 = Long.MAX_VALUE;
                            while (true) {
                                q[] qVarArr = this.f465r;
                                if (i25 >= qVarArr.length) {
                                    break;
                                }
                                q qVar = qVarArr[i25];
                                int i26 = qVar.f450e;
                                y yVar = qVar.f447b;
                                if (i26 != yVar.f508b) {
                                    long j19 = yVar.f509c[i26];
                                    long[][] jArr = this.f466s;
                                    int i27 = D.f21141a;
                                    long j20 = jArr[i25][i26];
                                    long j21 = j19 - E12;
                                    boolean z16 = j21 < 0 || j21 >= 262144;
                                    if ((!z16 && z15) || (z16 == z15 && j21 < j18)) {
                                        z15 = z16;
                                        j17 = j20;
                                        i24 = i25;
                                        j18 = j21;
                                    }
                                    if (j20 < j16) {
                                        z14 = z16;
                                        j16 = j20;
                                        i23 = i25;
                                    }
                                }
                                i25++;
                            }
                            if (j16 == Long.MAX_VALUE || !z14 || j17 < j16 + 10485760) {
                                i23 = i24;
                            }
                            this.f460m = i23;
                            if (i23 == -1) {
                                return -1;
                            }
                        }
                        q qVar2 = this.f465r[this.f460m];
                        s4.v vVar4 = qVar2.f448c;
                        int i28 = qVar2.f450e;
                        y yVar2 = qVar2.f447b;
                        long j22 = yVar2.f509c[i28];
                        int i29 = yVar2.f510d[i28];
                        long j23 = (j22 - E12) + this.f461n;
                        if (j23 < 0 || j23 >= 262144) {
                            c0257a.f3957a = j22;
                            return 1;
                        }
                        v vVar5 = qVar2.f446a;
                        if (vVar5.g == 1) {
                            j23 += 8;
                            i29 -= 8;
                        }
                        interfaceC1983k.r((int) j23);
                        int i30 = vVar5.j;
                        s4.w wVar = qVar2.f449d;
                        if (i30 == 0) {
                            if ("audio/ac4".equals(vVar5.f485f.f20096z)) {
                                if (this.f462o == 0) {
                                    AbstractC1787a.e(i29, vVar);
                                    i7 = 7;
                                    vVar4.c(7, vVar);
                                    this.f462o += 7;
                                } else {
                                    i7 = 7;
                                }
                                i29 += i7;
                            } else if (wVar != null) {
                                wVar.c(interfaceC1983k);
                            }
                            while (true) {
                                int i31 = this.f462o;
                                if (i31 >= i29) {
                                    break;
                                }
                                int d10 = vVar4.d(interfaceC1983k, i29 - i31, false);
                                this.f461n += d10;
                                this.f462o += d10;
                                this.f463p -= d10;
                            }
                        } else {
                            n5.v vVar6 = this.f452b;
                            byte[] bArr2 = vVar6.f21229a;
                            ?? r82 = 0;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i32 = 4 - i30;
                            while (this.f462o < i29) {
                                int i33 = this.f463p;
                                if (i33 == 0) {
                                    interfaceC1983k.readFully(bArr2, i32, i30);
                                    this.f461n += i30;
                                    vVar6.G(r82);
                                    int h10 = vVar6.h();
                                    if (h10 < 0) {
                                        throw C1586o0.a("Invalid NAL length", null);
                                    }
                                    this.f463p = h10;
                                    n5.v vVar7 = this.f451a;
                                    vVar7.G(r82);
                                    vVar4.c(4, vVar7);
                                    this.f462o += 4;
                                    i29 += i32;
                                } else {
                                    int d11 = vVar4.d(interfaceC1983k, i33, r82);
                                    this.f461n += d11;
                                    this.f462o += d11;
                                    this.f463p -= d11;
                                }
                                r82 = 0;
                            }
                        }
                        int i34 = i29;
                        long j24 = yVar2.f512f[i28];
                        int i35 = yVar2.g[i28];
                        if (wVar != null) {
                            wVar.b(vVar4, j24, i35, i34, 0, null);
                            if (i28 + 1 == yVar2.f508b) {
                                wVar.a(vVar4, null);
                            }
                        } else {
                            vVar4.e(j24, i35, i34, 0, null);
                        }
                        qVar2.f450e++;
                        this.f460m = -1;
                        this.f461n = 0;
                        this.f462o = 0;
                        this.f463p = 0;
                        return 0;
                    }
                    if (i18 != i14) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.g;
                    u uVar = this.f456f;
                    int i36 = uVar.f478b;
                    if (i36 != 0) {
                        if (i36 != z12) {
                            ArrayList arrayList2 = uVar.f477a;
                            short s3 = 2817;
                            short s10 = 2816;
                            short s11 = 2192;
                            if (i36 == i15) {
                                long k7 = interfaceC1983k.k();
                                int i37 = uVar.f479c - 20;
                                n5.v vVar8 = new n5.v(i37);
                                interfaceC1983k.readFully(vVar8.f21229a, 0, i37);
                                int i38 = 0;
                                while (i38 < i37 / 12) {
                                    vVar8.H(2);
                                    short l10 = vVar8.l();
                                    if (l10 != s11 && l10 != s10 && l10 != s3) {
                                        if (l10 != 2819 && l10 != 2820) {
                                            vVar8.H(8);
                                            i38++;
                                            s3 = 2817;
                                            s11 = 2192;
                                            s10 = 2816;
                                        }
                                    }
                                    arrayList2.add(new t(vVar8.j(), (k7 - uVar.f479c) - vVar8.j()));
                                    i38++;
                                    s3 = 2817;
                                    s11 = 2192;
                                    s10 = 2816;
                                }
                                if (arrayList2.isEmpty()) {
                                    c0257a.f3957a = 0L;
                                } else {
                                    uVar.f478b = i14;
                                    c0257a.f3957a = ((t) arrayList2.get(0)).f473a;
                                }
                            } else {
                                if (i36 != i14) {
                                    throw new IllegalStateException();
                                }
                                long E13 = interfaceC1983k.E();
                                int k10 = (int) ((interfaceC1983k.k() - interfaceC1983k.E()) - uVar.f479c);
                                n5.v vVar9 = new n5.v(k10);
                                interfaceC1983k.readFully(vVar9.f21229a, i16, k10);
                                int i39 = i16;
                                while (i39 < arrayList2.size()) {
                                    t tVar = (t) arrayList2.get(i39);
                                    vVar9.G((int) (tVar.f473a - E13));
                                    vVar9.H(i17);
                                    int j25 = vVar9.j();
                                    Charset charset = M6.e.f6799c;
                                    String t5 = vVar9.t(j25, charset);
                                    switch (t5.hashCode()) {
                                        case -1711564334:
                                            if (t5.equals("SlowMotion_Data")) {
                                                i11 = 0;
                                                break;
                                            }
                                            break;
                                        case -1332107749:
                                            if (t5.equals("Super_SlowMotion_Edit_Data")) {
                                                i11 = 1;
                                                break;
                                            }
                                            break;
                                        case -1251387154:
                                            if (t5.equals("Super_SlowMotion_Data")) {
                                                i11 = 2;
                                                break;
                                            }
                                            break;
                                        case -830665521:
                                            if (t5.equals("Super_SlowMotion_Deflickering_On")) {
                                                i11 = i14;
                                                break;
                                            }
                                            break;
                                        case 1760745220:
                                            if (t5.equals("Super_SlowMotion_BGM")) {
                                                i11 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    i11 = -1;
                                    switch (i11) {
                                        case 0:
                                            c10 = 2192;
                                            break;
                                        case 1:
                                            c10 = 2819;
                                            break;
                                        case 2:
                                            c10 = 2816;
                                            break;
                                        case 3:
                                            c10 = 2820;
                                            break;
                                        case 4:
                                            c10 = 2817;
                                            break;
                                        default:
                                            throw C1586o0.a("Invalid SEF name", null);
                                    }
                                    int i40 = tVar.f474b - (j25 + 8);
                                    if (c10 == 2192) {
                                        ArrayList arrayList3 = new ArrayList();
                                        List G9 = u.f476e.G(vVar9.t(i40, charset));
                                        for (int i41 = 0; i41 < G9.size(); i41++) {
                                            List G10 = u.f475d.G((CharSequence) G9.get(i41));
                                            if (G10.size() != i14) {
                                                throw C1586o0.a(null, null);
                                            }
                                            try {
                                                arrayList3.add(new L4.c(1 << (Integer.parseInt((String) G10.get(2)) - 1), Long.parseLong((String) G10.get(0)), Long.parseLong((String) G10.get(1))));
                                            } catch (NumberFormatException e2) {
                                                throw C1586o0.a(null, e2);
                                            }
                                        }
                                        arrayList.add(new L4.d(arrayList3));
                                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i39++;
                                    i17 = 4;
                                }
                                c0257a.f3957a = 0L;
                            }
                        } else {
                            n5.v vVar10 = new n5.v(8);
                            interfaceC1983k.readFully(vVar10.f21229a, i16, 8);
                            uVar.f479c = vVar10.j() + 8;
                            if (vVar10.h() != 1397048916) {
                                c0257a.f3957a = 0L;
                            } else {
                                c0257a.f3957a = interfaceC1983k.E() - (uVar.f479c - 12);
                                uVar.f478b = 2;
                            }
                        }
                        i10 = 1;
                    } else {
                        long k11 = interfaceC1983k.k();
                        c0257a.f3957a = (k11 == -1 || k11 < 8) ? 0L : k11 - 8;
                        i10 = 1;
                        uVar.f478b = 1;
                    }
                    if (c0257a.f3957a == 0) {
                        this.f457h = 0;
                        this.k = 0;
                    }
                    return i10;
                }
                long j26 = this.j - this.k;
                long E14 = interfaceC1983k.E() + j26;
                n5.v vVar11 = this.f459l;
                if (vVar11 != null) {
                    interfaceC1983k.readFully(vVar11.f21229a, this.k, (int) j26);
                    if (this.f458i == 1718909296) {
                        vVar11.G(8);
                        int h11 = vVar11.h();
                        int i42 = h11 != 1751476579 ? h11 != 1903435808 ? 0 : 1 : 2;
                        if (i42 == 0) {
                            vVar11.H(4);
                            while (true) {
                                if (vVar11.a() <= 0) {
                                    i42 = 0;
                                    break;
                                }
                                int h12 = vVar11.h();
                                i42 = h12 != 1751476579 ? h12 != 1903435808 ? 0 : 1 : 2;
                                if (i42 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f469v = i42;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f364d.add(new b(this.f458i, vVar11));
                    }
                } else if (j26 < 262144) {
                    interfaceC1983k.r((int) j26);
                } else {
                    c0257a.f3957a = interfaceC1983k.E() + j26;
                    z8 = true;
                    j(E14);
                    if (z8) {
                        z10 = true;
                        i15 = 2;
                    } else {
                        i15 = 2;
                        if (this.f457h != 2) {
                            return 1;
                        }
                        z10 = true;
                    }
                    z12 = z10;
                    i16 = 0;
                    i17 = 4;
                }
                z8 = false;
                j(E14);
                if (z8) {
                }
                z12 = z10;
                i16 = 0;
                i17 = 4;
            }
        }
    }

    @Override // s4.InterfaceC1982j
    public final void f(InterfaceC1984l interfaceC1984l) {
        this.f464q = interfaceC1984l;
    }

    @Override // s4.s
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df A[EDGE_INSN: B:70:0x00df->B:71:0x00df BREAK  A[LOOP:1: B:28:0x006c->B:59:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    @Override // s4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s4.r h(long j) {
        long j10;
        long j11;
        long j12;
        long j13;
        int i7;
        q[] qVarArr;
        boolean z8;
        int i10;
        int[] iArr;
        int i11;
        int a9;
        q[] qVarArr2 = this.f465r;
        int length = qVarArr2.length;
        s4.t tVar = s4.t.f24086c;
        if (length == 0) {
            return new s4.r(tVar, tVar);
        }
        int i12 = this.f467t;
        boolean z10 = false;
        int i13 = -1;
        if (i12 != -1) {
            y yVar = qVarArr2[i12].f447b;
            long[] jArr = yVar.f512f;
            int e2 = D.e(jArr, j, false);
            while (true) {
                if (e2 < 0) {
                    e2 = -1;
                    break;
                }
                if ((yVar.g[e2] & 1) != 0) {
                    break;
                }
                e2--;
            }
            if (e2 == -1) {
                e2 = yVar.a(j);
            }
            if (e2 == -1) {
                return new s4.r(tVar, tVar);
            }
            j11 = jArr[e2];
            long[] jArr2 = yVar.f509c;
            j10 = jArr2[e2];
            if (j11 < j && e2 < yVar.f508b - 1 && (a9 = yVar.a(j)) != -1 && a9 != e2) {
                j12 = jArr[a9];
                j13 = jArr2[a9];
                i7 = 0;
                long j14 = j10;
                while (true) {
                    qVarArr = this.f465r;
                    if (i7 < qVarArr.length) {
                        break;
                    }
                    if (i7 != this.f467t) {
                        y yVar2 = qVarArr[i7].f447b;
                        long[] jArr3 = yVar2.f512f;
                        int e10 = D.e(jArr3, j11, z10);
                        while (true) {
                            iArr = yVar2.g;
                            if (e10 < 0) {
                                i11 = i13;
                                break;
                            }
                            if ((iArr[e10] & 1) != 0) {
                                i11 = e10;
                                break;
                            }
                            e10--;
                        }
                        if (i11 == i13) {
                            i11 = yVar2.a(j11);
                        }
                        long[] jArr4 = yVar2.f509c;
                        if (i11 != i13) {
                            j14 = Math.min(jArr4[i11], j14);
                        }
                        if (j12 != -9223372036854775807L) {
                            z8 = false;
                            int e11 = D.e(jArr3, j12, false);
                            while (true) {
                                if (e11 < 0) {
                                    i10 = -1;
                                    e11 = -1;
                                    break;
                                }
                                if ((iArr[e11] & 1) != 0) {
                                    i10 = -1;
                                    break;
                                }
                                e11--;
                            }
                            if (e11 == i10) {
                                e11 = yVar2.a(j12);
                            }
                            if (e11 != i10) {
                                j13 = Math.min(jArr4[e11], j13);
                            }
                        } else {
                            i10 = -1;
                            z8 = false;
                        }
                    } else {
                        int i14 = i13;
                        z8 = z10;
                        i10 = i14;
                    }
                    i7++;
                    boolean z11 = z8;
                    i13 = i10;
                    z10 = z11;
                }
                s4.t tVar2 = new s4.t(j11, j14);
                return j12 != -9223372036854775807L ? new s4.r(tVar2, tVar2) : new s4.r(tVar2, new s4.t(j12, j13));
            }
        } else {
            j10 = Long.MAX_VALUE;
            j11 = j;
        }
        j12 = -9223372036854775807L;
        j13 = -1;
        i7 = 0;
        long j142 = j10;
        while (true) {
            qVarArr = this.f465r;
            if (i7 < qVarArr.length) {
            }
            i7++;
            boolean z112 = z8;
            i13 = i10;
            z10 = z112;
        }
        s4.t tVar22 = new s4.t(j11, j142);
        return j12 != -9223372036854775807L ? new s4.r(tVar22, tVar22) : new s4.r(tVar22, new s4.t(j12, j13));
    }

    @Override // s4.s
    public final long i() {
        return this.f468u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e6, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ed, code lost:
    
        if (r8 != 1851878757) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ef, code lost:
    
        r2 = r10.r(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f9, code lost:
    
        if (r8 != 1684108385) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fb, code lost:
    
        r12 = r24;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ff, code lost:
    
        r10.H(r24 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0208, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020a, code lost:
    
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020c, code lost:
    
        if (r2 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020f, code lost:
    
        if (r5 != (-1)) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0227, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0228, code lost:
    
        r10.G(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0212, code lost:
    
        r10.G(r5);
        r10.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0224, code lost:
    
        r5 = new K4.k(r0, r2, r10.r(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022d, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ab, code lost:
    
        n5.AbstractC1705a.s("MetadataUtil", "Skipped unknown metadata entry: " + A4.c.g(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02be, code lost:
    
        r10.G(r11);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c7, code lost:
    
        r0 = A4.o.i(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00cb, code lost:
    
        if (r0 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00cf, code lost:
    
        if (r0 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00d1, code lost:
    
        r0 = A4.o.f443a[r0 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00d9, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00db, code lost:
    
        r5 = new K4.o("TCON", null, N6.H.K(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00e6, code lost:
    
        n5.AbstractC1705a.S("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00ec, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e5, code lost:
    
        r10.G(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bd, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0232, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0239, code lost:
    
        if (r0 != 6516084) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x023b, code lost:
    
        r5 = A4.o.b(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0243, code lost:
    
        if (r0 == 7233901) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0248, code lost:
    
        if (r0 != 7631467) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x024f, code lost:
    
        if (r0 == 6516589) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0254, code lost:
    
        if (r0 != 7828084) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x025b, code lost:
    
        if (r0 != 6578553) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x025d, code lost:
    
        r5 = A4.o.g(r13, "TDRC", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0267, code lost:
    
        if (r0 != 4280916) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0269, code lost:
    
        r5 = A4.o.g(r13, "TPE1", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0273, code lost:
    
        if (r0 != 7630703) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0275, code lost:
    
        r5 = A4.o.g(r13, "TSSE", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x027f, code lost:
    
        if (r0 != 6384738) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0281, code lost:
    
        r5 = A4.o.g(r13, "TALB", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x028b, code lost:
    
        if (r0 != 7108978) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028d, code lost:
    
        r5 = A4.o.g(r13, "USLT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0297, code lost:
    
        if (r0 != 6776174) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0299, code lost:
    
        r5 = A4.o.g(r13, "TCON", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02a1, code lost:
    
        if (r0 != 6779504) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02a3, code lost:
    
        r5 = A4.o.g(r13, "TIT1", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02c3, code lost:
    
        r5 = A4.o.g(r13, "TCOM", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02cb, code lost:
    
        r5 = A4.o.g(r13, "TIT2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e9, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02f0, code lost:
    
        if (r4.isEmpty() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02f9, code lost:
    
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02f4, code lost:
    
        r0 = new F4.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r10.G(r2);
        r2 = r2 + r12;
        r10.H(r13);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r11 = r10.f21230b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r11 >= r2) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        r11 = r10.h() + r11;
        r13 = r10.h();
        r8 = (r13 >> 24) & 255;
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r8 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r8 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        if (r13 != 1735291493) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        if (r13 != 1684632427) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
    
        r5 = A4.o.d(r13, "TPOS", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        r10.G(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02d3, code lost:
    
        if (r5 == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02d5, code lost:
    
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02d8, code lost:
    
        r2 = r20;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r13 != 1953655662) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        r5 = A4.o.d(r13, "TRCK", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (r13 != 1953329263) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0116, code lost:
    
        r0 = A4.o.h(r13, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        r10.G(r11);
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
    
        if (r13 != 1668311404) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r5 = A4.o.h(r13, "TCMP", r10, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
    
        if (r13 != 1668249202) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        r5 = A4.o.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        if (r13 != 1631670868) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        r5 = A4.o.g(r13, "TPE2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        if (r13 != 1936682605) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
    
        r5 = A4.o.g(r13, "TSOT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0155, code lost:
    
        if (r13 != 1936679276) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0157, code lost:
    
        r5 = A4.o.g(r13, "TSO2", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
    
        if (r13 != 1936679282) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        r5 = A4.o.g(r13, "TSOA", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016d, code lost:
    
        if (r13 != 1936679265) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016f, code lost:
    
        r5 = A4.o.g(r13, "TSOP", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        if (r13 != 1936679791) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        r5 = A4.o.g(r13, "TSOC", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0187, code lost:
    
        if (r13 != 1920233063) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        r5 = A4.o.h(r13, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        if (r13 != 1885823344) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0197, code lost:
    
        r0 = A4.o.h(r13, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
    
        if (r13 != 1936683886) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
    
        r5 = A4.o.g(r13, "TVSHOWSORT", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b1, code lost:
    
        if (r13 != 1953919848) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        r5 = A4.o.g(r13, "TVSHOW", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
    
        if (r13 != 757935405) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c0, code lost:
    
        r0 = null;
        r2 = null;
        r5 = -1;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
    
        r13 = r10.f21230b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c6, code lost:
    
        if (r13 >= r11) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c8, code lost:
    
        r24 = r10.h();
        r8 = r10.h();
        r10.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d9, code lost:
    
        if (r8 != 1835360622) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01db, code lost:
    
        r0 = r10.r(r24 - 12);
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0204, code lost:
    
        r6 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0666 A[EDGE_INSN: B:345:0x0666->B:346:0x0666 BREAK  A[LOOP:9: B:269:0x052f->B:275:0x0655], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0689 A[LOOP:12: B:347:0x0686->B:349:0x0689, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j) {
        int i7;
        int i10;
        ArrayDeque arrayDeque;
        int i11;
        F4.c cVar;
        F4.c cVar2;
        F4.c cVar3;
        ArrayList arrayList;
        F4.c cVar4;
        int i12;
        ArrayList f4;
        int size;
        long j10;
        int i13;
        long j11;
        q[] qVarArr;
        int i14;
        int i15;
        ArrayList arrayList2;
        int i16;
        int i17;
        F4.c cVar5;
        F4.c cVar6;
        int i18;
        int i19;
        ArrayList arrayList3;
        int i20;
        F4.c cVar7;
        int i21;
        int i22;
        int i23;
        ArrayList arrayList4;
        int i24;
        String[] strArr;
        L4.a aVar;
        ArrayDeque arrayDeque2;
        r rVar = this;
        int i25 = 4;
        int i26 = 1;
        while (true) {
            ArrayDeque arrayDeque3 = rVar.f455e;
            if (arrayDeque3.isEmpty() || ((a) arrayDeque3.peek()).f363c != j) {
                break;
            }
            a aVar2 = (a) arrayDeque3.pop();
            if (aVar2.f368b == 1836019574) {
                ArrayList arrayList5 = new ArrayList();
                boolean z8 = rVar.f469v == i26 ? i26 : 0;
                C1988p c1988p = new C1988p();
                b H10 = aVar2.H(1969517665);
                int i27 = 1751411826;
                int i28 = 1768715124;
                int i29 = 1835365473;
                int i30 = 8;
                if (H10 != null) {
                    byte[] bArr = j.f393a;
                    n5.v vVar = H10.f366c;
                    vVar.G(8);
                    F4.c cVar8 = null;
                    F4.c cVar9 = null;
                    F4.c cVar10 = null;
                    while (vVar.a() >= i30) {
                        int i31 = vVar.f21230b;
                        int h10 = vVar.h();
                        int h11 = vVar.h();
                        if (h11 == i29) {
                            vVar.G(i31);
                            int i32 = i31 + h10;
                            vVar.H(i30);
                            int i33 = vVar.f21230b;
                            vVar.H(i25);
                            if (vVar.h() != i27) {
                                i33 += i25;
                            }
                            vVar.G(i33);
                            while (true) {
                                int i34 = vVar.f21230b;
                                if (i34 >= i32) {
                                    arrayDeque2 = arrayDeque3;
                                    cVar9 = null;
                                    break;
                                }
                                int h12 = vVar.h();
                                if (vVar.h() == i28) {
                                    break;
                                }
                                vVar.G(i34 + h12);
                                arrayDeque3 = arrayDeque3;
                                i28 = 1768715124;
                                i30 = 8;
                            }
                        } else {
                            arrayDeque2 = arrayDeque3;
                            if (h11 == 1936553057) {
                                vVar.G(i31);
                                int i35 = i31 + h10;
                                vVar.H(12);
                                while (true) {
                                    int i36 = vVar.f21230b;
                                    if (i36 >= i35) {
                                        break;
                                    }
                                    int h13 = vVar.h();
                                    if (vVar.h() != 1935766900) {
                                        vVar.G(i36 + h13);
                                    } else if (h13 >= 14) {
                                        vVar.H(5);
                                        int v10 = vVar.v();
                                        if (v10 == 12 || v10 == 13) {
                                            float f10 = v10 == 12 ? 240.0f : 120.0f;
                                            vVar.H(1);
                                            cVar8 = new F4.c(new L4.e(vVar.v(), f10));
                                        }
                                    }
                                }
                                cVar8 = null;
                            } else if (h11 == -1451722374) {
                                short s3 = vVar.s();
                                vVar.H(2);
                                String t5 = vVar.t(s3, M6.e.f6799c);
                                int max = Math.max(t5.lastIndexOf(43), t5.lastIndexOf(45));
                                try {
                                    cVar10 = new F4.c(new C1849b(Float.parseFloat(t5.substring(0, max)), Float.parseFloat(t5.substring(max, t5.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    cVar10 = null;
                                }
                            }
                        }
                        vVar.G(i31 + h10);
                        arrayDeque3 = arrayDeque2;
                        i25 = 4;
                        i29 = 1835365473;
                        i28 = 1768715124;
                        i27 = 1751411826;
                        i30 = 8;
                    }
                    arrayDeque = arrayDeque3;
                    F4.c cVar11 = cVar9;
                    if (cVar11 != null) {
                        c1988p.b(cVar11);
                    }
                    cVar3 = cVar11;
                    cVar = cVar8;
                    cVar2 = cVar10;
                    i11 = 1835365473;
                } else {
                    arrayDeque = arrayDeque3;
                    i11 = 1835365473;
                    cVar = null;
                    cVar2 = null;
                    cVar3 = null;
                }
                a G9 = aVar2.G(i11);
                if (G9 != null) {
                    byte[] bArr2 = j.f393a;
                    b H11 = G9.H(1751411826);
                    b H12 = G9.H(1801812339);
                    b H13 = G9.H(1768715124);
                    if (H11 != null && H12 != null && H13 != null) {
                        n5.v vVar2 = H11.f366c;
                        vVar2.G(16);
                        if (vVar2.h() == 1835299937) {
                            n5.v vVar3 = H12.f366c;
                            vVar3.G(12);
                            int h14 = vVar3.h();
                            String[] strArr2 = new String[h14];
                            for (int i37 = 0; i37 < h14; i37++) {
                                int h15 = vVar3.h();
                                vVar3.H(4);
                                strArr2[i37] = vVar3.t(h15 - 8, M6.e.f6799c);
                            }
                            n5.v vVar4 = H13.f366c;
                            vVar4.G(8);
                            ArrayList arrayList6 = new ArrayList();
                            for (int i38 = 8; vVar4.a() > i38; i38 = 8) {
                                int i39 = vVar4.f21230b;
                                int h16 = vVar4.h();
                                int h17 = vVar4.h() - 1;
                                if (h17 < 0 || h17 >= h14) {
                                    arrayList4 = arrayList5;
                                    i24 = h14;
                                    strArr = strArr2;
                                    h3.o.u(h17, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr2[h17];
                                    int i40 = i39 + h16;
                                    while (true) {
                                        int i41 = vVar4.f21230b;
                                        if (i41 >= i40) {
                                            arrayList4 = arrayList5;
                                            i24 = h14;
                                            strArr = strArr2;
                                            aVar = null;
                                            break;
                                        }
                                        int h18 = vVar4.h();
                                        int i42 = i40;
                                        i24 = h14;
                                        if (vVar4.h() == 1684108385) {
                                            int h19 = vVar4.h();
                                            int h20 = vVar4.h();
                                            int i43 = h18 - 16;
                                            strArr = strArr2;
                                            byte[] bArr3 = new byte[i43];
                                            arrayList4 = arrayList5;
                                            vVar4.f(0, bArr3, i43);
                                            aVar = new L4.a(str, bArr3, h20, h19);
                                            break;
                                        }
                                        vVar4.G(i41 + h18);
                                        i40 = i42;
                                        h14 = i24;
                                    }
                                    if (aVar != null) {
                                        arrayList6.add(aVar);
                                    }
                                }
                                vVar4.G(i39 + h16);
                                h14 = i24;
                                strArr2 = strArr;
                                arrayList5 = arrayList4;
                            }
                            arrayList = arrayList5;
                            if (!arrayList6.isEmpty()) {
                                cVar4 = new F4.c(arrayList6);
                                b H14 = aVar2.H(1836476516);
                                H14.getClass();
                                f c10 = j.c(H14.f366c);
                                i12 = -1;
                                f4 = j.f(aVar2, c1988p, -9223372036854775807L, null, false, z8, new p(0));
                                size = f4.size();
                                j10 = -9223372036854775807L;
                                int i44 = -1;
                                long j12 = -9223372036854775807L;
                                i13 = 0;
                                while (true) {
                                    j11 = 0;
                                    if (i13 >= size) {
                                        break;
                                    }
                                    y yVar = (y) f4.get(i13);
                                    if (yVar.f508b == 0) {
                                        cVar6 = cVar;
                                        arrayList2 = f4;
                                        i16 = size;
                                        arrayList3 = arrayList;
                                        i19 = -1;
                                        i20 = 1;
                                    } else {
                                        v vVar5 = yVar.f507a;
                                        arrayList2 = f4;
                                        i16 = size;
                                        long j13 = vVar5.f484e;
                                        if (j13 == j10) {
                                            j13 = yVar.f513h;
                                        }
                                        long max2 = Math.max(j12, j13);
                                        InterfaceC1984l interfaceC1984l = rVar.f464q;
                                        int i45 = vVar5.f481b;
                                        q qVar = new q(vVar5, yVar, interfaceC1984l.u(i13, i45));
                                        L l10 = vVar5.f485f;
                                        boolean equals = "audio/true-hd".equals(l10.f20096z);
                                        int i46 = yVar.f511e;
                                        int i47 = equals ? i46 * 16 : i46 + 30;
                                        K a9 = l10.a();
                                        a9.f19984l = i47;
                                        if (i45 == 2 && j13 > 0) {
                                            int i48 = yVar.f508b;
                                            if (i48 > 1) {
                                                a9.f19990r = i48 / (((float) j13) / 1000000.0f);
                                            } else {
                                                i17 = 1;
                                                if (i45 == i17 && (i22 = c1988p.f24078a) != -1 && (i23 = c1988p.f24079b) != -1) {
                                                    a9.f19970A = i22;
                                                    a9.f19971B = i23;
                                                }
                                                ArrayList arrayList7 = rVar.g;
                                                F4.c[] cVarArr = {cVar, !arrayList7.isEmpty() ? null : new F4.c(arrayList7), cVar2, (F4.c) c10.f383c};
                                                cVar5 = new F4.c(new F4.b[0]);
                                                if (i45 == 1 && cVar3 != null) {
                                                    cVar5 = cVar3;
                                                }
                                                if (cVar4 != null) {
                                                    int i49 = 0;
                                                    while (true) {
                                                        F4.b[] bVarArr = cVar4.f4071a;
                                                        if (i49 >= bVarArr.length) {
                                                            break;
                                                        }
                                                        F4.b bVar = bVarArr[i49];
                                                        if (bVar instanceof L4.a) {
                                                            L4.a aVar3 = (L4.a) bVar;
                                                            cVar7 = cVar;
                                                            if (!aVar3.f6288a.equals("com.android.capture.fps")) {
                                                                i21 = 1;
                                                                cVar5 = cVar5.a(aVar3);
                                                            } else if (i45 == 2) {
                                                                i21 = 1;
                                                                cVar5 = cVar5.a(aVar3);
                                                            }
                                                            i49 += i21;
                                                            cVar = cVar7;
                                                        } else {
                                                            cVar7 = cVar;
                                                        }
                                                        i21 = 1;
                                                        i49 += i21;
                                                        cVar = cVar7;
                                                    }
                                                }
                                                cVar6 = cVar;
                                                for (i18 = 0; i18 < 4; i18++) {
                                                    F4.c cVar12 = cVarArr[i18];
                                                    cVar5.getClass();
                                                    if (cVar12 != null) {
                                                        cVar5 = cVar5.a(cVar12.f4071a);
                                                    }
                                                }
                                                if (cVar5.f4071a.length > 0) {
                                                    a9.f19983i = cVar5;
                                                }
                                                qVar.f448c.a(new L(a9));
                                                if (i45 != 2) {
                                                    i19 = -1;
                                                    if (i44 == -1) {
                                                        i44 = arrayList.size();
                                                    }
                                                } else {
                                                    i19 = -1;
                                                }
                                                arrayList3 = arrayList;
                                                arrayList3.add(qVar);
                                                j12 = max2;
                                                i20 = 1;
                                            }
                                        }
                                        i17 = 1;
                                        if (i45 == i17) {
                                            a9.f19970A = i22;
                                            a9.f19971B = i23;
                                        }
                                        ArrayList arrayList72 = rVar.g;
                                        F4.c[] cVarArr2 = {cVar, !arrayList72.isEmpty() ? null : new F4.c(arrayList72), cVar2, (F4.c) c10.f383c};
                                        cVar5 = new F4.c(new F4.b[0]);
                                        if (i45 == 1) {
                                            cVar5 = cVar3;
                                        }
                                        if (cVar4 != null) {
                                        }
                                        cVar6 = cVar;
                                        while (i18 < 4) {
                                        }
                                        if (cVar5.f4071a.length > 0) {
                                        }
                                        qVar.f448c.a(new L(a9));
                                        if (i45 != 2) {
                                        }
                                        arrayList3 = arrayList;
                                        arrayList3.add(qVar);
                                        j12 = max2;
                                        i20 = 1;
                                    }
                                    i13 += i20;
                                    i12 = i19;
                                    arrayList = arrayList3;
                                    f4 = arrayList2;
                                    size = i16;
                                    cVar = cVar6;
                                    j10 = -9223372036854775807L;
                                }
                                int i50 = i12;
                                i7 = 4;
                                rVar.f467t = i44;
                                rVar.f468u = j12;
                                qVarArr = (q[]) arrayList.toArray(new q[0]);
                                rVar.f465r = qVarArr;
                                long[][] jArr = new long[qVarArr.length];
                                int[] iArr = new int[qVarArr.length];
                                long[] jArr2 = new long[qVarArr.length];
                                boolean[] zArr = new boolean[qVarArr.length];
                                for (i14 = 0; i14 < qVarArr.length; i14++) {
                                    jArr[i14] = new long[qVarArr[i14].f447b.f508b];
                                    jArr2[i14] = qVarArr[i14].f447b.f512f[0];
                                }
                                i15 = 0;
                                while (i15 < qVarArr.length) {
                                    int i51 = i50;
                                    long j14 = Long.MAX_VALUE;
                                    for (int i52 = 0; i52 < qVarArr.length; i52++) {
                                        if (!zArr[i52]) {
                                            long j15 = jArr2[i52];
                                            if (j15 <= j14) {
                                                i51 = i52;
                                                j14 = j15;
                                            }
                                        }
                                    }
                                    int i53 = iArr[i51];
                                    long[] jArr3 = jArr[i51];
                                    jArr3[i53] = j11;
                                    y yVar2 = qVarArr[i51].f447b;
                                    j11 += yVar2.f510d[i53];
                                    int i54 = i53 + 1;
                                    iArr[i51] = i54;
                                    if (i54 < jArr3.length) {
                                        jArr2[i51] = yVar2.f512f[i54];
                                    } else {
                                        zArr[i51] = true;
                                        i15++;
                                    }
                                    i50 = -1;
                                    rVar = this;
                                }
                                i10 = 1;
                                rVar.f466s = jArr;
                                rVar.f464q.f();
                                rVar.f464q.i(rVar);
                                arrayDeque.clear();
                                rVar.f457h = 2;
                            }
                            cVar4 = null;
                            b H142 = aVar2.H(1836476516);
                            H142.getClass();
                            f c102 = j.c(H142.f366c);
                            i12 = -1;
                            f4 = j.f(aVar2, c1988p, -9223372036854775807L, null, false, z8, new p(0));
                            size = f4.size();
                            j10 = -9223372036854775807L;
                            int i442 = -1;
                            long j122 = -9223372036854775807L;
                            i13 = 0;
                            while (true) {
                                j11 = 0;
                                if (i13 >= size) {
                                }
                                i13 += i20;
                                i12 = i19;
                                arrayList = arrayList3;
                                f4 = arrayList2;
                                size = i16;
                                cVar = cVar6;
                                j10 = -9223372036854775807L;
                            }
                            int i502 = i12;
                            i7 = 4;
                            rVar.f467t = i442;
                            rVar.f468u = j122;
                            qVarArr = (q[]) arrayList.toArray(new q[0]);
                            rVar.f465r = qVarArr;
                            long[][] jArr4 = new long[qVarArr.length];
                            int[] iArr2 = new int[qVarArr.length];
                            long[] jArr22 = new long[qVarArr.length];
                            boolean[] zArr2 = new boolean[qVarArr.length];
                            while (i14 < qVarArr.length) {
                            }
                            i15 = 0;
                            while (i15 < qVarArr.length) {
                            }
                            i10 = 1;
                            rVar.f466s = jArr4;
                            rVar.f464q.f();
                            rVar.f464q.i(rVar);
                            arrayDeque.clear();
                            rVar.f457h = 2;
                        }
                    }
                }
                arrayList = arrayList5;
                cVar4 = null;
                b H1422 = aVar2.H(1836476516);
                H1422.getClass();
                f c1022 = j.c(H1422.f366c);
                i12 = -1;
                f4 = j.f(aVar2, c1988p, -9223372036854775807L, null, false, z8, new p(0));
                size = f4.size();
                j10 = -9223372036854775807L;
                int i4422 = -1;
                long j1222 = -9223372036854775807L;
                i13 = 0;
                while (true) {
                    j11 = 0;
                    if (i13 >= size) {
                    }
                    i13 += i20;
                    i12 = i19;
                    arrayList = arrayList3;
                    f4 = arrayList2;
                    size = i16;
                    cVar = cVar6;
                    j10 = -9223372036854775807L;
                }
                int i5022 = i12;
                i7 = 4;
                rVar.f467t = i4422;
                rVar.f468u = j1222;
                qVarArr = (q[]) arrayList.toArray(new q[0]);
                rVar.f465r = qVarArr;
                long[][] jArr42 = new long[qVarArr.length];
                int[] iArr22 = new int[qVarArr.length];
                long[] jArr222 = new long[qVarArr.length];
                boolean[] zArr22 = new boolean[qVarArr.length];
                while (i14 < qVarArr.length) {
                }
                i15 = 0;
                while (i15 < qVarArr.length) {
                }
                i10 = 1;
                rVar.f466s = jArr42;
                rVar.f464q.f();
                rVar.f464q.i(rVar);
                arrayDeque.clear();
                rVar.f457h = 2;
            } else {
                i7 = i25;
                i10 = i26;
                if (!arrayDeque3.isEmpty()) {
                    ((a) arrayDeque3.peek()).f365e.add(aVar2);
                }
            }
            i25 = i7;
            i26 = i10;
        }
        if (rVar.f457h != 2) {
            rVar.f457h = 0;
            rVar.k = 0;
        }
    }

    @Override // s4.InterfaceC1982j
    public final void release() {
    }
}
