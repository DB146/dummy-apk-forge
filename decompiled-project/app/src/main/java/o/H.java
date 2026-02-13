package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import n.ViewTreeObserverOnGlobalLayoutListenerC1670d;

/* loaded from: classes.dex */
public final class H implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1670d f21381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f21382b;

    public H(I i7, ViewTreeObserverOnGlobalLayoutListenerC1670d viewTreeObserverOnGlobalLayoutListenerC1670d) {
        this.f21382b = i7;
        this.f21381a = viewTreeObserverOnGlobalLayoutListenerC1670d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f21382b.f21394U.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f21381a);
        }
    }
}
