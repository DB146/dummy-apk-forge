package o6;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1809a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f22052a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22053b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22054c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22055d;

    public ViewOnTouchListenerC1809a(Dialog dialog, Rect rect) {
        this.f22052a = dialog;
        this.f22053b = rect.left;
        this.f22054c = rect.top;
        this.f22055d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f22053b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f22054c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i7 = this.f22055d;
            obtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f22052a.onTouchEvent(obtain);
    }
}
