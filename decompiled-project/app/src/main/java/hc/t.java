package hc;

import cc.AbstractC0920a;
import cc.F;

/* loaded from: classes2.dex */
public class t extends AbstractC0920a implements Jb.d {

    /* renamed from: d, reason: collision with root package name */
    public final Hb.d f17969d;

    public t(Hb.d dVar, Hb.i iVar) {
        super(iVar, true, true);
        this.f17969d = dVar;
    }

    @Override // cc.w0
    public final boolean I() {
        return true;
    }

    @Override // Jb.d
    public final Jb.d getCallerFrame() {
        Hb.d dVar = this.f17969d;
        if (dVar instanceof Jb.d) {
            return (Jb.d) dVar;
        }
        return null;
    }

    @Override // cc.w0
    public void k(Object obj) {
        AbstractC1273a.h(com.bumptech.glide.c.F(this.f17969d), F.D(obj));
    }

    @Override // cc.w0
    public void m(Object obj) {
        this.f17969d.resumeWith(F.D(obj));
    }
}
