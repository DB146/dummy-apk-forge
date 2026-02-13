package com.google.android.material.behavior;

import I1.c;
import R7.a;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g6.C1199a;
import i1.AbstractC1291b;
import java.util.WeakHashMap;
import y1.K;
import z1.d;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1291b {

    /* renamed from: a, reason: collision with root package name */
    public c f15175a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15176b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15177c;

    /* renamed from: d, reason: collision with root package name */
    public int f15178d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f15179e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f15180f = 0.5f;
    public final C1199a g = new C1199a(this);

    @Override // i1.AbstractC1291b
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8 = this.f15176b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z8 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f15176b = z8;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f15176b = false;
        }
        if (!z8) {
            return false;
        }
        if (this.f15175a == null) {
            this.f15175a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return !this.f15177c && this.f15175a.p(motionEvent);
    }

    @Override // i1.AbstractC1291b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        WeakHashMap weakHashMap = K.f26642a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            K.k(view, 1048576);
            K.h(view, 0);
            if (v(view)) {
                K.l(view, d.f28163l, new a(this, 27));
            }
        }
        return false;
    }

    @Override // i1.AbstractC1291b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f15175a == null) {
            return false;
        }
        if (this.f15177c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f15175a.j(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}
