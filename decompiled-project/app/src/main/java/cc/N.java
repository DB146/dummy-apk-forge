package cc;

import A9.C0154x0;
import a.AbstractC0672a;
import hc.AbstractC1273a;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class N extends kc.h {

    /* renamed from: c, reason: collision with root package name */
    public int f14494c;

    public N(int i7) {
        super(0L, kc.j.g);
        this.f14494c = i7;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract Hb.d f();

    public Throwable g(Object obj) {
        C0955v c0955v = obj instanceof C0955v ? (C0955v) obj : null;
        if (c0955v != null) {
            return c0955v.f14583a;
        }
        return null;
    }

    public Object h(Object obj) {
        return obj;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0672a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.l.b(th);
        F.t(f().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = Db.q.f3365a;
        C0154x0 c0154x0 = this.f19102b;
        try {
            Hb.d f4 = f();
            kotlin.jvm.internal.l.c(f4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            hc.h hVar = (hc.h) f4;
            Jb.c cVar = hVar.f17944e;
            Object obj2 = hVar.f17946u;
            Hb.i context = cVar.getContext();
            Object m10 = AbstractC1273a.m(context, obj2);
            L0 J10 = m10 != AbstractC1273a.f17934f ? F.J(cVar, context, m10) : null;
            try {
                Hb.i context2 = cVar.getContext();
                Object k = k();
                Throwable g = g(k);
                InterfaceC0937i0 interfaceC0937i0 = (g == null && F.x(this.f14494c)) ? (InterfaceC0937i0) context2.get(B.f14467b) : null;
                if (interfaceC0937i0 != null && !interfaceC0937i0.isActive()) {
                    CancellationException cancellationException = interfaceC0937i0.getCancellationException();
                    c(k, cancellationException);
                    cVar.resumeWith(com.bumptech.glide.c.n(cancellationException));
                } else if (g != null) {
                    cVar.resumeWith(com.bumptech.glide.c.n(g));
                } else {
                    cVar.resumeWith(h(k));
                }
                if (J10 == null || J10.Z()) {
                    AbstractC1273a.g(context, m10);
                }
                try {
                    c0154x0.getClass();
                } catch (Throwable th) {
                    obj = com.bumptech.glide.c.n(th);
                }
                i(null, Db.m.a(obj));
            } catch (Throwable th2) {
                if (J10 == null || J10.Z()) {
                    AbstractC1273a.g(context, m10);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c0154x0.getClass();
            } catch (Throwable th4) {
                obj = com.bumptech.glide.c.n(th4);
            }
            i(th3, Db.m.a(obj));
        }
    }
}
