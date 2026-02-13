package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i1.AbstractC1291b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y1.K;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC1291b {
    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // i1.AbstractC1291b
    public abstract void f(View view);

    @Override // i1.AbstractC1291b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        WeakHashMap weakHashMap = K.f26642a;
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            for (int i10 = 0; i10 < size; i10++) {
                f(view);
            }
        }
        return false;
    }
}
