package Db;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n implements g, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3358c = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile Rb.a f3359a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3360b;

    @Override // Db.g
    public final Object getValue() {
        Object obj = this.f3360b;
        p pVar = p.f3364a;
        if (obj != pVar) {
            return obj;
        }
        Rb.a aVar = this.f3359a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3358c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != pVar) {
                }
            }
            this.f3359a = null;
            return invoke;
        }
        return this.f3360b;
    }

    public final String toString() {
        return this.f3360b != p.f3364a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
