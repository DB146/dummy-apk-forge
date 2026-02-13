package cc;

import a.AbstractC0672a;
import hc.AbstractC1273a;
import hc.C1277e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kc.C1441d;

/* loaded from: classes2.dex */
public abstract class F {

    /* renamed from: b */
    public static final R7.a f14472b;

    /* renamed from: c */
    public static final R7.a f14473c;

    /* renamed from: d */
    public static final R7.a f14474d;

    /* renamed from: e */
    public static final R7.a f14475e;

    /* renamed from: f */
    public static final R7.a f14476f;
    public static final R7.a g;

    /* renamed from: h */
    public static final R7.a f14477h;

    /* renamed from: a */
    public static final R7.a f14471a = new R7.a("RESUME_TOKEN", 28);

    /* renamed from: i */
    public static final U f14478i = new U(false);
    public static final U j = new U(true);

    static {
        int i7 = 28;
        f14472b = new R7.a("REMOVED_TASK", i7);
        f14473c = new R7.a("CLOSED_EMPTY", i7);
        int i10 = 28;
        f14474d = new R7.a("COMPLETING_ALREADY", i10);
        f14475e = new R7.a("COMPLETING_WAITING_CHILDREN", i10);
        f14476f = new R7.a("COMPLETING_RETRY", i10);
        g = new R7.a("TOO_LATE_TO_CANCEL", i10);
        f14477h = new R7.a("SEALED", i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [cc.D0, cc.a] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final D0 A(E e2, Hb.i iVar, int i7, Rb.e eVar) {
        Hb.i C2 = C(e2, iVar);
        ?? x0Var = i7 == 2 ? new x0(C2, eVar) : new AbstractC0920a(C2, true, true);
        x0Var.Y(i7, x0Var, eVar);
        return x0Var;
    }

    public static /* synthetic */ D0 B(E e2, Hb.a aVar, int i7, Rb.e eVar, int i10) {
        Hb.i iVar = aVar;
        if ((i10 & 1) != 0) {
            iVar = Hb.j.f4919a;
        }
        if ((i10 & 2) != 0) {
            i7 = 1;
        }
        return A(e2, iVar, i7, eVar);
    }

    public static final Hb.i C(E e2, Hb.i iVar) {
        Hb.i n6 = n(e2.l(), iVar, true);
        C1441d c1441d = P.f14498a;
        return (n6 == c1441d || n6.get(Hb.e.f4918a) != null) ? n6 : n6.plus(c1441d);
    }

    public static final Object D(Object obj) {
        return obj instanceof C0955v ? com.bumptech.glide.c.n(((C0955v) obj).f14583a) : obj;
    }

    public static final void E(C0944m c0944m, Hb.d dVar, boolean z8) {
        Object obj = C0944m.f14549u.get(c0944m);
        Throwable g2 = c0944m.g(obj);
        Object n6 = g2 != null ? com.bumptech.glide.c.n(g2) : c0944m.h(obj);
        if (!z8) {
            dVar.resumeWith(n6);
            return;
        }
        kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        hc.h hVar = (hc.h) dVar;
        Jb.c cVar = hVar.f17944e;
        Hb.i context = cVar.getContext();
        Object m10 = AbstractC1273a.m(context, hVar.f17946u);
        L0 J10 = m10 != AbstractC1273a.f17934f ? J(cVar, context, m10) : null;
        try {
            cVar.resumeWith(n6);
        } finally {
            if (J10 == null || J10.Z()) {
                AbstractC1273a.g(context, m10);
            }
        }
    }

    public static final Object F(Hb.i iVar, Rb.e eVar) {
        AbstractC0921a0 abstractC0921a0;
        Hb.i n6;
        Thread currentThread = Thread.currentThread();
        Hb.h hVar = Hb.e.f4918a;
        Hb.f fVar = (Hb.f) iVar.get(hVar);
        Hb.j jVar = Hb.j.f4919a;
        if (fVar == null) {
            abstractC0921a0 = G0.a();
            n6 = n(jVar, iVar.plus(abstractC0921a0), true);
            C1441d c1441d = P.f14498a;
            if (n6 != c1441d && n6.get(hVar) == null) {
                n6 = n6.plus(c1441d);
            }
        } else {
            if (fVar instanceof AbstractC0921a0) {
            }
            abstractC0921a0 = (AbstractC0921a0) G0.f14481a.get();
            n6 = n(jVar, iVar, true);
            C1441d c1441d2 = P.f14498a;
            if (n6 != c1441d2 && n6.get(hVar) == null) {
                n6 = n6.plus(c1441d2);
            }
        }
        C0934h c0934h = new C0934h(n6, currentThread, abstractC0921a0);
        c0934h.Y(1, c0934h, eVar);
        AbstractC0921a0 abstractC0921a02 = c0934h.f14540e;
        if (abstractC0921a02 != null) {
            int i7 = AbstractC0921a0.f14515f;
            abstractC0921a02.a0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long c02 = abstractC0921a02 != null ? abstractC0921a02.c0() : Long.MAX_VALUE;
                if (c0934h.H()) {
                    if (abstractC0921a02 != null) {
                        int i10 = AbstractC0921a0.f14515f;
                        abstractC0921a02.X(false);
                    }
                    Object I6 = I(c0934h.C());
                    C0955v c0955v = I6 instanceof C0955v ? (C0955v) I6 : null;
                    if (c0955v == null) {
                        return I6;
                    }
                    throw c0955v.f14583a;
                }
                LockSupport.parkNanos(c0934h, c02);
            } catch (Throwable th) {
                if (abstractC0921a02 != null) {
                    int i11 = AbstractC0921a0.f14515f;
                    abstractC0921a02.X(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0934h.p(interruptedException);
        throw interruptedException;
    }

    public static final Object G(I0 i02, Rb.e eVar) {
        Object c0955v;
        Object K10;
        i02.invokeOnCompletion(new T(p(i02.f17969d.getContext()).K(i02.f14484e, i02, i02.f14514c), 0));
        try {
            kotlin.jvm.internal.y.b(2, eVar);
            c0955v = eVar.invoke(i02, i02);
        } catch (Throwable th) {
            c0955v = new C0955v(false, th);
        }
        Ib.a aVar = Ib.a.f5345a;
        if (c0955v == aVar || (K10 = i02.K(c0955v)) == f14475e) {
            return aVar;
        }
        if (K10 instanceof C0955v) {
            Throwable th2 = ((C0955v) K10).f14583a;
            if (!(th2 instanceof H0)) {
                throw th2;
            }
            if (((H0) th2).f14483a != i02) {
                throw th2;
            }
            if (c0955v instanceof C0955v) {
                throw ((C0955v) c0955v).f14583a;
            }
        } else {
            c0955v = I(K10);
        }
        return c0955v;
    }

    public static final String H(Hb.d dVar) {
        Object n6;
        if (dVar instanceof hc.h) {
            return dVar.toString();
        }
        try {
            n6 = dVar + '@' + q(dVar);
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        if (Db.m.a(n6) != null) {
            n6 = dVar.getClass().getName() + '@' + q(dVar);
        }
        return (String) n6;
    }

    public static final Object I(Object obj) {
        InterfaceC0931f0 interfaceC0931f0;
        C0933g0 c0933g0 = obj instanceof C0933g0 ? (C0933g0) obj : null;
        return (c0933g0 == null || (interfaceC0931f0 = c0933g0.f14538a) == null) ? obj : interfaceC0931f0;
    }

    public static final L0 J(Hb.d dVar, Hb.i iVar, Object obj) {
        L0 l02 = null;
        if (!(dVar instanceof Jb.d)) {
            return null;
        }
        if (iVar.get(M0.f14493a) != null) {
            Jb.d dVar2 = (Jb.d) dVar;
            while (true) {
                if ((dVar2 instanceof M) || (dVar2 = dVar2.getCallerFrame()) == null) {
                    break;
                }
                if (dVar2 instanceof L0) {
                    l02 = (L0) dVar2;
                    break;
                }
            }
            if (l02 != null) {
                l02.a0(iVar, obj);
            }
        }
        return l02;
    }

    public static final Object K(Hb.i iVar, Rb.e eVar, Hb.d dVar) {
        Object I6;
        Hb.i context = dVar.getContext();
        Hb.i plus = !((Boolean) iVar.fold(Boolean.FALSE, C0957x.f14588c)).booleanValue() ? context.plus(iVar) : n(context, iVar, false);
        m(plus);
        if (plus == context) {
            hc.t tVar = new hc.t(dVar, plus);
            I6 = O5.b.I(tVar, tVar, eVar);
        } else {
            Hb.e eVar2 = Hb.e.f4918a;
            if (kotlin.jvm.internal.l.a(plus.get(eVar2), context.get(eVar2))) {
                L0 l02 = new L0(dVar, plus);
                Hb.i iVar2 = l02.f14514c;
                Object m10 = AbstractC1273a.m(iVar2, null);
                try {
                    Object I10 = O5.b.I(l02, l02, eVar);
                    AbstractC1273a.g(iVar2, m10);
                    I6 = I10;
                } catch (Throwable th) {
                    AbstractC1273a.g(iVar2, m10);
                    throw th;
                }
            } else {
                hc.t tVar2 = new hc.t(dVar, plus);
                E6.b.B(eVar, tVar2, tVar2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M.f14492e;
                    int i7 = atomicIntegerFieldUpdater.get(tVar2);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        I6 = I(tVar2.C());
                        if (I6 instanceof C0955v) {
                            throw ((C0955v) I6).f14583a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1)) {
                        I6 = Ib.a.f5345a;
                        break;
                    }
                }
            }
        }
        Ib.a aVar = Ib.a.f5345a;
        return I6;
    }

    public static final Object L(long j10, Rb.e eVar, Jb.c cVar) {
        if (j10 <= 0) {
            throw new H0("Timed out immediately", null);
        }
        Object G9 = G(new I0(j10, cVar), eVar);
        Ib.a aVar = Ib.a.f5345a;
        return G9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(long j10, Rb.e eVar, Jb.c cVar) {
        J0 j02;
        int i7;
        kotlin.jvm.internal.v vVar;
        if (cVar instanceof J0) {
            J0 j03 = (J0) cVar;
            int i10 = j03.f14487c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j03.f14487c = i10 - Integer.MIN_VALUE;
                j02 = j03;
                Object obj = j02.f14486b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = j02.f14487c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (j10 <= 0) {
                        return null;
                    }
                    ?? obj2 = new Object();
                    try {
                        j02.f14485a = obj2;
                        j02.f14487c = 1;
                        I0 i02 = new I0(j10, j02);
                        obj2.f19134a = i02;
                        obj = G(i02, eVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (H0 e2) {
                        e = e2;
                        vVar = obj2;
                        if (e.f14483a != vVar.f19134a) {
                            return null;
                        }
                        throw e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = j02.f14485a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (H0 e10) {
                        e = e10;
                        if (e.f14483a != vVar.f19134a) {
                        }
                    }
                }
                return obj;
            }
        }
        j02 = new Jb.c(cVar);
        Object obj3 = j02.f14486b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = j02.f14487c;
        if (i7 != 0) {
        }
        return obj3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cc.w0, cc.t] */
    public static C0953t a() {
        ?? w0Var = new w0(true);
        w0Var.G(null);
        return w0Var;
    }

    public static final C1277e b(Hb.i iVar) {
        if (iVar.get(B.f14467b) == null) {
            iVar = iVar.plus(c());
        }
        return new C1277e(iVar);
    }

    public static C0943l0 c() {
        return new C0943l0(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cc.l0, cc.F0] */
    public static F0 d() {
        return new C0943l0(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [cc.J, cc.a] */
    public static J e(E e2, A a9, Rb.e eVar, int i7) {
        Hb.i iVar = a9;
        if ((i7 & 1) != 0) {
            iVar = Hb.j.f4919a;
        }
        ?? abstractC0920a = new AbstractC0920a(C(e2, iVar), true, true);
        abstractC0920a.Y(1, abstractC0920a, eVar);
        return abstractC0920a;
    }

    public static final Object f(I[] iArr, Jb.i iVar) {
        if (iArr.length == 0) {
            return Eb.v.f3891a;
        }
        C0928e c0928e = new C0928e(iArr);
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(iVar));
        c0944m.s();
        int length = iArr.length;
        C0924c[] c0924cArr = new C0924c[length];
        for (int i7 = 0; i7 < length; i7++) {
            I i10 = iArr[i7];
            i10.start();
            C0924c c0924c = new C0924c(c0928e, c0944m);
            c0924c.f14522f = i10.invokeOnCompletion(c0924c);
            c0924cArr[i7] = c0924c;
        }
        C0926d c0926d = new C0926d(c0924cArr);
        for (int i11 = 0; i11 < length; i11++) {
            C0924c c0924c2 = c0924cArr[i11];
            c0924c2.getClass();
            C0924c.f14520v.set(c0924c2, c0926d);
        }
        if (C0944m.f14549u.get(c0944m) instanceof B0) {
            c0944m.u(c0926d);
        } else {
            c0926d.c();
        }
        Object r10 = c0944m.r();
        Ib.a aVar = Ib.a.f5345a;
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(Jb.c cVar) {
        L l10;
        int i7;
        if (cVar instanceof L) {
            L l11 = (L) cVar;
            int i10 = l11.f14490b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l11.f14490b = i10 - Integer.MIN_VALUE;
                l10 = l11;
                Object obj = l10.f14489a;
                Ib.a aVar = Ib.a.f5345a;
                i7 = l10.f14490b;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    l10.f14490b = 1;
                    C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(l10));
                    c0944m.s();
                    if (c0944m.r() == aVar) {
                        return;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                throw new Db.d(0);
            }
        }
        l10 = new Jb.c(cVar);
        Object obj2 = l10.f14489a;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = l10.f14490b;
        if (i7 != 0) {
        }
        throw new Db.d(0);
    }

    public static final void h(Hb.i iVar, CancellationException cancellationException) {
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) iVar.get(B.f14467b);
        if (interfaceC0937i0 != null) {
            interfaceC0937i0.cancel(cancellationException);
        }
    }

    public static final void i(E e2, CancellationException cancellationException) {
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) e2.l().get(B.f14467b);
        if (interfaceC0937i0 != null) {
            interfaceC0937i0.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e2).toString());
        }
    }

    public static final Object k(Rb.e eVar, Hb.d dVar) {
        hc.t tVar = new hc.t(dVar, dVar.getContext());
        Object I6 = O5.b.I(tVar, tVar, eVar);
        Ib.a aVar = Ib.a.f5345a;
        return I6;
    }

    public static final Object l(long j10, Jb.c cVar) {
        Db.q qVar = Db.q.f3365a;
        if (j10 <= 0) {
            return qVar;
        }
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(cVar));
        c0944m.s();
        if (j10 < Long.MAX_VALUE) {
            p(c0944m.f14552e).l(j10, c0944m);
        }
        Object r10 = c0944m.r();
        return r10 == Ib.a.f5345a ? r10 : qVar;
    }

    public static final void m(Hb.i iVar) {
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) iVar.get(B.f14467b);
        if (interfaceC0937i0 != null && !interfaceC0937i0.isActive()) {
            throw interfaceC0937i0.getCancellationException();
        }
    }

    public static final Hb.i n(Hb.i iVar, Hb.i iVar2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        C0957x c0957x = C0957x.f14588c;
        boolean booleanValue = ((Boolean) iVar.fold(bool, c0957x)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.fold(bool, c0957x)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.plus(iVar2);
        }
        Hb.j jVar = Hb.j.f4919a;
        Hb.i iVar3 = (Hb.i) iVar.fold(jVar, new C0957x(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.fold(jVar, C0957x.f14587b);
        }
        return iVar3.plus((Hb.i) obj);
    }

    public static final A o(Executor executor) {
        A a9;
        O o10 = executor instanceof O ? (O) executor : null;
        return (o10 == null || (a9 = o10.f14495a) == null) ? new C0925c0(executor) : a9;
    }

    public static final K p(Hb.i iVar) {
        Hb.g gVar = iVar.get(Hb.e.f4918a);
        K k = gVar instanceof K ? (K) gVar : null;
        return k == null ? H.f14482a : k;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0937i0 r(Hb.i iVar) {
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) iVar.get(B.f14467b);
        if (interfaceC0937i0 != null) {
            return interfaceC0937i0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C0944m s(Hb.d dVar) {
        C0944m c0944m;
        C0944m c0944m2;
        if (!(dVar instanceof hc.h)) {
            return new C0944m(1, dVar);
        }
        hc.h hVar = (hc.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hc.h.f17942v;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            R7.a aVar = AbstractC1273a.f17932d;
            c0944m = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                c0944m2 = null;
                break;
            }
            if (obj instanceof C0944m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0944m2 = (C0944m) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0944m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0944m.f14549u;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0944m2);
            if (!(obj2 instanceof C0954u) || ((C0954u) obj2).f14579d == null) {
                C0944m.f14548f.set(c0944m2, 536870911);
                atomicReferenceFieldUpdater2.set(c0944m2, C0922b.f14519a);
                c0944m = c0944m2;
            } else {
                c0944m2.o();
            }
            if (c0944m != null) {
                return c0944m;
            }
        }
        return new C0944m(2, dVar);
    }

    public static final void t(Hb.i iVar, Throwable th) {
        try {
            C c10 = (C) iVar.get(B.f14466a);
            if (c10 != null) {
                c10.P(th);
            } else {
                AbstractC1273a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0672a.c(runtimeException, th);
                th = runtimeException;
            }
            AbstractC1273a.d(iVar, th);
        }
    }

    public static final boolean v(Hb.i iVar) {
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) iVar.get(B.f14467b);
        if (interfaceC0937i0 != null) {
            return interfaceC0937i0.isActive();
        }
        return true;
    }

    public static final boolean w(E e2) {
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) e2.l().get(B.f14467b);
        if (interfaceC0937i0 != null) {
            return interfaceC0937i0.isActive();
        }
        return true;
    }

    public static final boolean x(int i7) {
        return i7 == 1 || i7 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(List list, Jb.c cVar) {
        C0932g c0932g;
        int i7;
        Iterator it;
        if (cVar instanceof C0932g) {
            C0932g c0932g2 = (C0932g) cVar;
            int i10 = c0932g2.f14537c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0932g2.f14537c = i10 - Integer.MIN_VALUE;
                c0932g = c0932g2;
                Object obj = c0932g.f14536b;
                Object obj2 = Ib.a.f5345a;
                i7 = c0932g.f14537c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    it = list.iterator();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c0932g.f14535a;
                    com.bumptech.glide.c.c0(obj);
                }
                while (it.hasNext()) {
                    InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) it.next();
                    c0932g.f14535a = it;
                    c0932g.f14537c = 1;
                    if (interfaceC0937i0.join(c0932g) == obj2) {
                        return obj2;
                    }
                }
                return Db.q.f3365a;
            }
        }
        c0932g = new Jb.c(cVar);
        Object obj3 = c0932g.f14536b;
        Object obj22 = Ib.a.f5345a;
        i7 = c0932g.f14537c;
        if (i7 != 0) {
        }
        while (it.hasNext()) {
        }
        return Db.q.f3365a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(InterfaceC0937i0[] interfaceC0937i0Arr, Jb.c cVar) {
        C0930f c0930f;
        int i7;
        int i10;
        Object[] objArr;
        int length;
        if (cVar instanceof C0930f) {
            C0930f c0930f2 = (C0930f) cVar;
            int i11 = c0930f2.f14534e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0930f2.f14534e = i11 - Integer.MIN_VALUE;
                c0930f = c0930f2;
                Object obj = c0930f.f14533d;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c0930f.f14534e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    i10 = 0;
                    objArr = interfaceC0937i0Arr;
                    length = interfaceC0937i0Arr.length;
                    if (i10 < length) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = c0930f.f14532c;
                    i10 = c0930f.f14531b;
                    InterfaceC0937i0[] interfaceC0937i0Arr2 = (InterfaceC0937i0[]) c0930f.f14530a;
                    com.bumptech.glide.c.c0(obj);
                    InterfaceC0937i0[] interfaceC0937i0Arr3 = interfaceC0937i0Arr2;
                    i10++;
                    objArr = interfaceC0937i0Arr3;
                    if (i10 < length) {
                        M m10 = objArr[i10];
                        c0930f.f14530a = objArr;
                        c0930f.f14531b = i10;
                        c0930f.f14532c = length;
                        c0930f.f14534e = 1;
                        interfaceC0937i0Arr3 = objArr;
                        if (m10.join(c0930f) == aVar) {
                            return aVar;
                        }
                        i10++;
                        objArr = interfaceC0937i0Arr3;
                        if (i10 < length) {
                            return Db.q.f3365a;
                        }
                    }
                }
            }
        }
        c0930f = new Jb.c(cVar);
        Object obj2 = c0930f.f14533d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0930f.f14534e;
        if (i7 != 0) {
        }
    }
}
