package P3;

import java.util.HashSet;
import java.util.Iterator;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1478w;
import l2.InterfaceC1479x;
import l2.J;
import l2.r;

/* loaded from: classes.dex */
public final class h implements g, InterfaceC1478w {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7826a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final C1481z f7827b;

    public h(C1481z c1481z) {
        this.f7827b = c1481z;
        c1481z.a(this);
    }

    @Override // P3.g
    public final void h(i iVar) {
        this.f7826a.remove(iVar);
    }

    @Override // P3.g
    public final void j(i iVar) {
        this.f7826a.add(iVar);
        EnumC1474s enumC1474s = this.f7827b.f19242d;
        if (enumC1474s == EnumC1474s.f19227a) {
            iVar.k();
        } else if (enumC1474s.compareTo(EnumC1474s.f19230d) >= 0) {
            iVar.j();
        } else {
            iVar.c();
        }
    }

    @J(r.ON_DESTROY)
    public void onDestroy(InterfaceC1479x interfaceC1479x) {
        Iterator it = W3.o.e(this.f7826a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
        interfaceC1479x.w().f(this);
    }

    @J(r.ON_START)
    public void onStart(InterfaceC1479x interfaceC1479x) {
        Iterator it = W3.o.e(this.f7826a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).j();
        }
    }

    @J(r.ON_STOP)
    public void onStop(InterfaceC1479x interfaceC1479x) {
        Iterator it = W3.o.e(this.f7826a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }
}
