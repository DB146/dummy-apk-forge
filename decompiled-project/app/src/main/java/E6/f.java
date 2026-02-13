package E6;

import A0.G0;
import q3.s;
import t8.C2034c;

/* loaded from: classes.dex */
public final class f implements F6.c {

    /* renamed from: a, reason: collision with root package name */
    public final F6.c f3735a;

    public /* synthetic */ f(e eVar) {
        C2034c c2034c = new C2034c(eVar, 11);
        this.f3735a = F6.b.a(new f(F6.b.a(new G0(F6.b.a(new s(6, c2034c, F6.b.a(new D5.i(c2034c, 9)), false)), F6.b.a(new C2034c(c2034c, 10)), c2034c, 14))));
    }

    public f(F6.c cVar) {
        this.f3735a = cVar;
    }

    @Override // F6.c
    public Object zza() {
        d dVar = (d) this.f3735a.zza();
        if (dVar != null) {
            return dVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
