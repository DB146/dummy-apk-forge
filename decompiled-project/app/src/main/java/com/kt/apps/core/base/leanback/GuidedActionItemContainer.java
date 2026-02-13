package com.kt.apps.core.base.leanback;

import A9.H1;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class GuidedActionItemContainer extends H1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15926a;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                setForegroundCompat(drawable);
            }
            obtainStyledAttributes.recycle();
        }
        this.f15926a = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        if (!this.f15926a) {
            View view2 = view;
            while (view2 != null) {
                if (view2 == this) {
                    View focusSearch = super.focusSearch(view, i7);
                    View view3 = focusSearch;
                    while (view3 != null) {
                        if (view3 == this) {
                            return focusSearch;
                        }
                        Object parent = view3.getParent();
                        if (!(parent instanceof View)) {
                            return null;
                        }
                        view3 = (View) parent;
                    }
                    return null;
                }
                Object parent2 = view2.getParent();
                if (!(parent2 instanceof View)) {
                    break;
                }
                view2 = (View) parent2;
            }
        }
        return super.focusSearch(view, i7);
    }

    public void setFocusOutAllowed(boolean z8) {
        this.f15926a = z8;
    }
}
