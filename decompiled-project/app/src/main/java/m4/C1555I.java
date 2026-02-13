package m4;

import P4.AbstractC0453a;
import P4.C0454b;
import P4.C0465m;
import P4.C0477z;
import P4.InterfaceC0475x;
import P4.InterfaceC0476y;
import Y5.C0610e0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import ea.C1111f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.C1617n;
import m5.C1620q;
import m5.C1621s;
import m5.InterfaceC1609f;
import n5.AbstractC1705a;
import r4.C1937i;

/* renamed from: m4.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1555I implements Handler.Callback, InterfaceC0475x {

    /* renamed from: A, reason: collision with root package name */
    public final long f19916A;

    /* renamed from: B, reason: collision with root package name */
    public final T8.g f19917B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f19918C;

    /* renamed from: D, reason: collision with root package name */
    public final n5.x f19919D;

    /* renamed from: E, reason: collision with root package name */
    public final C1590t f19920E;

    /* renamed from: F, reason: collision with root package name */
    public final C1568f0 f19921F;

    /* renamed from: G, reason: collision with root package name */
    public final C1584n0 f19922G;

    /* renamed from: H, reason: collision with root package name */
    public final C1573i f19923H;

    /* renamed from: I, reason: collision with root package name */
    public final long f19924I;

    /* renamed from: J, reason: collision with root package name */
    public E0 f19925J;

    /* renamed from: K, reason: collision with root package name */
    public r0 f19926K;
    public C1552F L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f19927M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f19929O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f19930P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f19931Q;

    /* renamed from: R, reason: collision with root package name */
    public int f19932R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f19933S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f19934T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f19935U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f19936V;

    /* renamed from: W, reason: collision with root package name */
    public int f19937W;

    /* renamed from: X, reason: collision with root package name */
    public C1554H f19938X;

    /* renamed from: Y, reason: collision with root package name */
    public long f19939Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f19940Z;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1565e[] f19941a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f19942a0;

    /* renamed from: b, reason: collision with root package name */
    public final Set f19943b;

    /* renamed from: b0, reason: collision with root package name */
    public C1581m f19944b0;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1565e[] f19945c;

    /* renamed from: d, reason: collision with root package name */
    public final k5.u f19947d;

    /* renamed from: e, reason: collision with root package name */
    public final k5.y f19948e;

    /* renamed from: f, reason: collision with root package name */
    public final C1575j f19949f;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC1609f f19950u;

    /* renamed from: v, reason: collision with root package name */
    public final n5.z f19951v;

    /* renamed from: w, reason: collision with root package name */
    public final HandlerThread f19952w;

    /* renamed from: x, reason: collision with root package name */
    public final Looper f19953x;

    /* renamed from: y, reason: collision with root package name */
    public final K0 f19954y;

    /* renamed from: z, reason: collision with root package name */
    public final J0 f19955z;

    /* renamed from: N, reason: collision with root package name */
    public boolean f19928N = false;

    /* renamed from: c0, reason: collision with root package name */
    public long f19946c0 = -9223372036854775807L;

    public C1555I(AbstractC1565e[] abstractC1565eArr, k5.u uVar, k5.y yVar, C1575j c1575j, InterfaceC1609f interfaceC1609f, int i7, boolean z8, n4.f fVar, E0 e02, C1573i c1573i, long j, Looper looper, n5.x xVar, C1590t c1590t, n4.l lVar) {
        this.f19920E = c1590t;
        this.f19941a = abstractC1565eArr;
        this.f19947d = uVar;
        this.f19948e = yVar;
        this.f19949f = c1575j;
        this.f19950u = interfaceC1609f;
        this.f19932R = i7;
        this.f19933S = z8;
        this.f19925J = e02;
        this.f19923H = c1573i;
        this.f19924I = j;
        this.f19919D = xVar;
        this.f19916A = c1575j.g;
        r0 i10 = r0.i(yVar);
        this.f19926K = i10;
        this.L = new C1552F(i10);
        this.f19945c = new AbstractC1565e[abstractC1565eArr.length];
        k5.q qVar = (k5.q) uVar;
        qVar.getClass();
        for (int i11 = 0; i11 < abstractC1565eArr.length; i11++) {
            AbstractC1565e abstractC1565e = abstractC1565eArr[i11];
            abstractC1565e.f20356e = i11;
            abstractC1565e.f20357f = lVar;
            this.f19945c[i11] = abstractC1565e;
            synchronized (abstractC1565e.f20352a) {
                abstractC1565e.f20351B = qVar;
            }
        }
        this.f19917B = new T8.g(this, xVar);
        this.f19918C = new ArrayList();
        this.f19943b = Collections.newSetFromMap(new IdentityHashMap());
        this.f19954y = new K0();
        this.f19955z = new J0();
        uVar.f18963a = this;
        uVar.f18964b = interfaceC1609f;
        this.f19942a0 = true;
        n5.z a9 = xVar.a(looper, null);
        this.f19921F = new C1568f0(fVar, a9);
        this.f19922G = new C1584n0(this, fVar, a9, lVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f19952w = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f19953x = looper2;
        this.f19951v = xVar.a(looper2, this);
    }

    public static Pair E(L0 l02, C1554H c1554h, boolean z8, int i7, boolean z10, K0 k02, J0 j02) {
        Pair i10;
        Object F10;
        L0 l03 = c1554h.f19908a;
        if (l02.p()) {
            return null;
        }
        L0 l04 = l03.p() ? l02 : l03;
        try {
            i10 = l04.i(k02, j02, c1554h.f19909b, c1554h.f19910c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (l02.equals(l04)) {
            return i10;
        }
        if (l02.b(i10.first) != -1) {
            return (l04.g(i10.first, j02).f19968f && l04.m(j02.f19965c, k02, 0L).f20016C == l04.b(i10.first)) ? l02.i(k02, j02, l02.g(i10.first, j02).f19965c, c1554h.f19910c) : i10;
        }
        if (z8 && (F10 = F(k02, j02, i7, z10, i10.first, l04, l02)) != null) {
            return l02.i(k02, j02, l02.g(F10, j02).f19965c, -9223372036854775807L);
        }
        return null;
    }

    public static Object F(K0 k02, J0 j02, int i7, boolean z8, Object obj, L0 l02, L0 l03) {
        int b2 = l02.b(obj);
        int h10 = l02.h();
        int i10 = b2;
        int i11 = -1;
        for (int i12 = 0; i12 < h10 && i11 == -1; i12++) {
            i10 = l02.d(i10, j02, k02, i7, z8);
            if (i10 == -1) {
                break;
            }
            i11 = l03.b(l02.l(i10));
        }
        if (i11 == -1) {
            return null;
        }
        return l03.l(i11);
    }

    public static void L(AbstractC1565e abstractC1565e, long j) {
        abstractC1565e.f20363z = true;
        if (abstractC1565e instanceof a5.l) {
            a5.l lVar = (a5.l) abstractC1565e;
            AbstractC1705a.m(lVar.f20363z);
            lVar.f12778Q = j;
        }
    }

    public static boolean q(AbstractC1565e abstractC1565e) {
        return abstractC1565e.f20358u != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0135  */
    /* JADX WARN: Type inference failed for: r6v17, types: [P4.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(boolean z8, boolean z10, boolean z11, boolean z12) {
        long j;
        boolean z13;
        L0 l02;
        P4.B b2;
        L0 l03;
        List list;
        this.f19951v.f21238a.removeMessages(2);
        this.f19944b0 = null;
        this.f19930P = false;
        T8.g gVar = this.f19917B;
        gVar.f9375b = false;
        C0610e0 c0610e0 = (C0610e0) gVar.f9376c;
        if (c0610e0.f11722a) {
            c0610e0.c(c0610e0.d());
            c0610e0.f11722a = false;
        }
        this.f19939Y = 1000000000000L;
        for (AbstractC1565e abstractC1565e : this.f19941a) {
            try {
                c(abstractC1565e);
            } catch (RuntimeException | C1581m e2) {
                AbstractC1705a.u("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z8) {
            for (AbstractC1565e abstractC1565e2 : this.f19941a) {
                if (this.f19943b.remove(abstractC1565e2)) {
                    try {
                        abstractC1565e2.y();
                    } catch (RuntimeException e10) {
                        AbstractC1705a.u("ExoPlayerImplInternal", "Reset failed.", e10);
                    }
                }
            }
        }
        this.f19937W = 0;
        r0 r0Var = this.f19926K;
        P4.B b10 = r0Var.f20483b;
        long j10 = r0Var.f20496r;
        if (!this.f19926K.f20483b.a()) {
            r0 r0Var2 = this.f19926K;
            J0 j02 = this.f19955z;
            P4.B b11 = r0Var2.f20483b;
            L0 l04 = r0Var2.f20482a;
            if (!l04.p() && !l04.g(b11.f8157a, j02).f19968f) {
                j = this.f19926K.f20496r;
                if (z10) {
                    this.f19938X = null;
                    Pair g = g(this.f19926K.f20482a);
                    b10 = (P4.B) g.first;
                    j10 = ((Long) g.second).longValue();
                    j = -9223372036854775807L;
                    if (!b10.equals(this.f19926K.f20483b)) {
                        z13 = true;
                        long j11 = j10;
                        long j12 = j;
                        this.f19921F.b();
                        this.f19931Q = false;
                        l02 = this.f19926K.f20482a;
                        if (z11 || !(l02 instanceof B0)) {
                            b2 = b10;
                            l03 = l02;
                        } else {
                            B0 b02 = (B0) l02;
                            P4.g0 g0Var = (P4.g0) this.f19922G.k;
                            L0[] l0Arr = b02.f19814v;
                            L0[] l0Arr2 = new L0[l0Arr.length];
                            for (int i7 = 0; i7 < l0Arr.length; i7++) {
                                l0Arr2[i7] = new A0(l0Arr[i7]);
                            }
                            B0 b03 = new B0(l0Arr2, b02.f19815w, g0Var);
                            if (b10.f8158b != -1) {
                                b03.g(b10.f8157a, this.f19955z);
                                int i10 = this.f19955z.f19965c;
                                K0 k02 = this.f19954y;
                                b03.m(i10, k02, 0L);
                                if (k02.a()) {
                                    l03 = b03;
                                    b2 = new C0477z(b10.f8157a, b10.f8160d);
                                }
                            }
                            l03 = b03;
                            b2 = b10;
                        }
                        r0 r0Var3 = this.f19926K;
                        int i11 = r0Var3.f20486e;
                        C1581m c1581m = z12 ? null : r0Var3.f20487f;
                        P4.n0 n0Var = z13 ? P4.n0.f8117d : r0Var3.f20488h;
                        k5.y yVar = z13 ? this.f19948e : r0Var3.f20489i;
                        if (z13) {
                            N6.F f4 = N6.H.f7232b;
                            list = N6.t0.f7341e;
                        } else {
                            list = r0Var3.j;
                        }
                        this.f19926K = new r0(l03, b2, j12, j11, i11, c1581m, false, n0Var, yVar, list, b2, r0Var3.f20490l, r0Var3.f20491m, r0Var3.f20492n, j11, 0L, j11, 0L, false);
                        if (z11) {
                            C1584n0 c1584n0 = this.f19922G;
                            HashMap hashMap = (HashMap) c1584n0.f20447f;
                            for (C1580l0 c1580l0 : hashMap.values()) {
                                try {
                                    c1580l0.f20425a.q(c1580l0.f20426b);
                                } catch (RuntimeException e11) {
                                    AbstractC1705a.u("MediaSourceList", "Failed to release child source.", e11);
                                }
                                AbstractC0453a abstractC0453a = c1580l0.f20425a;
                                C1111f c1111f = c1580l0.f20427c;
                                abstractC0453a.u(c1111f);
                                c1580l0.f20425a.s(c1111f);
                            }
                            hashMap.clear();
                            ((HashSet) c1584n0.f20448h).clear();
                            c1584n0.f20442a = false;
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                long j112 = j10;
                long j122 = j;
                this.f19921F.b();
                this.f19931Q = false;
                l02 = this.f19926K.f20482a;
                if (z11) {
                }
                b2 = b10;
                l03 = l02;
                r0 r0Var32 = this.f19926K;
                int i112 = r0Var32.f20486e;
                C1581m c1581m2 = z12 ? null : r0Var32.f20487f;
                P4.n0 n0Var2 = z13 ? P4.n0.f8117d : r0Var32.f20488h;
                k5.y yVar2 = z13 ? this.f19948e : r0Var32.f20489i;
                if (z13) {
                }
                this.f19926K = new r0(l03, b2, j122, j112, i112, c1581m2, false, n0Var2, yVar2, list, b2, r0Var32.f20490l, r0Var32.f20491m, r0Var32.f20492n, j112, 0L, j112, 0L, false);
                if (z11) {
                }
            }
        }
        j = this.f19926K.f20484c;
        if (z10) {
        }
        z13 = false;
        long j1122 = j10;
        long j1222 = j;
        this.f19921F.b();
        this.f19931Q = false;
        l02 = this.f19926K.f20482a;
        if (z11) {
        }
        b2 = b10;
        l03 = l02;
        r0 r0Var322 = this.f19926K;
        int i1122 = r0Var322.f20486e;
        C1581m c1581m22 = z12 ? null : r0Var322.f20487f;
        P4.n0 n0Var22 = z13 ? P4.n0.f8117d : r0Var322.f20488h;
        k5.y yVar22 = z13 ? this.f19948e : r0Var322.f20489i;
        if (z13) {
        }
        this.f19926K = new r0(l03, b2, j1222, j1122, i1122, c1581m22, false, n0Var22, yVar22, list, b2, r0Var322.f20490l, r0Var322.f20491m, r0Var322.f20492n, j1122, 0L, j1122, 0L, false);
        if (z11) {
        }
    }

    public final void B() {
        C1564d0 c1564d0 = this.f19921F.f20378h;
        this.f19929O = c1564d0 != null && c1564d0.f20343f.f20370h && this.f19928N;
    }

    public final void C(long j) {
        C1564d0 c1564d0 = this.f19921F.f20378h;
        long j10 = j + (c1564d0 == null ? 1000000000000L : c1564d0.f20349o);
        this.f19939Y = j10;
        ((C0610e0) this.f19917B.f9376c).c(j10);
        for (AbstractC1565e abstractC1565e : this.f19941a) {
            if (q(abstractC1565e)) {
                long j11 = this.f19939Y;
                abstractC1565e.f20363z = false;
                abstractC1565e.f20362y = j11;
                abstractC1565e.p(j11, false);
            }
        }
        for (C1564d0 c1564d02 = r0.f20378h; c1564d02 != null; c1564d02 = c1564d02.f20346l) {
            for (k5.s sVar : c1564d02.f20348n.f19019c) {
                if (sVar != null) {
                    sVar.r();
                }
            }
        }
    }

    public final void D(L0 l02, L0 l03) {
        if (l02.p() && l03.p()) {
            return;
        }
        ArrayList arrayList = this.f19918C;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            A3.c.p(arrayList.get(size));
            throw null;
        }
    }

    public final void G(boolean z8) {
        P4.B b2 = this.f19921F.f20378h.f20343f.f20364a;
        long I6 = I(b2, this.f19926K.f20496r, true, false);
        if (I6 != this.f19926K.f20496r) {
            r0 r0Var = this.f19926K;
            this.f19926K = o(b2, I6, r0Var.f20484c, r0Var.f20485d, z8, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, P4.y] */
    public final void H(C1554H c1554h) {
        long j;
        long j10;
        boolean z8;
        P4.B b2;
        long j11;
        long j12;
        long j13;
        r0 r0Var;
        int i7;
        this.L.a(1);
        Pair E10 = E(this.f19926K.f20482a, c1554h, true, this.f19932R, this.f19933S, this.f19954y, this.f19955z);
        if (E10 == null) {
            Pair g = g(this.f19926K.f20482a);
            b2 = (P4.B) g.first;
            long longValue = ((Long) g.second).longValue();
            z8 = !this.f19926K.f20482a.p();
            j = longValue;
            j10 = -9223372036854775807L;
        } else {
            Object obj = E10.first;
            long longValue2 = ((Long) E10.second).longValue();
            long j14 = c1554h.f19910c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            P4.B n6 = this.f19921F.n(this.f19926K.f20482a, obj, longValue2);
            if (n6.a()) {
                this.f19926K.f20482a.g(n6.f8157a, this.f19955z);
                j = this.f19955z.f(n6.f8158b) == n6.f8159c ? this.f19955z.f19969u.f8646b : 0L;
                j10 = j14;
                b2 = n6;
                z8 = true;
            } else {
                j = longValue2;
                j10 = j14;
                z8 = c1554h.f19910c == -9223372036854775807L;
                b2 = n6;
            }
        }
        try {
            if (this.f19926K.f20482a.p()) {
                this.f19938X = c1554h;
            } else {
                if (E10 != null) {
                    if (b2.equals(this.f19926K.f20483b)) {
                        C1564d0 c1564d0 = this.f19921F.f20378h;
                        long c10 = (c1564d0 == null || !c1564d0.f20341d || j == 0) ? j : c1564d0.f20338a.c(j, this.f19925J);
                        if (n5.D.Z(c10) == n5.D.Z(this.f19926K.f20496r) && ((i7 = (r0Var = this.f19926K).f20486e) == 2 || i7 == 3)) {
                            long j15 = r0Var.f20496r;
                            this.f19926K = o(b2, j15, j10, j15, z8, 2);
                            return;
                        }
                        j12 = c10;
                    } else {
                        j12 = j;
                    }
                    boolean z10 = this.f19926K.f20486e == 4;
                    C1568f0 c1568f0 = this.f19921F;
                    long I6 = I(b2, j12, c1568f0.f20378h != c1568f0.f20379i, z10);
                    z8 |= j != I6;
                    try {
                        r0 r0Var2 = this.f19926K;
                        L0 l02 = r0Var2.f20482a;
                        e0(l02, b2, l02, r0Var2.f20483b, j10, true);
                        j13 = I6;
                        this.f19926K = o(b2, j13, j10, j13, z8, 2);
                    } catch (Throwable th) {
                        th = th;
                        j11 = I6;
                        this.f19926K = o(b2, j11, j10, j11, z8, 2);
                        throw th;
                    }
                }
                if (this.f19926K.f20486e != 1) {
                    V(4);
                }
                A(false, true, false, true);
            }
            j13 = j;
            this.f19926K = o(b2, j13, j10, j13, z8, 2);
        } catch (Throwable th2) {
            th = th2;
            j11 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, P4.y] */
    public final long I(P4.B b2, long j, boolean z8, boolean z10) {
        a0();
        this.f19930P = false;
        if (z10 || this.f19926K.f20486e == 3) {
            V(2);
        }
        C1568f0 c1568f0 = this.f19921F;
        C1564d0 c1564d0 = c1568f0.f20378h;
        C1564d0 c1564d02 = c1564d0;
        while (c1564d02 != null && !b2.equals(c1564d02.f20343f.f20364a)) {
            c1564d02 = c1564d02.f20346l;
        }
        if (z8 || c1564d0 != c1564d02 || (c1564d02 != null && c1564d02.f20349o + j < 0)) {
            AbstractC1565e[] abstractC1565eArr = this.f19941a;
            for (AbstractC1565e abstractC1565e : abstractC1565eArr) {
                c(abstractC1565e);
            }
            if (c1564d02 != null) {
                while (c1568f0.f20378h != c1564d02) {
                    c1568f0.a();
                }
                c1568f0.l(c1564d02);
                c1564d02.f20349o = 1000000000000L;
                e(new boolean[abstractC1565eArr.length]);
            }
        }
        if (c1564d02 != null) {
            c1568f0.l(c1564d02);
            if (!c1564d02.f20341d) {
                c1564d02.f20343f = c1564d02.f20343f.b(j);
            } else if (c1564d02.f20342e) {
                ?? r92 = c1564d02.f20338a;
                j = r92.r(j);
                r92.s(j - this.f19916A);
            }
            C(j);
            s();
        } else {
            c1568f0.b();
            C(j);
        }
        k(false);
        this.f19951v.d(2);
        return j;
    }

    public final void J(z0 z0Var) {
        Looper looper = z0Var.f20531f;
        Looper looper2 = this.f19953x;
        n5.z zVar = this.f19951v;
        if (looper != looper2) {
            zVar.a(15, z0Var).b();
            return;
        }
        synchronized (z0Var) {
        }
        try {
            z0Var.f20526a.c(z0Var.f20529d, z0Var.f20530e);
            z0Var.b(true);
            int i7 = this.f19926K.f20486e;
            if (i7 == 3 || i7 == 2) {
                zVar.d(2);
            }
        } catch (Throwable th) {
            z0Var.b(true);
            throw th;
        }
    }

    public final void K(z0 z0Var) {
        Looper looper = z0Var.f20531f;
        if (looper.getThread().isAlive()) {
            this.f19919D.a(looper, null).c(new Aa.j(21, this, z0Var));
        } else {
            AbstractC1705a.S("TAG", "Trying to send message on a dead thread.");
            z0Var.b(false);
        }
    }

    public final void M(boolean z8, AtomicBoolean atomicBoolean) {
        if (this.f19934T != z8) {
            this.f19934T = z8;
            if (!z8) {
                for (AbstractC1565e abstractC1565e : this.f19941a) {
                    if (!q(abstractC1565e) && this.f19943b.remove(abstractC1565e)) {
                        abstractC1565e.y();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void N(C1551E c1551e) {
        this.L.a(1);
        int i7 = c1551e.f19885c;
        ArrayList arrayList = c1551e.f19883a;
        P4.g0 g0Var = c1551e.f19884b;
        if (i7 != -1) {
            this.f19938X = new C1554H(new B0(arrayList, g0Var), c1551e.f19885c, c1551e.f19886d);
        }
        C1584n0 c1584n0 = this.f19922G;
        ArrayList arrayList2 = (ArrayList) c1584n0.f20444c;
        c1584n0.i(0, arrayList2.size());
        l(c1584n0.a(arrayList2.size(), arrayList, g0Var), false);
    }

    public final void O(boolean z8) {
        if (z8 == this.f19936V) {
            return;
        }
        this.f19936V = z8;
        if (z8 || !this.f19926K.f20493o) {
            return;
        }
        this.f19951v.d(2);
    }

    public final void P(boolean z8) {
        this.f19928N = z8;
        B();
        if (this.f19929O) {
            C1568f0 c1568f0 = this.f19921F;
            if (c1568f0.f20379i != c1568f0.f20378h) {
                G(true);
                k(false);
            }
        }
    }

    public final void Q(int i7, int i10, boolean z8, boolean z10) {
        this.L.a(z10 ? 1 : 0);
        C1552F c1552f = this.L;
        c1552f.f19890a = true;
        c1552f.f19895f = true;
        c1552f.g = i10;
        this.f19926K = this.f19926K.d(i7, z8);
        this.f19930P = false;
        for (C1564d0 c1564d0 = this.f19921F.f20378h; c1564d0 != null; c1564d0 = c1564d0.f20346l) {
            for (k5.s sVar : c1564d0.f20348n.f19019c) {
                if (sVar != null) {
                    sVar.a(z8);
                }
            }
        }
        if (!W()) {
            a0();
            d0();
            return;
        }
        int i11 = this.f19926K.f20486e;
        n5.z zVar = this.f19951v;
        if (i11 == 3) {
            Y();
            zVar.d(2);
        } else if (i11 == 2) {
            zVar.d(2);
        }
    }

    public final void R(s0 s0Var) {
        this.f19951v.f21238a.removeMessages(16);
        T8.g gVar = this.f19917B;
        gVar.b(s0Var);
        s0 a9 = gVar.a();
        n(a9, a9.f20501a, true, true);
    }

    public final void S(int i7) {
        this.f19932R = i7;
        L0 l02 = this.f19926K.f20482a;
        C1568f0 c1568f0 = this.f19921F;
        c1568f0.f20377f = i7;
        if (!c1568f0.o(l02)) {
            G(true);
        }
        k(false);
    }

    public final void T(boolean z8) {
        this.f19933S = z8;
        L0 l02 = this.f19926K.f20482a;
        C1568f0 c1568f0 = this.f19921F;
        c1568f0.g = z8;
        if (!c1568f0.o(l02)) {
            G(true);
        }
        k(false);
    }

    public final void U(P4.g0 g0Var) {
        this.L.a(1);
        C1584n0 c1584n0 = this.f19922G;
        int size = ((ArrayList) c1584n0.f20444c).size();
        if (g0Var.f8043b.length != size) {
            g0Var = new P4.g0(new Random(g0Var.f8042a.nextLong())).a(size);
        }
        c1584n0.k = g0Var;
        l(c1584n0.c(), false);
    }

    public final void V(int i7) {
        r0 r0Var = this.f19926K;
        if (r0Var.f20486e != i7) {
            if (i7 != 2) {
                this.f19946c0 = -9223372036854775807L;
            }
            this.f19926K = r0Var.g(i7);
        }
    }

    public final boolean W() {
        r0 r0Var = this.f19926K;
        return r0Var.f20490l && r0Var.f20491m == 0;
    }

    public final boolean X(L0 l02, P4.B b2) {
        if (b2.a() || l02.p()) {
            return false;
        }
        int i7 = l02.g(b2.f8157a, this.f19955z).f19965c;
        K0 k02 = this.f19954y;
        l02.n(i7, k02);
        return k02.a() && k02.f20027w && k02.f20024f != -9223372036854775807L;
    }

    public final void Y() {
        this.f19930P = false;
        T8.g gVar = this.f19917B;
        gVar.f9375b = true;
        ((C0610e0) gVar.f9376c).e();
        for (AbstractC1565e abstractC1565e : this.f19941a) {
            if (q(abstractC1565e)) {
                AbstractC1705a.m(abstractC1565e.f20358u == 1);
                abstractC1565e.f20358u = 2;
                abstractC1565e.s();
            }
        }
    }

    public final void Z(boolean z8, boolean z10) {
        A(z8 || !this.f19934T, false, true, false);
        this.L.a(z10 ? 1 : 0);
        this.f19949f.b(true);
        V(1);
    }

    @Override // P4.InterfaceC0475x
    public final void a(InterfaceC0476y interfaceC0476y) {
        this.f19951v.a(8, interfaceC0476y).b();
    }

    public final void a0() {
        int i7;
        T8.g gVar = this.f19917B;
        gVar.f9375b = false;
        C0610e0 c0610e0 = (C0610e0) gVar.f9376c;
        if (c0610e0.f11722a) {
            c0610e0.c(c0610e0.d());
            c0610e0.f11722a = false;
        }
        for (AbstractC1565e abstractC1565e : this.f19941a) {
            if (q(abstractC1565e) && (i7 = abstractC1565e.f20358u) == 2) {
                AbstractC1705a.m(i7 == 2);
                abstractC1565e.f20358u = 1;
                abstractC1565e.t();
            }
        }
    }

    public final void b(C1551E c1551e, int i7) {
        this.L.a(1);
        C1584n0 c1584n0 = this.f19922G;
        if (i7 == -1) {
            i7 = ((ArrayList) c1584n0.f20444c).size();
        }
        l(c1584n0.a(i7, c1551e.f19883a, c1551e.f19884b), false);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, P4.f0] */
    public final void b0() {
        C1564d0 c1564d0 = this.f19921F.j;
        boolean z8 = this.f19931Q || (c1564d0 != null && c1564d0.f20338a.d());
        r0 r0Var = this.f19926K;
        if (z8 != r0Var.g) {
            this.f19926K = new r0(r0Var.f20482a, r0Var.f20483b, r0Var.f20484c, r0Var.f20485d, r0Var.f20486e, r0Var.f20487f, z8, r0Var.f20488h, r0Var.f20489i, r0Var.j, r0Var.k, r0Var.f20490l, r0Var.f20491m, r0Var.f20492n, r0Var.f20494p, r0Var.f20495q, r0Var.f20496r, r0Var.f20497s, r0Var.f20493o);
        }
    }

    public final void c(AbstractC1565e abstractC1565e) {
        if (q(abstractC1565e)) {
            T8.g gVar = this.f19917B;
            if (abstractC1565e == ((AbstractC1565e) gVar.f9378e)) {
                gVar.f9379f = null;
                gVar.f9378e = null;
                gVar.f9374a = true;
            }
            int i7 = abstractC1565e.f20358u;
            if (i7 == 2) {
                AbstractC1705a.m(i7 == 2);
                abstractC1565e.f20358u = 1;
                abstractC1565e.t();
            }
            AbstractC1705a.m(abstractC1565e.f20358u == 1);
            abstractC1565e.f20354c.clear();
            abstractC1565e.f20358u = 0;
            abstractC1565e.f20359v = null;
            abstractC1565e.f20360w = null;
            abstractC1565e.f20363z = false;
            abstractC1565e.n();
            this.f19937W--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0020. Please report as an issue. */
    public final void c0(k5.y yVar) {
        L0 l02 = this.f19926K.f20482a;
        k5.s[] sVarArr = yVar.f19019c;
        C1575j c1575j = this.f19949f;
        int i7 = c1575j.f20409f;
        if (i7 == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                AbstractC1565e[] abstractC1565eArr = this.f19941a;
                int i12 = 13107200;
                if (i10 < abstractC1565eArr.length) {
                    if (sVarArr[i10] != null) {
                        switch (abstractC1565eArr[i10].f20353b) {
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    i7 = Math.max(13107200, i11);
                }
            }
        }
        c1575j.f20410h = i7;
        c1575j.f20404a.a(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02eb A[EDGE_INSN: B:74:0x02eb->B:75:0x02eb BREAK  A[LOOP:0: B:42:0x028b->B:53:0x02e8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033a  */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, P4.y] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, P4.y] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, P4.f0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, P4.y] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, P4.f0] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, P4.y] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, P4.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z8;
        boolean z10;
        boolean z11;
        long j;
        boolean z12;
        r0 r0Var;
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        boolean z16;
        r0 r0Var2;
        int i10;
        P4.d0 d0Var;
        int i11;
        C1564d0 c1564d0;
        C1564d0 c1564d02;
        boolean z17;
        C1568f0 c1568f0;
        C1564d0 c1564d03;
        C1564d0 c1564d04;
        C1564d0 a9;
        boolean z18;
        int i12;
        boolean z19;
        AbstractC1565e[] abstractC1565eArr;
        C1555I c1555i = this;
        c1555i.f19919D.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        c1555i.f19951v.f21238a.removeMessages(2);
        if (c1555i.f19926K.f20482a.p() || !c1555i.f19922G.f20442a) {
            z8 = true;
        } else {
            C1568f0 c1568f02 = c1555i.f19921F;
            long j10 = c1555i.f19939Y;
            C1564d0 c1564d05 = c1568f02.j;
            if (c1564d05 != null) {
                AbstractC1705a.m(c1564d05.f20346l == null);
                if (c1564d05.f20341d) {
                    c1564d05.f20338a.y(j10 - c1564d05.f20349o);
                }
            }
            C1568f0 c1568f03 = c1555i.f19921F;
            C1564d0 c1564d06 = c1568f03.j;
            if (c1564d06 == null || (!c1564d06.f20343f.f20371i && c1564d06.f20341d && ((!c1564d06.f20342e || c1564d06.f20338a.n() == Long.MIN_VALUE) && c1568f03.j.f20343f.f20368e != -9223372036854775807L && c1568f03.k < 100))) {
                C1568f0 c1568f04 = c1555i.f19921F;
                long j11 = c1555i.f19939Y;
                r0 r0Var3 = c1555i.f19926K;
                C1564d0 c1564d07 = c1568f04.j;
                C1566e0 e2 = c1564d07 == null ? c1568f04.e(r0Var3.f20482a, r0Var3.f20483b, r0Var3.f20484c, r0Var3.f20496r) : c1568f04.d(r0Var3.f20482a, c1564d07, j11);
                if (e2 != null) {
                    C1568f0 c1568f05 = c1555i.f19921F;
                    AbstractC1565e[] abstractC1565eArr2 = c1555i.f19945c;
                    k5.u uVar = c1555i.f19947d;
                    C1620q c1620q = c1555i.f19949f.f20404a;
                    C1584n0 c1584n0 = c1555i.f19922G;
                    k5.y yVar = c1555i.f19948e;
                    C1564d0 c1564d08 = c1568f05.j;
                    C1564d0 c1564d09 = new C1564d0(abstractC1565eArr2, c1564d08 == null ? 1000000000000L : (c1564d08.f20349o + c1564d08.f20343f.f20368e) - e2.f20365b, uVar, c1620q, c1584n0, e2, yVar);
                    C1564d0 c1564d010 = c1568f05.j;
                    if (c1564d010 == null) {
                        c1568f05.f20378h = c1564d09;
                        c1568f05.f20379i = c1564d09;
                    } else if (c1564d09 != c1564d010.f20346l) {
                        c1564d010.b();
                        c1564d010.f20346l = c1564d09;
                        c1564d010.c();
                    }
                    c1568f05.f20380l = null;
                    c1568f05.j = c1564d09;
                    c1568f05.k++;
                    c1568f05.k();
                    c1555i = this;
                    c1564d09.f20338a.q(c1555i, e2.f20365b);
                    if (c1555i.f19921F.f20378h == c1564d09) {
                        c1555i.C(e2.f20365b);
                    }
                    i11 = 0;
                    c1555i.k(false);
                    if (c1555i.f19931Q) {
                        s();
                    } else {
                        c1555i.f19931Q = p();
                        b0();
                    }
                    C1568f0 c1568f06 = c1555i.f19921F;
                    c1564d0 = c1568f06.f20379i;
                    if (c1564d0 != null) {
                        C1564d0 c1564d011 = c1564d0.f20346l;
                        AbstractC1565e[] abstractC1565eArr3 = c1555i.f19941a;
                        if (c1564d011 == null || c1555i.f19929O) {
                            if (c1564d0.f20343f.f20371i || c1555i.f19929O) {
                                for (int i13 = 0; i13 < abstractC1565eArr3.length; i13++) {
                                    AbstractC1565e abstractC1565e = abstractC1565eArr3[i13];
                                    P4.d0 d0Var2 = c1564d0.f20340c[i13];
                                    if (d0Var2 != null && abstractC1565e.f20359v == d0Var2 && abstractC1565e.k()) {
                                        long j12 = c1564d0.f20343f.f20368e;
                                        L(abstractC1565e, (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? -9223372036854775807L : c1564d0.f20349o + j12);
                                    }
                                }
                            }
                        } else if (c1564d0.f20341d) {
                            int i14 = i11;
                            while (true) {
                                if (i14 < abstractC1565eArr3.length) {
                                    AbstractC1565e abstractC1565e2 = abstractC1565eArr3[i14];
                                    P4.d0 d0Var3 = c1564d0.f20340c[i14];
                                    if (abstractC1565e2.f20359v != d0Var3) {
                                        break;
                                    }
                                    if (d0Var3 != null && !abstractC1565e2.k()) {
                                        C1564d0 c1564d012 = c1564d0.f20346l;
                                        if (!c1564d0.f20343f.f20369f) {
                                            break;
                                        }
                                        if (!c1564d012.f20341d) {
                                            break;
                                        }
                                        if (!(abstractC1565e2 instanceof a5.l) && !(abstractC1565e2 instanceof F4.f) && abstractC1565e2.f20362y < c1564d012.e()) {
                                            break;
                                        }
                                    }
                                    i14++;
                                } else {
                                    C1564d0 c1564d013 = c1564d0.f20346l;
                                    if (c1564d013.f20341d || c1555i.f19939Y >= c1564d013.e()) {
                                        k5.y yVar2 = c1564d0.f20348n;
                                        C1564d0 c1564d014 = c1568f06.f20379i;
                                        AbstractC1705a.m((c1564d014 == null || c1564d014.f20346l == null) ? i11 : 1);
                                        c1568f06.f20379i = c1568f06.f20379i.f20346l;
                                        c1568f06.k();
                                        C1564d0 c1564d015 = c1568f06.f20379i;
                                        k5.y yVar3 = c1564d015.f20348n;
                                        L0 l02 = c1555i.f19926K.f20482a;
                                        e0(l02, c1564d015.f20343f.f20364a, l02, c1564d0.f20343f.f20364a, -9223372036854775807L, false);
                                        if (!c1564d015.f20341d || c1564d015.f20338a.k() == -9223372036854775807L) {
                                            for (int i15 = 0; i15 < abstractC1565eArr3.length; i15++) {
                                                boolean b2 = yVar2.b(i15);
                                                boolean b10 = yVar3.b(i15);
                                                if (b2 && !abstractC1565eArr3[i15].f20363z) {
                                                    boolean z20 = c1555i.f19945c[i15].f20353b == -2;
                                                    D0 d02 = yVar2.f19018b[i15];
                                                    D0 d03 = yVar3.f19018b[i15];
                                                    if (!b10 || !d03.equals(d02) || z20) {
                                                        L(abstractC1565eArr3[i15], c1564d015.e());
                                                    }
                                                }
                                            }
                                        } else {
                                            long e10 = c1564d015.e();
                                            for (AbstractC1565e abstractC1565e3 : abstractC1565eArr3) {
                                                if (abstractC1565e3.f20359v != null) {
                                                    L(abstractC1565e3, e10);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C1568f0 c1568f07 = c1555i.f19921F;
                        c1564d02 = c1568f07.f20379i;
                        if (c1564d02 != null && c1568f07.f20378h != c1564d02 && !c1564d02.g) {
                            k5.y yVar4 = c1564d02.f20348n;
                            i12 = 0;
                            z19 = false;
                            while (true) {
                                abstractC1565eArr = c1555i.f19941a;
                                if (i12 < abstractC1565eArr.length) {
                                    break;
                                }
                                AbstractC1565e abstractC1565e4 = abstractC1565eArr[i12];
                                if (q(abstractC1565e4)) {
                                    P4.d0 d0Var4 = abstractC1565e4.f20359v;
                                    P4.d0[] d0VarArr = c1564d02.f20340c;
                                    boolean z21 = d0Var4 != d0VarArr[i12];
                                    if (!yVar4.b(i12) || z21) {
                                        if (!abstractC1565e4.f20363z) {
                                            k5.s sVar = yVar4.f19019c[i12];
                                            int length = sVar != null ? sVar.length() : 0;
                                            L[] lArr = new L[length];
                                            for (int i16 = 0; i16 < length; i16++) {
                                                lArr[i16] = sVar.d(i16);
                                            }
                                            abstractC1565e4.x(lArr, d0VarArr[i12], c1564d02.e(), c1564d02.f20349o);
                                        } else if (abstractC1565e4.l()) {
                                            c1555i.c(abstractC1565e4);
                                        } else {
                                            z19 = true;
                                        }
                                    }
                                }
                                i12++;
                            }
                            if (!z19) {
                                c1555i.e(new boolean[abstractC1565eArr.length]);
                            }
                        }
                        z17 = false;
                        while (W() && !c1555i.f19929O && (c1564d03 = (c1568f0 = c1555i.f19921F).f20378h) != null && (c1564d04 = c1564d03.f20346l) != null && c1555i.f19939Y >= c1564d04.e() && c1564d04.g) {
                            if (z17) {
                                t();
                            }
                            a9 = c1568f0.a();
                            a9.getClass();
                            if (c1555i.f19926K.f20483b.f8157a.equals(a9.f20343f.f20364a.f8157a)) {
                                P4.B b11 = c1555i.f19926K.f20483b;
                                if (b11.f8158b == -1) {
                                    P4.B b12 = a9.f20343f.f20364a;
                                    if (b12.f8158b == -1 && b11.f8161e != b12.f8161e) {
                                        z18 = true;
                                        C1566e0 c1566e0 = a9.f20343f;
                                        P4.B b13 = c1566e0.f20364a;
                                        long j13 = c1566e0.f20365b;
                                        long j14 = c1566e0.f20366c;
                                        z17 = true;
                                        c1555i.f19926K = o(b13, j13, j14, j13, !z18, 0);
                                        B();
                                        d0();
                                    }
                                }
                            }
                            z18 = false;
                            C1566e0 c1566e02 = a9.f20343f;
                            P4.B b132 = c1566e02.f20364a;
                            long j132 = c1566e02.f20365b;
                            long j142 = c1566e02.f20366c;
                            z17 = true;
                            c1555i.f19926K = o(b132, j132, j142, j132, !z18, 0);
                            B();
                            d0();
                        }
                        z8 = true;
                    }
                    C1568f0 c1568f072 = c1555i.f19921F;
                    c1564d02 = c1568f072.f20379i;
                    if (c1564d02 != null) {
                        k5.y yVar42 = c1564d02.f20348n;
                        i12 = 0;
                        z19 = false;
                        while (true) {
                            abstractC1565eArr = c1555i.f19941a;
                            if (i12 < abstractC1565eArr.length) {
                            }
                            i12++;
                        }
                        if (!z19) {
                        }
                    }
                    z17 = false;
                    while (W()) {
                        if (z17) {
                        }
                        a9 = c1568f0.a();
                        a9.getClass();
                        if (c1555i.f19926K.f20483b.f8157a.equals(a9.f20343f.f20364a.f8157a)) {
                        }
                        z18 = false;
                        C1566e0 c1566e022 = a9.f20343f;
                        P4.B b1322 = c1566e022.f20364a;
                        long j1322 = c1566e022.f20365b;
                        long j1422 = c1566e022.f20366c;
                        z17 = true;
                        c1555i.f19926K = o(b1322, j1322, j1422, j1322, !z18, 0);
                        B();
                        d0();
                    }
                    z8 = true;
                }
            }
            i11 = 0;
            if (c1555i.f19931Q) {
            }
            C1568f0 c1568f062 = c1555i.f19921F;
            c1564d0 = c1568f062.f20379i;
            if (c1564d0 != null) {
            }
            C1568f0 c1568f0722 = c1555i.f19921F;
            c1564d02 = c1568f0722.f20379i;
            if (c1564d02 != null) {
            }
            z17 = false;
            while (W()) {
            }
            z8 = true;
        }
        int i17 = c1555i.f19926K.f20486e;
        if (i17 == z8 || i17 == 4) {
            return;
        }
        C1564d0 c1564d016 = c1555i.f19921F.f20378h;
        if (c1564d016 == null) {
            c1555i.f19951v.f21238a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
            return;
        }
        AbstractC1705a.c("doSomeWork");
        d0();
        if (c1564d016.f20341d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c1564d016.f20338a.s(c1555i.f19926K.f20496r - c1555i.f19916A);
            boolean z22 = z8;
            z10 = z22;
            int i18 = 0;
            while (true) {
                AbstractC1565e[] abstractC1565eArr4 = c1555i.f19941a;
                if (i18 >= abstractC1565eArr4.length) {
                    break;
                }
                AbstractC1565e abstractC1565e5 = abstractC1565eArr4[i18];
                if (q(abstractC1565e5)) {
                    abstractC1565e5.w(c1555i.f19939Y, elapsedRealtime);
                    z22 = (z22 && abstractC1565e5.l()) ? z8 : false;
                    boolean z23 = c1564d016.f20340c[i18] != abstractC1565e5.f20359v ? z8 : false;
                    boolean z24 = (z23 || ((z23 || !abstractC1565e5.k()) ? false : z8) || abstractC1565e5.m() || abstractC1565e5.l()) ? z8 : false;
                    z10 = (z10 && z24) ? z8 : false;
                    if (!z24) {
                        P4.d0 d0Var5 = abstractC1565e5.f20359v;
                        d0Var5.getClass();
                        d0Var5.a();
                    }
                }
                i18++;
            }
            z11 = z22;
        } else {
            c1564d016.f20338a.o();
            z10 = z8;
            z11 = z10;
        }
        long j15 = c1564d016.f20343f.f20368e;
        if (z11 && c1564d016.f20341d) {
            j = -9223372036854775807L;
            if (j15 == -9223372036854775807L || j15 <= c1555i.f19926K.f20496r) {
                z12 = z8;
                if (z12 && c1555i.f19929O) {
                    c1555i.f19929O = false;
                    c1555i.Q(c1555i.f19926K.f20491m, 5, false, false);
                }
                if (z12 || !c1564d016.f20343f.f20371i) {
                    r0Var = c1555i.f19926K;
                    if (r0Var.f20486e == 2) {
                        if (c1555i.f19937W == 0) {
                            z13 = r();
                        } else if (!z10) {
                            z13 = false;
                        } else if (r0Var.g) {
                            C1568f0 c1568f08 = c1555i.f19921F;
                            long j16 = c1555i.X(r0Var.f20482a, c1568f08.f20378h.f20343f.f20364a) ? c1555i.f19923H.f20394h : j;
                            C1564d0 c1564d017 = c1568f08.j;
                            boolean z25 = (!c1564d017.f20341d || (c1564d017.f20342e && c1564d017.f20338a.n() != Long.MIN_VALUE) || !c1564d017.f20343f.f20371i) ? false : z8;
                            boolean z26 = c1564d017.f20343f.f20364a.a() && !c1564d017.f20341d;
                            if (!z25 && !z26) {
                                r0 r0Var4 = c1555i.f19926K;
                                L0 l03 = r0Var4.f20482a;
                                long j17 = r0Var4.f20494p;
                                C1564d0 c1564d018 = c1555i.f19921F.j;
                                long max = c1564d018 == null ? 0L : Math.max(0L, j17 - (c1555i.f19939Y - c1564d018.f20349o));
                                float f4 = c1555i.f19917B.a().f20501a;
                                boolean z27 = c1555i.f19930P;
                                C1575j c1575j = c1555i.f19949f;
                                c1575j.getClass();
                                long A10 = n5.D.A(max, f4);
                                long j18 = z27 ? c1575j.f20408e : c1575j.f20407d;
                                if (j16 != -9223372036854775807L) {
                                    j18 = Math.min(j16 / 2, j18);
                                }
                                if (j18 > 0 && A10 < j18) {
                                    C1620q c1620q2 = c1575j.f20404a;
                                    synchronized (c1620q2) {
                                        i7 = c1620q2.f20638d * c1620q2.f20636b;
                                    }
                                    if (i7 < c1575j.f20410h) {
                                        z13 = false;
                                    }
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = z8;
                        }
                        if (z13) {
                            c1555i.V(3);
                            c1555i.f19944b0 = null;
                            if (W()) {
                                Y();
                            }
                        }
                    }
                    if (c1555i.f19926K.f20486e == 3 && (c1555i.f19937W != 0 ? !z10 : !r())) {
                        c1555i.f19930P = W();
                        c1555i.V(2);
                        if (c1555i.f19930P) {
                            for (C1564d0 c1564d019 = c1555i.f19921F.f20378h; c1564d019 != null; c1564d019 = c1564d019.f20346l) {
                                for (k5.s sVar2 : c1564d019.f20348n.f19019c) {
                                    if (sVar2 != null) {
                                        sVar2.t();
                                    }
                                }
                            }
                            C1573i c1573i = c1555i.f19923H;
                            long j19 = c1573i.f20394h;
                            if (j19 != -9223372036854775807L) {
                                long j20 = j19 + c1573i.f20389b;
                                c1573i.f20394h = j20;
                                long j21 = c1573i.g;
                                if (j21 != -9223372036854775807L && j20 > j21) {
                                    c1573i.f20394h = j21;
                                }
                                c1573i.f20396l = -9223372036854775807L;
                            }
                        }
                        a0();
                    }
                } else {
                    c1555i.V(4);
                    a0();
                }
                if (c1555i.f19926K.f20486e == 2) {
                    int i19 = 0;
                    while (true) {
                        AbstractC1565e[] abstractC1565eArr5 = c1555i.f19941a;
                        if (i19 >= abstractC1565eArr5.length) {
                            break;
                        }
                        if (q(abstractC1565eArr5[i19]) && (d0Var = c1555i.f19941a[i19].f20359v) == c1564d016.f20340c[i19]) {
                            d0Var.getClass();
                            d0Var.a();
                        }
                        i19++;
                    }
                    r0 r0Var5 = c1555i.f19926K;
                    if (!r0Var5.g && r0Var5.f20495q < 500000 && p()) {
                        z14 = true;
                        if (!z14) {
                            c1555i.f19946c0 = -9223372036854775807L;
                        } else if (c1555i.f19946c0 == -9223372036854775807L) {
                            c1555i.f19919D.getClass();
                            c1555i.f19946c0 = SystemClock.elapsedRealtime();
                        } else {
                            c1555i.f19919D.getClass();
                            if (SystemClock.elapsedRealtime() - c1555i.f19946c0 >= 4000) {
                                throw new IllegalStateException("Playback stuck buffering and not loading");
                            }
                        }
                        z15 = !W() && c1555i.f19926K.f20486e == 3;
                        z16 = !c1555i.f19936V && c1555i.f19935U && z15;
                        r0Var2 = c1555i.f19926K;
                        if (r0Var2.f20493o != z16) {
                            c1555i.f19926K = new r0(r0Var2.f20482a, r0Var2.f20483b, r0Var2.f20484c, r0Var2.f20485d, r0Var2.f20486e, r0Var2.f20487f, r0Var2.g, r0Var2.f20488h, r0Var2.f20489i, r0Var2.j, r0Var2.k, r0Var2.f20490l, r0Var2.f20491m, r0Var2.f20492n, r0Var2.f20494p, r0Var2.f20495q, r0Var2.f20496r, r0Var2.f20497s, z16);
                        }
                        c1555i.f19935U = false;
                        if (!z16 && (i10 = c1555i.f19926K.f20486e) != 4) {
                            if (!z15 || i10 == 2) {
                                c1555i.f19951v.f21238a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
                            } else if (i10 == 3 && c1555i.f19937W != 0) {
                                c1555i.f19951v.f21238a.sendEmptyMessageAtTime(2, uptimeMillis + 1000);
                            }
                        }
                        AbstractC1705a.v();
                    }
                }
                z14 = false;
                if (!z14) {
                }
                if (W()) {
                }
                if (c1555i.f19936V) {
                }
                r0Var2 = c1555i.f19926K;
                if (r0Var2.f20493o != z16) {
                }
                c1555i.f19935U = false;
                if (!z16) {
                    if (z15) {
                    }
                    c1555i.f19951v.f21238a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
                }
                AbstractC1705a.v();
            }
        } else {
            j = -9223372036854775807L;
        }
        z12 = false;
        if (z12) {
            c1555i.f19929O = false;
            c1555i.Q(c1555i.f19926K.f20491m, 5, false, false);
        }
        if (z12) {
        }
        r0Var = c1555i.f19926K;
        if (r0Var.f20486e == 2) {
        }
        if (c1555i.f19926K.f20486e == 3) {
            c1555i.f19930P = W();
            c1555i.V(2);
            if (c1555i.f19930P) {
            }
            a0();
        }
        if (c1555i.f19926K.f20486e == 2) {
        }
        z14 = false;
        if (!z14) {
        }
        if (W()) {
        }
        if (c1555i.f19936V) {
        }
        r0Var2 = c1555i.f19926K;
        if (r0Var2.f20493o != z16) {
        }
        c1555i.f19935U = false;
        if (!z16) {
        }
        AbstractC1705a.v();
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, P4.y] */
    public final void d0() {
        C1564d0 c1564d0 = this.f19921F.f20378h;
        if (c1564d0 == null) {
            return;
        }
        long k = c1564d0.f20341d ? c1564d0.f20338a.k() : -9223372036854775807L;
        if (k != -9223372036854775807L) {
            C(k);
            if (k != this.f19926K.f20496r) {
                r0 r0Var = this.f19926K;
                this.f19926K = o(r0Var.f20483b, k, r0Var.f20484c, k, true, 5);
            }
        } else {
            T8.g gVar = this.f19917B;
            boolean z8 = c1564d0 != this.f19921F.f20379i;
            AbstractC1565e abstractC1565e = (AbstractC1565e) gVar.f9378e;
            C0610e0 c0610e0 = (C0610e0) gVar.f9376c;
            if (abstractC1565e == null || abstractC1565e.l() || (!((AbstractC1565e) gVar.f9378e).m() && (z8 || ((AbstractC1565e) gVar.f9378e).k()))) {
                gVar.f9374a = true;
                if (gVar.f9375b) {
                    c0610e0.e();
                }
            } else {
                n5.n nVar = (n5.n) gVar.f9379f;
                nVar.getClass();
                long d10 = nVar.d();
                if (gVar.f9374a) {
                    if (d10 >= c0610e0.d()) {
                        gVar.f9374a = false;
                        if (gVar.f9375b) {
                            c0610e0.e();
                        }
                    } else if (c0610e0.f11722a) {
                        c0610e0.c(c0610e0.d());
                        c0610e0.f11722a = false;
                    }
                }
                c0610e0.c(d10);
                s0 a9 = nVar.a();
                if (!a9.equals((s0) c0610e0.f11726e)) {
                    c0610e0.b(a9);
                    ((C1555I) gVar.f9377d).f19951v.a(16, a9).b();
                }
            }
            long d11 = gVar.d();
            this.f19939Y = d11;
            long j = d11 - c1564d0.f20349o;
            long j10 = this.f19926K.f20496r;
            if (!this.f19918C.isEmpty() && !this.f19926K.f20483b.a()) {
                if (this.f19942a0) {
                    this.f19942a0 = false;
                }
                r0 r0Var2 = this.f19926K;
                r0Var2.f20482a.b(r0Var2.f20483b.f8157a);
                int min = Math.min(this.f19940Z, this.f19918C.size());
                if (min > 0 && this.f19918C.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f19918C.size() && this.f19918C.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f19940Z = min;
            }
            r0 r0Var3 = this.f19926K;
            r0Var3.f20496r = j;
            r0Var3.f20497s = SystemClock.elapsedRealtime();
        }
        this.f19926K.f20494p = this.f19921F.j.d();
        r0 r0Var4 = this.f19926K;
        long j11 = r0Var4.f20494p;
        C1564d0 c1564d02 = this.f19921F.j;
        r0Var4.f20495q = c1564d02 == null ? 0L : Math.max(0L, j11 - (this.f19939Y - c1564d02.f20349o));
        r0 r0Var5 = this.f19926K;
        if (r0Var5.f20490l && r0Var5.f20486e == 3 && X(r0Var5.f20482a, r0Var5.f20483b)) {
            r0 r0Var6 = this.f19926K;
            float f4 = 1.0f;
            if (r0Var6.f20492n.f20501a == 1.0f) {
                C1573i c1573i = this.f19923H;
                long f10 = f(r0Var6.f20482a, r0Var6.f20483b.f8157a, r0Var6.f20496r);
                long j12 = this.f19926K.f20494p;
                C1564d0 c1564d03 = this.f19921F.j;
                long max = c1564d03 == null ? 0L : Math.max(0L, j12 - (this.f19939Y - c1564d03.f20349o));
                if (c1573i.f20390c != -9223372036854775807L) {
                    long j13 = f10 - max;
                    if (c1573i.f20397m == -9223372036854775807L) {
                        c1573i.f20397m = j13;
                        c1573i.f20398n = 0L;
                    } else {
                        c1573i.f20397m = Math.max(j13, (((float) j13) * 9.999871E-4f) + (((float) r12) * 0.999f));
                        c1573i.f20398n = (9.999871E-4f * ((float) Math.abs(j13 - r13))) + (0.999f * ((float) c1573i.f20398n));
                    }
                    if (c1573i.f20396l == -9223372036854775807L || SystemClock.elapsedRealtime() - c1573i.f20396l >= 1000) {
                        c1573i.f20396l = SystemClock.elapsedRealtime();
                        long j14 = (c1573i.f20398n * 3) + c1573i.f20397m;
                        if (c1573i.f20394h > j14) {
                            float M3 = (float) n5.D.M(1000L);
                            long[] jArr = {j14, c1573i.f20392e, c1573i.f20394h - (((c1573i.k - 1.0f) * M3) + ((c1573i.f20395i - 1.0f) * M3))};
                            long j15 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j16 = jArr[i7];
                                if (j16 > j15) {
                                    j15 = j16;
                                }
                            }
                            c1573i.f20394h = j15;
                        } else {
                            long j17 = n5.D.j(f10 - (Math.max(0.0f, c1573i.k - 1.0f) / 1.0E-7f), c1573i.f20394h, j14);
                            c1573i.f20394h = j17;
                            long j18 = c1573i.g;
                            if (j18 != -9223372036854775807L && j17 > j18) {
                                c1573i.f20394h = j18;
                            }
                        }
                        long j19 = f10 - c1573i.f20394h;
                        if (Math.abs(j19) < c1573i.f20388a) {
                            c1573i.k = 1.0f;
                        } else {
                            c1573i.k = n5.D.h((1.0E-7f * ((float) j19)) + 1.0f, c1573i.j, c1573i.f20395i);
                        }
                        f4 = c1573i.k;
                    } else {
                        f4 = c1573i.k;
                    }
                }
                if (this.f19917B.a().f20501a != f4) {
                    s0 s0Var = new s0(f4, this.f19926K.f20492n.f20502b);
                    this.f19951v.f21238a.removeMessages(16);
                    this.f19917B.b(s0Var);
                    n(this.f19926K.f20492n, this.f19917B.a().f20501a, false, false);
                }
            }
        }
    }

    public final void e(boolean[] zArr) {
        AbstractC1565e[] abstractC1565eArr;
        Set set;
        C1568f0 c1568f0;
        C1564d0 c1564d0;
        int i7;
        AbstractC1565e[] abstractC1565eArr2;
        n5.n nVar;
        C1568f0 c1568f02 = this.f19921F;
        C1564d0 c1564d02 = c1568f02.f20379i;
        k5.y yVar = c1564d02.f20348n;
        int i10 = 0;
        while (true) {
            abstractC1565eArr = this.f19941a;
            int length = abstractC1565eArr.length;
            set = this.f19943b;
            if (i10 >= length) {
                break;
            }
            if (!yVar.b(i10) && set.remove(abstractC1565eArr[i10])) {
                abstractC1565eArr[i10].y();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < abstractC1565eArr.length) {
            if (yVar.b(i11)) {
                boolean z8 = zArr[i11];
                AbstractC1565e abstractC1565e = abstractC1565eArr[i11];
                if (!q(abstractC1565e)) {
                    C1564d0 c1564d03 = c1568f02.f20379i;
                    boolean z10 = c1564d03 == c1568f02.f20378h;
                    k5.y yVar2 = c1564d03.f20348n;
                    D0 d02 = yVar2.f19018b[i11];
                    k5.s sVar = yVar2.f19019c[i11];
                    int length2 = sVar != null ? sVar.length() : 0;
                    L[] lArr = new L[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        lArr[i12] = sVar.d(i12);
                    }
                    boolean z11 = W() && this.f19926K.f20486e == 3;
                    boolean z12 = !z8 && z11;
                    this.f19937W++;
                    set.add(abstractC1565e);
                    P4.d0 d0Var = c1564d03.f20340c[i11];
                    c1568f0 = c1568f02;
                    c1564d0 = c1564d02;
                    long j = this.f19939Y;
                    long e2 = c1564d03.e();
                    i7 = i11;
                    abstractC1565eArr2 = abstractC1565eArr;
                    long j10 = c1564d03.f20349o;
                    AbstractC1705a.m(abstractC1565e.f20358u == 0);
                    abstractC1565e.f20355d = d02;
                    abstractC1565e.f20358u = 1;
                    abstractC1565e.o(z12, z10);
                    abstractC1565e.x(lArr, d0Var, e2, j10);
                    abstractC1565e.f20363z = false;
                    abstractC1565e.f20362y = j;
                    abstractC1565e.p(j, z12);
                    abstractC1565e.c(11, new C1550D(this));
                    T8.g gVar = this.f19917B;
                    gVar.getClass();
                    n5.n i13 = abstractC1565e.i();
                    if (i13 != null && i13 != (nVar = (n5.n) gVar.f9379f)) {
                        if (nVar != null) {
                            throw new C1581m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        gVar.f9379f = i13;
                        gVar.f9378e = abstractC1565e;
                        ((o4.L) i13).b((s0) ((C0610e0) gVar.f9376c).f11726e);
                    }
                    if (z11) {
                        AbstractC1705a.m(abstractC1565e.f20358u == 1);
                        abstractC1565e.f20358u = 2;
                        abstractC1565e.s();
                    }
                    i11 = i7 + 1;
                    c1568f02 = c1568f0;
                    c1564d02 = c1564d0;
                    abstractC1565eArr = abstractC1565eArr2;
                }
            }
            c1568f0 = c1568f02;
            c1564d0 = c1564d02;
            i7 = i11;
            abstractC1565eArr2 = abstractC1565eArr;
            i11 = i7 + 1;
            c1568f02 = c1568f0;
            c1564d02 = c1564d0;
            abstractC1565eArr = abstractC1565eArr2;
        }
        c1564d02.g = true;
    }

    public final void e0(L0 l02, P4.B b2, L0 l03, P4.B b10, long j, boolean z8) {
        if (!X(l02, b2)) {
            s0 s0Var = b2.a() ? s0.f20500d : this.f19926K.f20492n;
            T8.g gVar = this.f19917B;
            if (gVar.a().equals(s0Var)) {
                return;
            }
            this.f19951v.f21238a.removeMessages(16);
            gVar.b(s0Var);
            n(this.f19926K.f20492n, s0Var.f20501a, false, false);
            return;
        }
        Object obj = b2.f8157a;
        J0 j02 = this.f19955z;
        int i7 = l02.g(obj, j02).f19965c;
        K0 k02 = this.f19954y;
        l02.n(i7, k02);
        U u3 = k02.f20029y;
        int i10 = n5.D.f21141a;
        C1573i c1573i = this.f19923H;
        c1573i.getClass();
        c1573i.f20390c = n5.D.M(u3.f20164a);
        c1573i.f20393f = n5.D.M(u3.f20165b);
        c1573i.g = n5.D.M(u3.f20166c);
        float f4 = u3.f20167d;
        if (f4 == -3.4028235E38f) {
            f4 = 0.97f;
        }
        c1573i.j = f4;
        float f10 = u3.f20168e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        c1573i.f20395i = f10;
        if (f4 == 1.0f && f10 == 1.0f) {
            c1573i.f20390c = -9223372036854775807L;
        }
        c1573i.a();
        if (j != -9223372036854775807L) {
            c1573i.f20391d = f(l02, obj, j);
            c1573i.a();
            return;
        }
        if (!n5.D.a(!l03.p() ? l03.m(l03.g(b10.f8157a, j02).f19965c, k02, 0L).f20019a : null, k02.f20019a) || z8) {
            c1573i.f20391d = -9223372036854775807L;
            c1573i.a();
        }
    }

    public final long f(L0 l02, Object obj, long j) {
        J0 j02 = this.f19955z;
        int i7 = l02.g(obj, j02).f19965c;
        K0 k02 = this.f19954y;
        l02.n(i7, k02);
        if (k02.f20024f != -9223372036854775807L && k02.a() && k02.f20027w) {
            return n5.D.M(n5.D.x(k02.f20025u) - k02.f20024f) - (j + j02.f19967e);
        }
        return -9223372036854775807L;
    }

    public final synchronized void f0(C0465m c0465m, long j) {
        this.f19919D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z8 = false;
        while (!((Boolean) c0465m.get()).booleanValue() && j > 0) {
            try {
                this.f19919D.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z8 = true;
            }
            this.f19919D.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair g(L0 l02) {
        if (l02.p()) {
            return Pair.create(r0.f20481t, 0L);
        }
        Pair i7 = l02.i(this.f19954y, this.f19955z, l02.a(this.f19933S), -9223372036854775807L);
        P4.B n6 = this.f19921F.n(l02, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (n6.a()) {
            Object obj = n6.f8157a;
            J0 j02 = this.f19955z;
            l02.g(obj, j02);
            longValue = n6.f8159c == j02.f(n6.f8158b) ? j02.f19969u.f8646b : 0L;
        }
        return Pair.create(n6, Long.valueOf(longValue));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, P4.f0] */
    public final void h(InterfaceC0476y interfaceC0476y) {
        C1564d0 c1564d0 = this.f19921F.j;
        if (c1564d0 == null || c1564d0.f20338a != interfaceC0476y) {
            return;
        }
        long j = this.f19939Y;
        if (c1564d0 != null) {
            AbstractC1705a.m(c1564d0.f20346l == null);
            if (c1564d0.f20341d) {
                c1564d0.f20338a.y(j - c1564d0.f20349o);
            }
        }
        s();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7;
        C1564d0 c1564d0;
        C1564d0 c1564d02;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    Q(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    H((C1554H) message.obj);
                    break;
                case 4:
                    R((s0) message.obj);
                    break;
                case 5:
                    this.f19925J = (E0) message.obj;
                    break;
                case 6:
                    Z(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    m((InterfaceC0476y) message.obj);
                    break;
                case 9:
                    h((InterfaceC0476y) message.obj);
                    break;
                case 10:
                    z();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    S(message.arg1);
                    break;
                case 12:
                    T(message.arg1 != 0);
                    break;
                case 13:
                    M(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    z0 z0Var = (z0) message.obj;
                    z0Var.getClass();
                    J(z0Var);
                    break;
                case 15:
                    K((z0) message.obj);
                    break;
                case 16:
                    s0 s0Var = (s0) message.obj;
                    n(s0Var, s0Var.f20501a, true, false);
                    break;
                case 17:
                    N((C1551E) message.obj);
                    break;
                case 18:
                    b((C1551E) message.obj, message.arg1);
                    break;
                case 19:
                    A3.c.p(message.obj);
                    v();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (P4.g0) message.obj);
                    break;
                case 21:
                    U((P4.g0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    P(message.arg1 != 0);
                    break;
                case 24:
                    O(message.arg1 == 1);
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    z();
                    G(true);
                    break;
                case 26:
                    z();
                    G(true);
                    break;
                default:
                    return false;
            }
        } catch (C0454b e2) {
            j(e2, 1002);
        } catch (RuntimeException e10) {
            C1581m c1581m = new C1581m(2, e10, ((e10 instanceof IllegalStateException) || (e10 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC1705a.u("ExoPlayerImplInternal", "Playback error", c1581m);
            Z(true, false);
            this.f19926K = this.f19926K.e(c1581m);
        } catch (C1581m e11) {
            e = e11;
            int i10 = e.f20428c;
            C1568f0 c1568f0 = this.f19921F;
            if (i10 == 1 && (c1564d02 = c1568f0.f20379i) != null) {
                e = e.a(c1564d02.f20343f.f20364a);
            }
            if (e.f20434w && this.f19944b0 == null) {
                AbstractC1705a.R(e, "ExoPlayerImplInternal", "Recoverable renderer error");
                this.f19944b0 = e;
                n5.z zVar = this.f19951v;
                n5.y a9 = zVar.a(25, e);
                zVar.getClass();
                Message message2 = a9.f21236a;
                message2.getClass();
                zVar.f21238a.sendMessageAtFrontOfQueue(message2);
                a9.a();
            } else {
                C1581m c1581m2 = this.f19944b0;
                if (c1581m2 != null) {
                    c1581m2.addSuppressed(e);
                    e = this.f19944b0;
                }
                AbstractC1705a.u("ExoPlayerImplInternal", "Playback error", e);
                if (e.f20428c == 1 && c1568f0.f20378h != c1568f0.f20379i) {
                    while (true) {
                        c1564d0 = c1568f0.f20378h;
                        if (c1564d0 == c1568f0.f20379i) {
                            break;
                        }
                        c1568f0.a();
                    }
                    c1564d0.getClass();
                    C1566e0 c1566e0 = c1564d0.f20343f;
                    P4.B b2 = c1566e0.f20364a;
                    long j = c1566e0.f20365b;
                    this.f19926K = o(b2, j, c1566e0.f20366c, j, true, 0);
                }
                Z(true, false);
                this.f19926K = this.f19926K.e(e);
            }
        } catch (C1586o0 e12) {
            boolean z8 = e12.f20469a;
            int i11 = e12.f20470b;
            if (i11 == 1) {
                i7 = z8 ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i7 = z8 ? 3002 : 3004;
                }
                j(e12, r3);
            }
            r3 = i7;
            j(e12, r3);
        } catch (C1617n e13) {
            j(e13, e13.f20621a);
        } catch (C1937i e14) {
            j(e14, e14.f23765a);
        } catch (IOException e15) {
            j(e15, 2000);
        }
        t();
        return true;
    }

    @Override // P4.e0
    public final void i(P4.f0 f0Var) {
        this.f19951v.a(9, (InterfaceC0476y) f0Var).b();
    }

    public final void j(IOException iOException, int i7) {
        C1581m c1581m = new C1581m(0, iOException, i7);
        C1564d0 c1564d0 = this.f19921F.f20378h;
        if (c1564d0 != null) {
            c1581m = c1581m.a(c1564d0.f20343f.f20364a);
        }
        AbstractC1705a.u("ExoPlayerImplInternal", "Playback error", c1581m);
        Z(false, false);
        this.f19926K = this.f19926K.e(c1581m);
    }

    public final void k(boolean z8) {
        C1564d0 c1564d0 = this.f19921F.j;
        P4.B b2 = c1564d0 == null ? this.f19926K.f20483b : c1564d0.f20343f.f20364a;
        boolean equals = this.f19926K.k.equals(b2);
        if (!equals) {
            this.f19926K = this.f19926K.b(b2);
        }
        r0 r0Var = this.f19926K;
        r0Var.f20494p = c1564d0 == null ? r0Var.f20496r : c1564d0.d();
        r0 r0Var2 = this.f19926K;
        long j = r0Var2.f20494p;
        C1564d0 c1564d02 = this.f19921F.j;
        r0Var2.f20495q = c1564d02 != null ? Math.max(0L, j - (this.f19939Y - c1564d02.f20349o)) : 0L;
        if ((!equals || z8) && c1564d0 != null && c1564d0.f20341d) {
            c0(c1564d0.f20348n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x01ee, code lost:
    
        if (r5.e(r6, r9) != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01f0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01fe, code lost:
    
        if (r5.h(r3.f8158b) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e7 A[Catch: all -> 0x02ec, TryCatch #4 {all -> 0x02ec, blocks: (B:67:0x02e1, B:69:0x02e7, B:16:0x02fb, B:18:0x0306, B:20:0x030c, B:22:0x0316, B:24:0x0323, B:27:0x0326, B:30:0x0331), top: B:14:0x0280 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(L0 l02, boolean z8) {
        int i7;
        int i10;
        P4.B b2;
        long j;
        int i11;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        long j11;
        long j12;
        C1553G c1553g;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i15;
        boolean z18;
        long j13;
        long j14;
        long j15;
        r0 r0Var = this.f19926K;
        C1554H c1554h = this.f19938X;
        C1568f0 c1568f0 = this.f19921F;
        int i16 = this.f19932R;
        boolean z19 = this.f19933S;
        K0 k02 = this.f19954y;
        J0 j02 = this.f19955z;
        if (l02.p()) {
            c1553g = new C1553G(r0.f20481t, 0L, -9223372036854775807L, false, true, false);
            j = 0;
            i10 = -1;
            i7 = 4;
        } else {
            P4.B b10 = r0Var.f20483b;
            Object obj = b10.f8157a;
            L0 l03 = r0Var.f20482a;
            boolean z20 = l03.p() || l03.g(b10.f8157a, j02).f19968f;
            long j16 = (r0Var.f20483b.a() || z20) ? r0Var.f20484c : r0Var.f20496r;
            if (c1554h != null) {
                i7 = 4;
                Pair E10 = E(l02, c1554h, true, i16, z19, k02, j02);
                if (E10 == null) {
                    i14 = l02.a(z19);
                    j10 = j16;
                    z16 = false;
                    z15 = false;
                    z17 = true;
                } else {
                    if (c1554h.f19910c == -9223372036854775807L) {
                        i14 = l02.g(E10.first, j02).f19965c;
                        j10 = j16;
                        z14 = false;
                    } else {
                        obj = E10.first;
                        j10 = ((Long) E10.second).longValue();
                        i14 = -1;
                        z14 = true;
                    }
                    z15 = r0Var.f20486e == 4;
                    z16 = z14;
                    z17 = false;
                }
                z12 = z16;
                z10 = z15;
                z11 = z17;
                b2 = b10;
                i10 = -1;
                j = 0;
                i11 = i14;
            } else {
                i7 = 4;
                if (r0Var.f20482a.p()) {
                    i11 = l02.a(z19);
                    j10 = j16;
                    b2 = b10;
                    i10 = -1;
                } else {
                    i10 = -1;
                    if (l02.b(obj) == -1) {
                        Object F10 = F(k02, j02, i16, z19, obj, r0Var.f20482a, l02);
                        if (F10 == null) {
                            i12 = l02.a(z19);
                            z13 = true;
                        } else {
                            i12 = l02.g(F10, j02).f19965c;
                            z13 = false;
                        }
                        i11 = i12;
                        z11 = z13;
                        j10 = j16;
                        b2 = b10;
                        j = 0;
                        z10 = false;
                        z12 = false;
                    } else if (j16 == -9223372036854775807L) {
                        i11 = l02.g(obj, j02).f19965c;
                        j10 = j16;
                        b2 = b10;
                    } else if (z20) {
                        b2 = b10;
                        r0Var.f20482a.g(b2.f8157a, j02);
                        if (r0Var.f20482a.m(j02.f19965c, k02, 0L).f20016C == r0Var.f20482a.b(b2.f8157a)) {
                            j = 0;
                            Pair i17 = l02.i(k02, j02, l02.g(obj, j02).f19965c, j16 + j02.f19967e);
                            obj = i17.first;
                            j10 = ((Long) i17.second).longValue();
                        } else {
                            j = 0;
                            j10 = j16;
                        }
                        i11 = -1;
                        z10 = false;
                        z11 = false;
                        z12 = true;
                    } else {
                        b2 = b10;
                        j = 0;
                        i11 = -1;
                        j10 = j16;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                    }
                }
                j = 0;
                z10 = false;
                z11 = false;
                z12 = false;
            }
            if (i11 != i10) {
                Pair i18 = l02.i(k02, j02, i11, -9223372036854775807L);
                obj = i18.first;
                j10 = ((Long) i18.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                j11 = j10;
            }
            P4.B n6 = c1568f0.n(l02, obj, j10);
            int i19 = n6.f8161e;
            boolean z21 = b2.f8157a.equals(obj) && !b2.a() && !n6.a() && (i19 == i10 || ((i13 = b2.f8161e) != i10 && i19 >= i13));
            J0 g = l02.g(obj, j02);
            if (!z20 && j16 == j11 && b2.f8157a.equals(n6.f8157a)) {
                if (b2.a()) {
                    int i20 = b2.f8158b;
                    if (g.h(i20)) {
                        int i21 = b2.f8159c;
                        if (g.e(i20, i21) != i7) {
                        }
                    }
                }
                if (n6.a()) {
                }
            }
            boolean z22 = false;
            if (z21 || z22) {
                n6 = b2;
            }
            if (!n6.a()) {
                j12 = j10;
            } else if (n6.equals(b2)) {
                j12 = r0Var.f20496r;
            } else {
                l02.g(n6.f8157a, j02);
                j12 = n6.f8159c == j02.f(n6.f8158b) ? j02.f19969u.f8646b : j;
            }
            c1553g = new C1553G(n6, j12, j11, z10, z11, z12);
        }
        P4.B b11 = c1553g.f19901a;
        long j17 = c1553g.f19903c;
        boolean z23 = c1553g.f19904d;
        long j18 = c1553g.f19902b;
        int i22 = i7;
        boolean z24 = (this.f19926K.f20483b.equals(b11) && j18 == this.f19926K.f20496r) ? false : true;
        try {
            if (c1553g.f19905e) {
                try {
                    z18 = true;
                    if (this.f19926K.f20486e != 1) {
                        V(i22);
                    }
                    A(false, false, false, true);
                } catch (Throwable th) {
                    th = th;
                    i15 = i10;
                    j = j17;
                    j17 = j18;
                    r0 r0Var2 = this.f19926K;
                    e0(l02, b11, r0Var2.f20482a, r0Var2.f20483b, !c1553g.f19906f ? j17 : -9223372036854775807L, false);
                    if (!z24) {
                    }
                    r0 r0Var3 = this.f19926K;
                    Object obj2 = r0Var3.f20483b.f8157a;
                    L0 l04 = r0Var3.f20482a;
                    if (z24) {
                    }
                    this.f19926K = o(b11, j17, j, this.f19926K.f20485d, (z24 || !z8 || l04.p() || l04.g(obj2, this.f19955z).f19968f) ? false : true, l02.b(obj2) != i15 ? 4 : 3);
                    B();
                    D(l02, this.f19926K.f20482a);
                    this.f19926K = this.f19926K.h(l02);
                    if (!l02.p()) {
                    }
                    k(false);
                    throw th;
                }
            } else {
                z18 = true;
            }
            try {
                if (z24) {
                    boolean z25 = z18;
                    j = j17;
                    j15 = j18;
                    if (!l02.p()) {
                        for (C1564d0 c1564d0 = this.f19921F.f20378h; c1564d0 != null; c1564d0 = c1564d0.f20346l) {
                            if (c1564d0.f20343f.f20364a.equals(b11)) {
                                c1564d0.f20343f = this.f19921F.h(l02, c1564d0.f20343f);
                                c1564d0.h();
                            }
                        }
                        C1568f0 c1568f02 = this.f19921F;
                        j15 = I(b11, j15, c1568f02.f20378h != c1568f02.f20379i ? z25 : false, z23);
                    }
                } else {
                    try {
                        C1568f0 c1568f03 = this.f19921F;
                        long j19 = this.f19939Y;
                        C1564d0 c1564d02 = c1568f03.f20379i;
                        if (c1564d02 == null) {
                            j13 = j18;
                            j14 = j;
                        } else {
                            j13 = j18;
                            try {
                                long j20 = c1564d02.f20349o;
                                if (c1564d02.f20341d) {
                                    int i23 = 0;
                                    while (true) {
                                        AbstractC1565e[] abstractC1565eArr = this.f19941a;
                                        if (i23 >= abstractC1565eArr.length) {
                                            j = j17;
                                            j14 = j20;
                                            break;
                                        }
                                        if (q(abstractC1565eArr[i23])) {
                                            AbstractC1565e abstractC1565e = abstractC1565eArr[i23];
                                            j = j17;
                                            try {
                                                if (abstractC1565e.f20359v == c1564d02.f20340c[i23]) {
                                                    long j21 = abstractC1565e.f20362y;
                                                    j14 = Long.MIN_VALUE;
                                                    if (j21 == Long.MIN_VALUE) {
                                                        break;
                                                    } else {
                                                        j20 = Math.max(j21, j20);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                j17 = j13;
                                                i15 = -1;
                                                r0 r0Var22 = this.f19926K;
                                                e0(l02, b11, r0Var22.f20482a, r0Var22.f20483b, !c1553g.f19906f ? j17 : -9223372036854775807L, false);
                                                if (!z24 || j != this.f19926K.f20484c) {
                                                    r0 r0Var32 = this.f19926K;
                                                    Object obj22 = r0Var32.f20483b.f8157a;
                                                    L0 l042 = r0Var32.f20482a;
                                                    this.f19926K = o(b11, j17, j, this.f19926K.f20485d, (z24 || !z8 || l042.p() || l042.g(obj22, this.f19955z).f19968f) ? false : true, l02.b(obj22) != i15 ? 4 : 3);
                                                }
                                                B();
                                                D(l02, this.f19926K.f20482a);
                                                this.f19926K = this.f19926K.h(l02);
                                                if (!l02.p()) {
                                                    this.f19938X = null;
                                                }
                                                k(false);
                                                throw th;
                                            }
                                        } else {
                                            j = j17;
                                        }
                                        i23++;
                                        j17 = j;
                                    }
                                    j15 = j13;
                                    if (!c1568f03.p(l02, j19, j14)) {
                                        G(false);
                                    }
                                } else {
                                    j14 = j20;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                j = j17;
                            }
                        }
                        j = j17;
                        j15 = j13;
                        if (!c1568f03.p(l02, j19, j14)) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j = j17;
                        j17 = j18;
                    }
                }
                r0 r0Var4 = this.f19926K;
                e0(l02, b11, r0Var4.f20482a, r0Var4.f20483b, c1553g.f19906f ? j15 : -9223372036854775807L, false);
                if (z24 || j != this.f19926K.f20484c) {
                    r0 r0Var5 = this.f19926K;
                    Object obj3 = r0Var5.f20483b.f8157a;
                    L0 l05 = r0Var5.f20482a;
                    this.f19926K = o(b11, j15, j, this.f19926K.f20485d, z24 && z8 && !l05.p() && !l05.g(obj3, this.f19955z).f19968f, l02.b(obj3) == -1 ? 4 : 3);
                }
                B();
                D(l02, this.f19926K.f20482a);
                this.f19926K = this.f19926K.h(l02);
                if (!l02.p()) {
                    this.f19938X = null;
                }
                k(false);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, P4.y] */
    public final void m(InterfaceC0476y interfaceC0476y) {
        C1568f0 c1568f0 = this.f19921F;
        C1564d0 c1564d0 = c1568f0.j;
        if (c1564d0 == null || c1564d0.f20338a != interfaceC0476y) {
            return;
        }
        float f4 = this.f19917B.a().f20501a;
        L0 l02 = this.f19926K.f20482a;
        c1564d0.f20341d = true;
        c1564d0.f20347m = c1564d0.f20338a.l();
        k5.y g = c1564d0.g(f4, l02);
        C1566e0 c1566e0 = c1564d0.f20343f;
        long j = c1566e0.f20368e;
        long j10 = c1566e0.f20365b;
        long a9 = c1564d0.a(g, (j == -9223372036854775807L || j10 < j) ? j10 : Math.max(0L, j - 1), false, new boolean[c1564d0.f20345i.length]);
        long j11 = c1564d0.f20349o;
        C1566e0 c1566e02 = c1564d0.f20343f;
        c1564d0.f20349o = (c1566e02.f20365b - a9) + j11;
        c1564d0.f20343f = c1566e02.b(a9);
        c0(c1564d0.f20348n);
        if (c1564d0 == c1568f0.f20378h) {
            C(c1564d0.f20343f.f20365b);
            e(new boolean[this.f19941a.length]);
            r0 r0Var = this.f19926K;
            P4.B b2 = r0Var.f20483b;
            long j12 = c1564d0.f20343f.f20365b;
            this.f19926K = o(b2, j12, r0Var.f20484c, j12, false, 5);
        }
        s();
    }

    public final void n(s0 s0Var, float f4, boolean z8, boolean z10) {
        int i7;
        if (z8) {
            if (z10) {
                this.L.a(1);
            }
            this.f19926K = this.f19926K.f(s0Var);
        }
        float f10 = s0Var.f20501a;
        C1564d0 c1564d0 = this.f19921F.f20378h;
        while (true) {
            i7 = 0;
            if (c1564d0 == null) {
                break;
            }
            k5.s[] sVarArr = c1564d0.f20348n.f19019c;
            int length = sVarArr.length;
            while (i7 < length) {
                k5.s sVar = sVarArr[i7];
                if (sVar != null) {
                    sVar.p(f10);
                }
                i7++;
            }
            c1564d0 = c1564d0.f20346l;
        }
        AbstractC1565e[] abstractC1565eArr = this.f19941a;
        int length2 = abstractC1565eArr.length;
        while (i7 < length2) {
            AbstractC1565e abstractC1565e = abstractC1565eArr[i7];
            if (abstractC1565e != null) {
                abstractC1565e.z(f4, s0Var.f20501a);
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [N6.B, N6.E] */
    public final r0 o(P4.B b2, long j, long j10, long j11, boolean z8, int i7) {
        P4.n0 n0Var;
        k5.y yVar;
        List list;
        N6.t0 t0Var;
        int i10;
        this.f19942a0 = (!this.f19942a0 && j == this.f19926K.f20496r && b2.equals(this.f19926K.f20483b)) ? false : true;
        B();
        r0 r0Var = this.f19926K;
        P4.n0 n0Var2 = r0Var.f20488h;
        k5.y yVar2 = r0Var.f20489i;
        List list2 = r0Var.j;
        if (this.f19922G.f20442a) {
            C1564d0 c1564d0 = this.f19921F.f20378h;
            P4.n0 n0Var3 = c1564d0 == null ? P4.n0.f8117d : c1564d0.f20347m;
            k5.y yVar3 = c1564d0 == null ? this.f19948e : c1564d0.f20348n;
            k5.s[] sVarArr = yVar3.f19019c;
            ?? b10 = new N6.B();
            int length = sVarArr.length;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < length) {
                k5.s sVar = sVarArr[i11];
                if (sVar != null) {
                    F4.c cVar = sVar.d(0).f20094x;
                    if (cVar == null) {
                        b10.a(new F4.c(new F4.b[0]));
                    } else {
                        b10.a(cVar);
                        i10 = 1;
                        z10 = true;
                        i11 += i10;
                    }
                }
                i10 = 1;
                i11 += i10;
            }
            if (z10) {
                t0Var = b10.h();
            } else {
                N6.F f4 = N6.H.f7232b;
                t0Var = N6.t0.f7341e;
            }
            if (c1564d0 != null) {
                C1566e0 c1566e0 = c1564d0.f20343f;
                if (c1566e0.f20366c != j10) {
                    c1564d0.f20343f = c1566e0.a(j10);
                }
            }
            list = t0Var;
            n0Var = n0Var3;
            yVar = yVar3;
        } else if (b2.equals(r0Var.f20483b)) {
            n0Var = n0Var2;
            yVar = yVar2;
            list = list2;
        } else {
            n0Var = P4.n0.f8117d;
            yVar = this.f19948e;
            list = N6.t0.f7341e;
        }
        if (z8) {
            C1552F c1552f = this.L;
            if (!c1552f.f19893d || c1552f.f19894e == 5) {
                c1552f.f19890a = true;
                c1552f.f19893d = true;
                c1552f.f19894e = i7;
            } else {
                AbstractC1705a.h(i7 == 5);
            }
        }
        r0 r0Var2 = this.f19926K;
        long j12 = r0Var2.f20494p;
        C1564d0 c1564d02 = this.f19921F.j;
        return r0Var2.c(b2, j, j10, j11, c1564d02 == null ? 0L : Math.max(0L, j12 - (this.f19939Y - c1564d02.f20349o)), n0Var, yVar, list);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, P4.f0] */
    public final boolean p() {
        C1564d0 c1564d0 = this.f19921F.j;
        if (c1564d0 == null) {
            return false;
        }
        return (!c1564d0.f20341d ? 0L : c1564d0.f20338a.j()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        C1564d0 c1564d0 = this.f19921F.f20378h;
        long j = c1564d0.f20343f.f20368e;
        return c1564d0.f20341d && (j == -9223372036854775807L || this.f19926K.f20496r < j || !W());
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, P4.y] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, P4.f0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, P4.f0] */
    public final void s() {
        boolean c10;
        if (p()) {
            C1564d0 c1564d0 = this.f19921F.j;
            long j = !c1564d0.f20341d ? 0L : c1564d0.f20338a.j();
            C1564d0 c1564d02 = this.f19921F.j;
            long max = c1564d02 == null ? 0L : Math.max(0L, j - (this.f19939Y - c1564d02.f20349o));
            C1564d0 c1564d03 = this.f19921F.f20378h;
            c10 = this.f19949f.c(max, this.f19917B.a().f20501a);
            if (!c10 && max < 500000 && this.f19916A > 0) {
                this.f19921F.f20378h.f20338a.s(this.f19926K.f20496r);
                c10 = this.f19949f.c(max, this.f19917B.a().f20501a);
            }
        } else {
            c10 = false;
        }
        this.f19931Q = c10;
        if (c10) {
            C1564d0 c1564d04 = this.f19921F.j;
            long j10 = this.f19939Y;
            AbstractC1705a.m(c1564d04.f20346l == null);
            c1564d04.f20338a.x(j10 - c1564d04.f20349o);
        }
        b0();
    }

    public final void t() {
        C1552F c1552f = this.L;
        r0 r0Var = this.f19926K;
        boolean z8 = c1552f.f19890a | (c1552f.f19891b != r0Var);
        c1552f.f19890a = z8;
        c1552f.f19891b = r0Var;
        if (z8) {
            C1549C c1549c = this.f19920E.f20504a;
            c1549c.getClass();
            c1549c.f19871w.c(new Aa.j(20, c1549c, c1552f));
            this.L = new C1552F(this.f19926K);
        }
    }

    public final void u() {
        l(this.f19922G.c(), true);
    }

    public final void v() {
        this.L.a(1);
        throw null;
    }

    public final void w() {
        this.L.a(1);
        int i7 = 0;
        A(false, false, false, true);
        this.f19949f.b(false);
        V(this.f19926K.f20482a.p() ? 4 : 2);
        C1621s c1621s = (C1621s) this.f19950u;
        c1621s.getClass();
        C1584n0 c1584n0 = this.f19922G;
        AbstractC1705a.m(!c1584n0.f20442a);
        c1584n0.f20450l = c1621s;
        while (true) {
            ArrayList arrayList = (ArrayList) c1584n0.f20444c;
            if (i7 >= arrayList.size()) {
                c1584n0.f20442a = true;
                this.f19951v.d(2);
                return;
            } else {
                C1582m0 c1582m0 = (C1582m0) arrayList.get(i7);
                c1584n0.g(c1582m0);
                ((HashSet) c1584n0.f20448h).add(c1582m0);
                i7++;
            }
        }
    }

    public final void x() {
        A(true, false, true, false);
        for (int i7 = 0; i7 < this.f19941a.length; i7++) {
            AbstractC1565e abstractC1565e = this.f19945c[i7];
            synchronized (abstractC1565e.f20352a) {
                abstractC1565e.f20351B = null;
            }
            AbstractC1565e abstractC1565e2 = this.f19941a[i7];
            AbstractC1705a.m(abstractC1565e2.f20358u == 0);
            abstractC1565e2.q();
        }
        this.f19949f.b(true);
        V(1);
        HandlerThread handlerThread = this.f19952w;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f19927M = true;
            notifyAll();
        }
    }

    public final void y(int i7, int i10, P4.g0 g0Var) {
        this.L.a(1);
        C1584n0 c1584n0 = this.f19922G;
        c1584n0.getClass();
        AbstractC1705a.h(i7 >= 0 && i7 <= i10 && i10 <= ((ArrayList) c1584n0.f20444c).size());
        c1584n0.k = g0Var;
        c1584n0.i(i7, i10);
        l(c1584n0.c(), false);
    }

    public final void z() {
        float f4 = this.f19917B.a().f20501a;
        C1568f0 c1568f0 = this.f19921F;
        C1564d0 c1564d0 = c1568f0.f20378h;
        C1564d0 c1564d02 = c1568f0.f20379i;
        boolean z8 = true;
        for (C1564d0 c1564d03 = c1564d0; c1564d03 != null && c1564d03.f20341d; c1564d03 = c1564d03.f20346l) {
            k5.y g = c1564d03.g(f4, this.f19926K.f20482a);
            k5.y yVar = c1564d03.f20348n;
            if (yVar != null) {
                int length = yVar.f19019c.length;
                k5.s[] sVarArr = g.f19019c;
                if (length == sVarArr.length) {
                    for (int i7 = 0; i7 < sVarArr.length; i7++) {
                        if (g.a(yVar, i7)) {
                        }
                    }
                    if (c1564d03 == c1564d02) {
                        z8 = false;
                    }
                }
            }
            if (z8) {
                C1568f0 c1568f02 = this.f19921F;
                C1564d0 c1564d04 = c1568f02.f20378h;
                boolean l10 = c1568f02.l(c1564d04);
                boolean[] zArr = new boolean[this.f19941a.length];
                long a9 = c1564d04.a(g, this.f19926K.f20496r, l10, zArr);
                r0 r0Var = this.f19926K;
                boolean z10 = (r0Var.f20486e == 4 || a9 == r0Var.f20496r) ? false : true;
                r0 r0Var2 = this.f19926K;
                this.f19926K = o(r0Var2.f20483b, a9, r0Var2.f20484c, r0Var2.f20485d, z10, 5);
                if (z10) {
                    C(a9);
                }
                boolean[] zArr2 = new boolean[this.f19941a.length];
                int i10 = 0;
                while (true) {
                    AbstractC1565e[] abstractC1565eArr = this.f19941a;
                    if (i10 >= abstractC1565eArr.length) {
                        break;
                    }
                    AbstractC1565e abstractC1565e = abstractC1565eArr[i10];
                    boolean q10 = q(abstractC1565e);
                    zArr2[i10] = q10;
                    P4.d0 d0Var = c1564d04.f20340c[i10];
                    if (q10) {
                        if (d0Var != abstractC1565e.f20359v) {
                            c(abstractC1565e);
                        } else if (zArr[i10]) {
                            long j = this.f19939Y;
                            abstractC1565e.f20363z = false;
                            abstractC1565e.f20362y = j;
                            abstractC1565e.p(j, false);
                            i10++;
                        }
                    }
                    i10++;
                }
                e(zArr2);
            } else {
                this.f19921F.l(c1564d03);
                if (c1564d03.f20341d) {
                    c1564d03.a(g, Math.max(c1564d03.f20343f.f20365b, this.f19939Y - c1564d03.f20349o), false, new boolean[c1564d03.f20345i.length]);
                }
            }
            k(true);
            if (this.f19926K.f20486e != 4) {
                s();
                d0();
                this.f19951v.d(2);
                return;
            }
            return;
        }
    }
}
