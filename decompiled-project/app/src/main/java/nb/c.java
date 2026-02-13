package nb;

import gb.l;
import hb.InterfaceC1269b;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class c extends CountDownLatch implements l, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public Object f21333a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f21334b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1269b f21335c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f21336d;

    @Override // gb.l
    public final void a() {
        countDown();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f21336d = true;
        InterfaceC1269b interfaceC1269b = this.f21335c;
        if (interfaceC1269b != null) {
            interfaceC1269b.b();
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        this.f21335c = interfaceC1269b;
        if (this.f21336d) {
            interfaceC1269b.b();
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (this.f21333a == null) {
            this.f21333a = obj;
            this.f21335c.b();
            countDown();
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f21336d;
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f21333a == null) {
            this.f21334b = th;
        }
        countDown();
    }
}
