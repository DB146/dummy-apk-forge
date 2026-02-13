package N6;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: N6.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435h0 extends X {

    /* renamed from: v, reason: collision with root package name */
    public final ReferenceQueue f7297v;

    public C0435h0(l0 l0Var, int i7) {
        super(l0Var, i7);
        this.f7297v = new ReferenceQueue();
    }

    @Override // N6.X
    public final void c() {
        do {
        } while (this.f7297v.poll() != null);
    }

    @Override // N6.X
    public final void d() {
        ReferenceQueue referenceQueue = this.f7297v;
        int i7 = 0;
        do {
            Object poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            i0 i0Var = (i0) poll;
            l0 l0Var = this.f7261a;
            l0Var.getClass();
            U b2 = i0Var.b();
            int c10 = b2.c();
            X c11 = l0Var.c(c10);
            Object key = b2.getKey();
            c11.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = c11.f7265e;
                int length = (atomicReferenceArray.length() - 1) & c10;
                U u3 = (U) atomicReferenceArray.get(length);
                U u10 = u3;
                while (true) {
                    if (u10 == null) {
                        break;
                    }
                    Object key2 = u10.getKey();
                    if (u10.c() != c10 || key2 == null || !c11.f7261a.f7311e.c(key, key2)) {
                        u10 = u10.d();
                    } else if (((C0433g0) u10).f7295c == i0Var) {
                        c11.f7263c++;
                        U g = c11.g(u3, u10);
                        int i10 = c11.f7262b - 1;
                        atomicReferenceArray.set(length, g);
                        c11.f7262b = i10;
                    }
                }
                i7++;
            } finally {
                c11.unlock();
            }
        } while (i7 != 16);
    }

    @Override // N6.X
    public final X i() {
        return this;
    }
}
