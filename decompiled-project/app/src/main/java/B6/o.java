package B6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.leanback.tab.LeanbackTabLayout;
import c6.AbstractC0911a;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import e3.AbstractC1076a;
import e3.AbstractC1084i;
import h.AbstractC1213a;
import h3.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import x1.C2258b;
import y1.AbstractC2352B;
import y1.C2355c;
import y1.K;
import y6.C2401g;

/* loaded from: classes.dex */
public abstract class o extends HorizontalScrollView {

    /* renamed from: n0, reason: collision with root package name */
    public static final C2258b f2152n0 = new C2258b(16);

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2153A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2154B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f2155C;

    /* renamed from: D, reason: collision with root package name */
    public int f2156D;

    /* renamed from: E, reason: collision with root package name */
    public final PorterDuff.Mode f2157E;

    /* renamed from: F, reason: collision with root package name */
    public final float f2158F;

    /* renamed from: G, reason: collision with root package name */
    public final float f2159G;

    /* renamed from: H, reason: collision with root package name */
    public final int f2160H;

    /* renamed from: I, reason: collision with root package name */
    public int f2161I;

    /* renamed from: J, reason: collision with root package name */
    public final int f2162J;

    /* renamed from: K, reason: collision with root package name */
    public final int f2163K;
    public final int L;

    /* renamed from: M, reason: collision with root package name */
    public final int f2164M;

    /* renamed from: N, reason: collision with root package name */
    public int f2165N;

    /* renamed from: O, reason: collision with root package name */
    public final int f2166O;

    /* renamed from: P, reason: collision with root package name */
    public int f2167P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2168Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2169R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f2170S;

    /* renamed from: T, reason: collision with root package name */
    public int f2171T;

    /* renamed from: U, reason: collision with root package name */
    public int f2172U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2173V;

    /* renamed from: W, reason: collision with root package name */
    public U9.i f2174W;

    /* renamed from: a, reason: collision with root package name */
    public int f2175a;

    /* renamed from: a0, reason: collision with root package name */
    public final TimeInterpolator f2176a0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2177b;

    /* renamed from: b0, reason: collision with root package name */
    public e f2178b0;

    /* renamed from: c, reason: collision with root package name */
    public j f2179c;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f2180c0;

    /* renamed from: d, reason: collision with root package name */
    public final i f2181d;

    /* renamed from: d0, reason: collision with root package name */
    public n f2182d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2183e;

    /* renamed from: e0, reason: collision with root package name */
    public ValueAnimator f2184e0;

    /* renamed from: f, reason: collision with root package name */
    public final int f2185f;

    /* renamed from: f0, reason: collision with root package name */
    public AbstractC1084i f2186f0;

    /* renamed from: g0, reason: collision with root package name */
    public AbstractC1076a f2187g0;

    /* renamed from: h0, reason: collision with root package name */
    public g f2188h0;

    /* renamed from: i0, reason: collision with root package name */
    public k f2189i0;

    /* renamed from: j0, reason: collision with root package name */
    public d f2190j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f2191k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f2192l0;

    /* renamed from: m0, reason: collision with root package name */
    public final b1.d f2193m0;

    /* renamed from: u, reason: collision with root package name */
    public final int f2194u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2195v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2196w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2197x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2198y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2199z;

    public o(Context context, AttributeSet attributeSet) {
        super(D6.a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f2175a = -1;
        this.f2177b = new ArrayList();
        this.f2198y = -1;
        this.f2156D = 0;
        this.f2161I = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f2171T = -1;
        this.f2180c0 = new ArrayList();
        this.f2193m0 = new b1.d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        i iVar = new i((LeanbackTabLayout) this, context2);
        this.f2181d = iVar;
        super.addView(iVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray g = s6.o.g(context2, attributeSet, AbstractC0911a.f14397D, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList u3 = H.u(getBackground());
        if (u3 != null) {
            C2401g c2401g = new C2401g();
            c2401g.k(u3);
            c2401g.i(context2);
            WeakHashMap weakHashMap = K.f26642a;
            c2401g.j(AbstractC2352B.e(this));
            setBackground(c2401g);
        }
        setSelectedTabIndicator(Tb.a.p(context2, g, 5));
        setSelectedTabIndicatorColor(g.getColor(8, 0));
        iVar.b(g.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(g.getInt(10, 0));
        setTabIndicatorAnimationMode(g.getInt(7, 0));
        setTabIndicatorFullWidth(g.getBoolean(9, true));
        int dimensionPixelSize = g.getDimensionPixelSize(16, 0);
        this.f2195v = dimensionPixelSize;
        this.f2194u = dimensionPixelSize;
        this.f2185f = dimensionPixelSize;
        this.f2183e = dimensionPixelSize;
        this.f2183e = g.getDimensionPixelSize(19, dimensionPixelSize);
        this.f2185f = g.getDimensionPixelSize(20, dimensionPixelSize);
        this.f2194u = g.getDimensionPixelSize(18, dimensionPixelSize);
        this.f2195v = g.getDimensionPixelSize(17, dimensionPixelSize);
        if (Q5.e.O(context2, R.attr.isMaterial3Theme, false)) {
            this.f2196w = R.attr.textAppearanceTitleSmall;
        } else {
            this.f2196w = R.attr.textAppearanceButton;
        }
        int resourceId = g.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f2197x = resourceId;
        int[] iArr = AbstractC1213a.f17585w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f2158F = dimensionPixelSize2;
            this.f2199z = Tb.a.n(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (g.hasValue(22)) {
                this.f2198y = g.getResourceId(22, resourceId);
            }
            int i7 = this.f2198y;
            if (i7 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i7, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList n6 = Tb.a.n(context2, obtainStyledAttributes, 3);
                    if (n6 != null) {
                        this.f2199z = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{n6.getColorForState(new int[]{android.R.attr.state_selected}, n6.getDefaultColor()), this.f2199z.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (g.hasValue(25)) {
                this.f2199z = Tb.a.n(context2, g, 25);
            }
            if (g.hasValue(23)) {
                this.f2199z = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{g.getColor(23, 0), this.f2199z.getDefaultColor()});
            }
            this.f2153A = Tb.a.n(context2, g, 3);
            this.f2157E = s6.o.h(g.getInt(4, -1), null);
            this.f2154B = Tb.a.n(context2, g, 21);
            this.f2166O = g.getInt(6, 300);
            this.f2176a0 = Tb.a.E(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16532b);
            this.f2162J = g.getDimensionPixelSize(14, -1);
            this.f2163K = g.getDimensionPixelSize(13, -1);
            this.f2160H = g.getResourceId(0, 0);
            this.f2164M = g.getDimensionPixelSize(1, 0);
            this.f2168Q = g.getInt(15, 1);
            this.f2165N = g.getInt(2, 0);
            this.f2169R = g.getBoolean(12, false);
            this.f2173V = g.getBoolean(26, false);
            g.recycle();
            Resources resources = getResources();
            this.f2159G = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.L = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f2177b;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            j jVar = (j) arrayList.get(i7);
            if (jVar == null || jVar.f2128a == null || TextUtils.isEmpty(jVar.f2129b)) {
                i7++;
            } else if (!this.f2169R) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i7 = this.f2162J;
        if (i7 != -1) {
            return i7;
        }
        int i10 = this.f2168Q;
        if (i10 == 0 || i10 == 2) {
            return this.L;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f2181d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i7) {
        i iVar = this.f2181d;
        int childCount = iVar.getChildCount();
        if (i7 < childCount) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = iVar.getChildAt(i10);
                if ((i10 != i7 || childAt.isSelected()) && (i10 == i7 || !childAt.isSelected())) {
                    childAt.setSelected(i10 == i7);
                    childAt.setActivated(i10 == i7);
                } else {
                    childAt.setSelected(i10 == i7);
                    childAt.setActivated(i10 == i7);
                    if (childAt instanceof m) {
                        ((m) childAt).g();
                    }
                }
                i10++;
            }
        }
    }

    public final void a(j jVar, boolean z8) {
        ArrayList arrayList = this.f2177b;
        int size = arrayList.size();
        if (jVar.f2133f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        jVar.f2131d = size;
        arrayList.add(size, jVar);
        int size2 = arrayList.size();
        int i7 = -1;
        for (int i10 = size + 1; i10 < size2; i10++) {
            if (((j) arrayList.get(i10)).f2131d == this.f2175a) {
                i7 = i10;
            }
            ((j) arrayList.get(i10)).f2131d = i10;
        }
        this.f2175a = i7;
        m mVar = jVar.g;
        mVar.setSelected(false);
        mVar.setActivated(false);
        int i11 = jVar.f2131d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f2168Q == 1 && this.f2165N == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f2181d.addView(mVar, i11, layoutParams);
        if (z8) {
            o oVar = jVar.f2133f;
            if (oVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            oVar.j(jVar, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i7) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof b)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        b bVar = (b) view;
        j h10 = h();
        CharSequence charSequence = bVar.f2113a;
        if (charSequence != null) {
            h10.a(charSequence);
        }
        Drawable drawable = bVar.f2114b;
        if (drawable != null) {
            h10.f2128a = drawable;
            o oVar = h10.f2133f;
            if (oVar.f2165N == 1 || oVar.f2168Q == 2) {
                oVar.n(true);
            }
            m mVar = h10.g;
            if (mVar != null) {
                mVar.e();
            }
        }
        int i7 = bVar.f2115c;
        if (i7 != 0) {
            h10.f2132e = LayoutInflater.from(h10.g.getContext()).inflate(i7, (ViewGroup) h10.g, false);
            m mVar2 = h10.g;
            if (mVar2 != null) {
                mVar2.e();
            }
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            h10.f2130c = bVar.getContentDescription();
            m mVar3 = h10.g;
            if (mVar3 != null) {
                mVar3.e();
            }
        }
        a(h10, this.f2177b.isEmpty());
    }

    public final void c(int i7) {
        if (i7 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = K.f26642a;
            if (isLaidOut()) {
                i iVar = this.f2181d;
                int childCount = iVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (iVar.getChildAt(i10).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int e2 = e(i7, 0.0f);
                if (scrollX != e2) {
                    f();
                    this.f2184e0.setIntValues(scrollX, e2);
                    this.f2184e0.start();
                }
                ValueAnimator valueAnimator = iVar.f2126a;
                if (valueAnimator != null && valueAnimator.isRunning() && iVar.f2127b.f2175a != i7) {
                    iVar.f2126a.cancel();
                }
                iVar.d(true, i7, this.f2166O);
                return;
            }
        }
        l(i7, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i7 = this.f2168Q;
        int max = (i7 == 0 || i7 == 2) ? Math.max(0, this.f2164M - this.f2183e) : 0;
        WeakHashMap weakHashMap = K.f26642a;
        i iVar = this.f2181d;
        iVar.setPaddingRelative(max, 0, 0, 0);
        int i10 = this.f2168Q;
        if (i10 == 0) {
            int i11 = this.f2165N;
            if (i11 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i11 == 1) {
                iVar.setGravity(1);
            }
            iVar.setGravity(8388611);
        } else if (i10 == 1 || i10 == 2) {
            if (this.f2165N == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            iVar.setGravity(1);
        }
        n(true);
    }

    public final int e(int i7, float f4) {
        i iVar;
        View childAt;
        int i10 = this.f2168Q;
        if ((i10 != 0 && i10 != 2) || (childAt = (iVar = this.f2181d).getChildAt(i7)) == null) {
            return 0;
        }
        int i11 = i7 + 1;
        View childAt2 = i11 < iVar.getChildCount() ? iVar.getChildAt(i11) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i12 = (int) ((width + width2) * 0.5f * f4);
        WeakHashMap weakHashMap = K.f26642a;
        return getLayoutDirection() == 0 ? left + i12 : left - i12;
    }

    public final void f() {
        if (this.f2184e0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2184e0 = valueAnimator;
            valueAnimator.setInterpolator(this.f2176a0);
            this.f2184e0.setDuration(this.f2166O);
            this.f2184e0.addUpdateListener(new c(this, 0));
        }
    }

    public final j g(int i7) {
        if (i7 < 0 || i7 >= getTabCount()) {
            return null;
        }
        return (j) this.f2177b.get(i7);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        j jVar = this.f2179c;
        if (jVar != null) {
            return jVar.f2131d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f2177b.size();
    }

    public int getTabGravity() {
        return this.f2165N;
    }

    public ColorStateList getTabIconTint() {
        return this.f2153A;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f2172U;
    }

    public int getTabIndicatorGravity() {
        return this.f2167P;
    }

    public int getTabMaxWidth() {
        return this.f2161I;
    }

    public int getTabMode() {
        return this.f2168Q;
    }

    public ColorStateList getTabRippleColor() {
        return this.f2154B;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f2155C;
    }

    public ColorStateList getTabTextColors() {
        return this.f2199z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, B6.j] */
    public final j h() {
        j jVar = (j) f2152n0.a();
        j jVar2 = jVar;
        if (jVar == null) {
            ?? obj = new Object();
            obj.f2131d = -1;
            jVar2 = obj;
        }
        jVar2.f2133f = this;
        b1.d dVar = this.f2193m0;
        m mVar = dVar != null ? (m) dVar.a() : null;
        if (mVar == null) {
            mVar = new m(this, getContext());
        }
        mVar.setTab(jVar2);
        mVar.setFocusable(true);
        mVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(jVar2.f2130c)) {
            mVar.setContentDescription(jVar2.f2129b);
        } else {
            mVar.setContentDescription(jVar2.f2130c);
        }
        jVar2.g = mVar;
        return jVar2;
    }

    public final void i() {
        int currentItem;
        i iVar = this.f2181d;
        for (int childCount = iVar.getChildCount() - 1; childCount >= 0; childCount--) {
            m mVar = (m) iVar.getChildAt(childCount);
            iVar.removeViewAt(childCount);
            if (mVar != null) {
                mVar.setTab(null);
                mVar.setSelected(false);
                this.f2193m0.c(mVar);
            }
            requestLayout();
        }
        Iterator it = this.f2177b.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            it.remove();
            jVar.f2133f = null;
            jVar.g = null;
            jVar.f2128a = null;
            jVar.f2129b = null;
            jVar.f2130c = null;
            jVar.f2131d = -1;
            jVar.f2132e = null;
            f2152n0.c(jVar);
        }
        this.f2179c = null;
        AbstractC1076a abstractC1076a = this.f2187g0;
        if (abstractC1076a != null) {
            int c10 = abstractC1076a.c();
            for (int i7 = 0; i7 < c10; i7++) {
                j h10 = h();
                h10.a(this.f2187g0.e(i7));
                a(h10, false);
            }
            AbstractC1084i abstractC1084i = this.f2186f0;
            if (abstractC1084i == null || c10 <= 0 || (currentItem = abstractC1084i.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            j(g(currentItem), true);
        }
    }

    public final void j(j jVar, boolean z8) {
        j jVar2 = this.f2179c;
        ArrayList arrayList = this.f2180c0;
        if (jVar2 == jVar) {
            if (jVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((e) arrayList.get(size)).getClass();
                }
                c(jVar.f2131d);
                return;
            }
            return;
        }
        int i7 = jVar != null ? jVar.f2131d : -1;
        if (z8) {
            if ((jVar2 == null || jVar2.f2131d == -1) && i7 != -1) {
                l(i7, 0.0f, true, true, true);
            } else {
                c(i7);
            }
            if (i7 != -1) {
                setSelectedTabView(i7);
            }
        }
        this.f2179c = jVar;
        if (jVar2 != null && jVar2.f2133f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((e) arrayList.get(size2)).getClass();
            }
        }
        if (jVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                n nVar = (n) ((e) arrayList.get(size3));
                nVar.getClass();
                nVar.f2151a.setCurrentItem(jVar.f2131d);
            }
        }
    }

    public final void k(AbstractC1076a abstractC1076a, boolean z8) {
        g gVar;
        AbstractC1076a abstractC1076a2 = this.f2187g0;
        if (abstractC1076a2 != null && (gVar = this.f2188h0) != null) {
            abstractC1076a2.f16707a.unregisterObserver(gVar);
        }
        this.f2187g0 = abstractC1076a;
        if (z8 && abstractC1076a != null) {
            if (this.f2188h0 == null) {
                this.f2188h0 = new g(this, 0);
            }
            abstractC1076a.f16707a.registerObserver(this.f2188h0);
        }
        i();
    }

    public final void l(int i7, float f4, boolean z8, boolean z10, boolean z11) {
        float f10 = i7 + f4;
        int round = Math.round(f10);
        if (round >= 0) {
            i iVar = this.f2181d;
            if (round >= iVar.getChildCount()) {
                return;
            }
            if (z10) {
                iVar.f2127b.f2175a = Math.round(f10);
                ValueAnimator valueAnimator = iVar.f2126a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    iVar.f2126a.cancel();
                }
                iVar.c(iVar.getChildAt(i7), iVar.getChildAt(i7 + 1), f4);
            }
            ValueAnimator valueAnimator2 = this.f2184e0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2184e0.cancel();
            }
            int e2 = e(i7, f4);
            int scrollX = getScrollX();
            boolean z12 = (i7 < getSelectedTabPosition() && e2 >= scrollX) || (i7 > getSelectedTabPosition() && e2 <= scrollX) || i7 == getSelectedTabPosition();
            WeakHashMap weakHashMap = K.f26642a;
            if (getLayoutDirection() == 1) {
                z12 = (i7 < getSelectedTabPosition() && e2 <= scrollX) || (i7 > getSelectedTabPosition() && e2 >= scrollX) || i7 == getSelectedTabPosition();
            }
            if (z12 || this.f2192l0 == 1 || z11) {
                if (i7 < 0) {
                    e2 = 0;
                }
                scrollTo(e2, 0);
            }
            if (z8) {
                setSelectedTabView(round);
            }
        }
    }

    public final void m(AbstractC1084i abstractC1084i, boolean z8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC1084i abstractC1084i2 = this.f2186f0;
        if (abstractC1084i2 != null) {
            k kVar = this.f2189i0;
            if (kVar != null && (arrayList2 = abstractC1084i2.f16765i0) != null) {
                arrayList2.remove(kVar);
            }
            d dVar = this.f2190j0;
            if (dVar != null && (arrayList = this.f2186f0.f16767k0) != null) {
                arrayList.remove(dVar);
            }
        }
        n nVar = this.f2182d0;
        ArrayList arrayList3 = this.f2180c0;
        if (nVar != null) {
            arrayList3.remove(nVar);
            this.f2182d0 = null;
        }
        if (abstractC1084i != null) {
            this.f2186f0 = abstractC1084i;
            if (this.f2189i0 == null) {
                this.f2189i0 = new k(this);
            }
            k kVar2 = this.f2189i0;
            kVar2.f2136c = 0;
            kVar2.f2135b = 0;
            if (abstractC1084i.f16765i0 == null) {
                abstractC1084i.f16765i0 = new ArrayList();
            }
            abstractC1084i.f16765i0.add(kVar2);
            n nVar2 = new n(abstractC1084i);
            this.f2182d0 = nVar2;
            if (!arrayList3.contains(nVar2)) {
                arrayList3.add(nVar2);
            }
            AbstractC1076a adapter = abstractC1084i.getAdapter();
            if (adapter != null) {
                k(adapter, true);
            }
            if (this.f2190j0 == null) {
                this.f2190j0 = new d(this);
            }
            d dVar2 = this.f2190j0;
            dVar2.f2118a = true;
            if (abstractC1084i.f16767k0 == null) {
                abstractC1084i.f16767k0 = new ArrayList();
            }
            abstractC1084i.f16767k0.add(dVar2);
            l(abstractC1084i.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.f2186f0 = null;
            k(null, false);
        }
        this.f2191k0 = z8;
    }

    public final void n(boolean z8) {
        int i7 = 0;
        while (true) {
            i iVar = this.f2181d;
            if (i7 >= iVar.getChildCount()) {
                return;
            }
            View childAt = iVar.getChildAt(i7);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f2168Q == 1 && this.f2165N == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z8) {
                childAt.requestLayout();
            }
            i7++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2401g) {
            E6.b.A(this, (C2401g) background);
        }
        if (this.f2186f0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof AbstractC1084i) {
                m((AbstractC1084i) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2191k0) {
            setupWithViewPager(null);
            this.f2191k0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m mVar;
        Drawable drawable;
        int i7 = 0;
        while (true) {
            i iVar = this.f2181d;
            if (i7 >= iVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = iVar.getChildAt(i7);
            if ((childAt instanceof m) && (drawable = (mVar = (m) childAt).f2148w) != null) {
                drawable.setBounds(mVar.getLeft(), mVar.getTop(), mVar.getRight(), mVar.getBottom());
                mVar.f2148w.draw(canvas);
            }
            i7++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C2355c.g(1, getTabCount(), 1).f26687a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int round = Math.round(s6.o.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i10) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) != 0) {
            int i11 = this.f2163K;
            if (i11 <= 0) {
                i11 = (int) (size - s6.o.d(getContext(), 56));
            }
            this.f2161I = i11;
        }
        super.onMeasure(i7, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f2168Q;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i12 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        Drawable background = getBackground();
        if (background instanceof C2401g) {
            ((C2401g) background).j(f4);
        }
    }

    public void setInlineLabel(boolean z8) {
        if (this.f2169R == z8) {
            return;
        }
        this.f2169R = z8;
        int i7 = 0;
        while (true) {
            i iVar = this.f2181d;
            if (i7 >= iVar.getChildCount()) {
                d();
                return;
            }
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof m) {
                m mVar = (m) childAt;
                mVar.setOrientation(!mVar.f2150y.f2169R ? 1 : 0);
                TextView textView = mVar.f2146u;
                if (textView == null && mVar.f2147v == null) {
                    mVar.h(mVar.f2141b, mVar.f2142c, true);
                } else {
                    mVar.h(textView, mVar.f2147v, false);
                }
            }
            i7++;
        }
    }

    public void setInlineLabelResource(int i7) {
        setInlineLabel(getResources().getBoolean(i7));
    }

    @Deprecated
    public void setOnTabSelectedListener(e eVar) {
        e eVar2 = this.f2178b0;
        ArrayList arrayList = this.f2180c0;
        if (eVar2 != null) {
            arrayList.remove(eVar2);
        }
        this.f2178b0 = eVar;
        if (eVar == null || arrayList.contains(eVar)) {
            return;
        }
        arrayList.add(eVar);
    }

    @Deprecated
    public void setOnTabSelectedListener(f fVar) {
        setOnTabSelectedListener((e) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f2184e0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i7) {
        if (i7 != 0) {
            setSelectedTabIndicator(Q5.e.x(getContext(), i7));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f2155C = mutate;
        int i7 = this.f2156D;
        if (i7 != 0) {
            mutate.setTint(i7);
        } else {
            mutate.setTintList(null);
        }
        int i10 = this.f2171T;
        if (i10 == -1) {
            i10 = this.f2155C.getIntrinsicHeight();
        }
        this.f2181d.b(i10);
    }

    public void setSelectedTabIndicatorColor(int i7) {
        this.f2156D = i7;
        Drawable drawable = this.f2155C;
        if (i7 != 0) {
            drawable.setTint(i7);
        } else {
            drawable.setTintList(null);
        }
        n(false);
    }

    public void setSelectedTabIndicatorGravity(int i7) {
        if (this.f2167P != i7) {
            this.f2167P = i7;
            WeakHashMap weakHashMap = K.f26642a;
            this.f2181d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i7) {
        this.f2171T = i7;
        this.f2181d.b(i7);
    }

    public void setTabGravity(int i7) {
        if (this.f2165N != i7) {
            this.f2165N = i7;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f2153A != colorStateList) {
            this.f2153A = colorStateList;
            ArrayList arrayList = this.f2177b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                m mVar = ((j) arrayList.get(i7)).g;
                if (mVar != null) {
                    mVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i7) {
        setTabIconTint(AbstractC1449a.getColorStateList(getContext(), i7));
    }

    public void setTabIndicatorAnimationMode(int i7) {
        this.f2172U = i7;
        if (i7 == 0) {
            this.f2174W = new U9.i(2);
            return;
        }
        if (i7 == 1) {
            this.f2174W = new a(0);
        } else {
            if (i7 == 2) {
                this.f2174W = new a(1);
                return;
            }
            throw new IllegalArgumentException(i7 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z8) {
        this.f2170S = z8;
        int i7 = i.f2125c;
        i iVar = this.f2181d;
        iVar.a(iVar.f2127b.getSelectedTabPosition());
        WeakHashMap weakHashMap = K.f26642a;
        iVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i7) {
        if (i7 != this.f2168Q) {
            this.f2168Q = i7;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f2154B == colorStateList) {
            return;
        }
        this.f2154B = colorStateList;
        int i7 = 0;
        while (true) {
            i iVar = this.f2181d;
            if (i7 >= iVar.getChildCount()) {
                return;
            }
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof m) {
                Context context = getContext();
                int i10 = m.f2139z;
                ((m) childAt).f(context);
            }
            i7++;
        }
    }

    public void setTabRippleColorResource(int i7) {
        setTabRippleColor(AbstractC1449a.getColorStateList(getContext(), i7));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f2199z != colorStateList) {
            this.f2199z = colorStateList;
            ArrayList arrayList = this.f2177b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                m mVar = ((j) arrayList.get(i7)).g;
                if (mVar != null) {
                    mVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1076a abstractC1076a) {
        k(abstractC1076a, false);
    }

    public void setUnboundedRipple(boolean z8) {
        if (this.f2173V == z8) {
            return;
        }
        this.f2173V = z8;
        int i7 = 0;
        while (true) {
            i iVar = this.f2181d;
            if (i7 >= iVar.getChildCount()) {
                return;
            }
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof m) {
                Context context = getContext();
                int i10 = m.f2139z;
                ((m) childAt).f(context);
            }
            i7++;
        }
    }

    public void setUnboundedRippleResource(int i7) {
        setUnboundedRipple(getResources().getBoolean(i7));
    }

    public void setupWithViewPager(AbstractC1084i abstractC1084i) {
        m(abstractC1084i, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
