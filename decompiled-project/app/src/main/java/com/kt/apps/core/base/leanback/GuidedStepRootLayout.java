package com.kt.apps.core.base.leanback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class GuidedStepRootLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15930a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15931b;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15930a = false;
        this.f15931b = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        View focusSearch = super.focusSearch(view, i7);
        if (i7 == 17 || i7 == 66) {
            View view2 = focusSearch;
            while (view2 != null) {
                if (view2 == this) {
                    return focusSearch;
                }
                Object parent = view2.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
            }
            if (getLayoutDirection() != 0 ? i7 != 66 : i7 != 17) {
                if (!this.f15931b) {
                    return view;
                }
            } else if (!this.f15930a) {
                return view;
            }
        }
        return focusSearch;
    }

    public void setFocusOutEnd(boolean z8) {
        this.f15931b = z8;
    }

    public void setFocusOutStart(boolean z8) {
        this.f15930a = z8;
    }
}
