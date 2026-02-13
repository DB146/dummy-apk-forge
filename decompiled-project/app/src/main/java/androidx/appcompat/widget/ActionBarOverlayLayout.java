package androidx.appcompat.widget;

import A9.C0076d1;
import H2.O;
import Q5.e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import com.kt.apps.media.xemtv.beta.R;
import i.G;
import java.util.WeakHashMap;
import m.C1528j;
import n.InterfaceC1689w;
import n.MenuC1678l;
import o.C1728d;
import o.C1730e;
import o.C1740j;
import o.InterfaceC1726c;
import o.InterfaceC1729d0;
import o.InterfaceC1731e0;
import o.P0;
import o.RunnableC1724b;
import o.U0;
import q1.C1876b;
import y1.AbstractC2352B;
import y1.AbstractC2377z;
import y1.InterfaceC2364l;
import y1.InterfaceC2365m;
import y1.K;
import y1.b0;
import y1.c0;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.m0;
import y1.p0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1729d0, InterfaceC2364l, InterfaceC2365m {

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f12943Q = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: R, reason: collision with root package name */
    public static final p0 f12944R;

    /* renamed from: S, reason: collision with root package name */
    public static final Rect f12945S;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f12946A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f12947B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f12948C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f12949D;

    /* renamed from: E, reason: collision with root package name */
    public p0 f12950E;

    /* renamed from: F, reason: collision with root package name */
    public p0 f12951F;

    /* renamed from: G, reason: collision with root package name */
    public p0 f12952G;

    /* renamed from: H, reason: collision with root package name */
    public p0 f12953H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC1726c f12954I;

    /* renamed from: J, reason: collision with root package name */
    public OverScroller f12955J;

    /* renamed from: K, reason: collision with root package name */
    public ViewPropertyAnimator f12956K;
    public final C0076d1 L;

    /* renamed from: M, reason: collision with root package name */
    public final RunnableC1724b f12957M;

    /* renamed from: N, reason: collision with root package name */
    public final RunnableC1724b f12958N;

    /* renamed from: O, reason: collision with root package name */
    public final O f12959O;

    /* renamed from: P, reason: collision with root package name */
    public final C1730e f12960P;

    /* renamed from: a, reason: collision with root package name */
    public int f12961a;

    /* renamed from: b, reason: collision with root package name */
    public int f12962b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f12963c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f12964d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1731e0 f12965e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f12966f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12967u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12968v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12969w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12970x;

    /* renamed from: y, reason: collision with root package name */
    public int f12971y;

    /* renamed from: z, reason: collision with root package name */
    public int f12972z;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f0 e0Var = i7 >= 34 ? new e0() : i7 >= 30 ? new d0() : i7 >= 29 ? new c0() : new b0();
        e0Var.g(C1876b.b(0, 1, 0, 1));
        f12944R = e0Var.b();
        f12945S = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [o.e, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12962b = 0;
        this.f12946A = new Rect();
        this.f12947B = new Rect();
        this.f12948C = new Rect();
        this.f12949D = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        p0 p0Var = p0.f26730b;
        this.f12950E = p0Var;
        this.f12951F = p0Var;
        this.f12952G = p0Var;
        this.f12953H = p0Var;
        this.L = new C0076d1(this, 8);
        this.f12957M = new RunnableC1724b(this, 0);
        this.f12958N = new RunnableC1724b(this, 1);
        f(context);
        this.f12959O = new O(9);
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f12960P = view;
        addView(view);
    }

    public static boolean d(View view, Rect rect, boolean z8) {
        boolean z10;
        C1728d c1728d = (C1728d) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c1728d).leftMargin;
        int i10 = rect.left;
        if (i7 != i10) {
            ((ViewGroup.MarginLayoutParams) c1728d).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c1728d).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c1728d).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) c1728d).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) c1728d).rightMargin = i14;
            z10 = true;
        }
        if (z8) {
            int i15 = ((ViewGroup.MarginLayoutParams) c1728d).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) c1728d).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    @Override // y1.InterfaceC2364l
    public final void a(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // y1.InterfaceC2364l
    public final void b(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // y1.InterfaceC2364l
    public final void c(View view, int i7, int i10, int[] iArr, int i11) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1728d;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f12966f != null) {
            if (this.f12964d.getVisibility() == 0) {
                i7 = (int) (this.f12964d.getTranslationY() + this.f12964d.getBottom() + 0.5f);
            } else {
                i7 = 0;
            }
            this.f12966f.setBounds(0, i7, getWidth(), this.f12966f.getIntrinsicHeight() + i7);
            this.f12966f.draw(canvas);
        }
    }

    public final void e() {
        removeCallbacks(this.f12957M);
        removeCallbacks(this.f12958N);
        ViewPropertyAnimator viewPropertyAnimator = this.f12956K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void f(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f12943Q);
        this.f12961a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f12966f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f12955J = new OverScroller(context);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // y1.InterfaceC2365m
    public final void g(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        h(view, i7, i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f12964d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        O o10 = this.f12959O;
        return o10.f4604c | o10.f4603b;
    }

    public CharSequence getTitle() {
        k();
        return ((U0) this.f12965e).f21436a.getTitle();
    }

    @Override // y1.InterfaceC2364l
    public final void h(View view, int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i7, i10, i11, i12);
        }
    }

    @Override // y1.InterfaceC2364l
    public final boolean i(View view, View view2, int i7, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i7);
    }

    public final void j(int i7) {
        k();
        if (i7 == 2) {
            ((U0) this.f12965e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i7 == 5) {
            ((U0) this.f12965e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC1731e0 wrapper;
        if (this.f12963c == null) {
            this.f12963c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f12964d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1731e0) {
                wrapper = (InterfaceC1731e0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f12965e = wrapper;
        }
    }

    public final void l(MenuC1678l menuC1678l, InterfaceC1689w interfaceC1689w) {
        k();
        U0 u02 = (U0) this.f12965e;
        C1740j c1740j = u02.f21445m;
        Toolbar toolbar = u02.f21436a;
        if (c1740j == null) {
            u02.f21445m = new C1740j(toolbar.getContext());
        }
        C1740j c1740j2 = u02.f21445m;
        c1740j2.f21519e = interfaceC1689w;
        if (menuC1678l == null && toolbar.f13079a == null) {
            return;
        }
        toolbar.f();
        MenuC1678l menuC1678l2 = toolbar.f13079a.f12973D;
        if (menuC1678l2 == menuC1678l) {
            return;
        }
        if (menuC1678l2 != null) {
            menuC1678l2.r(toolbar.f13082b0);
            menuC1678l2.r(toolbar.f13084c0);
        }
        if (toolbar.f13084c0 == null) {
            toolbar.f13084c0 = new P0(toolbar);
        }
        c1740j2.f21508E = true;
        if (menuC1678l != null) {
            menuC1678l.b(c1740j2, toolbar.f13096x);
            menuC1678l.b(toolbar.f13084c0, toolbar.f13096x);
        } else {
            c1740j2.g(toolbar.f13096x, null);
            toolbar.f13084c0.g(toolbar.f13096x, null);
            c1740j2.d();
            toolbar.f13084c0.d();
        }
        toolbar.f13079a.setPopupTheme(toolbar.f13097y);
        toolbar.f13079a.setPresenter(c1740j2);
        toolbar.f13082b0 = c1740j2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        p0 h10 = p0.h(this, windowInsets);
        boolean d10 = d(this.f12964d, new Rect(h10.b(), h10.d(), h10.c(), h10.a()), false);
        WeakHashMap weakHashMap = K.f26642a;
        Rect rect = this.f12946A;
        AbstractC2352B.b(this, h10, rect);
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        m0 m0Var = h10.f26731a;
        p0 n6 = m0Var.n(i7, i10, i11, i12);
        this.f12950E = n6;
        boolean z8 = true;
        if (!this.f12951F.equals(n6)) {
            this.f12951F = this.f12950E;
            d10 = true;
        }
        Rect rect2 = this.f12947B;
        if (rect2.equals(rect)) {
            z8 = d10;
        } else {
            rect2.set(rect);
        }
        if (z8) {
            requestLayout();
        }
        return m0Var.a().f26731a.c().f26731a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(getContext());
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2377z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C1728d c1728d = (C1728d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) c1728d).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) c1728d).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f12964d, i7, 0, i10, 0);
        C1728d c1728d = (C1728d) this.f12964d.getLayoutParams();
        int max = Math.max(0, this.f12964d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1728d).leftMargin + ((ViewGroup.MarginLayoutParams) c1728d).rightMargin);
        int max2 = Math.max(0, this.f12964d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1728d).topMargin + ((ViewGroup.MarginLayoutParams) c1728d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f12964d.getMeasuredState());
        WeakHashMap weakHashMap = K.f26642a;
        boolean z8 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z8) {
            measuredHeight = this.f12961a;
            if (this.f12968v && this.f12964d.getTabContainer() != null) {
                measuredHeight += this.f12961a;
            }
        } else {
            measuredHeight = this.f12964d.getVisibility() != 8 ? this.f12964d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f12946A;
        Rect rect2 = this.f12948C;
        rect2.set(rect);
        this.f12952G = this.f12950E;
        if (!this.f12967u && !z8) {
            C1730e c1730e = this.f12960P;
            p0 p0Var = f12944R;
            Rect rect3 = this.f12949D;
            AbstractC2352B.b(c1730e, p0Var, rect3);
            if (!rect3.equals(f12945S)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f12952G = this.f12952G.f26731a.n(0, measuredHeight, 0, 0);
                d(this.f12963c, rect2, true);
                if (!this.f12953H.equals(this.f12952G)) {
                    p0 p0Var2 = this.f12952G;
                    this.f12953H = p0Var2;
                    K.b(this.f12963c, p0Var2);
                }
                measureChildWithMargins(this.f12963c, i7, 0, i10, 0);
                C1728d c1728d2 = (C1728d) this.f12963c.getLayoutParams();
                int max3 = Math.max(max, this.f12963c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1728d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1728d2).rightMargin);
                int max4 = Math.max(max2, this.f12963c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1728d2).topMargin + ((ViewGroup.MarginLayoutParams) c1728d2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f12963c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i10, combineMeasuredStates2 << 16));
            }
        }
        C1876b b2 = C1876b.b(this.f12952G.b(), this.f12952G.d() + measuredHeight, this.f12952G.c(), this.f12952G.a());
        p0 p0Var3 = this.f12952G;
        int i11 = Build.VERSION.SDK_INT;
        f0 e0Var = i11 >= 34 ? new e0(p0Var3) : i11 >= 30 ? new d0(p0Var3) : i11 >= 29 ? new c0(p0Var3) : new b0(p0Var3);
        e0Var.g(b2);
        this.f12952G = e0Var.b();
        d(this.f12963c, rect2, true);
        if (!this.f12953H.equals(this.f12952G)) {
        }
        measureChildWithMargins(this.f12963c, i7, 0, i10, 0);
        C1728d c1728d22 = (C1728d) this.f12963c.getLayoutParams();
        int max32 = Math.max(max, this.f12963c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1728d22).leftMargin + ((ViewGroup.MarginLayoutParams) c1728d22).rightMargin);
        int max42 = Math.max(max2, this.f12963c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1728d22).topMargin + ((ViewGroup.MarginLayoutParams) c1728d22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f12963c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i7, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i10, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f10, boolean z8) {
        if (!this.f12969w || !z8) {
            return false;
        }
        this.f12955J.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
        if (this.f12955J.getFinalY() > this.f12964d.getHeight()) {
            e();
            this.f12958N.run();
        } else {
            e();
            this.f12957M.run();
        }
        this.f12970x = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        int i13 = this.f12971y + i10;
        this.f12971y = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        G g;
        C1528j c1528j;
        this.f12959O.f4603b = i7;
        this.f12971y = getActionBarHideOffset();
        e();
        InterfaceC1726c interfaceC1726c = this.f12954I;
        if (interfaceC1726c == null || (c1528j = (g = (G) interfaceC1726c).f18019v) == null) {
            return;
        }
        c1528j.a();
        g.f18019v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f12964d.getVisibility() != 0) {
            return false;
        }
        return this.f12969w;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f12969w || this.f12970x) {
            return;
        }
        if (this.f12971y <= this.f12964d.getHeight()) {
            e();
            postDelayed(this.f12957M, 600L);
        } else {
            e();
            postDelayed(this.f12958N, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        k();
        int i10 = this.f12972z ^ i7;
        this.f12972z = i7;
        boolean z8 = (i7 & 4) == 0;
        boolean z10 = (i7 & 256) != 0;
        InterfaceC1726c interfaceC1726c = this.f12954I;
        if (interfaceC1726c != null) {
            G g = (G) interfaceC1726c;
            g.f18015r = !z10;
            if (z8 || !z10) {
                if (g.f18016s) {
                    g.f18016s = false;
                    g.b0(true);
                }
            } else if (!g.f18016s) {
                g.f18016s = true;
                g.b0(true);
            }
        }
        if ((i10 & 256) == 0 || this.f12954I == null) {
            return;
        }
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2377z.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f12962b = i7;
        InterfaceC1726c interfaceC1726c = this.f12954I;
        if (interfaceC1726c != null) {
            ((G) interfaceC1726c).f18014q = i7;
        }
    }

    public void setActionBarHideOffset(int i7) {
        e();
        this.f12964d.setTranslationY(-Math.max(0, Math.min(i7, this.f12964d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1726c interfaceC1726c) {
        this.f12954I = interfaceC1726c;
        if (getWindowToken() != null) {
            ((G) this.f12954I).f18014q = this.f12962b;
            int i7 = this.f12972z;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap weakHashMap = K.f26642a;
                AbstractC2377z.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.f12968v = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f12969w) {
            this.f12969w = z8;
            if (z8) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        k();
        U0 u02 = (U0) this.f12965e;
        u02.f21439d = i7 != 0 ? e.x(u02.f21436a.getContext(), i7) : null;
        u02.c();
    }

    public void setIcon(Drawable drawable) {
        k();
        U0 u02 = (U0) this.f12965e;
        u02.f21439d = drawable;
        u02.c();
    }

    public void setLogo(int i7) {
        k();
        U0 u02 = (U0) this.f12965e;
        u02.f21440e = i7 != 0 ? e.x(u02.f21436a.getContext(), i7) : null;
        u02.c();
    }

    public void setOverlayMode(boolean z8) {
        this.f12967u = z8;
    }

    public void setShowingForActionMode(boolean z8) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // o.InterfaceC1729d0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((U0) this.f12965e).k = callback;
    }

    @Override // o.InterfaceC1729d0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        U0 u02 = (U0) this.f12965e;
        if (u02.g) {
            return;
        }
        u02.f21442h = charSequence;
        if ((u02.f21437b & 8) != 0) {
            Toolbar toolbar = u02.f21436a;
            toolbar.setTitle(charSequence);
            if (u02.g) {
                K.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
