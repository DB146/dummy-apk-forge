package cc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: cc.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0935h0 extends AbstractC0941k0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14541f = AtomicIntegerFieldUpdater.newUpdater(C0935h0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final Rb.c f14542e;

    public C0935h0(Rb.c cVar) {
        this.f14542e = cVar;
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return Db.q.f3365a;
    }

    @Override // cc.AbstractC0945m0
    public final void l(Throwable th) {
        if (f14541f.compareAndSet(this, 0, 1)) {
            this.f14542e.invoke(th);
        }
    }
}
