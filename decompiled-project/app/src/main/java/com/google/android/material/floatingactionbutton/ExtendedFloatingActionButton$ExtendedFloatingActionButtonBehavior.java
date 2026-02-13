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
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC1291b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14408h);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // i1.AbstractC1291b
    public final /* synthetic */ boolean e(View view) {
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
