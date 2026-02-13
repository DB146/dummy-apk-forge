package com.google.android.material.carousel;

import A4.c;
import H2.F;
import H2.T;
import H2.Y;
import H2.d0;
import H2.e0;
import R1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import h3.o;
import k6.C1431b;
import k6.C1432c;
import k6.ViewOnLayoutChangeListenerC1430a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends a implements d0 {

    /* renamed from: p, reason: collision with root package name */
    public final d f15261p;

    /* renamed from: q, reason: collision with root package name */
    public c f15262q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f15263r;

    public CarouselLayoutManager() {
        d dVar = new d();
        new C1431b();
        this.f15263r = new ViewOnLayoutChangeListenerC1430a(this, 0);
        this.f15261p = dVar;
        F0();
        Y0(0);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        new C1431b();
        this.f15263r = new ViewOnLayoutChangeListenerC1430a(this, 0);
        this.f15261p = new d();
        F0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0911a.f14404c);
            obtainStyledAttributes.getInt(0, 0);
            F0();
            Y0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void C(Rect rect, View view) {
        super.C(rect, view);
        rect.centerY();
        if (W0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public final int H0(int i7, Y y10, e0 e0Var) {
        if (!W0() || y() == 0 || i7 == 0) {
            return 0;
        }
        y10.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.a
    public final void I0(int i7) {
    }

    @Override // androidx.recyclerview.widget.a
    public final int J0(int i7, Y y10, e0 e0Var) {
        if (!g() || y() == 0 || i7 == 0) {
            return 0;
        }
        y10.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean T() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void T0(RecyclerView recyclerView, int i7) {
        F f4 = new F(this, recyclerView.getContext(), 1);
        f4.f4572a = i7;
        U0(f4);
    }

    public final boolean W0() {
        return this.f15262q.f368b == 0;
    }

    public final boolean X0() {
        return W0() && J() == 1;
    }

    public final void Y0(int i7) {
        C1432c c1432c;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(o.l(i7, "invalid orientation:"));
        }
        d(null);
        c cVar = this.f15262q;
        if (cVar == null || i7 != cVar.f368b) {
            if (i7 == 0) {
                c1432c = new C1432c(this, 1);
            } else {
                if (i7 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1432c = new C1432c(this, 0);
            }
            this.f15262q = c1432c;
            F0();
        }
    }

    @Override // H2.d0
    public final PointF a(int i7) {
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(RecyclerView recyclerView) {
        d dVar = this.f15261p;
        Context context = recyclerView.getContext();
        float f4 = dVar.f8814a;
        if (f4 <= 0.0f) {
            f4 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        dVar.f8814a = f4;
        float f10 = dVar.f8815b;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        dVar.f8815b = f10;
        F0();
        recyclerView.addOnLayoutChangeListener(this.f15263r);
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f15263r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (X0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (X0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View d0(View view, int i7, Y y10, e0 e0Var) {
        char c10;
        if (y() == 0) {
            return null;
        }
        int i10 = this.f15262q.f368b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 17) {
                    if (i10 == 0) {
                    }
                    c10 = 0;
                } else if (i7 != 33) {
                    if (i7 != 66) {
                        if (i7 != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i7);
                        }
                        c10 = 0;
                    } else {
                        if (i10 == 0) {
                        }
                        c10 = 0;
                    }
                }
                if (c10 == 0) {
                    return null;
                }
                if (c10 == 65535) {
                    if (a.O(view) == 0) {
                        return null;
                    }
                    int O10 = a.O(x(0)) - 1;
                    if (O10 < 0 || O10 >= I()) {
                        return x(X0() ? y() - 1 : 0);
                    }
                    this.f15262q.v();
                    throw null;
                }
                if (a.O(view) == I() - 1) {
                    return null;
                }
                int O11 = a.O(x(y() - 1)) + 1;
                if (O11 < 0 || O11 >= I()) {
                    return x(X0() ? 0 : y() - 1);
                }
                this.f15262q.v();
                throw null;
            }
            c10 = 1;
            if (c10 == 0) {
            }
        }
        c10 = 65535;
        if (c10 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (y() > 0) {
            accessibilityEvent.setFromIndex(a.O(x(0)));
            accessibilityEvent.setToIndex(a.O(x(y() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return W0();
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        return !W0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i7, int i10) {
        I();
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(e0 e0Var) {
        y();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(e0 e0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(int i7, int i10) {
        I();
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(e0 e0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(e0 e0Var) {
        y();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(e0 e0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void p0(Y y10, e0 e0Var) {
        if (e0Var.b() > 0) {
            if ((W0() ? this.f13717n : this.f13718o) > 0.0f) {
                X0();
                y10.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        z0(y10);
    }

    @Override // androidx.recyclerview.widget.a
    public final int q(e0 e0Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(e0 e0Var) {
        if (y() == 0) {
            return;
        }
        a.O(x(0));
    }

    @Override // androidx.recyclerview.widget.a
    public final T u() {
        return new T(-2, -2);
    }
}
