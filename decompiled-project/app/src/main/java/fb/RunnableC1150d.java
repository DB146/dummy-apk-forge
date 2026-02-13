package fb;

import android.os.Handler;
import hb.InterfaceC1269b;

/* renamed from: fb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1150d implements Runnable, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f17039a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f17040b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f17041c;

    public RunnableC1150d(Handler handler, Runnable runnable) {
        this.f17039a = handler;
        this.f17040b = runnable;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f17039a.removeCallbacks(this);
        this.f17041c = true;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f17041c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17040b.run();
        } catch (Throwable th) {
            com.bumptech.glide.d.t(th);
        }
    }
}
