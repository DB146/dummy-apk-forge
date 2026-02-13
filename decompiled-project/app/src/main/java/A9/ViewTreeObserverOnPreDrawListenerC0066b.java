package A9;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: A9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC0066b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0070c f1057a;

    public ViewTreeObserverOnPreDrawListenerC0066b(C0070c c0070c) {
        this.f1057a = c0070c;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0070c c0070c = this.f1057a;
        int visibility = c0070c.f1074c.getVisibility();
        View view = c0070c.f1271a;
        TextView textView = c0070c.f1073b;
        if (visibility == 0 && c0070c.f1074c.getTop() > view.getHeight() && textView.getLineCount() > 1) {
            textView.setMaxLines(textView.getLineCount() - 1);
            return false;
        }
        int i7 = textView.getLineCount() > 1 ? c0070c.k : c0070c.j;
        TextView textView2 = c0070c.f1075d;
        if (textView2.getMaxLines() != i7) {
            textView2.setMaxLines(i7);
            return false;
        }
        if (c0070c.f1084p != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(c0070c.f1084p);
            c0070c.f1084p = null;
        }
        return true;
    }
}
