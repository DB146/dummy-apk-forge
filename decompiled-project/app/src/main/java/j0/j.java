package j0;

import A0.InterfaceC0035y;
import A0.T;
import B0.C0170c0;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class j extends c0.l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public Rb.c f18546C;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(T t5, y0.z zVar, long j) {
        AbstractC2323H b2 = zVar.b(j);
        return t5.Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0170c0(22, b2, this));
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f18546C + ')';
    }
}
