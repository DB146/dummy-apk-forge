package A9;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public abstract class H1 extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public Drawable getForegroundCompat() {
        return getForeground();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
    }

    public void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}
