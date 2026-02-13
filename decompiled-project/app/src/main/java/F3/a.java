package F3;

import Y5.C0656w;
import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import rc.C1961e;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4061a = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    public /* synthetic */ a(Runnable runnable, String str) {
        super(runnable, str);
    }

    public /* synthetic */ a(String str) {
        super(str);
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ReentrantLock reentrantLock;
        C1961e d10;
        switch (this.f4061a) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
            case 1:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            case 2:
                break;
            default:
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C1961e.f23957h;
                reentrantLock = C1961e.f23957h;
                reentrantLock.lock();
                try {
                    d10 = C0656w.d();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
            if (d10 == C1961e.f23959l) {
                C1961e.f23959l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (d10 != null) {
                    d10.j();
                }
            }
        }
    }
}
