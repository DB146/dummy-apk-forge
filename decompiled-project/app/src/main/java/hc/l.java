package hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17959a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17959a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a9 = nVar.a(runnable);
            if (a9 == 0) {
                return true;
            }
            if (a9 == 1) {
                n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a9 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17959a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f17959a.get(this);
        nVar.getClass();
        long j = n.f17962f.get(nVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17959a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d10 = nVar.d();
            if (d10 != n.g) {
                return d10;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
