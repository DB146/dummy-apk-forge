package B0;

import F.C0273q;
import c.InterfaceC0858b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Z implements Q.E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1841b;

    public /* synthetic */ Z(Object obj, int i7) {
        this.f1840a = i7;
        this.f1841b = obj;
    }

    @Override // Q.E
    public final void b() {
        switch (this.f1840a) {
            case 0:
                ((C0213y0) this.f1841b).f2019a.invoke();
                return;
            case 1:
                ((C0273q) this.f1841b).f3994d = null;
                return;
            case 2:
                ((F.D) this.f1841b).f3903c = null;
                return;
            case 3:
                ((F.z) this.f1841b).f4030f = true;
                return;
            case 4:
                Z0.k kVar = (Z0.k) this.f1841b;
                kVar.dismiss();
                kVar.f12129u.c();
                return;
            default:
                Iterator it = ((d.f) this.f1841b).f14069b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0858b) it.next()).cancel();
                }
                return;
        }
    }
}
