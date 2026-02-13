package C3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r implements X3.b {

    /* renamed from: K, reason: collision with root package name */
    public static final U9.j f2595K = new U9.j(2);

    /* renamed from: A, reason: collision with root package name */
    public boolean f2596A;

    /* renamed from: B, reason: collision with root package name */
    public A f2597B;

    /* renamed from: C, reason: collision with root package name */
    public A3.a f2598C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2599D;

    /* renamed from: E, reason: collision with root package name */
    public v f2600E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2601F;

    /* renamed from: G, reason: collision with root package name */
    public t f2602G;

    /* renamed from: H, reason: collision with root package name */
    public k f2603H;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f2604I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2605J;

    /* renamed from: a, reason: collision with root package name */
    public final q f2606a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.e f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2608c;

    /* renamed from: d, reason: collision with root package name */
    public final Q7.h f2609d;

    /* renamed from: e, reason: collision with root package name */
    public final U9.j f2610e;

    /* renamed from: f, reason: collision with root package name */
    public final n f2611f;

    /* renamed from: u, reason: collision with root package name */
    public final F3.e f2612u;

    /* renamed from: v, reason: collision with root package name */
    public final F3.e f2613v;

    /* renamed from: w, reason: collision with root package name */
    public final F3.e f2614w;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicInteger f2615x;

    /* renamed from: y, reason: collision with root package name */
    public s f2616y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2617z;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X3.e] */
    public r(F3.e eVar, F3.e eVar2, F3.e eVar3, F3.e eVar4, n nVar, n nVar2, Q7.h hVar) {
        U9.j jVar = f2595K;
        this.f2606a = new q(new ArrayList(2));
        this.f2607b = new Object();
        this.f2615x = new AtomicInteger();
        this.f2612u = eVar;
        this.f2613v = eVar2;
        this.f2614w = eVar4;
        this.f2611f = nVar;
        this.f2608c = nVar2;
        this.f2609d = hVar;
        this.f2610e = jVar;
    }

    @Override // X3.b
    public final X3.e a() {
        return this.f2607b;
    }

    public final synchronized void b(S3.g gVar, Executor executor) {
        try {
            this.f2607b.a();
            q qVar = this.f2606a;
            qVar.getClass();
            qVar.f2594a.add(new p(gVar, executor));
            if (this.f2599D) {
                e(1);
                executor.execute(new o(this, gVar, 1));
            } else if (this.f2601F) {
                e(1);
                executor.execute(new o(this, gVar, 0));
            } else {
                W3.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f2604I);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f2604I = true;
        k kVar = this.f2603H;
        kVar.f2557P = true;
        h hVar = kVar.f2555N;
        if (hVar != null) {
            hVar.cancel();
        }
        n nVar = this.f2611f;
        s sVar = this.f2616y;
        synchronized (nVar) {
            x xVar = nVar.f2583a;
            xVar.getClass();
            HashMap hashMap = xVar.f2640a;
            if (equals(hashMap.get(sVar))) {
                hashMap.remove(sVar);
            }
        }
    }

    public final void d() {
        t tVar;
        synchronized (this) {
            try {
                this.f2607b.a();
                W3.g.a("Not yet complete!", f());
                int decrementAndGet = this.f2615x.decrementAndGet();
                W3.g.a("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    tVar = this.f2602G;
                    g();
                } else {
                    tVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tVar != null) {
            tVar.e();
        }
    }

    public final synchronized void e(int i7) {
        t tVar;
        W3.g.a("Not yet complete!", f());
        if (this.f2615x.getAndAdd(i7) == 0 && (tVar = this.f2602G) != null) {
            tVar.a();
        }
    }

    public final boolean f() {
        return this.f2601F || this.f2599D || this.f2604I;
    }

    public final synchronized void g() {
        boolean a9;
        if (this.f2616y == null) {
            throw new IllegalArgumentException();
        }
        this.f2606a.f2594a.clear();
        this.f2616y = null;
        this.f2602G = null;
        this.f2597B = null;
        this.f2601F = false;
        this.f2604I = false;
        this.f2599D = false;
        this.f2605J = false;
        k kVar = this.f2603H;
        j jVar = kVar.f2567u;
        synchronized (jVar) {
            jVar.f2540a = true;
            a9 = jVar.a();
        }
        if (a9) {
            kVar.u();
        }
        this.f2603H = null;
        this.f2600E = null;
        this.f2598C = null;
        this.f2609d.M(this);
    }

    public final synchronized void h(S3.g gVar) {
        try {
            this.f2607b.a();
            q qVar = this.f2606a;
            qVar.f2594a.remove(new p(gVar, W3.g.f10606b));
            if (this.f2606a.f2594a.isEmpty()) {
                c();
                if (!this.f2599D) {
                    if (this.f2601F) {
                    }
                }
                if (this.f2615x.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
