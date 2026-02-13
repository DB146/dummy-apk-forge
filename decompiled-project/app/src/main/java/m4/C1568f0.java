package m4;

import P4.C0477z;
import android.util.Pair;
import n5.AbstractC1705a;

/* renamed from: m4.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568f0 {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f20372a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public final K0 f20373b = new K0();

    /* renamed from: c, reason: collision with root package name */
    public final n4.f f20374c;

    /* renamed from: d, reason: collision with root package name */
    public final n5.z f20375d;

    /* renamed from: e, reason: collision with root package name */
    public long f20376e;

    /* renamed from: f, reason: collision with root package name */
    public int f20377f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public C1564d0 f20378h;

    /* renamed from: i, reason: collision with root package name */
    public C1564d0 f20379i;
    public C1564d0 j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public Object f20380l;

    /* renamed from: m, reason: collision with root package name */
    public long f20381m;

    public C1568f0(n4.f fVar, n5.z zVar) {
        this.f20374c = fVar;
        this.f20375d = zVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [P4.z, P4.B] */
    public static P4.B m(L0 l02, Object obj, long j, long j10, K0 k02, J0 j02) {
        l02.g(obj, j02);
        l02.n(j02.f19965c, k02);
        int b2 = l02.b(obj);
        Object obj2 = obj;
        while (true) {
            int i7 = j02.f19969u.f8645a;
            if (i7 == 0) {
                break;
            }
            if ((i7 == 1 && j02.g(0)) || !j02.h(j02.f19969u.f8648d)) {
                break;
            }
            long j11 = 0;
            if (j02.c(0L) != -1) {
                break;
            }
            if (j02.f19966d != 0) {
                int i10 = i7 - (j02.g(i7 + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    j11 += j02.f19969u.a(i11).f8636u;
                }
                if (j02.f19966d > j11) {
                    break;
                }
            }
            if (b2 > k02.f20017D) {
                break;
            }
            l02.f(b2, j02, true);
            obj2 = j02.f19964b;
            obj2.getClass();
            b2++;
        }
        l02.g(obj2, j02);
        int c10 = j02.c(j);
        return c10 == -1 ? new P4.B(obj2, j02.b(j), j10) : new C0477z(obj2, c10, j02.f(c10), j10, -1);
    }

    public final C1564d0 a() {
        C1564d0 c1564d0 = this.f20378h;
        if (c1564d0 == null) {
            return null;
        }
        if (c1564d0 == this.f20379i) {
            this.f20379i = c1564d0.f20346l;
        }
        c1564d0.f();
        int i7 = this.k - 1;
        this.k = i7;
        if (i7 == 0) {
            this.j = null;
            C1564d0 c1564d02 = this.f20378h;
            this.f20380l = c1564d02.f20339b;
            this.f20381m = c1564d02.f20343f.f20364a.f8160d;
        }
        this.f20378h = this.f20378h.f20346l;
        k();
        return this.f20378h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        C1564d0 c1564d0 = this.f20378h;
        AbstractC1705a.n(c1564d0);
        this.f20380l = c1564d0.f20339b;
        this.f20381m = c1564d0.f20343f.f20364a.f8160d;
        while (c1564d0 != null) {
            c1564d0.f();
            c1564d0 = c1564d0.f20346l;
        }
        this.f20378h = null;
        this.j = null;
        this.f20379i = null;
        this.k = 0;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (r0 != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1566e0 c(L0 l02, C1564d0 c1564d0, long j) {
        P4.B b2;
        C1566e0 c1566e0;
        Object obj;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        C1566e0 c1566e02 = c1564d0.f20343f;
        P4.B b10 = c1566e02.f20364a;
        int d10 = l02.d(l02.b(b10.f8157a), this.f20372a, this.f20373b, this.f20377f, this.g);
        if (d10 == -1) {
            return null;
        }
        J0 j02 = this.f20372a;
        int i7 = l02.f(d10, j02, true).f19965c;
        Object obj2 = j02.f19964b;
        obj2.getClass();
        long j15 = b10.f8160d;
        long j16 = 0;
        if (l02.m(i7, this.f20373b, 0L).f20016C == d10) {
            b2 = b10;
            c1566e0 = c1566e02;
            Pair j17 = l02.j(this.f20373b, this.f20372a, i7, -9223372036854775807L, Math.max(0L, j));
            if (j17 == null) {
                return null;
            }
            Object obj3 = j17.first;
            j16 = ((Long) j17.second).longValue();
            C1564d0 c1564d02 = c1564d0.f20346l;
            if (c1564d02 == null || !c1564d02.f20339b.equals(obj3)) {
                j14 = this.f20376e;
                this.f20376e = 1 + j14;
            } else {
                j14 = c1564d02.f20343f.f20364a.f8160d;
            }
            j10 = j14;
            j11 = -9223372036854775807L;
            obj = obj3;
        } else {
            b2 = b10;
            c1566e0 = c1566e02;
            obj = obj2;
            j10 = j15;
            j11 = 0;
        }
        P4.B m10 = m(l02, obj, j16, j10, this.f20373b, this.f20372a);
        if (j11 != -9223372036854775807L) {
            j12 = c1566e0.f20366c;
            if (j12 != -9223372036854775807L) {
                int i10 = l02.g(b2.f8157a, j02).f19969u.f8645a;
                int i11 = j02.f19969u.f8648d;
                boolean z8 = i10 > 0 && j02.h(i11) && (i10 > 1 || j02.d(i11) != Long.MIN_VALUE);
                if (m10.a() && z8) {
                    long j18 = j16;
                    j13 = j12;
                    j12 = j18;
                    return e(l02, m10, j13, j12);
                }
            }
        }
        j12 = j16;
        j13 = j11;
        return e(l02, m10, j13, j12);
    }

    public final C1566e0 d(L0 l02, C1564d0 c1564d0, long j) {
        C1566e0 c1566e0 = c1564d0.f20343f;
        long j10 = (c1564d0.f20349o + c1566e0.f20368e) - j;
        if (c1566e0.g) {
            return c(l02, c1564d0, j10);
        }
        P4.B b2 = c1566e0.f20364a;
        Object obj = b2.f8157a;
        J0 j02 = this.f20372a;
        l02.g(obj, j02);
        boolean a9 = b2.a();
        Object obj2 = b2.f8157a;
        if (!a9) {
            int i7 = b2.f8161e;
            if (i7 != -1 && j02.g(i7)) {
                return c(l02, c1564d0, j10);
            }
            int f4 = j02.f(i7);
            boolean z8 = j02.h(i7) && j02.e(i7, f4) == 3;
            if (f4 != j02.f19969u.a(i7).f8631b && !z8) {
                return f(l02, b2.f8157a, b2.f8161e, f4, c1566e0.f20368e, b2.f8160d);
            }
            l02.g(obj2, j02);
            long d10 = j02.d(i7);
            return g(l02, b2.f8157a, d10 == Long.MIN_VALUE ? j02.f19966d : j02.f19969u.a(i7).f8636u + d10, c1566e0.f20368e, b2.f8160d);
        }
        Q4.b bVar = j02.f19969u;
        int i10 = b2.f8158b;
        int i11 = bVar.a(i10).f8631b;
        if (i11 != -1) {
            int a10 = j02.f19969u.a(i10).a(b2.f8159c);
            if (a10 < i11) {
                return f(l02, b2.f8157a, i10, a10, c1566e0.f20366c, b2.f8160d);
            }
            long j11 = c1566e0.f20366c;
            if (j11 == -9223372036854775807L) {
                Pair j12 = l02.j(this.f20373b, j02, j02.f19965c, -9223372036854775807L, Math.max(0L, j10));
                if (j12 != null) {
                    j11 = ((Long) j12.second).longValue();
                }
            }
            l02.g(obj2, j02);
            int i12 = b2.f8158b;
            long d11 = j02.d(i12);
            return g(l02, b2.f8157a, Math.max(d11 == Long.MIN_VALUE ? j02.f19966d : j02.f19969u.a(i12).f8636u + d11, j11), c1566e0.f20366c, b2.f8160d);
        }
        return null;
    }

    public final C1566e0 e(L0 l02, P4.B b2, long j, long j10) {
        l02.g(b2.f8157a, this.f20372a);
        if (!b2.a()) {
            return g(l02, b2.f8157a, j10, j, b2.f8160d);
        }
        return f(l02, b2.f8157a, b2.f8158b, b2.f8159c, j, b2.f8160d);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [P4.z, P4.B] */
    public final C1566e0 f(L0 l02, Object obj, int i7, int i10, long j, long j10) {
        ?? c0477z = new C0477z(obj, i7, i10, j10, -1);
        J0 j02 = this.f20372a;
        long a9 = l02.g(obj, j02).a(i7, i10);
        long j11 = i10 == j02.f(i7) ? j02.f19969u.f8646b : 0L;
        return new C1566e0(c0477z, (a9 == -9223372036854775807L || j11 < a9) ? j11 : Math.max(0L, a9 - 1), j, -9223372036854775807L, a9, j02.h(i7), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1566e0 g(L0 l02, Object obj, long j, long j10, long j11) {
        boolean z8;
        boolean z10;
        long j12;
        long j13;
        long j14;
        long j15 = j;
        J0 j02 = this.f20372a;
        l02.g(obj, j02);
        int b2 = j02.b(j15);
        boolean z11 = b2 != -1 && j02.g(b2);
        if (b2 == -1) {
            Q4.b bVar = j02.f19969u;
            if (bVar.f8645a > 0 && j02.h(bVar.f8648d)) {
                z10 = true;
            }
            z10 = false;
        } else {
            if (j02.h(b2) && j02.d(b2) == j02.f19966d) {
                Q4.a a9 = j02.f19969u.a(b2);
                int i7 = a9.f8631b;
                if (i7 != -1) {
                    for (int i10 = 0; i10 < i7; i10++) {
                        int i11 = a9.f8634e[i10];
                        if (i11 != 0 && i11 != 1) {
                        }
                    }
                    z8 = false;
                    if (!z8) {
                        z10 = true;
                        b2 = -1;
                    }
                }
                z8 = true;
                if (!z8) {
                }
            }
            z10 = false;
        }
        P4.B b10 = new P4.B(obj, b2, j11);
        boolean z12 = !b10.a() && b2 == -1;
        boolean j16 = j(l02, b10);
        boolean i12 = i(l02, b10, z12);
        boolean z13 = (b2 == -1 || !j02.h(b2) || z11) ? false : true;
        if (b2 == -1 || z11) {
            if (!z10) {
                j12 = -9223372036854775807L;
                j14 = (j12 != -9223372036854775807L || j12 == Long.MIN_VALUE) ? j02.f19966d : j12;
                if (j14 != -9223372036854775807L && j15 >= j14) {
                    j15 = Math.max(0L, j14 - ((i12 && z10) ? 0 : 1));
                }
                return new C1566e0(b10, j15, j10, j12, j14, z13, z12, j16, i12);
            }
            j13 = j02.f19966d;
        } else {
            j13 = j02.d(b2);
        }
        j12 = j13;
        if (j12 != -9223372036854775807L) {
        }
        if (j14 != -9223372036854775807L) {
            j15 = Math.max(0L, j14 - ((i12 && z10) ? 0 : 1));
        }
        return new C1566e0(b10, j15, j10, j12, j14, z13, z12, j16, i12);
    }

    public final C1566e0 h(L0 l02, C1566e0 c1566e0) {
        P4.B b2 = c1566e0.f20364a;
        boolean a9 = b2.a();
        int i7 = b2.f8161e;
        boolean z8 = !a9 && i7 == -1;
        boolean j = j(l02, b2);
        boolean i10 = i(l02, b2, z8);
        Object obj = b2.f8157a;
        J0 j02 = this.f20372a;
        l02.g(obj, j02);
        long d10 = (b2.a() || i7 == -1) ? -9223372036854775807L : j02.d(i7);
        boolean a10 = b2.a();
        int i11 = b2.f8158b;
        return new C1566e0(b2, c1566e0.f20365b, c1566e0.f20366c, d10, a10 ? j02.a(i11, b2.f8159c) : (d10 == -9223372036854775807L || d10 == Long.MIN_VALUE) ? j02.f19966d : d10, b2.a() ? j02.h(i11) : i7 != -1 && j02.h(i7), z8, j, i10);
    }

    public final boolean i(L0 l02, P4.B b2, boolean z8) {
        int b10 = l02.b(b2.f8157a);
        if (l02.m(l02.f(b10, this.f20372a, false).f19965c, this.f20373b, 0L).f20027w) {
            return false;
        }
        return l02.d(b10, this.f20372a, this.f20373b, this.f20377f, this.g) == -1 && z8;
    }

    public final boolean j(L0 l02, P4.B b2) {
        if (!(!b2.a() && b2.f8161e == -1)) {
            return false;
        }
        Object obj = b2.f8157a;
        return l02.m(l02.g(obj, this.f20372a).f19965c, this.f20373b, 0L).f20017D == l02.b(obj);
    }

    public final void k() {
        N6.F f4 = N6.H.f7232b;
        N6.B b2 = new N6.B();
        for (C1564d0 c1564d0 = this.f20378h; c1564d0 != null; c1564d0 = c1564d0.f20346l) {
            b2.a(c1564d0.f20343f.f20364a);
        }
        C1564d0 c1564d02 = this.f20379i;
        this.f20375d.c(new P4.G(this, b2, c1564d02 == null ? null : c1564d02.f20343f.f20364a, 8));
    }

    public final boolean l(C1564d0 c1564d0) {
        boolean z8 = false;
        AbstractC1705a.m(c1564d0 != null);
        if (c1564d0.equals(this.j)) {
            return false;
        }
        this.j = c1564d0;
        while (true) {
            c1564d0 = c1564d0.f20346l;
            if (c1564d0 == null) {
                break;
            }
            if (c1564d0 == this.f20379i) {
                this.f20379i = this.f20378h;
                z8 = true;
            }
            c1564d0.f();
            this.k--;
        }
        C1564d0 c1564d02 = this.j;
        if (c1564d02.f20346l != null) {
            c1564d02.b();
            c1564d02.f20346l = null;
            c1564d02.c();
        }
        k();
        return z8;
    }

    public final P4.B n(L0 l02, Object obj, long j) {
        long j10;
        int b2;
        Object obj2 = obj;
        J0 j02 = this.f20372a;
        int i7 = l02.g(obj2, j02).f19965c;
        Object obj3 = this.f20380l;
        if (obj3 == null || (b2 = l02.b(obj3)) == -1 || l02.f(b2, j02, false).f19965c != i7) {
            C1564d0 c1564d0 = this.f20378h;
            while (true) {
                if (c1564d0 == null) {
                    C1564d0 c1564d02 = this.f20378h;
                    while (true) {
                        if (c1564d02 != null) {
                            int b10 = l02.b(c1564d02.f20339b);
                            if (b10 != -1 && l02.f(b10, j02, false).f19965c == i7) {
                                j10 = c1564d02.f20343f.f20364a.f8160d;
                                break;
                            }
                            c1564d02 = c1564d02.f20346l;
                        } else {
                            j10 = this.f20376e;
                            this.f20376e = 1 + j10;
                            if (this.f20378h == null) {
                                this.f20380l = obj2;
                                this.f20381m = j10;
                            }
                        }
                    }
                } else {
                    if (c1564d0.f20339b.equals(obj2)) {
                        j10 = c1564d0.f20343f.f20364a.f8160d;
                        break;
                    }
                    c1564d0 = c1564d0.f20346l;
                }
            }
        } else {
            j10 = this.f20381m;
        }
        long j11 = j10;
        l02.g(obj2, j02);
        int i10 = j02.f19965c;
        K0 k02 = this.f20373b;
        l02.n(i10, k02);
        boolean z8 = false;
        for (int b11 = l02.b(obj); b11 >= k02.f20016C; b11--) {
            l02.f(b11, j02, true);
            boolean z10 = j02.f19969u.f8645a > 0;
            z8 |= z10;
            if (j02.c(j02.f19966d) != -1) {
                obj2 = j02.f19964b;
                obj2.getClass();
            }
            if (z8 && (!z10 || j02.f19966d != 0)) {
                break;
            }
        }
        return m(l02, obj2, j, j11, this.f20373b, this.f20372a);
    }

    public final boolean o(L0 l02) {
        C1564d0 c1564d0;
        C1564d0 c1564d02 = this.f20378h;
        if (c1564d02 == null) {
            return true;
        }
        int b2 = l02.b(c1564d02.f20339b);
        while (true) {
            b2 = l02.d(b2, this.f20372a, this.f20373b, this.f20377f, this.g);
            while (true) {
                c1564d0 = c1564d02.f20346l;
                if (c1564d0 == null || c1564d02.f20343f.g) {
                    break;
                }
                c1564d02 = c1564d0;
            }
            if (b2 == -1 || c1564d0 == null || l02.b(c1564d0.f20339b) != b2) {
                break;
            }
            c1564d02 = c1564d0;
        }
        boolean l10 = l(c1564d02);
        c1564d02.f20343f = h(l02, c1564d02.f20343f);
        return !l10;
    }

    public final boolean p(L0 l02, long j, long j10) {
        C1566e0 c1566e0;
        C1564d0 c1564d0 = this.f20378h;
        C1564d0 c1564d02 = null;
        while (c1564d0 != null) {
            C1566e0 c1566e02 = c1564d0.f20343f;
            if (c1564d02 == null) {
                c1566e0 = h(l02, c1566e02);
            } else {
                C1566e0 d10 = d(l02, c1564d02, j);
                if (d10 == null) {
                    return !l(c1564d02);
                }
                if (c1566e02.f20365b != d10.f20365b || !c1566e02.f20364a.equals(d10.f20364a)) {
                    return !l(c1564d02);
                }
                c1566e0 = d10;
            }
            c1564d0.f20343f = c1566e0.a(c1566e02.f20366c);
            long j11 = c1566e02.f20368e;
            if (j11 != -9223372036854775807L) {
                long j12 = c1566e0.f20368e;
                if (j11 != j12) {
                    c1564d0.h();
                    return (l(c1564d0) || (c1564d0 == this.f20379i && !c1564d0.f20343f.f20369f && ((j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j10 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1564d0.f20349o + j12) ? 1 : (j10 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1564d0.f20349o + j12) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c1564d02 = c1564d0;
            c1564d0 = c1564d0.f20346l;
        }
        return true;
    }
}
