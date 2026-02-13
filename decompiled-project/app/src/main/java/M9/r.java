package M9;

import java.io.BufferedReader;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import y.S;

/* loaded from: classes2.dex */
public final class r implements InterfaceC1393d, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f6898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6899b;

    public /* synthetic */ r(t tVar, d dVar) {
        this.f6898a = tVar;
        this.f6899b = dVar;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        kotlin.jvm.internal.l.e(it, "it");
        d dVar = this.f6899b;
        String message = S.b("Offline ", dVar.f6851b, " source error");
        t t5 = this.f6898a;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        t5.h().remove(dVar.f6851b);
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        BufferedReader it = (BufferedReader) obj;
        kotlin.jvm.internal.l.e(it, "it");
        t tVar = this.f6898a;
        tVar.getClass();
        d dVar = this.f6899b;
        gb.i j = new qb.m(new e(it, dVar, tVar), 2).q(Ab.e.f1561c).j(new p(tVar, dVar, 2), com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        tVar.g().put(dVar.f6851b, o.f6888a);
        return new sb.g(j, h.f6868v, 1);
    }
}
