package mc;

import Db.q;
import cc.C0944m;
import cc.InterfaceC0942l;
import cc.N0;
import hc.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: mc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1658c implements InterfaceC0942l, N0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0944m f20839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1659d f20840b;

    public C1658c(C1659d c1659d, C0944m c0944m) {
        this.f20840b = c1659d;
        this.f20839a = c0944m;
    }

    @Override // cc.N0
    public final void a(u uVar, int i7) {
        this.f20839a.a(uVar, i7);
    }

    @Override // cc.InterfaceC0942l
    public final void b(Object obj, Rb.c cVar) {
        q qVar = q.f3365a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1659d.f20841v;
        C1659d c1659d = this.f20840b;
        atomicReferenceFieldUpdater.set(c1659d, null);
        this.f20839a.b(qVar, new C1657b(c1659d, this, 0));
    }

    @Override // cc.InterfaceC0942l
    public final boolean d(Throwable th) {
        return this.f20839a.d(th);
    }

    @Override // cc.InterfaceC0942l
    public final R7.a e(Object obj, Rb.c cVar) {
        C1659d c1659d = this.f20840b;
        C1657b c1657b = new C1657b(c1659d, this, 1);
        R7.a D10 = this.f20839a.D((q) obj, c1657b);
        if (D10 != null) {
            C1659d.f20841v.set(c1659d, null);
        }
        return D10;
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return this.f20839a.f14552e;
    }

    @Override // cc.InterfaceC0942l
    public final void j(Object obj) {
        this.f20839a.j(obj);
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        this.f20839a.resumeWith(obj);
    }
}
