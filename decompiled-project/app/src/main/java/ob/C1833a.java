package ob;

import gb.AbstractC1204a;
import gb.p;
import hb.InterfaceC1269b;
import java.util.Objects;
import jb.InterfaceC1394e;
import jb.InterfaceC1396g;
import rb.C1956c;
import y7.u0;

/* renamed from: ob.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1833a extends AbstractC1204a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22202a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22203b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22204c;

    public /* synthetic */ C1833a(int i7, Object obj, Object obj2) {
        this.f22202a = i7;
        this.f22203b = obj;
        this.f22204c = obj2;
    }

    @Override // gb.AbstractC1204a
    public final void d(gb.b bVar) {
        AbstractC1204a abstractC1204a;
        switch (this.f22202a) {
            case 0:
                ((AbstractC1204a) this.f22203b).c(new nb.e(2, bVar, (AbstractC1204a) this.f22204c));
                return;
            case 1:
                qb.k kVar = new qb.k(bVar, (InterfaceC1394e) this.f22204c, 0);
                bVar.c(kVar);
                ((gb.f) this.f22203b).b(kVar);
                return;
            case 2:
                InterfaceC1269b interfaceC1269b = kb.c.f19072a;
                gb.k kVar2 = (gb.i) this.f22203b;
                boolean z8 = kVar2 instanceof InterfaceC1396g;
                InterfaceC1394e interfaceC1394e = (InterfaceC1394e) this.f22204c;
                if (!z8) {
                    kVar2.b(new C1956c(bVar, interfaceC1394e));
                    return;
                }
                try {
                    Object obj = ((InterfaceC1396g) kVar2).get();
                    if (obj != null) {
                        Object apply = interfaceC1394e.apply(obj);
                        Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                        abstractC1204a = (AbstractC1204a) apply;
                    } else {
                        abstractC1204a = null;
                    }
                    if (abstractC1204a != null) {
                        abstractC1204a.c(bVar);
                        return;
                    } else {
                        bVar.c(interfaceC1269b);
                        bVar.a();
                        return;
                    }
                } catch (Throwable th) {
                    u0.L(th);
                    bVar.c(interfaceC1269b);
                    bVar.onError(th);
                    return;
                }
            default:
                qb.k kVar3 = new qb.k(bVar, (InterfaceC1394e) this.f22204c, 1);
                bVar.c(kVar3);
                ((p) this.f22203b).d(kVar3);
                return;
        }
    }
}
