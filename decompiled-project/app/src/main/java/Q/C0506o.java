package Q;

import A0.C0032v;
import B0.C0165a;
import R.C0524a;
import R.C0525b;
import R.C0526c;
import R.C0528e;
import a0.AbstractC0688o;
import android.os.Trace;
import b0.AbstractC0825b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u.C2041D;
import u.C2042E;
import u.C2046I;
import u.C2047J;
import u.C2068v;
import u.C2070x;
import v.AbstractC2121a;

/* renamed from: Q.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506o {

    /* renamed from: A, reason: collision with root package name */
    public int f8435A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8436B;

    /* renamed from: C, reason: collision with root package name */
    public final C0504n f8437C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f8438D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8439E;

    /* renamed from: F, reason: collision with root package name */
    public y0 f8440F;

    /* renamed from: G, reason: collision with root package name */
    public z0 f8441G;

    /* renamed from: H, reason: collision with root package name */
    public C0 f8442H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8443I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC0493h0 f8444J;

    /* renamed from: K, reason: collision with root package name */
    public C0524a f8445K;
    public final C0525b L;

    /* renamed from: M, reason: collision with root package name */
    public C0478a f8446M;

    /* renamed from: N, reason: collision with root package name */
    public C0526c f8447N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f8448O;

    /* renamed from: P, reason: collision with root package name */
    public int f8449P;

    /* renamed from: Q, reason: collision with root package name */
    public C0515t f8450Q;

    /* renamed from: a, reason: collision with root package name */
    public final A0.G0 f8451a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8452b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f8453c;

    /* renamed from: d, reason: collision with root package name */
    public final u.L f8454d;

    /* renamed from: e, reason: collision with root package name */
    public final C0524a f8455e;

    /* renamed from: f, reason: collision with root package name */
    public final C0524a f8456f;
    public final C0517u g;

    /* renamed from: i, reason: collision with root package name */
    public C0491g0 f8458i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8459l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f8461n;

    /* renamed from: o, reason: collision with root package name */
    public C2068v f8462o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8463p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8464q;

    /* renamed from: u, reason: collision with root package name */
    public C2070x f8468u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8469v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8471x;

    /* renamed from: z, reason: collision with root package name */
    public int f8473z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8457h = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final C0032v f8460m = new C0032v();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f8465r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final C0032v f8466s = new C0032v();

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0493h0 f8467t = Y.j.f11053d;

    /* renamed from: w, reason: collision with root package name */
    public final C0032v f8470w = new C0032v();

    /* renamed from: y, reason: collision with root package name */
    public int f8472y = -1;

    public C0506o(A0.G0 g02, r rVar, z0 z0Var, u.L l10, C0524a c0524a, C0524a c0524a2, C0517u c0517u) {
        this.f8451a = g02;
        this.f8452b = rVar;
        this.f8453c = z0Var;
        this.f8454d = l10;
        this.f8455e = c0524a;
        this.f8456f = c0524a2;
        this.g = c0517u;
        this.f8436B = rVar.e() || rVar.c();
        this.f8437C = new C0504n(this, 0);
        this.f8438D = new ArrayList();
        y0 t5 = z0Var.t();
        t5.c();
        this.f8440F = t5;
        z0 z0Var2 = new z0();
        if (rVar.e()) {
            z0Var2.o();
        }
        if (rVar.c()) {
            z0Var2.f8596y = new C2070x();
        }
        this.f8441G = z0Var2;
        C0 y10 = z0Var2.y();
        y10.e(true);
        this.f8442H = y10;
        this.L = new C0525b(this, c0524a);
        y0 t10 = this.f8441G.t();
        try {
            C0478a a9 = t10.a(0);
            t10.c();
            this.f8446M = a9;
            this.f8447N = new C0526c();
        } catch (Throwable th) {
            t10.c();
            throw th;
        }
    }

    public static final int J(C0506o c0506o, int i7, boolean z8, int i10) {
        y0 y0Var = c0506o.f8440F;
        int i11 = i7 * 5;
        int[] iArr = y0Var.f8574b;
        int i12 = iArr[i11 + 1];
        if (!((134217728 & i12) != 0)) {
            if ((i12 & 67108864) == 0) {
                if (y0Var.i(i7)) {
                    return 1;
                }
                return y0Var.l(i7);
            }
            int i13 = iArr[i11 + 3] + i7;
            int i14 = 0;
            for (int i15 = i7 + 1; i15 < i13; i15 += y0Var.f8574b[(i15 * 5) + 3]) {
                boolean i16 = y0Var.i(i15);
                if (i16) {
                    c0506o.L.d();
                    C0525b c0525b = c0506o.L;
                    Object k = y0Var.k(i15);
                    c0525b.d();
                    c0525b.f8752h.add(k);
                }
                i14 += J(c0506o, i15, i16 || z8, i16 ? 0 : i10 + i14);
                if (i16) {
                    c0506o.L.d();
                    c0506o.L.b();
                }
            }
            if (y0Var.i(i7)) {
                return 1;
            }
            return i14;
        }
        int i17 = iArr[i11];
        Object m10 = y0Var.m(iArr, i7);
        if (i17 != 206 || !kotlin.jvm.internal.l.a(m10, AbstractC0508p.f8485e)) {
            if (y0Var.i(i7)) {
                return 1;
            }
            return y0Var.l(i7);
        }
        Object g = y0Var.g(i7, 0);
        C0500l c0500l = g instanceof C0500l ? (C0500l) g : null;
        if (c0500l != null) {
            for (C0506o c0506o2 : c0500l.f8411a.f8422e) {
                z0 z0Var = c0506o2.f8453c;
                if (z0Var.f8587b > 0 && (z0Var.f8586a[1] & 67108864) != 0) {
                    C0517u c0517u = c0506o2.g;
                    synchronized (c0517u.f8531d) {
                        c0517u.o();
                        C2046I c2046i = c0517u.f8521B;
                        c0517u.f8521B = Q5.e.q();
                        try {
                            c0517u.f8526G.Z(c2046i);
                        } catch (Exception e2) {
                            c0517u.f8521B = c2046i;
                            throw e2;
                        }
                    }
                    C0524a c0524a = new C0524a();
                    c0506o2.f8445K = c0524a;
                    y0 t5 = c0506o2.f8453c.t();
                    try {
                        c0506o2.f8440F = t5;
                        C0525b c0525b2 = c0506o2.L;
                        C0524a c0524a2 = c0525b2.f8747b;
                        try {
                            c0525b2.f8747b = c0524a;
                            c0506o2.I(0);
                            C0525b c0525b3 = c0506o2.L;
                            c0525b3.c();
                            if (c0525b3.f8748c) {
                                C0524a c0524a3 = c0525b3.f8747b;
                                c0524a3.getClass();
                                c0524a3.f8745f.N(R.B.f8735d);
                                if (c0525b3.f8748c) {
                                    c0525b3.e(false);
                                    c0525b3.e(false);
                                    C0524a c0524a4 = c0525b3.f8747b;
                                    c0524a4.getClass();
                                    c0524a4.f8745f.N(R.m.f8765d);
                                    c0525b3.f8748c = false;
                                }
                            }
                            c0525b2.f8747b = c0524a2;
                        } catch (Throwable th) {
                            c0525b2.f8747b = c0524a2;
                            throw th;
                        }
                    } finally {
                        t5.c();
                    }
                }
                c0506o.f8452b.m(c0506o2.g);
            }
        }
        return y0Var.l(i7);
    }

    public static final void b(C0506o c0506o, InterfaceC0493h0 interfaceC0493h0, Object obj) {
        c0506o.O(null, 126665345, 0, null);
        c0506o.z();
        c0506o.e0(obj);
        int i7 = c0506o.f8449P;
        try {
            c0506o.f8449P = 126665345;
            if (c0506o.f8448O) {
                C0.x(c0506o.f8442H);
            }
            boolean z8 = (c0506o.f8448O || kotlin.jvm.internal.l.a(c0506o.f8440F.e(), interfaceC0493h0)) ? false : true;
            if (z8) {
                c0506o.F(interfaceC0493h0);
            }
            c0506o.O(AbstractC0508p.f8483c, 202, 0, interfaceC0493h0);
            c0506o.f8444J = null;
            boolean z10 = c0506o.f8469v;
            c0506o.f8469v = z8;
            Y.f.c(c0506o, new Y.e(316014703, new C0165a(obj, 1), true));
            c0506o.f8469v = z10;
            c0506o.p(false);
            c0506o.f8444J = null;
            c0506o.f8449P = i7;
            c0506o.p(false);
        } catch (Throwable th) {
            c0506o.p(false);
            c0506o.f8444J = null;
            c0506o.f8449P = i7;
            c0506o.p(false);
            throw th;
        }
    }

    public final int A(int i7) {
        int n6 = this.f8440F.n(i7) + 1;
        int i10 = 0;
        while (n6 < i7) {
            if (!this.f8440F.h(n6)) {
                i10++;
            }
            n6 += B0.a(this.f8440F.f8574b, n6);
        }
        return i10;
    }

    public final boolean B(C2046I c2046i) {
        R.I i7 = this.f8455e.f8745f;
        if (!i7.L()) {
            AbstractC0508p.c("Expected applyChanges() to have been called");
        }
        if (c2046i.f24607e <= 0 && this.f8465r.isEmpty()) {
            return false;
        }
        n(c2046i, null);
        return i7.M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(C0517u c0517u, C0517u c0517u2, Integer num, List list, Rb.a aVar) {
        Object invoke;
        boolean z8 = this.f8439E;
        int i7 = this.j;
        try {
            this.f8439E = true;
            this.j = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Db.j jVar = (Db.j) list.get(i10);
                C0505n0 c0505n0 = (C0505n0) jVar.f3354a;
                Object obj = jVar.f3355b;
                if (obj != null) {
                    Y(c0505n0, obj);
                } else {
                    Y(c0505n0, null);
                }
            }
            if (c0517u != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (c0517u2 == null || c0517u2.equals(c0517u) || intValue < 0) {
                    invoke = aVar.invoke();
                } else {
                    c0517u.f8523D = c0517u2;
                    c0517u.f8524E = intValue;
                    try {
                        invoke = aVar.invoke();
                        c0517u.f8523D = null;
                        c0517u.f8524E = 0;
                    } catch (Throwable th) {
                        c0517u.f8523D = null;
                        c0517u.f8524E = 0;
                        throw th;
                    }
                }
            }
            invoke = aVar.invoke();
            this.f8439E = z8;
            this.j = i7;
            return invoke;
        } catch (Throwable th2) {
            this.f8439E = z8;
            this.j = i7;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f8325b < r5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() {
        L l10;
        boolean z8;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        Object[] objArr;
        Object[] objArr2;
        boolean z12;
        C2041D c2041d;
        C0505n0 c0505n0;
        long[] jArr;
        long[] jArr2;
        int f4;
        int i14;
        boolean z13;
        Rb.e eVar;
        Db.q qVar;
        int rotateLeft;
        int i15;
        Object b2;
        boolean z14 = this.f8439E;
        this.f8439E = true;
        y0 y0Var = this.f8440F;
        int i16 = y0Var.f8580i;
        int i17 = (i16 * 5) + 3;
        int i18 = y0Var.f8574b[i17] + i16;
        int i19 = this.j;
        int i20 = this.f8449P;
        int i21 = this.k;
        int i22 = this.f8459l;
        ArrayList arrayList = this.f8465r;
        int f10 = AbstractC0508p.f(y0Var.g, arrayList);
        if (f10 < 0) {
            f10 = -(f10 + 1);
        }
        if (f10 < arrayList.size()) {
            l10 = (L) arrayList.get(f10);
        }
        l10 = null;
        int i23 = i16;
        boolean z15 = false;
        while (l10 != null) {
            int i24 = l10.f8325b;
            int f11 = AbstractC0508p.f(i24, arrayList);
            if (f11 >= 0) {
            }
            Object obj = l10.f8326c;
            C0505n0 c0505n02 = l10.f8324a;
            if (obj == null) {
                c0505n02.getClass();
            } else {
                C2046I c2046i = c0505n02.g;
                if (c2046i != null) {
                    z8 = z14;
                    if (obj instanceof C) {
                        z11 = C0505n0.a((C) obj, c2046i);
                        i7 = i18;
                        i10 = i17;
                        i11 = i19;
                        i12 = i21;
                        i13 = i22;
                        z10 = z15;
                    } else {
                        if (obj instanceof C2047J) {
                            C2047J c2047j = (C2047J) obj;
                            if (c2047j.h()) {
                                Object[] objArr3 = c2047j.f24610b;
                                long[] jArr3 = c2047j.f24609a;
                                i13 = i22;
                                int length = jArr3.length - 2;
                                i7 = i18;
                                i10 = i17;
                                if (length >= 0) {
                                    i12 = i21;
                                    int i25 = 0;
                                    while (true) {
                                        long j = jArr3[i25];
                                        long[] jArr4 = jArr3;
                                        z10 = z15;
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i26 = 8 - ((~(i25 - length)) >>> 31);
                                            int i27 = 0;
                                            while (i27 < i26) {
                                                if ((j & 255) < 128) {
                                                    i11 = i19;
                                                    Object obj2 = objArr3[(i25 << 3) + i27];
                                                    objArr2 = objArr3;
                                                    if (!(obj2 instanceof C)) {
                                                        break;
                                                    } else if (C0505n0.a((C) obj2, c2046i)) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    i11 = i19;
                                                }
                                                j >>= 8;
                                                i27++;
                                                objArr3 = objArr2;
                                                i19 = i11;
                                            }
                                            objArr = objArr3;
                                            i11 = i19;
                                            if (i26 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            i11 = i19;
                                        }
                                        if (i25 == length) {
                                            break;
                                        }
                                        i25++;
                                        z15 = z10;
                                        jArr3 = jArr4;
                                        objArr3 = objArr;
                                        i19 = i11;
                                    }
                                    z11 = false;
                                } else {
                                    i11 = i19;
                                    i12 = i21;
                                }
                            } else {
                                i7 = i18;
                                i10 = i17;
                                i11 = i19;
                                i12 = i21;
                                i13 = i22;
                            }
                            z10 = z15;
                            z11 = false;
                        }
                        i7 = i18;
                        i10 = i17;
                        i11 = i19;
                        i12 = i21;
                        i13 = i22;
                        z10 = z15;
                        z11 = true;
                    }
                    if (z11) {
                        ArrayList arrayList2 = this.f8438D;
                        arrayList2.add(c0505n02);
                        C0517u c0517u = c0505n02.f8430b;
                        if (c0517u != null && (c2041d = c0505n02.f8434f) != null) {
                            c0505n02.e(true);
                            try {
                                Object[] objArr4 = c2041d.f24579b;
                                int[] iArr = c2041d.f24580c;
                                long[] jArr5 = c2041d.f24578a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i28 = 0;
                                    while (true) {
                                        try {
                                            long j10 = jArr5[i28];
                                            c0505n0 = c0505n02;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                                int i30 = 0;
                                                while (i30 < i29) {
                                                    if ((j10 & 255) < 128) {
                                                        int i31 = (i28 << 3) + i30;
                                                        jArr2 = jArr5;
                                                        try {
                                                            Object obj3 = objArr4[i31];
                                                            int i32 = iArr[i31];
                                                            c0517u.y(obj3);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c0505n02 = c0505n0;
                                                            c0505n02.e(false);
                                                            throw th;
                                                        }
                                                    } else {
                                                        jArr2 = jArr5;
                                                    }
                                                    j10 >>= 8;
                                                    i30++;
                                                    jArr5 = jArr2;
                                                }
                                                jArr = jArr5;
                                                if (i29 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr5;
                                            }
                                            if (i28 == length2) {
                                                break;
                                            }
                                            i28++;
                                            c0505n02 = c0505n0;
                                            jArr5 = jArr;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                } else {
                                    c0505n0 = c0505n02;
                                }
                                c0505n0.e(false);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        z12 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                        z15 = z10;
                    } else {
                        this.f8440F.o(i24);
                        int i33 = this.f8440F.g;
                        G(i23, i33, i16);
                        int n6 = this.f8440F.n(i33);
                        while (n6 != i16 && !this.f8440F.i(n6)) {
                            n6 = this.f8440F.n(n6);
                        }
                        int i34 = this.f8440F.i(n6) ? 0 : i11;
                        if (n6 != i33) {
                            int f02 = (f0(n6) - this.f8440F.l(i33)) + i34;
                            while (i34 < f02 && n6 != i24) {
                                n6++;
                                while (n6 < i24) {
                                    y0 y0Var2 = this.f8440F;
                                    int i35 = y0Var2.f8574b[(n6 * 5) + 3] + n6;
                                    if (i24 >= i35) {
                                        i34 += y0Var2.i(n6) ? 1 : f0(n6);
                                        n6 = i35;
                                    }
                                }
                                break;
                            }
                        }
                        this.j = i34;
                        this.f8459l = A(i33);
                        int n8 = this.f8440F.n(i33);
                        int i36 = 3;
                        int i37 = 0;
                        int i38 = 0;
                        while (n8 >= 0) {
                            if (n8 == i16) {
                                rotateLeft = Integer.rotateLeft(i20, i38);
                            } else {
                                y0 y0Var3 = this.f8440F;
                                boolean h10 = y0Var3.h(n8);
                                int[] iArr2 = y0Var3.f8574b;
                                if (h10) {
                                    Object m10 = y0Var3.m(iArr2, n8);
                                    i15 = m10 != null ? m10 instanceof Enum ? ((Enum) m10).ordinal() : m10.hashCode() : 0;
                                } else {
                                    int i39 = iArr2[n8 * 5];
                                    if (i39 == 207 && (b2 = y0Var3.b(iArr2, n8)) != null && !b2.equals(C0498k.f8409a)) {
                                        i39 = b2.hashCode();
                                    }
                                    i15 = i39;
                                }
                                if (i15 == 126665345) {
                                    rotateLeft = Integer.rotateLeft(i15, i38);
                                } else {
                                    i37 = (i37 ^ Integer.rotateLeft(i15, i36)) ^ Integer.rotateLeft(this.f8440F.h(n8) ? 0 : A(n8), i38);
                                    i36 = (i36 + 6) % 32;
                                    i38 = (i38 + 6) % 32;
                                    n8 = this.f8440F.n(n8);
                                }
                            }
                            i37 ^= rotateLeft;
                            break;
                        }
                        this.f8449P = i37;
                        this.f8444J = null;
                        if (!this.f8471x) {
                            if ((c0505n02.f8429a & 128) != 0) {
                                z13 = true;
                                if (z13) {
                                    this.f8471x = true;
                                }
                                eVar = c0505n02.f8432d;
                                if (eVar == null) {
                                    eVar.invoke(this, 1);
                                    qVar = Db.q.f3365a;
                                } else {
                                    qVar = null;
                                }
                                if (qVar != null) {
                                    throw new IllegalStateException("Invalid restart scope");
                                }
                                if (z13) {
                                    this.f8471x = false;
                                }
                                this.f8444J = null;
                                y0 y0Var4 = this.f8440F;
                                int i40 = y0Var4.f8574b[i10] + i16;
                                int i41 = y0Var4.g;
                                if (!(i41 >= i16 && i41 <= i40)) {
                                    AbstractC0508p.c("Index " + i16 + " is not a parent of " + i41);
                                }
                                y0Var4.f8580i = i16;
                                y0Var4.f8579h = i40;
                                y0Var4.f8581l = 0;
                                y0Var4.f8582m = 0;
                                i23 = i33;
                                z12 = true;
                                z15 = true;
                            }
                        }
                        z13 = false;
                        if (z13) {
                        }
                        eVar = c0505n02.f8432d;
                        if (eVar == null) {
                        }
                        if (qVar != null) {
                        }
                    }
                    f4 = AbstractC0508p.f(this.f8440F.g, arrayList);
                    if (f4 < 0) {
                        f4 = -(f4 + 1);
                    }
                    if (f4 >= arrayList.size()) {
                        L l11 = (L) arrayList.get(f4);
                        i14 = i7;
                        if (l11.f8325b < i14) {
                            l10 = l11;
                            i18 = i14;
                            z14 = z8;
                            i22 = i13;
                            i21 = i12;
                            i17 = i10;
                            i19 = i11;
                        }
                    } else {
                        i14 = i7;
                    }
                    l10 = null;
                    i18 = i14;
                    z14 = z8;
                    i22 = i13;
                    i21 = i12;
                    i17 = i10;
                    i19 = i11;
                }
            }
            z8 = z14;
            i7 = i18;
            i10 = i17;
            i11 = i19;
            i12 = i21;
            i13 = i22;
            z10 = z15;
            z11 = true;
            if (z11) {
            }
            f4 = AbstractC0508p.f(this.f8440F.g, arrayList);
            if (f4 < 0) {
            }
            if (f4 >= arrayList.size()) {
            }
            l10 = null;
            i18 = i14;
            z14 = z8;
            i22 = i13;
            i21 = i12;
            i17 = i10;
            i19 = i11;
        }
        boolean z16 = z14;
        int i42 = i19;
        int i43 = i21;
        int i44 = i22;
        if (z15) {
            G(i23, i16, i16);
            this.f8440F.q();
            int f03 = f0(i16);
            this.j = i42 + f03;
            this.k = i43 + f03;
            this.f8459l = i44;
        } else {
            M();
        }
        this.f8449P = i20;
        this.f8439E = z16;
    }

    public final void E() {
        I(this.f8440F.g);
        C0525b c0525b = this.L;
        c0525b.e(false);
        C0506o c0506o = c0525b.f8746a;
        y0 y0Var = c0506o.f8440F;
        if (y0Var.f8575c > 0) {
            int i7 = y0Var.f8580i;
            C0032v c0032v = c0525b.f8749d;
            if (c0032v.a(-2) != i7) {
                if (!c0525b.f8748c && c0525b.f8750e) {
                    c0525b.e(false);
                    C0524a c0524a = c0525b.f8747b;
                    c0524a.getClass();
                    c0524a.f8745f.N(R.q.f8769d);
                    c0525b.f8748c = true;
                }
                if (i7 > 0) {
                    C0478a a9 = y0Var.a(i7);
                    c0032v.c(i7);
                    c0525b.e(false);
                    C0524a c0524a2 = c0525b.f8747b;
                    c0524a2.getClass();
                    R.p pVar = R.p.f8768d;
                    R.I i10 = c0524a2.f8745f;
                    i10.N(pVar);
                    tc.b.I(i10, 0, a9);
                    c0525b.f8748c = true;
                }
            }
        }
        C0524a c0524a3 = c0525b.f8747b;
        c0524a3.getClass();
        c0524a3.f8745f.N(R.x.f8779d);
        int i11 = c0525b.f8751f;
        y0 y0Var2 = c0506o.f8440F;
        c0525b.f8751f = y0Var2.f8574b[(y0Var2.g * 5) + 3] + i11;
    }

    public final void F(InterfaceC0493h0 interfaceC0493h0) {
        C2070x c2070x = this.f8468u;
        if (c2070x == null) {
            c2070x = new C2070x();
            this.f8468u = c2070x;
        }
        c2070x.g(this.f8440F.g, interfaceC0493h0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i7, int i10, int i11) {
        y0 y0Var = this.f8440F;
        if (i7 != i10) {
            if (i7 != i11 && i10 != i11) {
                if (y0Var.n(i7) == i10) {
                    i11 = i10;
                } else if (y0Var.n(i10) != i7) {
                    if (y0Var.n(i7) == y0Var.n(i10)) {
                        i11 = y0Var.n(i7);
                    } else {
                        int i12 = i7;
                        int i13 = 0;
                        while (i12 > 0 && i12 != i11) {
                            i12 = y0Var.n(i12);
                            i13++;
                        }
                        int i14 = i10;
                        int i15 = 0;
                        while (i14 > 0 && i14 != i11) {
                            i14 = y0Var.n(i14);
                            i15++;
                        }
                        int i16 = i13 - i15;
                        int i17 = i7;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = y0Var.n(i17);
                        }
                        int i19 = i15 - i13;
                        int i20 = i10;
                        for (int i21 = 0; i21 < i19; i21++) {
                            i20 = y0Var.n(i20);
                        }
                        i11 = i17;
                        for (int i22 = i20; i11 != i22; i22 = y0Var.n(i22)) {
                            i11 = y0Var.n(i11);
                        }
                    }
                }
            }
            while (i7 > 0 && i7 != i11) {
                if (!y0Var.i(i7)) {
                    this.L.b();
                }
                i7 = y0Var.n(i7);
            }
            o(i10, i11);
        }
        i11 = i7;
        while (i7 > 0) {
            if (!y0Var.i(i7)) {
            }
            i7 = y0Var.n(i7);
        }
        o(i10, i11);
    }

    public final Object H() {
        boolean z8 = this.f8448O;
        S s3 = C0498k.f8409a;
        if (!z8) {
            Object j = this.f8440F.j();
            return (!this.f8471x || (j instanceof C0500l)) ? j instanceof w0 ? ((w0) j).f8565a : j : s3;
        }
        if (!this.f8464q) {
            return s3;
        }
        AbstractC0508p.c("A call to createNode(), emitNode() or useNode() expected");
        return s3;
    }

    public final void I(int i7) {
        boolean i10 = this.f8440F.i(i7);
        C0525b c0525b = this.L;
        if (i10) {
            c0525b.d();
            Object k = this.f8440F.k(i7);
            c0525b.d();
            c0525b.f8752h.add(k);
        }
        J(this, i7, i10, 0);
        c0525b.d();
        if (i10) {
            c0525b.b();
        }
    }

    public final boolean K(int i7, boolean z8) {
        return ((i7 & 1) == 0 && (this.f8448O || this.f8471x)) || z8 || !x();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        int rotateLeft;
        int hashCode;
        if (this.f8465r.isEmpty()) {
            this.k = this.f8440F.p() + this.k;
            return;
        }
        y0 y0Var = this.f8440F;
        int f4 = y0Var.f();
        int i7 = y0Var.g;
        int i10 = y0Var.f8579h;
        int[] iArr = y0Var.f8574b;
        Object m10 = i7 < i10 ? y0Var.m(iArr, i7) : null;
        Object e2 = y0Var.e();
        int i11 = this.f8459l;
        S s3 = C0498k.f8409a;
        if (m10 != null) {
            rotateLeft = Integer.rotateLeft((m10 instanceof Enum ? ((Enum) m10).ordinal() : m10.hashCode()) ^ Integer.rotateLeft(this.f8449P, 3), 3);
        } else {
            if (e2 != null && f4 == 207 && !e2.equals(s3)) {
                this.f8449P = Integer.rotateLeft(e2.hashCode() ^ Integer.rotateLeft(this.f8449P, 3), 3) ^ i11;
                R(null, (iArr[(y0Var.g * 5) + 1] & 1073741824) != 0);
                D();
                y0Var.d();
                if (m10 == null) {
                    hashCode = Integer.hashCode(m10 instanceof Enum ? ((Enum) m10).ordinal() : m10.hashCode()) ^ Integer.rotateRight(this.f8449P, 3);
                } else {
                    if (e2 != null && f4 == 207 && !e2.equals(s3)) {
                        this.f8449P = Integer.rotateRight(Integer.hashCode(e2.hashCode()) ^ Integer.rotateRight(this.f8449P ^ i11, 3), 3);
                        return;
                    }
                    hashCode = Integer.rotateRight(this.f8449P ^ i11, 3) ^ Integer.hashCode(f4);
                }
                this.f8449P = Integer.rotateRight(hashCode, 3);
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f8449P, 3) ^ f4, 3) ^ i11;
        }
        this.f8449P = rotateLeft;
        R(null, (iArr[(y0Var.g * 5) + 1] & 1073741824) != 0);
        D();
        y0Var.d();
        if (m10 == null) {
        }
        this.f8449P = Integer.rotateRight(hashCode, 3);
    }

    public final void M() {
        int i7;
        y0 y0Var = this.f8440F;
        int i10 = y0Var.f8580i;
        if (i10 >= 0) {
            i7 = y0Var.f8574b[(i10 * 5) + 1] & 67108863;
        } else {
            i7 = 0;
        }
        this.k = i7;
        y0Var.q();
    }

    public final void N() {
        if (this.k != 0) {
            AbstractC0508p.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f8448O) {
            return;
        }
        C0505n0 v10 = v();
        if (v10 != null) {
            int i7 = v10.f8429a;
            if ((i7 & 128) == 0) {
                v10.f8429a = i7 | 16;
            }
        }
        if (this.f8465r.isEmpty()) {
            M();
        } else {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(Object obj, int i7, int i10, Object obj2) {
        int rotateLeft;
        C0491g0 c0491g0;
        Object obj3;
        int i11;
        int i12;
        int i13;
        Object obj4 = obj;
        if (this.f8464q) {
            AbstractC0508p.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i14 = this.f8459l;
        S s3 = C0498k.f8409a;
        if (obj4 != null) {
            rotateLeft = Integer.rotateLeft((obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(this.f8449P, 3), 3);
        } else {
            if (obj2 != null && i7 == 207 && !obj2.equals(s3)) {
                this.f8449P = i14 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.f8449P, 3), 3);
                if (obj4 == null) {
                    this.f8459l++;
                }
                boolean z8 = i10 == 0;
                if (!this.f8448O) {
                    this.f8440F.k++;
                    C0 c02 = this.f8442H;
                    int i15 = c02.f8293t;
                    if (z8) {
                        c02.P(i7, s3, s3, true);
                    } else if (obj2 != null) {
                        if (obj4 == null) {
                            obj4 = s3;
                        }
                        c02.P(i7, obj4, obj2, false);
                    } else {
                        if (obj4 == null) {
                            obj4 = s3;
                        }
                        c02.P(i7, obj4, s3, false);
                    }
                    C0491g0 c0491g02 = this.f8458i;
                    if (c0491g02 != null) {
                        int i16 = (-2) - i15;
                        O o10 = new O(-1, i7, i16, -1);
                        c0491g02.f8402e.g(i16, new I(-1, this.j - c0491g02.f8399b, 0));
                        c0491g02.f8401d.add(o10);
                    }
                    t(z8, null);
                    return;
                }
                boolean z10 = i10 == 1 && this.f8471x;
                if (this.f8458i == null) {
                    int f4 = this.f8440F.f();
                    if (!z10 && f4 == i7) {
                        y0 y0Var = this.f8440F;
                        int i17 = y0Var.g;
                        if (kotlin.jvm.internal.l.a(obj4, i17 < y0Var.f8579h ? y0Var.m(y0Var.f8574b, i17) : null)) {
                            R(obj2, z8);
                        }
                    }
                    y0 y0Var2 = this.f8440F;
                    y0Var2.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (y0Var2.k <= 0) {
                        int i18 = y0Var2.g;
                        while (i18 < y0Var2.f8579h) {
                            int i19 = i18 * 5;
                            int[] iArr = y0Var2.f8574b;
                            int i20 = iArr[i19];
                            Object m10 = y0Var2.m(iArr, i18);
                            int i21 = iArr[i19 + 1];
                            arrayList.add(new O(m10, i20, i18, (i21 & 1073741824) != 0 ? 1 : i21 & 67108863));
                            i18 += iArr[i19 + 3];
                        }
                    }
                    this.f8458i = new C0491g0(this.j, arrayList);
                }
                C0491g0 c0491g03 = this.f8458i;
                if (c0491g03 != null) {
                    Object n6 = obj4 != null ? new N(Integer.valueOf(i7), obj4) : Integer.valueOf(i7);
                    C2046I c2046i = ((S.a) c0491g03.f8403f.getValue()).f8952a;
                    Object g = c2046i.g(n6);
                    if (g == null) {
                        obj3 = null;
                    } else if (g instanceof C2042E) {
                        C2042E c2042e = (C2042E) g;
                        obj3 = c2042e.i(0);
                        if (c2042e.g()) {
                            c2046i.j(n6);
                        }
                        if (c2042e.f24585b == 1) {
                            c2046i.l(n6, c2042e.d());
                        }
                    } else {
                        c2046i.j(n6);
                        obj3 = g;
                    }
                    O o11 = (O) obj3;
                    ArrayList arrayList2 = c0491g03.f8401d;
                    C2070x c2070x = c0491g03.f8402e;
                    int i22 = c0491g03.f8399b;
                    if (z10 || o11 == null) {
                        this.f8440F.k++;
                        this.f8448O = true;
                        this.f8444J = null;
                        if (this.f8442H.f8296w) {
                            C0 y10 = this.f8441G.y();
                            this.f8442H = y10;
                            y10.J();
                            this.f8443I = false;
                            this.f8444J = null;
                        }
                        this.f8442H.d();
                        C0 c03 = this.f8442H;
                        int i23 = c03.f8293t;
                        if (z8) {
                            c03.P(i7, s3, s3, true);
                        } else if (obj2 != null) {
                            if (obj4 == null) {
                                obj4 = s3;
                            }
                            c03.P(i7, obj4, obj2, false);
                        } else {
                            if (obj4 == null) {
                                obj4 = s3;
                            }
                            c03.P(i7, obj4, s3, false);
                        }
                        this.f8446M = this.f8442H.b(i23);
                        int i24 = (-2) - i23;
                        O o12 = new O(-1, i7, i24, -1);
                        c2070x.g(i24, new I(-1, this.j - i22, 0));
                        arrayList2.add(o12);
                        c0491g0 = new C0491g0(z8 ? 0 : this.j, new ArrayList());
                        t(z8, c0491g0);
                        return;
                    }
                    arrayList2.add(o11);
                    int i25 = o11.f8345c;
                    I i26 = (I) c2070x.b(i25);
                    this.j = (i26 != null ? i26.f8306b : -1) + i22;
                    I i27 = (I) c2070x.b(i25);
                    int i28 = i27 != null ? i27.f8305a : -1;
                    int i29 = c0491g03.f8400c;
                    int i30 = i28 - i29;
                    char c10 = 7;
                    int i31 = 8;
                    if (i28 > i29) {
                        Object[] objArr = c2070x.f24693c;
                        long[] jArr = c2070x.f24691a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i32 = 0;
                            while (true) {
                                long j = jArr[i32];
                                i11 = i30;
                                if ((((~j) << c10) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i33 = 8 - ((~(i32 - length)) >>> 31);
                                    for (int i34 = 0; i34 < i33; i34++) {
                                        if ((j & 255) < 128) {
                                            I i35 = (I) objArr[(i32 << 3) + i34];
                                            int i36 = i35.f8305a;
                                            if (i36 == i28) {
                                                i35.f8305a = i29;
                                            } else if (i29 <= i36 && i36 < i28) {
                                                i35.f8305a = i36 + 1;
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i33 != 8) {
                                        break;
                                    }
                                }
                                if (i32 == length) {
                                    break;
                                }
                                i32++;
                                i30 = i11;
                                c10 = 7;
                            }
                        } else {
                            i11 = i30;
                        }
                    } else {
                        i11 = i30;
                        if (i29 > i28) {
                            Object[] objArr2 = c2070x.f24693c;
                            long[] jArr2 = c2070x.f24691a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j10 = jArr2[i37];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j10 & 255) < 128) {
                                                I i40 = (I) objArr2[(i37 << 3) + i39];
                                                int i41 = i40.f8305a;
                                                if (i41 == i28) {
                                                    i40.f8305a = i29;
                                                } else if (i28 + 1 <= i41 && i41 < i29) {
                                                    i40.f8305a = i41 - 1;
                                                }
                                                i13 = 8;
                                            } else {
                                                i13 = i31;
                                            }
                                            j10 >>= i13;
                                            i39++;
                                            i31 = i13;
                                        }
                                        i12 = i31;
                                        if (i38 != i12) {
                                            break;
                                        }
                                    } else {
                                        i12 = i31;
                                    }
                                    if (i37 == length2) {
                                        break;
                                    }
                                    i37++;
                                    i31 = i12;
                                }
                            }
                        }
                    }
                    C0525b c0525b = this.L;
                    int i42 = c0525b.f8751f;
                    C0506o c0506o = c0525b.f8746a;
                    c0525b.f8751f = (i25 - c0506o.f8440F.g) + i42;
                    this.f8440F.o(i25);
                    if (i11 > 0) {
                        c0525b.e(false);
                        y0 y0Var3 = c0506o.f8440F;
                        if (y0Var3.f8575c > 0) {
                            int i43 = y0Var3.f8580i;
                            C0032v c0032v = c0525b.f8749d;
                            if (c0032v.a(-2) != i43) {
                                if (!c0525b.f8748c && c0525b.f8750e) {
                                    c0525b.e(false);
                                    C0524a c0524a = c0525b.f8747b;
                                    c0524a.getClass();
                                    c0524a.f8745f.N(R.q.f8769d);
                                    c0525b.f8748c = true;
                                }
                                if (i43 > 0) {
                                    C0478a a9 = y0Var3.a(i43);
                                    c0032v.c(i43);
                                    c0525b.e(false);
                                    C0524a c0524a2 = c0525b.f8747b;
                                    c0524a2.getClass();
                                    R.p pVar = R.p.f8768d;
                                    R.I i44 = c0524a2.f8745f;
                                    i44.N(pVar);
                                    tc.b.I(i44, 0, a9);
                                    c0525b.f8748c = true;
                                }
                            }
                        }
                        C0524a c0524a3 = c0525b.f8747b;
                        c0524a3.getClass();
                        R.u uVar = R.u.f8776d;
                        R.I i45 = c0524a3.f8745f;
                        i45.N(uVar);
                        i45.f8743h[i45.f8744i - i45.f8742f[i45.g - 1].f8219b] = i11;
                    }
                    R(obj2, z8);
                }
                c0491g0 = null;
                t(z8, c0491g0);
                return;
            }
            rotateLeft = i14 ^ Integer.rotateLeft(Integer.rotateLeft(this.f8449P, 3) ^ i7, 3);
        }
        this.f8449P = rotateLeft;
        if (obj4 == null) {
        }
        if (i10 == 0) {
        }
        if (!this.f8448O) {
        }
    }

    public final void P() {
        O(null, -127, 0, null);
    }

    public final void Q(int i7, Y y10) {
        O(y10, i7, 0, null);
    }

    public final void R(Object obj, boolean z8) {
        if (z8) {
            y0 y0Var = this.f8440F;
            if (y0Var.k <= 0) {
                if ((y0Var.f8574b[(y0Var.g * 5) + 1] & 1073741824) == 0) {
                    AbstractC0495i0.a("Expected a node group");
                }
                y0Var.r();
                return;
            }
            return;
        }
        if (obj != null && this.f8440F.e() != obj) {
            C0525b c0525b = this.L;
            c0525b.getClass();
            c0525b.e(false);
            C0524a c0524a = c0525b.f8747b;
            c0524a.getClass();
            R.E e2 = R.E.f8738d;
            R.I i7 = c0524a.f8745f;
            i7.N(e2);
            tc.b.I(i7, 0, obj);
        }
        this.f8440F.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r0.f8574b[(r4 * 5) + 1] & 536870912) != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(int i7) {
        int i10;
        if (this.f8458i != null) {
            O(null, i7, 0, null);
            return;
        }
        if (this.f8464q) {
            AbstractC0508p.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f8449P = this.f8459l ^ Integer.rotateLeft(Integer.rotateLeft(this.f8449P, 3) ^ i7, 3);
        this.f8459l++;
        y0 y0Var = this.f8440F;
        boolean z8 = this.f8448O;
        S s3 = C0498k.f8409a;
        if (z8) {
            y0Var.k++;
            this.f8442H.P(i7, s3, s3, false);
            t(false, null);
            return;
        }
        if (y0Var.f() == i7) {
            int i11 = y0Var.g;
            if (i11 < y0Var.f8579h) {
            }
            y0Var.r();
            t(false, null);
            return;
        }
        if (y0Var.k <= 0 && (i10 = y0Var.g) != y0Var.f8579h) {
            int i12 = this.j;
            E();
            this.L.f(i12, y0Var.p());
            AbstractC0508p.a(this.f8465r, i10, y0Var.g);
        }
        y0Var.k++;
        this.f8448O = true;
        this.f8444J = null;
        if (this.f8442H.f8296w) {
            C0 y10 = this.f8441G.y();
            this.f8442H = y10;
            y10.J();
            this.f8443I = false;
            this.f8444J = null;
        }
        C0 c02 = this.f8442H;
        c02.d();
        int i13 = c02.f8293t;
        c02.P(i7, s3, s3, false);
        this.f8446M = c02.b(i13);
        t(false, null);
    }

    public final void T(int i7) {
        O(null, i7, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0506o U(int i7) {
        C0505n0 c0505n0;
        int i10;
        S(i7);
        boolean z8 = this.f8448O;
        C0517u c0517u = this.g;
        ArrayList arrayList = this.f8438D;
        if (z8) {
            C0505n0 c0505n02 = new C0505n0(c0517u);
            arrayList.add(c0505n02);
            e0(c0505n02);
            c0505n02.f8433e = this.f8435A;
            c0505n02.f8429a &= -17;
        } else {
            ArrayList arrayList2 = this.f8465r;
            int f4 = AbstractC0508p.f(this.f8440F.f8580i, arrayList2);
            L l10 = f4 >= 0 ? (L) arrayList2.remove(f4) : null;
            Object j = this.f8440F.j();
            if (kotlin.jvm.internal.l.a(j, C0498k.f8409a)) {
                c0505n0 = new C0505n0(c0517u);
                e0(c0505n0);
            } else {
                kotlin.jvm.internal.l.c(j, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c0505n0 = (C0505n0) j;
            }
            if (l10 == null) {
                int i11 = c0505n0.f8429a;
                boolean z10 = (i11 & 64) != 0;
                if (z10) {
                    c0505n0.f8429a = i11 & (-65);
                }
                if (!z10) {
                    c0505n0.f8429a &= -9;
                    arrayList.add(c0505n0);
                    c0505n0.f8433e = this.f8435A;
                    i10 = c0505n0.f8429a;
                    c0505n0.f8429a = i10 & (-17);
                    if ((i10 & 256) != 0) {
                        c0505n0.f8429a = (i10 & (-273)) | 512;
                        C0524a c0524a = this.L.f8747b;
                        c0524a.getClass();
                        R.C c10 = R.C.f8736d;
                        R.I i12 = c0524a.f8745f;
                        i12.N(c10);
                        tc.b.I(i12, 0, c0505n0);
                    }
                }
            }
            c0505n0.f8429a |= 8;
            arrayList.add(c0505n0);
            c0505n0.f8433e = this.f8435A;
            i10 = c0505n0.f8429a;
            c0505n0.f8429a = i10 & (-17);
            if ((i10 & 256) != 0) {
            }
        }
        return this;
    }

    public final void V(Object obj) {
        if (!this.f8448O && this.f8440F.f() == 207 && !kotlin.jvm.internal.l.a(this.f8440F.e(), obj) && this.f8472y < 0) {
            this.f8472y = this.f8440F.g;
            this.f8471x = true;
        }
        O(null, 207, 0, obj);
    }

    public final void W() {
        O(null, 125, 2, null);
        this.f8464q = true;
    }

    public final void X() {
        this.f8459l = 0;
        this.f8440F = this.f8453c.t();
        O(null, 100, 0, null);
        r rVar = this.f8452b;
        rVar.n();
        this.f8467t = rVar.f();
        this.f8470w.c(this.f8469v ? 1 : 0);
        this.f8469v = g(this.f8467t);
        this.f8444J = null;
        if (!this.f8463p) {
            this.f8463p = rVar.d();
        }
        if (!this.f8436B) {
            this.f8436B = rVar.e();
        }
        Set set = (Set) C0480b.p(this.f8467t, AbstractC0825b.f13769a);
        if (set != null) {
            C0515t c0515t = this.f8450Q;
            if (c0515t == null) {
                c0515t = new C0515t(this.g);
                this.f8450Q = c0515t;
            }
            set.add(c0515t);
            rVar.k(set);
        }
        O(null, rVar.g(), 0, null);
    }

    public final boolean Y(C0505n0 c0505n0, Object obj) {
        C0478a c0478a = c0505n0.f8431c;
        if (c0478a == null) {
            return false;
        }
        int b2 = this.f8440F.f8573a.b(c0478a);
        if (!this.f8439E || b2 < this.f8440F.g) {
            return false;
        }
        ArrayList arrayList = this.f8465r;
        int f4 = AbstractC0508p.f(b2, arrayList);
        if (f4 < 0) {
            int i7 = -(f4 + 1);
            if (!(obj instanceof C)) {
                obj = null;
            }
            arrayList.add(i7, new L(c0505n0, b2, obj));
        } else {
            L l10 = (L) arrayList.get(f4);
            if (obj instanceof C) {
                Object obj2 = l10.f8326c;
                if (obj2 == null) {
                    l10.f8326c = obj;
                } else if (obj2 instanceof C2047J) {
                    ((C2047J) obj2).a(obj);
                } else {
                    int i10 = u.S.f24634a;
                    C2047J c2047j = new C2047J(2);
                    c2047j.j(obj2);
                    c2047j.j(obj);
                    l10.f8326c = c2047j;
                }
            } else {
                l10.f8326c = null;
            }
        }
        return true;
    }

    public final void Z(C2046I c2046i) {
        Object[] objArr = c2046i.f24604b;
        Object[] objArr2 = c2046i.f24605c;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.f8465r;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            C0505n0 c0505n0 = (C0505n0) obj;
                            C0478a c0478a = c0505n0.f8431c;
                            if (c0478a != null) {
                                int i13 = c0478a.f8373a;
                                if (obj2 == S.f8367e) {
                                    obj2 = null;
                                }
                                arrayList.add(new L(c0505n0, i13, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        Eb.r.T(arrayList, AbstractC0508p.f8486f);
    }

    public final void a() {
        j();
        this.f8457h.clear();
        this.f8460m.f313b = 0;
        this.f8466s.f313b = 0;
        this.f8470w.f313b = 0;
        this.f8468u = null;
        C0526c c0526c = this.f8447N;
        c0526c.g.J();
        c0526c.f8755f.J();
        this.f8449P = 0;
        this.f8473z = 0;
        this.f8464q = false;
        this.f8448O = false;
        this.f8471x = false;
        this.f8439E = false;
        this.f8472y = -1;
        y0 y0Var = this.f8440F;
        if (!y0Var.f8578f) {
            y0Var.c();
        }
        if (this.f8442H.f8296w) {
            return;
        }
        u();
    }

    public final void a0(int i7, int i10) {
        if (f0(i7) != i10) {
            if (i7 < 0) {
                C2068v c2068v = this.f8462o;
                if (c2068v == null) {
                    c2068v = new C2068v();
                    this.f8462o = c2068v;
                }
                c2068v.f(i7, i10);
                return;
            }
            int[] iArr = this.f8461n;
            if (iArr == null) {
                int i11 = this.f8440F.f8575c;
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, 0, i11, -1);
                this.f8461n = iArr2;
                iArr = iArr2;
            }
            iArr[i7] = i10;
        }
    }

    public final void b0(int i7, int i10) {
        int f02 = f0(i7);
        if (f02 != i10) {
            int i11 = i10 - f02;
            ArrayList arrayList = this.f8457h;
            int size = arrayList.size() - 1;
            while (i7 != -1) {
                int f03 = f0(i7) + i11;
                a0(i7, f03);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        C0491g0 c0491g0 = (C0491g0) arrayList.get(i12);
                        if (c0491g0 != null && c0491g0.a(i7, f03)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                if (i7 < 0) {
                    i7 = this.f8440F.f8580i;
                } else if (this.f8440F.i(i7)) {
                    return;
                } else {
                    i7 = this.f8440F.n(i7);
                }
            }
        }
    }

    public final void c(Object obj, Rb.e eVar) {
        if (this.f8448O) {
            C0526c c0526c = this.f8447N;
            c0526c.getClass();
            R.F f4 = R.F.f8739d;
            R.I i7 = c0526c.f8755f;
            i7.N(f4);
            tc.b.I(i7, 0, obj);
            kotlin.jvm.internal.l.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.y.b(2, eVar);
            tc.b.I(i7, 1, eVar);
            return;
        }
        C0525b c0525b = this.L;
        c0525b.c();
        C0524a c0524a = c0525b.f8747b;
        c0524a.getClass();
        R.F f10 = R.F.f8739d;
        R.I i10 = c0524a.f8745f;
        i10.N(f10);
        kotlin.jvm.internal.l.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.y.b(2, eVar);
        tc.b.J(i10, 0, obj, 1, eVar);
    }

    public final Y.j c0(InterfaceC0493h0 interfaceC0493h0, Y.j jVar) {
        Y.j jVar2 = (Y.j) interfaceC0493h0;
        jVar2.getClass();
        Y.i iVar = new Y.i(jVar2);
        iVar.putAll(jVar);
        Y.j a9 = iVar.a();
        Q(204, AbstractC0508p.f8484d);
        z();
        e0(a9);
        z();
        e0(jVar);
        p(false);
        return a9;
    }

    public final boolean d(float f4) {
        Object z8 = z();
        if ((z8 instanceof Float) && f4 == ((Number) z8).floatValue()) {
            return false;
        }
        e0(Float.valueOf(f4));
        return true;
    }

    public final void d0(Object obj) {
        int i7;
        y0 y0Var;
        int i10;
        C0 c02;
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            C0478a c0478a = null;
            if (this.f8448O) {
                C0 c03 = this.f8442H;
                int i11 = c03.f8293t;
                if (i11 > c03.f8295v + 1) {
                    int i12 = i11 - 1;
                    int C2 = c03.C(c03.f8278b, i12);
                    while (true) {
                        i10 = i12;
                        i12 = C2;
                        c02 = this.f8442H;
                        if (i12 == c02.f8295v || i12 < 0) {
                            break;
                        } else {
                            C2 = c02.C(c02.f8278b, i12);
                        }
                    }
                    c0478a = c02.b(i10);
                }
            } else {
                y0 y0Var2 = this.f8440F;
                int i13 = y0Var2.g;
                if (i13 > y0Var2.f8580i + 1) {
                    int i14 = i13 - 1;
                    int n6 = y0Var2.n(i14);
                    while (true) {
                        i7 = i14;
                        i14 = n6;
                        y0Var = this.f8440F;
                        if (i14 == y0Var.f8580i || i14 < 0) {
                            break;
                        } else {
                            n6 = y0Var.n(i14);
                        }
                    }
                    c0478a = y0Var.a(i7);
                }
            }
            w0 w0Var = new w0(v0Var, c0478a);
            if (this.f8448O) {
                C0524a c0524a = this.L.f8747b;
                c0524a.getClass();
                R.w wVar = R.w.f8778d;
                R.I i15 = c0524a.f8745f;
                i15.N(wVar);
                tc.b.I(i15, 0, w0Var);
            }
            this.f8454d.add(obj);
            obj = w0Var;
        }
        e0(obj);
    }

    public final boolean e(int i7) {
        Object z8 = z();
        if ((z8 instanceof Integer) && i7 == ((Number) z8).intValue()) {
            return false;
        }
        e0(Integer.valueOf(i7));
        return true;
    }

    public final void e0(Object obj) {
        if (this.f8448O) {
            C0 c02 = this.f8442H;
            if (c02.f8287n <= 0 || c02.f8284i == c02.k) {
                c02.D(obj);
                return;
            }
            C2070x c2070x = c02.f8292s;
            if (c2070x == null) {
                c2070x = new C2070x();
            }
            c02.f8292s = c2070x;
            int i7 = c02.f8295v;
            Object b2 = c2070x.b(i7);
            if (b2 == null) {
                b2 = new C2042E();
                c2070x.g(i7, b2);
            }
            ((C2042E) b2).a(obj);
            return;
        }
        y0 y0Var = this.f8440F;
        boolean z8 = y0Var.f8583n;
        C0525b c0525b = this.L;
        if (!z8) {
            C0478a a9 = y0Var.a(y0Var.f8580i);
            C0524a c0524a = c0525b.f8747b;
            c0524a.getClass();
            C0528e c0528e = C0528e.f8757d;
            R.I i10 = c0524a.f8745f;
            i10.N(c0528e);
            tc.b.J(i10, 0, a9, 1, obj);
            return;
        }
        int c10 = (y0Var.f8581l - B0.c(y0Var.f8574b, y0Var.f8580i)) - 1;
        if (c0525b.f8746a.f8440F.f8580i - c0525b.f8751f >= 0) {
            c0525b.e(true);
            C0524a c0524a2 = c0525b.f8747b;
            R.r rVar = R.r.f8772h;
            R.I i11 = c0524a2.f8745f;
            i11.N(rVar);
            tc.b.I(i11, 0, obj);
            i11.f8743h[i11.f8744i - i11.f8742f[i11.g - 1].f8219b] = c10;
            return;
        }
        y0 y0Var2 = this.f8440F;
        C0478a a10 = y0Var2.a(y0Var2.f8580i);
        C0524a c0524a3 = c0525b.f8747b;
        R.r rVar2 = R.r.g;
        R.I i12 = c0524a3.f8745f;
        i12.N(rVar2);
        tc.b.J(i12, 0, obj, 1, a10);
        i12.f8743h[i12.f8744i - i12.f8742f[i12.g - 1].f8219b] = c10;
    }

    public final boolean f(long j) {
        Object z8 = z();
        if ((z8 instanceof Long) && j == ((Number) z8).longValue()) {
            return false;
        }
        e0(Long.valueOf(j));
        return true;
    }

    public final int f0(int i7) {
        int i10;
        if (i7 >= 0) {
            int[] iArr = this.f8461n;
            return (iArr == null || (i10 = iArr[i7]) < 0) ? this.f8440F.l(i7) : i10;
        }
        C2068v c2068v = this.f8462o;
        if (c2068v == null || c2068v.c(i7) < 0) {
            return 0;
        }
        int c10 = c2068v.c(i7);
        if (c10 >= 0) {
            return c2068v.f24723c[c10];
        }
        AbstractC2121a.e("Cannot find value for key " + i7);
        throw null;
    }

    public final boolean g(Object obj) {
        if (kotlin.jvm.internal.l.a(z(), obj)) {
            return false;
        }
        e0(obj);
        return true;
    }

    public final void g0() {
        if (!this.f8464q) {
            AbstractC0508p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f8464q = false;
        if (this.f8448O) {
            AbstractC0508p.c("useNode() called while inserting");
        }
        y0 y0Var = this.f8440F;
        Object k = y0Var.k(y0Var.f8580i);
        C0525b c0525b = this.L;
        c0525b.d();
        c0525b.f8752h.add(k);
        if (this.f8471x && (k instanceof InterfaceC0494i)) {
            c0525b.c();
            C0524a c0524a = c0525b.f8747b;
            c0524a.getClass();
            if (k instanceof InterfaceC0494i) {
                c0524a.f8745f.N(R.H.f8741d);
            }
        }
    }

    public final boolean h(boolean z8) {
        Object z10 = z();
        if ((z10 instanceof Boolean) && z8 == ((Boolean) z10).booleanValue()) {
            return false;
        }
        e0(Boolean.valueOf(z8));
        return true;
    }

    public final boolean i(Object obj) {
        if (z() == obj) {
            return false;
        }
        e0(obj);
        return true;
    }

    public final void j() {
        this.f8458i = null;
        this.j = 0;
        this.k = 0;
        this.f8449P = 0;
        this.f8464q = false;
        C0525b c0525b = this.L;
        c0525b.f8748c = false;
        c0525b.f8749d.f313b = 0;
        c0525b.f8751f = 0;
        this.f8438D.clear();
        this.f8461n = null;
        this.f8462o = null;
    }

    public final Object k(AbstractC0499k0 abstractC0499k0) {
        return C0480b.p(m(), abstractC0499k0);
    }

    public final void l(Rb.a aVar) {
        if (!this.f8464q) {
            AbstractC0508p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f8464q = false;
        if (!this.f8448O) {
            AbstractC0508p.c("createNode() can only be called when inserting");
        }
        C0032v c0032v = this.f8460m;
        int i7 = c0032v.f312a[c0032v.f313b - 1];
        C0 c02 = this.f8442H;
        C0478a b2 = c02.b(c02.f8295v);
        this.k++;
        C0526c c0526c = this.f8447N;
        R.r rVar = R.r.f8770e;
        R.I i10 = c0526c.f8755f;
        i10.N(rVar);
        tc.b.I(i10, 0, aVar);
        i10.f8743h[i10.f8744i - i10.f8742f[i10.g - 1].f8219b] = i7;
        tc.b.I(i10, 1, b2);
        R.r rVar2 = R.r.f8771f;
        R.I i11 = c0526c.g;
        i11.N(rVar2);
        i11.f8743h[i11.f8744i - i11.f8742f[i11.g - 1].f8219b] = i7;
        tc.b.I(i11, 0, b2);
    }

    public final InterfaceC0493h0 m() {
        InterfaceC0493h0 interfaceC0493h0;
        InterfaceC0493h0 interfaceC0493h02;
        InterfaceC0493h0 interfaceC0493h03 = this.f8444J;
        if (interfaceC0493h03 != null) {
            return interfaceC0493h03;
        }
        int i7 = this.f8440F.f8580i;
        boolean z8 = this.f8448O;
        Y y10 = AbstractC0508p.f8483c;
        if (z8 && this.f8443I) {
            int i10 = this.f8442H.f8295v;
            while (i10 > 0) {
                C0 c02 = this.f8442H;
                if (c02.f8278b[c02.q(i10) * 5] == 202 && kotlin.jvm.internal.l.a(this.f8442H.r(i10), y10)) {
                    Object p10 = this.f8442H.p(i10);
                    kotlin.jvm.internal.l.c(p10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC0493h0 interfaceC0493h04 = (InterfaceC0493h0) p10;
                    this.f8444J = interfaceC0493h04;
                    return interfaceC0493h04;
                }
                C0 c03 = this.f8442H;
                i10 = c03.C(c03.f8278b, i10);
            }
        }
        if (this.f8440F.f8575c > 0) {
            while (i7 > 0) {
                y0 y0Var = this.f8440F;
                int[] iArr = y0Var.f8574b;
                if (iArr[i7 * 5] == 202 && kotlin.jvm.internal.l.a(y0Var.m(iArr, i7), y10)) {
                    C2070x c2070x = this.f8468u;
                    if (c2070x == null || (interfaceC0493h02 = (InterfaceC0493h0) c2070x.b(i7)) == null) {
                        y0 y0Var2 = this.f8440F;
                        Object b2 = y0Var2.b(y0Var2.f8574b, i7);
                        kotlin.jvm.internal.l.c(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0493h0 = (InterfaceC0493h0) b2;
                    } else {
                        interfaceC0493h0 = interfaceC0493h02;
                    }
                    this.f8444J = interfaceC0493h0;
                    return interfaceC0493h0;
                }
                i7 = this.f8440F.n(i7);
            }
        }
        InterfaceC0493h0 interfaceC0493h05 = this.f8467t;
        this.f8444J = interfaceC0493h05;
        return interfaceC0493h05;
    }

    public final void n(C2046I c2046i, Y.e eVar) {
        ArrayList arrayList = this.f8465r;
        if (this.f8439E) {
            AbstractC0508p.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f8435A = Long.hashCode(AbstractC0688o.k().g());
            this.f8468u = null;
            Z(c2046i);
            this.j = 0;
            this.f8439E = true;
            try {
                X();
                Object z8 = z();
                if (z8 != eVar && eVar != null) {
                    e0(eVar);
                }
                C0504n c0504n = this.f8437C;
                S.e l10 = C0480b.l();
                try {
                    l10.b(c0504n);
                    Y y10 = AbstractC0508p.f8481a;
                    if (eVar != null) {
                        Q(200, y10);
                        Y.f.c(this, eVar);
                        p(false);
                    } else if (!this.f8469v || z8 == null || z8.equals(C0498k.f8409a)) {
                        L();
                    } else {
                        Q(200, y10);
                        kotlin.jvm.internal.y.b(2, z8);
                        Y.f.c(this, (Rb.e) z8);
                        p(false);
                    }
                    l10.l(l10.f8961c - 1);
                    s();
                    this.f8439E = false;
                    arrayList.clear();
                    if (!this.f8442H.f8296w) {
                        AbstractC0508p.c("Check failed");
                    }
                    u();
                } catch (Throwable th) {
                    l10.l(l10.f8961c - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f8439E = false;
                arrayList.clear();
                a();
                if (!this.f8442H.f8296w) {
                    AbstractC0508p.c("Check failed");
                }
                u();
                throw th2;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i7, int i10) {
        if (i7 <= 0 || i7 == i10) {
            return;
        }
        o(this.f8440F.n(i7), i10);
        if (this.f8440F.i(i7)) {
            Object k = this.f8440F.k(i7);
            C0525b c0525b = this.L;
            c0525b.d();
            c0525b.f8752h.add(k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dd  */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z8) {
        int hashCode;
        C0032v c0032v;
        int i7;
        ArrayList arrayList;
        C0525b c0525b;
        boolean z10;
        int i10;
        y0 y0Var;
        int i11;
        C0491g0 c0491g0;
        ?? r22;
        int i12;
        int i13;
        char c10;
        C0032v c0032v2;
        int i14;
        int i15;
        C0491g0 c0491g02;
        ArrayList arrayList2;
        C0525b c0525b2;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        int i16;
        int i17;
        ArrayList arrayList4;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        int hashCode2;
        C0032v c0032v3 = this.f8460m;
        int i18 = c0032v3.f312a[c0032v3.f313b - 2] - 1;
        boolean z11 = this.f8448O;
        S s3 = C0498k.f8409a;
        if (z11) {
            C0 c02 = this.f8442H;
            int i19 = c02.f8295v;
            int i20 = c02.f8278b[c02.q(i19) * 5];
            Object r10 = this.f8442H.r(i19);
            Object p10 = this.f8442H.p(i19);
            if (r10 != null) {
                hashCode2 = Integer.hashCode(r10 instanceof Enum ? ((Enum) r10).ordinal() : r10.hashCode()) ^ Integer.rotateRight(this.f8449P, 3);
            } else if (p10 == null || i20 != 207 || p10.equals(s3)) {
                hashCode2 = Integer.rotateRight(i18 ^ this.f8449P, 3) ^ Integer.hashCode(i20);
            } else {
                this.f8449P = Integer.rotateRight(Integer.rotateRight(i18 ^ this.f8449P, 3) ^ Integer.hashCode(p10.hashCode()), 3);
            }
            this.f8449P = Integer.rotateRight(hashCode2, 3);
        } else {
            y0 y0Var2 = this.f8440F;
            int i21 = y0Var2.f8580i;
            int[] iArr = y0Var2.f8574b;
            int i22 = iArr[i21 * 5];
            Object m10 = y0Var2.m(iArr, i21);
            y0 y0Var3 = this.f8440F;
            Object b2 = y0Var3.b(y0Var3.f8574b, i21);
            if (m10 != null) {
                hashCode = Integer.hashCode(m10 instanceof Enum ? ((Enum) m10).ordinal() : m10.hashCode()) ^ Integer.rotateRight(this.f8449P, 3);
            } else if (b2 == null || i22 != 207 || b2.equals(s3)) {
                hashCode = Integer.rotateRight(i18 ^ this.f8449P, 3) ^ Integer.hashCode(i22);
            } else {
                this.f8449P = Integer.rotateRight(Integer.rotateRight(i18 ^ this.f8449P, 3) ^ Integer.hashCode(b2.hashCode()), 3);
            }
            this.f8449P = Integer.rotateRight(hashCode, 3);
        }
        int i23 = this.k;
        C0491g0 c0491g03 = this.f8458i;
        ArrayList arrayList5 = this.f8465r;
        C0525b c0525b3 = this.L;
        if (c0491g03 != null) {
            ArrayList arrayList6 = c0491g03.f8398a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c0491g03.f8401d;
                HashSet hashSet = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i24 = 0; i24 < size; i24++) {
                    hashSet.add(arrayList7.get(i24));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i26 < size3) {
                    O o10 = (O) arrayList6.get(i26);
                    boolean contains = hashSet.contains(o10);
                    C2070x c2070x = c0491g03.f8402e;
                    HashSet hashSet2 = hashSet;
                    int i28 = c0491g03.f8399b;
                    if (contains) {
                        i13 = size3;
                        c10 = 3;
                        if (!linkedHashSet2.contains(o10)) {
                            if (i25 < size2) {
                                O o11 = (O) arrayList7.get(i25);
                                if (o11 != o10) {
                                    I i29 = (I) c2070x.b(o11.f8345c);
                                    int i30 = i29 != null ? i29.f8306b : -1;
                                    linkedHashSet2.add(o11);
                                    c0491g02 = c0491g03;
                                    i17 = i27;
                                    if (i30 != i17) {
                                        arrayList4 = arrayList7;
                                        I i31 = (I) c2070x.b(o11.f8345c);
                                        int i32 = i31 != null ? i31.f8307c : o11.f8346d;
                                        linkedHashSet = linkedHashSet2;
                                        int i33 = i30 + i28;
                                        int i34 = i28 + i17;
                                        if (i32 > 0) {
                                            i16 = size2;
                                            int i35 = c0525b3.f8754l;
                                            if (i35 > 0) {
                                                arrayList2 = arrayList5;
                                                c0032v2 = c0032v3;
                                                if (c0525b3.j == i33 - i35 && c0525b3.k == i34 - i35) {
                                                    c0525b3.f8754l = i35 + i32;
                                                }
                                            } else {
                                                c0032v2 = c0032v3;
                                                arrayList2 = arrayList5;
                                            }
                                            c0525b3.d();
                                            c0525b3.j = i33;
                                            c0525b3.k = i34;
                                            c0525b3.f8754l = i32;
                                        } else {
                                            c0032v2 = c0032v3;
                                            arrayList2 = arrayList5;
                                            i16 = size2;
                                            c0525b3.getClass();
                                        }
                                        char c11 = 7;
                                        if (i30 > i17) {
                                            Object[] objArr5 = c2070x.f24693c;
                                            long[] jArr5 = c2070x.f24691a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                c0525b2 = c0525b3;
                                                arrayList3 = arrayList6;
                                                int i36 = 0;
                                                while (true) {
                                                    long j = jArr5[i36];
                                                    i14 = i23;
                                                    i15 = i25;
                                                    if ((((~j) << c11) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i37 = 8 - ((~(i36 - length)) >>> 31);
                                                        int i38 = 0;
                                                        while (i38 < i37) {
                                                            if ((j & 255) < 128) {
                                                                I i39 = (I) objArr5[(i36 << 3) + i38];
                                                                jArr4 = jArr5;
                                                                int i40 = i39.f8306b;
                                                                objArr4 = objArr5;
                                                                if (i30 <= i40 && i40 < i30 + i32) {
                                                                    i39.f8306b = (i40 - i30) + i17;
                                                                } else if (i17 <= i40 && i40 < i30) {
                                                                    i39.f8306b = i40 + i32;
                                                                }
                                                            } else {
                                                                jArr4 = jArr5;
                                                                objArr4 = objArr5;
                                                            }
                                                            j >>= 8;
                                                            i38++;
                                                            jArr5 = jArr4;
                                                            objArr5 = objArr4;
                                                        }
                                                        jArr3 = jArr5;
                                                        objArr3 = objArr5;
                                                        if (i37 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr3 = jArr5;
                                                        objArr3 = objArr5;
                                                    }
                                                    if (i36 == length) {
                                                        break;
                                                    }
                                                    i36++;
                                                    i23 = i14;
                                                    i25 = i15;
                                                    jArr5 = jArr3;
                                                    objArr5 = objArr3;
                                                    c11 = 7;
                                                }
                                            } else {
                                                i14 = i23;
                                                i15 = i25;
                                                c0525b2 = c0525b3;
                                                arrayList3 = arrayList6;
                                            }
                                        } else {
                                            i14 = i23;
                                            i15 = i25;
                                            c0525b2 = c0525b3;
                                            arrayList3 = arrayList6;
                                            if (i17 > i30) {
                                                Object[] objArr6 = c2070x.f24693c;
                                                long[] jArr6 = c2070x.f24691a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i41 = 0;
                                                    while (true) {
                                                        long j10 = jArr6[i41];
                                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i42 = 8 - ((~(i41 - length2)) >>> 31);
                                                            int i43 = 0;
                                                            while (i43 < i42) {
                                                                if ((j10 & 255) < 128) {
                                                                    I i44 = (I) objArr6[(i41 << 3) + i43];
                                                                    objArr2 = objArr6;
                                                                    int i45 = i44.f8306b;
                                                                    jArr2 = jArr6;
                                                                    if (i30 <= i45 && i45 < i30 + i32) {
                                                                        i44.f8306b = (i45 - i30) + i17;
                                                                    } else if (i30 + 1 <= i45 && i45 < i17) {
                                                                        i44.f8306b = i45 - i32;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                }
                                                                j10 >>= 8;
                                                                i43++;
                                                                objArr6 = objArr2;
                                                                jArr6 = jArr2;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            if (i42 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                        }
                                                        if (i41 == length2) {
                                                            break;
                                                        }
                                                        i41++;
                                                        objArr6 = objArr;
                                                        jArr6 = jArr;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c0032v2 = c0032v3;
                                        i14 = i23;
                                        i15 = i25;
                                        arrayList2 = arrayList5;
                                        c0525b2 = c0525b3;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                        linkedHashSet = linkedHashSet2;
                                        i16 = size2;
                                    }
                                } else {
                                    c0032v2 = c0032v3;
                                    i14 = i23;
                                    i15 = i25;
                                    c0491g02 = c0491g03;
                                    arrayList2 = arrayList5;
                                    c0525b2 = c0525b3;
                                    arrayList3 = arrayList6;
                                    linkedHashSet = linkedHashSet2;
                                    i16 = size2;
                                    i17 = i27;
                                    arrayList4 = arrayList7;
                                    i26++;
                                }
                                i25 = i15 + 1;
                                I i46 = (I) c2070x.b(o11.f8345c);
                                int i47 = (i46 != null ? i46.f8307c : o11.f8346d) + i17;
                                arrayList7 = arrayList4;
                                size3 = i13;
                                c0491g03 = c0491g02;
                                hashSet = hashSet2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i16;
                                arrayList5 = arrayList2;
                                c0525b3 = c0525b2;
                                arrayList6 = arrayList3;
                                i23 = i14;
                                i27 = i47;
                                c0032v3 = c0032v2;
                            } else {
                                size3 = i13;
                                c0491g03 = c0491g03;
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        i13 = size3;
                        I i48 = (I) c2070x.b(o10.f8345c);
                        c0525b3.f((i48 != null ? i48.f8306b : -1) + i28, o10.f8346d);
                        int i49 = o10.f8345c;
                        c0491g03.a(i49, 0);
                        c0525b3.f8751f = (i49 - c0525b3.f8746a.f8440F.g) + c0525b3.f8751f;
                        this.f8440F.o(i49);
                        E();
                        this.f8440F.p();
                        c10 = 3;
                        AbstractC0508p.a(arrayList5, i49, this.f8440F.f8574b[(i49 * 5) + 3] + i49);
                    }
                    i26++;
                    size3 = i13;
                    hashSet = hashSet2;
                }
                c0032v = c0032v3;
                i7 = i23;
                arrayList = arrayList5;
                C0525b c0525b4 = c0525b3;
                c0525b4.d();
                if (arrayList6.size() > 0) {
                    y0 y0Var4 = this.f8440F;
                    c0525b = c0525b4;
                    c0525b.f8751f = (y0Var4.f8579h - c0525b.f8746a.f8440F.g) + c0525b.f8751f;
                    y0Var4.q();
                } else {
                    c0525b = c0525b4;
                }
                z10 = this.f8448O;
                if (!z10) {
                    y0 y0Var5 = this.f8440F;
                    int i50 = y0Var5.f8582m - y0Var5.f8581l;
                    if (i50 > 0) {
                        if (i50 > 0) {
                            c0525b.e(false);
                            y0 y0Var6 = c0525b.f8746a.f8440F;
                            if (y0Var6.f8575c > 0) {
                                int i51 = y0Var6.f8580i;
                                C0032v c0032v4 = c0525b.f8749d;
                                if (c0032v4.a(-2) != i51) {
                                    if (!c0525b.f8748c && c0525b.f8750e) {
                                        c0525b.e(false);
                                        C0524a c0524a = c0525b.f8747b;
                                        c0524a.getClass();
                                        c0524a.f8745f.N(R.q.f8769d);
                                        c0525b.f8748c = true;
                                    }
                                    if (i51 > 0) {
                                        C0478a a9 = y0Var6.a(i51);
                                        c0032v4.c(i51);
                                        c0525b.e(false);
                                        C0524a c0524a2 = c0525b.f8747b;
                                        c0524a2.getClass();
                                        R.p pVar = R.p.f8768d;
                                        R.I i52 = c0524a2.f8745f;
                                        i52.N(pVar);
                                        tc.b.I(i52, 0, a9);
                                        c0525b.f8748c = true;
                                    }
                                }
                            }
                            C0524a c0524a3 = c0525b.f8747b;
                            c0524a3.getClass();
                            R.D d10 = R.D.f8737d;
                            R.I i53 = c0524a3.f8745f;
                            i53.N(d10);
                            i53.f8743h[i53.f8744i - i53.f8742f[i53.g - 1].f8219b] = i50;
                        } else {
                            c0525b.getClass();
                        }
                    }
                }
                i10 = this.j;
                while (true) {
                    y0Var = this.f8440F;
                    if (y0Var.k > 0 && (i12 = y0Var.g) != y0Var.f8579h) {
                        E();
                        c0525b.f(i10, this.f8440F.p());
                        ArrayList arrayList8 = arrayList;
                        AbstractC0508p.a(arrayList8, i12, this.f8440F.g);
                        i7 = i7;
                        arrayList = arrayList8;
                    }
                }
                if (z10) {
                    if (z8) {
                        c0525b.b();
                    }
                    int i54 = c0525b.f8746a.f8440F.f8580i;
                    C0032v c0032v5 = c0525b.f8749d;
                    if (c0032v5.a(-1) > i54) {
                        AbstractC0508p.c("Missed recording an endGroup");
                    }
                    if (c0032v5.a(-1) == i54) {
                        c0525b.e(false);
                        c0032v5.b();
                        C0524a c0524a4 = c0525b.f8747b;
                        c0524a4.getClass();
                        c0524a4.f8745f.N(R.m.f8765d);
                    }
                    int i55 = this.f8440F.f8580i;
                    int i56 = i7;
                    if (i56 != f0(i55)) {
                        b0(i55, i56);
                    }
                    int i57 = z8 ? 1 : i56;
                    this.f8440F.d();
                    c0525b.d();
                    i11 = i57;
                } else {
                    if (z8) {
                        C0526c c0526c = this.f8447N;
                        R.I i58 = c0526c.g;
                        if (!i58.M()) {
                            AbstractC0508p.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        P8.h[] hVarArr = i58.f8742f;
                        int i59 = i58.g - 1;
                        i58.g = i59;
                        P8.h hVar = hVarArr[i59];
                        hVarArr[i59] = null;
                        R.I i60 = c0526c.f8755f;
                        i60.N(hVar);
                        Object[] objArr7 = i58.j;
                        Object[] objArr8 = i60.j;
                        int i61 = i60.k;
                        int i62 = hVar.f8220c;
                        int i63 = i58.k;
                        int i64 = i63 - i62;
                        System.arraycopy(objArr7, i64, objArr8, i61 - i62, i63 - i64);
                        Object[] objArr9 = i58.j;
                        int i65 = i58.k;
                        Arrays.fill(objArr9, i65 - i62, i65, (Object) null);
                        int[] iArr2 = i58.f8743h;
                        int[] iArr3 = i60.f8743h;
                        int i66 = i60.f8744i;
                        int i67 = hVar.f8219b;
                        int i68 = i58.f8744i;
                        Eb.n.M(i66 - i67, i68 - i67, i68, iArr2, iArr3);
                        i58.k -= i62;
                        i58.f8744i -= i67;
                        i11 = 1;
                    } else {
                        i11 = i7;
                    }
                    if (this.f8440F.k <= 0) {
                        AbstractC0495i0.a("Unbalanced begin/end empty");
                    }
                    r5.k--;
                    C0 c03 = this.f8442H;
                    int i69 = c03.f8295v;
                    c03.i();
                    if (this.f8440F.k <= 0) {
                        int i70 = (-2) - i69;
                        this.f8442H.j();
                        this.f8442H.e(true);
                        C0478a c0478a = this.f8446M;
                        if (this.f8447N.f8755f.L()) {
                            z0 z0Var = this.f8441G;
                            c0525b.c();
                            c0525b.e(false);
                            y0 y0Var7 = c0525b.f8746a.f8440F;
                            if (y0Var7.f8575c > 0) {
                                int i71 = y0Var7.f8580i;
                                C0032v c0032v6 = c0525b.f8749d;
                                if (c0032v6.a(-2) != i71) {
                                    if (!c0525b.f8748c && c0525b.f8750e) {
                                        c0525b.e(false);
                                        C0524a c0524a5 = c0525b.f8747b;
                                        c0524a5.getClass();
                                        c0524a5.f8745f.N(R.q.f8769d);
                                        c0525b.f8748c = true;
                                    }
                                    if (i71 > 0) {
                                        C0478a a10 = y0Var7.a(i71);
                                        c0032v6.c(i71);
                                        c0525b.e(false);
                                        C0524a c0524a6 = c0525b.f8747b;
                                        c0524a6.getClass();
                                        R.p pVar2 = R.p.f8768d;
                                        R.I i72 = c0524a6.f8745f;
                                        i72.N(pVar2);
                                        tc.b.I(i72, 0, a10);
                                        c0525b.f8748c = true;
                                    }
                                }
                            }
                            c0525b.d();
                            C0524a c0524a7 = c0525b.f8747b;
                            c0524a7.getClass();
                            R.s sVar = R.s.f8774d;
                            R.I i73 = c0524a7.f8745f;
                            i73.N(sVar);
                            tc.b.J(i73, 0, c0478a, 1, z0Var);
                            r22 = 0;
                        } else {
                            z0 z0Var2 = this.f8441G;
                            C0526c c0526c2 = this.f8447N;
                            c0525b.c();
                            c0525b.e(false);
                            y0 y0Var8 = c0525b.f8746a.f8440F;
                            if (y0Var8.f8575c > 0) {
                                int i74 = y0Var8.f8580i;
                                C0032v c0032v7 = c0525b.f8749d;
                                if (c0032v7.a(-2) != i74) {
                                    if (!c0525b.f8748c && c0525b.f8750e) {
                                        c0525b.e(false);
                                        C0524a c0524a8 = c0525b.f8747b;
                                        c0524a8.getClass();
                                        c0524a8.f8745f.N(R.q.f8769d);
                                        c0525b.f8748c = true;
                                    }
                                    if (i74 > 0) {
                                        C0478a a11 = y0Var8.a(i74);
                                        c0032v7.c(i74);
                                        c0525b.e(false);
                                        C0524a c0524a9 = c0525b.f8747b;
                                        c0524a9.getClass();
                                        R.p pVar3 = R.p.f8768d;
                                        R.I i75 = c0524a9.f8745f;
                                        i75.N(pVar3);
                                        tc.b.I(i75, 0, a11);
                                        c0525b.f8748c = true;
                                    }
                                }
                            }
                            c0525b.d();
                            C0524a c0524a10 = c0525b.f8747b;
                            c0524a10.getClass();
                            R.t tVar = R.t.f8775d;
                            R.I i76 = c0524a10.f8745f;
                            i76.N(tVar);
                            int i77 = i76.k - i76.f8742f[i76.g - 1].f8220c;
                            Object[] objArr10 = i76.j;
                            objArr10[i77] = c0478a;
                            objArr10[i77 + 1] = z0Var2;
                            objArr10[i77 + 2] = c0526c2;
                            this.f8447N = new C0526c();
                            r22 = 0;
                        }
                        this.f8448O = r22;
                        if (this.f8453c.f8587b != 0) {
                            a0(i70, r22);
                            b0(i70, i11);
                        }
                    }
                }
                ArrayList arrayList9 = this.f8457h;
                c0491g0 = (C0491g0) arrayList9.remove(arrayList9.size() - 1);
                if (c0491g0 != null && !z10) {
                    c0491g0.f8400c++;
                }
                this.f8458i = c0491g0;
                this.j = c0032v.b() + i11;
                this.f8459l = c0032v.b();
                this.k = c0032v.b() + i11;
            }
        }
        c0032v = c0032v3;
        i7 = i23;
        arrayList = arrayList5;
        c0525b = c0525b3;
        z10 = this.f8448O;
        if (!z10) {
        }
        i10 = this.j;
        while (true) {
            y0Var = this.f8440F;
            if (y0Var.k > 0) {
                break;
            }
            E();
            c0525b.f(i10, this.f8440F.p());
            ArrayList arrayList82 = arrayList;
            AbstractC0508p.a(arrayList82, i12, this.f8440F.g);
            i7 = i7;
            arrayList = arrayList82;
        }
        if (z10) {
        }
        ArrayList arrayList92 = this.f8457h;
        c0491g0 = (C0491g0) arrayList92.remove(arrayList92.size() - 1);
        if (c0491g0 != null) {
            c0491g0.f8400c++;
        }
        this.f8458i = c0491g0;
        this.j = c0032v.b() + i11;
        this.f8459l = c0032v.b();
        this.k = c0032v.b() + i11;
    }

    public final void q() {
        p(false);
        C0505n0 v10 = v();
        if (v10 != null) {
            int i7 = v10.f8429a;
            if ((i7 & 1) != 0) {
                v10.f8429a = i7 | 2;
            }
        }
    }

    public final C0505n0 r() {
        boolean z8;
        C0505n0 c0505n0;
        C0478a a9;
        C0503m0 c0503m0;
        ArrayList arrayList = this.f8438D;
        C0505n0 c0505n02 = !arrayList.isEmpty() ? (C0505n0) arrayList.remove(arrayList.size() - 1) : null;
        if (c0505n02 != null) {
            int i7 = c0505n02.f8429a;
            c0505n02.f8429a = i7 & (-9);
            int i10 = this.f8435A;
            C2041D c2041d = c0505n02.f8434f;
            if (c2041d != null && (i7 & 16) == 0) {
                Object[] objArr = c2041d.f24579b;
                int[] iArr = c2041d.f24580c;
                long[] jArr = c2041d.f24578a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    loop0: while (true) {
                        long j = jArr[i11];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j & 255) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = objArr[i14];
                                    if (iArr[i14] != i10) {
                                        c0503m0 = new C0503m0(c0505n02, i10, c2041d);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            c0503m0 = null;
            C0525b c0525b = this.L;
            if (c0503m0 != null) {
                C0524a c0524a = c0525b.f8747b;
                c0524a.getClass();
                R.l lVar = R.l.f8764d;
                R.I i15 = c0524a.f8745f;
                i15.N(lVar);
                tc.b.J(i15, 0, c0503m0, 1, this.g);
            }
            int i16 = c0505n02.f8429a;
            if ((i16 & 512) != 0) {
                c0505n02.f8429a = i16 & (-513);
                C0524a c0524a2 = c0525b.f8747b;
                c0524a2.getClass();
                R.o oVar = R.o.f8767d;
                R.I i17 = c0524a2.f8745f;
                i17.N(oVar);
                tc.b.I(i17, 0, c0505n02);
            }
        }
        if (c0505n02 != null) {
            int i18 = c0505n02.f8429a;
            if ((i18 & 16) == 0 && ((i18 & 1) != 0 || this.f8463p)) {
                if (c0505n02.f8431c == null) {
                    if (this.f8448O) {
                        C0 c02 = this.f8442H;
                        a9 = c02.b(c02.f8295v);
                    } else {
                        y0 y0Var = this.f8440F;
                        a9 = y0Var.a(y0Var.f8580i);
                    }
                    c0505n02.f8431c = a9;
                }
                c0505n02.f8429a &= -5;
                c0505n0 = c0505n02;
                z8 = false;
                p(z8);
                return c0505n0;
            }
        }
        z8 = false;
        c0505n0 = null;
        p(z8);
        return c0505n0;
    }

    public final void s() {
        p(false);
        this.f8452b.b();
        p(false);
        C0525b c0525b = this.L;
        if (c0525b.f8748c) {
            c0525b.e(false);
            c0525b.e(false);
            C0524a c0524a = c0525b.f8747b;
            c0524a.getClass();
            c0524a.f8745f.N(R.m.f8765d);
            c0525b.f8748c = false;
        }
        c0525b.c();
        if (c0525b.f8749d.f313b != 0) {
            AbstractC0508p.c("Missed recording an endGroup()");
        }
        if (!this.f8457h.isEmpty()) {
            AbstractC0508p.c("Start/end imbalance");
        }
        j();
        this.f8440F.c();
        this.f8469v = this.f8470w.b() != 0;
    }

    public final void t(boolean z8, C0491g0 c0491g0) {
        this.f8457h.add(this.f8458i);
        this.f8458i = c0491g0;
        int i7 = this.k;
        C0032v c0032v = this.f8460m;
        c0032v.c(i7);
        c0032v.c(this.f8459l);
        c0032v.c(this.j);
        if (z8) {
            this.j = 0;
        }
        this.k = 0;
        this.f8459l = 0;
    }

    public final void u() {
        z0 z0Var = new z0();
        if (this.f8436B) {
            z0Var.o();
        }
        if (this.f8452b.c()) {
            z0Var.f8596y = new C2070x();
        }
        this.f8441G = z0Var;
        C0 y10 = z0Var.y();
        y10.e(true);
        this.f8442H = y10;
    }

    public final C0505n0 v() {
        if (this.f8473z == 0) {
            ArrayList arrayList = this.f8438D;
            if (!arrayList.isEmpty()) {
                return (C0505n0) h3.o.k(1, arrayList);
            }
        }
        return null;
    }

    public final boolean w() {
        C0505n0 v10;
        return (x() && !this.f8469v && ((v10 = v()) == null || (v10.f8429a & 4) == 0)) ? false : true;
    }

    public final boolean x() {
        C0505n0 v10;
        return (this.f8448O || this.f8471x || this.f8469v || (v10 = v()) == null || (v10.f8429a & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        C0524a c0524a = this.f8456f;
        C0525b c0525b = this.L;
        C0524a c0524a2 = c0525b.f8747b;
        try {
            c0525b.f8747b = c0524a;
            c0524a.f8745f.N(R.z.f8781d);
            if (arrayList.size() > 0) {
                Db.j jVar = (Db.j) arrayList.get(0);
                V v10 = (V) jVar.f3354a;
                v10.getClass();
                throw null;
            }
            C0524a c0524a3 = c0525b.f8747b;
            c0524a3.getClass();
            c0524a3.f8745f.N(R.n.f8766d);
            c0525b.f8751f = 0;
        } finally {
            c0525b.f8747b = c0524a2;
        }
    }

    public final Object z() {
        boolean z8 = this.f8448O;
        S s3 = C0498k.f8409a;
        if (!z8) {
            Object j = this.f8440F.j();
            return (!this.f8471x || (j instanceof C0500l)) ? j : s3;
        }
        if (!this.f8464q) {
            return s3;
        }
        AbstractC0508p.c("A call to createNode(), emitNode() or useNode() expected");
        return s3;
    }
}
