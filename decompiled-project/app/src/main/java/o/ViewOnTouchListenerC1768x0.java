package o;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: o.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1768x0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1770y0 f21618a;

    public ViewOnTouchListenerC1768x0(C1770y0 c1770y0) {
        this.f21618a = c1770y0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1765w c1765w;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        C1770y0 c1770y0 = this.f21618a;
        if (action == 0 && (c1765w = c1770y0.f21637N) != null && c1765w.isShowing() && x2 >= 0 && x2 < c1770y0.f21637N.getWidth() && y10 >= 0 && y10 < c1770y0.f21637N.getHeight()) {
            c1770y0.f21634J.postDelayed(c1770y0.f21630F, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c1770y0.f21634J.removeCallbacks(c1770y0.f21630F);
        return false;
    }
}
