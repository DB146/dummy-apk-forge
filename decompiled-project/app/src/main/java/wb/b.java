package wb;

import a.AbstractC0672a;
import com.bumptech.glide.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b extends AtomicInteger implements Ac.b {

    /* renamed from: a, reason: collision with root package name */
    public Ac.b f25850a;

    /* renamed from: b, reason: collision with root package name */
    public long f25851b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f25852c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f25853d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f25854e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f25855f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25856u;

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final void b() {
        int i7 = 1;
        long j = 0;
        Ac.b bVar = null;
        do {
            Ac.b bVar2 = (Ac.b) this.f25852c.get();
            if (bVar2 != null) {
                bVar2 = (Ac.b) this.f25852c.getAndSet(null);
            }
            long j10 = this.f25853d.get();
            if (j10 != 0) {
                j10 = this.f25853d.getAndSet(0L);
            }
            long j11 = this.f25854e.get();
            if (j11 != 0) {
                j11 = this.f25854e.getAndSet(0L);
            }
            Ac.b bVar3 = this.f25850a;
            if (this.f25855f) {
                if (bVar3 != null) {
                    bVar3.cancel();
                    this.f25850a = null;
                }
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            } else {
                long j12 = this.f25851b;
                if (j12 != Long.MAX_VALUE) {
                    j12 = AbstractC0672a.b(j12, j10);
                    if (j12 != Long.MAX_VALUE) {
                        j12 -= j11;
                        if (j12 < 0) {
                            d.t(new IllegalStateException(A3.c.h("More produced than requested: ", j12)));
                            j12 = 0;
                        }
                    }
                    this.f25851b = j12;
                }
                if (bVar2 != null) {
                    this.f25850a = bVar2;
                    if (j12 != 0) {
                        j = AbstractC0672a.b(j, j12);
                        bVar = bVar2;
                    }
                } else if (bVar3 != null && j10 != 0) {
                    j = AbstractC0672a.b(j, j10);
                    bVar = bVar3;
                }
            }
            i7 = addAndGet(-i7);
        } while (i7 != 0);
        if (j != 0) {
            bVar.d(j);
        }
    }

    public final void c(long j) {
        if (this.f25856u) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC0672a.a(this.f25854e, j);
            a();
            return;
        }
        long j10 = this.f25851b;
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 - j;
            if (j11 < 0) {
                d.t(new IllegalStateException(A3.c.h("More produced than requested: ", j11)));
                j11 = 0;
            }
            this.f25851b = j11;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    @Override // Ac.b
    public final void cancel() {
        if (this.f25855f) {
            return;
        }
        this.f25855f = true;
        a();
    }

    @Override // Ac.b
    public final void d(long j) {
        if (!c.a(j) || this.f25856u) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC0672a.a(this.f25853d, j);
            a();
            return;
        }
        long j10 = this.f25851b;
        if (j10 != Long.MAX_VALUE) {
            long b2 = AbstractC0672a.b(j10, j);
            this.f25851b = b2;
            if (b2 == Long.MAX_VALUE) {
                this.f25856u = true;
            }
        }
        Ac.b bVar = this.f25850a;
        if (decrementAndGet() != 0) {
            b();
        }
        if (bVar != null) {
            bVar.d(j);
        }
    }

    public final void e(Ac.b bVar) {
        if (this.f25855f) {
            bVar.cancel();
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            a();
            return;
        }
        this.f25850a = bVar;
        long j = this.f25851b;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j != 0) {
            bVar.d(j);
        }
    }
}
