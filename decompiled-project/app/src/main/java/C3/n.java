package C3;

import A0.G0;
import A9.O;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Executor;
import t8.C2034c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f2582h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final x f2583a;

    /* renamed from: b, reason: collision with root package name */
    public final h8.e f2584b;

    /* renamed from: c, reason: collision with root package name */
    public final E3.f f2585c;

    /* renamed from: d, reason: collision with root package name */
    public final B7.d f2586d;

    /* renamed from: e, reason: collision with root package name */
    public final O f2587e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.s f2588f;
    public final q3.i g;

    /* JADX WARN: Type inference failed for: r11v5, types: [A4.s, java.lang.Object] */
    public n(E3.f fVar, C2034c c2034c, F3.e eVar, F3.e eVar2, F3.e eVar3, F3.e eVar4) {
        this.f2585c = fVar;
        F5.i iVar = new F5.i(c2034c);
        q3.i iVar2 = new q3.i(2);
        this.g = iVar2;
        synchronized (this) {
            synchronized (iVar2) {
                iVar2.f23385d = this;
            }
        }
        this.f2584b = new h8.e(2);
        this.f2583a = new x(0);
        this.f2586d = new B7.d(eVar, eVar2, eVar3, eVar4, this, this);
        ?? obj = new Object();
        obj.f472c = X3.d.a(150, new C2034c((Object) obj, 3));
        obj.f471b = iVar;
        this.f2588f = obj;
        this.f2587e = new O(1);
        fVar.f3531d = this;
    }

    public static void c(String str, long j, s sVar) {
        StringBuilder n6 = A3.c.n(str, " in ");
        n6.append(W3.i.a(j));
        n6.append("ms, key: ");
        n6.append(sVar);
        Log.v("Engine", n6.toString());
    }

    public static void f(A a9) {
        if (!(a9 instanceof t)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((t) a9).e();
    }

    public final G0 a(com.bumptech.glide.f fVar, Object obj, A3.h hVar, int i7, int i10, Class cls, Class cls2, com.bumptech.glide.g gVar, m mVar, W3.c cVar, boolean z8, boolean z10, A3.l lVar, boolean z11, boolean z12, S3.g gVar2, Executor executor) {
        long j;
        if (f2582h) {
            int i11 = W3.i.f10608b;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j10 = j;
        this.f2584b.getClass();
        s sVar = new s(obj, hVar, i7, i10, cVar, cls, cls2, lVar);
        synchronized (this) {
            try {
                t b2 = b(sVar, z11, j10);
                if (b2 == null) {
                    return g(fVar, obj, hVar, i7, i10, cls, cls2, gVar, mVar, cVar, z8, z10, lVar, z11, z12, gVar2, executor, sVar, j10);
                }
                gVar2.k(b2, A3.a.f346e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t b(s sVar, boolean z8, long j) {
        t tVar;
        Object obj;
        if (!z8) {
            return null;
        }
        q3.i iVar = this.g;
        synchronized (iVar) {
            C0237c c0237c = (C0237c) ((HashMap) iVar.f23383b).get(sVar);
            if (c0237c == null) {
                tVar = null;
            } else {
                tVar = (t) c0237c.get();
                if (tVar == null) {
                    iVar.p(c0237c);
                }
            }
        }
        if (tVar != null) {
            tVar.a();
        }
        if (tVar != null) {
            if (f2582h) {
                c("Loaded resource from active resources", j, sVar);
            }
            return tVar;
        }
        E3.f fVar = this.f2585c;
        synchronized (fVar) {
            W3.j jVar = (W3.j) fVar.f10611a.remove(sVar);
            if (jVar == null) {
                obj = null;
            } else {
                fVar.f10613c -= jVar.f10610b;
                obj = jVar.f10609a;
            }
        }
        A a9 = (A) obj;
        t tVar2 = a9 == null ? null : a9 instanceof t ? (t) a9 : new t(a9, true, true, sVar, this);
        if (tVar2 != null) {
            tVar2.a();
            this.g.c(sVar, tVar2);
        }
        if (tVar2 == null) {
            return null;
        }
        if (f2582h) {
            c("Loaded resource from cache", j, sVar);
        }
        return tVar2;
    }

    public final synchronized void d(r rVar, s sVar, t tVar) {
        if (tVar != null) {
            try {
                if (tVar.f2625a) {
                    this.g.c(sVar, tVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x xVar = this.f2583a;
        xVar.getClass();
        rVar.getClass();
        HashMap hashMap = xVar.f2640a;
        if (rVar.equals(hashMap.get(sVar))) {
            hashMap.remove(sVar);
        }
    }

    public final void e(s sVar, t tVar) {
        q3.i iVar = this.g;
        synchronized (iVar) {
            C0237c c0237c = (C0237c) ((HashMap) iVar.f23383b).remove(sVar);
            if (c0237c != null) {
                c0237c.f2513c = null;
                c0237c.clear();
            }
        }
        if (tVar.f2625a) {
        } else {
            this.f2587e.j(tVar, false);
        }
    }

    public final G0 g(com.bumptech.glide.f fVar, Object obj, A3.h hVar, int i7, int i10, Class cls, Class cls2, com.bumptech.glide.g gVar, m mVar, W3.c cVar, boolean z8, boolean z10, A3.l lVar, boolean z11, boolean z12, S3.g gVar2, Executor executor, s sVar, long j) {
        F3.e eVar;
        r rVar = (r) this.f2583a.f2640a.get(sVar);
        if (rVar != null) {
            rVar.b(gVar2, executor);
            if (f2582h) {
                c("Added to existing load", j, sVar);
            }
            return new G0(this, gVar2, rVar);
        }
        r rVar2 = (r) ((Q7.h) this.f2586d.g).h();
        synchronized (rVar2) {
            rVar2.f2616y = sVar;
            rVar2.f2617z = z11;
            rVar2.f2596A = z12;
        }
        A4.s sVar2 = this.f2588f;
        k kVar = (k) ((Q7.h) sVar2.f472c).h();
        int i11 = sVar2.f470a;
        sVar2.f470a = i11 + 1;
        i iVar = kVar.f2561a;
        iVar.f2527c = fVar;
        iVar.f2528d = obj;
        iVar.f2535n = hVar;
        iVar.f2529e = i7;
        iVar.f2530f = i10;
        iVar.f2537p = mVar;
        iVar.g = cls;
        iVar.f2531h = kVar.f2564d;
        iVar.k = cls2;
        iVar.f2536o = gVar;
        iVar.f2532i = lVar;
        iVar.j = cVar;
        iVar.f2538q = z8;
        iVar.f2539r = z10;
        kVar.f2568v = fVar;
        kVar.f2569w = hVar;
        kVar.f2570x = gVar;
        kVar.f2571y = sVar;
        kVar.f2572z = i7;
        kVar.f2543A = i10;
        kVar.f2544B = mVar;
        kVar.f2545C = lVar;
        kVar.f2546D = rVar2;
        kVar.f2547E = i11;
        kVar.f2560S = 1;
        kVar.f2549G = obj;
        x xVar = this.f2583a;
        xVar.getClass();
        xVar.f2640a.put(sVar, rVar2);
        rVar2.b(gVar2, executor);
        synchronized (rVar2) {
            rVar2.f2603H = kVar;
            int o10 = kVar.o(1);
            if (o10 != 2 && o10 != 3) {
                eVar = rVar2.f2596A ? rVar2.f2614w : rVar2.f2613v;
                eVar.execute(kVar);
            }
            eVar = rVar2.f2612u;
            eVar.execute(kVar);
        }
        if (f2582h) {
            c("Started new load", j, sVar);
        }
        return new G0(this, gVar2, rVar2);
    }
}
