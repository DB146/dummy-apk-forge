package hc;

import cc.B0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public abstract class u extends AbstractC1276d implements B0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f17970d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f17971c;
    private volatile int cleanedAndPointers;

    public u(long j, u uVar, int i7) {
        super(uVar);
        this.f17971c = j;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // hc.AbstractC1276d
    public final boolean c() {
        return f17970d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f17970d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i7, Hb.i iVar);

    public final void h() {
        if (f17970d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f17970d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
