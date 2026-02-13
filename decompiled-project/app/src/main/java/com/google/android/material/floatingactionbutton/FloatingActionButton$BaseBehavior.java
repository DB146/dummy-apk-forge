package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.AbstractC0911a;
import i1.AbstractC1291b;
import i1.e;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC1291b {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14409i);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // i1.AbstractC1291b
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final void g(e eVar) {
        if (eVar.f18195h == 0) {
            eVar.f18195h = 80;
        }
    }

    @Override // i1.AbstractC1291b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        throw new ClassCastException();
    }
}
