package c;

import A9.S2;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0864h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f14027a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f14028b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f14030d;

    public ViewTreeObserverOnDrawListenerC0864h(AbstractActivityC0867k abstractActivityC0867k) {
        this.f14030d = abstractActivityC0867k;
    }

    public final void a(View view) {
        if (this.f14029c) {
            return;
        }
        this.f14029c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.l.e(runnable, "runnable");
        this.f14028b = runnable;
        View decorView = this.f14030d.getWindow().getDecorView();
        kotlin.jvm.internal.l.d(decorView, "window.decorView");
        if (!this.f14029c) {
            decorView.postOnAnimation(new S2(this, 21));
        } else if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z8;
        Runnable runnable = this.f14028b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f14027a) {
                this.f14029c = false;
                this.f14030d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f14028b = null;
        C0875s c0875s = (C0875s) this.f14030d.f14053u.getValue();
        synchronized (c0875s.f14065b) {
            z8 = c0875s.f14066c;
        }
        if (z8) {
            this.f14029c = false;
            this.f14030d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14030d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
