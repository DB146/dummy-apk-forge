package com.google.android.material.snackbar;

import A6.c;
import A6.f;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h8.e;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f15438h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(1);
        this.f15179e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f15180f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f15178d = 0;
        this.f15438h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, i1.AbstractC1291b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f15438h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (f.f529b == null) {
                    f.f529b = new f();
                }
                synchronized (f.f529b.f530a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (f.f529b == null) {
                f.f529b = new f();
            }
            synchronized (f.f529b.f530a) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.f15438h.getClass();
        return view instanceof c;
    }
}
