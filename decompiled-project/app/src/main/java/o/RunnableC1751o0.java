package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1751o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC1753p0 f21559b;

    public /* synthetic */ RunnableC1751o0(AbstractViewOnTouchListenerC1753p0 abstractViewOnTouchListenerC1753p0, int i7) {
        this.f21558a = i7;
        this.f21559b = abstractViewOnTouchListenerC1753p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21558a) {
            case 0:
                ViewParent parent = this.f21559b.f21567d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractViewOnTouchListenerC1753p0 abstractViewOnTouchListenerC1753p0 = this.f21559b;
                abstractViewOnTouchListenerC1753p0.a();
                View view = abstractViewOnTouchListenerC1753p0.f21567d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1753p0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC1753p0.f21570u = true;
                    return;
                }
                return;
        }
    }
}
