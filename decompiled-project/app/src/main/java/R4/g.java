package R4;

import A9.O;
import P4.C0474w;
import P4.X;
import P4.c0;
import P4.d0;
import P4.e0;
import P4.f0;
import P4.r;
import S4.p;
import Y5.B;
import android.net.Uri;
import h3.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m4.L;
import m5.C1620q;
import m5.H;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.J;
import m5.S;
import n5.AbstractC1705a;
import n5.D;
import q3.s;
import r4.C1941m;
import r4.InterfaceC1938j;
import r4.q;

/* loaded from: classes.dex */
public final class g implements d0, f0, InterfaceC1601E, H {

    /* renamed from: A, reason: collision with root package name */
    public final c0 f8883A;

    /* renamed from: B, reason: collision with root package name */
    public final c0[] f8884B;

    /* renamed from: C, reason: collision with root package name */
    public final s f8885C;

    /* renamed from: D, reason: collision with root package name */
    public e f8886D;

    /* renamed from: E, reason: collision with root package name */
    public L f8887E;

    /* renamed from: F, reason: collision with root package name */
    public S4.b f8888F;

    /* renamed from: G, reason: collision with root package name */
    public long f8889G;

    /* renamed from: H, reason: collision with root package name */
    public long f8890H;

    /* renamed from: I, reason: collision with root package name */
    public int f8891I;

    /* renamed from: J, reason: collision with root package name */
    public a f8892J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8893K;

    /* renamed from: a, reason: collision with root package name */
    public final int f8894a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8895b;

    /* renamed from: c, reason: collision with root package name */
    public final L[] f8896c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f8897d;

    /* renamed from: e, reason: collision with root package name */
    public final h f8898e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8899f;

    /* renamed from: u, reason: collision with root package name */
    public final A4.s f8900u;

    /* renamed from: v, reason: collision with root package name */
    public final B f8901v;

    /* renamed from: w, reason: collision with root package name */
    public final J f8902w;

    /* renamed from: x, reason: collision with root package name */
    public final O f8903x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f8904y;

    /* renamed from: z, reason: collision with root package name */
    public final List f8905z;

    /* JADX WARN: Type inference failed for: r4v3, types: [A9.O, java.lang.Object] */
    public g(int i7, int[] iArr, L[] lArr, h hVar, e0 e0Var, C1620q c1620q, long j, q qVar, C1941m c1941m, B b2, A4.s sVar) {
        this.f8894a = i7;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f8895b = iArr;
        this.f8896c = lArr == null ? new L[0] : lArr;
        this.f8898e = hVar;
        this.f8899f = e0Var;
        this.f8900u = sVar;
        this.f8901v = b2;
        this.f8902w = new J("ChunkSampleStream");
        this.f8903x = new Object();
        ArrayList arrayList = new ArrayList();
        this.f8904y = arrayList;
        this.f8905z = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f8884B = new c0[length];
        this.f8897d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c0[] c0VarArr = new c0[i11];
        qVar.getClass();
        c0 c0Var = new c0(c1620q, qVar, c1941m);
        this.f8883A = c0Var;
        iArr2[0] = i7;
        c0VarArr[0] = c0Var;
        while (i10 < length) {
            c0 c0Var2 = new c0(c1620q, null, null);
            this.f8884B[i10] = c0Var2;
            int i12 = i10 + 1;
            c0VarArr[i12] = c0Var2;
            iArr2[i12] = this.f8895b[i10];
            i10 = i12;
        }
        this.f8885C = new s(20, iArr2, c0VarArr, false);
        this.f8889G = j;
        this.f8890H = j;
    }

    public final int A(int i7, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f8904y;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).e(0) <= i7);
        return i10 - 1;
    }

    public final void B(S4.b bVar) {
        this.f8888F = bVar;
        c0 c0Var = this.f8883A;
        c0Var.h();
        InterfaceC1938j interfaceC1938j = c0Var.f8003h;
        if (interfaceC1938j != null) {
            interfaceC1938j.a(c0Var.f8001e);
            c0Var.f8003h = null;
            c0Var.g = null;
        }
        for (c0 c0Var2 : this.f8884B) {
            c0Var2.h();
            InterfaceC1938j interfaceC1938j2 = c0Var2.f8003h;
            if (interfaceC1938j2 != null) {
                interfaceC1938j2.a(c0Var2.f8001e);
                c0Var2.f8003h = null;
                c0Var2.g = null;
            }
        }
        this.f8902w.e(this);
    }

    public final void C(long j) {
        a aVar;
        boolean B10;
        this.f8890H = j;
        if (w()) {
            this.f8889G = j;
            return;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < this.f8904y.size(); i10++) {
            aVar = (a) this.f8904y.get(i10);
            long j10 = aVar.f8875u;
            if (j10 == j && aVar.f8848y == -9223372036854775807L) {
                break;
            } else {
                if (j10 > j) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            c0 c0Var = this.f8883A;
            int e2 = aVar.e(0);
            synchronized (c0Var) {
                synchronized (c0Var) {
                    c0Var.f8012s = 0;
                    X x2 = c0Var.f7997a;
                    x2.f7972e = x2.f7971d;
                }
            }
            int i11 = c0Var.f8010q;
            if (e2 >= i11 && e2 <= c0Var.f8009p + i11) {
                c0Var.f8013t = Long.MIN_VALUE;
                c0Var.f8012s = e2 - i11;
                B10 = true;
            }
            B10 = false;
        } else {
            B10 = this.f8883A.B(j, j < j());
        }
        if (B10) {
            this.f8891I = A(this.f8883A.o(), 0);
            c0[] c0VarArr = this.f8884B;
            int length = c0VarArr.length;
            while (i7 < length) {
                c0VarArr[i7].B(j, true);
                i7++;
            }
            return;
        }
        this.f8889G = j;
        this.f8893K = false;
        this.f8904y.clear();
        this.f8891I = 0;
        if (this.f8902w.d()) {
            this.f8883A.h();
            c0[] c0VarArr2 = this.f8884B;
            int length2 = c0VarArr2.length;
            while (i7 < length2) {
                c0VarArr2[i7].h();
                i7++;
            }
            this.f8902w.b();
            return;
        }
        this.f8902w.f20554c = null;
        this.f8883A.A(false);
        for (c0 c0Var2 : this.f8884B) {
            c0Var2.A(false);
        }
    }

    @Override // P4.d0
    public final void a() {
        J j = this.f8902w;
        j.a();
        this.f8883A.v();
        if (j.d()) {
            return;
        }
        this.f8898e.a();
    }

    @Override // P4.d0
    public final boolean b() {
        return !w() && this.f8883A.t(this.f8893K);
    }

    @Override // P4.f0
    public final boolean d() {
        return this.f8902w.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, P4.e0] */
    @Override // m5.InterfaceC1601E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        D4.e eVar;
        boolean a9;
        e eVar2 = (e) interfaceC1603G;
        long j11 = eVar2.f8877w.f20580b;
        boolean z8 = eVar2 instanceof a;
        ArrayList arrayList = this.f8904y;
        int size = arrayList.size() - 1;
        boolean z10 = (j11 != 0 && z8 && u(size)) ? false : true;
        S s3 = eVar2.f8877w;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        D.Z(eVar2.f8875u);
        D.Z(eVar2.f8876v);
        A7.a aVar = new A7.a(iOException, i7);
        h hVar = this.f8898e;
        B b2 = this.f8901v;
        if (hVar.e(eVar2, z10, aVar, b2)) {
            if (z10) {
                if (z8) {
                    AbstractC1705a.m(i(size) == eVar2);
                    if (arrayList.isEmpty()) {
                        this.f8889G = this.f8890H;
                    }
                }
                eVar = J.f20550e;
                if (eVar == null) {
                    b2.getClass();
                    long e2 = B.e(aVar);
                    eVar = e2 != -9223372036854775807L ? new D4.e(0, e2, false) : J.f20551f;
                }
                a9 = eVar.a();
                D4.e eVar3 = eVar;
                this.f8900u.v(rVar, eVar2.f8871c, this.f8894a, eVar2.f8872d, eVar2.f8873e, eVar2.f8874f, eVar2.f8875u, eVar2.f8876v, iOException, !a9);
                if (!a9) {
                    this.f8886D = null;
                    b2.getClass();
                    this.f8899f.i(this);
                }
                return eVar3;
            }
            AbstractC1705a.S("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        }
        eVar = null;
        if (eVar == null) {
        }
        a9 = eVar.a();
        D4.e eVar32 = eVar;
        this.f8900u.v(rVar, eVar2.f8871c, this.f8894a, eVar2.f8872d, eVar2.f8873e, eVar2.f8874f, eVar2.f8875u, eVar2.f8876v, iOException, !a9);
        if (!a9) {
        }
        return eVar32;
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        if (w()) {
            return -3;
        }
        a aVar = this.f8892J;
        c0 c0Var = this.f8883A;
        if (aVar != null && aVar.e(0) <= c0Var.o()) {
            return -3;
        }
        z();
        return c0Var.y(gVar, gVar2, i7, this.f8893K);
    }

    @Override // m5.H
    public final void g() {
        this.f8883A.z();
        for (c0 c0Var : this.f8884B) {
            c0Var.z();
        }
        this.f8898e.release();
        S4.b bVar = this.f8888F;
        if (bVar != null) {
            synchronized (bVar) {
                p pVar = (p) bVar.f9057B.remove(this);
                if (pVar != null) {
                    pVar.f9157a.z();
                }
            }
        }
    }

    @Override // P4.d0
    public final int h(long j) {
        if (w()) {
            return 0;
        }
        c0 c0Var = this.f8883A;
        int q10 = c0Var.q(j, this.f8893K);
        a aVar = this.f8892J;
        if (aVar != null) {
            q10 = Math.min(q10, aVar.e(0) - c0Var.o());
        }
        c0Var.C(q10);
        z();
        return q10;
    }

    public final a i(int i7) {
        ArrayList arrayList = this.f8904y;
        a aVar = (a) arrayList.get(i7);
        D.R(arrayList, i7, arrayList.size());
        this.f8891I = Math.max(this.f8891I, arrayList.size());
        int i10 = 0;
        this.f8883A.j(aVar.e(0));
        while (true) {
            c0[] c0VarArr = this.f8884B;
            if (i10 >= c0VarArr.length) {
                return aVar;
            }
            c0 c0Var = c0VarArr[i10];
            i10++;
            c0Var.j(aVar.e(i10));
        }
    }

    @Override // P4.f0
    public final long j() {
        if (w()) {
            return this.f8889G;
        }
        if (this.f8893K) {
            return Long.MIN_VALUE;
        }
        return p().f8876v;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, P4.e0] */
    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        e eVar = (e) interfaceC1603G;
        this.f8886D = null;
        this.f8892J = null;
        long j11 = eVar.f8869a;
        S s3 = eVar.f8877w;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f8901v.getClass();
        this.f8900u.q(rVar, eVar.f8871c, this.f8894a, eVar.f8872d, eVar.f8873e, eVar.f8874f, eVar.f8875u, eVar.f8876v);
        if (z8) {
            return;
        }
        if (w()) {
            this.f8883A.A(false);
            for (c0 c0Var : this.f8884B) {
                c0Var.A(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.f8904y;
            i(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f8889G = this.f8890H;
            }
        }
        this.f8899f.i(this);
    }

    @Override // P4.f0
    public final long n() {
        if (this.f8893K) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.f8889G;
        }
        long j = this.f8890H;
        a p10 = p();
        if (!p10.c()) {
            ArrayList arrayList = this.f8904y;
            p10 = arrayList.size() > 1 ? (a) o.k(2, arrayList) : null;
        }
        if (p10 != null) {
            j = Math.max(j, p10.f8876v);
        }
        return Math.max(j, this.f8883A.m());
    }

    public final a p() {
        return (a) o.k(1, this.f8904y);
    }

    public final void s(long j) {
        long j10;
        if (w()) {
            return;
        }
        c0 c0Var = this.f8883A;
        int i7 = c0Var.f8010q;
        c0Var.g(j, true);
        c0 c0Var2 = this.f8883A;
        int i10 = c0Var2.f8010q;
        if (i10 > i7) {
            synchronized (c0Var2) {
                j10 = c0Var2.f8009p == 0 ? Long.MIN_VALUE : c0Var2.f8007n[c0Var2.f8011r];
            }
            int i11 = 0;
            while (true) {
                c0[] c0VarArr = this.f8884B;
                if (i11 >= c0VarArr.length) {
                    break;
                }
                c0VarArr[i11].g(j10, this.f8897d[i11]);
                i11++;
            }
        }
        int min = Math.min(A(i10, 0), this.f8891I);
        if (min > 0) {
            D.R(this.f8904y, 0, min);
            this.f8891I -= min;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, P4.e0] */
    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        e eVar = (e) interfaceC1603G;
        this.f8886D = null;
        this.f8898e.b(eVar);
        long j11 = eVar.f8869a;
        S s3 = eVar.f8877w;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f8901v.getClass();
        this.f8900u.t(rVar, eVar.f8871c, this.f8894a, eVar.f8872d, eVar.f8873e, eVar.f8874f, eVar.f8875u, eVar.f8876v);
        this.f8899f.i(this);
    }

    public final boolean u(int i7) {
        int o10;
        a aVar = (a) this.f8904y.get(i7);
        if (this.f8883A.o() > aVar.e(0)) {
            return true;
        }
        int i10 = 0;
        do {
            c0[] c0VarArr = this.f8884B;
            if (i10 >= c0VarArr.length) {
                return false;
            }
            o10 = c0VarArr[i10].o();
            i10++;
        } while (o10 <= aVar.e(i10));
        return true;
    }

    public final boolean w() {
        return this.f8889G != -9223372036854775807L;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        long j10;
        List list;
        if (!this.f8893K) {
            J j11 = this.f8902w;
            if (!j11.d() && !j11.c()) {
                boolean w10 = w();
                if (w10) {
                    list = Collections.emptyList();
                    j10 = this.f8889G;
                } else {
                    j10 = p().f8876v;
                    list = this.f8905z;
                }
                this.f8898e.d(j, j10, list, this.f8903x);
                O o10 = this.f8903x;
                boolean z8 = o10.f920a;
                e eVar = (e) o10.f921b;
                o10.f921b = null;
                o10.f920a = false;
                if (z8) {
                    this.f8889G = -9223372036854775807L;
                    this.f8893K = true;
                    return true;
                }
                if (eVar == null) {
                    return false;
                }
                this.f8886D = eVar;
                boolean z10 = eVar instanceof a;
                s sVar = this.f8885C;
                if (z10) {
                    a aVar = (a) eVar;
                    if (w10) {
                        long j12 = this.f8889G;
                        if (aVar.f8875u != j12) {
                            this.f8883A.f8013t = j12;
                            for (c0 c0Var : this.f8884B) {
                                c0Var.f8013t = this.f8889G;
                            }
                        }
                        this.f8889G = -9223372036854775807L;
                    }
                    aVar.f8846A = sVar;
                    c0[] c0VarArr = (c0[]) sVar.f23439c;
                    int[] iArr = new int[c0VarArr.length];
                    for (int i7 = 0; i7 < c0VarArr.length; i7++) {
                        c0 c0Var2 = c0VarArr[i7];
                        iArr[i7] = c0Var2.f8010q + c0Var2.f8009p;
                    }
                    aVar.f8847B = iArr;
                    this.f8904y.add(aVar);
                } else if (eVar instanceof j) {
                    ((j) eVar).f8914y = sVar;
                }
                j11.f(eVar, this, this.f8901v.d(eVar.f8871c));
                this.f8900u.z(new r(eVar.f8870b), eVar.f8871c, this.f8894a, eVar.f8872d, eVar.f8873e, eVar.f8874f, eVar.f8875u, eVar.f8876v);
                return true;
            }
        }
        return false;
    }

    @Override // P4.f0
    public final void y(long j) {
        J j10 = this.f8902w;
        if (j10.c() || w()) {
            return;
        }
        boolean d10 = j10.d();
        h hVar = this.f8898e;
        ArrayList arrayList = this.f8904y;
        List list = this.f8905z;
        if (d10) {
            e eVar = this.f8886D;
            eVar.getClass();
            boolean z8 = eVar instanceof a;
            if (!(z8 && u(arrayList.size() - 1)) && hVar.g(j, eVar, list)) {
                j10.b();
                if (z8) {
                    this.f8892J = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int f4 = hVar.f(j, list);
        if (f4 < arrayList.size()) {
            AbstractC1705a.m(!j10.d());
            int size = arrayList.size();
            while (true) {
                if (f4 >= size) {
                    f4 = -1;
                    break;
                } else if (!u(f4)) {
                    break;
                } else {
                    f4++;
                }
            }
            if (f4 == -1) {
                return;
            }
            long j11 = p().f8876v;
            a i7 = i(f4);
            if (arrayList.isEmpty()) {
                this.f8889G = this.f8890H;
            }
            this.f8893K = false;
            this.f8900u.H(new C0474w(1, this.f8894a, null, 3, null, D.Z(i7.f8875u), D.Z(j11)));
        }
    }

    public final void z() {
        int A10 = A(this.f8883A.o(), this.f8891I - 1);
        while (true) {
            int i7 = this.f8891I;
            if (i7 > A10) {
                return;
            }
            this.f8891I = i7 + 1;
            a aVar = (a) this.f8904y.get(i7);
            L l10 = aVar.f8872d;
            if (!l10.equals(this.f8887E)) {
                this.f8900u.i(this.f8894a, l10, aVar.f8873e, aVar.f8874f, aVar.f8875u);
            }
            this.f8887E = l10;
        }
    }
}
