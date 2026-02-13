package cc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: cc.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0943l0 extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0943l0(InterfaceC0937i0 interfaceC0937i0) {
        super(true);
        boolean z8 = true;
        G(interfaceC0937i0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w0.f14586b;
        InterfaceC0950p interfaceC0950p = (InterfaceC0950p) atomicReferenceFieldUpdater.get(this);
        C0951q c0951q = interfaceC0950p instanceof C0951q ? (C0951q) interfaceC0950p : null;
        if (c0951q != null) {
            w0 k = c0951q.k();
            while (!k.z()) {
                InterfaceC0950p interfaceC0950p2 = (InterfaceC0950p) atomicReferenceFieldUpdater.get(k);
                C0951q c0951q2 = interfaceC0950p2 instanceof C0951q ? (C0951q) interfaceC0950p2 : null;
                if (c0951q2 != null) {
                    k = c0951q2.k();
                }
            }
            this.f14547c = z8;
        }
        z8 = false;
        this.f14547c = z8;
    }

    @Override // cc.w0
    public final boolean A() {
        return true;
    }

    @Override // cc.w0
    public final boolean z() {
        return this.f14547c;
    }
}
