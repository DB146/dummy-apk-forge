package androidx.work.rxjava3;

import Ab.e;
import Tb.a;
import W3.f;
import a1.l;
import android.content.Context;
import androidx.work.WorkerParameters;
import fb.C1151e;
import gb.o;
import gb.p;
import h3.y;
import java.util.concurrent.ExecutorService;
import n4.b;
import vb.v;

/* loaded from: classes.dex */
public abstract class RxWorker extends y {

    /* renamed from: e, reason: collision with root package name */
    public static final f f13762e = new f(4);

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // h3.y
    public final l a() {
        return a.q(new b(6, this, p.b(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"))));
    }

    @Override // h3.y
    public final l b() {
        return a.q(new b(6, this, c()));
    }

    public abstract p c();

    public o d() {
        ExecutorService executorService = this.f17719b.f13735c;
        v vVar = e.f1559a;
        return new C1151e(executorService, 1);
    }
}
