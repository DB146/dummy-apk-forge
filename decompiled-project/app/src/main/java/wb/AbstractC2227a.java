package wb;

import gb.e;
import java.util.concurrent.atomic.AtomicInteger;
import yb.InterfaceC2472b;

/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2227a extends AtomicInteger implements InterfaceC2472b, Ac.b {

    /* renamed from: a, reason: collision with root package name */
    public final e f25848a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25849b;

    public AbstractC2227a(e eVar) {
        this.f25848a = eVar;
    }

    public final void b(Object obj) {
        int i7 = get();
        do {
            e eVar = this.f25848a;
            if (i7 == 8) {
                this.f25849b = obj;
                lazySet(16);
                eVar.e(null);
                if (get() != 4) {
                    eVar.a();
                    return;
                }
                return;
            }
            if ((i7 & (-3)) != 0) {
                return;
            }
            if (i7 == 2) {
                lazySet(3);
                eVar.e(obj);
                if (get() != 4) {
                    eVar.a();
                    return;
                }
                return;
            }
            this.f25849b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i7 = get();
            }
        } while (i7 != 4);
        this.f25849b = null;
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        lazySet(32);
        this.f25849b = null;
    }

    @Override // Ac.b
    public final void d(long j) {
        Object obj;
        if (!c.a(j)) {
            return;
        }
        do {
            int i7 = get();
            if ((i7 & (-2)) != 0) {
                return;
            }
            if (i7 == 1) {
                if (!compareAndSet(1, 3) || (obj = this.f25849b) == null) {
                    return;
                }
                this.f25849b = null;
                e eVar = this.f25848a;
                eVar.e(obj);
                if (get() != 4) {
                    eVar.a();
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // yb.InterfaceC2475e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onSuccess(Object obj) {
        b(obj);
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f25849b;
        this.f25849b = null;
        return obj;
    }
}
