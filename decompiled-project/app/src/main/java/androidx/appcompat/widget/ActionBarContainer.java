package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;
import o.C1722a;
import o.I0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12914a;

    /* renamed from: b, reason: collision with root package name */
    public View f12915b;

    /* renamed from: c, reason: collision with root package name */
    public View f12916c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f12917d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f12918e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f12919f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f12920u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12921v;

    /* renamed from: w, reason: collision with root package name */
    public final int f12922w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1722a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17566a);
        boolean z8 = false;
        this.f12917d = obtainStyledAttributes.getDrawable(0);
        this.f12918e = obtainStyledAttributes.getDrawable(2);
        this.f12922w = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f12920u = true;
            this.f12919f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f12920u ? !(this.f12917d != null || this.f12918e != null) : this.f12919f == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12917d;
        if (drawable != null && drawable.isStateful()) {
            this.f12917d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f12918e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f12918e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f12919f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f12919f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12917d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f12918e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f12919f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f12915b = findViewById(R.id.action_bar);
        this.f12916c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f12914a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        boolean z10 = true;
        if (this.f12920u) {
            Drawable drawable = this.f12919f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f12917d == null) {
                z10 = false;
            } else if (this.f12915b.getVisibility() == 0) {
                this.f12917d.setBounds(this.f12915b.getLeft(), this.f12915b.getTop(), this.f12915b.getRight(), this.f12915b.getBottom());
            } else {
                View view = this.f12916c;
                if (view == null || view.getVisibility() != 0) {
                    this.f12917d.setBounds(0, 0, 0, 0);
                } else {
                    this.f12917d.setBounds(this.f12916c.getLeft(), this.f12916c.getTop(), this.f12916c.getRight(), this.f12916c.getBottom());
                }
            }
            this.f12921v = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f12915b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f12922w) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i10);
        if (this.f12915b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f12917d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f12917d);
        }
        this.f12917d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f12915b;
            if (view != null) {
                this.f12917d.setBounds(view.getLeft(), this.f12915b.getTop(), this.f12915b.getRight(), this.f12915b.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f12920u ? !(this.f12917d != null || this.f12918e != null) : this.f12919f == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f12919f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f12919f);
        }
        this.f12919f = drawable;
        boolean z8 = this.f12920u;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z8 && (drawable2 = this.f12919f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z8 ? !(this.f12917d != null || this.f12918e != null) : this.f12919f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f12918e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f12918e);
        }
        this.f12918e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f12921v && this.f12918e != null) {
                throw null;
            }
        }
        boolean z8 = false;
        if (!this.f12920u ? !(this.f12917d != null || this.f12918e != null) : this.f12919f == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(I0 i02) {
    }

    public void setTransitioning(boolean z8) {
        this.f12914a = z8;
        setDescendantFocusability(z8 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z8 = i7 == 0;
        Drawable drawable = this.f12917d;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f12918e;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f12919f;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f12917d;
        boolean z8 = this.f12920u;
        return (drawable == drawable2 && !z8) || (drawable == this.f12918e && this.f12921v) || ((drawable == this.f12919f && z8) || super.verifyDrawable(drawable));
    }
}
