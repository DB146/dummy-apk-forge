package e3;

import B6.k;
import H2.C0297k;
import H2.I;
import W1.B;
import W1.C;
import W1.C0558a;
import W1.U;
import W1.b0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.leanback.tab.LeanbackViewPager;
import h3.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import l2.EnumC1474s;
import y1.AbstractC2352B;
import y1.K;

/* renamed from: e3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1084i extends ViewGroup {

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f16726n0 = {R.attr.layout_gravity};

    /* renamed from: o0, reason: collision with root package name */
    public static final C0297k f16727o0 = new C0297k(12);

    /* renamed from: p0, reason: collision with root package name */
    public static final I f16728p0 = new I(2);

    /* renamed from: A, reason: collision with root package name */
    public int f16729A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f16730B;

    /* renamed from: C, reason: collision with root package name */
    public int f16731C;

    /* renamed from: D, reason: collision with root package name */
    public int f16732D;

    /* renamed from: E, reason: collision with root package name */
    public float f16733E;

    /* renamed from: F, reason: collision with root package name */
    public float f16734F;

    /* renamed from: G, reason: collision with root package name */
    public int f16735G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f16736H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f16737I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f16738J;

    /* renamed from: K, reason: collision with root package name */
    public int f16739K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f16740M;

    /* renamed from: N, reason: collision with root package name */
    public final int f16741N;

    /* renamed from: O, reason: collision with root package name */
    public int f16742O;

    /* renamed from: P, reason: collision with root package name */
    public final int f16743P;

    /* renamed from: Q, reason: collision with root package name */
    public float f16744Q;

    /* renamed from: R, reason: collision with root package name */
    public float f16745R;

    /* renamed from: S, reason: collision with root package name */
    public float f16746S;

    /* renamed from: T, reason: collision with root package name */
    public float f16747T;

    /* renamed from: U, reason: collision with root package name */
    public int f16748U;

    /* renamed from: V, reason: collision with root package name */
    public VelocityTracker f16749V;

    /* renamed from: W, reason: collision with root package name */
    public final int f16750W;

    /* renamed from: a, reason: collision with root package name */
    public int f16751a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f16752a0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16753b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f16754b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1080e f16755c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f16756c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16757d;

    /* renamed from: d0, reason: collision with root package name */
    public final EdgeEffect f16758d0;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1076a f16759e;

    /* renamed from: e0, reason: collision with root package name */
    public final EdgeEffect f16760e0;

    /* renamed from: f, reason: collision with root package name */
    public int f16761f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f16762f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f16763g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f16764h0;

    /* renamed from: i0, reason: collision with root package name */
    public ArrayList f16765i0;

    /* renamed from: j0, reason: collision with root package name */
    public InterfaceC1082g f16766j0;

    /* renamed from: k0, reason: collision with root package name */
    public ArrayList f16767k0;

    /* renamed from: l0, reason: collision with root package name */
    public final RunnableC1077b f16768l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f16769m0;

    /* renamed from: u, reason: collision with root package name */
    public int f16770u;

    /* renamed from: v, reason: collision with root package name */
    public Parcelable f16771v;

    /* renamed from: w, reason: collision with root package name */
    public ClassLoader f16772w;

    /* renamed from: x, reason: collision with root package name */
    public final Scroller f16773x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16774y;

    /* renamed from: z, reason: collision with root package name */
    public B6.g f16775z;

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, e3.e] */
    public AbstractC1084i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16753b = new ArrayList();
        this.f16755c = new Object();
        this.f16757d = new Rect();
        this.f16770u = -1;
        this.f16771v = null;
        this.f16772w = null;
        this.f16733E = -3.4028235E38f;
        this.f16734F = Float.MAX_VALUE;
        this.f16739K = 1;
        this.f16748U = -1;
        this.f16762f0 = true;
        this.f16768l0 = new RunnableC1077b(this, 0);
        this.f16769m0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f16773x = new Scroller(context2, f16728p0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f4 = context2.getResources().getDisplayMetrics().density;
        this.f16743P = viewConfiguration.getScaledPagingTouchSlop();
        this.f16750W = (int) (400.0f * f4);
        this.f16752a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16758d0 = new EdgeEffect(context2);
        this.f16760e0 = new EdgeEffect(context2);
        this.f16754b0 = (int) (25.0f * f4);
        this.f16756c0 = (int) (2.0f * f4);
        this.f16741N = (int) (f4 * 16.0f);
        K.n(this, new com.google.android.material.datepicker.i(this, 1));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AbstractC2352B.l(this, new C1078c(this));
    }

    public static boolean c(int i7, int i10, int i11, View view, boolean z8) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && c(i7, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z8 && view.canScrollHorizontally(-i7);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.f16737I != z8) {
            this.f16737I = z8;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e3.e] */
    public final C1080e a(int i7, int i10) {
        C i11;
        B b2;
        ?? obj = new Object();
        obj.f16715b = i7;
        b0 b0Var = (b0) this.f16759e;
        ArrayList arrayList = b0Var.g;
        if (arrayList.size() <= i7 || (i11 = (C) arrayList.get(i7)) == null) {
            if (b0Var.f10446e == null) {
                U u3 = b0Var.f10444c;
                u3.getClass();
                b0Var.f10446e = new C0558a(u3);
            }
            i11 = b0Var.i(i7);
            ArrayList arrayList2 = b0Var.f10447f;
            if (arrayList2.size() > i7 && (b2 = (B) arrayList2.get(i7)) != null) {
                if (i11.f10265H != null) {
                    throw new IllegalStateException("Fragment already added");
                }
                Bundle bundle = b2.f10256a;
                if (bundle == null) {
                    bundle = null;
                }
                i11.f10285b = bundle;
            }
            while (arrayList.size() <= i7) {
                arrayList.add(null);
            }
            if (i11.f10274R) {
                i11.f10274R = false;
            }
            int i12 = b0Var.f10445d;
            if (i12 == 0) {
                i11.m0(false);
            }
            arrayList.set(i7, i11);
            b0Var.f10446e.g(getId(), i11, null, 1);
            if (i12 == 1) {
                b0Var.f10446e.l(i11, EnumC1474s.f19230d);
            }
        }
        obj.f16714a = i11;
        this.f16759e.getClass();
        obj.f16717d = 1.0f;
        ArrayList arrayList3 = this.f16753b;
        if (i10 < 0 || i10 >= arrayList3.size()) {
            arrayList3.add(obj);
        } else {
            arrayList3.add(i10, obj);
        }
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        C1080e h10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f16715b == this.f16761f) {
                    childAt.addFocusables(arrayList, i7, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        C1080e h10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f16715b == this.f16761f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        C1081f c1081f = (C1081f) layoutParams;
        boolean z8 = c1081f.f16719a | (view.getClass().getAnnotation(InterfaceC1079d.class) != null);
        c1081f.f16719a = z8;
        if (!this.f16736H) {
            super.addView(view, i7, layoutParams);
        } else {
            if (z8) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c1081f.f16722d = true;
            addViewInLayout(view, i7, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i7) {
        View findNextFocus;
        boolean z8;
        int i10;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
            boolean z10 = true;
            z8 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.f16757d;
                if (i7 == 17) {
                    int i11 = g(rect, findNextFocus).left;
                    int i12 = g(rect, findFocus).left;
                    if (findFocus == null || i11 < i12) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i13 = this.f16761f;
                        if (i13 > 0) {
                            this.f16738J = false;
                            u(i13 - 1, 0, true, false);
                            z8 = z10;
                        }
                        z10 = false;
                        z8 = z10;
                    }
                } else if (i7 == 66) {
                    requestFocus = (findFocus == null || g(rect, findNextFocus).left > g(rect, findFocus).left) ? findNextFocus.requestFocus() : m();
                }
                z8 = requestFocus;
            } else if (i7 != 17 || i7 == 1) {
                i10 = this.f16761f;
                if (i10 > 0) {
                    this.f16738J = false;
                    u(i10 - 1, 0, true, false);
                    z8 = z10;
                }
                z10 = false;
                z8 = z10;
            } else if (i7 == 66 || i7 == 2) {
                z8 = m();
            }
            if (z8) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i7));
            }
            return z8;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        boolean z102 = true;
        z8 = false;
        if (findNextFocus == null) {
        }
        if (i7 != 17) {
        }
        i10 = this.f16761f;
        if (i10 > 0) {
        }
        z102 = false;
        z8 = z102;
        if (z8) {
        }
        return z8;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        if (this.f16759e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i7 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f16733E)) : i7 > 0 && scrollX < ((int) (((float) clientWidth) * this.f16734F));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1081f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f16774y = true;
        Scroller scroller = this.f16773x;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = K.f26642a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z8) {
        Scroller scroller = this.f16773x;
        boolean z10 = this.f16769m0 == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.f16738J = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16753b;
            if (i7 >= arrayList.size()) {
                break;
            }
            C1080e c1080e = (C1080e) arrayList.get(i7);
            if (c1080e.f16716c) {
                c1080e.f16716c = false;
                z10 = true;
            }
            i7++;
        }
        if (z10) {
            RunnableC1077b runnableC1077b = this.f16768l0;
            if (!z8) {
                runnableC1077b.run();
            } else {
                WeakHashMap weakHashMap = K.f26642a;
                postOnAnimation(runnableC1077b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8;
        boolean z10;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        LeanbackViewPager leanbackViewPager = (LeanbackViewPager) this;
        if (leanbackViewPager.f13488r0) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z10 = keyEvent.hasModifiers(2) ? leanbackViewPager.m() : leanbackViewPager.b(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z10 = leanbackViewPager.b(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z10 = leanbackViewPager.b(1);
                        }
                    }
                    if (z10) {
                        z8 = true;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i7 = leanbackViewPager.f16761f;
                        if (i7 > 0) {
                            leanbackViewPager.f16738J = false;
                            leanbackViewPager.u(i7 - 1, 0, true, false);
                            z10 = true;
                        }
                    } else {
                        z10 = leanbackViewPager.b(17);
                    }
                    if (z10) {
                    }
                }
                return !z8;
            }
            z10 = false;
            if (z10) {
            }
        }
        z8 = false;
        if (!z8) {
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1080e h10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f16715b == this.f16761f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC1076a abstractC1076a;
        EdgeEffect edgeEffect = this.f16760e0;
        EdgeEffect edgeEffect2 = this.f16758d0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z8 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC1076a = this.f16759e) != null && abstractC1076a.c() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f16733E * width);
                edgeEffect2.setSize(height, width);
                z8 = edgeEffect2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!edgeEffect.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f16734F + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                z8 |= edgeEffect.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (z8) {
            WeakHashMap weakHashMap = K.f26642a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f16730B;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int c10 = this.f16759e.c();
        this.f16751a = c10;
        ArrayList arrayList = this.f16753b;
        boolean z8 = arrayList.size() < (this.f16739K * 2) + 1 && arrayList.size() < c10;
        int i7 = this.f16761f;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < arrayList.size()) {
            C1080e c1080e = (C1080e) arrayList.get(i10);
            int d10 = this.f16759e.d(c1080e.f16714a);
            if (d10 != -1) {
                if (d10 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z10) {
                        this.f16759e.h(this);
                        z10 = true;
                    }
                    this.f16759e.a(c1080e.f16715b, c1080e.f16714a);
                    int i11 = this.f16761f;
                    if (i11 == c1080e.f16715b) {
                        i7 = Math.max(0, Math.min(i11, c10 - 1));
                    }
                } else {
                    int i12 = c1080e.f16715b;
                    if (i12 != d10) {
                        if (i12 == this.f16761f) {
                            i7 = d10;
                        }
                        c1080e.f16715b = d10;
                    }
                }
                z8 = true;
            }
            i10++;
        }
        if (z10) {
            this.f16759e.b();
        }
        Collections.sort(arrayList, f16727o0);
        if (z8) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C1081f c1081f = (C1081f) getChildAt(i13).getLayoutParams();
                if (!c1081f.f16719a) {
                    c1081f.f16721c = 0.0f;
                }
            }
            u(i7, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i7) {
        InterfaceC1082g interfaceC1082g = this.f16766j0;
        if (interfaceC1082g != null) {
            ((k) interfaceC1082g).b(i7);
        }
        ArrayList arrayList = this.f16765i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC1082g interfaceC1082g2 = (InterfaceC1082g) this.f16765i0.get(i10);
                if (interfaceC1082g2 != null) {
                    ((k) interfaceC1082g2).b(i7);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, e3.f] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f16721c = 0.0f;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, e3.f] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f16721c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16726n0);
        layoutParams.f16720b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC1076a getAdapter() {
        return this.f16759e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f16761f;
    }

    public int getOffscreenPageLimit() {
        return this.f16739K;
    }

    public int getPageMargin() {
        return this.f16729A;
    }

    public final C1080e h(View view) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f16753b;
            if (i7 >= arrayList.size()) {
                return null;
            }
            C1080e c1080e = (C1080e) arrayList.get(i7);
            AbstractC1076a abstractC1076a = this.f16759e;
            C c10 = c1080e.f16714a;
            ((b0) abstractC1076a).getClass();
            if (c10.f10277U == view) {
                return c1080e;
            }
            i7++;
        }
    }

    public final C1080e i() {
        C1080e c1080e;
        int i7;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.f16729A / clientWidth : 0.0f;
        int i10 = 0;
        boolean z8 = true;
        C1080e c1080e2 = null;
        int i11 = -1;
        float f11 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f16753b;
            if (i10 >= arrayList.size()) {
                return c1080e2;
            }
            C1080e c1080e3 = (C1080e) arrayList.get(i10);
            if (z8 || c1080e3.f16715b == (i7 = i11 + 1)) {
                c1080e = c1080e3;
            } else {
                float f12 = f4 + f11 + f10;
                C1080e c1080e4 = this.f16755c;
                c1080e4.f16718e = f12;
                c1080e4.f16715b = i7;
                this.f16759e.getClass();
                c1080e4.f16717d = 1.0f;
                i10--;
                c1080e = c1080e4;
            }
            f4 = c1080e.f16718e;
            float f13 = c1080e.f16717d + f4 + f10;
            if (!z8 && scrollX < f4) {
                return c1080e2;
            }
            if (scrollX < f13 || i10 == arrayList.size() - 1) {
                break;
            }
            int i12 = c1080e.f16715b;
            float f14 = c1080e.f16717d;
            i10++;
            z8 = false;
            C1080e c1080e5 = c1080e;
            i11 = i12;
            f11 = f14;
            c1080e2 = c1080e5;
        }
        return c1080e;
    }

    public final C1080e j(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16753b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            C1080e c1080e = (C1080e) arrayList.get(i10);
            if (c1080e.f16715b == i7) {
                return c1080e;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(float f4, int i7, int i10) {
        int max;
        int i11;
        int left;
        if (this.f16764h0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C1081f c1081f = (C1081f) childAt.getLayoutParams();
                if (c1081f.f16719a) {
                    int i13 = c1081f.f16720b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            i11 = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            i11 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i11;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = max;
                    i11 = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i11;
                }
            }
        }
        InterfaceC1082g interfaceC1082g = this.f16766j0;
        if (interfaceC1082g != null) {
            ((k) interfaceC1082g).a(i7, f4);
        }
        ArrayList arrayList = this.f16765i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                InterfaceC1082g interfaceC1082g2 = (InterfaceC1082g) this.f16765i0.get(i15);
                if (interfaceC1082g2 != null) {
                    ((k) interfaceC1082g2).a(i7, f4);
                }
            }
        }
        this.f16763g0 = true;
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16748U) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f16744Q = motionEvent.getX(i7);
            this.f16748U = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f16749V;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        AbstractC1076a abstractC1076a = this.f16759e;
        if (abstractC1076a == null || this.f16761f >= abstractC1076a.c() - 1) {
            return false;
        }
        int i7 = this.f16761f + 1;
        this.f16738J = false;
        u(i7, 0, true, false);
        return true;
    }

    public final boolean n(int i7) {
        if (this.f16753b.size() == 0) {
            if (this.f16762f0) {
                return false;
            }
            this.f16763g0 = false;
            k(0.0f, 0, 0);
            if (this.f16763g0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1080e i10 = i();
        int clientWidth = getClientWidth();
        int i11 = this.f16729A;
        int i12 = clientWidth + i11;
        float f4 = clientWidth;
        int i13 = i10.f16715b;
        float f10 = ((i7 / f4) - i10.f16718e) / (i10.f16717d + (i11 / f4));
        this.f16763g0 = false;
        k(f10, i13, (int) (i12 * f10));
        if (this.f16763g0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f4) {
        boolean z8;
        boolean z10;
        float f10 = this.f16744Q - f4;
        this.f16744Q = f4;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.f16733E * clientWidth;
        float f12 = this.f16734F * clientWidth;
        ArrayList arrayList = this.f16753b;
        boolean z11 = false;
        C1080e c1080e = (C1080e) arrayList.get(0);
        C1080e c1080e2 = (C1080e) o.k(1, arrayList);
        if (c1080e.f16715b != 0) {
            f11 = c1080e.f16718e * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (c1080e2.f16715b != this.f16759e.c() - 1) {
            f12 = c1080e2.f16718e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f11) {
            if (z8) {
                this.f16758d0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z10) {
                this.f16760e0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        }
        int i7 = (int) scrollX;
        this.f16744Q = (scrollX - i7) + this.f16744Q;
        scrollTo(i7, getScrollY());
        n(i7);
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16762f0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f16768l0);
        Scroller scroller = this.f16773x;
        if (scroller != null && !scroller.isFinished()) {
            this.f16773x.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f4;
        ArrayList arrayList;
        float f10;
        super.onDraw(canvas);
        if (this.f16729A <= 0 || this.f16730B == null) {
            return;
        }
        ArrayList arrayList2 = this.f16753b;
        if (arrayList2.size() <= 0 || this.f16759e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f16729A / width;
        int i10 = 0;
        C1080e c1080e = (C1080e) arrayList2.get(0);
        float f12 = c1080e.f16718e;
        int size = arrayList2.size();
        int i11 = c1080e.f16715b;
        int i12 = ((C1080e) arrayList2.get(size - 1)).f16715b;
        while (i11 < i12) {
            while (true) {
                i7 = c1080e.f16715b;
                if (i11 <= i7 || i10 >= size) {
                    break;
                }
                i10++;
                c1080e = (C1080e) arrayList2.get(i10);
            }
            if (i11 == i7) {
                float f13 = c1080e.f16718e;
                float f14 = c1080e.f16717d;
                f4 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                this.f16759e.getClass();
                f4 = (f12 + 1.0f) * width;
                f12 = 1.0f + f11 + f12;
            }
            if (this.f16729A + f4 > scrollX) {
                arrayList = arrayList2;
                f10 = f11;
                this.f16730B.setBounds(Math.round(f4), this.f16731C, Math.round(this.f16729A + f4), this.f16732D);
                this.f16730B.draw(canvas);
            } else {
                arrayList = arrayList2;
                f10 = f11;
            }
            if (f4 > scrollX + r3) {
                return;
            }
            i11++;
            arrayList2 = arrayList;
            f11 = f10;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i7 = this.f16743P;
        Scroller scroller = this.f16773x;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.L) {
                return true;
            }
            if (this.f16740M) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.f16746S = x2;
            this.f16744Q = x2;
            float y10 = motionEvent.getY();
            this.f16747T = y10;
            this.f16745R = y10;
            this.f16748U = motionEvent.getPointerId(0);
            this.f16740M = false;
            this.f16774y = true;
            scroller.computeScrollOffset();
            if (this.f16769m0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f16756c0) {
                d(false);
                this.L = false;
            } else {
                scroller.abortAnimation();
                this.f16738J = false;
                p();
                this.L = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f16748U;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x10 = motionEvent.getX(findPointerIndex);
                float f4 = x10 - this.f16744Q;
                float abs = Math.abs(f4);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f16747T);
                if (f4 != 0.0f) {
                    float f10 = this.f16744Q;
                    if ((f10 >= this.f16742O || f4 <= 0.0f) && ((f10 <= getWidth() - this.f16742O || f4 >= 0.0f) && c((int) f4, (int) x10, (int) y11, this, false))) {
                        this.f16744Q = x10;
                        this.f16745R = y11;
                        this.f16740M = true;
                        return false;
                    }
                }
                float f11 = i7;
                if (abs > f11 && abs * 0.5f > abs2) {
                    this.L = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f12 = this.f16746S;
                    float f13 = i7;
                    this.f16744Q = f4 > 0.0f ? f12 + f13 : f12 - f13;
                    this.f16745R = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f11) {
                    this.f16740M = true;
                }
                if (this.L && o(x10)) {
                    WeakHashMap weakHashMap = K.f26642a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f16749V == null) {
            this.f16749V = VelocityTracker.obtain();
        }
        this.f16749V.addMovement(motionEvent);
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        boolean z10;
        C1080e h10;
        int max;
        int i13;
        int max2;
        int i14;
        int childCount = getChildCount();
        int i15 = i11 - i7;
        int i16 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C1081f c1081f = (C1081f) childAt.getLayoutParams();
                if (c1081f.f16719a) {
                    int i19 = c1081f.f16720b;
                    int i20 = i19 & 7;
                    int i21 = i19 & 112;
                    if (i20 != 1) {
                        if (i20 == 3) {
                            i13 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i20 != 5) {
                            i13 = paddingLeft;
                        } else {
                            max = (i15 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i21 == 16) {
                            if (i21 == 48) {
                                i14 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i21 != 80) {
                                i14 = paddingTop;
                            } else {
                                max2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i22 = paddingLeft + scrollX;
                            childAt.layout(i22, paddingTop, childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + paddingTop);
                            i17++;
                            paddingTop = i14;
                            paddingLeft = i13;
                        } else {
                            max2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i23 = max2;
                        i14 = paddingTop;
                        paddingTop = i23;
                        int i222 = paddingLeft + scrollX;
                        childAt.layout(i222, paddingTop, childAt.getMeasuredWidth() + i222, childAt.getMeasuredHeight() + paddingTop);
                        i17++;
                        paddingTop = i14;
                        paddingLeft = i13;
                    } else {
                        max = Math.max((i15 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = max;
                    i13 = paddingLeft;
                    paddingLeft = i24;
                    if (i21 == 16) {
                    }
                    int i232 = max2;
                    i14 = paddingTop;
                    paddingTop = i232;
                    int i2222 = paddingLeft + scrollX;
                    childAt.layout(i2222, paddingTop, childAt.getMeasuredWidth() + i2222, childAt.getMeasuredHeight() + paddingTop);
                    i17++;
                    paddingTop = i14;
                    paddingLeft = i13;
                }
            }
        }
        int i25 = (i15 - paddingLeft) - paddingRight;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt2 = getChildAt(i26);
            if (childAt2.getVisibility() != 8) {
                C1081f c1081f2 = (C1081f) childAt2.getLayoutParams();
                if (!c1081f2.f16719a && (h10 = h(childAt2)) != null) {
                    float f4 = i25;
                    int i27 = ((int) (h10.f16718e * f4)) + paddingLeft;
                    if (c1081f2.f16722d) {
                        c1081f2.f16722d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f4 * c1081f2.f16721c), 1073741824), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i27, paddingTop, childAt2.getMeasuredWidth() + i27, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f16731C = paddingTop;
        this.f16732D = i16 - paddingBottom;
        this.f16764h0 = i17;
        if (this.f16762f0) {
            z10 = false;
            t(this.f16761f, 0, false, false);
        } else {
            z10 = false;
        }
        this.f16762f0 = z10;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        C1081f c1081f;
        C1081f c1081f2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i7), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.f16742O = Math.min(measuredWidth / 10, this.f16741N);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z8 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (c1081f2 = (C1081f) childAt.getLayoutParams()) != null && c1081f2.f16719a) {
                int i14 = c1081f2.f16720b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z10 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z8 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z10) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z8 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) c1081f2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) c1081f2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z8) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f16735G = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f16736H = true;
        p();
        this.f16736H = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((c1081f = (C1081f) childAt2.getLayoutParams()) == null || !c1081f.f16719a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c1081f.f16721c), 1073741824), this.f16735G);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i10;
        int i11;
        int i12;
        C1080e h10;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f16715b == this.f16761f && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1083h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1083h c1083h = (C1083h) parcelable;
        super.onRestoreInstanceState(c1083h.f4568a);
        AbstractC1076a abstractC1076a = this.f16759e;
        ClassLoader classLoader = c1083h.f16725e;
        if (abstractC1076a != null) {
            abstractC1076a.g(c1083h.f16724d, classLoader);
            u(c1083h.f16723c, 0, false, true);
        } else {
            this.f16770u = c1083h.f16723c;
            this.f16771v = c1083h.f16724d;
            this.f16772w = classLoader;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, e3.h, H1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle;
        ?? bVar = new H1.b(super.onSaveInstanceState());
        bVar.f16723c = this.f16761f;
        AbstractC1076a abstractC1076a = this.f16759e;
        if (abstractC1076a != null) {
            b0 b0Var = (b0) abstractC1076a;
            ArrayList arrayList = b0Var.f10447f;
            if (arrayList.size() > 0) {
                bundle = new Bundle();
                B[] bArr = new B[arrayList.size()];
                arrayList.toArray(bArr);
                bundle.putParcelableArray("states", bArr);
            } else {
                bundle = null;
            }
            int i7 = 0;
            while (true) {
                ArrayList arrayList2 = b0Var.g;
                if (i7 >= arrayList2.size()) {
                    bVar.f16724d = bundle;
                    break;
                }
                C c10 = (C) arrayList2.get(i7);
                if (c10 != null && c10.K()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    String l10 = o.l(i7, "f");
                    U u3 = b0Var.f10444c;
                    u3.getClass();
                    if (c10.f10265H != u3) {
                        u3.g0(new IllegalStateException(A3.c.i("Fragment ", c10, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(l10, c10.f10293f);
                }
                i7++;
            }
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            int i13 = this.f16729A;
            r(i7, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC1076a abstractC1076a;
        int i7 = this.f16743P;
        boolean z8 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC1076a = this.f16759e) == null || abstractC1076a.c() == 0) {
            return false;
        }
        if (this.f16749V == null) {
            this.f16749V = VelocityTracker.obtain();
        }
        this.f16749V.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f16773x.abortAnimation();
            this.f16738J = false;
            p();
            float x2 = motionEvent.getX();
            this.f16746S = x2;
            this.f16744Q = x2;
            float y10 = motionEvent.getY();
            this.f16747T = y10;
            this.f16745R = y10;
            this.f16748U = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.L) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f16748U);
                    if (findPointerIndex == -1) {
                        z8 = s();
                    } else {
                        float x10 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x10 - this.f16744Q);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f16745R);
                        if (abs > i7 && abs > abs2) {
                            this.L = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f4 = this.f16746S;
                            float f10 = i7;
                            this.f16744Q = x10 - f4 > 0.0f ? f4 + f10 : f4 - f10;
                            this.f16745R = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.L) {
                    z8 = o(motionEvent.getX(motionEvent.findPointerIndex(this.f16748U)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f16744Q = motionEvent.getX(actionIndex);
                    this.f16748U = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.f16744Q = motionEvent.getX(motionEvent.findPointerIndex(this.f16748U));
                }
            } else if (this.L) {
                t(this.f16761f, 0, true, false);
                z8 = s();
            }
        } else if (this.L) {
            VelocityTracker velocityTracker = this.f16749V;
            velocityTracker.computeCurrentVelocity(1000, this.f16752a0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f16748U);
            this.f16738J = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1080e i10 = i();
            float f11 = clientWidth;
            int i11 = i10.f16715b;
            float f12 = ((scrollX / f11) - i10.f16718e) / (i10.f16717d + (this.f16729A / f11));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f16748U)) - this.f16746S)) <= this.f16754b0 || Math.abs(xVelocity) <= this.f16750W) {
                i11 += (int) (f12 + (i11 >= this.f16761f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i11++;
            }
            ArrayList arrayList = this.f16753b;
            if (arrayList.size() > 0) {
                i11 = Math.max(((C1080e) arrayList.get(0)).f16715b, Math.min(i11, ((C1080e) o.k(1, arrayList)).f16715b));
            }
            u(i11, xVelocity, true, true);
            z8 = s();
        }
        if (z8) {
            WeakHashMap weakHashMap = K.f26642a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.f16761f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r10 == r11) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(int i7) {
        C1080e c1080e;
        String hexString;
        ArrayList arrayList;
        C1080e c1080e2;
        int i10;
        C1080e c1080e3;
        C1080e h10;
        int i11;
        int i12;
        C1080e c1080e4;
        C1080e c1080e5;
        C1080e c1080e6;
        int i13 = this.f16761f;
        if (i13 != i7) {
            c1080e = j(i13);
            this.f16761f = i7;
        } else {
            c1080e = null;
        }
        if (this.f16759e == null || this.f16738J || getWindowToken() == null) {
            return;
        }
        this.f16759e.h(this);
        int i14 = this.f16739K;
        int max = Math.max(0, this.f16761f - i14);
        int c10 = this.f16759e.c();
        int min = Math.min(c10 - 1, this.f16761f + i14);
        if (c10 != this.f16751a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f16751a + ", found: " + c10 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f16759e.getClass());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.f16753b;
            if (i15 >= arrayList.size()) {
                break;
            }
            c1080e2 = (C1080e) arrayList.get(i15);
            int i16 = c1080e2.f16715b;
            int i17 = this.f16761f;
            if (i16 < i17) {
                i15++;
            }
        }
        c1080e2 = null;
        if (c1080e2 == null && c10 > 0) {
            c1080e2 = a(this.f16761f, i15);
        }
        if (c1080e2 != null) {
            int i18 = i15 - 1;
            C1080e c1080e7 = i18 >= 0 ? (C1080e) arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c1080e2.f16717d);
            float f4 = 0.0f;
            for (int i19 = this.f16761f - 1; i19 >= 0; i19--) {
                if (f4 >= paddingLeft && i19 < max) {
                    if (c1080e7 == null) {
                        break;
                    }
                    if (i19 == c1080e7.f16715b && !c1080e7.f16716c) {
                        arrayList.remove(i18);
                        this.f16759e.a(i19, c1080e7.f16714a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            c1080e6 = (C1080e) arrayList.get(i18);
                            c1080e7 = c1080e6;
                        }
                        c1080e6 = null;
                        c1080e7 = c1080e6;
                    }
                } else if (c1080e7 == null || i19 != c1080e7.f16715b) {
                    f4 += a(i19, i18 + 1).f16717d;
                    i15++;
                    if (i18 >= 0) {
                        c1080e6 = (C1080e) arrayList.get(i18);
                        c1080e7 = c1080e6;
                    }
                    c1080e6 = null;
                    c1080e7 = c1080e6;
                } else {
                    f4 += c1080e7.f16717d;
                    i18--;
                    if (i18 >= 0) {
                        c1080e6 = (C1080e) arrayList.get(i18);
                        c1080e7 = c1080e6;
                    }
                    c1080e6 = null;
                    c1080e7 = c1080e6;
                }
            }
            float f10 = c1080e2.f16717d;
            int i20 = i15 + 1;
            if (f10 < 2.0f) {
                C1080e c1080e8 = i20 < arrayList.size() ? (C1080e) arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f16761f + 1; i22 < c10; i22++) {
                    if (f10 >= paddingRight && i22 > min) {
                        if (c1080e8 == null) {
                            break;
                        }
                        if (i22 == c1080e8.f16715b && !c1080e8.f16716c) {
                            arrayList.remove(i21);
                            this.f16759e.a(i22, c1080e8.f16714a);
                            if (i21 < arrayList.size()) {
                                c1080e8 = (C1080e) arrayList.get(i21);
                            }
                            c1080e8 = null;
                        }
                    } else if (c1080e8 == null || i22 != c1080e8.f16715b) {
                        C1080e a9 = a(i22, i21);
                        i21++;
                        f10 += a9.f16717d;
                        if (i21 < arrayList.size()) {
                            c1080e8 = (C1080e) arrayList.get(i21);
                        }
                        c1080e8 = null;
                    } else {
                        f10 += c1080e8.f16717d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            c1080e8 = (C1080e) arrayList.get(i21);
                        }
                        c1080e8 = null;
                    }
                }
            }
            int c11 = this.f16759e.c();
            int clientWidth2 = getClientWidth();
            float f11 = clientWidth2 > 0 ? this.f16729A / clientWidth2 : 0.0f;
            if (c1080e != null) {
                int i23 = c1080e.f16715b;
                int i24 = c1080e2.f16715b;
                if (i23 < i24) {
                    float f12 = c1080e.f16718e + c1080e.f16717d + f11;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= c1080e2.f16715b && i26 < arrayList.size()) {
                        Object obj = arrayList.get(i26);
                        while (true) {
                            c1080e5 = (C1080e) obj;
                            if (i25 <= c1080e5.f16715b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            obj = arrayList.get(i26);
                        }
                        while (i25 < c1080e5.f16715b) {
                            this.f16759e.getClass();
                            f12 += 1.0f + f11;
                            i25++;
                        }
                        c1080e5.f16718e = f12;
                        f12 += c1080e5.f16717d + f11;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float f13 = c1080e.f16718e;
                    int i27 = i23 - 1;
                    while (i27 >= c1080e2.f16715b && size >= 0) {
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            c1080e4 = (C1080e) obj2;
                            if (i27 >= c1080e4.f16715b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i27 > c1080e4.f16715b) {
                            this.f16759e.getClass();
                            f13 -= 1.0f + f11;
                            i27--;
                        }
                        f13 -= c1080e4.f16717d + f11;
                        c1080e4.f16718e = f13;
                        i27--;
                    }
                }
            }
            int size2 = arrayList.size();
            float f14 = c1080e2.f16718e;
            int i28 = c1080e2.f16715b;
            int i29 = i28 - 1;
            this.f16733E = i28 == 0 ? f14 : -3.4028235E38f;
            int i30 = c11 - 1;
            this.f16734F = i28 == i30 ? (c1080e2.f16717d + f14) - 1.0f : Float.MAX_VALUE;
            int i31 = i15 - 1;
            while (i31 >= 0) {
                C1080e c1080e9 = (C1080e) arrayList.get(i31);
                while (true) {
                    i12 = c1080e9.f16715b;
                    if (i29 <= i12) {
                        break;
                    }
                    i29--;
                    this.f16759e.getClass();
                    f14 -= 1.0f + f11;
                }
                f14 -= c1080e9.f16717d + f11;
                c1080e9.f16718e = f14;
                if (i12 == 0) {
                    this.f16733E = f14;
                }
                i31--;
                i29--;
            }
            float f15 = c1080e2.f16718e + c1080e2.f16717d + f11;
            int i32 = c1080e2.f16715b + 1;
            while (i20 < size2) {
                C1080e c1080e10 = (C1080e) arrayList.get(i20);
                while (true) {
                    i11 = c1080e10.f16715b;
                    if (i32 >= i11) {
                        break;
                    }
                    i32++;
                    this.f16759e.getClass();
                    f15 += 1.0f + f11;
                }
                if (i11 == i30) {
                    this.f16734F = (c1080e10.f16717d + f15) - 1.0f;
                }
                c1080e10.f16718e = f15;
                f15 += c1080e10.f16717d + f11;
                i20++;
                i32++;
            }
            AbstractC1076a abstractC1076a = this.f16759e;
            C c12 = c1080e2.f16714a;
            b0 b0Var = (b0) abstractC1076a;
            b0Var.getClass();
            C c13 = b0Var.f10448h;
            if (c12 != c13) {
                U u3 = b0Var.f10444c;
                int i33 = b0Var.f10445d;
                if (c13 != null) {
                    if (c13.f10274R) {
                        c13.f10274R = false;
                    }
                    if (i33 == 1) {
                        if (b0Var.f10446e == null) {
                            u3.getClass();
                            b0Var.f10446e = new C0558a(u3);
                        }
                        b0Var.f10446e.l(b0Var.f10448h, EnumC1474s.f19230d);
                    } else {
                        i10 = 0;
                        c13.m0(false);
                        if (!c12.f10274R) {
                            c12.f10274R = true;
                        }
                        if (i33 != 1) {
                            if (b0Var.f10446e == null) {
                                u3.getClass();
                                b0Var.f10446e = new C0558a(u3);
                            }
                            b0Var.f10446e.l(c12, EnumC1474s.f19231e);
                        } else {
                            c12.m0(true);
                        }
                        b0Var.f10448h = c12;
                    }
                }
                i10 = 0;
                if (!c12.f10274R) {
                }
                if (i33 != 1) {
                }
                b0Var.f10448h = c12;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        this.f16759e.b();
        int childCount = getChildCount();
        for (int i34 = i10; i34 < childCount; i34++) {
            View childAt = getChildAt(i34);
            C1081f c1081f = (C1081f) childAt.getLayoutParams();
            c1081f.getClass();
            if (!c1081f.f16719a && c1081f.f16721c == 0.0f && (h10 = h(childAt)) != null) {
                c1081f.f16721c = h10.f16717d;
            }
        }
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        c1080e3 = h(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            c1080e3 = null;
            if (c1080e3 == null || c1080e3.f16715b != this.f16761f) {
                for (int i35 = i10; i35 < getChildCount(); i35++) {
                    View childAt2 = getChildAt(i35);
                    C1080e h11 = h(childAt2);
                    if (h11 != null && h11.f16715b == this.f16761f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void r(int i7, int i10, int i11, int i12) {
        if (i10 > 0 && !this.f16753b.isEmpty()) {
            if (!this.f16773x.isFinished()) {
                this.f16773x.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        C1080e j = j(this.f16761f);
        int min = (int) ((j != null ? Math.min(j.f16718e, this.f16734F) : 0.0f) * ((i7 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            d(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f16736H) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f16748U = -1;
        this.L = false;
        this.f16740M = false;
        VelocityTracker velocityTracker = this.f16749V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16749V = null;
        }
        this.f16758d0.onRelease();
        this.f16760e0.onRelease();
        return this.f16758d0.isFinished() || this.f16760e0.isFinished();
    }

    public void setAdapter(AbstractC1076a abstractC1076a) {
        ArrayList arrayList;
        AbstractC1076a abstractC1076a2 = this.f16759e;
        if (abstractC1076a2 != null) {
            synchronized (abstractC1076a2) {
                abstractC1076a2.f16708b = null;
            }
            this.f16759e.h(this);
            int i7 = 0;
            while (true) {
                arrayList = this.f16753b;
                if (i7 >= arrayList.size()) {
                    break;
                }
                C1080e c1080e = (C1080e) arrayList.get(i7);
                this.f16759e.a(c1080e.f16715b, c1080e.f16714a);
                i7++;
            }
            this.f16759e.b();
            arrayList.clear();
            int i10 = 0;
            while (i10 < getChildCount()) {
                if (!((C1081f) getChildAt(i10).getLayoutParams()).f16719a) {
                    removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
            this.f16761f = 0;
            scrollTo(0, 0);
        }
        this.f16759e = abstractC1076a;
        this.f16751a = 0;
        if (abstractC1076a != null) {
            if (this.f16775z == null) {
                this.f16775z = new B6.g(this, 1);
            }
            AbstractC1076a abstractC1076a3 = this.f16759e;
            B6.g gVar = this.f16775z;
            synchronized (abstractC1076a3) {
                abstractC1076a3.f16708b = gVar;
            }
            this.f16738J = false;
            boolean z8 = this.f16762f0;
            this.f16762f0 = true;
            this.f16751a = this.f16759e.c();
            if (this.f16770u >= 0) {
                this.f16759e.g(this.f16771v, this.f16772w);
                u(this.f16770u, 0, false, true);
                this.f16770u = -1;
                this.f16771v = null;
                this.f16772w = null;
            } else if (z8) {
                requestLayout();
            } else {
                p();
            }
        }
        ArrayList arrayList2 = this.f16767k0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f16767k0.size();
        for (int i11 = 0; i11 < size; i11++) {
            B6.d dVar = (B6.d) this.f16767k0.get(i11);
            B6.o oVar = dVar.f2119b;
            if (oVar.f2186f0 == this) {
                oVar.k(abstractC1076a, dVar.f2118a);
            }
        }
    }

    public void setCurrentItem(int i7) {
        this.f16738J = false;
        u(i7, 0, !this.f16762f0, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.f16739K) {
            this.f16739K = i7;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1082g interfaceC1082g) {
        this.f16766j0 = interfaceC1082g;
    }

    public void setPageMargin(int i7) {
        int i10 = this.f16729A;
        this.f16729A = i7;
        int width = getWidth();
        r(width, width, i7, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(int i7) {
        setPageMarginDrawable(AbstractC1449a.getDrawable(getContext(), i7));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f16730B = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i7) {
        if (this.f16769m0 == i7) {
            return;
        }
        this.f16769m0 = i7;
        InterfaceC1082g interfaceC1082g = this.f16766j0;
        if (interfaceC1082g != null) {
            k kVar = (k) interfaceC1082g;
            kVar.f2135b = kVar.f2136c;
            kVar.f2136c = i7;
            B6.o oVar = (B6.o) kVar.f2134a.get();
            if (oVar != null) {
                oVar.f2192l0 = kVar.f2136c;
            }
        }
        ArrayList arrayList = this.f16765i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC1082g interfaceC1082g2 = (InterfaceC1082g) this.f16765i0.get(i10);
                if (interfaceC1082g2 != null) {
                    k kVar2 = (k) interfaceC1082g2;
                    kVar2.f2135b = kVar2.f2136c;
                    kVar2.f2136c = i7;
                    B6.o oVar2 = (B6.o) kVar2.f2134a.get();
                    if (oVar2 != null) {
                        oVar2.f2192l0 = kVar2.f2136c;
                    }
                }
            }
        }
    }

    public final void t(int i7, int i10, boolean z8, boolean z10) {
        int scrollX;
        int abs;
        Scroller scroller = this.f16773x;
        C1080e j = j(i7);
        int max = j != null ? (int) (Math.max(this.f16733E, Math.min(j.f16718e, this.f16734F)) * getClientWidth()) : 0;
        if (!z8) {
            if (z10) {
                f(i7);
            }
            d(false);
            scrollTo(max, 0);
            n(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f16774y ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i11 = scrollX;
            int scrollY = getScrollY();
            int i12 = max - i11;
            int i13 = 0 - scrollY;
            if (i12 == 0 && i13 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i14 = clientWidth / 2;
                float f4 = clientWidth;
                float f10 = i14;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i12) * 1.0f) / f4) - 0.5f) * 0.47123894f)) * f10) + f10;
                int abs2 = Math.abs(i10);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f16759e.getClass();
                    abs = (int) (((Math.abs(i12) / ((f4 * 1.0f) + this.f16729A)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f16774y = false;
                this.f16773x.startScroll(i11, scrollY, i12, i13, min);
                WeakHashMap weakHashMap = K.f26642a;
                postInvalidateOnAnimation();
            }
        }
        if (z10) {
            f(i7);
        }
    }

    public final void u(int i7, int i10, boolean z8, boolean z10) {
        AbstractC1076a abstractC1076a = this.f16759e;
        if (abstractC1076a == null || abstractC1076a.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f16753b;
        if (!z10 && this.f16761f == i7 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 >= this.f16759e.c()) {
            i7 = this.f16759e.c() - 1;
        }
        int i11 = this.f16739K;
        int i12 = this.f16761f;
        if (i7 > i12 + i11 || i7 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((C1080e) arrayList.get(i13)).f16716c = true;
            }
        }
        boolean z11 = this.f16761f != i7;
        if (!this.f16762f0) {
            q(i7);
            t(i7, i10, z8, z11);
        } else {
            this.f16761f = i7;
            if (z11) {
                f(i7);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16730B;
    }
}
