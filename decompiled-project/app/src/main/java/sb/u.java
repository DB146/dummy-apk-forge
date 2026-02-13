package sb;

import yb.InterfaceC2473c;

/* loaded from: classes2.dex */
public final class u extends gb.i implements InterfaceC2473c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24332a;

    public u(Object obj) {
        this.f24332a = obj;
    }

    @Override // jb.InterfaceC1396g
    public final Object get() {
        return this.f24332a;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        RunnableC2004C runnableC2004C = new RunnableC2004C(lVar, this.f24332a);
        lVar.c(runnableC2004C);
        runnableC2004C.run();
    }
}
