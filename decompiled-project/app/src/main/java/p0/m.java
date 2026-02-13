package p0;

import A0.C0005a;
import l0.InterfaceC1445d;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public C0005a f23013a;

    public abstract void a(InterfaceC1445d interfaceC1445d);

    public Rb.c b() {
        return this.f23013a;
    }

    public final void c() {
        Rb.c b2 = b();
        if (b2 != null) {
            b2.invoke(this);
        }
    }

    public void d(C0005a c0005a) {
        this.f23013a = c0005a;
    }
}
