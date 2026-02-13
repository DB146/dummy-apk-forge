package rb;

import gb.l;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import sb.C2003B;
import xb.C2273a;

/* renamed from: rb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1955b extends AtomicReference implements gb.b, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23910a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f23911b;

    public C1955b(C1956c c1956c) {
        this.f23911b = c1956c;
    }

    public C1955b(C2003B c2003b) {
        this.f23911b = c2003b;
    }

    @Override // gb.b
    public final void a() {
        switch (this.f23910a) {
            case 0:
                C1956c c1956c = (C1956c) this.f23911b;
                c1956c.f23919v = false;
                c1956c.d();
                return;
            default:
                C2003B c2003b = (C2003B) this.f23911b;
                EnumC1437b.a(c2003b.f24237f);
                if (c2003b.getAndIncrement() == 0) {
                    c2003b.f24234c.f(c2003b.f24232a);
                    return;
                }
                return;
        }
    }

    @Override // gb.b, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23910a) {
            case 0:
                EnumC1437b.f(this, interfaceC1269b);
                return;
            default:
                EnumC1437b.j(this, interfaceC1269b);
                return;
        }
    }

    @Override // gb.l
    public void e(Object obj) {
        ((C2003B) this.f23911b).d();
    }

    @Override // gb.b, gb.q
    public final void onError(Throwable th) {
        switch (this.f23910a) {
            case 0:
                C1956c c1956c = (C1956c) this.f23911b;
                if (c1956c.f23914c.b(th)) {
                    if (c1956c.f23920w != 3) {
                        c1956c.f23916e.b();
                    }
                    c1956c.f23919v = false;
                    c1956c.d();
                    return;
                }
                return;
            default:
                C2003B c2003b = (C2003B) this.f23911b;
                EnumC1437b.a(c2003b.f24237f);
                C2273a c2273a = c2003b.f24234c;
                if (c2273a.b(th) && c2003b.getAndIncrement() == 0) {
                    c2273a.f(c2003b.f24232a);
                    return;
                }
                return;
        }
    }
}
