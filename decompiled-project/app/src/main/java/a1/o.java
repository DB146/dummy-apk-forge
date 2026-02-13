package a1;

import cc.C0944m;
import i3.AbstractC1341C;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12480a;

    /* renamed from: b, reason: collision with root package name */
    public final R6.a f12481b;

    /* renamed from: c, reason: collision with root package name */
    public final C0944m f12482c;

    public /* synthetic */ o(R6.a aVar, C0944m c0944m, int i7) {
        this.f12480a = i7;
        this.f12481b = aVar;
        this.f12482c = c0944m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12480a) {
            case 0:
                R6.a aVar = this.f12481b;
                boolean isCancelled = aVar.isCancelled();
                C0944m c0944m = this.f12482c;
                if (isCancelled) {
                    c0944m.d(null);
                    return;
                }
                try {
                    c0944m.resumeWith(AbstractC0707h.j(aVar));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause != null) {
                        c0944m.resumeWith(com.bumptech.glide.c.n(cause));
                        return;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException();
                        kotlin.jvm.internal.l.i(nullPointerException, kotlin.jvm.internal.l.class.getName());
                        throw nullPointerException;
                    }
                }
            default:
                R6.a aVar2 = this.f12481b;
                boolean isCancelled2 = aVar2.isCancelled();
                C0944m c0944m2 = this.f12482c;
                if (isCancelled2) {
                    c0944m2.d(null);
                    return;
                }
                try {
                    c0944m2.resumeWith(AbstractC1341C.b(aVar2));
                    return;
                } catch (ExecutionException e10) {
                    Throwable cause2 = e10.getCause();
                    kotlin.jvm.internal.l.b(cause2);
                    c0944m2.resumeWith(com.bumptech.glide.c.n(cause2));
                    return;
                }
        }
    }
}
