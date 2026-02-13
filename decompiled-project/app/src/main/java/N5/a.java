package N5;

import C3.RunnableC0235a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f7206a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f7207b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f7206a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7207b.newThread(new RunnableC0235a(runnable, 1));
        newThread.setName(this.f7206a);
        return newThread;
    }
}
