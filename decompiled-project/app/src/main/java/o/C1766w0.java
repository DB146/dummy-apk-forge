package o;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: o.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766w0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1770y0 f21613a;

    public C1766w0(C1770y0 c1770y0) {
        this.f21613a = c1770y0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 == 1) {
            C1770y0 c1770y0 = this.f21613a;
            if (c1770y0.f21637N.getInputMethodMode() == 2 || c1770y0.f21637N.getContentView() == null) {
                return;
            }
            Handler handler = c1770y0.f21634J;
            RunnableC1764v0 runnableC1764v0 = c1770y0.f21630F;
            handler.removeCallbacks(runnableC1764v0);
            runnableC1764v0.run();
        }
    }
}
