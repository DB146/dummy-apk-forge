package t;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2013a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f24401a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f24402b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f24403c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f24404d;

    /* renamed from: e, reason: collision with root package name */
    public float f24405e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f24407h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f24408i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24406f = false;
    public boolean g = true;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public C2013a(ColorStateList colorStateList, float f4) {
        this.f24401a = f4;
        Paint paint = new Paint(5);
        this.f24402b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f24407h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f24407h.getDefaultColor()));
        this.f24403c = new RectF();
        this.f24404d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f24403c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f24404d;
        rect2.set(rect);
        if (this.f24406f) {
            rect2.inset((int) Math.ceil(AbstractC2014b.a(this.f24405e, this.f24401a, this.g)), (int) Math.ceil(AbstractC2014b.b(this.f24405e, this.f24401a, this.g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        Paint paint = this.f24402b;
        if (this.f24408i == null || paint.getColorFilter() != null) {
            z8 = false;
        } else {
            paint.setColorFilter(this.f24408i);
            z8 = true;
        }
        RectF rectF = this.f24403c;
        float f4 = this.f24401a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (z8) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f24404d, this.f24401a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f24407h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f24407h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f24402b;
        boolean z8 = colorForState != paint.getColor();
        if (z8) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z8;
        }
        this.f24408i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f24402b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24402b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f24408i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f24408i = a(this.j, mode);
        invalidateSelf();
    }
}
