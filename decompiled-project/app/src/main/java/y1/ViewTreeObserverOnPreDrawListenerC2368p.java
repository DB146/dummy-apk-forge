package y1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: y1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2368p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f26727a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f26728b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f26729c;

    public ViewTreeObserverOnPreDrawListenerC2368p(View view, Runnable runnable) {
        this.f26727a = view;
        this.f26728b = view.getViewTreeObserver();
        this.f26729c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC2368p viewTreeObserverOnPreDrawListenerC2368p = new ViewTreeObserverOnPreDrawListenerC2368p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2368p);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2368p);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f26728b.isAlive();
        View view = this.f26727a;
        if (isAlive) {
            this.f26728b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f26729c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f26728b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f26728b.isAlive();
        View view2 = this.f26727a;
        if (isAlive) {
            this.f26728b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
