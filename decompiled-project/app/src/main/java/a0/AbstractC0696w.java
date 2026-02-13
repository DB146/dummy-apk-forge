package a0;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0696w implements InterfaceC0695v {

    /* renamed from: a, reason: collision with root package name */
    public final Y.a f12434a = new AtomicInteger(0);

    public final boolean c(int i7) {
        return (i7 & this.f12434a.get()) != 0;
    }

    public final void d(int i7) {
        Y.a aVar;
        int i10;
        do {
            aVar = this.f12434a;
            i10 = aVar.get();
            if ((i10 & i7) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i7));
    }
}
