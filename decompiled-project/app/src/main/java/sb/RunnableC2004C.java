package sb;

import java.util.concurrent.atomic.AtomicInteger;
import yb.InterfaceC2471a;

/* renamed from: sb.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2004C extends AtomicInteger implements InterfaceC2471a, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24240a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24241b;

    public RunnableC2004C(gb.l lVar, Object obj) {
        this.f24240a = lVar;
        this.f24241b = obj;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        set(3);
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        lazySet(3);
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get() == 3;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        lazySet(1);
        return 1;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f24241b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            gb.l lVar = this.f24240a;
            lVar.e(this.f24241b);
            if (get() == 2) {
                lazySet(3);
                lVar.a();
            }
        }
    }
}
