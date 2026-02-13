package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import m.C1521c;

/* loaded from: classes.dex */
public final class t extends ContentFrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f18094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, C1521c c1521c) {
        super(c1521c, null);
        this.f18094w = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f18094w.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x2 < -5 || y10 < -5 || x2 > getWidth() + 5 || y10 > getHeight() + 5) {
                v vVar = this.f18094w;
                vVar.r(vVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(Q5.e.x(getContext(), i7));
    }
}
