package M9;

import U9.u;
import java.util.List;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import ob.C1837e;
import ob.C1838f;

/* loaded from: classes2.dex */
public final class j implements InterfaceC1394e, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f6872a;

    public /* synthetic */ j(k kVar) {
        this.f6872a = kVar;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        kotlin.jvm.internal.l.e(it, "it");
        k t5 = this.f6872a;
        kotlin.jvm.internal.l.e(t5, "t");
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object it) {
        Object obj;
        kotlin.jvm.internal.l.e(it, "it");
        boolean z8 = it instanceof N9.b;
        k t5 = this.f6872a;
        if (z8) {
            u uVar = t5.g;
            uVar.getClass();
            obj = new C1837e(android.support.v4.media.session.b.g(uVar.f9913a, new Aa.t(22, uVar, (N9.b) it)), 2);
        } else {
            boolean z10 = it instanceof List;
            C1838f c1838f = C1838f.f22215a;
            if (z10) {
                List list = (List) it;
                if (list.isEmpty()) {
                    return c1838f;
                }
                if (Eb.o.Y(list) instanceof N9.a) {
                    String message = "TVScheduler.Programme: " + list.size();
                    kotlin.jvm.internal.l.e(t5, "t");
                    kotlin.jvm.internal.l.e(message, "message");
                    U9.t tVar = (U9.t) t5.f6879f.getValue();
                    tVar.getClass();
                    obj = android.support.v4.media.session.b.g(tVar.f9911a, new Aa.t(21, tVar, list));
                }
            }
            obj = c1838f;
        }
        return obj;
    }
}
