package ec;

import A0.C0005a;
import cc.AbstractC0920a;
import cc.C0939j0;
import cc.F;
import cc.w0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class q extends AbstractC0920a implements r, h {

    /* renamed from: d, reason: collision with root package name */
    public final d f16900d;

    public q(Hb.i iVar, d dVar) {
        super(iVar, true, true);
        this.f16900d = dVar;
    }

    @Override // cc.AbstractC0920a
    public final void W(boolean z8, Throwable th) {
        if (this.f16900d.k(false, th) || z8) {
            return;
        }
        F.t(this.f14514c, th);
    }

    @Override // cc.AbstractC0920a
    public final void X(Object obj) {
        this.f16900d.j(null);
    }

    public final void Z(C0005a c0005a) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar = this.f16900d;
        dVar.getClass();
        do {
            atomicReferenceFieldUpdater = d.f16869x;
            if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, c0005a)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(dVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(dVar);
            R7.a aVar = f.f16885q;
            if (obj != aVar) {
                if (obj == f.f16886r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            R7.a aVar2 = f.f16886r;
            while (!atomicReferenceFieldUpdater.compareAndSet(dVar, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(dVar) != aVar) {
                    break;
                }
            }
            c0005a.invoke(dVar.p());
            return;
        }
    }

    @Override // ec.u
    public final Object a(Hb.d dVar, Object obj) {
        return this.f16900d.a(dVar, obj);
    }

    @Override // ec.t
    public final Object c(Jb.i iVar) {
        return this.f16900d.c(iVar);
    }

    @Override // cc.w0, cc.InterfaceC0937i0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0939j0(s(), null, this);
        }
        q(cancellationException);
    }

    @Override // ec.t
    public final Object f(gc.u uVar) {
        d dVar = this.f16900d;
        dVar.getClass();
        Object B10 = d.B(dVar, uVar);
        Ib.a aVar = Ib.a.f5345a;
        return B10;
    }

    @Override // ec.t
    public final Object g() {
        return this.f16900d.g();
    }

    @Override // ec.u
    public final Object h(Object obj) {
        return this.f16900d.h(obj);
    }

    @Override // ec.t
    public final C1116a iterator() {
        d dVar = this.f16900d;
        dVar.getClass();
        return new C1116a(dVar);
    }

    @Override // cc.w0
    public final void q(CancellationException cancellationException) {
        CancellationException U8 = w0.U(this, cancellationException);
        this.f16900d.k(true, U8);
        p(U8);
    }
}
