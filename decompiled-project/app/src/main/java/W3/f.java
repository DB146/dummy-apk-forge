package W3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f10603b = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10604a;

    public /* synthetic */ f(int i7) {
        this.f10604a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10604a) {
            case 0:
                o.f().post(runnable);
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                new Thread(runnable).start();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
