package E2;

import java.util.concurrent.Executor;
import p.C1843a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3517a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3517a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            default:
                C1843a.a0().f22964c.f22966d.execute(runnable);
                return;
        }
    }
}
