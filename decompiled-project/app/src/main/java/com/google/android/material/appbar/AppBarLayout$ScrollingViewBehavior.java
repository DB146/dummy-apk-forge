package com.google.android.material.appbar;

import O5.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.AbstractC0911a;
import e6.AbstractC1096a;
import i1.AbstractC1291b;
import i1.e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1096a {

    /* renamed from: b, reason: collision with root package name */
    public final int f15161b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14422x);
        this.f15161b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
        }
    }

    @Override // i1.AbstractC1291b
    public final void f(View view) {
    }

    @Override // i1.AbstractC1291b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1291b abstractC1291b = ((e) view2.getLayoutParams()).f18189a;
        if (abstractC1291b instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC1291b).getClass();
            int i7 = this.f15161b;
            int j = bottom - (i7 == 0 ? 0 : b.j((int) (0.0f * i7), 0, i7));
            WeakHashMap weakHashMap = K.f26642a;
            view.offsetTopAndBottom(j);
        }
        return false;
    }

    @Override // i1.AbstractC1291b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        int i12 = view.getLayoutParams().height;
        if (i12 != -1 && i12 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override // i1.AbstractC1291b
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // e6.AbstractC1096a
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i7) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i7);
    }
}
