package Q;

import cc.C0943l0;
import cc.InterfaceC0937i0;

/* loaded from: classes.dex */
public final class x0 implements cc.E, v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0488f f8568d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Hb.i f8569a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f8570b = this;

    /* renamed from: c, reason: collision with root package name */
    public volatile Hb.i f8571c;

    public x0(Hb.i iVar) {
        this.f8569a = iVar;
    }

    public final void a() {
        synchronized (this.f8570b) {
            try {
                Hb.i iVar = this.f8571c;
                if (iVar == null) {
                    this.f8571c = f8568d;
                } else {
                    cc.F.h(iVar, new H(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q.v0
    public final void b() {
    }

    @Override // Q.v0
    public final void c() {
        a();
    }

    @Override // Q.v0
    public final void d() {
        a();
    }

    @Override // cc.E
    public final Hb.i l() {
        Hb.i iVar;
        Hb.i iVar2 = this.f8571c;
        if (iVar2 == null || iVar2 == f8568d) {
            synchronized (this.f8570b) {
                try {
                    iVar = this.f8571c;
                    if (iVar == null) {
                        Hb.i iVar3 = this.f8569a;
                        iVar = iVar3.plus(new C0943l0((InterfaceC0937i0) iVar3.get(cc.B.f14467b))).plus(Hb.j.f4919a);
                    } else if (iVar == f8568d) {
                        Hb.i iVar4 = this.f8569a;
                        C0943l0 c0943l0 = new C0943l0((InterfaceC0937i0) iVar4.get(cc.B.f14467b));
                        c0943l0.q(new H(0));
                        iVar = iVar4.plus(c0943l0).plus(Hb.j.f4919a);
                    }
                    this.f8571c = iVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar2 = iVar;
        }
        kotlin.jvm.internal.l.b(iVar2);
        return iVar2;
    }
}
