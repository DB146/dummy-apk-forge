package cc;

import hc.AbstractC1273a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cc.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0948o extends AbstractC0941k0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0944m f14556e;

    public C0948o(C0944m c0944m) {
        this.f14556e = c0944m;
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return Db.q.f3365a;
    }

    @Override // cc.AbstractC0945m0
    public final void l(Throwable th) {
        w0 k = k();
        C0944m c0944m = this.f14556e;
        Throwable q10 = c0944m.q(k);
        if (c0944m.w()) {
            Hb.d dVar = c0944m.f14551d;
            kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            hc.h hVar = (hc.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.h.f17942v;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                R7.a aVar = AbstractC1273a.f17932d;
                if (!kotlin.jvm.internal.l.a(obj, aVar)) {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, q10)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0944m.d(q10);
        if (c0944m.w()) {
            return;
        }
        c0944m.o();
    }
}
