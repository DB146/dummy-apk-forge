package pb;

import a.AbstractC0672a;
import hb.C1268a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import ob.C1836d;
import xb.C2273a;
import y7.u0;
import yb.C2477g;

/* loaded from: classes2.dex */
public final class b extends AtomicInteger implements gb.e, Ac.b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.e f23262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23263b;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC1394e f23268u;

    /* renamed from: w, reason: collision with root package name */
    public Ac.b f23270w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f23271x;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f23264c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    public final C1268a f23265d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final C2273a f23267f = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f23266e = new AtomicInteger(1);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f23269v = new AtomicReference();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, hb.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    public b(gb.e eVar, InterfaceC1394e interfaceC1394e, int i7) {
        this.f23262a = eVar;
        this.f23268u = interfaceC1394e;
        this.f23263b = i7;
    }

    @Override // gb.e, gb.l
    public final void a() {
        this.f23266e.decrementAndGet();
        c();
    }

    public final void b() {
        C2477g c2477g = (C2477g) this.f23269v.get();
        if (c2477g != null) {
            c2477g.clear();
        }
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    @Override // Ac.b
    public final void cancel() {
        this.f23271x = true;
        this.f23270w.cancel();
        this.f23265d.b();
        this.f23267f.c();
    }

    @Override // Ac.b
    public final void d(long j) {
        if (wb.c.a(j)) {
            AbstractC0672a.a(this.f23264c, j);
            c();
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        try {
            Object apply = this.f23268u.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
            gb.p pVar = (gb.p) apply;
            this.f23266e.getAndIncrement();
            C1836d c1836d = new C1836d(this);
            if (this.f23271x || !this.f23265d.d(c1836d)) {
                return;
            }
            pVar.d(c1836d);
        } catch (Throwable th) {
            u0.L(th);
            this.f23270w.cancel();
            onError(th);
        }
    }

    @Override // gb.e
    public final void f(Ac.b bVar) {
        if (wb.c.b(this.f23270w, bVar)) {
            this.f23270w = bVar;
            this.f23262a.f(this);
            int i7 = this.f23263b;
            if (i7 == Integer.MAX_VALUE) {
                bVar.d(Long.MAX_VALUE);
            } else {
                bVar.d(i7);
            }
        }
    }

    public final void g() {
        gb.e eVar = this.f23262a;
        AtomicInteger atomicInteger = this.f23266e;
        AtomicReference atomicReference = this.f23269v;
        int i7 = 1;
        do {
            long j = this.f23264c.get();
            long j10 = 0;
            while (true) {
                if (j10 == j) {
                    break;
                }
                if (this.f23271x) {
                    b();
                    return;
                }
                if (((Throwable) this.f23267f.get()) != null) {
                    b();
                    this.f23267f.e(this.f23262a);
                    return;
                }
                boolean z8 = atomicInteger.get() == 0;
                C2477g c2477g = (C2477g) atomicReference.get();
                Object poll = c2477g != null ? c2477g.poll() : null;
                boolean z10 = poll == null;
                if (z8 && z10) {
                    this.f23267f.e(eVar);
                    return;
                } else {
                    if (z10) {
                        break;
                    }
                    eVar.e(poll);
                    j10++;
                }
            }
            if (j10 == j) {
                if (this.f23271x) {
                    b();
                    return;
                }
                if (((Throwable) this.f23267f.get()) != null) {
                    b();
                    this.f23267f.e(eVar);
                    return;
                }
                boolean z11 = atomicInteger.get() == 0;
                C2477g c2477g2 = (C2477g) atomicReference.get();
                boolean z12 = c2477g2 == null || c2477g2.isEmpty();
                if (z11 && z12) {
                    this.f23267f.e(eVar);
                    return;
                }
            }
            if (j10 != 0) {
                AbstractC0672a.m(this.f23264c, j10);
                if (this.f23263b != Integer.MAX_VALUE) {
                    this.f23270w.d(j10);
                }
            }
            i7 = addAndGet(-i7);
        } while (i7 != 0);
    }

    public final C2477g h() {
        AtomicReference atomicReference = this.f23269v;
        C2477g c2477g = (C2477g) atomicReference.get();
        if (c2477g != null) {
            return c2477g;
        }
        C2477g c2477g2 = new C2477g(gb.d.f17483a);
        while (!atomicReference.compareAndSet(null, c2477g2)) {
            if (atomicReference.get() != null) {
                return (C2477g) atomicReference.get();
            }
        }
        return c2477g2;
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        this.f23266e.decrementAndGet();
        if (this.f23267f.b(th)) {
            this.f23265d.b();
            c();
        }
    }
}
