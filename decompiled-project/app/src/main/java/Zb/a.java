package Zb;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12336a;

    public a(g gVar) {
        this.f12336a = new AtomicReference(gVar);
    }

    @Override // Zb.g
    public final Iterator iterator() {
        g gVar = (g) this.f12336a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
