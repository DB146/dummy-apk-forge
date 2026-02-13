package S2;

import Eb.o;
import java.util.Iterator;
import l2.EnumC1474s;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;
import l2.r;
import v2.C2133e;
import y2.c;
import y2.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1477v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8982b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f8981a = i7;
        this.f8982b = obj;
    }

    @Override // l2.InterfaceC1477v
    public final void onStateChanged(InterfaceC1479x interfaceC1479x, r rVar) {
        switch (this.f8981a) {
            case 0:
                r rVar2 = r.ON_START;
                b bVar = (b) this.f8982b;
                if (rVar == rVar2) {
                    bVar.f8985c = true;
                    return;
                } else {
                    if (rVar == r.ON_STOP) {
                        bVar.f8985c = false;
                        return;
                    }
                    return;
                }
            default:
                EnumC1474s a9 = rVar.a();
                f fVar = (f) this.f8982b;
                fVar.f26778q = a9;
                if (fVar.f26767c != null) {
                    Iterator it = o.u0(fVar.f26770f).iterator();
                    while (it.hasNext()) {
                        C2133e c2133e = (C2133e) it.next();
                        c2133e.getClass();
                        c cVar = c2133e.f24973v;
                        cVar.getClass();
                        EnumC1474s a10 = rVar.a();
                        C2133e c2133e2 = cVar.f26748a;
                        c2133e2.getClass();
                        c2133e2.f24969d = a10;
                        cVar.f26751d = rVar.a();
                        cVar.b();
                    }
                    return;
                }
                return;
        }
    }
}
