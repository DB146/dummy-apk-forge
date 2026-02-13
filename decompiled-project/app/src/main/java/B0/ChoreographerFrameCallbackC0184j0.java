package B0;

import android.view.Choreographer;
import cc.C0944m;

/* renamed from: B0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0184j0 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0944m f1921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f1922b;

    public ChoreographerFrameCallbackC0184j0(C0944m c0944m, C0186k0 c0186k0, Rb.c cVar) {
        this.f1921a = c0944m;
        this.f1922b = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object n6;
        try {
            n6 = this.f1922b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            n6 = com.bumptech.glide.c.n(th);
        }
        this.f1921a.resumeWith(n6);
    }
}
