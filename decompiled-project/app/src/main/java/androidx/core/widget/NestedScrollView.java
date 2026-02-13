package androidx.core.widget;

import C1.c;
import C1.e;
import C1.f;
import C1.g;
import C1.h;
import C1.j;
import H2.O;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import g3.C1191j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import vc.i;
import y1.AbstractC2352B;
import y1.AbstractC2372u;
import y1.C2360h;
import y1.C2363k;
import y1.C2370s;
import y1.C2373v;
import y1.InterfaceC2365m;
import y1.K;
import y1.L;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC2365m {

    /* renamed from: Q, reason: collision with root package name */
    public static final float f13283Q = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: R, reason: collision with root package name */
    public static final e f13284R = new e(0);

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f13285S = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public VelocityTracker f13286A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13287B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13288C;

    /* renamed from: D, reason: collision with root package name */
    public final int f13289D;

    /* renamed from: E, reason: collision with root package name */
    public final int f13290E;

    /* renamed from: F, reason: collision with root package name */
    public final int f13291F;

    /* renamed from: G, reason: collision with root package name */
    public int f13292G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f13293H;

    /* renamed from: I, reason: collision with root package name */
    public final int[] f13294I;

    /* renamed from: J, reason: collision with root package name */
    public int f13295J;

    /* renamed from: K, reason: collision with root package name */
    public int f13296K;
    public h L;

    /* renamed from: M, reason: collision with root package name */
    public final O f13297M;

    /* renamed from: N, reason: collision with root package name */
    public final C2363k f13298N;

    /* renamed from: O, reason: collision with root package name */
    public float f13299O;

    /* renamed from: P, reason: collision with root package name */
    public final C2360h f13300P;

    /* renamed from: a, reason: collision with root package name */
    public final float f13301a;

    /* renamed from: b, reason: collision with root package name */
    public long f13302b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f13303c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f13304d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f13305e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f13306f;

    /* renamed from: u, reason: collision with root package name */
    public C2370s f13307u;

    /* renamed from: v, reason: collision with root package name */
    public int f13308v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13309w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13310x;

    /* renamed from: y, reason: collision with root package name */
    public View f13311y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13312z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.nestedScrollViewStyle);
        this.f13303c = new Rect();
        this.f13309w = true;
        this.f13310x = false;
        this.f13311y = null;
        this.f13312z = false;
        this.f13288C = true;
        this.f13292G = -1;
        this.f13293H = new int[2];
        this.f13294I = new int[2];
        this.f13300P = new C2360h(getContext(), new C1191j(this, 3));
        int i7 = Build.VERSION.SDK_INT;
        this.f13305e = i7 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f13306f = i7 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f13301a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f13304d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f13289D = viewConfiguration.getScaledTouchSlop();
        this.f13290E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13291F = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13285S, com.kt.apps.media.xemtv.beta.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f13297M = new O(9);
        this.f13298N = new C2363k(this);
        setNestedScrollingEnabled(true);
        K.n(this, f13284R);
    }

    private C2370s getScrollFeedbackProvider() {
        if (this.f13307u == null) {
            this.f13307u = new C2370s(this);
        }
        return this.f13307u;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // y1.InterfaceC2364l
    public final void a(View view, View view2, int i7, int i10) {
        O o10 = this.f13297M;
        if (i10 == 1) {
            o10.f4604c = i7;
        } else {
            o10.f4603b = i7;
        }
        this.f13298N.g(2, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // y1.InterfaceC2364l
    public final void b(View view, int i7) {
        O o10 = this.f13297M;
        if (i7 == 1) {
            o10.f4604c = 0;
        } else {
            o10.f4603b = 0;
        }
        w(i7);
    }

    @Override // y1.InterfaceC2364l
    public final void c(View view, int i7, int i10, int[] iArr, int i11) {
        this.f13298N.c(i7, i10, i11, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i7;
        if (this.f13304d.isFinished()) {
            return;
        }
        this.f13304d.computeScrollOffset();
        int currY = this.f13304d.getCurrY();
        int i10 = currY - this.f13296K;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f13306f;
        EdgeEffect edgeEffect2 = this.f13305e;
        if (i10 <= 0 || i.s(edgeEffect2) == 0.0f) {
            if (i10 < 0 && i.s(edgeEffect) != 0.0f) {
                float f4 = height;
                round = Math.round(i.G(edgeEffect, (i10 * 4.0f) / f4, 0.5f) * (f4 / 4.0f));
                if (round != i10) {
                    edgeEffect.finish();
                }
            }
            this.f13296K = currY;
            int[] iArr = this.f13294I;
            iArr[1] = 0;
            this.f13298N.c(0, i10, 1, iArr, null);
            i7 = i10 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f13304d.getCurrVelocity()));
            }
            if (i7 != 0) {
                int scrollY = getScrollY();
                p(i7, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i7 - scrollY2;
                iArr[1] = 0;
                this.f13298N.d(0, scrollY2, 0, i11, this.f13293H, 1, iArr);
                i7 = i11 - iArr[1];
            }
            if (i7 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i7 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f13304d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f13304d.getCurrVelocity());
                    }
                }
                this.f13304d.abortAnimation();
                w(1);
            }
            if (this.f13304d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(i.G(edgeEffect2, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i10) {
            edgeEffect2.finish();
        }
        i10 -= round;
        this.f13296K = currY;
        int[] iArr2 = this.f13294I;
        iArr2[1] = 0;
        this.f13298N.c(0, i10, 1, iArr2, null);
        i7 = i10 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i7 != 0) {
        }
        if (i7 != 0) {
        }
        if (this.f13304d.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f13303c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(e(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus == null || !findFocus.isFocused() || m(findFocus, 0, getHeight())) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f10, boolean z8) {
        return this.f13298N.a(f4, f10, z8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f10) {
        return this.f13298N.b(f4, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return this.f13298N.c(i7, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return this.f13298N.d(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f13305e;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f13306f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i10 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean f(KeyEvent keyEvent) {
        this.f13303c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : d(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(130) : d(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // y1.InterfaceC2365m
    public final void g(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        n(i12, i13, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        O o10 = this.f13297M;
        return o10.f4604c | o10.f4603b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f13299O == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f13299O = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f13299O;
    }

    @Override // y1.InterfaceC2364l
    public final void h(View view, int i7, int i10, int i11, int i12, int i13) {
        n(i12, i13, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f13298N.f(0);
    }

    @Override // y1.InterfaceC2364l
    public final boolean i(View view, View view2, int i7, int i10) {
        return (i7 & 2) != 0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f13298N.f26721d;
    }

    public final void j(int i7) {
        if (getChildCount() > 0) {
            this.f13304d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 0);
            this.f13298N.g(2, 1);
            this.f13296K = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f13304d.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i7) {
        int childCount;
        boolean z8 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f13303c;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i7, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i7, int i10) {
        Rect rect = this.f13303c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i10;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i7, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f13298N.d(0, scrollY2, 0, i7 - scrollY2, null, i10, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13292G) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f13308v = (int) motionEvent.getY(i7);
            this.f13292G = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f13286A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13310x = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x00db, code lost:
    
        if (r5 >= 0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        int i7;
        int i10;
        int i11;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c10;
        boolean z8;
        float f10;
        float f11;
        long j;
        float sqrt;
        int i12;
        float[] fArr;
        int i13;
        float f12;
        if (motionEvent.getAction() != 8 || this.f13312z) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            f4 = motionEvent.getAxisValue(9);
            i10 = 9;
            i7 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f4 = motionEvent.getAxisValue(26);
            i7 = getWidth() / 2;
            i10 = 26;
        } else {
            f4 = 0.0f;
            i7 = 0;
            i10 = 0;
        }
        if (f4 == 0.0f) {
            return false;
        }
        int i14 = i10;
        s(-((int) (getVerticalScrollFactorCompat() * f4)), i10, motionEvent, i7, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i14 == 0) {
            return true;
        }
        C2360h c2360h = this.f13300P;
        c2360h.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i15 = c2360h.f26711f;
        int[] iArr = c2360h.f26712h;
        if (i15 == source && c2360h.g == deviceId && c2360h.f26710e == i14) {
            c10 = 0;
            z8 = false;
        } else {
            Context context = c2360h.f26706a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 34) {
                Method method = L.f26648a;
                i11 = j.f(viewConfiguration, deviceId2, i14, source2);
            } else {
                Method method2 = L.f26648a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i14, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i14 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i11 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i11 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            iArr[0] = i11;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i16 >= 34) {
                scaledMaximumFlingVelocity = j.e(viewConfiguration, deviceId3, i14, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                int i17 = Integer.MIN_VALUE;
                if ((device2 == null || device2.getMotionRange(i14, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i14 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0 && (dimensionPixelSize = resources2.getDimensionPixelSize(identifier2)) >= 0) {
                        i17 = dimensionPixelSize;
                    }
                }
                scaledMaximumFlingVelocity = i17;
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c2360h.f26711f = source;
            c2360h.g = deviceId;
            c2360h.f26710e = i14;
            c10 = 0;
            z8 = true;
        }
        if (iArr[c10] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = c2360h.f26708c;
            if (velocityTracker == null) {
                return true;
            }
            velocityTracker.recycle();
            c2360h.f26708c = null;
            return true;
        }
        if (c2360h.f26708c == null) {
            c2360h.f26708c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = c2360h.f26708c;
        Map map = AbstractC2372u.f26738a;
        velocityTracker2.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC2372u.f26738a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C2373v());
            }
            C2373v c2373v = (C2373v) map2.get(velocityTracker2);
            c2373v.getClass();
            long eventTime = motionEvent.getEventTime();
            int i18 = c2373v.f26742d;
            long[] jArr = c2373v.f26740b;
            if (i18 != 0 && eventTime - jArr[c2373v.f26743e] > 40) {
                c2373v.f26742d = 0;
                c2373v.f26741c = 0.0f;
            }
            int i19 = (c2373v.f26743e + 1) % 20;
            c2373v.f26743e = i19;
            int i20 = c2373v.f26742d;
            if (i20 != 20) {
                c2373v.f26742d = i20 + 1;
            }
            c2373v.f26739a[i19] = motionEvent.getAxisValue(26);
            jArr[c2373v.f26743e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C2373v c2373v2 = (C2373v) AbstractC2372u.f26738a.get(velocityTracker2);
        if (c2373v2 != null) {
            int i21 = c2373v2.f26742d;
            if (i21 >= 2) {
                int i22 = c2373v2.f26743e;
                int i23 = ((i22 + 20) - (i21 - 1)) % 20;
                long[] jArr2 = c2373v2.f26740b;
                long j10 = jArr2[i22];
                while (true) {
                    j = jArr2[i23];
                    if (j10 - j <= 100) {
                        break;
                    }
                    c2373v2.f26742d--;
                    i23 = (i23 + 1) % 20;
                }
                int i24 = c2373v2.f26742d;
                if (i24 >= 2) {
                    float[] fArr2 = c2373v2.f26739a;
                    if (i24 == 2) {
                        int i25 = (i23 + 1) % 20;
                        long j11 = jArr2[i25];
                        if (j != j11) {
                            float f13 = fArr2[i25] / ((float) (j11 - j));
                            i12 = 1000;
                            sqrt = f13;
                        }
                    } else {
                        float f14 = 0.0f;
                        int i26 = 0;
                        int i27 = 0;
                        while (true) {
                            if (i26 >= c2373v2.f26742d - 1) {
                                break;
                            }
                            int i28 = i26 + i23;
                            long j12 = jArr2[i28 % 20];
                            int i29 = (i28 + 1) % 20;
                            if (jArr2[i29] == j12) {
                                fArr = fArr2;
                                i13 = 1;
                            } else {
                                i27++;
                                fArr = fArr2;
                                float sqrt2 = (f14 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f14) * 2.0f));
                                float f15 = fArr[i29] / ((float) (jArr2[i29] - j12));
                                float abs = (Math.abs(f15) * (f15 - sqrt2)) + f14;
                                i13 = 1;
                                if (i27 == 1) {
                                    abs *= 0.5f;
                                }
                                f14 = abs;
                            }
                            i26 += i13;
                            fArr2 = fArr;
                        }
                        sqrt = ((float) Math.sqrt(Math.abs(f14) * 2.0f)) * (f14 < 0.0f ? -1.0f : 1.0f);
                        i12 = 1000;
                    }
                    f12 = sqrt * i12;
                    c2373v2.f26741c = f12;
                    if (f12 >= (-Math.abs(Float.MAX_VALUE))) {
                        c2373v2.f26741c = -Math.abs(Float.MAX_VALUE);
                    } else if (c2373v2.f26741c > Math.abs(Float.MAX_VALUE)) {
                        c2373v2.f26741c = Math.abs(Float.MAX_VALUE);
                    }
                }
            }
            i12 = 1000;
            sqrt = 0.0f;
            f12 = sqrt * i12;
            c2373v2.f26741c = f12;
            if (f12 >= (-Math.abs(Float.MAX_VALUE))) {
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f10 = j.b(velocityTracker2, i14);
        } else if (i14 == 0) {
            f10 = velocityTracker2.getXVelocity();
        } else if (i14 == 1) {
            f10 = velocityTracker2.getYVelocity();
        } else {
            C2373v c2373v3 = (C2373v) AbstractC2372u.f26738a.get(velocityTracker2);
            f10 = (c2373v3 == null || i14 != 26) ? 0.0f : c2373v3.f26741c;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c2360h.f26707b.f17441b;
        float f16 = f10 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f16);
        if (z8 || (signum != Math.signum(c2360h.f26709d) && signum != 0.0f)) {
            nestedScrollView.f13304d.abortAnimation();
        }
        if (Math.abs(f16) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r4, Math.min(f16, iArr[1]));
        if (max == 0.0f) {
            f11 = 0.0f;
        } else {
            nestedScrollView.f13304d.abortAnimation();
            nestedScrollView.j((int) max);
            f11 = max;
        }
        c2360h.f26709d = f11;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action == 2 && this.f13312z) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i10 = this.f13292G;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f13308v) > this.f13289D && (2 & getNestedScrollAxes()) == 0) {
                                this.f13312z = true;
                                this.f13308v = y10;
                                if (this.f13286A == null) {
                                    this.f13286A = VelocityTracker.obtain();
                                }
                                this.f13286A.addMovement(motionEvent);
                                this.f13295J = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f13312z = false;
            this.f13292G = -1;
            VelocityTracker velocityTracker = this.f13286A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f13286A = null;
            }
            if (this.f13304d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f13308v = y11;
                    this.f13292G = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f13286A;
                    if (velocityTracker2 == null) {
                        this.f13286A = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f13286A.addMovement(motionEvent);
                    this.f13304d.computeScrollOffset();
                    if (!v(motionEvent) && this.f13304d.isFinished()) {
                        z8 = false;
                    }
                    this.f13312z = z8;
                    this.f13298N.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f13304d.isFinished()) {
                z8 = false;
            }
            this.f13312z = z8;
            VelocityTracker velocityTracker3 = this.f13286A;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f13286A = null;
            }
        }
        return this.f13312z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z8, i7, i10, i11, i12);
        int i14 = 0;
        this.f13309w = false;
        View view = this.f13311y;
        if (view != null && l(view, this)) {
            View view2 = this.f13311y;
            Rect rect = this.f13303c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int e2 = e(rect);
            if (e2 != 0) {
                scrollBy(0, e2);
            }
        }
        this.f13311y = null;
        if (!this.f13310x) {
            if (this.L != null) {
                scrollTo(getScrollX(), this.L.f2477a);
                this.L = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f13310x = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f13287B && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f10, boolean z8) {
        if (z8) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        j((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f10) {
        return this.f13298N.b(f4, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        this.f13298N.c(i7, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        n(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i10, boolean z8, boolean z10) {
        super.scrollTo(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus != null && m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i7, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.L = hVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, C1.h] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f2477a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f13303c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int e2 = e(rect);
        if (e2 != 0) {
            if (this.f13288C) {
                u(false, 0, e2);
            } else {
                scrollBy(0, e2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return i(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float G9;
        int round;
        int i7;
        ViewParent parent2;
        if (this.f13286A == null) {
            this.f13286A = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13295J = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f4 = 0.0f;
        obtain.offsetLocation(0.0f, this.f13295J);
        C2363k c2363k = this.f13298N;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f13306f;
            EdgeEffect edgeEffect2 = this.f13305e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f13286A;
                velocityTracker.computeCurrentVelocity(1000, this.f13291F);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f13292G);
                if (Math.abs(yVelocity) >= this.f13290E) {
                    if (i.s(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (i.s(edgeEffect) != 0.0f) {
                        int i10 = -yVelocity;
                        if (t(edgeEffect, i10)) {
                            edgeEffect.onAbsorb(i10);
                        } else {
                            j(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f10 = i11;
                        if (!c2363k.b(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            j(i11);
                        }
                    }
                } else if (this.f13304d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f13292G = -1;
                this.f13312z = false;
                VelocityTracker velocityTracker2 = this.f13286A;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f13286A = null;
                }
                w(0);
                this.f13305e.onRelease();
                this.f13306f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f13292G);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f13292G + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(findPointerIndex);
                    int i12 = this.f13308v - y10;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (i.s(edgeEffect2) != 0.0f) {
                        G9 = -i.G(edgeEffect2, -height, x2);
                        if (i.s(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        if (i.s(edgeEffect) != 0.0f) {
                            G9 = i.G(edgeEffect, height, 1.0f - x2);
                            if (i.s(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                        }
                        round = Math.round(f4 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i7 = i12 - round;
                        if (!this.f13312z && Math.abs(i7) > this.f13289D) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f13312z = true;
                            i7 = i7 <= 0 ? i7 - this.f13289D : i7 + this.f13289D;
                        }
                        if (this.f13312z) {
                            int s3 = s(i7, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f13308v = y10 - s3;
                            this.f13295J += s3;
                        }
                    }
                    f4 = G9;
                    round = Math.round(f4 * getHeight());
                    if (round != 0) {
                    }
                    i7 = i12 - round;
                    if (!this.f13312z) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f13312z = true;
                        if (i7 <= 0) {
                        }
                    }
                    if (this.f13312z) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f13312z && getChildCount() > 0 && this.f13304d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f13292G = -1;
                this.f13312z = false;
                VelocityTracker velocityTracker3 = this.f13286A;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f13286A = null;
                }
                w(0);
                this.f13305e.onRelease();
                this.f13306f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f13308v = (int) motionEvent.getY(actionIndex);
                this.f13292G = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f13308v = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f13292G));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f13312z && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f13304d.isFinished()) {
                this.f13304d.abortAnimation();
                w(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f13308v = y11;
            this.f13292G = pointerId;
            c2363k.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f13286A;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i7, int i10, int i11, int i12) {
        boolean z8;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i13 = i11 + i7;
        if (i10 <= 0 && i10 >= 0) {
            z8 = false;
        } else {
            i10 = 0;
            z8 = true;
        }
        if (i13 <= i12) {
            if (i13 >= 0) {
                i12 = i13;
                z10 = false;
                if (z10 && !this.f13298N.f(1)) {
                    this.f13304d.springBack(i10, i12, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i10, i12);
                return z8 || z10;
            }
            i12 = 0;
        }
        z10 = true;
        if (z10) {
            this.f13304d.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i12);
        if (z8) {
            return true;
        }
    }

    public final void q(int i7) {
        boolean z8 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f13303c;
        if (z8) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        r(i7, i10, i11);
    }

    public final boolean r(int i7, int i10, int i11) {
        boolean z8;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z10 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i10 < scrollY || i11 > i12) {
            s(z10 ? i10 - scrollY : i11 - i12, -1, null, 0, 1, true);
            z8 = true;
        } else {
            z8 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i7);
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f13309w) {
            this.f13311y = view2;
        } else {
            Rect rect = this.f13303c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int e2 = e(rect);
            if (e2 != 0) {
                scrollBy(0, e2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e2 = e(rect);
        boolean z10 = e2 != 0;
        if (z10) {
            if (z8) {
                scrollBy(0, e2);
            } else {
                u(false, 0, e2);
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        VelocityTracker velocityTracker;
        if (z8 && (velocityTracker = this.f13286A) != null) {
            velocityTracker.recycle();
            this.f13286A = null;
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f13309w = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(int i7, int i10, MotionEvent motionEvent, int i11, int i12, boolean z8) {
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        C2363k c2363k = this.f13298N;
        if (i12 == 1) {
            c2363k.g(2, i12);
        }
        boolean c10 = this.f13298N.c(0, i7, i12, this.f13294I, this.f13293H);
        int[] iArr = this.f13294I;
        int[] iArr2 = this.f13293H;
        if (c10) {
            i13 = i7 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i7;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z12 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z8;
        boolean z13 = p(i13, 0, scrollY, scrollRange) && !c2363k.f(i12);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f26734a.p(motionEvent.getDeviceId(), motionEvent.getSource(), i10, scrollY2);
        }
        iArr[1] = 0;
        this.f13298N.d(0, scrollY2, 0, i13 - scrollY2, this.f13293H, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f13306f;
        EdgeEffect edgeEffect2 = this.f13305e;
        if (i17 < 0) {
            if (z12) {
                i.G(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f26734a.a(motionEvent.getDeviceId(), motionEvent.getSource(), i10, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            i.G(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (motionEvent != null) {
                z10 = false;
                getScrollFeedbackProvider().f26734a.a(motionEvent.getDeviceId(), motionEvent.getSource(), i10, false);
            } else {
                z10 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z11 = z10;
            } else {
                z11 = z13;
            }
            if (z11 && i12 == 0 && (velocityTracker = this.f13286A) != null) {
                velocityTracker.clear();
            }
            if (i12 == 1) {
                w(i12);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i15;
        }
        z10 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z11 = z10;
        if (z11) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i7 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i10);
        }
    }

    public void setFillViewport(boolean z8) {
        if (z8 != this.f13287B) {
            this.f13287B = z8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        C2363k c2363k = this.f13298N;
        if (c2363k.f26721d) {
            WeakHashMap weakHashMap = K.f26642a;
            AbstractC2352B.o(c2363k.f26720c);
        }
        c2363k.f26721d = z8;
    }

    public void setOnScrollChangeListener(g gVar) {
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f13288C = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return this.f13298N.g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float s3 = i.s(edgeEffect) * getHeight();
        float abs = Math.abs(-i7) * 0.35f;
        float f4 = this.f13301a * 0.015f;
        double log = Math.log(abs / f4);
        double d10 = f13283Q;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f4))) < s3;
    }

    public final void u(boolean z8, int i7, int i10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f13302b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f13304d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z8) {
                this.f13298N.g(2, 1);
            } else {
                w(1);
            }
            this.f13296K = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f13304d.isFinished()) {
                this.f13304d.abortAnimation();
                w(1);
            }
            scrollBy(i7, i10);
        }
        this.f13302b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z8;
        EdgeEffect edgeEffect = this.f13305e;
        if (i.s(edgeEffect) != 0.0f) {
            i.G(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z8 = true;
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.f13306f;
        if (i.s(edgeEffect2) == 0.0f) {
            return z8;
        }
        i.G(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i7) {
        this.f13298N.h(i7);
    }
}
