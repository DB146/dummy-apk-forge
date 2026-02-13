package C3;

import java.util.concurrent.ThreadFactory;

/* renamed from: C3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0236b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2510a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2510a) {
            case 0:
                return new Thread(new RunnableC0235a(runnable, 0), "glide-active-resources");
            default:
                return new v1.i(runnable);
        }
    }
}
