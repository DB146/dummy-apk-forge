package a1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704e extends Q5.e {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12457d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12458e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12459f;
    public final AtomicReferenceFieldUpdater g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12460h;

    public C0704e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12457d = atomicReferenceFieldUpdater;
        this.f12458e = atomicReferenceFieldUpdater2;
        this.f12459f = atomicReferenceFieldUpdater3;
        this.g = atomicReferenceFieldUpdater4;
        this.f12460h = atomicReferenceFieldUpdater5;
    }

    @Override // Q5.e
    public final void J(C0706g c0706g, C0706g c0706g2) {
        this.f12458e.lazySet(c0706g, c0706g2);
    }

    @Override // Q5.e
    public final void K(C0706g c0706g, Thread thread) {
        this.f12457d.lazySet(c0706g, thread);
    }

    @Override // Q5.e
    public final boolean f(AbstractC0707h abstractC0707h, C0703d c0703d, C0703d c0703d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0707h, c0703d, c0703d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0707h) == c0703d);
        return false;
    }

    @Override // Q5.e
    public final boolean g(AbstractC0707h abstractC0707h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12460h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0707h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0707h) == obj);
        return false;
    }

    @Override // Q5.e
    public final boolean h(AbstractC0707h abstractC0707h, C0706g c0706g, C0706g c0706g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12459f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0707h, c0706g, c0706g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0707h) == c0706g);
        return false;
    }
}
