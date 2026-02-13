package S4;

import A4.s;
import P4.AbstractC0453a;
import P4.C0454b;
import P4.C0463k;
import P4.InterfaceC0476y;
import P4.r;
import T4.t;
import Y5.B;
import Y5.C0662z;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC1556J;
import m4.C1558a0;
import m4.U;
import m4.V;
import m5.C1620q;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import m5.J;
import m5.K;
import m5.L;
import m5.M;
import m5.S;
import m5.T;
import n5.AbstractC1705a;
import n5.D;
import r4.C1941m;

/* loaded from: classes.dex */
public final class h extends AbstractC0453a {

    /* renamed from: A, reason: collision with root package name */
    public final r4.q f9094A;

    /* renamed from: B, reason: collision with root package name */
    public final B f9095B;

    /* renamed from: C, reason: collision with root package name */
    public final q3.i f9096C;

    /* renamed from: D, reason: collision with root package name */
    public final long f9097D;

    /* renamed from: E, reason: collision with root package name */
    public final long f9098E;

    /* renamed from: F, reason: collision with root package name */
    public final s f9099F;

    /* renamed from: G, reason: collision with root package name */
    public final L f9100G;

    /* renamed from: H, reason: collision with root package name */
    public final C0463k f9101H;

    /* renamed from: I, reason: collision with root package name */
    public final Object f9102I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseArray f9103J;

    /* renamed from: K, reason: collision with root package name */
    public final c f9104K;
    public final c L;

    /* renamed from: M, reason: collision with root package name */
    public final f f9105M;

    /* renamed from: N, reason: collision with root package name */
    public final K f9106N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC1616m f9107O;

    /* renamed from: P, reason: collision with root package name */
    public J f9108P;

    /* renamed from: Q, reason: collision with root package name */
    public T f9109Q;

    /* renamed from: R, reason: collision with root package name */
    public A3.e f9110R;

    /* renamed from: S, reason: collision with root package name */
    public Handler f9111S;

    /* renamed from: T, reason: collision with root package name */
    public U f9112T;

    /* renamed from: U, reason: collision with root package name */
    public Uri f9113U;

    /* renamed from: V, reason: collision with root package name */
    public final Uri f9114V;

    /* renamed from: W, reason: collision with root package name */
    public T4.c f9115W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9116X;

    /* renamed from: Y, reason: collision with root package name */
    public long f9117Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f9118Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f9119a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f9120b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f9121c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f9122d0;

    /* renamed from: v, reason: collision with root package name */
    public final C1558a0 f9123v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f9124w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1615l f9125x;

    /* renamed from: y, reason: collision with root package name */
    public final j f9126y;

    /* renamed from: z, reason: collision with root package name */
    public final h8.e f9127z;

    static {
        AbstractC1556J.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [S4.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [S4.c] */
    public h(C1558a0 c1558a0, InterfaceC1615l interfaceC1615l, L l10, j jVar, h8.e eVar, r4.q qVar, B b2, long j, long j10) {
        this.f9123v = c1558a0;
        this.f9112T = c1558a0.f20225c;
        V v10 = c1558a0.f20224b;
        v10.getClass();
        Uri uri = v10.f20177a;
        this.f9113U = uri;
        this.f9114V = uri;
        this.f9115W = null;
        this.f9125x = interfaceC1615l;
        this.f9100G = l10;
        this.f9126y = jVar;
        this.f9094A = qVar;
        this.f9095B = b2;
        this.f9097D = j;
        this.f9098E = j10;
        this.f9127z = eVar;
        this.f9096C = new q3.i(5);
        this.f9124w = false;
        this.f9099F = a(null);
        this.f9102I = new Object();
        this.f9103J = new SparseArray();
        this.f9105M = new f(this);
        this.f9121c0 = -9223372036854775807L;
        this.f9119a0 = -9223372036854775807L;
        this.f9101H = new C0463k(this, 3);
        this.f9106N = new d(this);
        final int i7 = 0;
        this.f9104K = new Runnable(this) { // from class: S4.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9080b;

            {
                this.f9080b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f9080b.z();
                        return;
                    default:
                        this.f9080b.y(false);
                        return;
                }
            }
        };
        final int i10 = 1;
        this.L = new Runnable(this) { // from class: S4.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f9080b;

            {
                this.f9080b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f9080b.z();
                        return;
                    default:
                        this.f9080b.y(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean v(T4.h hVar) {
        int i7 = 0;
        while (true) {
            List list = hVar.f9278c;
            if (i7 >= list.size()) {
                return false;
            }
            int i10 = ((T4.a) list.get(i7)).f9238b;
            if (i10 == 1 || i10 == 2) {
                break;
            }
            i7++;
        }
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(P4.B b2, C1620q c1620q, long j) {
        int intValue = ((Integer) b2.f8157a).intValue() - this.f9122d0;
        s a9 = a(b2);
        C1941m c1941m = new C1941m(this.f7981d.f23773c, 0, b2);
        int i7 = this.f9122d0 + intValue;
        T4.c cVar = this.f9115W;
        T t5 = this.f9109Q;
        long j10 = this.f9119a0;
        n4.l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        b bVar = new b(i7, cVar, this.f9096C, intValue, this.f9126y, t5, this.f9094A, c1941m, this.f9095B, a9, j10, this.f9106N, c1620q, this.f9127z, this.f9105M, lVar);
        this.f9103J.put(i7, bVar);
        return bVar;
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f9123v;
    }

    @Override // P4.AbstractC0453a
    public final void k() {
        this.f9106N.a();
    }

    @Override // P4.AbstractC0453a
    public final void n(T t5) {
        this.f9109Q = t5;
        Looper myLooper = Looper.myLooper();
        n4.l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        r4.q qVar = this.f9094A;
        qVar.b(myLooper, lVar);
        qVar.a();
        if (this.f9124w) {
            y(false);
            return;
        }
        this.f9107O = this.f9125x.e();
        this.f9108P = new J("DashMediaSource");
        this.f9111S = D.m(null);
        z();
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        b bVar = (b) interfaceC0476y;
        q qVar = bVar.f9056A;
        qVar.f9170w = true;
        qVar.f9165d.removeCallbacksAndMessages(null);
        for (R4.g gVar : bVar.f9061F) {
            gVar.B(bVar);
        }
        bVar.f9060E = null;
        this.f9103J.remove(bVar.f9067a);
    }

    @Override // P4.AbstractC0453a
    public final void r() {
        this.f9116X = false;
        this.f9107O = null;
        J j = this.f9108P;
        if (j != null) {
            j.e(null);
            this.f9108P = null;
        }
        this.f9117Y = 0L;
        this.f9118Z = 0L;
        this.f9115W = this.f9124w ? this.f9115W : null;
        this.f9113U = this.f9114V;
        this.f9110R = null;
        Handler handler = this.f9111S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9111S = null;
        }
        this.f9119a0 = -9223372036854775807L;
        this.f9120b0 = 0;
        this.f9121c0 = -9223372036854775807L;
        this.f9103J.clear();
        q3.i iVar = this.f9096C;
        ((HashMap) iVar.f23382a).clear();
        ((HashMap) iVar.f23383b).clear();
        ((HashMap) iVar.f23384c).clear();
        this.f9094A.release();
    }

    public final void w() {
        boolean z8;
        J j = this.f9108P;
        d dVar = new d(this);
        synchronized (AbstractC1705a.f21159i) {
            z8 = AbstractC1705a.j;
        }
        if (z8) {
            dVar.b();
            return;
        }
        if (j == null) {
            j = new J("SntpClient");
        }
        j.f(new C0662z(15), new R7.b(dVar, 25), 1);
    }

    public final void x(M m10) {
        long j = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f9095B.getClass();
        this.f9099F.q(rVar, m10.f20557c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
    
        r2 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04a9, code lost:
    
        if (r10 > 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04ac, code lost:
    
        if (r10 < 0) goto L239;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:218:0x047e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cb  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r2v20, types: [k5.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z8) {
        T4.h hVar;
        List list;
        h hVar2;
        boolean z10;
        T4.c cVar;
        long j;
        long j10;
        T4.h hVar3;
        long j11;
        i d10;
        long j12;
        float f4;
        float f10;
        t tVar;
        boolean z11;
        i d11;
        long j13;
        long j14;
        boolean z12 = false;
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f9103J;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i7);
            if (keyAt >= this.f9122d0) {
                b bVar = (b) sparseArray.valueAt(i7);
                T4.c cVar2 = this.f9115W;
                int i10 = keyAt - this.f9122d0;
                bVar.f9064I = cVar2;
                bVar.f9065J = i10;
                q qVar = bVar.f9056A;
                qVar.f9169v = z12;
                qVar.f9167f = cVar2;
                Iterator it = qVar.f9166e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < qVar.f9167f.f9253h) {
                        it.remove();
                    }
                }
                R4.g[] gVarArr = bVar.f9061F;
                if (gVarArr != null) {
                    int length = gVarArr.length;
                    for (?? r10 = z12; r10 < length; r10++) {
                        m mVar = (m) gVarArr[r10].f8898e;
                        k[] kVarArr = mVar.f9143h;
                        try {
                            mVar.j = cVar2;
                            mVar.k = i10;
                            long d12 = cVar2.d(i10);
                            ArrayList h10 = mVar.h();
                            for (?? r15 = z12; r15 < kVarArr.length; r15++) {
                                kVarArr[r15] = kVarArr[r15].a(d12, (T4.m) h10.get(mVar.f9144i.f(r15)));
                            }
                        } catch (C0454b e2) {
                            mVar.f9145l = e2;
                        }
                        z12 = false;
                    }
                    bVar.f9060E.i(bVar);
                }
                bVar.f9066K = cVar2.b(i10).f9279d;
                for (n nVar : bVar.f9062G) {
                    Iterator it2 = bVar.f9066K.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            T4.g gVar = (T4.g) it2.next();
                            if (gVar.a().equals(nVar.f9151e.a())) {
                                nVar.c(gVar, cVar2.f9250d && i10 == cVar2.f9256m.size() - 1);
                            }
                        }
                    }
                }
            }
            i7++;
            z12 = false;
        }
        T4.h b2 = this.f9115W.b(0);
        int size = this.f9115W.f9256m.size() - 1;
        T4.h b10 = this.f9115W.b(size);
        long d13 = this.f9115W.d(size);
        long M3 = D.M(D.x(this.f9119a0));
        long d14 = this.f9115W.d(0);
        long M10 = D.M(b2.f9277b);
        boolean v10 = v(b2);
        long j15 = M10;
        int i11 = 0;
        while (true) {
            List list2 = b2.f9278c;
            hVar = b2;
            boolean z13 = v10;
            if (i11 >= list2.size()) {
                M10 = j15;
                break;
            }
            T4.a aVar = (T4.a) list2.get(i11);
            List list3 = aVar.f9239c;
            int i12 = aVar.f9238b;
            boolean z14 = (i12 == 1 || i12 == 2) ? false : true;
            if ((!z13 || !z14) && !list3.isEmpty()) {
                i d15 = ((T4.m) list3.get(0)).d();
                if (d15 == null || d15.z(d14, M3) == 0) {
                    break;
                } else {
                    j15 = Math.max(j15, d15.b(d15.l(d14, M3)) + M10);
                }
            }
            i11++;
            b2 = hVar;
            v10 = z13;
        }
        long M11 = D.M(b10.f9277b);
        boolean v11 = v(b10);
        long j16 = Long.MAX_VALUE;
        int i13 = 0;
        while (true) {
            list = b10.f9278c;
            if (i13 >= list.size()) {
                hVar2 = this;
                M11 = j16;
                break;
            }
            T4.a aVar2 = (T4.a) list.get(i13);
            List list4 = aVar2.f9239c;
            int i14 = aVar2.f9238b;
            T4.h hVar4 = b10;
            if (i14 != 1 && i14 != 2) {
                z11 = true;
                if ((v11 || !z11) && !list4.isEmpty()) {
                    d11 = ((T4.m) list4.get(0)).d();
                    if (d11 != null) {
                        M11 += d13;
                        break;
                    }
                    long z15 = d11.z(d13, M3);
                    if (z15 == 0) {
                        break;
                    }
                    long l10 = (d11.l(d13, M3) + z15) - 1;
                    long b11 = d11.b(l10) + M11;
                    j13 = M11;
                    j14 = d13;
                    j16 = Math.min(j16, d11.g(l10, j14) + b11);
                } else {
                    j13 = M11;
                    j14 = d13;
                }
                i13++;
                d13 = j14;
                b10 = hVar4;
                M11 = j13;
            }
            z11 = false;
            if (v11) {
            }
            d11 = ((T4.m) list4.get(0)).d();
            if (d11 != null) {
            }
        }
        if (hVar2.f9115W.f9250d) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                i d16 = ((T4.m) ((T4.a) list.get(i15)).f9239c.get(0)).d();
                if (d16 != null && !d16.s()) {
                }
            }
            z10 = true;
            if (z10) {
                long j17 = hVar2.f9115W.f9252f;
                if (j17 != -9223372036854775807L) {
                    M10 = Math.max(M10, M11 - D.M(j17));
                }
            }
            long j18 = M11 - M10;
            cVar = hVar2.f9115W;
            if (cVar.f9250d) {
                j = M10;
                j10 = -9223372036854775807L;
                hVar3 = hVar;
                j11 = 0;
            } else {
                AbstractC1705a.m(cVar.f9247a != -9223372036854775807L);
                long M12 = (M3 - D.M(hVar2.f9115W.f9247a)) - M10;
                long Z7 = D.Z(M12);
                C1558a0 c1558a0 = hVar2.f9123v;
                long j19 = c1558a0.f20225c.f20166c;
                if (j19 != -9223372036854775807L) {
                    j12 = Math.min(Z7, j19);
                } else {
                    t tVar2 = hVar2.f9115W.j;
                    if (tVar2 != null) {
                        long j20 = tVar2.f9312c;
                        if (j20 != -9223372036854775807L) {
                            j12 = Math.min(Z7, j20);
                        }
                    }
                    j12 = Z7;
                }
                long Z10 = D.Z(M12 - j18);
                if (Z10 < 0 && j12 > 0) {
                    Z10 = 0;
                }
                j = M10;
                long j21 = hVar2.f9115W.f9249c;
                long min = j21 != -9223372036854775807L ? Math.min(Z10 + j21, Z7) : Z10;
                U u3 = c1558a0.f20225c;
                long j22 = u3.f20165b;
                if (j22 != -9223372036854775807L) {
                    min = D.j(j22, min, Z7);
                } else {
                    t tVar3 = hVar2.f9115W.j;
                    if (tVar3 != null) {
                        long j23 = tVar3.f9311b;
                        if (j23 != -9223372036854775807L) {
                            min = D.j(j23, min, Z7);
                        }
                    }
                }
                long j24 = min;
                long j25 = j24 > j12 ? j24 : j12;
                long j26 = hVar2.f9112T.f20164a;
                if (j26 == -9223372036854775807L) {
                    T4.c cVar3 = hVar2.f9115W;
                    t tVar4 = cVar3.j;
                    if (tVar4 != null) {
                        long j27 = tVar4.f9310a;
                        if (j27 != -9223372036854775807L) {
                            j26 = j27;
                        }
                    }
                    j26 = cVar3.g;
                    if (j26 == -9223372036854775807L) {
                        j26 = hVar2.f9097D;
                    }
                }
                if (j26 < j24) {
                    j26 = j24;
                }
                long j28 = hVar2.f9098E;
                if (j26 > j25) {
                    j26 = D.j(D.Z(M12 - Math.min(j28, j18 / 2)), j24, j25);
                }
                long j29 = j26;
                float f11 = u3.f20167d;
                if (f11 == -3.4028235E38f) {
                    t tVar5 = hVar2.f9115W.j;
                    f11 = tVar5 != null ? tVar5.f9313d : -3.4028235E38f;
                }
                float f12 = u3.f20168e;
                if (f12 == -3.4028235E38f) {
                    t tVar6 = hVar2.f9115W.j;
                    f12 = tVar6 != null ? tVar6.f9314e : -3.4028235E38f;
                }
                if (f11 == -3.4028235E38f && f12 == -3.4028235E38f && ((tVar = hVar2.f9115W.j) == null || tVar.f9310a == -9223372036854775807L)) {
                    f4 = 1.0f;
                    f10 = 1.0f;
                } else {
                    f4 = f11;
                    f10 = f12;
                }
                hVar2.f9112T = new U(j29, j24, j25, f4, f10);
                long Z11 = D.Z(j) + hVar2.f9115W.f9247a;
                long M13 = M12 - D.M(hVar2.f9112T.f20164a);
                long min2 = Math.min(j28, j18 / 2);
                j11 = M13 < min2 ? min2 : M13;
                j10 = Z11;
                hVar3 = hVar;
            }
            long M14 = j - D.M(hVar3.f9277b);
            T4.c cVar4 = hVar2.f9115W;
            hVar2.o(new e(cVar4.f9247a, j10, hVar2.f9119a0, hVar2.f9122d0, M14, j18, j11, cVar4, hVar2.f9123v, !cVar4.f9250d ? hVar2.f9112T : null));
            if (hVar2.f9124w) {
                Handler handler = hVar2.f9111S;
                c cVar5 = hVar2.L;
                handler.removeCallbacks(cVar5);
                if (z10) {
                    Handler handler2 = hVar2.f9111S;
                    T4.c cVar6 = hVar2.f9115W;
                    long x2 = D.x(hVar2.f9119a0);
                    int size2 = cVar6.f9256m.size() - 1;
                    T4.h b12 = cVar6.b(size2);
                    long M15 = D.M(b12.f9277b);
                    long d17 = cVar6.d(size2);
                    long M16 = D.M(x2);
                    long M17 = D.M(cVar6.f9247a);
                    long M18 = D.M(5000L);
                    int i16 = 0;
                    while (true) {
                        List list5 = b12.f9278c;
                        if (i16 >= list5.size()) {
                            break;
                        }
                        List list6 = ((T4.a) list5.get(i16)).f9239c;
                        if (!list6.isEmpty() && (d10 = ((T4.m) list6.get(0)).d()) != null) {
                            long o10 = (d10.o(d17, M16) + (M17 + M15)) - M16;
                            if (o10 < M18 - 100000 || (o10 > M18 && o10 < M18 + 100000)) {
                                M18 = o10;
                            }
                        }
                        i16++;
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j30 = M18 / 1000;
                    long j31 = M18 - (1000 * j30);
                    if (j31 != 0) {
                        int i17 = ((int) ((M18 ^ 1000) >> 63)) | 1;
                        switch (P6.c.f8165a[roundingMode.ordinal()]) {
                            case 1:
                                if (j31 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                j30 += i17;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                long abs = Math.abs(j31);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == 0) {
                                    break;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    handler2.postDelayed(cVar5, j30);
                }
                if (hVar2.f9116X) {
                    z();
                    return;
                }
                if (z8) {
                    T4.c cVar7 = hVar2.f9115W;
                    if (cVar7.f9250d) {
                        long j32 = cVar7.f9251e;
                        if (j32 != -9223372036854775807L) {
                            hVar2.f9111S.postDelayed(hVar2.f9104K, Math.max(0L, (hVar2.f9117Y + (j32 == 0 ? 5000L : j32)) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z10 = false;
        if (z10) {
        }
        long j182 = M11 - M10;
        cVar = hVar2.f9115W;
        if (cVar.f9250d) {
        }
        long M142 = j - D.M(hVar3.f9277b);
        T4.c cVar42 = hVar2.f9115W;
        hVar2.o(new e(cVar42.f9247a, j10, hVar2.f9119a0, hVar2.f9122d0, M142, j182, j11, cVar42, hVar2.f9123v, !cVar42.f9250d ? hVar2.f9112T : null));
        if (hVar2.f9124w) {
        }
    }

    public final void z() {
        Uri uri;
        this.f9111S.removeCallbacks(this.f9104K);
        if (this.f9108P.c()) {
            return;
        }
        if (this.f9108P.d()) {
            this.f9116X = true;
            return;
        }
        synchronized (this.f9102I) {
            uri = this.f9113U;
        }
        this.f9116X = false;
        M m10 = new M(this.f9107O, uri, 4, this.f9100G);
        this.f9108P.f(m10, this.f9101H, this.f9095B.d(4));
        this.f9099F.z(new r(m10.f20556b), m10.f20557c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
