package gb;

import hb.InterfaceC1269b;

/* loaded from: classes2.dex */
public final class m implements InterfaceC1269b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f17484a;

    /* renamed from: b, reason: collision with root package name */
    public final n f17485b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f17486c;

    public m(Runnable runnable, n nVar) {
        this.f17484a = runnable;
        this.f17485b = nVar;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f17486c == Thread.currentThread()) {
            n nVar = this.f17485b;
            if (nVar instanceof vb.p) {
                vb.p pVar = (vb.p) nVar;
                if (pVar.f25421b) {
                    return;
                }
                pVar.f25421b = true;
                pVar.f25420a.shutdown();
                return;
            }
        }
        this.f17485b.b();
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f17485b.g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17486c = Thread.currentThread();
        try {
            this.f17484a.run();
        } finally {
        }
    }
}
