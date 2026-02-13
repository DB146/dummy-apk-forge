package c0;

import A0.InterfaceC0035y;
import A0.T;
import B0.C0170c0;
import Eb.w;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;
import y0.z;

/* loaded from: classes.dex */
public final class q extends l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public float f14127C;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(T t5, z zVar, long j) {
        AbstractC2323H b2 = zVar.b(j);
        return t5.Q(b2.f26554a, b2.f26555b, w.f3892a, new C0170c0(19, b2, this));
    }

    public final String toString() {
        return "ZIndexModifier(zIndex=" + this.f14127C + ')';
    }
}
