package kc;

import cc.A;
import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public final class k extends A {

    /* renamed from: c, reason: collision with root package name */
    public static final k f19111c = new A();

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        C1441d c1441d = C1441d.f19098d;
        c1441d.f19100c.n(runnable, j.f19110h, false);
    }

    @Override // cc.A
    public final void U(Hb.i iVar, Runnable runnable) {
        C1441d c1441d = C1441d.f19098d;
        c1441d.f19100c.n(runnable, j.f19110h, true);
    }

    @Override // cc.A
    public final A W(int i7) {
        AbstractC1273a.a(i7);
        return i7 >= j.f19107d ? this : super.W(i7);
    }
}
