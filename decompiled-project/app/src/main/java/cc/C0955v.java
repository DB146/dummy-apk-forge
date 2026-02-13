package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: cc.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0955v {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14582b = AtomicIntegerFieldUpdater.newUpdater(C0955v.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f14583a;

    public C0955v(boolean z8, Throwable th) {
        this.f14583a = th;
        this._handled = z8 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f14583a + ']';
    }
}
