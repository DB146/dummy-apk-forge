package M9;

import java.util.List;
import java.util.Map;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;

/* loaded from: classes2.dex */
public final class q implements InterfaceC1394e, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f6896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6897b;

    public /* synthetic */ q(t tVar, d dVar) {
        this.f6896a = tVar;
        this.f6897b = dVar;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.l.e(it, "it");
        d dVar = this.f6897b;
        String message = X.c.h(dVar.f6851b, " Success");
        t t5 = this.f6896a;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        t5.h().remove(dVar.f6851b);
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.l.e(it, "it");
        if (!it.isEmpty()) {
            return new qb.o(it);
        }
        t tVar = this.f6896a;
        Map g = tVar.g();
        d dVar = this.f6897b;
        g.remove(dVar.f6851b);
        tVar.h().remove(dVar.f6851b);
        return tVar.f(dVar);
    }
}
