package a1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements R6.a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12476a;

    /* renamed from: b, reason: collision with root package name */
    public final k f12477b = new k(this);

    public l(i iVar) {
        this.f12476a = new WeakReference(iVar);
    }

    @Override // R6.a
    public final void a(Runnable runnable, Executor executor) {
        this.f12477b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        i iVar = (i) this.f12476a.get();
        boolean cancel = this.f12477b.cancel(z8);
        if (cancel && iVar != null) {
            iVar.f12471a = null;
            iVar.f12472b = null;
            iVar.f12473c.t(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12477b.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f12477b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12477b.f12468a instanceof C0700a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12477b.isDone();
    }

    public final String toString() {
        return this.f12477b.toString();
    }
}
