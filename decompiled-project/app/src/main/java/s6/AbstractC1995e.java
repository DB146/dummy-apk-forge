package s6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import c6.AbstractC0911a;
import o.AbstractC1756r0;

/* renamed from: s6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1995e extends AbstractC1756r0 {

    /* renamed from: D, reason: collision with root package name */
    public Drawable f24160D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f24161E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f24162F;

    /* renamed from: G, reason: collision with root package name */
    public int f24163G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f24164H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f24165I;

    public AbstractC1995e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24161E = new Rect();
        this.f24162F = new Rect();
        this.f24163G = 119;
        this.f24164H = true;
        this.f24165I = false;
        int[] iArr = AbstractC0911a.k;
        o.a(context, attributeSet, 0, 0);
        o.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f24163G = obtainStyledAttributes.getInt(1, this.f24163G);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24164H = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24160D;
        if (drawable != null) {
            if (this.f24165I) {
                this.f24165I = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z8 = this.f24164H;
                Rect rect = this.f24161E;
                if (z8) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i7 = this.f24163G;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f24162F;
                Gravity.apply(i7, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f4, float f10) {
        super.drawableHotspotChanged(f4, f10);
        Drawable drawable = this.f24160D;
        if (drawable != null) {
            drawable.setHotspot(f4, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24160D;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f24160D.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f24160D;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f24163G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24160D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // o.AbstractC1756r0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        this.f24165I = z8 | this.f24165I;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f24165I = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f24160D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f24160D);
            }
            this.f24160D = drawable;
            this.f24165I = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24163G == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i7) {
        if (this.f24163G != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f24163G = i7;
            if (i7 == 119 && this.f24160D != null) {
                this.f24160D.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24160D;
    }
}
