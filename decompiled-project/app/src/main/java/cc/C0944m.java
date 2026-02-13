package cc;

import hc.AbstractC1273a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cc.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0944m extends N implements InterfaceC0942l, Jb.d, N0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14548f = AtomicIntegerFieldUpdater.newUpdater(C0944m.class, "_decisionAndIndex");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14549u = AtomicReferenceFieldUpdater.newUpdater(C0944m.class, Object.class, "_state");

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14550v = AtomicReferenceFieldUpdater.newUpdater(C0944m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final Hb.d f14551d;

    /* renamed from: e, reason: collision with root package name */
    public final Hb.i f14552e;

    public C0944m(int i7, Hb.d dVar) {
        super(i7);
        this.f14551d = dVar;
        this.f14552e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0922b.f14519a;
    }

    public static Object C(B0 b02, Object obj, int i7, Rb.c cVar) {
        if ((obj instanceof C0955v) || !F.x(i7)) {
            return obj;
        }
        if (cVar != null || (b02 instanceof AbstractC0940k)) {
            return new C0954u(obj, b02 instanceof AbstractC0940k ? (AbstractC0940k) b02 : null, cVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(B0 b02, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + b02 + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i7, Rb.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14549u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof B0) {
                Object C2 = C((B0) obj2, obj, i7, cVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i7);
                return;
            }
            if (obj2 instanceof C0946n) {
                C0946n c0946n = (C0946n) obj2;
                c0946n.getClass();
                if (C0946n.f14554c.compareAndSet(c0946n, 0, 1)) {
                    if (cVar != null) {
                        m(cVar, c0946n.f14583a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(A a9) {
        Db.q qVar = Db.q.f3365a;
        Hb.d dVar = this.f14551d;
        hc.h hVar = dVar instanceof hc.h ? (hc.h) dVar : null;
        A(qVar, (hVar != null ? hVar.f17943d : null) == a9 ? 4 : this.f14494c, null);
    }

    public final R7.a D(Object obj, Rb.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14549u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z8 = obj2 instanceof B0;
            R7.a aVar = F.f14471a;
            if (!z8) {
                boolean z10 = obj2 instanceof C0954u;
                return null;
            }
            Object C2 = C((B0) obj2, obj, this.f14494c, cVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                o();
            }
            return aVar;
        }
    }

    @Override // cc.N0
    public final void a(hc.u uVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f14548f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i7));
        v(uVar);
    }

    @Override // cc.InterfaceC0942l
    public final void b(Object obj, Rb.c cVar) {
        A(obj, this.f14494c, cVar);
    }

    @Override // cc.N
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14549u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof B0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0955v) {
                return;
            }
            if (!(obj2 instanceof C0954u)) {
                C0954u c0954u = new C0954u(obj2, (AbstractC0940k) null, (Rb.c) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0954u)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0954u c0954u2 = (C0954u) obj2;
            if (c0954u2.f14580e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0954u a9 = C0954u.a(c0954u2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            AbstractC0940k abstractC0940k = c0954u2.f14577b;
            if (abstractC0940k != null) {
                l(abstractC0940k, cancellationException);
            }
            Rb.c cVar = c0954u2.f14578c;
            if (cVar != null) {
                m(cVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // cc.InterfaceC0942l
    public final boolean d(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14549u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof B0)) {
                return false;
            }
            C0946n c0946n = new C0946n(this, th, (obj instanceof AbstractC0940k) || (obj instanceof hc.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0946n)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            B0 b02 = (B0) obj;
            if (b02 instanceof AbstractC0940k) {
                l((AbstractC0940k) obj, th);
            } else if (b02 instanceof hc.u) {
                n((hc.u) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f14494c);
            return true;
        }
    }

    @Override // cc.InterfaceC0942l
    public final R7.a e(Object obj, Rb.c cVar) {
        return D(obj, cVar);
    }

    @Override // cc.N
    public final Hb.d f() {
        return this.f14551d;
    }

    @Override // cc.N
    public final Throwable g(Object obj) {
        Throwable g = super.g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    @Override // Jb.d
    public final Jb.d getCallerFrame() {
        Hb.d dVar = this.f14551d;
        if (dVar instanceof Jb.d) {
            return (Jb.d) dVar;
        }
        return null;
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return this.f14552e;
    }

    @Override // cc.N
    public final Object h(Object obj) {
        return obj instanceof C0954u ? ((C0954u) obj).f14576a : obj;
    }

    @Override // cc.InterfaceC0942l
    public final void j(Object obj) {
        p(this.f14494c);
    }

    @Override // cc.N
    public final Object k() {
        return f14549u.get(this);
    }

    public final void l(AbstractC0940k abstractC0940k, Throwable th) {
        try {
            abstractC0940k.b(th);
        } catch (Throwable th2) {
            F.t(this.f14552e, new Db.d(8, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Rb.c cVar, Throwable th) {
        try {
            cVar.invoke(th);
        } catch (Throwable th2) {
            F.t(this.f14552e, new Db.d(8, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(hc.u uVar, Throwable th) {
        Hb.i iVar = this.f14552e;
        int i7 = f14548f.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i7, iVar);
        } catch (Throwable th2) {
            F.t(iVar, new Db.d(8, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14550v;
        S s3 = (S) atomicReferenceFieldUpdater.get(this);
        if (s3 == null) {
            return;
        }
        s3.b();
        atomicReferenceFieldUpdater.set(this, A0.f14465a);
    }

    public final void p(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f14548f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z8 = i7 == 4;
                Hb.d dVar = this.f14551d;
                if (z8 || !(dVar instanceof hc.h) || F.x(i7) != F.x(this.f14494c)) {
                    F.E(this, dVar, z8);
                    return;
                }
                A a9 = ((hc.h) dVar).f17943d;
                Hb.i context = ((hc.h) dVar).f17944e.getContext();
                if (a9.V(context)) {
                    a9.T(context, this);
                    return;
                }
                AbstractC0921a0 a10 = G0.a();
                if (a10.b0()) {
                    a10.Y(this);
                    return;
                }
                a10.a0(true);
                try {
                    F.E(this, dVar, true);
                    do {
                    } while (a10.d0());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(w0 w0Var) {
        return w0Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean w10 = w();
        do {
            atomicIntegerFieldUpdater = f14548f;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i10 = i7 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w10) {
                    z();
                }
                Object obj = f14549u.get(this);
                if (obj instanceof C0955v) {
                    throw ((C0955v) obj).f14583a;
                }
                if (F.x(this.f14494c)) {
                    InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) this.f14552e.get(B.f14467b);
                    if (interfaceC0937i0 != null && !interfaceC0937i0.isActive()) {
                        CancellationException cancellationException = interfaceC0937i0.getCancellationException();
                        c(obj, cancellationException);
                        throw cancellationException;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((S) f14550v.get(this)) == null) {
            t();
        }
        if (w10) {
            z();
        }
        return Ib.a.f5345a;
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        Throwable a9 = Db.m.a(obj);
        if (a9 != null) {
            obj = new C0955v(false, a9);
        }
        A(obj, this.f14494c, null);
    }

    public final void s() {
        S t5 = t();
        if (t5 == null || (f14549u.get(this) instanceof B0)) {
            return;
        }
        t5.b();
        f14550v.set(this, A0.f14465a);
    }

    public final S t() {
        S invokeOnCompletion;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) this.f14552e.get(B.f14467b);
        if (interfaceC0937i0 == null) {
            return null;
        }
        invokeOnCompletion = interfaceC0937i0.invokeOnCompletion((r5 & 1) == 0, (r5 & 2) != 0, new C0948o(this));
        do {
            atomicReferenceFieldUpdater = f14550v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, invokeOnCompletion)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return invokeOnCompletion;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(F.H(this.f14551d));
        sb2.append("){");
        Object obj = f14549u.get(this);
        sb2.append(obj instanceof B0 ? "Active" : obj instanceof C0946n ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(F.q(this));
        return sb2.toString();
    }

    public final void u(Rb.c cVar) {
        v(cVar instanceof AbstractC0940k ? (AbstractC0940k) cVar : new C0938j(cVar, 2));
    }

    public final void v(B0 b02) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14549u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0922b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b02)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof AbstractC0940k ? true : obj instanceof hc.u) {
                x(b02, obj);
                throw null;
            }
            if (obj instanceof C0955v) {
                C0955v c0955v = (C0955v) obj;
                c0955v.getClass();
                if (!C0955v.f14582b.compareAndSet(c0955v, 0, 1)) {
                    x(b02, obj);
                    throw null;
                }
                if (obj instanceof C0946n) {
                    if (!(obj instanceof C0955v)) {
                        c0955v = null;
                    }
                    Throwable th = c0955v != null ? c0955v.f14583a : null;
                    if (b02 instanceof AbstractC0940k) {
                        l((AbstractC0940k) b02, th);
                        return;
                    } else {
                        kotlin.jvm.internal.l.c(b02, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((hc.u) b02, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0954u)) {
                if (b02 instanceof hc.u) {
                    return;
                }
                kotlin.jvm.internal.l.c(b02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0954u c0954u = new C0954u(obj, (AbstractC0940k) b02, (Rb.c) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0954u)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0954u c0954u2 = (C0954u) obj;
            if (c0954u2.f14577b != null) {
                x(b02, obj);
                throw null;
            }
            if (b02 instanceof hc.u) {
                return;
            }
            kotlin.jvm.internal.l.c(b02, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            AbstractC0940k abstractC0940k = (AbstractC0940k) b02;
            Throwable th2 = c0954u2.f14580e;
            if (th2 != null) {
                l(abstractC0940k, th2);
                return;
            }
            C0954u a9 = C0954u.a(c0954u2, abstractC0940k, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f14494c == 2) {
            Hb.d dVar = this.f14551d;
            kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (hc.h.f17942v.get((hc.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        Hb.d dVar = this.f14551d;
        Throwable th = null;
        hc.h hVar = dVar instanceof hc.h ? (hc.h) dVar : null;
        if (hVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.h.f17942v;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            R7.a aVar = AbstractC1273a.f17932d;
            if (obj != aVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                    break;
                }
            }
        }
        if (th == null) {
            return;
        }
        o();
        d(th);
    }
}
