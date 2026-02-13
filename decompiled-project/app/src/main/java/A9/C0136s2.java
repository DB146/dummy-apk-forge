package A9;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: A9.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0136s2 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f1366a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f1367b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1368c;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1367b;
        if (drawable != null) {
            if (this.f1368c) {
                this.f1368c = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f1367b.draw(canvas);
        }
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f1367b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f1368c = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        this.f1367b = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
