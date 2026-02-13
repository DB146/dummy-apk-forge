package v1;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f24958a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f24958a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f24958a);
        super.run();
    }
}
