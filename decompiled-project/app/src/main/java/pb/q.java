package pb;

import Y5.RunnableC0652u;
import a.AbstractC0672a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q extends AtomicReference implements gb.e, Ac.b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final gb.e f23316a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.n f23317b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f23318c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f23319d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23320e;

    /* renamed from: f, reason: collision with root package name */
    public Ac.a f23321f;

    public q(gb.e eVar, gb.n nVar, Ac.a aVar, boolean z8) {
        this.f23316a = eVar;
        this.f23317b = nVar;
        this.f23321f = aVar;
        this.f23320e = !z8;
    }

    @Override // gb.e, gb.l
    public final void a() {
        this.f23316a.a();
        this.f23317b.b();
    }

    public final void b(long j, Ac.b bVar) {
        if (this.f23320e || Thread.currentThread() == get()) {
            bVar.d(j);
        } else {
            this.f23317b.a(new RunnableC0652u(j, bVar));
        }
    }

    @Override // Ac.b
    public final void cancel() {
        Ac.b bVar;
        AtomicReference atomicReference = this.f23318c;
        Ac.b bVar2 = (Ac.b) atomicReference.get();
        wb.c cVar = wb.c.f25857a;
        if (bVar2 != cVar && (bVar = (Ac.b) atomicReference.getAndSet(cVar)) != cVar && bVar != null) {
            bVar.cancel();
        }
        this.f23317b.b();
    }

    @Override // Ac.b
    public final void d(long j) {
        if (wb.c.a(j)) {
            AtomicReference atomicReference = this.f23318c;
            Ac.b bVar = (Ac.b) atomicReference.get();
            if (bVar != null) {
                b(j, bVar);
                return;
            }
            AtomicLong atomicLong = this.f23319d;
            AbstractC0672a.a(atomicLong, j);
            Ac.b bVar2 = (Ac.b) atomicReference.get();
            if (bVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    b(andSet, bVar2);
                }
            }
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        this.f23316a.e(obj);
    }

    @Override // gb.e
    public final void f(Ac.b bVar) {
        boolean z8;
        AtomicReference atomicReference = this.f23318c;
        while (true) {
            if (atomicReference.compareAndSet(null, bVar)) {
                z8 = true;
                break;
            } else if (atomicReference.get() != null) {
                bVar.cancel();
                if (atomicReference.get() != wb.c.f25857a) {
                    com.bumptech.glide.d.t(new IllegalStateException("Subscription already set!"));
                }
                z8 = false;
            }
        }
        if (z8) {
            long andSet = this.f23319d.getAndSet(0L);
            if (andSet != 0) {
                b(andSet, bVar);
            }
        }
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        this.f23316a.onError(th);
        this.f23317b.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        Ac.a aVar = this.f23321f;
        this.f23321f = null;
        ((gb.d) aVar).a(this);
    }
}
