package A9;

import android.view.View;

/* renamed from: A9.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnFocusChangeListenerC0128q1 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View.OnFocusChangeListener f1348a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1349b;

    /* renamed from: c, reason: collision with root package name */
    public C0154x0 f1350c;

    public ViewOnFocusChangeListenerC0128q1(View.OnFocusChangeListener onFocusChangeListener, boolean z8, C0154x0 c0154x0) {
        this.f1348a = onFocusChangeListener;
        this.f1349b = z8;
        this.f1350c = c0154x0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        if (this.f1349b) {
            view = (View) view.getParent();
        }
        C0154x0 c0154x0 = this.f1350c;
        c0154x0.getClass();
        view.setSelected(z8);
        c0154x0.a(view).a(z8, false);
        View.OnFocusChangeListener onFocusChangeListener = this.f1348a;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z8);
        }
    }
}
