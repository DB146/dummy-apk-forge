package O7;

import A0.G0;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7489a;

    public c(d dVar) {
        this.f7489a = dVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        ((G0) this.f7489a.f7491b).K(th);
    }
}
