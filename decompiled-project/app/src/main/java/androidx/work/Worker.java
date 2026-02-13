package androidx.work;

import Tb.a;
import android.content.Context;
import h3.J;
import h3.w;
import h3.y;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class Worker extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        l.e(context, "context");
        l.e(workerParams, "workerParams");
    }

    @Override // h3.y
    public final a1.l a() {
        ExecutorService backgroundExecutor = this.f17719b.f13735c;
        l.d(backgroundExecutor, "backgroundExecutor");
        return a.q(new F8.a(backgroundExecutor, new J(this, 0)));
    }

    @Override // h3.y
    public final a1.l b() {
        ExecutorService backgroundExecutor = this.f17719b.f13735c;
        l.d(backgroundExecutor, "backgroundExecutor");
        return a.q(new F8.a(backgroundExecutor, new J(this, 1)));
    }

    public abstract w c();
}
