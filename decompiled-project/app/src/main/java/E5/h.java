package E5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f3686b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f3687c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3688a;

    public /* synthetic */ h(int i7) {
        this.f3688a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3688a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
