package C3;

import A0.G0;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements g, Runnable, Comparable, X3.b {

    /* renamed from: A, reason: collision with root package name */
    public int f2543A;

    /* renamed from: B, reason: collision with root package name */
    public m f2544B;

    /* renamed from: C, reason: collision with root package name */
    public A3.l f2545C;

    /* renamed from: D, reason: collision with root package name */
    public r f2546D;

    /* renamed from: E, reason: collision with root package name */
    public int f2547E;

    /* renamed from: F, reason: collision with root package name */
    public long f2548F;

    /* renamed from: G, reason: collision with root package name */
    public Object f2549G;

    /* renamed from: H, reason: collision with root package name */
    public Thread f2550H;

    /* renamed from: I, reason: collision with root package name */
    public A3.h f2551I;

    /* renamed from: J, reason: collision with root package name */
    public A3.h f2552J;

    /* renamed from: K, reason: collision with root package name */
    public Object f2553K;
    public A3.a L;

    /* renamed from: M, reason: collision with root package name */
    public com.bumptech.glide.load.data.e f2554M;

    /* renamed from: N, reason: collision with root package name */
    public volatile h f2555N;

    /* renamed from: O, reason: collision with root package name */
    public volatile boolean f2556O;

    /* renamed from: P, reason: collision with root package name */
    public volatile boolean f2557P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2558Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2559R;

    /* renamed from: S, reason: collision with root package name */
    public int f2560S;

    /* renamed from: d, reason: collision with root package name */
    public final F5.i f2564d;

    /* renamed from: e, reason: collision with root package name */
    public final Q7.h f2565e;

    /* renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.f f2568v;

    /* renamed from: w, reason: collision with root package name */
    public A3.h f2569w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.g f2570x;

    /* renamed from: y, reason: collision with root package name */
    public s f2571y;

    /* renamed from: z, reason: collision with root package name */
    public int f2572z;

    /* renamed from: a, reason: collision with root package name */
    public final i f2561a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2562b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final X3.e f2563c = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final G0 f2566f = new G0(7, (char) 0);

    /* renamed from: u, reason: collision with root package name */
    public final j f2567u = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X3.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [C3.j, java.lang.Object] */
    public k(F5.i iVar, Q7.h hVar) {
        this.f2564d = iVar;
        this.f2565e = hVar;
    }

    public final void B() {
        this.f2563c.a();
        if (this.f2556O) {
            throw new IllegalStateException("Already notified", this.f2562b.isEmpty() ? null : (Throwable) h3.o.k(1, this.f2562b));
        }
        this.f2556O = true;
    }

    @Override // X3.b
    public final X3.e a() {
        return this.f2563c;
    }

    @Override // C3.g
    public final void b(A3.h hVar, Exception exc, com.bumptech.glide.load.data.e eVar, A3.a aVar) {
        eVar.a();
        v vVar = new v("Fetching data failed", Collections.singletonList(exc));
        Class b2 = eVar.b();
        vVar.f2636b = hVar;
        vVar.f2637c = aVar;
        vVar.f2638d = b2;
        this.f2562b.add(vVar);
        if (Thread.currentThread() != this.f2550H) {
            v(2);
        } else {
            y();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        int ordinal = this.f2570x.ordinal() - kVar.f2570x.ordinal();
        return ordinal == 0 ? this.f2547E - kVar.f2547E : ordinal;
    }

    @Override // C3.g
    public final void d(A3.h hVar, Object obj, com.bumptech.glide.load.data.e eVar, A3.a aVar, A3.h hVar2) {
        this.f2551I = hVar;
        this.f2553K = obj;
        this.f2554M = eVar;
        this.L = aVar;
        this.f2552J = hVar2;
        this.f2558Q = hVar != this.f2561a.a().get(0);
        if (Thread.currentThread() != this.f2550H) {
            v(3);
        } else {
            i();
        }
    }

    public final A f(com.bumptech.glide.load.data.e eVar, Object obj, A3.a aVar) {
        if (obj == null) {
            return null;
        }
        try {
            int i7 = W3.i.f10608b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            A g = g(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                r(elapsedRealtimeNanos, "Decoded result " + g, null);
            }
            return g;
        } finally {
            eVar.a();
        }
    }

    public final A g(Object obj, A3.a aVar) {
        Class<?> cls = obj.getClass();
        i iVar = this.f2561a;
        y c10 = iVar.c(cls);
        A3.l lVar = this.f2545C;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z8 = aVar == A3.a.f345d || iVar.f2539r;
            A3.k kVar = J3.q.f5489i;
            Boolean bool = (Boolean) lVar.c(kVar);
            if (bool == null || (bool.booleanValue() && !z8)) {
                lVar = new A3.l();
                A3.l lVar2 = this.f2545C;
                W3.c cVar = lVar.f360b;
                cVar.g(lVar2.f360b);
                cVar.put(kVar, Boolean.valueOf(z8));
            }
        }
        A3.l lVar3 = lVar;
        com.bumptech.glide.load.data.g g = this.f2568v.a().g(obj);
        try {
            return c10.a(this.f2572z, this.f2543A, lVar3, g, new q3.l(3, this, aVar));
        } finally {
            g.a();
        }
    }

    public final void i() {
        A a9;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            r(this.f2548F, "Retrieved data", "data: " + this.f2553K + ", cache key: " + this.f2551I + ", fetcher: " + this.f2554M);
        }
        z zVar = null;
        try {
            a9 = f(this.f2554M, this.f2553K, this.L);
        } catch (v e2) {
            A3.h hVar = this.f2552J;
            A3.a aVar = this.L;
            e2.f2636b = hVar;
            e2.f2637c = aVar;
            e2.f2638d = null;
            this.f2562b.add(e2);
            a9 = null;
        }
        if (a9 == null) {
            y();
            return;
        }
        A3.a aVar2 = this.L;
        boolean z8 = this.f2558Q;
        if (a9 instanceof w) {
            ((w) a9).a();
        }
        if (((z) this.f2566f.f29d) != null) {
            zVar = (z) z.f2644e.h();
            zVar.f2648d = false;
            zVar.f2647c = true;
            zVar.f2646b = a9;
            a9 = zVar;
        }
        B();
        r rVar = this.f2546D;
        synchronized (rVar) {
            rVar.f2597B = a9;
            rVar.f2598C = aVar2;
            rVar.f2605J = z8;
        }
        synchronized (rVar) {
            try {
                rVar.f2607b.a();
                if (rVar.f2604I) {
                    rVar.f2597B.d();
                    rVar.g();
                } else {
                    if (rVar.f2606a.f2594a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (rVar.f2599D) {
                        throw new IllegalStateException("Already have resource");
                    }
                    U9.j jVar = rVar.f2610e;
                    A a11 = rVar.f2597B;
                    boolean z10 = rVar.f2617z;
                    s sVar = rVar.f2616y;
                    n nVar = rVar.f2608c;
                    jVar.getClass();
                    rVar.f2602G = new t(a11, z10, true, sVar, nVar);
                    rVar.f2599D = true;
                    q qVar = rVar.f2606a;
                    qVar.getClass();
                    ArrayList arrayList = new ArrayList(qVar.f2594a);
                    rVar.e(arrayList.size() + 1);
                    rVar.f2611f.d(rVar, rVar.f2616y, rVar.f2602G);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        p pVar = (p) it.next();
                        pVar.f2593b.execute(new o(rVar, pVar.f2592a, 1));
                    }
                    rVar.d();
                }
            } finally {
            }
        }
        this.f2559R = 5;
        try {
            G0 g02 = this.f2566f;
            if (((z) g02.f29d) != null) {
                F5.i iVar = this.f2564d;
                A3.l lVar = this.f2545C;
                g02.getClass();
                try {
                    iVar.a().d((A3.h) g02.f27b, new G0((A3.o) g02.f28c, (z) g02.f29d, lVar));
                    ((z) g02.f29d).e();
                } catch (Throwable th) {
                    ((z) g02.f29d).e();
                    throw th;
                }
            }
            j jVar2 = this.f2567u;
            synchronized (jVar2) {
                jVar2.f2541b = true;
                a10 = jVar2.a();
            }
            if (a10) {
                u();
            }
        } finally {
            if (zVar != null) {
                zVar.e();
            }
        }
    }

    public final h j() {
        int b2 = P.c.b(this.f2559R);
        i iVar = this.f2561a;
        if (b2 == 1) {
            return new B(iVar, this);
        }
        if (b2 == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (b2 == 3) {
            return new D(iVar, this);
        }
        if (b2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(A3.c.s(this.f2559R)));
    }

    public final int o(int i7) {
        boolean z8;
        boolean z10;
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            switch (this.f2544B.f2581a) {
                case 0:
                case 1:
                    z8 = false;
                    break;
                default:
                    z8 = true;
                    break;
            }
            if (z8) {
                return 2;
            }
            return o(2);
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return 4;
            }
            if (b2 == 3 || b2 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(A3.c.s(i7)));
        }
        switch (this.f2544B.f2581a) {
            case 0:
                z10 = false;
                break;
            case 1:
            default:
                z10 = true;
                break;
        }
        if (z10) {
            return 3;
        }
        return o(3);
    }

    public final void r(long j, String str, String str2) {
        StringBuilder n6 = A3.c.n(str, " in ");
        n6.append(W3.i.a(j));
        n6.append(", load key: ");
        n6.append(this.f2571y);
        n6.append(str2 != null ? ", ".concat(str2) : "");
        n6.append(", thread: ");
        n6.append(Thread.currentThread().getName());
        Log.v("DecodeJob", n6.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.f2554M;
        try {
            try {
                if (this.f2557P) {
                    t();
                    if (eVar != null) {
                        eVar.a();
                        return;
                    }
                    return;
                }
                z();
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.a();
                }
                throw th;
            }
        } catch (C0238d e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f2557P + ", stage: " + A3.c.s(this.f2559R), th2);
            }
            if (this.f2559R != 5) {
                this.f2562b.add(th2);
                t();
            }
            if (!this.f2557P) {
                throw th2;
            }
            throw th2;
        }
    }

    public final void t() {
        boolean a9;
        B();
        v vVar = new v("Failed to load resource", new ArrayList(this.f2562b));
        r rVar = this.f2546D;
        synchronized (rVar) {
            rVar.f2600E = vVar;
        }
        synchronized (rVar) {
            try {
                rVar.f2607b.a();
                if (rVar.f2604I) {
                    rVar.g();
                } else {
                    if (rVar.f2606a.f2594a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (rVar.f2601F) {
                        throw new IllegalStateException("Already failed once");
                    }
                    rVar.f2601F = true;
                    s sVar = rVar.f2616y;
                    q qVar = rVar.f2606a;
                    qVar.getClass();
                    ArrayList arrayList = new ArrayList(qVar.f2594a);
                    rVar.e(arrayList.size() + 1);
                    rVar.f2611f.d(rVar, sVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        p pVar = (p) it.next();
                        pVar.f2593b.execute(new o(rVar, pVar.f2592a, 0));
                    }
                    rVar.d();
                }
            } finally {
            }
        }
        j jVar = this.f2567u;
        synchronized (jVar) {
            jVar.f2542c = true;
            a9 = jVar.a();
        }
        if (a9) {
            u();
        }
    }

    public final void u() {
        j jVar = this.f2567u;
        synchronized (jVar) {
            jVar.f2541b = false;
            jVar.f2540a = false;
            jVar.f2542c = false;
        }
        G0 g02 = this.f2566f;
        g02.f27b = null;
        g02.f28c = null;
        g02.f29d = null;
        i iVar = this.f2561a;
        iVar.f2527c = null;
        iVar.f2528d = null;
        iVar.f2535n = null;
        iVar.g = null;
        iVar.k = null;
        iVar.f2532i = null;
        iVar.f2536o = null;
        iVar.j = null;
        iVar.f2537p = null;
        iVar.f2525a.clear();
        iVar.f2533l = false;
        iVar.f2526b.clear();
        iVar.f2534m = false;
        this.f2556O = false;
        this.f2568v = null;
        this.f2569w = null;
        this.f2545C = null;
        this.f2570x = null;
        this.f2571y = null;
        this.f2546D = null;
        this.f2559R = 0;
        this.f2555N = null;
        this.f2550H = null;
        this.f2551I = null;
        this.f2553K = null;
        this.L = null;
        this.f2554M = null;
        this.f2548F = 0L;
        this.f2557P = false;
        this.f2562b.clear();
        this.f2565e.M(this);
    }

    public final void v(int i7) {
        this.f2560S = i7;
        r rVar = this.f2546D;
        (rVar.f2596A ? rVar.f2614w : rVar.f2613v).execute(this);
    }

    public final void y() {
        this.f2550H = Thread.currentThread();
        int i7 = W3.i.f10608b;
        this.f2548F = SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        while (!this.f2557P && this.f2555N != null && !(z8 = this.f2555N.a())) {
            this.f2559R = o(this.f2559R);
            this.f2555N = j();
            if (this.f2559R == 4) {
                v(2);
                return;
            }
        }
        if ((this.f2559R == 6 || this.f2557P) && !z8) {
            t();
        }
    }

    public final void z() {
        int b2 = P.c.b(this.f2560S);
        if (b2 == 0) {
            this.f2559R = o(1);
            this.f2555N = j();
            y();
        } else if (b2 == 1) {
            y();
        } else if (b2 == 2) {
            i();
        } else {
            int i7 = this.f2560S;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }
}
