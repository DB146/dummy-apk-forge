package qb;

import java.util.List;
import yb.InterfaceC2473c;

/* loaded from: classes2.dex */
public final class o extends gb.f implements InterfaceC2473c {

    /* renamed from: a, reason: collision with root package name */
    public final List f23628a;

    public o(List list) {
        this.f23628a = list;
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        gVar.c(kb.c.f19072a);
        gVar.onSuccess(this.f23628a);
    }

    @Override // jb.InterfaceC1396g
    public final Object get() {
        return this.f23628a;
    }
}
