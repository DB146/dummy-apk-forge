package r5;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23793a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23794b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f23795c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f23796d = false;

    public c(C1943b c1943b, long j) {
        this.f23793a = new WeakReference(c1943b);
        this.f23794b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1943b c1943b;
        WeakReference weakReference = this.f23793a;
        try {
            if (this.f23795c.await(this.f23794b, TimeUnit.MILLISECONDS) || (c1943b = (C1943b) weakReference.get()) == null) {
                return;
            }
            c1943b.b();
            this.f23796d = true;
        } catch (InterruptedException unused) {
            C1943b c1943b2 = (C1943b) weakReference.get();
            if (c1943b2 != null) {
                c1943b2.b();
                this.f23796d = true;
            }
        }
    }
}
