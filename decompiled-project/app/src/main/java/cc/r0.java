package cc;

import hc.AbstractC1273a;
import hc.AbstractC1274b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class r0 extends AbstractC1274b {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0945m0 f14566b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f14567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f14568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0931f0 f14569e;

    public r0(AbstractC0945m0 abstractC0945m0, w0 w0Var, InterfaceC0931f0 interfaceC0931f0) {
        this.f14568d = w0Var;
        this.f14569e = interfaceC0931f0;
        this.f14566b = abstractC0945m0;
    }

    @Override // hc.AbstractC1274b
    public final void b(Object obj, Object obj2) {
        hc.k kVar = (hc.k) obj;
        boolean z8 = obj2 == null;
        hc.k kVar2 = this.f14566b;
        hc.k kVar3 = z8 ? kVar2 : this.f14567c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.k.f17956a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z8) {
                hc.k kVar4 = this.f14567c;
                kotlin.jvm.internal.l.b(kVar4);
                kVar2.g(kVar4);
            }
        }
    }

    @Override // hc.AbstractC1274b
    public final R7.a c(Object obj) {
        if (this.f14568d.C() == this.f14569e) {
            return null;
        }
        return AbstractC1273a.f17933e;
    }
}
