package sb;

import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import rb.C1956c;

/* renamed from: sb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2008b extends AtomicReference implements gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24252a;

    /* renamed from: b, reason: collision with root package name */
    public final C1956c f24253b;

    public C2008b(gb.l lVar, C1956c c1956c) {
        this.f24252a = lVar;
        this.f24253b = c1956c;
    }

    @Override // gb.l
    public final void a() {
        C1956c c1956c = this.f24253b;
        c1956c.f23917f = false;
        c1956c.d();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        EnumC1437b.f(this, interfaceC1269b);
    }

    @Override // gb.l
    public final void e(Object obj) {
        this.f24252a.e(obj);
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        C1956c c1956c = this.f24253b;
        if (c1956c.f23914c.b(th)) {
            c1956c.f23916e.b();
            c1956c.f23917f = false;
            c1956c.d();
        }
    }
}
