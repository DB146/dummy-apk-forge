package U4;

import N6.H;
import P4.AbstractC0453a;
import P4.InterfaceC0476y;
import P4.h0;
import Y5.B;
import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import m4.AbstractC1556J;
import m4.C1558a0;
import m4.U;
import m4.V;
import m5.C1620q;
import m5.InterfaceC1615l;
import m5.J;
import m5.M;
import m5.T;
import n5.AbstractC1705a;
import n5.D;
import r4.C1941m;
import r4.InterfaceC1938j;

/* loaded from: classes.dex */
public final class m extends AbstractC0453a {

    /* renamed from: A, reason: collision with root package name */
    public final B f9597A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f9598B;

    /* renamed from: C, reason: collision with root package name */
    public final int f9599C;

    /* renamed from: D, reason: collision with root package name */
    public final V4.c f9600D;

    /* renamed from: E, reason: collision with root package name */
    public final long f9601E;

    /* renamed from: F, reason: collision with root package name */
    public final C1558a0 f9602F;

    /* renamed from: G, reason: collision with root package name */
    public U f9603G;

    /* renamed from: H, reason: collision with root package name */
    public T f9604H;

    /* renamed from: v, reason: collision with root package name */
    public final c f9605v;

    /* renamed from: w, reason: collision with root package name */
    public final V f9606w;

    /* renamed from: x, reason: collision with root package name */
    public final R7.a f9607x;

    /* renamed from: y, reason: collision with root package name */
    public final h8.e f9608y;

    /* renamed from: z, reason: collision with root package name */
    public final r4.q f9609z;

    static {
        AbstractC1556J.a("goog.exo.hls");
    }

    public m(C1558a0 c1558a0, R7.a aVar, c cVar, h8.e eVar, r4.q qVar, B b2, V4.c cVar2, long j, boolean z8, int i7) {
        V v10 = c1558a0.f20224b;
        v10.getClass();
        this.f9606w = v10;
        this.f9602F = c1558a0;
        this.f9603G = c1558a0.f20225c;
        this.f9607x = aVar;
        this.f9605v = cVar;
        this.f9608y = eVar;
        this.f9609z = qVar;
        this.f9597A = b2;
        this.f9600D = cVar2;
        this.f9601E = j;
        this.f9598B = z8;
        this.f9599C = i7;
    }

    public static V4.d v(H h10, long j) {
        V4.d dVar = null;
        for (int i7 = 0; i7 < h10.size(); i7++) {
            V4.d dVar2 = (V4.d) h10.get(i7);
            long j10 = dVar2.f10070e;
            if (j10 > j || !dVar2.f10060z) {
                if (j10 > j) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(P4.B b2, C1620q c1620q, long j) {
        A4.s a9 = a(b2);
        C1941m c1941m = new C1941m(this.f7981d.f23773c, 0, b2);
        T t5 = this.f9604H;
        n4.l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        return new l(this.f9605v, this.f9600D, this.f9607x, t5, this.f9609z, c1941m, this.f9597A, a9, c1620q, this.f9608y, this.f9598B, this.f9599C, lVar);
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f9602F;
    }

    @Override // P4.AbstractC0453a
    public final void k() {
        V4.c cVar = this.f9600D;
        J j = cVar.f10053u;
        if (j != null) {
            j.a();
        }
        Uri uri = cVar.f10057y;
        if (uri != null) {
            V4.b bVar = (V4.b) cVar.f10050d.get(uri);
            bVar.f10034b.a();
            IOException iOException = bVar.f10042x;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // P4.AbstractC0453a
    public final void n(T t5) {
        this.f9604H = t5;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        n4.l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        r4.q qVar = this.f9609z;
        qVar.b(myLooper, lVar);
        qVar.a();
        A4.s a9 = a(null);
        Uri uri = this.f9606w.f20177a;
        V4.c cVar = this.f9600D;
        cVar.getClass();
        cVar.f10054v = D.m(null);
        cVar.f10052f = a9;
        cVar.f10055w = this;
        M m10 = new M(((InterfaceC1615l) cVar.f10047a.f8927b).e(), uri, 4, cVar.f10048b.l());
        AbstractC1705a.m(cVar.f10053u == null);
        J j = new J("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f10053u = j;
        B b2 = cVar.f10049c;
        int i7 = m10.f20557c;
        j.f(m10, cVar, b2.d(i7));
        a9.z(new P4.r(m10.f20556b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        l lVar = (l) interfaceC0476y;
        lVar.f9586b.f10051e.remove(lVar);
        for (r rVar : lVar.f9581H) {
            if (rVar.f9640R) {
                for (q qVar : rVar.f9633J) {
                    qVar.h();
                    InterfaceC1938j interfaceC1938j = qVar.f8003h;
                    if (interfaceC1938j != null) {
                        interfaceC1938j.a(qVar.f8001e);
                        qVar.f8003h = null;
                        qVar.g = null;
                    }
                }
            }
            rVar.f9670x.e(rVar);
            rVar.f9629F.removeCallbacksAndMessages(null);
            rVar.f9644V = true;
            rVar.f9630G.clear();
        }
        lVar.f9578E = null;
    }

    @Override // P4.AbstractC0453a
    public final void r() {
        V4.c cVar = this.f9600D;
        cVar.f10057y = null;
        cVar.f10058z = null;
        cVar.f10056x = null;
        cVar.f10046B = -9223372036854775807L;
        cVar.f10053u.e(null);
        cVar.f10053u = null;
        HashMap hashMap = cVar.f10050d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((V4.b) it.next()).f10034b.e(null);
        }
        cVar.f10054v.removeCallbacksAndMessages(null);
        cVar.f10054v = null;
        hashMap.clear();
        this.f9609z.release();
    }

    public final void w(V4.i iVar) {
        h0 h0Var;
        long j;
        long j10;
        long j11;
        int i7;
        boolean z8 = iVar.f10091p;
        long j12 = iVar.f10085h;
        long Z7 = z8 ? D.Z(j12) : -9223372036854775807L;
        int i10 = iVar.f10082d;
        long j13 = (i10 == 2 || i10 == 1) ? Z7 : -9223372036854775807L;
        V4.c cVar = this.f9600D;
        cVar.f10056x.getClass();
        Object obj = new Object();
        boolean z10 = cVar.f10045A;
        long j14 = iVar.f10096u;
        H h10 = iVar.f10093r;
        boolean z11 = iVar.g;
        long j15 = iVar.f10083e;
        if (z10) {
            long j16 = Z7;
            long j17 = j12 - cVar.f10046B;
            boolean z12 = iVar.f10090o;
            long j18 = z12 ? j17 + j14 : -9223372036854775807L;
            long M3 = iVar.f10091p ? D.M(D.x(this.f9601E)) - (j12 + j14) : 0L;
            long j19 = this.f9603G.f20164a;
            V4.h hVar = iVar.f10097v;
            if (j19 != -9223372036854775807L) {
                j10 = D.M(j19);
            } else {
                if (j15 != -9223372036854775807L) {
                    j = j14 - j15;
                } else {
                    long j20 = hVar.f10080d;
                    if (j20 == -9223372036854775807L || iVar.f10089n == -9223372036854775807L) {
                        j = hVar.f10079c;
                        if (j == -9223372036854775807L) {
                            j = iVar.f10088m * 3;
                        }
                    } else {
                        j = j20;
                    }
                }
                j10 = j + M3;
            }
            long j21 = j14 + M3;
            long j22 = D.j(j10, M3, j21);
            U u3 = this.f9602F.f20225c;
            boolean z13 = false;
            boolean z14 = u3.f20167d == -3.4028235E38f && u3.f20168e == -3.4028235E38f && hVar.f10079c == -9223372036854775807L && hVar.f10080d == -9223372036854775807L;
            long Z10 = D.Z(j22);
            this.f9603G = new U(Z10, -9223372036854775807L, -9223372036854775807L, z14 ? 1.0f : this.f9603G.f20167d, z14 ? 1.0f : this.f9603G.f20168e);
            if (j15 == -9223372036854775807L) {
                j15 = j21 - D.M(Z10);
            }
            if (z11) {
                j11 = j15;
            } else {
                V4.d v10 = v(iVar.f10094s, j15);
                if (v10 != null) {
                    j11 = v10.f10070e;
                } else if (h10.isEmpty()) {
                    i7 = i10;
                    j11 = 0;
                    if (i7 == 2 && iVar.f10084f) {
                        z13 = true;
                    }
                    h0Var = new h0(j13, j16, j18, iVar.f10096u, j17, j11, true, !z12, z13, obj, this.f9602F, this.f9603G);
                } else {
                    V4.f fVar = (V4.f) h10.get(D.c(h10, Long.valueOf(j15), true));
                    V4.d v11 = v(fVar.f10064A, j15);
                    j11 = v11 != null ? v11.f10070e : fVar.f10070e;
                }
            }
            i7 = i10;
            if (i7 == 2) {
                z13 = true;
            }
            h0Var = new h0(j13, j16, j18, iVar.f10096u, j17, j11, true, !z12, z13, obj, this.f9602F, this.f9603G);
        } else {
            long j23 = Z7;
            long j24 = (j15 == -9223372036854775807L || h10.isEmpty()) ? 0L : (z11 || j15 == j14) ? j15 : ((V4.f) h10.get(D.c(h10, Long.valueOf(j15), true))).f10070e;
            C1558a0 c1558a0 = this.f9602F;
            long j25 = iVar.f10096u;
            h0Var = new h0(j13, j23, j25, j25, 0L, j24, true, false, true, obj, c1558a0, null);
        }
        o(h0Var);
    }
}
