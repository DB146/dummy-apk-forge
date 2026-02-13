package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cc.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0945m0 extends hc.k implements S, InterfaceC0931f0, Rb.c {

    /* renamed from: d, reason: collision with root package name */
    public w0 f14553d;

    @Override // cc.S
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        w0 k = k();
        while (true) {
            Object C2 = k.C();
            if (!(C2 instanceof AbstractC0945m0)) {
                if (!(C2 instanceof InterfaceC0931f0) || ((InterfaceC0931f0) C2).c() == null) {
                    return;
                }
                while (true) {
                    Object h10 = h();
                    if (h10 instanceof hc.r) {
                        hc.k kVar = ((hc.r) h10).f17968a;
                        return;
                    }
                    if (h10 == this) {
                        return;
                    }
                    kotlin.jvm.internal.l.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    hc.k kVar2 = (hc.k) h10;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = hc.k.f17958c;
                    hc.r rVar = (hc.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new hc.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = hc.k.f17956a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, h10, rVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == h10);
                }
            } else {
                if (C2 != this) {
                    return;
                }
                U u3 = F.j;
                do {
                    atomicReferenceFieldUpdater2 = w0.f14585a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(k, C2, u3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(k) == C2);
            }
        }
    }

    @Override // cc.InterfaceC0931f0
    public final y0 c() {
        return null;
    }

    public InterfaceC0937i0 getParent() {
        return k();
    }

    @Override // cc.InterfaceC0931f0
    public final boolean isActive() {
        return true;
    }

    public final w0 k() {
        w0 w0Var = this.f14553d;
        if (w0Var != null) {
            return w0Var;
        }
        kotlin.jvm.internal.l.j("job");
        throw null;
    }

    public abstract void l(Throwable th);

    @Override // hc.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + F.q(this) + "[job@" + F.q(k()) + ']';
    }
}
