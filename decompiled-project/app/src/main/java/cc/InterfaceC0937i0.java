package cc;

import java.util.concurrent.CancellationException;

/* renamed from: cc.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0937i0 extends Hb.g {
    InterfaceC0950p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    Zb.g getChildren();

    InterfaceC0937i0 getParent();

    S invokeOnCompletion(Rb.c cVar);

    S invokeOnCompletion(boolean z8, boolean z10, Rb.c cVar);

    boolean isActive();

    boolean isCancelled();

    Object join(Hb.d dVar);

    boolean start();
}
