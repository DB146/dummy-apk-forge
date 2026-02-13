package com.google.android.material.behavior;

import A9.C0076d1;
import Tb.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import h3.o;
import i1.AbstractC1291b;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1291b {

    /* renamed from: b, reason: collision with root package name */
    public int f15169b;

    /* renamed from: c, reason: collision with root package name */
    public int f15170c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f15171d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f15172e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f15174h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f15168a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f15173f = 0;
    public int g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // i1.AbstractC1291b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        this.f15173f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f15169b = a.D(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f15170c = a.D(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f15171d = a.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16534d);
        this.f15172e = a.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16533c);
        return false;
    }

    @Override // i1.AbstractC1291b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f15168a;
        if (i7 > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f15174h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw o.j(it);
            }
            this.f15174h = view.animate().translationY(this.f15173f).setInterpolator(this.f15172e).setDuration(this.f15170c).setListener(new C0076d1(this, 6));
            return;
        }
        if (i7 >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f15174h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw o.j(it2);
        }
        this.f15174h = view.animate().translationY(0).setInterpolator(this.f15171d).setDuration(this.f15169b).setListener(new C0076d1(this, 6));
    }

    @Override // i1.AbstractC1291b
    public boolean s(View view, int i7, int i10) {
        return i7 == 2;
    }
}
