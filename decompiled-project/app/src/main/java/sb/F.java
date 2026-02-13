package sb;

import Y5.RunnableC0652u;
import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;
import kb.C1436a;
import kb.EnumC1437b;
import vb.C2170d;

/* loaded from: classes2.dex */
public final class F extends AbstractC2007a {

    /* renamed from: b, reason: collision with root package name */
    public final long f24248b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f24249c;

    /* renamed from: d, reason: collision with root package name */
    public final C2170d f24250d;

    public F(gb.i iVar, long j, TimeUnit timeUnit, C2170d c2170d) {
        super(iVar);
        this.f24248b = j;
        this.f24249c = timeUnit;
        this.f24250d = c2170d;
    }

    @Override // gb.i
    public final void p(gb.l lVar) {
        C2005D c2005d = new C2005D(lVar, this.f24248b, this.f24249c, this.f24250d.a());
        lVar.c(c2005d);
        InterfaceC1269b c10 = c2005d.f24245d.c(new RunnableC0652u(0L, c2005d), c2005d.f24243b, c2005d.f24244c);
        C1436a c1436a = c2005d.f24246e;
        c1436a.getClass();
        EnumC1437b.f(c1436a, c10);
        this.f24251a.b(c2005d);
    }
}
