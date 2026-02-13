package cc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class G extends Z implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: x, reason: collision with root package name */
    public static final G f14479x;

    /* renamed from: y, reason: collision with root package name */
    public static final long f14480y;

    /* JADX WARN: Type inference failed for: r0v0, types: [cc.Z, cc.G, cc.a0] */
    static {
        Long l10;
        ?? z8 = new Z();
        f14479x = z8;
        z8.a0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f14480y = timeUnit.toNanos(l10.longValue());
    }

    @Override // cc.Z, cc.K
    public final S K(long j, I0 i02, Hb.i iVar) {
        long j10 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j10 >= 4611686018427387903L) {
            return A0.f14465a;
        }
        long nanoTime = System.nanoTime();
        W w10 = new W(j10 + nanoTime, i02);
        i0(nanoTime, w10);
        return w10;
    }

    @Override // cc.AbstractC0921a0
    public final Thread Z() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // cc.AbstractC0921a0
    public final void e0(long j, X x2) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // cc.Z
    public final void f0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.f0(runnable);
    }

    public final synchronized void j0() {
        int i7 = debugStatus;
        if (i7 == 2 || i7 == 3) {
            debugStatus = 3;
            Z.f14511u.set(this, null);
            Z.f14512v.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean h02;
        G0.f14481a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 == 2 || i7 == 3) {
                    if (h02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long c02 = c0();
                    if (c02 == j) {
                        long nanoTime = System.nanoTime();
                        if (j10 == j) {
                            j10 = f14480y + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            j0();
                            if (h0()) {
                                return;
                            }
                            Z();
                            return;
                        }
                        c02 = h3.H.h(c02, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (c02 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            j0();
                            if (h0()) {
                                return;
                            }
                            Z();
                            return;
                        }
                        LockSupport.parkNanos(this, c02);
                    }
                    j = Long.MAX_VALUE;
                }
            }
        } finally {
            _thread = null;
            j0();
            if (!h0()) {
                Z();
            }
        }
    }

    @Override // cc.Z, cc.AbstractC0921a0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
