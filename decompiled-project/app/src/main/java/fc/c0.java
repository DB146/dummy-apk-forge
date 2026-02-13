package fc;

import gc.AbstractC1207b;
import gc.AbstractC1208c;
import gc.AbstractC1209d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class c0 extends AbstractC1209d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17135a = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // gc.AbstractC1209d
    public final boolean a(AbstractC1207b abstractC1207b) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17135a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, Q.f17099b);
        return true;
    }

    @Override // gc.AbstractC1209d
    public final Hb.d[] b(AbstractC1207b abstractC1207b) {
        f17135a.set(this, null);
        return AbstractC1208c.f17505a;
    }
}
