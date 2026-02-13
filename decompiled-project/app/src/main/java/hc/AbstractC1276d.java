package hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: hc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1276d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17937a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1276d.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17938b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1276d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC1276d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f17938b.lazySet(this, null);
    }

    public final AbstractC1276d b() {
        Object obj = f17937a.get(this);
        if (obj == AbstractC1273a.f17930b) {
            return null;
        }
        return (AbstractC1276d) obj;
    }

    public abstract boolean c();

    public final void d() {
        AbstractC1276d b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17938b;
            AbstractC1276d abstractC1276d = (AbstractC1276d) atomicReferenceFieldUpdater.get(this);
            while (abstractC1276d != null && abstractC1276d.c()) {
                abstractC1276d = (AbstractC1276d) atomicReferenceFieldUpdater.get(abstractC1276d);
            }
            AbstractC1276d b10 = b();
            kotlin.jvm.internal.l.b(b10);
            while (b10.c() && (b2 = b10.b()) != null) {
                b10 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b10);
                AbstractC1276d abstractC1276d2 = ((AbstractC1276d) obj) == null ? null : abstractC1276d;
                while (!atomicReferenceFieldUpdater.compareAndSet(b10, obj, abstractC1276d2)) {
                    if (atomicReferenceFieldUpdater.get(b10) != obj) {
                        break;
                    }
                }
            }
            if (abstractC1276d != null) {
                f17937a.set(abstractC1276d, b10);
            }
            if (!b10.c() || b10.b() == null) {
                if (abstractC1276d == null || !abstractC1276d.c()) {
                    return;
                }
            }
        }
    }
}
