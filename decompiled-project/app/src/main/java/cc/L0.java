package cc;

import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public final class L0 extends hc.t {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f14491e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L0(Hb.d dVar, Hb.i iVar) {
        super(dVar, iVar.get(r0) == null ? iVar.plus(r0) : iVar);
        M0 m02 = M0.f14493a;
        this.f14491e = new ThreadLocal();
        if (dVar.getContext().get(Hb.e.f4918a) instanceof A) {
            return;
        }
        Object m10 = AbstractC1273a.m(iVar, null);
        AbstractC1273a.g(iVar, m10);
        a0(iVar, m10);
    }

    public final boolean Z() {
        boolean z8 = this.threadLocalIsSet && this.f14491e.get() == null;
        this.f14491e.remove();
        return !z8;
    }

    public final void a0(Hb.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f14491e.set(new Db.j(iVar, obj));
    }

    @Override // hc.t, cc.w0
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            Db.j jVar = (Db.j) this.f14491e.get();
            if (jVar != null) {
                AbstractC1273a.g((Hb.i) jVar.f3354a, jVar.f3355b);
            }
            this.f14491e.remove();
        }
        Object D10 = F.D(obj);
        Hb.d dVar = this.f17969d;
        Hb.i context = dVar.getContext();
        Object m10 = AbstractC1273a.m(context, null);
        L0 J10 = m10 != AbstractC1273a.f17934f ? F.J(dVar, context, m10) : null;
        try {
            this.f17969d.resumeWith(D10);
        } finally {
            if (J10 == null || J10.Z()) {
                AbstractC1273a.g(context, m10);
            }
        }
    }
}
