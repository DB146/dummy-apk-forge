package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: o.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721B extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C f21355a;

    public C1721B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        K0.a(getContext(), this);
        C c10 = new C(this);
        this.f21355a = c10;
        c10.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C c10 = this.f21355a;
        Drawable drawable = c10.f21357f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1721B c1721b = c10.f21356e;
        if (drawable.setState(c1721b.getDrawableState())) {
            c1721b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21355a.f21357f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f21355a.g(canvas);
    }
}
