package A6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import s6.o;
import y1.AbstractC2352B;
import y1.AbstractC2377z;
import y1.K;
import y6.C2401g;
import y6.C2404j;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final b f517w = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final C2404j f518a;

    /* renamed from: b, reason: collision with root package name */
    public int f519b;

    /* renamed from: c, reason: collision with root package name */
    public final float f520c;

    /* renamed from: d, reason: collision with root package name */
    public final float f521d;

    /* renamed from: e, reason: collision with root package name */
    public final int f522e;

    /* renamed from: f, reason: collision with root package name */
    public final int f523f;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f524u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f525v;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(D6.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0911a.f14395B);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = K.f26642a;
            AbstractC2352B.k(this, dimensionPixelSize);
        }
        this.f519b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f518a = C2404j.b(context2, attributeSet, 0, 0).c();
        }
        this.f520c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(Tb.a.n(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(o.h(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f521d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f522e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f523f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f517w);
        setFocusable(true);
        if (getBackground() == null) {
            int u3 = q3.f.u(getBackgroundOverlayColorAlpha(), q3.f.p(this, R.attr.colorSurface), q3.f.p(this, R.attr.colorOnSurface));
            C2404j c2404j = this.f518a;
            if (c2404j != null) {
                int i7 = d.f526a;
                C2401g c2401g = new C2401g(c2404j);
                c2401g.k(ColorStateList.valueOf(u3));
                gradientDrawable = c2401g;
            } else {
                Resources resources = getResources();
                int i10 = d.f526a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(u3);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f524u;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = K.f26642a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f521d;
    }

    public int getAnimationMode() {
        return this.f519b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f520c;
    }

    public int getMaxInlineActionWidth() {
        return this.f523f;
    }

    public int getMaxWidth() {
        return this.f522e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2377z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int i11 = this.f522e;
        if (i11 <= 0 || getMeasuredWidth() <= i11) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }

    public void setAnimationMode(int i7) {
        this.f519b = i7;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f524u != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f524u);
            drawable.setTintMode(this.f525v);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f524u = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f525v);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f525v = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f517w);
        super.setOnClickListener(onClickListener);
    }
}
