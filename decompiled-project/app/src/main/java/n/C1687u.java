package n;

import android.widget.PopupWindow;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687u implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1688v f21008a;

    public C1687u(C1688v c1688v) {
        this.f21008a = c1688v;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21008a.c();
    }
}
