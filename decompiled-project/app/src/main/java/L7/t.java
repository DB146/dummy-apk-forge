package L7;

import a.AbstractC0672a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends AbstractC0672a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T7.s f6392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q3.s f6393f;
    public final /* synthetic */ H2.E g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6394h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f6395i;

    public t(z zVar, T7.s sVar, q3.s sVar2, H2.E e2, ArrayList arrayList) {
        this.f6395i = zVar;
        this.f6392e = sVar;
        this.f6393f = sVar2;
        this.g = e2;
        this.f6394h = arrayList;
    }

    @Override // a.AbstractC0672a
    public final void w(Object obj, Object obj2) {
        T7.c cVar = (T7.c) obj;
        O7.g gVar = (O7.g) obj2;
        T7.s sVar = this.f6392e;
        T7.s h10 = sVar != null ? sVar.h(cVar) : null;
        q3.s sVar2 = this.f6393f;
        q3.s sVar3 = new q3.s(14, ((C0385e) sVar2.f23438b).o(cVar), (E) sVar2.f23439c, false);
        H2.E x2 = this.g.x(cVar);
        if (x2 != null) {
            this.f6394h.addAll(this.f6395i.c(x2, gVar, h10, sVar3));
        }
    }
}
