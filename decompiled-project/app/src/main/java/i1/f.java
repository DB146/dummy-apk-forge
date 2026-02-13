package i1;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i2.C1313a;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18202b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f18201a = i7;
        this.f18202b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f18201a) {
            case 0:
                ((CoordinatorLayout) this.f18202b).p(0);
                return true;
            default:
                C1313a c1313a = (C1313a) this.f18202b;
                int visibility = c1313a.f18242c.getVisibility();
                View view = (View) c1313a.f3094a;
                TextView textView = c1313a.f18241b;
                if (visibility == 0 && c1313a.f18242c.getTop() > view.getHeight() && textView.getLineCount() > 1) {
                    textView.setMaxLines(textView.getLineCount() - 1);
                    return false;
                }
                int i7 = textView.getLineCount() > 1 ? c1313a.f18250y : c1313a.f18249x;
                TextView textView2 = c1313a.f18243d;
                if (textView2.getMaxLines() != i7) {
                    textView2.setMaxLines(i7);
                    return false;
                }
                if (c1313a.f18240D != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(c1313a.f18240D);
                    c1313a.f18240D = null;
                }
                return true;
        }
    }
}
