package nb;

import gb.q;
import hb.InterfaceC1269b;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class d extends CountDownLatch implements q, gb.b, gb.g {

    /* renamed from: a, reason: collision with root package name */
    public Object f21337a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f21338b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1269b f21339c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f21340d;

    @Override // gb.b
    public final void a() {
        countDown();
    }

    @Override // gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        this.f21339c = interfaceC1269b;
        if (this.f21340d) {
            interfaceC1269b.b();
        }
    }

    @Override // gb.q
    public final void onError(Throwable th) {
        this.f21338b = th;
        countDown();
    }

    @Override // gb.q
    public final void onSuccess(Object obj) {
        this.f21337a = obj;
        countDown();
    }
}
