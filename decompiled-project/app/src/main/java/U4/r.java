package U4;

import A9.S2;
import N6.F;
import N6.t0;
import N6.y0;
import P4.C0454b;
import P4.C0463k;
import P4.C0474w;
import P4.b0;
import P4.f0;
import P4.m0;
import P4.n0;
import Y5.B;
import Z9.x;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import i2.C1312U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m4.K;
import m4.L;
import m5.C1599C;
import m5.C1619p;
import m5.C1620q;
import m5.H;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.InterfaceC1616m;
import m5.J;
import m5.S;
import n5.AbstractC1705a;
import n5.C1704A;
import n5.D;
import r4.C1936h;
import r4.C1941m;
import s4.C1981i;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class r implements InterfaceC1601E, H, f0, InterfaceC1984l, b0 {

    /* renamed from: m0, reason: collision with root package name */
    public static final Set f9623m0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public final P3.p f9624A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f9625B;

    /* renamed from: C, reason: collision with root package name */
    public final List f9626C;

    /* renamed from: D, reason: collision with root package name */
    public final o f9627D;

    /* renamed from: E, reason: collision with root package name */
    public final o f9628E;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f9629F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f9630G;

    /* renamed from: H, reason: collision with root package name */
    public final Map f9631H;

    /* renamed from: I, reason: collision with root package name */
    public R4.e f9632I;

    /* renamed from: J, reason: collision with root package name */
    public q[] f9633J;

    /* renamed from: K, reason: collision with root package name */
    public int[] f9634K;
    public final HashSet L;

    /* renamed from: M, reason: collision with root package name */
    public final SparseIntArray f9635M;

    /* renamed from: N, reason: collision with root package name */
    public p f9636N;

    /* renamed from: O, reason: collision with root package name */
    public int f9637O;

    /* renamed from: P, reason: collision with root package name */
    public int f9638P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f9639Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f9640R;

    /* renamed from: S, reason: collision with root package name */
    public int f9641S;

    /* renamed from: T, reason: collision with root package name */
    public L f9642T;

    /* renamed from: U, reason: collision with root package name */
    public L f9643U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f9644V;

    /* renamed from: W, reason: collision with root package name */
    public n0 f9645W;

    /* renamed from: X, reason: collision with root package name */
    public Set f9646X;

    /* renamed from: Y, reason: collision with root package name */
    public int[] f9647Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f9648Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f9649a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f9650a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f9651b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean[] f9652b0;

    /* renamed from: c, reason: collision with root package name */
    public final C0463k f9653c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean[] f9654c0;

    /* renamed from: d, reason: collision with root package name */
    public final i f9655d;

    /* renamed from: d0, reason: collision with root package name */
    public long f9656d0;

    /* renamed from: e, reason: collision with root package name */
    public final C1620q f9657e;

    /* renamed from: e0, reason: collision with root package name */
    public long f9658e0;

    /* renamed from: f, reason: collision with root package name */
    public final L f9659f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f9660f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9661g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f9662h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f9663i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f9664j0;

    /* renamed from: k0, reason: collision with root package name */
    public C1936h f9665k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f9666l0;

    /* renamed from: u, reason: collision with root package name */
    public final r4.q f9667u;

    /* renamed from: v, reason: collision with root package name */
    public final C1941m f9668v;

    /* renamed from: w, reason: collision with root package name */
    public final B f9669w;

    /* renamed from: x, reason: collision with root package name */
    public final J f9670x = new J("Loader:HlsSampleStreamWrapper");

    /* renamed from: y, reason: collision with root package name */
    public final A4.s f9671y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9672z;

    /* JADX WARN: Type inference failed for: r1v12, types: [U4.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [U4.o] */
    public r(String str, int i7, C0463k c0463k, i iVar, Map map, C1620q c1620q, long j, L l10, r4.q qVar, C1941m c1941m, B b2, A4.s sVar, int i10) {
        this.f9649a = str;
        this.f9651b = i7;
        this.f9653c = c0463k;
        this.f9655d = iVar;
        this.f9631H = map;
        this.f9657e = c1620q;
        this.f9659f = l10;
        this.f9667u = qVar;
        this.f9668v = c1941m;
        this.f9669w = b2;
        this.f9671y = sVar;
        this.f9672z = i10;
        P3.p pVar = new P3.p(4, false);
        pVar.f7842c = null;
        pVar.f7841b = false;
        pVar.f7843d = null;
        this.f9624A = pVar;
        this.f9634K = new int[0];
        Set set = f9623m0;
        this.L = new HashSet(set.size());
        this.f9635M = new SparseIntArray(set.size());
        this.f9633J = new q[0];
        this.f9654c0 = new boolean[0];
        this.f9652b0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f9625B = arrayList;
        this.f9626C = Collections.unmodifiableList(arrayList);
        this.f9630G = new ArrayList();
        final int i11 = 0;
        this.f9627D = new Runnable(this) { // from class: U4.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f9614b;

            {
                this.f9614b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f9614b.D();
                        return;
                    default:
                        r rVar = this.f9614b;
                        rVar.f9639Q = true;
                        rVar.D();
                        return;
                }
            }
        };
        final int i12 = 1;
        this.f9628E = new Runnable(this) { // from class: U4.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f9614b;

            {
                this.f9614b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f9614b.D();
                        return;
                    default:
                        r rVar = this.f9614b;
                        rVar.f9639Q = true;
                        rVar.D();
                        return;
                }
            }
        };
        this.f9629F = D.m(null);
        this.f9656d0 = j;
        this.f9658e0 = j;
    }

    public static int B(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static C1981i b(int i7, int i10) {
        AbstractC1705a.S("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i10);
        return new C1981i();
    }

    public static L w(L l10, L l11, boolean z8) {
        String str;
        String str2;
        if (l10 == null) {
            return l11;
        }
        String str3 = l11.f20096z;
        int h10 = n5.o.h(str3);
        String str4 = l10.f20093w;
        if (D.r(h10, str4) == 1) {
            str2 = D.s(h10, str4);
            str = n5.o.d(str2);
        } else {
            String b2 = n5.o.b(str4, str3);
            str = str3;
            str2 = b2;
        }
        K a9 = l11.a();
        a9.f19976a = l10.f20085a;
        a9.f19977b = l10.f20086b;
        a9.f19978c = l10.f20087c;
        a9.f19979d = l10.f20088d;
        a9.f19980e = l10.f20089e;
        a9.f19981f = z8 ? l10.f20090f : -1;
        a9.g = z8 ? l10.f20091u : -1;
        a9.f19982h = str2;
        if (h10 == 2) {
            a9.f19988p = l10.f20068E;
            a9.f19989q = l10.f20069F;
            a9.f19990r = l10.f20070G;
        }
        if (str != null) {
            a9.k = str;
        }
        int i7 = l10.f20075M;
        if (i7 != -1 && h10 == 1) {
            a9.f19996x = i7;
        }
        F4.c cVar = l10.f20094x;
        if (cVar != null) {
            F4.c cVar2 = l11.f20094x;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar.f4071a);
            }
            a9.f19983i = cVar;
        }
        return new L(a9);
    }

    public final k A() {
        return (k) h3.o.k(1, this.f9625B);
    }

    public final boolean C() {
        return this.f9658e0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        int i7;
        if (!this.f9644V && this.f9647Y == null && this.f9639Q) {
            int i10 = 0;
            for (q qVar : this.f9633J) {
                if (qVar.r() == null) {
                    return;
                }
            }
            n0 n0Var = this.f9645W;
            if (n0Var != null) {
                int i11 = n0Var.f8119a;
                int[] iArr = new int[i11];
                this.f9647Y = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.f9633J;
                        if (i13 < qVarArr.length) {
                            L r10 = qVarArr[i13].r();
                            AbstractC1705a.n(r10);
                            L l10 = this.f9645W.a(i12).f8109d[0];
                            String str = l10.f20096z;
                            String str2 = r10.f20096z;
                            int h10 = n5.o.h(str2);
                            if (h10 == 3) {
                                if (D.a(str2, str)) {
                                    if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || r10.f20080R == l10.f20080R) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (h10 == n5.o.h(str)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.f9647Y[i12] = i13;
                }
                Iterator it = this.f9630G.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).c();
                }
                return;
            }
            int length = this.f9633J.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                L r11 = this.f9633J[i14].r();
                AbstractC1705a.n(r11);
                String str3 = r11.f20096z;
                if (n5.o.l(str3)) {
                    i17 = 2;
                } else if (!n5.o.j(str3)) {
                    i17 = n5.o.k(str3) ? 3 : -2;
                }
                if (B(i17) > B(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            m0 m0Var = this.f9655d.f9536h;
            int i18 = m0Var.f8106a;
            this.f9648Z = -1;
            this.f9647Y = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f9647Y[i19] = i19;
            }
            m0[] m0VarArr = new m0[length];
            int i20 = 0;
            while (i20 < length) {
                L r12 = this.f9633J[i20].r();
                AbstractC1705a.n(r12);
                String str4 = this.f9649a;
                L l11 = this.f9659f;
                if (i20 == i15) {
                    L[] lArr = new L[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        L l12 = m0Var.f8109d[i21];
                        if (i16 == 1 && l11 != null) {
                            l12 = l12.d(l11);
                        }
                        lArr[i21] = i18 == 1 ? r12.d(l12) : w(l12, r12, true);
                    }
                    m0VarArr[i20] = new m0(str4, lArr);
                    this.f9648Z = i20;
                    i7 = 0;
                } else {
                    if (i16 != 2 || !n5.o.j(r12.f20096z)) {
                        l11 = null;
                    }
                    StringBuilder n6 = A3.c.n(str4, ":muxed:");
                    n6.append(i20 < i15 ? i20 : i20 - 1);
                    i7 = 0;
                    m0VarArr[i20] = new m0(n6.toString(), w(l11, r12, false));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.f9645W = h(m0VarArr);
            AbstractC1705a.m(this.f9646X == null ? 1 : i22);
            this.f9646X = Collections.emptySet();
            this.f9640R = true;
            this.f9653c.z();
        }
    }

    public final void E() {
        this.f9670x.a();
        i iVar = this.f9655d;
        C0454b c0454b = iVar.f9540n;
        if (c0454b != null) {
            throw c0454b;
        }
        Uri uri = iVar.f9541o;
        if (uri == null || !iVar.f9545s) {
            return;
        }
        V4.b bVar = (V4.b) iVar.g.f10050d.get(uri);
        bVar.f10034b.a();
        IOException iOException = bVar.f10042x;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void F(m0[] m0VarArr, int... iArr) {
        this.f9645W = h(m0VarArr);
        this.f9646X = new HashSet();
        for (int i7 : iArr) {
            this.f9646X.add(this.f9645W.a(i7));
        }
        this.f9648Z = 0;
        this.f9629F.post(new S2(this.f9653c, 13));
        this.f9640R = true;
    }

    public final void G() {
        for (q qVar : this.f9633J) {
            qVar.A(this.f9660f0);
        }
        this.f9660f0 = false;
    }

    public final boolean H(long j, boolean z8) {
        int i7;
        this.f9656d0 = j;
        if (C()) {
            this.f9658e0 = j;
            return true;
        }
        if (this.f9639Q && !z8) {
            int length = this.f9633J.length;
            for (0; i7 < length; i7 + 1) {
                i7 = (this.f9633J[i7].B(j, false) || (!this.f9654c0[i7] && this.f9650a0)) ? i7 + 1 : 0;
            }
            return false;
        }
        this.f9658e0 = j;
        this.f9662h0 = false;
        this.f9625B.clear();
        J j10 = this.f9670x;
        if (j10.d()) {
            if (this.f9639Q) {
                for (q qVar : this.f9633J) {
                    qVar.h();
                }
            }
            j10.b();
        } else {
            j10.f20554c = null;
            G();
        }
        return true;
    }

    public final void a() {
        AbstractC1705a.m(this.f9640R);
        this.f9645W.getClass();
        this.f9646X.getClass();
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f9670x.d();
    }

    @Override // m5.InterfaceC1601E
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        boolean z8;
        D4.e eVar;
        int i10;
        R4.e eVar2 = (R4.e) interfaceC1603G;
        boolean z10 = eVar2 instanceof k;
        if (z10 && !((k) eVar2).f9571Y && (iOException instanceof C1599C) && ((i10 = ((C1599C) iOException).f20535d) == 410 || i10 == 404)) {
            return J.f20549d;
        }
        long j11 = eVar2.f8877w.f20580b;
        S s3 = eVar2.f8877w;
        Uri uri = s3.f20581c;
        P4.r rVar = new P4.r(s3.f20582d);
        D.Z(eVar2.f8875u);
        D.Z(eVar2.f8876v);
        A7.a aVar = new A7.a(iOException, i7);
        i iVar = this.f9655d;
        C1312U i11 = x.i(iVar.f9543q);
        this.f9669w.getClass();
        D4.e c10 = B.c(i11, aVar);
        if (c10 == null || c10.f3224a != 2) {
            z8 = false;
        } else {
            k5.s sVar = iVar.f9543q;
            z8 = sVar.o(sVar.u(iVar.f9536h.a(eVar2.f8872d)), c10.f3225b);
        }
        if (z8) {
            if (z10 && j11 == 0) {
                ArrayList arrayList = this.f9625B;
                AbstractC1705a.m(((k) arrayList.remove(arrayList.size() - 1)) == eVar2);
                if (arrayList.isEmpty()) {
                    this.f9658e0 = this.f9656d0;
                } else {
                    ((k) N6.r.l(arrayList)).f9570X = true;
                }
            }
            eVar = J.f20550e;
        } else {
            long e2 = B.e(aVar);
            eVar = e2 != -9223372036854775807L ? new D4.e(0, e2, false) : J.f20551f;
        }
        boolean a9 = eVar.a();
        this.f9671y.v(rVar, eVar2.f8871c, this.f9651b, eVar2.f8872d, eVar2.f8873e, eVar2.f8874f, eVar2.f8875u, eVar2.f8876v, iOException, !a9);
        if (!a9) {
            this.f9632I = null;
        }
        if (z8) {
            if (this.f9640R) {
                this.f9653c.i(this);
            } else {
                x(this.f9656d0);
            }
        }
        return eVar;
    }

    @Override // s4.InterfaceC1984l
    public final void f() {
        this.f9663i0 = true;
        this.f9629F.post(this.f9628E);
    }

    @Override // m5.H
    public final void g() {
        for (q qVar : this.f9633J) {
            qVar.z();
        }
    }

    public final n0 h(m0[] m0VarArr) {
        for (int i7 = 0; i7 < m0VarArr.length; i7++) {
            m0 m0Var = m0VarArr[i7];
            L[] lArr = new L[m0Var.f8106a];
            for (int i10 = 0; i10 < m0Var.f8106a; i10++) {
                L l10 = m0Var.f8109d[i10];
                int e2 = this.f9667u.e(l10);
                K a9 = l10.a();
                a9.f19975F = e2;
                lArr[i10] = new L(a9);
            }
            m0VarArr[i7] = new m0(m0Var.f8107b, lArr);
        }
        return new n0(m0VarArr);
    }

    @Override // s4.InterfaceC1984l
    public final void i(s4.s sVar) {
    }

    @Override // P4.f0
    public final long j() {
        if (C()) {
            return this.f9658e0;
        }
        if (this.f9662h0) {
            return Long.MIN_VALUE;
        }
        return A().f8876v;
    }

    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        R4.e eVar = (R4.e) interfaceC1603G;
        this.f9632I = null;
        long j11 = eVar.f8869a;
        S s3 = eVar.f8877w;
        Uri uri = s3.f20581c;
        P4.r rVar = new P4.r(s3.f20582d);
        this.f9669w.getClass();
        this.f9671y.q(rVar, eVar.f8871c, this.f9651b, eVar.f8872d, eVar.f8873e, eVar.f8874f, eVar.f8875u, eVar.f8876v);
        if (z8) {
            return;
        }
        if (C() || this.f9641S == 0) {
            G();
        }
        if (this.f9641S > 0) {
            this.f9653c.i(this);
        }
    }

    @Override // P4.f0
    public final long n() {
        if (this.f9662h0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f9658e0;
        }
        long j = this.f9656d0;
        k A10 = A();
        if (!A10.f9568V) {
            ArrayList arrayList = this.f9625B;
            A10 = arrayList.size() > 1 ? (k) h3.o.k(2, arrayList) : null;
        }
        if (A10 != null) {
            j = Math.max(j, A10.f8876v);
        }
        if (this.f9639Q) {
            for (q qVar : this.f9633J) {
                j = Math.max(j, qVar.m());
            }
        }
        return j;
    }

    @Override // P4.b0
    public final void p() {
        this.f9629F.post(this.f9627D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        R4.e eVar = (R4.e) interfaceC1603G;
        this.f9632I = null;
        i iVar = this.f9655d;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            iVar.f9539m = eVar2.f9521x;
            Uri uri = eVar2.f8870b.f20628a;
            byte[] bArr = eVar2.f9523z;
            bArr.getClass();
            R7.b bVar = iVar.j;
            bVar.getClass();
            uri.getClass();
        }
        long j11 = eVar.f8869a;
        S s3 = eVar.f8877w;
        Uri uri2 = s3.f20581c;
        P4.r rVar = new P4.r(s3.f20582d);
        this.f9669w.getClass();
        this.f9671y.t(rVar, eVar.f8871c, this.f9651b, eVar.f8872d, eVar.f8873e, eVar.f8874f, eVar.f8875u, eVar.f8876v);
        if (this.f9640R) {
            this.f9653c.i(this);
        } else {
            x(this.f9656d0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [s4.i] */
    @Override // s4.InterfaceC1984l
    public final s4.v u(int i7, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = f9623m0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.L;
        SparseIntArray sparseIntArray = this.f9635M;
        q qVar = null;
        if (contains) {
            AbstractC1705a.h(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.f9634K[i11] = i7;
                }
                qVar = this.f9634K[i11] == i7 ? this.f9633J[i11] : b(i7, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                q[] qVarArr = this.f9633J;
                if (i12 >= qVarArr.length) {
                    break;
                }
                if (this.f9634K[i12] == i7) {
                    qVar = qVarArr[i12];
                    break;
                }
                i12++;
            }
        }
        if (qVar == null) {
            if (this.f9663i0) {
                return b(i7, i10);
            }
            int length = this.f9633J.length;
            boolean z8 = i10 == 1 || i10 == 2;
            qVar = new q(this.f9657e, this.f9667u, this.f9668v, this.f9631H);
            qVar.f8013t = this.f9656d0;
            if (z8) {
                qVar.f9622I = this.f9665k0;
                qVar.f8019z = true;
            }
            long j = this.f9664j0;
            if (qVar.f7995F != j) {
                qVar.f7995F = j;
                qVar.f8019z = true;
            }
            if (this.f9666l0 != null) {
                qVar.f7992C = r2.f9572y;
            }
            qVar.f8002f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f9634K, i13);
            this.f9634K = copyOf;
            copyOf[length] = i7;
            q[] qVarArr2 = this.f9633J;
            int i14 = D.f21141a;
            Object[] copyOf2 = Arrays.copyOf(qVarArr2, qVarArr2.length + 1);
            copyOf2[qVarArr2.length] = qVar;
            this.f9633J = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f9654c0, i13);
            this.f9654c0 = copyOf3;
            copyOf3[length] = z8;
            this.f9650a0 |= z8;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (B(i10) > B(this.f9637O)) {
                this.f9638P = length;
                this.f9637O = i10;
            }
            this.f9652b0 = Arrays.copyOf(this.f9652b0, i13);
        }
        if (i10 != 5) {
            return qVar;
        }
        if (this.f9636N == null) {
            this.f9636N = new p(qVar, this.f9672z);
        }
        return this.f9636N;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.io.IOException, P4.b] */
    @Override // P4.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(long j) {
        long max;
        List list;
        P3.p pVar;
        long j10;
        Uri uri;
        V4.c cVar;
        int i7;
        long j11;
        int i10;
        long j12;
        int i11;
        int i12;
        long j13;
        long j14;
        h hVar;
        k kVar;
        Uri uri2;
        boolean z8;
        boolean z10;
        byte[] bArr;
        P3.p pVar2;
        int i13;
        k kVar2;
        boolean z11;
        byte[] bArr2;
        InterfaceC1616m interfaceC1616m;
        V4.f fVar;
        h hVar2;
        V4.g gVar;
        V4.i iVar;
        C1619p c1619p;
        InterfaceC1616m interfaceC1616m2;
        boolean z12;
        Uri uri3;
        K4.i iVar2;
        b bVar;
        n5.v vVar;
        C1704A c1704a;
        P3.p pVar3;
        byte[] bArr3;
        String str;
        boolean z13;
        int i14;
        if (!this.f9662h0) {
            J j15 = this.f9670x;
            if (!j15.d() && !j15.c()) {
                if (C()) {
                    list = Collections.emptyList();
                    max = this.f9658e0;
                    for (q qVar : this.f9633J) {
                        qVar.f8013t = this.f9658e0;
                    }
                } else {
                    k A10 = A();
                    max = A10.f9568V ? A10.f8876v : Math.max(this.f9656d0, A10.f8875u);
                    list = this.f9626C;
                }
                List list2 = list;
                P3.p pVar4 = this.f9624A;
                pVar4.f7842c = null;
                pVar4.f7841b = false;
                pVar4.f7843d = null;
                boolean z14 = this.f9640R || !list2.isEmpty();
                i iVar3 = this.f9655d;
                k kVar3 = list2.isEmpty() ? null : (k) N6.r.l(list2);
                long j16 = max - j;
                int a9 = kVar3 == null ? -1 : iVar3.f9536h.a(kVar3.f8872d);
                long j17 = iVar3.f9544r;
                long j18 = j17 != -9223372036854775807L ? j17 - j : -9223372036854775807L;
                if (kVar3 == null || iVar3.f9542p) {
                    pVar = pVar4;
                } else {
                    pVar = pVar4;
                    long j19 = kVar3.f8876v - kVar3.f8875u;
                    j16 = Math.max(0L, j16 - j19);
                    if (j18 != -9223372036854775807L) {
                        j10 = Math.max(0L, j18 - j19);
                        k kVar4 = kVar3;
                        iVar3.f9543q.b(j, j16, j10, list2, iVar3.a(kVar3, max));
                        int j20 = iVar3.f9543q.j();
                        boolean z15 = a9 == j20;
                        Uri[] uriArr = iVar3.f9534e;
                        uri = uriArr[j20];
                        cVar = iVar3.g;
                        if (cVar.c(uri)) {
                            P3.p pVar5 = pVar;
                            pVar5.f7843d = uri;
                            iVar3.f9545s &= uri.equals(iVar3.f9541o);
                            iVar3.f9541o = uri;
                            pVar3 = pVar5;
                        } else {
                            P3.p pVar6 = pVar;
                            V4.i a10 = cVar.a(true, uri);
                            a10.getClass();
                            iVar3.f9542p = a10.f10117c;
                            boolean z16 = a10.f10090o;
                            long j21 = a10.f10085h;
                            if (z16) {
                                i7 = j20;
                                j11 = max;
                                j12 = -9223372036854775807L;
                                i10 = a9;
                            } else {
                                i7 = j20;
                                j11 = max;
                                i10 = a9;
                                j12 = (a10.f10096u + j21) - cVar.f10046B;
                            }
                            iVar3.f9544r = j12;
                            long j22 = j21 - cVar.f10046B;
                            int i15 = i10;
                            Pair c10 = iVar3.c(kVar4, z15, a10, j22, j11);
                            long longValue = ((Long) c10.first).longValue();
                            int intValue = ((Integer) c10.second).intValue();
                            if (longValue >= a10.k || kVar4 == null || !z15) {
                                i11 = i7;
                                i12 = intValue;
                                j13 = j22;
                            } else {
                                uri = uriArr[i15];
                                a10 = cVar.a(true, uri);
                                a10.getClass();
                                j13 = a10.f10085h - cVar.f10046B;
                                Pair c11 = iVar3.c(kVar4, false, a10, j13, j11);
                                long longValue2 = ((Long) c11.first).longValue();
                                i11 = i15;
                                i12 = ((Integer) c11.second).intValue();
                                longValue = longValue2;
                            }
                            long j23 = a10.k;
                            if (longValue < j23) {
                                iVar3.f9540n = new IOException();
                            } else {
                                int i16 = (int) (longValue - j23);
                                N6.H h10 = a10.f10093r;
                                int size = h10.size();
                                N6.H h11 = a10.f10094s;
                                if (i16 == size) {
                                    if (i12 == -1) {
                                        i12 = 0;
                                    }
                                    j14 = j13;
                                    hVar = i12 < h11.size() ? new h((V4.g) h11.get(i12), longValue, i12) : null;
                                } else {
                                    V4.f fVar2 = (V4.f) h10.get(i16);
                                    j14 = j13;
                                    if (i12 == -1) {
                                        hVar = new h(fVar2, longValue, -1);
                                    } else if (i12 < fVar2.f10064A.size()) {
                                        hVar = new h((V4.g) fVar2.f10064A.get(i12), longValue, i12);
                                    } else {
                                        int i17 = i16 + 1;
                                        hVar = i17 < h10.size() ? new h((V4.g) h10.get(i17), longValue + 1, -1) : !h11.isEmpty() ? new h((V4.g) h11.get(0), longValue + 1, 0) : null;
                                    }
                                }
                                if (hVar == null) {
                                    if (!a10.f10090o) {
                                        pVar6.f7843d = uri;
                                        iVar3.f9545s &= uri.equals(iVar3.f9541o);
                                        iVar3.f9541o = uri;
                                    } else if (z14 || h10.isEmpty()) {
                                        pVar6.f7841b = true;
                                    } else {
                                        hVar = new h((V4.g) N6.r.l(h10), (j23 + h10.size()) - 1, -1);
                                    }
                                }
                                iVar3.f9545s = false;
                                iVar3.f9541o = null;
                                V4.g gVar2 = hVar.f9526a;
                                V4.f fVar3 = gVar2.f10067b;
                                String str2 = a10.f10115a;
                                Uri O10 = (fVar3 == null || (str = fVar3.f10072u) == null) ? null : AbstractC1705a.O(str2, str);
                                e d10 = iVar3.d(O10, i11, true);
                                pVar6.f7842c = d10;
                                if (d10 == null) {
                                    String str3 = gVar2.f10072u;
                                    Uri O11 = str3 == null ? null : AbstractC1705a.O(str2, str3);
                                    e d11 = iVar3.d(O11, i11, false);
                                    pVar6.f7842c = d11;
                                    if (d11 == null) {
                                        long j24 = gVar2.f10070e;
                                        if (kVar4 == null) {
                                            AtomicInteger atomicInteger = k.f9547Z;
                                            kVar = kVar4;
                                        } else {
                                            kVar = kVar4;
                                            if (!uri.equals(kVar.f9548A) || !kVar.f9568V) {
                                                long j25 = j14 + j24;
                                                boolean z17 = gVar2 instanceof V4.d;
                                                boolean z18 = a10.f10117c;
                                                if (z17) {
                                                    z18 = ((V4.d) gVar2).f10060z || (hVar.f9528c == 0 && z18);
                                                }
                                                uri2 = uri;
                                                z8 = !z18 || j25 < kVar.f8876v;
                                                z10 = hVar.f9529d;
                                                if (z8 || !z10) {
                                                    L l10 = iVar3.f9535f[i11];
                                                    int m10 = iVar3.f9543q.m();
                                                    Object q10 = iVar3.f9543q.q();
                                                    boolean z19 = iVar3.f9538l;
                                                    R7.b bVar2 = iVar3.j;
                                                    if (O11 != null) {
                                                        bVar2.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = (byte[]) ((d) bVar2.f8929b).get(O11);
                                                    }
                                                    byte[] bArr4 = O10 != null ? null : (byte[]) ((d) bVar2.f8929b).get(O10);
                                                    AtomicInteger atomicInteger2 = k.f9547Z;
                                                    y0 y0Var = y0.f7368u;
                                                    Collections.emptyMap();
                                                    Uri O12 = AbstractC1705a.O(str2, gVar2.f10066a);
                                                    if (z10) {
                                                        pVar2 = pVar6;
                                                        i13 = 0;
                                                    } else {
                                                        pVar2 = pVar6;
                                                        i13 = 8;
                                                    }
                                                    AbstractC1705a.o(O12, "The uri must be set.");
                                                    kVar2 = kVar;
                                                    Uri uri4 = uri2;
                                                    C1619p c1619p2 = new C1619p(O12, 1, null, y0Var, gVar2.f10074w, gVar2.f10075x, null, i13);
                                                    z11 = bArr == null;
                                                    if (z11) {
                                                        bArr2 = null;
                                                    } else {
                                                        String str4 = gVar2.f10073v;
                                                        str4.getClass();
                                                        bArr2 = k.f(str4);
                                                    }
                                                    InterfaceC1616m interfaceC1616m3 = iVar3.f9531b;
                                                    if (bArr == null) {
                                                        bArr2.getClass();
                                                        interfaceC1616m = new a(interfaceC1616m3, bArr, bArr2);
                                                    } else {
                                                        interfaceC1616m = interfaceC1616m3;
                                                    }
                                                    fVar = gVar2.f10067b;
                                                    if (fVar == null) {
                                                        boolean z20 = bArr4 != null;
                                                        if (z20) {
                                                            String str5 = fVar.f10073v;
                                                            str5.getClass();
                                                            bArr3 = k.f(str5);
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        Uri O13 = AbstractC1705a.O(str2, fVar.f10066a);
                                                        Collections.emptyMap();
                                                        AbstractC1705a.o(O13, "The uri must be set.");
                                                        iVar = a10;
                                                        hVar2 = hVar;
                                                        gVar = gVar2;
                                                        c1619p = new C1619p(O13, 1, null, y0Var, fVar.f10074w, fVar.f10075x, null, 0);
                                                        if (bArr4 != null) {
                                                            bArr3.getClass();
                                                            interfaceC1616m2 = new a(interfaceC1616m3, bArr4, bArr3);
                                                        } else {
                                                            interfaceC1616m2 = interfaceC1616m3;
                                                        }
                                                        z12 = z20;
                                                    } else {
                                                        hVar2 = hVar;
                                                        gVar = gVar2;
                                                        iVar = a10;
                                                        c1619p = null;
                                                        interfaceC1616m2 = null;
                                                        z12 = false;
                                                    }
                                                    long j26 = j14 + j24;
                                                    V4.g gVar3 = gVar;
                                                    long j27 = j26 + gVar3.f10068c;
                                                    int i18 = iVar.j + gVar3.f10069d;
                                                    if (kVar2 == null) {
                                                        C1619p c1619p3 = kVar2.f9552E;
                                                        uri3 = uri4;
                                                        b bVar3 = ((c1619p == c1619p3 || (c1619p != null && c1619p3 != null && c1619p.f20628a.equals(c1619p3.f20628a) && (c1619p.f20632e > c1619p3.f20632e ? 1 : (c1619p.f20632e == c1619p3.f20632e ? 0 : -1)) == 0)) && (uri3.equals(kVar2.f9548A) && kVar2.f9568V) && !kVar2.f9570X && kVar2.f9573z == i18) ? kVar2.f9563Q : null;
                                                        iVar2 = kVar2.f9559M;
                                                        vVar = kVar2.f9560N;
                                                        bVar = bVar3;
                                                    } else {
                                                        uri3 = uri4;
                                                        iVar2 = new K4.i(null);
                                                        bVar = null;
                                                        vVar = new n5.v(10);
                                                    }
                                                    boolean z21 = !z10;
                                                    SparseArray sparseArray = (SparseArray) iVar3.f9533d.f8927b;
                                                    c1704a = (C1704A) sparseArray.get(i18);
                                                    if (c1704a == null) {
                                                        c1704a = new C1704A(9223372036854775806L);
                                                        sparseArray.put(i18, c1704a);
                                                    }
                                                    h hVar3 = hVar2;
                                                    pVar3 = pVar2;
                                                    pVar3.f7842c = new k(iVar3.f9530a, interfaceC1616m, c1619p2, l10, z11, interfaceC1616m2, c1619p, z12, uri3, iVar3.f9537i, m10, q10, j26, j27, hVar3.f9527b, hVar3.f9528c, z21, i18, gVar3.f10076y, z19, c1704a, gVar3.f10071f, bVar, iVar2, vVar, z8, iVar3.k);
                                                }
                                            }
                                        }
                                        uri2 = uri;
                                        z8 = false;
                                        z10 = hVar.f9529d;
                                        if (z8) {
                                        }
                                        L l102 = iVar3.f9535f[i11];
                                        int m102 = iVar3.f9543q.m();
                                        Object q102 = iVar3.f9543q.q();
                                        boolean z192 = iVar3.f9538l;
                                        R7.b bVar22 = iVar3.j;
                                        if (O11 != null) {
                                        }
                                        if (O10 != null) {
                                        }
                                        AtomicInteger atomicInteger22 = k.f9547Z;
                                        y0 y0Var2 = y0.f7368u;
                                        Collections.emptyMap();
                                        Uri O122 = AbstractC1705a.O(str2, gVar2.f10066a);
                                        if (z10) {
                                        }
                                        AbstractC1705a.o(O122, "The uri must be set.");
                                        kVar2 = kVar;
                                        Uri uri42 = uri2;
                                        C1619p c1619p22 = new C1619p(O122, 1, null, y0Var2, gVar2.f10074w, gVar2.f10075x, null, i13);
                                        if (bArr == null) {
                                        }
                                        if (z11) {
                                        }
                                        InterfaceC1616m interfaceC1616m32 = iVar3.f9531b;
                                        if (bArr == null) {
                                        }
                                        fVar = gVar2.f10067b;
                                        if (fVar == null) {
                                        }
                                        long j262 = j14 + j24;
                                        V4.g gVar32 = gVar;
                                        long j272 = j262 + gVar32.f10068c;
                                        int i182 = iVar.j + gVar32.f10069d;
                                        if (kVar2 == null) {
                                        }
                                        boolean z212 = !z10;
                                        SparseArray sparseArray2 = (SparseArray) iVar3.f9533d.f8927b;
                                        c1704a = (C1704A) sparseArray2.get(i182);
                                        if (c1704a == null) {
                                        }
                                        h hVar32 = hVar2;
                                        pVar3 = pVar2;
                                        pVar3.f7842c = new k(iVar3.f9530a, interfaceC1616m, c1619p22, l102, z11, interfaceC1616m2, c1619p, z12, uri3, iVar3.f9537i, m102, q102, j262, j272, hVar32.f9527b, hVar32.f9528c, z212, i182, gVar32.f10076y, z192, c1704a, gVar32.f10071f, bVar, iVar2, vVar, z8, iVar3.k);
                                    }
                                }
                            }
                            pVar3 = pVar6;
                        }
                        z13 = pVar3.f7841b;
                        R4.e eVar = (R4.e) pVar3.f7842c;
                        Uri uri5 = (Uri) pVar3.f7843d;
                        if (!z13) {
                            this.f9658e0 = -9223372036854775807L;
                            this.f9662h0 = true;
                            return true;
                        }
                        if (eVar == null) {
                            if (uri5 == null) {
                                return false;
                            }
                            V4.b bVar4 = (V4.b) ((l) this.f9653c.f8074b).f9586b.f10050d.get(uri5);
                            bVar4.c(bVar4.f10033a);
                            return false;
                        }
                        if (eVar instanceof k) {
                            k kVar5 = (k) eVar;
                            this.f9666l0 = kVar5;
                            this.f9642T = kVar5.f8872d;
                            this.f9658e0 = -9223372036854775807L;
                            this.f9625B.add(kVar5);
                            F f4 = N6.H.f7232b;
                            N6.r.e(4, "initialCapacity");
                            q[] qVarArr = this.f9633J;
                            int length = qVarArr.length;
                            Object[] objArr = new Object[4];
                            int i19 = 0;
                            int i20 = 0;
                            boolean z22 = false;
                            while (i19 < length) {
                                q qVar2 = qVarArr[i19];
                                Integer valueOf = Integer.valueOf(qVar2.f8010q + qVar2.f8009p);
                                int i21 = i20 + 1;
                                if (objArr.length < i21) {
                                    objArr = Arrays.copyOf(objArr, N6.B.f(objArr.length, i21));
                                } else {
                                    if (z22) {
                                        objArr = (Object[]) objArr.clone();
                                    }
                                    objArr[i20] = valueOf;
                                    i19++;
                                    i20++;
                                }
                                z22 = false;
                                objArr[i20] = valueOf;
                                i19++;
                                i20++;
                            }
                            t0 D10 = N6.H.D(i20, objArr);
                            kVar5.f9564R = this;
                            kVar5.f9569W = D10;
                            q[] qVarArr2 = this.f9633J;
                            int length2 = qVarArr2.length;
                            int i22 = 0;
                            while (i22 < length2) {
                                q qVar3 = qVarArr2[i22];
                                qVar3.getClass();
                                qVar3.f7992C = kVar5.f9572y;
                                if (kVar5.f9549B) {
                                    i14 = 1;
                                    qVar3.f7996G = true;
                                } else {
                                    i14 = 1;
                                }
                                i22 += i14;
                            }
                        }
                        this.f9632I = eVar;
                        j15.f(eVar, this, this.f9669w.d(eVar.f8871c));
                        this.f9671y.z(new P4.r(eVar.f8870b), eVar.f8871c, this.f9651b, eVar.f8872d, eVar.f8873e, eVar.f8874f, eVar.f8875u, eVar.f8876v);
                        return true;
                    }
                }
                j10 = j18;
                k kVar42 = kVar3;
                iVar3.f9543q.b(j, j16, j10, list2, iVar3.a(kVar3, max));
                int j202 = iVar3.f9543q.j();
                if (a9 == j202) {
                }
                Uri[] uriArr2 = iVar3.f9534e;
                uri = uriArr2[j202];
                cVar = iVar3.g;
                if (cVar.c(uri)) {
                }
                z13 = pVar3.f7841b;
                R4.e eVar2 = (R4.e) pVar3.f7842c;
                Uri uri52 = (Uri) pVar3.f7843d;
                if (!z13) {
                }
            }
        }
        return false;
    }

    @Override // P4.f0
    public final void y(long j) {
        J j10 = this.f9670x;
        if (j10.c() || C()) {
            return;
        }
        boolean d10 = j10.d();
        i iVar = this.f9655d;
        List list = this.f9626C;
        if (d10) {
            this.f9632I.getClass();
            if (iVar.f9540n != null ? false : iVar.f9543q.h(j, this.f9632I, list)) {
                j10.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            z(size);
        }
        int size2 = (iVar.f9540n != null || iVar.f9543q.length() < 2) ? list.size() : iVar.f9543q.g(j, list);
        if (size2 < this.f9625B.size()) {
            z(size2);
        }
    }

    public final void z(int i7) {
        ArrayList arrayList;
        AbstractC1705a.m(!this.f9670x.d());
        int i10 = i7;
        loop0: while (true) {
            arrayList = this.f9625B;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            int i11 = i10;
            while (true) {
                if (i11 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i10);
                    for (int i12 = 0; i12 < this.f9633J.length; i12++) {
                        if (this.f9633J[i12].o() > kVar.g(i12)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((k) arrayList.get(i11)).f9549B) {
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j = A().f8876v;
        k kVar2 = (k) arrayList.get(i10);
        D.R(arrayList, i10, arrayList.size());
        for (int i13 = 0; i13 < this.f9633J.length; i13++) {
            this.f9633J[i13].j(kVar2.g(i13));
        }
        if (arrayList.isEmpty()) {
            this.f9658e0 = this.f9656d0;
        } else {
            ((k) N6.r.l(arrayList)).f9570X = true;
        }
        this.f9662h0 = false;
        this.f9671y.H(new C0474w(1, this.f9637O, null, 3, null, D.Z(kVar2.f8875u), D.Z(j)));
    }
}
