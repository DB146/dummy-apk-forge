package ob;

import gb.AbstractC1204a;
import jb.InterfaceC1390a;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class k extends AbstractC1204a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1204a f22229a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1393d f22230b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1390a f22231c;

    public k(AbstractC1204a abstractC1204a, InterfaceC1393d interfaceC1393d, InterfaceC1390a interfaceC1390a) {
        this.f22229a = abstractC1204a;
        this.f22230b = interfaceC1393d;
        this.f22231c = interfaceC1390a;
    }

    @Override // gb.AbstractC1204a
    public final void d(gb.b bVar) {
        this.f22229a.c(new nb.g(this, bVar));
    }
}
