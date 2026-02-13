package c2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public d f14140a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14141b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f14140a.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f14140a.f14139b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f14140a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f14141b) {
            this.f14141b = true;
            this.f14140a = new d(this.f14140a);
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        mutate();
        if (this.f14140a.f14139b.getAlpha() != i7) {
            this.f14140a.f14139b.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        mutate();
        this.f14140a.f14139b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
