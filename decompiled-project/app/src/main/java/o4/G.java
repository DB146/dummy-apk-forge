package o4;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f21692a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f21692a.post(runnable);
    }
}
