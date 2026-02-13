package y0;

import A0.T;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends A0.G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f26613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.e f26614b;

    public t(w wVar, Rb.e eVar) {
        this.f26613a = wVar;
        this.f26614b = eVar;
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(T t5, List list, long j) {
        w wVar = this.f26613a;
        V0.l layoutDirection = t5.getLayoutDirection();
        r rVar = wVar.f26627v;
        rVar.f26604a = layoutDirection;
        rVar.f26605b = t5.k();
        rVar.f26606c = t5.f();
        boolean m10 = t5.m();
        Rb.e eVar = this.f26614b;
        if (m10 || wVar.f26620a.f78v == null) {
            wVar.f26623d = 0;
            InterfaceC2317B interfaceC2317B = (InterfaceC2317B) eVar.invoke(rVar, new V0.a(j));
            return new C2350s(interfaceC2317B, wVar, wVar.f26623d, interfaceC2317B, 1);
        }
        wVar.f26624e = 0;
        InterfaceC2317B interfaceC2317B2 = (InterfaceC2317B) eVar.invoke(wVar.f26628w, new V0.a(j));
        return new C2350s(interfaceC2317B2, wVar, wVar.f26624e, interfaceC2317B2, 0);
    }
}
