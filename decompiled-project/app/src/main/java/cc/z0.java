package cc;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class z0 extends Hb.a implements InterfaceC0937i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f14594b = new Hb.a(B.f14467b);

    @Override // cc.InterfaceC0937i0
    public final InterfaceC0950p attachChild(r rVar) {
        return A0.f14465a;
    }

    @Override // cc.InterfaceC0937i0
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // cc.InterfaceC0937i0
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // cc.InterfaceC0937i0
    public final Zb.g getChildren() {
        return Zb.d.f12339a;
    }

    @Override // cc.InterfaceC0937i0
    public final InterfaceC0937i0 getParent() {
        return null;
    }

    @Override // cc.InterfaceC0937i0
    public final S invokeOnCompletion(Rb.c cVar) {
        return A0.f14465a;
    }

    @Override // cc.InterfaceC0937i0
    public final S invokeOnCompletion(boolean z8, boolean z10, Rb.c cVar) {
        return A0.f14465a;
    }

    @Override // cc.InterfaceC0937i0
    public final boolean isActive() {
        return true;
    }

    @Override // cc.InterfaceC0937i0
    public final boolean isCancelled() {
        return false;
    }

    @Override // cc.InterfaceC0937i0
    public final Object join(Hb.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // cc.InterfaceC0937i0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
