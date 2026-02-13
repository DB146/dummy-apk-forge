package W4;

import N6.t0;
import N6.y0;
import P4.C0463k;
import P4.InterfaceC0475x;
import P4.InterfaceC0476y;
import P4.c0;
import P4.d0;
import P4.m0;
import P4.n0;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import m4.E0;
import m4.L;
import m5.C1620q;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class s implements InterfaceC0476y {

    /* renamed from: A */
    public long f10759A;

    /* renamed from: B */
    public long f10760B;

    /* renamed from: C */
    public long f10761C;

    /* renamed from: D */
    public boolean f10762D;

    /* renamed from: E */
    public boolean f10763E;

    /* renamed from: F */
    public boolean f10764F;

    /* renamed from: G */
    public boolean f10765G;

    /* renamed from: H */
    public boolean f10766H;

    /* renamed from: I */
    public int f10767I;

    /* renamed from: J */
    public boolean f10768J;

    /* renamed from: a */
    public final C1620q f10769a;

    /* renamed from: b */
    public final Handler f10770b = n5.D.m(null);

    /* renamed from: c */
    public final R7.b f10771c;

    /* renamed from: d */
    public final n f10772d;

    /* renamed from: e */
    public final ArrayList f10773e;

    /* renamed from: f */
    public final ArrayList f10774f;

    /* renamed from: u */
    public final C0463k f10775u;

    /* renamed from: v */
    public final InterfaceC0586d f10776v;

    /* renamed from: w */
    public InterfaceC0475x f10777w;

    /* renamed from: x */
    public t0 f10778x;

    /* renamed from: y */
    public IOException f10779y;

    /* renamed from: z */
    public A3.e f10780z;

    public s(C1620q c1620q, InterfaceC0586d interfaceC0586d, Uri uri, C0463k c0463k, String str, SocketFactory socketFactory) {
        this.f10769a = c1620q;
        this.f10776v = interfaceC0586d;
        this.f10775u = c0463k;
        R7.b bVar = new R7.b(this, 8);
        this.f10771c = bVar;
        this.f10772d = new n(bVar, bVar, str, uri, socketFactory);
        this.f10773e = new ArrayList();
        this.f10774f = new ArrayList();
        this.f10760B = -9223372036854775807L;
        this.f10759A = -9223372036854775807L;
        this.f10761C = -9223372036854775807L;
    }

    public static /* synthetic */ long a(s sVar) {
        return sVar.f10760B;
    }

    public static /* synthetic */ void b(s sVar) {
        sVar.f10760B = -9223372036854775807L;
    }

    public static /* synthetic */ long e(s sVar) {
        return sVar.f10761C;
    }

    public static /* synthetic */ void f(s sVar) {
        sVar.f10761C = -9223372036854775807L;
    }

    public static /* synthetic */ ArrayList g(s sVar) {
        return sVar.f10774f;
    }

    public static /* synthetic */ C0463k h(s sVar) {
        return sVar.f10775u;
    }

    public static boolean i(s sVar) {
        return sVar.f10760B != -9223372036854775807L;
    }

    public static /* synthetic */ long m(s sVar) {
        return sVar.f10759A;
    }

    public static /* synthetic */ void p(s sVar) {
        sVar.f10759A = -9223372036854775807L;
    }

    public static void t(s sVar) {
        if (sVar.f10764F || sVar.f10765G) {
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = sVar.f10773e;
            if (i7 >= arrayList.size()) {
                sVar.f10765G = true;
                N6.H F10 = N6.H.F(arrayList);
                N6.E e2 = new N6.E();
                for (int i10 = 0; i10 < F10.size(); i10++) {
                    c0 c0Var = ((r) F10.get(i10)).f10755c;
                    String num = Integer.toString(i10);
                    L r10 = c0Var.r();
                    AbstractC1705a.l(r10);
                    e2.d(new m0(num, r10));
                }
                sVar.f10778x = e2.h();
                InterfaceC0475x interfaceC0475x = sVar.f10777w;
                AbstractC1705a.l(interfaceC0475x);
                interfaceC0475x.a(sVar);
                return;
            }
            if (((r) arrayList.get(i7)).f10755c.r() == null) {
                return;
            } else {
                i7++;
            }
        }
    }

    public static void u(s sVar) {
        sVar.f10762D = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = sVar.f10773e;
            if (i7 >= arrayList.size()) {
                return;
            }
            sVar.f10762D = ((r) arrayList.get(i7)).f10756d & sVar.f10762D;
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [A3.e, java.io.IOException] */
    public static void w(s sVar) {
        sVar.f10768J = true;
        n nVar = sVar.f10772d;
        nVar.getClass();
        try {
            nVar.close();
            y yVar = new y(new q3.s(nVar));
            nVar.f10742w = yVar;
            yVar.l(nVar.T(nVar.f10741v));
            nVar.f10744y = null;
            nVar.f10731D = false;
            nVar.f10728A = null;
        } catch (IOException e2) {
            nVar.f10735b.v(new IOException(e2));
        }
        InterfaceC0586d f4 = sVar.f10776v.f();
        if (f4 == null) {
            sVar.f10780z = new A3.e("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = sVar.f10773e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = sVar.f10774f;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            r rVar = (r) arrayList.get(i7);
            if (rVar.f10756d) {
                arrayList2.add(rVar);
            } else {
                q qVar = rVar.f10753a;
                r rVar2 = new r(sVar, qVar.f10749a, i7, f4);
                arrayList2.add(rVar2);
                rVar2.b();
                if (arrayList3.contains(qVar)) {
                    arrayList4.add(rVar2.f10753a);
                }
            }
        }
        N6.H F10 = N6.H.F(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i10 = 0; i10 < F10.size(); i10++) {
            ((r) F10.get(i10)).a();
        }
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        return j;
    }

    @Override // P4.f0
    public final boolean d() {
        return !this.f10762D;
    }

    @Override // P4.f0
    public final long j() {
        return n();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        if (!this.f10763E) {
            return -9223372036854775807L;
        }
        this.f10763E = false;
        return 0L;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        AbstractC1705a.m(this.f10765G);
        t0 t0Var = this.f10778x;
        t0Var.getClass();
        return new n0((m0[]) t0Var.toArray(new m0[0]));
    }

    @Override // P4.f0
    public final long n() {
        if (!this.f10762D) {
            ArrayList arrayList = this.f10773e;
            if (!arrayList.isEmpty()) {
                long j = this.f10759A;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z8 = true;
                long j10 = Long.MAX_VALUE;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    r rVar = (r) arrayList.get(i7);
                    if (!rVar.f10756d) {
                        j10 = Math.min(j10, rVar.f10755c.m());
                        z8 = false;
                    }
                }
                if (z8 || j10 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        IOException iOException = this.f10779y;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        n nVar = this.f10772d;
        this.f10777w = interfaceC0475x;
        try {
            nVar.getClass();
            try {
                nVar.f10742w.l(nVar.T(nVar.f10741v));
                Uri uri = nVar.f10741v;
                String str = nVar.f10744y;
                A4.s sVar = nVar.f10740u;
                sVar.F(sVar.n(4, str, y0.f7368u, uri));
            } catch (IOException e2) {
                n5.D.g(nVar.f10742w);
                throw e2;
            }
        } catch (IOException e10) {
            this.f10779y = e10;
            n5.D.g(nVar);
        }
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        if (n() == 0 && !this.f10768J) {
            this.f10761C = j;
            return j;
        }
        s(j);
        this.f10759A = j;
        if (this.f10760B != -9223372036854775807L) {
            n nVar = this.f10772d;
            int i7 = nVar.f10729B;
            if (i7 == 1) {
                return j;
            }
            if (i7 != 2) {
                throw new IllegalStateException();
            }
            this.f10760B = j;
            nVar.U(j);
            return j;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10773e;
            if (i10 >= arrayList.size()) {
                return j;
            }
            if (!((r) arrayList.get(i10)).f10755c.B(j, false)) {
                this.f10760B = j;
                if (this.f10762D) {
                    for (int i11 = 0; i11 < this.f10773e.size(); i11++) {
                        r rVar = (r) this.f10773e.get(i11);
                        AbstractC1705a.m(rVar.f10756d);
                        rVar.f10756d = false;
                        u(rVar.f10758f);
                        rVar.b();
                    }
                    if (this.f10768J) {
                        this.f10772d.V(n5.D.Z(j));
                    } else {
                        this.f10772d.U(j);
                    }
                } else {
                    this.f10772d.U(j);
                }
                for (int i12 = 0; i12 < this.f10773e.size(); i12++) {
                    r rVar2 = (r) this.f10773e.get(i12);
                    if (!rVar2.f10756d) {
                        C0589g c0589g = rVar2.f10753a.f10750b.f10687v;
                        c0589g.getClass();
                        synchronized (c0589g.f10696e) {
                            c0589g.k = true;
                        }
                        rVar2.f10755c.A(false);
                        rVar2.f10755c.f8013t = j;
                    }
                }
                return j;
            }
            i10++;
        }
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        if (this.f10760B != -9223372036854775807L) {
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10773e;
            if (i7 >= arrayList.size()) {
                return;
            }
            r rVar = (r) arrayList.get(i7);
            if (!rVar.f10756d) {
                rVar.f10755c.g(j, true);
            }
            i7++;
        }
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i7 = 0; i7 < sVarArr.length; i7++) {
            if (d0VarArr[i7] != null && (sVarArr[i7] == null || !zArr[i7])) {
                d0VarArr[i7] = null;
            }
        }
        ArrayList arrayList2 = this.f10774f;
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            arrayList = this.f10773e;
            if (i10 >= length) {
                break;
            }
            k5.s sVar = sVarArr[i10];
            if (sVar != null) {
                m0 k = sVar.k();
                t0 t0Var = this.f10778x;
                t0Var.getClass();
                int indexOf = t0Var.indexOf(k);
                r rVar = (r) arrayList.get(indexOf);
                rVar.getClass();
                arrayList2.add(rVar.f10753a);
                if (this.f10778x.contains(k) && d0VarArr[i10] == null) {
                    d0VarArr[i10] = new A7.a(this, indexOf);
                    zArr2[i10] = true;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar2 = (r) arrayList.get(i11);
            if (!arrayList2.contains(rVar2.f10753a)) {
                rVar2.a();
            }
        }
        this.f10766H = true;
        if (j != 0) {
            this.f10759A = j;
            this.f10760B = j;
            this.f10761C = j;
        }
        z();
        return j;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        return !this.f10762D;
    }

    @Override // P4.f0
    public final void y(long j) {
    }

    public final void z() {
        ArrayList arrayList;
        boolean z8 = true;
        int i7 = 0;
        while (true) {
            arrayList = this.f10774f;
            if (i7 >= arrayList.size()) {
                break;
            }
            z8 &= ((q) arrayList.get(i7)).f10751c != null;
            i7++;
        }
        if (z8 && this.f10766H) {
            n nVar = this.f10772d;
            nVar.f10738e.addAll(arrayList);
            nVar.P();
        }
    }
}
