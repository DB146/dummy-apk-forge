package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1724b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f21482b;

    public /* synthetic */ RunnableC1724b(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f21481a = i7;
        this.f21482b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21481a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21482b;
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.f12956K = actionBarOverlayLayout.f12964d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.L);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f21482b;
                actionBarOverlayLayout2.e();
                actionBarOverlayLayout2.f12956K = actionBarOverlayLayout2.f12964d.animate().translationY(-actionBarOverlayLayout2.f12964d.getHeight()).setListener(actionBarOverlayLayout2.L);
                return;
        }
    }
}
