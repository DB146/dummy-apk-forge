package Y4;

import A4.s;
import A9.S2;
import P4.AbstractC0453a;
import P4.InterfaceC0476y;
import P4.h0;
import P4.r;
import R4.g;
import S4.j;
import Y5.B;
import Y5.C0656w;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import h8.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import m4.AbstractC1556J;
import m4.C1558a0;
import m4.C1586o0;
import m4.V;
import m5.C1617n;
import m5.C1620q;
import m5.I;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import m5.J;
import m5.K;
import m5.L;
import m5.M;
import m5.S;
import m5.T;
import m5.z;
import n4.l;
import n5.AbstractC1705a;
import n5.D;
import r4.C1941m;
import r4.q;

/* loaded from: classes.dex */
public final class c extends AbstractC0453a implements InterfaceC1601E {

    /* renamed from: A, reason: collision with root package name */
    public final e f11174A;

    /* renamed from: B, reason: collision with root package name */
    public final q f11175B;

    /* renamed from: C, reason: collision with root package name */
    public final B f11176C;

    /* renamed from: D, reason: collision with root package name */
    public final long f11177D;

    /* renamed from: E, reason: collision with root package name */
    public final s f11178E;

    /* renamed from: F, reason: collision with root package name */
    public final L f11179F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f11180G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC1616m f11181H;

    /* renamed from: I, reason: collision with root package name */
    public J f11182I;

    /* renamed from: J, reason: collision with root package name */
    public K f11183J;

    /* renamed from: K, reason: collision with root package name */
    public T f11184K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public Z4.c f11185M;

    /* renamed from: N, reason: collision with root package name */
    public Handler f11186N;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f11187v;

    /* renamed from: w, reason: collision with root package name */
    public final Uri f11188w;

    /* renamed from: x, reason: collision with root package name */
    public final C1558a0 f11189x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC1615l f11190y;

    /* renamed from: z, reason: collision with root package name */
    public final j f11191z;

    static {
        AbstractC1556J.a("goog.exo.smoothstreaming");
    }

    public c(C1558a0 c1558a0, InterfaceC1615l interfaceC1615l, L l10, j jVar, e eVar, q qVar, B b2, long j) {
        this.f11189x = c1558a0;
        V v10 = c1558a0.f20224b;
        v10.getClass();
        this.f11185M = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = v10.f20177a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            int i7 = D.f21141a;
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = D.f21148i.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f11188w = uri2;
        this.f11190y = interfaceC1615l;
        this.f11179F = l10;
        this.f11191z = jVar;
        this.f11174A = eVar;
        this.f11175B = qVar;
        this.f11176C = b2;
        this.f11177D = j;
        this.f11178E = a(null);
        this.f11187v = false;
        this.f11180G = new ArrayList();
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(P4.B b2, C1620q c1620q, long j) {
        s a9 = a(b2);
        C1941m c1941m = new C1941m(this.f7981d.f23773c, 0, b2);
        Z4.c cVar = this.f11185M;
        T t5 = this.f11184K;
        B b10 = this.f11176C;
        K k = this.f11183J;
        b bVar = new b(cVar, this.f11191z, t5, this.f11174A, this.f11175B, c1941m, b10, a9, k, c1620q);
        this.f11180G.add(bVar);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    @Override // m5.InterfaceC1601E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        long j11;
        M m10 = (M) interfaceC1603G;
        long j12 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f11176C.getClass();
        if (!(iOException instanceof C1586o0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof z) && !(iOException instanceof I)) {
            int i10 = C1617n.f20620b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1617n) || ((C1617n) th).f20621a != 2008) {
                }
            }
            j11 = Math.min((i7 - 1) * 1000, 5000);
            D4.e eVar = j11 != -9223372036854775807L ? J.f20551f : new D4.e(0, j11, false);
            this.f11178E.w(rVar, m10.f20557c, iOException, !eVar.a());
            return eVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        this.f11178E.w(rVar, m10.f20557c, iOException, !eVar.a());
        return eVar;
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f11189x;
    }

    @Override // P4.AbstractC0453a
    public final void k() {
        this.f11183J.a();
    }

    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        M m10 = (M) interfaceC1603G;
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f11176C.getClass();
        this.f11178E.q(rVar, m10.f20557c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // P4.AbstractC0453a
    public final void n(T t5) {
        this.f11184K = t5;
        Looper myLooper = Looper.myLooper();
        l lVar = this.f7984u;
        AbstractC1705a.n(lVar);
        q qVar = this.f11175B;
        qVar.b(myLooper, lVar);
        qVar.a();
        if (this.f11187v) {
            this.f11183J = new C0656w(15);
            v();
            return;
        }
        this.f11181H = this.f11190y.e();
        J j = new J("SsMediaSource");
        this.f11182I = j;
        this.f11183J = j;
        this.f11186N = D.m(null);
        w();
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        b bVar = (b) interfaceC0476y;
        for (g gVar : bVar.f11160A) {
            gVar.B(null);
        }
        bVar.f11172y = null;
        this.f11180G.remove(interfaceC0476y);
    }

    @Override // P4.AbstractC0453a
    public final void r() {
        this.f11185M = this.f11187v ? this.f11185M : null;
        this.f11181H = null;
        this.L = 0L;
        J j = this.f11182I;
        if (j != null) {
            j.e(null);
            this.f11182I = null;
        }
        Handler handler = this.f11186N;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11186N = null;
        }
        this.f11175B.release();
    }

    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        M m10 = (M) interfaceC1603G;
        long j11 = m10.f20555a;
        S s3 = m10.f20558d;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f11176C.getClass();
        this.f11178E.s(rVar, m10.f20557c);
        this.f11185M = (Z4.c) m10.f20560f;
        this.L = j - j10;
        v();
        if (this.f11185M.f12168d) {
            this.f11186N.postDelayed(new S2(this, 20), Math.max(0L, (this.L + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void v() {
        h0 h0Var;
        g[] gVarArr;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f11180G;
            if (i7 >= arrayList.size()) {
                break;
            }
            b bVar = (b) arrayList.get(i7);
            Z4.c cVar = this.f11185M;
            bVar.f11173z = cVar;
            g[] gVarArr2 = bVar.f11160A;
            int length = gVarArr2.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = (a) gVarArr2[i10].f8898e;
                Z4.b[] bVarArr = aVar.f11158f.f12170f;
                int i11 = aVar.f11154b;
                Z4.b bVar2 = bVarArr[i11];
                int i12 = bVar2.k;
                Z4.b bVar3 = cVar.f12170f[i11];
                if (i12 == 0 || bVar3.k == 0) {
                    gVarArr = gVarArr2;
                    aVar.g += i12;
                } else {
                    int i13 = i12 - 1;
                    long[] jArr = bVar2.f12163o;
                    long b2 = bVar2.b(i13) + jArr[i13];
                    gVarArr = gVarArr2;
                    long j = bVar3.f12163o[0];
                    if (b2 <= j) {
                        aVar.g += i12;
                    } else {
                        aVar.g = D.e(jArr, j, true) + aVar.g;
                    }
                }
                aVar.f11158f = cVar;
                i10++;
                gVarArr2 = gVarArr;
            }
            bVar.f11172y.i(bVar);
            i7++;
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (Z4.b bVar4 : this.f11185M.f12170f) {
            if (bVar4.k > 0) {
                long[] jArr2 = bVar4.f12163o;
                j11 = Math.min(j11, jArr2[0]);
                int i14 = bVar4.k - 1;
                j10 = Math.max(j10, bVar4.b(i14) + jArr2[i14]);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.f11185M.f12168d ? -9223372036854775807L : 0L;
            Z4.c cVar2 = this.f11185M;
            boolean z8 = cVar2.f12168d;
            h0Var = new h0(j12, 0L, 0L, 0L, true, z8, z8, cVar2, this.f11189x);
        } else {
            Z4.c cVar3 = this.f11185M;
            if (cVar3.f12168d) {
                long j13 = cVar3.f12171h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long M3 = j15 - D.M(this.f11177D);
                if (M3 < 5000000) {
                    M3 = Math.min(5000000L, j15 / 2);
                }
                h0Var = new h0(-9223372036854775807L, j15, j14, M3, true, true, true, this.f11185M, this.f11189x);
            } else {
                long j16 = cVar3.g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                h0Var = new h0(-9223372036854775807L, -9223372036854775807L, j11 + j17, j17, j11, 0L, true, false, false, this.f11185M, this.f11189x, null);
            }
        }
        o(h0Var);
    }

    public final void w() {
        if (this.f11182I.c()) {
            return;
        }
        M m10 = new M(this.f11181H, this.f11188w, 4, this.f11179F);
        J j = this.f11182I;
        B b2 = this.f11176C;
        int i7 = m10.f20557c;
        j.f(m10, this, b2.d(i7));
        this.f11178E.z(new r(m10.f20556b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
