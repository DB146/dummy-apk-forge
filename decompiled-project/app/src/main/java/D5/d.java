package D5;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import r2.C1916a;
import s2.RunnableC1971a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public C1916a f3241a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3242b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3243c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3244d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3245e = false;

    /* renamed from: f, reason: collision with root package name */
    public Executor f3246f;
    public volatile RunnableC1971a g;

    /* renamed from: h, reason: collision with root package name */
    public volatile RunnableC1971a f3247h;

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f3248i;
    public final Set j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f3248i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z8 = this.f3242b;
            if (!z8) {
                if (z8) {
                    c();
                } else {
                    this.f3245e = true;
                }
            }
            if (this.f3247h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            RunnableC1971a runnableC1971a = this.g;
            runnableC1971a.f24025c.set(true);
            if (runnableC1971a.f24023a.cancel(false)) {
                this.f3247h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.f3247h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f3246f == null) {
            this.f3246f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        RunnableC1971a runnableC1971a = this.g;
        Executor executor = this.f3246f;
        if (runnableC1971a.f24024b == 1) {
            runnableC1971a.f24024b = 2;
            executor.execute(runnableC1971a.f24023a);
            return;
        }
        int b2 = P.c.b(runnableC1971a.f24024b);
        if (b2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (b2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.g = new RunnableC1971a(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f3248i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
