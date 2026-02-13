package com.google.android.material.bottomsheet;

import A9.C0076d1;
import A9.O;
import J1.h;
import R7.c;
import Tb.a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.C0857a;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import e3.C1078c;
import h3.o;
import i1.AbstractC1291b;
import i1.e;
import i6.d;
import i6.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import t6.b;
import t6.f;
import y1.AbstractC2352B;
import y1.AbstractC2377z;
import y1.C2353a;
import y1.C2354b;
import y1.K;
import y6.C2400f;
import y6.C2401g;
import y6.C2404j;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1291b implements b {

    /* renamed from: A, reason: collision with root package name */
    public final c f15181A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f15182B;

    /* renamed from: C, reason: collision with root package name */
    public final int f15183C;

    /* renamed from: D, reason: collision with root package name */
    public int f15184D;

    /* renamed from: E, reason: collision with root package name */
    public int f15185E;

    /* renamed from: F, reason: collision with root package name */
    public final float f15186F;

    /* renamed from: G, reason: collision with root package name */
    public int f15187G;

    /* renamed from: H, reason: collision with root package name */
    public final float f15188H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15189I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f15190J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f15191K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public I1.c f15192M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f15193N;

    /* renamed from: O, reason: collision with root package name */
    public int f15194O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f15195P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f15196Q;

    /* renamed from: R, reason: collision with root package name */
    public int f15197R;

    /* renamed from: S, reason: collision with root package name */
    public int f15198S;

    /* renamed from: T, reason: collision with root package name */
    public int f15199T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f15200U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f15201V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f15202W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f15203X;

    /* renamed from: Y, reason: collision with root package name */
    public f f15204Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f15205Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f15206a;

    /* renamed from: a0, reason: collision with root package name */
    public int f15207a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15208b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f15209b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f15210c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f15211c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f15212d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f15213d0;

    /* renamed from: e, reason: collision with root package name */
    public int f15214e;

    /* renamed from: e0, reason: collision with root package name */
    public final i6.c f15215e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15216f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15217h;

    /* renamed from: i, reason: collision with root package name */
    public final C2401g f15218i;
    public final ColorStateList j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15219l;

    /* renamed from: m, reason: collision with root package name */
    public int f15220m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15221n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f15222o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15223p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15224q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f15225r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f15226s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f15227t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15228u;

    /* renamed from: v, reason: collision with root package name */
    public int f15229v;

    /* renamed from: w, reason: collision with root package name */
    public int f15230w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15231x;

    /* renamed from: y, reason: collision with root package name */
    public final C2404j f15232y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f15233z;

    public BottomSheetBehavior() {
        this.f15206a = 0;
        this.f15208b = true;
        this.k = -1;
        this.f15219l = -1;
        this.f15181A = new c(this);
        this.f15186F = 0.5f;
        this.f15188H = -1.0f;
        this.f15191K = true;
        this.L = 4;
        this.f15196Q = 0.1f;
        this.f15202W = new ArrayList();
        this.f15207a0 = -1;
        this.f15213d0 = new SparseIntArray();
        this.f15215e0 = new i6.c(this, 0);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i7;
        this.f15206a = 0;
        this.f15208b = true;
        this.k = -1;
        this.f15219l = -1;
        this.f15181A = new c(this);
        this.f15186F = 0.5f;
        this.f15188H = -1.0f;
        this.f15191K = true;
        this.L = 4;
        this.f15196Q = 0.1f;
        this.f15202W = new ArrayList();
        this.f15207a0 = -1;
        this.f15213d0 = new SparseIntArray();
        this.f15215e0 = new i6.c(this, 0);
        this.f15217h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14403b);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = a.n(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f15232y = C2404j.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).c();
        }
        C2404j c2404j = this.f15232y;
        if (c2404j != null) {
            C2401g c2401g = new C2401g(c2404j);
            this.f15218i = c2401g;
            c2401g.i(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.f15218i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f15218i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.f15182B = ofFloat;
        ofFloat.setDuration(500L);
        this.f15182B.addUpdateListener(new B6.c(this, 6));
        this.f15188H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f15219l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i7 = peekValue.data) != -1) {
            H(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            H(i7);
        }
        G(obtainStyledAttributes.getBoolean(8, false));
        this.f15221n = obtainStyledAttributes.getBoolean(13, false);
        boolean z8 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f15208b != z8) {
            this.f15208b = z8;
            if (this.f15200U != null) {
                v();
            }
            J((this.f15208b && this.L == 6) ? 3 : this.L);
            N(this.L, true);
            M();
        }
        this.f15190J = obtainStyledAttributes.getBoolean(12, false);
        this.f15191K = obtainStyledAttributes.getBoolean(4, true);
        this.f15206a = obtainStyledAttributes.getInt(10, 0);
        float f4 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f4 <= 0.0f || f4 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f15186F = f4;
        if (this.f15200U != null) {
            this.f15185E = (int) ((1.0f - f4) * this.f15199T);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f15183C = dimensionPixelOffset;
            N(this.L, true);
        } else {
            int i10 = peekValue2.data;
            if (i10 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f15183C = i10;
            N(this.L, true);
        }
        this.f15212d = obtainStyledAttributes.getInt(11, 500);
        this.f15222o = obtainStyledAttributes.getBoolean(17, false);
        this.f15223p = obtainStyledAttributes.getBoolean(18, false);
        this.f15224q = obtainStyledAttributes.getBoolean(19, false);
        this.f15225r = obtainStyledAttributes.getBoolean(20, true);
        this.f15226s = obtainStyledAttributes.getBoolean(14, false);
        this.f15227t = obtainStyledAttributes.getBoolean(15, false);
        this.f15228u = obtainStyledAttributes.getBoolean(16, false);
        this.f15231x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f15210c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC1291b abstractC1291b = ((e) layoutParams).f18189a;
        if (abstractC1291b instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC1291b;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i7, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = K.f26642a;
        if (AbstractC2352B.h(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View z8 = z(viewGroup.getChildAt(i7));
                if (z8 != null) {
                    return z8;
                }
            }
        }
        return null;
    }

    public final int C() {
        if (this.f15208b) {
            return this.f15184D;
        }
        return Math.max(this.f15183C, this.f15225r ? 0 : this.f15230w);
    }

    public final int D(int i7) {
        if (i7 == 3) {
            return C();
        }
        if (i7 == 4) {
            return this.f15187G;
        }
        if (i7 == 5) {
            return this.f15199T;
        }
        if (i7 == 6) {
            return this.f15185E;
        }
        throw new IllegalArgumentException(o.l(i7, "Invalid state to get top offset: "));
    }

    public final boolean E() {
        WeakReference weakReference = this.f15200U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f15200U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void F() {
        this.f15205Z = -1;
        this.f15207a0 = -1;
        VelocityTracker velocityTracker = this.f15203X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15203X = null;
        }
    }

    public final void G(boolean z8) {
        if (this.f15189I != z8) {
            this.f15189I = z8;
            if (!z8 && this.L == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i7) {
        if (i7 == -1) {
            if (this.f15216f) {
                return;
            } else {
                this.f15216f = true;
            }
        } else {
            if (!this.f15216f && this.f15214e == i7) {
                return;
            }
            this.f15216f = false;
            this.f15214e = Math.max(0, i7);
        }
        P();
    }

    public final void I(int i7) {
        if (i7 == 1 || i7 == 2) {
            throw new IllegalArgumentException(o.p(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f15189I && i7 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i7);
            return;
        }
        int i10 = (i7 == 6 && this.f15208b && D(i7) <= this.f15184D) ? 3 : i7;
        WeakReference weakReference = this.f15200U;
        if (weakReference == null || weakReference.get() == null) {
            J(i7);
            return;
        }
        View view = (View) this.f15200U.get();
        i6.b bVar = new i6.b(this, view, i10);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = K.f26642a;
            if (view.isAttachedToWindow()) {
                view.post(bVar);
                return;
            }
        }
        bVar.run();
    }

    public final void J(int i7) {
        View view;
        if (this.L == i7) {
            return;
        }
        this.L = i7;
        if (i7 != 4 && i7 != 3 && i7 != 6) {
            boolean z8 = this.f15189I;
        }
        WeakReference weakReference = this.f15200U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i10 = 0;
        if (i7 == 3) {
            O(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            O(false);
        }
        N(i7, true);
        while (true) {
            ArrayList arrayList = this.f15202W;
            if (i10 >= arrayList.size()) {
                M();
                return;
            } else {
                ((d) arrayList.get(i10)).c(view, i7);
                i10++;
            }
        }
    }

    public final boolean K(View view, float f4) {
        if (this.f15190J) {
            return true;
        }
        if (view.getTop() < this.f15187G) {
            return false;
        }
        return Math.abs(((f4 * this.f15196Q) + ((float) view.getTop())) - ((float) this.f15187G)) / ((float) x()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        J(2);
        N(r4, true);
        r2.f15181A.m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(View view, int i7, boolean z8) {
        int D10 = D(i7);
        I1.c cVar = this.f15192M;
        if (cVar != null) {
            if (!z8) {
                int left = view.getLeft();
                cVar.f4996r = view;
                cVar.f4984c = -1;
                boolean h10 = cVar.h(left, D10, 0, 0);
                if (!h10 && cVar.f4982a == 0 && cVar.f4996r != null) {
                    cVar.f4996r = null;
                }
            }
        }
        J(i7);
    }

    public final void M() {
        View view;
        int i7;
        WeakReference weakReference = this.f15200U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        K.k(view, 524288);
        K.h(view, 0);
        K.k(view, 262144);
        K.h(view, 0);
        K.k(view, 1048576);
        K.h(view, 0);
        SparseIntArray sparseIntArray = this.f15213d0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            K.k(view, i10);
            K.h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f15208b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            A7.a aVar = new A7.a(this, 6);
            ArrayList f4 = K.f(view);
            int i11 = 0;
            while (true) {
                if (i11 >= f4.size()) {
                    int i12 = -1;
                    for (int i13 = 0; i13 < 32 && i12 == -1; i13++) {
                        int i14 = K.f26645d[i13];
                        boolean z8 = true;
                        for (int i15 = 0; i15 < f4.size(); i15++) {
                            z8 &= ((z1.d) f4.get(i15)).a() != i14;
                        }
                        if (z8) {
                            i12 = i14;
                        }
                    }
                    i7 = i12;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((z1.d) f4.get(i11)).f28168a).getLabel())) {
                        i7 = ((z1.d) f4.get(i11)).a();
                        break;
                    }
                    i11++;
                }
            }
            if (i7 != -1) {
                z1.d dVar = new z1.d(null, i7, string, aVar, null);
                View.AccessibilityDelegate d10 = K.d(view);
                C2354b c2354b = d10 == null ? null : d10 instanceof C2353a ? ((C2353a) d10).f26677a : new C2354b(d10);
                if (c2354b == null) {
                    c2354b = new C2354b();
                }
                K.n(view, c2354b);
                K.k(view, dVar.a());
                K.f(view).add(dVar);
                K.h(view, 0);
            }
            sparseIntArray.put(0, i7);
        }
        if (this.f15189I && this.L != 5) {
            K.l(view, z1.d.f28163l, new A7.a(this, 5));
        }
        int i16 = this.L;
        if (i16 == 3) {
            K.l(view, z1.d.k, new A7.a(this, this.f15208b ? 4 : 6));
            return;
        }
        if (i16 == 4) {
            K.l(view, z1.d.j, new A7.a(this, this.f15208b ? 3 : 6));
        } else {
            if (i16 != 6) {
                return;
            }
            K.l(view, z1.d.k, new A7.a(this, 4));
            K.l(view, z1.d.j, new A7.a(this, 3));
        }
    }

    public final void N(int i7, boolean z8) {
        C2401g c2401g = this.f15218i;
        ValueAnimator valueAnimator = this.f15182B;
        if (i7 == 2) {
            return;
        }
        boolean z10 = this.L == 3 && (this.f15231x || E());
        if (this.f15233z == z10 || c2401g == null) {
            return;
        }
        this.f15233z = z10;
        if (z8 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c2401g.f27035a.f27018i, z10 ? w() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float w10 = this.f15233z ? w() : 1.0f;
        C2400f c2400f = c2401g.f27035a;
        if (c2400f.f27018i != w10) {
            c2400f.f27018i = w10;
            c2401g.f27039e = true;
            c2401g.invalidateSelf();
        }
    }

    public final void O(boolean z8) {
        WeakReference weakReference = this.f15200U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                if (this.f15211c0 != null) {
                    return;
                } else {
                    this.f15211c0 = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f15200U.get() && z8) {
                    this.f15211c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z8) {
                return;
            }
            this.f15211c0 = null;
        }
    }

    public final void P() {
        View view;
        if (this.f15200U != null) {
            v();
            if (this.L != 4 || (view = (View) this.f15200U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // t6.b
    public final void a() {
        f fVar = this.f15204Y;
        if (fVar == null) {
            return;
        }
        C0857a c0857a = fVar.f24497f;
        fVar.f24497f = null;
        if (c0857a == null || Build.VERSION.SDK_INT < 34) {
            I(this.f15189I ? 5 : 4);
            return;
        }
        boolean z8 = this.f15189I;
        int i7 = fVar.f24495d;
        int i10 = fVar.f24494c;
        float f4 = c0857a.f14018c;
        if (!z8) {
            AnimatorSet a9 = fVar.a();
            a9.setDuration(AbstractC1053a.c(f4, i10, i7));
            a9.start();
            I(4);
            return;
        }
        C0076d1 c0076d1 = new C0076d1(this, 7);
        View view = fVar.f24493b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new Z1.a(1));
        ofFloat.setDuration(AbstractC1053a.c(f4, i10, i7));
        ofFloat.addListener(new C0076d1(fVar, 9));
        ofFloat.addListener(c0076d1);
        ofFloat.start();
    }

    @Override // t6.b
    public final void b(C0857a c0857a) {
        f fVar = this.f15204Y;
        if (fVar == null) {
            return;
        }
        if (fVar.f24497f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0857a c0857a2 = fVar.f24497f;
        fVar.f24497f = c0857a;
        if (c0857a2 == null) {
            return;
        }
        fVar.b(c0857a.f14018c);
    }

    @Override // t6.b
    public final void c(C0857a c0857a) {
        f fVar = this.f15204Y;
        if (fVar == null) {
            return;
        }
        fVar.f24497f = c0857a;
    }

    @Override // t6.b
    public final void d() {
        f fVar = this.f15204Y;
        if (fVar == null) {
            return;
        }
        if (fVar.f24497f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0857a c0857a = fVar.f24497f;
        fVar.f24497f = null;
        if (c0857a == null) {
            return;
        }
        AnimatorSet a9 = fVar.a();
        a9.setDuration(fVar.f24496e);
        a9.start();
    }

    @Override // i1.AbstractC1291b
    public final void g(e eVar) {
        this.f15200U = null;
        this.f15192M = null;
        this.f15204Y = null;
    }

    @Override // i1.AbstractC1291b
    public final void i() {
        this.f15200U = null;
        this.f15192M = null;
        this.f15204Y = null;
    }

    @Override // i1.AbstractC1291b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i7;
        I1.c cVar;
        if (!view.isShown() || !this.f15191K) {
            this.f15193N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            F();
        }
        if (this.f15203X == null) {
            this.f15203X = VelocityTracker.obtain();
        }
        this.f15203X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f15207a0 = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.f15201V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f15207a0)) {
                    this.f15205Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f15209b0 = true;
                }
            }
            this.f15193N = this.f15205Z == -1 && !coordinatorLayout.o(view, x2, this.f15207a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f15209b0 = false;
            this.f15205Z = -1;
            if (this.f15193N) {
                this.f15193N = false;
                return false;
            }
        }
        if (!this.f15193N && (cVar = this.f15192M) != null && cVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f15201V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f15193N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f15192M == null || (i7 = this.f15207a0) == -1 || Math.abs(((float) i7) - motionEvent.getY()) <= ((float) this.f15192M.f4983b)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [E3.h, java.lang.Object] */
    @Override // i1.AbstractC1291b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i7) {
        int i10 = this.f15219l;
        C2401g c2401g = this.f15218i;
        int i11 = 1;
        WeakHashMap weakHashMap = K.f26642a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.f15200U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z8 = (Build.VERSION.SDK_INT < 29 || this.f15221n || this.f15216f) ? false : true;
            if (this.f15222o || this.f15223p || this.f15224q || this.f15226s || this.f15227t || this.f15228u || z8) {
                O o10 = new O(this, z8);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.f3537a = paddingStart;
                obj.f3538b = paddingEnd;
                obj.f3539c = paddingBottom;
                AbstractC2352B.l(view, new C1078c(o10, obj));
                if (view.isAttachedToWindow()) {
                    AbstractC2377z.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new h(i11));
                }
            }
            K.p(view, new j(view));
            this.f15200U = new WeakReference(view);
            this.f15204Y = new f(view);
            if (c2401g != null) {
                view.setBackground(c2401g);
                float f4 = this.f15188H;
                if (f4 == -1.0f) {
                    f4 = AbstractC2352B.e(view);
                }
                c2401g.j(f4);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    AbstractC2352B.i(view, colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f15192M == null) {
            this.f15192M = new I1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f15215e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i7);
        this.f15198S = coordinatorLayout.getWidth();
        this.f15199T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f15197R = height;
        int i13 = this.f15199T;
        int i14 = i13 - height;
        int i15 = this.f15230w;
        if (i14 < i15) {
            if (this.f15225r) {
                if (i10 != -1) {
                    i13 = Math.min(i13, i10);
                }
                this.f15197R = i13;
            } else {
                int i16 = i13 - i15;
                if (i10 != -1) {
                    i16 = Math.min(i16, i10);
                }
                this.f15197R = i16;
            }
        }
        this.f15184D = Math.max(0, this.f15199T - this.f15197R);
        this.f15185E = (int) ((1.0f - this.f15186F) * this.f15199T);
        v();
        int i17 = this.L;
        if (i17 == 3) {
            view.offsetTopAndBottom(C());
        } else if (i17 == 6) {
            view.offsetTopAndBottom(this.f15185E);
        } else if (this.f15189I && i17 == 5) {
            view.offsetTopAndBottom(this.f15199T);
        } else if (i17 == 4) {
            view.offsetTopAndBottom(this.f15187G);
        } else if (i17 == 1 || i17 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        N(this.L, false);
        this.f15201V = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.f15202W;
            if (i12 >= arrayList.size()) {
                return true;
            }
            ((d) arrayList.get(i12)).a(view);
            i12++;
        }
    }

    @Override // i1.AbstractC1291b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.k, marginLayoutParams.width), B(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f15219l, marginLayoutParams.height));
        return true;
    }

    @Override // i1.AbstractC1291b
    public final boolean m(View view) {
        WeakReference weakReference = this.f15201V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // i1.AbstractC1291b
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10, int[] iArr, int i11) {
        boolean z8 = this.f15191K;
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.f15201V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        if (i10 > 0) {
            if (i12 < C()) {
                int C2 = top - C();
                iArr[1] = C2;
                WeakHashMap weakHashMap = K.f26642a;
                view.offsetTopAndBottom(-C2);
                J(3);
            } else {
                if (!z8) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap2 = K.f26642a;
                view.offsetTopAndBottom(-i10);
                J(1);
            }
        } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
            int i13 = this.f15187G;
            if (i12 > i13 && !this.f15189I) {
                int i14 = top - i13;
                iArr[1] = i14;
                WeakHashMap weakHashMap3 = K.f26642a;
                view.offsetTopAndBottom(-i14);
                J(4);
            } else {
                if (!z8) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap4 = K.f26642a;
                view.offsetTopAndBottom(-i10);
                J(1);
            }
        }
        y(view.getTop());
        this.f15194O = i10;
        this.f15195P = true;
    }

    @Override // i1.AbstractC1291b
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
    }

    @Override // i1.AbstractC1291b
    public final void q(View view, Parcelable parcelable) {
        i6.e eVar = (i6.e) parcelable;
        int i7 = this.f15206a;
        if (i7 != 0) {
            if (i7 == -1 || (i7 & 1) == 1) {
                this.f15214e = eVar.f18439d;
            }
            if (i7 == -1 || (i7 & 2) == 2) {
                this.f15208b = eVar.f18440e;
            }
            if (i7 == -1 || (i7 & 4) == 4) {
                this.f15189I = eVar.f18441f;
            }
            if (i7 == -1 || (i7 & 8) == 8) {
                this.f15190J = eVar.f18442u;
            }
        }
        int i10 = eVar.f18438c;
        if (i10 == 1 || i10 == 2) {
            this.L = 4;
        } else {
            this.L = i10;
        }
    }

    @Override // i1.AbstractC1291b
    public final Parcelable r(View view) {
        return new i6.e(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // i1.AbstractC1291b
    public final boolean s(View view, int i7, int i10) {
        this.f15194O = 0;
        this.f15195P = false;
        return (i7 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f15185E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f15184D) < java.lang.Math.abs(r5 - r3.f15187G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f15187G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f15187G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f15185E) < java.lang.Math.abs(r5 - r3.f15187G)) goto L50;
     */
    @Override // i1.AbstractC1291b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, View view2, int i7) {
        float yVelocity;
        int i10 = 3;
        if (view.getTop() == C()) {
            J(3);
            return;
        }
        WeakReference weakReference = this.f15201V;
        if (weakReference != null && view2 == weakReference.get() && this.f15195P) {
            if (this.f15194O > 0) {
                if (!this.f15208b) {
                }
                L(view, i10, false);
                this.f15195P = false;
            }
            if (this.f15189I) {
                VelocityTracker velocityTracker = this.f15203X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f15210c);
                    yVelocity = this.f15203X.getYVelocity(this.f15205Z);
                }
                if (K(view, yVelocity)) {
                    i10 = 5;
                    L(view, i10, false);
                    this.f15195P = false;
                }
            }
            if (this.f15194O == 0) {
                int top = view.getTop();
                if (!this.f15208b) {
                    int i11 = this.f15185E;
                    if (top < i11) {
                    }
                    i10 = 6;
                }
            } else {
                if (!this.f15208b) {
                    int top2 = view.getTop();
                }
                i10 = 4;
            }
            L(view, i10, false);
            this.f15195P = false;
        }
    }

    @Override // i1.AbstractC1291b
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.L;
        if (i7 == 1 && actionMasked == 0) {
            return true;
        }
        I1.c cVar = this.f15192M;
        if (cVar != null && (this.f15191K || i7 == 1)) {
            cVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            F();
        }
        if (this.f15203X == null) {
            this.f15203X = VelocityTracker.obtain();
        }
        this.f15203X.addMovement(motionEvent);
        if (this.f15192M != null && ((this.f15191K || this.L == 1) && actionMasked == 2 && !this.f15193N)) {
            float abs = Math.abs(this.f15207a0 - motionEvent.getY());
            I1.c cVar2 = this.f15192M;
            if (abs > cVar2.f4983b) {
                cVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f15193N;
    }

    public final void v() {
        int x2 = x();
        if (this.f15208b) {
            this.f15187G = Math.max(this.f15199T - x2, this.f15184D);
        } else {
            this.f15187G = this.f15199T - x2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float w() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f4;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f10 = 0.0f;
        if (this.f15218i != null && (weakReference = this.f15200U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f15200U.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C2401g c2401g = this.f15218i;
                float a9 = c2401g.f27035a.f27011a.f27052e.a(c2401g.g());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f11 = radius2;
                    if (f11 > 0.0f && a9 > 0.0f) {
                        f4 = f11 / a9;
                        C2401g c2401g2 = this.f15218i;
                        float a10 = c2401g2.f27035a.f27011a.f27053f.a(c2401g2.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f12 = radius;
                            if (f12 > 0.0f && a10 > 0.0f) {
                                f10 = f12 / a10;
                            }
                        }
                        return Math.max(f4, f10);
                    }
                }
                f4 = 0.0f;
                C2401g c2401g22 = this.f15218i;
                float a102 = c2401g22.f27035a.f27011a.f27053f.a(c2401g22.g());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f4, f10);
            }
        }
        return 0.0f;
    }

    public final int x() {
        int i7;
        return this.f15216f ? Math.min(Math.max(this.g, this.f15199T - ((this.f15198S * 9) / 16)), this.f15197R) + this.f15229v : (this.f15221n || this.f15222o || (i7 = this.f15220m) <= 0) ? this.f15214e + this.f15229v : Math.max(this.f15214e, i7 + this.f15217h);
    }

    public final void y(int i7) {
        View view = (View) this.f15200U.get();
        if (view != null) {
            ArrayList arrayList = this.f15202W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.f15187G;
            if (i7 <= i10 && i10 != C()) {
                C();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).b(view);
            }
        }
    }
}
