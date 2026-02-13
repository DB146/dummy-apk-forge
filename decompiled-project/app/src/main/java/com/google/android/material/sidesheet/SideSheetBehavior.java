package com.google.android.material.sidesheet;

import A9.C0076d1;
import L7.j;
import R7.c;
import Tb.a;
import Z9.x;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.C0857a;
import c6.AbstractC0911a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import h3.o;
import i1.AbstractC1291b;
import i1.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m4.C1593w;
import m4.RunnableC1559b;
import t6.b;
import t6.g;
import t6.h;
import y1.AbstractC2352B;
import y1.K;
import y6.C2395a;
import y6.C2401g;
import y6.C2404j;
import z1.d;
import z6.C2598a;
import z6.C2600c;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1291b implements b {

    /* renamed from: a, reason: collision with root package name */
    public x f15418a;

    /* renamed from: b, reason: collision with root package name */
    public final C2401g f15419b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f15420c;

    /* renamed from: d, reason: collision with root package name */
    public final C2404j f15421d;

    /* renamed from: e, reason: collision with root package name */
    public final c f15422e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15423f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f15424h;

    /* renamed from: i, reason: collision with root package name */
    public I1.c f15425i;
    public boolean j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public int f15426l;

    /* renamed from: m, reason: collision with root package name */
    public int f15427m;

    /* renamed from: n, reason: collision with root package name */
    public int f15428n;

    /* renamed from: o, reason: collision with root package name */
    public int f15429o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f15430p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f15431q;

    /* renamed from: r, reason: collision with root package name */
    public final int f15432r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f15433s;

    /* renamed from: t, reason: collision with root package name */
    public h f15434t;

    /* renamed from: u, reason: collision with root package name */
    public int f15435u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f15436v;

    /* renamed from: w, reason: collision with root package name */
    public final i6.c f15437w;

    public SideSheetBehavior() {
        this.f15422e = new c(this);
        this.g = true;
        this.f15424h = 5;
        this.k = 0.1f;
        this.f15432r = -1;
        this.f15436v = new LinkedHashSet();
        this.f15437w = new i6.c(this, 1);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f15422e = new c(this);
        this.g = true;
        this.f15424h = 5;
        this.k = 0.1f;
        this.f15432r = -1;
        this.f15436v = new LinkedHashSet();
        this.f15437w = new i6.c(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14394A);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f15420c = a.n(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f15421d = C2404j.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).c();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f15432r = resourceId;
            WeakReference weakReference = this.f15431q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f15431q = null;
            WeakReference weakReference2 = this.f15430p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = K.f26642a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C2404j c2404j = this.f15421d;
        if (c2404j != null) {
            C2401g c2401g = new C2401g(c2404j);
            this.f15419b = c2401g;
            c2401g.i(context);
            ColorStateList colorStateList = this.f15420c;
            if (colorStateList != null) {
                this.f15419b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f15419b.setTint(typedValue.data);
            }
        }
        this.f15423f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // t6.b
    public final void a() {
        int i7;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f15434t;
        if (hVar == null) {
            return;
        }
        C0857a c0857a = hVar.f24497f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hVar.f24497f = null;
        int i10 = 5;
        if (c0857a == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        x xVar = this.f15418a;
        if (xVar != null && xVar.w() != 0) {
            i10 = 3;
        }
        C0076d1 c0076d1 = new C0076d1(this, 11);
        WeakReference weakReference = this.f15431q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int n6 = this.f15418a.n(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: z6.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f15418a.X(marginLayoutParams, AbstractC1053a.c(valueAnimator.getAnimatedFraction(), n6, 0));
                    view.requestLayout();
                }
            };
        }
        boolean z8 = c0857a.f14019d == 0;
        WeakHashMap weakHashMap = K.f26642a;
        View view2 = hVar.f24493b;
        boolean z10 = (Gravity.getAbsoluteGravity(i10, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i7 = z10 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i7 = 0;
        }
        float f4 = scaleX + i7;
        Property property = View.TRANSLATION_X;
        if (z10) {
            f4 = -f4;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f4);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new Z1.a(1));
        ofFloat.setDuration(AbstractC1053a.c(c0857a.f14018c, hVar.f24494c, hVar.f24495d));
        ofFloat.addListener(new g(hVar, z8, i10));
        ofFloat.addListener(c0076d1);
        ofFloat.start();
    }

    @Override // t6.b
    public final void b(C0857a c0857a) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        h hVar = this.f15434t;
        if (hVar == null) {
            return;
        }
        x xVar = this.f15418a;
        int i7 = 5;
        if (xVar != null && xVar.w() != 0) {
            i7 = 3;
        }
        if (hVar.f24497f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0857a c0857a2 = hVar.f24497f;
        hVar.f24497f = c0857a;
        if (c0857a2 != null) {
            hVar.a(c0857a.f14018c, c0857a.f14019d == 0, i7);
        }
        WeakReference weakReference = this.f15430p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f15430p.get();
        WeakReference weakReference2 = this.f15431q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f15418a.X(marginLayoutParams, (int) ((view.getScaleX() * this.f15426l) + this.f15429o));
        view2.requestLayout();
    }

    @Override // t6.b
    public final void c(C0857a c0857a) {
        h hVar = this.f15434t;
        if (hVar == null) {
            return;
        }
        hVar.f24497f = c0857a;
    }

    @Override // t6.b
    public final void d() {
        h hVar = this.f15434t;
        if (hVar == null) {
            return;
        }
        if (hVar.f24497f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0857a c0857a = hVar.f24497f;
        hVar.f24497f = null;
        if (c0857a == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = hVar.f24493b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(hVar.f24496e);
        animatorSet.start();
    }

    @Override // i1.AbstractC1291b
    public final void g(e eVar) {
        this.f15430p = null;
        this.f15425i = null;
        this.f15434t = null;
    }

    @Override // i1.AbstractC1291b
    public final void i() {
        this.f15430p = null;
        this.f15425i = null;
        this.f15434t = null;
    }

    @Override // i1.AbstractC1291b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        I1.c cVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && K.e(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f15433s) != null) {
            velocityTracker.recycle();
            this.f15433s = null;
        }
        if (this.f15433s == null) {
            this.f15433s = VelocityTracker.obtain();
        }
        this.f15433s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f15435u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (cVar = this.f15425i) == null || !cVar.p(motionEvent)) ? false : true;
    }

    @Override // i1.AbstractC1291b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        View view2;
        View view3;
        int i10;
        View findViewById;
        int i11 = 0;
        int i12 = 1;
        C2401g c2401g = this.f15419b;
        WeakHashMap weakHashMap = K.f26642a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f15430p == null) {
            this.f15430p = new WeakReference(view);
            this.f15434t = new h(view);
            if (c2401g != null) {
                view.setBackground(c2401g);
                float f4 = this.f15423f;
                if (f4 == -1.0f) {
                    f4 = AbstractC2352B.e(view);
                }
                c2401g.j(f4);
            } else {
                ColorStateList colorStateList = this.f15420c;
                if (colorStateList != null) {
                    AbstractC2352B.i(view, colorStateList);
                }
            }
            int i13 = this.f15424h == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (K.e(view) == null) {
                K.o(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i14 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f18191c, i7) == 3 ? 1 : 0;
        x xVar = this.f15418a;
        if (xVar == null || xVar.w() != i14) {
            C2404j c2404j = this.f15421d;
            e eVar = null;
            if (i14 == 0) {
                this.f15418a = new C2598a(this, i12);
                if (c2404j != null) {
                    WeakReference weakReference = this.f15430p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j e2 = c2404j.e();
                        e2.g = new C2395a(0.0f);
                        e2.f6361h = new C2395a(0.0f);
                        C2404j c10 = e2.c();
                        if (c2401g != null) {
                            c2401g.setShapeAppearanceModel(c10);
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalArgumentException(A3.c.f(i14, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f15418a = new C2598a(this, i11);
                if (c2404j != null) {
                    WeakReference weakReference2 = this.f15430p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j e10 = c2404j.e();
                        e10.f6360f = new C2395a(0.0f);
                        e10.f6362i = new C2395a(0.0f);
                        C2404j c11 = e10.c();
                        if (c2401g != null) {
                            c2401g.setShapeAppearanceModel(c11);
                        }
                    }
                }
            }
        }
        if (this.f15425i == null) {
            this.f15425i = new I1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f15437w);
        }
        int t5 = this.f15418a.t(view);
        coordinatorLayout.q(view, i7);
        this.f15427m = coordinatorLayout.getWidth();
        this.f15428n = this.f15418a.u(coordinatorLayout);
        this.f15426l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f15429o = marginLayoutParams != null ? this.f15418a.d(marginLayoutParams) : 0;
        int i15 = this.f15424h;
        if (i15 == 1 || i15 == 2) {
            i11 = t5 - this.f15418a.t(view);
        } else if (i15 != 3) {
            if (i15 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f15424h);
            }
            i11 = this.f15418a.q();
        }
        view.offsetLeftAndRight(i11);
        if (this.f15431q == null && (i10 = this.f15432r) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f15431q = new WeakReference(findViewById);
        }
        Iterator it = this.f15436v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // i1.AbstractC1291b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // i1.AbstractC1291b
    public final void q(View view, Parcelable parcelable) {
        int i7 = ((C2600c) parcelable).f28332c;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.f15424h = i7;
    }

    @Override // i1.AbstractC1291b
    public final Parcelable r(View view) {
        return new C2600c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // i1.AbstractC1291b
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f15424h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.f15425i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f15433s) != null) {
            velocityTracker.recycle();
            this.f15433s = null;
        }
        if (this.f15433s == null) {
            this.f15433s = VelocityTracker.obtain();
        }
        this.f15433s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.j && x()) {
            float abs = Math.abs(this.f15435u - motionEvent.getX());
            I1.c cVar = this.f15425i;
            if (abs > cVar.f4983b) {
                cVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void v(int i7) {
        if (i7 == 1 || i7 == 2) {
            throw new IllegalArgumentException(o.p(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f15430p;
        if (weakReference == null || weakReference.get() == null) {
            w(i7);
            return;
        }
        View view = (View) this.f15430p.get();
        RunnableC1559b runnableC1559b = new RunnableC1559b(this, i7, 3);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = K.f26642a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC1559b);
                return;
            }
        }
        runnableC1559b.run();
    }

    public final void w(int i7) {
        View view;
        if (this.f15424h == i7) {
            return;
        }
        this.f15424h = i7;
        WeakReference weakReference = this.f15430p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = this.f15424h == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
        Iterator it = this.f15436v.iterator();
        if (it.hasNext()) {
            throw o.j(it);
        }
        z();
    }

    public final boolean x() {
        return this.f15425i != null && (this.g || this.f15424h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        w(2);
        r2.f15422e.m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(View view, int i7, boolean z8) {
        int o10;
        if (i7 == 3) {
            o10 = this.f15418a.o();
        } else {
            if (i7 != 5) {
                throw new IllegalArgumentException(o.l(i7, "Invalid state to get outer edge offset: "));
            }
            o10 = this.f15418a.q();
        }
        I1.c cVar = this.f15425i;
        if (cVar != null) {
            if (!z8) {
                int top = view.getTop();
                cVar.f4996r = view;
                cVar.f4984c = -1;
                boolean h10 = cVar.h(o10, top, 0, 0);
                if (!h10 && cVar.f4982a == 0 && cVar.f4996r != null) {
                    cVar.f4996r = null;
                }
            }
        }
        w(i7);
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.f15430p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        K.k(view, 262144);
        K.h(view, 0);
        K.k(view, 1048576);
        K.h(view, 0);
        int i7 = 5;
        if (this.f15424h != 5) {
            K.l(view, d.f28163l, new C1593w(this, i7, 3));
        }
        int i10 = 3;
        if (this.f15424h != 3) {
            K.l(view, d.j, new C1593w(this, i10, 3));
        }
    }
}
