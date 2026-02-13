package Hb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class k implements d, Jb.d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4920b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final d f4921a;
    private volatile Object result;

    public k(d dVar) {
        Ib.a aVar = Ib.a.f5345a;
        this.f4921a = dVar;
        this.result = aVar;
    }

    @Override // Jb.d
    public final Jb.d getCallerFrame() {
        d dVar = this.f4921a;
        if (dVar instanceof Jb.d) {
            return (Jb.d) dVar;
        }
        return null;
    }

    @Override // Hb.d
    public final i getContext() {
        return this.f4921a.getContext();
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            Ib.a aVar = Ib.a.f5346b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4920b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            Ib.a aVar2 = Ib.a.f5345a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4920b;
            Ib.a aVar3 = Ib.a.f5347c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f4921a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f4921a;
    }
}
