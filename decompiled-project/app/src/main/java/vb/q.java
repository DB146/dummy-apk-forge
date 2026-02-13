package vb;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class q extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f25422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25423b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25424c;

    public q(String str) {
        this(str, 5, false);
    }

    public q(String str, int i7, boolean z8) {
        this.f25422a = str;
        this.f25423b = i7;
        this.f25424c = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f25422a + '-' + incrementAndGet();
        Thread aVar = this.f25424c ? new F3.a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f25423b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return h3.o.p(new StringBuilder("RxThreadFactory["), this.f25422a, "]");
    }
}
