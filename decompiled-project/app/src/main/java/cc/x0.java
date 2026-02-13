package cc;

import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public final class x0 extends D0 {

    /* renamed from: d, reason: collision with root package name */
    public final Hb.d f14590d;

    public x0(Hb.i iVar, Rb.e eVar) {
        super(iVar, true, false);
        this.f14590d = com.bumptech.glide.c.m(this, this, eVar);
    }

    @Override // cc.w0
    public final void Q() {
        try {
            AbstractC1273a.h(com.bumptech.glide.c.F(this.f14590d), Db.q.f3365a);
        } catch (Throwable th) {
            resumeWith(com.bumptech.glide.c.n(th));
            throw th;
        }
    }
}
