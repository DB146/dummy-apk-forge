package h7;

import Y5.C0662z;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0962c;
import com.google.android.gms.common.internal.G;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C1260f f17861a;

    /* renamed from: b, reason: collision with root package name */
    public final C0662z f17862b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f17863c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f17864d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f17865e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f17866f;

    public k(Context context, C1259e c1259e, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        G.g(context);
        G.g(c1259e);
        C1260f c1260f = new C1260f(c1259e, executor, scheduledExecutorService);
        C0662z c0662z = new C0662z(11);
        this.f17861a = c1260f;
        this.f17862b = c0662z;
        this.f17865e = -1L;
        ComponentCallbacks2C0962c.b((Application) context.getApplicationContext());
        ComponentCallbacks2C0962c.f14977e.a(new j(this, c1260f, c0662z));
    }

    public final boolean a() {
        return this.f17866f && !this.f17863c && this.f17864d > 0 && this.f17865e != -1;
    }
}
