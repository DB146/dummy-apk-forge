package P4;

import A0.G0;
import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m4.C1586o0;
import m4.E0;
import m5.C1617n;
import m5.C1620q;
import m5.HandlerC1602F;
import m5.InterfaceC1601E;
import m5.InterfaceC1603G;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import r4.C1941m;
import s4.InterfaceC1982j;
import s4.InterfaceC1984l;

/* loaded from: classes.dex */
public final class T implements InterfaceC0476y, InterfaceC1984l, InterfaceC1601E, m5.H, b0 {

    /* renamed from: a0, reason: collision with root package name */
    public static final Map f7911a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final m4.L f7912b0;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0475x f7917E;

    /* renamed from: F, reason: collision with root package name */
    public J4.b f7918F;

    /* renamed from: I, reason: collision with root package name */
    public boolean f7921I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f7922J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f7923K;
    public q3.n L;

    /* renamed from: M, reason: collision with root package name */
    public s4.s f7924M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7926O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f7928Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f7929R;

    /* renamed from: S, reason: collision with root package name */
    public int f7930S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f7931T;

    /* renamed from: U, reason: collision with root package name */
    public long f7932U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f7934W;

    /* renamed from: X, reason: collision with root package name */
    public int f7935X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f7936Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f7937Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7938a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1616m f7939b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.q f7940c;

    /* renamed from: d, reason: collision with root package name */
    public final Y5.B f7941d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.s f7942e;

    /* renamed from: f, reason: collision with root package name */
    public final C1941m f7943f;

    /* renamed from: u, reason: collision with root package name */
    public final W f7944u;

    /* renamed from: v, reason: collision with root package name */
    public final C1620q f7945v;

    /* renamed from: w, reason: collision with root package name */
    public final String f7946w;

    /* renamed from: x, reason: collision with root package name */
    public final long f7947x;

    /* renamed from: z, reason: collision with root package name */
    public final G0 f7949z;

    /* renamed from: y, reason: collision with root package name */
    public final m5.J f7948y = new m5.J("ProgressiveMediaPeriod");

    /* renamed from: A, reason: collision with root package name */
    public final N7.a f7913A = new Object();

    /* renamed from: B, reason: collision with root package name */
    public final O f7914B = new O(this, 0);

    /* renamed from: C, reason: collision with root package name */
    public final O f7915C = new O(this, 1);

    /* renamed from: D, reason: collision with root package name */
    public final Handler f7916D = n5.D.m(null);

    /* renamed from: H, reason: collision with root package name */
    public S[] f7920H = new S[0];

    /* renamed from: G, reason: collision with root package name */
    public c0[] f7919G = new c0[0];

    /* renamed from: V, reason: collision with root package name */
    public long f7933V = -9223372036854775807L;

    /* renamed from: N, reason: collision with root package name */
    public long f7925N = -9223372036854775807L;

    /* renamed from: P, reason: collision with root package name */
    public int f7927P = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f7911a0 = Collections.unmodifiableMap(hashMap);
        m4.K k = new m4.K();
        k.f19976a = "icy";
        k.k = "application/x-icy";
        f7912b0 = new m4.L(k);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [N7.a, java.lang.Object] */
    public T(Uri uri, InterfaceC1616m interfaceC1616m, G0 g02, r4.q qVar, C1941m c1941m, Y5.B b2, A4.s sVar, W w10, C1620q c1620q, String str, int i7) {
        this.f7938a = uri;
        this.f7939b = interfaceC1616m;
        this.f7940c = qVar;
        this.f7943f = c1941m;
        this.f7941d = b2;
        this.f7942e = sVar;
        this.f7944u = w10;
        this.f7945v = c1620q;
        this.f7946w = str;
        this.f7947x = i7;
        this.f7949z = g02;
    }

    public final void A(int i7) {
        a();
        q3.n nVar = this.L;
        boolean[] zArr = (boolean[]) nVar.f23399e;
        if (zArr[i7]) {
            return;
        }
        m4.L l10 = ((n0) nVar.f23396b).a(i7).f8109d[0];
        this.f7942e.i(n5.o.h(l10.f20096z), l10, 0, null, this.f7932U);
        zArr[i7] = true;
    }

    public final void B(int i7) {
        a();
        boolean[] zArr = (boolean[]) this.L.f23397c;
        if (this.f7934W && zArr[i7] && !this.f7919G[i7].t(false)) {
            this.f7933V = 0L;
            this.f7934W = false;
            this.f7929R = true;
            this.f7932U = 0L;
            this.f7935X = 0;
            for (c0 c0Var : this.f7919G) {
                c0Var.A(false);
            }
            InterfaceC0475x interfaceC0475x = this.f7917E;
            interfaceC0475x.getClass();
            interfaceC0475x.i(this);
        }
    }

    public final c0 C(S s3) {
        int length = this.f7919G.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (s3.equals(this.f7920H[i7])) {
                return this.f7919G[i7];
            }
        }
        C1941m c1941m = this.f7943f;
        r4.q qVar = this.f7940c;
        qVar.getClass();
        c0 c0Var = new c0(this.f7945v, qVar, c1941m);
        c0Var.f8002f = this;
        int i10 = length + 1;
        S[] sArr = (S[]) Arrays.copyOf(this.f7920H, i10);
        sArr[length] = s3;
        this.f7920H = sArr;
        c0[] c0VarArr = (c0[]) Arrays.copyOf(this.f7919G, i10);
        c0VarArr[length] = c0Var;
        this.f7919G = c0VarArr;
        return c0Var;
    }

    public final void D() {
        P p10 = new P(this, this.f7938a, this.f7939b, this.f7949z, this, this.f7913A);
        if (this.f7922J) {
            AbstractC1705a.m(w());
            long j = this.f7925N;
            if (j != -9223372036854775807L && this.f7933V > j) {
                this.f7936Y = true;
                this.f7933V = -9223372036854775807L;
                return;
            }
            s4.s sVar = this.f7924M;
            sVar.getClass();
            long j10 = sVar.h(this.f7933V).f24084a.f24088b;
            long j11 = this.f7933V;
            p10.f7900f.f3957a = j10;
            p10.f7903w = j11;
            p10.f7902v = true;
            p10.f7906z = false;
            for (c0 c0Var : this.f7919G) {
                c0Var.f8013t = this.f7933V;
            }
            this.f7933V = -9223372036854775807L;
        }
        this.f7935X = b();
        this.f7948y.f(p10, this, this.f7941d.d(this.f7927P));
        this.f7942e.z(new r(p10.f7904x), 1, -1, null, 0, null, p10.f7903w, this.f7925N);
    }

    public final boolean E() {
        return this.f7929R || w();
    }

    public final void a() {
        AbstractC1705a.m(this.f7922J);
        this.L.getClass();
        this.f7924M.getClass();
    }

    public final int b() {
        int i7 = 0;
        for (c0 c0Var : this.f7919G) {
            i7 += c0Var.f8010q + c0Var.f8009p;
        }
        return i7;
    }

    @Override // P4.InterfaceC0476y
    public final long c(long j, E0 e02) {
        a();
        if (!this.f7924M.g()) {
            return 0L;
        }
        s4.r h10 = this.f7924M.h(j);
        return e02.a(j, h10.f24084a.f24087a, h10.f24085b.f24087a);
    }

    @Override // P4.f0
    public final boolean d() {
        boolean z8;
        if (this.f7948y.d()) {
            N7.a aVar = this.f7913A;
            synchronized (aVar) {
                z8 = aVar.f7385a;
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // m5.InterfaceC1601E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D4.e e(InterfaceC1603G interfaceC1603G, long j, long j10, IOException iOException, int i7) {
        long j11;
        D4.e eVar;
        s4.s sVar;
        P p10 = (P) interfaceC1603G;
        m5.S s3 = p10.f7896b;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        int i10 = n5.D.f21141a;
        this.f7941d.getClass();
        if (!(iOException instanceof C1586o0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof m5.z) && !(iOException instanceof m5.I)) {
            int i11 = C1617n.f20620b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1617n) || ((C1617n) th).f20621a != 2008) {
                }
            }
            j11 = Math.min((i7 - 1) * 1000, 5000);
            if (j11 != -9223372036854775807L) {
                eVar = m5.J.f20551f;
            } else {
                int b2 = b();
                int i12 = b2 > this.f7935X ? 1 : 0;
                if (this.f7931T || !((sVar = this.f7924M) == null || sVar.i() == -9223372036854775807L)) {
                    this.f7935X = b2;
                } else if (!this.f7922J || E()) {
                    this.f7929R = this.f7922J;
                    this.f7932U = 0L;
                    this.f7935X = 0;
                    for (c0 c0Var : this.f7919G) {
                        c0Var.A(false);
                    }
                    p10.f7900f.f3957a = 0L;
                    p10.f7903w = 0L;
                    p10.f7902v = true;
                    p10.f7906z = false;
                } else {
                    this.f7934W = true;
                    eVar = m5.J.f20550e;
                }
                eVar = new D4.e(i12, j11, false);
            }
            D4.e eVar2 = eVar;
            this.f7942e.v(rVar, 1, -1, null, 0, null, p10.f7903w, this.f7925N, iOException, !eVar2.a());
            return eVar2;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        D4.e eVar22 = eVar;
        this.f7942e.v(rVar, 1, -1, null, 0, null, p10.f7903w, this.f7925N, iOException, !eVar22.a());
        return eVar22;
    }

    @Override // s4.InterfaceC1984l
    public final void f() {
        this.f7921I = true;
        this.f7916D.post(this.f7914B);
    }

    @Override // m5.H
    public final void g() {
        for (c0 c0Var : this.f7919G) {
            c0Var.z();
        }
        G0 g02 = this.f7949z;
        InterfaceC1982j interfaceC1982j = (InterfaceC1982j) g02.f28c;
        if (interfaceC1982j != null) {
            interfaceC1982j.release();
            g02.f28c = null;
        }
        g02.f29d = null;
    }

    public final long h(boolean z8) {
        int i7;
        long j = Long.MIN_VALUE;
        while (i7 < this.f7919G.length) {
            if (!z8) {
                q3.n nVar = this.L;
                nVar.getClass();
                i7 = ((boolean[]) nVar.f23398d)[i7] ? 0 : i7 + 1;
            }
            j = Math.max(j, this.f7919G[i7].m());
        }
        return j;
    }

    @Override // s4.InterfaceC1984l
    public final void i(s4.s sVar) {
        this.f7916D.post(new Aa.j(6, this, sVar));
    }

    @Override // P4.f0
    public final long j() {
        return n();
    }

    @Override // P4.InterfaceC0476y
    public final long k() {
        if (!this.f7929R) {
            return -9223372036854775807L;
        }
        if (!this.f7936Y && b() <= this.f7935X) {
            return -9223372036854775807L;
        }
        this.f7929R = false;
        return this.f7932U;
    }

    @Override // P4.InterfaceC0476y
    public final n0 l() {
        a();
        return (n0) this.L.f23396b;
    }

    @Override // m5.InterfaceC1601E
    public final void m(InterfaceC1603G interfaceC1603G, long j, long j10, boolean z8) {
        P p10 = (P) interfaceC1603G;
        m5.S s3 = p10.f7896b;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f7941d.getClass();
        this.f7942e.q(rVar, 1, -1, null, 0, null, p10.f7903w, this.f7925N);
        if (z8) {
            return;
        }
        for (c0 c0Var : this.f7919G) {
            c0Var.A(false);
        }
        if (this.f7930S > 0) {
            InterfaceC0475x interfaceC0475x = this.f7917E;
            interfaceC0475x.getClass();
            interfaceC0475x.i(this);
        }
    }

    @Override // P4.f0
    public final long n() {
        long j;
        boolean z8;
        a();
        if (this.f7936Y || this.f7930S == 0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.f7933V;
        }
        if (this.f7923K) {
            int length = this.f7919G.length;
            j = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                q3.n nVar = this.L;
                if (((boolean[]) nVar.f23397c)[i7] && ((boolean[]) nVar.f23398d)[i7]) {
                    c0 c0Var = this.f7919G[i7];
                    synchronized (c0Var) {
                        z8 = c0Var.f8016w;
                    }
                    if (!z8) {
                        j = Math.min(j, this.f7919G[i7].m());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = h(false);
        }
        return j == Long.MIN_VALUE ? this.f7932U : j;
    }

    @Override // P4.InterfaceC0476y
    public final void o() {
        int d10 = this.f7941d.d(this.f7927P);
        m5.J j = this.f7948y;
        IOException iOException = j.f20554c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1602F handlerC1602F = j.f20553b;
        if (handlerC1602F != null) {
            if (d10 == Integer.MIN_VALUE) {
                d10 = handlerC1602F.f20539a;
            }
            IOException iOException2 = handlerC1602F.f20543e;
            if (iOException2 != null && handlerC1602F.f20544f > d10) {
                throw iOException2;
            }
        }
        if (this.f7936Y && !this.f7922J) {
            throw C1586o0.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // P4.b0
    public final void p() {
        this.f7916D.post(this.f7914B);
    }

    @Override // P4.InterfaceC0476y
    public final void q(InterfaceC0475x interfaceC0475x, long j) {
        this.f7917E = interfaceC0475x;
        this.f7913A.b();
        D();
    }

    @Override // P4.InterfaceC0476y
    public final long r(long j) {
        int i7;
        a();
        boolean[] zArr = (boolean[]) this.L.f23397c;
        if (!this.f7924M.g()) {
            j = 0;
        }
        this.f7929R = false;
        this.f7932U = j;
        if (w()) {
            this.f7933V = j;
            return j;
        }
        if (this.f7927P != 7) {
            int length = this.f7919G.length;
            for (0; i7 < length; i7 + 1) {
                i7 = (this.f7919G[i7].B(j, false) || (!zArr[i7] && this.f7923K)) ? i7 + 1 : 0;
            }
            return j;
        }
        this.f7934W = false;
        this.f7933V = j;
        this.f7936Y = false;
        m5.J j10 = this.f7948y;
        if (j10.d()) {
            for (c0 c0Var : this.f7919G) {
                c0Var.h();
            }
            j10.b();
        } else {
            j10.f20554c = null;
            for (c0 c0Var2 : this.f7919G) {
                c0Var2.A(false);
            }
        }
        return j;
    }

    @Override // P4.InterfaceC0476y
    public final void s(long j) {
        a();
        if (w()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.L.f23398d;
        int length = this.f7919G.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f7919G[i7].g(j, zArr[i7]);
        }
    }

    @Override // m5.InterfaceC1601E
    public final void t(InterfaceC1603G interfaceC1603G, long j, long j10) {
        s4.s sVar;
        P p10 = (P) interfaceC1603G;
        if (this.f7925N == -9223372036854775807L && (sVar = this.f7924M) != null) {
            boolean g = sVar.g();
            long h10 = h(true);
            long j11 = h10 == Long.MIN_VALUE ? 0L : h10 + 10000;
            this.f7925N = j11;
            this.f7944u.w(j11, g, this.f7926O);
        }
        m5.S s3 = p10.f7896b;
        Uri uri = s3.f20581c;
        r rVar = new r(s3.f20582d);
        this.f7941d.getClass();
        this.f7942e.t(rVar, 1, -1, null, 0, null, p10.f7903w, this.f7925N);
        this.f7936Y = true;
        InterfaceC0475x interfaceC0475x = this.f7917E;
        interfaceC0475x.getClass();
        interfaceC0475x.i(this);
    }

    @Override // s4.InterfaceC1984l
    public final s4.v u(int i7, int i10) {
        return C(new S(i7, false));
    }

    @Override // P4.InterfaceC0476y
    public final long v(k5.s[] sVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        k5.s sVar;
        a();
        q3.n nVar = this.L;
        n0 n0Var = (n0) nVar.f23396b;
        boolean[] zArr3 = (boolean[]) nVar.f23398d;
        int i7 = this.f7930S;
        int i10 = 0;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            d0 d0Var = d0VarArr[i11];
            if (d0Var != null && (sVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((Q) d0Var).f7907a;
                AbstractC1705a.m(zArr3[i12]);
                this.f7930S--;
                zArr3[i12] = false;
                d0VarArr[i11] = null;
            }
        }
        boolean z8 = !this.f7928Q ? j == 0 : i7 != 0;
        for (int i13 = 0; i13 < sVarArr.length; i13++) {
            if (d0VarArr[i13] == null && (sVar = sVarArr[i13]) != null) {
                AbstractC1705a.m(sVar.length() == 1);
                AbstractC1705a.m(sVar.f(0) == 0);
                int b2 = n0Var.b(sVar.k());
                AbstractC1705a.m(!zArr3[b2]);
                this.f7930S++;
                zArr3[b2] = true;
                d0VarArr[i13] = new Q(this, b2);
                zArr2[i13] = true;
                if (!z8) {
                    c0 c0Var = this.f7919G[b2];
                    z8 = (c0Var.B(j, true) || c0Var.o() == 0) ? false : true;
                }
            }
        }
        if (this.f7930S == 0) {
            this.f7934W = false;
            this.f7929R = false;
            m5.J j10 = this.f7948y;
            if (j10.d()) {
                c0[] c0VarArr = this.f7919G;
                int length = c0VarArr.length;
                while (i10 < length) {
                    c0VarArr[i10].h();
                    i10++;
                }
                j10.b();
            } else {
                for (c0 c0Var2 : this.f7919G) {
                    c0Var2.A(false);
                }
            }
        } else if (z8) {
            j = r(j);
            while (i10 < d0VarArr.length) {
                if (d0VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f7928Q = true;
        return j;
    }

    public final boolean w() {
        return this.f7933V != -9223372036854775807L;
    }

    @Override // P4.f0
    public final boolean x(long j) {
        if (this.f7936Y) {
            return false;
        }
        m5.J j10 = this.f7948y;
        if (j10.c() || this.f7934W) {
            return false;
        }
        if (this.f7922J && this.f7930S == 0) {
            return false;
        }
        boolean b2 = this.f7913A.b();
        if (j10.d()) {
            return b2;
        }
        D();
        return true;
    }

    @Override // P4.f0
    public final void y(long j) {
    }

    public final void z() {
        int i7;
        if (this.f7937Z || this.f7922J || !this.f7921I || this.f7924M == null) {
            return;
        }
        for (c0 c0Var : this.f7919G) {
            if (c0Var.r() == null) {
                return;
            }
        }
        this.f7913A.a();
        int length = this.f7919G.length;
        m0[] m0VarArr = new m0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            m4.L r10 = this.f7919G[i10].r();
            r10.getClass();
            String str = r10.f20096z;
            boolean j = n5.o.j(str);
            boolean z8 = j || n5.o.l(str);
            zArr[i10] = z8;
            this.f7923K = z8 | this.f7923K;
            J4.b bVar = this.f7918F;
            if (bVar != null) {
                if (j || this.f7920H[i10].f7910b) {
                    F4.c cVar = r10.f20094x;
                    F4.c cVar2 = cVar == null ? new F4.c(bVar) : cVar.a(bVar);
                    m4.K a9 = r10.a();
                    a9.f19983i = cVar2;
                    r10 = new m4.L(a9);
                }
                if (j && r10.f20090f == -1 && r10.f20091u == -1 && (i7 = bVar.f5517a) != -1) {
                    m4.K a10 = r10.a();
                    a10.f19981f = i7;
                    r10 = new m4.L(a10);
                }
            }
            int e2 = this.f7940c.e(r10);
            m4.K a11 = r10.a();
            a11.f19975F = e2;
            m0VarArr[i10] = new m0(Integer.toString(i10), new m4.L(a11));
        }
        this.L = new q3.n(new n0(m0VarArr), zArr);
        this.f7922J = true;
        InterfaceC0475x interfaceC0475x = this.f7917E;
        interfaceC0475x.getClass();
        interfaceC0475x.a(this);
    }
}
