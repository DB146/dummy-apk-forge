package N6;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j0 extends WeakReference implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final U f7300a;

    public j0(ReferenceQueue referenceQueue, Object obj, U u3) {
        super(obj, referenceQueue);
        this.f7300a = u3;
    }

    @Override // N6.i0
    public final i0 a(ReferenceQueue referenceQueue, C0433g0 c0433g0) {
        return new j0(referenceQueue, get(), c0433g0);
    }

    @Override // N6.i0
    public final U b() {
        return this.f7300a;
    }
}
