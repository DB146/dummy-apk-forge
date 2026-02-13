package cc;

import a.AbstractC0672a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class w0 implements InterfaceC0937i0, r, C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14585a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14586b = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public w0(boolean z8) {
        this._state = z8 ? F.j : F.f14478i;
    }

    public static C0951q M(hc.k kVar) {
        while (kVar.j()) {
            hc.k e2 = kVar.e();
            if (e2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.k.f17957b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (hc.k) obj;
                    if (!kVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e2;
            }
        }
        while (true) {
            kVar = kVar.i();
            if (!kVar.j()) {
                if (kVar instanceof C0951q) {
                    return (C0951q) kVar;
                }
                if (kVar instanceof y0) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof p0)) {
            return obj instanceof InterfaceC0931f0 ? ((InterfaceC0931f0) obj).isActive() ? "Active" : "New" : obj instanceof C0955v ? "Cancelled" : "Completed";
        }
        p0 p0Var = (p0) obj;
        return p0Var.d() ? "Cancelling" : p0Var.e() ? "Completing" : "Active";
    }

    public static CancellationException U(w0 w0Var, Throwable th) {
        w0Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0939j0(w0Var.s(), th, w0Var) : cancellationException;
    }

    public boolean A() {
        return this instanceof C0953t;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [cc.y0, hc.k] */
    public final y0 B(InterfaceC0931f0 interfaceC0931f0) {
        y0 c10 = interfaceC0931f0.c();
        if (c10 != null) {
            return c10;
        }
        if (interfaceC0931f0 instanceof U) {
            return new hc.k();
        }
        if (interfaceC0931f0 instanceof AbstractC0945m0) {
            R((AbstractC0945m0) interfaceC0931f0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0931f0).toString());
    }

    public final Object C() {
        while (true) {
            Object obj = f14585a.get(this);
            if (!(obj instanceof hc.q)) {
                return obj;
            }
            ((hc.q) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public void E(Db.d dVar) {
        throw dVar;
    }

    public final void G(InterfaceC0937i0 interfaceC0937i0) {
        A0 a02 = A0.f14465a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14586b;
        if (interfaceC0937i0 == null) {
            atomicReferenceFieldUpdater.set(this, a02);
            return;
        }
        interfaceC0937i0.start();
        InterfaceC0950p attachChild = interfaceC0937i0.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (H()) {
            attachChild.b();
            atomicReferenceFieldUpdater.set(this, a02);
        }
    }

    public final boolean H() {
        return !(C() instanceof InterfaceC0931f0);
    }

    public boolean I() {
        return this instanceof C0934h;
    }

    public final boolean J(Object obj) {
        Object V7;
        do {
            V7 = V(C(), obj);
            if (V7 == F.f14474d) {
                return false;
            }
            if (V7 == F.f14475e) {
                return true;
            }
        } while (V7 == F.f14476f);
        k(V7);
        return true;
    }

    public final Object K(Object obj) {
        Object V7;
        do {
            V7 = V(C(), obj);
            if (V7 == F.f14474d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0955v c0955v = obj instanceof C0955v ? (C0955v) obj : null;
                throw new IllegalStateException(str, c0955v != null ? c0955v.f14583a : null);
            }
        } while (V7 == F.f14476f);
        return V7;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final void N(y0 y0Var, Throwable th) {
        Object h10 = y0Var.h();
        kotlin.jvm.internal.l.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        Db.d dVar = null;
        for (hc.k kVar = (hc.k) h10; !kVar.equals(y0Var); kVar = kVar.i()) {
            if (kVar instanceof AbstractC0941k0) {
                AbstractC0945m0 abstractC0945m0 = (AbstractC0945m0) kVar;
                try {
                    abstractC0945m0.l(th);
                } catch (Throwable th2) {
                    if (dVar != null) {
                        AbstractC0672a.c(dVar, th2);
                    } else {
                        dVar = new Db.d(8, "Exception in completion handler " + abstractC0945m0 + " for " + this, th2);
                    }
                }
            }
        }
        if (dVar != null) {
            E(dVar);
        }
        r(th);
    }

    public void O(Object obj) {
    }

    public void Q() {
    }

    public final void R(AbstractC0945m0 abstractC0945m0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        hc.k kVar = new hc.k();
        abstractC0945m0.getClass();
        hc.k.f17957b.lazySet(kVar, abstractC0945m0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hc.k.f17956a;
        atomicReferenceFieldUpdater2.lazySet(kVar, abstractC0945m0);
        loop0: while (true) {
            if (abstractC0945m0.h() != abstractC0945m0) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0945m0, abstractC0945m0, kVar)) {
                if (atomicReferenceFieldUpdater2.get(abstractC0945m0) != abstractC0945m0) {
                    break;
                }
            }
            kVar.g(abstractC0945m0);
        }
        hc.k i7 = abstractC0945m0.i();
        do {
            atomicReferenceFieldUpdater = f14585a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0945m0, i7)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0945m0);
    }

    public final int S(Object obj) {
        boolean z8 = obj instanceof U;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14585a;
        if (z8) {
            if (((U) obj).f14504a) {
                return 0;
            }
            U u3 = F.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Q();
            return 1;
        }
        if (!(obj instanceof C0929e0)) {
            return 0;
        }
        y0 y0Var = ((C0929e0) obj).f14529a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Q();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
    
        if (cc.F.u(r2.f14565e, new cc.C0949o0(r6, r1, r2, r8), 1) == cc.A0.f14465a) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
    
        r2 = M(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        if (r2 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return cc.F.f14475e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        return w(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0931f0)) {
            return F.f14474d;
        }
        if (((obj instanceof U) || (obj instanceof AbstractC0945m0)) && !(obj instanceof C0951q) && !(obj2 instanceof C0955v)) {
            InterfaceC0931f0 interfaceC0931f0 = (InterfaceC0931f0) obj;
            Object c0933g0 = obj2 instanceof InterfaceC0931f0 ? new C0933g0((InterfaceC0931f0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f14585a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0931f0, c0933g0)) {
                    O(obj2);
                    u(interfaceC0931f0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0931f0);
            return F.f14476f;
        }
        InterfaceC0931f0 interfaceC0931f02 = (InterfaceC0931f0) obj;
        y0 B10 = B(interfaceC0931f02);
        if (B10 == null) {
            return F.f14476f;
        }
        C0951q c0951q = null;
        p0 p0Var = interfaceC0931f02 instanceof p0 ? (p0) interfaceC0931f02 : null;
        if (p0Var == null) {
            p0Var = new p0(B10, null);
        }
        synchronized (p0Var) {
            if (p0Var.e()) {
                return F.f14474d;
            }
            p0.f14561b.set(p0Var, 1);
            if (p0Var != interfaceC0931f02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14585a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0931f02, p0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0931f02) {
                        return F.f14476f;
                    }
                }
            }
            boolean d10 = p0Var.d();
            C0955v c0955v = obj2 instanceof C0955v ? (C0955v) obj2 : null;
            if (c0955v != null) {
                p0Var.a(c0955v.f14583a);
            }
            Throwable b2 = p0Var.b();
            if (d10) {
                b2 = null;
            }
            if (b2 != null) {
                N(B10, b2);
            }
            C0951q c0951q2 = interfaceC0931f02 instanceof C0951q ? (C0951q) interfaceC0931f02 : null;
            if (c0951q2 == null) {
                y0 c10 = interfaceC0931f02.c();
                if (c10 != null) {
                    c0951q = M(c10);
                }
            } else {
                c0951q = c0951q2;
            }
        }
    }

    @Override // cc.InterfaceC0937i0
    public final InterfaceC0950p attachChild(r rVar) {
        S u3 = F.u(this, new C0951q(rVar), 2);
        kotlin.jvm.internal.l.c(u3, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0950p) u3;
    }

    @Override // cc.InterfaceC0937i0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0939j0(s(), null, this);
        }
        q(cancellationException);
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Hb.i
    public final Hb.g get(Hb.h hVar) {
        return E6.b.l(this, hVar);
    }

    @Override // cc.InterfaceC0937i0
    public final CancellationException getCancellationException() {
        Object C2 = C();
        if (!(C2 instanceof p0)) {
            if (!(C2 instanceof InterfaceC0931f0)) {
                return C2 instanceof C0955v ? U(this, ((C0955v) C2).f14583a) : new C0939j0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable b2 = ((p0) C2).b();
        if (b2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = b2 instanceof CancellationException ? (CancellationException) b2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = s();
        }
        return new C0939j0(concat, b2, this);
    }

    @Override // cc.InterfaceC0937i0
    public final Zb.g getChildren() {
        return new Eb.t(new s0(null, this));
    }

    public Object getCompleted() {
        return x();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object C2 = C();
        if (C2 instanceof InterfaceC0931f0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C0955v c0955v = C2 instanceof C0955v ? (C0955v) C2 : null;
        if (c0955v != null) {
            return c0955v.f14583a;
        }
        return null;
    }

    @Override // Hb.g
    public final Hb.h getKey() {
        return B.f14467b;
    }

    @Override // cc.InterfaceC0937i0
    public final InterfaceC0937i0 getParent() {
        InterfaceC0950p interfaceC0950p = (InterfaceC0950p) f14586b.get(this);
        if (interfaceC0950p != null) {
            return interfaceC0950p.getParent();
        }
        return null;
    }

    public final boolean i(InterfaceC0931f0 interfaceC0931f0, y0 y0Var, AbstractC0945m0 abstractC0945m0) {
        char c10;
        r0 r0Var = new r0(abstractC0945m0, this, interfaceC0931f0);
        do {
            hc.k e2 = y0Var.e();
            if (e2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.k.f17957b;
                Object obj = atomicReferenceFieldUpdater.get(y0Var);
                while (true) {
                    e2 = (hc.k) obj;
                    if (!e2.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e2);
                }
            }
            hc.k.f17957b.lazySet(abstractC0945m0, e2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hc.k.f17956a;
            atomicReferenceFieldUpdater2.lazySet(abstractC0945m0, y0Var);
            r0Var.f14567c = y0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e2, y0Var, r0Var)) {
                    c10 = r0Var.a(e2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e2) != y0Var) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    @Override // cc.InterfaceC0937i0
    public final S invokeOnCompletion(Rb.c cVar) {
        return invokeOnCompletion(false, true, cVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [cc.y0, hc.k] */
    @Override // cc.InterfaceC0937i0
    public final S invokeOnCompletion(boolean z8, boolean z10, Rb.c cVar) {
        AbstractC0945m0 abstractC0945m0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z8) {
            abstractC0945m0 = cVar instanceof AbstractC0941k0 ? (AbstractC0941k0) cVar : null;
            if (abstractC0945m0 == null) {
                abstractC0945m0 = new C0935h0(cVar);
            }
        } else {
            abstractC0945m0 = cVar instanceof AbstractC0945m0 ? (AbstractC0945m0) cVar : null;
            if (abstractC0945m0 == null) {
                abstractC0945m0 = new T(cVar, 1);
            }
        }
        abstractC0945m0.f14553d = this;
        while (true) {
            Object C2 = C();
            if (C2 instanceof U) {
                U u3 = (U) C2;
                if (u3.f14504a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14585a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, C2, abstractC0945m0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != C2) {
                            break;
                        }
                    }
                    return abstractC0945m0;
                }
                ?? kVar = new hc.k();
                C0929e0 c0929e0 = u3.f14504a ? kVar : new C0929e0(kVar);
                do {
                    atomicReferenceFieldUpdater = f14585a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, u3, c0929e0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == u3);
            } else {
                if (!(C2 instanceof InterfaceC0931f0)) {
                    if (z10) {
                        C0955v c0955v = C2 instanceof C0955v ? (C0955v) C2 : null;
                        cVar.invoke(c0955v != null ? c0955v.f14583a : null);
                    }
                    return A0.f14465a;
                }
                y0 c10 = ((InterfaceC0931f0) C2).c();
                if (c10 == null) {
                    kotlin.jvm.internal.l.c(C2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    R((AbstractC0945m0) C2);
                } else {
                    S s3 = A0.f14465a;
                    if (z8 && (C2 instanceof p0)) {
                        synchronized (C2) {
                            try {
                                th = ((p0) C2).b();
                                if (th != null) {
                                    if ((cVar instanceof C0951q) && !((p0) C2).e()) {
                                    }
                                }
                                if (i((InterfaceC0931f0) C2, c10, abstractC0945m0)) {
                                    if (th == null) {
                                        return abstractC0945m0;
                                    }
                                    s3 = abstractC0945m0;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z10) {
                            cVar.invoke(th);
                        }
                        return s3;
                    }
                    if (i((InterfaceC0931f0) C2, c10, abstractC0945m0)) {
                        return abstractC0945m0;
                    }
                }
            }
        }
    }

    @Override // cc.InterfaceC0937i0
    public boolean isActive() {
        Object C2 = C();
        return (C2 instanceof InterfaceC0931f0) && ((InterfaceC0931f0) C2).isActive();
    }

    @Override // cc.InterfaceC0937i0
    public final boolean isCancelled() {
        Object C2 = C();
        return (C2 instanceof C0955v) || ((C2 instanceof p0) && ((p0) C2).d());
    }

    @Override // cc.InterfaceC0937i0
    public final Object join(Hb.d dVar) {
        boolean z8;
        while (true) {
            Object C2 = C();
            if (!(C2 instanceof InterfaceC0931f0)) {
                z8 = false;
                break;
            }
            if (S(C2) >= 0) {
                z8 = true;
                break;
            }
        }
        Db.q qVar = Db.q.f3365a;
        if (!z8) {
            F.m(dVar.getContext());
            return qVar;
        }
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        c0944m.u(new C0938j(invokeOnCompletion(false, true, new T(c0944m, 4)), 1));
        Object r10 = c0944m.r();
        Ib.a aVar = Ib.a.f5345a;
        if (r10 != aVar) {
            r10 = qVar;
        }
        return r10 == aVar ? r10 : qVar;
    }

    public void k(Object obj) {
    }

    public void m(Object obj) {
        k(obj);
    }

    @Override // Hb.i
    public final Hb.i minusKey(Hb.h hVar) {
        return E6.b.v(this, hVar);
    }

    public final Object o(Hb.d dVar) {
        Object C2;
        int i7 = 1;
        do {
            C2 = C();
            if (!(C2 instanceof InterfaceC0931f0)) {
                if (C2 instanceof C0955v) {
                    throw ((C0955v) C2).f14583a;
                }
                return F.I(C2);
            }
        } while (S(C2) < 0);
        C0947n0 c0947n0 = new C0947n0(com.bumptech.glide.c.F(dVar), this);
        c0947n0.s();
        c0947n0.u(new C0938j(invokeOnCompletion(false, true, new T(c0947n0, 3)), i7));
        Object r10 = c0947n0.r();
        Ib.a aVar = Ib.a.f5345a;
        return r10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = cc.F.f14474d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != cc.F.f14475e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = V(r0, new cc.C0955v(false, v(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == cc.F.f14476f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r0 != cc.F.f14474d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof cc.p0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if ((r4 instanceof cc.InterfaceC0931f0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r1 = v(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r5 = (cc.InterfaceC0931f0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (A() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        if (r5.isActive() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r5 = V(r4, new cc.C0955v(false, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r5 == cc.F.f14474d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r5 == cc.F.f14476f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r6 = B(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r6 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        r7 = new cc.p0(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = cc.w0.f14585a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof cc.InterfaceC0931f0) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r4.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        N(r6, r1);
        r10 = cc.F.f14474d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        r10 = cc.F.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0048, code lost:
    
        r5 = (cc.p0) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0056, code lost:
    
        if (cc.p0.f14563d.get(r5) != cc.F.f14477h) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0058, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005b, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005d, code lost:
    
        r10 = cc.F.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0063, code lost:
    
        r5 = ((cc.p0) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof cc.p0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006a, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006c, code lost:
    
        r1 = v(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0073, code lost:
    
        ((cc.p0) r4).a(r1);
        r10 = ((cc.p0) r4).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0080, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0082, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0083, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0084, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0086, code lost:
    
        N(((cc.p0) r4).f14564a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008d, code lost:
    
        r10 = cc.F.f14474d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0071, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0091, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f8, code lost:
    
        if (r0 != cc.F.f14474d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        if (r0 != cc.F.f14475e) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((cc.p0) r0).e() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0103, code lost:
    
        if (r0 != cc.F.g) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0106, code lost:
    
        k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(Object obj) {
        Object obj2 = F.f14474d;
    }

    @Override // Hb.i
    public final Hb.i plus(Hb.i iVar) {
        return E6.b.w(this, iVar);
    }

    public void q(CancellationException cancellationException) {
        p(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (I()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC0950p interfaceC0950p = (InterfaceC0950p) f14586b.get(this);
        return (interfaceC0950p == null || interfaceC0950p == A0.f14465a) ? z8 : interfaceC0950p.d(th) || z8;
    }

    public String s() {
        return "Job was cancelled";
    }

    @Override // cc.InterfaceC0937i0
    public final boolean start() {
        int S7;
        do {
            S7 = S(C());
            if (S7 == 0) {
                return false;
            }
        } while (S7 != 1);
        return true;
    }

    public boolean t(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return p(th) && z();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(L() + '{' + T(C()) + '}');
        sb2.append('@');
        sb2.append(F.q(this));
        return sb2.toString();
    }

    public final void u(InterfaceC0931f0 interfaceC0931f0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14586b;
        InterfaceC0950p interfaceC0950p = (InterfaceC0950p) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0950p != null) {
            interfaceC0950p.b();
            atomicReferenceFieldUpdater.set(this, A0.f14465a);
        }
        Db.d dVar = null;
        C0955v c0955v = obj instanceof C0955v ? (C0955v) obj : null;
        Throwable th = c0955v != null ? c0955v.f14583a : null;
        if (interfaceC0931f0 instanceof AbstractC0945m0) {
            try {
                ((AbstractC0945m0) interfaceC0931f0).l(th);
                return;
            } catch (Throwable th2) {
                E(new Db.d(8, "Exception in completion handler " + interfaceC0931f0 + " for " + this, th2));
                return;
            }
        }
        y0 c10 = interfaceC0931f0.c();
        if (c10 != null) {
            Object h10 = c10.h();
            kotlin.jvm.internal.l.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (hc.k kVar = (hc.k) h10; !kVar.equals(c10); kVar = kVar.i()) {
                if (kVar instanceof AbstractC0945m0) {
                    AbstractC0945m0 abstractC0945m0 = (AbstractC0945m0) kVar;
                    try {
                        abstractC0945m0.l(th);
                    } catch (Throwable th3) {
                        if (dVar != null) {
                            AbstractC0672a.c(dVar, th3);
                        } else {
                            dVar = new Db.d(8, "Exception in completion handler " + abstractC0945m0 + " for " + this, th3);
                        }
                    }
                }
            }
            if (dVar != null) {
                E(dVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable v(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        w0 w0Var = (w0) ((C0) obj);
        Object C2 = w0Var.C();
        if (C2 instanceof p0) {
            cancellationException = ((p0) C2).b();
        } else if (C2 instanceof C0955v) {
            cancellationException = ((C0955v) C2).f14583a;
        } else {
            if (C2 instanceof InterfaceC0931f0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + C2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new C0939j0("Parent job is ".concat(T(C2)), cancellationException, w0Var);
        }
        return cancellationException2;
    }

    public final Object w(p0 p0Var, Object obj) {
        Throwable y10;
        C0955v c0955v = obj instanceof C0955v ? (C0955v) obj : null;
        Throwable th = c0955v != null ? c0955v.f14583a : null;
        synchronized (p0Var) {
            p0Var.d();
            ArrayList<Throwable> f4 = p0Var.f(th);
            y10 = y(p0Var, f4);
            if (y10 != null && f4.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f4.size()));
                for (Throwable th2 : f4) {
                    if (th2 != y10 && th2 != y10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        AbstractC0672a.c(y10, th2);
                    }
                }
            }
        }
        if (y10 != null && y10 != th) {
            obj = new C0955v(false, y10);
        }
        if (y10 != null && (r(y10) || D(y10))) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0955v.f14582b.compareAndSet((C0955v) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14585a;
        Object c0933g0 = obj instanceof InterfaceC0931f0 ? new C0933g0((InterfaceC0931f0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, p0Var, c0933g0) && atomicReferenceFieldUpdater.get(this) == p0Var) {
        }
        u(p0Var, obj);
        return obj;
    }

    public final Object x() {
        Object C2 = C();
        if (C2 instanceof InterfaceC0931f0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (C2 instanceof C0955v) {
            throw ((C0955v) C2).f14583a;
        }
        return F.I(C2);
    }

    public final Throwable y(p0 p0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (p0Var.d()) {
                return new C0939j0(s(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof H0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof H0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean z() {
        return true;
    }
}
