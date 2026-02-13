package nc;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21354a = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
