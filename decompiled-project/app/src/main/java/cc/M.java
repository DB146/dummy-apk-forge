package cc;

import hc.AbstractC1273a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class M extends hc.t {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14492e = AtomicIntegerFieldUpdater.newUpdater(M.class, "_decision");
    private volatile int _decision;

    @Override // hc.t, cc.w0
    public final void k(Object obj) {
        m(obj);
    }

    @Override // hc.t, cc.w0
    public final void m(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f14492e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC1273a.h(com.bumptech.glide.c.F(this.f17969d), F.D(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
