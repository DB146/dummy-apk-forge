package J6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class A extends z {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5534u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f5535v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f5536w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, z zVar) {
        super(taskCompletionSource);
        this.f5536w = dVar;
        this.f5534u = taskCompletionSource2;
        this.f5535v = zVar;
    }

    @Override // J6.z
    public final void b() {
        synchronized (this.f5536w.f5549f) {
            try {
                d dVar = this.f5536w;
                TaskCompletionSource taskCompletionSource = this.f5534u;
                dVar.f5548e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q3.s(12, dVar, taskCompletionSource, false));
                if (this.f5536w.f5552l.getAndIncrement() > 0) {
                    this.f5536w.f5545b.b("Already connected to the service.", new Object[0]);
                }
                d.b(this.f5536w, this.f5535v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
