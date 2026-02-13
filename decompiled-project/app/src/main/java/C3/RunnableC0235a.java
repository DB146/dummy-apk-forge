package C3;

import android.os.Process;

/* renamed from: C3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0235a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2508a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f2509b;

    public /* synthetic */ RunnableC0235a(Runnable runnable, int i7) {
        this.f2508a = i7;
        this.f2509b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2508a) {
            case 0:
                Process.setThreadPriority(10);
                this.f2509b.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f2509b.run();
                return;
            case 2:
                try {
                    this.f2509b.run();
                    return;
                } catch (Exception e2) {
                    android.support.v4.media.session.b.m(e2, "Executor", "Background execution failure.");
                    return;
                }
            default:
                this.f2509b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f2508a) {
            case 3:
                return this.f2509b.toString();
            default:
                return super.toString();
        }
    }
}
