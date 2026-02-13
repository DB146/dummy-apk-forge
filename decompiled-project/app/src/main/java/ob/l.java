package ob;

import gb.AbstractC1204a;
import gb.p;
import qb.n;
import qb.s;

/* loaded from: classes2.dex */
public final class l extends gb.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22232b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22233c;

    public /* synthetic */ l(Object obj, int i7) {
        this.f22232b = i7;
        this.f22233c = obj;
    }

    @Override // gb.d
    public final void b(gb.e eVar) {
        switch (this.f22232b) {
            case 0:
                ((AbstractC1204a) this.f22233c).c(new pb.e(eVar));
                return;
            case 1:
                eVar.f(new pb.d(eVar, (Object[]) this.f22233c));
                return;
            case 2:
                ((n) this.f22233c).b(new s(eVar, 0));
                return;
            default:
                ((p) this.f22233c).d(new s(eVar, 1));
                return;
        }
    }
}
