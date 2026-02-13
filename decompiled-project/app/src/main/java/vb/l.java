package vb;

import hb.C1268a;
import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class l extends gb.n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final k f25407b;

    /* renamed from: c, reason: collision with root package name */
    public final m f25408c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25409d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final C1268a f25406a = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hb.a] */
    public l(k kVar) {
        m mVar;
        m mVar2;
        this.f25407b = kVar;
        if (kVar.f25402c.f17922b) {
            mVar2 = n.f25415f;
            this.f25408c = mVar2;
        }
        while (true) {
            if (kVar.f25401b.isEmpty()) {
                mVar = new m(kVar.f25405f);
                kVar.f25402c.d(mVar);
                break;
            } else {
                mVar = (m) kVar.f25401b.poll();
                if (mVar != null) {
                    break;
                }
            }
        }
        mVar2 = mVar;
        this.f25408c = mVar2;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f25409d.compareAndSet(false, true)) {
            this.f25406a.b();
            if (n.g) {
                this.f25408c.d(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            k kVar = this.f25407b;
            kVar.getClass();
            long nanoTime = System.nanoTime() + kVar.f25400a;
            m mVar = this.f25408c;
            mVar.f25410c = nanoTime;
            kVar.f25401b.offer(mVar);
        }
    }

    @Override // gb.n
    public final InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f25406a.f17922b ? kb.c.f19072a : this.f25408c.d(runnable, j, timeUnit, this.f25406a);
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f25409d.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f25407b;
        kVar.getClass();
        long nanoTime = System.nanoTime() + kVar.f25400a;
        m mVar = this.f25408c;
        mVar.f25410c = nanoTime;
        kVar.f25401b.offer(mVar);
    }
}
