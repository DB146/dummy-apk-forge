package h3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1241c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f17678a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17679b;

    public ThreadFactoryC1241c(boolean z8) {
        this.f17679b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.l.e(runnable, "runnable");
        StringBuilder m10 = X.c.m(this.f17679b ? "WM.task-" : "androidx.work-");
        m10.append(this.f17678a.incrementAndGet());
        return new Thread(runnable, m10.toString());
    }
}
