package com.google.android.material.appbar;

import D6.a;
import E6.b;
import H2.C0297k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import h3.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n.MenuC1678l;
import s6.o;
import y1.AbstractC2352B;
import y1.K;
import y6.C2401g;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: n0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f15162n0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: i0, reason: collision with root package name */
    public Integer f15163i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f15164j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f15165k0;

    /* renamed from: l0, reason: collision with root package name */
    public ImageView.ScaleType f15166l0;

    /* renamed from: m0, reason: collision with root package name */
    public Boolean f15167m0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray g = o.g(context2, attributeSet, AbstractC0911a.f14420v, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (g.hasValue(2)) {
            setNavigationIconTint(g.getColor(2, -1));
        }
        this.f15164j0 = g.getBoolean(4, false);
        this.f15165k0 = g.getBoolean(3, false);
        int i7 = g.getInt(1, -1);
        if (i7 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f15162n0;
            if (i7 < scaleTypeArr.length) {
                this.f15166l0 = scaleTypeArr[i7];
            }
        }
        if (g.hasValue(0)) {
            this.f15167m0 = Boolean.valueOf(g.getBoolean(0, false));
        }
        g.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : H.u(background);
        if (valueOf != null) {
            C2401g c2401g = new C2401g();
            c2401g.k(valueOf);
            c2401g.i(context2);
            WeakHashMap weakHashMap = K.f26642a;
            c2401g.j(AbstractC2352B.e(this));
            setBackground(c2401g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f15166l0;
    }

    public Integer getNavigationIconTint() {
        return this.f15163i0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i7) {
        Menu menu = getMenu();
        boolean z8 = menu instanceof MenuC1678l;
        if (z8) {
            ((MenuC1678l) menu).w();
        }
        super.m(i7);
        if (z8) {
            ((MenuC1678l) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2401g) {
            b.A(this, (C2401g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z8, i7, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f15164j0 || this.f15165k0) {
            ArrayList e2 = o.e(this, getTitle());
            boolean isEmpty = e2.isEmpty();
            C0297k c0297k = o.f24182c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(e2, c0297k);
            ArrayList e10 = o.e(this, getSubtitle());
            TextView textView2 = e10.isEmpty() ? null : (TextView) Collections.max(e10, c0297k);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f15164j0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f15165k0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f15167m0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f15166l0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        Drawable background = getBackground();
        if (background instanceof C2401g) {
            ((C2401g) background).j(f4);
        }
    }

    public void setLogoAdjustViewBounds(boolean z8) {
        Boolean bool = this.f15167m0;
        if (bool == null || bool.booleanValue() != z8) {
            this.f15167m0 = Boolean.valueOf(z8);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f15166l0 != scaleType) {
            this.f15166l0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f15163i0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f15163i0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i7) {
        this.f15163i0 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z8) {
        if (this.f15165k0 != z8) {
            this.f15165k0 = z8;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z8) {
        if (this.f15164j0 != z8) {
            this.f15164j0 = z8;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i7 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i7;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i7, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i7 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i7, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i7, textView.getTop(), i10, textView.getBottom());
    }
}
