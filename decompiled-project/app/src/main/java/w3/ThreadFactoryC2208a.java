package w3;

import java.util.concurrent.ThreadFactory;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2208a implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
