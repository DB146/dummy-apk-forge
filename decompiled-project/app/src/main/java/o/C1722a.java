package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1722a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f21470a;

    public C1722a(ActionBarContainer actionBarContainer) {
        this.f21470a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f21470a;
        if (actionBarContainer.f12920u) {
            Drawable drawable = actionBarContainer.f12919f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f12917d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f12918e;
        if (drawable3 == null || !actionBarContainer.f12921v) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f21470a;
        if (actionBarContainer.f12920u) {
            if (actionBarContainer.f12919f != null) {
                actionBarContainer.f12917d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f12917d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
