package androidx.compose.foundation;

import A.i;
import Q.AbstractC0499k0;
import Q.S0;
import c0.h;
import c0.j;
import c0.m;
import y.C2288J;
import y.InterfaceC2286H;
import y.InterfaceC2291M;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final S0 f13141a = new AbstractC0499k0(C2288J.f26411b);

    public static final m a(i iVar, InterfaceC2286H interfaceC2286H) {
        return interfaceC2286H == null ? j.f14110a : interfaceC2286H instanceof InterfaceC2291M ? new IndicationModifierElement(iVar, (InterfaceC2291M) interfaceC2286H) : new h(new S0.a(1, interfaceC2286H, iVar));
    }
}
