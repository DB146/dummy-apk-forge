package tb;

import ea.C1112g;
import gb.p;
import gb.q;
import ha.g;
import hb.InterfaceC1269b;
import ib.C1360b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class d extends AtomicReference implements q, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24531a;

    /* renamed from: b, reason: collision with root package name */
    public final q f24532b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f24533c;

    public /* synthetic */ d(q qVar, InterfaceC1394e interfaceC1394e, int i7) {
        this.f24531a = i7;
        this.f24532b = qVar;
        this.f24533c = interfaceC1394e;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f24531a) {
            case 0:
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f24531a) {
            case 0:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    this.f24532b.c(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.j(this, interfaceC1269b)) {
                    this.f24532b.c(this);
                    return;
                }
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f24531a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.q
    public final void onError(Throwable th) {
        switch (this.f24531a) {
            case 0:
                this.f24532b.onError(th);
                return;
            default:
                q qVar = this.f24532b;
                try {
                    Object apply = this.f24533c.apply(th);
                    Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                    ((p) apply).d(new C1112g(7, this, qVar));
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    qVar.onError(new C1360b(th, th2));
                    return;
                }
        }
    }

    @Override // gb.q
    public final void onSuccess(Object obj) {
        switch (this.f24531a) {
            case 0:
                q qVar = this.f24532b;
                try {
                    Object apply = this.f24533c.apply(obj);
                    Objects.requireNonNull(apply, "The single returned by the mapper is null");
                    p pVar = (p) apply;
                    if (g()) {
                        return;
                    }
                    pVar.d(new g(11, this, qVar));
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    qVar.onError(th);
                    return;
                }
            default:
                this.f24532b.onSuccess(obj);
                return;
        }
    }
}
