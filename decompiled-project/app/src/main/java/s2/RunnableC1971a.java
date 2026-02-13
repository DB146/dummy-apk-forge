package s2;

import D5.d;
import L7.q;
import android.os.Handler;
import android.os.Looper;
import hc.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1971a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static Handler f24022f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f24027e;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f24024b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24025c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24026d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final C1972b f24023a = new C1972b(this, new q(this, 4));

    public RunnableC1971a(d dVar) {
        this.f24027e = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (RunnableC1971a.class) {
            try {
                if (f24022f == null) {
                    f24022f = new Handler(Looper.getMainLooper());
                }
                handler = f24022f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new i(11, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24027e.b();
    }
}
