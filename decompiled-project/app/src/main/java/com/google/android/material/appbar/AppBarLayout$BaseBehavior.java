package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e6.AbstractC1096a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1096a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15156b;

    /* renamed from: d, reason: collision with root package name */
    public int f15158d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f15160f;

    /* renamed from: c, reason: collision with root package name */
    public int f15157c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f15159e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // i1.AbstractC1291b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f15159e < 0) {
            this.f15159e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f15156b) {
            int i7 = this.f15157c;
            if (i7 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f15158d) > this.f15159e) {
                this.f15158d = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f15160f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f15157c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // e6.AbstractC1096a, i1.AbstractC1291b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10, int[] iArr, int i11) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final void q(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final Parcelable r(View view) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final boolean s(View view, int i7, int i10) {
        throw new ClassCastException();
    }

    @Override // i1.AbstractC1291b
    public final void t(View view, View view2, int i7) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // i1.AbstractC1291b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f15160f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f15160f.computeCurrentVelocity(1000);
                this.f15160f.getYVelocity(this.f15157c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f15157c);
                if (findPointerIndex == -1) {
                    return false;
                }
                this.f15158d = (int) motionEvent.getY(findPointerIndex);
                view.getClass();
                throw new ClassCastException();
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i7 = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f15157c = motionEvent.getPointerId(i7);
                    this.f15158d = (int) (motionEvent.getY(i7) + 0.5f);
                }
                velocityTracker = this.f15160f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return this.f15156b;
            }
        }
        this.f15156b = false;
        this.f15157c = -1;
        VelocityTracker velocityTracker3 = this.f15160f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f15160f = null;
        }
        velocityTracker = this.f15160f;
        if (velocityTracker != null) {
        }
        return this.f15156b;
    }
}
