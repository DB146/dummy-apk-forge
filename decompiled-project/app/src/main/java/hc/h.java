package hc;

import cc.AbstractC0921a0;
import cc.AbstractC0956w;
import cc.C0955v;
import cc.F;
import cc.G0;
import cc.N;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class h extends N implements Jb.d, Hb.d {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17942v = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final cc.A f17943d;

    /* renamed from: e, reason: collision with root package name */
    public final Jb.c f17944e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17945f;

    /* renamed from: u, reason: collision with root package name */
    public final Object f17946u;

    public h(cc.A a9, Jb.c cVar) {
        super(-1);
        this.f17943d = a9;
        this.f17944e = cVar;
        this.f17945f = AbstractC1273a.f17931c;
        this.f17946u = AbstractC1273a.l(cVar.getContext());
    }

    @Override // cc.N
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0956w) {
            ((AbstractC0956w) obj).getClass();
            throw null;
        }
    }

    @Override // cc.N
    public final Hb.d f() {
        return this;
    }

    @Override // Jb.d
    public final Jb.d getCallerFrame() {
        Jb.c cVar = this.f17944e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return this.f17944e.getContext();
    }

    @Override // cc.N
    public final Object k() {
        Object obj = this.f17945f;
        this.f17945f = AbstractC1273a.f17931c;
        return obj;
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        Jb.c cVar = this.f17944e;
        Hb.i context = cVar.getContext();
        Throwable a9 = Db.m.a(obj);
        Object c0955v = a9 == null ? obj : new C0955v(false, a9);
        cc.A a10 = this.f17943d;
        if (a10.V(context)) {
            this.f17945f = c0955v;
            this.f14494c = 0;
            a10.T(context, this);
            return;
        }
        AbstractC0921a0 a11 = G0.a();
        if (a11.b0()) {
            this.f17945f = c0955v;
            this.f14494c = 0;
            a11.Y(this);
            return;
        }
        a11.a0(true);
        try {
            Hb.i context2 = cVar.getContext();
            Object m10 = AbstractC1273a.m(context2, this.f17946u);
            try {
                cVar.resumeWith(obj);
                do {
                } while (a11.d0());
            } finally {
                AbstractC1273a.g(context2, m10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f17943d + ", " + F.H(this.f17944e) + ']';
    }
}
